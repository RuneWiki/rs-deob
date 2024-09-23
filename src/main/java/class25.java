import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HPFNYARJ")
public class class25 {

    @OriginalMember(owner = "HPFNYARJ", name = "b", descriptor = "Z")
    private boolean field879 = true;

    @OriginalMember(owner = "HPFNYARJ", name = "c", descriptor = "I")
    private int field880 = -838;

    @OriginalMember(owner = "HPFNYARJ", name = "f", descriptor = "LEEYSIGWL;")
    private class14 field883 = new class14();

    @OriginalMember(owner = "HPFNYARJ", name = "j", descriptor = "LEOXICPMP;")
    private class16 field887 = new class16(true);

    @OriginalMember(owner = "HPFNYARJ", name = "g", descriptor = "I")
    private int field884;

    @OriginalMember(owner = "HPFNYARJ", name = "h", descriptor = "I")
    private int field885;

    @OriginalMember(owner = "HPFNYARJ", name = "i", descriptor = "LECQQOXBD;")
    private class12 field886;

    @OriginalMember(owner = "HPFNYARJ", name = "a", descriptor = "I")
    private int field878;

    @OriginalMember(owner = "HPFNYARJ", name = "d", descriptor = "I")
    private int field881;

    @OriginalMember(owner = "HPFNYARJ", name = "e", descriptor = "I")
    private int field882;

    @OriginalMember(owner = "HPFNYARJ", name = "<init>", descriptor = "(BI)V")
    public class25(byte arg0, int arg1) {
        this.field884 = arg1;
        this.field885 = arg1;
        this.field886 = new class12(1024, 167);
        if (arg0 != 41) {
            this.field878 = 310;
        }
    }

    @OriginalMember(owner = "HPFNYARJ", name = "a", descriptor = "(J)LEEYSIGWL;")
    public class14 method302(long arg0) {
        class14 var3 = (class14) this.field886.method209(arg0);
        if (var3 == null) {
            this.field881++;
        } else {
            this.field887.method219(var3);
            this.field882++;
        }
        return var3;
    }

    @OriginalMember(owner = "HPFNYARJ", name = "a", descriptor = "(JILEEYSIGWL;)V")
    public void method303(long arg0, int arg1, class14 arg2) {
        if (this.field885 == 0) {
            class14 var5 = this.field887.method220();
            var5.method471();
            var5.method215();
            if (this.field883 == var5) {
                class14 var6 = this.field887.method220();
                var6.method471();
                var6.method215();
            }
        } else {
            this.field885--;
        }
        this.field886.method210(arg0, arg2, true);
        this.field887.method219(arg2);
        if (arg1 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "HPFNYARJ", name = "a", descriptor = "()V")
    public void method304() {
        while (true) {
            class14 var1 = this.field887.method220();
            if (var1 == null) {
                this.field885 = this.field884;
                return;
            }
            var1.method471();
            var1.method215();
        }
    }
}
