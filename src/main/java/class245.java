import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class245 {

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "[Lwg;")
    public static class291[] field3517 = new class291[14];

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field3518 = -1;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "[Lrt;")
    public static class150[] field3527 = new class150[50];

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "[B")
    public static byte[] field3523 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "Z")
    public static boolean field3528 = false;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "[B")
    public byte[] field3519;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "[S")
    public short[] field3521;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "[S")
    public short[] field3522;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "[S")
    public short[] field3524;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V", line = 3)
    public static void method1591(byte arg0) {
        field3517 = null;
        if (arg0 <= -6) {
            field3527 = null;
            field3523 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II[Lmq;)V", line = 15)
    public static final void method1592(int arg0, int arg1, class350[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class350 var4 = arg2[var3];
            if (var4 != null && var4.field5297 == arg0 && !client.method1340(var4)) {
                if (var4.field5215 == 0) {
                    method1592(var4.field5322, -112, arg2);
                    if (var4.field5291 != null) {
                        method1592(var4.field5322, -127, var4.field5291);
                    }
                    class352 var5 = (class352) class162.field2507.method171((byte) -88, (long) var4.field5322);
                    if (var5 != null) {
                        class110.method820(var5.field5391, -18046);
                    }
                }
                if (var4.field5215 == 6 && var4.field5276 != -1) {
                    class165 var6 = class431.field6419.method1137(-114, var4.field5276);
                    if (var6 != null) {
                        var4.field5220 += class514.field7564;
                        while (var4.field5220 > var6.field2564[var4.field5342]) {
                            var4.field5220 -= var6.field2564[var4.field5342];
                            var4.field5342++;
                            if (var4.field5342 >= var6.field2539.length) {
                                var4.field5342 -= var6.field2549;
                                if (var4.field5342 < 0 || var4.field5342 >= var6.field2539.length) {
                                    var4.field5342 = 0;
                                }
                            }
                            var4.field5323 = var4.field5342 + 1;
                            if (var6.field2539.length <= var4.field5323) {
                                var4.field5323 -= var6.field2549;
                                if (var4.field5323 < 0 || var6.field2539.length <= var4.field5323) {
                                    var4.field5323 = -1;
                                }
                            }
                            class302.method1902((byte) 53, var4);
                        }
                    }
                }
            }
        }
        field3516++;
        if (arg1 >= -101) {
            method1594(false, 116);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(CB)Z", line = 109)
    public static final boolean method1593(char arg0, byte arg1) {
        if (arg1 < 51) {
            field3528 = false;
        }
        field3525++;
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)I", line = 130)
    public static final int method1594(boolean arg0, int arg1) {
        field3526++;
        if (!arg0) {
            field3528 = true;
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILvj;IZ[II)Lmk;", line = 145)
    public static final class39 method1595(int arg0, class303 arg1, int arg2, boolean arg3, int[] arg4, int arg5) {
        field3520++;
        if (arg5 != 0) {
            field3518 = -125;
        }
        if (!arg1.field4583 && (!class354.method2243(0, arg2) || !class354.method2243(0, arg0))) {
            return arg1.field4538 ? new class39(arg1, 34037, arg2, arg0, arg3, arg4) : new class39(arg1, arg2, arg0, class51.method464(arg5 + 1905326856, arg2), class51.method464(1905326856, arg0), arg4);
        } else {
            return new class39(arg1, 3553, arg2, arg0, arg3, arg4);
        }
    }
}
