import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class172 extends class34 {

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "[Lle;")
    public class125[] field3060;

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "Lke;")
    public static class256 field3051 = class316.method2202("Connect-B au serveur de mise -9 jour", 27626);

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "Lke;")
    public static class256 field3054 = class316.method2202("Sprites geladen)3", 27626);

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "Lrj;")
    public static class254 field3052 = new class254(16);

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "Lla;")
    public static class188 field3063 = null;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "Lrd;")
    public static class135 field3058;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(Z)V", line = 7)
    public static final void method1248(boolean arg0) {
        class274.field4740.method2076(97);
        field3062++;
        if (arg0) {
            method1253(26);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)Z", line = 18)
    public final boolean method1249(int arg0, byte arg1) {
        if (arg1 < 27) {
            method1251((byte) 43);
        }
        field3057++;
        return this.field3060[arg0].field2220;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZLke;)V", line = 41)
    public static final void method1250(int arg0, boolean arg1, class256 arg2) {
        class308.field5322.method1599(120, (byte) 98);
        class308.field5322.method367(arg2.method1780(arg1), (byte) -94);
        field3055++;
        class126.field2226++;
        class308.field5322.method308(arg0, -2);
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V", line = 53)
    public static final void method1251(byte arg0) {
        class294.field5107.method2076(112);
        field3059++;
        int var1 = 62 % ((arg0 + 70) / 43);
    }

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)V", line = 72)
    public static void method1252(int arg0) {
        field3052 = null;
        field3054 = null;
        if (arg0 > -59) {
            field3053 = 115;
        }
        field3058 = null;
        field3063 = null;
        field3051 = null;
    }

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "(I)I", line = 86)
    public static final int method1253(int arg0) {
        if (arg0 < 55) {
            method1253(-122);
        }
        field3056++;
        return ((class38.field694 == 0 ? 0 : 1) << 21) + ((class171.field3050 ? 1 : 0) << 19) + ((class74.field1373 ? 1 : 0) << 16) + ((class281.field4880 ? 1 : 0) << 15) + (class17.field241 & 0x3 << 11) + ((class181.field3216 ? 1 : 0) << 10) + ((class11.field165 ? 1 : 0) << 9) + ((class115.field2026 ? 1 : 0) << 8) + ((class85.field1537 ? 1 : 0) << 4) + ((class257.field4455 ? 1 : 0) << 3) + (class106.field1895 & 0x7) + ((class65.field1167 ? 1 : 0) << 5) + ((class236.field4032 ? 1 : 0) << 6) + ((class95.field1695 ? 1 : 0) << 7) + ((class193.field3531 ? 1 : 0) << 13) + ((class29.field422 == 0 ? 0 : 1) << 20) + ((class70.field1292 == 0 ? 0 : 1) << 22) + (class283.method1978() << 23);
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lng;Lng;IZ)V", line = 115)
    public class172(class138 arg0, class138 arg1, int arg2, boolean arg3) {
        class175 var5 = new class175();
        int var6 = arg0.method991(arg2, -1);
        this.field3060 = new class125[var6];
        int[] var7 = arg0.method1001(-2658, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1016(arg2, 100, var7[var8]);
            class230 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class230 var12 = (class230) var5.method1270((byte) -121); var12 != null; var12 = (class230) var5.method1277(1)) {
                if (var12.field3939 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1010(var11, 0, 24977);
                } else {
                    var13 = arg1.method1010(0, var11, 24977);
                }
                var10 = new class230(var11, var13);
                var5.method1269(false, var10);
            }
            this.field3060[var7[var8]] = new class125(var9, var10);
        }
    }
}
