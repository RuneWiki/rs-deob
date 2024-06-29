import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class481 {

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "Lqu;")
    public static class219 field7327 = new class219(48, 7);

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "[I")
    public static int[] field7329 = new int[14];

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    public static int field7331 = -1;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "Lbi;")
    public static class104 field7330 = new class104(77, 3);

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "F")
    public static float field7325;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field7326;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
    public static void method2966(int arg0) {
        field7330 = null;
        int var1 = -57 % ((-arg0 - 71) / 50);
        field7327 = null;
        field7329 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZLjava/lang/String;ZLmn;)Lmu;")
    public static final class218 method2967(boolean arg0, String arg1, boolean arg2, class162 arg3) {
        field7328++;
        int var4 = arg3.method1014(true, arg1);
        if (var4 == -1) {
            return new class218(0);
        }
        int[] var5 = arg3.method1016(var4, 1);
        if (arg0) {
            method2969(82, null);
        }
        class218 var6 = new class218(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field3702) {
                class208 var9 = new class208(arg3.method1004(var4, arg0, var5[var8++]));
                int var10 = var9.method1436((byte) 114);
                int var11 = var9.method1455(-3387);
                int var12 = var9.method1445(-127);
                if (!arg2 && var12 == 1) {
                    var6.field3702--;
                } else {
                    var6.field3706[var7] = var10;
                    var6.field3705[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)V")
    public static final void method2968(boolean arg0) {
        field7326++;
        if (class77.field1152 == class209.field3228) {
            return;
        }
        try {
            class200.method1370(124, class528.field7769, "tbrefresh");
            if (arg0) {
                method2966(-75);
            }
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILmn;)V")
    public static final void method2969(int arg0, class162 arg1) {
        class196.field3036 = 0;
        class6.field73 = 0;
        field7324++;
        if (arg0 < 113) {
            method2968(true);
        }
        class518.field7685 = new class410();
        class64.field1006 = new class251[1024];
        class306.method2066(arg1, -22123);
        class409.method2610(arg1, 8288);
    }
}
