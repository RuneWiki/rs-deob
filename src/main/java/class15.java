import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DSMCVRKW")
public class class15 {

    @OriginalMember(owner = "DSMCVRKW", name = "a", descriptor = "Z")
    private boolean field740 = true;

    @OriginalMember(owner = "DSMCVRKW", name = "d", descriptor = "LBIJRHVKA;")
    private class8 field743 = new class8();

    @OriginalMember(owner = "DSMCVRKW", name = "h", descriptor = "LUMTLOYSA;")
    private class60 field747 = new class60((byte) 6);

    @OriginalMember(owner = "DSMCVRKW", name = "e", descriptor = "I")
    private int field744;

    @OriginalMember(owner = "DSMCVRKW", name = "f", descriptor = "I")
    private int field745;

    @OriginalMember(owner = "DSMCVRKW", name = "g", descriptor = "LHWTUYSNT;")
    private class24 field746;

    @OriginalMember(owner = "DSMCVRKW", name = "b", descriptor = "I")
    private int field741;

    @OriginalMember(owner = "DSMCVRKW", name = "c", descriptor = "I")
    private int field742;

    @OriginalMember(owner = "DSMCVRKW", name = "<init>", descriptor = "(BI)V")
    public class15(byte arg0, int arg1) {
        if (arg0 != 7) {
            this.field740 = !this.field740;
        }
        this.field744 = arg1;
        this.field745 = arg1;
        this.field746 = new class24(1024, 564);
    }

    @OriginalMember(owner = "DSMCVRKW", name = "a", descriptor = "(J)LBIJRHVKA;")
    public class8 method197(long arg0) {
        class8 var3 = (class8) this.field746.method303(arg0);
        if (var3 == null) {
            this.field741++;
        } else {
            this.field747.method466(var3);
            this.field742++;
        }
        return var3;
    }

    @OriginalMember(owner = "DSMCVRKW", name = "a", descriptor = "(BJLBIJRHVKA;)V")
    public void method198(byte arg0, long arg1, class8 arg2) {
        if (arg0 != 7) {
            return;
        }
        boolean var5 = false;
        if (this.field745 == 0) {
            class8 var6 = this.field747.method467();
            var6.method334();
            var6.method35();
            if (this.field743 == var6) {
                class8 var7 = this.field747.method467();
                var7.method334();
                var7.method35();
            }
        } else {
            this.field745--;
        }
        this.field746.method304(-782, arg1, arg2);
        this.field747.method466(arg2);
    }

    @OriginalMember(owner = "DSMCVRKW", name = "a", descriptor = "()V")
    public void method199() {
        while (true) {
            class8 var1 = this.field747.method467();
            if (var1 == null) {
                this.field745 = this.field744;
                return;
            }
            var1.method334();
            var1.method35();
        }
    }
}
