import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class128 extends class615 {

    @OriginalMember(owner = "client!ls", name = "I", descriptor = "Llj;")
    public static class570 field2143 = new class570(4, 1, 1, 1);

    @OriginalMember(owner = "client!ls", name = "L", descriptor = "Lcu;")
    public static class206 field2146 = new class206(28, 4);

    @OriginalMember(owner = "client!ls", name = "M", descriptor = "Ldb;")
    public static class298 field2147 = new class298(50, 2);

    @OriginalMember(owner = "client!ls", name = "N", descriptor = "[I")
    public static int[] field2148 = new int[8];

    @OriginalMember(owner = "client!ls", name = "G", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!ls", name = "H", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!ls", name = "K", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!ls", name = "J", descriptor = "[[S")
    public static short[][] field2144;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "(I)V", line = 3)
    public static void method982(int arg0) {
        field2147 = null;
        field2146 = null;
        field2143 = null;
        field2144 = null;
        field2148 = null;
        if (arg0 >= -91) {
            field2144 = null;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZLeh;)Lcf;", line = 18)
    public static final class566 method983(boolean arg0, class335 arg1) {
        field2145++;
        class288 var2 = class108.method805(arg1, false);
        int var3 = arg1.method2001((byte) -83);
        if (!arg0) {
            field2146 = null;
        }
        int var4 = arg1.method2001((byte) -83);
        int var5 = arg1.method2001((byte) -83);
        int var6 = arg1.method2001((byte) -83);
        int var7 = arg1.method2001((byte) -83);
        int var8 = arg1.method2001((byte) -83);
        return new class566(var2.field4065, var2.field4069, var2.field4064, var2.field4073, var2.field4067, var2.field4075, var2.field4070, var2.field4074, var2.field4066, var3, var4, var5, var6, var7, var8);
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "()V", line = 45)
    public class128() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IB)[I", line = 50)
    public final int[] method8(int arg0, byte arg1) {
        if (arg1 == -18) {
            field2141++;
            return class168.field2599;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(II[Lgba;)V", line = 62)
    public static final void method984(int arg0, int arg1, class625[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class625 var4 = arg2[var3];
            if (var4 != null && var4.field8288 == arg0 && !client.method1697(var4)) {
                if (var4.field8421 == 0) {
                    method984(var4.field8327, 16723, arg2);
                    if (var4.field8420 != null) {
                        method984(var4.field8327, 16723, var4.field8420);
                    }
                    class140 var5 = (class140) class264.field3667.method2918((long) var4.field8327, (byte) -37);
                    if (var5 != null) {
                        class397.method2279(var5.field2256, 2);
                    }
                }
                if (var4.field8421 == 6 && var4.field8377 != -1) {
                    class616 var6 = class636.field8570.method231(var4.field8377, -11764);
                    if (var6 != null) {
                        var4.field8439 += class104.field1561;
                        int var7 = var4.field8321;
                        while (var4.field8439 > var6.field8163[var4.field8321]) {
                            var4.field8439 -= var6.field8163[var4.field8321];
                            var4.field8321++;
                            if (var6.field8160.length <= var4.field8321) {
                                var4.field8321 -= var6.field8146;
                                if (var4.field8321 < 0 || var6.field8160.length <= var4.field8321) {
                                    var4.field8321 = 0;
                                }
                            }
                            var4.field8372 = var4.field8321 + 1;
                            if (var4.field8372 >= var6.field8160.length) {
                                var4.field8372 -= var6.field8146;
                                if (var4.field8372 < 0 || var6.field8160.length <= var4.field8372) {
                                    var4.field8372 = -1;
                                }
                            }
                            class463.method2624(false, var4);
                        }
                        if (var4.field8321 != var7) {
                            class595.method3280(var4.field8321, false, var6);
                        }
                    }
                }
            }
        }
        if (arg1 != 16723) {
            method984(56, -21, null);
        }
        field2142++;
    }
}
