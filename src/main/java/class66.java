import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("WIUIWDML")
public class class66 {

    @OriginalMember(owner = "WIUIWDML", name = "a", descriptor = "I")
    private int field1552 = 635;

    @OriginalMember(owner = "WIUIWDML", name = "e", descriptor = "LOBKNBIRU;")
    private class40 field1556 = new class40();

    @OriginalMember(owner = "WIUIWDML", name = "i", descriptor = "LHIGYXWXY;")
    private class22 field1560 = new class22(field1553);

    @OriginalMember(owner = "WIUIWDML", name = "f", descriptor = "I")
    private int field1557;

    @OriginalMember(owner = "WIUIWDML", name = "g", descriptor = "I")
    private int field1558;

    @OriginalMember(owner = "WIUIWDML", name = "h", descriptor = "LLIHJZCBF;")
    private class31 field1559;

    @OriginalMember(owner = "WIUIWDML", name = "c", descriptor = "I")
    private int field1554;

    @OriginalMember(owner = "WIUIWDML", name = "d", descriptor = "I")
    private int field1555;

    @OriginalMember(owner = "WIUIWDML", name = "b", descriptor = "Z")
    private static boolean field1553;

    @OriginalMember(owner = "WIUIWDML", name = "<init>", descriptor = "(II)V")
    public class66(int arg0, int arg1) {
        this.field1557 = arg1;
        this.field1558 = arg1;
        while (arg0 >= 0) {
            field1553 = !field1553;
        }
        this.field1559 = new class31(1024, (byte) -5);
    }

    @OriginalMember(owner = "WIUIWDML", name = "a", descriptor = "(J)LOBKNBIRU;")
    public class40 method519(long arg0) {
        class40 var3 = (class40) this.field1559.method279(arg0);
        if (var3 == null) {
            this.field1554++;
        } else {
            this.field1560.method244(var3);
            this.field1555++;
        }
        return var3;
    }

    @OriginalMember(owner = "WIUIWDML", name = "a", descriptor = "(IJLOBKNBIRU;)V")
    public void method520(int arg0, long arg1, class40 arg2) {
        if (this.field1558 == 0) {
            class40 var5 = this.field1560.method245();
            var5.method254();
            var5.method312();
            if (this.field1556 == var5) {
                class40 var6 = this.field1560.method245();
                var6.method254();
                var6.method312();
            }
        } else {
            this.field1558--;
        }
        this.field1559.method280(arg2, arg1, -24089);
        int var7 = 78 / arg0;
        this.field1560.method244(arg2);
        if (class27.field922) {
        }
    }

    @OriginalMember(owner = "WIUIWDML", name = "a", descriptor = "()V")
    public void method521() {
        while (true) {
            class40 var1 = this.field1560.method245();
            if (var1 == null) {
                this.field1558 = this.field1557;
                return;
            }
            var1.method254();
            var1.method312();
        }
    }
}
