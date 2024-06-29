import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class226 extends class258 {

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    private int field3065 = -1;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "[I")
    public static int[] field3063 = new int[3];

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "Lpu;")
    public static class772 field3060;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ac", name = "s", descriptor = "Ljava/lang/Class;")
    public static Class field3066;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZI)Z")
    public static final boolean method1457(int arg0, int arg1, boolean arg2, int arg3) {
        field3062++;
        boolean var4 = true;
        if (arg2) {
            field3060 = null;
        }
        class274 var5 = (class274) class127.method741(arg0, arg3, arg1);
        if (var5 != null) {
            var4 &= class165.method1045(0, var5);
        }
        class274 var6 = (class274) class238.method1571(arg0, arg3, arg1, field3066 == null ? (field3066 = method1459("aia")) : field3066);
        if (var6 != null) {
            var4 &= class165.method1045(0, var6);
        }
        class274 var7 = (class274) class740.method4019(arg0, arg3, arg1);
        if (var7 != null) {
            var4 &= class165.method1045(0, var7);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lim;B)V")
    public final void method547(class652 arg0, byte arg1) {
        if (arg1 < 123) {
            this.field3065 = 68;
        }
        arg0.method3529(this.field3065, (byte) 120);
        field3064++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLmc;)V")
    public final void method546(byte arg0, class234 arg1) {
        int var3 = -101 / ((7 - arg0) / 41);
        field3061++;
        this.field3065 = arg1.method1553((byte) -127);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public static void method1458(byte arg0) {
        field3060 = null;
        field3063 = null;
        if (arg0 != 37) {
            method1457(82, 88, false, 37);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1459(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
