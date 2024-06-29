import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DSCQIAPU")
public class class8 {

    @OriginalMember(owner = "client!DSCQIAPU", name = "a", descriptor = "Z")
    private boolean field606 = true;

    @OriginalMember(owner = "client!DSCQIAPU", name = "d", descriptor = "LMCYIFIZT;")
    private class36 field609 = new class36();

    @OriginalMember(owner = "client!DSCQIAPU", name = "h", descriptor = "LEDMDOBNM;")
    private class10 field613 = new class10(0);

    @OriginalMember(owner = "client!DSCQIAPU", name = "e", descriptor = "I")
    private int field610;

    @OriginalMember(owner = "client!DSCQIAPU", name = "f", descriptor = "I")
    private int field611;

    @OriginalMember(owner = "client!DSCQIAPU", name = "g", descriptor = "LJJYRPNAX;")
    private class25 field612;

    @OriginalMember(owner = "client!DSCQIAPU", name = "b", descriptor = "I")
    private int field607;

    @OriginalMember(owner = "client!DSCQIAPU", name = "c", descriptor = "I")
    private int field608;

    @OriginalMember(owner = "client!DSCQIAPU", name = "<init>", descriptor = "(II)V")
    public class8(int arg0, int arg1) {
        this.field610 = arg1;
        this.field611 = arg1;
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        this.field612 = new class25(-952, 1024);
    }

    @OriginalMember(owner = "client!DSCQIAPU", name = "a", descriptor = "(J)LMCYIFIZT;")
    public class36 method179(long arg0) {
        class36 var3 = (class36) this.field612.method315(arg0);
        if (var3 == null) {
            this.field607++;
        } else {
            this.field613.method193(var3);
            this.field608++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!DSCQIAPU", name = "a", descriptor = "(ZLMCYIFIZT;J)V")
    public void method180(boolean arg0, class36 arg1, long arg2) {
        if (this.field611 == 0) {
            class36 var5 = this.field613.method194();
            var5.method327();
            var5.method380();
            if (this.field609 == var5) {
                class36 var6 = this.field613.method194();
                var6.method327();
                var6.method380();
            }
        } else {
            this.field611--;
        }
        this.field612.method316(arg1, false, arg2);
        this.field613.method193(arg1);
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!DSCQIAPU", name = "a", descriptor = "()V")
    public void method181() {
        while (true) {
            class36 var1 = this.field613.method194();
            if (var1 == null) {
                this.field611 = this.field610;
                return;
            }
            var1.method327();
            var1.method380();
        }
    }
}
