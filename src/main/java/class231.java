import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class231 extends class242 {

    @OriginalMember(owner = "client!o", name = "tc", descriptor = "[Z")
    public static boolean[] field3497 = new boolean[5];

    @OriginalMember(owner = "client!o", name = "qc", descriptor = "Ljava/lang/String;")
    public static String field3494 = "flash1:";

    @OriginalMember(owner = "client!o", name = "mc", descriptor = "I")
    public static int field3490 = 0;

    @OriginalMember(owner = "client!o", name = "wc", descriptor = "I")
    public static int field3500 = 0;

    @OriginalMember(owner = "client!o", name = "nc", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!o", name = "oc", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!o", name = "pc", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!o", name = "sc", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!o", name = "vc", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!o", name = "xc", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!o", name = "yc", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!o", name = "Ac", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!o", name = "zc", descriptor = "Lld;")
    public class140 field3503;

    @OriginalMember(owner = "client!o", name = "uc", descriptor = "Ljava/awt/Frame;")
    public static Frame field3498;

    @OriginalMember(owner = "client!o", name = "rc", descriptor = "[[[I")
    public static int[][][] field3495;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)I", line = 10)
    public final int method415(int arg0) {
        field3492++;
        if (arg0 <= 120) {
            this.method408(-17, 83, -46, -43, 44);
        }
        if (this.field3503.field2101 != null) {
            class140 var2 = this.field3503.method961(-114);
            if (var2 != null && var2.field2145 != -1) {
                return var2.field2145;
            }
        }
        return this.field3746;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)Z", line = 34)
    public final boolean method414(byte arg0) {
        int var2 = 84 % ((30 - arg0) / 58);
        field3493++;
        return this.field3503 != null;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V", line = 47)
    public static void method1598(byte arg0) {
        field3498 = null;
        field3494 = null;
        if (arg0 >= -77) {
            field3498 = (Frame) null;
        }
        field3495 = (int[][][]) null;
        field3497 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "()I", line = 62)
    public final int method417() {
        field3491++;
        return this.field3707;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILld;)V", line = 74)
    public final void method1599(int arg0, class140 arg1) {
        this.field3503 = arg1;
        if (arg0 != 23299) {
            this.method415(-12);
        }
        if (this.field3798 != null) {
            this.field3798.method992();
        }
        field3501++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIII)V", line = 92)
    public final void method408(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3499++;
        if (this.field3503 == null) {
            return;
        }
        if (!this.field3756) {
            class111 var6 = this.field3807 != -1 && this.field3796 == 0 ? class289.method2067((byte) -28, this.field3807) : null;
            class111 var7 = this.field3778 == -1 || this.field3778 == this.method1719(-1).field4486 && var6 != null ? null : class289.method2067((byte) -71, this.field3778);
            class362 var8 = this.field3503.method969(this.field3710, var6, this.field3738, var7, this.field3740, this.field3769, this.field3717, -1, this.field3715, this.field3748);
            if (var8 == null) {
                return;
            }
            this.method1709((class362) null, var8, (byte) 81);
        }
        if (this.field3798 != null) {
            this.field3798.method984(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIIIJILlg;)V", line = 130)
    public final void method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class141 arg10) {
        field3502++;
        if (this.field3503 == null) {
            return;
        }
        class111 var13 = this.field3807 != -1 && this.field3796 == 0 ? class289.method2067((byte) -71, this.field3807) : null;
        class111 var14 = this.field3778 == -1 || this.field3778 == this.method1719(-1).field4486 && var13 != null ? null : class289.method2067((byte) -80, this.field3778);
        class362 var15 = this.field3503.method969(this.field3710, var13, this.field3738, var14, this.field3740, this.field3769, this.field3717, -1, this.field3715, this.field3748);
        if (var15 == null) {
            return;
        }
        this.field3707 = var15.method417();
        class140 var16 = this.field3503;
        if (var16.field2101 != null) {
            var16 = var16.method961(-108);
        }
        if (class171.field2601 && var16.field2147) {
            class362 var17 = class160.method1163(this.field3503.field2148, this.field3503.field2157, this.field3503.field2156, 0, this.field3503.field2111, var14 == null ? this.field3738 : this.field3715, this.field3800, this.field3767, arg0, var14 == null ? var13 : var14, this.field3503.field2124, this.field3763, this.field3728, var15);
            if (class272.field4317) {
                float var18 = class272.method1932();
                float var19 = class272.method1956();
                class272.method1922();
                class272.method1936(var18, var19 - 150.0F);
                var17.method410(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field3798);
                class272.method1942();
                class272.method1936(var18, var19);
            } else {
                var17.method410(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field3798);
            }
        }
        this.method1711(var15, (byte) -74);
        this.method1720(var15, -30468, arg0);
        class362 var20 = null;
        if (this.field3703 != -1 && this.field3803 != -1) {
            class314 var21 = class255.method1803(this.field3703, (byte) -51);
            var20 = var21.method2216(this.field3752, this.field3791, this.field3803, 41);
            if (var20 != null) {
                var20.method854(0, -this.field3785, 0);
                if (var21.field4916) {
                    if (class91.field1202 != 0) {
                        var20.method828(class91.field1202);
                    }
                    if (class194.field2951 != 0) {
                        var20.method843(class194.field2951);
                    }
                    if (class291.field4586 != 0) {
                        var20.method854(0, class291.field4586, 0);
                    }
                }
            }
        }
        if (!class272.field4317) {
            if (var20 != null) {
                var15 = ((class133) var15).method914(var20);
            }
            this.method1709(var20, var15, (byte) 47);
            if (this.field3503.field2111 == 1) {
                var15.field5720 = true;
            }
            var15.method410(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3798);
            return;
        }
        this.method1709(var20, var15, (byte) 33);
        if (this.field3503.field2111 == 1) {
            var15.field5720 = true;
        }
        var15.method410(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3798);
        if (var20 == null) {
            return;
        }
        if (this.field3503.field2111 == 1) {
            var20.field5720 = true;
        }
        if (this.field3798 != null) {
            class124 var22 = (class124) var20;
            this.field3798.method983(var22.field1711, var22.field1752, true, var22.field1741, var22.field1723, var22.field1708);
        }
        var20.method410(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3798);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lnk;I)V", line = 259)
    public static final void method1600(class16 arg0, int arg1) {
        field3496++;
        class95.field1314 = class17.method130(arg0, -51, class258.field4075);
        class132.field1902 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var3 = (float) (class31.field366[var2] >> 16 & 0xFF);
            int var4 = (class31.field366[var2 + 1] & 0xFF0000) >> 16;
            float var5 = ((float) var4 - var3) / 64.0F;
            float var6 = (float) ((class31.field366[var2] & 0xFF00) >> 8);
            int var7 = class31.field366[var2 + 1] >> 8 & 0xFF;
            float var8 = (float) (class31.field366[var2] & 0xFF);
            float var9 = ((float) var7 - var6) / 64.0F;
            int var10 = class31.field366[var2 + 1] & 0xFF;
            float var11 = ((float) var10 - var8) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class132.field1902[var2 * 64 + var12] = class77.method492((int) var8, class77.method492((int) var6 << 8, (int) var3 << 16));
                var3 += var5;
                var8 += var11;
                var6 += var9;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class132.field1902[var13] = class31.field366[3];
        }
        if (arg1 <= 94) {
            return;
        }
        class117.field1619 = new int[32768];
        class278.field4377 = new int[32768];
        class266.method1874(-21999, (class270) null);
        class77.field1012 = new int[32768];
        class138.field2069 = new int[32768];
        class309.field4853 = new class158(128, 254);
    }

    @OriginalMember(owner = "client!o", name = "finalize", descriptor = "()V", line = 328)
    protected final void finalize() {
        field3504++;
        if (this.field3798 != null) {
            this.field3798.method987();
        }
    }
}
