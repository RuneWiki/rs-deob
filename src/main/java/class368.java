import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class368 {

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "J")
    public static long field5047 = 0L;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field5051 = -2;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "[I")
    public static int[] field5053 = new int[2];

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "[Lmb;")
    public static class260[] field5052;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V", line = 16)
    public static final void method2294(byte arg0) {
        class410 var1 = class348.field4722;
        synchronized (class348.field4722) {
            class348.field4722.method2533(0);
        }
        field5046++;
        class410 var2 = class167.field2487;
        synchronized (class167.field2487) {
            class167.field2487.method2533(0);
            if (arg0 > -87) {
                field5051 = 121;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIIBIIIII)V", line = 50)
    public static final void method2295(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field5055++;
        class307 var13 = new class307();
        var13.field4156 = arg6;
        var13.field4161 = arg3;
        var13.field4153 = arg10;
        if (arg7 >= -122) {
            method2297(false, (String) null, (byte) -62);
        }
        var13.field4168 = arg2;
        var13.field4152 = arg0;
        var13.field4164 = arg9;
        var13.field4162 = arg4;
        var13.field4160 = arg11;
        var13.field4167 = arg5;
        var13.field4159 = arg1;
        var13.field4157 = arg8;
        var13.field4154 = arg12;
        class155.field2351.method1249(var13, (byte) -110);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V", line = 75)
    public static void method2296(byte arg0) {
        if (arg0 < 72) {
            method2297(true, (String) null, (byte) 121);
        }
        field5053 = null;
        field5052 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZLjava/lang/String;B)V", line = 86)
    public static final void method2297(boolean arg0, String arg1, byte arg2) {
        field5049++;
        if (arg2 != 58) {
            field5054 = -20;
        }
        if (class445.field6400 == 0 && class447.field6482 < 2) {
            return;
        }
        try {
            if (arg1.equalsIgnoreCase("fpson")) {
                class361.field4911 = true;
            }
            if (arg1.equalsIgnoreCase("fpsoff")) {
                class361.field4911 = false;
            }
            if (arg1.equalsIgnoreCase("cleartext")) {
                class121.field1698.method894(102);
            }
            if (arg1.equalsIgnoreCase("gc")) {
                class447.method2779(true);
                for (int var3 = 0; var3 < 10; var3++) {
                    System.gc();
                }
                Runtime var4 = Runtime.getRuntime();
                int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
                class285.method1796(-11011, "mem=" + var5 + "k");
            }
            if (arg1.equalsIgnoreCase("compact")) {
                class447.method2779(true);
                for (int var6 = 0; var6 < 10; var6++) {
                    System.gc();
                }
                Runtime var7 = Runtime.getRuntime();
                int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class285.method1796(-11011, "Memory before cleanup=" + var8 + "k");
                class149.method1144((byte) 63);
                class447.method2779(true);
                for (int var9 = 0; var9 < 10; var9++) {
                    System.gc();
                }
                int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class285.method1796(arg2 - 11069, "Memory after cleanup=" + var10 + "k");
            }
            if (arg1.equalsIgnoreCase("pcachesize")) {
                class285.method1796(-11011, "Number of player models in cache:" + class42.method402(arg2 - 8));
            }
            if (arg1.equalsIgnoreCase("clientdrop")) {
                class218.method1491(false);
            }
            if (arg1.equalsIgnoreCase("clientjs5drop")) {
                class118.field1650.method2759(arg2 + 59);
            }
            if (arg1.equalsIgnoreCase("serverjs5drop")) {
                class118.field1650.method2766((byte) -127);
            }
            if (arg1.equalsIgnoreCase("breakcon")) {
                class30.field502.method1954((byte) 84);
                class105.field1540.method2741(5000);
                class118.field1650.method2757(0);
            }
            if (arg1.equalsIgnoreCase("rebuild")) {
                class415.method2570((byte) 68);
                class69.method596(105);
            }
            if (arg1.equalsIgnoreCase("wm1")) {
                class81.method743((byte) -126, false, -1, 1, -1);
            }
            if (arg1.equalsIgnoreCase("wm2")) {
                class81.method743((byte) -106, false, -1, 2, -1);
            }
            if (arg1.equalsIgnoreCase("::wm3")) {
                class81.method743((byte) -116, false, 768, 3, 1024);
            }
            if (arg1.equalsIgnoreCase("tk0")) {
                class447.method2785(0, (byte) 109);
                class447.field6440 = 0;
                class447.method2786((byte) 102, class30.field502);
                class338.field4600 = false;
            }
            if (arg1.equalsIgnoreCase("tk1")) {
                class447.method2785(1, (byte) 109);
                class447.field6440 = 1;
                class447.method2786((byte) 124, class30.field502);
                class338.field4600 = false;
            }
            if (arg1.equalsIgnoreCase("tk2")) {
                class447.method2785(2, (byte) 109);
                class447.field6440 = 2;
                class447.method2786((byte) 72, class30.field502);
                class338.field4600 = false;
            }
            if (arg1.equalsIgnoreCase("tk3")) {
                class447.method2785(3, (byte) 109);
            }
            if (arg1.equalsIgnoreCase("ot")) {
                class441.field6352 = !class441.field6352;
                class447.method2786((byte) 101, class30.field502);
                class338.field4600 = false;
                class415.method2570((byte) -50);
            }
            if (arg1.equalsIgnoreCase("gb")) {
                class26.field467 = !class26.field467;
                class447.method2786((byte) 92, class30.field502);
                class338.field4600 = false;
                class415.method2570((byte) 87);
            }
            if (arg1.startsWith("shadows ")) {
                class179.field2633 = class362.method2277(arg1.substring(8), -11);
                class447.method2786((byte) 94, class30.field502);
                class338.field4600 = false;
                class415.method2570((byte) 104);
            }
            if (arg1.startsWith("setba")) {
                class41.field630 = class362.method2277(arg1.substring(6), -54);
                class447.method2786((byte) 119, class30.field502);
                class338.field4600 = false;
            }
            if (arg1.startsWith("setparticles")) {
                class161.method1208(class362.method2277(arg1.substring(13), arg2 - 174), 0);
                class447.method2786((byte) 117, class30.field502);
                class338.field4600 = false;
            }
            if (arg1.startsWith("fps ") && class445.field6400 != 0) {
                class297.method1912(1000, class362.method2277(arg1.substring(4), -26));
            }
            if (arg1.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg1.startsWith("rect_debug")) {
                class90.field1340 = class362.method2277(arg1.substring(10).trim(), -13);
                class285.method1796(-11011, "rect_debug=" + class90.field1340);
            }
            if (arg1.equalsIgnoreCase("qa_op_test")) {
                class339.field4624 = true;
            }
            if (arg1.equalsIgnoreCase("clipcomponents")) {
                class175.field2586 = !class175.field2586;
                class285.method1796(-11011, "clipcomponents=" + class175.field2586);
            }
            if (arg1.startsWith("bloom")) {
                boolean var11 = class249.field3415.method250();
                if (!class170.method1278(!var11, (byte) 13)) {
                    class285.method1796(-11011, "Failed to enable bloom");
                } else if (var11) {
                    class285.method1796(arg2 - 11069, "Bloom disabled");
                } else {
                    class285.method1796(-11011, "Bloom enabled");
                }
            }
            if (arg1.equalsIgnoreCase("tween")) {
                if (class258.field3486) {
                    class258.field3486 = false;
                    class285.method1796(-11011, "Forced tweening disabled.");
                } else {
                    class258.field3486 = true;
                    class285.method1796(arg2 - 11069, "Forced tweening ENABLED!");
                }
            }
            if (arg1.equalsIgnoreCase("shiftclick")) {
                if (class199.field2834) {
                    class285.method1796(-11011, "Shift-click disabled.");
                    class199.field2834 = false;
                } else {
                    class285.method1796(-11011, "Shift-click ENABLED!");
                    class199.field2834 = true;
                }
            }
            if (arg1.equalsIgnoreCase("getcgcoord")) {
                class285.method1796(arg2 ^ 0xFFFFD4C7, "x:" + (class95.field1379.field3176 >> 7) + " z:" + (class95.field1379.field3167 >> 7));
            }
            if (arg1.equalsIgnoreCase("getheight")) {
                class285.method1796(-11011, "Height: " + class91.field1351[class69.field1046].method1509(class95.field1379.field3176 >> 7, class95.field1379.field3167 >> 7));
            }
            if (arg1.equalsIgnoreCase("resetminimap")) {
                class187.field2705.method2638((byte) 72);
                class187.field2705.method2631((byte) -1);
                class325.method2067(arg2 ^ 0xFFFFFFFA);
                class69.method596(87);
            }
            if (arg1.startsWith("mc")) {
                if (class249.field3415.method115()) {
                    int var12 = Integer.parseInt(arg1.substring(3));
                    if (var12 < 1) {
                        var12 = 1;
                    } else if (var12 > 4) {
                        var12 = 4;
                    }
                    class165.field2433 = var12;
                    class249.field3415.method98(class165.field2433);
                    class249.field3415.method210(0);
                    class285.method1796(-11011, "Render cores now: " + class165.field2433);
                } else {
                    class285.method1796(arg2 ^ 0xFFFFD4C7, "Current toolkit doesn't support multiple cores");
                }
            }
            if (arg1.startsWith("cachespace")) {
                class285.method1796(-11011, "I(s): " + class284.field3808.method2544(arg2 ^ 0x3A) + "/" + class284.field3808.method2532((byte) -122));
                class285.method1796(-11011, "I(m): " + class13.field98.method2544(0) + "/" + class13.field98.method2532((byte) 80));
                class285.method1796(-11011, "O(s): " + class234.field3227.method2177(0) + "/" + class234.field3227.method2180(arg2 ^ 0x60));
            }
            if (arg1.equalsIgnoreCase("getcamerapos")) {
                class285.method1796(-11011, "Pos: " + class69.field1046 + "," + ((class356.field4842 >> 7) + class283.field3794 >> 6) + "," + ((class374.field5261 >> 7) + class296.field3988 >> 6) + "," + ((class356.field4842 >> 7) + class283.field3794 & 0x3F) + "," + ((class374.field5261 >> 7) + class296.field3988 & 0x3F) + " Height: " + (class22.method281(arg2 ^ 0x3B, class69.field1046, class374.field5261, class356.field4842) - class443.field6389));
                class285.method1796(-11011, "Look: " + class69.field1046 + "," + (class360.field4896 + class283.field3794 >> 6) + "," + (class19.field371 + class296.field3988 >> 6) + "," + (class360.field4896 + class283.field3794 & 0x3F) + "," + (class296.field3988 + class19.field371 & 0x3F) + " Height: " + (class22.method281(1, class69.field1046, class19.field371, class360.field4896) - class183.field2667));
            }
            if (arg1.equals("showocc")) {
                class176.field2606 = !class176.field2606;
                class415.method2570((byte) -34);
            }
            if (arg1.equals("renderprofile") || arg1.equals("rp")) {
                class422.field5905 = !class422.field5905;
                class249.field3415.method236(class422.field5905);
                class59.method541(0);
            }
            if (arg1.equals("nonpcs")) {
                class22.field404 = !class22.field404;
            }
            if (arg1.equals("autoworld")) {
                class295.method1900((byte) -101);
            }
            if (arg1.equals("heap")) {
                class285.method1796(-11011, "Heap: " + class297.field4005 + "MB");
            }
            if (arg1.equals("savevarcs")) {
                class321.method2027(true);
            }
            if (arg1.equals("scramblevarcs")) {
                for (int var13 = 0; var13 < class331.field4511.length; var13++) {
                    if (class257.field3475[var13]) {
                        class331.field4511[var13] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class331.field4511[var13] *= -1;
                        }
                    }
                }
                class321.method2027(true);
            }
            if (arg1.equals("showcolmap")) {
                class264.field3548 = true;
                class69.method596(91);
            }
            if (arg1.equals("hidecolmap")) {
                class264.field3548 = false;
                class69.method596(90);
            }
            if (arg1.equals("resetcache")) {
                class269.method1728((byte) 40);
            }
            if (arg1.equals("profilecpu")) {
                class285.method1796(arg2 ^ 0xFFFFD4C7, class400.method2452(true) + "ms");
            }
            if (class166.field2472 == 30) {
                class355.field4828.method1801(141, (byte) -102);
                class382.field5355++;
                class355.field4828.method1824(110, arg1.length() + 2);
                class355.field4828.method1824(60, arg0 ? 1 : 0);
                class355.field4828.method1827(0, arg1);
                return;
            }
        } catch (Exception var14) {
            class285.method1796(-11011, "Whoops, something went wrong.");
            return;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILce;II)V", line = 504)
    public static final void method2298(int arg0, int arg1, class346 arg2, int arg3, int arg4) {
        field5050++;
        long var5 = (long) (arg3 | arg4 << 28 | arg1 << 14);
        class396 var7 = (class396) class451.field6514.method614(-107, var5);
        if (arg0 != -11821) {
            field5053 = null;
        }
        if (var7 == null) {
            class396 var8 = new class396();
            class451.field6514.method612(var5, -1, var8);
            var8.field5549.method1249(arg2, (byte) -119);
            return;
        }
        class452 var9 = class234.method1569(2142, arg2.field4684);
        int var10 = var9.field6589;
        if (var9.field6582 == 1) {
            var10 = (arg2.field4688 + 1) * var10;
        }
        for (class346 var11 = (class346) var7.field5549.method1240((byte) -85); var11 != null; var11 = (class346) var7.field5549.method1245(1)) {
            class452 var12 = class234.method1569(2142, var11.field4684);
            int var13 = var12.field6589;
            if (var12.field6582 == 1) {
                var13 = (var11.field4688 + 1) * var13;
            }
            if (var10 > var13) {
                class125.method974(-113, arg2, var11);
                return;
            }
        }
        var7.field5549.method1249(arg2, (byte) -121);
    }
}
