import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("WMYPWVZI")
public class class62 {

    @OriginalMember(owner = "WMYPWVZI", name = "a", descriptor = "Z")
    private boolean field1569 = false;

    @OriginalMember(owner = "WMYPWVZI", name = "d", descriptor = "LWLTWEDNK;")
    private class61 field1572 = new class61();

    @OriginalMember(owner = "WMYPWVZI", name = "h", descriptor = "LVHKTMNAT;")
    private class57 field1576 = new class57(true);

    @OriginalMember(owner = "WMYPWVZI", name = "e", descriptor = "I")
    private int field1573;

    @OriginalMember(owner = "WMYPWVZI", name = "f", descriptor = "I")
    private int field1574;

    @OriginalMember(owner = "WMYPWVZI", name = "g", descriptor = "LSAEPCADT;")
    private class45 field1575;

    @OriginalMember(owner = "WMYPWVZI", name = "b", descriptor = "I")
    private int field1570;

    @OriginalMember(owner = "WMYPWVZI", name = "c", descriptor = "I")
    private int field1571;

    @OriginalMember(owner = "WMYPWVZI", name = "<init>", descriptor = "(II)V")
    public class62(int arg0, int arg1) {
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
        this.field1573 = arg0;
        this.field1574 = arg0;
        this.field1575 = new class45(-854, 1024);
    }

    @OriginalMember(owner = "WMYPWVZI", name = "a", descriptor = "(J)LWLTWEDNK;")
    public class61 method525(long arg0) {
        class61 var3 = (class61) this.field1575.method431(arg0);
        if (var3 == null) {
            this.field1570++;
        } else {
            this.field1576.method489(var3);
            this.field1571++;
        }
        return var3;
    }

    @OriginalMember(owner = "WMYPWVZI", name = "a", descriptor = "(JILWLTWEDNK;)V")
    public void method526(long arg0, int arg1, class61 arg2) {
        if (this.field1574 == 0) {
            class61 var5 = this.field1576.method490();
            var5.method540();
            var5.method524();
            if (this.field1572 == var5) {
                class61 var6 = this.field1576.method490();
                var6.method540();
                var6.method524();
            }
        } else {
            this.field1574--;
        }
        this.field1575.method432(-11582, arg0, arg2);
        this.field1576.method489(arg2);
        if (arg1 >= 5 && arg1 <= 5 && class64.field1590) {
        }
    }

    @OriginalMember(owner = "WMYPWVZI", name = "a", descriptor = "()V")
    public void method527() {
        while (true) {
            class61 var1 = this.field1576.method490();
            if (var1 == null) {
                this.field1574 = this.field1573;
                return;
            }
            var1.method540();
            var1.method524();
        }
    }
}
