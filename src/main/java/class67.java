import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class67 {

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public int field1092 = 128;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public int field1089 = 128;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public int field1093;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public int field1080;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public int field1091;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public int field1079;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Loq;")
    public static class231 field1076 = new class231("", 11);

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "Lhi;")
    public static class131 field1084 = new class131(0, 2, 2, 1);

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    public static int field1096 = 0;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public int field1077;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public int field1078;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public int field1081;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "[[S")
    public static short[][] field1088;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)I")
    public static final int method452(int arg0, byte arg1) {
        field1090++;
        return arg1 == -28 ? arg0 >>> 8 : 39;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
    public static void method453(byte arg0) {
        field1084 = null;
        field1088 = null;
        field1076 = null;
        if (arg0 != -57) {
            method456(114, -99, 123, 117, (byte) -14, null, true, null);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZLqq;Llt;)V")
    public static final void method454(boolean arg0, class318 arg1, class458 arg2) {
        field1083++;
        class351[] var3 = class351.method2137(arg2, class382.field5563, 0);
        class383.field5578 = new class154[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class383.field5578[var4] = arg1.method1952(var3[var4], true);
        }
        class351[] var5 = class351.method2137(arg2, class183.field2915, 0);
        class383.field5570 = new class154[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class383.field5570[var6] = arg1.method1952(var5[var6], true);
        }
        class351[] var7 = class351.method2137(arg2, class376.field5489, 0);
        class139.field2284 = new class154[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class139.field2284[var8] = arg1.method1952(var7[var8], true);
        }
        class351[] var9 = class351.method2137(arg2, class220.field3392, 0);
        class18.field244 = new class154[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class18.field244[var10] = arg1.method1952(var9[var10], true);
        }
        class351[] var11 = class351.method2137(arg2, class50.field761, 0);
        class189.field3022 = new class154[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class189.field3022[var12] = arg1.method1952(var11[var12], true);
        }
        class351[] var13 = class351.method2137(arg2, class237.field3589, 0);
        class512.field7766 = new class154[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class512.field7766[var14] = arg1.method1952(var13[var14], true);
        }
        class351[] var15 = class351.method2137(arg2, class35.field491, 0);
        class325.field4878 = new class154[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class325.field4878[var16] = arg1.method1952(var15[var16], true);
        }
        class351[] var17 = class351.method2137(arg2, class78.field1389, 0);
        class144.field2343 = new class154[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class144.field2343[var18] = arg1.method1952(var17[var18], true);
        }
        class351[] var19 = class351.method2137(arg2, class341.field5093, 0);
        class7.field89 = new class154[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class7.field89[var20] = arg1.method1952(var19[var20], true);
        }
        class351[] var21 = class351.method2137(arg2, class420.field6039, 0);
        class54.field820 = new class154[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class54.field820[var22] = arg1.method1952(var21[var22], true);
        }
        class351[] var23 = class351.method2137(arg2, class63.field1048, 0);
        class442.field6679 = new class154[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class442.field6679[var24] = arg1.method1952(var23[var24], true);
        }
        class351[] var25 = class351.method2137(arg2, class161.field2526, 0);
        class480.field7336 = new class154[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class480.field7336[var26] = arg1.method1952(var25[var26], true);
        }
        class90.field1629 = arg1.method1952(class351.method2132(arg2, class446.field6868, 0), true);
        class330.field4946 = arg1.method1952(class351.method2132(arg2, class40.field570, 0), true);
        class351[] var27 = class351.method2137(arg2, class284.field4303, 0);
        if (arg0) {
            field1096 = 73;
        }
        class40.field578 = new class154[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class40.field578[var28] = arg1.method1952(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)Lra;")
    public final class67 method455(byte arg0) {
        int var2 = -113 / ((arg0 + 32) / 45);
        field1094++;
        return new class67(this.field1093, this.field1089, this.field1092, this.field1091, this.field1080, this.field1079);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIBLbl;Z[B)Ljs;")
    public static final class208 method456(int arg0, int arg1, int arg2, int arg3, byte arg4, class442 arg5, boolean arg6, byte[] arg7) {
        field1087++;
        int var8 = -30 % ((-arg4 - 42) / 39);
        if (!arg5.field6727 && (!class110.method789(arg2, 1135345664) || !class110.method789(arg0, 1135345664))) {
            return arg5.field6713 ? new class208(arg5, 34037, arg3, arg2, arg0, arg6, arg7, arg1) : new class208(arg5, arg3, arg2, arg0, class99.method749(arg2, -23866), class99.method749(arg0, -23866), arg7, arg1);
        } else {
            return new class208(arg5, 3553, arg3, arg2, arg0, arg6, arg7, arg1);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLra;)V")
    public final void method457(byte arg0, class67 arg1) {
        this.field1079 = arg1.field1079;
        this.field1089 = arg1.field1089;
        this.field1092 = arg1.field1092;
        if (arg0 > 79) {
            field1085++;
            this.field1093 = arg1.field1093;
            this.field1080 = arg1.field1080;
            this.field1091 = arg1.field1091;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILha;)Lmc;")
    public static final class83 method458(int arg0, class40 arg1) {
        if (arg0 != 0) {
            method458(-4, null);
        }
        field1086++;
        return new class83(arg1.method249(false), arg1.method249(false), arg1.method249(false), arg1.method249(false), arg1.method224(-2), arg1.method224(-2), arg1.method257((byte) 34));
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(I)V")
    public class67(int arg0) {
        this.field1093 = arg0;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(IIIIII)V")
    private class67(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1093 = arg0;
        this.field1080 = arg4;
        this.field1092 = arg2;
        this.field1089 = arg1;
        this.field1091 = arg3;
        this.field1079 = arg5;
    }
}
