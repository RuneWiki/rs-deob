import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class72 extends class3 {

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "Lhe;")
    public static class94 field1094 = new class94(5);

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "Lsf;")
    private static class108 field1100 = class140.method973(255, "K");

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "Lsf;")
    public static class108 field1096 = class140.method973(255, "::clientdrop");

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "Lsf;")
    public static class108 field1101 = field1100;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "Lsf;")
    public static class108 field1103 = null;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "Lsf;")
    public static class108 field1097 = field1100;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "[Lal;")
    public static class326[] field1098;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)Lce;", line = 25)
    public static final class251 method480(int arg0, int arg1) {
        field1090++;
        class251 var2 = (class251) class42.field554.method466((long) arg0, 1);
        if (arg1 != 0) {
            return (class251) null;
        } else if (var2 == null) {
            byte[] var3 = class103.field1802.method1868(arg1 ^ 0x2FCC, 11, arg0);
            class251 var4 = new class251();
            if (var3 != null) {
                var4.method1773(-31266, new class249(var3));
            }
            class42.field554.method468((long) arg0, (byte) -120, var4);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(I)V", line = 56)
    public static final void method481(int arg0) {
        field1093++;
        if (class287.field5022 == 0) {
            return;
        }
        try {
            if (++class1.field26 > 2000) {
                if (class14.field161 != null) {
                    class14.field161.method1487(13881);
                    class14.field161 = null;
                }
                if (class98.field1603 >= 1) {
                    class287.field5022 = 0;
                    class15.field196 = -5;
                    return;
                }
                class98.field1603++;
                class1.field26 = 0;
                class287.field5022 = 1;
                if (class149.field2723 == class135.field2345) {
                    class149.field2723 = class78.field1184;
                } else {
                    class149.field2723 = class135.field2345;
                }
            }
            if (class287.field5022 == 1) {
                class93.field1489 = class289.field5052.method970(class68.field1061, class149.field2723, (byte) -120);
                class287.field5022 = 2;
            }
            int var1 = -64 % ((arg0 - 66) / 56);
            if (class287.field5022 == 2) {
                if (class93.field1489.field3686 == 2) {
                    throw new IOException();
                }
                if (class93.field1489.field3686 != 1) {
                    return;
                }
                class14.field161 = new class216((Socket) class93.field1489.field3685, class289.field5052);
                class93.field1489 = null;
                class14.field161.method1483(class256.field4471.field4314, 0, false, class256.field4471.field4338);
                if (class308.field5347 != null) {
                    class308.field5347.method1406((byte) 66);
                }
                if (class261.field4601 != null) {
                    class261.field4601.method1406((byte) 66);
                }
                int var2 = class14.field161.method1482((byte) 126);
                if (class308.field5347 != null) {
                    class308.field5347.method1406((byte) 66);
                }
                if (class261.field4601 != null) {
                    class261.field4601.method1406((byte) 66);
                }
                if (var2 != 21) {
                    class287.field5022 = 0;
                    class15.field196 = var2;
                    class14.field161.method1487(13881);
                    class14.field161 = null;
                    return;
                }
                class287.field5022 = 3;
            }
            if (class287.field5022 == 3) {
                if (class14.field161.method1486(7) < 1) {
                    return;
                }
                class142.field2508 = new class108[class14.field161.method1482((byte) 127)];
                class287.field5022 = 4;
            }
            if (class287.field5022 == 4) {
                if (class14.field161.method1486(7) < (class142.field2508.length * 8)) {
                    return;
                }
                class293.field5127.field4314 = 0;
                class14.field161.method1478(0, class142.field2508.length * 8, false, class293.field5127.field4338);
                for (int var3 = 0; var3 < class142.field2508.length; var3++) {
                    class142.field2508[var3] = class330.method2259((byte) -120, class293.field5127.method1764((byte) -118));
                }
                class287.field5022 = 0;
                class15.field196 = 21;
                class14.field161.method1487(13881);
                class14.field161 = null;
                return;
            }
        } catch (IOException var5) {
            if (class14.field161 != null) {
                class14.field161.method1487(13881);
                class14.field161 = null;
            }
            if (class98.field1603 >= 1) {
                class287.field5022 = 0;
                class15.field196 = -4;
            } else {
                class287.field5022 = 1;
                class98.field1603++;
                if (class149.field2723 == class135.field2345) {
                    class149.field2723 = class78.field1184;
                } else {
                    class149.field2723 = class135.field2345;
                }
                class1.field26 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILca;II)V", line = 219)
    public static final void method482(int arg0, class98 arg1, int arg2, int arg3) {
        field1095++;
        if (class272.field4776 != null || class62.field989 || arg1 == null || class259.method1842((byte) 127, arg1) == null) {
            return;
        }
        class272.field4776 = arg1;
        class209.field3736 = class259.method1842((byte) 127, arg1);
        class311.field5385 = false;
        class286.field5009 = arg0;
        if (arg3 >= 114) {
            class206.field3692 = arg2;
            class135.field2330 = 0;
        }
    }

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(I)V", line = 253)
    public static void method483(int arg0) {
        field1100 = null;
        field1101 = null;
        field1096 = null;
        field1097 = null;
        if (arg0 <= 17) {
            method484(-108, (class51) null, (byte) 35, 66);
        }
        field1094 = null;
        field1103 = null;
        field1098 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILlj;BI)V", line = 269)
    public static final void method484(int arg0, class51 arg1, byte arg2, int arg3) {
        if (arg1.field4492 == arg0 && arg0 != -1) {
            class272 var4 = class149.method1063(arg0, -18767);
            int var5 = var4.field4773;
            if (var5 == 1) {
                arg1.field4456 = 0;
                arg1.field4473 = 0;
                arg1.field4521 = arg3;
                arg1.field4453 = 0;
                class172.method1226(var4, arg1.field4457, -21329, arg1.field4453, class95.field1513 == arg1, arg1.field4452);
            }
            if (var5 == 2) {
                arg1.field4456 = 0;
            }
        } else if (arg0 == -1 || arg1.field4492 == -1 || class149.method1063(arg0, -18767).field4758 >= class149.method1063(arg1.field4492, -18767).field4758) {
            arg1.field4447 = arg1.field4487;
            arg1.field4521 = arg3;
            arg1.field4453 = 0;
            arg1.field4473 = 0;
            arg1.field4492 = arg0;
            arg1.field4456 = 0;
            if (arg1.field4492 != -1) {
                class172.method1226(class149.method1063(arg1.field4492, -18767), arg1.field4457, -21329, arg1.field4453, class95.field1513 == arg1, arg1.field4452);
            }
        }
        field1092++;
        if (arg2 > -125) {
            field1094 = (class94) null;
        }
    }
}
