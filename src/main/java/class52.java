import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QXKQGEKL")
public class class52 {

    @OriginalMember(owner = "client!QXKQGEKL", name = "a", descriptor = "I")
    private int field1520 = 4;

    @OriginalMember(owner = "client!QXKQGEKL", name = "b", descriptor = "I")
    private int field1521 = 48306;

    @OriginalMember(owner = "client!QXKQGEKL", name = "c", descriptor = "Z")
    private boolean field1522 = true;

    @OriginalMember(owner = "client!QXKQGEKL", name = "f", descriptor = "LPFQOGDTY;")
    private class48 field1525 = new class48();

    @OriginalMember(owner = "client!QXKQGEKL", name = "j", descriptor = "LLIHZBJAU;")
    private class31 field1529 = new class31(0);

    @OriginalMember(owner = "client!QXKQGEKL", name = "g", descriptor = "I")
    private int field1526;

    @OriginalMember(owner = "client!QXKQGEKL", name = "h", descriptor = "I")
    private int field1527;

    @OriginalMember(owner = "client!QXKQGEKL", name = "i", descriptor = "LSMFBSJJD;")
    private class56 field1528;

    @OriginalMember(owner = "client!QXKQGEKL", name = "d", descriptor = "I")
    private int field1523;

    @OriginalMember(owner = "client!QXKQGEKL", name = "e", descriptor = "I")
    private int field1524;

    @OriginalMember(owner = "client!QXKQGEKL", name = "<init>", descriptor = "(II)V")
    public class52(int arg0, int arg1) {
        this.field1526 = arg0;
        if (arg1 != 5) {
            this.field1521 = 35;
        }
        this.field1527 = arg0;
        this.field1528 = new class56(this.field1520, 1024);
    }

    @OriginalMember(owner = "client!QXKQGEKL", name = "a", descriptor = "(J)LPFQOGDTY;")
    public class48 method440(long arg0) {
        class48 var3 = (class48) this.field1528.method503(arg0);
        if (var3 == null) {
            this.field1523++;
        } else {
            this.field1529.method265(var3);
            this.field1524++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!QXKQGEKL", name = "a", descriptor = "(JLPFQOGDTY;I)V")
    public void method441(long arg0, class48 arg1, int arg2) {
        if (arg2 >= 0) {
            return;
        }
        if (this.field1527 == 0) {
            class48 var5 = this.field1529.method266();
            var5.method505();
            var5.method423();
            if (this.field1525 == var5) {
                class48 var6 = this.field1529.method266();
                var6.method505();
                var6.method423();
            }
        } else {
            this.field1527--;
        }
        this.field1528.method504(arg0, arg1, true);
        this.field1529.method265(arg1);
    }

    @OriginalMember(owner = "client!QXKQGEKL", name = "a", descriptor = "()V")
    public void method442() {
        while (true) {
            class48 var1 = this.field1529.method266();
            if (var1 == null) {
                this.field1527 = this.field1526;
                return;
            }
            var1.method505();
            var1.method423();
        }
    }
}
