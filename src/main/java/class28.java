import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class28 {

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public int field734 = 0;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    public int field745 = 0;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "Llb;")
    public static class78 field747 = new class78();

    @OriginalMember(owner = "client!df", name = "q", descriptor = "Lod;")
    private static class101 field749 = class46.method335(113, "Loaded title screen");

    @OriginalMember(owner = "client!df", name = "t", descriptor = "Lod;")
    public static class101 field752 = field749;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "Lod;")
    private static class101 field756 = class46.method335(88, "Loaded sprites");

    @OriginalMember(owner = "client!df", name = "z", descriptor = "Lod;")
    public static class101 field758 = field756;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public static int field750 = 0;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "[Z")
    public static boolean[] field753 = new boolean[112];

    @OriginalMember(owner = "client!df", name = "v", descriptor = "[[I")
    public static int[][] field754 = new int[104][104];

    @OriginalMember(owner = "client!df", name = "w", descriptor = "[I")
    public static int[] field755 = new int[500];

    @OriginalMember(owner = "client!df", name = "A", descriptor = "Lod;")
    private static class101 field759 = class46.method335(78, "Bad session id)3");

    @OriginalMember(owner = "client!df", name = "B", descriptor = "Lod;")
    public static class101 field760 = class46.method335(112, "Standort");

    @OriginalMember(owner = "client!df", name = "p", descriptor = "Lod;")
    public static class101 field748 = field759;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public int field735;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public int field736;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public int field738;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public int field740;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public int field742;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public int field743;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public int field744;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "Lc;")
    public static class15 field757;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "Lh;")
    public class49 field741;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "Lh;")
    public class49 field746;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lt;ZLnf;I)V")
    public static final void method224(class132 arg0, boolean arg1, class96 arg2, int arg3) {
        field739++;
        byte[] var4 = null;
        class78 var5 = class41.field983;
        synchronized (class41.field983) {
            for (class83 var6 = (class83) class41.field983.method523(false); var6 != null; var6 = (class83) class41.field983.method527(true)) {
                if ((long) arg3 == var6.field2723 && var6.field1813 == arg2 && var6.field1818 == 0) {
                    var4 = var6.field1810;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var7 = arg2.method669(arg3, false);
            arg0.method1023(var7, 0, arg3, arg1, arg2);
        } else {
            arg0.method1023(var4, 0, arg3, true, arg2);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
    public static void method225(byte arg0) {
        field748 = null;
        int var1 = -23 % ((-arg0 - 33) / 34);
        field749 = null;
        field759 = null;
        field754 = null;
        field758 = null;
        field752 = null;
        field753 = null;
        field756 = null;
        field757 = null;
        field760 = null;
        field755 = null;
        field747 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lod;Lc;BLod;)Lrd;")
    public static final class122 method226(class101 arg0, class15 arg1, byte arg2, class101 arg3) {
        if (arg2 != 20) {
            method225((byte) -84);
        }
        int var4 = arg1.method110(0, arg3);
        int var5 = arg1.method125(arg2 - 18, arg0, var4);
        field733++;
        return class46.method334(true, arg1, var4, var5);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IBII)Lta;")
    public static final class133 method227(int arg0, byte arg1, int arg2, int arg3) {
        field737++;
        class133 var4 = new class133();
        var4.field3044 = arg2;
        var4.field3046 = arg3;
        class96.field2092.method1137((byte) -89, (long) arg0, var4);
        if (arg1 > -85) {
            return null;
        }
        class119.method896(112, arg2);
        class99.method687(arg2, -59);
        class126 var5 = class78.method532(0, arg0);
        if (var5 != null) {
            class40.method300(false, var5);
        }
        if (class30.field776 != null) {
            class40.method300(false, class30.field776);
            class30.field776 = null;
        }
        class15.field330 = false;
        class54.field1244 = 0;
        class119.method898(class54.field1241, field751, (byte) -73, class25.field655, class75.field1612);
        if (class62.field1382 != -1) {
            class138.method1100(1, (byte) 121, class62.field1382);
        }
        return var4;
    }
}
