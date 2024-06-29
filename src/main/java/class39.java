import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class39 implements class33 {

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "Z")
    private boolean field1081 = true;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Lfc;")
    private static class39 field1052 = class90.method774("This world is running a closed Beta)3", -119);

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field1053 = 0;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "Lfc;")
    public static class39 field1072 = field1052;

    @OriginalMember(owner = "client!fc", name = "U", descriptor = "Lfc;")
    public static class39 field1087 = class90.method774("Hidden)2use", -117);

    @OriginalMember(owner = "client!fc", name = "Y", descriptor = "[I")
    public static int[] field1091 = new int[256];

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "Lee;")
    public static class34 field1065 = new class34(5000);

    @OriginalMember(owner = "client!fc", name = "hb", descriptor = "Lp;")
    public static class104 field1100 = new class104(64);

    @OriginalMember(owner = "client!fc", name = "jb", descriptor = "Z")
    public static boolean field1102 = false;

    @OriginalMember(owner = "client!fc", name = "pb", descriptor = "Lfc;")
    public static class39 field1108 = class90.method774(":: (X", -85);

    @OriginalMember(owner = "client!fc", name = "ob", descriptor = "Lfc;")
    public static class39 field1107 = class90.method774("da dieser Computer gegen unsere ", -118);

    @OriginalMember(owner = "client!fc", name = "mb", descriptor = "Lfc;")
    private static class39 field1105 = class90.method774("Please use a different world)3", -120);

    @OriginalMember(owner = "client!fc", name = "ib", descriptor = "Lfc;")
    public static class39 field1101 = field1105;

    @OriginalMember(owner = "client!fc", name = "nb", descriptor = "Lfc;")
    public static class39 field1106 = field1105;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public int field1046;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!fc", name = "T", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!fc", name = "V", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!fc", name = "W", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!fc", name = "X", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!fc", name = "Z", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!fc", name = "ab", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!fc", name = "bb", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!fc", name = "cb", descriptor = "I")
    private int field1095;

    @OriginalMember(owner = "client!fc", name = "db", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!fc", name = "eb", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!fc", name = "fb", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!fc", name = "gb", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!fc", name = "lb", descriptor = "I")
    public static int field1104;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fc", name = "qb", descriptor = "Ljava/lang/Class;")
    public static Class field1109;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "[B")
    public byte[] field1067;

    @OriginalMember(owner = "client!fc", name = "kb", descriptor = "[Lue;")
    public static class141[] field1103;

    // $FF: synthetic method
    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method478(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I", line = 9)
    public final int method434(FontMetrics arg0, int arg1) {
        field1061++;
        String var3;
        try {
            var3 = new String(this.field1067, 0, this.field1046, "ISO-8859-1");
            if (arg1 != -26799) {
                this.method467(3);
            }
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field1067, 0, this.field1046);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!fc", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 30)
    public final boolean equals(Object arg0) {
        field1099++;
        if (!(arg0 instanceof class39)) {
            throw new IllegalArgumentException();
        }
        return this.method462(-111, (class39) arg0);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)I", line = 46)
    public static final int method435(byte arg0) {
        int var1 = -93 / ((-arg0 - 46) / 63);
        field1084++;
        return 6;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)Lfc;", line = 65)
    public final class39 method436(int arg0) {
        field1041++;
        if (arg0 != 18396) {
            return null;
        }
        int var2 = 0;
        class39 var3 = new class39();
        var3.field1046 = 0;
        var3.field1067 = new byte[12];
        for (int var4 = 0; var4 < this.field1046; var4++) {
            if (this.field1067[var4] >= 65 && this.field1067[var4] <= 90) {
                var3.field1067[var2++] = (byte) (this.field1067[var4] + 97 - 65);
                var3.field1046 = var2;
            } else if (this.field1067[var4] >= 97 && this.field1067[var4] <= 122 || this.field1067[var4] >= 48 && this.field1067[var4] <= 57) {
                var3.field1067[var2++] = this.field1067[var4];
                var3.field1046 = var2;
            } else if (var2 > 0) {
                var3.field1067[var2++] = 95;
            }
            if (var2 == 12) {
                break;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)I", line = 114)
    public final int method437(int arg0) {
        int var2 = -128 % ((arg0 + 2) / 39);
        field1045++;
        return this.field1046;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)I", line = 127)
    public final int method438(int arg0, int arg1) {
        field1085++;
        boolean var3 = false;
        if (arg1 != -1088756478) {
            this.method447(-84);
        }
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < this.field1046; var6++) {
            int var7 = this.field1067[var6] & 0xFF;
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
                throw new NumberFormatException();
            }
            if (arg0 <= var7) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg0 * var4 + var7;
            if (var8 / arg0 != var4) {
                throw new NumberFormatException();
            }
            var5 = true;
            var4 = var8;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var4;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIB)I", line = 217)
    private final int method439(int arg0, int arg1, byte arg2) {
        field1073++;
        byte var4 = (byte) arg0;
        for (int var5 = arg1; var5 < this.field1046; var5++) {
            if (this.field1067[var5] == var4) {
                return var5;
            }
        }
        int var6 = 75 / ((60 - arg2) / 42);
        return -1;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)Lfc;", line = 241)
    public final class39 method440(int arg0) {
        long var2 = this.method465(true);
        field1083++;
        synchronized (field1109 == null ? (field1109 = method478("fc")) : field1109) {
            if (class80.field1814 == null) {
                class80.field1814 = new class114(4096);
            } else {
                for (class143 var5 = (class143) class80.field1814.method995(false, var2); var5 != null; var5 = (class143) class80.field1814.method1000(-69)) {
                    if (this.method462(-112, var5.field3597)) {
                        return var5.field3597;
                    }
                }
            }
            class143 var7 = new class143();
            int var8 = 65 % ((-arg0 - 32) / 50);
            var7.field3597 = this;
            this.field1081 = false;
            class80.field1814.method998(var7, var2, (byte) -118);
            return this;
        }
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)Ljava/net/URL;", line = 280)
    public final URL method441(int arg0) throws MalformedURLException {
        if (arg0 != 12340) {
            field1052 = null;
        }
        field1096++;
        return new URL(new String(this.field1067, 0, this.field1046));
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BI)I", line = 294)
    public final int method442(byte arg0, int arg1) {
        field1066++;
        if (arg0 < 42) {
            this.hashCode();
        }
        return this.field1067[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILfc;I)I", line = 313)
    private final int method443(int arg0, class39 arg1, int arg2) {
        field1056++;
        int[] var4 = new int[256];
        int[] var5 = new int[arg1.field1046];
        int[] var6 = new int[arg1.field1046];
        for (int var7 = 0; var7 < var4.length; var7++) {
            var4[var7] = arg1.field1046;
        }
        for (int var8 = 1; var8 <= arg1.field1046; var8++) {
            var5[var8 - 1] = (arg1.field1046 << 1) - var8;
            var4[class87.method747(arg1.field1067[var8 - 1], 255)] = arg1.field1046 - var8;
        }
        int var9 = arg1.field1046 + 1;
        for (int var10 = arg1.field1046; var10 > 0; var10--) {
            var6[var10 - 1] = var9;
            while (arg1.field1046 >= var9 && arg1.field1067[var9 - 1] != arg1.field1067[var10 - 1]) {
                if (arg1.field1046 - var10 <= var5[var9 + -1]) {
                    var5[var9 - 1] = arg1.field1046 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var9--;
        }
        if (arg2 != -10593) {
            return 116;
        }
        int var11 = var9;
        int var12 = 0;
        int var13 = arg1.field1046 + 1 - var9;
        for (int var14 = 1; var14 <= var13; var14++) {
            var6[var14 - 1] = var12;
            while (var12 >= 1 && arg1.field1067[var12 - 1] != arg1.field1067[var14 - 1]) {
                var12 = var6[var12 - 1];
            }
            var12++;
        }
        int var15 = 1;
        while (arg1.field1046 > var11) {
            for (int var18 = var15; var18 <= var11; var18++) {
                if (var5[var18 - 1] >= arg1.field1046 + var11 - var18) {
                    var5[var18 - 1] = arg1.field1046 + var11 - var18;
                }
            }
            var15 = var11 + 1;
            var11 += var13 - var6[var13 - 1];
            var13 = var6[var13 - 1];
        }
        int var17;
        for (int var16 = arg1.field1046 + arg0 - 1; var16 < this.field1046; var16 += Math.max(var4[this.field1067[var16] & 0xFF], var5[var17])) {
            for (var17 = arg1.field1046 - 1; var17 >= 0 && this.field1067[var16] == arg1.field1067[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V", line = 424)
    public static void method444(byte arg0) {
        field1108 = null;
        if (arg0 > -51) {
            method463(null, -115);
        }
        field1101 = null;
        field1106 = null;
        field1103 = null;
        field1100 = null;
        field1107 = null;
        field1087 = null;
        field1072 = null;
        field1105 = null;
        field1091 = null;
        field1065 = null;
        field1052 = null;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)J", line = 445)
    public final long method445(byte arg0) {
        field1092++;
        long var2 = 0L;
        if (arg0 != 69) {
            this.method476(-70, 78);
        }
        for (int var4 = 0; var4 < this.field1046 && var4 < 12; var4++) {
            byte var5 = this.field1067[var4];
            var2 *= 37L;
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 - 64;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 + 1 - 97;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 + 27 - 48;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIII[B)I", line = 483)
    public final int method446(int arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        field1078++;
        class41.method497(this.field1067, arg3, arg4, arg1, arg0 - arg3);
        if (arg2 != -98) {
            method435((byte) -69);
        }
        return arg0 - arg3;
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)Lfc;", line = 512)
    public final class39 method447(int arg0) {
        field1080++;
        class39 var2 = new class39();
        boolean var3 = true;
        var2.field1046 = this.field1046;
        var2.field1067 = new byte[this.field1046];
        for (int var4 = 0; var4 < this.field1046; var4++) {
            byte var5 = this.field1067[var4];
            if (var5 == 95) {
                var3 = true;
                var2.field1067[var4] = 32;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var2.field1067[var4] = (byte) (var5 - 32);
                var3 = false;
            } else {
                var2.field1067[var4] = var5;
                var3 = false;
            }
        }
        if (arg0 != -98) {
            method435((byte) 100);
        }
        return var2;
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(B)Lfc;", line = 564)
    public final class39 method448(byte arg0) {
        field1071++;
        int var2;
        for (var2 = 0; var2 < this.field1046 && (this.field1067[var2] >= 0 && this.field1067[var2] <= 32 || (this.field1067[var2] & 0xFF) == 160); var2++) {
        }
        int var3;
        for (var3 = this.field1046; var2 < var3 && (this.field1067[var3 - 1] >= 0 && this.field1067[var3 - 1] <= 32 || (this.field1067[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (var2 == 0 && this.field1046 == var3) {
            return this;
        }
        class39 var4 = new class39();
        var4.field1046 = var3 - var2;
        var4.field1067 = new byte[var4.field1046];
        for (int var5 = 0; var5 < var4.field1046; var5++) {
            var4.field1067[var5] = this.field1067[var2 + var5];
        }
        return arg0 == -127 ? var4 : null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Loc;Z)I", line = 605)
    public static final int method449(class100 arg0, boolean arg1) {
        field1060++;
        int var2 = 0;
        if (arg0.method843(class136.field3403, class53.field1334, -20)) {
            var2++;
        }
        if (!arg1) {
            return -1;
        }
        if (arg0.method843(class111.field2878, class53.field1334, -20)) {
            var2++;
        }
        if (arg0.method843(class97.field2298, class53.field1334, -20)) {
            var2++;
        }
        if (arg0.method843(class120.field3145, class53.field1334, -20)) {
            var2++;
        }
        if (arg0.method843(class6.field198, class53.field1334, -20)) {
            var2++;
        }
        if (arg0.method843(class54.field1357, class53.field1334, -20)) {
            var2++;
        }
        if (arg0.method843(class79.field1796, class53.field1334, -20)) {
            var2++;
        }
        if (arg0.method843(class53.field1319, class53.field1334, -20)) {
            var2++;
        }
        if (arg0.method843(class128.field3276, class53.field1334, -20)) {
            var2++;
        }
        if (arg0.method843(class96.field2280, class53.field1334, -20)) {
            var2++;
        }
        if (arg0.method843(class119.field3104, class53.field1334, -20)) {
            var2++;
        }
        if (arg0.method843(class82.field1834, class53.field1334, -20)) {
            var2++;
        }
        if (arg0.method843(class79.field1805, class53.field1334, -20)) {
            var2++;
        }
        if (arg0.method843(class119.field3114, class53.field1334, -20)) {
            var2++;
        }
        if (arg0.method843(class1.field9, class53.field1334, -20)) {
            var2++;
        }
        if (arg0.method843(class110.field2831, class53.field1334, -20)) {
            var2++;
        }
        if (arg0.method843(class136.field3406, class53.field1334, -20)) {
            var2++;
        }
        if (arg0.method843(class71.field1674, class53.field1334, -20)) {
            var2++;
        }
        if (arg0.method843(class131.field3315, class53.field1334, -20)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)Lfc;", line = 691)
    public final class39 method450(boolean arg0) {
        byte var2 = 2;
        class39 var3 = new class39();
        if (!arg0) {
            field1105 = null;
        }
        var3.field1046 = this.field1046;
        var3.field1067 = new byte[this.field1046];
        for (int var4 = 0; var4 < this.field1046; var4++) {
            byte var5 = this.field1067[var4];
            if (var5 >= 97 && var5 <= 122 || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var2 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var2 = 0;
            } else if (var5 >= 65 && var5 <= 90 || !(var5 < -64 || var5 > -34 || var5 == -41)) {
                if (var2 == 0) {
                    var5 = (byte) (var5 + 32);
                }
                var2 = 0;
            } else if (var5 == 46 || var5 == 33 || var5 == 63) {
                var2 = 2;
            } else if (var5 != 32) {
                var2 = 1;
            } else if (var2 != 2) {
                var2 = 1;
            }
            var3.field1067[var4] = var5;
        }
        field1063++;
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLfc;)Z", line = 765)
    public final boolean method451(byte arg0, class39 arg1) {
        field1074++;
        if (this.field1046 < arg1.field1046) {
            return false;
        }
        int var3 = this.field1046 - arg1.field1046;
        for (int var4 = 0; var4 < arg1.field1046; var4++) {
            if (this.field1067[var3 + var4] != arg1.field1067[var4]) {
                return false;
            }
        }
        if (arg0 <= 57) {
            this.method451((byte) -91, null);
        }
        return true;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)Lfc;", line = 796)
    public final class39 method452(boolean arg0) {
        if (!arg0) {
            return null;
        }
        field1070++;
        class39 var2 = new class39();
        var2.field1046 = this.field1046;
        var2.field1067 = new byte[this.field1046];
        for (int var3 = 0; var3 < this.field1046; var3++) {
            byte var4 = this.field1067[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field1067[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)Lfc;", line = 826)
    public final class39 method453(int arg0, int arg1) {
        field1055++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class39 var3 = new class39();
        var3.field1067 = new byte[this.field1046 - arg0];
        var3.field1046 = this.field1046 + 1;
        class41.method497(this.field1067, 0, var3.field1067, 0, this.field1046);
        var3.field1067[this.field1046] = (byte) arg1;
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILfc;)I", line = 843)
    public final int method454(int arg0, class39 arg1) {
        field1051++;
        if (arg0 != -1) {
            field1072 = null;
        }
        int var3;
        if (this.field1046 <= arg1.field1046) {
            var3 = this.field1046;
        } else {
            var3 = arg1.field1046;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg1.field1067[var4] & 0xFF) > (this.field1067[var4] & 0xFF)) {
                return -1;
            }
            if ((arg1.field1067[var4] & 0xFF) < (this.field1067[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg1.field1046 > this.field1046) {
            return -1;
        } else if (arg1.field1046 < this.field1046) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLfc;)I", line = 894)
    public final int method455(boolean arg0, class39 arg1) {
        field1058++;
        int var3;
        if (arg1.field1046 < this.field1046) {
            var3 = arg1.field1046;
        } else {
            var3 = this.field1046;
        }
        int var4 = 0;
        if (arg0) {
            field1106 = null;
        }
        while (var3 > var4) {
            if (class56.field1394[this.field1067[var4] & 0xFF] < class56.field1394[arg1.field1067[var4] & 0xFF]) {
                return -1;
            }
            if (class56.field1394[this.field1067[var4] & 0xFF] > class56.field1394[arg1.field1067[var4] & 0xFF]) {
                return 1;
            }
            var4++;
        }
        if (arg1.field1046 > this.field1046) {
            return -1;
        } else if (this.field1046 > arg1.field1046) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)Lfc;", line = 938)
    public final class39 method456(int arg0, int arg1, int arg2) {
        field1059++;
        class39 var4 = new class39();
        var4.field1067 = new byte[arg2 - arg1];
        var4.field1046 = arg2 - arg1;
        class41.method497(this.field1067, arg1, var4.field1067, arg0, var4.field1046);
        return var4;
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)I", line = 951)
    public final int method457(int arg0) {
        if (arg0 != -25657) {
            field1052 = null;
        }
        field1089++;
        return this.method438(10, arg0 ^ 0x40E57EC5);
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(ILfc;)Lfc;", line = 962)
    public final class39 method458(int arg0, class39 arg1) {
        field1090++;
        if (!this.field1081) {
            throw new IllegalArgumentException();
        }
        this.field1095 = 0;
        if (this.field1046 + arg1.field1046 > this.field1067.length) {
            int var3;
            for (var3 = 1; var3 < this.field1046 + arg1.field1046; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class41.method497(this.field1067, 0, var4, 0, this.field1046);
            this.field1067 = var4;
        }
        class41.method497(arg1.field1067, 0, this.field1067, this.field1046, arg1.field1046);
        this.field1046 += arg1.field1046;
        if (arg0 != 1) {
            this.method446(-28, 122, -112, 80, null);
        }
        return this;
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(B)Z", line = 1000)
    public final boolean method459(byte arg0) {
        if (arg0 < 123) {
            this.field1067 = null;
        }
        field1042++;
        return this.method470((byte) -69, 10);
    }

    @OriginalMember(owner = "client!fc", name = "hashCode", descriptor = "()I", line = 1015)
    public final int hashCode() {
        field1088++;
        return this.method467(64);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lq;II)V", line = 1034)
    public static final void method460(class111 arg0, int arg1, int arg2) {
        if (class70.field1654 < arg0.field2904) {
            class79.method684(-1, arg0);
        } else if (arg0.field2880 >= class70.field1654) {
            class150.method1197((byte) 42, arg0);
        } else {
            client.method234(arg0, arg2 ^ 0xFFFFE278);
        }
        if (arg0.field2916 < 128 || arg0.field2909 < 128 || arg0.field2916 >= 13184 || arg0.field2909 >= 13184) {
            arg0.field2916 = arg0.field2913[0] * 128 + arg0.field2918 * 64;
            arg0.field2880 = 0;
            arg0.field2888 = -1;
            arg0.field2904 = 0;
            arg0.field2891 = -1;
            arg0.field2909 = arg0.field2926[0] * 128 + arg0.field2918 * 64;
            arg0.method976(true);
        }
        if (arg2 != -30616) {
            method463(null, -9);
        }
        field1097++;
        if (class94.field2197 == arg0 && (arg0.field2916 < 1536 || arg0.field2909 < 1536 || arg0.field2916 >= 11776 || arg0.field2909 >= 11776)) {
            arg0.field2904 = 0;
            arg0.field2916 = arg0.field2913[0] * 128 + arg0.field2918 * 64;
            arg0.field2909 = arg0.field2926[0] * 128 + arg0.field2918 * 64;
            arg0.field2891 = -1;
            arg0.field2888 = -1;
            arg0.field2880 = 0;
            arg0.method976(true);
        }
        class126.method1044((byte) -119, arg0);
        class54.method565(-125, arg0);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lfc;B)Z", line = 1092)
    public final boolean method461(class39 arg0, byte arg1) {
        field1098++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 != 82) {
            field1072 = null;
        }
        if (this.field1046 != arg0.field1046) {
            return false;
        }
        for (int var3 = 0; var3 < this.field1046; var3++) {
            byte var4 = this.field1067[var3];
            byte var5 = arg0.field1067[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(ILfc;)Z", line = 1135)
    public final boolean method462(int arg0, class39 arg1) {
        field1068++;
        if (arg1 == null) {
            return false;
        } else if (this.field1046 == arg1.field1046) {
            if (arg0 >= -110) {
                this.method448((byte) 64);
            }
            if (!this.field1081 || !arg1.field1081) {
                if (this.field1095 == 0) {
                    this.field1095 = this.method467(64);
                    if (this.field1095 == 0) {
                        this.field1095 = 1;
                    }
                }
                if (arg1.field1095 == 0) {
                    arg1.field1095 = arg1.method467(64);
                    if (arg1.field1095 == 0) {
                        arg1.field1095 = 1;
                    }
                }
                if (this.field1095 != arg1.field1095) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field1046; var3++) {
                if (this.field1067[var3] != arg1.field1067[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lob;I)Lob;", line = 1190)
    public static final class99 method463(class99 arg0, int arg1) {
        field1086++;
        int var2 = class109.method969((byte) 104, class89.method768(arg0, -49));
        if (var2 == 0) {
            return null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg0 = class54.method567(68, arg0.field2348);
            if (arg0 == null) {
                return null;
            }
        }
        int var4 = 46 / ((2 - arg1) / 39);
        return arg0;
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(B)V", line = 1218)
    public static final void method464(byte arg0) {
        if (arg0 > 28) {
            field1077++;
            class78.field1773 = new class114(32);
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(Z)J", line = 1230)
    private final long method465(boolean arg0) {
        long var2 = 0L;
        if (!arg0) {
            field1065 = null;
        }
        for (int var4 = 0; var4 < this.field1046; var4++) {
            var2 = (var2 << 5) + (long) (this.field1067[var4] & 0xFF) - var2;
        }
        field1079++;
        return var2;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)Lfc;", line = 1259)
    public final class39 method466(boolean arg0, int arg1) {
        field1050++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (this.field1081) {
            this.field1095 = 0;
            if (this.field1067.length == this.field1046) {
                int var3;
                for (var3 = 1; var3 <= this.field1046; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class41.method497(this.field1067, 0, var4, 0, this.field1046);
                this.field1067 = var4;
            }
            if (!arg0) {
                this.method448((byte) -70);
            }
            this.field1067[this.field1046++] = (byte) arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)I", line = 1298)
    public final int method467(int arg0) {
        field1069++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1046; var3++) {
            var2 = (this.field1067[var3] & 0xFF) + (var2 << 5) - var2;
        }
        if (arg0 != 64) {
            field1087 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "(B)Lfc;", line = 1330)
    public final class39 method468(byte arg0) {
        field1049++;
        class39 var2 = new class39();
        if (arg0 != -115) {
            field1103 = null;
        }
        var2.field1046 = this.field1046;
        var2.field1067 = new byte[this.field1046];
        for (int var3 = 0; var3 < this.field1046; var3++) {
            var2.field1067[var3] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)Lfc;", line = 1353)
    public final class39 method469(int arg0, byte arg1) {
        if (arg1 >= -98) {
            return null;
        } else {
            field1054++;
            return this.method456(0, arg0, this.field1046);
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(BI)Z", line = 1387)
    private final boolean method470(byte arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        field1057++;
        if (arg0 != -69) {
            return false;
        }
        int var3 = 0;
        boolean var4 = false;
        boolean var5 = false;
        for (int var6 = 0; var6 < this.field1046; var6++) {
            int var7 = this.field1067[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var5 = true;
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
            if (var7 >= arg1) {
                return false;
            }
            if (var5) {
                var7 = -var7;
            }
            int var8 = arg1 * var3 + var7;
            if (var8 / arg1 != var3) {
                return false;
            }
            var4 = true;
            var3 = var8;
        }
        return var4;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Lfc;B)I", line = 1459)
    public final int method471(class39 arg0, byte arg1) {
        if (arg1 != -62) {
            this.method456(72, -20, -5);
        }
        field1043++;
        return this.method443(0, arg0, -10593);
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(ILfc;)Z", line = 1474)
    public final boolean method472(int arg0, class39 arg1) {
        field1048++;
        if (arg1.field1046 > this.field1046) {
            return false;
        }
        for (int var3 = arg0; var3 < arg1.field1046; var3++) {
            if (this.field1067[var3] != arg1.field1067[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(Z)Lfc;", line = 1495)
    public final class39 method473(boolean arg0) {
        field1047++;
        if (!this.field1081) {
            throw new IllegalArgumentException();
        }
        this.field1095 = 0;
        if (this.field1067.length != this.field1046) {
            byte[] var2 = new byte[this.field1046];
            class41.method497(this.field1067, 0, var2, 0, this.field1046);
            this.field1067 = var2;
        }
        return arg0 ? this : null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Llc;", line = 1524)
    public static final class79 method474(Throwable arg0, String arg1) {
        field1075++;
        class79 var2;
        if (arg0 instanceof class79) {
            var2 = (class79) arg0;
            var2.field1789 = var2.field1789 + ' ' + arg1;
        } else {
            var2 = new class79(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 1544)
    public final void method475(int arg0, int arg1, int arg2, Graphics arg3) {
        field1094++;
        String var5;
        try {
            var5 = new String(this.field1067, arg2, this.field1046, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field1067, 0, this.field1046);
        }
        arg3.drawString(var5, arg0, arg1);
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)I", line = 1560)
    public final int method476(int arg0, int arg1) {
        int var3 = -119 % ((-arg0 - 41) / 53);
        field1064++;
        return this.method439(arg1, 0, (byte) 113);
    }

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "(I)[B", line = 1575)
    public final byte[] method477(int arg0) {
        if (arg0 != 23242) {
            method460(null, -13, 104);
        }
        field1062++;
        byte[] var2 = new byte[this.field1046];
        class41.method497(this.field1067, 0, var2, 0, this.field1046);
        return var2;
    }

    @OriginalMember(owner = "client!fc", name = "toString", descriptor = "()Ljava/lang/String;", line = 1603)
    public final String toString() {
        field1076++;
        throw new RuntimeException();
    }
}
