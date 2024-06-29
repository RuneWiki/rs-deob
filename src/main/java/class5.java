import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 implements class124 {

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "Z")
    private boolean field175 = true;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "Le;")
    public static class25 field163 = new class25(5000);

    @OriginalMember(owner = "client!ad", name = "bb", descriptor = "Lad;")
    private static class5 field199 = class88.method674("Error loading your profile)3", 61);

    @OriginalMember(owner = "client!ad", name = "ab", descriptor = "Lad;")
    public static class5 field198 = class88.method674("Bitte warten Sie eine Minute", 21);

    @OriginalMember(owner = "client!ad", name = "cb", descriptor = "Lad;")
    public static class5 field200 = field199;

    @OriginalMember(owner = "client!ad", name = "gb", descriptor = "Lad;")
    private static class5 field204 = class88.method674("Enter your username (V password)3", -65);

    @OriginalMember(owner = "client!ad", name = "hb", descriptor = "[I")
    public static int[] field205 = new int[2000];

    @OriginalMember(owner = "client!ad", name = "db", descriptor = "Lad;")
    public static class5 field201 = field204;

    @OriginalMember(owner = "client!ad", name = "ib", descriptor = "Lbb;")
    public static class9 field206 = new class9(64);

    @OriginalMember(owner = "client!ad", name = "jb", descriptor = "Lad;")
    public static class5 field207 = class88.method674("sch-Utteln:", 102);

    @OriginalMember(owner = "client!ad", name = "lb", descriptor = "Lwb;")
    public static class133 field209 = new class133();

    @OriginalMember(owner = "client!ad", name = "mb", descriptor = "I")
    public static int field210 = 1;

    @OriginalMember(owner = "client!ad", name = "rb", descriptor = "Lad;")
    public static class5 field215 = class88.method674("null", 91);

    @OriginalMember(owner = "client!ad", name = "pb", descriptor = "Lad;")
    public static class5 field213 = class88.method674("null", 63);

    @OriginalMember(owner = "client!ad", name = "qb", descriptor = "[Lme;")
    public static class77[] field214 = new class77[50];

    @OriginalMember(owner = "client!ad", name = "nb", descriptor = "[I")
    public static int[] field211 = new int[50];

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
    public int field183;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "I")
    private int field192;

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!ad", name = "W", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!ad", name = "X", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!ad", name = "Y", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!ad", name = "Z", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!ad", name = "eb", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!ad", name = "fb", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!ad", name = "sb", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!ad", name = "kb", descriptor = "Lub;")
    public static class122 field208;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ad", name = "tb", descriptor = "Ljava/lang/Class;")
    public static Class field217;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "[B")
    public byte[] field164;

    @OriginalMember(owner = "client!ad", name = "ob", descriptor = "[[B")
    public static byte[][] field212;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method78(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lad;I)I", line = 4)
    public final int method32(class5 arg0, int arg1) {
        field182++;
        if (arg1 != 0) {
            method62(-6, (byte) -85, 80, 122, 89);
        }
        return this.method53(false, arg0, 0);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)I", line = 22)
    public final int method33(int arg0) {
        field177++;
        if (arg0 <= 32) {
            this.field175 = true;
        }
        return this.field183;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)Lad;", line = 38)
    public final class5 method34(byte arg0) {
        class5 var2 = new class5();
        var2.field183 = this.field183;
        field165++;
        int var3 = 80 / ((43 - arg0) / 62);
        var2.field164 = new byte[this.field183];
        for (int var4 = 0; var4 < this.field183; var4++) {
            var2.field164[var4] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(Lad;I)Lad;", line = 59)
    public final class5 method35(class5 arg0, int arg1) {
        field167++;
        if (arg1 > -65) {
            this.field164 = null;
        }
        if (!this.field175) {
            throw new IllegalArgumentException();
        }
        this.field192 = 0;
        if (this.field183 + arg0.field183 > this.field164.length) {
            int var3;
            for (var3 = 1; var3 < this.field183 + arg0.field183; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class29.method239(this.field164, 0, var4, 0, this.field183);
            this.field164 = var4;
        }
        class29.method239(arg0.field164, 0, this.field164, this.field183, arg0.field183);
        this.field183 += arg0.field183;
        return this;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)Lad;", line = 105)
    public final class5 method36(int arg0, byte arg1) {
        if (arg1 != -73) {
            this.method75(true, null);
        }
        field166++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class5 var3 = new class5();
        var3.field164 = new byte[this.field183 + 1];
        var3.field183 = this.field183 + 1;
        class29.method239(this.field164, 0, var3.field164, 0, this.field183);
        var3.field164[this.field183] = (byte) arg0;
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 129)
    public final boolean equals(Object arg0) {
        field160++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)Lad;", line = 145)
    public final class5 method37(int arg0) {
        long var2 = this.method49((byte) 104);
        field197++;
        synchronized (field217 == null ? (field217 = method78("ad")) : field217) {
            if (class17.field454 == null) {
                class17.field454 = new class46(4096);
            } else {
                for (class10 var5 = (class10) class17.field454.method408(var2, 57); var5 != null; var5 = (class10) class17.field454.method410(58)) {
                    if (this.method66((byte) -84, var5.field336)) {
                        return var5.field336;
                    }
                }
            }
            class10 var7 = new class10();
            if (arg0 != -3) {
                field208 = null;
            }
            this.field175 = false;
            var7.field336 = this;
            class17.field454.method403(var2, var7, true);
            return this;
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)I", line = 185)
    public final int method38(int arg0) {
        if (arg0 != 10) {
            this.hashCode();
        }
        field150++;
        return this.method77(10, (byte) -111);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)Lad;", line = 199)
    public final class5 method39(byte arg0) {
        field193++;
        int var2 = 0;
        int var3 = this.field183;
        while (var2 < this.field183 && (this.field164[var2] >= 0 && this.field164[var2] <= 32 || (this.field164[var2] & 0xFF) == 160)) {
            var2++;
        }
        while (var3 > var2 && (this.field164[var3 - 1] >= 0 && this.field164[var3 - 1] <= 32 || (this.field164[var3 - 1] & 0xFF) == 160)) {
            var3--;
        }
        if (var2 == 0 && this.field183 == var3) {
            return this;
        }
        class5 var4 = new class5();
        var4.field183 = var3 - var2;
        var4.field164 = new byte[var4.field183];
        if (arg0 != 127) {
            field163 = null;
        }
        for (int var5 = 0; var5 < var4.field183; var5++) {
            var4.field164[var5] = this.field164[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Z", line = 241)
    private final boolean method40(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        field195++;
        boolean var3 = false;
        if (arg0 <= 34) {
            field214 = null;
        }
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field183; var6++) {
            int var7 = this.field164[var6] & 0xFF;
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
        return var4;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)Lad;", line = 315)
    public static final class5 method41(int arg0, int arg1, int arg2) {
        field154++;
        int var3 = arg2 - arg0;
        if (var3 < -9) {
            return class121.field3006;
        } else if (var3 < -6) {
            return class52.field1314;
        } else if (var3 < -3) {
            return class42.field1060;
        } else if (var3 < 0) {
            return class60.field1468;
        } else if (var3 > 9) {
            return class38.field946;
        } else if (var3 > 6) {
            return class48.field1241;
        } else if (var3 > 3) {
            return class12.field374;
        } else if (var3 > 0) {
            return class83.field1944;
        } else {
            if (arg1 != 32636) {
                method67((byte) 59, -46);
            }
            return class75.field1801;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIZ)V", line = 358)
    public static final void method42(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field156++;
        if (class105.field2595 == arg1 && class105.field2634 == arg0 && (class83.field1951 == arg2 || !class40.field1048)) {
            return;
        }
        class83.field1951 = arg2;
        class105.field2595 = arg1;
        class105.field2634 = arg0;
        if (!class40.field1048) {
            class83.field1951 = 0;
        }
        class69.method541(25, 6);
        class73.method584(23370, false, class69.field1640, null);
        int var6 = class106.field2659;
        int var7 = class47.field1235;
        class47.field1235 = arg1 * 8 - 48;
        int var8 = class47.field1235 - var7;
        class106.field2659 = arg0 * 8 - 48;
        int var9 = class47.field1235;
        int var10 = class106.field2659 - var6;
        int var11 = class106.field2659;
        for (int var12 = 0; var12 < 32768; var12++) {
            class61 var28 = class103.field2504[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field89[var29] -= var8;
                    var28.field49[var29] -= var10;
                }
                var28.field120 -= var10 * 128;
                var28.field112 -= var8 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class112 var26 = class7.field251[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field89[var27] -= var8;
                    var26.field49[var27] -= var10;
                }
                var26.field120 -= var10 * 128;
                var26.field112 -= var8 * 128;
            }
        }
        class54.field1344 = arg2;
        class82.field1932.method24(arg3, (byte) -85, false, arg4);
        if (!arg5) {
            method76((byte) -37, 22, null, 27);
        }
        byte var14 = 0;
        byte var15 = 104;
        byte var16 = 1;
        byte var17 = 0;
        if (var8 < 0) {
            var16 = -1;
            var15 = -1;
            var14 = 103;
        }
        byte var18 = 104;
        byte var19 = 1;
        if (var10 < 0) {
            var17 = 103;
            var19 = -1;
            var18 = -1;
        }
        for (int var20 = var14; var20 != var15; var20 += var16) {
            for (int var22 = var17; var22 != var18; var22 += var19) {
                int var23 = var8 + var20;
                int var24 = var10 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        class22.field559[var25][var20][var22] = class22.field559[var25][var23][var24];
                    } else {
                        class22.field559[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class132 var21 = (class132) class78.field1844.method180(0); var21 != null; var21 = (class132) class78.field1844.method181(0)) {
            var21.field3187 -= var10;
            var21.field3200 -= var8;
            if (var21.field3200 < 0 || var21.field3187 < 0 || var21.field3200 >= 104 || var21.field3187 >= 104) {
                var21.method114(-3789);
            }
        }
        class120.field2983 = false;
        class61.field1501 = -1;
        class32.field768 = 0;
        if (class35.field883 != 0) {
            class35.field883 -= var8;
            class120.field2990 -= var10;
        }
        class20.field525.method182(26343);
        class39.field1015.method182(26343);
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)I", line = 537)
    public final int method43(int arg0) {
        field155++;
        int var2 = 0;
        int var3 = 0;
        if (arg0 != -9870) {
            this.hashCode();
        }
        while (this.field183 > var3) {
            var2 = (this.field164[var3] & 0xFF) + ((var2 << 5) - var2);
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I", line = 559)
    public final int method44(int arg0, FontMetrics arg1) {
        if (arg0 <= 38) {
            method76((byte) -108, -108, null, 4);
        }
        field173++;
        String var3;
        try {
            var3 = new String(this.field164, 0, this.field183, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field164, 0, this.field183);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)Lad;", line = 590)
    public final class5 method45(byte arg0) {
        field158++;
        int var2 = -100 / ((arg0 + 26) / 34);
        boolean var3 = true;
        class5 var4 = new class5();
        var4.field183 = this.field183;
        var4.field164 = new byte[this.field183];
        for (int var5 = 0; var5 < this.field183; var5++) {
            byte var6 = this.field164[var5];
            if (var6 == 95) {
                var4.field164[var5] = 32;
                var3 = true;
            } else if (var6 >= 97 && var6 <= 122 && var3) {
                var3 = false;
                var4.field164[var5] = (byte) (var6 - 32);
            } else {
                var3 = false;
                var4.field164[var5] = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)Z", line = 642)
    public final boolean method46(int arg0) {
        if (arg0 >= -18) {
            this.method36(116, (byte) 71);
        }
        field171++;
        return this.method40(86, 10);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILad;)Z", line = 656)
    public final boolean method47(int arg0, class5 arg1) {
        field181++;
        if (arg1.field183 > this.field183) {
            return false;
        }
        int var3 = -76 / ((arg0 + 30) / 58);
        for (int var4 = 0; var4 < arg1.field183; var4++) {
            if (this.field164[var4] != arg1.field164[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ad", name = "hashCode", descriptor = "()I", line = 680)
    public final int hashCode() {
        field178++;
        return this.method43(-9870);
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)Lad;", line = 690)
    public final class5 method48(byte arg0) {
        field202++;
        int var2 = 31 / ((64 - arg0) / 62);
        if (!this.field175) {
            throw new IllegalArgumentException();
        }
        this.field192 = 0;
        if (this.field164.length != this.field183) {
            byte[] var3 = new byte[this.field183];
            class29.method239(this.field164, 0, var3, 0, this.field183);
            this.field164 = var3;
        }
        return this;
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(B)J", line = 718)
    private final long method49(byte arg0) {
        field180++;
        long var2 = 0L;
        int var4 = -124 % ((arg0 - 33) / 40);
        for (int var5 = 0; var5 < this.field183; var5++) {
            var2 = (var2 << 5) + (long) (this.field164[var5] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)V", line = 738)
    public static void method50(int arg0) {
        field211 = null;
        field206 = null;
        field215 = null;
        field198 = null;
        field163 = null;
        field205 = null;
        field213 = null;
        field207 = null;
        field200 = null;
        field201 = null;
        field212 = null;
        field209 = null;
        field214 = null;
        field199 = null;
        field204 = null;
        field208 = null;
        if (arg0 != -15294) {
            field204 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BII)Lad;", line = 764)
    public final class5 method51(byte arg0, int arg1, int arg2) {
        field172++;
        if (arg0 >= -10) {
            field201 = null;
        }
        class5 var4 = new class5();
        var4.field183 = arg2 - arg1;
        var4.field164 = new byte[arg2 - arg1];
        class29.method239(this.field164, arg1, var4.field164, 0, var4.field183);
        return var4;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(IB)Lad;", line = 782)
    public final class5 method52(int arg0, byte arg1) {
        field161++;
        return arg1 > -42 ? null : this.method51((byte) -55, arg0, this.field183);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZLad;I)I", line = 806)
    private final int method53(boolean arg0, class5 arg1, int arg2) {
        field149++;
        int[] var4 = new int[arg1.field183];
        int[] var5 = new int[256];
        int[] var6 = new int[arg1.field183];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg1.field183;
        }
        for (int var8 = 1; var8 <= arg1.field183; var8++) {
            var4[var8 - 1] = (arg1.field183 << 1) - var8;
            var5[class104.method832(arg1.field164[var8 - 1], 255)] = arg1.field183 - var8;
        }
        int var9 = arg1.field183 + 1;
        int var10 = arg1.field183;
        if (arg0) {
            field211 = null;
        }
        while (var10 > 0) {
            var6[var10 - 1] = var9;
            while (var9 <= arg1.field183 && arg1.field164[var9 - 1] != arg1.field164[var10 - 1]) {
                if (arg1.field183 - var10 <= var4[var9 + -1]) {
                    var4[var9 - 1] = arg1.field183 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var9--;
            var10--;
        }
        int var11 = var9;
        int var12 = arg1.field183 + 1 - var9;
        int var13 = 1;
        int var14 = 0;
        for (int var15 = 1; var15 <= var12; var15++) {
            var6[var15 - 1] = var14;
            while (var14 >= 1 && arg1.field164[var15 - 1] != arg1.field164[var14 - 1]) {
                var14 = var6[var14 - 1];
            }
            var14++;
        }
        while (var11 < arg1.field183) {
            for (int var18 = var13; var18 <= var11; var18++) {
                if (var4[var18 - 1] >= arg1.field183 + var11 - var18) {
                    var4[var18 - 1] = arg1.field183 + var11 - var18;
                }
            }
            var13 = var11 + 1;
            var11 = var11 + var12 - var6[var12 - 1];
            var12 = var6[var12 - 1];
        }
        int var17;
        for (int var16 = arg2 + arg1.field183 - 1; var16 < this.field183; var16 += Math.max(var5[this.field164[var16] & 0xFF], var4[var17])) {
            for (var17 = arg1.field183 - 1; var17 >= 0 && this.field164[var16] == arg1.field164[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)I", line = 918)
    public static int method54(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(II)I", line = 925)
    public final int method55(int arg0, int arg1) {
        if (arg1 != 255) {
            this.method60(94, null, 40, -53, 108);
        }
        field185++;
        return this.field164[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(ILad;)Z", line = 950)
    public final boolean method56(int arg0, class5 arg1) {
        field174++;
        if (this.field183 < arg1.field183) {
            return false;
        }
        int var3 = this.field183 - arg1.field183;
        if (arg0 != -28480) {
            field207 = null;
        }
        for (int var4 = 0; var4 < arg1.field183; var4++) {
            if (this.field164[var3 + var4] != arg1.field164[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(II)Lad;", line = 979)
    public final class5 method57(int arg0, int arg1) {
        field188++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (this.field175) {
            this.field192 = 0;
            if (arg1 <= 51) {
                field200 = null;
            }
            if (this.field164.length == this.field183) {
                int var3;
                for (var3 = 1; var3 <= this.field183; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class29.method239(this.field164, 0, var4, 0, this.field183);
                this.field164 = var4;
            }
            this.field164[this.field183++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(IB)V", line = 1023)
    public static final void method58(int arg0, byte arg1) {
        class33.method262((byte) 35, arg0, null, 0, false);
        if (arg1 >= -113) {
            method42(-126, 69, -5, -14, -83, true);
        }
        field153++;
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(B)V", line = 1041)
    public static final void method59(byte arg0) {
        class7.method87(0);
        field191++;
        if (class19.field520 == 1) {
            class52.field1313[class69.field1638 / 100].method964(class61.field1511 - 8 - 4, class54.field1364 - 8 + -4);
        }
        if (class19.field520 == 2) {
            class52.field1313[class69.field1638 / 100 + 4].method964(class61.field1511 - 4 - 8, class54.field1364 + -12);
        }
        if (arg0 > -55) {
            method76((byte) 113, 50, null, -1);
        }
        if (class21.field549 != -1) {
            class17.method132(-83, class21.field549);
            class86.method657(0, 334, 1515, 512, 4, class21.field549, 0);
        }
        if (class53.field1334 != -1) {
            class17.method132(-115, class53.field1334);
            class86.method657(0, 334, 1515, 512, 0, class53.field1334, 0);
        }
        class59.method481((byte) 107);
        if (!class128.field3069) {
            class79.method618(0);
            class103.method829(true);
        } else if (class89.field2103 == 0) {
            class121.method955(-26266);
        }
        if (class42.field1064 == 1) {
            class120.field2976.method964(472, 296);
        }
        if (class32.field784) {
            byte var1 = 20;
            short var2 = 507;
            int var3 = 16776960;
            if (class135.field3274 < 30 && class40.field1048) {
                var3 = 16711680;
            }
            if (class135.field3274 < 20 && !class40.field1048) {
                var3 = 16711680;
            }
            class82.field1924.method1004(class69.method546(true, new class5[] { class90.field2122, class106.method864(18413, class135.field3274) }), var2, var1, var3);
            int var10 = var1 + 15;
            int var4 = 16776960;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            if (var6 > 32768 && class40.field1048) {
                var4 = 16711680;
            }
            if (var6 > 65536 && !class40.field1048) {
                var4 = 16711680;
            }
            class82.field1924.method1004(class69.method546(true, new class5[] { class47.field1233, class106.method864(18413, var6), class59.field1451 }), var2, var10, var4);
            var10 += 15;
            if (class3.field115) {
                class82.field1924.method1004(class18.field466, var2, var10, 16711680);
                var10 += 15;
                class3.field115 = false;
            }
            if (class46.field1195) {
                class82.field1924.method1004(class25.field615, var2, var10, 16711680);
                class46.field1195 = false;
                var10 += 15;
            }
            if (class83.field1953) {
                class82.field1924.method1004(class32.field774, var2, var10, 16711680);
                class83.field1953 = false;
                var10 += 15;
            }
        }
        if (class12.field373 == 0) {
            return;
        }
        int var7 = class12.field373 / 50;
        int var8 = var7 / 60;
        int var9 = var7 % 60;
        if (var9 >= 10) {
            class82.field1924.method1014(class69.method546(true, new class5[] { class129.field3096, class106.method864(18413, var8), class27.field671, class106.method864(18413, var9) }), 4, 329, 16776960);
        } else {
            class82.field1924.method1014(class69.method546(true, new class5[] { class129.field3096, class106.method864(18413, var8), class18.field475, class106.method864(18413, var9) }), 4, 329, 16776960);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I[BIII)I", line = 1170)
    public final int method60(int arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        int var6 = -6 / ((-arg2 - 54) / 52);
        field151++;
        class29.method239(this.field164, arg3, arg1, arg0, arg4 - arg3);
        return arg4 - arg3;
    }

    @OriginalMember(owner = "client!ad", name = "toString", descriptor = "()Ljava/lang/String;", line = 1201)
    public final String toString() {
        field189++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(II)I", line = 1213)
    public final int method61(int arg0, int arg1) {
        field162++;
        return arg1 == -58 ? this.method65(0, arg0, (byte) -101) : 71;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBIII)I", line = 1224)
    public static final int method62(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var5 = 50 % ((arg1 - 83) / 40);
        field148++;
        int var6 = 65536 - class114.field2835[arg2 * 1024 / arg0] >> 1;
        return ((65536 - var6) * arg4 >> 16) + (arg3 * var6 >> 16);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILad;I)Lad;", line = 1246)
    public final class5 method63(int arg0, class5 arg1, int arg2) {
        field159++;
        if (!this.field175) {
            throw new IllegalArgumentException();
        } else if (arg0 > this.field183) {
            throw new IllegalArgumentException();
        } else {
            if (arg2 <= 9) {
                field163 = null;
            }
            this.field192 = 0;
            if (this.field164.length < arg0 + arg1.field183) {
                int var4;
                for (var4 = 1; var4 < arg1.field183 + arg0; var4 += var4) {
                }
                byte[] var5 = new byte[var4];
                class29.method239(this.field164, 0, var5, 0, this.field183);
                this.field164 = var5;
            }
            class29.method239(arg1.field164, 0, this.field164, arg0, arg1.field183);
            if (this.field183 < arg1.field183 + arg0) {
                this.field183 = arg1.field183 + arg0;
            }
            return this;
        }
    }

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "(B)J", line = 1290)
    public final long method64(byte arg0) {
        field168++;
        long var2 = 0L;
        int var4 = 0;
        if (arg0 != 100) {
            field206 = null;
        }
        while (this.field183 > var4 && var4 < 12) {
            byte var5 = this.field164[var4];
            var2 *= 37L;
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 + 1 - 65;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 + 1 - 97;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 + 27 - 48;
            }
            var4++;
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIB)I", line = 1329)
    private final int method65(int arg0, int arg1, byte arg2) {
        field147++;
        byte var4 = (byte) arg1;
        for (int var5 = arg0; var5 < this.field183; var5++) {
            if (this.field164[var5] == var4) {
                return var5;
            }
        }
        if (arg2 != -101) {
            this.method68((byte) -13);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLad;)Z", line = 1369)
    public final boolean method66(byte arg0, class5 arg1) {
        field187++;
        if (arg1 == null) {
            return false;
        } else if (this.field183 == arg1.field183) {
            if (arg0 >= -72) {
                this.method34((byte) 114);
            }
            if (!this.field175 || !arg1.field175) {
                if (this.field192 == 0) {
                    this.field192 = this.method43(-9870);
                    if (this.field192 == 0) {
                        this.field192 = 1;
                    }
                }
                if (arg1.field192 == 0) {
                    arg1.field192 = arg1.method43(-9870);
                    if (arg1.field192 == 0) {
                        arg1.field192 = 1;
                    }
                }
                if (this.field192 != arg1.field192) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field183; var3++) {
                if (this.field164[var3] != arg1.field164[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)Lqb;", line = 1423)
    public static final class98 method67(byte arg0, int arg1) {
        field179++;
        class98 var2 = (class98) class58.field1437.method98(-8, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        class98 var3 = class120.method947(class47.field1232, class25.field626, arg1, 60, false);
        if (arg0 > -83) {
            return null;
        } else {
            if (var3 != null) {
                class58.field1437.method102((long) arg1, var3, 95);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "(B)Lad;", line = 1444)
    public final class5 method68(byte arg0) {
        field196++;
        class5 var2 = new class5();
        var2.field183 = this.field183;
        var2.field164 = new byte[this.field183];
        for (int var3 = 0; var3 < this.field183; var3++) {
            byte var4 = this.field164[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field164[var3] = var4;
        }
        if (arg0 <= 18) {
            return null;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILrc;)Z", line = 1478)
    public static final boolean method69(int arg0, class105 arg1) {
        field152++;
        if (arg1.field2533 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field2533.length; var2++) {
            int var3 = class94.method718(var2, (byte) -42, arg1);
            int var4 = arg1.field2540[var2];
            if (arg1.field2533[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg1.field2533[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field2533[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (arg0 != -8743) {
            method70(true, 60);
        }
        return true;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZI)V", line = 1540)
    public static final void method70(boolean arg0, int arg1) {
        field184++;
        if (!class116.method928(-110, arg1)) {
            return;
        }
        class105[] var2 = class121.field3013[arg1];
        if (arg0) {
            return;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class105 var4 = var2[var3];
            if (var4.field2579 != null) {
                class50.method428(0, 0, var4, var4.field2579, -4073, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "(B)[B", line = 1579)
    public final byte[] method71(byte arg0) {
        if (arg0 >= -123) {
            return null;
        } else {
            field170++;
            byte[] var2 = new byte[this.field183];
            class29.method239(this.field164, 0, var2, 0, this.field183);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "(B)Lad;", line = 1593)
    public final class5 method72(byte arg0) {
        class5 var2 = new class5();
        field190++;
        boolean var3 = true;
        if (arg0 != 24) {
            return null;
        }
        var2.field183 = this.field183;
        var2.field164 = new byte[this.field183];
        for (int var4 = 0; var4 < this.field183; var4++) {
            byte var5 = this.field164[var4];
            if (var5 >= 97 && var5 <= 122 || var5 >= -32 && var5 <= -2 && var5 != -9) {
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
            var2.field164[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 1648)
    public final void method73(int arg0, Graphics arg1, int arg2, int arg3) {
        String var5;
        try {
            var5 = new String(this.field164, 0, this.field183, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field164, 0, this.field183);
        }
        if (arg3 != -30395) {
            this.method37(-106);
        }
        field203++;
        arg1.drawString(var5, arg0, arg2);
    }

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "(I)Lad;", line = 1667)
    public final class5 method74(int arg0) {
        class5 var2 = new class5();
        field194++;
        int var3 = 0;
        var2.field164 = new byte[12];
        if (arg0 != -9939) {
            field198 = null;
        }
        var2.field183 = 0;
        for (int var4 = 0; var4 < this.field183; var4++) {
            if (this.field164[var4] >= 65 && this.field164[var4] <= 90) {
                var2.field164[var3++] = (byte) (this.field164[var4] + 32);
                var2.field183 = var3;
            } else if (this.field164[var4] >= 97 && this.field164[var4] <= 122 || this.field164[var4] >= 48 && this.field164[var4] <= 57) {
                var2.field164[var3++] = this.field164[var4];
                var2.field183 = var3;
            } else if (var3 > 0) {
                var2.field164[var3++] = 95;
            }
            if (var3 == 12) {
                break;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZLad;)Z", line = 1717)
    public final boolean method75(boolean arg0, class5 arg1) {
        field186++;
        if (arg1 == null) {
            return false;
        } else if (this.field183 != arg1.field183) {
            return false;
        } else if (arg0) {
            return true;
        } else {
            for (int var3 = 0; var3 < this.field183; var3++) {
                byte var4 = arg1.field164[var3];
                byte var5 = this.field164[var3];
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
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BILrd;I)Z", line = 1767)
    public static final boolean method76(byte arg0, int arg1, class106 arg2, int arg3) {
        field176++;
        byte[] var4 = arg2.method857(30580, arg3, arg1);
        int var5 = -65 / ((1 - arg0) / 43);
        if (var4 == null) {
            return false;
        } else {
            class135.method1036(var4, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(IB)I", line = 1794)
    private final int method77(int arg0, byte arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        if (arg1 > -110) {
            field206 = null;
        }
        field157++;
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field183; var6++) {
            int var7 = this.field164[var6] & 0xFF;
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
            if (var7 >= arg0) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
                throw new NumberFormatException();
            }
            var4 = true;
            var5 = var8;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }
}
