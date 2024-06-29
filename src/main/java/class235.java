import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class235 extends class55 {

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public static int field3383 = 0;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "Ljava/lang/String;")
    public static String field3390 = "Ok";

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "Lbc;")
    public static class282 field3393;

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "Ljava/lang/String;")
    public String field3388;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "[C")
    public char[] field3385;

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "[C")
    public char[] field3386;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "[I")
    public int[] field3384;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "[I")
    public int[] field3389;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lqi;I)V")
    public final void method1533(class216 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1407(arg1 ^ 0x68);
            if (var3 == 0) {
                field3392++;
                if (arg1 != 0) {
                    field3393 = null;
                    return;
                }
                return;
            }
            this.method1534(var3, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILqi;)V")
    private final void method1534(int arg0, int arg1, class216 arg2) {
        if (arg0 == 1) {
            this.field3388 = arg2.method1352((byte) 84);
        } else if (arg0 == 2) {
            int var4 = arg2.method1407(106);
            this.field3384 = new int[var4];
            this.field3386 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3384[var5] = arg2.method1380(true);
                byte var6 = arg2.method1355(true);
                this.field3386[var5] = var6 == 0 ? 0 : class285.method1908((byte) 68, var6);
            }
        } else if (arg0 == 3) {
            int var7 = arg2.method1407(113);
            this.field3389 = new int[var7];
            this.field3385 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3389[var8] = arg2.method1380(true);
                byte var9 = arg2.method1355(true);
                this.field3385[var8] = var9 == 0 ? 0 : class285.method1908((byte) 68, var9);
            }
        }
        field3394++;
        if (arg1 != 0) {
            this.method1537(66, '\u0000');
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lca;III)V")
    public static final void method1535(class131 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class268.field3922) {
            class133 var4 = class6.field94[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field1917 != null && var4.field1917.field568.method711()) {
                arg0.method708(var4.field1917.field568, 128, 0, 0, true);
            }
        }
        if (arg3 < class268.field3922) {
            class133 var5 = class6.field94[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field1917 != null && var5.field1917.field568.method711()) {
                arg0.method708(var5.field1917.field568, 0, 0, 128, true);
            }
        }
        if (arg2 < class268.field3922 && arg3 < class97.field1292) {
            class133 var6 = class6.field94[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field1917 != null && var6.field1917.field568.method711()) {
                arg0.method708(var6.field1917.field568, 128, 0, 128, true);
            }
        }
        if (arg2 < class268.field3922 && arg3 > 0) {
            class133 var7 = class6.field94[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field1917 != null && var7.field1917.field568.method711()) {
                arg0.method708(var7.field1917.field568, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V")
    public static void method1536(byte arg0) {
        field3393 = null;
        field3390 = null;
        if (arg0 <= 63) {
            method1535((class131) null, 107, 123, -4);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IC)I")
    public final int method1537(int arg0, char arg1) {
        field3395++;
        if (this.field3389 == null) {
            return -1;
        }
        int var3 = 105 % ((-arg0 - 31) / 55);
        for (int var4 = 0; var4 < this.field3389.length; var4++) {
            if (this.field3385[var4] == arg1) {
                return this.field3389[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V")
    public final void method1538(int arg0) {
        field3382++;
        int var2 = -46 % ((arg0 + 77) / 45);
        if (this.field3389 != null) {
            for (int var3 = 0; var3 < this.field3389.length; var3++) {
                this.field3389[var3] = class220.method1432(this.field3389[var3], 32768);
            }
        }
        if (this.field3384 != null) {
            for (int var4 = 0; var4 < this.field3384.length; var4++) {
                this.field3384[var4] = class220.method1432(this.field3384[var4], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(IC)I")
    public final int method1539(int arg0, char arg1) {
        int var3 = 39 % ((2 - arg0) / 34);
        field3387++;
        if (this.field3384 == null) {
            return -1;
        }
        for (int var4 = 0; var4 < this.field3384.length; var4++) {
            if (this.field3386[var4] == arg1) {
                return this.field3384[var4];
            }
        }
        return -1;
    }
}
