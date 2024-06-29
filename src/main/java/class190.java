import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class190 extends class59 {

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "I")
    private int field3082 = 4096;

    @OriginalMember(owner = "client!pb", name = "Z", descriptor = "[I")
    private int[] field3094 = new int[3];

    @OriginalMember(owner = "client!pb", name = "V", descriptor = "I")
    private int field3090 = 3216;

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "I")
    private int field3081 = 3216;

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "I")
    public static int field3083 = 0;

    @OriginalMember(owner = "client!pb", name = "U", descriptor = "Lph;")
    public static class229 field3089 = class266.method1858("gleiten:", 0);

    @OriginalMember(owner = "client!pb", name = "T", descriptor = "Lph;")
    public static class229 field3088 = class266.method1858(")4a=", 0);

    @OriginalMember(owner = "client!pb", name = "cb", descriptor = "Z")
    public static boolean field3097 = false;

    @OriginalMember(owner = "client!pb", name = "bb", descriptor = "Lph;")
    public static class229 field3096 = class266.method1858(" est d-Bj-9 dans votre liste d(Wamis)3", 0);

    @OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
    public static int field3087 = 0;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!pb", name = "R", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!pb", name = "W", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!pb", name = "X", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!pb", name = "Y", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!pb", name = "ab", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!pb", name = "db", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILph;IILph;Lph;)V", line = 14)
    public static final void method1323(int arg0, class229 arg1, int arg2, int arg3, class229 arg4, class229 arg5) {
        field3092++;
        for (int var6 = 99; var6 > 0; var6--) {
            class266.field4480[var6] = class266.field4480[var6 - 1];
            class296.field4840[var6] = class296.field4840[var6 - 1];
            class53.field752[var6] = class53.field752[var6 - 1];
            class152.field2466[var6] = class152.field2466[var6 - 1];
            class48.field710[var6] = class48.field710[var6 - 1];
        }
        class266.field4480[0] = arg2;
        class38.field608++;
        class248.field4129 = class129.field2125;
        class296.field4840[0] = arg4;
        class48.field710[0] = arg0;
        class53.field752[0] = arg5;
        if (arg3 != 18411) {
            method1329(-26, (class60) null);
        }
        class152.field2466[0] = arg1;
    }

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "(I)V", line = 59)
    public final void method65(int arg0) {
        field3098++;
        this.method1331((byte) 107);
        if (arg0 < 110) {
            this.method67((byte) 57, -15, (class164) null);
        }
    }

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "(I)V", line = 73)
    public static final void method1324(int arg0) {
        for (class218 var1 = (class218) class225.field3687.method1580((byte) -39); var1 != null; var1 = (class218) class225.field3687.method1579((byte) 28)) {
            if (var1.field3582 == -1) {
                var1.field3592 = 0;
                class27.method181(true, var1);
            } else {
                var1.method598(16);
            }
        }
        if (arg0 < 68) {
            field3087 = -34;
        }
        field3079++;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIII)V", line = 98)
    public static final void method1325(int arg0, int arg1, int arg2, int arg3) {
        int var4 = -5 / ((37 - arg1) / 60);
        field3085++;
        class301 var5 = class167.method1224(arg3, 126, arg0);
        if (var5 != null && var5.field4967 != null) {
            class157 var6 = new class157();
            var6.field2552 = var5.field4967;
            var6.field2551 = var5;
            class177.method1275(var6, -100);
        }
        class165.field2701 = arg3;
        class208.field3434 = arg2;
        class45.field689 = arg0;
        class8.field103 = true;
        class296.method2006(var5, 121);
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V", line = 122)
    public class190() {
        super(1, true);
    }

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "(I)I", line = 130)
    public static final int method1326(int arg0) {
        field3091++;
        if (arg0 < 91) {
            field3083 = 122;
        }
        return class76.field1274;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)V", line = 143)
    public static void method1327(byte arg0) {
        if (arg0 > -115) {
            field3087 = -107;
        }
        field3088 = null;
        field3096 = null;
        field3089 = null;
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)Lcc;", line = 165)
    public static final class220 method1328(byte arg0) {
        class220 var1;
        if (class99.field1675) {
            var1 = new class258(class266.field4486, class48.field713, class303.field5064[0], class27.field387[0], class36.field597[0], class288.field4729[0], class279.field4623[0], class314.field5346);
        } else {
            var1 = new class32(class266.field4486, class48.field713, class303.field5064[0], class27.field387[0], class36.field597[0], class288.field4729[0], class279.field4623[0], class314.field5346);
        }
        class214.method1517(-25672);
        field3077++;
        if (arg0 != -24) {
            field3088 = (class229) null;
        }
        return var1;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI)[I", line = 182)
    public final int[] method63(boolean arg0, int arg1) {
        field3095++;
        int[] var3 = this.field846.method383(3583, arg1);
        if (!arg0) {
            method1324(101);
        }
        if (this.field846.field811) {
            int var4 = class118.field1981 * this.field3082 >> 12;
            int[] var5 = this.method394(class33.field544 & arg1 - 1, 0, (byte) -44);
            int[] var6 = this.method394(arg1, 0, (byte) 102);
            int[] var7 = this.method394(arg1 + 1 & class33.field544, 0, (byte) 116);
            for (int var8 = 0; var8 < class293.field4789; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[class4.field51 & var8 - 1] - var6[class4.field51 & var8 + 1]) * var4 >> 12;
                int var11 = var9 >> 4;
                int var12 = var10 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class27.field399[((var11 + 1) * var11 >> 1) + var12] & 0xFF;
                int var14 = var10 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field3094[1] * var16 >> 12;
                int var18 = this.field3094[0] * var14 >> 12;
                int var19 = this.field3094[2] * var15 >> 12;
                var3[var8] = var18 + var17 + var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BILhb;)V", line = 266)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        if (arg0 != 115) {
            method1330(-99, (class164) null);
        }
        if (arg1 == 0) {
            this.field3082 = arg2.method1161(true);
        } else if (arg1 == 1) {
            this.field3090 = arg2.method1161(true);
        } else if (arg1 == 2) {
            this.field3081 = arg2.method1161(true);
        }
        field3084++;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILbk;)V", line = 312)
    public static final void method1329(int arg0, class60 arg1) {
        field3080++;
        class308.field5192 = arg1;
        if (arg0 != -9636) {
            field3087 = -71;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILhb;)Lsk;", line = 337)
    public static final class214 method1330(int arg0, class164 arg1) {
        field3093++;
        if (arg0 != 2) {
            method1327((byte) -51);
        }
        return new class214(arg1.method1179((byte) -74), arg1.method1179((byte) -74), arg1.method1179((byte) -74), arg1.method1179((byte) -74), arg1.method1179((byte) -74), arg1.method1179((byte) -74), arg1.method1179((byte) -74), arg1.method1179((byte) -74), arg1.method1176(1048115912), arg1.method1178(8));
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(B)V", line = 349)
    private final void method1331(byte arg0) {
        double var2 = Math.cos((double) ((float) this.field3081 / 4096.0F));
        this.field3094[0] = (int) (Math.sin((double) ((float) this.field3090 / 4096.0F)) * 4096.0D * var2);
        this.field3094[1] = (int) (var2 * 4096.0D * Math.cos((double) ((float) this.field3090 / 4096.0F)));
        this.field3094[2] = (int) (Math.sin((double) ((float) this.field3081 / 4096.0F)) * 4096.0D);
        if (arg0 < 67) {
            method1323(124, (class229) null, 115, 103, (class229) null, (class229) null);
        }
        field3078++;
        int var4 = this.field3094[0] * this.field3094[0] >> 12;
        int var5 = this.field3094[2] * this.field3094[2] >> 12;
        int var6 = this.field3094[1] * this.field3094[1] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var6 + var5 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field3094[2] = (this.field3094[2] << 12) / var7;
            this.field3094[0] = (this.field3094[0] << 12) / var7;
            this.field3094[1] = (this.field3094[1] << 12) / var7;
        }
    }
}
