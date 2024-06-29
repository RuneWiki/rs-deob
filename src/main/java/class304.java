import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public abstract class class304 {

    @OriginalMember(owner = "client!js", name = "f", descriptor = "I")
    public static int field4514 = 0;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "F")
    public static float field4512;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "Lrw;")
    public static class703 field4511;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "[[B")
    public static byte[][] field4509;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "([ILog;[I[IB)V")
    public static final void method1994(int[] arg0, class602 arg1, int[] arg2, int[] arg3, byte arg4) {
        if (arg4 != 38) {
            return;
        }
        for (int var5 = 0; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg0[var5];
            int var8 = arg2[var5];
            int var9 = 0;
            while (var7 != 0 && arg1.field8768.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field8768[var9] = null;
                    } else {
                        class138 var10 = class357.field5338.method2099(var6, true);
                        int var11 = var10.field2434;
                        class674 var12 = arg1.field8768[var9];
                        if (var12 != null) {
                            if (var12.field9589 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field8768[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field9592 = var8;
                                    var12.field9590 = 0;
                                    var12.field9596 = 0;
                                    var12.field9591 = 1;
                                    var12.field9597 = 0;
                                    class536.method3101(0, (byte) 127, var10, arg1.field9815, arg1.field9806, arg1.field9814, class532.field7456 == arg1);
                                } else if (var11 == 2) {
                                    var12.field9590 = 0;
                                }
                            } else if (var10.field2441 >= class357.field5338.method2099(var12.field9589, true).field2441) {
                                var12 = arg1.field8768[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class674 var13 = arg1.field8768[var9] = new class674();
                            var13.field9589 = var6;
                            var13.field9590 = 0;
                            var13.field9592 = var8;
                            var13.field9591 = 1;
                            var13.field9596 = 0;
                            var13.field9597 = 0;
                            class536.method3101(0, (byte) 126, var10, arg1.field9815, arg1.field9806, arg1.field9814, class532.field7456 == arg1);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field4510++;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
    public static void method1995(int arg0) {
        if (arg0 != 0) {
            field4514 = -18;
        }
        field4509 = null;
        field4511 = null;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Z[BI)V")
    public static final void method1996(boolean arg0, byte[] arg1, int arg2) {
        if (class463.field6588 == null) {
            class463.field6588 = new class61(20000);
        }
        field4513++;
        class463.field6588.method698(arg2 - 68, arg1.length, arg2, arg1);
        if (!arg0) {
            return;
        }
        class119.method1043((byte) -97, class463.field6588.field1397);
        class366.field5422 = new class135[class673.field9581];
        int var3 = 0;
        for (int var4 = class290.field4367; var4 <= class527.field7434; var4++) {
            class135 var5 = class265.method1734(2, var4);
            if (var5 != null) {
                class366.field5422[var3++] = var5;
            }
        }
        class582.field8428 = false;
        class308.field4554 = class525.method3074((byte) -101);
        class463.field6588 = null;
    }
}
