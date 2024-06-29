import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class175 extends class98 {

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "I")
    public int field2883 = 0;

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "[I")
    public static int[] field2882;

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "[I")
    public static int[] field2886;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZILie;)V")
    private final void method1421(boolean arg0, int arg1, class6 arg2) {
        if (arg0) {
            field2882 = null;
        }
        if (arg1 == 2) {
            this.field2883 = arg2.method67(12021);
        }
        field2884++;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Luf;")
    public static final class413 method1422(int arg0) {
        if (arg0 != -3) {
            field2886 = null;
        }
        field2885++;
        class413 var1 = (class413) class266.field4321.method2008(-3717);
        if (var1 != null) {
            var1.method707((byte) -87);
            var1.method958((byte) 69);
            return var1;
        }
        class413 var2;
        do {
            var2 = (class413) class160.field2729.method2008(-3717);
            if (var2 == null) {
                return null;
            }
            if (var2.method2635(1) > class112.method1033(arg0 - 11749)) {
                return null;
            }
            var2.method707((byte) -27);
            var2.method958((byte) 69);
        } while ((Long.MIN_VALUE & var2.field1586) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BLie;)V")
    public final void method1423(byte arg0, class6 arg1) {
        field2887++;
        if (arg0 != -105) {
            return;
        }
        while (true) {
            int var3 = arg1.method70(-9059);
            if (var3 == 0) {
                return;
            }
            this.method1421(false, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(B)V")
    public static void method1424(byte arg0) {
        if (arg0 != 81) {
            method1422(101);
        }
        field2886 = null;
        field2882 = null;
    }
}
