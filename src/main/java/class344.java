import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class344 extends RuntimeException {

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "Ljava/lang/Throwable;")
    public Throwable field5479;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "Ljava/lang/String;")
    public String field5480;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field5473 = 0;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "[Z")
    public static boolean[] field5477 = new boolean[200];

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "F")
    public static float field5475;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V", line = 8)
    public static final void method2408(byte arg0) {
        if (class279.field4426 != null) {
            class279.field4426.method177(false);
            class279.field4426 = null;
        }
        field5482++;
        class28.method251(-1);
        class213.method1581();
        for (int var1 = 0; var1 < 4; var1++) {
            class163.field2882[var1].method1504(false);
        }
        class209.method1553(false, (byte) 96);
        System.gc();
        class107.method937(-1, 2);
        class131.field2254 = -1;
        class185.field3137 = false;
        class37.method324(true, (byte) -121);
        class7.field90 = false;
        class181.field3047 = 0;
        class34.field484 = 0;
        class144.field2626 = 0;
        class24.field345 = 0;
        if (arg0 != 116) {
            return;
        }
        for (int var2 = 0; var2 < class311.field4922.length; var2++) {
            class311.field4922[var2] = null;
        }
        class291.field4664 = 0;
        class191.field3200 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class135.field2359[var3] = null;
            class56.field868[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class320.field5071[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class214.field3591[var5][var6][var7] = null;
                }
            }
        }
        class248.method1745(115);
        class227.field3818 = 0;
        class222.method1620(arg0 ^ 0x64);
        class223.method1632((byte) -81, true);
        try {
            class251.method1754("loggedout", (byte) -104, class85.field1369.field910);
        } catch (Throwable var9) {
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)[F", line = 120)
    public static final float[] method2409(int arg0) {
        field5478++;
        float var1 = class9.method64() + class9.method66();
        int var2 = class9.method65();
        float var3 = (float) (var2 & 0xFF) / 255.0F;
        class346.field5485[arg0] = 1.0F;
        float var4 = (float) (var2 >> 16 & 0xFF) / 255.0F;
        float var5 = 0.58823526F;
        float var6 = (float) ((var2 & 0xFF5A) >> 8) / 255.0F;
        class346.field5485[0] = class188.field3158[0] * var4 * var5 * var1;
        class346.field5485[1] = class188.field3158[1] * var6 * var5 * var1;
        class346.field5485[2] = class188.field3158[2] * var3 * var5 * var1;
        return class346.field5485;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)V", line = 144)
    public static final void method2410(int arg0, byte arg1) {
        if (class290.field4627 == arg0 && arg0 != 0) {
            class236 var2 = class259.field4204[arg0];
            var2.method239(class135.field2353);
        }
        field5483++;
        if (arg1 < 58) {
            field5477 = (boolean[]) null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V", line = 164)
    public static void method2411(int arg0) {
        field5477 = null;
        if (arg0 >= -88) {
            field5477 = (boolean[]) null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 172)
    public class344(Throwable arg0, String arg1) {
        this.field5479 = arg0;
        this.field5480 = arg1;
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V", line = 182)
    public static final void method2412(int arg0) {
        if (arg0 != -16) {
            field5473 = -87;
        }
        field5474++;
        if (class199.field3403) {
            return;
        }
        class247.field4003 = true;
        if (class38.field572) {
            class288.field4590 = (float) ((int) class288.field4590 + 47 & 0xFFFFFFF0);
        } else {
            class349.field5549 += (12.0F - class349.field5549) / 2.0F;
        }
        class199.field3403 = true;
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V", line = 211)
    public static final void method2413(int arg0) {
        if (arg0 <= 9) {
            return;
        }
        for (int var1 = 0; var1 < class131.field2256; var1++) {
            int var10002 = class271.field4320[var1]--;
            if (class271.field4320[var1] >= -10) {
                class22 var3 = class133.field2272[var1];
                if (var3 == null) {
                    var3 = class22.method220(class207.field3517, class123.field2135[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class271.field4320[var1] += var3.method222();
                    class133.field2272[var1] = var3;
                }
                if (class271.field4320[var1] < 0) {
                    int var4;
                    if (class329.field5241[var1] == 0) {
                        var4 = class170.field2941[var1] * class79.field1280 >> 8;
                    } else {
                        int var5 = (class329.field5241[var1] & 0xFF) * 128;
                        int var6 = class329.field5241[var1] >> 16 & 0xFF;
                        int var7 = var6 * 128 + 64 - class218.field3632.field2036;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = (class329.field5241[var1] & 0xFF9C) >> 8;
                        int var9 = var8 * 128 + 64 - class218.field3632.field1985;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var10 > var5) {
                            class271.field4320[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class29.field393 * class170.field2941[var1] / var5 >> 8;
                    }
                    if (var4 > 0) {
                        class76 var11 = var3.method223().method701(class210.field3559);
                        class299 var12 = class299.method2034(var11, 100, var4);
                        var12.method2040(class4.field62[var1] - 1);
                        class1.field9.method1840(var12);
                    }
                    class271.field4320[var1] = -100;
                }
            } else {
                class131.field2256--;
                for (int var2 = var1; var2 < class131.field2256; var2++) {
                    class123.field2135[var2] = class123.field2135[var2 + 1];
                    class133.field2272[var2] = class133.field2272[var2 + 1];
                    class4.field62[var2] = class4.field62[var2 + 1];
                    class271.field4320[var2] = class271.field4320[var2 + 1];
                    class329.field5241[var2] = class329.field5241[var2 + 1];
                    class170.field2941[var2] = class170.field2941[var2 + 1];
                }
                var1--;
            }
        }
        if (class185.field3137 && !class158.method1263((byte) -20)) {
            if (class51.field796 != 0 && class131.field2254 != -1) {
                class8.method47(class131.field2254, false, class51.field796, -122, class179.field3030, 0);
            }
            class185.field3137 = false;
        } else if (class51.field796 != 0 && class131.field2254 != -1 && !class158.method1263((byte) -20)) {
            class341.field5443.method26(155, 7);
            class202.field3438++;
            class341.field5443.method2320(-6128, class131.field2254);
            class131.field2254 = -1;
        }
        field5481++;
    }
}
