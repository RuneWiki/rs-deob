import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class116 extends class115 {

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    public volatile int field1747 = -1;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "Ljava/lang/String;")
    public volatile String field1744;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "Z")
    public static boolean field1742 = false;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "Z")
    public static boolean field1745 = true;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "Z")
    public static boolean field1748 = false;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "Z")
    public static boolean field1749;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILea;Lea;)V", line = 7)
    public static final void method877(int arg0, class115 arg1, class115 arg2) {
        field1750++;
        if (arg1.field1736 != null) {
            arg1.method876((byte) -96);
        }
        arg1.field1736 = arg2.field1736;
        arg1.field1741 = arg2;
        arg1.field1736.field1741 = arg1;
        arg1.field1741.field1736 = arg1;
        if (arg0 > -94) {
            method877(39, null, null);
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 64)
    public class116(String arg0) {
        this.field1744 = arg0;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lvi;I)V", line = 37)
    public static final void method878(class480 arg0, int arg1) {
        if (arg1 != -1) {
            field1742 = true;
        }
        field1746++;
        class203 var2 = (class203) class22.field323.method3059(122, (long) arg0.field6015);
        if (var2 == null) {
            return;
        }
        if (var2.field2959 != null) {
            class176.field2598.method2372(var2.field2959);
            var2.field2959 = null;
        }
        var2.method876((byte) -96);
    }
}
