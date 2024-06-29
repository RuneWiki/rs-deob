import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class382 extends class114 {

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!ll", name = "r", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lcb;Lcb;Lsc;)V", line = 4)
    public class382(class544 arg0, class544 arg1, class365 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 10)
    public static final boolean method2346(String arg0, int arg1) {
        ++field5463;
        if (arg1 > -78) {
            method2348(43, -26, 118);
        }
        return class45.field658.containsKey(arg0);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIBZ)V", line = 24)
    public final void method810(int arg0, int arg1, byte arg2, boolean arg3) {
        ++field5462;
        int var5 = this.method813(arg2 ^ 13) * super.field1443.field3769 / 10000;
        class638.field8979.method474(arg1, arg0 - -2, var5, super.field1443.field3773 + -2, ((class365) super.field1443).field5274, 0);
        if (arg2 != 105) {
            method2347(61, (int[]) null, -80, 85, 64);
        }
        class638.field8979.method474(arg1 - -var5, arg0 + 2, -var5 + super.field1443.field3769, super.field1443.field3773 - 2, 0, 0);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I[IIII)V", line = 38)
    public static final void method2347(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        ++field5465;
        --arg0;
        int var13 = arg4 - 1;
        int var5 = var13 - arg3;
        while (arg0 < var5) {
            int var6 = arg0 + 1;
            arg1[var6] = arg2;
            int var7 = var6 + 1;
            arg1[var7] = arg2;
            int var8 = var7 + 1;
            arg1[var8] = arg2;
            int var9 = var8 + 1;
            arg1[var9] = arg2;
            int var10 = var9 + 1;
            arg1[var10] = arg2;
            int var11 = var10 + 1;
            arg1[var11] = arg2;
            int var12 = var11 + 1;
            arg1[var12] = arg2;
            arg0 = var12 + 1;
            arg1[arg0] = arg2;
        }
        while (arg0 < var13) {
            ++arg0;
            arg1[arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IZII)V", line = 63)
    public final void method812(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg0 == 1026) {
            ++field5464;
            class638.field8979.method457(arg2 + -2, arg3, super.field1443.field3769 + 4, super.field1443.field3773 + 2, ((class365) super.field1443).field5276, 0);
            class638.field8979.method457(arg2 - 1, arg3 + 1, super.field1443.field3769 + 2, super.field1443.field3773, 0, 0);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)V", line = 79)
    public static final void method2348(int arg0, int arg1, int arg2) {
        ++field5461;
        class678 var3 = class630.method3597(29636, arg1, (long) arg0);
        var3.method3834((byte) 46);
        var3.field9649 = arg2;
    }
}
