import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class382 {

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public int field5443 = 128;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    private int field5452 = 0;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "Z")
    public boolean field5446 = true;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public int field5448 = -1;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field5447 = 0;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public int field5450;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public int field5453;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public int field5457;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    public int field5459;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)Lii;")
    public static final class358 method2302(int arg0, int arg1) {
        field5449++;
        if (arg0 != 0) {
            method2306(123, 91, 72, 51, 44);
        }
        if (arg1 == 0) {
            if ((double) class395.field5614 == 3.0D) {
                return class460.field6458;
            }
            if ((double) class395.field5614 == 4.0D) {
                return class40.field519;
            }
            if ((double) class395.field5614 == 6.0D) {
                return class338.field4931;
            }
            if ((double) class395.field5614 >= 8.0D) {
                return class307.field4374;
            }
        } else if (arg1 == 1) {
            if ((double) class395.field5614 == 3.0D) {
                return class338.field4931;
            }
            if ((double) class395.field5614 == 4.0D) {
                return class307.field4374;
            }
            if ((double) class395.field5614 == 6.0D) {
                return class394.field5597;
            }
            if ((double) class395.field5614 >= 8.0D) {
                return class462.field6466;
            }
        } else if (arg1 == 2) {
            if ((double) class395.field5614 == 3.0D) {
                return class394.field5597;
            }
            if ((double) class395.field5614 == 4.0D) {
                return class462.field6466;
            }
            if ((double) class395.field5614 == 6.0D) {
                return class476.field6689;
            }
            if ((double) class395.field5614 >= 8.0D) {
                return class208.field3171;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lrp;I)V")
    public final void method2303(class276 arg0, int arg1) {
        field5460++;
        while (true) {
            int var3 = arg0.method1701(-23121);
            if (var3 == 0) {
                if (arg1 == 2828) {
                    return;
                } else {
                    this.method2304(-105, -111);
                    return;
                }
            }
            this.method2307(var3, (byte) 38, arg0);
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)V")
    private final void method2304(int arg0, int arg1) {
        field5455++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg0 & 0xFFE1) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var7) {
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
        this.field5450 = (int) (var15 * 256.0D);
        this.field5459 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        if (arg1 >= -56) {
            this.method2304(73, -80);
        }
        if (this.field5459 < 0) {
            this.field5459 = 0;
        } else if (this.field5459 > 255) {
            this.field5459 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field5457 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field5457 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field5450 < 0) {
            this.field5450 = 0;
        } else if (this.field5450 > 255) {
            this.field5450 = 255;
        }
        if (this.field5457 < 1) {
            this.field5457 = 1;
        }
        this.field5453 = (int) ((double) this.field5457 * var19);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static final void method2305(int arg0) {
        field5456++;
        if (!class36.field473) {
            return;
        }
        if (arg0 > -87) {
            field5447 = -5;
        }
        class145 var1 = class441.method2598((byte) -127, class255.field3739, class40.field523);
        if (var1 != null && var1.field1931 != null) {
            class202 var2 = new class202();
            var2.field2976 = var1;
            var2.field2971 = var1.field1931;
            class290.method1818(var2);
        }
        class359.field5170 = -1;
        class36.field473 = false;
        class360.field5183 = -1;
        if (var1 != null) {
            class22.method148((byte) -78, var1);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIII)V")
    public static final void method2306(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5444++;
        for (int var5 = arg1; var5 < class420.field5872; var5++) {
            Rectangle var6 = class40.field526[var5];
            if (arg2 < var6.x + var6.width && arg2 + arg3 > var6.x && arg0 < (var6.y + var6.height) && arg0 + arg4 > var6.y) {
                class359.field5166[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBLrp;)V")
    private final void method2307(int arg0, byte arg1, class276 arg2) {
        field5445++;
        if (arg1 != 38) {
            return;
        }
        if (arg0 == 1) {
            this.field5452 = arg2.method1748(false);
            this.method2304(this.field5452, -78);
        } else if (arg0 == 2) {
            this.field5448 = arg2.method1729(65280);
            if (this.field5448 != 65535) {
                return;
            }
            this.field5448 = -1;
        } else if (arg0 == 3) {
            this.field5443 = arg2.method1729(65280);
            return;
        } else if (arg0 == 4) {
            this.field5446 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIII)V")
    public static final void method2308(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 > -26) {
            field5451 = 35;
        }
        field5454++;
        String var4 = "tele " + arg0 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
        System.out.println(var4);
        class393.method2351(0, true, var4);
    }

    static {
        new class326("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        field5458 = 0;
    }
}
