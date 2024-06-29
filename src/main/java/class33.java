import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class33 extends class136 {

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    private int field534 = 128;

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
    private int field531 = 0;

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
    private int field540 = 128;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "Z")
    public boolean field527 = false;

    @OriginalMember(owner = "client!cj", name = "W", descriptor = "I")
    private int field545 = 0;

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "I")
    public int field542 = -1;

    @OriginalMember(owner = "client!cj", name = "bb", descriptor = "I")
    private int field550 = 0;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "J")
    public static long field528 = 0L;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
    public static int field536 = 0;

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "I")
    public static int field541 = -1;

    @OriginalMember(owner = "client!cj", name = "V", descriptor = "Li;")
    private static class88 field544 = class208.method1425(105, "Close");

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "Li;")
    public static class88 field530 = field544;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "Ljava/lang/Object;")
    public static Object field533 = new Object();

    @OriginalMember(owner = "client!cj", name = "fb", descriptor = "Li;")
    public static class88 field554 = class208.method1425(105, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!cj", name = "db", descriptor = "Li;")
    public static class88 field552 = class208.method1425(105, "Schlie-8en");

    @OriginalMember(owner = "client!cj", name = "cb", descriptor = "[I")
    public static int[] field551 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!cj", name = "eb", descriptor = "Li;")
    public static class88 field553 = class208.method1425(105, "<col=40ff00>");

    @OriginalMember(owner = "client!cj", name = "gb", descriptor = "Lid;")
    public static class92 field555 = new class92(128);

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "I")
    public int field539;

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!cj", name = "X", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!cj", name = "Y", descriptor = "I")
    private int field547;

    @OriginalMember(owner = "client!cj", name = "hb", descriptor = "Lmf;")
    public static class137 field556;

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "[S")
    private short[] field529;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "[S")
    private short[] field537;

    @OriginalMember(owner = "client!cj", name = "Z", descriptor = "[S")
    private short[] field548;

    @OriginalMember(owner = "client!cj", name = "ab", descriptor = "[S")
    private short[] field549;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLi;)Lwe;")
    public static final class244 method207(byte arg0, class88 arg1) {
        field535++;
        if (arg1.method604((byte) -53) == 0) {
            return null;
        }
        int var2 = 44 % ((arg0 + 31) / 45);
        for (class244 var3 = (class244) class159.field3051.method1612(false); var3 != null; var3 = (class244) class159.field3051.method1621(82)) {
            if (var3.field4488.method595(16567, arg1)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILea;B)V")
    private final void method208(int arg0, class46 arg1, byte arg2) {
        field546++;
        if (arg0 == 1) {
            this.field547 = arg1.method301(75);
        } else if (arg0 == 2) {
            this.field542 = arg1.method301(arg2 + 34);
        } else if (arg0 == 4) {
            this.field540 = arg1.method301(arg2 ^ 0x7B);
        } else if (arg0 == 5) {
            this.field534 = arg1.method301(47);
        } else if (arg0 == 6) {
            this.field545 = arg1.method301(arg2 - 36);
        } else if (arg0 == 7) {
            this.field550 = arg1.method347(26119);
        } else if (arg0 == 8) {
            this.field531 = arg1.method347(arg2 + 26069);
        } else if (arg0 == 9) {
            this.field527 = true;
        } else if (arg0 == 40) {
            int var6 = arg1.method347(26119);
            this.field537 = new short[var6];
            this.field549 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field537[var7] = (short) arg1.method301(arg2 - 12);
                this.field549[var7] = (short) arg1.method301(51);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method347(26119);
            this.field548 = new short[var4];
            this.field529 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field529[var5] = (short) arg1.method301(111);
                this.field548[var5] = (short) arg1.method301(67);
            }
        }
        if (arg2 != 50) {
            method207((byte) -48, null);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)Lcg;")
    public final class30 method209(int arg0, byte arg1) {
        field532++;
        int var3 = -98 % ((arg1 - 72) / 41);
        class30 var4 = (class30) class230.field4304.method135(-98, (long) this.field539);
        if (var4 == null) {
            class82 var5 = class82.method568(class141.field2609, this.field547, 0);
            if (var5 == null) {
                return null;
            }
            if (this.field537 != null) {
                for (int var6 = 0; var6 < this.field537.length; var6++) {
                    var5.method564(this.field537[var6], this.field549[var6]);
                }
            }
            if (this.field529 != null) {
                for (int var7 = 0; var7 < this.field529.length; var7++) {
                    var5.method553(this.field529[var7], this.field548[var7]);
                }
            }
            var4 = var5.method546(this.field550 + 64, this.field531 + 850, -30, -50, -30);
            class230.field4304.method130(37, (long) this.field539, var4);
        }
        class30 var8;
        if (this.field542 == -1 || arg0 == -1) {
            var8 = var4.method185(true, true);
        } else {
            var8 = class15.method75(this.field542, (byte) -54).method743(8517, var4, arg0);
        }
        if (this.field540 != 128 || this.field534 != 128) {
            var8.method183(this.field540, this.field534, this.field540);
        }
        if (this.field545 != 0) {
            if (this.field545 == 90) {
                var8.method182();
            }
            if (this.field545 == 180) {
                var8.method190();
            }
            if (this.field545 == 270) {
                var8.method181();
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V")
    public static final void method210(int arg0) {
        field538++;
        class223.field4198 = 0;
        class192.field3704 = 0;
        class168.method1153((byte) -117);
        class16.method79((byte) 62);
        class95.method677(true);
        class172.method1220((byte) -78);
        for (int var1 = 0; var1 < class223.field4198; var1++) {
            int var3 = class53.field999[var1];
            if (class117.field2115 != class244.field4493[var3].field4083) {
                class244.field4493[var3] = null;
            }
        }
        if (class228.field4272 != class230.field4314.field831) {
            throw new RuntimeException("gpp1 pos:" + class230.field4314.field831 + " psize:" + class228.field4272);
        }
        for (int var2 = 0; var2 < class55.field1027; var2++) {
            if (class244.field4493[class174.field3430[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class55.field1027);
            }
        }
        if (arg0 != 19190) {
            method207((byte) -128, null);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lea;B)V")
    public final void method211(class46 arg0, byte arg1) {
        if (arg1 < 8) {
            method212((byte) -84);
        }
        field543++;
        while (true) {
            int var3 = arg0.method347(26119);
            if (var3 == 0) {
                return;
            }
            this.method208(var3, arg0, (byte) 50);
        }
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(B)V")
    public static void method212(byte arg0) {
        if (arg0 < 78) {
            return;
        }
        field556 = null;
        field554 = null;
        field544 = null;
        field551 = null;
        field553 = null;
        field533 = null;
        field530 = null;
        field555 = null;
        field552 = null;
    }
}
