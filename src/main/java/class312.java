import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class312 {

    @OriginalMember(owner = "client!eo", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5116 = new String[] { method2682(method2681(" \u00112%E")), method2682(method2681(">P2H\u0010")), method2682(method2681("5Jpg")), method2682(method2681(">P2I\u0010")), method2682(method2681(">P2O\u0010")), method2682(method2681(">P2J\u0010")) };

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "Z")
    public static boolean field5113 = false;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "Lhl;")
    public static class556 field5114 = new class556(54, 3);

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
    public int field5109;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
    public int field5112;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "J")
    public static long field5115;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "[Lal;")
    public class105[] field5107;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)V", line = 8)
    public static final void method2676(int arg0, int arg1, int arg2) {
        class290 var3 = class85.field1280[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class292.method2484(var3.field4673);
        class292.method2484(var3.field4669);
        if (var3.field4673 != null) {
            var3.field4673 = null;
        }
        if (var3.field4669 != null) {
            var3.field4669 = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lwh;BLwq;)Lal;", line = 23)
    private final class105 method2677(class155 arg0, byte arg1, class176 arg2) {
        try {
            field5111++;
            if (class504.field7539 == arg0) {
                return class553.method4095(5, arg2);
            } else if (class201.field3178 == arg0) {
                return class673.method4869(-27151, arg2);
            } else if (class365.field5944 == arg0) {
                return class734.method5332(arg2, -114);
            } else {
                if (arg1 != 87) {
                    this.method2677(null, (byte) -41, null);
                }
                if (class663.field9444 == arg0) {
                    return class726.method5274(arg2, -94);
                } else if (class39.field443 == arg0) {
                    return class644.method4665(124, arg2);
                } else if (class197.field3129 == arg0) {
                    return class381.method3117(-23730, arg2);
                } else if (class484.field7347 == arg0) {
                    return class670.method4858(arg2, 0);
                } else if (class623.field8992 == arg0) {
                    return class166.method1557(true, arg2);
                } else if (class265.field4302 == arg0) {
                    return class454.method3526(-27362, arg2);
                } else if (class198.field3140 == arg0) {
                    return class169.method1572(arg2, false);
                } else {
                    return null;
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5116[5] + (arg0 == null ? field5116[2] : field5116[0]) + ',' + arg1 + ',' + (arg2 == null ? field5116[2] : field5116[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lwq;B)V", line = 70)
    public final void method2678(class176 arg0, byte arg1) {
        try {
            this.field5112 = arg0.method1685(false);
            int var3 = -78 / ((-arg1 - 65) / 48);
            field5108++;
            this.field5109 = arg0.method1687((byte) -95);
            this.field5107 = new class105[arg0.method1645((byte) -124)];
            class155[] var4 = class63.method663(true);
            for (int var5 = 0; var5 < this.field5107.length; var5++) {
                this.field5107[var5] = this.method2677(var4[arg0.method1645((byte) -78)], (byte) 87, arg0);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field5116[1] + (arg0 == null ? field5116[2] : field5116[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)I", line = 99)
    public static final int method2679(int arg0, int arg1) {
        try {
            field5110++;
            int var2 = arg0 & 0x3F;
            int var3 = (arg0 & 0xC4) >> 6;
            if (~var2 == arg1) {
                if (var3 == 0) {
                    return 1;
                }
                if (var3 == 1) {
                    return 2;
                }
                if (var3 == 2) {
                    return 4;
                }
                if (var3 == 3) {
                    return 8;
                }
            } else if (var2 == 19 || var2 == 21) {
                if (var3 == 0) {
                    return 16;
                }
                if (var3 == 1) {
                    return 32;
                }
                if (var3 == 2) {
                    return 64;
                }
                if (var3 == 3) {
                    return 128;
                }
            }
            return 0;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5116[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V", line = 151)
    public static void method2680(int arg0) {
        try {
            if (arg0 == 63) {
                field5114 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5116[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eo", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2681(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x38);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eo", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2682(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 91;
                    break;
                case 1:
                    var10005 = 63;
                    break;
                case 2:
                    var10005 = 28;
                    break;
                case 3:
                    var10005 = 11;
                    break;
                default:
                    var10005 = 56;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
