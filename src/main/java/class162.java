import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class162 {

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Z")
    public static boolean field2400 = false;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field2403 = -1;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "[I")
    public static int[] field2404 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IZ)V", line = 20)
    public static final void method1134(int arg0, boolean arg1) {
        class601.field8529 = 0;
        class593.field8422 = 0;
        field2402++;
        class125.method990((byte) -109);
        class92.method819((byte) -49, arg1);
        class310.method1931((byte) 124);
        boolean var2 = false;
        for (int var3 = 0; var3 < class593.field8422; var3++) {
            int var5 = class331.field4754[var3];
            class181 var6 = (class181) class432.field6368.method740(0, (long) var5);
            class170 var7 = var6.field2623;
            if (class2.field20 && class579.method3316(var5, -127)) {
                class576.method3296((byte) 70);
            }
            if (class310.field4553 != var7.field1560) {
                if (var7.field2492.method2573(arg0 ^ 0x6B34)) {
                    class440.method2602((byte) 75, var7);
                }
                var7.method1177(null, (byte) 118);
                var2 = true;
                var6.method911(-52);
            }
        }
        if (var2) {
            class313.field4570 = class432.field6368.method742(arg0 ^ 0x6B0D);
            class432.field6368.method744(class629.field8848, (byte) -106);
        }
        if (class541.field7525 != class52.field761.field3913) {
            throw new RuntimeException("gnp1 pos:" + class52.field761.field3913 + " psize:" + class541.field7525);
        }
        if (arg0 != 27512) {
            field2403 = -9;
        }
        for (int var4 = 0; var4 < class128.field2098; var4++) {
            if (class432.field6368.method740(arg0 ^ 0x6B78, (long) class591.field8401[var4]) == null) {
                throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class128.field2098);
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V", line = 89)
    public static void method1135(boolean arg0) {
        if (arg0) {
            field2404 = null;
        }
        field2404 = null;
    }
}
