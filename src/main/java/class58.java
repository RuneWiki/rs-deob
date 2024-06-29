import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class58 {

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public int field956 = 0;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "Lea;")
    public static class11 field954 = new class11(0, 0);

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "Lki;")
    public static class158 field960;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "Lpk;")
    public static class237 field962;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "[[[B")
    public static byte[][][] field957;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static void method476(int arg0) {
        field957 = null;
        field962 = null;
        field960 = null;
        field954 = null;
        if (arg0 <= 87) {
            method479((class26) null, -65);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[B)V")
    public static final void method477(int arg0, byte[] arg1) {
        field959++;
        class54 var2 = new class54(arg1);
        var2.field887 = arg1.length - 2;
        class246.field3823 = var2.method423(78);
        class27.field525 = new int[class246.field3823];
        class5.field69 = new int[class246.field3823];
        class135.field1973 = new int[class246.field3823];
        class173.field2530 = new int[class246.field3823];
        class82.field1270 = new byte[class246.field3823][];
        class209.field3125 = new byte[class246.field3823][];
        class210.field3134 = new boolean[class246.field3823];
        var2.field887 = arg1.length - (class246.field3823 * 8) - 7;
        client.field729 = var2.method423(-103);
        class126.field1857 = var2.method423(82);
        if (arg0 != 2) {
            field954 = null;
        }
        int var3 = (var2.method407(255) & 0xFF) + 1;
        for (int var4 = 0; var4 < class246.field3823; var4++) {
            class135.field1973[var4] = var2.method423(-81);
        }
        for (int var5 = 0; var5 < class246.field3823; var5++) {
            class5.field69[var5] = var2.method423(108);
        }
        for (int var6 = 0; var6 < class246.field3823; var6++) {
            class27.field525[var6] = var2.method423(-101);
        }
        for (int var7 = 0; var7 < class246.field3823; var7++) {
            class173.field2530[var7] = var2.method423(-77);
        }
        var2.field887 = arg1.length - class246.field3823 * 8 - ((var3 + -1) * 3) - 7;
        class15.field221 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class15.field221[var8] = var2.method408(8);
            if (class15.field221[var8] == 0) {
                class15.field221[var8] = 1;
            }
        }
        var2.field887 = 0;
        for (int var9 = 0; var9 < class246.field3823; var9++) {
            int var10 = class27.field525[var9];
            int var11 = class173.field2530[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            class209.field3125[var9] = var13;
            class82.field1270[var9] = var14;
            boolean var15 = false;
            int var16 = var2.method407(255);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method459(false);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var14[var18] = var2.method459(false);
                        var15 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label101: while (true) {
                    if (var20 >= var10) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var21 = 0;
                        while (true) {
                            if (var21 >= var10) {
                                break label101;
                            }
                            for (int var22 = 0; var22 < var11; var22++) {
                                byte var23 = var14[var10 * var22 + var21] = var2.method459(false);
                                var15 |= var23 != -1;
                            }
                            var21++;
                        }
                    }
                    for (int var24 = 0; var24 < var11; var24++) {
                        var13[var10 * var24 + var20] = var2.method459(false);
                    }
                    var20++;
                }
            }
            class210.field3134[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILca;I)V")
    private final void method478(int arg0, class54 arg1, int arg2) {
        field955++;
        if (~arg0 == arg2) {
            this.field956 = arg1.method423(arg2 ^ 0xFFFFFF93);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lgf;I)V")
    public static final void method479(class26 arg0, int arg1) {
        field958++;
        class161 var2 = null;
        try {
            class40 var3 = arg0.method183((byte) 106, "runescape");
            while (var3.field713 == 0) {
                client.method323(1L, arg1 ^ 0x96);
            }
            if (var3.field713 == 1) {
                var2 = (class161) var3.field709;
                class54 var4 = class261.method1762(-122);
                var2.method1088(-1, var4.field848, var4.field887, 0);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method1087(-72);
            }
            if (arg1 != -230) {
                method476(100);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILca;)V")
    public final void method480(int arg0, class54 arg1) {
        if (arg0 != -1) {
            method476(-12);
        }
        field961++;
        while (true) {
            int var3 = arg1.method407(255);
            if (var3 == 0) {
                return;
            }
            this.method478(var3, arg1, -6);
        }
    }
}
