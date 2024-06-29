import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class634 {

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field9102 = 0;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Liv;")
    public static class82 field9099 = new class82(5, 3);

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field9098;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field9100;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field9101;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field9103;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field9104;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field9105;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "Ljn;")
    public static class668 field9107;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "Ljn;")
    public static class668 field9108;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ag", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field9109;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "[I")
    public static int[] field9106;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()V")
    public static final void method3620() {
        for (int var0 = 0; var0 < class100.field1342; var0++) {
            if (!class638.field9133[var0]) {
                class475 var1 = class436.field6249[var0];
                class530 var2 = var1.field6647;
                int var3 = var1.field6636;
                int var4 = var2.method3122(-11184) - class480.field6727;
                int var5 = (var4 * 2 >> class295.field3981) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method3118(34037) - var4 >> class295.field3981;
                int var9 = var2.method3115(-30190) - var4 >> class295.field3981;
                int var10 = var2.method3115(-30190) + var4 >> class295.field3981;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class302.field4057) {
                    var10 = class302.field4057 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field6641[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class455.field6393) {
                        var16 = class455.field6393 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class43 var19 = class564.method3296(var3, var17, var11, field9109 == null ? (field9109 = method3627("na")) : field9109);
                        if (var19 != null && var19.field764 != 0) {
                            if (var19.field764 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field6641[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field6641[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field6641[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field6641[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class638.field9133[var0] = true;
                class155.field1899[var3].method426(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILn;IZ)V")
    public static final void method3621(int arg0, class17 arg1, int arg2, boolean arg3) {
        field9101++;
        if (class99.field1336) {
            class184 var4 = class19.field524 == -1 ? null : class582.field8483.method2536((byte) -113, class19.field524);
            if (client.method1659(arg1).method990(-94) && (class251.field3440 & 0x20) != 0 && (var4 == null || arg1.method207(class19.field524, (byte) -123, var4.field2253) != var4.field2253)) {
                class240.method1471(0L, -24453, 3, false, arg1.field412, class564.field8154, arg1.field465, class52.field844, arg1.field485, true, class255.field3461 + " -> " + arg1.field438);
                class540.field7846++;
            }
        }
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class298.method1772(var5, 15073, arg1);
            if (var9 != null) {
                class240.method1471((long) (var5 + 1), -24453, 1007, false, arg1.field412, class270.method1627(var5, arg1, 93), arg1.field465, var9, arg1.field485, true, arg1.field438);
                class600.field8651++;
            }
        }
        String var6 = class355.method2004((byte) 64, arg1);
        if (var6 != null) {
            class240.method1471(0L, -24453, 19, false, arg1.field412, arg1.field456, arg1.field465, var6, arg1.field485, true, arg1.field438);
            class183.field2237++;
        }
        int var7 = 4;
        if (!arg3) {
            field9106 = null;
        }
        while (var7 >= 0) {
            String var8 = class298.method1772(var7, 15073, arg1);
            if (var8 != null) {
                class600.field8651++;
                class240.method1471((long) (var7 + 1), -24453, 59, false, arg1.field412, class270.method1627(var7, arg1, -43), arg1.field465, var8, arg1.field485, true, arg1.field438);
            }
            var7--;
        }
        if (!client.method1659(arg1).method991(18164)) {
            return;
        }
        if (arg1.field360 == null) {
            class240.method1471(0L, -24453, 11, false, arg1.field412, -1, arg1.field465, class424.field6047.method2561(class370.field4980, 0), arg1.field485, true, "");
        } else {
            class240.method1471(0L, -24453, 11, false, arg1.field412, -1, arg1.field465, arg1.field360, arg1.field485, true, "");
        }
        class430.field6172++;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IBLvc;Lr;Lff;I)Z")
    public static final boolean method3622(int arg0, byte arg1, class289 arg2, class165 arg3, class9 arg4, int arg5) {
        field9100++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg2.field3922 != null) {
            var7 = (arg2.field3901 - (class550.field8004 - arg4.field95)) * (class550.field8001 - class550.field7992) / (class550.field8010 - class550.field8004) + class550.field7992;
            var8 = class550.field8008 - (arg2.field3914 + arg4.field94 - class550.field7997) * (class550.field8008 - class550.field8006) / (class550.field7990 - class550.field7997);
            var9 = class550.field8008 - (arg2.field3893 + arg4.field94 - class550.field7997) * (class550.field8008 - class550.field8006) / (class550.field7990 - class550.field7997);
            var6 = (class550.field8001 - class550.field7992) * (arg2.field3927 + arg4.field95 - class550.field8004) / (class550.field8010 - class550.field8004) + class550.field7992;
        }
        class701 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg2.field3904 != -1) {
            if (arg4.field87 && arg2.field3931 != -1) {
                var10 = arg2.method1715(arg1 ^ 0xFFFFF074, true, arg3);
            } else {
                var10 = arg2.method1715(-4053, false, arg3);
            }
            if (var10 != null) {
                var11 = arg4.field96 - (var10.method896() + 1 >> 1);
                var12 = arg4.field96 + (var10.method896() + 1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                var13 = arg4.field93 - (var10.method901() + 1 >> 1);
                if (var7 < var12) {
                    var7 = var12;
                }
                var14 = arg4.field93 + (var10.method901() + 1 >> 1);
                if (var8 > var13) {
                    var8 = var13;
                }
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class640 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        if (arg1 != 95) {
            method3621(8, null, -64, true);
        }
        int var21 = 0;
        int var22 = 0;
        if (arg2.field3910 != null) {
            var15 = class614.method3525(-32452, arg2.field3913);
            if (var15 != null) {
                var16 = class214.field2729.method550(arg2.field3910, class141.field1768, null, null, (byte) 107);
                int var23 = arg4.field93;
                if (var10 == null) {
                    var17 = var23 - var15.method3645() * var16 / 2;
                } else {
                    var17 = var23 - ((var10.method901() >> 1) + (var15.method3641() * var16));
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class141.field1768[var24];
                    if (var24 < var16 - 1) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method3647(var25);
                    if (var26 > var18) {
                        var18 = var26;
                    }
                }
                var19 = arg4.field96 + arg5 - (var18 / 2);
                var20 = var18 / 2 + arg4.field96 + arg5;
                if (var6 > var19) {
                    var6 = var19;
                }
                if (var20 > var7) {
                    var7 = var20;
                }
                var21 = arg0 + var17;
                var22 = arg0 + var16 * var15.method3641() + var17;
                if (var21 < var8) {
                    var8 = var21;
                }
                if (var22 > var9) {
                    var9 = var22;
                }
            }
        }
        if (class550.field7992 > var7 || class550.field8001 < var6 || class550.field8006 > var9 || class550.field8008 < var8) {
            return true;
        }
        if (arg2.field3922 != null) {
            int[] var27 = new int[arg2.field3922.length];
            for (int var28 = 0; var28 < var27.length / 2; var28++) {
                int var30 = arg2.field3922[var28 * 2] + arg4.field95;
                int var31 = arg2.field3922[var28 * 2 + 1] + arg4.field94;
                var27[var28 * 2] = (var30 - class550.field8004) * (class550.field8001 - class550.field7992) / (class550.field8010 - class550.field8004) + class550.field7992;
                var27[var28 * 2 + 1] = class550.field8008 - ((class550.field8008 - class550.field8006) * (var31 - class550.field7997) / (class550.field7990 - class550.field7997));
            }
            class121.method849(arg3, var27, arg2.field3896);
            for (int var29 = 0; var29 < (var27.length / 2 - 1); var29++) {
                arg3.method1048(arg2.field3890, var27[(var29 + 1) * 2], var27[var29 * 2 + 1], (byte) -86, var27[var29 * 2], var27[var29 * 2 + 3]);
            }
            arg3.method1048(arg2.field3890, var27[0], var27[var27.length - 1], (byte) -118, var27[var27.length - 2], var27[1]);
        }
        if (var10 != null) {
            if (class200.field2421 > 0 && (class523.field7669 != -1 && class523.field7669 == arg4.field90 || class409.field5794 != -1 && class409.field5794 == arg2.field3930)) {
                int var32;
                if (class167.field2045 > 50) {
                    var32 = (100 - class167.field2045) * 2;
                } else {
                    var32 = class167.field2045 * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg3.method1038(arg4.field93, arg4.field96, 1, var10.method902() / 2 + 7, var33);
                arg3.method1038(arg4.field93, arg4.field96, 1, var10.method902() / 2 + 5, var33);
                arg3.method1038(arg4.field93, arg4.field96, 1, var10.method902() / 2 + 3, var33);
                arg3.method1038(arg4.field93, arg4.field96, 1, var10.method902() / 2 + 1, var33);
                arg3.method1038(arg4.field93, arg4.field96, 1, var10.method902() / 2, var33);
            }
            var10.method3924(arg4.field96 - (var10.method896() >> 1), arg4.field93 + -(var10.method901() >> 1));
        }
        if (arg2.field3910 != null && var15 != null) {
            class66.method618(var18, var17, var16, var15, arg4, arg2, -1, arg3);
        }
        if (arg2.field3904 != -1 || arg2.field3910 != null) {
            class307 var34 = new class307(arg4);
            var34.field4078 = var12;
            var34.field4076 = var21;
            var34.field4079 = var14;
            var34.field4071 = var19;
            var34.field4077 = var20;
            var34.field4072 = var13;
            var34.field4074 = var11;
            var34.field4075 = var22;
            class356.field4756.method1129(var34, arg1 + 262049);
        }
        return false;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static final void method3623(int arg0) {
        field9104++;
        class78.method655(2, 22050, 8000, class221.field2851.field4138);
        class600.field8656 = class567.method3322(class517.field7570, 22050, -1024, 0, class646.field9190);
        class346.method1980((byte) -125, true, class553.method3243(null, (byte) 6));
        if (arg0 < 22) {
            field9107 = null;
        }
        class247.field3389 = class567.method3322(class517.field7570, 2048, -1024, 1, class646.field9190);
        class399.field5624 = new class304();
        class247.field3389.method1490(class399.field5624, 0);
        class678.field9726 = new class538(22050, class73.field1105);
        class631.field9082 = class275.field3764.method3804((byte) 102, "scape main");
        class331.method1920(-1);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V")
    public static void method3624(boolean arg0) {
        field9106 = null;
        field9107 = null;
        field9099 = null;
        if (arg0) {
            field9108 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILr;III)V")
    public static final void method3625(int arg0, int arg1, class165 arg2, int arg3, int arg4, int arg5) {
        arg2.method292(arg4, arg5, arg3 + arg4, arg1 + arg5);
        field9105++;
        arg2.method1042(arg4, arg3, arg0 + 13227, arg5, -16777216, arg1);
        if (class411.field5847 < 100) {
            return;
        }
        float var6 = (float) class550.field7995 / (float) class550.field8003;
        int var7 = arg3;
        int var8 = arg1;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg3 * var6);
        } else {
            var7 = (int) ((float) arg1 / var6);
        }
        int var9 = (arg1 - var8) / 2 + arg5;
        int var10 = (arg3 - var7) / 2 + arg4;
        if (class311.field4111 == null || arg3 != class311.field4111.method902() || arg1 != class311.field4111.method900()) {
            class550.method3224(class550.field8007, class550.field8009 + class550.field7995, class550.field8007 + class550.field8003, class550.field8009, var10, var9, var7 + var10, var8 + var9);
            class550.method3230(arg2);
            class311.field4111 = arg2.method231(var10, var9, var7, var8, false);
        }
        class311.field4111.method3924(var10, var9);
        if (arg0 != -13226) {
            method3622(19, (byte) 117, null, null, null, 11);
        }
        int var11 = class620.field8887 * var7 / class550.field8003;
        int var12 = class653.field9276 * var8 / class550.field7995;
        int var13 = class353.field4719 * var7 / class550.field8003 + var10;
        int var14 = var8 + var9 - (class469.field6558 * var8 / class550.field7995) - var12;
        int var15 = -1996554240;
        if (class588.field8518 == class356.field4753) {
            var15 = -1996488705;
        }
        arg2.method248(var13, var14, var11, var12, var15, 1);
        arg2.method278(var13, var14, var11, var12, var15, 0);
        if (class200.field2421 <= 0) {
            return;
        }
        int var16;
        if (class167.field2045 > 50) {
            var16 = 500 - (class167.field2045 * 5);
        } else {
            var16 = class167.field2045 * 5;
        }
        for (class9 var17 = (class9) class550.field7987.method1132((byte) 101); var17 != null; var17 = (class9) class550.field7987.method1134(8446)) {
            class289 var18 = class550.field7973.method3816(arg0 ^ 0x33F6, var17.field90);
            if (class704.method3945(var18, arg0 ^ 0x6572)) {
                if (class523.field7669 == var17.field90) {
                    int var19 = var17.field95 * var7 / class550.field8003 + var10;
                    int var20 = var9 + ((class550.field7995 - var17.field94) * var8 / class550.field7995);
                    arg2.method1042(var19 - 2, 4, 1, var20 - 2, var16 << 24 | 0xFFFF00, 4);
                } else if (class409.field5794 != -1 && class409.field5794 == var18.field3930) {
                    int var21 = var17.field95 * var7 / class550.field8003 + var10;
                    int var22 = (class550.field7995 - var17.field94) * var8 / class550.field7995 + var9;
                    arg2.method1042(var21 - 2, 4, 1, var22 - 2, var16 << 24 | 0xFFFF00, 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZZILjava/lang/String;)V")
    public static final void method3626(boolean arg0, boolean arg1, int arg2, String arg3) {
        field9103++;
        int var4 = -65 / (arg2 / 47);
        try {
            label704: {
                if (!arg3.equalsIgnoreCase("commands") && !arg3.equalsIgnoreCase("help")) {
                    if (arg3.equalsIgnoreCase("cls")) {
                        class567.field8285 = 0;
                        class405.field5743 = 0;
                        return;
                    }
                    if (arg3.equalsIgnoreCase("displayfps")) {
                        class564.field8151 = !class564.field8151;
                        if (!class564.field8151) {
                            class79.method660((byte) -96, "FPS off");
                            return;
                        }
                        class79.method660((byte) -81, "FPS on");
                        return;
                    }
                    if (!arg3.equals("renderer")) {
                        if (arg3.equals("heap")) {
                            class79.method660((byte) -63, "Heap: " + class590.field8558 + "MB");
                            return;
                        }
                        break label704;
                    }
                    class191 var5 = class68.field1045.method314();
                    class79.method660((byte) 127, "Vendor: " + var5.field2327);
                    class79.method660((byte) 66, "Name: " + var5.field2334);
                    class79.method660((byte) 117, "Version: " + var5.field2326);
                    class79.method660((byte) -100, "Device: " + var5.field2330);
                    class79.method660((byte) -79, "Driver Version: " + var5.field2333);
                    return;
                }
                class79.method660((byte) 66, "commands - This command");
                class79.method660((byte) 93, "cls - Clear console");
                class79.method660((byte) 43, "displayfps - Toggle FPS and other information");
                class79.method660((byte) 92, "renderer - Print graphics renderer information");
                class79.method660((byte) 83, "heap - Print java memory information");
                return;
            }
        } catch (Exception var43) {
            class79.method660((byte) -113, class424.field6040.method2561(class370.field4980, 0));
            return;
        }
        if (class39.field729 != class215.field2737 || class37.field698 >= 2) {
            if (arg3.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg3.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg3.equalsIgnoreCase("printfps")) {
                    class79.method660((byte) -94, "FPS: " + class307.field4073);
                    return;
                }
                if (arg3.equalsIgnoreCase("occlude")) {
                    class186.field2276 = !class186.field2276;
                    if (class186.field2276) {
                        class79.method660((byte) 49, "Occlsion now on!");
                        return;
                    }
                    class79.method660((byte) 64, "Occlsion now off!");
                    return;
                }
                if (arg3.equalsIgnoreCase("fpson")) {
                    class564.field8151 = true;
                    class79.method660((byte) 66, "fps debug enabled");
                    return;
                }
                if (arg3.equalsIgnoreCase("fpsoff")) {
                    class564.field8151 = false;
                    class79.method660((byte) -78, "fps debug disabled");
                    return;
                }
                if (arg3.equals("systemmem")) {
                    try {
                        class79.method660((byte) -76, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
                        return;
                    } catch (Throwable var37) {
                        return;
                    }
                }
                if (arg3.equalsIgnoreCase("cleartext")) {
                    class74.field1107.method2072((byte) 124);
                    class79.method660((byte) 127, "Text coords cleared");
                    return;
                }
                if (arg3.equalsIgnoreCase("gc")) {
                    class567.method3321((byte) -66);
                    for (int var6 = 0; var6 < 10; var6++) {
                        System.gc();
                    }
                    Runtime var7 = Runtime.getRuntime();
                    int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class79.method660((byte) -73, "mem=" + var8 + "k");
                    return;
                }
                if (arg3.equalsIgnoreCase("compact")) {
                    class567.method3321((byte) -101);
                    for (int var9 = 0; var9 < 10; var9++) {
                        System.gc();
                    }
                    Runtime var10 = Runtime.getRuntime();
                    int var11 = (int) ((var10.totalMemory() - var10.freeMemory()) / 1024L);
                    class79.method660((byte) -99, "Memory before cleanup=" + var11 + "k");
                    class180.method1120(128);
                    class567.method3321((byte) -65);
                    for (int var12 = 0; var12 < 10; var12++) {
                        System.gc();
                    }
                    int var13 = (int) ((var10.totalMemory() - var10.freeMemory()) / 1024L);
                    class79.method660((byte) -87, "Memory after cleanup=" + var13 + "k");
                    return;
                }
                if (arg3.equalsIgnoreCase("unloadnatives")) {
                    class79.method660((byte) -74, class690.method3899((byte) -32) ? "Libraries unloaded" : "Library unloading failed!");
                    return;
                }
                if (arg3.equalsIgnoreCase("clientdrop")) {
                    class79.method660((byte) -92, "Dropped client connection");
                    if (class114.field1485 == 10) {
                        class589.method3415((byte) 73);
                    } else if (class114.field1485 == 11) {
                        class52.field847 = true;
                        return;
                    }
                    return;
                }
                if (arg3.equalsIgnoreCase("rotateconnectmethods")) {
                    class281.field3813.method1944(0);
                    class79.method660((byte) 61, "Rotated connection methods");
                    return;
                }
                if (arg3.equalsIgnoreCase("clientjs5drop")) {
                    class33.field673.method962(-90);
                    class79.method660((byte) 77, "Dropped client js5 net queue");
                    return;
                }
                if (arg3.equalsIgnoreCase("serverjs5drop")) {
                    class33.field673.method968((byte) -29);
                    class79.method660((byte) 50, "Dropped server js5 net queue");
                    return;
                }
                if (arg3.equalsIgnoreCase("breakcon")) {
                    class517.field7570.method1507((byte) -31);
                    class489.field6835.method1852(-1);
                    class33.field673.method961(0);
                    class79.method660((byte) -109, "Breaking new connections for 5 seconds");
                    return;
                }
                if (arg3.equalsIgnoreCase("rebuild")) {
                    class479.method2811((byte) -101);
                    class338.method1955(43);
                    class79.method660((byte) -127, "Rebuilding map");
                    return;
                }
                if (arg3.equalsIgnoreCase("rebuildprofile")) {
                    class161.field1985 = class301.method1787((byte) 104);
                    class649.field9205 = true;
                    class479.method2811((byte) 127);
                    class338.method1955(43);
                    class79.method660((byte) -122, "Rebuilding map (with profiling)");
                    return;
                }
                if (arg3.equalsIgnoreCase("wm1")) {
                    class14.method153(-1, 1, false, -1, (byte) 80);
                    if (class158.method996(3) == 1) {
                        class79.method660((byte) 76, "wm1 succeeded");
                        return;
                    }
                    class79.method660((byte) 92, "wm1 failed");
                    return;
                }
                if (arg3.equalsIgnoreCase("wm2")) {
                    class14.method153(-1, 2, false, -1, (byte) 95);
                    if (class158.method996(3) != 2) {
                        class79.method660((byte) 104, "wm2 failed");
                        return;
                    }
                    class79.method660((byte) 100, "wm2 succeeded");
                    return;
                }
                if (arg3.equalsIgnoreCase("wm3")) {
                    class14.method153(1024, 3, false, 768, (byte) 109);
                    if (class158.method996(3) != 3) {
                        class79.method660((byte) 117, "wm3 failed");
                        return;
                    }
                    class79.method660((byte) -122, "wm3 succeeded");
                    return;
                }
                if (arg3.equalsIgnoreCase("tk0")) {
                    class435.method2608(54, 0);
                    if (class375.field5039 != 0) {
                        class79.method660((byte) -82, "Failed to enter tk0");
                        return;
                    }
                    class79.method660((byte) -108, "Entered tk0");
                    class221.field2851.field4154 = 0;
                    class221.field2851.method1742(class517.field7570, -1);
                    class553.field8029 = false;
                    return;
                }
                if (arg3.equalsIgnoreCase("tk1")) {
                    class435.method2608(34, 1);
                    if (class375.field5039 == 1) {
                        class79.method660((byte) -94, "Entered tk1");
                        class221.field2851.field4154 = 1;
                        class221.field2851.method1742(class517.field7570, -1);
                        class553.field8029 = false;
                        return;
                    }
                    class79.method660((byte) -107, "Failed to enter tk1");
                    return;
                }
                if (arg3.equalsIgnoreCase("tk2")) {
                    class435.method2608(-105, 2);
                    if (class375.field5039 == 2) {
                        class79.method660((byte) -115, "Entered tk2");
                        class221.field2851.field4154 = 2;
                        class221.field2851.method1742(class517.field7570, -1);
                        class553.field8029 = false;
                        return;
                    }
                    class79.method660((byte) 72, "Failed to enter tk2");
                    return;
                }
                if (arg3.equalsIgnoreCase("tk3")) {
                    class435.method2608(-126, 3);
                    if (class375.field5039 == 3) {
                        class79.method660((byte) -119, "Entered tk3");
                        class221.field2851.field4154 = 3;
                        class221.field2851.method1742(class517.field7570, -1);
                        class553.field8029 = false;
                        return;
                    }
                    class79.method660((byte) -122, "Failed to enter tk3");
                    return;
                }
                if (arg3.equalsIgnoreCase("tk5")) {
                    class435.method2608(-120, 5);
                    if (class375.field5039 != 5) {
                        class79.method660((byte) -101, "Failed to enter tk5");
                        return;
                    }
                    class79.method660((byte) 91, "Entered tk5");
                    class221.field2851.field4154 = 5;
                    class221.field2851.method1742(class517.field7570, -1);
                    class553.field8029 = false;
                    return;
                }
                if (arg3.equalsIgnoreCase("ot")) {
                    class221.field2851.field4135 = !class221.field2851.field4135;
                    class221.field2851.method1742(class517.field7570, -1);
                    class553.field8029 = false;
                    class479.method2811((byte) -93);
                    class79.method660((byte) 43, "ot=" + class221.field2851.field4135);
                    return;
                }
                if (arg3.equalsIgnoreCase("gb")) {
                    class221.field2851.field4161 = !class221.field2851.field4161;
                    class221.field2851.method1742(class517.field7570, -1);
                    class553.field8029 = false;
                    class479.method2811((byte) 2);
                    class79.method660((byte) -109, "gb=" + class221.field2851.field4161);
                    return;
                }
                if (arg3.startsWith("shadows")) {
                    if (arg3.length() < 8) {
                        class79.method660((byte) -127, "Invalid shadows value");
                        return;
                    }
                    String var14 = arg3.substring(8);
                    int var15 = class529.method3110((byte) 40, var14) ? class79.method663(10, var14) : -1;
                    if (var15 >= 0 && var15 <= 2) {
                        class221.field2851.method1842(var15, class375.field5039, 0);
                        class221.field2851.method1742(class517.field7570, -1);
                        class553.field8029 = false;
                        class479.method2811((byte) -101);
                        class79.method660((byte) 120, "shadows=" + var15);
                        return;
                    }
                    class79.method660((byte) -117, "Invalid shadows value");
                    return;
                }
                if (arg3.startsWith("textures")) {
                    class221.field2851.field4142 = !class221.field2851.field4142;
                    class221.field2851.method1742(class517.field7570, -1);
                    class553.field8029 = false;
                    class231.method1399(97693160);
                    class479.method2811((byte) 126);
                    class79.method660((byte) 101, "textures=" + class221.field2851.field4142);
                    return;
                }
                if (arg3.startsWith("lighting")) {
                    class221.field2851.method1847((byte) 69, !class221.field2851.method1841(class375.field5039, 3), class375.field5039);
                    class221.field2851.method1742(class517.field7570, -1);
                    class553.field8029 = false;
                    class221.method1337(4);
                    class231.method1399(97693160);
                    class479.method2811((byte) -82);
                    class79.method660((byte) -94, "lighting=" + class221.field2851.method1841(class375.field5039, 3));
                    return;
                }
                if (arg3.startsWith("setba")) {
                    if (arg3.length() < 6) {
                        class79.method660((byte) 121, "Invalid buildarea value");
                        return;
                    }
                    int var16 = class79.method663(10, arg3.substring(6));
                    if (var16 >= 0 && var16 <= class467.method2739(class590.field8558, (byte) 126)) {
                        class221.field2851.field4172 = var16;
                        class221.field2851.method1742(class517.field7570, -1);
                        class553.field8029 = false;
                        class79.method660((byte) -99, "maxbuildarea=" + class221.field2851.field4172);
                        return;
                    }
                    class79.method660((byte) -99, "Invalid buildarea value");
                    return;
                }
                if (arg3.startsWith("rect_debug")) {
                    if (arg3.length() < 10) {
                        class79.method660((byte) 46, "Invalid rect_debug value");
                        return;
                    }
                    class149.field1835 = class79.method663(10, arg3.substring(10).trim());
                    class79.method660((byte) -103, "rect_debug=" + class149.field1835);
                    return;
                }
                if (arg3.equalsIgnoreCase("qa_op_test")) {
                    class679.field9734 = true;
                    class79.method660((byte) -98, "qa_op_test=" + class679.field9734);
                    return;
                }
                if (arg3.equalsIgnoreCase("clipcomponents")) {
                    class200.field2420 = !class200.field2420;
                    class79.method660((byte) -71, "clipcomponents=" + class200.field2420);
                    return;
                }
                if (arg3.startsWith("bloom")) {
                    boolean var17 = class68.field1045.method237();
                    if (class334.method1933((byte) -118, !var17)) {
                        if (var17) {
                            class79.method660((byte) -84, "Bloom disabled");
                            return;
                        }
                        class79.method660((byte) 65, "Bloom enabled");
                        return;
                    }
                    class79.method660((byte) 66, "Failed to enable bloom");
                    return;
                }
                if (arg3.equalsIgnoreCase("tween")) {
                    if (!class331.field4406) {
                        class331.field4406 = true;
                        class79.method660((byte) -60, "Forced tweening ENABLED!");
                        return;
                    }
                    class331.field4406 = false;
                    class79.method660((byte) 85, "Forced tweening disabled.");
                    return;
                }
                if (arg3.equalsIgnoreCase("shiftclick")) {
                    if (class189.field2310) {
                        class79.method660((byte) 114, "Shift-click disabled.");
                        class189.field2310 = false;
                        return;
                    }
                    class79.method660((byte) -101, "Shift-click ENABLED!");
                    class189.field2310 = true;
                    return;
                }
                if (arg3.equalsIgnoreCase("getcgcoord")) {
                    class79.method660((byte) 118, "x:" + (class206.field2472.field530 >> 9) + " z:" + (class206.field2472.field531 >> 9));
                    return;
                }
                if (arg3.equalsIgnoreCase("getheight")) {
                    class79.method660((byte) -124, "Height: " + class155.field1899[class206.field2472.field532].method437(115, class206.field2472.field531 >> 9, class206.field2472.field530 >> 9));
                    return;
                }
                if (arg3.equalsIgnoreCase("resetminimap")) {
                    class692.field9847.method3780(0);
                    class692.field9847.method3785((byte) 108);
                    class308.field4085.method564((byte) -56);
                    class455.field6408.method3818(-23182);
                    class338.method1955(43);
                    class79.method660((byte) 126, "Minimap reset");
                    return;
                }
                if (arg3.startsWith("mc")) {
                    if (class68.field1045.method211()) {
                        int var18 = Integer.parseInt(arg3.substring(3));
                        if (var18 < 1) {
                            var18 = 1;
                        } else if (var18 > 4) {
                            var18 = 4;
                        }
                        class386.field5142 = var18;
                        class479.method2811((byte) 126);
                        class79.method660((byte) -84, "Render cores now: " + class386.field5142);
                        return;
                    }
                    class79.method660((byte) 99, "Current toolkit doesn't support multiple cores");
                    return;
                }
                if (arg3.startsWith("cachespace")) {
                    class79.method660((byte) 122, "I(s): " + class440.field6293.method2769((byte) 50) + "/" + class440.field6293.method2773((byte) 96));
                    class79.method660((byte) -75, "I(m): " + class310.field4100.method2769((byte) 63) + "/" + class310.field4100.method2773((byte) 96));
                    class79.method660((byte) 112, "O(s): " + class65.field1021.field318.method3491((byte) -3) + "/" + class65.field1021.field318.method3494((byte) -22));
                    return;
                }
                if (arg3.equalsIgnoreCase("getcamerapos")) {
                    class79.method660((byte) -64, "Pos: " + class206.field2472.field532 + "," + ((class346.field4550 >> 9) + class36.field689 >> 6) + "," + ((class627.field8995 >> 9) + class88.field1239 >> 6) + "," + ((class346.field4550 >> 9) + class36.field689 & 0x3F) + "," + ((class627.field8995 >> 9) + class88.field1239 & 0x3F) + " Height: " + (class589.method3416(class346.field4550, -114, class206.field2472.field532, class627.field8995) - class614.field8846));
                    class79.method660((byte) 65, "Look: " + class206.field2472.field532 + "," + (class175.field2160 + class36.field689 >> 6) + "," + (class88.field1239 + class224.field2914 >> 6) + "," + (class36.field689 + class175.field2160 & 0x3F) + "," + (class88.field1239 + class224.field2914 & 0x3F) + " Height: " + (class589.method3416(class175.field2160, -54, class206.field2472.field532, class224.field2914) - class417.field5911));
                    return;
                }
                if (arg3.equals("renderprofile") || arg3.equals("rp")) {
                    class150.field1861 = !class150.field1861;
                    class68.field1045.method296(class150.field1861);
                    class493.method2868((byte) 120);
                    class79.method660((byte) -107, "showprofiling=" + class150.field1861);
                    return;
                }
                if (arg3.startsWith("performancetest")) {
                    int var19 = -1;
                    int var20 = 1000;
                    if (arg3.length() > 15) {
                        String[] var21 = class72.method637(' ', false, arg3);
                        try {
                            if (var21.length > 1) {
                                var20 = Integer.parseInt(var21[1]);
                            }
                        } catch (Throwable var39) {
                        }
                        try {
                            if (var21.length > 2) {
                                var19 = Integer.parseInt(var21[2]);
                            }
                        } catch (Throwable var38) {
                        }
                    }
                    if (var19 == -1) {
                        class79.method660((byte) -121, "Java toolkit: " + class454.method2693(var20, 0, (byte) 104));
                        class79.method660((byte) 53, "SSE toolkit:  " + class454.method2693(var20, 2, (byte) 106));
                        class79.method660((byte) -96, "D3D toolkit:  " + class454.method2693(var20, 3, (byte) 110));
                        class79.method660((byte) -115, "GL toolkit:   " + class454.method2693(var20, 1, (byte) 87));
                        class79.method660((byte) 105, "GLX toolkit:  " + class454.method2693(var20, 5, (byte) 103));
                        return;
                    }
                    class79.method660((byte) 51, "Performance: " + class454.method2693(var20, class375.field5039, (byte) 119));
                    return;
                }
                if (arg3.equals("nonpcs")) {
                    class689.field9830 = !class689.field9830;
                    class79.method660((byte) 87, "nonpcs=" + class689.field9830);
                    return;
                }
                if (arg3.equals("autoworld")) {
                    class614.method3524(0);
                    class79.method660((byte) 116, "auto world selected");
                    return;
                }
                if (arg3.startsWith("switchworld")) {
                    int var22 = Integer.parseInt(arg3.substring(12));
                    class426.method2565(var22, true, class452.method2676(var22, true).field5703);
                    class79.method660((byte) 104, "switched");
                    return;
                }
                if (arg3.equals("getworld")) {
                    class79.method660((byte) 114, "w: " + class281.field3813.field4476);
                    return;
                }
                if (arg3.startsWith("pc")) {
                    class543 var23 = class299.method1780(class84.field1196, class204.field2449, 101);
                    var23.field7872.method2281((byte) 58, 0);
                    int var24 = var23.field7872.field5195;
                    int var25 = arg3.indexOf(" ", 4);
                    var23.field7872.method2269(arg3.substring(3, var25), -49);
                    class457.method2714(true, var23.field7872, arg3.substring(var25));
                    var23.field7872.method2265(var23.field7872.field5195 - var24, (byte) 55);
                    class511.method3028(7482, var23);
                    return;
                }
                if (arg3.equals("savevarcs")) {
                    class651.method3664((byte) -119);
                    class79.method660((byte) 85, "perm varcs saved");
                    return;
                }
                if (arg3.equals("scramblevarcs")) {
                    for (int var26 = 0; var26 < class415.field5874.length; var26++) {
                        if (class25.field591[var26]) {
                            class415.field5874[var26] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class415.field5874[var26] *= -1;
                            }
                        }
                    }
                    class651.method3664((byte) -115);
                    class79.method660((byte) 94, "perm varcs scrambled");
                    return;
                }
                if (arg3.equals("showcolmap")) {
                    class115.field1493 = true;
                    class338.method1955(43);
                    class79.method660((byte) 123, "colmap is shown");
                    return;
                }
                if (arg3.equals("hidecolmap")) {
                    class115.field1493 = false;
                    class338.method1955(43);
                    class79.method660((byte) 65, "colmap is hidden");
                    return;
                }
                if (arg3.equals("resetcache")) {
                    class354.method2000(0);
                    class79.method660((byte) 123, "Caches reset");
                    return;
                }
                if (arg3.equals("profilecpu")) {
                    class79.method660((byte) -100, class200.method1217(124) + "ms");
                    return;
                }
                if (arg3.startsWith("getclientvarpbit")) {
                    int var27 = Integer.parseInt(arg3.substring(17));
                    class79.method660((byte) 111, "varpbit=" + class410.field5804.method732(115, var27));
                    return;
                }
                if (arg3.startsWith("getclientvarp")) {
                    int var28 = Integer.parseInt(arg3.substring(14));
                    class79.method660((byte) -92, "varp=" + class410.field5804.method731(var28, (byte) 103));
                    return;
                }
                if (arg3.startsWith("demologin")) {
                    class378.method2197(88, false, 0);
                    return;
                }
                if (arg3.startsWith("newdemologin")) {
                    class378.method2197(93, true, 0);
                    return;
                }
                if (arg3.startsWith("directlogin")) {
                    String[] var29 = class72.method637(' ', false, arg3.substring(12));
                    if (var29.length >= 2) {
                        int var30 = var29.length <= 2 ? 0 : Integer.parseInt(var29[2]);
                        class45.method530((byte) -123, var29[0], var30, var29[1]);
                        return;
                    }
                }
                if (arg3.startsWith("csprofileclear")) {
                    class545.method3202();
                    return;
                }
                if (arg3.startsWith("csprofileoutputc")) {
                    class545.method3205(100, false);
                    return;
                }
                if (arg3.startsWith("csprofileoutputt")) {
                    class545.method3205(10, true);
                    return;
                }
                if (arg3.startsWith("texsize")) {
                    int var31 = Integer.parseInt(arg3.substring(8));
                    class68.field1045.method230(var31);
                    return;
                }
                if (arg3.equals("soundstreamcount")) {
                    class79.method660((byte) 53, "Active streams: " + class399.field5624.method1806());
                    return;
                }
                if (arg3.equals("autosetup")) {
                    class221.field2851.method1756((byte) 125);
                    class79.method660((byte) 100, "Complete. Toolkit now: " + class375.field5039);
                    return;
                }
                if (arg3.equals("errormessage")) {
                    class79.method660((byte) -122, class683.field9762.method1657(true));
                    return;
                }
                if (arg3.equals("heapdump")) {
                    if (class248.field3420.startsWith("win")) {
                        class620.method3546(false, -46, new File("C:\\Temp\\heap.dump"));
                    } else {
                        class620.method3546(false, -29, new File("/tmp/heap.dump"));
                    }
                    class79.method660((byte) 120, "Done");
                    return;
                }
                if (arg3.equals("os")) {
                    class79.method660((byte) -92, "Name: " + class248.field3420);
                    class79.method660((byte) -78, "Arch: " + class248.field3403);
                    class79.method660((byte) -79, "Ver: " + class248.field3410);
                    return;
                }
                if (arg3.equals("w2debug")) {
                    class62.field1008 = !class62.field1008;
                    class479.method2811((byte) 126);
                    class79.method660((byte) -102, "Toggled!");
                    return;
                }
                if (arg3.startsWith("setoutput ")) {
                    File var32 = new File(arg3.substring(10));
                    if (var32.exists()) {
                        var32 = new File(arg3.substring(10) + "." + class301.method1787((byte) -82) + ".log");
                        if (var32.exists()) {
                            class79.method660((byte) 66, "file already exists!");
                            return;
                        }
                    }
                    if (class26.field602 != null) {
                        class26.field602.close();
                        class26.field602 = null;
                    }
                    try {
                        class26.field602 = new FileOutputStream(var32);
                        return;
                    } catch (FileNotFoundException var40) {
                        class79.method660((byte) -67, "Could not create " + var32.getName());
                        return;
                    } catch (SecurityException var41) {
                        class79.method660((byte) -123, "Cannot write to " + var32.getName());
                        return;
                    }
                }
                if (arg3.equals("closeoutput")) {
                    if (class26.field602 != null) {
                        class26.field602.close();
                    }
                    class26.field602 = null;
                    return;
                }
                if (arg3.startsWith("runscript ")) {
                    File var33 = new File(arg3.substring(10));
                    if (!var33.exists()) {
                        class79.method660((byte) -97, "No such file");
                        return;
                    }
                    byte[] var34 = class372.method2165(var33, false);
                    if (var34 == null) {
                        class79.method660((byte) -117, "Failed to read file");
                        return;
                    }
                    String[] var35 = class72.method637('\n', false, class234.method1425("", class421.method2540(27895, var34), '\r', -1));
                    class404.method2433(var35, (byte) 99);
                    return;
                }
                if (class114.field1485 == 10) {
                    class496.field6914++;
                    class543 var36 = class299.method1780(class84.field1196, class280.field3804, 41);
                    var36.field7872.method2281((byte) 58, arg3.length() + 3);
                    var36.field7872.method2281((byte) 58, arg0 ? 1 : 0);
                    var36.field7872.method2281((byte) 58, arg1 ? 1 : 0);
                    var36.field7872.method2269(arg3, -45);
                    class511.method3028(7482, var36);
                }
                if (arg3.startsWith("fps ") && class39.field729 != class215.field2737) {
                    class526.method3103((byte) -122, class79.method663(10, arg3.substring(4)));
                    return;
                }
            } catch (Exception var42) {
                class79.method660((byte) 78, class424.field6040.method2561(class370.field4980, 0));
                return;
            }
        }
        if (class114.field1485 != 10) {
            class79.method660((byte) 118, class424.field6041.method2561(class370.field4980, 0) + arg3);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3627(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
