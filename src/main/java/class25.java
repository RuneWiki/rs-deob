import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class25 extends class179 {

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public int field324 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    public int field330 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public int field322 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public int field329 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
    public int field336 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
    public int field334 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
    public int field337 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
    public int field333 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "Lod;")
    public class334 field326;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
    public static int field332 = 0;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "Lig;")
    public static class154 field323;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "Luu;")
    public static class180 field325;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IBII)V", line = 11)
    public static final void method131(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg0 << 3;
        field331++;
        int var5 = arg3 << 3;
        int var6 = arg2 << 3;
        if (arg1 != 76) {
            method131(-18, (byte) 64, -118, -50);
        }
        class376.field5483 = var6;
        class23.field289 = var5;
        if (class408.field5928 == 2) {
            class456.field6999 = var6;
            class16.field226 = var5;
            class211.field3284 = var4;
        }
        class56.method400(90);
        class7.field81 = true;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lod;)V", line = 173)
    public class25(class334 arg0) {
        this.field326 = arg0;
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(I)V", line = 49)
    public static void method132(int arg0) {
        if (arg0 == -22944) {
            field325 = null;
            field323 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BIILoq;)Lwt;", line = 65)
    public static final class195 method133(byte arg0, int arg1, int arg2, class231 arg3) {
        field327++;
        int var4 = arg1 << 8 | arg3.field3513;
        class195 var5 = (class195) class167.field2590.method1666(-127, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class375.field5474.method2734(class375.field5474.method2744((byte) -6, var4), (byte) 78);
        if (var6 == null) {
            int var8 = arg2 + 65536 << 8 | arg3.field3513;
            class195 var9 = (class195) class167.field2590.method1666(-128, (long) var8 << 16);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class375.field5474.method2734(class375.field5474.method2744((byte) -6, var8), (byte) 78);
            if (var10 == null) {
                int var12 = arg3.field3513 | 0xFFFF00;
                class195 var13 = (class195) class167.field2590.method1666(-127, (long) var12 << 16);
                if (var13 != null) {
                    return var13;
                } else if (arg0 <= 109) {
                    return null;
                } else {
                    byte[] var14 = class375.field5474.method2734(class375.field5474.method2744((byte) -6, var12), (byte) 78);
                    if (var14 == null) {
                        return null;
                    } else if (var14.length <= 1) {
                        return null;
                    } else {
                        class195 var15 = class246.method1489(var14, (byte) 65);
                        var15.field3084 = arg3;
                        class167.field2590.method1668((byte) -127, (long) var12 << 16, var15);
                        return var15;
                    }
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class195 var11 = class246.method1489(var10, (byte) 65);
                var11.field3084 = arg3;
                class167.field2590.method1668((byte) 80, (long) var8 << 16, var11);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class195 var7 = class246.method1489(var6, (byte) 65);
            var7.field3084 = arg3;
            class167.field2590.method1668((byte) 64, (long) var4 << 16, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIB)Z", line = 132)
    public final boolean method134(int arg0, int arg1, byte arg2) {
        field328++;
        int var4 = 127 % ((arg2 + 52) / 32);
        if (arg1 >= this.field336 && arg1 <= this.field334 && arg0 >= this.field329 && this.field324 >= arg0) {
            return true;
        } else {
            return this.field330 <= arg1 && this.field337 >= arg1 && arg0 >= this.field333 && arg0 <= this.field322;
        }
    }
}
