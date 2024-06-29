import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class88 {

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "B")
    private byte field1197;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    public int field1199;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public int field1195;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "I")
    public int field1201;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public int field1187;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    public int field1203;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field1192 = 0;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field1191 = 0;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "Z")
    public static boolean field1198 = false;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
    public static int field1202 = 0;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "[I")
    public static int[] field1190;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "[Lwj;")
    public static class130[] field1188;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)I")
    public final int method514(byte arg0) {
        if (arg0 != 4) {
            method518(42);
        }
        field1193++;
        return (this.field1197 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)I")
    public final int method515(byte arg0) {
        if (arg0 != -91) {
            field1202 = 83;
        }
        field1194++;
        return this.field1197 & 0x7;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI)V")
    public static final void method516(byte arg0, int arg1) {
        class274.field4074.method62(-95, arg1);
        class28.field336.method62(-30, arg1);
        if (arg0 != -38) {
            field1190 = null;
        }
        field1189++;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([Lwe;IB)V")
    public static final void method517(class82[] arg0, int arg1, byte arg2) {
        int var3 = 0;
        if (arg2 < 123) {
            method517((class82[]) null, -46, (byte) 26);
        }
        while (var3 < arg0.length) {
            class82 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field1026 == 0) {
                    if (var4.field1034 != null) {
                        method517(var4.field1034, arg1, (byte) 124);
                    }
                    class166 var5 = (class166) class189.field2705.method1895((long) var4.field1025, -110);
                    if (var5 != null) {
                        class200.method1290(arg1, var5.field2395, 24826);
                    }
                }
                if (arg1 == 0 && var4.field972 != null) {
                    class11 var6 = new class11();
                    var6.field145 = var4;
                    var6.field143 = var4.field972;
                    class110.method684(var6, false);
                }
                if (arg1 == 1 && var4.field979 != null) {
                    label62: {
                        if (var4.field963 >= 0) {
                            class82 var7 = class182.method1187((byte) -41, var4.field1025);
                            if (var7 == null || var7.field1034 == null || var7.field1034.length <= var4.field963 || var7.field1034[var4.field963] != var4) {
                                break label62;
                            }
                        }
                        class11 var8 = new class11();
                        var8.field143 = var4.field979;
                        var8.field145 = var4;
                        class110.method684(var8, false);
                    }
                }
            }
            var3++;
        }
        field1200++;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public static void method518(int arg0) {
        if (arg0 != 8) {
            method516((byte) 116, -68);
        }
        field1190 = null;
        field1188 = null;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
    public class88() {
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lqi;)V")
    public class88(class216 arg0) {
        this.field1197 = arg0.method1355(true);
        this.field1199 = arg0.method1380(true);
        this.field1195 = arg0.method1358(100);
        this.field1201 = arg0.method1358(107);
        this.field1187 = arg0.method1358(107);
        this.field1203 = arg0.method1358(56);
    }
}
