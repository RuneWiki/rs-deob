import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class28 extends class117 {

    @OriginalMember(owner = "client!il", name = "J", descriptor = "I")
    private int field339;

    @OriginalMember(owner = "client!il", name = "K", descriptor = "I")
    private int field340;

    @OriginalMember(owner = "client!il", name = "L", descriptor = "I")
    private int field341;

    @OriginalMember(owner = "client!il", name = "M", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!il", name = "N", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!il", name = "O", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!il", name = "P", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!il", name = "Q", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!il", name = "R", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!il", name = "T", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!il", name = "U", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!il", name = "S", descriptor = "[Lbl;")
    public static class146[] field348;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lwd;I)Lmc;")
    public static final class190 method155(class162 arg0, int arg1) {
        ++field349;
        return arg1 != 0 ? null : new class190(arg0.method1146(2), arg0.method1146(2), arg0.method1146(arg1 ^ 2), arg0.method1146(arg1 ^ 2), arg0.method1146(2), arg0.method1146(2), arg0.method1146(2), arg0.method1146(arg1 ^ 2), arg0.method1137(31155), arg0.method1133((byte) 53));
    }

    @OriginalMember(owner = "client!il", name = "j", descriptor = "(I)V")
    public static final void method156(int arg0) {
        class246.field3916 = null;
        class243.field3870 = null;
        ++field344;
        class60.field976 = null;
        if (arg0 != -27424) {
            field343 = 66;
        }
        class273.field4380 = null;
        class70.field1192 = null;
        class314.field5058 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZI)V")
    private final void method157(boolean arg0, int arg1) {
        ++field342;
        this.field340 = arg1 >> 4 & 4080;
        if (!arg0) {
            method155((class162) null, 71);
        }
        this.field339 = arg1 << 4 & 4080;
        this.field341 = arg1 >> 12 & 4080;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(II)[[I")
    public final int[][] method47(int arg0, int arg1) {
        int[][] var3 = super.field1886.method419(arg0, (byte) 96);
        int var4 = 59 % ((arg1 - 37) / 38);
        ++field345;
        if (super.field1886.field1022) {
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            for (int var8 = 0; var8 < class168.field2737; ++var8) {
                var5[var8] = this.field341;
                var7[var8] = this.field340;
                var6[var8] = this.field339;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public static final int method158(boolean arg0, String arg1) {
        ++field350;
        if (arg1 == null) {
            return -1;
        } else {
            if (!arg0) {
                field343 = -32;
            }
            for (int var2 = 0; class124.field1968 > var2; ++var2) {
                if (arg1.equalsIgnoreCase(class258.field4165[var2])) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        ++field346;
        if (~arg2 == -1) {
            this.method157(true, arg0.method1137(31155));
        }
        if (arg1 != 255) {
            this.method44((class162) null, -117, -79);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
    public static final void method159(String arg0, boolean arg1, boolean arg2) {
        ++field347;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class296.field4733; ++var6) {
            class115 var9 = class81.method562(var6, -20358);
            if ((!arg1 || var9.field1787) && var9.field1780 == -1 && ~var9.field1801 == 0 && var9.field1813 == 0 && var9.field1799.toLowerCase().indexOf(var3) != -1) {
                if (~var5 <= -251) {
                    class136.field2148 = null;
                    class177.field2900 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var5 > var11; ++var11) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class136.field2148 = var4;
        class177.field2900 = var5;
        String[] var7 = new String[class177.field2900];
        class119.field1910 = 0;
        if (!arg2) {
            field348 = null;
        }
        for (int var8 = 0; ~var8 > ~class177.field2900; ++var8) {
            var7[var8] = class81.method562(var4[var8], -20358).field1799;
        }
        class249.method1657(class136.field2148, var7, 107);
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(I)V")
    private class28(int arg0) {
        super(0, false);
        this.method157(true, arg0);
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
    public class28() {
        this(0);
    }

    @OriginalMember(owner = "client!il", name = "k", descriptor = "(I)V")
    public static void method160(int arg0) {
        field348 = null;
        if (arg0 != 0) {
            field348 = null;
        }
    }
}
