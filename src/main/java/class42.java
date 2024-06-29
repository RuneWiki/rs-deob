import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class42 extends class205 {

    @OriginalMember(owner = "client!di", name = "Y", descriptor = "Lvd;")
    public static class222 field891 = class212.method1357("Mem:", 10731);

    @OriginalMember(owner = "client!di", name = "bb", descriptor = "[I")
    public static int[] field894 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!di", name = "db", descriptor = "Z")
    public static boolean field896 = false;

    @OriginalMember(owner = "client!di", name = "cb", descriptor = "Luc;")
    public static class211 field895 = new class211(5000);

    @OriginalMember(owner = "client!di", name = "hb", descriptor = "[I")
    public static int[] field900 = new int[1000];

    @OriginalMember(owner = "client!di", name = "gb", descriptor = "[I")
    public static int[] field899 = new int[25];

    @OriginalMember(owner = "client!di", name = "W", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!di", name = "X", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!di", name = "Z", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!di", name = "ab", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!di", name = "eb", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!di", name = "V", descriptor = "[Lv;")
    private class218[] field888;

    @OriginalMember(owner = "client!di", name = "fb", descriptor = "[[[I")
    public static int[][][] field898;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 == -2) {
                super.field3812 = arg0.method662((byte) -127) == 1;
            }
        } else {
            this.field888 = new class218[arg0.method662((byte) -117)];
            for (int var4 = 0; var4 < this.field888.length; ++var4) {
                int var6 = arg0.method662((byte) -103);
                if (~var6 != -1) {
                    if (~var6 != -2) {
                        if (~var6 != -3) {
                            if (var6 == 3) {
                                this.field888[var4] = class31.method253(arg0, 404);
                            }
                        } else {
                            this.field888[var4] = class190.method1189(arg0, false);
                        }
                    } else {
                        this.field888[var4] = class43.method322(arg0, (byte) -14);
                    }
                } else {
                    this.field888[var4] = class77.method511((byte) -91, arg0);
                }
            }
        }
        int var5 = 37 / ((arg1 - -47) / 34);
        ++field893;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)[[I")
    public final int[][] method96(int arg0, byte arg1) {
        int[][] var3 = super.field3815.method1003(-8357, arg0);
        ++field890;
        if (arg1 < 98) {
            field900 = null;
        }
        if (super.field3815.field3015) {
            int var4 = class118.field2245;
            int var5 = class134.field2598;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field3815.method1002(0);
            this.method317(var6, (byte) -109);
            for (int var8 = 0; var8 < class134.field2598; ++var8) {
                int[][] var9 = var7[var8];
                int[] var10 = var6[var8];
                int[] var11 = var9[0];
                int[] var12 = var9[1];
                int[] var13 = var9[2];
                for (int var14 = 0; var14 < class118.field2245; ++var14) {
                    int var15 = var10[var14];
                    var13[var14] = class139.method876(4080, var15 << 4);
                    var12[var14] = class139.method876(var15, 65280) >> 4;
                    var11[var14] = class139.method876(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V")
    public class42() {
        super(0, true);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        if (arg0 != 0) {
            field891 = null;
        }
        int[] var3 = super.field3810.method557(6978, arg1);
        ++field892;
        if (super.field3810.field1635) {
            this.method317(super.field3810.method554(-5038), (byte) 93);
        }
        return var3;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([[IB)V")
    private final void method317(int[][] arg0, byte arg1) {
        ++field897;
        int var3 = class118.field2245;
        int var4 = -125 % ((-1 - arg1) / 61);
        int var5 = class134.field2598;
        class166.method1075(arg0, 64);
        class9.method84(-1, 0, 0, class17.field433, class159.field3039);
        if (this.field888 != null) {
            for (int var6 = 0; ~var6 > ~this.field888.length; ++var6) {
                class218 var7 = this.field888[var6];
                int var8 = var7.field4042;
                int var9 = var7.field4043;
                if (~var9 > -1) {
                    if (~var8 <= -1) {
                        var7.method432(var3, var5, 59);
                    }
                } else if (~var8 <= -1) {
                    var7.method433(71, var5, var3);
                } else {
                    var7.method434((byte) 86, var3, var5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lka;B)Lvd;")
    public static final class222 method318(class109 arg0, byte arg1) {
        ++field889;
        if (arg1 != 0) {
            method319(42);
        }
        return class22.method211(arg0, (byte) -103, 32767);
    }

    @OriginalMember(owner = "client!di", name = "h", descriptor = "(I)V")
    public static void method319(int arg0) {
        field894 = null;
        if (arg0 == 65280) {
            field895 = null;
            field891 = null;
            field900 = null;
            field899 = null;
            field898 = null;
        }
    }
}
