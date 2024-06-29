import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class84 extends class425 {

    @OriginalMember(owner = "client!bp", name = "r", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field1140;

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!bp", name = "q", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!bp", name = "n", descriptor = "Lhda;")
    public static class245 field1136;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lqa;Lkr;I)V")
    public static final void method475(class167 arg0, class329 arg1, int arg2) {
        field1138++;
        class295[] var3 = class295.method1803(arg1, class30.field480, 0);
        class170.field2165 = new class116[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class170.field2165[var4] = arg0.method916(var3[var4], true);
        }
        class295[] var5 = class295.method1803(arg1, class463.field6586, 0);
        class372.field5172 = new class116[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class372.field5172[var6] = arg0.method916(var5[var6], true);
        }
        class295[] var7 = class295.method1803(arg1, class163.field2069, 0);
        class80.field1078 = new class116[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class80.field1078[var8] = arg0.method916(var7[var8], true);
        }
        class295[] var9 = class295.method1803(arg1, class80.field1079, 0);
        class52.field695 = new class116[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class52.field695[var10] = arg0.method916(var9[var10], true);
        }
        class295[] var11 = class295.method1803(arg1, class327.field4487, 0);
        class445.field6165 = new class116[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class445.field6165[var12] = arg0.method916(var11[var12], true);
        }
        class295[] var13 = class295.method1803(arg1, class522.field7273, 0);
        class428.field5842 = new class116[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class428.field5842[var14] = arg0.method916(var13[var14], true);
        }
        class295[] var15 = class295.method1803(arg1, class389.field5405, 0);
        class525.field7312 = new class116[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class525.field7312[var16] = arg0.method916(var15[var16], true);
        }
        class295[] var17 = class295.method1803(arg1, class360.field5026, 0);
        class644.field9337 = new class116[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class644.field9337[var18] = arg0.method916(var17[var18], true);
        }
        class295[] var19 = class295.method1803(arg1, class612.field8804, 0);
        class92.field1225 = new class116[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class92.field1225[var20] = arg0.method916(var19[var20], true);
        }
        class295[] var21 = class295.method1803(arg1, class424.field5746, 0);
        class526.field7325 = new class116[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class526.field7325[var22] = arg0.method916(var21[var22], true);
        }
        class295[] var23 = class295.method1803(arg1, class512.field7134, 0);
        class629.field9179 = new class116[var23.length];
        for (int var24 = arg2; var24 < var23.length; var24++) {
            class629.field9179[var24] = arg0.method916(var23[var24], true);
        }
        class295[] var25 = class295.method1803(arg1, class263.field3357, 0);
        class44.field632 = new class116[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class44.field632[var26] = arg0.method916(var25[var26], true);
        }
        class453.field6424 = arg0.method916(class295.method1806(arg1, class372.field5183, 0), true);
        class53.field708 = arg0.method916(class295.method1806(arg1, class74.field1015, 0), true);
        class295[] var27 = class295.method1803(arg1, class626.field9116, 0);
        class183.field2337 = new class116[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class183.field2337[var28] = arg0.method916(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
    public final void method476(byte arg0) {
        this.field1140.method3192();
        field1137++;
        if (arg0 > -84) {
            this.field1140 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(B)V")
    public static void method477(byte arg0) {
        if (arg0 == -90) {
            field1136 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(I)V")
    public class84(int arg0) {
        this.field1140 = new NativeHeap(arg0);
    }
}
