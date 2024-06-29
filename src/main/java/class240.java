import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class240 extends class428 {

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "Z")
    private boolean field3690 = false;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "Z")
    private boolean field3702;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "[Loda;")
    private class125[] field3691;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field3705 = new String[] { method2071(method2070("b=VU")), method2071(method2070("f,\u0014pm")), method2071(method2070("wf\u0014\u00178")), method2071(method2070("f,\u0014km")), method2071(method2070("f,\u0014|m")), method2071(method2070("f,\u0014~m")), method2071(method2070("f,\u0014qm")), method2071(method2070("f,\u0014xm")), method2071(method2070("f,\u0014}m")), method2071(method2070("f,\u0014zm")), method2071(method2070("f,\u0014{m")), method2071(method2070("f,\u0014\u007fm")), method2071(method2070("f,\u0014\u0005,b!N\u0007m")) };

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "Ljj;")
    public static class126 field3698 = new class126();

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "Lre;")
    public static class628 field3703 = new class628(0, 0);

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public static int field3704 = 0;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)V", line = 3)
    public final void method1221(int arg0, boolean arg1) {
        try {
            super.field6741.method2223(class434.field6809, class734.field10762, (byte) 116);
            ++field3694;
            if (arg0 != 6056) {
                field3698 = null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3705[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lgca;)V", line = 241)
    public class240(class261 arg0) {
        super(arg0);
        try {
            if (arg0.field4142) {
                this.field3702 = arg0.field4200 < 3;
                int var2 = this.field3702 ? 48 : 127;
                int[][] var3 = new int[6][4096];
                int[][] var4 = new int[6][4096];
                int[][] var5 = new int[6][4096];
                int var6 = 0;
                for (int var7 = 0; ~var7 > -65; ++var7) {
                    for (int var8 = 0; var8 < 64; ++var8) {
                        float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                        float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                        float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                        float var12 = var10 * var11;
                        float var13 = var9 * var11;
                        for (int var14 = 0; var14 < 6; ++var14) {
                            float var15;
                            if (var14 == 0) {
                                var15 = -var13;
                            } else if (~var14 != -2) {
                                if (var14 != 2) {
                                    if (~var14 == -4) {
                                        var15 = -var12;
                                    } else if (~var14 != -5) {
                                        var15 = -var11;
                                    } else {
                                        var15 = var11;
                                    }
                                } else {
                                    var15 = var12;
                                }
                            } else {
                                var15 = var13;
                            }
                            int var16;
                            int var17;
                            int var18;
                            if (var15 > 0.0F) {
                                var16 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                                var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                                var18 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                            } else {
                                var18 = 0;
                                var17 = 0;
                                var16 = 0;
                            }
                            var4[var14][var6] = var16 << 24;
                            var5[var14][var6] = var17 << 24;
                            var3[var14][var6] = var18 << 24;
                        }
                        ++var6;
                    }
                }
                this.field3691 = new class125[3];
                this.field3691[0] = super.field6741.method1049((byte) -109, var4, false, 64);
                this.field3691[1] = super.field6741.method1049((byte) -102, var5, false, 64);
                this.field3691[2] = super.field6741.method1049((byte) -87, var3, false, 64);
            }
        } catch (RuntimeException var20) {
            throw class590.method4333(var20, field3705[12] + (arg0 != null ? field3705[2] : field3705[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lln;BI)V", line = 21)
    public final void method1222(class399 arg0, byte arg1, int arg2) {
        try {
            if (arg1 <= 7) {
                this.field3691 = null;
            }
            ++field3701;
            super.field6741.method2233((byte) -29, arg0);
            super.field6741.method2258(arg2, (byte) -108);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3705[11] + (arg0 != null ? field3705[2] : field3705[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)J", line = 37)
    public static final long method2066(int arg0, int arg1) {
        try {
            if (arg0 != -1) {
                method2066(10, 124);
            }
            ++field3692;
            return (long) (arg1 + 11745) * 86400000L;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3705[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V", line = 48)
    public final void method1219(int arg0, int arg1, int arg2) {
        try {
            ++field3697;
            if (arg1 != 100) {
                method2066(32, 42);
            }
            if (this.field3690) {
                super.field6741.method2245(88, 1);
                super.field6741.method2233((byte) -81, this.field3691[arg0 + -1]);
                super.field6741.method2245(84, 0);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3705[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "(I)V", line = 65)
    public static void method2067(int arg0) {
        try {
            field3703 = null;
            if (arg0 != 0) {
                method2067(11);
            }
            field3698 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3705[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I[B)[B", line = 77)
    public static final byte[] method2068(int arg0, byte[] arg1) {
        try {
            ++field3693;
            class176 var2 = new class176(arg1);
            if (arg0 <= 6) {
                return null;
            } else {
                int var3 = var2.method1645((byte) -93);
                int var4 = var2.method1622(-18712);
                if (~var4 > -1 || class404.field6406 != 0 && class404.field6406 < var4) {
                    throw new RuntimeException();
                } else if (~var3 == -1) {
                    byte[] var8 = new byte[var4];
                    var2.method1651(var8, 128, 0, var4);
                    return var8;
                } else {
                    int var5 = var2.method1622(-18712);
                    if (~var5 > -1 || ~class404.field6406 != -1 && ~class404.field6406 > ~var5) {
                        throw new RuntimeException();
                    } else {
                        byte[] var6 = new byte[var5];
                        if (~var3 == -2) {
                            class298.method2569(var6, var5, arg1, var4, 9);
                        } else {
                            class784 var7 = class454.field7016;
                            synchronized (class454.field7016) {
                                class454.field7016.method5637(var6, var2, 31);
                            }
                        }
                        return var6;
                    }
                }
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field3705[1] + arg0 + ',' + (arg1 != null ? field3705[2] : field3705[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZI)V", line = 140)
    public final void method1225(boolean arg0, int arg1) {
        try {
            if (this.field3691 != null && arg0) {
                super.field6741.method2245(95, 1);
                super.field6741.method1089(class235.field3624, -91);
                class615 var3 = super.field6741.method2208((byte) -104);
                var3.method2455(1024);
                super.field6741.method2252(class791.field11549, true);
                if (!this.field3702) {
                    super.field6741.method2223(class734.field10762, class434.field6809, (byte) 111);
                    super.field6741.method2262((byte) -40, class612.field8798, 0);
                    super.field6741.method2245(71, 2);
                    super.field6741.method2223(class434.field6809, class440.field6863, (byte) 118);
                    super.field6741.method2262((byte) -82, class612.field8798, 0);
                    super.field6741.method1067(true, class612.field8798, false, -103, 1);
                    super.field6741.method2248((byte) -109, class186.field2964, 0);
                    super.field6741.method2233((byte) -35, super.field6741.field4149);
                } else {
                    super.field6741.method2223(class434.field6809, class440.field6863, (byte) 109);
                    super.field6741.method1067(true, class339.field5532, false, -106, 0);
                    super.field6741.method2248((byte) -109, class186.field2964, 0);
                }
                super.field6741.method2245(89, 0);
                this.field3690 = true;
            } else {
                super.field6741.method2248((byte) -109, class186.field2964, 0);
            }
            ++field3700;
            if (arg1 != 29145) {
                this.field3691 = null;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3705[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V", line = 186)
    public final void method1224(boolean arg0) {
        try {
            if (this.field3690) {
                super.field6741.method2245(97, 1);
                super.field6741.method2233((byte) -109, (class399) null);
                super.field6741.method1089(class207.field3238, -90);
                super.field6741.method2238(-32023);
                if (this.field3702) {
                    super.field6741.method2223(class734.field10762, class734.field10762, (byte) 101);
                    super.field6741.method2262((byte) -35, class339.field5532, 0);
                    super.field6741.method2248((byte) -109, class339.field5532, 0);
                } else {
                    super.field6741.method2223(class734.field10762, class734.field10762, (byte) 120);
                    super.field6741.method2262((byte) -50, class339.field5532, 0);
                    super.field6741.method2245(75, 2);
                    super.field6741.method2223(class734.field10762, class734.field10762, (byte) 107);
                    super.field6741.method2262((byte) -86, class339.field5532, 0);
                    super.field6741.method2262((byte) -84, class612.field8798, 1);
                    super.field6741.method2248((byte) -109, class339.field5532, 0);
                    super.field6741.method2233((byte) -70, (class399) null);
                }
                super.field6741.method2245(82, 0);
                this.field3690 = false;
            } else {
                super.field6741.method2248((byte) -109, class339.field5532, 0);
            }
            ++field3695;
            if (arg0) {
                super.field6741.method2223(class734.field10762, class734.field10762, (byte) 127);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3705[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)Z", line = 227)
    public final boolean method1226(int arg0) {
        try {
            if (arg0 > -111) {
                this.field3702 = false;
            }
            ++field3699;
            return true;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3705[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I[BII)Ljava/lang/String;", line = 352)
    public static final String method2069(int arg0, byte[] arg1, int arg2, int arg3) {
        try {
            if (arg0 != 160) {
                field3698 = null;
            }
            ++field3696;
            char[] var4 = new char[arg3];
            int var5 = 0;
            for (int var6 = 0; var6 < arg3; ++var6) {
                int var7 = arg1[arg2 + var6] & 255;
                if (~var7 != -1) {
                    if (~var7 <= -129 && var7 < 160) {
                        char var8 = class64.field875[var7 + -128];
                        if (~var8 == -1) {
                            var8 = '?';
                        }
                        var7 = var8;
                    }
                    var4[var5++] = (char) var7;
                }
            }
            return new String(var4, 0, var5);
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field3705[6] + arg0 + ',' + (arg1 != null ? field3705[2] : field3705[0]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2070(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 69);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2071(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 12;
                    break;
                case 1:
                    var10005 = 72;
                    break;
                case 2:
                    var10005 = 58;
                    break;
                case 3:
                    var10005 = 57;
                    break;
                default:
                    var10005 = 69;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
