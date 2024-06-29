import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class23 extends class280 {

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
    public int field262 = 0;

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "Z")
    public static boolean field264 = true;

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "Z")
    public static boolean field273 = false;

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "I")
    public static volatile int field274 = 0;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public int field247;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public int field248;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public int field249;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public int field252;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    public int field256;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    public int field258;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "I")
    public int field266;

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "I")
    public int field268;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "I")
    public int field269;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
    public int field271;

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "I")
    public int field275;

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "Lsl;")
    public class18 field253;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "Lbe;")
    public class29 field270;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "Lvk;")
    public class36 field254;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "Ljd;")
    public class89 field251;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "Ljd;")
    public class89 field261;

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "Z")
    public boolean field272;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "[I")
    public int[] field250;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
    public static final void method168(int arg0, int arg1) {
        class62.field905 = 20;
        class180.field2905 = 3;
        class121.field1764 = arg0;
        field257++;
        int var2 = 113 / ((arg1 - 55) / 50);
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(Z)V")
    public final void method169(boolean arg0) {
        if (arg0) {
            method171(-74, 43, (byte) 69, -51, 7, 98);
        }
        field255++;
        int var2 = this.field249;
        if (this.field254 != null) {
            class36 var5 = this.field254.method277(27981);
            if (var5 == null) {
                this.field271 = 0;
                this.field258 = 0;
                this.field250 = null;
                this.field268 = 0;
                this.field249 = -1;
                this.field275 = 0;
            } else {
                this.field250 = var5.field474;
                this.field258 = var5.field469;
                this.field268 = var5.field448 * 128;
                this.field275 = var5.field488;
                this.field249 = var5.field514;
                this.field271 = var5.field523;
            }
        } else if (this.field253 != null) {
            int var3 = class287.method1954(this.field253, -1);
            if (var2 != var3) {
                this.field249 = var3;
                class245 var4 = this.field253.field205;
                if (var4.field3972 != null) {
                    var4 = var4.method1758(true);
                }
                if (var4 == null) {
                    this.field258 = this.field268 = 0;
                } else {
                    this.field258 = var4.field3996;
                    this.field268 = var4.field4020 * 128;
                }
            }
        } else if (this.field270 != null) {
            this.field249 = class122.method889((byte) -34, this.field270);
            this.field258 = this.field270.field334;
            this.field268 = this.field270.field353 * 128;
        }
        if (this.field249 != var2 && this.field251 != null) {
            class73.field1057.method795(this.field251);
            this.field251 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(JI)V")
    public static final void method170(long arg0, int arg1) {
        field267++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class20.field222 < 100 || class105.field1530) || class20.field222 >= 200) {
            class172.method1276(0, "", (byte) 40, class166.field2696);
            return;
        }
        String var3 = class241.method1688(37, arg0);
        for (int var4 = 0; var4 < class20.field222; var4++) {
            if (class57.field819[var4] == arg0) {
                class172.method1276(0, "", (byte) 40, var3 + class125.field1837);
                return;
            }
        }
        for (int var5 = 0; var5 < class180.field2895; var5++) {
            if (class81.field1177[var5] == arg0) {
                class172.method1276(0, "", (byte) 40, class227.field3642 + var3 + class130.field1991);
                return;
            }
        }
        if (var3.equals(class186.field2993.field344)) {
            class172.method1276(0, "", (byte) 40, class270.field4361);
            return;
        }
        class104.field1508[class20.field222] = var3;
        class57.field819[class20.field222] = arg0;
        class105.field1523[class20.field222] = 0;
        if (arg1 >= -85) {
            method172(false);
        }
        class290.field4596[class20.field222] = "";
        class10.field102++;
        class206.field3313[class20.field222] = 0;
        class42.field584[class20.field222] = false;
        class76.field1089 = class231.field3717;
        class20.field222++;
        class220.field3532.method557(94, 8);
        class220.field3532.method1069(arg0, -82);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIBIII)V")
    public static final void method171(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var10 = arg5 + 1;
        class177.method1330(class240.field3831[arg5], arg0, arg1, 32232, arg4);
        field276++;
        int var9 = arg3 - 1;
        class177.method1330(class240.field3831[arg3], arg0, arg1, 32232, arg4);
        int var6 = 116 % ((arg2 + 49) / 61);
        for (int var7 = var10; var7 <= var9; var7++) {
            int[] var8 = class240.field3831[var7];
            var8[arg0] = var8[arg4] = arg1;
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(Z)V")
    public static final void method172(boolean arg0) {
        if (!arg0) {
            for (int var1 = 0; var1 < 100; var1++) {
                class190.field3070[var1] = true;
            }
            field260++;
        }
    }
}
