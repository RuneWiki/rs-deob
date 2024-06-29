import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class6 {

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "[[I")
    public int[][] field69 = new int[6][258];

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "[B")
    public byte[] field73 = new byte[18002];

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "[B")
    public byte[] field82 = new byte[4096];

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "[I")
    public int[] field86 = new int[6];

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "[B")
    public byte[] field63 = new byte[256];

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "[Z")
    public boolean[] field70 = new boolean[16];

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "[I")
    public int[] field78 = new int[16];

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public int field71 = 0;

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "[[I")
    public int[][] field95 = new int[6][258];

    @OriginalMember(owner = "client!ih", name = "L", descriptor = "[I")
    public int[] field98 = new int[256];

    @OriginalMember(owner = "client!ih", name = "G", descriptor = "[I")
    public int[] field93 = new int[257];

    @OriginalMember(owner = "client!ih", name = "M", descriptor = "[B")
    public byte[] field99 = new byte[18002];

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "[[I")
    public int[][] field102 = new int[6][258];

    @OriginalMember(owner = "client!ih", name = "P", descriptor = "[Z")
    public boolean[] field101 = new boolean[256];

    @OriginalMember(owner = "client!ih", name = "O", descriptor = "I")
    public int field100 = 0;

    @OriginalMember(owner = "client!ih", name = "K", descriptor = "[[B")
    public byte[][] field97 = new byte[6][258];

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
    public static int field80 = 0;

    @OriginalMember(owner = "client!ih", name = "F", descriptor = "[I")
    public static int[] field92 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "Ljava/lang/String;")
    public static String field76 = "Loading title screen - ";

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "Z")
    public static boolean field89 = false;

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "B")
    public byte field84;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public int field62;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public int field64;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public int field66;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public int field67;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public int field68;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public int field72;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    public int field77;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
    public int field81;

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "I")
    public int field85;

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "I")
    public int field87;

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "I")
    public int field94;

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "I")
    public int field96;

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "Ljava/awt/Font;")
    public static Font field83;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "[B")
    public byte[] field74;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "[B")
    public byte[] field75;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)V", line = 10)
    public static final void method42(int arg0, int arg1) {
        if (arg1 == 2) {
            if (class104.field1571 == null || arg0 > class104.field1571.length) {
                class104.field1571 = new int[arg0];
            }
            field88++;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IBI)V", line = 27)
    public static final void method43(int arg0, byte arg1, int arg2) {
        if (arg1 >= -9) {
            field89 = true;
        }
        field90++;
        class98.field1483 = class49.field774[arg2][arg0].field1675;
        class337.field5186 = class49.field774[arg2][arg0].field1679;
        class15.field247 = class49.field774[arg2][arg0].field1680;
        class103.method893((float) class98.field1483, (float) class337.field5186, (float) class15.field247);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIZ)I", line = 74)
    public static final int method44(int arg0, int arg1, int arg2, boolean arg3) {
        field79++;
        class133 var4 = (class133) class81.field1169.method370((byte) -120, (long) arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = arg2;
        for (int var6 = 0; var6 < var4.field2231.length; var6++) {
            if (var4.field2231[var6] >= 0 && var4.field2231[var6] < class310.field4791) {
                class263 var7 = class48.method469(10, var4.field2231[var6]);
                if (var7.field4060 != null) {
                    class164 var8 = (class164) var7.field4060.method370((byte) -120, (long) arg0);
                    if (var8 != null) {
                        if (arg3) {
                            var5 += var4.field2227[var6] * var8.field2610;
                        } else {
                            var5 += var8.field2610;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZLjava/lang/String;Lrg;)Ljava/lang/String;", line = 157)
    public static final String method45(boolean arg0, String arg1, class342 arg2) {
        if (arg1.indexOf("%") != -1) {
            label58: while (true) {
                int var3 = arg1.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.indexOf("%4");
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            break label58;
                                                        }
                                                        String var9 = "";
                                                        if (class239.field3717 != null) {
                                                            if (class239.field3717.field1446 == null) {
                                                                var9 = class72.method681((byte) -2, class239.field3717.field1444);
                                                            } else {
                                                                var9 = (String) class239.field3717.field1446;
                                                            }
                                                        }
                                                        arg1 = arg1.substring(0, var8) + var9 + arg1.substring(var8 + 4);
                                                    }
                                                }
                                                arg1 = arg1.substring(0, var7) + class238.method1766(class210.method1558(-17249, arg2, 4), 999999999) + arg1.substring(var7 + 2);
                                            }
                                        }
                                        arg1 = arg1.substring(0, var6) + class238.method1766(class210.method1558(-17249, arg2, 3), 999999999) + arg1.substring(var6 + 2);
                                    }
                                }
                                arg1 = arg1.substring(0, var5) + class238.method1766(class210.method1558(-17249, arg2, 2), 999999999) + arg1.substring(var5 + 2);
                            }
                        }
                        arg1 = arg1.substring(0, var4) + class238.method1766(class210.method1558(-17249, arg2, 1), 999999999) + arg1.substring(var4 + 2);
                    }
                }
                arg1 = arg1.substring(0, var3) + class238.method1766(class210.method1558(-17249, arg2, 0), 999999999) + arg1.substring(var3 + 2);
            }
        }
        if (arg0) {
            field65++;
            return arg1;
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V", line = 280)
    public static void method46(int arg0) {
        field76 = null;
        if (arg0 < 61) {
            field89 = false;
        }
        field92 = null;
        field83 = null;
    }
}
