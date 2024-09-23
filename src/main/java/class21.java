import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ISXEOURU")
public class class21 {

    @OriginalMember(owner = "ISXEOURU", name = "a", descriptor = "Z")
    private boolean field892 = true;

    @OriginalMember(owner = "ISXEOURU", name = "b", descriptor = "I")
    private int field893 = -44873;

    @OriginalMember(owner = "ISXEOURU", name = "e", descriptor = "LCJDGAOKT;")
    private class6 field896 = new class6();

    @OriginalMember(owner = "ISXEOURU", name = "i", descriptor = "LLOPREVUC;")
    private class28 field900 = new class28(719);

    @OriginalMember(owner = "ISXEOURU", name = "f", descriptor = "I")
    private int field897;

    @OriginalMember(owner = "ISXEOURU", name = "g", descriptor = "I")
    private int field898;

    @OriginalMember(owner = "ISXEOURU", name = "h", descriptor = "LYDSZUOCR;")
    private class64 field899;

    @OriginalMember(owner = "ISXEOURU", name = "c", descriptor = "I")
    private int field894;

    @OriginalMember(owner = "ISXEOURU", name = "d", descriptor = "I")
    private int field895;

    @OriginalMember(owner = "ISXEOURU", name = "<init>", descriptor = "(II)V")
    public class21(int arg0, int arg1) {
        if (arg0 != -15730) {
            this.field892 = !this.field892;
        }
        this.field897 = arg1;
        this.field898 = arg1;
        this.field899 = new class64(908, 1024);
    }

    @OriginalMember(owner = "ISXEOURU", name = "a", descriptor = "(J)LCJDGAOKT;")
    public class6 method228(long arg0) {
        class6 var3 = (class6) this.field899.method518(arg0);
        if (var3 == null) {
            this.field894++;
        } else {
            this.field900.method259(var3);
            this.field895++;
        }
        return var3;
    }

    @OriginalMember(owner = "ISXEOURU", name = "a", descriptor = "(IJLCJDGAOKT;)V")
    public void method229(int arg0, long arg1, class6 arg2) {
        if (this.field898 == 0) {
            class6 var5 = this.field900.method260();
            var5.method591();
            var5.method37();
            if (this.field896 == var5) {
                class6 var6 = this.field900.method260();
                var6.method591();
                var6.method37();
            }
        } else {
            this.field898--;
        }
        this.field899.method519(true, arg2, arg1);
        if (arg0 != 15631) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        this.field900.method259(arg2);
    }

    @OriginalMember(owner = "ISXEOURU", name = "a", descriptor = "()V")
    public void method230() {
        while (true) {
            class6 var1 = this.field900.method260();
            if (var1 == null) {
                this.field898 = this.field897;
                return;
            }
            var1.method591();
            var1.method37();
        }
    }
}
