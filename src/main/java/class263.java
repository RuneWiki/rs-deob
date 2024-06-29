import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class263 extends class367 {

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    public int field3906 = -1;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
    public int field3914 = -1;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
    public static int field3910 = -1;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "[I")
    public static int[] field3913 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
    public static int field3911 = 0;

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "I")
    public static int field3918 = 0;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "I")
    public int field3904;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "I")
    public int field3912;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "I")
    public int field3915;

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "I")
    public int field3919;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "Lmu;")
    public static class315 field3908;

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "[Z")
    public static boolean[] field3920;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)V")
    public static void method1732(int arg0) {
        field3913 = null;
        field3908 = null;
        if (arg0 != 0) {
            field3913 = null;
        }
        field3920 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)I")
    public static final int method1733(int arg0, int arg1) {
        ++field3907;
        if (~arg0 > -97) {
            return 0;
        } else {
            if (arg1 != 18795) {
                method1734((byte) 34);
            }
            return ~arg0 > -129 ? 2 : 3;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V")
    public static final void method1734(byte arg0) {
        ++field3909;
        if (class138.field1976 != null) {
            class453.field6428.method1590(-15139);
            class150.method1017();
            class293.method1844(73);
            class262.method1723(-1);
            class198.method1347((byte) 106);
            class279.method1799(-118);
            if (class378.field5629 != null) {
                class378.field5629.method675(105);
            }
            class302.method1883((byte) -119);
            class31.method268(8);
            class85.method689(119);
            class281.method1806(false, (byte) -34);
            class120.method849((byte) 68);
            for (int var1 = 0; ~var1 > -2049; ++var1) {
                class257 var5 = class40.field565[var1];
                if (var5 != null) {
                    var5.field4671 = null;
                    for (int var6 = 0; ~var5.field4668.length < ~var6; ++var6) {
                        var5.field4668[var6] = null;
                    }
                }
            }
            for (int var2 = 0; ~var2 > ~class18.field241.length; ++var2) {
                class349 var3 = class18.field241[var2];
                if (var3 != null) {
                    for (int var4 = 0; ~var3.field4668.length < ~var4; ++var4) {
                        var3.field4668[var4] = null;
                    }
                }
            }
            class138.field1976.method507((byte) -73);
            class138.field1976 = null;
        }
        int var7 = -31 % ((arg0 - -55) / 39);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ltq;III)Z")
    public final boolean method259(class63 arg0, int arg1, int arg2, int arg3) {
        ++field3916;
        class315 var5 = arg0.method565();
        var5.method482(super.field5545, super.field5543, super.field5551);
        int var6 = -33 / ((-59 - arg2) / 58);
        class57 var7 = class23.field309.method2364((byte) 118, this.field3912).method1260(0, this.field3904, 124, arg0, -1, 0, 65536, (class356) null, (class330) null);
        if (var7 != null && var7.method423(arg1, arg3, var5, true)) {
            return true;
        } else {
            if (~this.field3906 != 0) {
                class57 var8 = class23.field309.method2364((byte) 118, this.field3906).method1260(0, this.field3919, 93, arg0, -1, 0, 65536, (class356) null, (class330) null);
                if (var8 != null && var8.method423(arg1, arg3, var5, true)) {
                    return true;
                }
            }
            if (~this.field3914 != 0) {
                class57 var9 = class23.field309.method2364((byte) 118, this.field3914).method1260(0, this.field3915, 81, arg0, -1, 0, 65536, (class356) null, (class330) null);
                if (var9 != null && var9.method423(arg1, arg3, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(Ltq;I)Lcj;")
    public final class123 method252(class63 arg0, int arg1) {
        ++field3917;
        class315 var3 = arg0.method565();
        var3.method482(super.field5545, super.field5543, super.field5551);
        if (arg1 != 2) {
            field3913 = null;
        }
        class123 var4 = class225.method1462(3, -48);
        if (this.field3914 != -1) {
            class57 var5 = class23.field309.method2364((byte) 118, this.field3914).method1260(0, this.field3915, arg1 ^ -122, arg0, -1, 0, 1024, (class356) null, (class330) null);
            if (var5 != null) {
                var5.method404(var3, var4.field1695[2], 0);
            }
        }
        if (~this.field3906 != 0) {
            class57 var6 = class23.field309.method2364((byte) 118, this.field3906).method1260(0, this.field3919, 54, arg0, -1, 0, 1024, (class356) null, (class330) null);
            if (var6 != null) {
                var6.method404(var3, var4.field1695[1], 0);
            }
        }
        class57 var7 = class23.field309.method2364((byte) 118, this.field3912).method1260(0, this.field3904, 121, arg0, -1, 0, 1024, (class356) null, (class330) null);
        if (var7 != null) {
            var7.method404(var3, var4.field1695[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILtq;)V")
    public final void method260(int arg0, class63 arg1) {
        ++field3905;
        if (arg0 != 0) {
            this.method259((class63) null, 75, -78, 81);
        }
    }
}
