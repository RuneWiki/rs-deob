import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class416 {

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Lsh;")
    public static class472 field5995 = new class472(101, 8);

    @OriginalMember(owner = "client!df", name = "f", descriptor = "Z")
    public static boolean field5997 = false;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "Lct;")
    public static class285 field5999 = new class285(41, 3);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field5993;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "Lce;")
    public static class302 field5996;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZLjava/lang/Throwable;Ljava/lang/String;)V", line = 3)
    public static final void method2475(boolean arg0, Throwable arg1, String arg2) {
        field5994++;
        try {
            if (!arg0) {
                String var3 = "";
                if (arg1 != null) {
                    var3 = class493.method2886(arg1, 19528);
                }
                if (arg2 != null) {
                    if (arg1 != null) {
                        var3 = var3 + " | ";
                    }
                    var3 = var3 + arg2;
                }
                class169.method1175(var3, 65);
                String var4 = class467.method2739("%3a", var3, 17186, ":");
                String var5 = class467.method2739("%40", var4, 17186, "@");
                String var6 = class467.method2739("%26", var5, 17186, "&");
                String var7 = class467.method2739("%23", var6, 17186, "#");
                if (client.field6670.field2125 != null) {
                    class397 var8 = client.field6670.method1025((byte) 104, new URL(client.field6670.field2125.getCodeBase(), "clienterror.ws?c=" + class89.field1250 + "&u=" + class141.field2021 + "&v1=" + class153.field2129 + "&v2=" + class153.field2127 + "&e=" + var7));
                    while (var8.field5822 == 0) {
                        class325.method2005(true, 1L);
                    }
                    if (var8.field5822 == 1) {
                        DataInputStream var9 = (DataInputStream) var8.field5823;
                        var9.read();
                        var9.close();
                    }
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V", line = 56)
    public static final void method2476(int arg0, int arg1, int arg2) {
        if (class189.field2890 < class189.field2894) {
            class189.field2890 = (float) ((double) class189.field2890 / 30.0D + (double) class189.field2890);
            if (class189.field2890 > class189.field2894) {
                class189.field2890 = class189.field2894;
            }
            class174.method1195(122);
            class189.field2892 = (int) class189.field2890 >> 1;
            class189.field2891 = class402.method2407(class189.field2892, -121);
        } else if (class189.field2890 > class189.field2894) {
            class189.field2890 = (float) ((double) class189.field2890 - (double) class189.field2890 / 30.0D);
            if (class189.field2890 < class189.field2894) {
                class189.field2890 = class189.field2894;
            }
            class174.method1195(108);
            class189.field2892 = (int) class189.field2890 >> 1;
            class189.field2891 = class402.method2407(class189.field2892, -122);
        }
        field5998++;
        if (class294.field4429 != -1 && class303.field4512 != -1) {
            int var3 = class294.field4429 - class384.field5692;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class303.field4512 - class446.field6309;
            class384.field5692 -= -var3;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class446.field6309 -= -var4;
            if (var3 == 0 && var4 == 0) {
                class303.field4512 = -1;
                class294.field4429 = -1;
            }
            class174.method1195(-54);
        }
        if (arg2 >= class132.field1843) {
            class346.field5287 = -1;
            class47.field685 = -1;
        } else {
            class163.field2270--;
            if (class163.field2270 == 0) {
                class163.field2270 = 100;
                class132.field1843--;
            }
        }
        if (!class172.field2458 || class314.field4720 == null) {
            return;
        }
        for (class154 var5 = (class154) class314.field4720.method2456(32101); var5 != null; var5 = (class154) class314.field4720.method2461(301)) {
            class94 var6 = class189.field2877.method1111(var5.field2142.field4401, -13516);
            if (var5.method1057(arg1, arg0, false)) {
                if (var6.field1327 != null) {
                    if (var6.field1327[4] != null) {
                        class344.method2117((long) var5.field2142.field4401, 1001, true, -1, var6.field1324, var6.field1327[4], -8, var6.field1322, -1, false, 0);
                    }
                    if (var6.field1327[3] != null) {
                        class344.method2117((long) var5.field2142.field4401, 1010, true, -1, var6.field1324, var6.field1327[3], -8, var6.field1322, -1, false, 0);
                    }
                    if (var6.field1327[2] != null) {
                        class344.method2117((long) var5.field2142.field4401, 1007, true, -1, var6.field1324, var6.field1327[2], arg2 ^ 0xFFFFFFF8, var6.field1322, -1, false, 0);
                    }
                    if (var6.field1327[1] != null) {
                        class344.method2117((long) var5.field2142.field4401, 1011, true, -1, var6.field1324, var6.field1327[1], -8, var6.field1322, -1, false, 0);
                    }
                    if (var6.field1327[0] != null) {
                        class344.method2117((long) var5.field2142.field4401, 1003, true, -1, var6.field1324, var6.field1327[0], -8, var6.field1322, -1, false, 0);
                    }
                }
                if (!var5.field2142.field4403) {
                    var5.field2142.field4403 = true;
                    class477.method2799(class77.field1090, var5.field2142.field4401, var6.field1322);
                }
                if (var5.field2142.field4403) {
                    class477.method2799(class409.field5927, var5.field2142.field4401, var6.field1322);
                }
            } else if (var5.field2142.field4403) {
                var5.field2142.field4403 = false;
                class477.method2799(class313.field4714, var5.field2142.field4401, var6.field1322);
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;ILtr;Z)V", line = 191)
    public static final void method2477(String arg0, int arg1, class229 arg2, boolean arg3) {
        field5992++;
        byte var4 = 4;
        int var5 = var4 + 6;
        if (arg1 <= 72) {
            method2478(true);
        }
        int var6 = var4 + 6;
        int var7 = class267.field3960.method1(arg0, 250, (class319[]) null, 0);
        int var8 = class267.field3960.method5(-1, (class319[]) null, 250, arg0) * 13;
        class138.field1976.method508(var5 - var4, var6 - var4, var4 + var7 + var4, var8 - -var4 + var4, -16777216, 0);
        class138.field1976.method569(var5 - var4, -var4 + var6, var7 + var4 + var4, var4 + var8 + var4, -1, 0);
        arg2.method1492(var8, var7, 0, arg0, 0, -1, (class401) null, (int[]) null, var5, 1, 1, -121, (class319[]) null, 0, -1, var6);
        class247.method1579(var6 - var4, var4 - -var4 + var7, -2472, var5 - var4, var8 - -var4 + var4);
        if (arg3) {
            class138.field1976.method591();
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V", line = 223)
    public static final void method2478(boolean arg0) {
        if (arg0) {
            field5996 = null;
        }
        if (class153.field2137 != 3) {
            class212.field3196 = -1;
        }
        field5993++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 249)
    public static void method2479(int arg0) {
        if (arg0 > -3) {
            method2480((byte) -31);
        }
        field5995 = null;
        field5999 = null;
        field5996 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V", line = 261)
    public static final void method2480(byte arg0) {
        field6000++;
        class230.field3390.field6315 = 0;
        class392.field5788 = null;
        class32.field422 = 0;
        class147.field2099 = null;
        if (arg0 > -36) {
            field5996 = null;
        }
        class273.field4143 = null;
        class352.field5365 = 0;
        class280.field4236 = null;
        class220.field3246.field6315 = 0;
        class95.field1342 = 0;
        class3.method23(-38);
        class370.method2288(0);
        for (int var1 = 0; var1 < 2048; var1++) {
            class40.field565[var1] = null;
        }
        class472.field6622 = null;
        for (int var2 = 0; var2 < class18.field241.length; var2++) {
            class349 var4 = class18.field241[var2];
            if (var4 != null) {
                var4.field4635 = -1;
            }
        }
        class172.method1187(0);
        class469.field6596 = 1;
        class144.method987((byte) 29, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class103.field1442[var3] = true;
        }
        class81.method667((byte) -115);
        class51.field741 = 0L;
        class3.field64 = null;
    }
}
