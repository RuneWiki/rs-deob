import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class257 {

    @OriginalMember(owner = "client!om", name = "c", descriptor = "Z")
    public boolean field3547 = false;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public int field3550 = -1;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public int field3548 = 64;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public int field3551 = 1;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    public int field3555 = 2;

    @OriginalMember(owner = "client!om", name = "q", descriptor = "Z")
    public boolean field3561 = false;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "I")
    public int field3558 = 64;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "[I")
    public static int[] field3559 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public static int field3556 = 0;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "Lof;")
    public static class446 field3549 = new class446("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    public static int field3562 = 0;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method1651(class164 arg0, boolean arg1, int arg2) {
        field3552++;
        if (arg1) {
            this.field3548 = 121;
        }
        while (true) {
            int var4 = arg0.method1087(arg1);
            if (var4 == 0) {
                return;
            }
            this.method1657(var4, arg2, (byte) -120, arg0);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
    public static void method1652(int arg0) {
        if (arg0 == -26944) {
            field3549 = null;
            field3559 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z[BII)Ljava/lang/String;")
    public static final String method1653(boolean arg0, byte[] arg1, int arg2, int arg3) {
        field3560++;
        if (!arg0) {
            method1654(44, null, (byte) -2, -30, 82);
        }
        char[] var4 = new char[arg3];
        int var5 = 0;
        for (int var6 = 0; var6 < arg3; var6++) {
            int var7 = arg1[arg2 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class513.field7546[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILjava/lang/String;BII)V")
    public static final void method1654(int arg0, String arg1, byte arg2, int arg3, int arg4) {
        field3553++;
        class282 var5 = class178.method1197(arg4, arg0, 94);
        if (var5 == null) {
            return;
        }
        if (var5.field4007 != null) {
            class143 var6 = new class143();
            var6.field1901 = arg3;
            var6.field1906 = arg1;
            var6.field1912 = var5.field4007;
            var6.field1903 = var5;
            class343.method2227(var6);
        }
        if (class435.field6596 != 9) {
            return;
        }
        if (arg2 <= 99) {
            method1653(true, null, -45, -55);
        }
        if (!client.method1348(var5).method2702(arg3 - 1, -111)) {
            return;
        }
        if (arg3 == 1) {
            class424.method2582(class89.field1281, -1);
            class47.field674++;
            class271.method1739(200, arg4, arg0, var5.field4012);
        }
        if (arg3 == 2) {
            class138.field1843++;
            class424.method2582(class362.field5576, -1);
            class271.method1739(200, arg4, arg0, var5.field4012);
        }
        if (arg3 == 3) {
            class515.field7560++;
            class424.method2582(class320.field4636, -1);
            class271.method1739(200, arg4, arg0, var5.field4012);
        }
        if (arg3 == 4) {
            class390.field5950++;
            class424.method2582(class410.field6221, -1);
            class271.method1739(200, arg4, arg0, var5.field4012);
        }
        if (arg3 == 5) {
            class96.field1411++;
            class424.method2582(class280.field3967, -1);
            class271.method1739(200, arg4, arg0, var5.field4012);
        }
        if (arg3 == 6) {
            class462.field6915++;
            class424.method2582(class465.field6933, -1);
            class271.method1739(200, arg4, arg0, var5.field4012);
        }
        if (arg3 == 7) {
            class424.method2582(class63.field891, -1);
            class437.field6611++;
            class271.method1739(200, arg4, arg0, var5.field4012);
        }
        if (arg3 == 8) {
            class329.field5125++;
            class424.method2582(class47.field664, -1);
            class271.method1739(200, arg4, arg0, var5.field4012);
        }
        if (arg3 == 9) {
            class319.field4621++;
            class424.method2582(class350.field5397, -1);
            class271.method1739(200, arg4, arg0, var5.field4012);
        }
        if (arg3 == 10) {
            class424.method2582(class284.field4167, -1);
            class247.field3451++;
            class271.method1739(200, arg4, arg0, var5.field4012);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1655(int arg0, String arg1, int arg2) {
        field3557++;
        class106.field1491++;
        if (arg2 != 2) {
            field3556 = 120;
        }
        class424.method2582(class377.field5768, arg2 - 3);
        class538.field7879.method1072((byte) 102, class436.method2652(arg1, (byte) -77) + 1);
        class538.field7879.method1081(arg0, arg2 ^ 0xFFFFFF86);
        class538.field7879.method1071(-25643, arg1);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "([IZII[I)V")
    public static final void method1656(int[] arg0, boolean arg1, int arg2, int arg3, int[] arg4) {
        if (arg3 < arg2) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg3;
            int var7 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var7;
            int var8 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var8;
            int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
            for (int var10 = arg3; var10 < arg2; var10++) {
                if (((var9 & var10) + var7) > arg4[var10]) {
                    int var11 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6] = var11;
                    int var12 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var12;
                }
            }
            arg4[arg2] = arg4[var6];
            arg4[var6] = var7;
            arg0[arg2] = arg0[var6];
            arg0[var6] = var8;
            method1656(arg0, true, var6 - 1, arg3, arg4);
            method1656(arg0, true, arg2, var6 + 1, arg4);
        }
        field3554++;
        if (!arg1) {
            field3562 = -40;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIBLnj;)V")
    private final void method1657(int arg0, int arg1, byte arg2, class164 arg3) {
        if (arg0 == 1) {
            this.field3550 = arg3.method1074(-635989152);
            if (this.field3550 == 65535) {
                this.field3550 = -1;
            }
        } else if (arg0 == 2) {
            this.field3558 = arg3.method1074(-635989152) + 1;
            this.field3548 = arg3.method1074(-635989152) + 1;
        } else if (arg0 == 3) {
            arg3.method1088((byte) 47);
        } else if (arg0 == 4) {
            this.field3555 = arg3.method1087(false);
        } else if (arg0 == 5) {
            this.field3551 = arg3.method1087(false);
        } else if (arg0 == 6) {
            this.field3547 = true;
        } else if (arg0 == 7) {
            this.field3561 = true;
        }
        int var5 = 98 % ((-arg2 - 60) / 59);
        field3546++;
    }
}
