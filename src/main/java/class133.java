import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class133 extends class360 {

    @OriginalMember(owner = "client!vm", name = "v", descriptor = "B")
    public byte field1871 = 5;

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
    public static int field1868 = 2;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
    public int field1862;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "I")
    public int field1863;

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
    public int field1864;

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!vm", name = "q", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
    public int field1869;

    @OriginalMember(owner = "client!vm", name = "u", descriptor = "I")
    public int field1870;

    @OriginalMember(owner = "client!vm", name = "w", descriptor = "I")
    public int field1872;

    @OriginalMember(owner = "client!vm", name = "x", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BLae;)Lae;")
    public static final class172 method988(byte arg0, class172 arg1) {
        field1866++;
        if (arg0 != 111) {
            return null;
        } else if (arg1.field2532 == -1) {
            int var2 = arg1.field2543 >>> 16;
            class428 var3 = new class428(class310.field4399);
            for (class249 var4 = (class249) var3.method2556(119); var4 != null; var4 = (class249) var3.method2559((byte) 127)) {
                if (var4.field3593 == var2) {
                    return class361.method2217((int) var4.field6382, -1060820048);
                }
            }
            return null;
        } else {
            return class361.method2217(arg1.field2532, -1060820048);
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(III)V")
    public static final void method989(int arg0, int arg1, int arg2) {
        class52 var3 = class385.field5285[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field772 != null) {
            var3.field772 = null;
        }
        if (var3.field752 != null) {
            var3.field752 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIZI)I")
    public static final int method990(int arg0, int arg1, boolean arg2, int arg3) {
        field1873++;
        int var4 = arg0 / arg3;
        int var5 = arg0 & arg3 - 1;
        int var6 = arg1 / arg3;
        if (arg2) {
            field1865 = 45;
        }
        int var7 = arg3 - 1 & arg1;
        int var8 = class267.method1804(var4, (byte) 79, var6);
        int var9 = class267.method1804(var4 + 1, (byte) 66, var6);
        int var10 = class267.method1804(var4, (byte) -83, var6 + 1);
        int var11 = class267.method1804(var4 + 1, (byte) 100, var6 + 1);
        int var12 = class273.method1846(var9, var5, arg3, var8, (byte) 121);
        int var13 = class273.method1846(var11, var5, arg3, var10, (byte) 121);
        return class273.method1846(var13, var7, arg3, var12, (byte) 121);
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(III)La;")
    public static final class421 method991(int arg0, int arg1, int arg2) {
        class52 var3 = class385.field5285[arg0][arg1][arg2];
        return var3 == null ? null : var3.field772;
    }
}
