import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class252 extends class116 {

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "Z")
    public boolean field4463 = false;

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "Lla;")
    private class227 field4465;

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "Z")
    private boolean field4467;

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "Z")
    private boolean field4466;

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "I")
    private int field4470;

    @OriginalMember(owner = "client!sc", name = "ab", descriptor = "I")
    private int field4477;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "Lqe;")
    public static class42 field4460 = new class42(64);

    @OriginalMember(owner = "client!sc", name = "Y", descriptor = "Lda;")
    public static class275 field4475 = class255.method1672(118, "(U0a )2 via: ");

    @OriginalMember(owner = "client!sc", name = "cb", descriptor = "I")
    public static int field4479 = 0;

    @OriginalMember(owner = "client!sc", name = "Z", descriptor = "Lda;")
    public static class275 field4476 = class255.method1672(97, "Versteckt");

    @OriginalMember(owner = "client!sc", name = "X", descriptor = "Lne;")
    public static class137 field4474 = new class137(32);

    @OriginalMember(owner = "client!sc", name = "db", descriptor = "Lda;")
    public static class275 field4480 = class255.method1672(126, "null");

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "F")
    private float field4468;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!sc", name = "V", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!sc", name = "W", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!sc", name = "bb", descriptor = "[I")
    private int[] field4478;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZIZIII)V")
    public static final void method1658(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field4462++;
        if (arg2 == 3) {
            method1658(-1, true, class73.field1198, true, -1, arg5, arg6);
            return;
        }
        Container var7;
        if (class276.field4821 != null) {
            var7 = class276.field4821;
        } else if (class165.field2870 == null) {
            var7 = class3.field24.field970;
        } else {
            var7 = class165.field2870;
        }
        class244.field4258 = var7.getSize().width;
        class63.field1054 = var7.getSize().height;
        if (class165.field2870 == var7) {
            Insets var8 = class165.field2870.getInsets();
            class244.field4258 -= var8.left + var8.right;
            class63.field1054 -= var8.top + var8.bottom;
        }
        if (arg2 < 2) {
            class19.field264 = (class244.field4258 - 765) / 2;
            class212.field3587 = 503;
            class249.field4391 = 765;
            class42.field709 = 0;
        } else {
            class212.field3587 = class63.field1054;
            class19.field264 = 0;
            class249.field4391 = class244.field4258;
            class42.field709 = 0;
        }
        if (arg3) {
            class141.method1020(class93.field1601, -36);
            class277.method1872(class93.field1601, arg5 + 9);
            if (class86.field1456 != null) {
                class86.field1456.method158(arg5 ^ 0xFFFFFFFD, class93.field1601);
            }
            class158.field2771.method1372(true);
            class104.method749(class93.field1601, (byte) 42);
            class53.method341(100, class93.field1601);
            if (class86.field1456 != null) {
                class86.field1456.method157(class93.field1601, arg5 ^ 0x2D76);
            }
        } else {
            class93.field1601.setSize(class249.field4391, class212.field3587);
            if (class165.field2870 == var7) {
                Insets var9 = class165.field2870.getInsets();
                class93.field1601.setLocation(var9.left + class19.field264, class42.field709 + var9.top);
            } else {
                class93.field1601.setLocation(class19.field264, class42.field709);
            }
        }
        if (~arg2 < arg5) {
            method1658(-1, true, 0, true, -1, -1, arg6);
            return;
        }
        if (class166.field2881 != -1) {
            class23.method155((byte) -115, true);
        }
        if (class52.field866 != null && (class200.field3427 == 30 || class200.field3427 == 25)) {
            class235.method1532((byte) 27);
        }
        for (int var10 = 0; var10 < 100; var10++) {
            class200.field3418[var10] = true;
        }
        class161.field2816 = true;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
    public static void method1659(byte arg0) {
        field4476 = null;
        field4460 = null;
        field4474 = null;
        field4480 = null;
        field4475 = null;
        if (arg0 > -69) {
            method1659((byte) -119);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)V")
    public final void method1660(int arg0, int arg1) {
        if (arg1 >= -112) {
            return;
        }
        field4473++;
        if (this.field4478 == null || this.field4477 == 0 && this.field4470 == 0) {
            return;
        }
        if (class76.field1245 == null || class76.field1245.length < this.field4478.length) {
            class76.field1245 = new int[this.field4478.length];
        }
        int var3 = this.field4478.length == 4096 ? 64 : 128;
        int var4 = this.field4478.length;
        int var5 = this.field4470 * arg0;
        int var6 = this.field4477 * arg0 * var3;
        int var7 = var3 - 1;
        int var8 = var4 - 1;
        for (int var9 = 0; var9 < var4; var9 += var3) {
            int var11 = var9 + var6 & var8;
            for (int var12 = 0; var12 < var3; var12++) {
                int var13 = (var12 + var5 & var7) + var11;
                int var14 = var9 + var12;
                class76.field1245[var14] = this.field4478[var13];
            }
        }
        int[] var10 = this.field4478;
        this.field4478 = class76.field1245;
        class76.field1245 = var10;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(FZLod;ZLma;)[I")
    public final int[] method1661(float arg0, boolean arg1, class15 arg2, boolean arg3, class105 arg4) {
        field4461++;
        if (arg1) {
            return null;
        }
        if (this.field4478 == null || this.field4468 != arg0) {
            if (!this.field4465.method1470(arg2, arg4, !arg1)) {
                return null;
            }
            int var6 = arg3 ? 64 : 128;
            this.field4478 = this.field4465.method1471((double) arg0, this.field4466, var6, var6, (byte) 106, true, arg2, arg4);
            this.field4468 = arg0;
            if (this.field4467) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var11 = var6;
                int var13 = var6;
                int var14 = var6;
                int var15 = var6 * var6;
                int var16 = var6 - 1;
                int var17 = var6 - 1;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var17; var34 >= 0; var34--) {
                        var13--;
                        int var35 = this.field4478[var13];
                        var9[var34] += class19.method98(16743231, var35) >> 16;
                        var7[var34] += class19.method98(65383, var35) >> 8;
                        var8[var34] += class19.method98(255, var35);
                    }
                    if (var13 == 0) {
                        var13 = var15;
                    }
                }
                int var19 = var15;
                for (int var20 = var16; var20 >= 0; var20--) {
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 1;
                    int var25 = 1;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var25--;
                        var23 += var9[var25];
                        var22 += var8[var25];
                        var21 += var7[var25];
                        if (var25 == 0) {
                            var25 = var11;
                        }
                    }
                    for (int var27 = var17; var27 >= 0; var27--) {
                        var24--;
                        int var31 = var23 / 9;
                        var25--;
                        int var32 = var21 / 9;
                        int var33 = var22 / 9;
                        var19--;
                        var10[var19] = class246.method1612(var33, class246.method1612(var31 << 16, var32 << 8));
                        var22 += var8[var25] - var8[var24];
                        var21 += var7[var25] - var7[var24];
                        var23 += var9[var25] - var9[var24];
                        if (var24 == 0) {
                            var24 = var11;
                        }
                        if (var25 == 0) {
                            var25 = var11;
                        }
                    }
                    for (int var28 = var17; var28 >= 0; var28--) {
                        var13--;
                        int var29 = this.field4478[var13];
                        var14--;
                        int var30 = this.field4478[var14];
                        var9[var28] += -(class19.method98(16719502, var30) >> 16) + (class19.method98(var29, 16724446) >> 16);
                        var7[var28] += -(class19.method98(var30, 65518) >> 8) + class19.method98(255, var29 >> 8);
                        var8[var28] += class19.method98(255, var29) - class19.method98(var30, 255);
                    }
                    if (var14 == 0) {
                        var14 = var15;
                    }
                    if (var13 == 0) {
                        var13 = var15;
                    }
                }
                this.field4478 = var10;
            }
        }
        return this.field4478;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lma;BZLod;)[I")
    public final int[] method1662(class105 arg0, byte arg1, boolean arg2, class15 arg3) {
        field4469++;
        if (this.field4465.method1470(arg3, arg0, true)) {
            int var5 = -17 % ((arg1 - 56) / 38);
            int var6 = arg2 ? 64 : 128;
            return this.field4465.method1471(1.0D, this.field4466, var6, var6, (byte) 87, false, arg3, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIII)V")
    public static final void method1663(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class125.field2235 == 1) {
            class237.field4126[class94.field1611 / 100].method728(class96.field1640 - 8, class141.field2491 + -8);
        }
        field4459++;
        if (class125.field2235 == 2) {
            class237.field4126[class94.field1611 / 100 + 4].method728(class96.field1640 - 8, class141.field2491 + -8);
        }
        if (arg0 != -10411) {
            field4460 = null;
        }
        class200.method1313((byte) -124);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lod;Lma;I)Z")
    public final boolean method1664(class15 arg0, class105 arg1, int arg2) {
        if (arg2 == 0) {
            field4464++;
            return this.field4465.method1470(arg0, arg1, true);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sc", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field4472++;
        super.finalize();
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lij;)V")
    public class252(class85 arg0) {
        this.field4465 = new class227(arg0);
        this.field4467 = arg0.method564((byte) 105) == 1;
        this.field4466 = arg0.method564((byte) 53) == 1;
        arg0.method564((byte) 99);
        arg0.method564((byte) 91);
        int var2 = arg0.method564((byte) 51) & 0x3;
        this.field4470 = arg0.method581(8);
        this.field4477 = arg0.method581(8);
        arg0.method564((byte) 80);
        arg0.method564((byte) 125);
    }
}
