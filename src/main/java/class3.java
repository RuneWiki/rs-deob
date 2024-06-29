import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 {

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    private int field58 = -1;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    private int field61 = 0;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "Lcb;")
    private class22 field60 = new class22();

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "Z")
    public boolean field75 = false;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "[[I")
    private int[][] field55;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "[Lna;")
    private class118[] field68;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    private int field64;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    private int field56;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "Lsa;")
    public static class163 field59 = new class163(32);

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "Lsg;")
    private static class169 field73 = class165.method1060("Account locked as we suspect it has been stolen)3", 1536);

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "Lsg;")
    public static class169 field70 = class165.method1060("<col=00ff80>", 1536);

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "Lsg;")
    public static class169 field69 = class165.method1060("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3", 1536);

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "Lsg;")
    public static class169 field76 = field73;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "Lke;")
    public static class95 field71;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BI)[I")
    public final int[] method19(byte arg0, int arg1) {
        field63++;
        if (arg0 <= 121) {
            method27(null, null, -107);
        }
        if (this.field64 == this.field56) {
            this.field75 = this.field68[arg1] == null;
            this.field68[arg1] = class64.field1197;
            return this.field55[arg1];
        } else if (this.field56 == 1) {
            this.field75 = this.field58 != arg1;
            this.field58 = arg1;
            return this.field55[0];
        } else {
            class118 var3 = this.field68[arg1];
            if (this.field75 = var3 == null) {
                if (this.field61 < this.field56) {
                    var3 = new class118(arg1, this.field61);
                    this.field61++;
                } else {
                    class118 var4 = (class118) this.field60.method147(5633);
                    var3 = new class118(arg1, var4.field2197);
                    this.field68[var4.field2192] = null;
                    var4.method1213(9104);
                }
                this.field68[arg1] = var3;
            }
            this.field60.method148(var3, true);
            return this.field55[var3.field2197];
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIII)I")
    public static final int method20(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 / arg2;
        if (arg3 < 14) {
            field70 = null;
        }
        int var5 = arg0 / arg2;
        field74++;
        int var6 = arg2 - 1 & arg1;
        int var7 = arg0 & arg2 - 1;
        int var8 = class92.method539((byte) 16, var5, var4);
        int var9 = class92.method539((byte) 16, var5, var4 + 1);
        int var10 = class92.method539((byte) 16, var5 + 1, var4);
        int var11 = class92.method539((byte) 16, var5 + 1, var4 + 1);
        int var12 = class31.method218(var6, -1211022480, var9, arg2, var8);
        int var13 = class31.method218(var6, -1211022480, var11, arg2, var10);
        return class31.method218(var7, -1211022480, var13, arg2, var12);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method21(byte arg0, Component arg1) {
        field66++;
        arg1.addMouseListener(class95.field1781);
        arg1.addMouseMotionListener(class95.field1781);
        arg1.addFocusListener(class95.field1781);
        if (arg0 != -13) {
            method28((byte) -53);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBI)I")
    public static final int method22(int arg0, byte arg1, int arg2) {
        int var3 = 0 / ((arg1 - 91) / 34);
        field67++;
        int var4 = arg2 >> 31 & arg0 - 1;
        return ((arg2 >>> 31) + arg2) % arg0 + var4;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static final void method23(int arg0) {
        class61.field1127 = -1;
        class90.field1647 = -1;
        class86.field1571 = -1;
        class20.field436 = 0;
        class77.field1450 = -1;
        class27.field553 = 0;
        class46.field853 = 0;
        class95.field1805 = 0;
        class141.field2621.field2346 = 0;
        class154.field2964 = 0;
        field54++;
        class105.field1933 = 0;
        class85.field1559.field2346 = 0;
        class189.field3707 = false;
        for (int var1 = 0; var1 < class65.field1213.length; var1++) {
            if (class65.field1213[var1] != null) {
                class65.field1213[var1].field3701 = -1;
            }
        }
        for (int var2 = 0; var2 < class54.field992.length; var2++) {
            if (class54.field992[var2] != null) {
                class54.field992[var2].field3701 = -1;
            }
        }
        if (arg0 != -101) {
            field71 = null;
        }
        class142.method939(arg0 ^ 0xFFFFFFBB);
        class140.method933((byte) 122, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class118.field2201[var3] = true;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    public static final void method24(int arg0) {
        field57++;
        if (arg0 != -1) {
            method27(null, null, -22);
        }
        for (class105 var1 = (class105) class57.field1056.method145(0); var1 != null; var1 = (class105) class57.field1056.method152((byte) -128)) {
            if (var1.field1927 > 0) {
                var1.field1927--;
            }
            if (var1.field1927 != 0) {
                if (var1.field1930 > 0) {
                    var1.field1930--;
                }
                if (var1.field1930 == 0 && var1.field1921 >= 1 && var1.field1932 >= 1 && var1.field1921 <= 102 && var1.field1932 <= 102 && (var1.field1938 < 0 || class149.method978(false, var1.field1928, var1.field1938))) {
                    class61.method380(var1.field1921, var1.field1940, false, var1.field1926, var1.field1938, var1.field1931, var1.field1928, var1.field1932);
                    var1.field1930 = -1;
                    if (var1.field1938 == var1.field1937 && var1.field1937 == -1) {
                        var1.method1213(9104);
                    } else if (var1.field1938 == var1.field1937 && var1.field1939 == var1.field1926 && var1.field1928 == var1.field1923) {
                        var1.method1213(9104);
                    }
                }
            } else if (var1.field1937 < 0 || class149.method978(false, var1.field1923, var1.field1937)) {
                class61.method380(var1.field1921, var1.field1940, false, var1.field1939, var1.field1937, var1.field1931, var1.field1923, var1.field1932);
                var1.method1213(9104);
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)[[I")
    public final int[][] method25(int arg0) {
        field62++;
        if (this.field64 != this.field56) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 99 % ((83 - arg0) / 38);
        for (int var3 = 0; var3 < this.field56; var3++) {
            this.field68[var3] = class64.field1197;
        }
        return this.field55;
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V")
    public final void method26(int arg0) {
        field72++;
        for (int var2 = 0; var2 < this.field56; var2++) {
            this.field55[var2] = null;
        }
        this.field68 = null;
        this.field55 = null;
        this.field60.method155(0);
        if (arg0 >= -96) {
            method28((byte) 4);
        }
        this.field60 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lke;Lke;I)I")
    public static final int method27(class95 arg0, class95 arg1, int arg2) {
        int var3 = arg2;
        if (arg1.method561(123, class142.field2637, class43.field814)) {
            var3 = arg2 + 1;
        }
        field65++;
        if (arg0.method561(arg2 - 81, class57.field1065, class43.field814)) {
            var3++;
        }
        if (arg0.method561(115, class63.field1161, class43.field814)) {
            var3++;
        }
        if (arg0.method561(arg2 - 88, class110.field2022, class43.field814)) {
            var3++;
        }
        if (arg0.method561(arg2 + 126, class148.field2729, class43.field814)) {
            var3++;
        }
        if (arg0.method561(99, class87.field1592, class43.field814)) {
            var3++;
        }
        arg0.method561(-77, class140.field2600, class43.field814);
        arg0.method561(-27, class13.field299, class43.field814);
        arg0.method561(-54, class27.field551, class43.field814);
        arg0.method561(arg2 ^ 0xFFFFFF89, class201.field3926, class43.field814);
        arg0.method561(-12, class7.field201, class43.field814);
        return var3;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static void method28(byte arg0) {
        field70 = null;
        field71 = null;
        field76 = null;
        field69 = null;
        field59 = null;
        field73 = null;
        if (arg0 >= -34) {
            field76 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(III)V")
    public class3(int arg0, int arg1, int arg2) {
        this.field55 = new int[arg0][arg2];
        this.field68 = new class118[arg1];
        this.field64 = arg1;
        this.field56 = arg0;
    }
}
