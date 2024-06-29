import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class130 {

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field2268 = -1;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field2255 = -1;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "Lhi;")
    public static class82 field2261 = class95.method664((byte) -30, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "Lhi;")
    public static class82 field2266 = class95.method664((byte) -26, "tremblement:");

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field2263 = 0;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public int field2260;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public int field2262;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public int field2269;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "Lum;")
    public static class222 field2264;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "Lum;")
    public static class222 field2265;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "Lvm;")
    public static class302 field2259;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V", line = 8)
    public static void method901(byte arg0) {
        field2265 = null;
        field2259 = null;
        field2264 = null;
        if (arg0 != -121) {
            field2265 = (class222) null;
        }
        field2266 = null;
        field2261 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lbc;B)V", line = 36)
    public final void method902(class153 arg0, byte arg1) {
        if (arg1 != -112) {
            method904(127, (byte) -76);
        }
        field2267++;
        while (true) {
            int var3 = arg0.method1082(-125);
            if (var3 == 0) {
                return;
            }
            this.method905((byte) 104, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BII)V", line = 68)
    public static final void method903(byte arg0, int arg1, int arg2) {
        field2256++;
        int var3 = -44 % ((arg0 - 34) / 55);
        class227 var4 = class215.method1531(-1, 1, arg1);
        var4.method1616(64);
        var4.field3923 = arg2;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IB)V", line = 96)
    public static final void method904(int arg0, byte arg1) {
        if (arg1 != -12) {
            method901((byte) -39);
        }
        class227 var2 = class215.method1531(-1, 1, arg0);
        field2257++;
        var2.method1624((byte) -101);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BILbc;)V", line = 114)
    private final void method905(byte arg0, int arg1, class153 arg2) {
        if (arg0 <= 26) {
            field2266 = (class82) null;
        }
        field2258++;
        if (arg1 == 1) {
            this.field2260 = arg2.method1090(false);
            this.field2269 = arg2.method1082(-51);
            this.field2262 = arg2.method1082(-124);
        }
    }
}
