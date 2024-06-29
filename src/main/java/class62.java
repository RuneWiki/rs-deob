import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class62 extends class120 {

    @OriginalMember(owner = "client!si", name = "ab", descriptor = "I")
    private int field908 = -1;

    @OriginalMember(owner = "client!si", name = "Z", descriptor = "Z")
    public static boolean field907 = false;

    @OriginalMember(owner = "client!si", name = "X", descriptor = "[I")
    public static int[] field905 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!si", name = "lb", descriptor = "I")
    public static int field919 = 0;

    @OriginalMember(owner = "client!si", name = "W", descriptor = "[I")
    public static int[] field904 = new int[100];

    @OriginalMember(owner = "client!si", name = "nb", descriptor = "Lok;")
    public static class41 field921 = class137.method956("floorshadows", 45);

    @OriginalMember(owner = "client!si", name = "bb", descriptor = "I")
    public static int field909 = 0;

    @OriginalMember(owner = "client!si", name = "V", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!si", name = "Y", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!si", name = "cb", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!si", name = "db", descriptor = "I")
    public int field911;

    @OriginalMember(owner = "client!si", name = "eb", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!si", name = "hb", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!si", name = "ib", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!si", name = "jb", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!si", name = "kb", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!si", name = "ob", descriptor = "I")
    public int field922;

    @OriginalMember(owner = "client!si", name = "fb", descriptor = "Lof;")
    public static class245 field913;

    @OriginalMember(owner = "client!si", name = "T", descriptor = "Lse;")
    public static class96 field901;

    @OriginalMember(owner = "client!si", name = "gb", descriptor = "[I")
    public int[] field914;

    @OriginalMember(owner = "client!si", name = "mb", descriptor = "[Lii;")
    public static class234[] field920;

    @OriginalMember(owner = "client!si", name = "U", descriptor = "[[B")
    public static byte[][] field902;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)V", line = 5)
    public static final void method432(int arg0, byte arg1) {
        class104.field1485 = new int[arg0];
        if (arg1 != -34) {
            method432(-34, (byte) 95);
        }
        class223.field3580 = new int[arg0];
        class234.field3744 = new int[arg0];
        class300.field4871 = new int[arg0];
        class162.field2578 = new int[arg0];
        field903++;
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(III)I", line = 20)
    public static final int method433(int arg0, int arg1, int arg2) {
        field915++;
        if (arg2 != 1059323807) {
            method434((byte) 1, (class279) null);
        }
        int var3 = arg0 >>> 31;
        return (arg0 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BLka;)V", line = 37)
    public static final void method434(byte arg0, class279 arg1) {
        for (int var2 = 0; var2 < class184.field3007.length; var2++) {
            class184.field3007[var2] = 0;
        }
        short var3 = 256;
        field917++;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) ((double) var3 * 128.0D * Math.random());
            class184.field3007[var5] = (int) (Math.random() * 284.0D);
        }
        if (arg0 != -28) {
            method432(-121, (byte) -93);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < var3 - 1; var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = var8 + (var7 << 7);
                    class266.field4230[var9] = (class184.field3007[var9 + 1] + class184.field3007[var9 - 1] - (-class184.field3007[var9 + -128] - class184.field3007[var9 - -128])) / 4;
                }
            }
            int[] var10 = class184.field3007;
            class184.field3007 = class266.field4230;
            class266.field4230 = var10;
        }
        if (arg1 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg1.field5300; var12++) {
            for (int var13 = 0; var13 < arg1.field5306; var13++) {
                if (arg1.field4561[var11++] != 0) {
                    int var14 = var13 + arg1.field5304 + 16;
                    int var15 = arg1.field5290 + var12 + 16;
                    int var16 = (var15 << 7) + var14;
                    class184.field3007[var16] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V", line = 129)
    public class62() {
        super(0, false);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V", line = 140)
    public final void method435(boolean arg0) {
        super.method435(arg0);
        this.field914 = null;
        field910++;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(IZ)[[I", line = 165)
    public int[][] method168(int arg0, boolean arg1) {
        field906++;
        int[][] var3 = this.field1764.method876(arg1, arg0);
        if (this.field1764.field1836 && this.method437(104)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int var6 = (class226.field3609 == this.field911 ? arg0 : this.field911 * arg0 / class226.field3609) * this.field922;
            int[] var7 = var3[2];
            if (class307.field5160 == this.field922) {
                for (int var8 = 0; var8 < class307.field5160; var8++) {
                    int var9 = this.field914[var6++];
                    var7[var8] = class217.method1563(var9 << 4, 4080);
                    var5[var8] = class217.method1563(var9, 65280) >> 4;
                    var4[var8] = class217.method1563(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; var10 < class307.field5160; var10++) {
                    int var11 = this.field922 * var10 / class307.field5160;
                    int var12 = this.field914[var6 + var11];
                    var7[var10] = class217.method1563(var12, 255) << 4;
                    var5[var10] = class217.method1563(65280, var12) >> 4;
                    var4[var10] = class217.method1563(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!si", name = "e", descriptor = "(B)V", line = 232)
    public static void method436(byte arg0) {
        field921 = null;
        field901 = null;
        field902 = (byte[][]) null;
        if (arg0 > 38) {
            field905 = null;
            field913 = null;
            field920 = null;
            field904 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "f", descriptor = "(I)Z", line = 255)
    public final boolean method437(int arg0) {
        if (arg0 <= 97) {
            return false;
        }
        field918++;
        if (this.field914 != null) {
            return true;
        } else if (this.field908 < 0) {
            return false;
        } else {
            class72 var2 = class239.method1717(this.field908, class175.field2848, 136);
            var2.method537();
            this.field914 = var2.field1070;
            this.field911 = var2.field3189;
            this.field922 = var2.field3200;
            return true;
        }
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(B)I", line = 288)
    public final int method438(byte arg0) {
        field916++;
        if (arg0 != -71) {
            this.method438((byte) -106);
        }
        return this.field908;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Llb;II)V", line = 307)
    public final void method30(class112 arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            field909 = -64;
        }
        if (arg2 == 0) {
            this.field908 = arg0.method759((byte) -119);
        }
        field912++;
    }
}
