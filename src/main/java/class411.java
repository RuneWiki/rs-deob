import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lka")
public class class411 extends class428 {

    @OriginalMember(owner = "client!lka", name = "z", descriptor = "Z")
    private boolean field6548 = false;

    @OriginalMember(owner = "client!lka", name = "o", descriptor = "[F")
    private float[] field6557 = new float[4];

    @OriginalMember(owner = "client!lka", name = "v", descriptor = "Z")
    private boolean field6558;

    @OriginalMember(owner = "client!lka", name = "q", descriptor = "Lwja;")
    private class279 field6566;

    @OriginalMember(owner = "client!lka", name = "t", descriptor = "Lwja;")
    private class279 field6552;

    @OriginalMember(owner = "client!lka", name = "E", descriptor = "Lwja;")
    private class279 field6562;

    @OriginalMember(owner = "client!lka", name = "m", descriptor = "Lwja;")
    private class279 field6565;

    @OriginalMember(owner = "client!lka", name = "n", descriptor = "Lah;")
    private class406 field6560;

    @OriginalMember(owner = "client!lka", name = "G", descriptor = "[Ljava/lang/String;")
    private static final String[] field6567 = new String[] { method3300(method3299("\u0013'\u000fi\u0001W")), method3300(method3299("\u0013'\u000fi\u0002W")), method3300(method3299("\u0013'\u000fi\fW")), method3300(method3299("\u00119\u0002+")), method3300(method3299("\u0004b@i7")), method3300(method3299("\u0018 ")), method3300(method3299("\n;1 8\u00109\u0000#\u0015\u0013%\u001a")), method3300(method3299("\n;1 8\u00109\u0000#\u0015\n\"\u0002.>")), method3300(method3299("\n;1*%\u001b)\u0002\u0018?\u0011 \u00073")), method3300(method3299("\u0013'\u000fiv\u0016\"\u00073tW")), method3300(method3299("\n;1*%\u001b)\u0002\u0018&\u00168")), method3300(method3299("\u0013'\u000fi\u000bW")), method3300(method3299("\u0013'\u000fi\tW")), method3300(method3299("\u0013'\u000fi\u0006W")), method3300(method3299("\u0013'\u000fi\u000fW")), method3300(method3299("\u0013'\u000fi\rW")), method3300(method3299("\u0013'\u000fi\bW")), method3300(method3299("\u0013'\u000fi\u000eW")) };

    @OriginalMember(owner = "client!lka", name = "w", descriptor = "Lua;")
    public static class696 field6564 = new class696(1);

    @OriginalMember(owner = "client!lka", name = "y", descriptor = "I")
    public static int field6549;

    @OriginalMember(owner = "client!lka", name = "x", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!lka", name = "A", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!lka", name = "r", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!lka", name = "D", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!lka", name = "p", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!lka", name = "s", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!lka", name = "B", descriptor = "I")
    public static int field6561;

