import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class61 {

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    public int field621 = -1;

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "I")
    public int field624 = -1;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
    public static int field622 = -1;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "Lnm;")
    public static class159 field626;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "[I")
    public int[] field623;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V", line = 3)
    public static void method329(int arg0) {
        field626 = null;
        if (arg0 != 0) {
            method329(106);
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ltq;II)V", line = 19)
    public final void method330(class250 arg0, int arg1, int arg2) {
        field625++;
        while (true) {
            int var4 = arg0.method1350(arg1 + 19932);
            if (var4 == 0) {
                if (arg1 == 11419) {
                    return;
                } else {
                    this.field624 = 5;
                    return;
                }
            }
            this.method331(arg0, -35, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ltq;III)V", line = 43)
    private final void method331(class250 arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            this.field624 = arg0.method1374(-2);
        } else if (arg2 == 2) {
            this.field623 = new int[arg0.method1350(31351)];
            for (int var5 = 0; var5 < this.field623.length; var5++) {
                this.field623[var5] = arg0.method1374(-2);
            }
        } else if (arg2 == 3) {
            this.field621 = arg0.method1350(31351);
        }
        int var6 = -100 % ((arg1 - 72) / 46);
        field627++;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(III)V", line = 84)
    public static final void method332(int arg0, int arg1, int arg2) {
        class96 var3 = class176.field2209[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field1126 != null) {
            var3.field1126 = null;
        }
        if (var3.field1140 != null) {
            var3.field1140 = null;
        }
    }
}
