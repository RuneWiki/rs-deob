import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class38 extends class129 {

    @OriginalMember(owner = "client!ga", name = "Z", descriptor = "[B")
    public byte[] field1000;

    @OriginalMember(owner = "client!ga", name = "bb", descriptor = "Lv;")
    private static class122 field1002 = class55.method425(-64, "Login");

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "I")
    public static int field996 = 0;

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "Lv;")
    public static class122 field994 = class55.method425(-82, "p11_full");

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "Lv;")
    private static class122 field991 = class55.method425(-55, "Please try again)3");

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "Lv;")
    public static class122 field998 = field1002;

    @OriginalMember(owner = "client!ga", name = "eb", descriptor = "Lv;")
    public static class122 field1005 = class55.method425(-104, "Missbrauch melden");

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
    public static int field992 = -1;

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "Lv;")
    private static class122 field995 = class55.method425(-94, "Loading config )2 ");

    @OriginalMember(owner = "client!ga", name = "gb", descriptor = "Lv;")
    public static class122 field1007 = field991;

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "Lv;")
    public static class122 field993 = field995;

    @OriginalMember(owner = "client!ga", name = "ab", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!ga", name = "cb", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!ga", name = "db", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!ga", name = "fb", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!ga", name = "hb", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!ga", name = "W", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!ga", name = "Y", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIZI)I", line = 11)
    public static final int method331(int arg0, int arg1, boolean arg2, int arg3) {
        field1001++;
        if ((class54.field1408[arg3][arg1][arg0] & 0x8) != 0) {
            return 0;
        } else if (arg3 <= 0 || (class54.field1408[1][arg1][arg0] & 0x2) == 0) {
            if (!arg2) {
                method331(-19, 126, true, -53);
            }
            return arg3;
        } else {
            return arg3 - 1;
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "([B)V", line = 34)
    public class38(byte[] arg0) {
        this.field1000 = arg0;
    }

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "(I)V", line = 44)
    public static final void method332(int arg0) {
        if (arg0 != 1) {
            method332(-105);
        }
        Object var1 = class90.field2310;
        synchronized (class90.field2310) {
            if (class58.field1511 != 0) {
                class58.field1511 = 1;
                try {
                    class90.field2310.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        field997++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V", line = 81)
    public static final void method333(boolean arg0) {
        field1006++;
        short var1 = 256;
        for (int var2 = 10; var2 < 117; var2++) {
            int var17 = (int) (Math.random() * 100.0D);
            if (var17 < 50) {
                class84.field2186[(var1 - 2 << 7) + var2] = 255;
            }
        }
        for (int var3 = 0; var3 < 100; var3++) {
            int var14 = (int) (Math.random() * 124.0D) + 2;
            int var15 = (int) (Math.random() * 128.0D) + 128;
            int var16 = (var15 << 7) + var14;
            class84.field2186[var16] = 192;
        }
        for (int var4 = 1; var4 < var1 - 1; var4++) {
            for (int var12 = 1; var12 < 127; var12++) {
                int var13 = (var4 << 7) + var12;
                class19.field506[var13] = (class84.field2186[var13 - 1] + class84.field2186[var13 + 128] + class84.field2186[var13 + 1] + class84.field2186[var13 + -128]) / 4;
            }
        }
        class83.field2168 += 128;
        if (class89.field2274.length < class83.field2168) {
            int var5 = (int) (Math.random() * 12.0D);
            class83.field2168 -= class89.field2274.length;
            class114.method871(class26.field699[var5], (byte) -11);
        }
        for (int var6 = 1; var6 < var1 - 1; var6++) {
            for (int var9 = 1; var9 < 127; var9++) {
                int var10 = (var6 << 7) + var9;
                int var11 = class19.field506[var10 + 128] - class89.field2274[class89.field2274.length - 1 & class83.field2168 + var10] / 5;
                if (var11 < 0) {
                    var11 = 0;
                }
                class84.field2186[var10] = var11;
            }
        }
        if (!arg0) {
            return;
        }
        for (int var7 = 0; var7 < var1 - 1; var7++) {
            class84.field2180[var7] = class84.field2180[var7 + 1];
        }
        class84.field2180[var1 - 1] = (int) (Math.sin((double) class16.field396 / 14.0D) * 16.0D + Math.sin((double) class16.field396 / 15.0D) * 14.0D + Math.sin((double) class16.field396 / 16.0D) * 12.0D);
        if (class42.field1123 > 0) {
            class42.field1123 -= 4;
        }
        if (class109.field2704 > 0) {
            class109.field2704 -= 4;
        }
        if (class42.field1123 != 0 || class109.field2704 != 0) {
            return;
        }
        int var8 = (int) (Math.random() * 2000.0D);
        if (var8 == 1) {
            class109.field2704 = 1024;
        }
        if (var8 == 0) {
            class42.field1123 = 1024;
            return;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V", line = 205)
    public static void method334(boolean arg0) {
        field994 = null;
        field1002 = null;
        field995 = null;
        field991 = null;
        if (arg0) {
            method335(true);
        }
        field1007 = null;
        field993 = null;
        field1005 = null;
        field998 = null;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(Z)I", line = 253)
    public static final int method335(boolean arg0) {
        field1008++;
        int var1 = class108.method837((byte) 59, class115.field2809, class5.field135, class34.field848);
        if (var1 - class29.field743 >= 800 || (class54.field1408[class34.field848][class115.field2809 >> 7][class5.field135 >> 7] & 0x4) == 0) {
            if (!arg0) {
                field992 = -5;
            }
            return 3;
        } else {
            return class34.field848;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILfe;Lv;)Lv;", line = 269)
    public static final class122 method336(int arg0, class36 arg1, class122 arg2) {
        field1004++;
        if (arg0 <= 24) {
            return null;
        } else if (arg2.method955(24669, class45.field1172) == -1) {
            return arg2;
        } else {
            while (true) {
                int var3 = arg2.method955(24669, class72.field1858);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.method955(24669, class22.field598);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.method955(24669, class125.field3038);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.method955(24669, class7.field170);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.method955(24669, class14.field370);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.method955(24669, class90.field2312);
                                                        if (var8 == -1) {
                                                            return arg2;
                                                        }
                                                        class122 var9 = class51.field1287;
                                                        if (class119.field2871 != null) {
                                                            var9 = class25.method260((byte) 52, class119.field2871.field2455);
                                                            try {
                                                                if (class119.field2871.field2456 != null) {
                                                                    byte[] var10 = ((String) class119.field2871.field2456).getBytes("ISO-8859-1");
                                                                    var9 = class91.method725(var10.length, (byte) 47, var10, 0);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg2 = class59.method454(new class122[] { arg2.method951(7835, var8, 0), var9, arg2.method960(var8 + 4, 125) }, 5176);
                                                    }
                                                }
                                                arg2 = class59.method454(new class122[] { arg2.method951(7835, var7, 0), class30.method283(class119.method906(4, 1, arg1), -44), arg2.method960(var7 + 2, 126) }, 5176);
                                            }
                                        }
                                        arg2 = class59.method454(new class122[] { arg2.method951(7835, var6, 0), class30.method283(class119.method906(3, 1, arg1), -94), arg2.method960(var6 + 2, 125) }, 5176);
                                    }
                                }
                                arg2 = class59.method454(new class122[] { arg2.method951(7835, var5, 0), class30.method283(class119.method906(2, 1, arg1), -44), arg2.method960(var5 + 2, 125) }, 5176);
                            }
                        }
                        arg2 = class59.method454(new class122[] { arg2.method951(7835, var4, 0), class30.method283(class119.method906(1, 1, arg1), -72), arg2.method960(var4 + 2, 126) }, 5176);
                    }
                }
                arg2 = class59.method454(new class122[] { arg2.method951(7835, var3, 0), class30.method283(class119.method906(0, 1, arg1), -81), arg2.method960(var3 + 2, 125) }, 5176);
            }
        }
    }
}
