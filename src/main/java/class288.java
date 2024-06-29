import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class288 extends class86 {

    @OriginalMember(owner = "client!io", name = "x", descriptor = "Lgb;")
    private class136 field4113;

    @OriginalMember(owner = "client!io", name = "K", descriptor = "I")
    public int field4124;

    @OriginalMember(owner = "client!io", name = "v", descriptor = "I")
    public int field4111;

    @OriginalMember(owner = "client!io", name = "o", descriptor = "[I")
    private int[] field4104;

    @OriginalMember(owner = "client!io", name = "C", descriptor = "I")
    public int field4117;

    @OriginalMember(owner = "client!io", name = "y", descriptor = "Lrl;")
    private class487 field4114;

    @OriginalMember(owner = "client!io", name = "H", descriptor = "F")
    public float field4122;

    @OriginalMember(owner = "client!io", name = "w", descriptor = "I")
    public int field4112;

    @OriginalMember(owner = "client!io", name = "E", descriptor = "Lqb;")
    private class142 field4119;

    @OriginalMember(owner = "client!io", name = "u", descriptor = "[I")
    public static int[] field4110 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!io", name = "O", descriptor = "Z")
    public static boolean field4128 = false;

    @OriginalMember(owner = "client!io", name = "q", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!io", name = "r", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!io", name = "t", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!io", name = "A", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!io", name = "F", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!io", name = "G", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!io", name = "J", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!io", name = "L", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!io", name = "M", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!io", name = "N", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!io", name = "D", descriptor = "Lbh;")
    private class27 field4118;

    @OriginalMember(owner = "client!io", name = "z", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field4115;

    @OriginalMember(owner = "client!io", name = "s", descriptor = "Ljaggl/memory/NativeStream;")
    private NativeStream field4108;

    // $FF: synthetic field
    @OriginalMember(owner = "client!io", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field4129;

    @OriginalMember(owner = "client!io", name = "p", descriptor = "[I")
    public static int[] field4105;

    // $FF: synthetic method
    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1748(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(II)V", line = 11)
    public final void method1738(int arg0, int arg1) {
        this.field4115 = this.field4114.field7318.method2519(arg1 * 4);
        field4125++;
        if (arg0 >= 83) {
            this.field4108 = new NativeStream(this.field4115);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BIII)V", line = 23)
    public final void method1739(byte arg0, int arg1, int arg2, int arg3) {
        this.field4104[this.field4113.field6434 * arg1 + arg3] = class51.method379(this.field4104[this.field4113.field6434 * arg1 + arg3], 0x1 << arg2);
        if (arg0 >= 98) {
            field4126++;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I[II)V", line = 34)
    public final void method1740(int arg0, int[] arg1, int arg2) {
        field4120++;
        int var4 = 0;
        class156 var5 = class227.field3201;
        var5.field2018 = 0;
        if (this.field4114.field7350) {
            for (int var6 = 0; var6 < arg0; var6++) {
                int var7 = arg1[var6];
                short[] var8 = this.field4113.field1743[var7];
                int var9 = this.field4104[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var8.length > var11) {
                        if ((0x1 << var10++ & var9) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method961(var8[var11++] & 0xFFFF, 1608339368);
                            var4++;
                            var5.method961(var8[var11++] & 0xFFFF, 1608339368);
                            var5.method961(var8[var11++] & 0xFFFF, 1608339368);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg0; var12++) {
                int var13 = arg1[var12];
                short[] var14 = this.field4113.field1743[var13];
                int var15 = this.field4104[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var14.length > var17) {
                        if ((0x1 << var16++ & var15) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method988(var14[var17++] & 0xFFFF, -461070776);
                            var5.method988(var14[var17++] & 0xFFFF, arg2 ^ 0xE48461B7);
                            var4++;
                            var5.method988(var14[var17++] & 0xFFFF, -461070776);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 > 0) {
            this.field4119.method891(5123, arg2 ^ 0xFFFF11A7, var5.field2041, var5.field2018);
            this.field4114.method2861(this.field4118, arg2 ^ 0xDC42, this.field4113.field1775, this.field4113.field1774, this.field4113.field1781);
            this.field4114.method2873(this.field4111, (this.field4113.field1755 & 0x8) != 0, (this.field4113.field1755 & 0x7) != 0, -1);
            if (this.field4114.field7371) {
                this.field4114.method826(Integer.MAX_VALUE, this.field4112, this.field4117, this.field4124);
            }
            OpenGL.glMatrixMode(5890);
            OpenGL.glPushMatrix();
            OpenGL.glScalef(1.0F / this.field4122, 1.0F / this.field4122, 1.0F);
            OpenGL.glMatrixMode(5888);
            this.field4114.method2861(this.field4118, 9149, this.field4113.field1775, this.field4113.field1774, this.field4113.field1781);
            this.field4114.method2929(0, var4, 0, this.field4119, 4);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
        if (arg2 != 65535) {
            field4128 = false;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIF)V", line = 163)
    public final void method1741(int arg0, int arg1, int arg2, int arg3, float arg4) {
        if (this.field4111 != -1) {
            class118 var6 = this.field4114.field1695.method432(this.field4111, true);
            int var7 = var6.field1541 & 0xFF;
            if (var7 != 0 && var6.field1540 != 4) {
                int var8;
                if (arg3 < 0) {
                    var8 = 0;
                } else if (arg3 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg3 * 131586;
                }
                if (var7 == 256) {
                    arg2 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg2 = ((arg2 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg2 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field1542 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg2 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg2 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg2 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg2 = (var14 >> 8) + (var12 << 8 & 0xFF0059) + (var13 & 0xFF00);
            }
        }
        field4106++;
        if (arg4 != 1.0F) {
            int var15 = arg2 >> 16 & 0xFF;
            int var16 = (arg2 & 0xFF55) >> 8;
            int var17 = arg2 & 0xFF;
            int var18 = (int) ((float) var15 * arg4);
            int var19 = (int) ((float) var16 * arg4);
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
            int var20 = (int) ((float) var17 * arg4);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg2 = var20 | var19 << 8 | var18 << 16;
        }
        this.field4108.method2517(arg0 * 4);
        this.field4108.method2513((byte) (arg2 >> 16));
        this.field4108.method2513((byte) (arg2 >> 8));
        if (arg1 >= -127) {
            this.field4118 = null;
        }
        this.field4108.method2513((byte) arg2);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V", line = 276)
    public static void method1742(int arg0) {
        field4105 = null;
        if (arg0 >= 59) {
            field4110 = null;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIILeq;IIBII)V", line = 287)
    public static final void method1743(int arg0, int arg1, int arg2, class134 arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field4109++;
        class113 var9 = (class113) class478.method2795(arg7, arg8, arg4);
        if (arg6 >= -1) {
            return;
        }
        if (var9 != null) {
            class486 var10 = class114.field1471.method2132((byte) 121, var9.method369((byte) 101));
            int var11 = var9.method359(13228) & 0x3;
            int var12 = var9.method362((byte) -72);
            if (var10.field7069 == -1) {
                int var13 = arg0;
                if (var10.field7041 > 0) {
                    var13 = arg5;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg3.method754(arg1, -27659, 4, var13, arg2);
                    } else if (var11 == 1) {
                        arg3.method741(4, arg1, arg2, var13, 1);
                    } else if (var11 == 2) {
                        arg3.method754(arg1 + 3, -27659, 4, var13, arg2);
                    } else if (var11 == 3) {
                        arg3.method741(4, arg1, arg2 + 3, var13, 1);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg3.method801(-6625, 1, arg2, var13, arg1, 1);
                    } else if (var11 == 1) {
                        arg3.method801(-6625, 1, arg2, var13, arg1 + 3, 1);
                    } else if (var11 == 2) {
                        arg3.method801(-6625, 1, arg2 + 3, var13, arg1 + 3, 1);
                    } else if (var11 == 3) {
                        arg3.method801(-6625, 1, arg2 + 3, var13, arg1, 1);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg3.method741(4, arg1, arg2, var13, 1);
                    } else if (var11 == 1) {
                        arg3.method754(arg1 + 3, -27659, 4, var13, arg2);
                    } else if (var11 == 2) {
                        arg3.method741(4, arg1, arg2 + 3, var13, 1);
                    } else if (var11 == 3) {
                        arg3.method754(arg1, -27659, 4, var13, arg2);
                    }
                }
            } else {
                class216.method1331(arg3, arg1, arg2, 4820, var11, var10);
            }
        }
        class113 var14 = (class113) class124.method701(arg7, arg8, arg4, field4129 == null ? (field4129 = method1748("sq")) : field4129);
        if (var14 != null) {
            class486 var15 = class114.field1471.method2132((byte) 123, var14.method369((byte) 118));
            int var16 = var14.method359(13228) & 0x3;
            int var17 = var14.method362((byte) -72);
            if (var15.field7069 != -1) {
                class216.method1331(arg3, arg1, arg2, 4820, var16, var15);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field7041 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg3.method767(arg1 + 3, arg2, true, arg1, arg2 + 3, var18);
                } else {
                    arg3.method767(arg1 + 3, arg2 + 3, true, arg1, arg2, var18);
                }
            }
        }
        class113 var19 = (class113) class79.method515(arg7, arg8, arg4);
        if (var19 == null) {
            return;
        }
        class486 var20 = class114.field1471.method2132((byte) 122, var19.method369((byte) 39));
        int var21 = var19.method359(13228) & 0x3;
        if (var20.field7069 != -1) {
            class216.method1331(arg3, arg1, arg2, 4820, var21, var20);
            return;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lsq;III)J", line = 430)
    public static final long method1744(class113 arg0, int arg1, int arg2, int arg3) {
        field4127++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class486 var10 = class114.field1471.method2132((byte) 121, arg0.method369((byte) 110));
        if (arg1 != 0) {
            method1743(-117, 93, 44, null, 103, 4, (byte) -10, -17, -119);
        }
        long var11 = (long) (arg0.method362((byte) -72) | 0x10000 << 14 | arg2 << 7 | arg3 | arg0.method359(13228) << 20);
        if (var10.field7041 == 0) {
            var11 |= var8;
        }
        if (var10.field7065 == 1) {
            var11 |= var4;
        }
        if (var10.field7083) {
            var11 |= var6;
        }
        return var11 | (long) arg0.method369((byte) 33) << 32;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(II)V", line = 465)
    public final void method1745(int arg0, int arg1) {
        this.field4108.method2517(arg0 * 4 + 3);
        field4121++;
        if (arg1 > -87) {
            method1746((byte) -79);
        }
        this.field4108.method2513(-1);
    }

    @OriginalMember(owner = "client!io", name = "d", descriptor = "(B)V", line = 478)
    public static final void method1746(byte arg0) {
        field4116++;
        class79.field1108.field2018 = 0;
        class357.field5300 = null;
        class291.field4160 = 0;
        class309.field4507 = null;
        class116.field1499 = 0;
        class359.field5330 = 0;
        class13.field203 = null;
        class36.field563 = null;
        class234.field3288.field2018 = 0;
        class427.method2544((byte) 84);
        class78.method513(3671);
        if (arg0 >= -23) {
            method1742(-3);
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class262.field3742[var1] = null;
        }
        class415.field6145 = null;
        for (int var2 = 0; var2 < class504.field7697.length; var2++) {
            class139 var4 = class504.field7697[var2];
            if (var4 != null) {
                var4.field4222 = -1;
            }
        }
        class452.method2632((byte) 121);
        class306.field4454 = 1;
        class319.method1921(15508, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class61.field909[var3] = true;
        }
        class122.method694((byte) 72);
        class98.field1327 = null;
        class308.field4491 = 0L;
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(II)V", line = 533)
    public final void method1747(int arg0, int arg1) {
        this.field4108.method2516();
        if (arg0 >= -16) {
            field4105 = null;
        }
        field4107++;
        class511 var3 = this.field4114.method2862(arg1 * 4, false, 3, this.field4115, 4);
        this.field4118 = new class27(this.field4114, var3, 5121, 4, 0);
        this.field4115 = null;
        this.field4108 = null;
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lgb;IIIII)V", line = 555)
    public class288(class136 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4113 = arg0;
        this.field4124 = arg5;
        this.field4111 = arg1;
        this.field4104 = new int[this.field4113.field6436 * this.field4113.field6434];
        this.field4117 = arg4;
        this.field4114 = this.field4113.field1768;
        this.field4122 = arg2;
        this.field4112 = arg3;
        this.field4119 = new class142(this.field4114, 5123, null, 1);
    }
}
