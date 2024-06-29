import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class161 extends class179 {

    @OriginalMember(owner = "client!wj", name = "V", descriptor = "Z")
    private boolean field2861 = true;

    @OriginalMember(owner = "client!wj", name = "Y", descriptor = "I")
    private int field2864 = 4096;

    @OriginalMember(owner = "client!wj", name = "U", descriptor = "I")
    public static int field2860 = -1;

    @OriginalMember(owner = "client!wj", name = "W", descriptor = "S")
    public static short field2862 = 205;

    @OriginalMember(owner = "client!wj", name = "cb", descriptor = "Lke;")
    public static class256 field2868 = class316.method2202("Verbindung mit Update)2Server)3)3)3", 27626);

    @OriginalMember(owner = "client!wj", name = "ab", descriptor = "Lke;")
    public static class256 field2866 = class316.method2202("Moteur son pr-Bpar-B", 27626);

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!wj", name = "X", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!wj", name = "bb", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!wj", name = "db", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!wj", name = "eb", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!wj", name = "T", descriptor = "Lwb;")
    public static class132 field2859;

    @OriginalMember(owner = "client!wj", name = "Z", descriptor = "Lng;")
    public static class138 field2865;

    @OriginalMember(owner = "client!wj", name = "fb", descriptor = "Lhd;")
    public static class319 field2871;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)[[I", line = 6)
    public final int[][] method55(int arg0, int arg1) {
        field2857++;
        int[][] var3 = this.field3169.method463(arg1, arg0 - 74);
        if (arg0 != 75) {
            method1190(61);
        }
        if (this.field3169.field1080) {
            int[] var4 = this.method1312(0, arg1 - 1 & class19.field255, (byte) -107);
            int[] var5 = this.method1312(0, arg1, (byte) 121);
            int[] var6 = this.method1312(0, class19.field255 & arg1 + 1, (byte) 122);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < field2858; var10++) {
                int var11 = (var5[var10 + 1 & class285.field4945] - var5[class285.field4945 & var10 - 1]) * this.field2864;
                int var12 = (var6[var10] - var4[var10]) * this.field2864;
                int var13 = var11 >> 12;
                int var14 = var12 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = var11 / var17;
                    var18 = 16777216 / var17;
                    var20 = var12 / var17;
                }
                if (this.field2861) {
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var8[var10] = var19;
                var7[var10] = var20;
                var9[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V", line = 283)
    public class161() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)V", line = 105)
    public static void method1187(boolean arg0) {
        field2866 = null;
        field2871 = null;
        field2859 = null;
        field2868 = null;
        field2865 = null;
        if (arg0) {
            method1189((byte) -56, -70L);
        }
    }

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "(I)V", line = 124)
    public static final void method1188(int arg0) {
        if (arg0 <= -7) {
            field2870++;
            class294.field5115.method2076(94);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BJ)V", line = 139)
    public static final void method1189(byte arg0, long arg1) {
        field2863++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class311.field5358 < 100 || class78.field1463) || class311.field5358 >= 200) {
            class274.method1895(0, 22156, class46.field844, class209.field3783);
            return;
        }
        class256 var3 = class290.method2018(7130, arg1).method1761(85);
        for (int var4 = 0; var4 < class311.field5358; var4++) {
            if (class108.field1924[var4] == arg1) {
                class274.method1895(0, 22156, class46.field844, class30.method214(new class256[] { var3, class272.field4650 }, 29784));
                return;
            }
        }
        for (int var5 = 0; var5 < class129.field2263; var5++) {
            if (class62.field1090[var5] == arg1) {
                class274.method1895(0, 22156, class46.field844, class30.method214(new class256[] { class250.field4246, var3, class156.field2785 }, 29784));
                return;
            }
        }
        if (var3.method1806(false, class121.field2124.field2532)) {
            class274.method1895(0, 22156, class46.field844, class7.field105);
            return;
        }
        class194.field3541++;
        class124.field2203[class311.field5358] = var3;
        class108.field1924[class311.field5358] = arg1;
        class68.field1261[class311.field5358] = 0;
        if (arg0 != 87) {
            field2856 = -116;
        }
        class35.field565[class311.field5358] = class46.field844;
        class273.field4673[class311.field5358] = 0;
        class53.field979[class311.field5358] = false;
        class7.field113 = class35.field549;
        class311.field5358++;
        class308.field5322.method1599(90, (byte) -53);
        class308.field5322.method330(arg0 + 168, arg1);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILra;I)V", line = 219)
    public final void method54(int arg0, class41 arg1, int arg2) {
        field2867++;
        if (arg2 == 0) {
            this.field2864 = arg1.method346(-16);
        } else if (arg2 == 1) {
            this.field2861 = arg1.method357(false) == 1;
        }
        if (arg0 < 108) {
            field2862 = 35;
        }
    }

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "(I)V", line = 255)
    public static final void method1190(int arg0) {
        if (arg0 != 0) {
            field2868 = (class256) null;
        }
        class32 var1 = (class32) class124.field2196.method1270((byte) -121);
        field2869++;
        while (var1 != null) {
            if (var1.field512 == -1) {
                var1.field524 = 0;
                class152.method1140((byte) -128, var1);
            } else {
                var1.method1199(21966);
            }
            var1 = (class32) class124.field2196.method1277(1);
        }
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(III)J", line = 287)
    public static final long method1191(int arg0, int arg1, int arg2) {
        class271 var3 = class41.field790[arg0][arg1][arg2];
        return var3 == null || var3.field4643 == null ? 0L : var3.field4643.field712;
    }
}
