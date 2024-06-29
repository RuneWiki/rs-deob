import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class759 extends class334 {

    @OriginalMember(owner = "client!on", name = "J", descriptor = "Z")
    public static boolean field10515 = false;

    @OriginalMember(owner = "client!on", name = "E", descriptor = "I")
    public static int field10510;

    @OriginalMember(owner = "client!on", name = "F", descriptor = "I")
    public static int field10511;

    @OriginalMember(owner = "client!on", name = "G", descriptor = "I")
    public static int field10512;

    @OriginalMember(owner = "client!on", name = "H", descriptor = "I")
    public static int field10513;

    @OriginalMember(owner = "client!on", name = "I", descriptor = "I")
    public static int field10514;

    @OriginalMember(owner = "client!on", name = "K", descriptor = "I")
    public static int field10516;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(B)I", line = 5)
    public static final int method4193(byte arg0) {
        ++field10510;
        if (class16.field178 == 0) {
            class129.field2163.method1091(new class149("jaclib"), 106);
            if (~class129.field2163.method1089((byte) 123).method843(25894) != -101) {
                return 1;
            }
            if (!((class149) class129.field2163.method1089((byte) -123)).method1179(arg0 ^ -105)) {
                class199.field2988.method2182(true);
            }
            class16.field178 = 1;
        }
        if (~class16.field178 == -2) {
            class737.field10229 = class129.method1090(19872);
            class129.field2160.method1091(new class342(class636.field8992), -76);
            class129.field2166.method1091(new class149("jaggl"), -110);
            class129.field2168.method1091(new class149("jagdx"), 94);
            class129.field2169.method1091(new class149("jagmisc"), -89);
            class129.field2170.method1091(new class149("sw3d"), 127);
            class129.field2171.method1091(new class149("hw3d"), -120);
            class129.field2172.method1091(new class149("jagtheora"), arg0 + -60);
            class129.field2173.method1091(new class342(class570.field7914), arg0 ^ -79);
            class129.field2174.method1091(new class342(class40.field467), arg0 + 8);
            class129.field2175.method1091(new class342(class461.field6293), 98);
            class129.field2176.method1091(new class342(class265.field3739), -119);
            class129.field2177.method1091(new class342(class123.field2091), -18);
            class129.field2178.method1091(new class342(class724.field10088), -54);
            class129.field2179.method1091(new class342(class469.field6386), arg0 ^ 116);
            class129.field2180.method1091(new class342(class629.field8924), 116);
            class129.field2181.method1091(new class342(class58.field898), 95);
            class129.field2182.method1091(new class342(class216.field3156), 102);
            class129.field2183.method1091(new class342(class275.field3849), -17);
            class129.field2184.method1091(new class342(class194.field2908), -105);
            class129.field2185.method1091(new class342(class272.field3829), 89);
            class129.field2186.method1091(new class342(class725.field10100), -119);
            class129.field2187.method1091(new class508(class234.field3395, "huffman"), -71);
            class129.field2188.method1091(new class342(class427.field5919), 119);
            class129.field2189.method1091(new class342(class522.field7317), -40);
            class129.field2190.method1091(new class342(class77.field1161), -43);
            class129.field2191.method1091(new class102(class576.field8310, "details"), arg0 + -51);
            for (int var1 = 0; ~var1 > ~class737.field10229.length; ++var1) {
                if (class737.field10229[var1].method1089((byte) -99) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class129[] var3 = class737.field10229;
            for (int var4 = 0; ~var3.length < ~var4; ++var4) {
                class129 var5 = var3[var4];
                int var6 = var5.method1094(1);
                int var7 = var5.method1089((byte) 6).method843(arg0 ^ -25884);
                var2 += var6 * var7 / 100;
            }
            class16.field178 = 2;
            class650.field9199 = var2;
        }
        if (class737.field10229 == null) {
            return 100;
        } else if (arg0 != -62) {
            return -20;
        } else {
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            class129[] var11 = class737.field10229;
            for (int var12 = 0; ~var12 > ~var11.length; ++var12) {
                class129 var16 = var11[var12];
                int var17 = var16.method1094(1);
                int var18 = var16.method1089((byte) -95).method843(25894);
                if (~var18 > -101) {
                    var10 = false;
                }
                var8 += var17;
                var9 += var17 * var18 / 100;
            }
            if (var10) {
                if (!((class149) class129.field2169.method1089((byte) 23)).method1179(85)) {
                    class199.field2988.method2178(true);
                }
                if (!((class149) class129.field2172.method1089((byte) 54)).method1179(85)) {
                    class453.field6204 = class199.field2988.method2179((byte) -30);
                }
                class737.field10229 = null;
            }
            int var13 = var8 - class650.field9199;
            int var14 = var9 - class650.field9199;
            int var15 = var13 > 0 ? var14 * 100 / var13 : 100;
            if (!var10 && ~var15 < -100) {
                var15 = 99;
            }
            return var15;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IZLol;)V", line = 155)
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        if (arg1) {
            field10512 = 71;
        }
        if (~arg0 == -1) {
            super.field4747 = ~arg2.method2557(14929) == -2;
        }
        ++field10514;
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "()V", line = 174)
    public class759() {
        super(1, false);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIB)V", line = 177)
    private final void method4194(int arg0, int arg1, byte arg2) {
        ++field10513;
        int var4 = class295.field4296[arg1];
        int var5 = class527.field7361[arg0];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class42.field539 = arg0;
            class271.field3814 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class42.field539 = arg1;
            class271.field3814 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class271.field3814 = -arg0 + class439.field6099;
            class42.field539 = arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class42.field539 = -arg0 + class327.field4668;
            class271.field3814 = arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class271.field3814 = -arg1 + class439.field6099;
            class42.field539 = -arg0 + class327.field4668;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class42.field539 = -arg1 + class327.field4668;
            class271.field3814 = -arg0 + class439.field6099;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class42.field539 = class327.field4668 - arg1;
            class271.field3814 = arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class42.field539 = arg0;
            class271.field3814 = -arg1 + class439.field6099;
        }
        class42.field539 &= class147.field2360;
        class271.field3814 &= class478.field6578;
        int var7 = -36 % ((13 - arg2) / 32);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II)[I", line = 249)
    public final int[] method28(int arg0, int arg1) {
        ++field10516;
        if (arg1 != -22563988) {
            return null;
        } else {
            int[] var3 = super.field4743.method1027((byte) -97, arg0);
            if (super.field4743.field1993) {
                for (int var4 = 0; ~class439.field6099 < ~var4; ++var4) {
                    this.method4194(arg0, var4, (byte) 45);
                    int[] var5 = this.method2052(0, arg1 ^ -22563988, class42.field539);
                    var3[var4] = var5[class271.field3814];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ZI)[[I", line = 282)
    public final int[][] method283(boolean arg0, int arg1) {
        ++field10511;
        int[][] var3 = super.field4734.method275(26422, arg1);
        if (super.field4734.field425) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class439.field6099; ++var7) {
                this.method4194(arg1, var7, (byte) -52);
                int[][] var8 = this.method2053(1, 0, class42.field539);
                var4[var7] = var8[0][class271.field3814];
                var5[var7] = var8[1][class271.field3814];
                var6[var7] = var8[2][class271.field3814];
            }
        }
        if (!arg0) {
            field10515 = true;
        }
        return var3;
    }
}
