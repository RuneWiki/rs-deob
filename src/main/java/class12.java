import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ECXUVDNP")
public class class12 {

    @OriginalMember(owner = "ECXUVDNP", name = "c", descriptor = "LYLJOEYBF;")
    private class68 field658 = new class68();

    @OriginalMember(owner = "ECXUVDNP", name = "g", descriptor = "LSYRXWHZM;")
    private class51 field662 = new class51(false);

    @OriginalMember(owner = "ECXUVDNP", name = "d", descriptor = "I")
    private int field659;

    @OriginalMember(owner = "ECXUVDNP", name = "e", descriptor = "I")
    private int field660;

    @OriginalMember(owner = "ECXUVDNP", name = "f", descriptor = "LHZUGKGVT;")
    private class21 field661;

    @OriginalMember(owner = "ECXUVDNP", name = "a", descriptor = "I")
    private int field656;

    @OriginalMember(owner = "ECXUVDNP", name = "b", descriptor = "I")
    private int field657;

    @OriginalMember(owner = "ECXUVDNP", name = "<init>", descriptor = "(II)V")
    public class12(int arg0, int arg1) {
        this.field659 = arg1;
        this.field660 = arg1;
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field661 = new class21(true, 1024);
    }

    @OriginalMember(owner = "ECXUVDNP", name = "a", descriptor = "(J)LYLJOEYBF;")
    public class68 method221(long arg0) {
        class68 var3 = (class68) this.field661.method248(arg0);
        if (var3 == null) {
            this.field656++;
        } else {
            this.field662.method481(var3);
            this.field657++;
        }
        return var3;
    }

    @OriginalMember(owner = "ECXUVDNP", name = "a", descriptor = "(JLYLJOEYBF;I)V")
    public void method222(long arg0, class68 arg1, int arg2) {
        if (arg2 != -17668) {
            return;
        }
        if (this.field660 == 0) {
            class68 var5 = this.field662.method482();
            var5.method492();
            var5.method545();
            if (this.field658 == var5) {
                class68 var6 = this.field662.method482();
                var6.method492();
                var6.method545();
            }
        } else {
            this.field660--;
        }
        this.field661.method249(arg0, false, arg1);
        this.field662.method481(arg1);
    }

    @OriginalMember(owner = "ECXUVDNP", name = "a", descriptor = "()V")
    public void method223() {
        while (true) {
            class68 var1 = this.field662.method482();
            if (var1 == null) {
                this.field660 = this.field659;
                return;
            }
            var1.method492();
            var1.method545();
        }
    }
}
