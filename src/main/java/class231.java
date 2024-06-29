import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class231 extends class439 {

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
    public int field3369;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
    public int field3367;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "Z")
    public boolean field3360;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
    public int field3365;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "Ljava/lang/String;")
    public String field3364;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "J")
    public long field3371;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "Z")
    public boolean field3363;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
    public int field3368;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "Ljava/lang/String;")
    public String field3362;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public int field3372;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "Llh;")
    public static class364 field3361 = new class364(64);

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "Lsv;")
    public static class467 field3373 = new class467(8, 0, 4, 1);

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "Lsv;")
    public static class467 field3374 = new class467(9, 0, 4, 1);

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field3375 = new String[100];

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lat;IIII)V")
    public static final void method1506(class255 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class311.method1946(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class246.field3560) {
            class311.method1946(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class311.method1946(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class254.field3675) {
            class311.method1946(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class254.field3675) {
            class311.method1946(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class246.field3560 && arg4 <= class254.field3675) {
            class311.method1946(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class311.method1946(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class246.field3560 && arg4 > 0) {
            class311.method1946(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)V")
    public static final void method1507(int arg0, int arg1) {
        field3370++;
        if (arg1 < 30) {
            field3361 = null;
        }
        class434 var2 = class483.method2888(arg0, 91, 5);
        var2.method2628(91);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "()V")
    public static final void method1508() {
        if (class73.field1223 != null) {
            for (int var0 = 0; var0 < class73.field1223.length; var0++) {
                for (int var1 = 0; var1 < class246.field3560; var1++) {
                    for (int var2 = 0; var2 < class254.field3675; var2++) {
                        if (class73.field1223[var0][var1][var2] != null) {
                            class73.field1223[var0][var1][var2].method1184(85);
                        }
                        class73.field1223[var0][var1][var2] = null;
                    }
                }
            }
        }
        class73.field1223 = null;
        class145.field2135 = null;
        if (class74.field1242 != null) {
            for (int var3 = 0; var3 < class74.field1242.length; var3++) {
                for (int var4 = 0; var4 < class246.field3560; var4++) {
                    for (int var5 = 0; var5 < class254.field3675; var5++) {
                        if (class74.field1242[var3][var4][var5] != null) {
                            class74.field1242[var3][var4][var5].method1184(88);
                        }
                        class74.field1242[var3][var4][var5] = null;
                    }
                }
            }
        }
        class74.field1242 = null;
        class62.field1063 = null;
        class36.field545 = null;
        class529.field7807 = null;
        class396.field5825 = 0;
        if (class207.field2982 != null) {
            for (int var6 = 0; var6 < class396.field5825; var6++) {
                class207.field2982[var6] = null;
            }
        }
        if (class381.field5681 != null) {
            for (int var7 = 0; var7 < class288.field4149; var7++) {
                class381.field5681[var7] = null;
            }
            class288.field4149 = 0;
        }
        if (class242.field3512 != null) {
            for (int var8 = 0; var8 < class224.field3245; var8++) {
                class242.field3512[var8] = null;
            }
            for (int var9 = 0; var9 < class334.field5130; var9++) {
                for (int var10 = 0; var10 < class246.field3560; var10++) {
                    for (int var11 = 0; var11 < class254.field3675; var11++) {
                        class371.field5544[var9][var10][var11] = 0L;
                    }
                }
            }
            class224.field3245 = 0;
        }
        class439.field6402 = null;
        class480.method2869(7);
        class263.field3780.method1641(3);
        class214.field3090 = null;
        class436.field6338 = null;
        class273.field3951 = null;
        class274.field3957 = null;
        class326.field5047 = null;
        class44.field675 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBIIII)V")
    public static final void method1509(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field3366++;
        for (int var6 = arg0; var6 <= arg2; var6++) {
            class217.method1448(class436.field6332[var6], arg4, arg3, 4, arg5);
        }
        if (arg1 < 75) {
            field3374 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
    public static void method1510(byte arg0) {
        field3373 = null;
        if (arg0 < -59) {
            field3374 = null;
            field3361 = null;
            field3375 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class231(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field3369 = arg2;
        this.field3367 = arg7;
        this.field3360 = arg8;
        this.field3365 = arg4;
        this.field3364 = arg1;
        this.field3371 = arg5;
        this.field3363 = arg9;
        this.field3368 = arg3;
        this.field3362 = arg0;
        this.field3372 = arg6;
    }
}
