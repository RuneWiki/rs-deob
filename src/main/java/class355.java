import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class355 {

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "I")
    private int field4965 = 0;

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
    public int field4966 = -1;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
    public int field4962 = 512;

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "Z")
    public boolean field4970 = true;

    @OriginalMember(owner = "client!iv", name = "k", descriptor = "I")
    public static int field4972 = 100;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "Lvt;")
    public static class344 field4963 = new class344("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!iv", name = "n", descriptor = "Ljava/util/Random;")
    public static Random field4975 = new Random();

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "I")
    public int field4964;

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
    public int field4967;

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
    public int field4969;

    @OriginalMember(owner = "client!iv", name = "j", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!iv", name = "l", descriptor = "I")
    public int field4973;

    @OriginalMember(owner = "client!iv", name = "m", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!iv", name = "o", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!iv", name = "p", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IILge;)V")
    private final void method2211(int arg0, int arg1, class551 arg2) {
        if (arg0 == 1) {
            this.field4965 = arg2.method3043((byte) 49);
            this.method2213(this.field4965, true);
        } else if (arg0 == 2) {
            this.field4966 = arg2.method3090(-98);
            if (this.field4966 == 65535) {
                this.field4966 = -1;
            }
        } else if (arg0 == 3) {
            this.field4962 = arg2.method3090(-120) << 2;
        } else if (arg0 == 4) {
            this.field4970 = false;
        }
        if (arg1 == -1) {
            field4974++;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lge;B)V")
    public final void method2212(class551 arg0, byte arg1) {
        if (arg1 <= 16) {
            this.method2212(null, (byte) -4);
        }
        field4968++;
        while (true) {
            int var3 = arg0.method3045(-127);
            if (var3 == 0) {
                return;
            }
            this.method2211(var3, -1, arg0);
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IZ)V")
    private final void method2213(int arg0, boolean arg1) {
        if (!arg1) {
            method2215(-125, -47, 52, -107);
        }
        field4977++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg0 & 0xFFF7) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
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
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field4973 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field4969 = (int) (var15 * 256.0D);
        if (this.field4973 < 0) {
            this.field4973 = 0;
        } else if (this.field4973 > 255) {
            this.field4973 = 255;
        }
        if (this.field4969 < 0) {
            this.field4969 = 0;
        } else if (this.field4969 > 255) {
            this.field4969 = 255;
        }
        if (var17 > 0.5D) {
            this.field4967 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field4967 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field4967 < 1) {
            this.field4967 = 1;
        }
        this.field4964 = (int) ((double) this.field4967 * var19);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
    public static void method2214(int arg0) {
        field4963 = null;
        if (arg0 >= -12) {
            field4975 = null;
        }
        field4975 = null;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIII)Z")
    public static final boolean method2215(int arg0, int arg1, int arg2, int arg3) {
        if (!class250.method1528(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class400.field5480;
        int var5 = arg2 << class400.field5480;
        int var6 = class501.field6947[arg0].method1031(arg1, arg2) - 1;
        int var7 = var6 - (0x78 << class400.field5480 - 7);
        int var8 = var6 - (0xE6 << class400.field5480 - 7);
        int var9 = var6 - (0xEE << class400.field5480 - 7);
        if (arg3 == 1) {
            if (var4 > class543.field7580) {
                if (!class155.method836(var4, var6, var5)) {
                    return false;
                }
                if (!class155.method836(var4, var6, class337.field4699 + var5)) {
                    return false;
                }
                if (!class155.method836(var4, var6, class456.field6523 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class155.method836(var4, var7, var5)) {
                    return false;
                }
                if (!class155.method836(var4, var7, class337.field4699 + var5)) {
                    return false;
                }
                if (!class155.method836(var4, var7, class456.field6523 + var5)) {
                    return false;
                }
            }
            if (!class155.method836(var4, var8, var5)) {
                return false;
            } else if (class155.method836(var4, var8, class337.field4699 + var5)) {
                return class155.method836(var4, var8, class456.field6523 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class100.field1335) {
                if (!class155.method836(var4, var6, class456.field6523 + var5)) {
                    return false;
                }
                if (!class155.method836(class337.field4699 + var4, var6, class456.field6523 + var5)) {
                    return false;
                }
                if (!class155.method836(class456.field6523 + var4, var6, class456.field6523 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class155.method836(var4, var7, class456.field6523 + var5)) {
                    return false;
                }
                if (!class155.method836(class337.field4699 + var4, var7, class456.field6523 + var5)) {
                    return false;
                }
                if (!class155.method836(class456.field6523 + var4, var7, class456.field6523 + var5)) {
                    return false;
                }
            }
            if (!class155.method836(var4, var8, class456.field6523 + var5)) {
                return false;
            } else if (class155.method836(class337.field4699 + var4, var8, class456.field6523 + var5)) {
                return class155.method836(class456.field6523 + var4, var8, class456.field6523 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class543.field7580) {
                if (!class155.method836(class456.field6523 + var4, var6, var5)) {
                    return false;
                }
                if (!class155.method836(class456.field6523 + var4, var6, class337.field4699 + var5)) {
                    return false;
                }
                if (!class155.method836(class456.field6523 + var4, var6, class456.field6523 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class155.method836(class456.field6523 + var4, var7, var5)) {
                    return false;
                }
                if (!class155.method836(class456.field6523 + var4, var7, class337.field4699 + var5)) {
                    return false;
                }
                if (!class155.method836(class456.field6523 + var4, var7, class456.field6523 + var5)) {
                    return false;
                }
            }
            if (!class155.method836(class456.field6523 + var4, var8, var5)) {
                return false;
            } else if (class155.method836(class456.field6523 + var4, var8, class337.field4699 + var5)) {
                return class155.method836(class456.field6523 + var4, var8, class456.field6523 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class100.field1335) {
                if (!class155.method836(var4, var6, var5)) {
                    return false;
                }
                if (!class155.method836(class337.field4699 + var4, var6, var5)) {
                    return false;
                }
                if (!class155.method836(class456.field6523 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class155.method836(var4, var7, var5)) {
                    return false;
                }
                if (!class155.method836(class337.field4699 + var4, var7, var5)) {
                    return false;
                }
                if (!class155.method836(class456.field6523 + var4, var7, var5)) {
                    return false;
                }
            }
            if (!class155.method836(var4, var8, var5)) {
                return false;
            } else if (class155.method836(class337.field4699 + var4, var8, var5)) {
                return class155.method836(class456.field6523 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class155.method836(class337.field4699 + var4, var9, class337.field4699 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class155.method836(var4, var8, class456.field6523 + var5);
        } else if (arg3 == 32) {
            return class155.method836(class456.field6523 + var4, var8, class456.field6523 + var5);
        } else if (arg3 == 64) {
            return class155.method836(class456.field6523 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class155.method836(var4, var8, var5);
        } else {
            return true;
        }
    }
}
