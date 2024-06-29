import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class383 implements class287 {

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Ljm;")
    private class448 field5262 = new class448(256);

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "Lr;")
    private class110 field5270;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "Lr;")
    private class110 field5272;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "[Luc;")
    private class23[] field5273;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "Lld;")
    public static class105 field5275;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "Lh;")
    public static class434 field5276;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "Lr;")
    public static class110 field5271;

    static {
        new class206("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
        field5275 = new class105();
        field5276 = new class434(8, 2);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIII)Z", line = 4)
    public static final boolean method2350(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5263++;
        if ((class1.field26[0][arg4][arg0] & 0x2) != 0) {
            return true;
        } else if ((class1.field26[arg2][arg4][arg0] & 0x10) == 0) {
            if (arg3 <= 68) {
                method2350(82, 91, -97, 47, 96);
            }
            return class301.method1687(arg0, -31596, arg4, arg2) == arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V", line = 27)
    public static final void method2351(byte arg0) {
        class250.field3335.method135(arg0 - 124);
        field5267++;
        for (int var1 = 0; var1 < 32; var1++) {
            class102.field1470[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class45.field617[var2] = 0L;
        }
        class188.field2576 = 0;
        if (arg0 != 123) {
            field5271 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(FIIZII)[I", line = 53)
    public final int[] method1619(float arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field5277++;
        if (arg1 != -6322) {
            method2351((byte) -91);
        }
        return this.method2353(-4, arg5).method556(this, this.field5270, (double) arg0, 1034273904, this.field5273[arg5].field313, arg4, arg2);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)Z", line = 69)
    public final boolean method1620(int arg0, int arg1) {
        field5265++;
        if (arg0 != -3810) {
            method2351((byte) 79);
        }
        class87 var3 = this.method2353(-4, arg1);
        return var3 != null && var3.method553(8012, this, this.field5270);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 83)
    public static final void method2352(int arg0) {
        field5269++;
        if (class30.field400 == arg0) {
            return;
        }
        try {
            if (++class128.field1893 > 2000) {
                if (class280.field3743 != null) {
                    class280.field3743.method2310(-99);
                    class280.field3743 = null;
                }
                if (class466.field6460 >= 1) {
                    class293.field3922 = -5;
                    class30.field400 = 0;
                    return;
                }
                class128.field1893 = 0;
                if (class95.field1403 == class265.field3503) {
                    class265.field3503 = class289.field3890;
                } else {
                    class265.field3503 = class95.field1403;
                }
                class30.field400 = 1;
                class466.field6460++;
            }
            if (class30.field400 == 1) {
                class268.field3583 = class251.field3359.method1333(class168.field2325, class265.field3503, 1);
                class30.field400 = 2;
            }
            if (class30.field400 == 2) {
                if (class268.field3583.field6534 == 2) {
                    throw new IOException();
                }
                if (class268.field3583.field6534 != 1) {
                    return;
                }
                class280.field3743 = new class375((Socket) class268.field3583.field6529, class251.field3359);
                class268.field3583 = null;
                class280.field3743.method2308(false, 0, class203.field2751.field456, class203.field2751.field472);
                if (class259.field3433 != null) {
                    class259.field3433.method851(8);
                }
                if (class98.field1434 != null) {
                    class98.field1434.method851(8);
                }
                int var1 = class280.field3743.method2311(arg0 ^ 0x1);
                if (class259.field3433 != null) {
                    class259.field3433.method851(8);
                }
                if (class98.field1434 != null) {
                    class98.field1434.method851(8);
                }
                if (var1 != 21) {
                    class293.field3922 = var1;
                    class30.field400 = 0;
                    class280.field3743.method2310(-115);
                    class280.field3743 = null;
                    return;
                }
                class30.field400 = 3;
            }
            if (class30.field400 == 3) {
                if (class280.field3743.method2306(1) < 1) {
                    return;
                }
                class67.field907 = new String[class280.field3743.method2311(1)];
                class30.field400 = 4;
            }
            if (class30.field400 == 4 && class280.field3743.method2306(1) >= class67.field907.length * 8) {
                class314.field4171.field456 = 0;
                class280.field3743.method2304(class314.field4171.field472, class67.field907.length * 8, arg0 ^ 0x1, 0);
                for (int var2 = 0; var2 < class67.field907.length; var2++) {
                    class67.field907[var2] = class357.method2188(class314.field4171.method184(-24867872), -525737785);
                }
                class30.field400 = 0;
                class293.field3922 = 21;
                class280.field3743.method2310(arg0 - 112);
                class280.field3743 = null;
            }
        } catch (IOException var3) {
            if (class280.field3743 != null) {
                class280.field3743.method2310(arg0 ^ 0xFFFFFFB1);
                class280.field3743 = null;
            }
            if (class466.field6460 >= 1) {
                class30.field400 = 0;
                class293.field3922 = -4;
            } else {
                class128.field1893 = 0;
                class30.field400 = 1;
                class466.field6460++;
                if (class95.field1403 == class265.field3503) {
                    class265.field3503 = class289.field3890;
                } else {
                    class265.field3503 = class95.field1403;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(II)Lqm;", line = 250)
    private final class87 method2353(int arg0, int arg1) {
        field5261++;
        if (arg0 != -4) {
            field5271 = null;
        }
        class403 var3 = this.field5262.method2635((long) arg1, (byte) -78);
        if (var3 != null) {
            return (class87) var3;
        }
        byte[] var4 = this.field5272.method695(arg1, -119);
        if (var4 == null) {
            return null;
        } else {
            class87 var5 = new class87(new class32(var4));
            this.field5262.method2638((byte) 112, var5, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lr;Lr;Lr;)V", line = 277)
    public class383(class110 arg0, class110 arg1, class110 arg2) {
        this.field5270 = arg2;
        this.field5272 = arg1;
        class32 var4 = new class32(arg0.method702((byte) 82, 0, 0));
        int var5 = var4.method215((byte) 102);
        this.field5273 = new class23[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method201((byte) -111) == 1) {
                this.field5273[var6] = new class23();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field5273[var7] != null) {
                this.field5273[var7].field302 = var4.method201((byte) -128) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field5273[var8] != null) {
                this.field5273[var8].field310 = var4.method201((byte) -125) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field5273[var9] != null) {
                this.field5273[var9].field309 = var4.method201((byte) -109) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field5273[var10] != null) {
                this.field5273[var10].field294 = var4.method201((byte) -127) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field5273[var11] != null) {
                this.field5273[var11].field312 = var4.method211(29861);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field5273[var12] != null) {
                this.field5273[var12].field314 = var4.method211(29861);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field5273[var13] != null) {
                this.field5273[var13].field301 = var4.method211(29861);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field5273[var14] != null) {
                this.field5273[var14].field315 = var4.method211(29861);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field5273[var15] != null) {
                this.field5273[var15].field295 = (short) var4.method215((byte) 126);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field5273[var16] != null) {
                this.field5273[var16].field307 = var4.method211(29861);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field5273[var17] != null) {
                this.field5273[var17].field311 = var4.method211(29861);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field5273[var18] != null) {
                this.field5273[var18].field304 = var4.method201((byte) -112) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field5273[var19] != null) {
                this.field5273[var19].field313 = var4.method201((byte) -118) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field5273[var20] != null) {
                this.field5273[var20].field293 = var4.method211(29861);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field5273[var21] != null) {
                this.field5273[var21].field296 = var4.method201((byte) -117) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field5273[var22] != null) {
                this.field5273[var22].field303 = var4.method201((byte) -122) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field5273[var23] != null) {
                this.field5273[var23].field297 = var4.method201((byte) -105) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V", line = 461)
    public static void method2354(boolean arg0) {
        field5276 = null;
        field5275 = null;
        if (arg0) {
            field5276 = null;
        }
        field5271 = null;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)Luc;", line = 473)
    public final class23 method1621(int arg0, int arg1) {
        if (arg0 != 18318) {
            field5274 = 17;
        }
        field5264++;
        return this.field5273[arg1];
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BZIIFI)[F", line = 491)
    public final float[] method1623(byte arg0, boolean arg1, int arg2, int arg3, float arg4, int arg5) {
        int var7 = 72 % ((arg0 + 32) / 52);
        field5268++;
        return this.method2353(-4, arg2).method552(false, this.field5270, this, this.field5273[arg2].field313, arg3, arg5);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZIIFI)[I", line = 501)
    public final int[] method1622(int arg0, boolean arg1, int arg2, int arg3, float arg4, int arg5) {
        if (arg2 >= -109) {
            this.method1622(-66, true, -116, 31, 0.17054366F, 44);
        }
        field5266++;
        return this.method2353(-4, arg0).method554(this.field5273[arg0].field313, (double) arg4, arg5, arg3, this.field5270, arg1, 85, this);
    }
}
