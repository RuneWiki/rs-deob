import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class325 {

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public int field4438 = 128;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    public int field4453 = 128;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public int field4437;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public int field4444;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    public int field4448;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public int field4454;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "[I")
    public static int[] field4447 = new int[2];

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public static int field4449 = 2;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "Lde;")
    public static class10 field4439 = new class10(13, 0, 1, 0);

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public int field4441;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public int field4442;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public int field4443;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
    public int field4450;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V")
    public static final void method1925(byte arg0) {
        field4445++;
        class416.field6037 = true;
        if (arg0 >= -78) {
            field4439 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public static void method1926(int arg0) {
        if (arg0 <= -21) {
            field4439 = null;
            field4447 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILdk;Lza;)V")
    public static final void method1927(int arg0, class421 arg1, class295 arg2) {
        field4440++;
        class396[] var3 = class396.method2347(arg1, class376.field5399, 0);
        class306.field4149 = new class359[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class306.field4149[var4] = arg2.method555(var3[var4], true);
        }
        class396[] var5 = class396.method2347(arg1, class355.field5133, 0);
        class166.field2548 = new class359[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class166.field2548[var6] = arg2.method555(var5[var6], true);
        }
        class396[] var7 = class396.method2347(arg1, class79.field1115, 0);
        class230.field3224 = new class359[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class230.field3224[var8] = arg2.method555(var7[var8], true);
        }
        class396[] var9 = class396.method2347(arg1, class437.field6313, 0);
        class487.field7056 = new class359[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class487.field7056[var10] = arg2.method555(var9[var10], true);
        }
        class396[] var11 = class396.method2347(arg1, class409.field5789, 0);
        class360.field5175 = new class359[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class360.field5175[var12] = arg2.method555(var11[var12], true);
        }
        class396[] var13 = class396.method2347(arg1, class449.field6584, 0);
        class443.field6382 = new class359[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class443.field6382[var14] = arg2.method555(var13[var14], true);
        }
        class396[] var15 = class396.method2347(arg1, class371.field5319, 0);
        class515.field7542 = new class359[var15.length];
        for (int var16 = arg0; var16 < var15.length; var16++) {
            class515.field7542[var16] = arg2.method555(var15[var16], true);
        }
        class396[] var17 = class396.method2347(arg1, class434.field6278, 0);
        class239.field3301 = new class359[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class239.field3301[var18] = arg2.method555(var17[var18], true);
        }
        class396[] var19 = class396.method2347(arg1, class176.field2645, 0);
        class215.field3055 = new class359[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class215.field3055[var20] = arg2.method555(var19[var20], true);
        }
        class396[] var21 = class396.method2347(arg1, class497.field7280, 0);
        class291.field3949 = new class359[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class291.field3949[var22] = arg2.method555(var21[var22], true);
        }
        class396[] var23 = class396.method2347(arg1, class136.field2063, 0);
        class366.field5259 = new class359[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class366.field5259[var24] = arg2.method555(var23[var24], true);
        }
        class396[] var25 = class396.method2347(arg1, class16.field195, 0);
        class409.field5790 = new class359[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class409.field5790[var26] = arg2.method555(var25[var26], true);
        }
        class151.field2330 = arg2.method555(class396.method2353(arg1, class75.field1063, 0), true);
        class108.field1749 = arg2.method555(class396.method2353(arg1, class443.field6383, 0), true);
        class396[] var27 = class396.method2347(arg1, class35.field540, 0);
        class83.field1226 = new class359[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class83.field1226[var28] = arg2.method555(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lwk;B)V")
    public final void method1928(class325 arg0, byte arg1) {
        field4452++;
        this.field4444 = arg0.field4444;
        this.field4438 = arg0.field4438;
        this.field4437 = arg0.field4437;
        if (arg1 >= 52) {
            this.field4448 = arg0.field4448;
            this.field4454 = arg0.field4454;
            this.field4453 = arg0.field4453;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)Z")
    public static final boolean method1929(boolean arg0) {
        field4451++;
        if (!arg0) {
            method1925((byte) -108);
        }
        return class527.field7690 > 0;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(I)V")
    public class325(int arg0) {
        this.field4437 = arg0;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)Lwk;")
    public final class325 method1930(int arg0) {
        int var2 = 21 % ((50 - arg0) / 44);
        field4446++;
        return new class325(this.field4437, this.field4438, this.field4453, this.field4454, this.field4448, this.field4444);
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(IIIIII)V")
    private class325(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4444 = arg5;
        this.field4453 = arg2;
        this.field4448 = arg4;
        this.field4437 = arg0;
        this.field4438 = arg1;
        this.field4454 = arg3;
    }
}
