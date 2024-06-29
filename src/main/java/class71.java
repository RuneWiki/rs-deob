import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class71 extends class20 {

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
    private int field1022;

    @OriginalMember(owner = "client!tm", name = "t", descriptor = "I")
    private int field1031;

    @OriginalMember(owner = "client!tm", name = "u", descriptor = "I")
    private int field1032;

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
    private int field1028;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    private int field1025;

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "I")
    private int field1029;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
    private int field1024;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    private int field1023;

    @OriginalMember(owner = "client!tm", name = "v", descriptor = "[I")
    public static int[] field1033 = new int[5];

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!tm", name = "w", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!tm", name = "x", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!tm", name = "y", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!tm", name = "z", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IBI)V", line = 4)
    public final void method143(int arg0, byte arg1, int arg2) {
        field1027++;
        if (arg1 > -52) {
            method594((byte) -48);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)V", line = 18)
    public static final void method593(boolean arg0) {
        class310.method2149(83);
        field1036++;
        class173.method1266(55);
        class187.method1352(14740);
        class278.method1955(-82);
        class281.method1981((byte) -121);
        class181.method1309(-107);
        class67.method565(arg0);
        class34.method236(126);
        class292.method2057(110);
        class277.method1951(false);
        class159.method1147(arg0);
        class41.method366((byte) 124);
        class117.method910((byte) 28);
        class245.method1698((byte) -124);
        class47.method420((byte) 117);
        class318.method2177(4096);
        class101.method793(false);
        class299.method2101(arg0);
        class15.field173.method1433(30);
        class78.field1100.method1433(30);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V", line = 49)
    public static void method594(byte arg0) {
        field1033 = null;
        if (arg0 >= -18) {
            field1035 = -3;
        }
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 62)
    public class71(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field1022 = arg3;
        this.field1031 = arg5;
        this.field1032 = arg2;
        this.field1028 = arg4;
        this.field1025 = arg7;
        this.field1029 = arg1;
        this.field1024 = arg6;
        this.field1023 = arg0;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIIIIB)V", line = 79)
    public static final void method595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field1037++;
        class184 var7 = class314.method2167(arg4, arg1, -2421);
        if (var7 != null && var7.field2824 != null) {
            class167 var8 = new class167();
            var8.field2518 = var7;
            var8.field2510 = var7.field2824;
            class272.method1889(1, var8);
        }
        class44.field687 = arg5;
        class323.field5016 = arg0;
        int var9 = -28 % ((64 - arg6) / 60);
        class81.field1136 = true;
        class143.field2206 = arg2;
        class90.field1313 = arg1;
        class249.field3742 = arg4;
        class88.field1295 = arg3;
        class133.method1007(var7, 65);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)V", line = 108)
    public final void method139(int arg0, int arg1, int arg2) {
        field1034++;
        int var4 = this.field1023 * arg1 >> 12;
        if (arg2 != 0) {
            return;
        }
        int var5 = this.field1029 * arg0 >> 12;
        int var6 = this.field1032 * arg1 >> 12;
        int var7 = this.field1022 * arg0 >> 12;
        int var8 = this.field1028 * arg1 >> 12;
        int var9 = this.field1031 * arg0 >> 12;
        int var10 = this.field1024 * arg1 >> 12;
        int var11 = this.field1025 * arg0 >> 12;
        class100.method782(this.field224, var9, var6, arg2 + 124, var7, var5, var4, var10, var11, var8);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BII)V", line = 138)
    public final void method144(byte arg0, int arg1, int arg2) {
        field1030++;
        if (arg0 < 116) {
            this.field1031 = 24;
        }
    }
}
