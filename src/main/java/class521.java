import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class521 extends class260 {

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Z")
    public static boolean field7151 = false;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "S")
    public static short field7158 = 32767;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "Lln;")
    public static class400 field7150 = new class400();

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field7148;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public static int field7152;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field7153;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field7154;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field7155;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public static int field7156;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public static int field7157;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)I")
    public final int method4(int arg0, byte arg1) {
        int var3 = -108 % ((arg1 - -53) / 50);
        ++field7152;
        return 1;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IC)B")
    public static final byte method3010(int arg0, char arg1) {
        ++field7153;
        if (arg0 > -98) {
            return 89;
        } else {
            byte var2;
            if ((~arg1 >= -1 || arg1 >= 128) && (~arg1 > -161 || arg1 > 255)) {
                if (~arg1 != -8365) {
                    if (~arg1 != -8219) {
                        if (~arg1 != -403) {
                            if (arg1 != 8222) {
                                if (~arg1 == -8231) {
                                    var2 = -123;
                                } else if (arg1 == 8224) {
                                    var2 = -122;
                                } else if (arg1 == 8225) {
                                    var2 = -121;
                                } else if (arg1 == 710) {
                                    var2 = -120;
                                } else if (arg1 == 8240) {
                                    var2 = -119;
                                } else if (arg1 != 352) {
                                    if (arg1 == 8249) {
                                        var2 = -117;
                                    } else if (~arg1 != -339) {
                                        if (~arg1 == -382) {
                                            var2 = -114;
                                        } else if (arg1 == 8216) {
                                            var2 = -111;
                                        } else if (~arg1 != -8218) {
                                            if (~arg1 == -8221) {
                                                var2 = -109;
                                            } else if (~arg1 == -8222) {
                                                var2 = -108;
                                            } else if (~arg1 != -8227) {
                                                if (arg1 == 8211) {
                                                    var2 = -106;
                                                } else if (arg1 == 8212) {
                                                    var2 = -105;
                                                } else if (arg1 != 732) {
                                                    if (arg1 != 8482) {
                                                        if (~arg1 == -354) {
                                                            var2 = -102;
                                                        } else if (arg1 == 8250) {
                                                            var2 = -101;
                                                        } else if (~arg1 != -340) {
                                                            if (~arg1 != -383) {
                                                                if (arg1 == 376) {
                                                                    var2 = -97;
                                                                } else {
                                                                    var2 = 63;
                                                                }
                                                            } else {
                                                                var2 = -98;
                                                            }
                                                        } else {
                                                            var2 = -100;
                                                        }
                                                    } else {
                                                        var2 = -103;
                                                    }
                                                } else {
                                                    var2 = -104;
                                                }
                                            } else {
                                                var2 = -107;
                                            }
                                        } else {
                                            var2 = -110;
                                        }
                                    } else {
                                        var2 = -116;
                                    }
                                } else {
                                    var2 = -118;
                                }
                            } else {
                                var2 = -124;
                            }
                        } else {
                            var2 = -125;
                        }
                    } else {
                        var2 = -126;
                    }
                } else {
                    var2 = -128;
                }
            } else {
                var2 = (byte) arg1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(IB)V")
    public final void method9(int arg0, byte arg1) {
        if (arg1 != -107) {
            this.method4(-78, (byte) 84);
        }
        ++field7157;
        super.field3868 = arg0;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)I")
    public final int method8(byte arg0) {
        ++field7148;
        if (arg0 != 4) {
            this.method2(true);
        }
        return 1;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(ILfca;)V")
    public class521(int arg0, class92 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
    public final void method2(boolean arg0) {
        if (super.field3868 != 1 && ~super.field3868 != -1) {
            super.field3868 = this.method8((byte) 4);
        }
        if (arg0) {
            method3010(29, '4');
        }
        ++field7149;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lfca;)V")
    public class521(class92 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)I")
    public final int method3011(int arg0) {
        if (arg0 < 3) {
            this.method9(109, (byte) 126);
        }
        ++field7154;
        return super.field3868;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZIILkp;)Z")
    public static final boolean method3012(int arg0, boolean arg1, int arg2, int arg3, class516 arg4) {
        ++field7156;
        if (class522.field7164 && class791.field10882) {
            if (class592.field7964 < 100) {
                return false;
            } else if (!class267.method1744(arg2, arg0, arg3, 19322)) {
                return false;
            } else {
                int var5 = arg2 << class26.field388;
                int var6 = arg0 << class26.field388;
                int var7 = class528.field7227[arg3].method1880(arg2, arg1, arg0) + -1;
                if (arg1) {
                    return false;
                } else {
                    int var8 = var7 - -arg4.method24(748449288);
                    if (~arg4.field7055 == -2) {
                        if (!class462.method2736(var7, var5, var8, var5, var5, var6, 1, var8, var6, class48.field722 + var6)) {
                            return false;
                        } else if (!class462.method2736(var7, var5, var7, var5, var5, var6, 1, var8, class48.field722 + var6, var6 - -class48.field722)) {
                            return false;
                        } else {
                            ++class639.field8883;
                            return true;
                        }
                    } else if (~arg4.field7055 == -3) {
                        if (!class462.method2736(var7, var5, var8, class48.field722 + var5, var5, class48.field722 + var6, 1, var8, class48.field722 + var6, class48.field722 + var6)) {
                            return false;
                        } else if (!class462.method2736(var7, class48.field722 + var5, var8, var5 - -class48.field722, var5, var6 - -class48.field722, 1, var7, class48.field722 + var6, var6 - -class48.field722)) {
                            return false;
                        } else {
                            ++class639.field8883;
                            return true;
                        }
                    } else if (~arg4.field7055 == -5) {
                        if (!class462.method2736(var7, class48.field722 + var5, var8, class48.field722 + var5, class48.field722 + var5, var6, 1, var8, var6, var6 - -class48.field722)) {
                            return false;
                        } else if (!class462.method2736(var7, class48.field722 + var5, var7, class48.field722 + var5, class48.field722 + var5, var6, 1, var8, class48.field722 + var6, class48.field722 + var6)) {
                            return false;
                        } else {
                            ++class639.field8883;
                            return true;
                        }
                    } else if (arg4.field7055 == 8) {
                        if (!class462.method2736(var7, var5, var8, class48.field722 + var5, var5, var6, 1, var8, var6, var6)) {
                            return false;
                        } else if (!class462.method2736(var7, class48.field722 + var5, var8, class48.field722 + var5, var5, var6, 1, var7, var6, var6)) {
                            return false;
                        } else {
                            ++class639.field8883;
                            return true;
                        }
                    } else if (~arg4.field7055 == -17) {
                        if (!class600.method3337(var7, var8, class30.field464, class30.field464, -7515, class30.field464 + var6, var5)) {
                            return false;
                        } else {
                            ++class639.field8883;
                            return true;
                        }
                    } else if (arg4.field7055 == 32) {
                        if (!class600.method3337(var7, var8, class30.field464, class30.field464, -7515, class30.field464 + var6, var5 - -class30.field464)) {
                            return false;
                        } else {
                            ++class639.field8883;
                            return true;
                        }
                    } else if (arg4.field7055 == 64) {
                        if (!class600.method3337(var7, var8, class30.field464, class30.field464, -7515, var6, class30.field464 + var5)) {
                            return false;
                        } else {
                            ++class639.field8883;
                            return true;
                        }
                    } else if (arg4.field7055 == 128) {
                        if (!class600.method3337(var7, var8, class30.field464, class30.field464, -7515, var6, var5)) {
                            return false;
                        } else {
                            ++class639.field8883;
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[FI)[F")
    public static final float[] method3013(int arg0, float[] arg1, int arg2) {
        ++field7155;
        if (arg0 != 9912) {
            return null;
        } else {
            float[] var3 = new float[arg2];
            class278.method1795(arg1, 0, var3, 0, arg2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(Z)V")
    public static void method3014(boolean arg0) {
        if (!arg0) {
            method3013(7, (float[]) null, -84);
        }
        field7150 = null;
    }
}
