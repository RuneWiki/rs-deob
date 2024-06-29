import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class414 implements class321 {

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "Lrc;")
    public static class108 field5680 = new class108(9, 6);

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "Z")
    public static boolean field5685 = false;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "Lap;")
    public static class310 field5684 = new class310(34, 3);

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "Z")
    public static boolean field5686 = false;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field5679;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "([IBJI)Ljava/lang/String;", line = 3)
    public final String method2034(int[] arg0, byte arg1, long arg2, int arg3) {
        field5679++;
        int var6 = -12 % ((1 - arg1) / 37);
        if (arg3 == 0) {
            class62 var7 = class108.field1519.method1315(arg0[0], -96);
            return var7.method562(true, (int) arg2);
        } else if (arg3 == 1 || arg3 == 10) {
            class156 var8 = class373.field5128.method1644((int) arg2, 107);
            return var8.field2189;
        } else if (arg3 == 6 || arg3 == 7 || arg3 == 11) {
            return class108.field1519.method1315(arg0[0], -102).method562(true, (int) arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V", line = 41)
    public static void method2484(boolean arg0) {
        field5684 = null;
        field5680 = null;
        if (arg0) {
            method2484(false);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lwg;[I[I[IZ)V", line = 52)
    public static final void method2485(class361 arg0, int[] arg1, int[] arg2, int[] arg3, boolean arg4) {
        if (!arg4) {
            return;
        }
        field5681++;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg3[var5];
            int var8 = arg2[var5];
            int var9 = 0;
            while (var7 != 0 && arg0.field5734.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field5734[var9] = null;
                    } else {
                        class303 var10 = class386.field5289.method1856(80, var6);
                        int var11 = var10.field4289;
                        class305 var12 = arg0.field5734[var9];
                        if (var12 != null) {
                            if (var12.field4333 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field5734[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field4334 = 1;
                                    var12.field4335 = 0;
                                    var12.field4331 = 0;
                                    var12.field4332 = 0;
                                    var12.field4330 = var8;
                                    class178.method1275(0, false, false, arg0.field4531, arg0.field4537, var10, arg0.field4530);
                                } else if (var11 == 2) {
                                    var12.field4331 = 0;
                                }
                            } else if (var10.field4307 >= class386.field5289.method1856(127, var12.field4333).field4307) {
                                var12 = arg0.field5734[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class305 var13 = arg0.field5734[var9] = new class305();
                            var13.field4330 = var8;
                            var13.field4335 = 0;
                            var13.field4331 = 0;
                            var13.field4333 = var6;
                            var13.field4332 = 0;
                            var13.field4334 = 1;
                            class178.method1275(0, false, false, arg0.field4531, arg0.field4537, var10, arg0.field4530);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
    }
}
