import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class215 extends class376 {

    @OriginalMember(owner = "client!hp", name = "D", descriptor = "Leh;")
    public static class242 field3075 = new class242(14, 1);

    @OriginalMember(owner = "client!hp", name = "N", descriptor = "Leh;")
    public static class242 field3084 = new class242(15, 4);

    @OriginalMember(owner = "client!hp", name = "P", descriptor = "Leh;")
    public static class242 field3086 = new class242(16, -2);

    @OriginalMember(owner = "client!hp", name = "Q", descriptor = "Leh;")
    public static class242 field3087 = new class242(17, 0);

    @OriginalMember(owner = "client!hp", name = "R", descriptor = "Leh;")
    public static class242 field3088 = new class242(18, -2);

    @OriginalMember(owner = "client!hp", name = "S", descriptor = "Leh;")
    public static class242 field3089 = new class242(20, 6);

    @OriginalMember(owner = "client!hp", name = "T", descriptor = "Leh;")
    public static class242 field3090 = new class242(21, 8);

    @OriginalMember(owner = "client!hp", name = "U", descriptor = "Leh;")
    public static class242 field3091 = new class242(22, -2);

    @OriginalMember(owner = "client!hp", name = "V", descriptor = "Leh;")
    public static class242 field3092 = new class242(23, 4);

    @OriginalMember(owner = "client!hp", name = "X", descriptor = "Leh;")
    public static class242 field3093 = new class242(24, -1);

    @OriginalMember(owner = "client!hp", name = "Y", descriptor = "[Leh;")
    private static class242[] field3094 = new class242[32];

    @OriginalMember(owner = "client!hp", name = "Z", descriptor = "Lgk;")
    public static class331 field3095;

    @OriginalMember(owner = "client!hp", name = "ab", descriptor = "Lgk;")
    public static class331 field3096;

    @OriginalMember(owner = "client!hp", name = "bb", descriptor = "J")
    public static long field3097;

    @OriginalMember(owner = "client!hp", name = "cb", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!hp", name = "y", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!hp", name = "z", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!hp", name = "A", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!hp", name = "B", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!hp", name = "C", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!hp", name = "E", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!hp", name = "F", descriptor = "I")
    public int field3077;

    @OriginalMember(owner = "client!hp", name = "G", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!hp", name = "H", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!hp", name = "J", descriptor = "I")
    public int field3081;

    @OriginalMember(owner = "client!hp", name = "L", descriptor = "I")
    public int field3082;

    @OriginalMember(owner = "client!hp", name = "M", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!hp", name = "O", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!hp", name = "db", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!hp", name = "eb", descriptor = "Lph;")
    public static class454 field3100;

    @OriginalMember(owner = "client!hp", name = "I", descriptor = "Ljava/lang/String;")
    public String field3080;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method1464(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 != -1) {
            field3090 = null;
        }
        ++field3071;
        long var6 = (long) (arg3 | (arg5 ? Integer.MIN_VALUE : 0));
        class110 var8 = (class110) class126.field1841.method875(var6, 125);
        if (var8 == null) {
            var8 = new class110();
            class126.field1841.method878(var6, arg2 ^ 2300, var8);
        }
        if (var8.field1558.length <= arg0) {
            int[] var9 = new int[arg0 - -1];
            int[] var10 = new int[arg0 - -1];
            for (int var11 = 0; var11 < var8.field1558.length; ++var11) {
                var9[var11] = var8.field1558[var11];
                var10[var11] = var8.field1555[var11];
            }
            for (int var12 = var8.field1558.length; var12 < arg0; ++var12) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field1558 = var9;
            var8.field1555 = var10;
        }
        var8.field1558[arg0] = arg1;
        var8.field1555[arg0] = arg4;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
    public final void method1465(int arg0) {
        super.field5561 |= Long.MIN_VALUE;
        if (arg0 == -25852) {
            ++field3073;
            if (~this.method1472(arg0 + 24690) == -1L) {
                class334.field4636.method536(11, this);
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZC)B")
    public static final byte method1466(boolean arg0, char arg1) {
        if (!arg0) {
            method1471(-30, (byte) 88);
        }
        ++field3072;
        byte var2;
        if ((arg1 <= 0 || ~arg1 <= -129) && (~arg1 > -161 || ~arg1 < -256)) {
            if (arg1 != 8364) {
                if (~arg1 == -8219) {
                    var2 = -126;
                } else if (~arg1 == -403) {
                    var2 = -125;
                } else if (arg1 != 8222) {
                    if (~arg1 != -8231) {
                        if (~arg1 != -8225) {
                            if (arg1 != 8225) {
                                if (~arg1 != -711) {
                                    if (~arg1 != -8241) {
                                        if (~arg1 == -353) {
                                            var2 = -118;
                                        } else if (~arg1 == -8250) {
                                            var2 = -117;
                                        } else if (~arg1 != -339) {
                                            if (arg1 != 381) {
                                                if (arg1 != 8216) {
                                                    if (arg1 == 8217) {
                                                        var2 = -110;
                                                    } else if (~arg1 != -8221) {
                                                        if (arg1 != 8221) {
                                                            if (~arg1 == -8227) {
                                                                var2 = -107;
                                                            } else if (arg1 == 8211) {
                                                                var2 = -106;
                                                            } else if (arg1 == 8212) {
                                                                var2 = -105;
                                                            } else if (~arg1 == -733) {
                                                                var2 = -104;
                                                            } else if (arg1 != 8482) {
                                                                if (arg1 == 353) {
                                                                    var2 = -102;
                                                                } else if (arg1 == 8250) {
                                                                    var2 = -101;
                                                                } else if (~arg1 == -340) {
                                                                    var2 = -100;
                                                                } else if (~arg1 == -383) {
                                                                    var2 = -98;
                                                                } else if (~arg1 == -377) {
                                                                    var2 = -97;
                                                                } else {
                                                                    var2 = 63;
                                                                }
                                                            } else {
                                                                var2 = -103;
                                                            }
                                                        } else {
                                                            var2 = -108;
                                                        }
                                                    } else {
                                                        var2 = -109;
                                                    }
                                                } else {
                                                    var2 = -111;
                                                }
                                            } else {
                                                var2 = -114;
                                            }
                                        } else {
                                            var2 = -116;
                                        }
                                    } else {
                                        var2 = -119;
                                    }
                                } else {
                                    var2 = -120;
                                }
                            } else {
                                var2 = -121;
                            }
                        } else {
                            var2 = -122;
                        }
                    } else {
                        var2 = -123;
                    }
                } else {
                    var2 = -124;
                }
            } else {
                var2 = -128;
            }
        } else {
            var2 = (byte) arg1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "(B)I")
    public final int method1467(byte arg0) {
        ++field3079;
        int var2 = -104 / ((42 - arg0) / 46);
        return (int) (255L & super.field3271 >>> 32);
    }

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "(I)J")
    public static final long method1468(int arg0) {
        int var1 = -36 / ((-53 - arg0) / 56);
        ++field3076;
        return class120.field1679.method921((byte) -53);
    }

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "(B)V")
    public final void method1469(byte arg0) {
        ++field3078;
        super.field5561 = class437.method2644(-55) - -500L | Long.MIN_VALUE & super.field5561;
        class526.field7730.method536(-126, this);
        if (arg0 >= -44) {
            field3075 = null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "(B)I")
    public final int method1470(byte arg0) {
        ++field3085;
        return arg0 != -10 ? -105 : (int) super.field3271;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IB)V")
    public static final void method1471(int arg0, byte arg1) {
        ++field3074;
        int var2 = class263.field3867 - class306.field4343;
        if (var2 >= 100) {
            class462.field6802 = 1;
        } else {
            int var3 = (int) class386.field5687;
            if (class67.field869 >> 8 > var3) {
                var3 = class67.field869 >> 8;
            }
            if (class173.field2456[4] && ~(class200.field2935[4] + 128) < ~var3) {
                var3 = class200.field2935[4] + 128;
            }
            int var4 = 16383 & (int) class328.field4588 + class148.field2073;
            class73.method692(0, class231.field3380, (var3 >> 3) * 3 + 600 << 0, class49.field537, var4, -50 + class66.method643(class435.field6375.field6335, 46, class525.field7714, class435.field6375.field6334), arg0, var3);
            float var5 = -((float) ((-var2 + 100) * (-var2 + 100) * (100 - var2)) / 1000000.0F) + 1.0F;
            class486.field7138 = (int) ((float) (-class226.field3304 + class486.field7138) * var5 + (float) class226.field3304);
            if (arg1 != 24) {
                field3086 = null;
            }
            class487.field7162 = (int) ((float) (-class400.field5930 + class487.field7162) * var5 + (float) class400.field5930);
            class321.field4529 = (int) ((float) (-class178.field2512 + class321.field4529) * var5 + (float) class178.field2512);
            class161.field2268 = (int) ((float) (class161.field2268 - class181.field2544) * var5 + (float) class181.field2544);
            int var6 = -class182.field2581 + class316.field4503;
            if (~var6 >= -8193) {
                if (~var6 > 8191) {
                    var6 += 16384;
                }
            } else {
                var6 -= 16384;
            }
            class316.field4503 = (int) ((float) var6 * var5 + (float) class182.field2581);
            class316.field4503 &= 16383;
        }
    }

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "(I)J")
    public final long method1472(int arg0) {
        if (arg0 != -1162) {
            this.field3082 = -22;
        }
        ++field3083;
        return super.field5561 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(II)V")
    public class215(int arg0, int arg1) {
        super.field3271 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "(B)V")
    public static void method1473(byte arg0) {
        field3086 = null;
        field3087 = null;
        field3095 = null;
        field3100 = null;
        field3089 = null;
        field3075 = null;
        field3084 = null;
        field3092 = null;
        field3091 = null;
        field3090 = null;
        field3088 = null;
        field3094 = null;
        if (arg0 == 2) {
            field3096 = null;
            field3093 = null;
        }
    }

    static {
        class242[] var0 = class154.method1093(true);
        for (int var1 = 0; ~var0.length < ~var1; ++var1) {
            field3094[var0[var1].field3575] = var0[var1];
        }
        field3095 = new class331("green:", "grün:", "vert:", "verde:");
        field3096 = new class331("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");
        field3097 = 0L;
        field3098 = 0;
    }
}
