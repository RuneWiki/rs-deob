import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class79 extends class35 {

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "J")
    public long field1341;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field1335 = 0;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "Z")
    public static boolean field1342 = false;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1339 = null;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "[I")
    public static int[] field1336;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "[[B")
    public static byte[][] field1343;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/String;Lec;B)I", line = 6)
    public static final int method623(String arg0, class37 arg1, byte arg2) {
        field1338++;
        int var3 = arg1.field565;
        if (arg2 != -61) {
            field1335 = 12;
        }
        byte[] var4 = class332.method2174(arg0, (byte) 59);
        arg1.method282(var4.length, -1);
        arg1.field565 += class139.field2204.method951(var4, var4.length, 0, 24, arg1.field565, arg1.field578);
        return arg1.field565 - var3;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIII)Z", line = 25)
    public static final boolean method624(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class315.field4586[arg0][var8][var14] == -class365.field5205) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class50.field816[arg0].method794(arg1, arg3) + arg5;
            if (!class218.method1647(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class218.method1647(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class218.method1647(var9, var11, var13)) {
                return false;
            } else if (class218.method1647(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class78.method619(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class218.method1647(var6 + 1, class50.field816[arg0].method794(arg1, arg3) + arg5, var7 + 1) && class218.method1647(var6 + 128 - 1, class50.field816[arg0].method794(arg1 + 1, arg3) + arg5, var7 + 1) && class218.method1647(var6 + 128 - 1, class50.field816[arg0].method794(arg1 + 1, arg3 + 1) + arg5, var7 + 128 - 1) && class218.method1647(var6 + 1, class50.field816[arg0].method794(arg1, arg3 + 1) + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lbc;IZI)V", line = 84)
    public static final void method625(class283 arg0, int arg1, boolean arg2, int arg3) {
        class221.field3296[arg1][arg3] = arg0;
        if (!arg2) {
            field1336 = null;
        }
        field1334++;
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(B)V", line = 104)
    public static void method626(byte arg0) {
        field1343 = null;
        field1339 = null;
        int var1 = 28 % ((7 - arg0) / 48);
        field1336 = null;
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)V", line = 116)
    public static final void method627(int arg0) {
        class200.field2916.method97(99);
        field1337++;
        for (int var1 = 0; var1 < 32; var1++) {
            class380.field5389[var1] = 0L;
        }
        if (arg0 < -21) {
            for (int var2 = 0; var2 < 32; var2++) {
                class40.field619[var2] = 0L;
            }
            class86.field1399 = 0;
        }
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)[Lt;", line = 146)
    public static final class319[] method628(int arg0) {
        if (arg0 != 0) {
            method628(15);
        }
        if (class268.field4019 == null) {
            class319[] var1 = class248.method1788(class188.field2783, (byte) 83);
            class319[] var2 = new class319[var1.length];
            int var3 = 0;
            label66: for (int var4 = 0; var4 < var1.length; var4++) {
                class319 var8 = var1[var4];
                if ((var8.field4615 <= 0 || var8.field4615 >= 24) && var8.field4608 >= 800 && var8.field4611 >= 600 && (class75.field1288 >= 96 || class288.field4303 != 0 || var8.field4608 <= 1024 && var8.field4611 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class319 var10 = var2[var9];
                        if (var8.field4608 == var10.field4608 && var8.field4611 == var10.field4611) {
                            if (var10.field4615 < var8.field4615) {
                                var2[var9] = var8;
                            }
                            continue label66;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class268.field4019 = new class319[var3];
            class82.method635(var2, 0, class268.field4019, 0, var3);
            int[] var5 = new int[class268.field4019.length];
            for (int var6 = 0; var6 < class268.field4019.length; var6++) {
                class319 var7 = class268.field4019[var6];
                var5[var6] = var7.field4611 * var7.field4608;
            }
            class14.method90(arg0 - 24, var5, class268.field4019);
        }
        field1340++;
        return class268.field4019;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZILja;IZILpi;)V", line = 227)
    public static final void method629(boolean arg0, int arg1, class90 arg2, int arg3, boolean arg4, int arg5, class220 arg6) {
        if (arg0) {
            return;
        }
        field1344++;
        if (arg4) {
            class339.field4837.method2645((class113.field1819 - class339.field4837.method1461()) / 2, (class277.field4170 - class339.field4837.method1463()) / 2);
            class236.field3405.method2645((class113.field1819 - class236.field3405.method1461()) / 2, 18);
        }
        arg6.method1670(arg5, class113.field1819 / 2, class336.field4809 == 1 ? class171.field2545 : class322.field4648, -32009, -1, class277.field4170 / 2 - 26);
        int var7 = class277.field4170 / 2 - 18;
        arg2.method711(class113.field1819 / 2 - 152, var7, 304, 34, arg1, 0);
        arg2.method711(class113.field1819 / 2 - 151, var7 + 1, 302, 32, 0, 0);
        arg2.method681(class113.field1819 / 2 - 150, var7 + 2, class69.field1124 * 3, 30, arg3, 0);
        arg2.method681(class69.field1124 * 3 + class113.field1819 / 2 - 150, var7 + 2, 300 - class69.field1124 * 3, 30, 0, 0);
        arg6.method1670(arg5, class113.field1819 / 2, class90.field1424, -32009, -1, class277.field4170 / 2 + 4);
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V", line = 254)
    public class79() {
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(J)V", line = 259)
    public class79(long arg0) {
        this.field1341 = arg0;
    }
}
