import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class190 {

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    private int field2737 = 32;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "Z")
    private boolean field2719 = false;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "J")
    private long field2746 = class18.method107(-16145);

    @OriginalMember(owner = "client!ng", name = "M", descriptor = "J")
    private long field2755 = 0L;

    @OriginalMember(owner = "client!ng", name = "O", descriptor = "I")
    private int field2757 = 0;

    @OriginalMember(owner = "client!ng", name = "P", descriptor = "J")
    private long field2758 = 0L;

    @OriginalMember(owner = "client!ng", name = "Q", descriptor = "[Lkb;")
    private class412[] field2759 = new class412[8];

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "[Lkb;")
    private class412[] field2756 = new class412[8];

    @OriginalMember(owner = "client!ng", name = "R", descriptor = "I")
    private int field2760 = 0;

    @OriginalMember(owner = "client!ng", name = "T", descriptor = "I")
    private int field2762 = 0;

    @OriginalMember(owner = "client!ng", name = "V", descriptor = "Z")
    private boolean field2764 = true;

    @OriginalMember(owner = "client!ng", name = "L", descriptor = "I")
    private int field2754 = 0;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field2724 = 0;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field2731 = 0;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public static int field2734 = 0;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
    public static int field2750 = 50;

    @OriginalMember(owner = "client!ng", name = "S", descriptor = "[I")
    public static int[] field2761 = new int[field2750];

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "[I")
    public static int[] field2738 = new int[field2750];

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "[I")
    public static int[] field2721 = new int[field2750];

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "[I")
    public static int[] field2735 = new int[field2750];

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "[I")
    public static int[] field2740 = new int[field2750];

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "[I")
    public static int[] field2718 = new int[field2750];

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field2745 = new String[field2750];

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "Lpm;")
    public static class349 field2725 = new class349("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!ng", name = "W", descriptor = "I")
    public static int field2765 = 0;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
    private int field2752;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
    public int field2753;

    @OriginalMember(owner = "client!ng", name = "U", descriptor = "I")
    public int field2763;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "Lkb;")
    private class412 field2749;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "[I")
    public int[] field2727;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lkb;B)V", line = 4)
    public final synchronized void method1359(class412 arg0, byte arg1) {
        field2748++;
        this.field2749 = arg0;
        if (arg1 < 24) {
            this.method1368((int[]) null, -48);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V", line = 18)
    public static void method1360(byte arg0) {
        field2738 = null;
        field2761 = null;
        field2740 = null;
        field2718 = null;
        field2725 = null;
        field2721 = null;
        int var1 = -85 / ((arg0 + 60) / 54);
        field2745 = null;
        field2735 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)V", line = 34)
    private final void method1361(byte arg0, int arg1) {
        this.field2757 -= arg1;
        field2736++;
        if (this.field2757 < 0) {
            this.field2757 = 0;
        }
        if (this.field2749 != null) {
            this.field2749.method722(arg1);
        }
        if (arg0 >= -52) {
            this.field2757 = 64;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 54)
    public void method1290(int arg0) throws Exception {
        field2730++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "()V", line = 71)
    public void method1285() {
        field2744++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;CB)[Ljava/lang/String;", line = 78)
    public static final String[] method1362(String arg0, char arg1, byte arg2) {
        field2726++;
        int var3 = class218.method1519(arg1, (byte) -77, arg0);
        int var4 = 48 / ((arg2 - 88) / 37);
        String[] var5 = new String[var3 + 1];
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = var7; arg1 != arg0.charAt(var9); var9++) {
            }
            var5[var6++] = arg0.substring(var7, var9);
            var7 = var9 + 1;
        }
        var5[var3] = arg0.substring(var7);
        return var5;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 115)
    public void method1287(Component arg0) throws Exception {
        field2728++;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V", line = 123)
    public final void method1363(int arg0) {
        this.field2764 = true;
        if (arg0 >= -64) {
            this.method1359((class412) null, (byte) -8);
        }
        field2733++;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "()I", line = 137)
    public int method1286() throws Exception {
        field2722++;
        return this.field2753;
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "()V", line = 150)
    public void method1288() throws Exception {
        field2723++;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V", line = 160)
    public final synchronized void method1364(byte arg0) {
        field2729++;
        if (this.field2719) {
            return;
        }
        long var2 = class18.method107(-16145);
        try {
            if (var2 > (this.field2746 + 500000L)) {
                this.field2746 = var2 - 500000L;
            }
            while (var2 > this.field2746 + 5000L) {
                this.method1361((byte) -115, 256);
                this.field2746 += (long) (256000 / class246.field3671);
            }
        } catch (Exception var7) {
            this.field2746 = var2;
        }
        if (this.field2727 == null) {
            return;
        }
        try {
            if (this.field2755 != 0L) {
                if (var2 < this.field2755) {
                    return;
                }
                this.method1290(this.field2753);
                this.field2755 = 0L;
                this.field2764 = true;
            }
            int var4 = this.method1286();
            if (this.field2760 < this.field2762 - var4) {
                this.field2760 = this.field2762 - var4;
            }
            int var5 = this.field2763 + this.field2752;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (arg0 > -42) {
                this.method1371(true);
            }
            if (this.field2753 < (var5 + 256)) {
                this.field2753 += 1024;
                if (this.field2753 > 16384) {
                    this.field2753 = 16384;
                }
                this.method1285();
                var4 = 0;
                this.method1290(this.field2753);
                if (this.field2753 < (var5 + 256)) {
                    var5 = this.field2753 - 256;
                    this.field2752 = var5 - this.field2763;
                }
                this.field2764 = true;
            }
            while (var4 < var5) {
                this.method1368(this.field2727, 256);
                var4 += 256;
                this.method1289();
            }
            if (var2 > this.field2758) {
                if (this.field2764) {
                    this.field2764 = false;
                } else if (this.field2760 == 0 && this.field2754 == 0) {
                    this.method1285();
                    this.field2755 = var2 + 2000L;
                    return;
                } else {
                    this.field2752 = Math.min(this.field2754, this.field2760);
                    this.field2754 = this.field2760;
                }
                this.field2758 = var2 + 2000L;
                this.field2760 = 0;
            }
            this.field2762 = var4;
        } catch (Exception var6) {
            this.method1285();
            this.field2755 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)V", line = 278)
    public static final void method1365(int arg0) {
        field2751++;
        if (class241.field3553 < 1024.0F) {
            class241.field3553 = 1024.0F;
        }
        while (class358.field5176 >= 16384.0F) {
            class358.field5176 -= 16384.0F;
        }
        if (class241.field3553 > 3072.0F) {
            class241.field3553 = 3072.0F;
        }
        while (class358.field5176 < 0.0F) {
            class358.field5176 += 16384.0F;
        }
        int var1 = class323.field4712 >> 7;
        int var2 = class431.field6168 >> 7;
        int var3 = class452.method2820(class158.field2302, class431.field6168, false, class323.field4712);
        int var4 = arg0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class158.field2302;
                    if (var7 < 3 && class183.method1317(arg0 - 28499, var6, var5)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class423.field6035 != null && class423.field6035[var7] != null) {
                        var8 = (class423.field6035[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var3 - (class439.field6280[var7].method359(var5, var6) - var8);
                    if (var4 < var9) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = var4 * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (class433.field6195 < var10) {
            class433.field6195 += (var10 - class433.field6195) / 24;
        } else if (var10 < class433.field6195) {
            class433.field6195 += (var10 - class433.field6195) / 80;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)I", line = 360)
    public static final int method1366(boolean arg0) {
        field2732++;
        return arg0 ? -9 : ((~class170.field2398 == -1 ? 0 : 1) << 22) + ((class266.field3910 == 0 ? 0 : 1) << 20) + ((class358.field5172 ? 1 : 0) << 19) + ((class125.field1678 ? 1 : 0) << 16) + ((class189.field2714 ? 1 : 0) << 9) + ((class266.field3908 ? 1 : 0) << 8) + ((class103.field1326 ? 1 : 0) << 6) + ((class247.field3703 ? 1 : 0) << 5) + ((class399.field5615 ? 1 : 0) << 3) + ((class355.field5139 & 0x7) - (-((class181.field2561 ? 1 : 0) << 4) - ((class79.field1027 ? 1 : 0) << 10)) + ((class194.field2802 & 0x3) << 11) + ((class120.field1626 ? 1 : 0) << 13) + ((class51.field664 ? 1 : 0) << 15) - (-(class68.field910 << 17) - ((class131.field1914 == 0 ? 0 : 1) << 21) + -(class270.method1842((byte) -63) << 23)) - (-(class145.field2182 << 25) + (-((class324.field4717 ? 1 : 0) << 27) - (class374.field5319 << 28))));
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILbr;IIIILsg;I)V", line = 371)
    public static final void method1367(int arg0, int arg1, class223 arg2, int arg3, int arg4, int arg5, int arg6, class226 arg7, int arg8) {
        field2743++;
        int var9 = arg1 * arg1 + arg4 * arg4;
        if (arg5 < var9) {
            return;
        }
        int var10 = Math.min(arg2.field3250 / 2, arg2.field3282 / 2);
        if (var9 <= (var10 * var10)) {
            class21.method118(arg4, arg3, arg8, arg7, arg2, class15.field235[arg0], false, arg1);
        } else {
            var10 -= 10;
            int var11;
            if (class336.field4878 == 4) {
                var11 = (int) class358.field5176 & 0x3FFF;
            } else {
                var11 = (int) class358.field5176 + class63.field842 & 0x3FFF;
            }
            int var12 = class447.field6381[var11];
            int var13 = class447.field6390[var11];
            if (class336.field4878 != 4) {
                var13 = var13 * 256 / (class261.field3863 + 256);
                var12 = var12 * 256 / (class261.field3863 + 256);
            }
            int var14 = arg1 * var12 + arg4 * var13 >> 15;
            int var15 = arg1 * var13 - (arg4 * var12) >> 15;
            double var16 = Math.atan2((double) var14, (double) var15);
            int var18 = (int) (Math.sin(var16) * (double) var10);
            int var19 = (int) (Math.cos(var16) * (double) var10);
            class425.field6080[arg0].method1776((float) arg2.field3250 / 2.0F + (float) arg8 + (float) var18, (float) arg2.field3282 / 2.0F + (float) arg3 + (float) (-var19), 4096, (int) (-var16 / 6.283185307179586D * 65535.0D));
        }
        if (arg6 != 1) {
            method1369(-58, 80, -48);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "([II)V", line = 425)
    private final void method1368(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class46.field615) {
            var3 = arg1 << 1;
        }
        class271.method1858(arg0, 0, var3);
        this.field2757 -= arg1;
        if (this.field2749 != null && this.field2757 <= 0) {
            this.field2757 += class246.field3671 >> 4;
            class450.method2803((byte) -119, this.field2749);
            this.method1370(256, this.field2749.method1692(), this.field2749);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class412 var10 = null;
                        class412 var11 = this.field2756[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class280 var12 = var11.field5900;
                                if (var12 == null || var12.field4021 <= var8) {
                                    var11.field5901 = true;
                                    int var13 = var11.method720();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4021 += var13;
                                    }
                                    if (var4 >= this.field2737) {
                                        break label107;
                                    }
                                    class412 var14 = var11.method725();
                                    if (var14 != null) {
                                        int var15 = var11.field5902;
                                        while (var14 != null) {
                                            this.method1370(256, var15 * var14.method1692() >> 8, var14);
                                            var14 = var11.method727();
                                        }
                                    }
                                    class412 var16 = var11.field5899;
                                    var11.field5899 = null;
                                    if (var10 == null) {
                                        this.field2756[var7] = var16;
                                    } else {
                                        var10.field5899 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2759[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field5899;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class412 var18 = this.field2756[var17];
                this.field2756[var17] = this.field2759[var17] = null;
                while (var18 != null) {
                    class412 var19 = var18.field5899;
                    var18.field5899 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2757 < 0) {
            this.field2757 = 0;
        }
        if (this.field2749 != null) {
            this.field2749.method724(arg0, 0, arg1);
        }
        this.field2746 = class18.method107(-16145);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)I", line = 583)
    public static final int method1369(int arg0, int arg1, int arg2) {
        field2717++;
        if (arg0 <= 114) {
            field2745 = null;
        }
        return arg1 == 1 || arg1 == 3 ? class282.field4041[arg2 & 0x3] : class410.field5887[arg2 & 0x3];
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "()V", line = 602)
    public void method1289() throws Exception {
        field2742++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILkb;)V", line = 615)
    private final void method1370(int arg0, int arg1, class412 arg2) {
        field2720++;
        int var4 = arg1 >> 5;
        class412 var5 = this.field2759[var4];
        if (var5 == null) {
            this.field2756[var4] = arg2;
        } else {
            var5.field5899 = arg2;
        }
        this.field2759[var4] = arg2;
        if (arg0 == 256) {
            arg2.field5902 = arg1;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(Z)V", line = 645)
    public final synchronized void method1371(boolean arg0) {
        field2747++;
        this.field2764 = arg0;
        try {
            this.method1288();
        } catch (Exception var2) {
            this.method1285();
            this.field2755 = class18.method107(-16145) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(B)V", line = 662)
    public final synchronized void method1372(byte arg0) {
        if (arg0 != 102) {
            return;
        }
        field2741++;
        if (class357.field5164 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class357.field5164.field2269[var3] == this) {
                    class357.field5164.field2269[var3] = null;
                }
                if (class357.field5164.field2269[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class357.field5164.field2276 = true;
                while (class357.field5164.field2279) {
                    class259.method1790((byte) -95, 50L);
                }
                class357.field5164 = null;
            }
        }
        this.method1285();
        this.field2727 = null;
        this.field2719 = true;
    }
}
