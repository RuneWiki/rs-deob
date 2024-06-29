import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class104 extends class332 {

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public static int field1340 = 0;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "Lng;")
    public static class171 field1339 = new class171(0, -1);

    @OriginalMember(owner = "client!q", name = "q", descriptor = "Lan;")
    public static class337 field1345 = new class337();

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "J")
    public long field1344;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "Lq;")
    public class104 field1341;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "Lq;")
    public class104 field1343;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V", line = 16)
    public static void method609(byte arg0) {
        if (arg0 > 113) {
            field1339 = null;
            field1345 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V", line = 32)
    public final void method610(int arg0) {
        field1342++;
        if (this.field1341 == null) {
            return;
        }
        this.field1341.field1343 = this.field1343;
        if (arg0 == -1) {
            this.field1343.field1341 = this.field1341;
            this.field1343 = null;
            this.field1341 = null;
        }
    }
}
