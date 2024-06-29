import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class56 extends class209 {

    @OriginalMember(owner = "client!gm", name = "I", descriptor = "Luf;")
    public static class168 field734 = class148.method1019(-1720, "www)2wtrc");

    @OriginalMember(owner = "client!gm", name = "C", descriptor = "Ljava/util/Calendar;")
    public static Calendar field728 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!gm", name = "M", descriptor = "Luf;")
    public static class168 field738 = class148.method1019(-1720, "<br>(X");

    @OriginalMember(owner = "client!gm", name = "O", descriptor = "[Lgg;")
    public static class124[] field740 = new class124[50];

    @OriginalMember(owner = "client!gm", name = "x", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!gm", name = "y", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!gm", name = "A", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!gm", name = "D", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!gm", name = "E", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!gm", name = "G", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!gm", name = "K", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!gm", name = "L", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!gm", name = "N", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!gm", name = "w", descriptor = "Luf;")
    public class168 field722;

    @OriginalMember(owner = "client!gm", name = "B", descriptor = "[I")
    public int[] field727;

    @OriginalMember(owner = "client!gm", name = "F", descriptor = "[I")
    public int[] field731;

    @OriginalMember(owner = "client!gm", name = "H", descriptor = "[I")
    public int[] field733;

    @OriginalMember(owner = "client!gm", name = "J", descriptor = "[I")
    public int[] field735;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)I", line = 5)
    public final int method310(int arg0, int arg1) {
        field732++;
        if (this.field731 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg1 >= -21) {
            this.method315(51, 62);
        }
        while (var3 < this.field731.length) {
            if (this.field735[var3] == arg0) {
                return this.field731[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)V", line = 30)
    public static final void method311(int arg0) {
        for (int var1 = -1; var1 < class167.field2676; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class281.field4719[var1];
            }
            class54 var3 = class9.field117[var2];
            if (var3 != null && var3.field3051 > 0) {
                var3.field3051--;
                if (var3.field3051 == 0) {
                    var3.field3039 = null;
                }
            }
        }
        int var4 = -112 / ((-arg0 - 60) / 63);
        field729++;
        for (int var5 = 0; var5 < class2.field15; var5++) {
            int var6 = class116.field1814[var5];
            class22 var7 = class190.field3065[var6];
            if (var7 != null && var7.field3051 > 0) {
                var7.field3051--;
                if (var7.field3051 == 0) {
                    var7.field3039 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)V", line = 85)
    public static void method312(boolean arg0) {
        field728 = null;
        field740 = null;
        if (arg0) {
            field728 = (Calendar) null;
        }
        field734 = null;
        field738 = null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IZLj;)V", line = 106)
    private final void method313(int arg0, boolean arg1, class153 arg2) {
        field739++;
        if (arg0 == 1) {
            this.field722 = arg2.method1075(80);
        } else if (arg0 == 2) {
            int var7 = arg2.method1042((byte) 90);
            this.field733 = new int[var7];
            this.field727 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field727[var8] = arg2.method1069(105);
                int var9 = arg2.method1042((byte) -111);
                if (var9 == 0) {
                    this.field733[var8] = -1;
                } else {
                    this.field733[var8] = var9;
                }
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method1042((byte) 109);
            this.field735 = new int[var4];
            this.field731 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field731[var5] = arg2.method1069(70);
                int var6 = arg2.method1042((byte) -112);
                if (var6 == 0) {
                    this.field735[var5] = -1;
                } else {
                    this.field735[var5] = var6;
                }
            }
        } else if (arg0 == 4) {
        }
        if (arg1) {
            method316((byte) -59);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIIIIII)V", line = 186)
    public static final void method314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg7 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class234.field3760 - class275.field4622) * var8 / 100 + class275.field4622;
        int var10 = arg4 * var9 >> 8;
        field725++;
        int var11 = arg6 - arg0 & 0x7FF;
        int var12 = 0;
        int var13 = 2048 - arg3 & 0x7FF;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            int var16 = class173.field2818[var11];
            int var17 = class173.field2812[var11];
            var14 = -var10 * var17 >> 16;
            var15 = var10 * var16 >> 16;
        }
        if (var13 != 0) {
            int var18 = class173.field2818[var13];
            int var19 = class173.field2812[var13];
            var12 = var15 * var19 >> 16;
            var15 = var15 * var18 >> 16;
        }
        class248.field4249 = arg5 - var12;
        class143.field2208 = arg2 - var14;
        class157.field2483 = arg1 - var15;
        class105.field1624 = arg0;
        class288.field4847 = arg3;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(II)I", line = 244)
    public final int method315(int arg0, int arg1) {
        field737++;
        if (this.field727 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field727.length; var3++) {
            if (this.field733[var3] == arg0) {
                return this.field727[var3];
            }
        }
        if (arg1 != -30145) {
            this.field731 = (int[]) null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(B)V", line = 274)
    public static final void method316(byte arg0) {
        if (arg0 < 7) {
            field728 = (Calendar) null;
        }
        class128.field1995.method1429((byte) 120);
        field730++;
    }

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "(B)V", line = 287)
    public final void method317(byte arg0) {
        field736++;
        int var2 = 92 / ((44 - arg0) / 36);
        if (this.field731 != null) {
            for (int var3 = 0; var3 < this.field731.length; var3++) {
                this.field731[var3] = class80.method492(this.field731[var3], 32768);
            }
        }
        if (this.field727 != null) {
            for (int var4 = 0; var4 < this.field727.length; var4++) {
                this.field727[var4] = class80.method492(this.field727[var4], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILj;)V", line = 317)
    public final void method318(int arg0, class153 arg1) {
        if (arg0 != 0) {
            field724 = -40;
        }
        while (true) {
            int var3 = arg1.method1042((byte) 120);
            if (var3 == 0) {
                field723++;
                return;
            }
            this.method313(var3, false, arg1);
        }
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)V", line = 343)
    public static final void method319(int arg0) {
        if (arg0 != -31082) {
            field724 = -113;
        }
        if (class211.field3471 == 2) {
            if (class301.field5093 == class187.field2955 && class25.field310 == class166.field2661) {
                class211.field3471 = 0;
                class238.method1615((byte) 66, class22.field275 - 1);
            }
        } else if (class301.field5093 == class206.field3384 && class83.field1244 == class166.field2661) {
            class211.field3471 = 0;
            class238.method1615((byte) -127, class22.field275 - 1);
        } else {
            class187.field2955 = class206.field3384;
            class211.field3471 = 2;
            class25.field310 = class83.field1244;
        }
        field726++;
    }
}
