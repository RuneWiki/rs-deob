import java.awt.Canvas;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class340 {

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "Lqe;")
    public static class469 field4936 = new class469(117, -2);

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "[I")
    public static int[] field4942 = new int[3];

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIILjava/awt/Canvas;Ld;)Lha;", line = 4)
    public static final class60 method2162(int arg0, int arg1, int arg2, Canvas arg3, class151 arg4) {
        if (arg1 != -2042) {
            method2162(127, -51, -90, null, null);
        }
        field4941++;
        return new class316(arg3, arg4, arg0, arg2);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLge;Ljava/lang/Object;)V", line = 20)
    public static final void method2163(byte arg0, class711 arg1, Object arg2) {
        field4940++;
        if (arg1.field10021 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field10021.peekEvent() != null; var3++) {
            class277.method1759(1L, 54);
        }
        try {
            int var4 = 116 % ((arg0 + 41) / 35);
            if (arg2 != null) {
                arg1.field10021.postEvent(new ActionEvent(arg2, 1001, "dummy"));
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLha;)V", line = 51)
    public static final void method2164(byte arg0, class60 arg1) {
        field4938++;
        int var2 = 0;
        int var3 = 0;
        if (class419.field6265) {
            var2 = class210.method1422(true);
            var3 = class407.method2589((byte) -45);
        }
        arg1.method476(var2, var3, class501.field7123 + var2, var3 + 350);
        arg1.method516(var2, var3, class501.field7123, 350, class73.field1023 << 24 | 0x332277, 1);
        if (arg0 != 119) {
            field4942 = null;
        }
        class497.method2963(var3 + 350, class501.field7123 + var2, (byte) -100, var3, var2);
        int var4 = 350 / class610.field8632;
        if (class736.field10318 > 0) {
            int var5 = 346 - class610.field8632 - 4;
            int var6 = var4 * var5 / (class736.field10318 + var4 - 1);
            int var7 = 4;
            if (class736.field10318 > 1) {
                var7 += (var5 - var6) * (class736.field10318 - class692.field9564 - 1) / (class736.field10318 - 1);
            }
            arg1.method516(var2 + class501.field7123 - 16, var3 + var7, 12, var6, class73.field1023 << 24 | 0x332277, 2);
            for (int var8 = class692.field9564; (class692.field9564 + var4) > var8 && class736.field10318 > var8; var8++) {
                String[] var9 = class258.method1684(3270, class146.field1946[var8], '\b');
                int var10 = (class501.field7123 - 8 - 16) / var9.length;
                for (int var11 = 0; var11 < var9.length; var11++) {
                    int var12 = (var10 * var11) + 8;
                    arg1.method476(var2 + var12, var3, var10 + var2 + var12 - 8, var3 - -350);
                    class358.field5201.method546(false, -16777216, var2 + var12, class615.method3558(-127, var9[var11]), var3 + 350 - class163.field2582 - class55.field764.field938 - ((-class692.field9564 + var8) * class610.field8632) - 2, -1);
                }
            }
        }
        class427.field6332.method545(var2 + class501.field7123 - 25, "Build: 639", -16777216, -1, var3 + 330, (byte) 126);
        arg1.method476(var2, var3, class501.field7123 + var2, var3 - -350);
        arg1.method448(var3 + 350 - class163.field2582, class501.field7123, (byte) 122, -1, var2);
        class298.field4225.method546(false, -16777216, var2 + 10, "--> " + class615.method3558(-120, class241.field3505), var3 + 350 - class335.field4827.field938 - 1, -1);
        if (!class201.field3018) {
            return;
        }
        int var13 = -1;
        if ((class357.field5189 % 30) > 15) {
            var13 = 16777215;
        }
        arg1.method437(var13, 12, var3 + 339 - class335.field4827.field938, var2 + 10 + class335.field4827.method587(120, "--> " + class615.method3558(-123, class241.field3505).substring(0, class37.field379)), 1);
    }

    @OriginalMember(owner = "client!jg", name = "toString", descriptor = "()Ljava/lang/String;", line = 130)
    public final String toString() {
        field4939++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)Z", line = 138)
    public final boolean method2165(int arg0) {
        field4937++;
        if (arg0 != -7874) {
            field4936 = null;
        }
        return class559.field7999 == this | class10.field151 == this;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)V", line = 149)
    public static final void method2166(boolean arg0, int arg1) {
        field4935++;
        class194 var2 = (class194) class154.field2501.method2287((long) arg1, (byte) -117);
        if (var2 != null) {
            var2.field2933 = !var2.field2933;
            var2.field2936.method1209(-17992, var2.field2933);
        }
        if (arg0) {
            field4936 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V", line = 179)
    public static void method2167(int arg0) {
        field4942 = null;
        if (arg0 <= -18) {
            field4936 = null;
        }
    }
}
