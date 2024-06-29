import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class757 extends class232 {

    @OriginalMember(owner = "client!cp", name = "P", descriptor = "I")
    private int field11124 = -1;

    @OriginalMember(owner = "client!cp", name = "S", descriptor = "[Ljava/lang/String;")
    private static final String[] field11128 = new String[] { method5474(method5473("|\u0014\u001340")), method5474(method5473("iOQv")), method5474(method5473("dJ\u0013_e")), method5474(method5473("dJ\u0013Re")), method5474(method5473("dJ\u0013Xe")), method5474(method5473("dJ\u0013]e")), method5474(method5473("dJ\u0013\\e")), method5474(method5473("S\b\u001d7m")), method5474(method5473("dJ\u0013Pe")), method5474(method5473("'\u0017\u001d")), method5474(method5473("dJ\u0013Se")) };

    @OriginalMember(owner = "client!cp", name = "H", descriptor = "I")
    public static int field11116;

    @OriginalMember(owner = "client!cp", name = "K", descriptor = "I")
    public static int field11117;

    @OriginalMember(owner = "client!cp", name = "Q", descriptor = "I")
    public static int field11120;

    @OriginalMember(owner = "client!cp", name = "I", descriptor = "I")
    private int field11121;

    @OriginalMember(owner = "client!cp", name = "N", descriptor = "I")
    private int field11122;

    @OriginalMember(owner = "client!cp", name = "M", descriptor = "I")
    public static int field11123;

    @OriginalMember(owner = "client!cp", name = "J", descriptor = "I")
    public static int field11126;

    @OriginalMember(owner = "client!cp", name = "R", descriptor = "I")
    public static int field11127;

    @OriginalMember(owner = "client!cp", name = "G", descriptor = "Luga;")
    public static class218 field11118;

    @OriginalMember(owner = "client!cp", name = "O", descriptor = "[I")
    private int[] field11119;

    @OriginalMember(owner = "client!cp", name = "L", descriptor = "[Ls;")
    public static class293[] field11125;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)I", line = 7)
    public final int method2019(int arg0) {
        try {
            int var2 = 73 % ((arg0 - -45) / 58);
            ++field11120;
            return this.field11124;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field11128[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V", line = 20)
    public class757() {
        super(0, false);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILwq;I)V", line = 27)
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            ++field11127;
            if (~arg2 == -1) {
                this.field11124 = arg1.method1687((byte) -43);
            }
            if (arg0 < 96) {
                this.field11124 = -25;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field11128[2] + arg0 + ',' + (arg1 != null ? field11128[0] : field11128[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lwea;B)Z", line = 42)
    public static final boolean method5471(class164 arg0, byte arg1) {
        try {
            ++field11116;
            try {
                if (arg1 > -49) {
                    field11118 = null;
                }
                return class307.method2637(arg0, (byte) -120);
            } catch (IOException var6) {
                if (class315.field5127 == 9) {
                    arg0.field2644 = null;
                    return false;
                } else {
                    class169.method1574(-23049);
                    return true;
                }
            } catch (Exception var7) {
                String var3 = field11128[7] + (arg0.field2670 == null ? -1 : arg0.field2670.method4108((byte) 104)) + "," + (arg0.field2661 == null ? -1 : arg0.field2661.method4108((byte) 46)) + "," + (arg0.field2666 != null ? arg0.field2666.method4108((byte) 45) : -1) + field11128[9] + arg0.field2663 + "," + (class438.field6846.field1201[0] + class397.field6289) + "," + (class141.field2011 - -class438.field6846.field1200[0]) + field11128[9];
                for (int var4 = 0; ~arg0.field2663 < ~var4 && ~var4 > -51; ++var4) {
                    var3 = var3 + arg0.field2660.field2805[var4] + ",";
                }
                class622.method4544(var7, var3, true);
                class311.method2673(false, false);
                return true;
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field11128[8] + (arg0 != null ? field11128[0] : field11128[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "(I)V", line = 85)
    public static void method5472(int arg0) {
        try {
            if (arg0 < 19) {
                method5472(96);
            }
            field11118 = null;
            field11125 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11128[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(III)V", line = 100)
    public final void method2020(int arg0, int arg1, int arg2) {
        try {
            super.method2020(arg0, -125, arg2);
            if (arg1 > -67) {
                this.field11121 = -48;
            }
            ++field11126;
            if (this.field11124 >= 0 && class15.field170 != null) {
                int var4 = class15.field170.method1419(this.field11124, -96).field4911 ? 64 : 128;
                this.field11119 = class15.field170.method1420(var4, false, var4, this.field11124, 1.0F, -7385);
                this.field11121 = var4;
                this.field11122 = var4;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field11128[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(II)[[I", line = 120)
    public final int[][] method122(int arg0, int arg1) {
        try {
            ++field11123;
            int[][] var3 = super.field3599.method1580(arg1, (byte) -61);
            if (arg0 != -3093) {
                this.field11119 = null;
            }
            if (super.field3599.field2743) {
                int var4 = (~class742.field10920 == ~this.field11122 ? arg1 : this.field11122 * arg1 / class742.field10920) * this.field11121;
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                if (~class449.field6969 == ~this.field11121) {
                    for (int var8 = 0; ~class449.field6969 < ~var8; ++var8) {
                        int var9 = this.field11119[var4++];
                        var7[var8] = class292.method2485(255, var9) << 4;
                        var6[var8] = class292.method2485(var9, 65280) >> 4;
                        var5[var8] = class292.method2485(4080, var9 >> 12);
                    }
                } else {
                    for (int var10 = 0; ~var10 > ~class449.field6969; ++var10) {
                        int var11 = this.field11121 * var10 / class449.field6969;
                        int var12 = this.field11119[var4 + var11];
                        var7[var10] = class292.method2485(255, var12) << 4;
                        var6[var10] = class292.method2485(4080, var12 >> 4);
                        var5[var10] = class292.method2485(16711680, var12) >> 12;
                    }
                }
            }
            return var3;
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field11128[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(I)V", line = 186)
    public final void method2024(int arg0) {
        try {
            ++field11117;
            super.method2024(arg0);
            this.field11119 = null;
            if (arg0 != 12968) {
                this.method122(79, -56);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11128[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5473(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 77);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5474(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 7;
                    break;
                case 1:
                    var10005 = 58;
                    break;
                case 2:
                    var10005 = 61;
                    break;
                case 3:
                    var10005 = 26;
                    break;
                default:
                    var10005 = 77;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
