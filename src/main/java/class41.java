import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class41 extends class25 {

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "Z")
    public boolean field653 = false;

    @OriginalMember(owner = "client!sd", name = "L", descriptor = "Lle;")
    private class40 field644;

    @OriginalMember(owner = "client!sd", name = "bb", descriptor = "Z")
    private boolean field659;

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "Z")
    private boolean field655;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
    private int field650;

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "I")
    private int field649;

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "I")
    public static int field640 = 0;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "Ldf;")
    public static class51 field651 = class46.method233("<img=0>", 100);

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "Ldf;")
    private static class51 field645 = class46.method233("Unable to find ", 100);

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "Ldf;")
    public static class51 field652 = field645;

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "Ldf;")
    public static class51 field657 = class46.method233(":clan:", 100);

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "Lvh;")
    public static class252 field646 = new class252();

    @OriginalMember(owner = "client!sd", name = "fb", descriptor = "[I")
    public static int[] field663 = new int[100];

    @OriginalMember(owner = "client!sd", name = "eb", descriptor = "F")
    private float field662;

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!sd", name = "ab", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!sd", name = "cb", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!sd", name = "db", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "[I")
    private int[] field656;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(BI)V")
    public static final void method206(byte arg0, int arg1) {
        field639++;
        Container var2;
        if (class195.field3265 != null) {
            var2 = class195.field3265;
        } else if (class131.field2193 == null) {
            var2 = class25.field376.field3999;
        } else {
            var2 = class131.field2193;
        }
        class27.field397 = var2.getSize().width;
        class140.field2352 = var2.getSize().height;
        if (class131.field2193 == var2) {
            Insets var3 = class131.field2193.getInsets();
            class27.field397 -= var3.right + var3.left;
            class140.field2352 -= var3.top + var3.bottom;
        }
        if (arg0 <= 117) {
            return;
        }
        class242.field4196 = (class27.field397 - 765) / 2;
        class218.field3808 = class205.field3426;
        class95.field1578 = 765;
        class76.field1230 = 503;
        class31.field452.setSize(class95.field1578, class76.field1230);
        if (class131.field2193 == var2) {
            Insets var4 = class131.field2193.getInsets();
            class31.field452.setLocation(class242.field4196 + var4.left, class218.field3808 + var4.top);
        } else {
            class31.field452.setLocation(class242.field4196, class218.field3808);
        }
        if (class243.field4206 != -1) {
            class215.method1477((byte) -22, true);
        }
        class237.method1639((byte) -109);
        if (class229.field3993.startsWith("mac")) {
            class13.field197 = (long) arg1 + class7.method31((byte) -88);
        }
        class3.field22 = class7.method31((byte) -88) + ((long) arg1);
        if (arg1 == 0 && class204.field3415 != null && class195.field3249 == 30 || class195.field3249 == 25) {
            class185.method1309(-115);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method207(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class48.field758 * 128) {
            arg0 = class48.field758 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class192.field3229 * 128) {
            arg2 = class192.field3229 * 128 - 1;
        }
        class246.field4266 = class73.field1155[arg3];
        class261.field4560 = class73.field1167[arg3];
        class32.field459 = class73.field1155[arg4];
        class128.field2150 = class73.field1167[arg4];
        class124.field2105 = arg0;
        class69.field1108 = arg1;
        class123.field2083 = arg2;
        class40.field628 = arg0 / 128;
        class20.field274 = arg2 / 128;
        class243.field4209 = class40.field628 - class198.field3299;
        if (class243.field4209 < 0) {
            class243.field4209 = 0;
        }
        class261.field4558 = class20.field274 - class198.field3299;
        if (class261.field4558 < 0) {
            class261.field4558 = 0;
        }
        class96.field1587 = class40.field628 + class198.field3299;
        if (class96.field1587 > class48.field758) {
            class96.field1587 = class48.field758;
        }
        class79.field1267 = class20.field274 + class198.field3299;
        if (class79.field1267 > class192.field3229) {
            class79.field1267 = class192.field3229;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class198.field3299 + class198.field3299 + 2; var16++) {
            for (int var19 = 0; var19 < class198.field3299 + class198.field3299 + 2; var19++) {
                int var20 = (var16 - class198.field3299 << 7) - (class124.field2105 & 0x7F);
                int var21 = (var19 - class198.field3299 << 7) - (class123.field2083 & 0x7F);
                int var22 = class40.field628 + var16 - class198.field3299;
                int var23 = class20.field274 + var19 - class198.field3299;
                if (var22 >= 0 && var23 >= 0 && var22 < class48.field758 && var23 < class192.field3229) {
                    int var24;
                    if (class87.field1454 == null) {
                        var24 = class101.field1682[0][var22][var23] + 128 - class69.field1108;
                    } else {
                        var24 = class87.field1454[0][var22][var23] + 128 - class69.field1108;
                    }
                    int var25 = class101.field1682[3][var22][var23] - class69.field1108 - 1000;
                    class222.field3886[var16][var19] = class163.method1151(var20, var25, var24, var21, var15);
                } else {
                    class222.field3886[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class198.field3299 + class198.field3299 + 1; var17++) {
            for (int var18 = 0; var18 < class198.field3299 + class198.field3299 + 1; var18++) {
                class255.field4453[var17][var18] = class222.field3886[var17][var18] || class222.field3886[var17 + 1][var18] || class222.field3886[var17][var18 + 1] || class222.field3886[var17 + 1][var18 + 1];
            }
        }
        class205.field3432 = arg6;
        class128.field2147 = arg7;
        class159.field2617 = arg8;
        class34.field508 = arg9;
        class84.field1411 = arg10;
        class149.method1076();
        class108.method772(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(BI)V")
    public final void method208(byte arg0, int arg1) {
        if (arg0 >= -93) {
            field663 = null;
        }
        field647++;
        if (this.field656 == null || this.field649 == 0 && this.field650 == 0) {
            return;
        }
        if (class79.field1268 == null || this.field656.length > class79.field1268.length) {
            class79.field1268 = new int[this.field656.length];
        }
        int var3 = this.field656.length;
        int var4 = this.field656.length == 4096 ? 64 : 128;
        int var5 = this.field650 * arg1;
        int var6 = var4 - 1;
        int var7 = var3 - 1;
        int var8 = this.field649 * var4 * arg1;
        for (int var9 = 0; var9 < var3; var9 += var4) {
            int var11 = var8 + var9 & var7;
            for (int var12 = 0; var12 < var4; var12++) {
                int var13 = (var5 + var12 & var6) + var11;
                int var14 = var9 + var12;
                class79.field1268[var14] = this.field656[var13];
            }
        }
        int[] var10 = this.field656;
        this.field656 = class79.field1268;
        class79.field1268 = var10;
    }

    @OriginalMember(owner = "client!sd", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field661++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
    public static void method209(boolean arg0) {
        field645 = null;
        field646 = null;
        field657 = null;
        if (!arg0) {
            field651 = null;
            field663 = null;
            field652 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)Lm;")
    public static final class108 method210(int arg0, byte arg1) {
        field658++;
        class108 var2 = (class108) class257.field4495.method1357((byte) 95, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class55.field937.method828(class83.method647(arg0, 52), (byte) 92, class7.method33(255, arg0));
        class108 var4 = new class108();
        var4.field1799 = arg0;
        if (var3 != null) {
            var4.method782(new class121(var3), 3);
        }
        if (arg1 != 75) {
            method209(false);
        }
        var4.method787(-11);
        if (var4.field1840) {
            var4.field1779 = 0;
            var4.field1800 = false;
        }
        if (!class114.field1941 && var4.field1780) {
            var4.field1778 = null;
        }
        class257.field4495.method1351(var4, 2, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V")
    public static final void method211(int arg0) {
        field648++;
        if (arg0 > -102) {
            field651 = null;
        }
        class89.field1477.method1353(-122);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lu;ZFLj;I)[I")
    public final int[] method212(class111 arg0, boolean arg1, float arg2, class155 arg3, int arg4) {
        if (arg4 != -1) {
            this.field644 = null;
        }
        field643++;
        if (this.field656 == null || this.field662 != arg2) {
            if (!this.field644.method202(arg0, 1879, arg3)) {
                return null;
            }
            int var6 = arg1 ? 64 : 128;
            this.field656 = this.field644.method203(var6, arg0, var6, this.field655, (double) arg2, arg3, (byte) 123, true);
            this.field662 = arg2;
            if (this.field659) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var11 = var6;
                int var12 = var6;
                int var13 = var6;
                int var15 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var15; var34 >= 0; var34--) {
                        var12--;
                        int var35 = this.field656[var12];
                        var7[var34] += class191.method1366(255, var35 >> 16);
                        var9[var34] += class191.method1366(var35, 65504) >> 8;
                        var8[var34] += class191.method1366(var35, 255);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var16; var20 >= 0; var20--) {
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 1;
                    int var25 = 1;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var25--;
                        var22 += var8[var25];
                        var23 += var7[var25];
                        var21 += var9[var25];
                        if (var25 == 0) {
                            var25 = var11;
                        }
                    }
                    for (int var27 = var15; var27 >= 0; var27--) {
                        int var31 = var21 / 9;
                        var24--;
                        int var32 = var22 / 9;
                        var25--;
                        int var33 = var23 / 9;
                        var19--;
                        var10[var19] = class82.method642(class82.method642(var33 << 16, var31 << 8), var32);
                        var21 += var9[var25] - var9[var24];
                        var23 += var7[var25] - var7[var24];
                        var22 += var8[var25] - var8[var24];
                        if (var25 == 0) {
                            var25 = var11;
                        }
                        if (var24 == 0) {
                            var24 = var11;
                        }
                    }
                    for (int var28 = var15; var28 >= 0; var28--) {
                        var12--;
                        int var29 = this.field656[var12];
                        var13--;
                        int var30 = this.field656[var13];
                        var7[var28] += (class191.method1366(var29, 16739339) >> 16) - (class191.method1366(var30, 16773759) >> 16);
                        var9[var28] += -(class191.method1366(65534, var30) >> 8) + (class191.method1366(var29, 65419) >> 8);
                        var8[var28] += class191.method1366(255, var29) - class191.method1366(255, var30);
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                }
                this.field656 = var10;
            }
        }
        return this.field656;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lj;ZBLu;)[I")
    public final int[] method213(class155 arg0, boolean arg1, byte arg2, class111 arg3) {
        field638++;
        if (!this.field644.method202(arg3, arg2 + 1812, arg0)) {
            return null;
        } else if (arg2 == 67) {
            int var5 = arg1 ? 64 : 128;
            return this.field644.method203(var5, arg3, var5, this.field655, 1.0D, arg0, (byte) 118, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLu;Lj;)Z")
    public final boolean method214(byte arg0, class111 arg1, class155 arg2) {
        if (arg0 <= 12) {
            this.method208((byte) -74, 28);
        }
        field654++;
        return this.field644.method202(arg1, 1879, arg2);
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Llb;)V")
    public class41(class121 arg0) {
        this.field644 = new class40(arg0);
        this.field659 = arg0.method897(126) == 1;
        this.field655 = arg0.method897(-56) == 1;
        arg0.method897(114);
        arg0.method897(111);
        int var2 = arg0.method897(-41) & 0x3;
        this.field650 = arg0.method912((byte) -90);
        this.field649 = arg0.method912((byte) -90);
        arg0.method897(127);
        arg0.method897(110);
    }
}
