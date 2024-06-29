import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class55 {

    @OriginalMember(owner = "client!nca", name = "i", descriptor = "Z")
    public boolean field718 = false;

    @OriginalMember(owner = "client!nca", name = "g", descriptor = "[F")
    public static float[] field716 = new float[16384];

    @OriginalMember(owner = "client!nca", name = "o", descriptor = "[F")
    public static float[] field724 = new float[16384];

    @OriginalMember(owner = "client!nca", name = "p", descriptor = "Z")
    public static boolean field725 = false;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!nca", name = "d", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!nca", name = "f", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!nca", name = "h", descriptor = "I")
    public int field717;

    @OriginalMember(owner = "client!nca", name = "j", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!nca", name = "l", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!nca", name = "m", descriptor = "I")
    public int field722;

    @OriginalMember(owner = "client!nca", name = "n", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!nca", name = "q", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!nca", name = "e", descriptor = "Lkaa;")
    public class166 field714;

    @OriginalMember(owner = "client!nca", name = "k", descriptor = "[Lf;")
    public static class532[] field720;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field724[var2] = (float) Math.sin((double) var2 * var0);
            field716[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(B)V", line = 4)
    public static void method319(byte arg0) {
        field716 = null;
        if (arg0 != -3) {
            method321(-75, -113, (byte) 35);
        }
        field724 = null;
        field720 = null;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lir;IIIII)V", line = 20)
    public static final void method320(class27 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class171.field2428 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class329.field4421) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class641.field8846 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class207 var14 = class153.field2168[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class246.field3214[var11].method1611(var12, true, var13) + class246.field3214[var11].method1611(var12 + 1, true, var13) + class246.field3214[var11].method1611(var12, true, var13 + 1) + class246.field3214[var11].method1611(var12 + 1, true, var13 + 1)) / 4 - (class246.field3214[arg1].method1611(arg2, true, arg3) + class246.field3214[arg1].method1611(arg2 + 1, true, arg3) + class246.field3214[arg1].method1611(arg2, true, arg3 + 1) + class246.field3214[arg1].method1611(arg2 + 1, true, arg3 + 1)) / 4;
                                    class190 var16 = var14.field2768;
                                    class190 var17 = var14.field2767;
                                    if (var16 != null && var16.method166(0)) {
                                        arg0.method169((var13 - arg3) * class458.field6012 + (1 - arg5) * class332.field4443, var16, var6, var15, class377.field4985, (var12 - arg2) * class458.field6012 + (1 - arg4) * class332.field4443, (byte) -120);
                                    }
                                    if (var17 != null && var17.method166(0)) {
                                        arg0.method169((var13 - arg3) * class458.field6012 + (1 - arg5) * class332.field4443, var17, var6, var15, class377.field4985, (var12 - arg2) * class458.field6012 + (1 - arg4) * class332.field4443, (byte) -121);
                                    }
                                    for (class634 var18 = var14.field2774; var18 != null; var18 = var18.field8764) {
                                        class29 var19 = var18.field8767;
                                        if (var19 != null && var19.method166(0) && (var19.field423 == var12 || var7 == var12) && (var19.field419 == var13 || var9 == var13)) {
                                            int var20 = var19.field420 + 1 - var19.field423;
                                            int var21 = var19.field421 + 1 - var19.field419;
                                            arg0.method169((var19.field419 - arg3) * class458.field6012 + (var21 - arg5) * class332.field4443, var19, var6, var15, class377.field4985, (var19.field423 - arg2) * class458.field6012 + (var20 - arg4) * class332.field4443, (byte) -119);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIB)Z", line = 109)
    public static final boolean method321(int arg0, int arg1, byte arg2) {
        field712++;
        if (arg2 != 35) {
            field720 = null;
        }
        return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(BB)C", line = 121)
    public static final char method322(byte arg0, byte arg1) {
        field713++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (arg1 < 22) {
            field725 = true;
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class527.field7294[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lio;IZ)V", line = 153)
    private final void method323(class157 arg0, int arg1, boolean arg2) {
        if (arg2) {
            return;
        }
        field715++;
        if (arg1 == 1) {
            this.field717 = arg0.method963(-124);
        } else if (arg1 == 2) {
            this.field722 = arg0.method933((byte) 1);
        } else if (arg1 == 3) {
            this.field718 = true;
            return;
        } else if (arg1 == 4) {
            this.field717 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(B)Z", line = 182)
    public final boolean method324(byte arg0) {
        if (arg0 <= 79) {
            field726 = 30;
        }
        field723++;
        return this.field714.field2380.method1931(1, this.field717);
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIII)V", line = 202)
    public static final void method325(int arg0, int arg1, int arg2, int arg3) {
        field710++;
        class256 var4 = class592.method3279((byte) -86, arg1, arg2);
        var4.method1549(arg1 - 32051);
        var4.field3354 = arg0;
        var4.field3358 = arg3;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZILr;I)Lf;", line = 223)
    public final class532 method326(boolean arg0, int arg1, class562 arg2, int arg3) {
        field711++;
        long var5 = (long) (arg2.field7672 << 19 | this.field717 | arg1 << 16 | (arg0 ? 262144 : 0));
        class532 var7 = (class532) this.field714.field2382.method2176(arg3 ^ 0xFFFBFF80, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field714.field2380.method1931(arg3 - 262143, this.field717)) {
            class92 var8 = class92.method506(this.field714.field2380, this.field717, 0);
            if (arg3 != 262144) {
                return null;
            }
            if (var8 != null) {
                var8.field1133 = var8.field1125 = var8.field1131 = var8.field1126 = 0;
                if (arg0) {
                    var8.method511();
                }
                for (int var9 = 0; var9 < arg1; var9++) {
                    var8.method510();
                }
            }
            class532 var10 = arg2.method1139(var8, true);
            if (var10 != null) {
                this.field714.field2382.method2174(var10, var5, (byte) 122);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lio;Z)V", line = 272)
    public final void method327(class157 arg0, boolean arg1) {
        field719++;
        if (arg1) {
            this.field714 = null;
        }
        while (true) {
            int var3 = arg0.method930(255);
            if (var3 == 0) {
                return;
            }
            this.method323(arg0, var3, false);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 306)
    public static final String method328(String arg0, byte arg1) {
        field721++;
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3 && class702.method3943(false, arg0.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && class702.method3943(false, arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (class291.method1725(var7, 80)) {
                char var8 = class180.method1208(var7, arg1 ^ 0xC6);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else if (arg1 == -64) {
            return var5.toString();
        } else {
            return null;
        }
    }
}
