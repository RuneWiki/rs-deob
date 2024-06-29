import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class243 {

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "[Lql;")
    public static class78[] field3763 = new class78[4];

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "[Ldg;")
    public static class87[] field3762 = new class87[32768];

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field3769 = 1;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "[I")
    public static int[] field3766 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public int field3759;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public int field3761;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public int field3768;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "[[[B")
    public static byte[][][] field3765;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
    public static void method1654(int arg0) {
        field3765 = null;
        field3762 = null;
        field3763 = null;
        field3766 = null;
        int var1 = 78 / ((arg0 + 59) / 52);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)V")
    public static final void method1655(int arg0, int arg1) {
        field3764++;
        if (class13.field187 == null || arg0 > class13.field187.length) {
            class13.field187 = new int[arg0];
        }
        if (arg1 >= -82) {
            field3762 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lca;BI)V")
    private final void method1656(class54 arg0, byte arg1, int arg2) {
        field3758++;
        if (arg2 == 1) {
            this.field3768 = arg0.method423(62);
            this.field3759 = arg0.method407(255);
            this.field3761 = arg0.method407(255);
        }
        int var4 = 18 / ((arg1 - 38) / 61);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BLca;)V")
    public final void method1657(byte arg0, class54 arg1) {
        while (true) {
            int var3 = arg1.method407(255);
            if (var3 == 0) {
                field3760++;
                if (arg0 >= -84) {
                    this.method1657((byte) 68, (class54) null);
                    return;
                }
                return;
            }
            this.method1656(arg1, (byte) -105, var3);
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
    public static final void method1658(int arg0) {
        class109.method792();
        field3767++;
        for (int var1 = 0; var1 < 4; var1++) {
            field3763[var1].method615(2097152);
        }
        System.gc();
        if (arg0 != 4) {
            field3765 = null;
        }
    }
}
