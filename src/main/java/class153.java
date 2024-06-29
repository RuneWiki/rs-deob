import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class153 implements Runnable {

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "[Lak;")
    public volatile class134[] field2850 = new class134[2];

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "Z")
    public volatile boolean field2853 = false;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "Z")
    public volatile boolean field2840 = false;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "Lhj;")
    public static class69 field2843 = class181.method1318("blinken1:", (byte) -115);

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "Lhj;")
    public static class69 field2846 = class181.method1318("Null", (byte) -120);

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field2841 = 0;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public static int field2848 = 0;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "Lhj;")
    public static class69 field2851 = class181.method1318("Abbrechen", (byte) -113);

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "Lhj;")
    public static class69 field2844 = class181.method1318("document)3cookie=(R", (byte) -118);

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "Lhj;")
    private static class69 field2852 = class181.method1318("Please wait )2 attempting to reestablish)3", (byte) -109);

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "Lhj;")
    public static class69 field2855 = field2852;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "Lsd;")
    public class42 field2857;

    @OriginalMember(owner = "client!gk", name = "run", descriptor = "()V")
    public final void run() {
        this.field2840 = true;
        field2842++;
        try {
            while (!this.field2853) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class134 var2 = this.field2850[var1];
                    if (var2 != null) {
                        var2.method995((byte) 107);
                    }
                }
                class59.method356(false, 10L);
                class203.method1473(this.field2857, -36, (Object) null);
            }
        } catch (Exception var9) {
            class222.method1575((String) null, var9, -75);
        } finally {
            Object var6 = null;
            this.field2840 = false;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
    public static final void method1158(byte arg0) {
        class165.method1223(-236904444);
        field2856++;
        class241.method1707(true);
        class230.method1642(121);
        class237.method1674(127);
        class103.method755(1902917697);
        class22.method128(97);
        class39.method213(109);
        class80.method570(-1);
        class149.method1120(103);
        class55.method325(true);
        class262.method1799((byte) 8);
        class240.method1701(1628772609);
        class84.method619((byte) -128);
        class4.method15((byte) 60);
        ((class104) class178.field3236).method783((byte) -119);
        class265.field4712.method1451(false);
        class38.field521.method607(68);
        class55.field989.method607(22);
        int var1 = -104 % ((-arg0 - 52) / 40);
        class106.field1994.method607(43);
        class69.field1339.method607(32);
        class173.field3171.method607(85);
        class91.field1723.method607(52);
        class120.field2268.method607(120);
        class98.field1859.method607(105);
        class194.field3544.method607(26);
        class212.field3845.method607(119);
        class147.field2723.method607(63);
        class227.field4133.method1713(-90);
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V")
    public static final void method1159(byte arg0) {
        field2858++;
        class229.field4197.method1713(arg0 ^ 0x4A);
        if (arg0 != -19) {
            field2851 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static final void method1160(int arg0) {
        field2847++;
        for (class175 var1 = (class175) class59.field1067.method1724(255); var1 != null; var1 = (class175) class59.field1067.method1726(118)) {
            if (var1.field3187) {
                var1.method1274(-5226);
            }
        }
        for (class175 var2 = (class175) class94.field1751.method1724(255); var2 != null; var2 = (class175) class94.field1751.method1726(105)) {
            if (var2.field3187) {
                var2.method1274(-5226);
            }
        }
        if (arg0 < 70) {
            method1162(-50, 39);
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V")
    public static void method1161(int arg0) {
        field2852 = null;
        field2855 = null;
        if (arg0 == 0) {
            field2846 = null;
            field2851 = null;
            field2844 = null;
            field2843 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)V")
    public static final void method1162(int arg0, int arg1) {
        if (arg0 != 0) {
            method1160(119);
        }
        field2854++;
        class135 var2 = class8.method38((byte) 126, 3, arg1);
        var2.method1012((byte) 31);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lnc;B)V")
    public static final void method1163(class83 arg0, byte arg1) {
        class132.field2457 = class263.method1801(class140.field2617, 0, -9859, arg0);
        class235.field4286 = new class121[class132.field2457.length];
        class126.field2312 = new class121[class132.field2457.length];
        class272.field4821 = new class121[class132.field2457.length];
        field2849++;
        for (int var2 = 0; var2 < class132.field2457.length; var2++) {
            class132.field2457[var2].method871();
            class235.field4286[var2] = class132.field2457[var2].method876();
            class132.field2457[var2].method871();
            class126.field2312[var2] = class132.field2457[var2].method876();
            class132.field2457[var2].method871();
            class272.field4821[var2] = class132.field2457[var2].method876();
            class132.field2457[var2].method871();
        }
        class80.field1530 = class109.method820(arg0, class149.field2780, 0, -1);
        class12.field182 = class162.method1210(arg0, class139.field2604, 0, 13);
        class206.field3764 = class162.method1210(arg0, class10.field92, 0, 13);
        class33.field472 = class162.method1210(arg0, class246.field4497, 0, 13);
        class268.field4769 = class162.method1210(arg0, class71.field1390, 0, 13);
        class13.field195 = class200.method1457(class146.field2703, arg0, 0, 1);
        class54.field970 = class200.method1457(class177.field3220, arg0, 0, 1);
        class229.field4195 = class142.method1086(2, arg0, 0, class106.field2004);
        class24.field356 = class200.method1457(class268.field4762, arg0, 0, 1);
        class105.field1976 = class200.method1457(class58.field1059, arg0, 0, 1);
        class145.field2687 = class221.method1564(class159.field2945, 5, 0, arg0);
        class128.field2398 = class221.method1564(class131.field2433, 5, 0, arg0);
        class227.field4139.method1614(class128.field2398, (int[]) null);
        class155.field2897.method1614(class128.field2398, (int[]) null);
        class26.field378.method1614(class128.field2398, (int[]) null);
        class264 var3 = class241.method1715(119, class40.field564, 0, arg0);
        var3.method1831();
        class53.field946 = var3;
        class264[] var4 = class109.method820(arg0, class146.field2692, 0, -1);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method1831();
        }
        class144.field2677 = var4;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 41.0D) - 20;
        int var10 = 7 % ((arg1 - 34) / 49);
        for (int var11 = 0; var11 < class80.field1530.length; var11++) {
            class80.field1530[var11].method1825(var6 + var9, var7 + var9, var8 + var9);
        }
        class132.field2457[0].method875(var6 + var9, var7 - -var9, var8 + var9);
        class58.field1043 = class80.field1530;
    }
}
