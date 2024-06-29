import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class49 {

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field654 = -2;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "Z")
    public static boolean field658 = false;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "[Lgb;")
    public static class196[] field651;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIII)Z", line = 3)
    public static final boolean method385(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V", line = 32)
    public static final void method386(int arg0, int arg1) {
        field650++;
        class42 var2 = class166.method1242(10, arg0, -1249071392);
        int var3 = -22 / ((59 - arg1) / 45);
        var2.method306((byte) -104);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V", line = 45)
    public static void method387(byte arg0) {
        if (arg0 >= -122) {
            method389((byte) -105, -52, 126, 125, 19);
        }
        field651 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBI)I", line = 56)
    public static final int method388(int arg0, byte arg1, int arg2) {
        field653++;
        class223 var3 = (class223) class240.field3489.method2279((long) arg2, -119);
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 62 % ((arg1 + 65) / 48);
            int var5 = 0;
            for (int var6 = 0; var6 < var3.field3217.length; var6++) {
                if (var3.field3216[var6] == arg0) {
                    var5 += var3.field3217[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BIIII)V", line = 93)
    public static final void method389(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field656++;
        if (class75.field991 != 0 && arg3 != 0 && class274.field3921 < 50 && arg2 != -1) {
            class237.field3434[class274.field3921] = arg2;
            class219.field3105[class274.field3921] = arg3;
            class319.field4697[class274.field3921] = arg1;
            class316.field4664[class274.field3921] = null;
            class92.field1195[class274.field3921] = 0;
            class254.field3701[class274.field3921] = arg4;
            class274.field3921++;
        }
        if (arg0 != -100) {
            method386(56, 78);
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)I", line = 118)
    public static final int method390(byte arg0) {
        if (arg0 < 59) {
            return 63;
        } else {
            field655++;
            return class341.field5323.method2256(false);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IJ)V", line = 131)
    public static final void method391(int arg0, long arg1) {
        field652++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class45.field559 < 100 || class190.field2623) || class45.field559 >= 200) {
            class88.method641("", 0, false, class106.field1375);
            return;
        }
        String var3 = class193.method1398(false, arg1);
        for (int var4 = 0; var4 < class45.field559; var4++) {
            if (class158.field2251[var4] == arg1) {
                class88.method641("", 0, false, var3 + class190.field2629);
                return;
            }
        }
        for (int var5 = 0; var5 < class116.field1511; var5++) {
            if (class234.field3356[var5] == arg1) {
                class88.method641("", 0, false, class133.field1819 + var3 + class283.field4036);
                return;
            }
        }
        if (var3.equals(class359.field5616.field3475)) {
            class88.method641("", 0, false, class317.field4681);
            return;
        }
        class223.field3220++;
        class65.field814[class45.field559] = var3;
        class158.field2251[class45.field559] = arg1;
        class237.field3431[class45.field559] = 0;
        class340.field5317[class45.field559] = "";
        class167.field2333[class45.field559] = arg0;
        class130.field1772[class45.field559] = false;
        class45.field559++;
        class180.field2464 = class64.field801;
        class251.field3681.method1309(23, 26);
        class251.field3681.method2049(-19780, arg1);
    }
}
