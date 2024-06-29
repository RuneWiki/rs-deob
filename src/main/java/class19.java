import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public abstract class class19 {

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field356 = 0;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "[I")
    public static int[] field357 = new int[14];

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)I")
    public abstract int method115(int arg0, int arg1);

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lhg;ZI)I")
    public static final int method116(class207 arg0, boolean arg1, int arg2) {
        field355++;
        if (!client.method732(arg0).method125(arg2, arg1) && arg0.field3391 == null) {
            return -1;
        } else if (arg0.field3448 == null || arg2 >= arg0.field3448.length) {
            return -1;
        } else {
            return arg0.field3448[arg2];
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
    public static void method117(boolean arg0) {
        field357 = null;
        if (!arg0) {
            field356 = -110;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZ)V")
    public abstract void method118(int arg0, boolean arg1);

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)Lni;")
    public abstract class22 method119(int arg0);

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(II)[B")
    public abstract byte[] method120(int arg0, int arg1);

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI)V")
    public static final void method121(byte arg0, int arg1) {
        field358++;
        class36 var2 = class136.method1013(3, arg1, (byte) -90);
        var2.method221(1);
        if (arg0 < 84) {
            field356 = -51;
        }
    }
}
