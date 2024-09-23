import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZPNSJLZE")
public class class69 {

    @OriginalMember(owner = "ZPNSJLZE", name = "a", descriptor = "Z")
    private boolean field1697 = false;

    @OriginalMember(owner = "ZPNSJLZE", name = "b", descriptor = "I")
    private int field1698 = -44493;

    @OriginalMember(owner = "ZPNSJLZE", name = "e", descriptor = "LKWULTEKW;")
    private class28 field1701 = new class28();

    @OriginalMember(owner = "ZPNSJLZE", name = "i", descriptor = "LYGUBUIIU;")
    private class63 field1705 = new class63(false);

    @OriginalMember(owner = "ZPNSJLZE", name = "f", descriptor = "I")
    private int field1702;

    @OriginalMember(owner = "ZPNSJLZE", name = "g", descriptor = "I")
    private int field1703;

    @OriginalMember(owner = "ZPNSJLZE", name = "h", descriptor = "LXWMRKIHQ;")
    private class60 field1704;

    @OriginalMember(owner = "ZPNSJLZE", name = "c", descriptor = "I")
    private int field1699;

    @OriginalMember(owner = "ZPNSJLZE", name = "d", descriptor = "I")
    private int field1700;

    @OriginalMember(owner = "ZPNSJLZE", name = "<init>", descriptor = "(IZ)V")
    public class69(int arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        }
        this.field1702 = arg0;
        this.field1703 = arg0;
        this.field1704 = new class60(1024, 38166);
    }

    @OriginalMember(owner = "ZPNSJLZE", name = "a", descriptor = "(J)LKWULTEKW;")
    public class28 method586(long arg0) {
        class28 var3 = (class28) this.field1704.method554(arg0);
        if (var3 == null) {
            this.field1699++;
        } else {
            this.field1705.method573(var3);
            this.field1700++;
        }
        return var3;
    }

    @OriginalMember(owner = "ZPNSJLZE", name = "a", descriptor = "(LKWULTEKW;IJ)V")
    public void method587(class28 arg0, int arg1, long arg2) {
        if (this.field1703 == 0) {
            class28 var5 = this.field1705.method574();
            var5.method336();
            var5.method330();
            if (this.field1701 == var5) {
                class28 var6 = this.field1705.method574();
                var6.method336();
                var6.method330();
            }
        } else {
            this.field1703--;
        }
        this.field1704.method555((byte) 5, arg0, arg2);
        this.field1705.method573(arg0);
        if (arg1 != 0) {
            this.field1697 = !this.field1697;
        }
    }

    @OriginalMember(owner = "ZPNSJLZE", name = "a", descriptor = "()V")
    public void method588() {
        while (true) {
            class28 var1 = this.field1705.method574();
            if (var1 == null) {
                this.field1703 = this.field1702;
                return;
            }
            var1.method336();
            var1.method330();
        }
    }
}
