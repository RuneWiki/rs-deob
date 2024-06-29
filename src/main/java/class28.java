import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class28 extends class424 {

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "Liw;")
    public static class207 field433 = null;

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!bo", name = "r", descriptor = "J")
    public long field437;

    @OriginalMember(owner = "client!bo", name = "s", descriptor = "Lbo;")
    public class28 field438;

    @OriginalMember(owner = "client!bo", name = "t", descriptor = "Lbo;")
    public class28 field439;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)Z")
    public final boolean method235(int arg0) {
        field434++;
        int var2 = -14 % ((arg0 - 21) / 40);
        return this.field439 != null;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V")
    public static void method236(int arg0) {
        int var1 = -25 % ((arg0 + 54) / 57);
        field433 = null;
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(B)V")
    public final void method237(byte arg0) {
        field435++;
        if (this.field439 == null) {
            return;
        }
        if (arg0 > -81) {
            field433 = null;
        }
        this.field439.field438 = this.field438;
        this.field438.field439 = this.field439;
        this.field438 = null;
        this.field439 = null;
    }
}
