import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class218 extends class46 {

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "[Lk;")
    public class109[] field3991;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "Lwd;")
    public static class238 field3987 = new class238(0, 0);

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "Lvi;")
    public static class233 field3993;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "Lhh;")
    public static class85 field3990;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "Lii;")
    public static class96 field3984;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3986++;
        if (arg4 != 2) {
            method1360(-28, -5, 81, null, (byte) -59, 74, null);
        }
        if (class135.field2542 <= arg6 && arg5 <= class168.field3083 && class169.field3161 <= arg1 && class17.field254 >= arg3) {
            if (arg0 == 1) {
                class162.method1046(arg2, arg6, (byte) 84, arg1, arg5, arg3);
            } else {
                class54.method368(-54, arg5, arg3, arg2, arg1, arg6, arg0);
            }
        } else if (arg0 == 1) {
            class96.method591(arg5, arg2, arg4 ^ 0xFFFFFFFD, arg3, arg6, arg1);
        } else {
            class139.method939(arg0, arg2, (byte) -79, arg6, arg1, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIILvi;BILii;)V")
    public static final void method1360(int arg0, int arg1, int arg2, class233 arg3, byte arg4, int arg5, class96 arg6) {
        if (arg4 <= 61) {
            field3990 = null;
        }
        field3985++;
        if (arg3 == null) {
            return;
        }
        int var7 = class230.field4153 + class166.field3029 & 0x7FF;
        int var8 = Math.max(arg6.field1830 / 2, arg6.field1740 / 2) + 10;
        int var9 = arg2 * arg2 + arg0 * arg0;
        if (var9 > var8 * var8) {
            return;
        }
        int var10 = class50.field853[var7];
        int var11 = var10 * 256 / (class233.field4196 + 256);
        int var12 = class50.field851[var7];
        int var13 = var12 * 256 / (class233.field4196 + 256);
        int var14 = arg0 * var11 + arg2 * var13 >> 16;
        int var15 = arg0 * var13 - arg2 * var11 >> 16;
        ((class18) arg3).method91(arg6.field1830 / 2 + arg5 + var14 - arg3.field4209 / 2, arg6.field1740 / 2 + -var15 + -(arg3.field4205 / 2) + arg1, arg6.field1795, arg6.field1747);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)Z")
    public final boolean method1361(int arg0, boolean arg1) {
        field3988++;
        if (arg1) {
            field3984 = null;
        }
        return this.field3991[arg0].field2058;
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(B)V")
    public static final void method1362(byte arg0) {
        field3992++;
        if (arg0 >= -82) {
            return;
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class57.field974 - 1; var2++) {
                if (class31.field488[var2] < 1000 && class31.field488[var2 + 1] > 1000) {
                    var1 = false;
                    class132 var3 = class95.field1679[var2];
                    class95.field1679[var2] = class95.field1679[var2 + 1];
                    class95.field1679[var2 + 1] = var3;
                    class132 var4 = class8.field82[var2];
                    class8.field82[var2] = class8.field82[var2 + 1];
                    class8.field82[var2 + 1] = var4;
                    int var5 = class162.field2940[var2];
                    class162.field2940[var2] = class162.field2940[var2 + 1];
                    class162.field2940[var2 + 1] = var5;
                    int var6 = class111.field2097[var2];
                    class111.field2097[var2] = class111.field2097[var2 + 1];
                    class111.field2097[var2 + 1] = var6;
                    short var7 = class31.field488[var2];
                    class31.field488[var2] = class31.field488[var2 + 1];
                    class31.field488[var2 + 1] = var7;
                    long var8 = class165.field2971[var2];
                    class165.field2971[var2] = class165.field2971[var2 + 1];
                    class165.field2971[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lpb;Lpb;IZ)V")
    public class218(class165 arg0, class165 arg1, int arg2, boolean arg3) {
        class19 var5 = new class19();
        int var6 = arg0.method1068(arg2, 0);
        this.field3991 = new class109[var6];
        int[] var7 = arg0.method1074(arg2, (byte) -106);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1079(arg2, -13, var7[var8]);
            int var10 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            class111 var11 = null;
            for (class111 var12 = (class111) var5.method119(true); var12 != null; var12 = (class111) var5.method125((byte) -70)) {
                if (var12.field2112 == var10) {
                    var11 = var12;
                    break;
                }
            }
            if (var11 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1080(var10, (byte) 81, 0);
                } else {
                    var13 = arg1.method1080(0, (byte) 81, var10);
                }
                var11 = new class111(var10, var13);
                var5.method120(0, var11);
            }
            this.field3991[var7[var8]] = new class109(var9, var11);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
    public static void method1363(boolean arg0) {
        field3987 = null;
        field3984 = null;
        field3993 = null;
        field3990 = null;
        if (arg0) {
            field3987 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IBIIII)V")
    public static final void method1364(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg3;
        int var7 = arg4 - arg5;
        if (arg1 != -109) {
            field3990 = null;
        }
        field3989++;
        if (var7 == 0) {
            if (var6 != 0) {
                class178.method1154(arg0, arg3, 94, arg2, arg5);
            }
        } else if (var6 == 0) {
            class180.method1160(arg4, arg3, arg0, arg1 + 136, arg5);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg5;
                int var10 = arg4;
                arg5 = arg3;
                arg3 = var9;
                arg4 = arg2;
                arg2 = var10;
            }
            if (arg5 > arg4) {
                int var11 = arg3;
                arg3 = arg2;
                arg2 = var11;
                int var12 = arg5;
                arg5 = arg4;
                arg4 = var12;
            }
            int var13 = arg3;
            int var14 = arg4 - arg5;
            int var15 = arg2 - arg3;
            if (var15 < 0) {
                var15 = -var15;
            }
            int var16 = arg3 >= arg2 ? -1 : 1;
            int var17 = -(var14 >> 1);
            if (var8) {
                for (int var18 = arg5; var18 <= arg4; var18++) {
                    class61.field1033[var18][var13] = arg0;
                    var17 += var15;
                    if (var17 > 0) {
                        var17 -= var14;
                        var13 += var16;
                    }
                }
            } else {
                for (int var19 = arg5; var19 <= arg4; var19++) {
                    class61.field1033[var13][var19] = arg0;
                    var17 += var15;
                    if (var17 > 0) {
                        var17 -= var14;
                        var13 += var16;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
    public static final void method1365(int arg0) {
        field3994++;
        class64.field1054.method660(162, 3);
        class64.field1054.method709(-27341, 0L);
        if (arg0 == -14355) {
            class91.field1605++;
        }
    }
}
