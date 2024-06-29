import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class424 {

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "[I")
    private int[] field6257 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "Liu;")
    public static class390 field6263 = new class390(73, -1);

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!oo", name = "o", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!oo", name = "q", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "Lb;")
    public class209 field6269;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "[I")
    private int[] field6258;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "[S")
    private short[] field6261;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "[S")
    private short[] field6262;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "[S")
    private short[] field6264;

    @OriginalMember(owner = "client!oo", name = "p", descriptor = "[S")
    private short[] field6272;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)Z", line = 6)
    public final boolean method2526(boolean arg0) {
        field6259++;
        boolean var2 = arg0;
        class239 var3 = this.field6269.field2955;
        synchronized (this.field6269.field2955) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field6257[var4] != -1 && !this.field6269.field2955.method1445(47, 0, this.field6257[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)Lfl;", line = 36)
    public final class499 method2527(int arg0) {
        field6273++;
        if (this.field6258 == null) {
            return null;
        }
        class499[] var2 = new class499[this.field6258.length];
        class239 var3 = this.field6269.field2955;
        synchronized (this.field6269.field2955) {
            int var4 = 0;
            while (true) {
                if (this.field6258.length <= var4) {
                    break;
                }
                var2[var4] = class319.method1920(this.field6258[var4], 3424, this.field6269.field2955, 0);
                var4++;
            }
        }
        int var5 = 0;
        int var6 = -5 % ((arg0 + 3) / 49);
        while (this.field6258.length > var5) {
            if (var2[var5].field7615 < 13) {
                var2[var5].method2993(0, (byte) -83);
            }
            var5++;
        }
        class499 var7;
        if (var2.length == 1) {
            var7 = var2[0];
        } else {
            var7 = new class499(var2, var2.length);
        }
        if (var7 == null) {
            return null;
        }
        if (this.field6261 != null) {
            for (int var8 = 0; var8 < this.field6261.length; var8++) {
                var7.method2998(-90, this.field6261[var8], this.field6262[var8]);
            }
        }
        if (this.field6264 != null) {
            for (int var9 = 0; var9 < this.field6264.length; var9++) {
                var7.method2994(this.field6272[var9], this.field6264[var9], (byte) 45);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lae;B)V", line = 108)
    public final void method2528(class156 arg0, byte arg1) {
        if (arg1 >= -19) {
            this.method2527(9);
        }
        field6260++;
        while (true) {
            int var3 = arg0.method941((byte) 125);
            if (var3 == 0) {
                return;
            }
            this.method2535((byte) -105, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)V", line = 130)
    public static final void method2529(int arg0) {
        class136.field1750.method38((byte) -88);
        field6265++;
        class65.field970.method38((byte) -99);
        class378.field5643.method38((byte) -82);
        if (arg0 == 0) {
            class491.field7501.method38((byte) -81);
            class392.field5804.method38((byte) -41);
        }
    }

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "(I)V", line = 153)
    public static final void method2530(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field6268++;
        for (class234 var1 = (class234) class117.field1517.method2096(arg0 - 21400); var1 != null; var1 = (class234) class117.field1517.method2084((byte) 19)) {
            if (var1.field3272 == -1) {
                var1.field3274 = 0;
                if (var1.field3283 >= 0 && var1.field3280 >= 0 && var1.field3283 < class362.field5442 && var1.field3280 < class203.field2813) {
                    class290.method1754(var1, true);
                }
            } else {
                var1.method536(false);
            }
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lis;IIIII)V", line = 182)
    public static final void method2531(class330 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field4795 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class310.field4512[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class373 var13 = class76.field1084[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field4795; var14++) {
                            if (arg0.field4791[var14] == var13.field5595) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field4791[arg0.field4795++] = var13.field5595;
                        if (arg0.field4795 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field4795; var15 < 4; var15++) {
            arg0.field4791[var15] = null;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)V", line = 249)
    public static final void method2532(int arg0, int arg1) {
        class283 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class441 var4 = class459.field6685[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class98.field1339; var5++) {
                    for (int var6 = 0; var6 < class282.field4031; var6++) {
                        var2 = var4.method860(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class41.field628;
                            int var8 = var5 << class41.field628;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class441 var10 = class459.field6685[var9];
                                if (var10 != null) {
                                    int var11 = var4.method848(var6, var5) - var10.method848(var6, var5);
                                    int var12 = var4.method848(var6 + 1, var5) - var10.method848(var6 + 1, var5);
                                    int var13 = var4.method848(var6 + 1, var5 + 1) - var10.method848(var6 + 1, var5 + 1);
                                    int var14 = var4.method848(var6, var5 + 1) - var10.method848(var6, var5 + 1);
                                    var10.method857(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "(I)V", line = 314)
    public static void method2533(int arg0) {
        int var1 = 41 % ((arg0 - 6) / 59);
        field6263 = null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZI)V", line = 330)
    public static final void method2534(boolean arg0, int arg1) {
        field6271++;
        class173 var2 = (class173) class173.field2360.method2096(-21400);
        if (arg1 != -1) {
            return;
        }
        while (var2 != null) {
            if (var2.field2366 != null) {
                class375.field5607.method643(var2.field2366);
                var2.field2366 = null;
            }
            if (var2.field2361 != null) {
                class375.field5607.method643(var2.field2361);
                var2.field2361 = null;
            }
            var2.method536(false);
            var2 = (class173) class173.field2360.method2084((byte) 19);
        }
        if (!arg0) {
            return;
        }
        for (class173 var3 = (class173) class443.field6469.method2096(-21400); var3 != null; var3 = (class173) class443.field6469.method2084((byte) 19)) {
            if (var3.field2366 != null) {
                class375.field5607.method643(var3.field2366);
                var3.field2366 = null;
            }
            var3.method536(false);
        }
        for (class173 var4 = (class173) class99.field1347.method2316(4999); var4 != null; var4 = (class173) class99.field1347.method2308((byte) -55)) {
            if (var4.field2366 != null) {
                class375.field5607.method643(var4.field2366);
                var4.field2366 = null;
            }
            var4.method536(false);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(BILae;)V", line = 398)
    private final void method2535(byte arg0, int arg1, class156 arg2) {
        if (arg1 == 1) {
            arg2.method941((byte) 123);
        } else if (arg1 == 2) {
            int var8 = arg2.method941((byte) 126);
            this.field6258 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field6258[var9] = arg2.method993((byte) -63);
            }
        } else if (arg1 != 3) {
            if (arg1 == 40) {
                int var4 = arg2.method941((byte) 126);
                this.field6262 = new short[var4];
                this.field6261 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field6261[var5] = (short) arg2.method993((byte) -120);
                    this.field6262[var5] = (short) arg2.method993((byte) -70);
                }
            } else if (arg1 == 41) {
                int var6 = arg2.method941((byte) 126);
                this.field6272 = new short[var6];
                this.field6264 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field6264[var7] = (short) arg2.method993((byte) -71);
                    this.field6272[var7] = (short) arg2.method993((byte) -55);
                }
            } else if (arg1 >= 60 && arg1 < 70) {
                this.field6257[arg1 - 60] = arg2.method993((byte) -92);
            }
        }
        if (arg0 > -4) {
            this.field6257 = null;
        }
        field6270++;
    }

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "(I)Z", line = 481)
    public final boolean method2536(int arg0) {
        field6267++;
        if (this.field6258 == null) {
            return true;
        }
        boolean var2 = true;
        class239 var3 = this.field6269.field2955;
        synchronized (this.field6269.field2955) {
            for (int var4 = arg0; var4 < this.field6258.length; var4++) {
                if (!this.field6269.field2955.method1445(arg0 ^ 0x35, 0, this.field6258[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)Lfl;", line = 507)
    public final class499 method2537(byte arg0) {
        field6266++;
        class499[] var2 = new class499[5];
        int var3 = 0;
        class239 var4 = this.field6269.field2955;
        synchronized (this.field6269.field2955) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field6257[var5] != -1) {
                    var2[var3++] = class319.method1920(this.field6257[var5], 3424, this.field6269.field2955, 0);
                }
                var5++;
            }
        }
        if (arg0 < 55) {
            field6263 = null;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field7615 < 13) {
                var2[var6].method2993(0, (byte) -17);
            }
        }
        class499 var7 = new class499(var2, var3);
        if (this.field6261 != null) {
            for (int var8 = 0; var8 < this.field6261.length; var8++) {
                var7.method2998(99, this.field6261[var8], this.field6262[var8]);
            }
        }
        if (this.field6264 != null) {
            for (int var9 = 0; var9 < this.field6264.length; var9++) {
                var7.method2994(this.field6272[var9], this.field6264[var9], (byte) 45);
            }
        }
        return var7;
    }
}
