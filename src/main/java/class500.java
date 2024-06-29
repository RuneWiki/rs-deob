import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public class class500 extends IOException {

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!ria", name = "c", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "[[B")
    public static byte[][] field7266;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(ZIILjava/lang/String;)V")
    public static final void method3034(boolean arg0, int arg1, int arg2, String arg3) {
        class263.method1751((byte) 98);
        field7268++;
        if (arg2 == 0) {
            class364.field5573 = class405.method2499(class172.field2951, class400.field5941, class654.field9289.field5417.method2495(arg1 ^ 0x3) * 2, 0, (byte) -66, class352.field5158);
            if (arg3 != null) {
                class364.field5573.method1328(0);
                class54 var13 = class552.method3220(class715.field10041, (byte) -32, 0, class312.field4704);
                class400 var14 = class364.field5573.method424(var13, class726.method4006(class101.field1494, class715.field10041, 0), true);
                class120.method944((byte) 57);
                class104.method853(var13, arg3, class364.field5573, (byte) -10, var14, true);
            }
        } else {
            class544 var4 = null;
            if (arg3 != null) {
                var4 = class405.method2499(class172.field2951, class400.field5941, 0, 0, (byte) -97, class352.field5158);
                var4.method1328(0);
                class54 var5 = class552.method3220(class715.field10041, (byte) 110, 0, class312.field4704);
                class400 var6 = var4.method424(var5, class726.method4006(class101.field1494, class715.field10041, 0), true);
                class120.method944((byte) 71);
                class104.method853(var5, arg3, var4, (byte) -10, var6, true);
            }
            boolean var24 = false;
            label216: {
                try {
                    var24 = true;
                    class364.field5573 = class405.method2499(class172.field2951, class400.field5941, class654.field9289.field5417.method2495(3) * 2, arg2, (byte) -58, class352.field5158);
                    if (arg3 != null) {
                        var4.method1328(0);
                        class54 var7 = class552.method3220(class715.field10041, (byte) -9, 0, class312.field4704);
                        class400 var8 = var4.method424(var7, class726.method4006(class101.field1494, class715.field10041, 0), true);
                        class120.method944((byte) 93);
                        class104.method853(var7, arg3, var4, (byte) -10, var8, true);
                    }
                    if (class364.field5573.method239()) {
                        boolean var9 = true;
                        try {
                            var9 = class547.field7815.field364 > 256;
                        } catch (Throwable var28) {
                        }
                        class254 var10;
                        if (var9) {
                            var10 = class364.field5573.method260(146800640);
                        } else {
                            var10 = class364.field5573.method260(104857600);
                        }
                        class364.field5573.method285(var10);
                        var24 = false;
                    } else {
                        var24 = false;
                    }
                    break label216;
                } catch (Throwable var29) {
                    int var11 = class654.field9289.field5415.method2004(3);
                    if (var11 == 2) {
                        class126.field1952 = true;
                    }
                    class654.field9289.method2292(110, 0, class654.field9289.field5415);
                    method3034(arg0, arg1, var11, arg3);
                    Object var10000 = null;
                    var24 = false;
                } finally {
                    if (var24) {
                        Object var17 = null;
                        if (var4 != null) {
                            try {
                                var4.method3190((byte) 70);
                            } catch (Throwable var26) {
                            }
                        }
                    }
                }
                if (var4 != null) {
                    try {
                        var4.method3190((byte) 70);
                    } catch (Throwable var25) {
                    }
                }
                return;
            }
            Object var16 = null;
            if (var4 != null) {
                try {
                    var4.method3190((byte) 70);
                } catch (Throwable var27) {
                }
            }
        }
        class654.field9289.field5415.method1998(31, !arg0);
        class654.field9289.method2292(111, arg2, class654.field9289.field5415);
        class187.method1425(arg1);
        class364.field5573.method295(10000);
        class364.field5573.method395(32);
        class257.field4038 = class364.field5573.method414();
        class44.field744 = class364.field5573.method414();
        class498.method3018(-104);
        class364.field5573.method246(class654.field9289.field5428.method3631(3) == 1);
        if (class364.field5573.method392()) {
            class49.method486(class654.field9289.field5429.method2100(3) == 1, 2);
        }
        class271.method1786(class314.field4720 >> 3, false, class191.field3229 >> 3, class364.field5573);
        class525.method3121(-11701);
        class407.field6033 = false;
        class679.field9567 = null;
        class515.field7466 = true;
        class650.method3658((byte) 74);
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(I)V")
    public static void method3035(int arg0) {
        if (arg0 != 104857600) {
            method3035(38);
        }
        field7266 = null;
    }

    @OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class500(String arg0) {
        super(arg0);
    }
}
