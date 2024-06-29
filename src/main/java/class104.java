import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class104 extends class503 {

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "[Ljl;")
    public static class168[] field1404 = new class168[14];

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "Lts;")
    public static class356 field1403 = null;

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)Z")
    public final boolean method623(byte arg0) {
        if (arg0 <= 45) {
            return true;
        } else {
            ++field1401;
            return true;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(III)V")
    public final void method624(int arg0, int arg1, int arg2) {
        int var4 = -51 / (-arg0 / 59);
        ++field1406;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZZ)V")
    public final void method625(boolean arg0, boolean arg1) {
        ++field1400;
        if (arg0) {
            this.method627(true, 27);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IBLtu;)V")
    public final void method626(int arg0, byte arg1, class221 arg2) {
        if (arg1 > -21) {
            field1403 = null;
        }
        ++field1405;
        super.field7679.method2883(arg2, 39);
        super.field7679.method2914(126, arg0);
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lrl;)V")
    public class104(class487 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZI)V")
    public final void method627(boolean arg0, int arg1) {
        if (arg1 != -1805) {
            this.method624(-60, -40, -53);
        }
        super.field7679.method2864(true, true);
        ++field1402;
    }

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "(I)V")
    public static void method628(int arg0) {
        if (arg0 >= -117) {
            field1403 = null;
        }
        field1404 = null;
        field1403 = null;
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(B)V")
    public final void method629(byte arg0) {
        super.field7679.method2864(false, true);
        if (arg0 == -122) {
            ++field1407;
        }
    }

    static {
        new class194("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
    }
}
