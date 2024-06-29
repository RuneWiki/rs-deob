import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class219 extends class320 {

    @OriginalMember(owner = "client!jo", name = "C", descriptor = "Lsi;")
    private class390 field3150;

    @OriginalMember(owner = "client!jo", name = "D", descriptor = "F")
    public float field3151;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
    public int field3140;

    @OriginalMember(owner = "client!jo", name = "B", descriptor = "I")
    public int field3149;

    @OriginalMember(owner = "client!jo", name = "x", descriptor = "[I")
    private int[] field3145;

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
    public int field3136;

    @OriginalMember(owner = "client!jo", name = "H", descriptor = "I")
    public int field3155;

    @OriginalMember(owner = "client!jo", name = "G", descriptor = "Lvj;")
    private class303 field3154;

    @OriginalMember(owner = "client!jo", name = "y", descriptor = "Ltp;")
    private class370 field3146;

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "Lpi;")
    public static class342 field3138 = new class342("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!jo", name = "v", descriptor = "F")
    public static float field3143;

    @OriginalMember(owner = "client!jo", name = "J", descriptor = "F")
    public static float field3157;

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!jo", name = "w", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!jo", name = "A", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!jo", name = "E", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!jo", name = "F", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!jo", name = "I", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!jo", name = "u", descriptor = "Lkd;")
    private class184 field3142;

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field3133;

    @OriginalMember(owner = "client!jo", name = "z", descriptor = "Ljaggl/memory/NativeStream;")
    private NativeStream field3147;

    @OriginalMember(owner = "client!jo", name = "K", descriptor = "Z")
    public static boolean field3158;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IILck;)V")
    public static final void method1456(int arg0, int arg1, class452 arg2) {
        class29.field633 = 0;
        field3135++;
        class151.field2405 = false;
        class184.method1290(-1, arg2);
        class519.method3101(arg0 ^ 0x29D1, arg2);
        if (class151.field2405) {
            System.out.println("---endgpp---");
        }
        if (arg2.field2289 != arg1) {
            throw new RuntimeException("gpi1 pos:" + arg2.field2289 + " psize:" + arg1);
        } else if (arg0 != 10638) {
            field3158 = true;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)V")
    public static final void method1457(int arg0, int arg1, int arg2) {
        field3156++;
        int var3 = class501.field7392.method2136(class297.field4210.method2180(client.field2870, 29491), 13216);
        for (class208 var4 = (class208) class339.field5122.method2427(120); var4 != null; var4 = (class208) class339.field5122.method2422(-95)) {
            int var8 = class429.method2570(var4, -1);
            if (var8 > var3) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class363.field5500 * 16 + 21;
        int var6 = arg0 - (var3 / 2);
        if ((var3 + var6) > class466.field6952) {
            var6 = class466.field6952 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (class77.field1297 < var5 + arg1) {
            var7 = class77.field1297 - var5;
        }
        class106.field1766 = var6;
        if (arg2 > -2) {
            field3143 = -0.65600467F;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        class87.field1529 = class363.field5500 * 16 + (class295.field4199 ? 26 : 22);
        class197.field2903 = true;
        class215.field3104 = var7;
        class499.field7375 = var3;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IBIIIZ)V")
    public static final void method1458(int arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3144++;
        if (class380.field5761 == null) {
            class4.field109.method1200(-16777216, arg3, arg0, arg4, arg2, 10);
        } else if (class139.field2224.field6228 >= 0 && class139.field2224.field6228 < class33.field662 * 128 && class139.field2224.field6233 >= 0 && class139.field2224.field6233 < (class121.field1966 * 128)) {
            class173.field2664++;
            if (class139.field2224 != null && (class139.field2224.field6228 - (class139.field2224.method1654(110) - 1) * 64 >> 7) == class467.field6967 && (class139.field2224.field6233 - (class139.field2224.method1654(82) - 1) * 64 >> 7) == class308.field4710) {
                class467.field6967 = -1;
                class308.field4710 = -1;
                class482.method2866(112);
            }
            class283.method1807(622499940);
            if (!arg5) {
                class91.method705(false);
            }
            class103.method778(124);
            class514.method3071(true, arg3, arg2, arg4, 100, arg0);
            int var6 = class289.field4117;
            int var7 = class12.field206;
            int var8 = class348.field5208;
            int var9 = class183.field2735;
            if (class85.field1473 == 1) {
                int var10 = (int) class455.field6790;
                if ((class42.field771 >> 8) > var10) {
                    var10 = class42.field771 >> 8;
                }
                if (class153.field2429[4] && var10 < class167.field2588[4] + 128) {
                    var10 = class167.field2588[4] + 128;
                }
                int var11 = (int) class526.field7779 + class345.field5179 & 0x3FFF;
                class108.method807(var10, var11, (var10 >> 3) * 3 + 600 << 0, class524.field7771, var9, class305.field4654, (byte) 78, class343.method2188(class163.field2525, class139.field2224.field6228, (byte) -102, class139.field2224.field6233) - 50);
            } else if (class85.field1473 == 4) {
                int var12 = (int) class455.field6790;
                if (class42.field771 >> 8 > var12) {
                    var12 = class42.field771 >> 8;
                }
                if (class153.field2429[4] && (class167.field2588[4] + 128) > var12) {
                    var12 = class167.field2588[4] + 128;
                }
                int var13 = (int) class526.field7779 & 0x3FFF;
                class108.method807(var12, var13, (var12 >> 3) * 3 + 600 << 0, class524.field7771, var9, class305.field4654, (byte) 62, class343.method2188(class163.field2525, class141.field2245, (byte) -102, class206.field2980) - 50);
            } else if (class85.field1473 == 5) {
                class463.method2756(true, var9);
            }
            int var14 = class40.field732;
            int var15 = class222.field3184;
            int var16 = class405.field6075;
            int var17 = class122.field1982;
            int var18 = class291.field4148;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class153.field2429[var19]) {
                    int var22 = (int) ((double) (-class479.field7136[var19]) + Math.random() * (double) (class479.field7136[var19] * 2 + 1) + Math.sin((double) class93.field1582[var19] / 100.0D * (double) class12.field202[var19]) * (double) class167.field2588[var19]);
                    if (var19 == 0) {
                        class40.field732 += var22;
                    }
                    if (var19 == 2) {
                        class405.field6075 += var22;
                    }
                    if (var19 == 3) {
                        class291.field4148 = class291.field4148 + var22 & 0x3FFF;
                    }
                    if (var19 == 4) {
                        class122.field1982 += var22;
                        if (class122.field1982 < 1024) {
                            class122.field1982 = 1024;
                        } else if (class122.field1982 > 3072) {
                            class122.field1982 = 3072;
                        }
                    }
                    if (var19 == 1) {
                        class222.field3184 += var22;
                    }
                }
            }
            if (class40.field732 < 0) {
                class40.field732 = 0;
            }
            if (arg1 <= 100) {
                field3143 = -0.16298516F;
            }
            if (class405.field6075 < 0) {
                class405.field6075 = 0;
            }
            if (class40.field732 > ((class151.field2408 << 7) - 1)) {
                class40.field732 = (class151.field2408 << 7) - 1;
            }
            if (class405.field6075 > (class261.field3792 << 7) - 1) {
                class405.field6075 = (class261.field3792 << 7) - 1;
            }
            class491.method2921((byte) 14);
            class459.method2734((byte) -113);
            class4.field109.method298(var7, var8, var7 + var6, var8 - -var9);
            class4.field109.method291();
            int var20 = class118.field1946;
            if (class381.field5778 == null) {
                class4.field109.method241(var20);
            } else {
                class381.field5778.method791(var8, class506.field7468 << 3, class122.field1982, var9, -20488, var20, var6, class4.field109, class291.field4148, var7);
            }
            class386.method2389(15804);
            class513.field7546.method873(class40.field732, class222.field3184, class405.field6075, -class122.field1982 & 0x3FFF, -class291.field4148 & 0x3FFF, -class291.field4137 & 0x3FFF);
            class4.field109.method302(class513.field7546);
            class4.field109.method230(var7 + (var6 / 2), var8 - -(var9 / 2), class50.field902 << 1, class50.field902 << 1);
            class69.method565(class50.field902 << 1, var9 / 2 + var8, class50.field902 << 1, var6 / 2 + var7, -912212377);
            class389.method2401(-class122.field1982 & 0x3FFF, class222.field3184, -29518, -class291.field4148 & 0x3FFF, -class291.field4137 & 0x3FFF, class40.field732, class405.field6075);
            byte var21 = class443.field6623.method2836(class169.field2624, -2) == 2 ? (byte) class173.field2664 : 1;
            class99.method741(class4.field109, class531.field7821, class406.field6097, class513.field7546, class40.field732, class222.field3184, class405.field6075, class413.field6171, class400.field6024, class382.field5785, class414.field6181, class32.field643, class378.field5720, class139.field2224.field6232 + 1, var21, class139.field2224.field6228 >> 7, class139.field2224.field6233 >> 7, !class443.field6623.field598);
            class386.method2389(15804);
            if (class281.field4023 == 30) {
                class142.method1053(var6, var9, var7, 256, 22422, var8, 256);
                class368.method2307(var6, var7, var8, 256, 117, var9, 256);
                class325.method2102(true, 256, 256, var6, var7, var8, var9);
                class282.method1799(var9, var8, var6, var7, 15341);
            }
            class514.method3070();
            class40.field732 = var14;
            class122.field1982 = var17;
            class222.field3184 = var15;
            class291.field4148 = var18;
            class405.field6075 = var16;
            if (class421.field6291 && class405.field6072.method771(true) == 0) {
                class421.field6291 = false;
            }
            if (class421.field6291) {
                class4.field109.method1200(-16777216, var9, var7, var8, var6, 10);
                client.method1351((byte) -96, false, class516.field7590.method2180(client.field2870, 29491), class464.field6944);
            }
        } else {
            class4.field109.method1200(-16777216, arg3, arg0, arg4, arg2, 10);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(FIBII)V")
    public final void method1459(float arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (this.field3136 != -1) {
            class83 var6 = this.field3154.field2501.method956(-945, this.field3136);
            int var7 = var6.field1449 & 0xFF;
            if (var7 != 0 && var6.field1451 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 <= 127) {
                    var8 = arg1 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg4 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg4 = ((arg4 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg4 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field1446 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg4 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg4 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg4 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg4 = (var14 >> 8) + (var12 << 8 & 0xFF00CA) + (var13 & 0xFF00);
            }
        }
        if (arg2 != -22) {
            return;
        }
        field3153++;
        this.field3147.method2634(arg3 * 4);
        if (arg0 != 1.0F) {
            int var15 = (arg4 & 0xFFC2A8) >> 16;
            int var16 = arg4 >> 8 & 0xFF;
            int var17 = arg4 & 0xFF;
            int var18 = (int) ((float) var15 * arg0);
            int var19 = (int) ((float) var16 * arg0);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var17 * arg0);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg4 = var20 | var19 << 8 | var18 << 16;
        }
        this.field3147.method2631((byte) (arg4 >> 16));
        this.field3147.method2631((byte) (arg4 >> 8));
        this.field3147.method2631((byte) arg4);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IB)V")
    public final void method1460(int arg0, byte arg1) {
        field3139++;
        this.field3147.method2630();
        class525 var3 = this.field3154.method1957(arg0 * 4, 25630, false, this.field3133, 4);
        if (arg1 > 62) {
            this.field3142 = new class184(var3, 5121, 4, 0);
            this.field3147 = null;
            this.field3133 = null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)V")
    public static void method1461(int arg0) {
        if (arg0 == -1280932313) {
            field3138 = null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "([III)V")
    public final void method1462(int[] arg0, int arg1, int arg2) {
        field3148++;
        if (arg2 != -27059) {
            method1456(-108, 78, null);
        }
        int var4 = 0;
        class145 var5 = class494.field7307;
        var5.field2289 = 0;
        if (this.field3154.field4599) {
            for (int var6 = 0; var6 < arg1; var6++) {
                int var7 = arg0[var6];
                int var8 = this.field3145[var7];
                short[] var9 = this.field3150.field5889[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var9.length > var11) {
                        if ((0x1 << var10++ & var8) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method1094(1618659784, var9[var11++] & 0xFFFF);
                            var4++;
                            var5.method1094(1618659784, var9[var11++] & 0xFFFF);
                            var5.method1094(1618659784, var9[var11++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg1; var12++) {
                int var13 = arg0[var12];
                short[] var14 = this.field3150.field5889[var13];
                int var15 = this.field3145[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var14.length) {
                        if ((0x1 << var16++ & var15) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method1066(-2012325976, var14[var17++] & 0xFFFF);
                            var4++;
                            var5.method1066(-2012325976, var14[var17++] & 0xFFFF);
                            var5.method1066(-2012325976, var14[var17++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field3146.method466(5123, 19971, var5.field2270, var5.field2289);
        this.field3154.method1982(this.field3142, this.field3150.field5901, this.field3150.field5904, this.field3150.field5906, 54);
        this.field3154.method1938(false, this.field3136, (this.field3150.field5875 & 0x7) != 0, (this.field3150.field5875 & 0x8) != 0);
        if (this.field3154.field4561) {
            this.field3154.method214(Integer.MAX_VALUE, this.field3149, this.field3155, this.field3140);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field3151, 1.0F / this.field3151, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field3154.method1982(this.field3142, this.field3150.field5901, this.field3150.field5904, this.field3150.field5906, 68);
        this.field3154.method1988(var4, this.field3146, 0, false, 4);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIIIIIBI)V")
    public static final void method1463(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field3141++;
        class221.method1468(arg0, arg2, arg3, arg1, arg8, arg5, arg6, arg4, 0, 0);
        if (arg7 < 65) {
            field3138 = null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(IB)V")
    public final void method1464(int arg0, byte arg1) {
        this.field3133 = this.field3154.field4496.method2636(arg0 * 4);
        field3134++;
        this.field3147 = new NativeStream(this.field3133);
        if (arg1 > -51) {
            field3143 = -0.7530314F;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)V")
    public final void method1465(int arg0, int arg1) {
        field3152++;
        if (arg0 == -1) {
            this.field3147.method2634(arg1 * 4 + 3);
            this.field3147.method2631(-1);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIB)V")
    public final void method1466(int arg0, int arg1, int arg2, byte arg3) {
        this.field3145[this.field3150.field673 * arg1 + arg0] = class121.method909(this.field3145[this.field3150.field673 * arg1 + arg0], 0x1 << arg2);
        int var5 = -57 % ((arg3 + 32) / 41);
        field3137++;
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lsi;IIIII)V")
    public class219(class390 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3150 = arg0;
        this.field3151 = arg2;
        this.field3140 = arg5;
        this.field3149 = arg3;
        this.field3145 = new int[this.field3150.field678 * this.field3150.field673];
        this.field3136 = arg1;
        this.field3155 = arg4;
        this.field3154 = this.field3150.field5880;
        this.field3146 = new class370(this.field3154, 5123, null, 1);
    }
}
