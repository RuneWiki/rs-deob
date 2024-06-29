import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class30 {

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public int field483 = -1;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "[I")
    private int[] field484 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Z")
    public boolean field480 = false;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field474 = 0;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Z")
    public static volatile boolean field478 = false;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "[Lk;")
    public static class183[] field473 = new class183[4];

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "[I")
    public static int[] field482 = new int[2500];

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "Z")
    public static boolean field486 = true;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "[I")
    private int[] field477;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "[S")
    private short[] field472;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "[S")
    private short[] field479;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "[S")
    private short[] field485;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "[S")
    private short[] field488;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static void method240(int arg0) {
        if (arg0 == 0) {
            field482 = null;
            field473 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILf;I)V")
    private final void method241(int arg0, class37 arg1, int arg2) {
        if (arg0 != 20169) {
            this.method245(116);
        }
        if (arg2 == 1) {
            this.field483 = arg1.method333((byte) -59);
        } else if (arg2 == 2) {
            int var4 = arg1.method333((byte) -59);
            this.field477 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field477[var5] = arg1.method293(class76.method605(arg0, 20131));
            }
        } else if (arg2 == 3) {
            this.field480 = true;
        } else if (arg2 == 40) {
            int var8 = arg1.method333((byte) -59);
            this.field488 = new short[var8];
            this.field479 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field479[var9] = (short) arg1.method293(96);
                this.field488[var9] = (short) arg1.method293(-23);
            }
        } else if (arg2 == 41) {
            int var6 = arg1.method333((byte) -59);
            this.field485 = new short[var6];
            this.field472 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field472[var7] = (short) arg1.method293(126);
                this.field485[var7] = (short) arg1.method293(class76.method605(arg0, -20103));
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field484[arg2 - 60] = arg1.method293(arg0 - 20217);
        }
        field475++;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)Lk;")
    public final class183 method242(int arg0) {
        field470++;
        int var2 = -106 % ((23 - arg0) / 62);
        int var3 = 0;
        class183[] var4 = new class183[5];
        for (int var5 = 0; var5 < 5; var5++) {
            if (this.field484[var5] != -1) {
                var4[var3++] = class183.method1225(class207.field3211, this.field484[var5], 0);
            }
        }
        class183 var6 = new class183(var4, var3);
        if (this.field479 != null) {
            for (int var7 = 0; var7 < this.field479.length; var7++) {
                var6.method1200(this.field479[var7], this.field488[var7]);
            }
        }
        if (this.field472 != null) {
            for (int var8 = 0; var8 < this.field472.length; var8++) {
                var6.method1216(this.field472[var8], this.field485[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)Z")
    public final boolean method243(int arg0) {
        boolean var2 = true;
        int var3 = 68 % ((-arg0 - 34) / 39);
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field484[var4] != -1 && !class207.field3211.method1175(0, this.field484[var4], (byte) -35)) {
                var2 = false;
            }
        }
        field471++;
        return var2;
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)Lk;")
    public final class183 method244(int arg0) {
        field481++;
        if (this.field477 == null) {
            return null;
        } else if (arg0 == -10853) {
            class183[] var2 = new class183[this.field477.length];
            for (int var3 = 0; var3 < this.field477.length; var3++) {
                var2[var3] = class183.method1225(class207.field3211, this.field477[var3], 0);
            }
            class183 var4;
            if (var2.length == 1) {
                var4 = var2[0];
            } else {
                var4 = new class183(var2, var2.length);
            }
            if (this.field479 != null) {
                for (int var5 = 0; var5 < this.field479.length; var5++) {
                    var4.method1200(this.field479[var5], this.field488[var5]);
                }
            }
            if (this.field472 != null) {
                for (int var6 = 0; var6 < this.field472.length; var6++) {
                    var4.method1216(this.field472[var6], this.field485[var6]);
                }
            }
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)Z")
    public final boolean method245(int arg0) {
        field487++;
        if (this.field477 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field477.length; var3++) {
            if (!class207.field3211.method1175(0, this.field477[var3], (byte) -35)) {
                var2 = false;
            }
        }
        if (arg0 == 19844) {
            return var2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLf;)V")
    public final void method246(byte arg0, class37 arg1) {
        while (true) {
            int var3 = arg1.method333((byte) -59);
            if (var3 == 0) {
                if (arg0 != -124) {
                    method240(97);
                }
                field476++;
                return;
            }
            this.method241(20169, arg1, var3);
        }
    }
}
