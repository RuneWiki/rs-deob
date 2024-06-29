import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class373 extends class56 {

    @OriginalMember(owner = "client!mv", name = "E", descriptor = "I")
    private int field5229 = 4096;

    @OriginalMember(owner = "client!mv", name = "D", descriptor = "I")
    private int field5228 = 4096;

    @OriginalMember(owner = "client!mv", name = "G", descriptor = "I")
    private int field5231 = 4096;

    @OriginalMember(owner = "client!mv", name = "F", descriptor = "Lkk;")
    public static class188 field5230 = new class188(64);

    @OriginalMember(owner = "client!mv", name = "M", descriptor = "Leia;")
    public static class240 field5237 = class125.method846(0);

    @OriginalMember(owner = "client!mv", name = "P", descriptor = "Ljava/lang/String;")
    public static String field5240 = null;

    @OriginalMember(owner = "client!mv", name = "H", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!mv", name = "I", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!mv", name = "K", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!mv", name = "L", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!mv", name = "N", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!mv", name = "Q", descriptor = "I")
    public static int field5241;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mv", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field5242;

    @OriginalMember(owner = "client!mv", name = "J", descriptor = "[Lkba;")
    public static class105[] field5234;

    @OriginalMember(owner = "client!mv", name = "O", descriptor = "[[[Z")
    public static boolean[][][] field5239;

    // $FF: synthetic method
    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2351(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIIIIILha;II)V", line = 3)
    public static final void method2348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class58 arg6, int arg7, int arg8) {
        if (arg8 > -12) {
            method2349(21);
        }
        ++field5232;
        class706 var9 = (class706) class252.method1672(arg4, arg3, arg0);
        if (var9 != null) {
            class10 var10 = class612.field8588.method558((byte) 115, var9.method861((byte) -17));
            int var11 = 3 & var9.method865(30374);
            int var12 = var9.method868((byte) -10);
            if (~var10.field143 == 0) {
                int var13 = arg2;
                if (~var10.field207 < -1) {
                    var13 = arg5;
                }
                if (var12 == 0 || var12 == 2) {
                    if (~var11 != -1) {
                        if (~var11 == -2) {
                            arg6.method458(arg1, arg7, 8985, 4, var13);
                        } else if (~var11 != -3) {
                            if (~var11 == -4) {
                                arg6.method458(arg1, arg7 + 3, 8985, 4, var13);
                            }
                        } else {
                            arg6.method400(127, arg1 + 3, arg7, 4, var13);
                        }
                    } else {
                        arg6.method400(118, arg1, arg7, 4, var13);
                    }
                }
                if (~var12 == -4) {
                    if (var11 != 0) {
                        if (var11 != 1) {
                            if (var11 != 2) {
                                if (~var11 == -4) {
                                    arg6.method417(var13, arg1, arg7 + 3, (byte) 78, 1, 1);
                                }
                            } else {
                                arg6.method417(var13, arg1 + 3, arg7 + 3, (byte) 108, 1, 1);
                            }
                        } else {
                            arg6.method417(var13, arg1 - -3, arg7, (byte) 102, 1, 1);
                        }
                    } else {
                        arg6.method417(var13, arg1, arg7, (byte) 110, 1, 1);
                    }
                }
                if (~var12 == -3) {
                    if (~var11 == -1) {
                        arg6.method458(arg1, arg7, 8985, 4, var13);
                    } else if (var11 != 1) {
                        if (~var11 == -3) {
                            arg6.method458(arg1, arg7 + 3, 8985, 4, var13);
                        } else if (~var11 == -4) {
                            arg6.method400(119, arg1, arg7, 4, var13);
                        }
                    } else {
                        arg6.method400(126, arg1 + 3, arg7, 4, var13);
                    }
                }
            } else {
                class390.method2452(-65534, var11, arg7, arg6, arg1, var10);
            }
        }
        class706 var14 = (class706) class243.method1557(arg4, arg3, arg0, field5242 != null ? field5242 : (field5242 = method2351("ip")));
        if (var14 != null) {
            class10 var15 = class612.field8588.method558((byte) 112, var14.method861((byte) -17));
            int var16 = 3 & var14.method865(30374);
            int var17 = var14.method868((byte) -10);
            if (~var15.field143 != 0) {
                class390.method2452(-65534, var16, arg7, arg6, arg1, var15);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (~var15.field207 < -1) {
                    var18 = -1179648;
                }
                if (~var16 != -1 && var16 != 2) {
                    arg6.method410(89, arg7, arg7 + 3, arg1 + 3, var18, arg1);
                } else {
                    arg6.method410(127, arg7 - -3, arg7, arg1 + 3, var18, arg1);
                }
            }
        }
        class706 var19 = (class706) class434.method2639(arg4, arg3, arg0);
        if (var19 != null) {
            class10 var20 = class612.field8588.method558((byte) 109, var19.method861((byte) -17));
            int var21 = 3 & var19.method865(30374);
            if (~var20.field143 != 0) {
                class390.method2452(-65534, var21, arg7, arg6, arg1, var20);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "(I)V", line = 141)
    public static void method2349(int arg0) {
        if (arg0 != 4) {
            method2350(77);
        }
        field5234 = null;
        field5240 = null;
        field5237 = null;
        field5230 = null;
        field5239 = null;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILee;I)V", line = 155)
    public final void method6(int arg0, class675 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field5228 = arg1.method3757((byte) -65);
                }
            } else {
                this.field5229 = arg1.method3757((byte) -65);
            }
        } else {
            this.field5231 = arg1.method3757((byte) -65);
        }
        if (arg0 != 3731) {
            method2348(70, -113, 81, 69, 123, -73, (class58) null, 4, 99);
        }
        ++field5238;
    }

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "(I)V", line = 199)
    public static final void method2350(int arg0) {
        ++field5235;
        class388.method2442((long) class740.field10285, class268.field3831, -16448);
        if (class457.field6447 != -1) {
            class55.method359(class457.field6447, -118);
        }
        for (int var1 = 0; ~var1 > ~class540.field7565; ++var1) {
            if (class583.field8210[var1]) {
                class220.field2877[var1] = true;
            }
            class722.field10021[var1] = class583.field8210[var1];
            class583.field8210[var1] = false;
        }
        class74.field974 = class740.field10285;
        if (class457.field6447 != -1) {
            class540.field7565 = 0;
            class177.method1124((byte) -120);
        }
        class268.field3831.method424();
        class603.method3386(class268.field3831, -16711936);
        int var2 = class346.method2240(false);
        if (~var2 == 0) {
            var2 = class86.field1057;
        }
        if (var2 == -1) {
            var2 = class519.field7376;
        }
        if (arg0 > -74) {
            method2350(-107);
        }
        class385.method2437(var2, (byte) -39);
        class144.field2064 = 0;
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "()V", line = 251)
    public class373() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)[[I", line = 263)
    public final int[][] method5(int arg0, int arg1) {
        if (arg1 != 1) {
            method2349(-78);
        }
        ++field5233;
        int[][] var3 = super.field668.method3009(0, arg0);
        if (super.field668.field7292) {
            int[][] var4 = this.method369(arg0, 52, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class328.field4576 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && ~var13 == ~var14) {
                    var8[var11] = this.field5231 * var12 >> 12;
                    var9[var11] = this.field5229 * var13 >> 12;
                    var10[var11] = this.field5228 * var14 >> 12;
                } else {
                    var8[var11] = this.field5231;
                    var9[var11] = this.field5229;
                    var10[var11] = this.field5228;
                }
            }
        }
        return var3;
    }
}
