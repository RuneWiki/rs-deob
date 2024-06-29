import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class164 extends class748 {

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "Lqk;")
    public static class148 field2252 = new class148(3, -2);

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "Lcj;")
    public static class443 field2259;

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "Lsu;")
    public static class590 field2256;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILvj;)Lwr;")
    public static final class242 method1018(int arg0, class26 arg1) {
        ++field2253;
        return arg0 != -8375 ? null : new class242(arg1.method173(-3), arg1.method173(-3), arg1.method173(-3), arg1.method173(-3), arg1.method186((byte) 93), arg1.method186((byte) 96), arg1.method194((byte) 119));
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
    public class164() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZ)Lcba;")
    public static final class53 method1019(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            ++field2258;
            class53[] var2 = class80.method479(-28841);
            for (int var3 = 0; var2.length > var3; ++var3) {
                class53 var4 = var2[var3];
                if (var4.field746 == arg0) {
                    return var4;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(III)Z")
    public static final boolean method1020(int arg0, int arg1, int arg2) {
        ++field2257;
        if (!class636.method3699(-1, arg2, arg1)) {
            return false;
        } else {
            return ~(45056 & arg2) != arg0 | class90.method546(arg1, 7804, arg2) | class41.method285(arg1, (byte) 61, arg2) ? true : (class721.method4051(arg2, (byte) -90, arg1) | class356.method2016(arg2, -128, arg1)) & ~(55 & arg1) == -1;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field2254;
        int[] var3 = super.field10407.method3873(arg1 ^ arg1, arg0);
        if (super.field10407.field9527) {
            class34.method240(var3, 0, class424.field5889, class370.field4727[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(B)V")
    public static void method1021(byte arg0) {
        field2259 = null;
        field2252 = null;
        field2256 = null;
        if (arg0 >= -118) {
            method1021((byte) -124);
        }
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(B)V")
    public static final void method1022(byte arg0) {
        if (arg0 == 32) {
            ++field2255;
            for (class192 var1 = (class192) class63.field842.method1382(arg0 ^ 27869); var1 != null; var1 = (class192) class63.field842.method1383(false)) {
                if (var1.field2783) {
                    var1.field2783 = false;
                } else {
                    class49.method334((byte) -75, var1.field2789);
                }
            }
        }
    }
}
