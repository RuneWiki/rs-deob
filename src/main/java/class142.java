import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class142 extends class545 {

    @OriginalMember(owner = "client!hv", name = "u", descriptor = "Lur;")
    private class617 field1931;

    @OriginalMember(owner = "client!hv", name = "z", descriptor = "Leaa;")
    private class380 field1936;

    @OriginalMember(owner = "client!hv", name = "t", descriptor = "Z")
    private boolean field1930;

    @OriginalMember(owner = "client!hv", name = "q", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!hv", name = "s", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!hv", name = "v", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!hv", name = "w", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!hv", name = "x", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!hv", name = "y", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!hv", name = "A", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!hv", name = "B", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!hv", name = "C", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!hv", name = "r", descriptor = "Z")
    private boolean field1928;

    @OriginalMember(owner = "client!hv", name = "D", descriptor = "[Lg;")
    public static class592[] field1940;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BZ)V")
    public final void method457(byte arg0, boolean arg1) {
        ++field1939;
        if (arg0 > 101) {
            class245 var3 = super.field7920.method385(3);
            if (this.field1930 && var3 != null) {
                super.field7920.method208(8, 1);
                super.field7920.method264(var3, -2);
                super.field7920.method208(8, 0);
                super.field7920.method264(this.field1931.field8788, -2);
                long var4 = this.field1936.field5517;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field7920.field609[0], -super.field7920.field609[1], -super.field7920.field609[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field7920.field541, super.field7920.field552, super.field7920.field549, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field7920.field609[1]) * 928.0F + 96.0F);
                this.field1928 = true;
            }
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
    public final void method452(int arg0) {
        if (this.field1928) {
            super.field7920.method208(arg0 ^ 10, 1);
            super.field7920.method264((class101) null, -2);
            super.field7920.method208(8, 0);
            super.field7920.method264((class101) null, -2);
            OpenGL.glUseProgramObjectARB(0L);
            this.field1928 = false;
        }
        if (arg0 == 2) {
            ++field1938;
        }
    }

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "(I)V")
    public static void method999(int arg0) {
        if (arg0 != -27018) {
            method1000(1);
        }
        field1940 = null;
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)Z")
    public final boolean method459(int arg0) {
        ++field1932;
        if (arg0 < 63) {
            this.method454(false, false);
        }
        return this.field1930;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(III)V")
    public final void method451(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            method1001(-78);
        }
        ++field1934;
        if (this.field1928) {
            int var4 = 1 << (3 & arg2);
            float var5 = (float) (1 << ((arg2 & 57) >> 3)) / 32.0F;
            int var6 = arg1 & 65535;
            float var7 = (float) ((arg1 & 254108) >> 16) / 8.0F;
            long var8 = this.field1936.field5517;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field7920.field585 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
    }

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "(I)V")
    public static final void method1000(int arg0) {
        class301.field4129.method364(class710.field10013);
        ++field1935;
        int var1 = -40 / ((arg0 - -39) / 44);
        class301.field4129.method398(class758.field10553, class513.field7432, class660.field9436, class549.field7978);
    }

    @OriginalMember(owner = "client!hv", name = "k", descriptor = "(I)V")
    public static final void method1001(int arg0) {
        if (arg0 != 35633) {
            field1940 = null;
        }
        ++field1929;
        if (~class243.field3580.field7986.method185(false) == -3) {
            byte var1 = (byte) (255 & class444.field6347 - 4);
            int var2 = class444.field6347 % class184.field2546;
            for (int var3 = 0; ~var3 > -5; ++var3) {
                for (int var18 = 0; ~class240.field3555 < ~var18; ++var18) {
                    class651.field9345[var3][var2][var18] = var1;
                }
            }
            if (~class687.field9758 != -4) {
                for (int var4 = 0; ~var4 > -3; ++var4) {
                    class192.field2820[var4] = -1000000;
                    class403.field5757[var4] = 1000000;
                    class721.field10155[var4] = 0;
                    class738.field10308[var4] = 1000000;
                    class726.field10208[var4] = 0;
                }
                int var5 = class108.field1536.field3923;
                int var6 = class108.field1536.field3916;
                if (~class165.field2351 != -2 && class539.field7824 == -1) {
                    int var7 = class530.method3211(class123.field1698, arg0 + -35631, class518.field7473, class687.field9758);
                    if (-class564.field8174 + var7 < 3200 && ~(class160.field2297[class687.field9758][class518.field7473 >> 9][class123.field1698 >> 9] & 4) != -1) {
                        class716.method4025(class565.field8185, class518.field7473 >> 9, false, class123.field1698 >> 9, 1, true);
                        return;
                    }
                } else {
                    if (class165.field2351 != 1) {
                        var6 = class616.field8773;
                        var5 = class539.field7824;
                    }
                    if (~(class160.field2297[class687.field9758][var5 >> 9][var6 >> 9] & 4) != -1) {
                        class716.method4025(class565.field8185, var5 >> 9, false, var6 >> 9, 0, true);
                    }
                    if (class279.field3904 < 2560) {
                        int var8 = class518.field7473 >> 9;
                        int var9 = class123.field1698 >> 9;
                        int var10 = var5 >> 9;
                        int var11 = var6 >> 9;
                        int var12;
                        if (var8 < var10) {
                            var12 = -var8 + var10;
                        } else {
                            var12 = -var10 + var8;
                        }
                        int var13;
                        if (var11 <= var9) {
                            var13 = var9 - var11;
                        } else {
                            var13 = var11 - var9;
                        }
                        if ((var12 != 0 || ~var13 != -1) && var12 > -class184.field2546 && var12 < class184.field2546 && var13 > -class240.field3555 && var13 < class240.field3555) {
                            if (var13 >= var12) {
                                int var14 = var12 * 65536 / var13;
                                int var15 = 32768;
                                while (var9 != var11) {
                                    if (~var9 <= ~var11) {
                                        if (var9 > var11) {
                                            --var9;
                                        }
                                    } else {
                                        ++var9;
                                    }
                                    if (~(4 & class160.field2297[class687.field9758][var8][var9]) != -1) {
                                        class716.method4025(class565.field8185, var8, false, var9, 1, true);
                                        return;
                                    }
                                    var15 += var14;
                                    if (var15 >= 65536) {
                                        if (~var8 > ~var10) {
                                            ++var8;
                                        } else if (~var8 < ~var10) {
                                            --var8;
                                        }
                                        var15 -= 65536;
                                        if ((4 & class160.field2297[class687.field9758][var8][var9]) != 0) {
                                            class716.method4025(class565.field8185, var8, false, var9, 1, true);
                                            return;
                                        }
                                    }
                                }
                                return;
                            }
                            int var16 = var13 * 65536 / var12;
                            int var17 = 32768;
                            while (~var8 != ~var10) {
                                if (var8 < var10) {
                                    ++var8;
                                } else if (~var8 < ~var10) {
                                    --var8;
                                }
                                if (~(4 & class160.field2297[class687.field9758][var8][var9]) != -1) {
                                    class716.method4025(class565.field8185, var8, false, var9, 1, true);
                                    return;
                                }
                                var17 += var16;
                                if (var17 >= 65536) {
                                    if (var11 <= var9) {
                                        if (~var11 > ~var9) {
                                            --var9;
                                        }
                                    } else {
                                        ++var9;
                                    }
                                    var17 -= 65536;
                                    if ((class160.field2297[class687.field9758][var8][var9] & 4) != 0) {
                                        class716.method4025(class565.field8185, var8, false, var9, 1, true);
                                        return;
                                    }
                                }
                            }
                            return;
                        }
                        class705.method3952("RC: " + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class41.field693 + "," + class71.field1085, (Throwable) null, arg0 ^ -65514);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IILec;)V")
    public final void method455(int arg0, int arg1, class101 arg2) {
        if (arg0 == 2) {
            ++field1933;
            if (!this.field1928) {
                super.field7920.method264(arg2, arg0 + -4);
                super.field7920.method411(17024, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lmba;Lla;Lur;)V")
    public class142(class643 arg0, class423 arg1, class617 arg2) {
        super(arg0);
        this.field1931 = arg2;
        if (arg1 != null && arg0.field9250 && arg0.field9251) {
            class402 var4 = class469.method2836(arg0, -2, 35633, arg1.method2591("gl", (byte) 71, "environment_mapped_water_v"));
            class402 var5 = class469.method2836(arg0, -2, 35632, arg1.method2591("gl", (byte) 71, "environment_mapped_water_f"));
            this.field1936 = class46.method449(new class402[] { var4, var5 }, -122, arg0);
            this.field1930 = this.field1936 != null && this.field1931.method3583((byte) 26);
        } else {
            this.field1930 = false;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ZZ)V")
    public final void method454(boolean arg0, boolean arg1) {
        ++field1937;
        if (arg1) {
            method1000(-45);
        }
    }
}
