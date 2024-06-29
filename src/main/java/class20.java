import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class20 {

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public int field366;

    @OriginalMember(owner = "client!hm", name = "s", descriptor = "Ljava/lang/String;")
    public static String field384 = "Loading config - ";

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
    public int field378;

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "I")
    public int field380;

    @OriginalMember(owner = "client!hm", name = "r", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "Lp;")
    public class100 field375;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "[I")
    public int[] field368;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "[I")
    public int[] field370;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "[I")
    public int[] field372;

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "[I")
    public int[] field376;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "[I")
    public int[] field379;

    @OriginalMember(owner = "client!hm", name = "t", descriptor = "[I")
    public int[] field385;

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "[Lp;")
    public class100[] field382;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "[[I")
    public int[][] field367;

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "[[I")
    public int[][] field381;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B[B)V", line = 9)
    private final void method157(byte arg0, byte[] arg1) {
        field369++;
        class101 var3 = new class101(class152.method1164(arg1, -7457));
        int var4 = var3.method741(126);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field378 = var3.method775(-113);
        } else {
            this.field378 = 0;
        }
        int var5 = var3.method741(111);
        int var6 = -1;
        int var7 = 0;
        this.field380 = var3.method731(false);
        this.field385 = new int[this.field380];
        for (int var8 = 0; var8 < this.field380; var8++) {
            this.field385[var8] = var7 += var3.method731(false);
            if (this.field385[var8] > var6) {
                var6 = this.field385[var8];
            }
        }
        this.field383 = var6 + 1;
        this.field379 = new int[this.field383];
        this.field368 = new int[this.field383];
        this.field370 = new int[this.field383];
        this.field381 = new int[this.field383][];
        this.field376 = new int[this.field383];
        if (var5 != 0) {
            this.field372 = new int[this.field383];
            for (int var9 = 0; var9 < this.field383; var9++) {
                this.field372[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field380; var10++) {
                this.field372[this.field385[var10]] = var3.method775(-87);
            }
            this.field375 = new class100(this.field372);
        }
        for (int var11 = 0; var11 < this.field380; var11++) {
            this.field368[this.field385[var11]] = var3.method775(46);
        }
        if (arg0 >= -32) {
            return;
        }
        for (int var12 = 0; var12 < this.field380; var12++) {
            this.field379[this.field385[var12]] = var3.method775(-109);
        }
        for (int var13 = 0; var13 < this.field380; var13++) {
            this.field376[this.field385[var13]] = var3.method731(false);
        }
        for (int var14 = 0; var14 < this.field380; var14++) {
            int var15 = this.field385[var14];
            int var16 = 0;
            int var17 = this.field376[var15];
            this.field381[var15] = new int[var17];
            int var18 = -1;
            for (int var19 = 0; var19 < var17; var19++) {
                int var20 = this.field381[var15][var19] = var16 += var3.method731(false);
                if (var18 < var20) {
                    var18 = var20;
                }
            }
            this.field370[var15] = var18 + 1;
            if (var18 + 1 == var17) {
                this.field381[var15] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field367 = new int[var6 + 1][];
        this.field382 = new class100[var6 + 1];
        for (int var21 = 0; var21 < this.field380; var21++) {
            int var22 = this.field385[var21];
            int var23 = this.field376[var22];
            this.field367[var22] = new int[this.field370[var22]];
            for (int var24 = 0; var24 < this.field370[var22]; var24++) {
                this.field367[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field381[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field381[var22][var25];
                }
                this.field367[var22][var26] = var3.method775(69);
            }
            this.field382[var22] = new class100(this.field367[var22]);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z", line = 182)
    public static final boolean method158(int arg0, String arg1, String arg2) {
        field374++;
        int var3 = arg1.length();
        int var4 = arg2.length();
        if (var4 > var3) {
            return false;
        } else if (arg0 < 61) {
            return false;
        } else {
            for (int var5 = 0; var5 < var4; var5++) {
                char var6 = arg1.charAt(var5);
                char var7 = arg2.charAt(var5);
                if (var6 != var7 && Character.toLowerCase(var6) != Character.toLowerCase(var7) && Character.toUpperCase(var6) != Character.toUpperCase(var7)) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 219)
    public static void method159(int arg0) {
        field384 = null;
        if (arg0 < 100) {
            method159(98);
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V", line = 239)
    public static final void method160(int arg0) {
        field377++;
        int var1 = 0;
        int[] var2 = new int[class134.field2122];
        for (int var3 = arg0; var3 < class134.field2122; var3++) {
            class179 var4 = class208.method1521(-1361, var3);
            if (var4.field2817 >= 0 || var4.field2865 >= 0) {
                var2[var1++] = var3;
            }
        }
        class114.field1869 = new int[var1];
        for (int var5 = 0; var5 < var1; var5++) {
            class114.field1869[var5] = var2[var5];
        }
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "([BI)V", line = 279)
    public class20(byte[] arg0, int arg1) {
        this.field366 = class136.method1047(arg0, 90, arg0.length);
        if (this.field366 != arg1) {
            throw new RuntimeException();
        }
        this.method157((byte) -83, arg0);
    }
}
