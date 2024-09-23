import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GOHJFVWE")
public class class23 {

    @OriginalMember(owner = "GOHJFVWE", name = "a", descriptor = "I")
    private int field814 = -26486;

    @OriginalMember(owner = "GOHJFVWE", name = "b", descriptor = "I")
    private int field815 = 1;

    @OriginalMember(owner = "GOHJFVWE", name = "c", descriptor = "Z")
    private boolean field816 = true;

    @OriginalMember(owner = "GOHJFVWE", name = "f", descriptor = "LJJFDBATQ;")
    private class30 field819 = new class30();

    @OriginalMember(owner = "GOHJFVWE", name = "j", descriptor = "LXWKFKQRL;")
    private class63 field823 = new class63(false);

    @OriginalMember(owner = "GOHJFVWE", name = "g", descriptor = "I")
    private int field820;

    @OriginalMember(owner = "GOHJFVWE", name = "h", descriptor = "I")
    private int field821;

    @OriginalMember(owner = "GOHJFVWE", name = "i", descriptor = "LSTTRNURD;")
    private class49 field822;

    @OriginalMember(owner = "GOHJFVWE", name = "d", descriptor = "I")
    private int field817;

    @OriginalMember(owner = "GOHJFVWE", name = "e", descriptor = "I")
    private int field818;

    @OriginalMember(owner = "GOHJFVWE", name = "<init>", descriptor = "(BI)V")
    public class23(byte arg0, int arg1) {
        if (arg0 != -54) {
            this.field814 = -326;
        }
        this.field820 = arg1;
        this.field821 = arg1;
        this.field822 = new class49(false, 1024);
    }

    @OriginalMember(owner = "GOHJFVWE", name = "a", descriptor = "(J)LJJFDBATQ;")
    public class30 method227(long arg0) {
        class30 var3 = (class30) this.field822.method414(arg0);
        if (var3 == null) {
            this.field817++;
        } else {
            this.field823.method520(var3);
            this.field818++;
        }
        return var3;
    }

    @OriginalMember(owner = "GOHJFVWE", name = "a", descriptor = "(ILJJFDBATQ;J)V")
    public void method228(int arg0, class30 arg1, long arg2) {
        if (this.field821 == 0) {
            class30 var5 = this.field823.method521();
            var5.method589();
            var5.method278();
            if (this.field819 == var5) {
                class30 var6 = this.field823.method521();
                var6.method589();
                var6.method278();
            }
        } else {
            this.field821--;
        }
        this.field822.method415(arg2, arg1, this.field815);
        this.field823.method520(arg1);
        if (arg0 == 0 && class72.field1713) {
        }
    }

    @OriginalMember(owner = "GOHJFVWE", name = "a", descriptor = "()V")
    public void method229() {
        while (true) {
            class30 var1 = this.field823.method521();
            if (var1 == null) {
                this.field821 = this.field820;
                return;
            }
            var1.method589();
            var1.method278();
        }
    }
}
