import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class5 {

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    private int field66 = -1;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    private int field80 = 0;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Lwb;")
    public static class123 field75 = null;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "Lj;")
    public static class209 field83 = new class209(64);

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public int field73;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public int field76;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public int field78;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public int field82;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "Lol;")
    public static class109 field84;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
    public static final void method24(boolean arg0) {
        if (!arg0) {
            method26(true);
        }
        class36.field463.method1701((byte) 120);
        class36.field466.method1701((byte) 87);
        field67++;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILpd;I)V")
    private final void method25(int arg0, int arg1, class96 arg2, int arg3) {
        if (arg0 != 13782) {
            this.field73 = -1;
        }
        if (arg1 == 1) {
            this.field80 = arg2.method598(-1235752501);
            this.method28(this.field80, 255);
        } else if (arg1 == 2) {
            this.field66 = arg2.method549(255);
            if (this.field66 == 65535) {
                this.field66 = -1;
            }
        } else if (arg1 == 3) {
            arg2.method549(255);
        }
        field69++;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(Z)V")
    public static void method26(boolean arg0) {
        field83 = null;
        field84 = null;
        field75 = null;
        if (!arg0) {
            method27(25);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static final void method27(int arg0) {
        field77++;
        if (arg0 != -17176) {
            field84 = null;
        }
        if (class269.field4305) {
            return;
        }
        class253.field4120 = true;
        class269.field4305 = true;
        if (class129.field2065) {
            class238.field3933 = (float) ((int) class238.field3933 - 17 & 0xFFFFFFF0);
        } else {
            class152.field2359 += (-class152.field2359 - 12.0F) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V")
    private final void method28(int arg0, int arg1) {
        field81++;
        double var3 = (double) ((arg0 & 0xFF7FDB) >> 16) / 256.0D;
        double var5 = (double) ((arg0 & 0xFF83) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = 0.0D;
        double var13 = 0.0D;
        double var15 = var3;
        if (var5 > var3) {
            var15 = var5;
        }
        if (var7 > var15) {
            var15 = var7;
        }
        double var17 = (var9 + var15) / 2.0D;
        this.field78 = (int) (var17 * 256.0D);
        if (var9 != var15) {
            if (var3 == var15) {
                var11 = (var5 - var7) / (var15 - var9);
            } else if (var5 == var15) {
                var11 = (var7 - var3) / (var15 - var9) + 2.0D;
            } else if (var7 == var15) {
                var11 = (var3 - var5) / (var15 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var13 = (var15 - var9) / (var9 + var15);
            }
            if (var17 >= 0.5D) {
                var13 = (var15 - var9) / (2.0D - var15 - var9);
            }
        }
        if (this.field78 < 0) {
            this.field78 = 0;
        } else if (this.field78 > 255) {
            this.field78 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field76 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field76 = (int) (var13 * var17 * 512.0D);
        }
        if (this.field76 < 1) {
            this.field76 = 1;
        }
        double var19 = var11 / 6.0D;
        if (arg1 != 255) {
            this.field66 = -43;
        }
        this.field82 = (int) ((double) this.field76 * var19);
        this.field73 = (int) (var13 * 256.0D);
        if (this.field73 < 0) {
            this.field73 = 0;
        } else if (this.field73 > 255) {
            this.field73 = 255;
            return;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IBLpd;)V")
    public final void method29(int arg0, byte arg1, class96 arg2) {
        if (arg1 >= -108) {
            return;
        }
        field74++;
        while (true) {
            int var4 = arg2.method584(255);
            if (var4 == 0) {
                return;
            }
            this.method25(13782, var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
    public static final void method30(int arg0) {
        field68++;
        class139 var1 = class187.field2974;
        synchronized (class187.field2974) {
            class113.field1626 = class75.field947;
            class113.field1623 = class78.field978;
            if (arg0 != 18145) {
                method30(13);
            }
            class201.field3191++;
            class92.field1156 = class92.field1161;
            class90.field1119 = class226.field3638;
            class107.field1449 = class116.field1650;
            class214.field3435 = class155.field2465;
            class275.field4398 = class258.field4186;
            class226.field3638 = 0;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZI)V")
    public static final void method31(boolean arg0, int arg1) {
        field70++;
        class269.field4312 = null;
        class177.field2807 = null;
        class55.field702 = null;
        class198.field3139 = null;
        class41.field516 = null;
        class113.field1622 = 0;
        class166.field2679 = null;
        class73.field925 = null;
        class4.field65 = null;
        class210.field3349 = null;
        if (arg0 && class238.field3928 != null) {
            class233.field3853 = class238.field3928.field2333;
        } else {
            class233.field3853 = -1;
        }
        class238.field3928 = null;
        class155.field2424 = null;
        class78.field980.method1805(-729782270);
        int var2 = 99 % ((40 - arg1) / 54);
        class92.field1159 = null;
        class296.field4688 = null;
        class264.field4259 = null;
        class51.field672 = null;
        class134.field2121 = null;
        class124.field1934 = null;
        class166.field2666 = -1;
        class247.field4072 = null;
        class24.field343 = null;
        class209.field3332 = null;
        class236.field3910 = -1;
        class209.field3336 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method32(byte arg0, String arg1, String arg2, String arg3) {
        field79++;
        int var4 = arg1.length();
        int var5 = arg3.length();
        int var6 = arg2.length();
        if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
        }
        int var7 = var6 - var5;
        int var8 = var4;
        if (var7 != 0) {
            int var9 = 0;
            while (true) {
                int var10 = arg1.indexOf(arg3, var9);
                if (var10 < 0) {
                    break;
                }
                var8 += var7;
                var9 = var5 + var10;
            }
        }
        if (arg0 != 62) {
            method32((byte) 21, (String) null, (String) null, (String) null);
        }
        StringBuffer var11 = new StringBuffer(var8);
        int var12 = 0;
        while (true) {
            int var13 = arg1.indexOf(arg3, var12);
            if (var13 < 0) {
                var11.append(arg1.substring(var12));
                return var11.toString();
            }
            var11.append(arg1.substring(var12, var13));
            var11.append(arg2);
            var12 = var5 + var13;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method33(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class276.field4405 = arg1;
        field71++;
        if (arg5 < 113) {
            field83 = null;
        }
        class41.field507 = arg2;
        class191.field3085 = arg4;
        class144.field2286 = arg6;
        class222.field3572 = arg3;
        if (arg0 && class276.field4405 >= 100) {
            class36.field465 = class191.field3085 * 128 + 64;
            class74.field932 = class41.field507 * 128 + 64;
            class252.field4114 = class166.method1148(class244.field4011, class74.field932, class36.field465, (byte) 122) - class222.field3572;
        }
        class283.field4513 = 2;
    }
}
