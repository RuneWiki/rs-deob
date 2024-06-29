import java.awt.Container;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class464 implements Runnable {

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "Lb;")
    private class204 field6303 = new class83();

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "Lb;")
    private class204 field6323 = null;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "[I")
    public static int[] field6311 = new int[2048];

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field6304 = 0;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field6305;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field6306;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field6307;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "I")
    private int field6325;

    @OriginalMember(owner = "client!nj", name = "C", descriptor = "I")
    private int field6328;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "J")
    private long field6324;

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "J")
    private long field6327;

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "Lhd;")
    private class346 field6326;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "Ljava/lang/String;")
    private String field6322;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "Z")
    private volatile boolean field6317;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "Z")
    private boolean field6321;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)I", line = 3)
    public final int method2698(byte arg0) {
        field6300++;
        if (this.field6326 == null) {
            return 0;
        }
        int var2 = 99 % ((arg0 - 26) / 61);
        int var3 = this.field6326.method2112(28235);
        if (this.field6326.field4901 && this.field6326.field4902 > this.field6328) {
            return this.field6328 + 1;
        } else if (var3 >= 0 && class247.field3547.length - 1 > var3) {
            return this.field6326.field4903 == this.field6328 ? this.field6326.field4902 : this.field6326.field4903;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I", line = 28)
    public final int method2699(int arg0) {
        if (arg0 != -1) {
            this.field6324 = -124L;
        }
        field6308++;
        return this.field6328;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)Z", line = 41)
    public static final boolean method2700(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method2707(53, (byte) -19, 30);
        }
        field6310++;
        return false;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BII)Z", line = 53)
    public static final boolean method2701(byte arg0, int arg1, int arg2) {
        field6315++;
        if (!class383.field5382) {
            return false;
        }
        if (arg0 > -40) {
            method2706(8, -9, 104, -120);
        }
        int var3 = arg2 >> 16;
        int var4 = arg2 & 0xFFFF;
        if (class610.field8661[var3] == null || class610.field8661[var3][var4] == null) {
            return false;
        }
        class519 var5 = class610.field8661[var3][var4];
        if (arg1 == -1 && var5.field7190 == 0) {
            for (class554 var6 = (class554) class521.field7310.method3731((byte) -72); var6 != null; var6 = (class554) class521.field7310.method3729((byte) 108)) {
                if (var6.field7682 == 12 || var6.field7682 == 1001 || var6.field7682 == 57 || var6.field7682 == 15 || var6.field7682 == 53) {
                    for (class519 var7 = class604.method3506(var6.field7691, 255); var7 != null; var7 = class188.method1357(var7, (byte) 108)) {
                        if (var5.field7247 == var7.field7247) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class554 var8 = (class554) class521.field7310.method3731((byte) -118); var8 != null; var8 = (class554) class521.field7310.method3729((byte) -120)) {
                if (var8.field7697 == arg1 && var5.field7247 == var8.field7691 && (var8.field7682 == 12 || var8.field7682 == 1001 || var8.field7682 == 57 || var8.field7682 == 15 || var8.field7682 == 53)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/lang/String;BIJLhd;)V", line = 125)
    public final synchronized void method2702(String arg0, byte arg1, int arg2, long arg3, class346 arg4) {
        this.field6324 = arg3;
        this.field6326 = arg4;
        this.field6322 = arg0;
        if (arg1 != -53) {
            this.field6323 = null;
        }
        this.field6328 = arg2;
        field6318++;
    }

    @OriginalMember(owner = "client!nj", name = "run", descriptor = "()V", line = 141)
    public final void run() {
        while (!this.field6317) {
            long var1 = class337.method2062(false);
            synchronized (this) {
                try {
                    this.field6325++;
                    if (this.field6303 instanceof class83) {
                        this.field6303.method740(-23960, this.field6321);
                    } else {
                        long var4 = class337.method2062(false);
                        if (class686.field9702 == null || this.field6323 == null || this.field6323.method736(14383) == 0 || this.field6327 < var4 - ((long) this.field6323.method736(14383))) {
                            if (this.field6323 != null) {
                                this.field6321 = true;
                                this.field6323.method735((byte) -93);
                                this.field6323 = null;
                            }
                            if (this.field6321) {
                                class39.method294((byte) 83);
                                if (class686.field9702 != null) {
                                    class686.field9702.method97(0);
                                }
                            }
                            this.field6303.method740(-23960, this.field6321 || class686.field9702 != null && class686.field9702.method446());
                        } else {
                            int var6 = (int) ((var4 - this.field6327) * 255L / (long) this.field6323.method736(14383));
                            int var7 = 255 - var6;
                            int var8 = var6 << 24 | 0xFFFFFF;
                            int var9 = var7 << 24 | 0xFFFFFF;
                            class39.method294((byte) 83);
                            class686.field9702.method97(0);
                            class85 var10 = class686.field9702.method423(class709.field9923, class448.field6174, true);
                            class686.field9702.method2772(var10, (byte) -85);
                            this.field6323.method740(-23960, true);
                            class686.field9702.method115();
                            var10.method6(0, 0, 0, var9, 1);
                            class686.field9702.method2772(var10, (byte) -85);
                            class686.field9702.method97(0);
                            this.field6303.method740(-23960, true);
                            class686.field9702.method115();
                            var10.method6(0, 0, 0, var8, 1);
                        }
                        try {
                            if (class686.field9702 != null && !(this.field6303 instanceof class83)) {
                                class686.field9702.method2777(-16679);
                            }
                        } catch (class684 var18) {
                            class349.method2122(var18, var18.getMessage() + " (Recovered) " + class199.field2988.method898((byte) -123), 1);
                            class636.method3625(true, 0, 119);
                        }
                    }
                    Container var12;
                    if (class410.field5617 != null) {
                        var12 = class410.field5617;
                    } else if (class343.field4881 == null) {
                        var12 = class149.field2396;
                    } else {
                        var12 = class343.field4881;
                    }
                    var12.getSize();
                    var12.getSize();
                    if (class410.field5617 == var12) {
                        class410.field5617.getInsets();
                    }
                    this.field6321 = false;
                    if (class686.field9702 != null && !(this.field6303 instanceof class83) && this.field6326.method2112(28235) < class346.field4926.method2112(28235)) {
                        class743.method4109(2);
                    }
                } catch (Exception var19) {
                    continue;
                }
            }
            long var13 = class337.method2062(false);
            int var15 = (int) (var1 - (var13 - 20L));
            if (var15 > 0) {
                class579.method3405((long) var15, 10);
            }
        }
        field6309++;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)I", line = 266)
    public final int method2703(int arg0) {
        field6316++;
        if (arg0 != 0) {
            method2700(118, -67, -94);
        }
        return this.field6325;
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)Z", line = 277)
    public final synchronized boolean method2704(int arg0) {
        field6314++;
        if (arg0 != 0) {
            this.method2712(true);
        }
        return this.field6303.method731(this.field6327, true);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)V", line = 292)
    public static void method2705(boolean arg0) {
        if (!arg0) {
            method2705(true);
        }
        field6311 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIII)V", line = 304)
    public static final void method2706(int arg0, int arg1, int arg2, int arg3) {
        field6302++;
        if (arg0 != -30458) {
            method2706(-16, 78, -6, -60);
        }
        class371 var4 = class490.method2867((byte) -115, 11, (long) arg3);
        var4.method2212(arg0 ^ 0x769F);
        var4.field5233 = arg1;
        var4.field5225 = arg2;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IBI)Z", line = 319)
    public static final boolean method2707(int arg0, byte arg1, int arg2) {
        field6313++;
        if (arg1 != -93) {
            method2701((byte) 35, 70, 12);
        }
        return (arg2 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)V", line = 334)
    public final synchronized void method2708(int arg0) {
        if (arg0 != 249351760) {
            method2705(true);
        }
        field6306++;
        this.field6321 = true;
    }

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "(I)V", line = 345)
    public final void method2709(int arg0) {
        this.field6317 = true;
        field6312++;
        if (arg0 != 11309) {
            field6311 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lb;I)V", line = 358)
    public final synchronized void method2710(class204 arg0, int arg1) {
        this.field6323 = this.field6303;
        field6307++;
        if (arg1 != 2048) {
            method2707(-121, (byte) -7, 83);
        }
        this.field6303 = arg0;
        this.field6327 = class337.method2062(false);
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)Ljava/lang/String;", line = 374)
    public final String method2711(byte arg0) {
        if (arg0 <= 27) {
            return null;
        } else {
            field6301++;
            return this.field6322;
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(Z)J", line = 385)
    public final long method2712(boolean arg0) {
        field6320++;
        if (arg0) {
            this.method2702(null, (byte) 66, -73, -124L, null);
        }
        return this.field6324;
    }

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "(I)Lhd;", line = 399)
    public final class346 method2713(int arg0) {
        field6319++;
        if (arg0 != 0) {
            this.field6324 = 75L;
        }
        return this.field6326;
    }
}
