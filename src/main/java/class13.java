import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class13 extends class70 {

    @OriginalMember(owner = "client!c", name = "I", descriptor = "I")
    public int field247 = -1;

    @OriginalMember(owner = "client!c", name = "X", descriptor = "I")
    public int field260 = 0;

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "Lfe;")
    public static class36 field254 = new class36(50);

    @OriginalMember(owner = "client!c", name = "W", descriptor = "I")
    public static int field259 = 0;

    @OriginalMember(owner = "client!c", name = "Y", descriptor = "Llc;")
    public static class69 field261 = class69.method470((byte) -116, "Use ");

    @OriginalMember(owner = "client!c", name = "V", descriptor = "Llc;")
    public static class69 field258 = class69.method470((byte) -96, "Your ignore list is full)3 Max of 100 hit");

    @OriginalMember(owner = "client!c", name = "bb", descriptor = "Z")
    public static boolean field264 = false;

    @OriginalMember(owner = "client!c", name = "db", descriptor = "Llc;")
    public static class69 field266 = class69.method470((byte) -110, "@or3@");

    @OriginalMember(owner = "client!c", name = "Z", descriptor = "Llc;")
    public static class69 field262 = class69.method470((byte) -122, "To switch to a members)2only world:*6n1(Y Logout and return to the world selection page)3*6n2(Y Choose one of the members world with a gold star next to it(Ws name)3*6n*6nIf you prefer you can continue to use this world)1*6nbut members only features will be unavailable here)3");

    @OriginalMember(owner = "client!c", name = "fb", descriptor = "Llc;")
    private static class69 field268 = class69.method470((byte) -112, "Members object");

    @OriginalMember(owner = "client!c", name = "gb", descriptor = "I")
    public static int field269 = -1;

    @OriginalMember(owner = "client!c", name = "ab", descriptor = "Llc;")
    public static class69 field263 = field268;

    @OriginalMember(owner = "client!c", name = "C", descriptor = "I")
    public int field241;

    @OriginalMember(owner = "client!c", name = "D", descriptor = "I")
    public int field242;

    @OriginalMember(owner = "client!c", name = "E", descriptor = "I")
    public int field243;

    @OriginalMember(owner = "client!c", name = "F", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!c", name = "G", descriptor = "I")
    public int field245;

    @OriginalMember(owner = "client!c", name = "H", descriptor = "I")
    public int field246;

    @OriginalMember(owner = "client!c", name = "J", descriptor = "I")
    public int field248;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!c", name = "L", descriptor = "I")
    public int field250;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "I")
    public int field251;

    @OriginalMember(owner = "client!c", name = "O", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!c", name = "P", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!c", name = "S", descriptor = "I")
    public int field255;

    @OriginalMember(owner = "client!c", name = "T", descriptor = "I")
    public int field256;

    @OriginalMember(owner = "client!c", name = "U", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!c", name = "eb", descriptor = "Lcb;")
    public static class15 field267;

    @OriginalMember(owner = "client!c", name = "cb", descriptor = "[Lda;")
    public static class20[] field265;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V")
    public static void method70(int arg0) {
        field254 = null;
        field268 = null;
        field266 = null;
        if (arg0 != -1) {
            method70(-8);
        }
        field262 = null;
        field258 = null;
        field265 = null;
        field263 = null;
        field267 = null;
        field261 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Llc;")
    public static final class69 method71(int arg0, int arg1) {
        if (arg1 != 23890) {
            method71(66, -122);
        }
        field252++;
        return arg0 < 999999999 ? class106.method791(arg0, (byte) -80) : client.field406;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)V")
    public static final void method72(boolean arg0) {
        if (arg0) {
            method72(false);
        }
        if (class69.field1526 != null) {
            class76 var1 = class69.field1526;
            synchronized (class69.field1526) {
                class69.field1526 = null;
            }
        }
        field253++;
    }
}
