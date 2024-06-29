import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class72 extends class44 {

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    public int field1319;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    public int field1322;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "Lkb;")
    public static class93 field1320 = class76.method390("Ein kostenloses Spielkonto erstellen)3", 0);

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
    public static int field1323 = 1;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "Lkb;")
    public static class93 field1321 = class76.method390("::qa_op_test", 0);

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "Lkb;")
    public static class93 field1326 = class76.method390("rot:", 0);

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "Ljg;")
    public static class89 field1318;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I[Lkb;II)Lkb;")
    public static final class93 method379(int arg0, class93[] arg1, int arg2, int arg3) {
        field1324++;
        if (arg3 > -20) {
            return null;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < arg2; var5++) {
            if (arg1[arg0 + var5] == null) {
                arg1[arg0 + var5] = class188.field3675;
            }
            var4 += arg1[arg0 + var5].field1701;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg2; var8++) {
            class93 var10 = arg1[arg0 + var8];
            class90.method475(var10.field1726, 0, var6, var7, var10.field1701);
            var7 += var10.field1701;
        }
        class93 var9 = new class93();
        var9.field1726 = var6;
        var9.field1701 = var4;
        return var9;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
    public static void method380(int arg0) {
        field1318 = null;
        field1320 = null;
        if (arg0 == 0) {
            field1321 = null;
            field1326 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lge;Lme;II)V")
    public static final void method381(class61 arg0, class114 arg1, int arg2, int arg3) {
        field1325++;
        byte[] var4 = null;
        class122 var5 = class182.field3590;
        synchronized (class182.field3590) {
            for (class155 var6 = (class155) class182.field3590.method692(false); var6 != null; var6 = (class155) class182.field3590.method695(512)) {
                if ((long) arg2 == var6.field718 && var6.field3053 == arg0 && var6.field3047 == 0) {
                    var4 = var6.field3045;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var7 = arg0.method320((byte) 112, arg2);
            if (arg3 < -40) {
                arg1.method634(arg0, -769, var7, arg2, true);
            }
        } else {
            arg1.method634(arg0, -769, var4, arg2, true);
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(II)V")
    public class72(int arg0, int arg1) {
        this.field1319 = arg1;
        this.field1322 = arg0;
    }
}
