import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class130 {

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "[I")
    public int[] field1655 = new int[6];

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "[Z")
    public boolean[] field1651 = new boolean[16];

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "[Z")
    public boolean[] field1652 = new boolean[256];

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "[I")
    public int[] field1653 = new int[256];

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "[[I")
    public int[][] field1666 = new int[6][258];

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public int field1656 = 0;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "[B")
    public byte[] field1665 = new byte[18002];

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "[B")
    public byte[] field1661 = new byte[4096];

    @OriginalMember(owner = "client!wl", name = "D", descriptor = "[[I")
    public int[][] field1679 = new int[6][258];

    @OriginalMember(owner = "client!wl", name = "F", descriptor = "[I")
    public int[] field1681 = new int[16];

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
    public int field1669 = 0;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "[B")
    public byte[] field1657 = new byte[256];

    @OriginalMember(owner = "client!wl", name = "I", descriptor = "[[B")
    public byte[][] field1684 = new byte[6][258];

    @OriginalMember(owner = "client!wl", name = "H", descriptor = "[B")
    public byte[] field1683 = new byte[18002];

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "[I")
    public int[] field1667 = new int[257];

    @OriginalMember(owner = "client!wl", name = "J", descriptor = "[[I")
    public int[][] field1685 = new int[6][258];

    @OriginalMember(owner = "client!wl", name = "A", descriptor = "Len;")
    public static class368 field1676 = new class368(0);

    @OriginalMember(owner = "client!wl", name = "B", descriptor = "B")
    public byte field1677;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public int field1650;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public int field1654;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public int field1659;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public int field1660;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public int field1662;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
    public int field1663;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
    public int field1670;

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
    public int field1673;

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "I")
    public int field1674;

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "I")
    public int field1675;

    @OriginalMember(owner = "client!wl", name = "C", descriptor = "I")
    public int field1678;

    @OriginalMember(owner = "client!wl", name = "E", descriptor = "I")
    public int field1680;

    @OriginalMember(owner = "client!wl", name = "G", descriptor = "I")
    public int field1682;

    @OriginalMember(owner = "client!wl", name = "K", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "[B")
    public byte[] field1658;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "[B")
    public byte[] field1664;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lcaa;BLnj;)Lcg;", line = 47)
    public static final class11 method931(class541 arg0, byte arg1, class415 arg2) {
        field1686++;
        class11 var3 = class202.method1317(-18665);
        if (arg1 != 54) {
            method932(109);
        }
        var3.field116 = arg2;
        var3.field113 = arg2.field5333;
        if (var3.field113 == -1) {
            var3.field114 = new class534(260);
        } else if (var3.field113 == -2) {
            var3.field114 = new class534(10000);
        } else if (var3.field113 <= 18) {
            var3.field114 = new class534(20);
        } else if (var3.field113 > 98) {
            var3.field114 = new class534(260);
        } else {
            var3.field114 = new class534(100);
        }
        var3.field114.method2843((byte) -128, arg0);
        var3.field114.method2835(var3.field116.method2340(-53), (byte) 96);
        var3.field120 = 0;
        return var3;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 93)
    public static void method932(int arg0) {
        int var1 = 33 / ((arg0 - 44) / 62);
        field1676 = null;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V", line = 109)
    public static final void method933(int arg0) {
        field1672++;
        class487.method2674((byte) 124, class260.field3509.field1296);
        int var1 = (class499.field6555 >> 12) + (class100.field1326 >> 3);
        int var2 = (class549.field7132 >> 12) + (class186.field2376 >> 3);
        class390.field4991 = class233.field3130.field508 = 0;
        class233.field3130.method1263(8, (byte) 114, 8);
        byte var3 = 18;
        class441.field5704 = new int[var3];
        class545.field7072 = new int[var3];
        class594.field8029 = new byte[var3][];
        class214.field2754 = new byte[var3][];
        class117.field1507 = new byte[var3][];
        class124.field1607 = new byte[var3][];
        class206.field2667 = new int[var3][4];
        if (arg0 != 6) {
            return;
        }
        class515.field6753 = new int[var3];
        class229.field3047 = new byte[var3][];
        class547.field7096 = new int[var3];
        class602.field8103 = new int[var3];
        class266.field3568 = new int[var3];
        int var4 = 0;
        for (int var5 = (var1 - (class611.field8258 >> 4)) / 8; var5 <= (((class611.field8258 >> 4) + var1) / 8); var5++) {
            for (int var8 = (var2 - (class656.field9155 >> 4)) / 8; var8 <= (((class656.field9155 >> 4) + var2) / 8); var8++) {
                int var9 = (var5 << 8) + var8;
                class547.field7096[var4] = var9;
                class266.field3568[var4] = class277.field3630.method3359("m" + var5 + "_" + var8, (byte) -115);
                class515.field6753[var4] = class277.field3630.method3359("l" + var5 + "_" + var8, (byte) -122);
                class545.field7072[var4] = class277.field3630.method3359("n" + var5 + "_" + var8, (byte) -111);
                class602.field8103[var4] = class277.field3630.method3359("um" + var5 + "_" + var8, (byte) -128);
                class441.field5704[var4] = class277.field3630.method3359("ul" + var5 + "_" + var8, (byte) -122);
                if (class545.field7072[var4] == -1) {
                    class266.field3568[var4] = -1;
                    class515.field6753[var4] = -1;
                    class602.field8103[var4] = -1;
                    class441.field5704[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class545.field7072.length; var6++) {
            class545.field7072[var6] = -1;
            class266.field3568[var6] = -1;
            class515.field6753[var6] = -1;
            class602.field8103[var6] = -1;
            class441.field5704[var6] = -1;
        }
        byte var7;
        if (class566.field7391 == 3) {
            var7 = 4;
        } else {
            var7 = 8;
        }
        class512.method2759(var7, var1, var2, (byte) 116, false);
    }
}
