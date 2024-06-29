import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class178 {

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field2832 = -1;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field2841 = 64;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field2840 = -1;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field2838 = 0;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public int field2830;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public int field2833;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public int field2836;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Lpk;")
    public static class120 field2831;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "[[[I")
    public static int[][][] field2837;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)Z", line = 4)
    public final boolean method1309(byte arg0) {
        field2843++;
        if (arg0 != 63) {
            field2838 = -85;
        }
        return (this.field2830 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 20)
    public static final void method1310(int arg0) {
        if (arg0 != 16) {
            method1314(-51);
        }
        field2839++;
        if (class255.field3765 != null) {
            class255.field3765.method2330(71);
        }
        if (class55.field837 != null) {
            class55.field837.method2330(127);
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)Z", line = 48)
    public final boolean method1311(int arg0) {
        if (arg0 != 30354) {
            method1314(-8);
        }
        field2842++;
        return (this.field2830 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)Z", line = 59)
    public final boolean method1312(int arg0) {
        if (arg0 != 0) {
            this.method1313((byte) -4);
        }
        field2835++;
        return (this.field2830 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)Z", line = 75)
    public final boolean method1313(byte arg0) {
        field2834++;
        if (arg0 < 71) {
            method1310(38);
        }
        return (this.field2830 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V", line = 92)
    public static void method1314(int arg0) {
        field2831 = null;
        field2837 = (int[][][]) null;
        if (arg0 > -27) {
            field2837 = (int[][][]) ((int[][][]) null);
        }
    }
}
