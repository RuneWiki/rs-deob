import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class180 {

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public int field3576;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public int field3574;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public int field3577;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public int field3570;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "[I")
    public static int[] field3575 = new int[25];

    @OriginalMember(owner = "client!th", name = "d", descriptor = "Z")
    public static volatile boolean field3572 = true;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Lkb;")
    public static class93 field3571 = class76.method390(" Sekunde(Xn(Y -Ubertragen)3", 0);

    @OriginalMember(owner = "client!th", name = "e", descriptor = "Lnb;")
    public static class120 field3573 = new class120(5);

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)Lna;")
    public static final class119 method1178(int arg0) {
        field3569++;
        class119 var1 = new class119();
        var1.field2210 = class103.field1895;
        var1.field2207 = class133.field2557;
        var1.field2214 = class153.field2993[arg0];
        var1.field2212 = class100.field1844[0];
        var1.field2208 = class35.field577[0];
        var1.field2209 = class82.field1513[0];
        var1.field2213 = class189.field3700;
        var1.field2211 = class64.field1010[0];
        class206.method1340(-23557);
        return var1;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
    public static void method1179(int arg0) {
        field3571 = null;
        field3573 = null;
        field3575 = null;
        if (arg0 != 5) {
            method1178(-13);
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
    public class180() {
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lth;)V")
    public class180(class180 arg0) {
        this.field3576 = arg0.field3576;
        this.field3574 = arg0.field3574;
        this.field3577 = arg0.field3577;
        this.field3570 = arg0.field3570;
    }
}
