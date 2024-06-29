import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class253 {

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "Ljd;")
    public static class86 field4495 = class122.method868(":duelfriend:", true);

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "Ljd;")
    public static class86 field4502 = class122.method868("blinken3:", true);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field4494 = -1;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field4497 = 0;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field4505 = 0;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "Ljd;")
    public static class86 field4499 = class122.method868(")1 ", true);

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "Ljd;")
    public static class86 field4500 = class122.method868("<col=00ffff>", true);

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "J")
    public static long field4498;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Lek;")
    public static class159 field4496;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "Lea;")
    public static class37 field4504;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static void method1710(int arg0) {
        field4502 = null;
        field4495 = null;
        if (arg0 == 0) {
            field4504 = null;
            field4499 = null;
            field4500 = null;
            field4496 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)J")
    public static final synchronized long method1711(byte arg0) {
        field4506++;
        long var1 = System.currentTimeMillis();
        if (class185.field3287 > var1) {
            class209.field3782 += class185.field3287 - var1;
        }
        if (arg0 > -3) {
            field4496 = null;
        }
        class185.field3287 = var1;
        return var1 + class209.field3782;
    }
}
