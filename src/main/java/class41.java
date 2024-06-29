import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class41 extends class123 {

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "I")
    private int field628 = -32768;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "I")
    public static int field622 = -1;

    @OriginalMember(owner = "client!ok", name = "A", descriptor = "I")
    public static int field631 = 0;

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "Lmh;")
    public static class62 field633 = class201.method1405(true, " GMT");

    @OriginalMember(owner = "client!ok", name = "D", descriptor = "Lmh;")
    public static class62 field634 = class201.method1405(true, ")4g");

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
    public int field620;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!ok", name = "y", descriptor = "I")
    public int field629;

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "[Lsg;")
    public static class191[] field624;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "[[[B")
    public static byte[][][] field619;

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "[[[I")
    public static int[][][] field632;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIIIIJ)V", line = 5)
    public final void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field630++;
        class138 var11 = class189.method1320(0, this.field629).method244(this.field620, 0, (byte) -82, (class96) null);
        if (var11 != null) {
            var11.method276(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field628 = var11.method278();
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V", line = 27)
    public static final void method277(boolean arg0) {
        if (class200.field3381 != null) {
            class200.field3381.method1193(-1);
            class200.field3381 = null;
        }
        class190.method1325((byte) -75);
        field623++;
        class52.method340();
        for (int var1 = 0; var1 < 4; var1++) {
            class250.field4244[var1].method1560(-31);
        }
        class309.method2102(-73);
        System.gc();
        class73.method524(arg0, 2);
        class91.field1429 = false;
        class182.field2909 = -1;
        class161.method1171(261491, true);
        class80.field1335 = false;
        class290.field4936 = 0;
        class120.field2006 = 0;
        for (int var2 = 0; var2 < class189.field3012.length; var2++) {
            class189.field3012[var2] = null;
        }
        class118.field1975 = 0;
        class133.field2163 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class5.field50[var3] = null;
            class181.field2868[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class301.field5186[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class7.field72[var5][var6][var7] = null;
                }
            }
        }
        class94.method757(5);
        class221.field3803 = 0;
        class7.method33((byte) 98);
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "()I", line = 113)
    public final int method278() {
        field621++;
        return this.field628;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lhi;II)Lkb;", line = 132)
    public static final class82 method279(class26 arg0, int arg1, int arg2) {
        field627++;
        if (arg2 != -32768) {
            field631 = 6;
        }
        return class248.method1728(arg0, arg1, (byte) 121) ? class90.method674(arg2 ^ 0xFFFFF530) : null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BII)V", line = 185)
    public static final void method280(byte arg0, int arg1, int arg2) {
        field625++;
        class151 var3 = class165.method1194((byte) 1, 5, arg1);
        var3.method1088(124);
        int var4 = 58 % ((arg0 + 9) / 53);
        var3.field2395 = arg2;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(Z)V", line = 209)
    public static void method281(boolean arg0) {
        field619 = (byte[][][]) null;
        field624 = null;
        if (arg0) {
            field624 = (class191[]) null;
        }
        field632 = (int[][][]) null;
        field633 = null;
        field634 = null;
    }
}
