import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CZWVRQJW")
public class class4 {

    @OriginalMember(owner = "CZWVRQJW", name = "a", descriptor = "I")
    private int field522 = 7129;

    @OriginalMember(owner = "CZWVRQJW", name = "b", descriptor = "I")
    private int field523 = -25;

    @OriginalMember(owner = "CZWVRQJW", name = "e", descriptor = "LIYPTVTAD;")
    private class30 field526 = new class30();

    @OriginalMember(owner = "CZWVRQJW", name = "i", descriptor = "LDTFBSXNF;")
    private class9 field530 = new class9(false);

    @OriginalMember(owner = "CZWVRQJW", name = "f", descriptor = "I")
    private int field527;

    @OriginalMember(owner = "CZWVRQJW", name = "g", descriptor = "I")
    private int field528;

    @OriginalMember(owner = "CZWVRQJW", name = "h", descriptor = "LRXQASTJV;")
    private class49 field529;

    @OriginalMember(owner = "CZWVRQJW", name = "c", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "CZWVRQJW", name = "d", descriptor = "I")
    private int field525;

    @OriginalMember(owner = "CZWVRQJW", name = "<init>", descriptor = "(ZI)V")
    public class4(boolean arg0, int arg1) {
        this.field527 = arg1;
        this.field528 = arg1;
        this.field529 = new class49(1024, 0);
        if (arg0) {
            this.field522 = -9;
        }
    }

    @OriginalMember(owner = "CZWVRQJW", name = "a", descriptor = "(J)LIYPTVTAD;")
    public class30 method152(long arg0) {
        class30 var3 = (class30) this.field529.method508(arg0);
        if (var3 == null) {
            this.field524++;
        } else {
            this.field530.method209(var3);
            this.field525++;
        }
        return var3;
    }

    @OriginalMember(owner = "CZWVRQJW", name = "a", descriptor = "(LIYPTVTAD;ZJ)V")
    public void method153(class30 arg0, boolean arg1, long arg2) {
        if (!arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (this.field528 == 0) {
            class30 var6 = this.field530.method210();
            var6.method156();
            var6.method373();
            if (this.field526 == var6) {
                class30 var7 = this.field530.method210();
                var7.method156();
                var7.method373();
            }
        } else {
            this.field528--;
        }
        this.field529.method509(0, arg0, arg2);
        this.field530.method209(arg0);
    }

    @OriginalMember(owner = "CZWVRQJW", name = "a", descriptor = "()V")
    public void method154() {
        while (true) {
            class30 var1 = this.field530.method210();
            if (var1 == null) {
                this.field528 = this.field527;
                return;
            }
            var1.method156();
            var1.method373();
        }
    }
}
