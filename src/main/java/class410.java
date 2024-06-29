import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class410 {

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
    private int field5616 = 0;

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "Z")
    public boolean field5623 = true;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "I")
    public int field5619 = 128;

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "I")
    public int field5627 = -1;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "[I")
    public static int[] field5615 = new int[14];

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    public int field5613;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "I")
    public int field5620;

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "I")
    public int field5621;

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
    public int field5624;

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)V")
    public static final void method2459(boolean arg0) {
        if (arg0) {
            class289.field3897 = class308.field4077;
            class221.field2945 = class312.field4112;
        } else {
            class289.field3897 = class109.field1637;
            class221.field2945 = class289.field3896;
        }
        class142.field2056 = class289.field3897.length;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)I")
    public static final int method2460(int arg0, int arg1) {
        field5625++;
        if (arg0 != 22384) {
            field5615 = null;
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IBLjava/lang/String;)V")
    public static final void method2461(int arg0, byte arg1, String arg2) {
        field5622++;
        int var3 = class239.field3187;
        int[] var4 = class265.field3502;
        boolean var5 = false;
        for (int var6 = 0; var6 < var3; var6++) {
            class487 var7 = class413.field5644[var4[var6]];
            if (var7 != null && class233.field3103 != var7 && var7.field6742 != null && var7.field6742.equalsIgnoreCase(arg2)) {
                if (arg0 == 1) {
                    class491.method2861(class445.field6058, 1);
                    class16.field223++;
                    class203.field2751.method228(0, 32);
                    class203.field2751.method224(var4[var6], 0);
                } else if (arg0 == 4) {
                    class491.method2861(class51.field678, 1);
                    class444.field6039++;
                    class203.field2751.method200(0, (byte) 124);
                    class203.field2751.method216(var4[var6], -1);
                } else if (arg0 == 5) {
                    class491.method2861(class59.field790, 1);
                    class304.field4041++;
                    class203.field2751.method216(var4[var6], -1);
                    class203.field2751.method205(0, 255);
                } else if (arg0 == 6) {
                    class202.field2736++;
                    class491.method2861(class96.field1416, 1);
                    class203.field2751.method216(var4[var6], -1);
                    class203.field2751.method213((byte) 27, 0);
                } else if (arg0 == 7) {
                    class491.method2861(class28.field372, 1);
                    class323.field4298++;
                    class203.field2751.method205(0, 255);
                    class203.field2751.method224(var4[var6], 0);
                }
                var5 = true;
                break;
            }
        }
        if (arg1 < 115) {
            field5615 = null;
        }
        if (!var5) {
            class78.method514(0, class196.field2667.method1176(class110.field1676, (byte) -118) + arg2);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I[IIJ)Ljava/lang/String;")
    public static final String method2462(int arg0, int[] arg1, int arg2, long arg3) {
        if (arg0 != -256) {
            return null;
        }
        field5617++;
        if (class151.field2128 != null) {
            String var5 = class151.field2128.method141(76, arg3, arg1, arg2);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg3);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IB)V")
    private final void method2463(int arg0, byte arg1) {
        field5628++;
        double var3 = (double) ((arg0 & 0xFF3876) >> 16) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        if (arg1 < 107) {
            return;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        double var19 = var13 / 6.0D;
        this.field5624 = (int) (var17 * 256.0D);
        this.field5621 = (int) (var15 * 256.0D);
        if ((var17 > 0.5D)) {
            this.field5613 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field5613 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field5624 < 0) {
            this.field5624 = 0;
        } else if (this.field5624 > 255) {
            this.field5624 = 255;
        }
        if (this.field5621 < 0) {
            this.field5621 = 0;
        } else if (this.field5621 > 255) {
            this.field5621 = 255;
        }
        if (this.field5613 < 1) {
            this.field5613 = 1;
        }
        this.field5620 = (int) ((double) this.field5613 * var19);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
    public static void method2464(int arg0) {
        if (arg0 != -17939) {
            field5618 = -13;
        }
        field5615 = null;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lbt;I)V")
    public final void method2465(class32 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method201((byte) -125);
            if (var3 == 0) {
                field5626++;
                if (arg1 >= -104) {
                    this.field5621 = -7;
                    return;
                }
                return;
            }
            this.method2466(arg0, var3, false);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lbt;IZ)V")
    private final void method2466(class32 arg0, int arg1, boolean arg2) {
        field5614++;
        if (arg1 == 1) {
            this.field5616 = arg0.method219(-115);
            this.method2463(this.field5616, (byte) 122);
        } else if (arg1 == 2) {
            this.field5627 = arg0.method215((byte) 120);
            if (this.field5627 == 65535) {
                this.field5627 = -1;
            }
        } else if (arg1 == 3) {
            this.field5619 = arg0.method215((byte) 126);
        } else if (arg1 == 4) {
            this.field5623 = false;
        }
        if (arg2) {
            this.method2466((class32) null, -42, true);
        }
    }
}
