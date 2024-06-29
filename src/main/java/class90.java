import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class90 {

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field1229 = 0;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field1228 = 1;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field1231 = 0;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lbc;Z)Z")
    public static final boolean method547(class282 arg0, boolean arg1) {
        if (arg1) {
            field1229 = 29;
        }
        field1230++;
        return arg0.method1842(class159.field2304, -5012);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static final void method548(int arg0) {
        field1227++;
        int var1 = class221.method1439(arg0 + 20452);
        if (var1 == 0) {
            class197.field2806 = null;
            class59.method363(1, 0);
        } else if (var1 == 1) {
            class15.method92((byte) 0, -90);
            class59.method363(1, 512);
            if (class241.field3507 != null) {
                class51.method308(false);
            }
        } else {
            class15.method92((byte) (class241.field3505 - 4 & 0xFF), -70);
            class59.method363(arg0 ^ 0x367, 2);
        }
        if (arg0 != 870) {
            field1229 = 63;
        }
    }
}
