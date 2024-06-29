import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class245 {

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "Lvh;")
    public static class252 field4249 = new class252();

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "Ldf;")
    public static class51 field4250 = class46.method233("welle:", 100);

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "I")
    public static int field4253 = 0;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "Ldf;")
    private static class51 field4258 = class46.method233("cyan:", 100);

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "Ldf;")
    public static class51 field4255 = field4258;

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "Ldf;")
    public static class51 field4256 = field4258;

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "S")
    public static short field4257 = 32767;

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "J")
    public static volatile long field4259 = 0L;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public int field4231;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public int field4233;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public int field4234;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public int field4235;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public int field4236;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public int field4238;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public int field4239;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public int field4240;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public int field4241;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    public int field4242;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public int field4243;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public int field4244;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    public int field4245;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
    public int field4246;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public int field4247;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
    public int field4248;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
    public int field4251;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
    public int field4254;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static void method1669(int arg0) {
        field4258 = null;
        field4249 = null;
        field4256 = null;
        field4250 = null;
        field4255 = null;
        if (arg0 != 14856) {
            method1669(41);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V")
    public static final void method1670(int arg0, int arg1) {
        field4232++;
        class3.field16 = -1;
        if (arg0 != 5582) {
            return;
        }
        class3.field16 = -1;
        if (arg1 == 37) {
            class207.field3454 = 3.0F;
        } else if (arg1 == 50) {
            class207.field3454 = 4.0F;
        } else if (arg1 == 75) {
            class207.field3454 = 6.0F;
        } else {
            class207.field3454 = 8.0F;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjd;)V")
    public static final void method1671(int arg0, class83 arg1) {
        field4237++;
        if (arg0 != -12011) {
            method1669(1);
        }
        for (class93 var2 = (class93) class179.field2958.method1720(true); var2 != null; var2 = (class93) class179.field2958.method1712((byte) 112)) {
            if (var2.field1542 == arg1) {
                if (var2.field1552 != null) {
                    class166.field2709.method488(var2.field1552);
                    var2.field1552 = null;
                }
                var2.method764((byte) -76);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lu;III)[Ljg;")
    public static final class158[] method1672(class111 arg0, int arg1, int arg2, int arg3) {
        field4230++;
        if (arg1 != -29433) {
            field4250 = null;
        }
        return class69.method480(arg3, 57, arg2, arg0) ? class153.method1105((byte) -104) : null;
    }
}
