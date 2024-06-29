import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class719 extends class254 {

    @OriginalMember(owner = "client!bda", name = "s", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field10077;

    @OriginalMember(owner = "client!bda", name = "t", descriptor = "Lmha;")
    public static class701 field10078 = new class701(128);

    @OriginalMember(owner = "client!bda", name = "v", descriptor = "I")
    public static int field10080 = 0;

    @OriginalMember(owner = "client!bda", name = "r", descriptor = "I")
    public static int field10076;

    @OriginalMember(owner = "client!bda", name = "u", descriptor = "I")
    public static int field10079;

    @OriginalMember(owner = "client!bda", name = "x", descriptor = "I")
    public static int field10082;

    @OriginalMember(owner = "client!bda", name = "y", descriptor = "I")
    public static int field10083;

    @OriginalMember(owner = "client!bda", name = "w", descriptor = "Ljava/lang/Thread;")
    public static Thread field10081;

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "(B)V", line = 3)
    public final void method3965(byte arg0) {
        this.field10077.method2590();
        if (arg0 < -77) {
            field10083++;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V", line = 18)
    public static void method3966(int arg0) {
        field10078 = null;
        if (arg0 != -31051) {
            method3967(null, true);
        }
        field10081 = null;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lvp;Z)Z", line = 30)
    public static final boolean method3967(class559 arg0, boolean arg1) {
        boolean var2 = class211.field3511 == class152.field2374;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method894(240);
        if (arg0.field7927 < 0 || arg0.field7930 < 0 || arg0.field7931 >= class42.field727 || arg0.field7934 >= class54.field870) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field7927; var7 <= arg0.field7931; var7++) {
            for (int var11 = arg0.field7930; var11 <= arg0.field7934; var11++) {
                class114 var12 = class378.method2384(arg0.field9470, var7, var11);
                if (var12 != null) {
                    class291 var13 = class715.method3953(0, arg0);
                    class291 var14 = var12.field1772;
                    if (var14 == null) {
                        var12.field1772 = var13;
                    } else {
                        while (var14.field4479 != null) {
                            var14 = var14.field4479;
                        }
                        var14.field4479 = var13;
                    }
                    if (var2 && (class487.field7049[var7][var11] & 0xFF000000) != 0) {
                        var3 = class487.field7049[var7][var11];
                        var4 = class233.field3752[var7][var11];
                        var5 = class500.field7266[var7][var11];
                    }
                    if (!arg1 && var12.field1768 != null && var12.field1768.field10024 > var6) {
                        var6 = var12.field1768.field10024;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field7927; var8 <= arg0.field7931; var8++) {
                for (int var9 = arg0.field7930; var9 <= arg0.field7934; var9++) {
                    if ((class487.field7049[var8][var9] & 0xFF000000) == 0) {
                        class487.field7049[var8][var9] = var3;
                        class233.field3752[var8][var9] = var4;
                        class500.field7266[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class81.field1166[class266.field4132++] = arg0;
        } else {
            int var10 = class211.field3511 == class152.field2374 ? 1 : 0;
            if (!arg0.method95(0)) {
                arg0.field9472 = class24.field240[var10];
                class24.field240[var10] = arg0;
            } else if (arg0.method86(0)) {
                arg0.field9472 = class231.field3722[var10];
                class231.field3722[var10] = arg0;
            } else {
                arg0.field9472 = class335.field4904[var10];
                class335.field4904[var10] = arg0;
                class245.field3947 = true;
            }
        }
        if (arg1) {
            arg0.field9474 -= var6;
        }
        return true;
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(I)[I", line = 165)
    public static final int[] method3968(int arg0) {
        field10079++;
        int var1 = -85 % ((arg0 + 31) / 42);
        return new int[] { class424.field6234, class715.field10041, field10082 };
    }

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "(I)V", line = 176)
    public static final void method3969(int arg0) {
        class84.field1241 = 0;
        field10076++;
        class285.field4381 = 0;
        int var1 = 0;
        if (arg0 != 27247) {
            field10082 = 11;
        }
        while (var1 < class245.field3937) {
            int var2 = class390.field5830 * var1;
            for (int var3 = 0; var3 < class390.field5830; var3++) {
                int var4 = var2 + var3;
                class70.field1087[var4].method56(class412.field6070 * var3, class362.field5468 * var1, class412.field6070, class362.field5468, 0, 0, true, true);
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(I)V", line = 210)
    public class719(int arg0) {
        this.field10077 = new NativeHeap(arg0);
    }
}
