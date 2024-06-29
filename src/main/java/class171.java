import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class171 extends class332 {

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public int field2467;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    public int field2468;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "S")
    public static short field2459 = 256;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2461 = "wave2:";

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2457 = "Connecting to update server";

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2458 = "yellow:";

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)I", line = 15)
    public final int method1115(byte arg0) {
        if (arg0 != 24) {
            this.field2468 = -32;
        }
        field2463++;
        return (this.field2467 & 0x1C477D) >> 18;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)I", line = 28)
    public static final int method1116(int arg0, int arg1, int arg2) {
        class286 var3 = (class286) class229.field3337.method1537((long) arg1, -22708);
        field2476++;
        if (var3 == null) {
            return 0;
        } else if (arg0 <= arg2 && arg2 < var3.field4502.length) {
            return var3.field4502[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V", line = 45)
    public static final void method1117(byte arg0) {
        field2469++;
        if (class236.field3463 != null) {
            class236.field3463.method1096((byte) 63);
            class236.field3463 = null;
        }
        class191.method1324(118);
        class299.method2114();
        for (int var1 = 0; var1 < 4; var1++) {
            class149.field2072[var1].method139(119);
        }
        class221.method1522(false, -1);
        System.gc();
        class63.method381(2, 119);
        class253.field3838 = false;
        class195.field2794 = -1;
        class150.method1011(true, 1);
        class328.field4999 = 0;
        class146.field2033 = 0;
        class142.field1992 = 0;
        class118.field1668 = 0;
        class300.field4674 = false;
        for (int var2 = 0; var2 < class167.field2328.length; var2++) {
            class167.field2328[var2] = null;
        }
        int var3 = 119 % ((arg0 + 41) / 55);
        class204.field2864 = 0;
        class127.field1735 = 0;
        for (int var4 = 0; var4 < 2048; var4++) {
            class328.field5009[var4] = null;
            class319.field4898[var4] = null;
        }
        for (int var5 = 0; var5 < 32768; var5++) {
            class223.field3159[var5] = null;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 104; var7++) {
                for (int var8 = 0; var8 < 104; var8++) {
                    class269.field4239[var6][var7][var8] = null;
                }
            }
        }
        class135.method903((byte) 120);
        class196.field2815 = 0;
        class137.method910(95);
        class179.method1244(false, true);
        try {
            class122.method824(class9.field131.field4179, 25315, "loggedout");
        } catch (Throwable var10) {
        }
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(B)Z", line = 151)
    public final boolean method1118(byte arg0) {
        if (arg0 > -51) {
            method1117((byte) 76);
        }
        field2464++;
        return (this.field2467 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)Z", line = 162)
    public final boolean method1119(int arg0) {
        if (arg0 == 1) {
            field2466++;
            return ((this.field2467 & 0x7EE5D46D) >> 30) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)Z", line = 178)
    public final boolean method1120(int arg0) {
        int var2 = -35 % ((44 - arg0) / 59);
        field2478++;
        return (this.field2467 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(II)V", line = 189)
    public class171(int arg0, int arg1) {
        this.field2467 = arg0;
        this.field2468 = arg1;
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)Z", line = 200)
    public final boolean method1121(int arg0) {
        if (arg0 < 113) {
            field2461 = (String) null;
        }
        field2471++;
        return (this.field2467 & 0x24036A69) >> 29 != 0;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)Z", line = 211)
    public final boolean method1122(int arg0, int arg1) {
        field2470++;
        if (arg1 == 1) {
            return (this.field2467 >> arg0 + 1 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "(I)I", line = 225)
    public final int method1123(int arg0) {
        if (arg0 <= 32) {
            this.method1118((byte) -5);
        }
        field2473++;
        return class177.method1214(-103, this.field2467);
    }

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "(I)V", line = 236)
    public static final void method1124(int arg0) {
        field2465++;
        if (arg0 != 107) {
            field2472 = -58;
        }
        class186.field2692 = class340.method2356(8, 0.4F, 4, 8, 2048, (byte) 49, 35, true);
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(B)Z", line = 249)
    public final boolean method1125(byte arg0) {
        field2460++;
        if (arg0 > -82) {
            this.method1125((byte) 1);
        }
        return (this.field2467 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(B)V", line = 263)
    public static final void method1126(byte arg0) {
        if (arg0 >= 88) {
            field2475++;
            class213.field2998.method1241(116);
            class133.field1826.method1241(117);
            class301.field4689.method1241(122);
        }
    }

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "(I)V", line = 276)
    public static void method1127(int arg0) {
        field2457 = null;
        if (arg0 != 0) {
            field2458 = (String) null;
        }
        field2458 = null;
        field2461 = null;
    }

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "(I)Z", line = 292)
    public final boolean method1128(int arg0) {
        if (arg0 != 1) {
            field2457 = (String) null;
        }
        field2462++;
        return (this.field2467 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "(B)Z", line = 304)
    public final boolean method1129(byte arg0) {
        field2477++;
        if (arg0 != -45) {
            this.method1128(5);
        }
        return ((this.field2467 & 0x299BD8) >> 21) != 0;
    }
}
