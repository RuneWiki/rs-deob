import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class119 {

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Ldc;")
    public static class37 field2124 = class185.method1233((byte) 86, "p11_full");

    @OriginalMember(owner = "client!l", name = "h", descriptor = "[I")
    public static int[] field2131 = new int[1000];

    @OriginalMember(owner = "client!l", name = "d", descriptor = "[Ldj;")
    public static class44[] field2127 = new class44[256];

    @OriginalMember(owner = "client!l", name = "i", descriptor = "[I")
    public static int[] field2132 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Ldc;")
    public static class37 field2130 = class185.method1233((byte) 86, "::tele 0)1");

    @OriginalMember(owner = "client!l", name = "k", descriptor = "Ldc;")
    public static class37 field2134 = class185.method1233((byte) 86, "mod_icons");

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "Lic;")
    public static class90 field2126;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "[Z")
    public static boolean[] field2133;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "[[[I")
    public static int[][][] field2135;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)V")
    public static final void method818(int arg0, int arg1, int arg2) {
        class18 var3 = class180.field3354[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field292 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I[[I)V")
    public static final void method819(int arg0, int[][] arg1) {
        if (arg0 != 4) {
            method818(-31, 113, 86);
        }
        field2129++;
        class11.field156 = arg1;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
    public static void method820(byte arg0) {
        int var1 = -6 % ((arg0 - 1) / 45);
        field2131 = null;
        field2134 = null;
        field2126 = null;
        field2132 = null;
        field2133 = null;
        field2124 = null;
        field2135 = null;
        field2130 = null;
        field2127 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIILre;I)V")
    public static final void method821(int arg0, int arg1, int arg2, int arg3, int arg4, class190 arg5, int arg6) {
        if (arg1 == 0) {
            field2128++;
            class165.method1112(arg0, arg6, arg2, arg5.field3505, arg4, -16734, arg3, arg5.field3490);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILmf;Ldc;)Ldc;")
    public static final class37 method822(int arg0, class136 arg1, class37 arg2) {
        if (arg0 != 12445) {
            return null;
        }
        field2125++;
        if (arg2.method336(41, class44.field940) == -1) {
            return arg2;
        }
        while (true) {
            int var3 = arg2.method336(arg0 ^ 0x30B8, class62.field1139);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg2.method336(45, class165.field3150);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg2.method336(66, class37.field783);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg2.method336(119, class113.field2026);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg2.method336(54, class109.field1888);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg2.method336(120, class160.field3032);
                                                    if (var8 == -1) {
                                                        return arg2;
                                                    }
                                                    class37 var9 = class243.field4462;
                                                    if (class125.field2274 != null) {
                                                        var9 = class170.method1151(arg0 ^ 0x3062, class125.field2274.field2462);
                                                        try {
                                                            if (class125.field2274.field2465 != null) {
                                                                byte[] var10 = ((String) class125.field2274.field2465).getBytes("ISO-8859-1");
                                                                var9 = class105.method682(var10, 0, var10.length, 0);
                                                            }
                                                        } catch (UnsupportedEncodingException var11) {
                                                        }
                                                    }
                                                    arg2 = class80.method548(new class37[] { arg2.method311(var8, 0, true), var9, arg2.method301((byte) 109, var8 + 4) }, arg0 ^ 0xFFFFCF3C);
                                                }
                                            }
                                            arg2 = class80.method548(new class37[] { arg2.method311(var7, 0, true), class82.method562((byte) 103, class13.method84(-26, 4, arg1)), arg2.method301((byte) 98, var7 + 2) }, arg0 ^ 0xFFFFCF0A);
                                        }
                                    }
                                    arg2 = class80.method548(new class37[] { arg2.method311(var6, 0, true), class82.method562((byte) 103, class13.method84(-26, 3, arg1)), arg2.method301((byte) 120, var6 + 2) }, arg0 - 12454);
                                }
                            }
                            arg2 = class80.method548(new class37[] { arg2.method311(var5, 0, true), class82.method562((byte) 103, class13.method84(arg0 - 12471, 2, arg1)), arg2.method301((byte) 88, var5 + 2) }, -25);
                        }
                    }
                    arg2 = class80.method548(new class37[] { arg2.method311(var4, 0, true), class82.method562((byte) 103, class13.method84(arg0 ^ 0xFFFFCF7B, 1, arg1)), arg2.method301((byte) 67, var4 + 2) }, -22);
                }
            }
            arg2 = class80.method548(new class37[] { arg2.method311(var3, 0, true), class82.method562((byte) 103, class13.method84(-26, 0, arg1)), arg2.method301((byte) 71, var3 + 2) }, -26);
        }
    }
}
