import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class166 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "D")
    public static double field2574 = -1.0D;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field2578 = 0;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "Llt;")
    public static class458 field2579;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIII)V", line = 3)
    public static final void method1045(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2576++;
        if (arg3 != 9890) {
            return;
        }
        int var7 = arg4 - arg2;
        int var8 = arg2 + arg5;
        for (int var9 = arg5; var9 < var8; var9++) {
            class78.method566(class69.field1212[var9], arg1, arg6, -7, arg0);
        }
        int var10 = arg1 - arg2;
        for (int var11 = arg4; var11 > var7; var11--) {
            class78.method566(class69.field1212[var11], arg1, arg6, arg3 - 9897, arg0);
        }
        int var12 = arg0 + arg2;
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class69.field1212[var13];
            class78.method566(var14, var12, arg6, -7, arg0);
            class78.method566(var14, arg1, arg6, -7, var10);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V", line = 50)
    public static void method1046(int arg0) {
        field2579 = null;
        int var1 = -117 % ((arg0 + 53) / 60);
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V", line = 62)
    public static final void method1047(int arg0) {
        field2575++;
        if (class375.field5475 == -1) {
            return;
        }
        int var1 = class251.field3835.method1686(25478);
        int var2 = class251.field3835.method1690(8);
        if (arg0 != -17299) {
            return;
        }
        class112 var3 = (class112) class91.field1638.method8((byte) -98);
        if (var3 != null) {
            var1 = var3.method801(arg0 + 17218);
            var2 = var3.method802(6);
        }
        class102.method758(0, var2, class375.field5475, 0, 0, class482.field7368, false, class147.field2384, 0, var1);
        if (class450.field6928 != null) {
            class139.method927(var1, var2, true);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Llt;II)Lpm;", line = 97)
    public static final class396 method1048(class458 arg0, int arg1, int arg2) {
        field2577++;
        byte[] var3 = arg0.method2734(arg2, (byte) 78);
        if (var3 == null) {
            return null;
        } else if (arg1 == 12896) {
            return new class396(var3);
        } else {
            return null;
        }
    }
}
