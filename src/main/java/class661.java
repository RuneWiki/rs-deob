import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public abstract class class661 {

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "[I")
    public static int[] field9035 = new int[1];

    @OriginalMember(owner = "client!bca", name = "e", descriptor = "I")
    public static int field9039 = 0;

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "I")
    public static int field9036;

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "I")
    public static int field9037;

    @OriginalMember(owner = "client!bca", name = "d", descriptor = "I")
    public static int field9038;

    @OriginalMember(owner = "client!bca", name = "f", descriptor = "I")
    public static int field9040;

    @OriginalMember(owner = "client!bca", name = "g", descriptor = "I")
    public static int field9041;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "([I)V")
    public abstract void method769(int[] arg0);

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(III)V")
    public abstract void method752(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(III[I)V")
    public abstract void method750(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(B)V")
    public static final void method3715(byte arg0) {
        class459.method2723(91, class693.field9368.field4423.method3539(-32350));
        field9037++;
        int var1 = (class108.field1896 >> 12) + (class221.field3177 >> 3);
        int var2 = (class367.field5236 >> 3) + (class275.field3870 >> 12);
        class382.field5551 = class58.field1147.field5926 = 0;
        class58.field1147.method3397(8, 8, (byte) 118);
        if (arg0 != -49) {
            field9039 = 115;
        }
        byte var3 = 18;
        class346.field4845 = new int[var3];
        class568.field7815 = new byte[var3][];
        class621.field8449 = new int[var3][4];
        class683.field9251 = new int[var3];
        class204.field2942 = new byte[var3][];
        class199.field2905 = new int[var3];
        class184.field2787 = new int[var3];
        class67.field1266 = new int[var3];
        class109.field1900 = new byte[var3][];
        class355.field5025 = new int[var3];
        class689.field9303 = new byte[var3][];
        class417.field6044 = new byte[var3][];
        int var4 = 0;
        for (int var5 = (var1 - (class376.field5325 >> 4)) / 8; var5 <= (var1 + (class376.field5325 >> 4)) / 8; var5++) {
            for (int var8 = (var2 - (class175.field2711 >> 4)) / 8; var8 <= ((class175.field2711 >> 4) + var2) / 8; var8++) {
                int var9 = (var5 << 8) + var8;
                class199.field2905[var4] = var9;
                class683.field9251[var4] = class171.field2666.method870("m" + var5 + "_" + var8, arg0 + 49);
                class355.field5025[var4] = class171.field2666.method870("l" + var5 + "_" + var8, 0);
                class346.field4845[var4] = class171.field2666.method870("n" + var5 + "_" + var8, 0);
                class67.field1266[var4] = class171.field2666.method870("um" + var5 + "_" + var8, 0);
                class184.field2787[var4] = class171.field2666.method870("ul" + var5 + "_" + var8, class710.method3948(arg0, -49));
                if (class346.field4845[var4] == -1) {
                    class683.field9251[var4] = -1;
                    class355.field5025[var4] = -1;
                    class67.field1266[var4] = -1;
                    class184.field2787[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class346.field4845.length; var6++) {
            class346.field4845[var6] = -1;
            class683.field9251[var6] = -1;
            class355.field5025[var6] = -1;
            class67.field1266[var6] = -1;
            class184.field2787[var6] = -1;
        }
        byte var7;
        if (class214.field3036 == 3) {
            var7 = 4;
        } else {
            var7 = 8;
        }
        class432.method2627(var2, (byte) 123, var1, var7, false);
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(III)V")
    public abstract void method744(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)V")
    public abstract void method748(int arg0);

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(I)V")
    public abstract void method774(int arg0);

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(III[I)V")
    public abstract void method770(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lbca;)V")
    public abstract void method778(class661 arg0);

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "(I)V")
    public abstract void method749(int arg0);

    @OriginalMember(owner = "client!bca", name = "d", descriptor = "(I)V")
    public abstract void method756(int arg0);

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "([Lmi;I)V")
    public static final void method3716(class496[] arg0, int arg1) {
        field9041++;
        class315.field4365 = arg0.length;
        class195.field2889 = new int[class315.field4365 + 10];
        class236.field3436 = new class496[class315.field4365 + 10];
        class363.method2317(arg0, 0, class236.field3436, 0, class315.field4365);
        for (int var2 = 0; var2 < class315.field4365; var2++) {
            class195.field2889[var2] = class236.field3436[var2].method1614();
        }
        if (arg1 != 515880227) {
            field9039 = 49;
        }
        for (int var3 = class315.field4365; var3 < class236.field3436.length; var3++) {
            class195.field2889[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!bca", name = "e", descriptor = "(I)V")
    public abstract void method742(int arg0);

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIIIII)V")
    public abstract void method747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(ILqo;III)Leba;")
    public static final class588 method3717(int arg0, class22 arg1, int arg2, int arg3, int arg4) {
        field9036++;
        if (arg0 <= 42) {
            method3718(123);
        }
        if (!arg1.field615 && (!class476.method2796(82, arg3) || !class476.method2796(81, arg4))) {
            return arg1.field659 ? new class588(arg1, 34037, arg2, arg3, arg4) : new class588(arg1, arg2, arg3, arg4, class529.method3059(arg3, (byte) 108), class529.method3059(arg4, (byte) 108));
        } else {
            return new class588(arg1, 3553, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "(III[I)V")
    public abstract void method771(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!bca", name = "f", descriptor = "(I)V")
    public static void method3718(int arg0) {
        field9035 = null;
        if (arg0 != -31777) {
            method3716(null, -89);
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "()Lbca;")
    public abstract class661 method763();

    @OriginalMember(owner = "client!bca", name = "g", descriptor = "(I)V")
    public abstract void method768(int arg0);

    @OriginalMember(owner = "client!bca", name = "h", descriptor = "(I)V")
    public static final void method3719(int arg0) {
        field9040++;
        if (!class443.field6309 || arg0 != 3553) {
            return;
        }
        while (true) {
            while (class690.field9322.length > class653.field8957) {
                class420 var1 = class690.field9322[class653.field8957];
                if (var1 != null && var1.field6068 == -1) {
                    if (class530.field7313 == null) {
                        class530.field7313 = class440.field6266.method1250(arg0 ^ 0xFFFFE698, var1.field6074);
                    }
                    int var2 = class530.field7313.field8993;
                    if (var2 == -1) {
                        return;
                    }
                    var1.field6068 = var2;
                    class653.field8957++;
                    class530.field7313 = null;
                } else {
                    class653.field8957++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "()V")
    public abstract void method745();
}
