import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class726 implements class432 {

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Ljava/lang/String;")
    private String field9832;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field9831;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field9833;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field9834;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field9835;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field9836;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Z")
    private boolean field9837;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILaf;I)V", line = 3)
    public static final void method4002(int arg0, class459 arg1, int arg2) {
        class666.field8927 = false;
        class776.field10672 = arg2;
        field9831++;
        class717.method3964(8070, arg1);
        class322.method2088((byte) -122, arg1);
        if (class666.field8927) {
            System.out.println("---endgpp---");
        }
        if (arg1.field3725 != arg0) {
            throw new RuntimeException("gpi1 pos:" + arg1.field3725 + " psize:" + arg0);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)Lkt;", line = 23)
    public final class168 method1775(int arg0) {
        field9833++;
        return arg0 <= 85 ? null : class168.field2213;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)Z", line = 35)
    public final boolean method4003(boolean arg0) {
        field9835++;
        if (arg0) {
            this.field9837 = false;
        }
        return this.field9837;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)I", line = 46)
    public final int method1777(boolean arg0) {
        field9834++;
        int var2 = class723.method3994(this.field9832, -87);
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        } else {
            this.field9837 = arg0;
            return 100;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B[[BLcc;)V", line = 67)
    public static final void method4004(byte arg0, byte[][] arg1, class760 arg2) {
        field9836++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = 94 / ((arg0 + 2) / 41);
        int var5 = arg1.length;
        for (int var6 = 0; var6 < var5; var6++) {
            byte[] var11 = arg1[var6];
            if (var11 != null) {
                class254 var12 = new class254(var11);
                int var13 = class649.field8753[var6] >> 8;
                int var14 = class649.field8753[var6] & 0xFF;
                int var15 = var13 * 64 - class120.field1625;
                int var16 = var14 * 64 - class259.field3849;
                class324.method2095(-125);
                arg2.method2857(class259.field3849, class257.field3830, var16, var15, class120.field1625, (byte) 83, var12);
                arg2.method4182(125, var16, var15, class375.field5490, var12, var3);
                if (!arg2.field6799 && (class759.field10402 / 8) == var13 && class559.field7668 / 8 == var14 && var3[0] != -1) {
                    class126.field1734 = class629.field8517.method4132(var3[2], class297.field4200, var3[0], (byte) 108, var3[1], var3[3]);
                    class627.field8498 = var3[4];
                }
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = (class649.field8753[var7] >> 8) * 64 - class120.field1625;
            int var9 = (class649.field8753[var7] & 0xFF) * 64 - class259.field3849;
            byte[] var10 = arg1[var7];
            if (var10 == null && class559.field7668 < 800) {
                class324.method2095(-108);
                arg2.method2854(var8, 64, 64, var9, (byte) 11);
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 139)
    public class726(String arg0) {
        this.field9832 = arg0;
    }
}
