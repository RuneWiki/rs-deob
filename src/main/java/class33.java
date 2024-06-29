import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class33 {

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "Lsp;")
    private class452 field382 = new class452();

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "Lsu;")
    private class143 field387 = new class143();

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "I")
    private int field388;

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "I")
    private int field389;

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "Lgu;")
    private class412 field386;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
    public final void method229(int arg0) {
        field383++;
        this.field387.method1026(-15663);
        this.field386.method2588(-106);
        int var2 = 71 % ((arg0 - 50) / 41);
        this.field382 = new class452();
        this.field389 = this.field388;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IILul;I)Llm;")
    public static final class348 method230(int arg0, int arg1, class406 arg2, int arg3) {
        if (arg0 == 21108) {
            field380++;
            byte[] var4 = arg2.method2536(arg1, arg0 - 21108, arg3);
            return var4 == null ? null : new class348(var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lsp;JI)V")
    public final void method231(class452 arg0, long arg1, int arg2) {
        if (this.field389 == 0) {
            class452 var5 = this.field387.method1019(65408);
            var5.method2677(-22491);
            var5.method2754(-152804768);
            if (this.field382 == var5) {
                class452 var6 = this.field387.method1019(65408);
                var6.method2677(-22491);
                var6.method2754(-152804768);
            }
        } else {
            this.field389--;
        }
        field381++;
        this.field386.method2591(arg1, arg0, (byte) 8);
        if (arg2 > -46) {
            this.field388 = 25;
        }
        this.field387.method1021(arg0, -83);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZJ)Lsp;")
    public final class452 method232(boolean arg0, long arg1) {
        field384++;
        class452 var4 = (class452) this.field386.method2585((byte) 114, arg1);
        if (var4 != null) {
            this.field387.method1021(var4, -86);
        }
        if (arg0) {
            this.method231(null, -109L, -95);
        }
        return var4;
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(I)V")
    public class33(int arg0) {
        this.field388 = arg0;
        this.field389 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field386 = new class412(var2);
    }
}
