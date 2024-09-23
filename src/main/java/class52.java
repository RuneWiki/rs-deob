import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RKSMLTCN")
public class class52 {

    @OriginalMember(owner = "RKSMLTCN", name = "a", descriptor = "I")
    private int field1262 = 303;

    @OriginalMember(owner = "RKSMLTCN", name = "b", descriptor = "LLMGYBGQR;")
    public class30 field1263 = new class30();

    @OriginalMember(owner = "RKSMLTCN", name = "c", descriptor = "LLMGYBGQR;")
    private class30 field1264;

    @OriginalMember(owner = "RKSMLTCN", name = "<init>", descriptor = "(I)V")
    public class52(int arg0) {
        this.field1263.field1017 = this.field1263;
        this.field1263.field1018 = this.field1263;
        if (arg0 != 42993) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "RKSMLTCN", name = "a", descriptor = "(LLMGYBGQR;)V")
    public void method405(class30 arg0) {
        if (arg0.field1018 != null) {
            arg0.method357();
        }
        arg0.field1018 = this.field1263.field1018;
        arg0.field1017 = this.field1263;
        arg0.field1018.field1017 = arg0;
        arg0.field1017.field1018 = arg0;
    }

    @OriginalMember(owner = "RKSMLTCN", name = "a", descriptor = "()LLMGYBGQR;")
    public class30 method406() {
        class30 var1 = this.field1263.field1017;
        if (this.field1263 == var1) {
            return null;
        } else {
            var1.method357();
            return var1;
        }
    }

    @OriginalMember(owner = "RKSMLTCN", name = "b", descriptor = "()LLMGYBGQR;")
    public class30 method407() {
        class30 var1 = this.field1263.field1017;
        if (this.field1263 == var1) {
            this.field1264 = null;
            return null;
        } else {
            this.field1264 = var1.field1017;
            return var1;
        }
    }

    @OriginalMember(owner = "RKSMLTCN", name = "a", descriptor = "(B)LLMGYBGQR;")
    public class30 method408(byte arg0) {
        class30 var2 = this.field1264;
        if (this.field1263 == var2) {
            this.field1264 = null;
            return null;
        }
        this.field1264 = var2.field1017;
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        return var2;
    }

    @OriginalMember(owner = "RKSMLTCN", name = "c", descriptor = "()I")
    public int method409() {
        int var1 = 0;
        for (class30 var2 = this.field1263.field1017; var2 != this.field1263; var2 = var2.field1017) {
            var1++;
        }
        return var1;
    }
}
