import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GOPFMRDJ")
public class class22 {

    @OriginalMember(owner = "GOPFMRDJ", name = "a", descriptor = "Z")
    private boolean field795 = false;

    @OriginalMember(owner = "GOPFMRDJ", name = "b", descriptor = "I")
    private int field796 = 628;

    @OriginalMember(owner = "GOPFMRDJ", name = "c", descriptor = "I")
    private int field797 = 7455;

    @OriginalMember(owner = "GOPFMRDJ", name = "d", descriptor = "B")
    private byte field798 = 55;

    @OriginalMember(owner = "GOPFMRDJ", name = "e", descriptor = "I")
    private int field799 = 49942;

    @OriginalMember(owner = "GOPFMRDJ", name = "h", descriptor = "LZAQWNGNJ;")
    private class70 field802 = new class70();

    @OriginalMember(owner = "GOPFMRDJ", name = "l", descriptor = "LLVGEETWD;")
    private class38 field806 = new class38((byte) 17);

    @OriginalMember(owner = "GOPFMRDJ", name = "i", descriptor = "I")
    private int field803;

    @OriginalMember(owner = "GOPFMRDJ", name = "j", descriptor = "I")
    private int field804;

    @OriginalMember(owner = "GOPFMRDJ", name = "k", descriptor = "LLVXNVCAS;")
    private class39 field805;

    @OriginalMember(owner = "GOPFMRDJ", name = "f", descriptor = "I")
    private int field800;

    @OriginalMember(owner = "GOPFMRDJ", name = "g", descriptor = "I")
    private int field801;

    @OriginalMember(owner = "GOPFMRDJ", name = "<init>", descriptor = "(II)V")
    public class22(int arg0, int arg1) {
        this.field803 = arg1;
        this.field804 = arg1;
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        this.field805 = new class39(true, 1024);
    }

    @OriginalMember(owner = "GOPFMRDJ", name = "a", descriptor = "(J)LZAQWNGNJ;")
    public class70 method220(long arg0) {
        class70 var3 = (class70) this.field805.method362(arg0);
        if (var3 == null) {
            this.field800++;
        } else {
            this.field806.method357(var3);
            this.field801++;
        }
        return var3;
    }

    @OriginalMember(owner = "GOPFMRDJ", name = "a", descriptor = "(JBLZAQWNGNJ;)V")
    public void method221(long arg0, byte arg1, class70 arg2) {
        if (this.field804 == 0) {
            class70 var5 = this.field806.method358();
            var5.method195();
            var5.method537();
            if (this.field802 == var5) {
                class70 var6 = this.field806.method358();
                var6.method195();
                var6.method537();
            }
        } else {
            this.field804--;
        }
        this.field805.method363(3, arg0, arg2);
        this.field806.method357(arg2);
        if (arg1 != 55) {
            this.field795 = !this.field795;
        } else if (class15.field717) {
        }
    }

    @OriginalMember(owner = "GOPFMRDJ", name = "a", descriptor = "()V")
    public void method222() {
        while (true) {
            class70 var1 = this.field806.method358();
            if (var1 == null) {
                this.field804 = this.field803;
                return;
            }
            var1.method195();
            var1.method537();
        }
    }
}
