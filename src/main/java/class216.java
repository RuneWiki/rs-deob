import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class216 extends class103 {

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    public int field3692;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "J")
    public static long field3691 = 0L;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "Lda;")
    public static class275 field3689 = class255.method1672(100, "T");

    @OriginalMember(owner = "client!l", name = "u", descriptor = "Lda;")
    public static class275 field3694 = class255.method1672(126, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!l", name = "t", descriptor = "Lda;")
    public static class275 field3693 = class103.method738(160, (byte) -122);

    @OriginalMember(owner = "client!l", name = "w", descriptor = "Lrg;")
    public static class84 field3696 = new class84();

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II)Lqf;")
    public static final class74 method1392(int arg0, int arg1) {
        if (arg1 != 29436) {
            field3689 = null;
        }
        field3695++;
        class74 var2 = (class74) class69.field1114.method252(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class246.field4339.method775(class220.method1412(arg0, (byte) -86), class230.method1494(arg0, 112), -24799);
        class74 var4 = new class74();
        if (var3 != null) {
            var4.method488(7490, new class85(var3));
        }
        class69.field1114.method251(var4, (byte) -119, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
    public static void method1393(boolean arg0) {
        field3689 = null;
        if (!arg0) {
            field3696 = null;
            field3693 = null;
            field3694 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
    public class216() {
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)Lij;")
    public static final class85 method1394(int arg0) {
        class85 var1 = new class85(30);
        field3690++;
        var1.method575((byte) 127, 7);
        var1.method575((byte) 124, class193.field3325);
        if (arg0 != 0) {
            method1394(-87);
        }
        var1.method575((byte) 127, class48.field798 ? 1 : 0);
        var1.method575((byte) 124, class66.field1080 ? 1 : 0);
        var1.method575((byte) 126, class77.field1284 ? 1 : 0);
        var1.method575((byte) 125, class29.field447 ? 1 : 0);
        var1.method575((byte) 127, class76.field1257 ? 1 : 0);
        var1.method575((byte) 126, class32.field483 ? 1 : 0);
        var1.method575((byte) 125, class250.field4425 ? 1 : 0);
        var1.method575((byte) 125, class163.field2845 ? 1 : 0);
        var1.method575((byte) 125, class240.field4219);
        var1.method575((byte) 125, class155.field2695 ? 1 : 0);
        var1.method575((byte) 126, class104.field1759 ? 1 : 0);
        var1.method575((byte) 127, class153.field2674 ? 1 : 0);
        var1.method575((byte) 127, class73.field1189);
        var1.method575((byte) 124, class225.field3810 ? 1 : 0);
        var1.method575((byte) 124, class61.field1019);
        var1.method575((byte) 127, class90.field1531);
        var1.method575((byte) 127, class173.field3006);
        var1.method600(class207.field3503, (byte) 81);
        var1.method600(class60.field1009, (byte) 127);
        var1.method575((byte) 126, 2);
        var1.method586(-123, class4.field62);
        var1.method575((byte) 125, class73.field1198);
        var1.method575((byte) 124, class249.field4406 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(I)V")
    public class216(int arg0) {
        this.field3692 = arg0;
    }
}
