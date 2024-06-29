import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EQSIBNHW")
public class class10 {

    @OriginalMember(owner = "client!EQSIBNHW", name = "a", descriptor = "Z")
    private boolean field606 = false;

    @OriginalMember(owner = "client!EQSIBNHW", name = "b", descriptor = "I")
    private int field607 = -192;

    @OriginalMember(owner = "client!EQSIBNHW", name = "e", descriptor = "LAPQXVAYL;")
    private class2 field610 = new class2();

    @OriginalMember(owner = "client!EQSIBNHW", name = "i", descriptor = "LLKYWDMZN;")
    private class29 field614 = new class29(0);

    @OriginalMember(owner = "client!EQSIBNHW", name = "f", descriptor = "I")
    private int field611;

    @OriginalMember(owner = "client!EQSIBNHW", name = "g", descriptor = "I")
    private int field612;

    @OriginalMember(owner = "client!EQSIBNHW", name = "h", descriptor = "LOWFJUUFC;")
    private class40 field613;

    @OriginalMember(owner = "client!EQSIBNHW", name = "c", descriptor = "I")
    private int field608;

    @OriginalMember(owner = "client!EQSIBNHW", name = "d", descriptor = "I")
    private int field609;

    @OriginalMember(owner = "client!EQSIBNHW", name = "<init>", descriptor = "(II)V")
    public class10(int arg0, int arg1) {
        this.field611 = arg0;
        this.field612 = arg0;
        int var3 = 89 / arg1;
        this.field613 = new class40((byte) 5, 1024);
    }

    @OriginalMember(owner = "client!EQSIBNHW", name = "a", descriptor = "(J)LAPQXVAYL;")
    public class2 method175(long arg0) {
        class2 var3 = (class2) this.field613.method378(arg0);
        if (var3 == null) {
            this.field608++;
        } else {
            this.field614.method326(var3);
            this.field609++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!EQSIBNHW", name = "a", descriptor = "(IJLAPQXVAYL;)V")
    public void method176(int arg0, long arg1, class2 arg2) {
        int var5 = 30 / arg0;
        if (this.field612 == 0) {
            class2 var6 = this.field614.method327();
            var6.method331();
            var6.method4();
            if (this.field610 == var6) {
                class2 var7 = this.field614.method327();
                var7.method331();
                var7.method4();
            }
        } else {
            this.field612--;
        }
        this.field613.method379(arg1, arg2, 0);
        this.field614.method326(arg2);
    }

    @OriginalMember(owner = "client!EQSIBNHW", name = "a", descriptor = "()V")
    public void method177() {
        while (true) {
            class2 var1 = this.field614.method327();
            if (var1 == null) {
                this.field612 = this.field611;
                return;
            }
            var1.method331();
            var1.method4();
        }
    }
}
