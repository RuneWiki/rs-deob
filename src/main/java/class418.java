import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public abstract class class418 {

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
    public volatile int field6003 = 0;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "[F")
    public float[] field6002 = new float[5000];

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
    public volatile int field6011 = 0;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "[B")
    public byte[] field6010 = new byte[5000];

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
    public int field6016 = 0;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "[Ljava/lang/Object;")
    public Object[] field6009 = new Object[5000];

    @OriginalMember(owner = "client!gq", name = "q", descriptor = "I")
    public int field6018 = 0;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
    public static int field6008 = 0;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
    public static int field6013 = -1;

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "[[I")
    public static int[][] field6017 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!gq", name = "r", descriptor = "Ljava/lang/String;")
    public static String field6019;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 3)
    public static final void method2592(String arg0, boolean arg1) {
        if (class330.field4403 == null) {
            class452.method2808(93);
        }
        field6004++;
        String[] var2 = class167.method889(-128, arg0, '\n');
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class330.field4403.length - 1; var4 > 0; var4--) {
                class330.field4403[var4] = class330.field4403[var4 - 1];
            }
            class330.field4403[0] = var2[var3];
        }
        if (arg1) {
            field6017 = null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V", line = 36)
    public static void method2593(int arg0) {
        field6019 = null;
        if (arg0 < 124) {
            method2598(119);
        }
        field6017 = null;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)V", line = 60)
    public static final void method2594(int arg0, int arg1, int arg2) {
        field6007++;
        class40 var3 = class162.method872(arg1, (byte) 92, 6);
        var3.method190(arg0);
        var3.field418 = arg2;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;)V", line = 84)
    public static final void method2595(int arg0, String arg1, String arg2, int arg3, int arg4, String arg5, int arg6, String arg7) {
        field6014++;
        for (int var8 = 99; var8 > 0; var8--) {
            class176.field2210[var8] = class176.field2210[var8 - 1];
            class303.field4117[var8] = class303.field4117[var8 - 1];
            class145.field1865[var8] = class145.field1865[var8 - 1];
            class208.field2834[var8] = class208.field2834[var8 - 1];
            class149.field1899[var8] = class149.field1899[var8 - 1];
            class21.field198[var8] = class21.field198[var8 - 1];
            class119.field1486[var8] = class119.field1486[var8 - 1];
        }
        class176.field2210[0] = arg4;
        class303.field4117[0] = arg3;
        class145.field1865[0] = arg1;
        class208.field2834[0] = arg5;
        class149.field1899[0] = arg2;
        class21.field198[arg0] = arg7;
        class119.field1486[0] = arg6;
        class323.field4315++;
        class230.field3175 = class367.field5142;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V", line = 125)
    public static final void method2596(int arg0) {
        if (arg0 != -11263) {
            method2598(122);
        }
        field6005++;
        while (class448.field6514.method304(arg0 + 11135, class161.field2065) >= 27) {
            int var1 = class448.field6514.method305(15, -7985);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class38.field397[var1] == null) {
                class38.field397[var1] = new class91();
                class38.field397[var1].field6095 = var1;
                var2 = true;
            }
            class91 var3 = class38.field397[var1];
            class308.field4175[class244.field3320++] = var1;
            var3.field6071 = class234.field3224;
            if (var3.field1035 != null && var3.field1035.method2012(arg0 ^ 0x2BFE)) {
                class295.method1734(var3, true);
            }
            int var4 = class327.field4341[class448.field6514.method305(3, arg0 + 3278)];
            int var5 = class448.field6514.method305(1, -7985);
            if (var5 == 1) {
                class192.field2423[class338.field4509++] = var1;
            }
            int var6 = class448.field6514.method305(1, -7985);
            int var7 = class448.field6514.method305(5, -7985);
            var3.method503(class6.method30((byte) -128, class448.field6514.method305(14, -7985)), -31893);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class448.field6514.method305(5, -7985);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method2610((byte) 86, var3.field1035.field4624);
            var3.field6070 = var3.field1035.field4642 << 3;
            if (var3.field6070 == 0) {
                var3.method2600(0, 0);
            } else if (var2) {
                var3.method2600(0, var4);
            }
            var3.method2601(class427.field6264.field6119[0] + var8, class263.field3592, 0, var6 == 1, var3.method857((byte) -106), class427.field6264.field6109[0] + var7);
            if (var3.field1035.method2012(-1)) {
                class222.method1203(-1, 0, var3.field6109[0], var3.field6119[0], var3, (class158) null, class263.field3592, (class225) null);
            }
        }
        class448.field6514.method299((byte) 76);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZBZ)V", line = 206)
    public static final void method2597(boolean arg0, byte arg1, boolean arg2) {
        if (arg2) {
            class271.field3666--;
            if (class271.field3666 == 0) {
                class284.field3878 = null;
            }
        }
        field6006++;
        if (arg0) {
            class54.field553--;
            if (class54.field553 == 0) {
                class180.field2271 = null;
            }
        }
        int var3 = -35 / ((arg1 + 11) / 53);
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)V", line = 237)
    public static final void method2598(int arg0) {
        if (class129.field1664 == 10) {
            class352.method2159(28, (byte) 65);
        }
        field6015++;
        if (class129.field1664 == arg0) {
            class352.method2159(25, (byte) 65);
        }
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(IB)Lnp;", line = 262)
    public static final class205 method2599(int arg0, byte arg1) {
        field6012++;
        class205 var2 = (class205) class122.field1504.method222((long) arg0, -8407);
        if (var2 != null) {
            return var2;
        }
        int var3 = -126 / ((50 - arg1) / 43);
        byte[] var4 = class139.field1787.method1687(arg0, 19, 255);
        class205 var5 = new class205();
        if (var4 != null) {
            var5.method1115(new class250(var4), (byte) 88);
        }
        class122.field1504.method218((long) arg0, (byte) -126, var5);
        return var5;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Le;B)V")
    public abstract void method1085(class96 arg0, byte arg1);

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V")
    public abstract void method1072(byte arg0);

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IB)V")
    public abstract void method1081(int arg0, byte arg1);

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)V")
    public abstract void method1076(byte arg0);

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Le;I)V")
    public abstract void method1078(class96 arg0, int arg1);

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lbl;IFBZ)V")
    public abstract void method1084(class54 arg0, int arg1, float arg2, byte arg3, boolean arg4);

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILe;)V")
    public abstract void method1079(int arg0, class96 arg1);

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(IB)V")
    public abstract void method1077(int arg0, byte arg1);
}
