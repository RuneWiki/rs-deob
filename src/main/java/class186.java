import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class186 {

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Lfo;")
    private class361 field2425;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public int field2422;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Lfo;")
    public static class361 field2420;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "[Lo;")
    public static class24[] field2426;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "[[[Lno;")
    public static class498[][][] field2421;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BLza;Lfo;)V", line = 9)
    public static final void method1077(byte arg0, class287 arg1, class361 arg2) {
        field2424++;
        class491[] var3 = class491.method2976(arg2, class114.field1495, 0);
        class331.field4394 = new class24[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class331.field4394[var4] = arg1.method1236(var3[var4], true);
        }
        class491[] var5 = class491.method2976(arg2, class330.field4385, 0);
        class434.field6332 = new class24[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class434.field6332[var6] = arg1.method1236(var5[var6], true);
        }
        class491[] var7 = class491.method2976(arg2, class35.field352, 0);
        class12.field130 = new class24[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class12.field130[var8] = arg1.method1236(var7[var8], true);
        }
        class491[] var9 = class491.method2976(arg2, class470.field6978, 0);
        class192.field2472 = new class24[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class192.field2472[var10] = arg1.method1236(var9[var10], true);
        }
        class491[] var11 = class491.method2976(arg2, class279.field3699, 0);
        class464.field6907 = new class24[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class464.field6907[var12] = arg1.method1236(var11[var12], true);
        }
        class491[] var13 = class491.method2976(arg2, class5.field55, 0);
        class152.field1984 = new class24[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class152.field1984[var14] = arg1.method1236(var13[var14], true);
        }
        class491[] var15 = class491.method2976(arg2, class454.field6791, 0);
        field2426 = new class24[var15.length];
        if (arg0 != 82) {
            method1077((byte) 102, null, null);
        }
        for (int var16 = 0; var16 < var15.length; var16++) {
            field2426[var16] = arg1.method1236(var15[var16], true);
        }
        class491[] var17 = class491.method2976(arg2, class138.field1849, 0);
        class29.field286 = new class24[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class29.field286[var18] = arg1.method1236(var17[var18], true);
        }
        class491[] var19 = class491.method2976(arg2, class273.field3645, 0);
        class250.field3337 = new class24[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class250.field3337[var20] = arg1.method1236(var19[var20], true);
        }
        class491[] var21 = class491.method2976(arg2, class285.field3754, 0);
        class377.field5277 = new class24[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class377.field5277[var22] = arg1.method1236(var21[var22], true);
        }
        class491[] var23 = class491.method2976(arg2, class125.field1620, 0);
        class513.field7468 = new class24[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class513.field7468[var24] = arg1.method1236(var23[var24], true);
        }
        class491[] var25 = class491.method2976(arg2, class90.field1083, 0);
        class302.field3996 = new class24[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class302.field3996[var26] = arg1.method1236(var25[var26], true);
        }
        class331.field4392 = arg1.method1236(class491.method2969(arg2, class367.field5011, 0), true);
        class483.field7124 = arg1.method1236(class491.method2969(arg2, class291.field3849, 0), true);
        class491[] var27 = class491.method2976(arg2, class48.field532, 0);
        class193.field2498 = new class24[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class193.field2498[var28] = arg1.method1236(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Ld;ILfo;)V", line = 156)
    public class186(class104 arg0, int arg1, class361 arg2) {
        new class509(64);
        this.field2425 = arg2;
        this.field2422 = this.field2425.method2136(-75, 15);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 169)
    public static void method1078(int arg0) {
        if (arg0 >= -32) {
            method1078(70);
        }
        field2426 = null;
        field2420 = null;
        field2421 = null;
    }
}
