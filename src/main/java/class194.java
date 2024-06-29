import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class194 extends class273 {

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
    private int field2923;

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "[I")
    public static int[] field2918 = new int[2];

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "[S")
    public static short[] field2925 = new short[500];

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "I")
    public static int field2926 = 0;

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "Ltg;")
    public static class77 field2921 = new class77(0, 0);

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "J")
    public static long field2931 = 0L;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
    public static int field2930 = 0;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "[I")
    public static int[] field2932 = new int[100];

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 5)
    public static final void method1317(String arg0, int arg1, int arg2) {
        class75 var3 = class204.method1371(arg2, 7, arg1);
        field2922++;
        var3.method524((byte) 57);
        var3.field1118 = arg0;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V", line = 15)
    public class194() {
        this(4096);
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(I)V", line = 21)
    public class194(int arg0) {
        super(0, true);
        this.field2923 = 4096;
        this.field2923 = arg0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILjh;II)V", line = 32)
    public static final void method1318(int arg0, class207 arg1, int arg2, int arg3) {
        field2924++;
        if (class168.field2565 < 2 && class81.field1199 == 0 && !class120.field1841) {
            return;
        }
        String var4 = class165.method1124(0);
        if (arg1 == null) {
            int var6 = class286.field4380.method1251(var4, arg3 + 4, arg2 - -15, 16777215, 0, class109.field1692, class242.field3828);
            class136.method928(713, arg3 + 4, class286.field4380.method1247(var4) - -var6, 15, arg2);
        } else {
            class180 var5 = arg1.method1393(class192.field2904, 1);
            if (var5 == null) {
                var5 = class286.field4380;
            }
            var5.method1228(var4, arg3, arg2, arg1.field3169, arg1.field3239, arg1.field3139, arg1.field3287, arg1.field3192, arg1.field3174, class109.field1692, class242.field3828, class315.field4965);
            class136.method928(713, class315.field4965[0], class315.field4965[2], class315.field4965[3], class315.field4965[1]);
        }
        if (arg0 <= 41) {
            method1319(-10);
        }
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)V", line = 73)
    public static final void method1319(int arg0) {
        field2919++;
        class208 var1 = (class208) class203.field3069.method10((byte) 67);
        if (arg0 != 15) {
            return;
        }
        while (var1 != null) {
            if (var1.field3320 == -1) {
                var1.field3309 = 0;
                class95.method650(var1, 1);
            } else {
                var1.method1284(0);
            }
            var1 = (class208) class203.field3069.method13((byte) -32);
        }
    }

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)V", line = 98)
    public static void method1320(int arg0) {
        field2918 = null;
        field2921 = null;
        field2925 = null;
        field2932 = null;
        if (arg0 != -8632) {
            method1321(-75);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BILgn;)V", line = 124)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        if (arg1 == 0) {
            this.field2923 = (arg2.method2043((byte) -115) << 12) / 255;
        }
        field2927++;
        if (arg0 <= 27) {
            field2931 = -33L;
        }
    }

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "(I)V", line = 149)
    public static final void method1321(int arg0) {
        int var1 = class246.field3858;
        field2920++;
        int var2 = class307.field4832;
        int var3 = class179.field2748;
        int var4 = class116.field1797 - 3;
        byte var5 = 20;
        if (class128.field2001 == null || class177.field2719 == null) {
            if (class121.field1859.method2093(-45, class229.field3691) && class121.field1859.method2093(116, class188.field2871)) {
                class128.field2001 = class6.method37(class229.field3691, class121.field1859, arg0 ^ 0x56, 0);
                class177.field2719 = class6.method37(class188.field2871, class121.field1859, -89, 0);
                if (class333.field5166) {
                    if ((class128.field2001 instanceof class135)) {
                        class128.field2001 = new class16((class178) class128.field2001);
                    } else {
                        class128.field2001 = new class186((class178) class128.field2001);
                    }
                    if ((class177.field2719 instanceof class135)) {
                        class177.field2719 = new class16((class178) class177.field2719);
                    } else {
                        class177.field2719 = new class186((class178) class177.field2719);
                    }
                }
            } else if (class333.field5166) {
                class238.method1627(var1, var2, var3, var5, class179.field2737, 256 - class130.field2026);
            } else {
                class57.method382(var1, var2, var3, var5, class179.field2737, 256 - class130.field2026);
            }
        }
        if (class128.field2001 != null && class177.field2719 != null) {
            int var6 = (var3 - (class177.field2719.field3847 * 2)) / class128.field2001.field3847;
            for (int var7 = 0; var7 < var6; var7++) {
                class128.field2001.method921(class128.field2001.field3847 * var7 + class177.field2719.field3847 + var1, var2);
            }
            class177.field2719.method921(var1, var2);
            class177.field2719.method920(var1 + var3 - class177.field2719.field3847, var2);
        }
        class286.field4380.method1237(class82.field1224, var1 + 3, var2 + 14, class184.field2826, -1);
        if (class333.field5166) {
            class238.method1627(var1, var2 + var5, var3, var4 - var5, class179.field2737, 256 - class130.field2026);
        } else {
            class57.method382(var1, var2 + var5, var3, var4 - var5, class179.field2737, 256 - class130.field2026);
        }
        int var8 = class199.field2985;
        int var9 = class107.field1636;
        if (arg0 != -13) {
            field2926 = 102;
        }
        for (int var10 = 0; var10 < class168.field2565; var10++) {
            int var11 = var2 + var5 + ((class168.field2565 - (var10 + 1)) * 15) + 13;
            if (var1 < var8 && var8 < (var1 + var3) && var11 - 13 < var9 && var9 < (var11 + 3)) {
                if (class333.field5166) {
                    class238.method1627(var1, var11 - 12, var3, 15, class306.field4820, 256 - class308.field4846);
                } else {
                    class57.method382(var1, var11 - 12, var3, 15, class306.field4820, 256 - class308.field4846);
                }
            }
        }
        if ((class259.field4021 == null || class343.field5343 == null || class271.field4164 == null) && class121.field1859.method2093(-57, class203.field3070) && class121.field1859.method2093(arg0 ^ 0xFFFFFFC3, class148.field2332) && class121.field1859.method2093(arg0 - 88, class51.field729)) {
            class259.field4021 = class6.method37(class203.field3070, class121.field1859, -34, 0);
            class343.field5343 = class6.method37(class148.field2332, class121.field1859, -81, 0);
            class271.field4164 = class6.method37(class51.field729, class121.field1859, -98, 0);
            if (class333.field5166) {
                if ((class259.field4021 instanceof class135)) {
                    class259.field4021 = new class16((class178) class259.field4021);
                } else {
                    class259.field4021 = new class186((class178) class259.field4021);
                }
                if ((class343.field5343 instanceof class135)) {
                    class343.field5343 = new class16((class178) class343.field5343);
                } else {
                    class343.field5343 = new class186((class178) class343.field5343);
                }
                if ((class271.field4164 instanceof class135)) {
                    class271.field4164 = new class16((class178) class271.field4164);
                } else {
                    class271.field4164 = new class186((class178) class271.field4164);
                }
            }
        }
        if (class259.field4021 != null && class343.field5343 != null && class271.field4164 != null) {
            int var12 = (var3 - (class271.field4164.field3847 * 2)) / class259.field4021.field3847;
            for (int var13 = 0; var13 < var12; var13++) {
                class259.field4021.method921(var1 + (class259.field4021.field3847 * var13) + class271.field4164.field3847, var2 - -var4 + -class259.field4021.field3844);
            }
            int var14 = (var4 - var5 - class271.field4164.field3844) / class343.field5343.field3844;
            for (int var15 = 0; var15 < var14; var15++) {
                class343.field5343.method921(var1, class343.field5343.field3844 * var15 + var2 + var5);
                class343.field5343.method920(var1 + var3 - class343.field5343.field3847, var2 + var5 - -(class343.field5343.field3844 * var15));
            }
            class271.field4164.method921(var1, var2 + var4 - class271.field4164.field3844);
            class271.field4164.method920(var1 + var3 - class271.field4164.field3847, var2 - class271.field4164.field3844 + var4);
        }
        for (int var16 = 0; var16 < class168.field2565; var16++) {
            int var17 = (class168.field2565 - var16 - 1) * 15 + var2 + var5 + 13;
            int var18 = class184.field2826;
            if (var8 > var1 && var1 + var3 > var8 && var9 > (var17 - 13) && var9 < var17 + 3) {
                var18 = class215.field3398;
            }
            class286.field4380.method1237(class234.method1597(0, var16), var1 + 3, var17, var18, 0);
        }
        class117.method804(class116.field1797, class307.field4832, 114, class246.field3858, class179.field2748);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)[I", line = 336)
    public final int[] method331(int arg0, int arg1) {
        field2928++;
        if (arg1 != -14650) {
            method1319(-72);
        }
        int[] var3 = this.field4204.method365(arg0, 0);
        if (this.field4204.field792) {
            class223.method1500(var3, 0, class27.field346, this.field2923);
        }
        return var3;
    }
}
