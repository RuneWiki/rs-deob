import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class175 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field2250 = 1400;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field2258 = 0;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public int field2252;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public int field2255;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public int field2256;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public int field2257;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    public int field2259;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public int field2260;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public int field2261;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "[B")
    public byte[] field2253;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "[B")
    public byte[] field2262;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)Ltd;", line = 3)
    public static final class317 method1025(byte arg0, int arg1) {
        field2251++;
        class317[] var2 = class472.method2879(arg0 ^ 0x1C);
        if (arg0 != 46) {
            method1025((byte) 33, 20);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class317 var4 = var2[var3];
            if (var4.field4239 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZII)V", line = 44)
    public static final void method1026(boolean arg0, int arg1, int arg2) {
        field2254++;
        class184 var3 = class277.method1682(0, 15, -70);
        var3.method1069(arg0);
        var3.field2392 = arg1;
        var3.field2393 = arg2;
    }
}
