import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class231 extends class219 {

    @OriginalMember(owner = "client!c", name = "S", descriptor = "I")
    private int field3854 = 0;

    @OriginalMember(owner = "client!c", name = "bb", descriptor = "[S")
    private short[] field3863 = new short[257];

    @OriginalMember(owner = "client!c", name = "V", descriptor = "Lbd;")
    public static class162 field3857 = class17.method142(0, ":duelfriend:");

    @OriginalMember(owner = "client!c", name = "O", descriptor = "Lbd;")
    public static class162 field3850 = class17.method142(0, "k");

    @OriginalMember(owner = "client!c", name = "ab", descriptor = "Lbd;")
    public static class162 field3862 = class17.method142(0, "Ablegen");

    @OriginalMember(owner = "client!c", name = "cb", descriptor = "Z")
    public static boolean field3864 = false;

    @OriginalMember(owner = "client!c", name = "J", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!c", name = "L", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!c", name = "P", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!c", name = "R", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!c", name = "U", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!c", name = "W", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!c", name = "Y", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!c", name = "Z", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!c", name = "db", descriptor = "Lda;")
    public static class143 field3865;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "[I")
    private int[] field3849;

    @OriginalMember(owner = "client!c", name = "X", descriptor = "[I")
    private int[] field3859;

    @OriginalMember(owner = "client!c", name = "T", descriptor = "[[I")
    private int[][] field3855;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIBJ)Z", line = 8)
    public static final boolean method1647(int arg0, int arg1, byte arg2, long arg3) {
        if (arg2 != -26) {
            return false;
        }
        field3860++;
        int var5 = ((int) arg3 & 0x7DAC8) >> 14;
        int var6 = Integer.MAX_VALUE & (int) (arg3 >>> 32);
        int var7 = (int) arg3 >> 20 & 0x3;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class311 var8 = class229.method1637(var6, (byte) 93);
            int var9;
            int var10;
            if (var7 == 0 || var7 == 2) {
                var10 = var8.field5201;
                var9 = var8.field5217;
            } else {
                var9 = var8.field5201;
                var10 = var8.field5217;
            }
            int var11 = var8.field5188;
            if (var7 != 0) {
                var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
            }
            class163.method1292(class122.field2215.field5050[0], 2, true, var10, 0, arg0, var11, class122.field2215.field5034[0], arg1, 0, var9, arg2 + 27);
        } else {
            class163.method1292(class122.field2215.field5050[0], 2, true, 0, var7, arg0, 0, class122.field2215.field5034[0], arg1, var5 + 1, 0, arg2 ^ 0xFFFFFFE7);
        }
        class286.field4822 = class153.field2721;
        class225.field3751 = class183.field3158;
        class34.field551 = 0;
        class110.field1977 = 2;
        return true;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V", line = 57)
    private final void method1648(int arg0) {
        int[] var2 = this.field3855[0];
        field3852++;
        int[] var3 = this.field3855[1];
        int[] var4 = this.field3855[this.field3855.length - 2];
        if (arg0 == 5331) {
            int[] var5 = this.field3855[this.field3855.length - 1];
            this.field3849 = new int[] { var4[0] + var4[0] - var5[0], var4[1] + var4[1] - var5[1] };
            this.field3859 = new int[] { var2[0] + var2[0] - var3[0], var2[1] - (var3[1] + -var2[1]) };
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V", line = 79)
    public class231() {
        super(1, true);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IILb;)V", line = 83)
    public final void method42(int arg0, int arg1, class94 arg2) {
        if (arg0 == arg1) {
            this.field3854 = arg2.method756(915905888);
            this.field3855 = new int[arg2.method756(915905888)][2];
            for (int var4 = 0; var4 < this.field3855.length; var4++) {
                this.field3855[var4][0] = arg2.method761((byte) 108);
                this.field3855[var4][1] = arg2.method761((byte) 108);
            }
        }
        field3845++;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)[I", line = 113)
    private final int[] method1649(int arg0, int arg1) {
        field3851++;
        if (arg1 < 0) {
            return this.field3859;
        } else {
            if (arg0 < 85) {
                field3857 = (class162) null;
            }
            return arg1 >= this.field3855.length ? this.field3849 : this.field3855[arg1];
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(B)V", line = 132)
    public final void method39(byte arg0) {
        if (this.field3855 == null) {
            this.field3855 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        if (arg0 != 22) {
            return;
        }
        field3847++;
        if (this.field3855.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field3854 == 2) {
            this.method1648(5331);
        }
        class165.method1302(113);
        this.method1653((byte) 99);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)[I", line = 158)
    public final int[] method41(boolean arg0, int arg1) {
        field3848++;
        if (!arg0) {
            field3862 = (class162) null;
        }
        int[] var3 = this.field3654.method2032(3, arg1);
        if (this.field3654.field4967) {
            int[] var4 = this.method1585(0, arg1, -6606);
            for (int var5 = 0; var5 < class128.field2326; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field3863[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lda;ILda;)V", line = 202)
    public static final void method1650(class143 arg0, int arg1, class143 arg2) {
        field3846++;
        if (arg1 > -75) {
            method1652(false);
        }
        class64.field993 = arg2;
        class250.field4178 = arg0;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(IIB)V", line = 228)
    public static final void method1651(int arg0, int arg1, byte arg2) {
        class267.field4444 = class96.field1758[arg1][arg0].field2801;
        class110.field1981 = class96.field1758[arg1][arg0].field2790;
        if (arg2 <= -51) {
            class90.field1603 = class96.field1758[arg1][arg0].field2793;
            field3853++;
            class108.method876((float) class267.field4444, (float) class110.field1981, (float) class90.field1603);
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(Z)V", line = 242)
    public static void method1652(boolean arg0) {
        field3865 = null;
        if (!arg0) {
            field3857 = null;
            field3862 = null;
            field3850 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(B)V", line = 255)
    private final void method1653(byte arg0) {
        if (arg0 != 99) {
            this.method39((byte) -65);
        }
        field3858++;
        int var2 = this.field3854;
        if (var2 == 2) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; var5 < (this.field3855.length - 1) && this.field3855[var5][0] <= var4; var5++) {
                }
                int[] var6 = this.field3855[var5 - 1];
                int[] var7 = this.field3855[var5];
                int var8 = this.method1649(94, var5 - 2)[1];
                int var9 = var6[1];
                int var10 = var7[1];
                int var11 = this.method1649(124, var5 + 1)[1];
                int var12 = var11 + var9 - var8 - var10;
                int var13 = var8 - var9 - var12;
                int var14 = var10 - var8;
                int var15 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                int var16 = var15 * var15 >> 12;
                int var18 = (var12 * var15 >> 12) * var16 >> 12;
                int var19 = var13 * var16 >> 12;
                int var20 = var14 * var15 >> 12;
                int var21 = var19 + var20 + var9 + var18;
                if (var21 <= -32768) {
                    var21 = -32767;
                }
                if (var21 >= 32768) {
                    var21 = 32767;
                }
                this.field3863[var3] = (short) var21;
            }
        } else if (var2 == 1) {
            for (int var22 = 0; var22 < 257; var22++) {
                int var23 = var22 << 4;
                int var24;
                for (var24 = 1; (this.field3855.length - 1) > var24 && var23 >= this.field3855[var24][0]; var24++) {
                }
                int[] var25 = this.field3855[var24 - 1];
                int[] var26 = this.field3855[var24];
                int var27 = (var23 - var25[0] << 12) / (var26[0] - var25[0]);
                int var28 = 4096 - class31.field518[(var27 & 0x1FE6) >> 5] >> 1;
                int var29 = 4096 - var28;
                int var30 = var25[1] * var29 + var26[1] * var28 >> 12;
                if (var30 <= -32768) {
                    var30 = -32767;
                }
                if (var30 >= 32768) {
                    var30 = 32767;
                }
                this.field3863[var22] = (short) var30;
            }
        } else {
            for (int var31 = 0; var31 < 257; var31++) {
                int var32 = var31 << 4;
                int var33;
                for (var33 = 1; (this.field3855.length - 1) > var33 && this.field3855[var33][0] <= var32; var33++) {
                }
                int[] var34 = this.field3855[var33];
                int[] var35 = this.field3855[var33 - 1];
                int var36 = (var32 - var35[0] << 12) / (var34[0] - var35[0]);
                int var37 = 4096 - var36;
                int var38 = var34[1] * var36 + var35[1] * var37 >> 12;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field3863[var31] = (short) var38;
            }
        }
    }
}
