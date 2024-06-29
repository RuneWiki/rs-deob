import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class153 implements Runnable {

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "[Lng;")
    public volatile class190[] field2269 = new class190[2];

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "Z")
    public volatile boolean field2276 = false;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "Z")
    public volatile boolean field2279 = false;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "[[I")
    public static int[][] field2275 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "Lng;")
    public static class190 field2271;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "Lml;")
    public class219 field2272;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IBILfa;)V", line = 4)
    public static final void method1126(int arg0, byte arg1, int arg2, class128 arg3) {
        if ((arg0 & 0x400) != 0) {
            arg3.field4504 = class352.field5114.method837(true);
            arg3.field4580 = class352.field5114.method848(255);
            arg3.field4538 = class352.field5114.method848(255);
            arg3.field4524 = class352.field5114.method848(255);
            arg3.field4562 = class352.field5114.method798(false) + class34.field434;
            arg3.field4521 = class352.field5114.method812(3) + class34.field434;
            arg3.field4567 = class352.field5114.method848(255);
            arg3.field4589 = 0;
            arg3.field4599 = 1;
        }
        field2277++;
        if ((arg0 & 0x100) != 0) {
            int var4 = class352.field5114.method798(false);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = class352.field5114.method815(true);
            boolean var6 = true;
            if (var4 != -1 && arg3.field4578 != -1) {
                if (arg3.field4578 == var4) {
                    class135 var7 = class209.method1486(var4, 11);
                    if (var7.field2068 && var7.field2078 != -1) {
                        class183 var8 = class110.method671(-21965, var7.field2078);
                        int var9 = var8.field2592;
                        if (var9 == 0) {
                            var6 = false;
                        } else if (var9 == 1) {
                            var6 = true;
                        } else if (var9 == 2) {
                            arg3.field4564 = 0;
                            var6 = false;
                        }
                    }
                } else {
                    class135 var10 = class209.method1486(var4, 11);
                    class135 var11 = class209.method1486(arg3.field4578, 11);
                    if (var10.field2078 != -1 && var11.field2078 != -1) {
                        class183 var12 = class110.method671(-21965, var10.field2078);
                        class183 var13 = class110.method671(-21965, var11.field2078);
                        if (var13.field2583 > var12.field2583) {
                            var6 = false;
                        }
                    }
                }
            }
            if (var6) {
                arg3.field4577 = 0;
                arg3.field4578 = var4;
                arg3.field4518 = (var5 & 0xFFFF) + class34.field434;
                arg3.field4586 = 1;
                arg3.field4552 = 0;
                arg3.field4545 = var5 >> 16;
                if (arg3.field4518 > class34.field434) {
                    arg3.field4577 = -1;
                }
                if (arg3.field4578 != -1 && class34.field434 == arg3.field4518) {
                    int var14 = class209.method1486(arg3.field4578, arg1 ^ 0xFFFFFFBD).field2078;
                    if (var14 != -1) {
                        class183 var15 = class110.method671(-21965, var14);
                        if (var15 != null && var15.field2609 != null) {
                            class47.method311(arg3.field4463, arg3.field4466, 0, true, class181.field2555 == arg3, var15);
                        }
                    }
                }
            }
        }
        if ((arg0 & 0x8) != 0) {
            arg3.field4544 = class352.field5114.method809(false);
            arg3.field4512 = class352.field5114.method798(false);
        }
        if (arg1 != -74) {
            return;
        }
        if ((arg0 & 0x4) != 0) {
            int var16 = class352.field5114.method848(255);
            byte[] var17 = new byte[var16];
            class130 var18 = new class130(var17);
            class352.field5114.method811(-121, 0, var17, var16);
            class401.field5631[arg2] = var18;
            arg3.method777(32, var18);
        }
        if ((arg0 & 0x2) != 0) {
            int var19 = class352.field5114.method854(3944);
            int var20 = class352.field5114.method850(false);
            arg3.method2088(0, var20, class34.field434, var19);
            arg3.field4579 = class34.field434 + 300;
            arg3.field4565 = class352.field5114.method848(255);
        }
        if ((arg0 & 0x1000) != 0) {
            int var21 = class352.field5114.method812(3);
            arg3.field4571 = class352.field5114.method810((byte) -6);
            arg3.field4583 = class352.field5114.method810((byte) -6);
            arg3.field4511 = (var21 & 0x8000) != 0;
            arg3.field4539 = var21 & 0x7FFF;
            arg3.field4576 = class34.field434 + arg3.field4571 + arg3.field4539;
        }
        if ((arg0 & 0x10) != 0) {
            int var22 = class352.field5114.method809(false);
            if (var22 == 65535) {
                var22 = -1;
            }
            int var23 = class352.field5114.method810((byte) -6);
            class135.method1036(arg3, var23, (byte) -77, var22);
        }
        if ((arg0 & 0x1) != 0) {
            arg3.field4507 = class352.field5114.method843(-111);
            if (arg3.field4507.charAt(0) == '~') {
                arg3.field4507 = arg3.field4507.substring(1);
                class373.method2391(arg3.method789(false, false), -1, 2, 0, arg3.field4507, arg3.method788(true, 65));
            } else if (class181.field2555 == arg3) {
                class373.method2391(arg3.method789(false, false), -1, 2, 0, arg3.field4507, arg3.method788(true, arg1 ^ 0xFFFFFFD6));
            }
            arg3.field4533 = 0;
            arg3.field4560 = 0;
            arg3.field4531 = 150;
        }
        if ((arg0 & 0x200) != 0) {
            int var24 = class352.field5114.method850(false);
            int[] var25 = new int[var24];
            int[] var26 = new int[var24];
            int[] var27 = new int[var24];
            for (int var28 = 0; var28 < var24; var28++) {
                int var29 = class352.field5114.method812(3);
                if (var29 == 65535) {
                    var29 = -1;
                }
                var25[var28] = var29;
                var26[var28] = class352.field5114.method837(true);
                var27[var28] = class352.field5114.method857(255);
            }
            class181.method1294(var26, var25, var27, 0, arg3);
        }
        if ((arg0 & 0x80) != 0) {
            arg3.field4569 = class352.field5114.method857(255);
            if (arg3.field4569 == 65535) {
                arg3.field4569 = -1;
            }
        }
        if ((arg0 & 0x40) != 0) {
            int var30 = class352.field5114.method809(false);
            int var31 = class352.field5114.method848(255);
            int var32 = class352.field5114.method837(true);
            int var33 = class352.field5114.field1880;
            boolean var34 = (var30 & 0x8000) != 0;
            if (arg3.field1790 != null && arg3.field1778 != null) {
                boolean var35 = false;
                if (var31 <= 1) {
                    if (!var34 && (class138.field2117 && !class335.field4874 || class148.field2211)) {
                        var35 = true;
                    } else if (class101.method591(111, arg3.field1790)) {
                        var35 = true;
                    }
                }
                if (!var35 && class102.field1283 == 0) {
                    class384.field5438.field1880 = 0;
                    class352.field5114.method853(0, var32, class384.field5438.field1851, true);
                    class384.field5438.field1880 = 0;
                    int var36 = -1;
                    String var38;
                    if (var34) {
                        var30 &= 0x7FFF;
                        class341 var37 = class24.method128(class384.field5438, 0);
                        var36 = var37.field4935;
                        var38 = var37.field4936.method394(class384.field5438, 80);
                    } else {
                        var38 = class169.method1209(class64.method410(false, class353.method2308(29367, class384.field5438)), -115);
                    }
                    arg3.field4507 = var38.trim();
                    arg3.field4533 = var30 >> 8;
                    arg3.field4531 = 150;
                    arg3.field4560 = var30 & 0xFF;
                    int var39;
                    if (var31 == 1 || var31 == 2) {
                        var39 = var34 ? 17 : 1;
                    } else {
                        var39 = var34 ? 17 : 2;
                    }
                    if (var31 == 2) {
                        class186.method1333(0, var39, (String) null, var38, "<img=1>" + arg3.method789(false, false), var36, "<img=1>" + arg3.method788(true, arg1 + 159), 0);
                    } else if (var31 == 1) {
                        class186.method1333(arg1 ^ 0xFFFFFFB6, var39, (String) null, var38, "<img=0>" + arg3.method789(false, false), var36, "<img=0>" + arg3.method788(true, 88), 0);
                    } else {
                        class186.method1333(0, var39, (String) null, var38, arg3.method789(false, false), var36, arg3.method788(true, 115), 0);
                    }
                }
            }
            class352.field5114.field1880 = var32 + var33;
        }
        if ((arg0 & 0x800) != 0) {
            int var40 = class352.field5114.method854(arg1 ^ 0xFFFFF0DE);
            int var41 = class352.field5114.method837(true);
            arg3.method2088(0, var41, class34.field434, var40);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lfa;I)V", line = 335)
    public static final void method1127(class128 arg0, int arg1) {
        field2274++;
        if (class381.field5412 >= 400 || class181.field2555 == arg0) {
            return;
        }
        String var2;
        if (arg0.field1813 == arg1) {
            boolean var3 = true;
            if (class181.field2555.field1774 != -1 && arg0.field1774 != -1) {
                int var4 = arg0.field1776 >= class181.field2555.field1776 ? arg0.field1776 : class181.field2555.field1776;
                int var5 = arg0.field1774 <= class181.field2555.field1774 ? arg0.field1774 : class181.field2555.field1774;
                int var6 = var4 * 10 / 100 + var5 + 5;
                int var7 = class181.field2555.field1776 - arg0.field1776;
                if (var7 < 0) {
                    var7 = -var7;
                }
                if (var6 < var7) {
                    var3 = false;
                }
            }
            String var8 = class317.field4656 == 1 ? class357.field5162.method2284((byte) 111, class309.field4497) : class3.field65.method2284((byte) 108, class309.field4497);
            if (arg0.field1809 <= arg0.field1776) {
                var2 = arg0.method788(true, 116) + (var3 ? class140.method1063(class181.field2555.field1776, 117, arg0.field1776) : "<col=ffffff>") + " (" + var8 + arg0.field1776 + ")";
            } else {
                var2 = arg0.method788(true, 69) + (var3 ? class140.method1063(class181.field2555.field1776, -94, arg0.field1776) : "<col=ffffff>") + " (" + var8 + arg0.field1776 + "+" + (arg0.field1809 - arg0.field1776) + ")";
            }
        } else {
            var2 = arg0.method788(true, arg1 ^ 0x60) + " (" + class245.field3661.method2284((byte) 90, class309.field4497) + arg0.field1813 + ")";
        }
        if (!class269.field3935) {
            for (int var9 = 7; var9 >= 0; var9--) {
                if (class317.field4659[var9] != null) {
                    short var10 = 0;
                    if (class317.field4656 == 0 && class317.field4659[var9].equalsIgnoreCase(class83.field1065.method2284((byte) -74, class309.field4497))) {
                        if (arg0.field1776 > class181.field2555.field1776) {
                            var10 = 2000;
                        }
                        if (class181.field2555.field1795 != 0 && arg0.field1795 != 0) {
                            if (class181.field2555.field1795 == arg0.field1795) {
                                var10 = 2000;
                            } else {
                                var10 = 0;
                            }
                        }
                    } else if (class340.field4920[var9]) {
                        var10 = 2000;
                    }
                    short var11 = (short) (class204.field2885[var9] + var10);
                    int var12 = class223.field3315[var9] == -1 ? class165.field2363 : class223.field3315[var9];
                    class101.field1276++;
                    class252.method1755((long) arg0.field4514, "<col=ffffff>" + var2, var11, var12, (byte) 59, class317.field4659[var9], 0, 0);
                }
            }
        } else if ((class432.field6182 & 0x8) != 0) {
            class252.method1755((long) arg0.field4514, class106.field1363 + " -> <col=ffffff>" + var2, 22, class442.field6319, (byte) -105, class285.field4153, 0, 0);
            class393.field5530++;
        }
        for (class382 var13 = (class382) class228.field3392.method2752(arg1 ^ 0xFFFFFF8A); var13 != null; var13 = (class382) class228.field3392.method2754(-1)) {
            if (var13.field5420 == 57) {
                var13.field5418 = "<col=ffffff>" + var2;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BII)V", line = 456)
    public static final void method1128(byte arg0, int arg1, int arg2) {
        field2278++;
        class276 var3 = class264.method1816((byte) -120, 0, 15);
        var3.method1876((byte) -117);
        var3.field3986 = arg1;
        var3.field3984 = arg2;
        if (arg0 != 87) {
            method1129(-25);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V", line = 471)
    public static void method1129(int arg0) {
        field2275 = null;
        if (arg0 != 3) {
            method1128((byte) -92, 8, 4);
        }
        field2271 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V", line = 485)
    public static final void method1130(byte arg0) {
        field2280++;
        if (class265.field3898 == -1) {
            return;
        }
        int var1 = class270.field3949.method536(0);
        int var2 = class270.field3949.method543(7);
        if (class252.field3744 != null) {
            var1 = class252.field3744.method476(119);
            var2 = class252.field3744.method471((byte) -54);
        }
        class3.method6(0, -10776, class24.field307, var2, 0, 0, var1, class265.field3898, class316.field4643, 0);
        if (arg0 <= 121) {
            method1129(-34);
        }
        if (class447.field6383 != null) {
            class323.method2138(var1, 8, var2);
        }
    }

    @OriginalMember(owner = "client!mm", name = "run", descriptor = "()V", line = 515)
    public final void run() {
        field2270++;
        this.field2279 = true;
        try {
            while (!this.field2276) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class190 var2 = this.field2269[var1];
                    if (var2 != null) {
                        var2.method1364((byte) -122);
                    }
                }
                class259.method1790((byte) -118, 10L);
                class129.method792((Object) null, this.field2272, 49);
            }
        } catch (Exception var9) {
            class334.method2191(true, (String) null, var9);
        } finally {
            Object var6 = null;
            this.field2279 = false;
        }
    }
}
