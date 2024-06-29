import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class343 extends class623 {

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "Z")
    public boolean field4445 = true;

    @OriginalMember(owner = "client!tk", name = "A", descriptor = "I")
    public static int field4446 = 0;

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "I")
    public static int field4449 = 0;

    @OriginalMember(owner = "client!tk", name = "K", descriptor = "Ljt;")
    public static class104 field4456 = new class104("", 12);

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!tk", name = "G", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!tk", name = "H", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!tk", name = "L", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!tk", name = "M", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!tk", name = "N", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!tk", name = "E", descriptor = "Llia;")
    public static class476 field4450;

    @OriginalMember(owner = "client!tk", name = "J", descriptor = "Lcc;")
    public class728 field4455;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "[I")
    private int[] field4443;

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "[I")
    public int[] field4451;

    @OriginalMember(owner = "client!tk", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field4447;

    @OriginalMember(owner = "client!tk", name = "I", descriptor = "[[I")
    private int[][] field4454;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V", line = 3)
    public static void method2038(int arg0) {
        field4456 = null;
        field4450 = null;
        if (arg0 != -1) {
            field4449 = -71;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILig;)Ljava/lang/String;", line = 14)
    public final String method2039(int arg0, class244 arg1) {
        field4448++;
        if (arg0 >= -78) {
            this.method2046(-2, -121, -82);
        }
        StringBuffer var3 = new StringBuffer(80);
        if (this.field4443 != null) {
            for (int var4 = 0; var4 < this.field4443.length; var4++) {
                var3.append(this.field4447[var4]);
                var3.append(this.field4455.method4057(1, this.method2048(var4, -31814), this.field4454[var4], arg1.method1452((byte) 105, class654.method3711(31725, this.field4443[var4]).field2097)));
            }
        }
        var3.append(this.field4447[this.field4447.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "(I)Ljava/lang/String;", line = 44)
    public final String method2040(int arg0) {
        field4444++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field4447 == null) {
            return "";
        }
        int var3 = 90 / ((-arg0 - 49) / 40);
        var2.append(this.field4447[0]);
        for (int var4 = 1; var4 < this.field4447.length; var4++) {
            var2.append("...");
            var2.append(this.field4447[var4]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lig;I[I)V", line = 73)
    public final void method2041(class244 arg0, int arg1, int[] arg2) {
        if (arg1 > -25) {
            return;
        }
        field4441++;
        if (this.field4443 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field4443.length; var4++) {
            if (var4 >= arg2.length) {
                return;
            }
            int var5 = this.method2048(var4, -31814).field2096;
            if (var5 > 0) {
                arg0.method1473(var5, (long) arg2[var4], false);
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "(I)I", line = 102)
    public final int method2042(int arg0) {
        if (arg0 < 31) {
            this.method2039(-78, null);
        }
        field4452++;
        return this.field4443 == null ? 0 : this.field4443.length;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)V", line = 120)
    public final void method2043(byte arg0) {
        int var2 = 73 % ((38 - arg0) / 36);
        if (this.field4451 != null) {
            for (int var3 = 0; var3 < this.field4451.length; var3++) {
                this.field4451[var3] = class695.method3919(this.field4451[var3], 32768);
            }
        }
        field4453++;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lig;B)V", line = 149)
    public final void method2044(class244 arg0, byte arg1) {
        field4457++;
        if (arg1 != 95) {
            this.field4454 = null;
        }
        while (true) {
            int var3 = arg0.method1423(-77);
            if (var3 == 0) {
                return;
            }
            this.method2045(var3, (byte) 34, arg0);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IBLig;)V", line = 169)
    private final void method2045(int arg0, byte arg1, class244 arg2) {
        if (arg0 == 1) {
            this.field4447 = class625.method3586(arg2.method1468(-1468860088), '<', arg1 - 16681);
        } else if (arg0 == 2) {
            int var9 = arg2.method1423(-124);
            this.field4451 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field4451[var10] = arg2.method1476(-75);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method1423(-63);
            this.field4454 = new int[var4][];
            this.field4443 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1476(25);
                class178 var7 = class654.method3711(31725, var6);
                if (var7 != null) {
                    this.field4443[var5] = var6;
                    this.field4454[var5] = new int[var7.field2091];
                    for (int var8 = 0; var8 < var7.field2091; var8++) {
                        this.field4454[var5][var8] = arg2.method1476(48);
                    }
                }
            }
        } else if (arg0 == 4) {
            this.field4445 = false;
        }
        field4458++;
        if (arg1 != 34) {
            this.field4445 = false;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)I", line = 245)
    public final int method2046(int arg0, int arg1, int arg2) {
        field4442++;
        if (this.field4443 == null || arg1 < 0 || this.field4443.length < arg1) {
            return -1;
        } else if (arg0 == 0) {
            return this.field4454[arg1] == null || arg2 < 0 || arg2 > this.field4454[arg1].length ? -1 : this.field4454[arg1][arg2];
        } else {
            return 80;
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(III)V", line = 274)
    public static final void method2047(int arg0, int arg1, int arg2) {
        class691 var3 = class638.field9170[arg0][arg1][arg2];
        if (var3 != null) {
            class334.method1997(var3.field9736);
            if (var3.field9736 != null) {
                var3.field9736 = null;
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)Lsq;", line = 287)
    public final class178 method2048(int arg0, int arg1) {
        if (arg1 == -31814) {
            field4459++;
            return this.field4443 == null || arg0 < 0 || this.field4443.length < arg0 ? null : class654.method3711(31725, this.field4443[arg0]);
        } else {
            return null;
        }
    }
}
