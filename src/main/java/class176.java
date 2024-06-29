import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class176 extends class110 {

    @OriginalMember(owner = "client!sf", name = "ab", descriptor = "[I")
    public static int[] field3588 = new int[32];

    @OriginalMember(owner = "client!sf", name = "fb", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!sf", name = "db", descriptor = "Ldd;")
    public static class35 field3591;

    @OriginalMember(owner = "client!sf", name = "lb", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!sf", name = "jb", descriptor = "Ldd;")
    public static class35 field3597;

    @OriginalMember(owner = "client!sf", name = "mb", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!sf", name = "hb", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!sf", name = "eb", descriptor = "Ldd;")
    private static class35 field3592;

    @OriginalMember(owner = "client!sf", name = "gb", descriptor = "Ldd;")
    public static class35 field3594;

    @OriginalMember(owner = "client!sf", name = "Y", descriptor = "I")
    public int field3586;

    @OriginalMember(owner = "client!sf", name = "Z", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!sf", name = "bb", descriptor = "I")
    public int field3589;

    @OriginalMember(owner = "client!sf", name = "cb", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!sf", name = "ib", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!sf", name = "kb", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
    public static void method1172(boolean arg0) {
        field3591 = null;
        field3597 = null;
        if (arg0) {
            field3592 = null;
        }
        field3594 = null;
        field3588 = null;
        field3592 = null;
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(B)Lia;")
    public final class81 method205(byte arg0) {
        if (arg0 == -115) {
            field3587++;
            return class207.method1370((byte) -73, this.field3586).method413(this.field3589, 0, (byte) -124, null);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(B)V")
    public static final void method1173(byte arg0) {
        class207.field4121 = -1;
        field3598++;
        class34.field702 = 0;
        class13.field231 = -1;
        class161.field3272 = 0;
        class55.field1352 = 0;
        class52.field1166 = false;
        class20.field385 = 0;
        class113.field2532 = -1;
        class1.field11.field527 = 0;
        class113.field2534 = -1;
        class101.field2224 = 0;
        class172.field3441.field527 = 0;
        class59.field1469 = 0;
        for (int var1 = 0; var1 < class51.field1154.length; var1++) {
            if (class51.field1154[var1] != null) {
                class51.field1154[var1].field1636 = -1;
            }
        }
        for (int var2 = 0; var2 < class204.field4058.length; var2++) {
            if (class204.field4058[var2] != null) {
                class204.field4058[var2].field1636 = -1;
            }
        }
        class90.method658((byte) -93);
        if (arg0 != -80) {
            field3590 = -121;
        }
        class59.method509(30, (byte) 126);
        for (int var3 = 0; var3 < 100; var3++) {
            class158.field3228[var3] = true;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3588[var1] = var0 - 1;
            var0 += var0;
        }
        field3593 = 0;
        field3591 = class180.method1196((byte) -12, " GMT");
        field3599 = (int) (Math.random() * 33.0D) - 16;
        field3597 = class180.method1196((byte) 126, ":chalreq:");
        field3600 = -1;
        field3595 = 10;
        field3592 = class180.method1196((byte) 126, "Login limit exceeded)3");
        field3594 = field3592;
    }
}
