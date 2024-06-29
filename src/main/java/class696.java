import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class696 {

    @OriginalMember(owner = "client!gfa", name = "h", descriptor = "I")
    public int field9867;

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "I")
    public int field9861;

    @OriginalMember(owner = "client!gfa", name = "d", descriptor = "I")
    public int field9863;

    @OriginalMember(owner = "client!gfa", name = "e", descriptor = "I")
    public int field9864;

    @OriginalMember(owner = "client!gfa", name = "f", descriptor = "I")
    public static int field9865 = -2;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "I")
    public static int field9860;

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "I")
    public static int field9862;

    @OriginalMember(owner = "client!gfa", name = "g", descriptor = "I")
    public static int field9866;

    @OriginalMember(owner = "client!gfa", name = "i", descriptor = "I")
    public static int field9868;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Lr;Ljn;I)V")
    public static final void method3909(class165 arg0, class668 arg1, int arg2) {
        field9868++;
        class495[] var3 = class495.method2877(arg1, class589.field8540, 0);
        class410.field5803 = new class701[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class410.field5803[var4] = arg0.method216(var3[var4], true);
        }
        class495[] var5 = class495.method2877(arg1, class7.field75, 0);
        class335.field4463 = new class701[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class335.field4463[var6] = arg0.method216(var5[var6], true);
        }
        class495[] var7 = class495.method2877(arg1, class630.field9023, 0);
        class251.field3445 = new class701[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class251.field3445[var8] = arg0.method216(var7[var8], true);
        }
        class495[] var9 = class495.method2877(arg1, class244.field3332, 0);
        class521.field7651 = new class701[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class521.field7651[var10] = arg0.method216(var9[var10], true);
        }
        class495[] var11 = class495.method2877(arg1, class499.field6978, 0);
        client.field3739 = new class701[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            client.field3739[var12] = arg0.method216(var11[var12], true);
        }
        class495[] var13 = class495.method2877(arg1, class359.field4785, 0);
        class524.field7696 = new class701[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class524.field7696[var14] = arg0.method216(var13[var14], true);
        }
        class495[] var15 = class495.method2877(arg1, class137.field1739, 0);
        class612.field8776 = new class701[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class612.field8776[var16] = arg0.method216(var15[var16], true);
        }
        class495[] var17 = class495.method2877(arg1, class320.field4214, 0);
        class335.field4459 = new class701[var17.length];
        int var18 = 0;
        if (arg2 < 107) {
            field9865 = -58;
        }
        while (var18 < var17.length) {
            class335.field4459[var18] = arg0.method216(var17[var18], true);
            var18++;
        }
        class495[] var19 = class495.method2877(arg1, class427.field6131, 0);
        class196.field2377 = new class701[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class196.field2377[var20] = arg0.method216(var19[var20], true);
        }
        class495[] var21 = class495.method2877(arg1, class512.field7511, 0);
        class493.field6894 = new class701[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class493.field6894[var22] = arg0.method216(var21[var22], true);
        }
        class495[] var23 = class495.method2877(arg1, class533.field7784, 0);
        class39.field723 = new class701[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class39.field723[var24] = arg0.method216(var23[var24], true);
        }
        class495[] var25 = class495.method2877(arg1, class610.field8748, 0);
        class156.field1902 = new class701[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class156.field1902[var26] = arg0.method216(var25[var26], true);
        }
        class489.field6829 = arg0.method216(class495.method2874(arg1, class66.field1030, 0), true);
        class612.field8779 = arg0.method216(class495.method2874(arg1, class357.field4764, 0), true);
        class495[] var27 = class495.method2877(arg1, class155.field1897, 0);
        class511.field7470 = new class701[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class511.field7470[var28] = arg0.method216(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!gfa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9862++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Ln;Z)Ln;")
    public static final class17 method3910(class17 arg0, boolean arg1) {
        field9866++;
        if (!arg1) {
            field9865 = 58;
        }
        class17 var2 = client.method1663(arg0);
        if (var2 == null) {
            var2 = arg0.field384;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "([Lub;II)V")
    public static final void method3911(class20[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class20 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field536;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field536 > (var7 & 0x1) + var6) {
                class20 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method3911(arg0, arg1, var4 - 1);
        method3911(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(IIII)V")
    public class696(int arg0, int arg1, int arg2, int arg3) {
        this.field9867 = arg2;
        this.field9861 = arg3;
        this.field9863 = arg0;
        this.field9864 = arg1;
    }
}
