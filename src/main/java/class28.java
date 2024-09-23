import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LOPREVUC")
public class class28 {

    @OriginalMember(owner = "LOPREVUC", name = "a", descriptor = "Z")
    private boolean field992 = true;

    @OriginalMember(owner = "LOPREVUC", name = "b", descriptor = "I")
    private int field993 = 6;

    @OriginalMember(owner = "LOPREVUC", name = "c", descriptor = "LCJDGAOKT;")
    public class6 field994 = new class6();

    @OriginalMember(owner = "LOPREVUC", name = "d", descriptor = "LCJDGAOKT;")
    private class6 field995;

    @OriginalMember(owner = "LOPREVUC", name = "<init>", descriptor = "(I)V")
    public class28(int arg0) {
        this.field994.field103 = this.field994;
        int var2 = 32 / arg0;
        this.field994.field104 = this.field994;
    }

    @OriginalMember(owner = "LOPREVUC", name = "a", descriptor = "(LCJDGAOKT;)V")
    public void method259(class6 arg0) {
        if (arg0.field104 != null) {
            arg0.method37();
        }
        arg0.field104 = this.field994.field104;
        arg0.field103 = this.field994;
        arg0.field104.field103 = arg0;
        arg0.field103.field104 = arg0;
    }

    @OriginalMember(owner = "LOPREVUC", name = "a", descriptor = "()LCJDGAOKT;")
    public class6 method260() {
        class6 var1 = this.field994.field103;
        if (this.field994 == var1) {
            return null;
        } else {
            var1.method37();
            return var1;
        }
    }

    @OriginalMember(owner = "LOPREVUC", name = "b", descriptor = "()LCJDGAOKT;")
    public class6 method261() {
        class6 var1 = this.field994.field103;
        if (this.field994 == var1) {
            this.field995 = null;
            return null;
        } else {
            this.field995 = var1.field103;
            return var1;
        }
    }

    @OriginalMember(owner = "LOPREVUC", name = "a", descriptor = "(I)LCJDGAOKT;")
    public class6 method262(int arg0) {
        class6 var2 = this.field995;
        if (this.field994 == var2) {
            this.field995 = null;
            return null;
        }
        this.field995 = var2.field103;
        while (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return var2;
    }

    @OriginalMember(owner = "LOPREVUC", name = "c", descriptor = "()I")
    public int method263() {
        int var1 = 0;
        for (class6 var2 = this.field994.field103; var2 != this.field994; var2 = var2.field103) {
            var1++;
        }
        return var1;
    }
}
