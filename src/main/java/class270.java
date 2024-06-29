import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class270 extends class307 {

    @OriginalMember(owner = "client!dm", name = "D", descriptor = "Lmc;")
    public class170 field4665 = new class170();

    @OriginalMember(owner = "client!dm", name = "R", descriptor = "Lwi;")
    public class248 field4678 = new class248();

    @OriginalMember(owner = "client!dm", name = "K", descriptor = "Lml;")
    private class125 field4671;

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "[I")
    public static int[] field4655 = new int[5];

    @OriginalMember(owner = "client!dm", name = "w", descriptor = "Lwa;")
    public static class75 field4658 = class66.method560("Suche nach Updates )2 ", false);

    @OriginalMember(owner = "client!dm", name = "A", descriptor = "Lwa;")
    public static class75 field4662 = class66.method560("Verbindung zum Update)2Server hergestellt)3", false);

    @OriginalMember(owner = "client!dm", name = "N", descriptor = "Z")
    public static boolean field4674 = false;

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "I")
    public static int field4656 = 0;

    @OriginalMember(owner = "client!dm", name = "O", descriptor = "Lre;")
    public static class262 field4675 = null;

    @OriginalMember(owner = "client!dm", name = "M", descriptor = "I")
    public static int field4673 = 0;

    @OriginalMember(owner = "client!dm", name = "P", descriptor = "Lwa;")
    public static class75 field4676 = class66.method560("Hidden)2", false);

    @OriginalMember(owner = "client!dm", name = "v", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!dm", name = "x", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!dm", name = "y", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!dm", name = "B", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!dm", name = "C", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!dm", name = "E", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!dm", name = "F", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!dm", name = "G", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!dm", name = "H", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!dm", name = "I", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!dm", name = "L", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!dm", name = "Q", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V", line = 5)
    public static void method1931(byte arg0) {
        field4658 = null;
        field4676 = null;
        field4675 = null;
        field4655 = null;
        field4662 = null;
        if (arg0 != -54) {
            field4674 = false;
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "()Loj;", line = 20)
    public final class307 method967() {
        field4661++;
        class30 var1 = (class30) this.field4665.method1250(true);
        if (var1 == null) {
            return null;
        } else if (var1.field432 == null) {
            return this.method972();
        } else {
            return var1.field432;
        }
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "()Loj;", line = 36)
    public final class307 method972() {
        field4666++;
        class30 var1;
        do {
            var1 = (class30) this.field4665.method1256((byte) -128);
            if (var1 == null) {
                return null;
            }
        } while (var1.field432 == null);
        return var1.field432;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "([IIZLih;II)V", line = 65)
    private final void method1932(int[] arg0, int arg1, boolean arg2, class30 arg3, int arg4, int arg5) {
        if (arg2) {
            this.field4671 = (class125) null;
        }
        field4664++;
        if ((this.field4671.field2158[arg3.field420] & 0x4) != 0 && arg3.field444 < 0) {
            int var7 = this.field4671.field2116[arg3.field420] / class99.field1644;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field421) / var7;
                if (var8 > arg4) {
                    arg3.field421 += arg4 * var7;
                    break;
                }
                arg4 -= var8;
                arg3.field432.method998(arg0, arg5, var8);
                arg5 += var8;
                arg3.field421 += var7 * var8 - 1048576;
                int var9 = class99.field1644 / 100;
                int var10 = 262144 / var7;
                class183 var11 = arg3.field432;
                if (var9 > var10) {
                    var9 = var10;
                }
                if (this.field4671.field2112[arg3.field420] == 0) {
                    arg3.field432 = class183.method1373(arg3.field438, var11.method1368(), var11.method1366(), var11.method1358());
                } else {
                    arg3.field432 = class183.method1373(arg3.field438, var11.method1368(), 0, var11.method1358());
                    this.field4671.method958(arg3, (byte) 5, arg3.field424.field236[arg3.field426] < 0);
                    arg3.field432.method1353(var9, var11.method1366());
                }
                if (arg3.field424.field236[arg3.field426] < 0) {
                    arg3.field432.method1385(-1);
                }
                var11.method1376(var9);
                var11.method998(arg0, arg5, arg1 - arg5);
                if (var11.method1369()) {
                    this.field4678.method1789(var11);
                }
            }
        }
        arg3.field432.method998(arg0, arg5, arg4);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BLcb;)V", line = 137)
    public static final void method1933(byte arg0, class267 arg1) {
        if (arg0 <= -84) {
            field4668++;
            class207.field3511 = arg1;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "([Ljava/lang/Object;II[II)V", line = 151)
    public static final void method1934(Object[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field4669++;
        if (arg2 < 66 || arg1 >= arg4) {
            return;
        }
        int var5 = (arg1 + arg4) / 2;
        int var6 = arg1;
        int var7 = arg3[var5];
        arg3[var5] = arg3[arg4];
        arg3[arg4] = var7;
        Object var8 = arg0[var5];
        arg0[var5] = arg0[arg4];
        arg0[arg4] = var8;
        for (int var9 = arg1; var9 < arg4; var9++) {
            if (arg3[var9] < ((var9 & 0x1) + var7)) {
                int var10 = arg3[var9];
                arg3[var9] = arg3[var6];
                arg3[var6] = var10;
                Object var11 = arg0[var9];
                arg0[var9] = arg0[var6];
                arg0[var6++] = var11;
            }
        }
        arg3[arg4] = arg3[var6];
        arg3[var6] = var7;
        arg0[arg4] = arg0[var6];
        arg0[var6] = var8;
        method1934(arg0, arg1, 82, arg3, var6 - 1);
        method1934(arg0, var6 + 1, 93, arg3, arg4);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "([III)V", line = 214)
    public final void method998(int[] arg0, int arg1, int arg2) {
        this.field4678.method998(arg0, arg1, arg2);
        field4672++;
        for (class30 var4 = (class30) this.field4665.method1250(true); var4 != null; var4 = (class30) this.field4665.method1256((byte) -122)) {
            if (!this.field4671.method975((byte) 108, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field440) {
                        this.method1932(arg0, var5 + var6, false, var4, var6, var5);
                        var4.field440 -= var6;
                        break;
                    }
                    this.method1932(arg0, var5 + var6, false, var4, var4.field440, var5);
                    var5 += var4.field440;
                    var6 -= var4.field440;
                } while (!this.field4671.method988(arg0, var5, 5, var4, var6));
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)V", line = 254)
    public final void method977(int arg0) {
        this.field4678.method977(arg0);
        field4659++;
        for (class30 var2 = (class30) this.field4665.method1250(true); var2 != null; var2 = (class30) this.field4665.method1256((byte) -124)) {
            if (!this.field4671.method975((byte) 122, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field440 >= var3) {
                        this.method1935(var2, (byte) -89, var3);
                        var2.field440 -= var3;
                        break;
                    }
                    this.method1935(var2, (byte) 121, var2.field440);
                    var3 -= var2.field440;
                } while (!this.field4671.method988((int[]) null, 0, 5, var2, var3));
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "()I", line = 293)
    public final int method971() {
        field4657++;
        return 0;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lih;BI)V", line = 312)
    private final void method1935(class30 arg0, byte arg1, int arg2) {
        if ((this.field4671.field2158[arg0.field420] & 0x4) != 0 && arg0.field444 < 0) {
            int var4 = this.field4671.field2116[arg0.field420] / class99.field1644;
            int var5 = (var4 + 1048575 - arg0.field421) / var4;
            arg0.field421 = arg2 * var4 + arg0.field421 & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field4671.field2112[arg0.field420] == 0) {
                    arg0.field432 = class183.method1373(arg0.field438, arg0.field432.method1368(), arg0.field432.method1366(), arg0.field432.method1358());
                } else {
                    arg0.field432 = class183.method1373(arg0.field438, arg0.field432.method1368(), 0, arg0.field432.method1358());
                    this.field4671.method958(arg0, (byte) 5, arg0.field424.field236[arg0.field426] < 0);
                }
                if (arg0.field424.field236[arg0.field426] < 0) {
                    arg0.field432.method1385(-1);
                }
                arg2 = arg0.field421 / var4;
            }
        }
        int var6 = 6 % ((arg1 - 52) / 61);
        field4663++;
        arg0.field432.method977(arg2);
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lml;)V", line = 363)
    public class270(class125 arg0) {
        this.field4671 = arg0;
    }
}
