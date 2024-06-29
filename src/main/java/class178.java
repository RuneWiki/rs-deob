import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class178 extends class101 {

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
    public int field3389 = -1;

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "Z")
    public boolean field3397 = true;

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
    public int field3399 = -1;

    @OriginalMember(owner = "client!ta", name = "N", descriptor = "I")
    public int field3401 = 0;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "Ltg;")
    public static class184 field3390 = class135.method812("Spieler", 3);

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3392 = Calendar.getInstance();

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "Lnd;")
    public static class127 field3400 = new class127(100);

    @OriginalMember(owner = "client!ta", name = "O", descriptor = "Ltg;")
    public static class184 field3402 = class135.method812("Suche nach Updates )2 ", 3);

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!ta", name = "G", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "[[[[Z")
    public static boolean[][][][] field3393;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBILka;)V")
    private final void method1088(int arg0, byte arg1, int arg2, class97 arg3) {
        if (arg1 < 47) {
            return;
        }
        field3398++;
        if (arg0 == 1) {
            this.field3401 = this.method1089(88, arg3.method568((byte) -115));
        } else if (arg0 == 2) {
            this.field3399 = arg3.method588((byte) -36);
        } else if (arg0 == 3) {
            this.field3399 = arg3.method611(false);
            if (this.field3399 == 65535) {
                this.field3399 = -1;
                return;
            }
        } else if (arg0 == 5) {
            this.field3397 = false;
            return;
        } else if (arg0 == 7) {
            this.field3389 = this.method1089(-115, arg3.method568((byte) -106));
        } else if (arg0 != 8 && arg0 == 9) {
            arg3.method611(false);
            return;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I")
    private final int method1089(int arg0, int arg1) {
        field3396++;
        if (arg1 == 16711935) {
            return -1;
        }
        int var3 = -100 / ((arg0 - 27) / 48);
        double var4 = (double) (arg1 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var8 = var6;
        double var10 = var6;
        double var12 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        if (var6 > var12) {
            var8 = var12;
        }
        if (var12 > var6) {
            var10 = var12;
        }
        if (var8 > var4) {
            var8 = var4;
        }
        double var14 = 0.0D;
        double var16 = 0.0D;
        if (var10 < var4) {
            var10 = var4;
        }
        double var18 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var6 == var10) {
                var14 = (var12 - var4) / (-var8 + var10);
            } else if (var10 == var12) {
                var14 = (var4 - var6) / (var10 - var8) + 2.0D;
            } else if (var4 == var10) {
                var14 = (var6 - var12) / (-var8 + var10) + 4.0D;
            }
            if (var18 < 0.5D) {
                var16 = (var10 - var8) / (var8 + var10);
            }
            if (var18 >= 0.5D) {
                var16 = (var10 - var8) / (2.0D - var10 + -var8);
            }
        }
        int var20 = (int) (var16 * 256.0D);
        double var21 = var14 / 6.0D;
        int var23 = (int) (var21 * 256.0D);
        if (var20 < 0) {
            var20 = 0;
        } else if (var20 > 255) {
            var20 = 255;
        }
        int var24 = (int) (var18 * 256.0D);
        if (var24 < 0) {
            var24 = 0;
        } else if (var24 > 255) {
            var24 = 255;
        }
        if (var24 > 243) {
            var20 >>= 0x4;
        } else if (var24 > 217) {
            var20 >>= 0x3;
        } else if (var24 > 192) {
            var20 >>= 0x2;
        } else if (var24 > 179) {
            var20 >>= 0x1;
        }
        return (var20 >> 5 << 7) + ((var23 >> 2 << 10) + (var24 >> 1));
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILka;I)V")
    public final void method1090(int arg0, class97 arg1, int arg2) {
        field3391++;
        if (arg0 != -1) {
            this.method1088(-43, (byte) 89, 3, null);
        }
        while (true) {
            int var4 = arg1.method588((byte) -93);
            if (var4 == 0) {
                return;
            }
            this.method1088(var4, (byte) 84, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
    public static void method1091(int arg0) {
        field3392 = null;
        field3393 = null;
        field3402 = null;
        field3390 = null;
        field3400 = null;
        if (arg0 != -241125918) {
            method1092(null, 41, null, -79);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lud;ILpb;I)V")
    public static final void method1092(class190 arg0, int arg1, class143 arg2, int arg3) {
        byte[] var4 = null;
        class69 var5 = class157.field2806;
        synchronized (class157.field2806) {
            class15 var6 = (class15) class157.field2806.method404(false);
            while (true) {
                if (var6 != null) {
                    if ((long) arg1 != var6.field2393 || var6.field281 != arg2 || var6.field292 != 0) {
                        var6 = (class15) class157.field2806.method414(-119);
                        continue;
                    }
                    var4 = var6.field289;
                }
                if (arg3 >= -93) {
                    method1091(14);
                }
                break;
            }
        }
        field3395++;
        if (var4 == null) {
            byte[] var7 = arg2.method876(-124, arg1);
            arg0.method1213(arg1, var7, arg2, true, (byte) 5);
        } else {
            arg0.method1213(arg1, var4, arg2, true, (byte) 124);
        }
    }
}
