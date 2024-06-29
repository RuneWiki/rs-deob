import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class9 extends class196 {

    @OriginalMember(owner = "client!ig", name = "S", descriptor = "I")
    private int field97 = 4096;

    @OriginalMember(owner = "client!ig", name = "Z", descriptor = "I")
    private int field104 = 0;

    @OriginalMember(owner = "client!ig", name = "R", descriptor = "Ldf;")
    public static class51 field96 = class46.method233("<col=00ff80>", 100);

    @OriginalMember(owner = "client!ig", name = "U", descriptor = "Ldf;")
    public static class51 field99 = class46.method233("showVideoAd", 100);

    @OriginalMember(owner = "client!ig", name = "V", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!ig", name = "W", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ig", name = "X", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!ig", name = "Y", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!ig", name = "T", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!ig", name = "Q", descriptor = "[I")
    public static int[] field95;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILu;BIIZ)V")
    public static final void method42(int arg0, class111 arg1, byte arg2, int arg3, int arg4, boolean arg5) {
        class128.field2152 = 10000;
        int var6 = 25 / ((2 - arg2) / 36);
        class82.field1382 = arg3;
        class227.field3974 = arg5;
        class52.field876 = 1;
        class134.field2225 = arg1;
        class204.field3419 = arg0;
        ++field98;
        class144.field2402 = arg4;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "()V")
    public static final void method43() {
        for (int var0 = 0; var0 < class16.field256; ++var0) {
            class33 var1 = class216.field3752[var0];
            class55.method356(var1);
            class216.field3752[var0] = null;
        }
        class16.field256 = 0;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
    public class9() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        ++field102;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field3291 = arg1.method897(-39) == 1;
                }
            } else {
                this.field97 = arg1.method876(false);
            }
        } else {
            this.field104 = arg1.method876(false);
        }
        if (arg2 != 82) {
            this.field104 = -87;
        }
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        ++field103;
        if (arg1 != 10565) {
            method43();
        }
        int[] var3 = super.field3274.method1476(true, arg0);
        if (super.field3274.field3741) {
            int[] var4 = this.method1390(arg0, 0, arg1 ^ -10527);
            for (int var5 = 0; class49.field767 > var5; ++var5) {
                int var6 = var4[var5];
                if (this.field104 <= var6) {
                    if (~var6 >= ~this.field97) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field97;
                    }
                } else {
                    var3[var5] = this.field104;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(BI)[[I")
    public final int[][] method46(byte arg0, int arg1) {
        ++field100;
        int[][] var3 = super.field3285.method1548(arg1, (byte) -74);
        if (arg0 != 11) {
            this.method44(28, (class121) null, (byte) -90);
        }
        if (super.field3285.field3963) {
            int[][] var4 = this.method1387(103, 0, arg1);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var4[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class49.field767 < ~var11; ++var11) {
                int var12 = var8[var11];
                int var13 = var6[var11];
                int var14 = var5[var11];
                if (var12 < this.field104) {
                    var7[var11] = this.field104;
                } else if (this.field97 >= var12) {
                    var7[var11] = var12;
                } else {
                    var7[var11] = this.field97;
                }
                if (var14 < this.field104) {
                    var9[var11] = this.field104;
                } else if (this.field97 >= var14) {
                    var9[var11] = var14;
                } else {
                    var9[var11] = this.field97;
                }
                if (~var13 > ~this.field104) {
                    var10[var11] = this.field104;
                } else if (this.field97 < var13) {
                    var10[var11] = this.field97;
                } else {
                    var10[var11] = var13;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)V")
    public static void method47(int arg0) {
        if (arg0 != 1) {
            field99 = null;
        }
        field99 = null;
        field95 = null;
        field96 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIII)V")
    public static final void method48(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class36.field542 <= arg0 && ~class175.field2867 <= ~arg0) {
            int var5 = class149.method1074(-70, class115.field1954, class28.field408, arg4);
            int var6 = class149.method1074(109, class115.field1954, class28.field408, arg2);
            class39.method199(var6, arg0, var5, arg1, 0);
        }
        if (arg3 >= 3) {
            ++field101;
        }
    }
}
