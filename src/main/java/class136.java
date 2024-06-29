import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class136 extends class45 {

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field1960 = 255;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    public static int field1964 = -1;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "Loc;")
    public class136 field1959;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "Loc;")
    public class136 field1963;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)Lki;")
    public static final class152 method863(int arg0, int arg1) {
        class152 var2 = (class152) class62.field895.method1517((long) arg0, (byte) 26);
        field1966++;
        if (arg1 != 0) {
            field1964 = -64;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class97.field1461.method501(-2, arg0, 36);
        class152 var4 = new class152();
        var4.field2236 = arg0;
        if (var3 != null) {
            var4.method1053(new class170(var3), -67);
        }
        class62.field895.method1518(var4, (long) arg0, (byte) 75);
        return var4;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
    public static final void method864(int arg0) {
        field1958++;
        class15.method88();
        if (arg0 != 1) {
            field1960 = 91;
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class312.field4997[var1].method667((byte) 94);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIZII)V")
    public static final void method865(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var6 = -117 % ((-arg2 - 42) / 55);
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (arg0 < 1) {
            arg0 = 1;
        }
        class58.field858 = (short) arg4;
        class73.field1099 = (short) arg0;
        field1962++;
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)V")
    public final void method866(int arg0) {
        field1961++;
        if (this.field1959 == null) {
            return;
        }
        this.field1959.field1963 = this.field1963;
        if (arg0 <= -94) {
            this.field1963.field1959 = this.field1959;
            this.field1959 = null;
            this.field1963 = null;
        }
    }
}
