import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class2 implements class385 {

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "Lgga;")
    private class513 field43;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Lgga;")
    private class513 field39;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Lwda;")
    private class490 field41;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "[I")
    public static int[] field34 = new int[500];

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Lin;")
    public static class380 field42 = new class380(17, -2);

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Lda;")
    private class443 field35;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)Z", line = 6)
    public final boolean method17(int arg0) {
        if (arg0 >= -93) {
            this.field41 = null;
        }
        field36++;
        boolean var2 = true;
        if (!this.field39.method3005(this.field41.field6722, (byte) -69)) {
            var2 = false;
        }
        if (!this.field43.method3005(this.field41.field6722, (byte) -69)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V", line = 27)
    public static void method18(int arg0) {
        field34 = null;
        field42 = null;
        if (arg0 != 0) {
            method21(-78, true);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI)V", line = 41)
    public final void method19(boolean arg0, int arg1) {
        field37++;
        if (arg0) {
            int var3 = this.field41.field6720.method3291(this.field41.field6726, 0, class499.field6858) + this.field41.field6725;
            int var4 = this.field41.field6730.method2110(class381.field5334, this.field41.field6716, -29133) + this.field41.field6715;
            this.field35.method2627(this.field41.field6718, this.field41.field6732, this.field41.field6719, this.field41.field6726, var3, this.field41.field6727, this.field41.field6724, this.field41.field6716, 0, null, this.field41.field6723, 0, null, -1609, var4, null);
        }
        if (arg1 < 44) {
            this.field43 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V", line = 61)
    public final void method20(int arg0) {
        field40++;
        if (arg0 < -50) {
            class470 var2 = class478.method2833(125, this.field43, this.field41.field6722);
            this.field35 = class686.field9702.method491(var2, class418.method2474(this.field39, this.field41.field6722), true);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)V", line = 77)
    public static final void method21(int arg0, boolean arg1) {
        if (class138.field2289 == null) {
            class355.method2145(0);
        }
        if (arg0 == 17) {
            field38++;
            if (arg1) {
                class138.field2289.method2708(249351760);
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lgga;Lgga;Lwda;)V", line = 100)
    public class2(class513 arg0, class513 arg1, class490 arg2) {
        this.field43 = arg1;
        this.field39 = arg0;
        this.field41 = arg2;
    }
}
