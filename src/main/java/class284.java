import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class284 {

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "[B")
    public static byte[] field4082 = new byte[2048];

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "[[Z")
    public static boolean[][] field4089 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "Z")
    public static boolean field4091 = false;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Lki;")
    public static class498 field4086 = new class498(66, 4);

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "[I")
    public static int[] field4092 = new int[13];

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public int field4080;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "Lsq;")
    public class117 field4083;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "Llg;")
    public class284 field4087;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Ldr;")
    public static class504 field4084;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public final void method1837(int arg0) {
        if (arg0 > -96) {
            method1838(105, -24);
        }
        field4090++;
        if (class74.field1106 >= 500) {
            return;
        }
        this.field4083 = null;
        this.field4087 = class91.field1370;
        this.field4080 = 0;
        class74.field1106++;
        class91.field1370 = this;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)V")
    public static final void method1838(int arg0, int arg1) {
        field4085++;
        if (arg0 != 25558) {
            field4084 = null;
        }
        class338 var2 = class230.method1580(7, -1332166328, arg1);
        var2.method2052(arg0 - 25458);
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
    public static void method1839(int arg0) {
        field4084 = null;
        field4086 = null;
        field4092 = null;
        field4089 = null;
        if (arg0 != 0) {
            field4089 = null;
        }
        field4082 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILic;Lqa;)V")
    public static final void method1840(int arg0, class491 arg1, class162 arg2) {
        field4081++;
        class408[] var3 = class408.method2460(arg1, class68.field1042, 0);
        class423.field6358 = new class529[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class423.field6358[var4] = arg2.method1030(var3[var4], true);
        }
        class408[] var5 = class408.method2460(arg1, class474.field6984, 0);
        class87.field1334 = new class529[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class87.field1334[var6] = arg2.method1030(var5[var6], true);
        }
        class408[] var7 = class408.method2460(arg1, class266.field3897, 0);
        class164.field2419 = new class529[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class164.field2419[var8] = arg2.method1030(var7[var8], true);
        }
        class408[] var9 = class408.method2460(arg1, class154.field2278, 0);
        class485.field7149 = new class529[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class485.field7149[var10] = arg2.method1030(var9[var10], true);
        }
        class408[] var11 = class408.method2460(arg1, class19.field210, 0);
        class495.field7328 = new class529[var11.length];
        if (arg0 > -56) {
            method1840(68, null, null);
        }
        for (int var12 = 0; var12 < var11.length; var12++) {
            class495.field7328[var12] = arg2.method1030(var11[var12], true);
        }
        class408[] var13 = class408.method2460(arg1, class435.field6512, 0);
        class250.field3711 = new class529[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class250.field3711[var14] = arg2.method1030(var13[var14], true);
        }
        class408[] var15 = class408.method2460(arg1, class522.field7724, 0);
        class392.field5903 = new class529[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class392.field5903[var16] = arg2.method1030(var15[var16], true);
        }
        class408[] var17 = class408.method2460(arg1, class184.field2742, 0);
        class451.field6710 = new class529[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class451.field6710[var18] = arg2.method1030(var17[var18], true);
        }
        class408[] var19 = class408.method2460(arg1, class493.field7287, 0);
        class334.field4703 = new class529[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class334.field4703[var20] = arg2.method1030(var19[var20], true);
        }
        class408[] var21 = class408.method2460(arg1, class308.field4433, 0);
        class115.field1730 = new class529[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class115.field1730[var22] = arg2.method1030(var21[var22], true);
        }
        class408[] var23 = class408.method2460(arg1, class530.field7819, 0);
        class315.field4502 = new class529[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class315.field4502[var24] = arg2.method1030(var23[var24], true);
        }
        class408[] var25 = class408.method2460(arg1, class33.field347, 0);
        class167.field2476 = new class529[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class167.field2476[var26] = arg2.method1030(var25[var26], true);
        }
        class199.field2884 = arg2.method1030(class408.method2459(arg1, class30.field324, 0), true);
        class475.field6994 = arg2.method1030(class408.method2459(arg1, class265.field3886, 0), true);
        class408[] var27 = class408.method2460(arg1, class390.field5882, 0);
        class302.field4268 = new class529[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class302.field4268[var28] = arg2.method1030(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIII)V")
    public static final void method1841(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 0) {
            method1841(-56, -53, -29, -71, 66);
        }
        field4088++;
        if (class37.field393 <= arg3 && class509.field7436 >= arg3) {
            int var5 = class42.method249(class494.field7297, arg1, (byte) -72, class445.field6629);
            int var6 = class42.method249(class494.field7297, arg2, (byte) -72, class445.field6629);
            class208.method1402(arg4, var6, arg3, var5, (byte) 121);
        }
    }
}
