import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public abstract class class63 extends class309 {

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "Z")
    public static boolean field832 = false;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public static int field833 = -1;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public static int field838 = 100;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public int field828;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public int field829;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    public int field837;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "Z")
    public boolean field827;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(B)Z", line = 3)
    public final boolean method34(byte arg0) {
        int var2 = 125 / ((-arg0 - 19) / 44);
        field834++;
        return false;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lfp;Lje;ZIIII)V", line = 13)
    public final void method32(class9 arg0, class309 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field836++;
        if (arg5 <= -31) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V", line = 24)
    public static final void method469(boolean arg0) {
        field839++;
        if (class451.field6664.length() == 0) {
            return;
        }
        class419.method2593(30444, "--> " + class451.field6664);
        class451.method2804(114, arg0, class451.field6664);
        class345.field5079 = 0;
        class432.field6300 = 0;
        class451.field6664 = "";
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)V", line = 40)
    public final void method33(int arg0) {
        if (arg0 >= 109) {
            field831++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lfc;II)V", line = 55)
    public static final void method470(class199 arg0, int arg1, int arg2) {
        field835++;
        if (class455.field6729) {
            arg2 = 0;
            class455.field6729 = false;
        }
        if (class55.field673 == null || !class55.field673.method1379(arg0, arg1 - 1474)) {
            class55.field673 = arg0;
            class262.field3867 = class43.method364(-16756);
            field833 = arg2;
            class281.field4124 = arg2;
            if (class281.field4124 == 0) {
                class171.method1109((byte) -102);
            } else {
                class202.field2846 = class432.field6296;
                class15.field240 = class148.field2018;
                class247.field3633 = class317.field4656;
                class299.field4359 = class42.field570;
                class368.field5314 = class184.field2598;
                class169.field2216 = class294.field4275;
                class401.field5796 = class166.field2194;
                class289.field4228 = class289.field4235;
                class51.field644 = class157.field2121;
                class288.field4227 = class288.field4223;
            }
        }
        if (arg1 != 1490) {
            field832 = false;
        }
    }
}
