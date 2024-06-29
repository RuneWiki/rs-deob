import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class49 extends class86 {

    @OriginalMember(owner = "client!cm", name = "O", descriptor = "I")
    public int field758 = 4;

    @OriginalMember(owner = "client!cm", name = "U", descriptor = "I")
    public int field764 = 0;

    @OriginalMember(owner = "client!cm", name = "M", descriptor = "I")
    public int field756 = 4;

    @OriginalMember(owner = "client!cm", name = "X", descriptor = "Z")
    public boolean field767 = true;

    @OriginalMember(owner = "client!cm", name = "R", descriptor = "I")
    public int field761 = 1638;

    @OriginalMember(owner = "client!cm", name = "cb", descriptor = "I")
    public int field772 = 4;

    @OriginalMember(owner = "client!cm", name = "Z", descriptor = "[B")
    private byte[] field769 = new byte[512];

    @OriginalMember(owner = "client!cm", name = "db", descriptor = "[I")
    public static int[] field773 = new int[32];

    @OriginalMember(owner = "client!cm", name = "fb", descriptor = "Z")
    public static boolean field775;

    @OriginalMember(owner = "client!cm", name = "ib", descriptor = "Ljava/lang/String;")
    public static String field778;

    @OriginalMember(owner = "client!cm", name = "hb", descriptor = "B")
    public static byte field777;

    @OriginalMember(owner = "client!cm", name = "K", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!cm", name = "L", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!cm", name = "N", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!cm", name = "P", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!cm", name = "S", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!cm", name = "T", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!cm", name = "V", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!cm", name = "W", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!cm", name = "Y", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!cm", name = "ab", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!cm", name = "gb", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!cm", name = "Q", descriptor = "[S")
    private short[] field760;

    @OriginalMember(owner = "client!cm", name = "bb", descriptor = "[S")
    private short[] field771;

    @OriginalMember(owner = "client!cm", name = "eb", descriptor = "[[Lhk;")
    public static class110[][] field774;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(IB)V", line = 7)
    public static final void method472(int arg0, byte arg1) {
        field770++;
        if (arg0 == -1 || !class328.method2321(0, arg0)) {
            return;
        }
        class342[] var2 = class334.field5108[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class342 var4 = var2[var3];
            if (var4.field5394 != null) {
                class112 var5 = new class112();
                var5.field1706 = var4;
                var5.field1711 = var4.field5394;
                class258.method1902(28018, var5, 2000000);
            }
        }
        int var6 = -116 % ((46 - arg1) / 63);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZIIIII)I", line = 44)
    private final int method473(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field754++;
        int var8 = arg2 - 4096;
        if (arg1) {
            method479(96);
        }
        int var9 = arg6 >> 12;
        int var10 = var9 + 1;
        if (var10 >= arg5) {
            var10 = 0;
        }
        int var11 = arg6 & 0xFFF;
        int var12 = var9 & 0xFF;
        int var13 = var11 - 4096;
        int var14 = var10 & 0xFF;
        int var15 = this.field769[var12 + arg4] & 0x3;
        int var16 = class212.field3298[var11];
        int var17;
        if (var15 <= 1) {
            var17 = var15 == 0 ? arg2 + var11 : -var11 + arg2;
        } else {
            var17 = var15 == 2 ? var11 - arg2 : -arg2 + -var11;
        }
        int var18 = this.field769[arg4 + var14] & 0x3;
        int var19;
        if (var18 <= 1) {
            var19 = var18 == 0 ? var13 + arg2 : arg2 - var13;
        } else {
            var19 = var18 == 2 ? var13 - arg2 : -arg2 + -var13;
        }
        int var20 = ((var19 - var17) * var16 >> 12) + var17;
        int var21 = this.field769[arg0 + var12] & 0x3;
        int var22;
        if (var21 <= 1) {
            var22 = var21 == 0 ? var11 + var8 : -var11 + var8;
        } else {
            var22 = var21 == 2 ? var11 - var8 : -var8 + -var11;
        }
        int var23 = this.field769[arg0 + var14] & 0x3;
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? var13 - var8 : -var8 + -var13;
        } else {
            var24 = var23 == 0 ? var13 + var8 : var8 - var13;
        }
        int var25 = ((var24 - var22) * var16 >> 12) + var22;
        return ((var25 - var20) * arg3 >> 12) + var20;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II[I)V", line = 127)
    public final void method474(int arg0, int arg1, int[] arg2) {
        if (arg1 >= -119) {
            this.field769 = (byte[]) null;
        }
        field768++;
        int var4 = class135.field2257[arg0] * this.field772;
        if (this.field758 == 1) {
            short var38 = this.field771[0];
            int var39 = this.field760[0] << 12;
            int var40 = this.field756 * var39 >> 12;
            int var41 = this.field772 * var39 >> 12;
            int var42 = var4 * var39 >> 12;
            int var43 = var42 >> 12;
            int var44 = var42 & 0xFFF;
            int var45 = this.field769[var43 & 0xFF] & 0xFF;
            int var46 = class212.field3298[var44];
            int var47 = var43 + 1;
            if (var47 >= var41) {
                var47 = 0;
            }
            int var48 = this.field769[var47 & 0xFF] & 0xFF;
            if (this.field767) {
                for (int var52 = 0; var52 < class93.field1424; var52++) {
                    int var53 = class347.field5515[var52] * this.field756;
                    int var54 = this.method473(var48, false, var44, var46, var45, var40, var39 * var53 >> 12);
                    int var55 = var38 * var54 >> 12;
                    arg2[var52] = (var55 >> 1) + 2048;
                }
            } else {
                for (int var49 = 0; var49 < class93.field1424; var49++) {
                    int var50 = class347.field5515[var49] * this.field756;
                    int var51 = this.method473(var48, false, var44, var46, var45, var40, var39 * var50 >> 12);
                    arg2[var49] = var38 * var51 >> 12;
                }
            }
            return;
        }
        short var5 = this.field771[0];
        if (var5 > 8 || var5 < -8) {
            int var6 = this.field760[0] << 12;
            int var7 = var4 * var6 >> 12;
            int var8 = this.field772 * var6 >> 12;
            int var9 = this.field756 * var6 >> 12;
            int var10 = var7 >> 12;
            int var11 = var7 & 0xFFF;
            int var12 = var10 + 1;
            if (var12 >= var8) {
                var12 = 0;
            }
            int var13 = class212.field3298[var11];
            int var14 = this.field769[var10 & 0xFF] & 0xFF;
            int var15 = this.field769[var12 & 0xFF] & 0xFF;
            for (int var16 = 0; var16 < class93.field1424; var16++) {
                int var17 = class347.field5515[var16] * this.field756;
                int var18 = this.method473(var15, false, var11, var13, var14, var9, var6 * var17 >> 12);
                arg2[var16] = var5 * var18 >> 12;
            }
        }
        for (int var19 = 1; var19 < this.field758; var19++) {
            short var20 = this.field771[var19];
            if (var20 > 8 || var20 < -8) {
                int var21 = this.field760[var19] << 12;
                int var22 = this.field772 * var21 >> 12;
                int var23 = var4 * var21 >> 12;
                int var24 = this.field756 * var21 >> 12;
                int var25 = var23 >> 12;
                int var26 = var23 & 0xFFF;
                int var27 = this.field769[var25 & 0xFF] & 0xFF;
                int var28 = var25 + 1;
                if (var28 >= var22) {
                    var28 = 0;
                }
                int var29 = class212.field3298[var26];
                int var30 = this.field769[var28 & 0xFF] & 0xFF;
                if (this.field767 && (this.field758 - 1) == var19) {
                    for (int var31 = 0; var31 < class93.field1424; var31++) {
                        int var32 = class347.field5515[var31] * this.field756;
                        int var33 = this.method473(var30, false, var26, var29, var27, var24, var21 * var32 >> 12);
                        int var34 = arg2[var31] + (var20 * var33 >> 12);
                        arg2[var31] = (var34 >> 1) + 2048;
                    }
                } else {
                    for (int var35 = 0; var35 < class93.field1424; var35++) {
                        int var36 = class347.field5515[var35] * this.field756;
                        int var37 = this.method473(var30, false, var26, var29, var27, var24, var21 * var36 >> 12);
                        arg2[var35] += var20 * var37 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIIII)V", line = 284)
    public static final void method475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field757++;
        int var7 = class268.method1965(arg5, class284.field4385, class328.field5042, -66);
        int var8 = class268.method1965(arg0, class284.field4385, class328.field5042, -64);
        if (arg4 != 32677) {
            field755 = 71;
        }
        int var9 = class268.method1965(arg3, class128.field2130, class43.field693, -52);
        int var10 = class268.method1965(arg1, class128.field2130, class43.field693, -89);
        int var11 = class268.method1965(arg2 + arg5, class284.field4385, class328.field5042, -58);
        int var12 = class268.method1965(arg0 - arg2, class284.field4385, class328.field5042, arg4 - 32801);
        for (int var13 = var7; var13 < var11; var13++) {
            class283.method2059(arg6, class133.field2235[var13], (byte) 115, var10, var9);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class283.method2059(arg6, class133.field2235[var14], (byte) 122, var10, var9);
        }
        int var15 = class268.method1965(arg2 + arg3, class128.field2130, class43.field693, -76);
        int var16 = class268.method1965(arg1 - arg2, class128.field2130, class43.field693, arg4 - 32753);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class133.field2235[var17];
            class283.method2059(arg6, var18, (byte) 108, var15, var9);
            class283.method2059(arg6, var18, (byte) 101, var10, var16);
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V", line = 577)
    public class49() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZLug;)V", line = 345)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        if (arg1) {
            this.field764 = -102;
        }
        field762++;
        if (arg0 == 0) {
            this.field767 = arg2.method281(-124) == 1;
        } else if (arg0 == 1) {
            this.field758 = arg2.method281(3);
        } else if (arg0 == 2) {
            this.field761 = arg2.method296(-90);
            if (this.field761 < 0) {
                this.field771 = new short[this.field758];
                for (int var5 = 0; var5 < this.field758; var5++) {
                    this.field771[var5] = (short) arg2.method296(-128);
                }
            }
        } else if (arg0 == 3) {
            this.field756 = this.field772 = arg2.method281(64);
        } else if (arg0 == 4) {
            this.field764 = arg2.method281(83);
        } else if (arg0 == 5) {
            this.field756 = arg2.method281(116);
        } else if (arg0 == 6) {
            this.field772 = arg2.method281(-125);
        }
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "(I)V", line = 450)
    public final void method476(int arg0) {
        field765++;
        if (arg0 != 0) {
            this.method473(71, true, -37, 113, -74, -85, -53);
        }
        this.field769 = class31.method336(false, this.field764);
        this.method478((byte) 69);
        for (int var2 = this.field758 - 1; var2 >= 1; var2--) {
            short var3 = this.field771[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field758--;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIII)V", line = 483)
    public static final void method477(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field763++;
        class138 var5 = class149.method1242(arg4, 0, 8);
        var5.method1153((byte) 50);
        var5.field2282 = arg1;
        var5.field2293 = arg2;
        if (arg0 != -1) {
            method479(73);
        }
        var5.field2287 = arg3;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)V", line = 502)
    private final void method478(byte arg0) {
        if (arg0 < 42) {
            return;
        }
        if (this.field761 > 0) {
            this.field760 = new short[this.field758];
            this.field771 = new short[this.field758];
            for (int var3 = 0; var3 < this.field758; var3++) {
                this.field771[var3] = (short) ((int) (Math.pow((double) ((float) this.field761 / 4096.0F), (double) var3) * 4096.0D));
                this.field760[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field771 != null && this.field771.length == this.field758) {
            this.field760 = new short[this.field758];
            for (int var2 = 0; var2 < this.field758; var2++) {
                this.field760[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
        field766++;
    }

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "(I)V", line = 544)
    public static void method479(int arg0) {
        field774 = (class110[][]) null;
        if (arg0 == -27631) {
            field773 = null;
            field778 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(II)[I", line = 556)
    public final int[] method158(int arg0, int arg1) {
        field759++;
        if (arg1 <= 7) {
            this.field760 = (short[]) null;
        }
        int[] var3 = this.field1225.method1914(arg0, 83);
        if (this.field1225.field3995) {
            this.method474(arg0, -122, var3);
        }
        return var3;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field773[var1] = var0 - 1;
            var0 += var0;
        }
        field775 = false;
        field778 = "Opened title screen";
    }
}
