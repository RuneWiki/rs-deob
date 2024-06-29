import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class248 {

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "[I")
    public int[] field4114 = new int[6];

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "[[B")
    public byte[][] field4116 = new byte[6][258];

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "[B")
    public byte[] field4115 = new byte[18002];

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "[I")
    public int[] field4119 = new int[16];

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "[[I")
    public int[][] field4126 = new int[6][258];

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public int field4102 = 0;

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "[Z")
    public boolean[] field4120 = new boolean[256];

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "[Z")
    public boolean[] field4125 = new boolean[16];

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "[I")
    public int[] field4117 = new int[256];

    @OriginalMember(owner = "client!tk", name = "G", descriptor = "[[I")
    public int[][] field4133 = new int[6][258];

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "I")
    public int field4132 = 0;

    @OriginalMember(owner = "client!tk", name = "K", descriptor = "[B")
    public byte[] field4137 = new byte[18002];

    @OriginalMember(owner = "client!tk", name = "L", descriptor = "[I")
    public int[] field4138 = new int[257];

    @OriginalMember(owner = "client!tk", name = "M", descriptor = "[B")
    public byte[] field4139 = new byte[256];

    @OriginalMember(owner = "client!tk", name = "A", descriptor = "[[I")
    public int[][] field4127 = new int[6][258];

    @OriginalMember(owner = "client!tk", name = "J", descriptor = "[B")
    public byte[] field4136 = new byte[4096];

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "Lbd;")
    public static class162 field4121 = class17.method142(0, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "B")
    public byte field4124;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public int field4101;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public int field4106;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public int field4109;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public int field4110;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
    public int field4112;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "I")
    public int field4113;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
    public int field4118;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
    public int field4122;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
    public int field4123;

    @OriginalMember(owner = "client!tk", name = "B", descriptor = "I")
    public int field4128;

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!tk", name = "E", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!tk", name = "H", descriptor = "I")
    public int field4134;

    @OriginalMember(owner = "client!tk", name = "I", descriptor = "I")
    public int field4135;

    @OriginalMember(owner = "client!tk", name = "N", descriptor = "I")
    public int field4140;

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "Lvb;")
    public static class166 field4129;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "[B")
    public byte[] field4105;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "[B")
    public byte[] field4107;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "[I")
    public static int[] field4108;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "[[[I")
    public static int[][][] field4104;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lda;I)I", line = 13)
    public static final int method1739(class143 arg0, int arg1) {
        field4130++;
        int var2 = 0;
        if (arg1 != -1) {
            field4129 = (class166) null;
        }
        if (arg0.method1118(class186.field3203, 26604)) {
            var2++;
        }
        if (arg0.method1118(class263.field4393, 26604)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V", line = 35)
    public static void method1740(byte arg0) {
        field4129 = null;
        field4104 = (int[][][]) null;
        field4121 = null;
        if (arg0 < -21) {
            field4108 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lb;I)V", line = 74)
    public static final void method1741(class94 arg0, int arg1) {
        field4103++;
        if (arg1 != -65) {
            method1740((byte) -92);
        }
        while (true) {
            while (arg0.field1681.length > arg0.field1653) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg0.method756(915905888) == 1) {
                    var4 = arg0.method756(arg1 + 915905953);
                    var3 = true;
                    var2 = arg0.method756(915905888);
                }
                int var5 = arg0.method756(915905888);
                int var6 = arg0.method756(915905888);
                int var7 = class9.field114 + class87.field1536 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class290.field4893;
                if (var8 >= 0 && (var7 - 63) >= 0 && var8 + 63 < class304.field5132 && var7 < class9.field114) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || var4 * 8 <= var11 && var11 < (var4 * 8 + 8) && var2 * 8 <= var12 && var12 < var2 * 8 + 8) {
                                byte var13 = arg0.method719((byte) -42);
                                if (var13 != 0) {
                                    if (class133.field2381[var9][var10] == null) {
                                        class133.field2381[var9][var10] = new byte[4096];
                                    }
                                    class133.field2381[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method719((byte) -42);
                                    if (class190.field3244[var9][var10] == null) {
                                        class190.field3244[var9][var10] = new byte[4096];
                                    }
                                    class190.field3244[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var3 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method719((byte) -42);
                        if (var16 != 0) {
                            arg0.field1653++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lda;B)V", line = 196)
    public static final void method1742(class143 arg0, byte arg1) {
        field4131++;
        class63.field978 = arg0;
        if (arg1 != 80) {
            method1742((class143) null, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IB)V", line = 213)
    public static final void method1743(int arg0, byte arg1) {
        class86.field1527 = -1;
        class59.field922 = -1;
        if (arg1 == 79) {
            class136.field2420 = arg0;
            class273.method1853(arg1 ^ 0x17);
            field4111++;
        }
    }
}
