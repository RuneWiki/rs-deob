import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class492 {

    @OriginalMember(owner = "client!vaa", name = "e", descriptor = "I")
    public int field6984 = 443;

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "Z")
    private boolean field6981 = false;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "I")
    public int field6980 = 43594;

    @OriginalMember(owner = "client!vaa", name = "k", descriptor = "Z")
    private boolean field6990 = true;

    @OriginalMember(owner = "client!vaa", name = "g", descriptor = "Lpb;")
    public static class680 field6986 = new class680("WTWIP", "office", "_wip", 3);

    @OriginalMember(owner = "client!vaa", name = "l", descriptor = "Leca;")
    public static class789 field6991 = new class789();

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "I")
    public static int field6982;

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "I")
    public static int field6983;

    @OriginalMember(owner = "client!vaa", name = "f", descriptor = "I")
    public static int field6985;

    @OriginalMember(owner = "client!vaa", name = "i", descriptor = "I")
    public static int field6988;

    @OriginalMember(owner = "client!vaa", name = "j", descriptor = "I")
    public int field6989;

    @OriginalMember(owner = "client!vaa", name = "m", descriptor = "Lmia;")
    public static class69 field6992;

    @OriginalMember(owner = "client!vaa", name = "h", descriptor = "Ljava/lang/String;")
    public String field6987;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lvaa;I)Z", line = 4)
    public final boolean method2874(class492 arg0, int arg1) {
        if (arg1 != 443) {
            return true;
        }
        field6985++;
        if (arg0 == null) {
            return false;
        } else {
            return this.field6989 == arg0.field6989 && this.field6987.equals(arg0.field6987);
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)V", line = 28)
    public static void method2875(int arg0) {
        field6991 = null;
        field6992 = null;
        if (arg0 >= 35) {
            field6986 = null;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILkj;)Lrb;", line = 44)
    public final class370 method2876(int arg0, class590 arg1) {
        if (arg0 == -1) {
            field6988++;
            return arg1.method3419(this.field6981, this.field6990 ? this.field6984 : this.field6980, 255, this.field6987);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZI)V", line = 55)
    public static final void method2877(boolean arg0, int arg1) {
        field6982++;
        class269.method1757((byte) -124);
        int var2 = class266.field3756.method2801(arg1, 64).field7011;
        if (var2 == 0 || !arg0) {
            return;
        }
        int var3 = class271.field3796.field3840[arg1];
        if (var2 == 6) {
            class101.field1276 = var3;
        }
        if (var2 == 5) {
            class4.field56 = var3;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(I)V", line = 101)
    public final void method2878(int arg0) {
        if (arg0 != 3128) {
            return;
        }
        if (!this.field6990) {
            this.field6990 = true;
            this.field6981 = true;
        } else if (this.field6981) {
            this.field6981 = false;
        } else {
            this.field6990 = false;
        }
        field6983++;
    }
}
