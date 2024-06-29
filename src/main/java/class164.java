import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class164 {

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public int field3029 = 99;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "Z")
    public boolean field3038 = false;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public int field3039 = -1;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public int field3043 = -1;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public int field3030 = 2;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public int field3036 = 5;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
    public int field3063 = -1;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "Z")
    public boolean field3057 = false;

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "Z")
    public boolean field3065 = false;

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "I")
    public int field3061 = -1;

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "Z")
    public boolean field3059 = false;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    public int field3046 = -1;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "Lid;")
    public static class149 field3032 = class60.method382(")1 ", (byte) 53);

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public static int field3045 = 0;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "Lid;")
    public static class149 field3049 = class60.method382("::clientjs5drop", (byte) 124);

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "Lid;")
    public static class149 field3044 = class60.method382("Examiner", (byte) 49);

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "Lid;")
    public static class149 field3054 = class60.method382("Shift)2click ENABLED(Q", (byte) 123);

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "Lid;")
    public static class149 field3056 = class60.method382("::replacecanvas", (byte) 94);

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "Lid;")
    public static class149 field3064 = class60.method382("runes", (byte) 60);

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public int field3034;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "Lvc;")
    public static class190 field3051;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "Lse;")
    public static class205 field3047;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "Lal;")
    public static class230 field3058;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "[I")
    public int[] field3035;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "[I")
    public static int[] field3037;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "[I")
    private int[] field3048;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "[I")
    public int[] field3060;

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "[Z")
    public boolean[] field3055;

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "[[I")
    public int[][] field3062;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IILnd;IIZ)Lnd;")
    public final class262 method1199(int arg0, int arg1, class262 arg2, int arg3, int arg4, boolean arg5) {
        field3031++;
        int var7 = this.field3060[arg0];
        int var8 = this.field3035[arg0];
        class137 var9 = class148.method1014(126, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg2.method843(true, true, true);
        }
        int var11 = arg1 & 0x3;
        class137 var12 = null;
        if ((this.field3057 || class243.field4265) && arg4 != -1 && this.field3035.length > arg4) {
            int var13 = this.field3035[arg4];
            var12 = class148.method1014(99, var13 >> 16);
            arg4 = var13 & 0xFFFF;
        }
        class262 var14;
        if (var12 == null) {
            var14 = arg2.method843(!var9.method961((byte) 98, var10), !var9.method959(1, var10), !this.field3065);
        } else {
            var14 = arg2.method843(!var9.method961((byte) 112, var10) & !var12.method961((byte) 121, arg4), !var9.method959(1, var10) & !var12.method959(1, arg4), !this.field3065);
        }
        if (var11 == 1) {
            var14.method839();
        } else if (var11 == 2) {
            var14.method836();
        } else if (var11 == 3) {
            var14.method857();
        }
        if (arg5) {
            this.method1206((byte) 106, (class74) null);
        }
        var14.method1822(var9, var10, var12, arg4, arg3 - 1, var7, this.field3065);
        if (var11 == 1) {
            var14.method857();
        } else if (var11 == 2) {
            var14.method836();
        } else if (var11 == 3) {
            var14.method839();
        }
        return var14;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public static void method1200(int arg0) {
        field3054 = null;
        field3032 = null;
        field3049 = null;
        field3056 = null;
        field3037 = null;
        field3044 = null;
        if (arg0 != 0) {
            field3064 = null;
        }
        field3058 = null;
        field3051 = null;
        field3064 = null;
        field3047 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLqk;ZILqk;)I")
    public static final int method1201(byte arg0, class208 arg1, boolean arg2, int arg3, class208 arg4) {
        field3040++;
        if (arg3 == 1) {
            int var5 = arg1.field4484;
            int var6 = arg4.field4484;
            if (!arg2) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg3 == 2) {
            return arg1.method1417(2047).field1760.method1056(arg4.method1417(arg0 + 2135).field1760, (byte) -42);
        } else if (arg3 == 3) {
            if (arg1.field3723.method1041((byte) -88, class27.field403)) {
                if (arg4.field3723.method1041((byte) -78, class27.field403)) {
                    return 0;
                } else if (arg2) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg4.field3723.method1041((byte) -67, class27.field403)) {
                return arg2 ? 1 : -1;
            } else {
                return arg1.field3723.method1056(arg4.field3723, (byte) -43);
            }
        } else if (arg3 == 4) {
            if (arg1.method1763((byte) -101)) {
                return arg4.method1763((byte) -95) ? 0 : 1;
            } else if (arg4.method1763((byte) -112)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 5) {
            if (arg1.method1770(true)) {
                return arg4.method1770(true) ? 0 : 1;
            } else if (arg4.method1770(true)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 6) {
            if (arg1.method1762(arg0 + 214)) {
                return arg4.method1762(126) ? 0 : 1;
            } else if (arg4.method1762(127)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 != 7) {
            if (arg0 != -88) {
                method1204(63);
            }
            return arg1.field3721 - arg4.field3721;
        } else if (arg1.method1764(false)) {
            return arg4.method1764(false) ? 0 : 1;
        } else if (arg4.method1764(false)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
    public final void method1202(int arg0) {
        if (this.field3043 == -1) {
            if (this.field3055 == null) {
                this.field3043 = 0;
            } else {
                this.field3043 = 2;
            }
        }
        field3033++;
        if (this.field3039 == -1) {
            if (this.field3055 == null) {
                this.field3039 = 0;
            } else {
                this.field3039 = 2;
            }
        }
        if (arg0 <= 47) {
            method1204(-123);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IILnd;II)Lnd;")
    public final class262 method1203(int arg0, int arg1, class262 arg2, int arg3, int arg4) {
        field3067++;
        int var6 = this.field3060[arg0];
        int var7 = this.field3035[arg0];
        class137 var8 = class148.method1014(97, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg2.method846(true, true, true);
        }
        class137 var10 = null;
        class137 var11 = null;
        if (arg3 != -20002) {
            this.method1202(-31);
        }
        class137 var12 = null;
        if ((this.field3057 || class243.field4265) && arg1 != -1 && arg1 < this.field3035.length) {
            int var13 = this.field3035[arg1];
            var11 = class148.method1014(101, var13 >> 16);
            arg1 = var13 & 0xFFFF;
        }
        int var14 = 0;
        int var15 = 0;
        if (this.field3048 != null) {
            if (arg0 < this.field3048.length) {
                var14 = this.field3048[arg0];
                if (var14 != 65535) {
                    var10 = class148.method1014(arg3 ^ 0xFFFFB181, var14 >> 16);
                    var14 &= 0xFFFF;
                }
            }
            if ((this.field3057 || class243.field4265) && arg1 != -1 && this.field3048.length > arg1) {
                var15 = this.field3048[arg1];
                if (var15 != 65535) {
                    var12 = class148.method1014(87, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method961((byte) 115, var9);
        boolean var17 = !var8.method959(1, var9);
        if (var10 != null) {
            var16 &= !var10.method961((byte) -50, var14);
            var17 &= !var10.method959(1, var14);
        }
        if (var11 != null) {
            var16 &= !var11.method961((byte) -92, arg1);
            var17 &= !var11.method959(arg3 + 20003, arg1);
        }
        if (var12 != null) {
            var16 &= !var12.method961((byte) -125, var15);
            var17 &= !var12.method959(1, var15);
        }
        class262 var18 = arg2.method846(var16, var17, !this.field3065);
        var18.method1822(var8, var9, var11, arg1, arg4 - 1, var6, this.field3065);
        if (var10 != null) {
            var18.method1822(var10, var14, var12, var15, arg4 - 1, var6, this.field3065);
        }
        return var18;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V")
    public static final void method1204(int arg0) {
        field3042++;
        Container var1;
        if (class47.field756 != null) {
            var1 = class47.field756;
        } else if (class69.field1203 == null) {
            var1 = class272.field4900.field436;
        } else {
            var1 = class69.field1203;
        }
        if (arg0 >= -53) {
            method1201((byte) 73, (class208) null, true, 119, (class208) null);
        }
        class35.field530 = var1.getSize().width;
        class273.field4910 = var1.getSize().height;
        if (class69.field1203 == var1) {
            Insets var2 = class69.field1203.getInsets();
            class273.field4910 -= var2.top + var2.bottom;
            class35.field530 -= var2.left + var2.right;
        }
        if (class79.method600(84) >= 2) {
            class240.field4197 = class273.field4910;
            class112.field1926 = 0;
            class213.field3772 = 0;
            class218.field3851 = class35.field530;
        } else {
            class213.field3772 = (class35.field530 - 765) / 2;
            class112.field1926 = 0;
            class240.field4197 = 503;
            class218.field3851 = 765;
        }
        class244.field4295.setSize(class218.field3851, class240.field4197);
        if (class69.field1203 == var1) {
            Insets var3 = class69.field1203.getInsets();
            class244.field4295.setLocation(class213.field3772 + var3.left, var3.top - -class112.field1926);
        } else {
            class244.field4295.setLocation(class213.field3772, class112.field1926);
        }
        if (class11.field161 != -1) {
            class259.method1783(true, false);
        }
        class7.method35(90);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILgd;I)V")
    private final void method1205(int arg0, class74 arg1, int arg2) {
        if (arg0 == 1) {
            int var4 = arg1.method485(-2386);
            this.field3060 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3060[var5] = arg1.method485(-2386);
            }
            this.field3035 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field3035[var6] = arg1.method485(-2386);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field3035[var7] = (arg1.method485(-2386) << 16) + this.field3035[var7];
            }
        } else if (arg0 == 2) {
            this.field3061 = arg1.method485(-2386);
        } else if (arg0 == 3) {
            this.field3055 = new boolean[256];
            int var15 = arg1.method489((byte) -120);
            for (int var16 = 0; var16 < var15; var16++) {
                this.field3055[arg1.method489((byte) -76)] = true;
            }
        } else if (arg0 == 4) {
            this.field3059 = true;
        } else if (arg0 == 5) {
            this.field3036 = arg1.method489((byte) 114);
        } else if (arg0 == 6) {
            this.field3063 = arg1.method485(-2386);
        } else if (arg0 == 7) {
            this.field3046 = arg1.method485(-2386);
        } else if (arg0 == 8) {
            this.field3029 = arg1.method489((byte) 126);
        } else if (arg0 == 9) {
            this.field3043 = arg1.method489((byte) -57);
        } else if (arg0 == 10) {
            this.field3039 = arg1.method489((byte) 116);
        } else if (arg0 == 11) {
            this.field3030 = arg1.method489((byte) 110);
        } else if (arg0 == 12) {
            int var8 = arg1.method489((byte) 88);
            this.field3048 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3048[var9] = arg1.method485(-2386);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field3048[var10] = (arg1.method485(-2386) << 16) + this.field3048[var10];
            }
        } else if (arg0 == 13) {
            int var11 = arg1.method485(-2386);
            this.field3062 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg1.method489((byte) -47);
                if (var13 > 0) {
                    this.field3062[var12] = new int[var13];
                    this.field3062[var12][0] = arg1.method525(65280);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field3062[var12][var14] = arg1.method485(-2386);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field3065 = true;
        } else if (arg0 == 15) {
            this.field3057 = true;
        } else if (arg0 == 16) {
            this.field3038 = true;
        }
        field3052++;
        if (arg2 <= 25) {
            this.method1202(-97);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLgd;)V")
    public final void method1206(byte arg0, class74 arg1) {
        while (true) {
            int var3 = arg1.method489((byte) 78);
            if (var3 == 0) {
                if (arg0 <= 114) {
                    method1204(69);
                }
                field3041++;
                return;
            }
            this.method1205(var3, arg1, 56);
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(IILnd;II)Lnd;")
    public final class262 method1207(int arg0, int arg1, class262 arg2, int arg3, int arg4) {
        field3066++;
        int var6 = this.field3060[arg3];
        int var7 = this.field3035[arg3];
        class137 var8 = class148.method1014(85, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg2.method848(true, true, true);
        }
        class137 var10 = null;
        if ((this.field3057 || class243.field4265) && arg4 != -1 && arg4 < this.field3035.length) {
            int var11 = this.field3035[arg4];
            var10 = class148.method1014(98, var11 >> 16);
            arg4 = var11 & 0xFFFF;
        }
        class262 var12;
        if (var10 == null) {
            var12 = arg2.method848(!var8.method961((byte) 121, var9), !var8.method959(1, var9), !this.field3065);
        } else {
            var12 = arg2.method848(!var8.method961((byte) 80, var9) & !var10.method961((byte) -122, arg4), !var8.method959(1, var9) & !var10.method959(1, arg4), !this.field3065);
        }
        if (arg0 <= 34) {
            this.field3046 = -120;
        }
        var12.method1822(var8, var9, var10, arg4, arg1 - 1, var6, this.field3065);
        return var12;
    }
}
