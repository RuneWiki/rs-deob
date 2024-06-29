import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class270 {

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    private int field3858 = 0;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "Lhe;")
    private class372 field3863;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
    public static int field3864 = -1;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public static int field3860 = -1;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "Lefa;")
    private class184 field3861;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)Lefa;")
    public final class184 method1721(int arg0) {
        this.field3858 = arg0;
        field3862++;
        return this.method1723(true);
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)V")
    public static final void method1722(int arg0) {
        field3859++;
        int var1 = 45 / ((arg0 - 31) / 49);
        for (class567 var2 = (class567) class673.field9386.method3508(-2); var2 != null; var2 = (class567) class673.field9386.method3507(-56)) {
            if (var2.field8052 > 1) {
                var2.field8052 = 0;
                class606.field8553.method801(1, var2, ((class342) var2.field8055.field8521.field6156).field4959);
                var2.field8055.method3503(-16);
            }
        }
        class68.field969 = 0;
        class565.field8032 = 0;
        class748.field10459.method1200(79);
        class33.field350.method2289(1393);
        class673.field9386.method3503(-16);
        class483.field6967 = false;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)Lefa;")
    public final class184 method1723(boolean arg0) {
        if (!arg0) {
            return null;
        }
        field3857++;
        if (this.field3858 > 0 && this.field3863.field5332[this.field3858 - 1] != this.field3861) {
            class184 var2 = this.field3861;
            this.field3861 = var2.field2812;
            return var2;
        }
        while (this.field3863.field5336 > this.field3858) {
            class184 var3 = this.field3863.field5332[this.field3858++].field2812;
            if (this.field3863.field5332[this.field3858 - 1] != var3) {
                this.field3861 = var3.field2812;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V")
    public class270() {
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lhe;)V")
    public class270(class372 arg0) {
        this.field3863 = arg0;
    }
}
