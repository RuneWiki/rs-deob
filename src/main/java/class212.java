import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public abstract class class212 {

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field3768 = 0;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "[[[I")
    public static int[][][] field3767 = new int[2][][];

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field3771 = 0;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "[Z")
    public static boolean[] field3766 = new boolean[100];

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIZ)I")
    public abstract int method257(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)Z")
    public static final boolean method1512(int arg0) {
        field3770++;
        if (arg0 > -12) {
            method1512(-69);
        }
        return class141.field2436;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IB)Lvg;")
    public static final class72 method1513(int arg0, byte arg1) {
        class72 var2 = (class72) class92.field1628.method1387((long) arg0, 125);
        field3765++;
        if (var2 != null) {
            return var2;
        } else if (arg1 == 10) {
            byte[] var3 = class243.field4419.method705(class236.method1684(1015038407, arg0), class190.method1323((byte) -104, arg0), -1);
            class72 var4 = new class72();
            var4.field1336 = arg0;
            if (var3 != null) {
                var4.method521(new class149(var3), (byte) 100);
            }
            var4.method518(false);
            class92.field1628.method1385((long) arg0, var4, (byte) -127);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
    public abstract void method258(int arg0);

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)V")
    public static void method1514(int arg0) {
        field3766 = null;
        if (arg0 != 30588) {
            method1514(35);
        }
        field3767 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lmd;Luh;IIIII)V")
    public static final void method1515(class220 arg0, class100 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3769++;
        if (arg1 == null) {
            return;
        }
        int var7 = class70.field1254 + class266.field4711 & 0x7FF;
        if (arg4 < 114) {
            method1514(-115);
        }
        int var8 = Math.max(arg0.field4037 / 2, arg0.field3948 / 2) + 10;
        int var9 = arg3 * arg3 + arg6 * arg6;
        if (var8 * var8 < var9) {
            return;
        }
        int var10 = class257.field4598[var7];
        int var11 = class257.field4597[var7];
        int var12 = var11 * 256 / (class225.field4098 + 256);
        int var13 = var10 * 256 / (class225.field4098 + 256);
        int var14 = arg3 * var13 + arg6 * var12 >> 16;
        int var15 = arg3 * var12 - arg6 * var13 >> 16;
        ((class139) arg1).method958(arg0.field4037 / 2 + arg2 - (-var14 - -(arg1.field1806 / 2)), -(arg1.field1810 / 2) + arg5 - (-(arg0.field3948 / 2) - -var15), arg0.field4026, arg0.field3907);
    }
}
