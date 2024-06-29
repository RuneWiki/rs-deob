import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class395 extends class507 {

    @OriginalMember(owner = "client!tv", name = "D", descriptor = "I")
    public int field5702 = -1;

    @OriginalMember(owner = "client!tv", name = "F", descriptor = "I")
    public int field5704 = 12800;

    @OriginalMember(owner = "client!tv", name = "t", descriptor = "Z")
    public boolean field5692 = true;

    @OriginalMember(owner = "client!tv", name = "E", descriptor = "I")
    public int field5703 = -1;

    @OriginalMember(owner = "client!tv", name = "N", descriptor = "I")
    public int field5711 = 0;

    @OriginalMember(owner = "client!tv", name = "O", descriptor = "I")
    public int field5712 = 0;

    @OriginalMember(owner = "client!tv", name = "P", descriptor = "I")
    public int field5713 = 12800;

    @OriginalMember(owner = "client!tv", name = "y", descriptor = "Ljava/lang/String;")
    public String field5697;

    @OriginalMember(owner = "client!tv", name = "K", descriptor = "Ljava/lang/String;")
    public String field5709;

    @OriginalMember(owner = "client!tv", name = "J", descriptor = "I")
    public int field5708;

    @OriginalMember(owner = "client!tv", name = "z", descriptor = "I")
    public int field5698;

    @OriginalMember(owner = "client!tv", name = "L", descriptor = "Lsr;")
    public class167 field5710;

    @OriginalMember(owner = "client!tv", name = "Q", descriptor = "Z")
    public static boolean field5714 = false;

    @OriginalMember(owner = "client!tv", name = "C", descriptor = "Lhn;")
    public static class509 field5701 = new class509(64);

    @OriginalMember(owner = "client!tv", name = "S", descriptor = "Lho;")
    public static class103 field5716 = new class103(10, -1);

    @OriginalMember(owner = "client!tv", name = "u", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!tv", name = "v", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!tv", name = "w", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!tv", name = "x", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!tv", name = "A", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!tv", name = "B", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!tv", name = "G", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!tv", name = "H", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!tv", name = "I", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!tv", name = "R", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(III[II)Z", line = 10)
    public final boolean method2375(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field5694++;
        if (arg1 <= 3) {
            field5716 = null;
        }
        for (class241 var6 = (class241) this.field5710.method970(12); var6 != null; var6 = (class241) this.field5710.method976((byte) -127)) {
            if (var6.method1509(arg0, arg2, arg4, 47)) {
                var6.method1507(117, arg2, arg4, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "(I)V", line = 38)
    public static final void method2376(int arg0) {
        if (arg0 != 10) {
            method2376(-33);
        }
        if (class343.field4596 != null) {
            class249.field3320.method283(arg0 + 28827);
            class478.method2923();
            class212.method1356(-1);
            class531.method3157(true);
            class19.method110(0);
            class422.method2606(28346);
            if (class155.field2027 != null) {
                class155.field2027.method1763(false);
            }
            class202.method1298((byte) -79);
            class377.method2252((byte) 76);
            class280.method1694((byte) 87);
            class477.method2910(3, false);
            class294.method1764(0);
            for (int var1 = 0; var1 < 2048; var1++) {
                class531 var5 = class29.field272[var1];
                if (var5 != null) {
                    var5.field1252 = null;
                    for (int var6 = 0; var6 < var5.field1259.length; var6++) {
                        var5.field1259[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class339.field4484.length; var2++) {
                class22 var3 = class339.field4484[var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1259.length; var4++) {
                        var3.field1259[var4] = null;
                    }
                }
            }
            class272.field3633 = null;
            class521.field7667 = null;
            class343.field4596.method1724(1);
            class343.field4596 = null;
        }
        field5707++;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Ll;ILza;)V", line = 116)
    public static final void method2377(class16 arg0, int arg1, class287 arg2) {
        field5700++;
        if (class416.field5983 == null) {
            return;
        }
        if (class181.field2356 < 10) {
            if (!class416.field5990.method2157(class416.field5983.field5697, arg1)) {
                class181.field2356 = class413.field5904.method2154(arg1, class416.field5983.field5697) / 10;
                return;
            }
            class180.method1051(23413);
            class181.field2356 = 10;
        }
        if (class181.field2356 == 10) {
            class416.field6009 = class416.field5983.field5713 >> 6 << 6;
            class416.field6020 = class416.field5983.field5704 >> 6 << 6;
            class416.field6014 = (class416.field5983.field5712 >> 6 << 6) + 64 - class416.field6009;
            class416.field6015 = (class416.field5983.field5711 >> 6 << 6) + 64 - class416.field6020;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class416.field5983.method2375(class96.field1170.field3695, arg1 ^ 0x19, (class96.field1170.field3694 >> 7) + class418.field6074, var3, (class96.field1170.field3704 >> 7) + class357.field4867)) {
                var5 = var3[2] - class416.field6020;
                var4 = var3[1] - class416.field6009;
            }
            if (!class442.field6425 && var4 >= 0 && var4 < class416.field6014 && var5 >= 0 && class416.field6015 > var5) {
                int var6 = var5 + ((int) (Math.random() * 10.0D) - 5);
                int var7 = var4 + (int) (Math.random() * 10.0D) - 5;
                class49.field556 = var7;
                class163.field2133 = var6;
            } else if (class183.field2380 == -1 || class141.field1870 == -1) {
                class416.field5983.method2384(class416.field5983.field5708 & 0x3FFF, (class416.field5983.field5708 & 0xFFFF8CF) >> 14, true, var3);
                class49.field556 = var3[1] - class416.field6009;
                class163.field2133 = var3[2] - class416.field6020;
            } else {
                class416.field5983.method2384(class141.field1870, class183.field2380, true, var3);
                class442.field6425 = false;
                class141.field1870 = -1;
                class183.field2380 = -1;
                if (var3 != null) {
                    class49.field556 = var3[1] - class416.field6009;
                    class163.field2133 = var3[2] - class416.field6020;
                }
            }
            if (class416.field5983.field5703 == 37) {
                class416.field5998 = 3.0F;
                class416.field5996 = 3.0F;
            } else if (class416.field5983.field5703 == 50) {
                class416.field5998 = 4.0F;
                class416.field5996 = 4.0F;
            } else if (class416.field5983.field5703 == 75) {
                class416.field5998 = 6.0F;
                class416.field5996 = 6.0F;
            } else if (class416.field5983.field5703 == 100) {
                class416.field5998 = 8.0F;
                class416.field5996 = 8.0F;
            } else if (class416.field5983.field5703 == 200) {
                class416.field5998 = 16.0F;
                class416.field5996 = 16.0F;
            } else {
                class416.field5998 = 8.0F;
                class416.field5996 = 8.0F;
            }
            class416.field5997 = (int) class416.field5998 >> 1;
            class416.field5999 = class517.method3093(arg1 - 16384, class416.field5997);
            class104.method631((byte) 31);
            class416.method2568();
            class342.field4590 = new class167();
            class416.field5991 += (int) (Math.random() * 5.0D) - 2;
            if (class416.field5991 < -8) {
                class416.field5991 = -8;
            }
            class416.field6000 += (int) (Math.random() * 5.0D) - 2;
            if (class416.field5991 > 8) {
                class416.field5991 = 8;
            }
            if (class416.field6000 < -16) {
                class416.field6000 = -16;
            }
            if (class416.field6000 > 16) {
                class416.field6000 = 16;
            }
            class416.method2566(arg0, class416.field5991 >> 2 << 10, class416.field6000 >> 1);
            class416.field5987.method997(256, (byte) 103, 1024);
            class416.field5989.method496(arg1 + 64, 256, 256);
            class416.field5982.method2918((byte) 75, 4096);
            class373.field5063.method675(0, 256);
            class181.field2356 = 20;
        } else if (class181.field2356 == 20) {
            class478.method2917(true, (byte) 69);
            class416.method2555(arg2, class416.field5991, class416.field6000);
            class181.field2356 = 60;
            class478.method2917(true, (byte) 74);
            class167.method982(32);
        } else if (class181.field2356 == 60) {
            if (class416.field5990.method2156(class416.field5983.field5697 + "_staticelements", (byte) 86)) {
                if (!class416.field5990.method2157(class416.field5983.field5697 + "_staticelements", arg1)) {
                    return;
                }
                class416.field5995 = class321.method1899(class416.field5990, class48.field508, class416.field5983.field5697 + "_staticelements", 28709);
            } else {
                class416.field5995 = new class370(0);
            }
            class416.method2563();
            class181.field2356 = 70;
            class478.method2917(true, (byte) 44);
            class167.method982(32);
        } else if (class181.field2356 == 70) {
            class472.field7007 = new class145(arg2, 11, true, class60.field701);
            class181.field2356 = 73;
            class478.method2917(true, (byte) 48);
            class167.method982(32);
        } else if (class181.field2356 == 73) {
            class68.field777 = new class145(arg2, 12, true, class60.field701);
            class181.field2356 = 76;
            class478.method2917(true, (byte) 103);
            class167.method982(32);
        } else if (class181.field2356 == 76) {
            class357.field4870 = new class145(arg2, 14, true, class60.field701);
            class181.field2356 = 79;
            class478.method2917(true, (byte) 88);
            class167.method982(arg1 + 32);
        } else if (class181.field2356 == 79) {
            class285.field3758 = new class145(arg2, 17, true, class60.field701);
            class181.field2356 = 82;
            class478.method2917(true, (byte) 111);
            class167.method982(32);
        } else if (class181.field2356 == 82) {
            class219.field2968 = new class145(arg2, 19, true, class60.field701);
            class181.field2356 = 85;
            class478.method2917(true, (byte) 97);
            class167.method982(32);
        } else if (class181.field2356 == 85) {
            class510.field7417 = new class145(arg2, 22, true, class60.field701);
            class181.field2356 = 88;
            class478.method2917(true, (byte) 97);
            class167.method982(arg1 ^ 0x20);
        } else if (class181.field2356 == 88) {
            class169.field2192 = new class145(arg2, 26, true, class60.field701);
            class181.field2356 = 91;
            class478.method2917(true, (byte) 122);
            class167.method982(32);
        } else {
            class476.field7047 = new class145(arg2, 30, true, class60.field701);
            class181.field2356 = 100;
            class478.method2917(true, (byte) 64);
            if (arg1 != 0) {
                field5716 = null;
            }
            class167.method982(arg1 ^ 0x20);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(II[II)Z", line = 345)
    public final boolean method2378(int arg0, int arg1, int[] arg2, int arg3) {
        field5693++;
        class241 var5 = (class241) this.field5710.method970(12);
        if (arg1 != -30335) {
            return true;
        }
        while (var5 != null) {
            if (var5.method1505(arg3, arg0, 126)) {
                var5.method1503(true, arg2, arg0, arg3);
                return true;
            }
            var5 = (class241) this.field5710.method976((byte) 23);
        }
        return false;
    }

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "(I)V", line = 371)
    public static void method2379(int arg0) {
        if (arg0 < 0) {
            field5701 = null;
        }
        field5701 = null;
        field5716 = null;
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 672)
    public class395(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field5697 = arg1;
        this.field5709 = arg2;
        this.field5708 = arg3;
        this.field5692 = arg5;
        this.field5703 = arg6;
        this.field5702 = arg4;
        this.field5698 = arg0;
        if (this.field5703 == 255) {
            this.field5703 = 0;
        }
        this.field5710 = new class167();
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILjava/lang/String;)V", line = 392)
    public static final void method2380(int arg0, String arg1) {
        field5705++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class437.method2684(-106, arg1);
        if (var2 == null || arg0 != 12800) {
            return;
        }
        for (int var3 = 0; var3 < class85.field1014; var3++) {
            String var4 = class52.field611[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class437.method2684(-127, var4);
            if (var5 != null && var5.equals(var2)) {
                class85.field1014--;
                for (int var6 = var3; var6 < class85.field1014; var6++) {
                    class52.field611[var6] = class52.field611[var6 + 1];
                    class465.field6912[var6] = class465.field6912[var6 + 1];
                    class91.field1090[var6] = class91.field1090[var6 + 1];
                    class380.field5506[var6] = class380.field5506[var6 + 1];
                    class285.field3756[var6] = class285.field3756[var6 + 1];
                    class122.field1589[var6] = class122.field1589[var6 + 1];
                }
                class381.field5519 = class106.field1448;
                class144.field1917++;
                class492.method2979(class244.field3220, 114);
                class106.field1443.method2449((byte) 117, class424.method2613(1, arg1));
                class106.field1443.method2415(arg1, 21742);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V", line = 456)
    public final void method2381(byte arg0) {
        int var2 = 59 / ((arg0 + 4) / 33);
        this.field5704 = 12800;
        this.field5713 = 12800;
        field5696++;
        this.field5712 = 0;
        this.field5711 = 0;
        for (class241 var3 = (class241) this.field5710.method970(12); var3 != null; var3 = (class241) this.field5710.method976((byte) 75)) {
            if (var3.field3185 < this.field5713) {
                this.field5713 = var3.field3185;
            }
            if (this.field5712 < var3.field3181) {
                this.field5712 = var3.field3181;
            }
            if (var3.field3191 > this.field5711) {
                this.field5711 = var3.field3191;
            }
            if (var3.field3179 < this.field5704) {
                this.field5704 = var3.field3179;
            }
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(III[BIII)V", line = 494)
    public static final void method2382(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        field5715++;
        if (arg0 > 0 && !class119.method713(arg0, 44)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class119.method713(arg4, -86)) {
            int var7 = class62.method372(32841, arg1);
            int var8 = 0;
            int var9 = arg4 <= arg0 ? arg4 : arg0;
            int var10 = arg0 >> 1;
            int var11 = arg4 >> 1;
            byte[] var12 = arg3;
            if (arg2 != 22) {
                method2382(-38, -90, 14, null, -42, -24, 114);
            }
            byte[] var13 = new byte[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Dub(arg6, var8, arg5, arg0, arg4, 0, arg1, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg0 * var7;
                byte[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var16 + var14;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            int var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var13[var17] = (byte) (var27 >> 2);
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                var13 = var12;
                arg0 = var10;
                arg4 = var11;
                var12 = var15;
                var8++;
                var11 >>= 0x1;
                var10 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(III)Z", line = 592)
    public final boolean method2383(int arg0, int arg1, int arg2) {
        field5699++;
        for (class241 var4 = (class241) this.field5710.method970(12); var4 != null; var4 = (class241) this.field5710.method976((byte) 83)) {
            if (var4.method1508(-19, arg0, arg1)) {
                return true;
            }
        }
        if (arg2 != -1) {
            this.method2384(59, -66, false, null);
        }
        return false;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIZ[I)Z", line = 618)
    private final boolean method2384(int arg0, int arg1, boolean arg2, int[] arg3) {
        if (!arg2) {
            this.method2378(-86, 111, null, -28);
        }
        field5706++;
        for (class241 var5 = (class241) this.field5710.method970(12); var5 != null; var5 = (class241) this.field5710.method976((byte) -5)) {
            if (var5.method1508(126, arg1, arg0)) {
                var5.method1507(47, arg0, arg1, arg3);
                return true;
            }
        }
        return false;
    }
}
