import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YFWIPPMU")
public class class68 {

    @OriginalMember(owner = "client!YFWIPPMU", name = "a", descriptor = "I")
    private int field1711 = -142;

    @OriginalMember(owner = "client!YFWIPPMU", name = "b", descriptor = "Z")
    private boolean field1712 = false;

    @OriginalMember(owner = "client!YFWIPPMU", name = "c", descriptor = "Z")
    private boolean field1713 = true;

    @OriginalMember(owner = "client!YFWIPPMU", name = "d", descriptor = "I")
    private int field1714;

    @OriginalMember(owner = "client!YFWIPPMU", name = "e", descriptor = "[LKMUPFLXI;")
    private class27[] field1715;

    @OriginalMember(owner = "client!YFWIPPMU", name = "<init>", descriptor = "(IB)V")
    public class68(int arg0, byte arg1) {
        this.field1714 = arg0;
        this.field1715 = new class27[arg0];
        if (arg1 == 6) {
            boolean var3 = false;
        } else {
            this.field1711 = -230;
        }
        for (int var4 = 0; var4 < arg0; var4++) {
            class27 var5 = this.field1715[var4] = new class27();
            var5.field952 = var5;
            var5.field953 = var5;
        }
    }

    @OriginalMember(owner = "client!YFWIPPMU", name = "a", descriptor = "(J)LKMUPFLXI;")
    public class27 method582(long arg0) {
        class27 var3 = this.field1715[(int) (arg0 & (long) (this.field1714 - 1))];
        for (class27 var4 = var3.field952; var4 != var3; var4 = var4.field952) {
            if (var4.field951 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!YFWIPPMU", name = "a", descriptor = "(IJLKMUPFLXI;)V")
    public void method583(int arg0, long arg1, class27 arg2) {
        if (arg2.field953 != null) {
            arg2.method272();
        }
        class27 var5 = this.field1715[(int) (arg1 & (long) (this.field1714 - 1))];
        arg2.field953 = var5.field953;
        arg2.field952 = var5;
        if (arg0 != 0) {
            this.field1713 = !this.field1713;
        }
        arg2.field953.field952 = arg2;
        arg2.field952.field953 = arg2;
        arg2.field951 = arg1;
    }
}
