import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class82 {

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "Lic;")
    private class329 field1053 = new class329(256);

    @OriginalMember(owner = "client!jk", name = "x", descriptor = "Lic;")
    private class329 field1064 = new class329(256);

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "Lfh;")
    private class140 field1043;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "Lfh;")
    private class140 field1052;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "Lcc;")
    public static class327 field1044 = new class327(5);

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "Z")
    public static boolean field1057 = false;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1055 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "I")
    public static int field1060 = -1;

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "I")
    public static int field1061 = 0;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "Lfh;")
    public static class140 field1054;

    @OriginalMember(owner = "client!jk", name = "w", descriptor = "Lim;")
    public static class357 field1063;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "Z")
    public static boolean field1059;

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "[I")
    public static int[] field1062;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V", line = 6)
    public static void method604(byte arg0) {
        field1062 = null;
        field1054 = null;
        if (arg0 != 54) {
            method613((byte) -20);
        }
        field1063 = null;
        field1055 = null;
        field1044 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BI)Lcj;", line = 21)
    public static final class249 method605(byte arg0, int arg1) {
        class249 var2 = (class249) class221.field3190.method1116(17301, (long) arg1);
        field1058++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 <= 81) {
            method609(71, 97, (String) null);
        }
        byte[] var3 = class161.field2302.method1089(class5.method34(arg1, (byte) 70), (byte) 120, class122.method880(-123, arg1));
        class249 var4 = new class249();
        if (var3 != null) {
            var4.method1746(false, new class299(var3));
        }
        class221.field3190.method1115((long) arg1, 103, var4);
        return var4;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I[III)Lpb;", line = 46)
    private final class168 method606(int arg0, int[] arg1, int arg2, int arg3) {
        if (arg3 != -1656949328) {
            this.field1043 = (class140) null;
        }
        int var5 = arg2 ^ (arg0 >>> 12 | (arg0 & 0x30000FFF) << 4);
        field1045++;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class168 var9 = (class168) this.field1064.method2279(var7, 79);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class269 var10 = class269.method1838(this.field1052, arg0, arg2);
            if (var10 == null) {
                return null;
            }
            class168 var11 = var10.method1839();
            this.field1064.method2275(var11, 88, var7);
            if (arg1 != null) {
                arg1[0] -= var11.field2339.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "([III)Lpb;", line = 95)
    public final class168 method607(int[] arg0, int arg1, int arg2) {
        int var4 = 36 % ((arg1 + 16) / 51);
        field1056++;
        if (this.field1043.method1068(-61) == 1) {
            return this.method608(arg2, -111, 0, arg0);
        } else if (this.field1043.method1088(arg2, 1) == 1) {
            return this.method608(0, 73, arg2, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(III[I)Lpb;", line = 113)
    private final class168 method608(int arg0, int arg1, int arg2, int[] arg3) {
        field1050++;
        int var5 = arg0 ^ ((arg2 & 0x60000FFF) << 4 | arg2 >>> 12);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class168 var9 = (class168) this.field1064.method2279(var7, 0);
        int var10 = 115 / ((-arg1 - 51) / 53);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class250 var11 = (class250) this.field1053.method2279(var7, -120);
            if (var11 == null) {
                var11 = class250.method1759(this.field1043, arg2, arg0);
                if (var11 == null) {
                    return null;
                }
                this.field1053.method2275(var11, 116, var7);
            }
            class168 var12 = var11.method1758(arg3);
            if (var12 == null) {
                return null;
            } else {
                var11.method179((byte) 51);
                this.field1064.method2275(var12, 125, var7);
                return var12;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILjava/lang/String;)V", line = 159)
    public static final void method609(int arg0, int arg1, String arg2) {
        class251.field3681.method1309(23, arg0);
        class251.field3681.method2049(arg0 - 19995, class201.method1476(-120, arg2));
        field1049++;
        class311.field4572++;
        class251.field3681.method2045(arg1, (byte) 10);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I[II)Lpb;", line = 171)
    public final class168 method610(int arg0, int[] arg1, int arg2) {
        field1047++;
        if (this.field1052.method1068(-78) == 1) {
            return this.method606(0, arg1, arg2, -1656949328);
        } else if (this.field1052.method1088(arg2, 1) == 1) {
            return this.method606(arg2, arg1, 0, -1656949328);
        } else {
            if (arg0 != 3414) {
                method604((byte) -78);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)V", line = 199)
    public static final void method611(byte arg0) {
        for (class74 var1 = (class74) class272.field3900.method2277(13292); var1 != null; var1 = (class74) class272.field3900.method2278((byte) -116)) {
            int var2 = var1.field982;
            if (class140.method1081(-67, var2)) {
                boolean var3 = true;
                class333[] var4 = class26.field308[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field5154;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field304;
                    class333 var7 = class89.method644(-108, var6);
                    if (var7 != null) {
                        class142.method1097(10, var7);
                    }
                }
            }
        }
        field1042++;
        int var8 = 76 / ((arg0 + 16) / 41);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V", line = 255)
    public static final void method612(int arg0) {
        field1051++;
        class251.field3681.method1309(23, 189);
        for (class74 var1 = (class74) class272.field3900.method2277(13292); var1 != null; var1 = (class74) class272.field3900.method2278((byte) -115)) {
            if (var1.field981 == 0) {
                class97.method700(true, var1, arg0 ^ 0x7B);
            }
        }
        if (class215.field3038 != null) {
            class142.method1097(109, class215.field3038);
            class215.field3038 = null;
        }
        if (arg0 == 0) {
            class260.field3774++;
        }
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(B)[Luj;", line = 286)
    public static final class158[] method613(byte arg0) {
        class158[] var1 = new class158[class171.field2369];
        field1048++;
        if (arg0 != -55) {
            return (class158[]) null;
        }
        for (int var2 = 0; var2 < class171.field2369; var2++) {
            int var3 = class251.field3673[var2] * class184.field2508[var2];
            byte[] var4 = class338.field5276[var2];
            if (class104.field1356[var2]) {
                byte[] var7 = class199.field2812[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class80.method568(class292.field4253[class335.method2339(255, var4[var9])], class335.method2339(-16777216, var7[var9] << 24));
                }
                if (class47.field623) {
                    var1[var2] = new class120(class16.field201, class133.field1805, class348.field5418[var2], class119.field1578[var2], class251.field3673[var2], class184.field2508[var2], var8);
                } else {
                    var1[var2] = new class301(class16.field201, class133.field1805, class348.field5418[var2], class119.field1578[var2], class251.field3673[var2], class184.field2508[var2], var8);
                }
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class292.field4253[class335.method2339(255, var4[var6])];
                }
                if (class47.field623) {
                    var1[var2] = new class361(class16.field201, class133.field1805, class348.field5418[var2], class119.field1578[var2], class251.field3673[var2], class184.field2508[var2], var5);
                } else {
                    var1[var2] = new class11(class16.field201, class133.field1805, class348.field5418[var2], class119.field1578[var2], class251.field3673[var2], class184.field2508[var2], var5);
                }
            }
        }
        class236.method1685(false);
        return var1;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lfh;Lfh;)V", line = 376)
    public class82(class140 arg0, class140 arg1) {
        this.field1043 = arg1;
        this.field1052 = arg0;
    }
}
