import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class663 {

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public int field9445 = -1;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public int field9449 = -1;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "[I")
    public int[] field9443;

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9453 = new String[] { method4817(method4816("Uv\u001b'")), method4817(method4816("@-YeB")), method4817(method4816("\\iYwVUj\u0003u\u0017")), method4817(method4816("\\iY\u000f\u0017")), method4817(method4816("\\iY\b\u0017")), method4817(method4816("\\iY\r\u0017")), method4817(method4816("\\iY\u000e\u0017")), method4817(method4816("\\iY\n\u0017")), method4817(method4816("\\iY\t\u0017")) };

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "Lwh;")
    public static class155 field9444 = new class155(6, 1);

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field9441;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field9442;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field9447;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field9448;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public static int field9450;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "Z")
    public static boolean field9440;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "[I")
    public int[] field9446;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "[I")
    public int[] field9451;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "[Lhu;")
    public static class139[] field9452;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method4810(int arg0, int arg1, int arg2) {
        try {
            if (arg0 != -1085436191) {
                method4811((byte) -78, -40);
            }
            field9441++;
            return (arg1 & 0x22) != 0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9453[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI)Z", line = 18)
    public static final boolean method4811(byte arg0, int arg1) {
        try {
            if (arg0 != -8) {
                field9440 = false;
            }
            field9450++;
            return arg1 == 3 || arg1 == 4 || arg1 == 5 || arg1 == 6;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9453[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZI)I", line = 30)
    public static final int method4812(boolean arg0, int arg1) {
        try {
            field9442++;
            int var2 = arg1 >>> 1;
            int var3 = var2 | var2 >>> 1;
            int var4 = var3 | var3 >>> 2;
            int var5 = var4 | var4 >>> 4;
            int var6 = var5 | var5 >>> 8;
            if (arg0) {
                return -26;
            } else {
                int var7 = var6 | var6 >>> 16;
                return arg1 & ~var7;
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field9453[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lgda;)V", line = 182)
    public class663(class58 arg0) {
        try {
            byte[] var2 = arg0.method587(6, true);
            this.method4813(new class176(var2), 117);
            if (this.field9443 == null) {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9453[2] + (arg0 == null ? field9453[0] : field9453[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V", line = 196)
    protected class663() {
        try {
            this.field9443 = new int[0];
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9453[2] + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lwq;I)V", line = 59)
    private final void method4813(class176 arg0, int arg1) {
        try {
            if (arg1 >= 84) {
                while (true) {
                    while (true) {
                        int var3 = arg0.method1645((byte) -110);
                        if (var3 == 0) {
                            field9448++;
                            return;
                        }
                        if (var3 == 1) {
                            int var4 = arg0.method1645((byte) -123);
                            this.field9443 = new int[var4];
                            for (int var5 = 0; var5 < this.field9443.length; var5++) {
                                this.field9443[var5] = arg0.method1645((byte) -98);
                            }
                        } else if (var3 == 3) {
                            this.field9449 = arg0.method1645((byte) -72);
                        } else if (var3 == 4) {
                            this.field9445 = arg0.method1645((byte) -107);
                        } else if (var3 == 5) {
                            this.field9446 = new int[arg0.method1645((byte) -87)];
                            for (int var7 = 0; var7 < this.field9446.length; var7++) {
                                this.field9446[var7] = arg0.method1645((byte) -123);
                            }
                        } else if (var3 == 6) {
                            this.field9451 = new int[arg0.method1645((byte) -82)];
                            for (int var6 = 0; var6 < this.field9451.length; var6++) {
                                this.field9451[var6] = arg0.method1645((byte) -76);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field9453[3] + (arg0 == null ? field9453[0] : field9453[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLha;)V", line = 145)
    public static final void method4814(byte arg0, class63 arg1) {
        try {
            field9447++;
            class355.field5718 = class327.method2780(class45.field506, arg1, true, -1);
            class693.field9978 = class242.method2082(22306, class45.field506, arg1);
            class213.field3367 = class327.method2780(class685.field9908, arg1, true, -1);
            int var2 = -116 / ((-arg0 - 50) / 40);
            class64.field877 = class242.method2082(22306, class685.field9908, arg1);
            class461.field7108 = class327.method2780(class103.field1519, arg1, true, -1);
            client.field5163 = class242.method2082(22306, class103.field1519, arg1);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9453[6] + arg0 + ',' + (arg1 == null ? field9453[0] : field9453[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V", line = 168)
    public static void method4815(int arg0) {
        try {
            if (arg0 != 30235) {
                field9444 = null;
            }
            field9444 = null;
            field9452 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9453[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4816(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4817(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 59;
                    break;
                case 1:
                    var10005 = 3;
                    break;
                case 2:
                    var10005 = 119;
                    break;
                case 3:
                    var10005 = 75;
                    break;
                default:
                    var10005 = 63;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
