import java.awt.Component;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class56 extends class34 {

    @OriginalMember(owner = "client!tl", name = "P", descriptor = "I")
    private int field940 = 4096;

    @OriginalMember(owner = "client!tl", name = "Q", descriptor = "I")
    private int field941 = 4096;

    @OriginalMember(owner = "client!tl", name = "X", descriptor = "I")
    private int field948 = 4096;

    @OriginalMember(owner = "client!tl", name = "W", descriptor = "I")
    private int field947 = 409;

    @OriginalMember(owner = "client!tl", name = "S", descriptor = "[I")
    private int[] field943 = new int[3];

    @OriginalMember(owner = "client!tl", name = "Y", descriptor = "Ljava/util/Calendar;")
    public static Calendar field949 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!tl", name = "R", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!tl", name = "T", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!tl", name = "U", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!tl", name = "V", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!tl", name = "Z", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        ++field950;
        if (arg0 != 6) {
            this.field948 = -80;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 == -5) {
                            int var5 = arg2.method408(8);
                            this.field943[1] = class131.method904(var5 >> 4, 4080);
                            this.field943[2] = class131.method904(var5 >> 12, 0);
                            this.field943[0] = class131.method904(16711680, var5) << 4;
                        }
                    } else {
                        this.field941 = arg2.method423(arg0 ^ 106);
                    }
                } else {
                    this.field940 = arg2.method423(-88);
                }
            } else {
                this.field948 = arg2.method423(58);
            }
        } else {
            this.field947 = arg2.method423(123);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        int[][] var3 = super.field618.method91(34, arg1);
        ++field945;
        int var4 = -9 % ((arg0 - -54) / 44);
        if (super.field618.field211) {
            int[][] var5 = this.method231(arg1, (byte) 87, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            int[] var11 = var3[0];
            for (int var12 = 0; var12 < class226.field3527; ++var12) {
                int var13 = var6[var12];
                int var14 = var13 - this.field943[0];
                if (~var14 > -1) {
                    var14 = -var14;
                }
                if (~this.field947 > ~var14) {
                    var11[var12] = var13;
                    var9[var12] = var7[var12];
                    var10[var12] = var8[var12];
                } else {
                    int var15 = var7[var12];
                    int var16 = -this.field943[1] + var15;
                    if (~var16 > -1) {
                        var16 = -var16;
                    }
                    if (~var16 < ~this.field947) {
                        var11[var12] = var13;
                        var9[var12] = var15;
                        var10[var12] = var8[var12];
                    } else {
                        int var17 = var8[var12];
                        int var18 = -this.field943[2] + var17;
                        if (~var18 > -1) {
                            var18 = -var18;
                        }
                        if (~this.field947 > ~var18) {
                            var11[var12] = var13;
                            var9[var12] = var15;
                            var10[var12] = var17;
                        } else {
                            var11[var12] = this.field941 * var13 >> 12;
                            var9[var12] = this.field940 * var15 >> 12;
                            var10[var12] = this.field948 * var17 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(B)V")
    public static void method468(byte arg0) {
        field949 = null;
        if (arg0 != 123) {
            field949 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "()V")
    public class56() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(III)V")
    public static final void method469(int arg0, int arg1, int arg2) {
        short var3 = 256;
        ++field944;
        if (class128.field1893 > 0) {
            class166.method1129((byte) 94, class128.field1893);
            class128.field1893 = 0;
        }
        if (arg2 != 409) {
            method470((Component) null, (class26) null, 28, 7, -128);
        }
        int var4 = class72.field1173 * arg1;
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 1; var3 + -1 > var7; ++var7) {
            int var8 = (-var7 + var3) * class128.field1891[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var5 += var8;
            for (int var9 = var8; ~var9 > -129; ++var9) {
                int var11 = class72.field1174[arg0 - -(var4++)];
                int var12 = class47.field795[var5++];
                if (~var12 != -1) {
                    int var13 = var12 + 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = 256 - (var12 + 18);
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    int var15 = class256.field3937[var12];
                    class49.field809.field4397[var6++] = class131.method904(var13 * class131.method904(var15, 16711935) + class131.method904(16711935, var11) * var14, -16711936) - -class131.method904(16711680, class131.method904(var11, 65280) * var14 + class131.method904(var15, 65280) * var13) >> 8;
                } else {
                    class49.field809.field4397[var6++] = var11;
                }
            }
            for (int var10 = 0; ~var10 > ~var8; ++var10) {
                class49.field809.field4397[var6++] = class72.field1174[arg0 + var4++];
            }
            var4 += class72.field1173 + -128;
        }
        class49.field809.method1234(arg0, arg1);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/awt/Component;Lgf;III)Lpc;")
    public static final class111 method470(Component arg0, class26 arg1, int arg2, int arg3, int arg4) {
        ++field946;
        if (class174.field2547 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            if (arg3 != -18999) {
                method468((byte) 35);
            }
            try {
                class111 var5 = (class111) Class.forName("ak").newInstance();
                var5.field1703 = arg2;
                var5.field1698 = new int[256 * (!class133.field1955 ? 1 : 2)];
                var5.method198(arg0);
                var5.field1704 = (-1024 & arg2) + 1024;
                if (~var5.field1704 < -16385) {
                    var5.field1704 = 16384;
                }
                var5.method201(var5.field1704);
                if (class75.field1195 > 0 && class275.field4249 == null) {
                    class275.field4249 = new class8();
                    class275.field4249.field100 = arg1;
                    arg1.method181(class275.field4249, class75.field1195, (byte) -112);
                }
                if (class275.field4249 != null) {
                    if (class275.field4249.field98[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class275.field4249.field98[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class28 var6 = new class28(arg1, arg4);
                    var6.field1703 = arg2;
                    var6.field1698 = new int[256 * (!class133.field1955 ? 1 : 2)];
                    var6.method198(arg0);
                    var6.field1704 = 16384;
                    var6.method201(var6.field1704);
                    if (~class75.field1195 < -1 && class275.field4249 == null) {
                        class275.field4249 = new class8();
                        class275.field4249.field100 = arg1;
                        arg1.method181(class275.field4249, class75.field1195, (byte) -113);
                    }
                    if (class275.field4249 != null) {
                        if (class275.field4249.field98[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class275.field4249.field98[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class111();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(B)V")
    public static final void method471(byte arg0) {
        ++field942;
        if (arg0 != 74) {
            field949 = null;
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class51.field826 - 1; ++var2) {
                if (~class265.field4147[var2] > -1001 && ~class265.field4147[var2 - -1] < -1001) {
                    String var3 = class280.field4297[var2];
                    class280.field4297[var2] = class280.field4297[var2 + 1];
                    var1 = false;
                    class280.field4297[var2 + 1] = var3;
                    String var4 = class179.field2614[var2];
                    class179.field2614[var2] = class179.field2614[var2 + 1];
                    class179.field2614[var2 - -1] = var4;
                    int var5 = class260.field4000[var2];
                    class260.field4000[var2] = class260.field4000[var2 + 1];
                    class260.field4000[var2 + 1] = var5;
                    int var6 = class8.field96[var2];
                    class8.field96[var2] = class8.field96[var2 + 1];
                    class8.field96[var2 - -1] = var6;
                    int var7 = class186.field2708[var2];
                    class186.field2708[var2] = class186.field2708[var2 + 1];
                    class186.field2708[var2 + 1] = var7;
                    short var8 = class265.field4147[var2];
                    class265.field4147[var2] = class265.field4147[var2 + 1];
                    class265.field4147[var2 - -1] = var8;
                    long var9 = class84.field1294[var2];
                    class84.field1294[var2] = class84.field1294[var2 + 1];
                    class84.field1294[var2 - -1] = var9;
                }
            }
        }
    }
}
