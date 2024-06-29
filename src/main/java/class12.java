import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class12 extends class179 {

    @OriginalMember(owner = "client!fo", name = "C", descriptor = "Lvh;")
    public static class168 field148 = null;

    @OriginalMember(owner = "client!fo", name = "B", descriptor = "Lcq;")
    public static class72 field147 = new class72("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!fo", name = "L", descriptor = "[I")
    public static int[] field157 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!fo", name = "s", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!fo", name = "v", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!fo", name = "w", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!fo", name = "x", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!fo", name = "y", descriptor = "I")
    public int field144;

    @OriginalMember(owner = "client!fo", name = "z", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!fo", name = "A", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!fo", name = "D", descriptor = "I")
    public int field149;

    @OriginalMember(owner = "client!fo", name = "E", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!fo", name = "F", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!fo", name = "G", descriptor = "I")
    public int field152;

    @OriginalMember(owner = "client!fo", name = "H", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!fo", name = "I", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!fo", name = "J", descriptor = "Lph;")
    public static class315 field155;

    @OriginalMember(owner = "client!fo", name = "t", descriptor = "Lpo;")
    public static class342 field139;

    @OriginalMember(owner = "client!fo", name = "u", descriptor = "Ljava/lang/String;")
    public String field140;

    @OriginalMember(owner = "client!fo", name = "K", descriptor = "[Lc;")
    public static class436[] field156;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "(B)V", line = 3)
    public static final void method60(byte arg0) {
        if (arg0 == -86) {
            ++field142;
            if (class17.field187 != -1) {
                class39.method250(class17.field187, -1, -1, false, true);
                class17.field187 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "(B)V", line = 20)
    public static void method61(byte arg0) {
        field147 = null;
        if (arg0 != -16) {
            method61((byte) 51);
        }
        field156 = null;
        field148 = null;
        field139 = null;
        field155 = null;
        field157 = null;
    }

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "(B)I", line = 41)
    public final int method62(byte arg0) {
        if (arg0 != 61) {
            this.field144 = -119;
        }
        ++field151;
        return (int) super.field505;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "([Lg;II[BZIIIZILuo;I)V", line = 56)
    public static final void method63(class366[] arg0, int arg1, int arg2, byte[] arg3, boolean arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, class118 arg10, int arg11) {
        ++field146;
        if (arg4) {
            field157 = null;
        }
        class242 var12 = new class242(arg3);
        int var13 = -1;
        while (true) {
            int var14 = var12.method1561(67);
            if (~var14 == -1) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1559((byte) -82);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 63;
                int var18 = (var15 & 4043) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method1563(-128);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (~arg1 == ~var19 && arg5 <= var18 && ~(arg5 + 8) < ~var18 && arg9 <= var17 && ~(arg9 + 8) < ~var17) {
                    class446 var23 = class380.method2361(var13, -29012);
                    int var24 = arg2 - -class392.method2438(7 & var18, var22, var23.field6170, arg7, 7 & var17, var23.field6244, 1);
                    int var25 = arg11 - -class126.method815(-1, var23.field6244, var22, var23.field6170, var18 & 7, var17 & 7, arg7);
                    if (~var24 < -1 && var25 > 0 && ~(class22.field232 + -1) < ~var24 && class196.field2329 + -1 > var25) {
                        class366 var26 = null;
                        if (!arg8) {
                            int var27 = arg6;
                            if ((class222.field2770[1][var24][var25] & 2) == 2) {
                                var27 = arg6 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg0[var27];
                            }
                        }
                        class423.method2591(-1, arg10, arg6, arg6, true, arg7 + var22 & 3, !arg4, var13, var21, var24, arg8, var25, var26);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "(B)J", line = 137)
    public final long method64(byte arg0) {
        ++field143;
        int var2 = 102 / ((52 - arg0) / 59);
        return Long.MAX_VALUE & super.field2090;
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)V", line = 148)
    public final void method65(int arg0) {
        ++field150;
        super.field2090 = Long.MIN_VALUE & super.field2090 | class164.method1038(8635) - -500L;
        class390.field5321.method1028((byte) 33, this);
        if (arg0 >= -62) {
            this.method66(60);
        }
    }

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(I)V", line = 170)
    public final void method66(int arg0) {
        super.field2090 |= Long.MIN_VALUE;
        ++field138;
        if (this.method64((byte) 115) == 0L) {
            class345.field4686.method1028((byte) 33, this);
        }
        if (arg0 > -8) {
            this.method64((byte) -101);
        }
    }

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "(I)I", line = 186)
    public final int method67(int arg0) {
        ++field141;
        return arg0 != -1834579454 ? 49 : (int) (super.field505 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(II)V", line = 203)
    public class12(int arg0, int arg1) {
        super.field505 = (long) arg0 << 32 | (long) arg1;
    }
}
