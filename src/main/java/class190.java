import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public abstract class class190 {

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "Lge;")
    public static class511 field2779 = new class511(260);

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "[Lrw;")
    public static class543[] field2782 = new class543[14];

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Ldh;")
    public static class216 field2781 = new class216(2, 4);

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "F")
    public static float field2783;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
    public abstract void method1291(boolean arg0);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public abstract void method1292(byte arg0);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static void method1293(int arg0) {
        field2782 = null;
        field2779 = null;
        field2781 = null;
        if (arg0 != 260) {
            field2781 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZZLki;)V")
    public static final void method1294(boolean arg0, boolean arg1, class510 arg2) {
        field2778++;
        if (class430.field6184 >= 400) {
            return;
        }
        if (class364.field5293 != arg2) {
            String var3;
            if (arg2.field7377 == 0) {
                boolean var4 = true;
                if (class364.field5293.field7392 != -1 && arg2.field7392 != -1) {
                    int var5 = arg2.field7383 >= class364.field5293.field7383 ? arg2.field7383 : class364.field5293.field7383;
                    int var6 = class364.field5293.field7392 >= arg2.field7392 ? arg2.field7392 : class364.field5293.field7392;
                    int var7 = (var5 * 10 / 100) + var6 + 5;
                    int var8 = class364.field5293.field7383 - arg2.field7383;
                    if (var8 < 0) {
                        var8 = -var8;
                    }
                    if (var7 < var8) {
                        var4 = false;
                    }
                }
                String var9 = class167.field2519 == class14.field163 ? class56.field1005.method426(class503.field7255, 72) : class447.field6377.method426(class503.field7255, 59);
                if (arg2.field7383 >= arg2.field7362) {
                    var3 = arg2.method2973(true, true) + (var4 ? class32.method176(20351, class364.field5293.field7383, arg2.field7383) : "<col=ffffff>") + " (" + var9 + arg2.field7383 + ")";
                } else {
                    var3 = arg2.method2973(true, true) + (var4 ? class32.method176(20351, class364.field5293.field7383, arg2.field7383) : "<col=ffffff>") + " (" + var9 + arg2.field7383 + "+" + (arg2.field7362 - arg2.field7383) + ")";
                }
            } else {
                var3 = arg2.method2973(true, !arg0) + " (" + class23.field338.method426(class503.field7255, 108) + arg2.field7377 + ")";
            }
            if (arg0) {
                method1294(false, false, null);
            }
            if (class219.field3351) {
                if (!arg1 && (class25.field362 & 0x8) != 0) {
                    class3.field18++;
                    class20.method114(2, (long) arg2.field290, true, 0, false, true, class137.field2118, class503.field7268 + " -> <col=ffffff>" + var3, class89.field1442, -1, 0);
                }
            } else if (arg1) {
                class20.method114(-1, 0L, !arg0, 0, true, false, -1, "", "<col=cccccc>" + var3, 0, 0);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class316.field4704[var10] != null) {
                        short var11 = 0;
                        if (client.field3115 == class14.field163 && class316.field4704[var10].equalsIgnoreCase(class391.field5559.method426(class503.field7255, 110))) {
                            if (arg2.field7383 > class364.field5293.field7383) {
                                var11 = 2000;
                            }
                            if (class364.field5293.field7398 != 0 && arg2.field7398 != 0) {
                                if (class364.field5293.field7398 == arg2.field7398) {
                                    var11 = 2000;
                                } else {
                                    var11 = 0;
                                }
                            }
                        } else if (class280.field4179[var10]) {
                            var11 = 2000;
                        }
                        short var12 = (short) (class287.field4250[var10] + var11);
                        int var13 = class157.field2395[var10] == -1 ? class522.field7638 : class157.field2395[var10];
                        class20.method114(var12, (long) arg2.field290, true, 0, false, true, var13, "<col=ffffff>" + var3, class316.field4704[var10], -1, 0);
                        class184.field2714++;
                    }
                }
            }
            if (!arg1) {
                for (class341 var14 = (class341) class258.field3829.method863(-1); var14 != null; var14 = (class341) class258.field3829.method865(-1)) {
                    if (var14.field5039 == 21) {
                        var14.field5038 = "<col=ffffff>" + var3;
                        return;
                    }
                }
            }
        } else if (class219.field3351 && (class25.field362 & 0x10) != 0) {
            class146.field2244++;
            class20.method114(5, 0L, true, 0, false, true, class137.field2118, class503.field7268 + " -> <col=ffffff>" + class112.field1675.method426(class503.field7255, 124), class89.field1442, -1, 0);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIII)V")
    public static final void method1295(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2780++;
        if (arg1 > arg4) {
            for (int var5 = arg4; var5 < arg1; var5++) {
                class271.field4078[var5][arg3] = arg0;
            }
        } else {
            for (int var6 = arg1; var6 < arg4; var6++) {
                class271.field4078[var6][arg3] = arg0;
            }
        }
        int var7 = 93 / ((10 - arg2) / 46);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III[B)V")
    public abstract void method1296(int arg0, int arg1, int arg2, byte[] arg3) throws IOException;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V")
    public static final void method1297(byte arg0) {
        field2777++;
        for (int var1 = 0; var1 < 5; var1++) {
            class172.field2551[var1] = false;
        }
        if (arg0 != 70) {
            method1293(48);
        }
        class45.field885 = class24.field349;
        class84.field1331 = 0;
        class8.field58 = class171.field2548;
        class203.field3134 = class254.field3756;
        class27.field386 = 0;
        class84.field1332 = class315.field4688;
        class86.field1396 = -1;
        class459.field6657 = class397.field5649;
        class294.field4381 = 5;
        class176.field2634 = -1;
        class412.field5836 = class62.field1086;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Z")
    public abstract boolean method1298(int arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([BIII)I")
    public abstract int method1299(byte[] arg0, int arg1, int arg2, int arg3) throws IOException;
}
