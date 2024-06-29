import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class252 extends class303 {

    @OriginalMember(owner = "client!md", name = "H", descriptor = "I")
    private int field3876 = 3216;

    @OriginalMember(owner = "client!md", name = "K", descriptor = "[I")
    private int[] field3879 = new int[3];

    @OriginalMember(owner = "client!md", name = "N", descriptor = "I")
    private int field3882 = 3216;

    @OriginalMember(owner = "client!md", name = "M", descriptor = "I")
    private int field3881 = 4096;

    @OriginalMember(owner = "client!md", name = "O", descriptor = "[I")
    public static int[] field3883 = new int[25];

    @OriginalMember(owner = "client!md", name = "T", descriptor = "Ljava/lang/String;")
    public static String field3888 = "flash3:";

    @OriginalMember(owner = "client!md", name = "G", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!md", name = "I", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!md", name = "L", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!md", name = "P", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method1777(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class62 var5 = (class62) class42.field748.method833(false, (long) arg1);
        if (var5 == null) {
            var5 = new class62();
            class42.field748.method845(var5, (byte) -45, (long) arg1);
        }
        if (var5.field961.length <= arg4) {
            int[] var6 = new int[arg4 + 1];
            int[] var7 = new int[arg4 + 1];
            for (int var8 = 0; var8 < var5.field961.length; var8++) {
                var7[var8] = var5.field961[var8];
                var6[var8] = var5.field963[var8];
            }
            for (int var9 = var5.field961.length; var9 < arg4; var9++) {
                var7[var9] = -1;
                var6[var9] = 0;
            }
            var5.field963 = var6;
            var5.field961 = var7;
        }
        field3885++;
        var5.field961[arg4] = arg3;
        var5.field963[arg4] = arg2;
        if (arg0 != -1) {
            field3888 = (String) null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V", line = 55)
    public static final void method1778(boolean arg0) {
        class267.field4132.method249(0);
        field3878++;
        int var1 = class267.field4132.method240(1, -38);
        if (var1 == 0) {
            return;
        }
        int var2 = class267.field4132.method240(2, -105);
        if (var2 == 0) {
            class231.field3673[class75.field1160++] = 2047;
        } else if (var2 == 1) {
            int var11 = class267.field4132.method240(3, -48);
            class19.field356.method636(true, 1, var11);
            int var12 = class267.field4132.method240(1, -87);
            if (var12 == 1) {
                class231.field3673[class75.field1160++] = 2047;
            }
        } else if (var2 == 2) {
            if (class267.field4132.method240(1, -57) == 1) {
                int var8 = class267.field4132.method240(3, -125);
                class19.field356.method636(arg0, 2, var8);
                int var9 = class267.field4132.method240(3, -86);
                class19.field356.method636(true, 2, var9);
            } else {
                int var7 = class267.field4132.method240(3, -88);
                class19.field356.method636(true, 0, var7);
            }
            int var10 = class267.field4132.method240(1, -116);
            if (var10 == 1) {
                class231.field3673[class75.field1160++] = 2047;
            }
        } else if (var2 == 3) {
            int var3 = class267.field4132.method240(7, -100);
            int var4 = class267.field4132.method240(1, -98);
            class41.field734 = class267.field4132.method240(2, -32);
            int var5 = class267.field4132.method240(7, -67);
            int var6 = class267.field4132.method240(1, -54);
            if (var6 == 1) {
                class231.field3673[class75.field1160++] = 2047;
            }
            class19.field356.method209(var5, 128, var4 == 1, var3);
        } else if (!arg0) {
            field3883 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(II)[I", line = 139)
    public final int[] method67(int arg0, int arg1) {
        if (arg0 != -3) {
            field3888 = (String) null;
        }
        field3886++;
        int[] var3 = this.field4763.method394(0, arg1);
        if (this.field4763.field863) {
            int var4 = class124.field1977 * this.field3881 >> 12;
            int[] var5 = this.method2107(class12.field240 & arg1 - 1, 0, 0);
            int[] var6 = this.method2107(arg1, arg0 + 3, 0);
            int[] var7 = this.method2107(arg1 + 1 & class12.field240, arg0 ^ 0xFFFFFFFD, 0);
            for (int var8 = 0; var8 < class70.field1108; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 - 1 & class40.field724] - var6[class40.field724 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var13 = class245.field3791[((var12 + 1) * var12 >> 1) + var11] & 0xFF;
                int var14 = var13 * 4096 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = this.field3879[2] * var14 >> 12;
                int var17 = var9 * var13 >> 8;
                int var18 = this.field3879[0] * var15 >> 12;
                int var19 = this.field3879[1] * var17 >> 12;
                var3[var8] = var16 + var19 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(B)V", line = 216)
    public static void method1779(byte arg0) {
        int var1 = -67 / ((-arg0 - 4) / 60);
        field3888 = null;
        field3883 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILpe;I)V", line = 227)
    public final void method65(int arg0, class101 arg1, int arg2) {
        if (arg0 != -4004) {
            return;
        }
        if (arg2 == 0) {
            this.field3881 = arg1.method731(false);
        } else if (arg2 == 1) {
            this.field3882 = arg1.method731(false);
        } else if (arg2 == 2) {
            this.field3876 = arg1.method731(false);
        }
        field3887++;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V", line = 389)
    public class252() {
        super(1, true);
    }

    @OriginalMember(owner = "client!md", name = "f", descriptor = "(I)V", line = 283)
    private final void method1780(int arg0) {
        field3877++;
        double var2 = Math.cos((double) ((float) this.field3876 / 4096.0F));
        this.field3879[0] = (int) (Math.sin((double) ((float) this.field3882 / 4096.0F)) * 4096.0D * var2);
        this.field3879[1] = (int) (var2 * Math.cos((double) ((float) this.field3882 / 4096.0F)) * 4096.0D);
        this.field3879[2] = (int) (Math.sin((double) ((float) this.field3876 / 4096.0F)) * 4096.0D);
        int var4 = this.field3879[2] * this.field3879[2] >> 12;
        int var5 = this.field3879[1] * this.field3879[1] >> 12;
        int var6 = this.field3879[0] * this.field3879[0] >> 12;
        if (arg0 <= 31) {
            this.field3876 = -45;
        }
        int var7 = (int) (Math.sqrt((double) (var5 + var6 + var4 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field3879[1] = (this.field3879[1] << 12) / var7;
            this.field3879[0] = (this.field3879[0] << 12) / var7;
            this.field3879[2] = (this.field3879[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BIIII)V", line = 313)
    public static final void method1781(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field3880++;
        int var5 = 0;
        int var6 = arg1;
        int var7 = -1;
        int var8 = -arg1;
        if (arg0 < 106) {
            method1779((byte) -20);
        }
        int var9 = class308.method2129(arg4 + arg1, class116.field1888, class319.field4965, 1252946087);
        int var10 = class308.method2129(arg4 - arg1, class116.field1888, class319.field4965, 1252946087);
        class86.method614(arg3, -24891, var9, var10, class102.field1729[arg2]);
        while (var6 > var5) {
            var7 += 2;
            var8 += var7;
            if (var8 > 0) {
                var6--;
                int var11 = arg2 + var6;
                int var12 = arg2 - var6;
                if (class188.field2995 <= var11 && class195.field3108 >= var12) {
                    int var13 = class308.method2129(arg4 + var5, class116.field1888, class319.field4965, 1252946087);
                    int var14 = class308.method2129(arg4 - var5, class116.field1888, class319.field4965, 1252946087);
                    if (class195.field3108 >= var11) {
                        class86.method614(arg3, -24891, var13, var14, class102.field1729[var11]);
                    }
                    if (class188.field2995 <= var12) {
                        class86.method614(arg3, -24891, var13, var14, class102.field1729[var12]);
                    }
                }
                var8 -= var6 << 1;
            }
            var5++;
            int var15 = arg2 - var5;
            int var16 = arg2 + var5;
            if (class188.field2995 <= var16 && class195.field3108 >= var15) {
                int var17 = class308.method2129(arg4 + var6, class116.field1888, class319.field4965, 1252946087);
                int var18 = class308.method2129(arg4 - var6, class116.field1888, class319.field4965, 1252946087);
                if (class195.field3108 >= var16) {
                    class86.method614(arg3, -24891, var17, var18, class102.field1729[var16]);
                }
                if (var15 >= class188.field2995) {
                    class86.method614(arg3, -24891, var17, var18, class102.field1729[var15]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V", line = 395)
    public final void method70(int arg0) {
        this.method1780(45);
        field3875++;
        if (arg0 < 13) {
            this.field3881 = 93;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Z)V", line = 418)
    public static final void method1782(String arg0, int arg1, String arg2, boolean arg3) {
        class107.method818((byte) -26, (String) null, arg2, arg0, arg1, -1);
        if (!arg3) {
            field3884++;
        }
    }
}
