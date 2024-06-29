import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class461 extends class603 {

    @OriginalMember(owner = "client!ko", name = "B", descriptor = "Ljava/lang/Object;")
    private Object field6404;

    @OriginalMember(owner = "client!ko", name = "A", descriptor = "Lpr;")
    public static class407 field6403 = new class407(14, 1);

    @OriginalMember(owner = "client!ko", name = "C", descriptor = "I")
    public static int field6405 = 0;

    @OriginalMember(owner = "client!ko", name = "D", descriptor = "Lpr;")
    public static class407 field6406 = new class407(106, 6);

    @OriginalMember(owner = "client!ko", name = "E", descriptor = "Lpca;")
    public static class653 field6407 = new class653(20);

    @OriginalMember(owner = "client!ko", name = "G", descriptor = "Lhv;")
    public static class474 field6409 = new class474();

    @OriginalMember(owner = "client!ko", name = "y", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!ko", name = "z", descriptor = "I")
    public static int field6402;

    @OriginalMember(owner = "client!ko", name = "H", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!ko", name = "F", descriptor = "[[Lep;")
    public static class382[][] field6408;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lw;III[Z)Z")
    public static final boolean method2625(class269 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class628.field8912 != class591.field8415) {
            int var6 = class275.field3477[arg1].method242(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class137 var8 = class275.field3477[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method242(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method250(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method251(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Llo;Ljava/lang/Object;I)V")
    public class461(class686 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field6404 = arg1;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)Ljava/lang/Object;")
    public final Object method462(int arg0) {
        int var2 = 56 / ((-arg0 - 38) / 40);
        field6401++;
        return this.field6404;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)Z")
    public final boolean method463(byte arg0) {
        if (arg0 >= -36) {
            return false;
        } else {
            field6402++;
            return false;
        }
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(I)V")
    public static void method2626(int arg0) {
        field6408 = null;
        field6406 = null;
        field6409 = null;
        if (arg0 == 5878) {
            field6407 = null;
            field6403 = null;
        }
    }
}
