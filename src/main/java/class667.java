import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class667 extends class659 {

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "Z")
    public boolean field8935 = true;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    public static int field8932;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    public static int field8933;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
    public static int field8934;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field8936;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    public static int field8937;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public static int field8940;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public static int field8942;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    public static int field8944;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field8945;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
    public static int field8946;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    public static int field8948;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "Lpm;")
    public class609 field8947;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "[I")
    private int[] field8938;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "[I")
    public int[] field8943;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field8939;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "[[I")
    private int[][] field8941;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)I")
    public final int method3672(byte arg0) {
        int var2 = 109 % ((-arg0 - 44) / 55);
        field8940++;
        return this.field8938 == null ? 0 : this.field8938.length;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IILdt;)V")
    private final void method3673(int arg0, int arg1, class254 arg2) {
        if (arg1 == 1) {
            this.field8939 = class684.method3748(-2242, arg2.method1699(-117), '<');
        } else if (arg1 == 2) {
            int var9 = arg2.method1731((byte) 64);
            this.field8943 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field8943[var10] = arg2.method1728((byte) 43);
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method1731((byte) 64);
            this.field8938 = new int[var4];
            this.field8941 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1728((byte) 125);
                class732 var7 = class500.method2929(var6, -101);
                if (var7 != null) {
                    this.field8938[var5] = var6;
                    this.field8941[var5] = new int[var7.field9908];
                    for (int var8 = 0; var8 < var7.field9908; var8++) {
                        this.field8941[var5][var8] = arg2.method1728((byte) 100);
                    }
                }
            }
        } else if (arg1 == 4) {
            this.field8935 = false;
        }
        field8948++;
        if (arg0 > -62) {
            this.field8935 = true;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILdt;)Ljava/lang/String;")
    public final String method3674(int arg0, class254 arg1) {
        field8945++;
        if (arg0 != 0) {
            this.method3676(null, -69);
        }
        StringBuffer var3 = new StringBuffer(80);
        if (this.field8938 != null) {
            for (int var4 = 0; var4 < this.field8938.length; var4++) {
                var3.append(this.field8939[var4]);
                var3.append(this.field8947.method3392(arg0 - 32769, this.field8941[var4], this.method3682(var4, (byte) -127), arg1.method1674(119, class500.method2929(this.field8938[var4], -113).field9904)));
            }
        }
        var3.append(this.field8939[this.field8939.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(B)V")
    public final void method3675(byte arg0) {
        if (arg0 != -39) {
            return;
        }
        if (this.field8943 != null) {
            for (int var2 = 0; var2 < this.field8943.length; var2++) {
                this.field8943[var2] = class670.method3699(this.field8943[var2], 32768);
            }
        }
        field8933++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ldt;I)V")
    public final void method3676(class254 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1731((byte) 64);
            if (var3 == 0) {
                if (arg1 != 25973) {
                    return;
                }
                field8932++;
                return;
            }
            this.method3673(-79, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([IILdt;)V")
    public final void method3677(int[] arg0, int arg1, class254 arg2) {
        field8934++;
        if (this.field8938 == null) {
            return;
        }
        if (arg1 != -1) {
            this.field8947 = null;
        }
        for (int var4 = 0; var4 < this.field8938.length; var4++) {
            if (var4 >= arg0.length) {
                return;
            }
            int var5 = this.method3682(var4, (byte) -20).field9907;
            if (var5 > 0) {
                arg2.method1730((long) arg0[var4], var5, -8);
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([[[Lvda;B)V")
    public static final void method3678(class194[][][] arg0, byte arg1) {
        if (arg1 < 96) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class194[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class194 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field2519 instanceof class602) {
                            ((class602) var6.field2519).method1745(true);
                        }
                        if (var6.field2529 instanceof class602) {
                            ((class602) var6.field2529).method1745(true);
                        }
                        if (var6.field2531 instanceof class602) {
                            ((class602) var6.field2531).method1745(true);
                        }
                        if (var6.field2527 instanceof class602) {
                            ((class602) var6.field2527).method1745(true);
                        }
                        if (var6.field2523 instanceof class602) {
                            ((class602) var6.field2523).method1745(true);
                        }
                        for (class511 var7 = var6.field2525; var7 != null; var7 = var7.field7127) {
                            class539 var8 = var7.field7126;
                            if (var8 instanceof class602) {
                                ((class602) var8).method1745(true);
                            }
                        }
                    }
                }
            }
        }
        field8946++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)Ljava/lang/String;")
    public final String method3679(int arg0) {
        field8942++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field8939 == null) {
            return "";
        }
        if (arg0 != -1) {
            this.field8938 = null;
        }
        var2.append(this.field8939[0]);
        for (int var3 = 1; var3 < this.field8939.length; var3++) {
            var2.append("...");
            var2.append(this.field8939[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)V")
    public static final void method3680(byte arg0, int arg1) {
        if (arg0 == -88) {
            field8936++;
            if (class460.field6560 == null || class460.field6560.length < arg1) {
                class460.field6560 = new int[arg1];
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)I")
    public final int method3681(int arg0, int arg1, int arg2) {
        field8944++;
        if (this.field8938 == null || arg1 < 0 || arg1 > this.field8938.length) {
            return -1;
        } else {
            if (arg2 > -119) {
                this.method3681(72, -120, 60);
            }
            return this.field8941[arg1] == null || arg0 < 0 || this.field8941[arg1].length < arg0 ? -1 : this.field8941[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)Led;")
    public final class732 method3682(int arg0, byte arg1) {
        field8937++;
        if (this.field8938 == null || arg0 < 0 || arg0 > this.field8938.length) {
            return null;
        } else {
            int var3 = 41 % ((-arg1 - 68) / 38);
            return class500.method2929(this.field8938[arg0], -120);
        }
    }
}
