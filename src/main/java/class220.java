import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class220 extends class116 {

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "[S")
    public static short[] field3740 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
    public static int field3746 = 0;

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "Lne;")
    public static class137 field3744 = new class137(50);

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "Lma;")
    public static class105 field3742;

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "Loa;")
    private class276 field3747;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(IB)I")
    public static final int method1412(int arg0, byte arg1) {
        if (arg1 != -86) {
            method1412(-125, (byte) 114);
        }
        field3741++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "(I)V")
    public static void method1413(int arg0) {
        int var1 = 47 % (-arg0 / 63);
        field3744 = null;
        field3740 = null;
        field3742 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZLij;)V")
    public final void method1414(boolean arg0, class85 arg1) {
        while (true) {
            int var3 = arg1.method564((byte) 119);
            if (var3 == 0) {
                if (!arg0) {
                    field3740 = null;
                }
                field3738++;
                return;
            }
            this.method1415(arg1, var3, -250);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lij;II)V")
    private final void method1415(class85 arg0, int arg1, int arg2) {
        field3745++;
        if (~arg1 != arg2) {
            return;
        }
        int var4 = arg0.method564((byte) 73);
        if (this.field3747 == null) {
            int var5 = class181.method1214(var4, -1);
            this.field3747 = new class276(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg0.method564((byte) 69) == 1;
            int var8 = arg0.method598(110);
            class103 var9;
            if (var7) {
                var9 = new class271(arg0.method599(-1));
            } else {
                var9 = new class216(arg0.method568(arg2 ^ 0xFFFFB283));
            }
            this.field3747.method1867(true, (long) var8, var9);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZILda;)Lda;")
    public final class275 method1416(boolean arg0, int arg1, class275 arg2) {
        if (arg0) {
            field3740 = null;
        }
        field3743++;
        if (this.field3747 == null) {
            return arg2;
        } else {
            class271 var4 = (class271) this.field3747.method1871(0, (long) arg1);
            return var4 == null ? arg2 : var4.field4706;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)I")
    public final int method1417(int arg0, int arg1, int arg2) {
        field3739++;
        if (this.field3747 == null) {
            return arg0;
        }
        if (arg2 != 50) {
            this.method1417(-74, -67, 100);
        }
        class216 var4 = (class216) this.field3747.method1871(0, (long) arg1);
        return var4 == null ? arg0 : var4.field3692;
    }
}
