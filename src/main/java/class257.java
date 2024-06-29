import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class257 extends class320 {

    @OriginalMember(owner = "client!k", name = "A", descriptor = "[Lli;")
    public class241[] field4147 = new class241[5];

    @OriginalMember(owner = "client!k", name = "E", descriptor = "I")
    public int field4151 = 0;

    @OriginalMember(owner = "client!k", name = "S", descriptor = "[I")
    public int[] field4165 = new int[5];

    @OriginalMember(owner = "client!k", name = "v", descriptor = "I")
    public int field4142;

    @OriginalMember(owner = "client!k", name = "G", descriptor = "I")
    public int field4153;

    @OriginalMember(owner = "client!k", name = "N", descriptor = "I")
    public int field4160;

    @OriginalMember(owner = "client!k", name = "T", descriptor = "I")
    public int field4166;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "Lul;")
    public static class51 field4133 = new class51(64);

    @OriginalMember(owner = "client!k", name = "s", descriptor = "Ljava/lang/String;")
    public static String field4139 = "Loaded config";

    @OriginalMember(owner = "client!k", name = "L", descriptor = "[Lwi;")
    public static class285[] field4158 = new class285[14];

    @OriginalMember(owner = "client!k", name = "C", descriptor = "Z")
    public static boolean field4149 = true;

    @OriginalMember(owner = "client!k", name = "P", descriptor = "B")
    public byte field4162;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!k", name = "x", descriptor = "I")
    public int field4144;

    @OriginalMember(owner = "client!k", name = "B", descriptor = "I")
    public int field4148;

    @OriginalMember(owner = "client!k", name = "D", descriptor = "I")
    public int field4150;

    @OriginalMember(owner = "client!k", name = "K", descriptor = "I")
    public int field4157;

    @OriginalMember(owner = "client!k", name = "M", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "I")
    public int field4163;

    @OriginalMember(owner = "client!k", name = "U", descriptor = "Lp;")
    public class112 field4167;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "Lwk;")
    public class192 field4141;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "Lk;")
    public class257 field4145;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "Lw;")
    public class297 field4146;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "Lhk;")
    public class330 field4140;

    @OriginalMember(owner = "client!k", name = "F", descriptor = "Ldl;")
    public class44 field4152;

    @OriginalMember(owner = "client!k", name = "R", descriptor = "Lcg;")
    public static class49 field4164;

    @OriginalMember(owner = "client!k", name = "I", descriptor = "Lsj;")
    public class64 field4155;

    @OriginalMember(owner = "client!k", name = "J", descriptor = "Lpf;")
    public class95 field4156;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "Z")
    public boolean field4143;

    @OriginalMember(owner = "client!k", name = "H", descriptor = "Z")
    public boolean field4154;

    @OriginalMember(owner = "client!k", name = "O", descriptor = "Z")
    public boolean field4161;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(III)V", line = 4)
    public static final void method1781(int arg0, int arg1, int arg2) {
        if (arg2 < -90) {
            field4135++;
            class30 var3 = class99.method857((byte) 96, arg0, 6);
            var3.method277(true);
            var3.field438 = arg1;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(JI)V", line = 19)
    public static final void method1782(long arg0, int arg1) {
        field4132++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class352.field5570 < 100 || class261.field4227) || class352.field5570 >= 200) {
            class170.method1339(0, class199.field3402, "", (byte) -98);
            return;
        }
        String var3 = class8.method48(arg0, true);
        for (int var4 = 0; var4 < class352.field5570; var4++) {
            if (class339.field5414[var4] == arg0) {
                class170.method1339(0, var3 + class214.field3595, "", (byte) -98);
                return;
            }
        }
        for (int var5 = arg1; var5 < class200.field3424; var5++) {
            if (class20.field305[var5] == arg0) {
                class170.method1339(0, class125.field2161 + var3 + class107.field1823, "", (byte) -98);
                return;
            }
        }
        if (var3.equals(class218.field3632.field3491)) {
            class170.method1339(0, class154.field2738, "", (byte) -98);
            return;
        }
        class98.field1601[class352.field5570] = var3;
        class175.field2988++;
        class339.field5414[class352.field5570] = arg0;
        class67.field1077[class352.field5570] = 0;
        class269.field4300[class352.field5570] = "";
        class259.field4199[class352.field5570] = 0;
        class344.field5477[class352.field5570] = false;
        class352.field5570++;
        class51.field809 = class99.field1606;
        class341.field5443.method26(29, 7);
        class341.field5443.method2333(arg0, -91);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V", line = 94)
    public static void method1783(byte arg0) {
        field4133 = null;
        int var1 = 0 % ((46 - arg0) / 58);
        field4139 = null;
        field4164 = null;
        field4158 = null;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(Z)V", line = 112)
    public static final void method1784(boolean arg0) {
        field4136++;
        if (class30.field445 == 0) {
            return;
        }
        try {
            if (++class154.field2745 > 1500) {
                if (class279.field4426 != null) {
                    class279.field4426.method177(false);
                    class279.field4426 = null;
                }
                if (class197.field3368 >= 1) {
                    class86.field1378 = -5;
                    class30.field445 = 0;
                    return;
                }
                if (class230.field3840 == class141.field2590) {
                    class230.field3840 = class292.field4676;
                } else {
                    class230.field3840 = class141.field2590;
                }
                class154.field2745 = 0;
                class197.field3368++;
                class30.field445 = 1;
            }
            if (class30.field445 == 1) {
                class356.field5613 = class85.field1369.method541(false, class230.field3840, class133.field2270);
                class30.field445 = 2;
            }
            if (class30.field445 == 2) {
                if (class356.field5613.field709 == 2) {
                    throw new IOException();
                }
                if (class356.field5613.field709 != 1) {
                    return;
                }
                class279.field4426 = new class17((Socket) class356.field5613.field712, class85.field1369);
                class356.field5613 = null;
                class279.field4426.method178(0, class341.field5443.field5353, class341.field5443.field5342, !arg0);
                if (class135.field2362 != null) {
                    class135.field2362.method1281((byte) 102);
                }
                if (class320.field5064 != null) {
                    class320.field5064.method1281((byte) 118);
                }
                int var1 = class279.field4426.method180(0);
                if (class135.field2362 != null) {
                    class135.field2362.method1281((byte) 126);
                }
                if (class320.field5064 != null) {
                    class320.field5064.method1281((byte) 100);
                }
                if (var1 != 101) {
                    class30.field445 = 0;
                    class86.field1378 = var1;
                    class279.field4426.method177(false);
                    class279.field4426 = null;
                    return;
                }
                class30.field445 = 3;
            }
            if (!arg0) {
                field4137 = 126;
            }
            if (class30.field445 == 3) {
                if (class279.field4426.method175(-21329) >= 2) {
                    int var2 = class279.field4426.method180(0) << 8 | class279.field4426.method180(0);
                    class128.method1070(-127, var2);
                    if (class120.field2082 == -1) {
                        class86.field1378 = 6;
                        class30.field445 = 0;
                        class279.field4426.method177(false);
                        class279.field4426 = null;
                        return;
                    }
                    class30.field445 = 0;
                    class279.field4426.method177(false);
                    class279.field4426 = null;
                    class21.method207(7);
                    return;
                }
                return;
            }
        } catch (IOException var4) {
            if (class279.field4426 != null) {
                class279.field4426.method177(!arg0);
                class279.field4426 = null;
            }
            if (class197.field3368 >= 1) {
                class30.field445 = 0;
                class86.field1378 = -4;
            } else {
                class197.field3368++;
                class30.field445 = 1;
                class154.field2745 = 0;
                if (class230.field3840 == class141.field2590) {
                    class230.field3840 = class292.field4676;
                } else {
                    class230.field3840 = class141.field2590;
                }
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(I)Lei;", line = 262)
    public static final class215 method1785(int arg0) {
        field4138++;
        if (arg0 < 107) {
            field4137 = -87;
        }
        try {
            return new class96();
        } catch (Throwable var4) {
            try {
                return (class215) Class.forName("vn").getDeclaredConstructor().newInstance();
            } catch (Throwable var3) {
                return new class260();
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(III)V", line = 283)
    public class257(int arg0, int arg1, int arg2) {
        this.field4142 = arg2;
        this.field4160 = this.field4153 = arg0;
        this.field4166 = arg1;
    }
}
