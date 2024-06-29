import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class218 {

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "[Z")
    public boolean[] field3463 = new boolean[256];

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "[I")
    public int[] field3464 = new int[6];

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "[[I")
    public int[][] field3466 = new int[6][258];

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "[[I")
    public int[][] field3475 = new int[6][258];

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "[B")
    public byte[] field3472 = new byte[18002];

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "[[B")
    public byte[][] field3467 = new byte[6][258];

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "[B")
    public byte[] field3476 = new byte[18002];

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
    public int field3481 = 0;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "[I")
    public int[] field3491 = new int[257];

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "[I")
    public int[] field3495 = new int[16];

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "[I")
    public int[] field3489 = new int[256];

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
    public int field3496 = 0;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "[[I")
    public int[][] field3484 = new int[6][258];

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "[Z")
    public boolean[] field3493 = new boolean[16];

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "[B")
    public byte[] field3497 = new byte[4096];

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "[B")
    public byte[] field3494 = new byte[256];

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field3499 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "B")
    public byte field3488;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public int field3461;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public int field3465;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public int field3470;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public int field3471;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public int field3473;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    public int field3474;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public int field3477;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public int field3478;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
    public int field3479;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    public int field3480;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "I")
    public int field3486;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
    public int field3490;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    public int field3498;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "Llc;")
    public static class86 field3492;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "[B")
    public byte[] field3468;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "[B")
    public byte[] field3469;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "[[I")
    public static int[][] field3483;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;Lqi;I)Ljava/lang/String;")
    public static final String method1566(String arg0, class131 arg1, int arg2) {
        field3482++;
        if (arg0.indexOf("%") != -1) {
            label56: while (true) {
                int var3 = arg0.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg0.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg0.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg0.indexOf("%4");
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg0.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg0.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            break label56;
                                                        }
                                                        String var9 = "";
                                                        if (class122.field1776 != null) {
                                                            if (class122.field1776.field4449 == null) {
                                                                var9 = class232.method1643((byte) 122, class122.field1776.field4448);
                                                            } else {
                                                                var9 = (String) class122.field1776.field4449;
                                                            }
                                                        }
                                                        arg0 = arg0.substring(0, var8) + var9 + arg0.substring(var8 + 4);
                                                    }
                                                }
                                                arg0 = arg0.substring(0, var7) + class143.method1023(true, class39.method300((byte) -119, arg1, 4)) + arg0.substring(var7 + 2);
                                            }
                                        }
                                        arg0 = arg0.substring(0, var6) + class143.method1023(true, class39.method300((byte) -125, arg1, 3)) + arg0.substring(var6 + 2);
                                    }
                                }
                                arg0 = arg0.substring(0, var5) + class143.method1023(true, class39.method300((byte) -115, arg1, 2)) + arg0.substring(var5 + 2);
                            }
                        }
                        arg0 = arg0.substring(0, var4) + class143.method1023(true, class39.method300((byte) -106, arg1, 1)) + arg0.substring(var4 + 2);
                    }
                }
                arg0 = arg0.substring(0, var3) + class143.method1023(true, class39.method300((byte) -106, arg1, 0)) + arg0.substring(var3 + 2);
            }
        }
        if (arg2 <= 97) {
            method1568('F', 26);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)[Lak;")
    public static final class140[] method1567(byte arg0) {
        int var1 = 125 % ((arg0 + 8) / 38);
        field3462++;
        class140[] var2 = new class140[class143.field2318];
        for (int var3 = 0; var3 < class143.field2318; var3++) {
            int var4 = class201.field3220[var3] * class19.field214[var3];
            byte[] var5 = class152.field2505[var3];
            int[] var6 = new int[var4];
            for (int var7 = 0; var7 < var4; var7++) {
                var6[var7] = class101.field1476[class179.method1337(var5[var7], 255)];
            }
            var2[var3] = new class140(class262.field4258, class62.field912, class217.field3457[var3], class272.field4377[var3], class19.field214[var3], class201.field3220[var3], var6);
        }
        class188.method1398((byte) 99);
        return var2;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(CI)Z")
    public static final boolean method1568(char arg0, int arg1) {
        field3487++;
        if (arg1 != 90) {
            method1566((String) null, (class131) null, 113);
        }
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
    public static void method1569(byte arg0) {
        field3499 = null;
        int var1 = 2 % ((arg0 - 72) / 33);
        field3492 = null;
        field3483 = null;
    }
}
