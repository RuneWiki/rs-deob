import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class20 {

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "Ljr;")
    private class112 field309 = new class112(64);

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "Ljr;")
    public class112 field318 = new class112(50);

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "Lpq;")
    public class195 field319 = new class195(250);

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "Lnia;")
    private class646 field320 = new class646();

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "Z")
    private boolean field300;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "Ldc;")
    private class5 field323;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "Lin;")
    public class91 field299;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    public int field317;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "Lin;")
    private class91 field298;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public int field302;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field321;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "[Ljava/lang/String;")
    private String[] field324;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "[I")
    public static int[] field304 = new int[5];

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "Lmu;")
    public static class303 field296 = new class303(48, -2);

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    public int field322;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "Lpc;")
    public static class670 field316;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)[Lkn;")
    public static final class737[] method151(byte arg0) {
        if (arg0 != -19) {
            method155(null, null, false);
        }
        field311++;
        return new class737[] { class582.field7973, class655.field8997, class262.field3749, class252.field3637, class531.field7325, class259.field3721, class659.field9026, class428.field6140, class113.field1946, class23.field724, class430.field6156, class225.field3208, class556.field7680, class463.field6505 };
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public final void method152(int arg0) {
        class112 var2 = this.field318;
        synchronized (this.field318) {
            this.field318.method999(0);
            if (arg0 != -21804) {
                this.method152(-35);
            }
        }
        field306++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
    public static void method153(boolean arg0) {
        field304 = null;
        if (!arg0) {
            field296 = null;
        }
        field296 = null;
        field316 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lha;IILda;Loo;IZBLha;IZI)Lmi;")
    public final class496 method154(class59 arg0, int arg1, int arg2, class60 arg3, class627 arg4, int arg5, boolean arg6, byte arg7, class59 arg8, int arg9, boolean arg10, int arg11) {
        field297++;
        class496 var13 = this.method163(arg11, (byte) -74, arg9, arg2, arg1, arg5, arg8, arg4);
        if (var13 != null) {
            return var13;
        }
        class352 var14 = this.method162(90, arg9);
        if (arg2 > 1 && var14.field4905 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg2 >= var14.field4974[var16] && var14.field4974[var16] != 0) {
                    var15 = var14.field4905[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method162(127, var15);
            }
        }
        if (arg7 != 83) {
            method157(-83, -37, null, null, false, -49);
        }
        int[] var17 = var14.method2209(arg2, arg10, arg1, arg8, arg0, arg3, arg4, arg5, (byte) -102, arg11);
        if (var17 == null) {
            return null;
        }
        class496 var18;
        if (arg6) {
            var18 = arg0.method621(36, var17, (byte) 94, 0, 36, 32);
        } else {
            var18 = arg8.method621(36, var17, (byte) 94, 0, 36, 32);
        }
        if (!arg6) {
            class646 var19 = new class646();
            var19.field8884 = arg1;
            var19.field8892 = arg4 != null;
            var19.field8891 = arg2;
            var19.field8894 = arg9;
            var19.field8883 = arg5;
            var19.field8893 = arg8.field1158;
            var19.field8895 = arg11;
            this.field319.method1396(70, var18, var19);
        }
        return var18;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lin;Lha;Z)V")
    public static final void method155(class91 arg0, class59 arg1, boolean arg2) {
        field310++;
        class267[] var3 = class267.method1778(arg0, class751.field10513, 0);
        class166.field2600 = new class496[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class166.field2600[var4] = arg1.method356(var3[var4], true);
        }
        class267[] var5 = class267.method1778(arg0, class62.field1238, 0);
        class19.field294 = new class496[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class19.field294[var6] = arg1.method356(var5[var6], true);
        }
        class267[] var7 = class267.method1778(arg0, class61.field1199, 0);
        class294.field4119 = new class496[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class294.field4119[var8] = arg1.method356(var7[var8], true);
        }
        class267[] var9 = class267.method1778(arg0, class59.field1153, 0);
        class328.field4566 = new class496[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class328.field4566[var10] = arg1.method356(var9[var10], true);
        }
        class267[] var11 = class267.method1778(arg0, class549.field7555, 0);
        class231.field3346 = new class496[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class231.field3346[var12] = arg1.method356(var11[var12], true);
        }
        class267[] var13 = class267.method1778(arg0, class375.field5312, 0);
        class280.field3932 = new class496[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class280.field3932[var14] = arg1.method356(var13[var14], true);
        }
        class267[] var15 = class267.method1778(arg0, class307.field4267, 0);
        class241.field3523 = new class496[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class241.field3523[var16] = arg1.method356(var15[var16], true);
        }
        class267[] var17 = class267.method1778(arg0, class612.field8371, 0);
        class160.field2568 = new class496[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class160.field2568[var18] = arg1.method356(var17[var18], true);
        }
        class267[] var19 = class267.method1778(arg0, class507.field7060, 0);
        class527.field7300 = new class496[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class527.field7300[var20] = arg1.method356(var19[var20], true);
        }
        class267[] var21 = class267.method1778(arg0, class536.field7416, 0);
        class682.field9238 = new class496[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class682.field9238[var22] = arg1.method356(var21[var22], true);
        }
        class267[] var23 = class267.method1778(arg0, class652.field8956, 0);
        class214.field3041 = new class496[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class214.field3041[var24] = arg1.method356(var23[var24], true);
        }
        class267[] var25 = class267.method1778(arg0, class556.field7678, 0);
        class536.field7418 = new class496[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class536.field7418[var26] = arg1.method356(var25[var26], true);
        }
        class334.field4682 = arg1.method356(class267.method1780(arg0, class684.field9254, 0), arg2);
        class94.field1658 = arg1.method356(class267.method1780(arg0, class453.field6394, 0), true);
        class267[] var27 = class267.method1778(arg0, class629.field8659, 0);
        class455.field6416 = new class496[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class455.field6416[var28] = arg1.method356(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BZ)V")
    public final void method156(byte arg0, boolean arg1) {
        if (arg0 != 11) {
            method157(97, -31, null, null, false, 53);
        }
        field307++;
        if (this.field300 != arg1) {
            this.field300 = arg1;
            this.method161(arg0 ^ 0xFFFFFFEB);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILhw;Lka;ZI)V")
    public static final void method157(int arg0, int arg1, class132 arg2, class472 arg3, boolean arg4, int arg5) {
        field301++;
        if (arg3 != null) {
            if (arg4) {
                method151((byte) 106);
            }
            arg2.method1089(arg3.method493(), arg3.method486(), (byte) -4, arg5, arg3.method505(), arg0, arg3.method509(), arg3.method512(), arg3.method506(), arg1, arg3.method532());
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
    public final void method158(int arg0) {
        field312++;
        class195 var2 = this.field319;
        synchronized (this.field319) {
            this.field319.method1393((byte) -126);
            int var3 = -63 / ((21 - arg0) / 50);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)V")
    public final void method159(int arg0, boolean arg1) {
        field305++;
        class112 var3 = this.field309;
        synchronized (this.field309) {
            this.field309.method987(2, arg0);
        }
        class112 var4 = this.field318;
        synchronized (this.field318) {
            if (arg1) {
                this.method161(-11);
            }
            this.field318.method987(2, arg0);
        }
        class195 var5 = this.field319;
        synchronized (this.field319) {
            this.field319.method1394(-1491, arg0);
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
    public final void method160(int arg0) {
        field303++;
        class112 var2 = this.field309;
        synchronized (this.field309) {
            this.field309.method996(-88);
        }
        class112 var3 = this.field318;
        synchronized (this.field318) {
            this.field318.method996(-85);
        }
        class195 var4 = this.field319;
        synchronized (this.field319) {
            this.field319.method1392((byte) -124);
        }
        if (arg0 < 105) {
            this.field299 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
    public final void method161(int arg0) {
        class112 var2 = this.field309;
        synchronized (this.field309) {
            if (arg0 > -28) {
                this.field323 = null;
            }
            this.field309.method999(0);
        }
        field308++;
        class112 var3 = this.field318;
        synchronized (this.field318) {
            this.field318.method999(0);
        }
        class195 var4 = this.field319;
        synchronized (this.field319) {
            this.field319.method1393((byte) 47);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Lrq;")
    public final class352 method162(int arg0, int arg1) {
        field314++;
        class112 var3 = this.field309;
        class352 var4;
        synchronized (this.field309) {
            var4 = (class352) this.field309.method992((long) arg1, 90);
        }
        if (var4 != null) {
            return var4;
        }
        class91 var5 = this.field298;
        byte[] var6;
        synchronized (this.field298) {
            var6 = this.field298.method863(-1860, class452.method2690(7, arg1), class296.method1943(-23590, arg1));
        }
        class352 var7 = new class352();
        var7.field4904 = this;
        var7.field4912 = arg1;
        var7.field4954 = new String[] { null, null, class497.field6898.method2936(this.field317, 544), null, null };
        var7.field4906 = new String[] { null, null, null, null, class497.field6899.method2936(this.field317, 544) };
        if (var6 != null) {
            var7.method2216(768, new class215(var6));
        }
        var7.method2210((byte) 92);
        int var8 = 4 / ((arg0 - 13) / 59);
        if (var7.field4976 != -1) {
            var7.method2217(1, this.method162(90, var7.field4901), this.method162(101, var7.field4976));
        }
        if (var7.field4955 != -1) {
            var7.method2203(this.method162(-58, var7.field4921), (byte) -29, this.method162(-82, var7.field4955));
        }
        if (!this.field300 && var7.field4926) {
            var7.field4938 = class497.field6896.method2936(this.field317, 544);
            var7.field4970 = 0;
            var7.field4954 = this.field321;
            var7.field4906 = this.field324;
            var7.field4898 = false;
            var7.field4915 = null;
            if (var7.field4900 != null) {
                boolean var9 = false;
                for (class362 var10 = var7.field4900.method1469(0); var10 != null; var10 = var7.field4900.method1467(0)) {
                    class118 var11 = this.field323.method19((int) var10.field5204, 28364);
                    if (var11.field2005) {
                        var10.method2314((byte) 60);
                    } else {
                        var9 = true;
                    }
                }
                if (!var9) {
                    var7.field4900 = null;
                }
            }
        }
        class112 var12 = this.field309;
        synchronized (this.field309) {
            this.field309.method991(var7, (long) arg1, (byte) -118);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBIIIILha;Loo;)Lmi;")
    public final class496 method163(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, class59 arg6, class627 arg7) {
        this.field320.field8894 = arg2;
        this.field320.field8891 = arg3;
        this.field320.field8893 = arg6.field1158;
        this.field320.field8883 = arg5;
        if (arg1 != -74) {
            this.field320 = null;
        }
        this.field320.field8892 = arg7 != null;
        this.field320.field8884 = arg4;
        field313++;
        this.field320.field8895 = arg0;
        return (class496) this.field319.method1388(123, this.field320);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)V")
    public final void method164(int arg0, byte arg1) {
        this.field322 = arg0;
        field315++;
        class112 var3 = this.field318;
        synchronized (this.field318) {
            this.field318.method999(0);
            int var4 = 89 % ((-arg1 - 65) / 60);
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lsj;IZLdc;Lin;Lin;)V")
    public class20(class460 arg0, int arg1, boolean arg2, class5 arg3, class91 arg4, class91 arg5) {
        this.field300 = arg2;
        this.field323 = arg3;
        this.field299 = arg5;
        this.field317 = arg1;
        this.field298 = arg4;
        if (this.field298 == null) {
            this.field302 = 0;
        } else {
            int var7 = this.field298.method867(-1) - 1;
            this.field302 = this.field298.method860(0, var7) + var7 * 256;
        }
        this.field321 = new String[] { null, null, class497.field6898.method2936(this.field317, 544), null, null };
        this.field324 = new String[] { null, null, null, null, class497.field6899.method2936(this.field317, 544) };
    }
}
