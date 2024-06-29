import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class138 extends class344 {

    @OriginalMember(owner = "client!mi", name = "W", descriptor = "Lpf;")
    public static class425 field1866 = new class425(1, -1);

    @OriginalMember(owner = "client!mi", name = "cb", descriptor = "I")
    public static int field1872 = 0;

    @OriginalMember(owner = "client!mi", name = "ab", descriptor = "I")
    public static int field1870 = 0;

    @OriginalMember(owner = "client!mi", name = "fb", descriptor = "B")
    public byte field1875;

    @OriginalMember(owner = "client!mi", name = "S", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!mi", name = "T", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!mi", name = "U", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!mi", name = "V", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!mi", name = "X", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!mi", name = "Y", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!mi", name = "Z", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!mi", name = "db", descriptor = "I")
    public int field1873;

    @OriginalMember(owner = "client!mi", name = "bb", descriptor = "Lef;")
    public class385 field1871;

    @OriginalMember(owner = "client!mi", name = "eb", descriptor = "[[B")
    public static byte[][] field1874;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "(I)I")
    public final int method875(int arg0) {
        ++field1863;
        if (this.field1871 == null) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.field1875 = 36;
            }
            return this.field1871.field5666 * 100 / (this.field1871.field5685.length + -this.field1875);
        }
    }

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "(I)Z")
    public static final boolean method876(int arg0) {
        ++field1864;
        if (arg0 != -10689) {
            field1874 = null;
        }
        if (class120.field1585) {
            try {
                if ((Boolean) class232.method1404(class79.field1043.field3583, 57, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "(I)V")
    public static final void method877(int arg0) {
        ++field1869;
        if (class150.field2070 == null) {
            class150.field2070 = new int[65536];
            double var1 = 0.7D + -0.015D + 0.03D * Math.random();
            int var3 = 0;
            if (arg0 >= -127) {
                method879((byte) -17, -101, 110);
            }
            for (int var4 = 0; ~var4 > -513; ++var4) {
                float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
                float var6 = (float) (var4 & 7) / 8.0F + 0.0625F;
                for (int var7 = 0; ~var7 > -129; ++var7) {
                    float var8 = (float) var7 / 128.0F;
                    float var9 = 0.0F;
                    float var10 = 0.0F;
                    float var11 = 0.0F;
                    float var12 = var5 / 60.0F;
                    int var13 = (int) var12;
                    int var14 = var13 % 6;
                    float var15 = var12 - (float) var13;
                    float var16 = (-var6 + 1.0F) * var8;
                    float var17 = (1.0F - var6 * var15) * var8;
                    float var18 = (-((1.0F - var15) * var6) + 1.0F) * var8;
                    if (~var14 == -1) {
                        var9 = var8;
                        var11 = var16;
                        var10 = var18;
                    } else if (~var14 == -2) {
                        var10 = var8;
                        var9 = var17;
                        var11 = var16;
                    } else if (~var14 != -3) {
                        if (~var14 != -4) {
                            if (~var14 == -5) {
                                var10 = var16;
                                var11 = var8;
                                var9 = var18;
                            } else if (~var14 == -6) {
                                var10 = var16;
                                var9 = var8;
                                var11 = var17;
                            }
                        } else {
                            var9 = var16;
                            var11 = var8;
                            var10 = var17;
                        }
                    } else {
                        var11 = var18;
                        var9 = var16;
                        var10 = var8;
                    }
                    float var19 = (float) Math.pow((double) var9, var1);
                    float var20 = (float) Math.pow((double) var10, var1);
                    float var21 = (float) Math.pow((double) var11, var1);
                    int var22 = (int) (var19 * 256.0F);
                    int var23 = (int) (var20 * 256.0F);
                    int var24 = (int) (var21 * 256.0F);
                    int var25 = (var22 << 16) + (var23 << 8) + -16777216 + var24;
                    class150.field2070[var3++] = var25;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILiq;BI)Los;")
    public static final class341 method878(int arg0, class134 arg1, byte arg2, int arg3) {
        ++field1865;
        if (arg2 < 11) {
            return null;
        } else {
            class385 var4 = new class385(arg1.method823(arg3, -20334, arg0));
            class341 var5 = new class341(arg0, var4.method2332(90), var4.method2332(123), var4.method2354(255), var4.method2354(255), var4.method2343(255) == 1, var4.method2343(255), var4.method2343(255));
            int var6 = var4.method2343(255);
            for (int var7 = 0; var7 < var6; ++var7) {
                var5.field5108.method2504(42, new class135(var4.method2343(255), var4.method2323(-99), var4.method2323(-60), var4.method2323(-113), var4.method2323(-101), var4.method2323(-42), var4.method2323(-116), var4.method2323(-78), var4.method2323(-7)));
            }
            var5.method2081(0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BII)V")
    public static final void method879(byte arg0, int arg1, int arg2) {
        ++field1862;
        class32 var3 = class136.method854(7, (byte) 86, arg2);
        if (arg0 == 31) {
            var3.method194(false);
            var3.field404 = arg1;
        }
    }

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "(I)[B")
    public final byte[] method880(int arg0) {
        ++field1867;
        if (!super.field5140 && ~(this.field1871.field5685.length + -this.field1875) >= ~this.field1871.field5666) {
            if (arg0 != 0) {
                method879((byte) -91, -80, 1);
            }
            return this.field1871.field5685;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(B)V")
    public static void method881(byte arg0) {
        field1874 = null;
        int var1 = 0 / ((arg0 - 70) / 39);
        field1866 = null;
    }

    static {
        new class151("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
    }
}
