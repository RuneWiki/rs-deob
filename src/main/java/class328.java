import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class328 extends class568 {

    @OriginalMember(owner = "client!wt", name = "E", descriptor = "Ljava/lang/String;")
    public String field5379 = null;

    @OriginalMember(owner = "client!wt", name = "u", descriptor = "I")
    public int field5381 = 0;

    @OriginalMember(owner = "client!wt", name = "B", descriptor = "Z")
    private boolean field5383 = true;

    @OriginalMember(owner = "client!wt", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field5393 = new String[] { method2793(method2792("K\u00032X")), method2793(method2792("^Xp\u001a!")), method2793(method2792("R\u0002p\b5K\u001f*\nt")), method2793(method2792("R\u0002ppt")), method2793(method2792("R\u0002pvt")), method2793(method2792("R\u0002prt")), method2793(method2792("R\u0002pst")), method2793(method2792("R\u0002pqt")), method2793(method2792("R\u0002put")), method2793(method2792("R\u0002pwt")) };

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "Z")
    public static boolean field5386 = false;

    @OriginalMember(owner = "client!wt", name = "x", descriptor = "B")
    public byte field5380;

    @OriginalMember(owner = "client!wt", name = "z", descriptor = "B")
    public byte field5390;

    @OriginalMember(owner = "client!wt", name = "A", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!wt", name = "w", descriptor = "I")
    public static int field5378;

    @OriginalMember(owner = "client!wt", name = "C", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!wt", name = "p", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!wt", name = "q", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!wt", name = "y", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!wt", name = "t", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!wt", name = "r", descriptor = "J")
    public long field5389;

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "Lvb;")
    public static class205 field5385;

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "Z")
    private boolean field5392;

    @OriginalMember(owner = "client!wt", name = "s", descriptor = "[I")
    private int[] field5373;

    @OriginalMember(owner = "client!wt", name = "D", descriptor = "[Lwl;")
    public class432[] field5376;

    @OriginalMember(owner = "client!wt", name = "v", descriptor = "[[[J")
    public static long[][][] field5375;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILwq;)V", line = 6)
    private final void method2785(int arg0, class176 arg1) {
        try {
            ++field5382;
            int var3 = arg1.method1645((byte) -114);
            if ((2 & var3) != 0) {
                this.field5383 = true;
            }
            if (~(1 & var3) != -1) {
                this.field5392 = true;
            }
            super.field8252 = arg1.method1658(-24862);
            this.field5389 = arg1.method1658(-24862);
            this.field5379 = arg1.method1635((byte) 114);
            arg1.method1645((byte) -83);
            this.field5380 = arg1.method1672(-69);
            this.field5390 = arg1.method1672(-72);
            if (arg0 >= 117) {
                this.field5381 = arg1.method1687((byte) -79);
                if (~this.field5381 < -1) {
                    this.field5376 = new class432[this.field5381];
                    for (int var4 = 0; ~var4 > ~this.field5381; ++var4) {
                        class432 var5 = new class432();
                        if (this.field5392) {
                            arg1.method1658(-24862);
                        }
                        if (this.field5383) {
                            var5.field6783 = arg1.method1635((byte) 77);
                        }
                        var5.field6785 = arg1.method1672(108);
                        var5.field6784 = arg1.method1687((byte) -61);
                        this.field5376[var4] = var5;
                    }
                }
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field5393[9] + arg0 + ',' + (arg1 != null ? field5393[1] : field5393[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(II)V", line = 63)
    private final void method2786(int arg0, int arg1) {
        try {
            ++field5377;
            if (arg0 == 31958) {
                if (this.field5376 != null) {
                    class405.method3255(this.field5376, 0, this.field5376 = new class432[arg1], 0, this.field5381);
                } else {
                    this.field5376 = new class432[arg1];
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5393[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Z)V", line = 81)
    public static void method2787(boolean arg0) {
        try {
            field5385 = null;
            field5375 = null;
            if (arg0) {
                field5391 = 35;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5393[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILwl;)V", line = 98)
    public final void method2788(int arg0, class432 arg1) {
        try {
            if (this.field5376 == null || ~this.field5376.length >= ~this.field5381) {
                this.method2786(31958, this.field5381 + 5);
            }
            if (arg0 != 5) {
                this.method2786(62, 4);
            }
            ++field5374;
            this.field5376[this.field5381++] = arg1;
            this.field5373 = null;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5393[4] + arg0 + ',' + (arg1 != null ? field5393[1] : field5393[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lwq;)V", line = 216)
    public class328(class176 arg0) {
        try {
            this.method2785(122, arg0);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5393[2] + (arg0 != null ? field5393[1] : field5393[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(BLjava/lang/String;)I", line = 136)
    public final int method2789(byte arg0, String arg1) {
        try {
            ++field5387;
            int var3 = -40 % ((arg0 - 34) / 40);
            for (int var4 = 0; var4 < this.field5381; ++var4) {
                if (this.field5376[var4].field6783.equalsIgnoreCase(arg1)) {
                    return var4;
                }
            }
            return -1;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field5393[5] + arg0 + ',' + (arg1 != null ? field5393[1] : field5393[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)[I", line = 164)
    public final int[] method2790(int arg0) {
        try {
            if (arg0 != 0) {
                return null;
            } else {
                if (this.field5373 == null) {
                    String[] var2 = new String[this.field5381];
                    this.field5373 = new int[this.field5381];
                    int var3 = 0;
                    while (~this.field5381 < ~var3) {
                        var2[var3] = this.field5376[var3].field6783;
                        this.field5373[var3] = var3++;
                    }
                    class413.method3301(0, var2, this.field5373);
                }
                ++field5384;
                return this.field5373;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5393[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(II)V", line = 198)
    public final void method2791(int arg0, int arg1) {
        try {
            --this.field5381;
            ++field5388;
            if (arg1 == 0) {
                if (~this.field5381 != -1) {
                    class405.method3255(this.field5376, arg0 - -1, this.field5376, arg0, this.field5381 - arg0);
                } else {
                    this.field5376 = null;
                }
                this.field5373 = null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5393[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2792(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 92);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2793(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 37;
                    break;
                case 1:
                    var10005 = 118;
                    break;
                case 2:
                    var10005 = 94;
                    break;
                case 3:
                    var10005 = 52;
                    break;
                default:
                    var10005 = 92;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
