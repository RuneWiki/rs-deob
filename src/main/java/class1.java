import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class1 extends class338 {

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public int field1;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public int field5;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "Ljava/lang/String;")
    public static String field7 = "Loaded defaults";

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "Ljava/lang/String;")
    public static String field6 = "Continue";

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "Z")
    public static boolean field2 = false;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)V", line = 13)
    public static void method1(int arg0) {
        if (arg0 > -4) {
            field7 = null;
        }
        field6 = null;
        field7 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/lang/String;ZI)V", line = 28)
    public static final void method2(String arg0, boolean arg1, int arg2) {
        field4++;
        if (arg0 == null) {
            return;
        }
        if (class452.field6573 >= 100) {
            class371.method2240(class352.field4927, 72);
            return;
        }
        String var3 = class88.method482((byte) 69, arg0);
        if (var3 == null) {
            return;
        }
        if (arg2 != -21386) {
            field2 = false;
        }
        for (int var4 = 0; var4 < class452.field6573; var4++) {
            String var8 = class88.method482((byte) 52, class333.field4427[var4]);
            if (var8 != null && var8.equals(var3)) {
                class371.method2240(arg0 + class411.field5946, 94);
                return;
            }
            if (class139.field1782[var4] != null) {
                String var9 = class88.method482((byte) 124, class139.field1782[var4]);
                if (var9 != null && var9.equals(var3)) {
                    class371.method2240(arg0 + class411.field5946, -56);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class88.field993; var5++) {
            String var6 = class88.method482((byte) 125, class198.field2647[var5]);
            if (var6 != null && var6.equals(var3)) {
                class371.method2240(class143.field1837 + arg0 + class72.field790, arg2 ^ 0x5386);
                return;
            }
            if (class182.field2309[var5] != null) {
                String var7 = class88.method482((byte) 42, class182.field2309[var5]);
                if (var7 != null && var7.equals(var3)) {
                    class371.method2240(class143.field1837 + arg0 + class72.field790, -123);
                    return;
                }
            }
        }
        if (class88.method482((byte) 119, class427.field6264.field2034).equals(var3)) {
            class371.method2240(class374.field5264, arg2 + 21500);
            return;
        }
        class281.field3857.method295(20579, 110);
        class374.field5261++;
        class281.field3857.method1386(arg2 ^ 0xD4814A6, class75.method426(arg2 ^ 0xFFFFC3FD, arg0) + 1);
        class281.field3857.method1343(arg0, 22608);
        class281.field3857.method1386(-222840624, arg1 ? 1 : 0);
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(II)V", line = 130)
    public class1(int arg0, int arg1) {
        this.field1 = arg1;
        this.field5 = arg0;
    }

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "(I)V", line = 142)
    public static final void method3(int arg0) {
        class448.field6514.method297(false);
        field8++;
        int var1 = class448.field6514.method305(8, -7985);
        if (var1 < class244.field3320) {
            for (int var2 = var1; var2 < class244.field3320; var2++) {
                class270.field3664[class388.field5553++] = class308.field4175[var2];
            }
        }
        if (arg0 < 41) {
            return;
        }
        if (var1 > class244.field3320) {
            throw new RuntimeException("gnpov1");
        }
        class244.field3320 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class308.field4175[var3];
            class91 var5 = class38.field397[var4];
            int var6 = class448.field6514.method305(1, -7985);
            if (var6 == 0) {
                class308.field4175[class244.field3320++] = var4;
                var5.field6071 = class234.field3224;
            } else {
                int var7 = class448.field6514.method305(2, -7985);
                if (var7 == 0) {
                    class308.field4175[class244.field3320++] = var4;
                    var5.field6071 = class234.field3224;
                    class192.field2423[class338.field4509++] = var4;
                } else if (var7 == 1) {
                    class308.field4175[class244.field3320++] = var4;
                    var5.field6071 = class234.field3224;
                    int var8 = class448.field6514.method305(3, -7985);
                    var5.method2613(1, var8, 0);
                    int var9 = class448.field6514.method305(1, -7985);
                    if (var9 == 1) {
                        class192.field2423[class338.field4509++] = var4;
                    }
                } else if (var7 == 2) {
                    class308.field4175[class244.field3320++] = var4;
                    var5.field6071 = class234.field3224;
                    if (class448.field6514.method305(1, -7985) == 1) {
                        int var11 = class448.field6514.method305(3, -7985);
                        var5.method2613(2, var11, 0);
                        int var12 = class448.field6514.method305(3, -7985);
                        var5.method2613(2, var12, 0);
                    } else {
                        int var10 = class448.field6514.method305(3, -7985);
                        var5.method2613(0, var10, 0);
                    }
                    int var13 = class448.field6514.method305(1, -7985);
                    if (var13 == 1) {
                        class192.field2423[class338.field4509++] = var4;
                    }
                } else if (var7 == 3) {
                    class270.field3664[class388.field5553++] = var4;
                }
            }
        }
    }
}
