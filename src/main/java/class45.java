import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class45 extends class279 {

    @OriginalMember(owner = "client!mj", name = "S", descriptor = "I")
    private int field735 = 3216;

    @OriginalMember(owner = "client!mj", name = "V", descriptor = "I")
    private int field738 = 3216;

    @OriginalMember(owner = "client!mj", name = "T", descriptor = "I")
    private int field736 = 4096;

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "[I")
    private int[] field728 = new int[3];

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "Ltl;")
    public static class59 field729 = class85.method639("showingVideoAd", 9588);

    @OriginalMember(owner = "client!mj", name = "U", descriptor = "Z")
    public static boolean field737 = false;

    @OriginalMember(owner = "client!mj", name = "O", descriptor = "I")
    public static int field731 = 0;

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "Ltl;")
    public static class59 field733 = class85.method639("::wm1", 9588);

    @OriginalMember(owner = "client!mj", name = "G", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!mj", name = "K", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!mj", name = "W", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!mj", name = "Z", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!mj", name = "Y", descriptor = "Lki;")
    public static class166 field741;

    @OriginalMember(owner = "client!mj", name = "X", descriptor = "Lme;")
    public static class295 field740;

    @OriginalMember(owner = "client!mj", name = "H", descriptor = "[[Lkj;")
    public static class32[][] field725;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILs;)V", line = 5)
    public final void method51(int arg0, int arg1, class170 arg2) {
        if (arg0 >= -125) {
            field731 = 106;
        }
        field742++;
        if (arg1 == 0) {
            this.field736 = arg2.method1214(-18254);
        } else if (arg1 == 1) {
            this.field738 = arg2.method1214(-18254);
        } else if (arg1 == 2) {
            this.field735 = arg2.method1214(-18254);
        }
    }

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "(I)V", line = 47)
    public static void method315(int arg0) {
        field729 = null;
        field725 = (class32[][]) null;
        field741 = null;
        field733 = null;
        field740 = null;
        if (arg0 != -359830548) {
            field729 = (class59) null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(Z)V", line = 62)
    public static final void method316(boolean arg0) {
        if (arg0) {
            field731 = 124;
        }
        field727++;
        for (class121 var1 = (class121) class178.field2913.method536(2); var1 != null; var1 = (class121) class178.field2913.method533(24)) {
            class75 var2 = var1.field2018;
            if (class247.field4119 != var2.field1196 || class30.field420 > var2.field1204) {
                var1.method2000(124);
            } else if (var2.field1200 <= class30.field420) {
                if (var2.field1201 > 0) {
                    class23 var3 = class23.field311[var2.field1201 - 1];
                    if (var3 != null && var3.field1774 >= 0 && var3.field1774 < 13312 && var3.field1769 >= 0 && var3.field1769 < 13312) {
                        var2.method596(-17427, class30.field420, class73.method589(var2.field1196, true, var3.field1774, var3.field1769) - var2.field1206, var3.field1774, var3.field1769);
                    }
                }
                if (var2.field1201 < 0) {
                    int var4 = -var2.field1201 - 1;
                    class102 var5;
                    if (class155.field2537 == var4) {
                        var5 = class286.field4920;
                    } else {
                        var5 = class211.field3438[var4];
                    }
                    if (var5 != null && var5.field1774 >= 0 && var5.field1774 < 13312 && var5.field1769 >= 0 && var5.field1769 < 13312) {
                        var2.method596(-17427, class30.field420, class73.method589(var2.field1196, true, var5.field1774, var5.field1769) - var2.field1206, var5.field1774, var5.field1769);
                    }
                }
                var2.method595((byte) 69, class64.field985);
                class262.method1807(class247.field4119, (int) var2.field1199, (int) var2.field1183, (int) var2.field1189, 60, var2, var2.field1188, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 134)
    public static final void method317(int arg0, Component arg1) {
        field734++;
        arg1.removeMouseListener(class262.field4365);
        int var2 = 123 / ((-arg0 - 31) / 43);
        arg1.removeMouseMotionListener(class262.field4365);
        arg1.removeFocusListener(class262.field4365);
        class155.field2530 = 0;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZI)[I", line = 149)
    public final int[] method44(boolean arg0, int arg1) {
        field732++;
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        if (arg0) {
            field741 = (class166) null;
        }
        if (this.field4781.field354) {
            int var4 = class260.field4346 * this.field736 >> 12;
            int[] var5 = this.method1960(-122, class132.field2197 & arg1 - 1, 0);
            int[] var6 = this.method1960(-122, arg1, 0);
            int[] var7 = this.method1960(-124, class132.field2197 & arg1 + 1, 0);
            for (int var8 = 0; var8 < class56.field835; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[class310.field5270 & var8 - 1] - var6[class310.field5270 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class163.field2658[((var12 + 1) * var12 >> 1) + var11] & 0xFF;
                int var14 = var9 * var13 >> 8;
                int var15 = this.field728[1] * var14 >> 12;
                int var16 = var13 * 4096 >> 8;
                int var17 = var10 * var13 >> 8;
                int var18 = this.field728[2] * var16 >> 12;
                int var19 = this.field728[0] * var17 >> 12;
                var3[var8] = var19 + var15 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIII)V", line = 225)
    public static final void method318(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class86 var7 = new class86();
        var7.field1354 = arg1 / 128;
        var7.field1369 = arg2 / 128;
        var7.field1351 = arg3 / 128;
        var7.field1359 = arg4 / 128;
        var7.field1367 = arg0;
        var7.field1365 = arg1;
        var7.field1363 = arg2;
        var7.field1355 = arg3;
        var7.field1368 = arg4;
        var7.field1352 = arg5;
        var7.field1364 = arg6;
        class269.field4671[class254.field4220++] = var7;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V", line = 246)
    public final void method319(byte arg0) {
        if (arg0 > -9) {
            this.method319((byte) -81);
        }
        this.method320((byte) 127);
        field726++;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V", line = 322)
    public class45() {
        super(1, true);
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)V", line = 264)
    private final void method320(byte arg0) {
        field730++;
        double var2 = Math.cos((double) ((float) this.field735 / 4096.0F));
        this.field728[0] = (int) (Math.sin((double) ((float) this.field738 / 4096.0F)) * var2 * 4096.0D);
        if (arg0 < 112) {
            this.method51(-76, 22, (class170) null);
        }
        this.field728[1] = (int) (Math.cos((double) ((float) this.field738 / 4096.0F)) * 4096.0D * var2);
        this.field728[2] = (int) (Math.sin((double) ((float) this.field735 / 4096.0F)) * 4096.0D);
        int var4 = this.field728[1] * this.field728[1] >> 12;
        int var5 = this.field728[2] * this.field728[2] >> 12;
        int var6 = this.field728[0] * this.field728[0] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var6 + var5 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field728[1] = (this.field728[1] << 12) / var7;
            this.field728[2] = (this.field728[2] << 12) / var7;
            this.field728[0] = (this.field728[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ls;I)Ltl;", line = 294)
    public static final class59 method321(class170 arg0, int arg1) {
        field739++;
        if (arg1 != -4032) {
            field731 = -94;
        }
        return class306.method2123(arg0, 32767, arg1 + 4032);
    }
}
