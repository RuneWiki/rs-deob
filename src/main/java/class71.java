import java.math.BigInteger;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class71 extends class46 {

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public int field1156;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public int field1162;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "[I")
    public int[] field1165;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "[[I")
    public int[][] field1160;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "[Z")
    public boolean[] field1169;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "[I")
    public int[] field1157;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "Lql;")
    public static class87 field1158 = new class87();

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "[I")
    public static int[] field1166 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
    public static int field1170 = -1;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1167 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "Lgd;")
    public static class170 field1172 = new class170(16);

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "Ll;")
    public static class133 field1171;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "Ll;")
    public static class133 field1173;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "Ll;")
    public static class133 field1174;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "Ltb;")
    public static class220 field1168;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "[Z")
    public static boolean[] field1175;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)Ljava/lang/String;", line = 10)
    public static final String method536(int arg0, int arg1, int arg2) {
        field1159++;
        int var3 = arg2 - arg0;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 >= -6) {
            if (arg1 > -14) {
                method539(-20, 23, 40, -57, 8);
            }
            if (var3 < -3) {
                return "<col=ff7000>";
            } else if (var3 < 0) {
                return "<col=ffb000>";
            } else if (var3 > 9) {
                return "<col=00ff00>";
            } else if (var3 > 6) {
                return "<col=40ff00>";
            } else if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 > 0) {
                return "<col=c0ff00>";
            } else {
                return "<col=ffff00>";
            }
        } else {
            return "<col=ff3000>";
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V", line = 57)
    public static void method537(byte arg0) {
        field1167 = null;
        field1172 = null;
        field1171 = null;
        if (arg0 <= 25) {
            field1158 = (class87) null;
        }
        field1173 = null;
        field1166 = null;
        field1175 = null;
        field1158 = null;
        field1168 = null;
        field1174 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 80)
    public static final String method538(byte arg0, long arg1) {
        field1164++;
        if (arg0 != -64) {
            method536(-122, -98, -30);
        }
        class92.field1460.setTime(new Date(arg1));
        int var3 = class92.field1460.get(7);
        int var4 = class92.field1460.get(5);
        int var5 = class92.field1460.get(2);
        int var6 = class92.field1460.get(1);
        int var7 = class92.field1460.get(11);
        int var8 = class92.field1460.get(12);
        int var9 = class92.field1460.get(13);
        return class175.field2656[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class276.field4259[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIII)V", line = 105)
    public static final void method539(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1163++;
        int var5 = arg4;
        int var6 = -1;
        int var7 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg0 + arg1);
        int var8 = arg1;
        int var9 = -arg1;
        int var10 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg0 - arg1);
        class272.method1876(class34.field525[arg2], var7, var10, arg3, (byte) -24);
        while (var8 > var5) {
            var6 += 2;
            var9 += var6;
            if (var9 > 0) {
                var8--;
                var9 -= var8 << 1;
                int var11 = arg2 + var8;
                int var12 = arg2 - var8;
                if (class119.field1817 <= var11 && class141.field2187 >= var12) {
                    int var13 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg0 + var5);
                    int var14 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg0 - var5);
                    if (var11 <= class141.field2187) {
                        class272.method1876(class34.field525[var11], var13, var14, arg3, (byte) -52);
                    }
                    if (class119.field1817 <= var12) {
                        class272.method1876(class34.field525[var12], var13, var14, arg3, (byte) -38);
                    }
                }
            }
            var5++;
            int var15 = arg2 + var5;
            int var16 = arg2 - var5;
            if (class119.field1817 <= var15 && class141.field2187 >= var16) {
                int var17 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg0 + var8);
                int var18 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg0 - var8);
                if (class141.field2187 >= var15) {
                    class272.method1876(class34.field525[var15], var17, var18, arg3, (byte) -68);
                }
                if (class119.field1817 <= var16) {
                    class272.method1876(class34.field525[var16], var17, var18, arg3, (byte) -36);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(I[B)V", line = 192)
    public class71(int arg0, byte[] arg1) {
        this.field1156 = arg0;
        class166 var3 = new class166(arg1);
        this.field1162 = var3.method1178(0);
        this.field1165 = new int[this.field1162];
        this.field1160 = new int[this.field1162][];
        this.field1169 = new boolean[this.field1162];
        this.field1157 = new int[this.field1162];
        for (int var4 = 0; var4 < this.field1162; var4++) {
            this.field1157[var4] = var3.method1178(0);
        }
        for (int var5 = 0; var5 < this.field1162; var5++) {
            this.field1169[var5] = var3.method1178(0) == 1;
        }
        for (int var6 = 0; var6 < this.field1162; var6++) {
            this.field1165[var6] = var3.method1151(-76);
        }
        for (int var7 = 0; var7 < this.field1162; var7++) {
            this.field1160[var7] = new int[var3.method1178(0)];
        }
        for (int var8 = 0; var8 < this.field1162; var8++) {
            for (int var9 = 0; var9 < this.field1160[var8].length; var9++) {
                this.field1160[var8][var9] = var3.method1178(0);
            }
        }
    }
}
