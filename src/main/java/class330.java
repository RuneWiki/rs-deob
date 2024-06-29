import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class330 {

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "Z")
    public boolean field5258 = false;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field5253 = 0;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "Z")
    public static boolean field5250 = true;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "Z")
    public static boolean field5256 = false;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public static int field5261 = 0;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "F")
    public static float field5248;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public int field5254;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public int field5259;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public int field5262;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "J")
    public long field5260;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "Luk;")
    public class104 field5257;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V", line = 5)
    public static final void method2288(int arg0) {
        field5255++;
        while (class276.field4398.method30(class308.field4906, (byte) 75) >= 11) {
            int var1 = class276.field4398.method35(11, (byte) 93);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class135.field2359[var1] == null) {
                class135.field2359[var1] = new class205();
                var2 = true;
                if (class56.field868[var1] != null) {
                    class135.field2359[var1].method1537(class56.field868[var1], 64);
                }
            }
            class119.field2064[class291.field4664++] = var1;
            class205 var3 = class135.field2359[var1];
            var3.field2029 = class181.field3045;
            int var4 = class276.field4398.method35(5, (byte) -115);
            int var5 = class114.field1923[class276.field4398.method35(3, (byte) 109)];
            if (var4 > 15) {
                var4 -= 32;
            }
            if (var2) {
                var3.field1951 = var3.field1946 = var5;
            }
            int var6 = class276.field4398.method35(5, (byte) -116);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class276.field4398.method35(1, (byte) -7);
            if (var7 == 1) {
                class146.field2641[class119.field2067++] = var1;
            }
            int var8 = class276.field4398.method35(1, (byte) -114);
            var3.method1536(class218.field3632.field1975[0] + var4, var8 == 1, class218.field3632.field2034[0] + var6, (byte) 101);
        }
        class276.field4398.method32(arg0 - 24294);
        if (arg0 != -16) {
            field5251 = 51;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZ)V", line = 75)
    public static final void method2289(int arg0, boolean arg1) {
        if (arg0 != 149) {
            method2290((class104) null, 63, -115, -106);
        }
        field5252++;
        class7.field90 = arg1;
        if (!class7.field90) {
            int var26 = class276.field4398.method2328((byte) 118);
            int var27 = class276.field4398.method2362(arg0 - 38);
            boolean var28 = class249.method1749(-24417, class276.field4398.method2355(18113));
            int var29 = class276.field4398.method2348(255);
            int var30 = (class308.field4906 - class276.field4398.field5353) / 16;
            class44.field706 = new int[var30][4];
            for (int var31 = 0; var31 < var30; var31++) {
                for (int var32 = 0; var32 < 4; var32++) {
                    class44.field706[var31][var32] = class276.field4398.method2375(4043);
                }
            }
            int var33 = class276.field4398.method2328((byte) 114);
            int var34 = class276.field4398.method2328((byte) 113);
            class154.field2746 = new int[var30];
            class88.field1386 = new int[var30];
            class180.field3039 = new byte[var30][];
            class349.field5547 = new int[var30];
            class310.field4910 = new byte[var30][];
            class56.field866 = new int[var30];
            class277.field4409 = new byte[var30][];
            class100.field1618 = (byte[][]) null;
            class201.field3431 = null;
            boolean var35 = false;
            class276.field4400 = new int[var30];
            if ((var26 / 8 == 48 || var26 / 8 == 49) && (var33 / 8) == 48) {
                var35 = true;
            }
            if (var26 / 8 == 48 && (var33 / 8) == 148) {
                var35 = true;
            }
            class144.field2624 = new byte[var30][];
            int var36 = 0;
            for (int var37 = (var26 - 6) / 8; var37 <= (var26 + 6) / 8; var37++) {
                for (int var38 = (var33 - 6) / 8; var38 <= (var33 + 6) / 8; var38++) {
                    int var39 = (var37 << 8) + var38;
                    if (var35 && var38 == 49 || var38 == 149 || var38 == 147 || var37 == 50 || !(var37 != 49 || var38 != 47)) {
                        class56.field866[var36] = var39;
                        class88.field1386[var36] = -1;
                        class349.field5547[var36] = -1;
                        class154.field2746[var36] = -1;
                        class276.field4400[var36] = -1;
                    } else {
                        class56.field866[var36] = var39;
                        class88.field1386[var36] = class92.field1446.method437((byte) -33, "m" + var37 + "_" + var38);
                        class349.field5547[var36] = class92.field1446.method437((byte) -33, "l" + var37 + "_" + var38);
                        class154.field2746[var36] = class92.field1446.method437((byte) -33, "um" + var37 + "_" + var38);
                        class276.field4400[var36] = class92.field1446.method437((byte) -33, "ul" + var37 + "_" + var38);
                    }
                    var36++;
                }
            }
            class318.method2191(var34, var28, var33, var27, var26, (byte) -125, var29, false);
            return;
        }
        int var2 = class276.field4398.method2355(18113);
        class276.field4398.method29(true);
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 13; var4++) {
                for (int var5 = 0; var5 < 13; var5++) {
                    int var6 = class276.field4398.method35(1, (byte) 45);
                    if (var6 == 1) {
                        class222.field3700[var3][var4][var5] = class276.field4398.method35(26, (byte) -2);
                    } else {
                        class222.field3700[var3][var4][var5] = -1;
                    }
                }
            }
        }
        class276.field4398.method32(-24310);
        int var7 = (class308.field4906 - class276.field4398.field5353) / 16;
        class44.field706 = new int[var7][4];
        for (int var8 = 0; var8 < var7; var8++) {
            for (int var9 = 0; var9 < 4; var9++) {
                class44.field706[var8][var9] = class276.field4398.method2338((byte) 21);
            }
        }
        int var10 = class276.field4398.method2362(106);
        boolean var11 = class249.method1749(-24417, class276.field4398.method2355(arg0 + 17964));
        int var12 = class276.field4398.method2350(false);
        int var13 = class276.field4398.method2362(102);
        int var14 = class276.field4398.method2339((byte) -46);
        class349.field5547 = new int[var7];
        class277.field4409 = new byte[var7][];
        class180.field3039 = new byte[var7][];
        class88.field1386 = new int[var7];
        class310.field4910 = new byte[var7][];
        class201.field3431 = null;
        class276.field4400 = new int[var7];
        class154.field2746 = new int[var7];
        class144.field2624 = new byte[var7][];
        class100.field1618 = (byte[][]) null;
        class56.field866 = new int[var7];
        int var15 = 0;
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = class222.field3700[var16][var17][var18];
                    if (var19 != -1) {
                        int var20 = var19 >> 14 & 0x3FF;
                        int var21 = var19 >> 3 & 0x7FF;
                        int var22 = (var20 / 8 << 8) + var21 / 8;
                        for (int var23 = 0; var23 < var15; var23++) {
                            if (class56.field866[var23] == var22) {
                                var22 = -1;
                                break;
                            }
                        }
                        if (var22 != -1) {
                            class56.field866[var15] = var22;
                            int var24 = (var22 & 0xFFB4) >> 8;
                            int var25 = var22 & 0xFF;
                            class88.field1386[var15] = class92.field1446.method437((byte) -33, "m" + var24 + "_" + var25);
                            class349.field5547[var15] = class92.field1446.method437((byte) -33, "l" + var24 + "_" + var25);
                            class154.field2746[var15] = class92.field1446.method437((byte) -33, "um" + var24 + "_" + var25);
                            class276.field4400[var15] = class92.field1446.method437((byte) -33, "ul" + var24 + "_" + var25);
                            var15++;
                        }
                    }
                }
            }
        }
        class318.method2191(var12, var11, var10, var14, var13, (byte) -77, var2, false);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Luk;III)V", line = 322)
    public static final void method2290(class104 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class123.field2134) {
            class257 var4 = class279.field4430[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field4140 != null && var4.field4140.field5257.method896()) {
                arg0.method894(var4.field4140.field5257, 128, 0, 0, true);
            }
        }
        if (arg3 < class123.field2134) {
            class257 var5 = class279.field4430[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field4140 != null && var5.field4140.field5257.method896()) {
                arg0.method894(var5.field4140.field5257, 0, 0, 128, true);
            }
        }
        if (arg2 < class123.field2134 && arg3 < class185.field3144) {
            class257 var6 = class279.field4430[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field4140 != null && var6.field4140.field5257.method896()) {
                arg0.method894(var6.field4140.field5257, 128, 0, 128, true);
            }
        }
        if (arg2 < class123.field2134 && arg3 > 0) {
            class257 var7 = class279.field4430[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field4140 != null && var7.field4140.field5257.method896()) {
                arg0.method894(var7.field4140.field5257, 128, 0, -128, true);
            }
        }
    }
}
