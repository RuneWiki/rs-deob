import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YGUBUIIU")
public class class63 {

    @OriginalMember(owner = "YGUBUIIU", name = "a", descriptor = "Z")
    private boolean field1656 = false;

    @OriginalMember(owner = "YGUBUIIU", name = "b", descriptor = "I")
    private int field1657 = 6;

    @OriginalMember(owner = "YGUBUIIU", name = "c", descriptor = "LKWULTEKW;")
    public class28 field1658 = new class28();

    @OriginalMember(owner = "YGUBUIIU", name = "d", descriptor = "LKWULTEKW;")
    private class28 field1659;

    @OriginalMember(owner = "YGUBUIIU", name = "<init>", descriptor = "(Z)V")
    public class63(boolean arg0) {
        this.field1658.field1034 = this.field1658;
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1658.field1035 = this.field1658;
    }

    @OriginalMember(owner = "YGUBUIIU", name = "a", descriptor = "(LKWULTEKW;)V")
    public void method573(class28 arg0) {
        if (arg0.field1035 != null) {
            arg0.method330();
        }
        arg0.field1035 = this.field1658.field1035;
        arg0.field1034 = this.field1658;
        arg0.field1035.field1034 = arg0;
        arg0.field1034.field1035 = arg0;
    }

    @OriginalMember(owner = "YGUBUIIU", name = "a", descriptor = "()LKWULTEKW;")
    public class28 method574() {
        class28 var1 = this.field1658.field1034;
        if (this.field1658 == var1) {
            return null;
        } else {
            var1.method330();
            return var1;
        }
    }

    @OriginalMember(owner = "YGUBUIIU", name = "b", descriptor = "()LKWULTEKW;")
    public class28 method575() {
        class28 var1 = this.field1658.field1034;
        if (this.field1658 == var1) {
            this.field1659 = null;
            return null;
        } else {
            this.field1659 = var1.field1034;
            return var1;
        }
    }

    @OriginalMember(owner = "YGUBUIIU", name = "a", descriptor = "(I)LKWULTEKW;")
    public class28 method576(int arg0) {
        class28 var2 = this.field1659;
        if (this.field1658 == var2) {
            this.field1659 = null;
            return null;
        }
        this.field1659 = var2.field1034;
        if (arg0 != 0) {
            this.field1656 = !this.field1656;
        }
        return var2;
    }

    @OriginalMember(owner = "YGUBUIIU", name = "c", descriptor = "()I")
    public int method577() {
        int var1 = 0;
        for (class28 var2 = this.field1658.field1034; var2 != this.field1658; var2 = var2.field1034) {
            var1++;
        }
        return var1;
    }
}
