import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class191 extends class77 {

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "I")
    private int field3558 = 128;

    @OriginalMember(owner = "client!rf", name = "K", descriptor = "I")
    private int field3557 = 0;

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "I")
    public int field3559 = -1;

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "I")
    private int field3560 = 0;

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "Z")
    public boolean field3554 = false;

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "I")
    private int field3567 = 0;

    @OriginalMember(owner = "client!rf", name = "eb", descriptor = "I")
    private int field3576 = 128;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "Ldc;")
    private static class37 field3561 = class185.method1233((byte) 86, "Please enter your username)3");

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "Ldc;")
    public static class37 field3556 = field3561;

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "Ldc;")
    public static class37 field3563 = class185.method1233((byte) 86, "Ung-Ultige Session)2ID)3");

    @OriginalMember(owner = "client!rf", name = "Z", descriptor = "I")
    public static int field3571 = 0;

    @OriginalMember(owner = "client!rf", name = "ab", descriptor = "[S")
    public static short[] field3572 = new short[256];

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "Lsg;")
    public static class203 field3566 = new class203();

    @OriginalMember(owner = "client!rf", name = "fb", descriptor = "I")
    public static int field3577 = 0;

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "I")
    public int field3551;

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "I")
    private int field3562;

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!rf", name = "bb", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!rf", name = "cb", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!rf", name = "db", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "Ldj;")
    public static class44 field3569;

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "[S")
    private short[] field3550;

    @OriginalMember(owner = "client!rf", name = "F", descriptor = "[S")
    private short[] field3552;

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "[S")
    private short[] field3568;

    @OriginalMember(owner = "client!rf", name = "Y", descriptor = "[S")
    private short[] field3570;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLce;)V")
    public final void method1270(byte arg0, class28 arg1) {
        while (true) {
            int var3 = arg1.method215(-1797813752);
            if (var3 == 0) {
                field3574++;
                if (arg0 <= 5) {
                    field3556 = null;
                    return;
                }
                return;
            }
            this.method1275(arg1, var3, 114);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)La;")
    public final class1 method1271(int arg0, byte arg1) {
        field3573++;
        class1 var3 = (class1) class83.field1468.method1180((long) this.field3551, (byte) 122);
        if (var3 == null) {
            class126 var4 = class126.method883(class176.field3327, this.field3562, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field3568 != null) {
                for (int var5 = 0; var5 < this.field3568.length; var5++) {
                    var4.method888(this.field3568[var5], this.field3552[var5]);
                }
            }
            if (this.field3550 != null) {
                for (int var6 = 0; var6 < this.field3550.length; var6++) {
                    var4.method866(this.field3550[var6], this.field3570[var6]);
                }
            }
            var3 = var4.method887(this.field3557 + 64, 850 - -this.field3560, -30, -50, -30);
            class83.field1468.method1179(arg1 ^ 0x5F, (long) this.field3551, var3);
        }
        class1 var7;
        if (this.field3559 == -1 || arg0 == -1) {
            var7 = var3.method6(true, true);
        } else {
            var7 = class16.method113(this.field3559, (byte) 122).method1375(var3, arg0, true);
        }
        if (this.field3558 != 128 || this.field3576 != 128) {
            var7.method2(this.field3558, this.field3576, this.field3558);
        }
        if (this.field3567 != 0) {
            if (this.field3567 == 90) {
                var7.method10();
            }
            if (this.field3567 == 180) {
                var7.method7();
            }
            if (this.field3567 == 270) {
                var7.method8();
            }
        }
        if (arg1 != 95) {
            method1272((byte) -106, 63, -12);
        }
        return var7;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BII)I")
    public static final int method1272(byte arg0, int arg1, int arg2) {
        class117 var3 = (class117) class41.field831.method1047((byte) -53, (long) arg1);
        field3555++;
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            int var5 = 116 % ((arg0 + 34) / 46);
            for (int var6 = 0; var6 < var3.field2095.length; var6++) {
                if (var3.field2104[var6] == arg2) {
                    var4 += var3.field2095[var6];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)Lqh;")
    public static final class182 method1273(int arg0) {
        field3553++;
        int var1 = class238.field4336[0] * class174.field3308[0];
        byte[] var2 = class217.field4040[0];
        int[] var3 = new int[var1];
        int var4 = 0;
        if (arg0 > -79) {
            field3569 = null;
        }
        while (var1 > var4) {
            var3[var4] = class5.field42[class58.method449(255, var2[var4])];
            var4++;
        }
        class182 var5 = new class182(class67.field1207, class160.field3030, class166.field3162[0], class7.field77[0], class174.field3308[0], class238.field4336[0], var3);
        class97.method644(true);
        return var5;
    }

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "(I)V")
    public static void method1274(int arg0) {
        field3561 = null;
        field3569 = null;
        field3563 = null;
        if (arg0 != 0) {
            method1273(38);
        }
        field3566 = null;
        field3572 = null;
        field3556 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lce;II)V")
    private final void method1275(class28 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3562 = arg0.method230((byte) -123);
        } else if (arg1 == 2) {
            this.field3559 = arg0.method230((byte) -99);
        } else if (arg1 == 4) {
            this.field3558 = arg0.method230((byte) -102);
        } else if (arg1 == 5) {
            this.field3576 = arg0.method230((byte) -120);
        } else if (arg1 == 6) {
            this.field3567 = arg0.method230((byte) -105);
        } else if (arg1 == 7) {
            this.field3557 = arg0.method215(-1797813752);
        } else if (arg1 == 8) {
            this.field3560 = arg0.method215(-1797813752);
        } else if (arg1 == 9) {
            this.field3554 = true;
        } else if (arg1 == 40) {
            int var6 = arg0.method215(-1797813752);
            this.field3568 = new short[var6];
            this.field3552 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3568[var7] = (short) arg0.method230((byte) -124);
                this.field3552[var7] = (short) arg0.method230((byte) -119);
            }
        } else if (arg1 == 41) {
            int var4 = arg0.method215(-1797813752);
            this.field3550 = new short[var4];
            this.field3570 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3550[var5] = (short) arg0.method230((byte) -120);
                this.field3570[var5] = (short) arg0.method230((byte) -123);
            }
        }
        field3564++;
        if (arg2 <= 98) {
            this.field3554 = true;
        }
    }
}
