import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class521 {

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public int field7604 = 128;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "Z")
    public boolean field7599 = true;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public int field7596 = -1;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    private int field7602 = 0;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field7592;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field7594;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public int field7595;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field7597;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field7598;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field7600;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field7601;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public int field7603;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    public static int field7605;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public static int field7606;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public int field7607;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public int field7608;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "Lba;")
    public static class269 field7593;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
    public static final void method3087(int arg0, int arg1, String arg2, String arg3) {
        field7601++;
        class497.field7189 = 2;
        class84.field1337 = arg0;
        if (arg1 <= -91) {
            class134.method977(arg3, 1, arg2);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BIII)I")
    public static final int method3088(byte arg0, int arg1, int arg2, int arg3) {
        field7597++;
        int var4 = arg2 / arg1;
        int var5 = arg1 - 1 & arg2;
        int var6 = arg3 / arg1;
        int var7 = arg1 - 1 & arg3;
        int var8 = class108.method787(-14800, var4, var6);
        int var9 = class108.method787(-14800, var4 + 1, var6);
        int var10 = class108.method787(-14800, var4, var6 + 1);
        int var11 = class108.method787(-14800, var4 + 1, var6 - -1);
        int var12 = class23.method131(var5, var9, var8, arg1, (byte) -107);
        if (arg0 != 88) {
            field7593 = null;
        }
        int var13 = class23.method131(var5, var11, var10, arg1, (byte) -112);
        return class23.method131(var7, var13, var12, arg1, (byte) 23);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lwn;Z)V")
    public final void method3089(class519 arg0, boolean arg1) {
        if (arg1) {
            this.method3092(-18, 1, null);
        }
        while (true) {
            int var3 = arg0.method3072((byte) -124);
            if (var3 == 0) {
                field7606++;
                return;
            }
            this.method3092(var3, -88, arg0);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    public static void method3090(byte arg0) {
        field7593 = null;
        if (arg0 >= -2) {
            method3090((byte) 31);
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
    public static final void method3091(byte arg0) {
        if (class70.field1149 < 0) {
            class94.field1501 = -1;
            class473.field6895 = -1;
            class70.field1149 = 0;
        }
        if (arg0 != 70) {
            method3090((byte) 91);
        }
        field7594++;
        if (class382.field5470 < class70.field1149) {
            class94.field1501 = -1;
            class70.field1149 = class382.field5470;
            class473.field6895 = -1;
        }
        if (class388.field5514 < 0) {
            class473.field6895 = -1;
            class388.field5514 = 0;
            class94.field1501 = -1;
        }
        if (class388.field5514 > class382.field5485) {
            class388.field5514 = class382.field5485;
            class473.field6895 = -1;
            class94.field1501 = -1;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILwn;)V")
    private final void method3092(int arg0, int arg1, class519 arg2) {
        field7598++;
        int var4 = 5 % ((arg1 - 8) / 36);
        if (arg0 == 1) {
            this.field7602 = arg2.method3040((byte) -3);
            this.method3094(this.field7602, true);
        } else if (arg0 == 2) {
            this.field7596 = arg2.method3018(566990904);
            if (this.field7596 != 65535) {
                return;
            }
            this.field7596 = -1;
        } else if (arg0 == 3) {
            this.field7604 = arg2.method3018(566990904) << 0;
            return;
        } else if (arg0 == 4) {
            this.field7599 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BILtf;I)V")
    public static final void method3093(byte arg0, int arg1, class198 arg2, int arg3) {
        if (arg0 < 52) {
            field7600 = -65;
        }
        field7592++;
        if (class219.field3351) {
            class284 var9 = class430.field6182 == -1 ? null : class510.field7361.method2011(72, class430.field6182);
            if (!client.method1395(arg2).method1892(-25079) || (class25.field362 & 0x20) == 0) {
                return;
            }
            if (var9 == null || arg2.method1336(var9.field4220, class430.field6182, (byte) -1) != var9.field4220) {
                class20.method114(3, 0L, true, arg2.field2969, false, true, class137.field2118, class503.field7268 + " -> " + arg2.field2954, class89.field1442, arg2.field2952, arg2.field3016);
                class500.field7225++;
            }
            return;
        }
        for (int var4 = 9; var4 >= 5; var4--) {
            String var8 = class364.method2244(20438, var4, arg2);
            if (var8 != null) {
                class268.field4026++;
                class20.method114(1008, (long) (var4 + 1), true, arg2.field2969, false, true, class492.method2888(var4, arg2, (byte) -102), arg2.field2954, var8, arg2.field2952, arg2.field3016);
            }
        }
        String var5 = class342.method2166(arg2, 0);
        if (var5 != null) {
            class504.field7292++;
            class20.method114(51, 0L, true, arg2.field2969, false, true, arg2.field2921, arg2.field2954, var5, arg2.field2952, arg2.field3016);
        }
        for (int var6 = 4; var6 >= 0; var6--) {
            String var7 = class364.method2244(20438, var6, arg2);
            if (var7 != null) {
                class20.method114(6, (long) (var6 + 1), true, arg2.field2969, false, true, class492.method2888(var6, arg2, (byte) -78), arg2.field2954, var7, arg2.field2952, arg2.field3016);
                class268.field4026++;
            }
        }
        if (!client.method1395(arg2).method1889(-104)) {
            return;
        }
        class276.field4117++;
        if (arg2.field3032 == null) {
            class20.method114(11, 0L, true, arg2.field2969, false, true, -1, "", class25.field356.method426(class503.field7255, 121), arg2.field2952, arg2.field3016);
            return;
        }
        class20.method114(11, 0L, true, arg2.field2969, false, true, -1, "", arg2.field3032, arg2.field2952, arg2.field3016);
        return;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)V")
    private final void method3094(int arg0, boolean arg1) {
        field7605++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg0 & 0xFFBB) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (!arg1) {
            return;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        this.field7607 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field7595 = (int) (var17 * 256.0D);
        if ((var17 > 0.5D)) {
            this.field7608 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field7608 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field7607 < 0) {
            this.field7607 = 0;
        } else if (this.field7607 > 255) {
            this.field7607 = 255;
        }
        if (this.field7595 < 0) {
            this.field7595 = 0;
        } else if (this.field7595 > 255) {
            this.field7595 = 255;
        }
        if (this.field7608 < 1) {
            this.field7608 = 1;
        }
        this.field7603 = (int) ((double) this.field7608 * var19);
    }
}
