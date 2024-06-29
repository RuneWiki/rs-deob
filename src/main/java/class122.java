import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class122 implements class65 {

    @OriginalMember(owner = "client!v", name = "t", descriptor = "Z")
    private boolean field2942 = true;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "[[[I")
    public static int[][][] field2938 = new int[4][13][13];

    @OriginalMember(owner = "client!v", name = "M", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2961 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!v", name = "bb", descriptor = "I")
    public static int field2976 = 0;

    @OriginalMember(owner = "client!v", name = "ab", descriptor = "Lv;")
    public static class122 field2975 = class55.method425(-50, "@or3@");

    @OriginalMember(owner = "client!v", name = "lb", descriptor = "I")
    public static int field2986 = 50;

    @OriginalMember(owner = "client!v", name = "db", descriptor = "[Lv;")
    public static class122[] field2978 = new class122[field2986];

    @OriginalMember(owner = "client!v", name = "jb", descriptor = "[I")
    public static int[] field2984 = new int[field2986];

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "[I")
    public static int[] field2973 = new int[field2986];

    @OriginalMember(owner = "client!v", name = "eb", descriptor = "Lv;")
    public static class122 field2979 = class55.method425(-94, "Benutzen Sie bitte eine andere Welt)3");

    @OriginalMember(owner = "client!v", name = "ib", descriptor = "Z")
    public static boolean field2983 = false;

    @OriginalMember(owner = "client!v", name = "hb", descriptor = "[I")
    public static int[] field2982 = new int[field2986];

    @OriginalMember(owner = "client!v", name = "fb", descriptor = "[I")
    public static int[] field2980 = new int[field2986];

    @OriginalMember(owner = "client!v", name = "mb", descriptor = "[I")
    public static int[] field2987 = new int[field2986];

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "[I")
    public static int[] field2974 = new int[field2986];

    @OriginalMember(owner = "client!v", name = "cb", descriptor = "Lv;")
    public static class122 field2977 = class55.method425(-116, "Bitte versuchen Sie es in ");

    @OriginalMember(owner = "client!v", name = "X", descriptor = "[I")
    public static int[] field2972 = new int[field2986];

    @OriginalMember(owner = "client!v", name = "gb", descriptor = "Ljb;")
    public static class56 field2981 = new class56(50);

    @OriginalMember(owner = "client!v", name = "pb", descriptor = "I")
    public static int field2990 = 0;

    @OriginalMember(owner = "client!v", name = "qb", descriptor = "Lv;")
    public static class122 field2991 = class55.method425(-57, "Maximale Anmelde)2Versuche \u001c1berschritten)3");

    @OriginalMember(owner = "client!v", name = "nb", descriptor = "I")
    public static int field2988 = 0;

    @OriginalMember(owner = "client!v", name = "ob", descriptor = "B")
    public static byte field2989 = 0;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    private int field2931;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!v", name = "T", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!v", name = "V", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!v", name = "W", descriptor = "I")
    public int field2971;

    // $FF: synthetic field
    @OriginalMember(owner = "client!v", name = "rb", descriptor = "Ljava/lang/Class;")
    public static Class field2992;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "[B")
    public byte[] field2923;

    @OriginalMember(owner = "client!v", name = "kb", descriptor = "[I")
    public static int[] field2985;

    // $FF: synthetic method
    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method969(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLjava/awt/FontMetrics;)I", line = 3)
    public final int method930(boolean arg0, FontMetrics arg1) {
        field2968++;
        String var3;
        try {
            var3 = new String(this.field2923, 0, this.field2971, "ISO-8859-1");
            if (arg0) {
                field2986 = -89;
            }
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field2923, 0, this.field2971);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lv;B)Lv;", line = 23)
    public final class122 method931(class122 arg0, byte arg1) {
        field2956++;
        if (!this.field2942) {
            throw new IllegalArgumentException();
        }
        this.field2931 = 0;
        if (this.field2971 + arg0.field2971 > this.field2923.length) {
            int var3;
            for (var3 = 1; var3 < this.field2971 + arg0.field2971; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class27.method268(this.field2923, 0, var4, 0, this.field2971);
            this.field2923 = var4;
        }
        class27.method268(arg0.field2923, 0, this.field2923, this.field2971, arg0.field2971);
        if (arg1 > -35) {
            this.method939(96);
        }
        this.field2971 += arg0.field2971;
        return this;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILv;)I", line = 68)
    private final int method932(int arg0, int arg1, class122 arg2) {
        int[] var4 = new int[arg2.field2971];
        field2951++;
        if (arg1 != 23160) {
            return 12;
        }
        int[] var5 = new int[256];
        int[] var6 = new int[arg2.field2971];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg2.field2971;
        }
        for (int var8 = 1; var8 <= arg2.field2971; var8++) {
            var4[var8 - 1] = (arg2.field2971 << 1) - var8;
            var5[class30.method286(arg2.field2923[var8 - 1], 255)] = arg2.field2971 - var8;
        }
        int var9 = arg2.field2971 + 1;
        for (int var10 = arg2.field2971; var10 > 0; var10--) {
            var6[var10 - 1] = var9;
            while (arg2.field2971 >= var9 && arg2.field2923[var9 - 1] != arg2.field2923[var10 - 1]) {
                if (var4[var9 - 1] >= arg2.field2971 - var10) {
                    var4[var9 - 1] = arg2.field2971 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var9--;
        }
        int var11 = var9;
        int var12 = 1;
        int var13 = arg2.field2971 + 1 - var9;
        int var14 = 0;
        int var15 = 1;
        while (var13 >= var15) {
            var6[var15 - 1] = var14;
            while (var14 >= 1 && arg2.field2923[var15 - 1] != arg2.field2923[var14 - 1]) {
                var14 = var6[var14 - 1];
            }
            var15++;
            var14++;
        }
        while (var11 < arg2.field2971) {
            for (int var18 = var12; var18 <= var11; var18++) {
                if (var4[var18 - 1] >= arg2.field2971 + var11 - var18) {
                    var4[var18 - 1] = arg2.field2971 + var11 - var18;
                }
            }
            var12 = var11 + 1;
            var11 = var11 + var13 - var6[var13 - 1];
            var13 = var6[var13 - 1];
        }
        int var17;
        for (int var16 = arg2.field2971 + arg0 - 1; var16 < this.field2971; var16 += Math.max(var5[this.field2923[var16] & 0xFF], var4[var17])) {
            for (var17 = arg2.field2971 - 1; var17 >= 0 && this.field2923[var16] == arg2.field2923[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lv;I)Z", line = 181)
    public final boolean method933(class122 arg0, int arg1) {
        field2950++;
        if (arg0 == null) {
            return false;
        } else if (this.field2971 == arg0.field2971) {
            if (!this.field2942 || !arg0.field2942) {
                if (this.field2931 == 0) {
                    this.field2931 = this.method961(-27922);
                    if (this.field2931 == 0) {
                        this.field2931 = 1;
                    }
                }
                if (arg0.field2931 == 0) {
                    arg0.field2931 = arg0.method961(-27922);
                    if (arg0.field2931 == 0) {
                        arg0.field2931 = 1;
                    }
                }
                if (this.field2931 != arg0.field2931) {
                    return false;
                }
            }
            for (int var3 = arg1; var3 < this.field2971; var3++) {
                if (this.field2923[var3] != arg0.field2923[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V", line = 235)
    public static void method934(byte arg0) {
        field2973 = null;
        field2984 = null;
        field2972 = null;
        field2985 = null;
        field2974 = null;
        field2991 = null;
        field2982 = null;
        field2961 = null;
        field2979 = null;
        field2981 = null;
        if (arg0 != 107) {
            method945(26, 75, -118, 69, null);
        }
        field2987 = null;
        field2980 = null;
        field2975 = null;
        field2978 = null;
        field2977 = null;
        field2938 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)I", line = 261)
    public final int method935(int arg0, int arg1) {
        if (arg1 <= 23) {
            return -9;
        } else {
            field2954++;
            return this.method941(arg0, -1, 0);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)Z", line = 275)
    public final boolean method936(int arg0) {
        field2940++;
        if (arg0 != 10) {
            field2988 = -92;
        }
        return this.method937(-3291, 10);
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)Z", line = 288)
    private final boolean method937(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        field2955++;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field2971; var6++) {
            int var7 = this.field2923[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                return false;
            }
            if (arg1 <= var7) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                return false;
            }
            var5 = var8;
            var4 = true;
        }
        if (arg0 != -3291) {
            this.method936(-49);
        }
        return var4;
    }

    @OriginalMember(owner = "client!v", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 373)
    public final boolean equals(Object arg0) {
        field2944++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILv;)Z", line = 387)
    public final boolean method938(int arg0, class122 arg1) {
        field2947++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 != -8186) {
            this.method938(8, null);
        }
        if (this.field2971 != arg1.field2971) {
            return false;
        }
        for (int var3 = 0; var3 < this.field2971; var3++) {
            byte var4 = this.field2923[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            byte var5 = arg1.field2923[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)Lv;", line = 428)
    public final class122 method939(int arg0) {
        boolean var2 = true;
        field2928++;
        class122 var3 = new class122();
        var3.field2971 = this.field2971;
        if (arg0 != 15365) {
            return null;
        }
        var3.field2923 = new byte[this.field2971];
        for (int var4 = 0; var4 < this.field2971; var4++) {
            byte var5 = this.field2923[var4];
            if (var5 == 95) {
                var3.field2923[var4] = 32;
                var2 = true;
            } else if (var5 >= 97 && var5 <= 122 && var2) {
                var2 = false;
                var3.field2923[var4] = (byte) (var5 - 32);
            } else {
                var3.field2923[var4] = var5;
                var2 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(II)I", line = 473)
    private final int method940(int arg0, int arg1) {
        field2953++;
        boolean var3 = false;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var4 = false;
        int var5 = 0;
        int var6 = 0;
        if (arg0 != -18329) {
            this.method954(-86);
        }
        while (var6 < this.field2971) {
            label83: {
                int var7 = this.field2923[var6] & 0xFF;
                if (var6 == 0) {
                    if (var7 == 45) {
                        var3 = true;
                        break label83;
                    }
                    if (var7 == 43) {
                        break label83;
                    }
                }
                if (var7 >= 48 && var7 <= 57) {
                    var7 -= 48;
                } else if (var7 >= 65 && var7 <= 90) {
                    var7 -= 55;
                } else if (var7 >= 97 && var7 <= 122) {
                    var7 -= 87;
                } else {
                    throw new NumberFormatException();
                }
                if (var7 >= arg1) {
                    throw new NumberFormatException();
                }
                if (var3) {
                    var7 = -var7;
                }
                int var8 = arg1 * var5 + var7;
                if (var8 / arg1 != var5) {
                    throw new NumberFormatException();
                }
                var4 = true;
                var5 = var8;
            }
            var6++;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)I", line = 549)
    private final int method941(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            return 125;
        }
        field2946++;
        byte var4 = (byte) arg0;
        for (int var5 = arg2; var5 < this.field2971; var5++) {
            if (this.field2923[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZI)Lv;", line = 578)
    public final class122 method942(boolean arg0, int arg1) {
        class122 var3 = new class122();
        var3.field2923 = new byte[this.field2971 + 1];
        field2943++;
        var3.field2971 = this.field2971 + 1;
        if (arg0) {
            return null;
        } else {
            class27.method268(this.field2923, 0, var3.field2923, 0, this.field2971);
            var3.field2923[this.field2971] = (byte) arg1;
            return var3;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)Lv;", line = 606)
    public final class122 method943(byte arg0, int arg1) {
        field2958++;
        if (!this.field2942) {
            throw new IllegalArgumentException();
        }
        this.field2931 = 0;
        if (this.field2923.length == this.field2971) {
            int var3;
            for (var3 = 1; var3 <= this.field2971; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class27.method268(this.field2923, 0, var4, 0, this.field2971);
            this.field2923 = var4;
        }
        if (arg0 > -117) {
            this.method939(44);
        }
        this.field2923[this.field2971++] = (byte) arg1;
        return this;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([BZIII)I", line = 658)
    public final int method944(byte[] arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            this.method960(-40, 6);
        }
        class27.method268(this.field2923, arg2, arg0, arg4, arg3 - arg2);
        field2952++;
        return arg3 - arg2;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIILja;)V", line = 682)
    public static final void method945(int arg0, int arg1, int arg2, int arg3, class55 arg4) {
        field2957++;
        if (class70.field1828 == arg4 || class51.field1313 >= 400) {
            return;
        }
        class122 var5;
        if (arg4.field1450 == 0) {
            var5 = class59.method454(new class122[] { arg4.field1448, class28.method271(class70.field1828.field1455, arg4.field1455, false), class114.field2801, class64.field1659, class119.method914(arg4.field1455, 10), class107.field2641 }, 5176);
        } else {
            var5 = class59.method454(new class122[] { arg4.field1448, class114.field2801, class16.field385, class119.method914(arg4.field1450, arg1 ^ 0x50), class107.field2641 }, arg1 ^ 0x1462);
        }
        if (arg1 != 90) {
            method963((byte) 119);
        }
        if (field2990 == 1) {
            class26.field703++;
            class108.method839(class100.field2505, arg0, 16, arg3, class59.method454(new class122[] { class61.field1568, class30.field761, var5 }, 5176), arg2, 39);
        } else if (class91.field2334 != 1) {
            for (int var6 = 4; var6 >= 0; var6--) {
                if (class73.field1885[var6] != null) {
                    class118.field2855++;
                    short var7 = 0;
                    int var8 = 0;
                    if (class73.field1885[var6].method938(arg1 ^ 0xFFFFE05C, class115.field2821)) {
                        if (class70.field1828.field1455 < arg4.field1455) {
                            var7 = 2000;
                        }
                        if (class70.field1828.field1445 != 0 && arg4.field1445 != 0) {
                            if (class70.field1828.field1445 == arg4.field1445) {
                                var7 = 2000;
                            } else {
                                var7 = 0;
                            }
                        }
                    } else if (class91.field2337[var6]) {
                        var7 = 2000;
                    }
                    if (var6 == 0) {
                        var8 = var7 + 22;
                    }
                    if (var6 == 1) {
                        var8 = var7 + 20;
                    }
                    if (var6 == 2) {
                        var8 = var7 + 10;
                    }
                    if (var6 == 3) {
                        var8 = var7 + 34;
                    }
                    if (var6 == 4) {
                        var8 = var7 + 32;
                    }
                    class108.method839(class73.field1885[var6], arg0, var8, arg3, class59.method454(new class122[] { class89.field2270, var5 }, 5176), arg2, 125);
                }
            }
        } else if ((class32.field778 & 0x8) == 8) {
            class84.field2181++;
            class108.method839(class21.field557, arg0, 12, arg3, class59.method454(new class122[] { class70.field1825, class30.field761, var5 }, 5176), arg2, -120);
        }
        for (int var9 = 0; var9 < class51.field1313; var9++) {
            if (class56.field1483[var9] == 28) {
                class23.field617[var9] = class59.method454(new class122[] { class83.field2154, class21.field577, class89.field2270, var5 }, 5176);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)I", line = 796)
    public final int method946(int arg0) {
        field2967++;
        return arg0 == 70 ? this.field2971 : 68;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)Lv;", line = 808)
    public final class122 method947(int arg0) {
        field2932++;
        if (!this.field2942) {
            throw new IllegalArgumentException();
        }
        this.field2931 = 0;
        if (arg0 < 120) {
            field2975 = null;
        }
        if (this.field2923.length != this.field2971) {
            byte[] var2 = new byte[this.field2971];
            class27.method268(this.field2923, 0, var2, 0, this.field2971);
            this.field2923 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(Lv;B)Z", line = 838)
    public final boolean method948(class122 arg0, byte arg1) {
        field2937++;
        if (arg1 < 70) {
            return true;
        } else if (arg0.field2971 > this.field2971) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field2971; var3++) {
                if (this.field2923[var3] != arg0.field2923[var3]) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(ILv;)Z", line = 866)
    public final boolean method949(int arg0, class122 arg1) {
        field2945++;
        if (this.field2971 < arg1.field2971) {
            return false;
        }
        int var3 = this.field2971 - arg1.field2971;
        for (int var4 = 0; var4 < arg1.field2971; var4++) {
            if (this.field2923[var3 + var4] != arg1.field2923[var4]) {
                return false;
            }
        }
        if (arg0 != -91) {
            field2978 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)Lv;", line = 895)
    public final class122 method950(byte arg0) {
        field2935++;
        int var2 = 0;
        class122 var3 = new class122();
        var3.field2923 = new byte[12];
        var3.field2971 = 0;
        if (arg0 != -3) {
            field2961 = null;
        }
        for (int var4 = 0; var4 < this.field2971; var4++) {
            if (this.field2923[var4] >= 65 && this.field2923[var4] <= 90) {
                var3.field2923[var2++] = (byte) (this.field2923[var4] + 97 - 65);
                var3.field2971 = var2;
            } else if (this.field2923[var4] >= 97 && this.field2923[var4] <= 122 || this.field2923[var4] >= 48 && this.field2923[var4] <= 57) {
                var3.field2923[var2++] = this.field2923[var4];
                var3.field2971 = var2;
            } else if (var2 > 0) {
                var3.field2923[var2++] = 95;
            }
            if (var2 == 12) {
                break;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(III)Lv;", line = 945)
    public final class122 method951(int arg0, int arg1, int arg2) {
        field2962++;
        class122 var4 = new class122();
        var4.field2971 = arg1 - arg2;
        var4.field2923 = new byte[arg1 - arg2];
        if (arg0 != 7835) {
            method963((byte) -71);
        }
        class27.method268(this.field2923, arg2, var4.field2923, 0, var4.field2971);
        return var4;
    }

    @OriginalMember(owner = "client!v", name = "toString", descriptor = "()Ljava/lang/String;", line = 962)
    public final String toString() {
        field2930++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(I)J", line = 972)
    private final long method952(int arg0) {
        field2939++;
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field2971; var4++) {
            var2 = (var2 << 5) + (long) (this.field2923[var4] & 0xFF) - var2;
        }
        if (arg0 > -7) {
            field2979 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)Lv;", line = 1011)
    public final class122 method953(boolean arg0) {
        long var2 = this.method952(-54);
        field2963++;
        synchronized (field2992 == null ? (field2992 = method969("v")) : field2992) {
            if (class29.field735 == null) {
                class29.field735 = new class75(4096);
            } else {
                for (class67 var5 = (class67) class29.field735.method631(var2, -26644); var5 != null; var5 = (class67) class29.field735.method638(11)) {
                    if (this.method933(var5.field1711, 0)) {
                        return var5.field1711;
                    }
                }
            }
            class67 var7 = new class67();
            var7.field1711 = this;
            this.field2942 = arg0;
            class29.field735.method633(var2, -100, var7);
            return this;
        }
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)Lv;", line = 1047)
    public final class122 method954(int arg0) {
        field2949++;
        class122 var2 = new class122();
        var2.field2971 = this.field2971;
        var2.field2923 = new byte[this.field2971];
        for (int var3 = 0; var3 < this.field2971; var3++) {
            var2.field2923[var3] = 42;
        }
        if (arg0 != -31758) {
            field2982 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(ILv;)I", line = 1071)
    public final int method955(int arg0, class122 arg1) {
        if (arg0 == 24669) {
            field2960++;
            return this.method932(0, 23160, arg1);
        } else {
            return 59;
        }
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "(I)[B", line = 1085)
    public final byte[] method956(int arg0) {
        if (arg0 != -15382) {
            this.method941(40, -70, -16);
        }
        field2964++;
        byte[] var2 = new byte[this.field2971];
        class27.method268(this.field2923, 0, var2, 0, this.field2971);
        return var2;
    }

    @OriginalMember(owner = "client!v", name = "h", descriptor = "(I)Lv;", line = 1100)
    public final class122 method957(int arg0) {
        field2924++;
        if (arg0 != -66) {
            this.method955(80, null);
        }
        int var2;
        for (var2 = 0; var2 < this.field2971 && this.field2923[var2] >= 0 && this.field2923[var2] <= 32; var2++) {
        }
        int var3;
        for (var3 = this.field2971; var2 < var3 && this.field2923[var3 - 1] >= 0 && this.field2923[var3 - 1] <= 32; var3--) {
        }
        if (var2 == 0 && this.field2971 == var3) {
            return this;
        }
        class122 var4 = new class122();
        var4.field2971 = var3 - var2;
        var4.field2923 = new byte[var4.field2971];
        for (int var5 = 0; var5 < var4.field2971; var5++) {
            var4.field2923[var5] = this.field2923[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!v", name = "hashCode", descriptor = "()I", line = 1142)
    public final int hashCode() {
        field2948++;
        return this.method961(-27922);
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(Z)I", line = 1152)
    public final int method958(boolean arg0) {
        field2926++;
        if (arg0) {
            field2938 = null;
        }
        return this.method940(-18329, 10);
    }

    @OriginalMember(owner = "client!v", name = "i", descriptor = "(I)J", line = 1168)
    public final long method959(int arg0) {
        field2929++;
        long var2 = 0L;
        for (int var4 = 0; this.field2971 > var4 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field2923[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 + 1 - 65;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 + 1 - 97;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 + 27 - 48;
            }
        }
        if (arg0 != -1) {
            field2966 = -69;
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(II)Lv;", line = 1215)
    public final class122 method960(int arg0, int arg1) {
        field2941++;
        if (arg1 < 124) {
            this.method965((byte) 79);
        }
        return this.method951(7835, this.field2971, arg0);
    }

    @OriginalMember(owner = "client!v", name = "j", descriptor = "(I)I", line = 1231)
    public final int method961(int arg0) {
        field2959++;
        int var2 = 0;
        if (arg0 != -27922) {
            this.method959(-69);
        }
        for (int var3 = 0; var3 < this.field2971; var3++) {
            var2 = (var2 << 5) + (this.field2923[var3] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!v", name = "k", descriptor = "(I)Lv;", line = 1259)
    public final class122 method962(int arg0) {
        class122 var2 = new class122();
        var2.field2971 = this.field2971;
        field2936++;
        var2.field2923 = new byte[this.field2971];
        if (arg0 != 40) {
            this.method942(true, -57);
        }
        for (int var3 = 0; var3 < this.field2971; var3++) {
            byte var4 = this.field2923[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field2923[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V", line = 1291)
    public static final void method963(byte arg0) {
        if (arg0 > -48) {
            method945(70, -98, -106, -55, null);
        }
        for (int var1 = 0; var1 < class83.field2151; var1++) {
            int var10002 = class50.field1262[var1]--;
            if (class50.field1262[var1] >= -10) {
                class86 var3 = class10.field213[var1];
                if (var3 == null) {
                    var3 = class86.method684(class24.field662, class6.field149[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class50.field1262[var1] += var3.method686();
                    class10.field213[var1] = var3;
                }
                if (class50.field1262[var1] < 0) {
                    class35 var4 = var3.method683().method313(class125.field3032);
                    class20 var5 = class20.method203(var4, 100, class56.field1465);
                    var5.method207(class28.field722[var1] - 1);
                    class63.field1604.method858(var5);
                    class50.field1262[var1] = -100;
                }
            } else {
                class83.field2151--;
                for (int var2 = var1; var2 < class83.field2151; var2++) {
                    class6.field149[var2] = class6.field149[var2 + 1];
                    class10.field213[var2] = class10.field213[var2 + 1];
                    class28.field722[var2] = class28.field722[var2 + 1];
                    class50.field1262[var2] = class50.field1262[var2 + 1];
                }
                var1--;
            }
        }
        if (class66.field1708 > 0) {
            class66.field1708 -= 20;
            if (class66.field1708 < 0) {
                class66.field1708 = 0;
            }
            if (class66.field1708 == 0 && class54.field1380 != 0 && class107.field2657 != -1) {
                class109.method848(0, 20672, class93.field2396, class107.field2657, class54.field1380, false, 0);
            }
        }
        field2933++;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V", line = 1376)
    public static final void method964(byte arg0) {
        if (arg0 != -97) {
            method963((byte) -63);
        }
        class37.field982.method473((byte) -4);
        class88.field2251 = class77.method647(class88.field2251);
        field2970++;
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(B)Lv;", line = 1403)
    public final class122 method965(byte arg0) {
        field2969++;
        class122 var2 = new class122();
        var2.field2971 = this.field2971;
        boolean var3 = true;
        var2.field2923 = new byte[this.field2971];
        if (arg0 != -36) {
            return null;
        }
        for (int var4 = 0; var4 < this.field2971; var4++) {
            byte var5 = this.field2923[var4];
            if (var5 >= 97 && var5 <= 122 || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var3) {
                    var5 = (byte) (var5 - 32);
                }
                var3 = false;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (!var3) {
                    var5 = (byte) (var5 + 32);
                }
                var3 = false;
            }
            if (var5 == 46 || var5 == 33 || var5 == 63) {
                var3 = true;
            }
            var2.field2923[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 1453)
    public final void method966(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg2 != 0) {
            field2976 = 105;
        }
        field2934++;
        String var5;
        try {
            var5 = new String(this.field2923, 0, this.field2971, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field2923, 0, this.field2971);
        }
        arg3.drawString(var5, arg0, arg1);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lv;II)Lv;", line = 1481)
    public final class122 method967(class122 arg0, int arg1, int arg2) {
        field2965++;
        if (arg1 != -4066) {
            return null;
        } else if (!this.field2942) {
            throw new IllegalArgumentException();
        } else if (arg2 > this.field2971) {
            throw new IllegalArgumentException();
        } else {
            this.field2931 = 0;
            if (this.field2923.length < arg0.field2971 + arg2) {
                int var4;
                for (var4 = 1; var4 < arg0.field2971 + arg2; var4 += var4) {
                }
                byte[] var5 = new byte[var4];
                class27.method268(this.field2923, 0, var5, 0, this.field2971);
                this.field2923 = var5;
            }
            class27.method268(arg0.field2923, 0, this.field2923, arg2, arg0.field2971);
            if (arg0.field2971 + arg2 > this.field2971) {
                this.field2971 = arg0.field2971 + arg2;
            }
            return this;
        }
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(II)I", line = 1538)
    public final int method968(int arg0, int arg1) {
        field2925++;
        return arg1 == 255 ? this.field2923[arg0] & 0xFF : 77;
    }
}
