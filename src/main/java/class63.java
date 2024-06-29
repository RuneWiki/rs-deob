import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class63 extends class601 {

    @OriginalMember(owner = "client!dl", name = "E", descriptor = "Z")
    public static boolean field769 = false;

    @OriginalMember(owner = "client!dl", name = "J", descriptor = "Lro;")
    public static class2 field774 = new class2();

    @OriginalMember(owner = "client!dl", name = "K", descriptor = "[I")
    public static int[] field775 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!dl", name = "C", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!dl", name = "D", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!dl", name = "F", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!dl", name = "G", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!dl", name = "H", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!dl", name = "I", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V", line = 6)
    public static void method542(byte arg0) {
        field775 = null;
        field774 = null;
        if (arg0 != -67) {
            method544(-109, -4, -3, 0, -22, 73, 57, -90, (byte) 69, 124);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lee;BI)V", line = 20)
    public final void method6(class677 arg0, byte arg1, int arg2) {
        if (arg1 != -61) {
            field775 = null;
        }
        if (~arg2 == -1) {
            super.field7897 = arg0.method3821((byte) 94) == 1;
        }
        ++field767;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILjava/awt/Canvas;)V", line = 34)
    public static final void method543(int arg0, Canvas arg1) {
        ++field772;
        Dimension var2 = arg1.getSize();
        class640.method3501(27424, var2.height, var2.width);
        if (class410.field5681 != arg0) {
            class45.field585.method395(arg1, class640.field8484, class394.field5491);
        } else {
            class45.field585.method395(arg1, class425.field5857, class195.field2938);
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(IZ)[[I", line = 49)
    public final int[][] method7(int arg0, boolean arg1) {
        ++field768;
        if (!arg1) {
            this.method6((class677) null, (byte) 88, 101);
        }
        int[][] var3 = super.field7890.method3963(1, arg0);
        if (super.field7890.field9769) {
            int[] var4 = this.method3266((byte) 64, arg0, 2);
            int[][] var5 = this.method3268(arg0, 0, 65535);
            int[][] var6 = this.method3268(arg0, 1, 65535);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~class171.field2624 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (~var17 == -1) {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                } else {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIIIIBI)V", line = 129)
    public static final void method544(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        if (~arg4 == ~arg7 && arg1 == arg2 && arg3 == arg6 && ~arg0 == ~arg9) {
            class495.method2793(arg6, arg5, arg2, (byte) 64, arg0, arg7);
        } else {
            int var10 = arg7;
            int var11 = arg2;
            int var12 = arg7 * 3;
            int var13 = arg2 * 3;
            int var14 = arg4 * 3;
            int var15 = arg1 * 3;
            int var16 = arg3 * 3;
            int var17 = arg9 * 3;
            int var18 = -arg7 + arg6 - (-var14 + var16);
            int var19 = -var17 + arg0 + var15 + -arg2;
            int var20 = -var14 + var16 + -var14 + var12;
            int var21 = var13 + var17 - (var15 + var15);
            int var22 = -var12 + var14;
            int var23 = -var13 + var15;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = arg7 - -(var27 + var29 + var31 >> 12);
                int var34 = arg2 - -(var28 + var30 + var32 >> 12);
                class495.method2793(var33, arg5, var11, (byte) 95, var34, var10);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg8 == 100) {
            ++field770;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI)[I", line = 204)
    public final int[] method5(byte arg0, int arg1) {
        ++field773;
        if (arg0 != -40) {
            this.method7(73, true);
        }
        int[] var3 = super.field7902.method382(arg1, true);
        if (super.field7902.field704) {
            int[] var4 = this.method3266((byte) 64, arg1, 0);
            int[] var5 = this.method3266((byte) 64, arg1, 1);
            int[] var6 = this.method3266((byte) 64, arg1, 2);
            for (int var7 = 0; ~var7 > ~class171.field2624; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (~var8 == -1) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)Lgl;", line = 257)
    public static final class601 method545(int arg0, int arg1) {
        ++field771;
        if (arg0 != 128) {
            return null;
        } else if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    if (arg1 != 7) {
                                        if (~arg1 != -9) {
                                            if (arg1 != 9) {
                                                if (~arg1 != -11) {
                                                    if (arg1 != 11) {
                                                        if (arg1 != 12) {
                                                            if (~arg1 != -14) {
                                                                if (~arg1 != -15) {
                                                                    if (arg1 != 15) {
                                                                        if (arg1 != 16) {
                                                                            if (~arg1 != -18) {
                                                                                if (arg1 != 18) {
                                                                                    if (~arg1 != -20) {
                                                                                        if (arg1 != 20) {
                                                                                            if (arg1 != 21) {
                                                                                                if (arg1 != 22) {
                                                                                                    if (arg1 != 23) {
                                                                                                        if (arg1 != 24) {
                                                                                                            if (arg1 != 25) {
                                                                                                                if (arg1 != 26) {
                                                                                                                    if (arg1 != 27) {
                                                                                                                        if (arg1 != 28) {
                                                                                                                            if (arg1 != 29) {
                                                                                                                                if (arg1 != 30) {
                                                                                                                                    if (~arg1 != -32) {
                                                                                                                                        if (~arg1 != -33) {
                                                                                                                                            if (arg1 != 33) {
                                                                                                                                                if (arg1 != 34) {
                                                                                                                                                    if (arg1 != 35) {
                                                                                                                                                        if (arg1 != 36) {
                                                                                                                                                            if (~arg1 != -38) {
                                                                                                                                                                if (arg1 != 38) {
                                                                                                                                                                    return arg1 == 39 ? new class328() : null;
                                                                                                                                                                } else {
                                                                                                                                                                    return new class13();
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                return new class169();
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            return new class412();
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        return new class178();
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    return new class684();
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                return new class607();
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            return new class170();
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        return new class113();
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    return new class180();
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                return new class91();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            return new class96();
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        return new class657();
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    return new class250();
                                                                                                                }
                                                                                                            } else {
                                                                                                                return new class197();
                                                                                                            }
                                                                                                        } else {
                                                                                                            return new class600();
                                                                                                        }
                                                                                                    } else {
                                                                                                        return new class252();
                                                                                                    }
                                                                                                } else {
                                                                                                    return new class1();
                                                                                                }
                                                                                            } else {
                                                                                                return new class63();
                                                                                            }
                                                                                        } else {
                                                                                            return new class130();
                                                                                        }
                                                                                    } else {
                                                                                        return new class64();
                                                                                    }
                                                                                } else {
                                                                                    return new class588();
                                                                                }
                                                                            } else {
                                                                                return new class678();
                                                                            }
                                                                        } else {
                                                                            return new class436();
                                                                        }
                                                                    } else {
                                                                        return new class66();
                                                                    }
                                                                } else {
                                                                    return new class264();
                                                                }
                                                            } else {
                                                                return new class194();
                                                            }
                                                        } else {
                                                            return new class609();
                                                        }
                                                    } else {
                                                        return new class643();
                                                    }
                                                } else {
                                                    return new class682();
                                                }
                                            } else {
                                                return new class97();
                                            }
                                        } else {
                                            return new class411();
                                        }
                                    } else {
                                        return new class28();
                                    }
                                } else {
                                    return new class629();
                                }
                            } else {
                                return new class474();
                            }
                        } else {
                            return new class679();
                        }
                    } else {
                        return new class726();
                    }
                } else {
                    return new class44();
                }
            } else {
                return new class51();
            }
        } else {
            return new class167();
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V", line = 589)
    public class63() {
        super(3, false);
    }
}
