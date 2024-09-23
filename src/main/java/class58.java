import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TUCAQTOR")
public class class58 {

    @OriginalMember(owner = "TUCAQTOR", name = "a", descriptor = "I")
    private int field1488 = 3;

    @OriginalMember(owner = "TUCAQTOR", name = "e", descriptor = "LNTGUDCTQ;")
    private class37 field1492 = new class37();

    @OriginalMember(owner = "TUCAQTOR", name = "i", descriptor = "LMMJBXXXO;")
    private class36 field1496 = new class36(field1489);

    @OriginalMember(owner = "TUCAQTOR", name = "f", descriptor = "I")
    private int field1493;

    @OriginalMember(owner = "TUCAQTOR", name = "g", descriptor = "I")
    private int field1494;

    @OriginalMember(owner = "TUCAQTOR", name = "h", descriptor = "LWEZGVHTE;")
    private class64 field1495;

    @OriginalMember(owner = "TUCAQTOR", name = "c", descriptor = "I")
    private int field1490;

    @OriginalMember(owner = "TUCAQTOR", name = "d", descriptor = "I")
    private int field1491;

    @OriginalMember(owner = "TUCAQTOR", name = "b", descriptor = "Z")
    private static boolean field1489;

    @OriginalMember(owner = "TUCAQTOR", name = "<init>", descriptor = "(II)V")
    public class58(int arg0, int arg1) {
        this.field1493 = arg1;
        this.field1494 = arg1;
        this.field1495 = new class64(4, 1024);
        if (arg0 >= 0) {
            this.field1488 = -368;
        }
    }

    @OriginalMember(owner = "TUCAQTOR", name = "a", descriptor = "(J)LNTGUDCTQ;")
    public class37 method566(long arg0) {
        class37 var3 = (class37) this.field1495.method586(arg0);
        if (var3 == null) {
            this.field1490++;
        } else {
            this.field1496.method404(var3);
            this.field1491++;
        }
        return var3;
    }

    @OriginalMember(owner = "TUCAQTOR", name = "a", descriptor = "(ZLNTGUDCTQ;J)V")
    public void method567(boolean arg0, class37 arg1, long arg2) {
        if (this.field1494 == 0) {
            class37 var5 = this.field1496.method405();
            var5.method1();
            var5.method409();
            if (this.field1492 == var5) {
                class37 var6 = this.field1496.method405();
                var6.method1();
                var6.method409();
            }
        } else {
            this.field1494--;
        }
        this.field1495.method587(661, arg1, arg2);
        if (arg0) {
            this.field1496.method404(arg1);
        }
    }

    @OriginalMember(owner = "TUCAQTOR", name = "a", descriptor = "()V")
    public void method568() {
        while (true) {
            class37 var1 = this.field1496.method405();
            if (var1 == null) {
                this.field1494 = this.field1493;
                return;
            }
            var1.method1();
            var1.method409();
        }
    }
}
