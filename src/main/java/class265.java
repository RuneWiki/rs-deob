import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class265 extends class247 {

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "Z")
    public static boolean field4305 = false;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "Ljava/lang/String;")
    public static String field4306 = "red:";

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "Z")
    public static boolean field4294 = false;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
    public static int field4311 = -1;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "Ljava/lang/String;")
    public static String field4307 = "slide:";

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "[Lod;")
    public static class24[] field4304 = new class24[14];

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public int field4295;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public int field4296;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public int field4298;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public int field4299;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public int field4300;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public int field4301;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public int field4302;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public int field4303;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
    public int field4308;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
    public int field4309;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
    public int field4310;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
    public int field4312;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
    public static void method1852(boolean arg0) {
        field4307 = null;
        field4306 = null;
        if (!arg0) {
            field4305 = true;
        }
        field4304 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lvl;Z)V")
    public static final void method1853(class73 arg0, boolean arg1) {
        if (!arg1) {
            field4304 = null;
        }
        field4297++;
    }
}
