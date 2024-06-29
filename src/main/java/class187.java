import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public abstract class class187 extends class472 {

    @OriginalMember(owner = "client!p", name = "F", descriptor = "Z")
    public volatile boolean field2870 = true;

    @OriginalMember(owner = "client!p", name = "C", descriptor = "Z")
    public static boolean field2867 = false;

    @OriginalMember(owner = "client!p", name = "A", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!p", name = "B", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!p", name = "D", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!p", name = "E", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!p", name = "G", descriptor = "Z")
    public boolean field2871;

    @OriginalMember(owner = "client!p", name = "H", descriptor = "Z")
    public boolean field2872;

    static {
        new class179("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1300(int arg0) {
        field2866++;
        for (int var1 = arg0; var1 < 5; var1++) {
            class190.field2911[var1] = false;
        }
        class228.field3452 = class128.field1917;
        class134.field1993 = 0;
        class420.field6167 = -1;
        class286.field4468 = class430.field6377;
        class405.field5984 = class536.field7863;
        class37.field459 = 0;
        class499.field7270 = class446.field6625;
        class218.field3294 = class406.field5999;
        class168.field2548 = class505.field7344;
        class33.field401 = 5;
        class480.field7050 = -1;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IZ)I", line = 39)
    public static final int method1301(int arg0, boolean arg1) {
        field2865++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        if (arg1) {
            field2867 = true;
        }
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg0;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZI)I", line = 59)
    public static final int method1302(boolean arg0, int arg1) {
        field2869++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) ((arg1 & 0xFF64) >> 8) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        if (arg0) {
            return -97;
        }
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return ((var20 >> 2 & 0x3F) << 10) + ((var21 >> 5 << 7) + (var22 >> 1));
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V", line = 161)
    public static final void method1303(byte arg0) {
        field2868++;
        int var1 = class522.field7666 * 128 + 64;
        int var2 = class457.field6795 * 128 + 64;
        int var3 = class416.method2605(var2, var1, (byte) 124, class30.field370) - class208.field3177;
        if (class77.field1293 >= 100) {
            class406.field5999 = class457.field6795 * 128 + 64;
            class128.field1917 = class522.field7666 * 128 + 64;
            class505.field7344 = class416.method2605(class406.field5999, class128.field1917, (byte) -78, class30.field370) - class208.field3177;
        } else {
            if (var1 > class128.field1917) {
                class128.field1917 += class476.field6965 + ((var1 - class128.field1917) * class77.field1293 / 1000);
                if (var1 < class128.field1917) {
                    class128.field1917 = var1;
                }
            }
            if (class505.field7344 < var3) {
                class505.field7344 += (var3 - class505.field7344) * class77.field1293 / 1000 + class476.field6965;
                if (var3 < class505.field7344) {
                    class505.field7344 = var3;
                }
            }
            if (class128.field1917 > var1) {
                class128.field1917 -= (class128.field1917 - var1) * class77.field1293 / 1000 + class476.field6965;
                if (class128.field1917 < var1) {
                    class128.field1917 = var1;
                }
            }
            if (var3 < class505.field7344) {
                class505.field7344 -= (class505.field7344 - var3) * class77.field1293 / 1000 + class476.field6965;
                if (var3 > class505.field7344) {
                    class505.field7344 = var3;
                }
            }
            if (var2 > class406.field5999) {
                class406.field5999 += class476.field6965 + ((var2 - class406.field5999) * class77.field1293 / 1000);
                if (class406.field5999 > var2) {
                    class406.field5999 = var2;
                }
            }
            if (var2 < class406.field5999) {
                class406.field5999 -= (class406.field5999 - var2) * class77.field1293 / 1000 + class476.field6965;
                if (var2 > class406.field5999) {
                    class406.field5999 = var2;
                }
            }
        }
        int var4 = class30.field340 * 128 + 64;
        int var5 = class38.field638 * 128 + 64;
        int var6 = class416.method2605(var5, var4, (byte) 127, class30.field370) - class310.field4730;
        int var7 = var4 - class128.field1917;
        int var8 = var6 - class505.field7344;
        int var9 = var5 - class406.field5999;
        if (arg0 != -42) {
            method1301(-96, false);
        }
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class430.field6377) {
            class430.field6377 += (var11 - class430.field6377 >> 3) * class37.field459 / 1000 + class134.field1993 << 3;
            if (var11 < class430.field6377) {
                class430.field6377 = var11;
            }
        }
        if (class430.field6377 > var11) {
            class430.field6377 -= (class430.field6377 - var11 >> 3) * class37.field459 / 1000 + class134.field1993 << 3;
            if (var11 > class430.field6377) {
                class430.field6377 = var11;
            }
        }
        int var13 = var12 - class536.field7863;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class536.field7863 += class37.field459 * var14 / 1000 + class134.field1993 << 3;
            class536.field7863 &= 0x3FFF;
        }
        if (var14 < 0) {
            class536.field7863 -= class134.field1993 + (-var14 * class37.field459 / 1000) << 3;
            class536.field7863 &= 0x3FFF;
        }
        int var15 = var12 - class536.field7863;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class536.field7863 = var12;
        }
        class21.field242 = 0;
    }

    @OriginalMember(owner = "client!p", name = "g", descriptor = "(I)[B")
    public abstract byte[] method841(int arg0);

    @OriginalMember(owner = "client!p", name = "h", descriptor = "(I)I")
    public abstract int method842(int arg0);
}