    @OriginalMember(owner = "client!lka", name = "F", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!lka", name = "C", descriptor = "Z")
    private boolean field6547;

    @OriginalMember(owner = "client!lka", name = "u", descriptor = "Z")
    private boolean field6550;

    @OriginalMember(owner = "client!lka", name = "b", descriptor = "(Z)Lnq;")
    public static final class487 method3295(boolean arg0) {
        try {
            ++field6549;
            if (arg0) {
                return null;
            } else {
                class487 var1 = class53.method552((byte) 115);
                var1.field7360 = null;
                var1.field7358 = 0;
                var1.field7362 = new class117(5000);
                return var1;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6567[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lka", name = "a", descriptor = "(Lln;BI)V")
    public final void method1222(class399 arg0, byte arg1, int arg2) {
        try {
            ++field6563;
            if (arg0 != null) {
                if (this.field6548) {
                    super.field6741.method2262((byte) -60, class339.field5532, 0);
                    super.field6741.method2248((byte) -109, class339.field5532, 0);
                    this.field6548 = false;
                }
                super.field6741.method2233((byte) -101, arg0);
                super.field6741.method2258(arg2, (byte) -115);
            } else if (!this.field6548) {
                super.field6741.method2233((byte) -42, super.field6741.field4149);
                super.field6741.method2258(1, (byte) -113);
                super.field6741.method2262((byte) -39, class612.field8798, 0);
                super.field6741.method2248((byte) -109, class612.field8798, 0);
                this.field6548 = true;
            }
            if (arg1 < 7) {
                this.method1219(-50, -30, -99);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6567[2] + (arg0 != null ? field6567[4] : field6567[3]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lka", name = "f", descriptor = "(I)Z")
    public final boolean method1226(int arg0) {
        try {
            if (arg0 >= -111) {
                this.method1224(false);
            }
            ++field6555;
            return this.field6558;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6567[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lka", name = "a", descriptor = "(B)V")
    public final void method3296(byte arg0) {
        try {
            if (arg0 != -26) {
                this.method1226(32);
            }
            ++field6561;
            int var2 = super.field6741.method2249(arg0 ^ -26);
            class615 var3 = super.field6741.method2198(arg0 + 141);
            if (this.field6550) {
                OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field6552.field4561 : this.field6565.field4561);
            } else {
                OpenGL.glBindProgramARB(34336, ~var2 == Integer.MIN_VALUE ? this.field6566.field4561 : this.field6562.field4561);
            }
            OpenGL.glEnable(34336);
            this.field6547 = true;
            var3.method4487(0.0F, (float) var2, 0, -1.0F, 0.0F, this.field6557);
            OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field6557[0], this.field6557[1], this.field6557[2], this.field6557[3]);
            this.method3297(122);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6567[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lka", name = "a", descriptor = "(ZI)V")
    public final void method1225(boolean arg0, int arg1) {
        try {
            ++field6551;
            this.field6550 = arg0;
            super.field6741.method2245(89, 1);
            super.field6741.method2233((byte) -124, this.field6560);
            super.field6741.method2223(class434.field6809, class539.field7915, (byte) 126);
            if (arg1 != 29145) {
                this.field6552 = null;
            }
            super.field6741.method2262((byte) 116, class119.field1723, 0);
            super.field6741.method1067(true, class339.field5532, false, arg1 + -29251, 2);
            super.field6741.method2248((byte) -109, class612.field8798, 0);
            super.field6741.method2245(arg1 ^ 29070, 0);
            this.method3296((byte) -26);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6567[14] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lka", name = "b", descriptor = "(I)V")
    public final void method3297(int arg0) {
        try {
            if (this.field6547) {
                int var2 = super.field6741.method193();
                int var3 = super.field6741.method155();
                float var4 = (float) var2 + -((float) (-var3 + var2) * 0.125F);
                float var5 = (float) var2 + -((float) (-var3 + var2) * 0.25F);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field6741.method2261(0), (float) super.field6741.method2210(-32377) / 255.0F);
                super.field6741.method2245(77, 1);
                super.field6741.method2204(3, super.field6741.method2228(32647));
                super.field6741.method2245(53, 0);
            }
            ++field6559;
            if (arg0 < 114) {
                this.method1225(true, -89);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6567[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lka", name = "a", descriptor = "(III)V")
    public final void method1219(int arg0, int arg1, int arg2) {
        try {
            ++field6556;
            if (arg1 != 100) {
                this.method1222((class399) null, (byte) -97, -80);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6567[17] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lka", name = "a", descriptor = "(Z)V")
    public final void method1224(boolean arg0) {
        try {
            super.field6741.method2245(93, 1);
            if (arg0) {
                ++field6554;
                super.field6741.method2233((byte) -38, (class399) null);
                super.field6741.method2223(class734.field10762, class734.field10762, (byte) 106);
                super.field6741.method2262((byte) -74, class339.field5532, 0);
                super.field6741.method2262((byte) -126, class119.field1723, 2);
                super.field6741.method2248((byte) -109, class339.field5532, 0);
                super.field6741.method2245(43, 0);
                if (this.field6548) {
                    super.field6741.method2262((byte) 104, class339.field5532, 0);
                    super.field6741.method2248((byte) -109, class339.field5532, 0);
                    this.field6548 = false;
                }
                if (this.field6547) {
                    OpenGL.glBindProgramARB(34336, 0);
                    OpenGL.glDisable(34820);
                    OpenGL.glDisable(34336);
                    this.field6547 = false;
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6567[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lka", name = "a", descriptor = "(IZ)V")
    public final void method1221(int arg0, boolean arg1) {
        try {
            ++field6553;
            if (arg0 != 6056) {
                this.field6547 = false;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6567[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lka", name = "h", descriptor = "(I)V")
    public static void method3298(int arg0) {
        try {
            int var1 = 20 % ((arg0 - 41) / 55);
            field6564 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6567[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lka", name = "<init>", descriptor = "(Ltia;Lgda;)V")
    public class411(class278 arg0, class58 arg1) {
        super(arg0);
        try {
            if (arg1 != null && arg0.field4554) {
                this.field6566 = class376.method3093(arg1.method591(true, field6567[7], field6567[5]), arg0, 34336, (byte) -106);
                this.field6552 = class376.method3093(arg1.method591(true, field6567[6], field6567[5]), arg0, 34336, (byte) -125);
                this.field6562 = class376.method3093(arg1.method591(true, field6567[8], field6567[5]), arg0, 34336, (byte) -97);
                this.field6565 = class376.method3093(arg1.method591(true, field6567[10], field6567[5]), arg0, 34336, (byte) -110);
                if (this.field6565 != null & this.field6562 != null & this.field6552 != null & this.field6566 != null) {
                    this.field6560 = super.field6741.method2206(1826, false, 2, new int[] { 0, -1 }, 1);
                    this.field6560.method3166(false, 8095, false);
                    this.field6558 = true;
                } else {
                    this.field6558 = false;
                }
            } else {
                this.field6558 = false;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6567[9] + (arg0 != null ? field6567[4] : field6567[3]) + ',' + (arg1 != null ? field6567[4] : field6567[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!lka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3299(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 74);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3300(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 127;
                    break;
                case 1:
                    var10005 = 76;
                    break;
                case 2:
                    var10005 = 110;
                    break;
                case 3:
                    var10005 = 71;
                    break;
                default:
                    var10005 = 74;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
