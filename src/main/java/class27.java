import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class27 {

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "[I")
    public static int[] field461 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "Lbj;")
    public static class22 field451;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "Lej;")
    public static class55 field458;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "[I")
    public static int[] field453;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "[I")
    public static int[] field456;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lnb;ILnb;ZZ)V")
    public static final void method166(class144 arg0, int arg1, class144 arg2, boolean arg3, boolean arg4) {
        field459++;
        class132.field2467 = arg4;
        class20.field317 = arg3;
        class200.field3829 = arg0;
        if (arg1 >= -63) {
            field460 = -63;
        }
        class175.field3526 = arg2;
        class80.field1442 = new class24(30);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public static final void method167(byte arg0) {
        field455++;
        class160.method1081(39);
        class1.method6((byte) 122);
        class248.method1620((byte) 110);
        class77.method519(arg0 - 165);
        class3.method13((byte) -79);
        class58.method421(0);
        class15.method74(-1669);
        class153.method1046(-28151);
        class71.method474(true);
        class204.method1397(arg0 ^ 0x3D);
        class196.method1359(false);
        class147.method985(true);
        ((class68) class173.field3358).method464(78);
        class33.field555.method671(arg0 - 48);
        class67.field1204.method943(0);
        class223.field4203.method943(0);
        class89.field1671.method943(0);
        class12.field172.method943(0);
        field451.method943(0);
        class99.field1816.method943(0);
        class233.field4367.method943(0);
        if (arg0 == 61) {
            class226.field4245.method943(0);
            class9.field137.method943(arg0 ^ 0x3D);
            class133.field2488.method943(arg0 - 61);
            class18.field300.method943(0);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)V")
    public static final void method168(int arg0, int arg1, int arg2) {
        class52 var3 = class29.field489[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field948 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([IB)[I")
    public static final int[] method169(int[] arg0, byte arg1) {
        if (arg1 >= -31) {
            field461 = null;
        }
        field457++;
        if (arg0 == null) {
            return null;
        } else {
            int[] var2 = new int[arg0.length];
            class124.method840(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)Llj;")
    public static final class130 method170(byte arg0) {
        field452++;
        class193 var1 = new class193(class15.field229, class129.field2426, class247.field4530[0], class135.field2512[0], class102.field1853[0], class67.field1218[0], class116.field2106[0], field456);
        class239.method1580(125);
        if (arg0 <= 121) {
            field454 = -120;
        }
        return var1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
    public static void method171(boolean arg0) {
        field451 = null;
        field461 = null;
        if (!arg0) {
            field453 = null;
            field456 = null;
            field458 = null;
        }
    }
}
