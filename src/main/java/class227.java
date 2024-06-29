import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class227 extends class71 implements class176 {

    @OriginalMember(owner = "client!mv", name = "k", descriptor = "I")
    private int field3264;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "[I")
    public static int[] field3257 = new int[4];

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
    public static int field3258 = 0;

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "I")
    public static int field3261 = 0;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!mv", name = "i", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!mv", name = "j", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!mv", name = "l", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!mv", name = "m", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "(I)I")
    public final int method1269(int arg0) {
        ++field3260;
        int var2 = -108 / ((arg0 - -36) / 34);
        return this.field3264;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(III[B)V")
    public final void method1270(int arg0, int arg1, int arg2, byte[] arg3) {
        this.method482(arg3, arg0);
        int var5 = 17 / ((-65 - arg1) / 49);
        ++field3262;
        this.field3264 = arg2;
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)J")
    public final long method1268(int arg0) {
        ++field3266;
        return arg0 != 32127 ? -1L : super.field975.method148();
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(BC)B")
    public static final byte method1559(byte arg0, char arg1) {
        ++field3265;
        byte var2;
        if ((arg1 <= 0 || ~arg1 <= -129) && (arg1 < 160 || arg1 > 255)) {
            if (arg1 != 8364) {
                if (~arg1 == -8219) {
                    var2 = -126;
                } else if (arg1 != 402) {
                    if (arg1 == 8222) {
                        var2 = -124;
                    } else if (~arg1 != -8231) {
                        if (~arg1 == -8225) {
                            var2 = -122;
                        } else if (~arg1 == -8226) {
                            var2 = -121;
                        } else if (arg1 != 710) {
                            if (~arg1 != -8241) {
                                if (arg1 == 352) {
                                    var2 = -118;
                                } else if (arg1 != 8249) {
                                    if (arg1 == 338) {
                                        var2 = -116;
                                    } else if (~arg1 == -382) {
                                        var2 = -114;
                                    } else if (~arg1 != -8217) {
                                        if (arg1 == 8217) {
                                            var2 = -110;
                                        } else if (arg1 == 8220) {
                                            var2 = -109;
                                        } else if (~arg1 == -8222) {
                                            var2 = -108;
                                        } else if (arg1 == 8226) {
                                            var2 = -107;
                                        } else if (~arg1 == -8212) {
                                            var2 = -106;
                                        } else if (~arg1 != -8213) {
                                            if (~arg1 == -733) {
                                                var2 = -104;
                                            } else if (arg1 != 8482) {
                                                if (~arg1 == -354) {
                                                    var2 = -102;
                                                } else if (arg1 == 8250) {
                                                    var2 = -101;
                                                } else if (arg1 != 339) {
                                                    if (arg1 != 382) {
                                                        if (~arg1 != -377) {
                                                            var2 = 63;
                                                        } else {
                                                            var2 = -97;
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
                                            var2 = -105;
                                        }
                                    } else {
                                        var2 = -111;
                                    }
                                } else {
                                    var2 = -117;
                                }
                            } else {
                                var2 = -119;
                            }
                        } else {
                            var2 = -120;
                        }
                    } else {
                        var2 = -123;
                    }
                } else {
                    var2 = -125;
                }
            } else {
                var2 = -128;
            }
        } else {
            var2 = (byte) arg1;
        }
        return arg0 != -79 ? 77 : var2;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)I")
    public final int method1267(int arg0) {
        if (arg0 != 32675) {
            field3261 = -108;
        }
        ++field3256;
        return 0;
    }

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "(I)V")
    public static void method1560(int arg0) {
        if (arg0 != -354) {
            method1559((byte) -38, (char) 65467);
        }
        field3257 = null;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IILtl;)Ljava/lang/String;")
    public static final String method1561(int arg0, int arg1, class91 arg2) {
        ++field3263;
        try {
            int var3 = arg2.method598(false);
            if (var3 > arg1) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg2.field1292 += class527.field7780.method1652(0, 0, var3, var4, arg2.field1292, arg2.field1277);
            return class424.method2552(var4, arg0, var3, true);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1562(String arg0, int arg1) {
        ++field3259;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; ~var4 > ~var2; ++var4) {
            char var8 = arg0.charAt(var4);
            if (~var8 == -61 || ~var8 == -63) {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 - -var3);
        if (arg1 < 85) {
            return null;
        } else {
            for (int var6 = 0; var6 < var2; ++var6) {
                char var7 = arg0.charAt(var6);
                if (~var7 == -61) {
                    var5.append("<lt>");
                } else if (~var7 != -63) {
                    var5.append(var7);
                } else {
                    var5.append("<gt>");
                }
            }
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lbv;I[BI)V")
    public class227(class282 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field3264 = arg1;
    }
}
