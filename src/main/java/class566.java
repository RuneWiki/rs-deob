import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class566 extends class288 {

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public int field7484;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public int field7485;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    public int field7488;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public int field7482;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public int field7480;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public int field7481;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "[I")
    public static int[] field7490 = new int[14];

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "I")
    public static int field7487;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "Z")
    public static boolean field7483;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V", line = 5)
    public static void method3099(boolean arg0) {
        field7490 = null;
        if (arg0) {
            field7483 = false;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Loa;BLbi;)V", line = 16)
    public static final void method3100(class651 arg0, byte arg1, class449 arg2) {
        field7487++;
        class500[] var3 = class500.method2777(arg2, class429.field5891, 0);
        class153.field2419 = new class468[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class153.field2419[var4] = arg0.method440(var3[var4], true);
        }
        class500[] var5 = class500.method2777(arg2, class483.field6539, 0);
        class270.field3760 = new class468[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class270.field3760[var6] = arg0.method440(var5[var6], true);
        }
        class500[] var7 = class500.method2777(arg2, class142.field2291, 0);
        class672.field9513 = new class468[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class672.field9513[var8] = arg0.method440(var7[var8], true);
        }
        class500[] var9 = class500.method2777(arg2, class308.field4261, 0);
        class379.field5083 = new class468[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class379.field5083[var10] = arg0.method440(var9[var10], true);
        }
        class500[] var11 = class500.method2777(arg2, class371.field5008, 0);
        class218.field3104 = new class468[var11.length];
        if (arg1 < 9) {
            method3100(null, (byte) 45, null);
        }
        for (int var12 = 0; var12 < var11.length; var12++) {
            class218.field3104[var12] = arg0.method440(var11[var12], true);
        }
        class500[] var13 = class500.method2777(arg2, class364.field4925, 0);
        class179.field2737 = new class468[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class179.field2737[var14] = arg0.method440(var13[var14], true);
        }
        class500[] var15 = class500.method2777(arg2, class330.field4532, 0);
        class284.field4022 = new class468[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class284.field4022[var16] = arg0.method440(var15[var16], true);
        }
        class500[] var17 = class500.method2777(arg2, class254.field3518, 0);
        class226.field3189 = new class468[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class226.field3189[var18] = arg0.method440(var17[var18], true);
        }
        class500[] var19 = class500.method2777(arg2, class54.field740, 0);
        class548.field7313 = new class468[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class548.field7313[var20] = arg0.method440(var19[var20], true);
        }
        class500[] var21 = class500.method2777(arg2, class646.field8661, 0);
        class683.field9617 = new class468[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class683.field9617[var22] = arg0.method440(var21[var22], true);
        }
        class500[] var23 = class500.method2777(arg2, class670.field9503, 0);
        class618.field8205 = new class468[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class618.field8205[var24] = arg0.method440(var23[var24], true);
        }
        class500[] var25 = class500.method2777(arg2, class64.field983, 0);
        class391.field5159 = new class468[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class391.field5159[var26] = arg0.method440(var25[var26], true);
        }
        class115.field1980 = arg0.method440(class500.method2770(arg2, class671.field9505, 0), true);
        class628.field8474 = arg0.method440(class500.method2770(arg2, class146.field2337, 0), true);
        class500[] var27 = class500.method2777(arg2, class624.field8253, 0);
        class55.field756 = new class468[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class55.field756[var28] = arg0.method440(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIB)V", line = 150)
    public static final void method3101(int arg0, int arg1, int arg2, byte arg3) {
        field7486++;
        class382 var4 = class396.method2276(-106, 9, arg1);
        if (arg3 > 64) {
            var4.method2232(-45);
            var4.field5106 = arg0;
            var4.field5099 = arg2;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)Los;", line = 168)
    public class412 method193(byte arg0) {
        if (arg0 >= -21) {
            return null;
        } else {
            field7489++;
            return class145.field2329;
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lrt;Lcp;IIIIIIIIIIIII)V", line = 180)
    public class566(class212 arg0, class679 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field7484 = arg9;
        this.field7485 = arg10;
        this.field7488 = arg14;
        this.field7482 = arg13;
        this.field7480 = arg12;
        this.field7481 = arg11;
    }
}
