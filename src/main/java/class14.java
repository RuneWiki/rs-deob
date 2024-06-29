import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class14 extends class113 {

    @OriginalMember(owner = "client!bf", name = "jb", descriptor = "Z")
    public boolean field359 = false;

    @OriginalMember(owner = "client!bf", name = "hb", descriptor = "I")
    private int field357 = 0;

    @OriginalMember(owner = "client!bf", name = "nb", descriptor = "I")
    private int field363 = 0;

    @OriginalMember(owner = "client!bf", name = "ib", descriptor = "I")
    public int field358;

    @OriginalMember(owner = "client!bf", name = "gb", descriptor = "I")
    public int field356;

    @OriginalMember(owner = "client!bf", name = "db", descriptor = "I")
    public int field353;

    @OriginalMember(owner = "client!bf", name = "cb", descriptor = "I")
    private int field352;

    @OriginalMember(owner = "client!bf", name = "bb", descriptor = "I")
    public int field351;

    @OriginalMember(owner = "client!bf", name = "kb", descriptor = "I")
    public int field360;

    @OriginalMember(owner = "client!bf", name = "eb", descriptor = "Lqe;")
    private class116 field354;

    @OriginalMember(owner = "client!bf", name = "mb", descriptor = "[I")
    public static int[] field362 = new int[32];

    @OriginalMember(owner = "client!bf", name = "rb", descriptor = "Lfc;")
    public static class39 field367;

    @OriginalMember(owner = "client!bf", name = "sb", descriptor = "Lfc;")
    private static class39 field368;

    @OriginalMember(owner = "client!bf", name = "ub", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!bf", name = "pb", descriptor = "Lfc;")
    public static class39 field365;

    @OriginalMember(owner = "client!bf", name = "fb", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!bf", name = "lb", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!bf", name = "ob", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!bf", name = "tb", descriptor = "Loc;")
    public static class100 field369;

    @OriginalMember(owner = "client!bf", name = "qb", descriptor = "Ljd;")
    public static class66 field366;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field362[var1] = var0 - 1;
            var0 += var0;
        }
        field367 = class90.method774("mapscene", -79);
        field368 = class90.method774("OFF", -94);
        field370 = -1;
        field365 = field368;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)Lda;", line = 31)
    public final class23 method153(int arg0) {
        if (arg0 != 64) {
            method154(55);
        }
        field361++;
        class107 var2 = class60.method598(this.field352, 32);
        class23 var3;
        if (this.field359) {
            var3 = var2.method943(-1, 16664);
        } else {
            var3 = var2.method943(this.field357, 16664);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(IIIIIII)V", line = 163)
    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field358 = arg2;
        this.field356 = arg1;
        this.field353 = arg5 + arg6;
        this.field352 = arg0;
        this.field351 = arg4;
        this.field360 = arg3;
        int var8 = class60.method598(this.field352, 32).field2691;
        if (var8 == -1) {
            this.field359 = true;
        } else {
            this.field359 = false;
            this.field354 = class38.method430(2238, var8);
        }
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)V", line = 56)
    public static void method154(int arg0) {
        field362 = null;
        if (arg0 >= -75) {
            return;
        }
        field367 = null;
        field365 = null;
        field368 = null;
        field366 = null;
        field369 = null;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(Z)V", line = 77)
    public static final void method155(boolean arg0) {
        if (class13.field331 != null) {
            class50 var1 = class13.field331;
            synchronized (class13.field331) {
                class13.field331 = null;
            }
        }
        field364++;
        if (!arg0) {
            method155(false);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)V", line = 125)
    public final void method156(int arg0, byte arg1) {
        field355++;
        if (this.field359) {
            return;
        }
        this.field363 += arg0;
        int var3 = -82 % ((arg1 + 50) / 58);
        while (this.field363 > this.field354.field3035[this.field357]) {
            this.field363 -= this.field354.field3035[this.field357];
            this.field357++;
            if (this.field354.field3057.length <= this.field357) {
                this.field359 = true;
                return;
            }
        }
    }
}
