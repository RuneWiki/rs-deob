import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class263 extends class177 {

    @OriginalMember(owner = "client!wi", name = "J", descriptor = "I")
    private int field3930 = -1;

    @OriginalMember(owner = "client!wi", name = "I", descriptor = "S")
    public static short field3929 = 256;

    @OriginalMember(owner = "client!wi", name = "L", descriptor = "I")
    public static int field3932 = 0;

    @OriginalMember(owner = "client!wi", name = "C", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!wi", name = "D", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!wi", name = "E", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!wi", name = "F", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!wi", name = "G", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!wi", name = "H", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!wi", name = "N", descriptor = "I")
    public int field3934;

    @OriginalMember(owner = "client!wi", name = "O", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!wi", name = "P", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!wi", name = "R", descriptor = "I")
    public int field3938;

    @OriginalMember(owner = "client!wi", name = "S", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!wi", name = "U", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!wi", name = "K", descriptor = "[I")
    public static int[] field3931;

    @OriginalMember(owner = "client!wi", name = "M", descriptor = "[I")
    public int[] field3933;

    @OriginalMember(owner = "client!wi", name = "Q", descriptor = "[Lsd;")
    public static class27[] field3937;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIII)V", line = 13)
    public static final void method1814(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class147 var5 = class92.method731(-29125, arg0, 8);
        field3935++;
        var5.method1095(arg1 + 32537);
        if (arg1 == -32462) {
            var5.field2240 = arg4;
            var5.field2249 = arg2;
            var5.field2241 = arg3;
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(B)I", line = 28)
    public final int method1281(byte arg0) {
        field3926++;
        if (arg0 <= 59) {
            this.field3938 = 72;
        }
        return this.field3930;
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(B)V", line = 41)
    public static void method1815(byte arg0) {
        field3937 = null;
        field3931 = null;
        if (arg0 != 93) {
            method1815((byte) -118);
        }
    }

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "(B)V", line = 55)
    public static final void method1816(byte arg0) {
        field3939++;
        class137.method1043((byte) 7, 5);
        class289.method2045(5, 17);
        class288.method2037(5, -1318543551);
        if (arg0 != -35) {
            field3929 = 104;
        }
        class301.method2109(5, false);
        class245.method1696(78, 5);
        class318.method2182(-1360812026, 5);
        class293.method2066(-155576378, 5);
        class228.method1619(5, -127);
        class30.method209((byte) 122, 5);
        class201.method1460(5, -2);
        class196.method1422(5, 5);
        class35.method244(-1, 5);
        class11.method91(113, 5);
        class49.method455(arg0 + 39, 5);
        class193.method1400(-124, 5);
        class20.method140(2, 50);
        class102.method800(5, arg0 + 27);
        class77.method620(5, 14837);
        class15.field173.method1429((byte) 127, 5);
        class78.field1100.method1429((byte) 127, 5);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lhb;II)V", line = 85)
    public final void method97(class35 arg0, int arg1, int arg2) {
        if (arg1 != -18061) {
            this.method1281((byte) -127);
        }
        field3925++;
        if (arg2 == 0) {
            this.field3930 = arg0.method300(-1394191632);
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)[[I", line = 103)
    public int[][] method99(int arg0, int arg1) {
        field3927++;
        int[][] var3 = this.field2645.method1456(arg0, (byte) -113);
        if (arg1 != -23387) {
            method1818(94, (byte) -102, 41);
        }
        if (this.field2645.field3203 && this.method1817(-58)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int var7 = this.field3938 * (class282.field4361 == this.field3934 ? arg0 : this.field3934 * arg0 / class282.field4361);
            if (class287.field4415 == this.field3938) {
                for (int var8 = 0; var8 < class287.field4415; var8++) {
                    int var9 = this.field3933[var7++];
                    var6[var8] = class142.method1078(var9, 255) << 4;
                    var4[var8] = class142.method1078(65280, var9) >> 4;
                    var5[var8] = class142.method1078(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; var10 < class287.field4415; var10++) {
                    int var11 = this.field3938 * var10 / class287.field4415;
                    int var12 = this.field3933[var7 + var11];
                    var6[var10] = class142.method1078(255, var12) << 4;
                    var4[var10] = class142.method1078(var12 >> 4, 4080);
                    var5[var10] = class142.method1078(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)Z", line = 171)
    public final boolean method1817(int arg0) {
        field3924++;
        if (this.field3933 != null) {
            return true;
        }
        if (arg0 >= -20) {
            method1815((byte) -51);
        }
        if (this.field3930 < 0) {
            return false;
        }
        class134 var2 = class211.field3342 < 0 ? class28.method195(this.field3930, class146.field2236, true) : class149.method1103(this.field3930, class146.field2236, class211.field3342, (byte) -100);
        var2.method1021();
        this.field3933 = var2.field2101;
        this.field3934 = var2.field315;
        this.field3938 = var2.field312;
        return true;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V", line = 198)
    public final void method115(boolean arg0) {
        super.method115(arg0);
        field3923++;
        this.field3933 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBI)Ld;", line = 210)
    public static final class142 method1818(int arg0, byte arg1, int arg2) {
        if (arg1 != -13) {
            method1818(-113, (byte) 43, 29);
        }
        field3928++;
        class142 var3 = new class142();
        for (class190 var4 = (class190) class87.field1276.method986(false); var4 != null; var4 = (class190) class87.field1276.method982(14877)) {
            if (var4.field3030 && var4.method1370(arg0, (byte) -79, arg2)) {
                var3.method1076(var4, (byte) -41);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V", line = 239)
    public class263() {
        super(0, false);
    }
}
