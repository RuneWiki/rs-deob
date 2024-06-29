import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class33 extends class137 {

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "Ltl;")
    private class59 field470 = class293.field5003;

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "I")
    public static int field472 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "I")
    public static int field483 = 0;

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "Ltl;")
    public static class59 field490 = class85.method639("Abbrechen", 9588);

    @OriginalMember(owner = "client!aa", name = "B", descriptor = "Leh;")
    public static class94 field474 = new class94(16);

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!aa", name = "A", descriptor = "I")
    public int field473;

    @OriginalMember(owner = "client!aa", name = "C", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "I")
    private int field481;

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "I")
    public int field485;

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!aa", name = "G", descriptor = "Leh;")
    public class94 field478;

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "Leh;")
    private class94 field487;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Z", line = 10)
    public final boolean method216(int arg0, int arg1) {
        field477++;
        if (this.field478 == null) {
            return false;
        }
        if (this.field487 == null) {
            this.method227((byte) 123);
        }
        class174 var3 = (class174) this.field487.method685((long) arg0, 128);
        if (arg1 >= -109) {
            method220(false);
        }
        return var3 != null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ls;I)V", line = 36)
    public final void method217(class170 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1221(89);
            if (var3 == 0) {
                field488++;
                if (arg1 >= -23) {
                    this.method216(14, -64);
                }
                return;
            }
            this.method219(74, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ltl;ZB)V", line = 68)
    public static final void method218(class59 arg0, boolean arg1, byte arg2) {
        class59 var3 = arg0.method466(125);
        int var4 = 0;
        field476++;
        short[] var5 = new short[16];
        for (int var6 = 0; var6 < class147.field2416; var6++) {
            class44 var7 = class81.method616(var6, (byte) 25);
            if ((!arg1 || var7.field660) && var7.field673 == -1 && var7.field657 == -1 && var7.field695 == 0 && var7.field699.method466(122).method478(var3, (byte) 112) != -1) {
                if (var4 >= 250) {
                    class86.field1361 = -1;
                    class150.field2460 = null;
                    return;
                }
                if (var5.length <= var4) {
                    short[] var8 = new short[var5.length * 2];
                    for (int var9 = 0; var9 < var4; var9++) {
                        var8[var9] = var5[var9];
                    }
                    var5 = var8;
                }
                var5[var4++] = (short) var6;
            }
        }
        class150.field2460 = var5;
        class86.field1361 = var4;
        class44.field675 = 0;
        class59[] var10 = new class59[class86.field1361];
        int var11 = 0;
        if (arg2 > -95) {
            method221(11, -97, -8, -35);
        }
        while (class86.field1361 > var11) {
            var10[var11] = class81.method616(var5[var11], (byte) 25).field699;
            var11++;
        }
        class219.method1520(-1, var10, class150.field2460);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILs;I)V", line = 141)
    private final void method219(int arg0, class170 arg1, int arg2) {
        if (arg2 == 1) {
            this.field473 = arg1.method1221(80);
        } else if (arg2 == 2) {
            this.field485 = arg1.method1221(114);
        } else if (arg2 == 3) {
            this.field470 = arg1.method1250(false);
        } else if (arg2 == 4) {
            this.field481 = arg1.method1233((byte) -77);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method1214(-18254);
            this.field478 = new class94(class43.method293(true, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1233((byte) -77);
                class287 var7;
                if (arg2 == 5) {
                    var7 = new class252(arg1.method1250(false));
                } else {
                    var7 = new class174(arg1.method1233((byte) -77));
                }
                this.field478.method694(var7, (byte) -90, (long) var6);
            }
        }
        field479++;
        if (arg0 <= 50) {
            this.method216(-18, -70);
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)V", line = 194)
    public static void method220(boolean arg0) {
        field474 = null;
        if (arg0) {
            field490 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIII)I", line = 231)
    public static final int method221(int arg0, int arg1, int arg2, int arg3) {
        field489++;
        int var4 = arg2 & 0x3;
        if (arg3 == var4) {
            return arg1;
        } else if (var4 == 1) {
            return 1023 - arg0;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIILme;)Z", line = 251)
    public static final boolean method222(int arg0, int arg1, int arg2, class295 arg3) {
        byte[] var4 = arg3.method2042(arg1, arg2, (byte) -119);
        field480++;
        if (var4 == null) {
            return false;
        } else {
            class111.method806(var4, arg0 ^ 0xFFFFFF9F);
            return arg0 == 6 ? true : true;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)I", line = 271)
    public final int method223(int arg0, int arg1) {
        field475++;
        if (this.field478 == null) {
            return this.field481;
        }
        if (arg1 != 2) {
            this.field473 = -123;
        }
        class174 var3 = (class174) this.field478.method685((long) arg0, 128);
        return var3 == null ? this.field481 : var3.field2851;
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)V", line = 293)
    private final void method224(int arg0) {
        field486++;
        this.field487 = new class94(this.field478.method689(arg0 ^ 0x4950));
        if (arg0 != 0) {
            this.method224(91);
        }
        for (class252 var2 = (class252) this.field478.method692(arg0 + 64); var2 != null; var2 = (class252) this.field478.method693((byte) 106)) {
            class316 var3 = new class316(var2.field4195, (int) var2.field4932);
            this.field487.method694(var3, (byte) -90, var2.field4195.method486(false));
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)Ltl;", line = 315)
    public final class59 method225(int arg0, byte arg1) {
        field468++;
        if (this.field478 == null) {
            return this.field470;
        }
        if (arg1 != -10) {
            field483 = 75;
        }
        class252 var3 = (class252) this.field478.method685((long) arg0, 128);
        return var3 == null ? this.field470 : var3.field4195;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ltl;Z)Z", line = 338)
    public final boolean method226(class59 arg0, boolean arg1) {
        field482++;
        if (this.field478 == null) {
            return false;
        }
        if (this.field487 == null) {
            this.method224(0);
        }
        class316 var3 = (class316) this.field487.method685(arg0.method486(false), 128);
        if (!arg1) {
            field483 = 61;
        }
        while (var3 != null) {
            if (var3.field5330.method453(arg0, (byte) -72)) {
                return true;
            }
            var3 = (class316) this.field487.method688(126);
        }
        return false;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V", line = 374)
    private final void method227(byte arg0) {
        this.field487 = new class94(this.field478.method689(arg0 + 18645));
        field484++;
        if (arg0 == 123) {
            for (class174 var2 = (class174) this.field478.method692(arg0 - 59); var2 != null; var2 = (class174) this.field478.method693((byte) 106)) {
                class174 var3 = new class174((int) var2.field4932);
                this.field487.method694(var3, (byte) -90, (long) var2.field2851);
            }
        }
    }
}
