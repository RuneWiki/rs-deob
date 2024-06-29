import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class15 {

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Z")
    public static boolean field213 = false;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "Lii;")
    public static class96 field217 = null;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "Lmb;")
    public static class132 field218 = class166.method1092("Hier wechseln", 125);

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "[[[Lbg;")
    public static class19[][][] field216 = new class19[4][104][104];

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "Lmb;")
    public static class132 field214 = class166.method1092("http:)4)4www)3runescape)3com)4l=", 119);

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "Lmb;")
    private static class132 field225 = class166.method1092("Invalid loginserver requested)3", 112);

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public static int field221 = 0;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field211 = 0;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "Lmb;")
    public static class132 field223 = field225;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public int field215;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public int field219;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public int field226;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "J")
    public long field210;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "Lji;")
    public static class107 field222;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "Lmf;")
    public class136 field227;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "Lpb;")
    public static class165 field228;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "Lii;")
    public static class96 field220;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "[I")
    public static int[] field230;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lga;ZI)V")
    public static final void method78(class68 arg0, boolean arg1, int arg2) {
        field212++;
        int var3 = -90 / ((45 - arg2) / 34);
        if (class130.field2397 != null) {
            try {
                class130.field2397.method423(true);
            } catch (Exception var9) {
            }
            class130.field2397 = null;
        }
        class130.field2397 = arg0;
        class164.method1060(arg1, 853933806);
        class194.field3603 = 0;
        class162.field2941.field2133 = 0;
        class230.field4150 = null;
        class37.field608 = null;
        while (true) {
            class198 var4 = (class198) class152.field2771.method811((byte) -4);
            if (var4 == null) {
                while (true) {
                    class198 var5 = (class198) class101.field1897.method811((byte) -4);
                    if (var5 == null) {
                        if (class91.field1606 != 0) {
                            try {
                                class112 var6 = new class112(4);
                                var6.method747(4, (byte) -87);
                                var6.method747(class91.field1606, (byte) -103);
                                var6.method715(93, 0);
                                class130.field2397.method419(-113, var6.field2157, 0, 4);
                            } catch (IOException var8) {
                                try {
                                    class130.field2397.method423(true);
                                } catch (Exception var7) {
                                }
                                class130.field2397 = null;
                                class75.field1245++;
                            }
                        }
                        class226.field4100 = 0;
                        class35.field564 = class113.method769(106);
                        return;
                    }
                    class104.field1948.method847(121, var5);
                    class25.field409.method810(var5, var5.field2760, -18274);
                    class34.field558++;
                    class55.field923--;
                }
            }
            class95.field1680.method810(var4, var4.field2760, -18274);
            class105.field1960++;
            class200.field3689--;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field224++;
        int var8 = arg4 - arg3;
        int var9 = arg5 + arg3;
        int var10 = arg2 + arg3;
        for (int var11 = arg5; var11 < var9; var11++) {
            class23.method153(arg1, class61.field1033[var11], true, arg2, arg0);
        }
        int var12 = -100 / ((arg6 + 84) / 38);
        int var13 = arg0 - arg3;
        for (int var14 = arg4; var14 > var8; var14--) {
            class23.method153(arg1, class61.field1033[var14], true, arg2, arg0);
        }
        for (int var15 = var9; var15 <= var8; var15++) {
            int[] var16 = class61.field1033[var15];
            class23.method153(arg1, var16, true, arg2, var10);
            class23.method153(arg7, var16, true, var10, var13);
            class23.method153(arg1, var16, true, var13, arg0);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
    public static void method80(boolean arg0) {
        field218 = null;
        field220 = null;
        field225 = null;
        field216 = null;
        field230 = null;
        field228 = null;
        field217 = null;
        field214 = null;
        field222 = null;
        field223 = null;
        if (arg0) {
            field216 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static final void method81(int arg0) {
        class27.field448 = arg0;
        for (int var1 = 0; var1 < class225.field4079; var1++) {
            for (int var2 = 0; var2 < class14.field193; var2++) {
                if (class101.field1900[arg0][var1][var2] == null) {
                    class101.field1900[arg0][var1][var2] = new class169(arg0, var1, var2);
                }
            }
        }
    }
}
