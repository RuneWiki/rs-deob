import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class75 {

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Led;")
    private class49 field1215 = new class49(256);

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "Led;")
    private class49 field1222 = new class49(256);

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Lhi;")
    private class26 field1213;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "Lhi;")
    private class26 field1218;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Z")
    public static boolean field1214 = false;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "Lud;")
    public static class52 field1220 = new class52();

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "Ljd;")
    public static class241 field1223 = new class241(5000);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "Z")
    public static boolean field1219;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "[I")
    public static int[] field1211;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B[II)Ljf;", line = 4)
    public final class9 method564(byte arg0, int[] arg1, int arg2) {
        field1221++;
        if (this.field1218.method151((byte) 74) == 1) {
            return this.method565((byte) -64, arg1, arg2, 0);
        }
        if (arg0 <= 40) {
            field1220 = (class52) null;
        }
        if (this.field1218.method159(arg2, true) != 1) {
            throw new RuntimeException();
        }
        return this.method565((byte) -64, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B[III)Ljf;", line = 25)
    private final class9 method565(byte arg0, int[] arg1, int arg2, int arg3) {
        field1208++;
        int var5 = arg2 ^ (arg3 >>> 12 | (arg3 & 0xD0000FFF) << 4);
        if (arg0 != -64) {
            method571(0, 37);
        }
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class9 var9 = (class9) this.field1222.method311((byte) 114, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class302 var10 = (class302) this.field1215.method311((byte) 114, var7);
            if (var10 == null) {
                var10 = class302.method2077(this.field1218, arg3, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field1215.method309(var10, var7, 1);
            }
            class9 var11 = var10.method2075(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method1444((byte) 89);
                this.field1222.method309(var11, var7, 1);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II[IB)Ljf;", line = 75)
    private final class9 method566(int arg0, int arg1, int[] arg2, byte arg3) {
        field1217++;
        if (arg3 != 93) {
            field1211 = (int[]) null;
        }
        int var5 = (arg0 >>> 12 | arg0 << 4 & 0xFFF1) ^ arg1;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class9 var9 = (class9) this.field1222.method311((byte) 114, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class223 var10 = class223.method1584(this.field1213, arg0, arg1);
            if (var10 == null) {
                return null;
            }
            class9 var11 = var10.method1587();
            this.field1222.method309(var11, var7, 1);
            if (arg2 != null) {
                arg2[0] -= var11.field95.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ltd;B)V", line = 120)
    public static final void method567(class222 arg0, byte arg1) {
        int var2 = arg0.field3852 - class199.field3367;
        int var3 = arg0.field3842 * 128 + (arg0.method1101(true) * 64);
        int var4 = arg0.field3865 * 128 + (arg0.method1101(true) * 64);
        if (arg1 != 53) {
            return;
        }
        if (arg0.field3809 == 0) {
            arg0.field3862 = 1024;
        }
        arg0.field3814 += (var4 - arg0.field3814) / var2;
        arg0.field3821 += (var3 - arg0.field3821) / var2;
        if (arg0.field3809 == 1) {
            arg0.field3862 = 1536;
        }
        if (arg0.field3809 == 2) {
            arg0.field3862 = 0;
        }
        if (arg0.field3809 == 3) {
            arg0.field3862 = 512;
        }
        arg0.field3858 = 0;
        field1210++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([IIB)Ljf;", line = 161)
    public final class9 method568(int[] arg0, int arg1, byte arg2) {
        field1209++;
        if (this.field1213.method151((byte) 74) == 1) {
            return this.method566(0, arg1, arg0, (byte) 93);
        } else if (this.field1213.method159(arg1, true) == 1) {
            return this.method566(arg1, 0, arg0, (byte) 93);
        } else {
            int var4 = -87 / ((-arg2) / 61);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 180)
    public static void method569(int arg0) {
        if (arg0 != 5000) {
            method571(-94, 90);
        }
        field1220 = null;
        field1223 = null;
        field1211 = null;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)[Lfd;", line = 199)
    public static final class61[] method570(int arg0) {
        field1212++;
        class61[] var1 = new class61[class12.field100];
        if (arg0 != 21823) {
            return (class61[]) null;
        }
        for (int var2 = 0; var2 < class12.field100; var2++) {
            var1[var2] = new class61(class41.field626, class189.field3005, class183.field2931[var2], class113.field1878[var2], class15.field132[var2], class184.field2940[var2], class42.field645[var2], class235.field4048);
        }
        class135.method1020(-123);
        return var1;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lhi;Lhi;)V", line = 262)
    public class75(class26 arg0, class26 arg1) {
        this.field1213 = arg0;
        this.field1218 = arg1;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)I", line = 243)
    public static final int method571(int arg0, int arg1) {
        if (arg0 != 256) {
            method570(-119);
        }
        field1216++;
        return arg1 >>> 7;
    }
}
