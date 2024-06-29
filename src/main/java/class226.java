import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class226 extends InputStream {

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Lqd;")
    public static class40 field3740 = class147.method1106(" )2> <col=ffffff>", (byte) -83);

    @OriginalMember(owner = "client!k", name = "g", descriptor = "Lqd;")
    public static class40 field3742 = class147.method1106("Angreifen", (byte) -110);

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "[[S")
    public static short[][] field3738;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)V", line = 6)
    public static final void method1585(int arg0, int arg1) {
        if (arg1 >= -79) {
            method1587(102);
        }
        field3737++;
        class128.field2199.method1348(0, arg0);
    }

    @OriginalMember(owner = "client!k", name = "read", descriptor = "()I", line = 17)
    public final int read() {
        class160.method1227(30000L, false);
        field3739++;
        return -1;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(III)V", line = 31)
    public static final void method1586(int arg0, int arg1, int arg2) {
        int var3 = arg1;
        field3741++;
        if (arg1 > 25) {
            var3 = 25;
        }
        arg1--;
        int var4 = class71.field1266[arg1];
        int var5 = class308.field5169[arg1];
        if (arg0 == 0) {
            class19.field295.method1464(35, arg2 ^ 0xFFFFDC97);
            class19.field295.method218(var3 + var3 + 3, arg2 + -10849);
            class163.field2709++;
        }
        if (arg0 == 1) {
            class19.field295.method1464(75, 0);
            class45.field889++;
            class19.field295.method218(var3 + var3 + 3 + 14, arg2 ^ 0x6EA1);
        }
        if (arg2 != -9065) {
            field3742 = (class40) null;
        }
        if (arg0 == 2) {
            class19.field295.method1464(134, arg2 + 9065);
            class125.field2162++;
            class19.field295.method218(var3 + var3 + 3, arg2 + -10849);
        }
        class19.field295.method245((byte) 69, var5 + class263.field4407);
        class19.field295.method209(16711680, class196.field3152 + var4);
        class170.field2794 = class308.field5169[0];
        class185.field2985 = class71.field1266[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg1--;
            class19.field295.method246(class71.field1266[arg1] - var4, (byte) -123);
            class19.field295.method211(124, class308.field5169[arg1] - var5);
        }
        class19.field295.method194(class251.field4162[82] ? 1 : 0, arg2 + 9181);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 90)
    public static void method1587(int arg0) {
        field3738 = (short[][]) null;
        field3740 = null;
        field3742 = null;
        if (arg0 != 75) {
            field3738 = (short[][]) ((short[][]) null);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BII)V", line = 119)
    public static final void method1588(byte arg0, int arg1, int arg2) {
        class177 var3 = class177.method1310(arg0 + 60, 5, arg1);
        var3.method1302(-20040);
        var3.field2908 = arg2;
        if (arg0 != 56) {
            method1586(-33, -113, -69);
        }
        field3736++;
    }
}
