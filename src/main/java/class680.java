import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class680 {

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Lak;")
    private class498 field9655 = new class498();

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "Lak;")
    private class498 field9671 = new class498();

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "Lak;")
    private class498 field9675 = new class498();

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "Lak;")
    private class498 field9677 = new class498();

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "Lsl;")
    private class479 field9681 = new class479(4);

    @OriginalMember(owner = "client!oh", name = "E", descriptor = "B")
    private byte field9683 = 0;

    @OriginalMember(owner = "client!oh", name = "G", descriptor = "I")
    public volatile int field9685 = 0;

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "I")
    public volatile int field9682 = 0;

    @OriginalMember(owner = "client!oh", name = "F", descriptor = "Lsl;")
    private class479 field9684 = new class479(8);

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "F")
    public static float field9668 = 0.0F;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field9669 = 7000;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field9660 = field9669;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
    public static int field9676 = 0;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "Lsm;")
    public static class387 field9667 = new class387("", 16);

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "F")
    public static float field9656;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field9654;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field9657;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field9658;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field9659;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field9661;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field9662;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field9663;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public static int field9664;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public static int field9665;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field9666;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public static int field9670;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public static int field9672;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
    public static int field9673;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    public static int field9674;

    @OriginalMember(owner = "client!oh", name = "B", descriptor = "I")
    private int field9680;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "J")
    private long field9678;

    @OriginalMember(owner = "client!oh", name = "H", descriptor = "Lwl;")
    private class184 field9686;

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "Lsda;")
    private class748 field9679;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "[[Lal;")
    public static class123[][] field9653;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lsda;ZI)V")
    public final void method3862(class748 arg0, boolean arg1, int arg2) {
        field9661++;
        if (this.field9679 != null) {
            try {
                this.field9679.method4168(1);
            } catch (Exception var9) {
            }
            this.field9679 = null;
        }
        this.field9679 = arg0;
        this.method3874((byte) -55);
        int var4 = -35 / ((7 - arg2) / 32);
        this.method3870(arg1, (byte) -118);
        this.field9684.field6864 = 0;
        this.field9686 = null;
        while (true) {
            class184 var5 = (class184) this.field9671.method3030(-55);
            if (var5 == null) {
                while (true) {
                    class184 var6 = (class184) this.field9677.method3030(99);
                    if (var6 == null) {
                        if (this.field9683 != 0) {
                            try {
                                this.field9681.field6864 = 0;
                                this.field9681.method2881(4, (byte) 119);
                                this.field9681.method2881(this.field9683, (byte) 112);
                                this.field9681.method2862(0, -1166933656);
                                this.field9679.method4167(4, 0, 0, this.field9681.field6800);
                            } catch (IOException var8) {
                                try {
                                    this.field9679.method4168(1);
                                } catch (Exception var7) {
                                }
                                this.field9685++;
                                this.field9682 = -2;
                                this.field9679 = null;
                            }
                        }
                        this.field9680 = 0;
                        this.field9678 = class465.method2818(255);
                        return;
                    }
                    this.field9675.method3029(0, var6);
                }
            }
            this.field9655.method3029(0, var5);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)I")
    private final int method3863(int arg0) {
        field9672++;
        return arg0 >= -26 ? -58 : this.field9675.method3024((byte) 112) + this.field9677.method3024((byte) 106);
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
    public final void method3864(int arg0) {
        field9666++;
        try {
            this.field9679.method4168(1);
        } catch (Exception var3) {
        }
        this.field9679 = null;
        this.field9682 = -1;
        this.field9683 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field9685++;
        int var2 = -6 % ((arg0 + 12) / 37);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)Z")
    public final boolean method3865(byte arg0) {
        if (arg0 > -68) {
            return true;
        }
        if (this.field9679 != null) {
            long var2 = class465.method2818(255);
            int var4 = (int) (var2 - this.field9678);
            this.field9678 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field9680 += var4;
            if (this.field9680 > 30000) {
                try {
                    this.field9679.method4168(1);
                } catch (Exception var27) {
                }
                this.field9679 = null;
            }
        }
        field9663++;
        if (this.field9679 == null) {
            return this.method3872((byte) -23) == 0 && this.method3863(-56) == 0;
        }
        try {
            this.field9679.method4169((byte) -109);
            for (class184 var5 = (class184) this.field9655.method3025(false); var5 != null; var5 = (class184) this.field9655.method3026(true)) {
                this.field9681.field6864 = 0;
                this.field9681.method2881(1, (byte) 123);
                this.field9681.method2909(55, (int) var5.field5602);
                this.field9679.method4167(4, 0, 0, this.field9681.field6800);
                this.field9671.method3029(0, var5);
            }
            for (class184 var6 = (class184) this.field9675.method3025(false); var6 != null; var6 = (class184) this.field9675.method3026(true)) {
                this.field9681.field6864 = 0;
                this.field9681.method2881(0, (byte) 119);
                this.field9681.method2909(62, (int) var6.field5602);
                this.field9679.method4167(4, 0, 0, this.field9681.field6800);
                this.field9677.method3029(0, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field9679.method4166(75);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field9680 = 0;
                byte var9 = 0;
                if (this.field9686 == null) {
                    var9 = 8;
                } else if (this.field9686.field2541 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field9684.field6864;
                    if (var8 < var10) {
                        var10 = var8;
                    }
                    this.field9679.method4165(this.field9684.field6800, var10, -41, this.field9684.field6864);
                    if (this.field9683 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field9684.field6800[this.field9684.field6864 + var11] = (byte) class639.method3689(this.field9684.field6800[this.field9684.field6864 + var11], this.field9683);
                        }
                    }
                    this.field9684.field6864 += var10;
                    if (var9 <= this.field9684.field6864) {
                        if (this.field9686 == null) {
                            this.field9684.field6864 = 0;
                            int var12 = this.field9684.method2886(true);
                            int var13 = this.field9684.method2882(-1);
                            int var14 = this.field9684.method2886(true);
                            int var15 = this.field9684.method2868(-125);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class184 var21;
                            if (var17) {
                                for (var21 = (class184) this.field9677.method3025(false); var21 != null && var21.field5602 != var18; var21 = (class184) this.field9677.method3026(true)) {
                                }
                            } else {
                                for (var21 = (class184) this.field9671.method3025(false); var21 != null && var21.field5602 != var18; var21 = (class184) this.field9671.method3026(true)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field9686 = var21;
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field9686.field2544 = new class479(var15 + var22 + this.field9686.field2538);
                            this.field9686.field2544.method2881(var16, (byte) 121);
                            this.field9686.field2544.method2926((byte) -128, var15);
                            this.field9684.field6864 = 0;
                            this.field9686.field2541 = 8;
                        } else if (this.field9686.field2541 != 0) {
                            throw new IOException();
                        } else if (this.field9684.field6800[0] == -1) {
                            this.field9684.field6864 = 0;
                            this.field9686.field2541 = 1;
                        } else {
                            this.field9686 = null;
                        }
                    }
                } else {
                    int var23 = this.field9686.field2544.field6800.length - this.field9686.field2538;
                    int var24 = 512 - this.field9686.field2541;
                    if (var23 - this.field9686.field2544.field6864 < var24) {
                        var24 = var23 - this.field9686.field2544.field6864;
                    }
                    if (var8 < var24) {
                        var24 = var8;
                    }
                    this.field9679.method4165(this.field9686.field2544.field6800, var24, -33, this.field9686.field2544.field6864);
                    if (this.field9683 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field9686.field2544.field6800[this.field9686.field2544.field6864 + var25] = (byte) class639.method3689(this.field9686.field2544.field6800[this.field9686.field2544.field6864 + var25], this.field9683);
                        }
                    }
                    this.field9686.field2544.field6864 += var24;
                    this.field9686.field2541 += var24;
                    if (this.field9686.field2544.field6864 == var23) {
                        this.field9686.method2381(15735);
                        this.field9686.field9450 = false;
                        this.field9686 = null;
                    } else if (this.field9686.field2541 == 512) {
                        this.field9686.field2541 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field9679.method4168(1);
            } catch (Exception var26) {
            }
            this.field9679 = null;
            this.field9682 = -2;
            this.field9685++;
            return this.method3872((byte) -63) == 0 && this.method3863(-122) == 0;
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)Z")
    public final boolean method3866(int arg0) {
        field9657++;
        if (arg0 != 0) {
            this.method3863(-36);
        }
        return this.method3863(arg0 - 109) >= 20;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)V")
    public static void method3867(byte arg0) {
        if (arg0 <= -107) {
            field9653 = null;
            field9667 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)V")
    public final void method3868(int arg0) {
        field9673++;
        if (this.field9679 == null) {
            return;
        }
        try {
            this.field9681.field6864 = 0;
            this.field9681.method2881(7, (byte) 117);
            this.field9681.method2909(107, 0);
            this.field9679.method4167(4, 0, 0, this.field9681.field6800);
        } catch (IOException var4) {
            try {
                this.field9679.method4168(1);
            } catch (Exception var3) {
            }
            this.field9685++;
            this.field9682 = -2;
            this.field9679 = null;
        }
        int var2 = -25 % ((arg0 - 7) / 54);
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)V")
    public final void method3869(int arg0) {
        field9664++;
        if (arg0 >= 30 && this.field9679 != null) {
            this.field9679.method4168(1);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZB)V")
    public final void method3870(boolean arg0, byte arg1) {
        field9659++;
        if (this.field9679 == null) {
            return;
        }
        if (arg1 >= -117) {
            this.field9682 = 94;
        }
        try {
            this.field9681.field6864 = 0;
            this.field9681.method2881(arg0 ? 2 : 3, (byte) 114);
            this.field9681.method2909(81, 0);
            this.field9679.method4167(4, 0, 0, this.field9681.field6800);
        } catch (IOException var4) {
            try {
                this.field9679.method4168(1);
            } catch (Exception var3) {
            }
            this.field9679 = null;
            this.field9685++;
            this.field9682 = -2;
        }
    }

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "(I)Z")
    public final boolean method3871(int arg0) {
        if (arg0 > -33) {
            this.method3862(null, false, -99);
        }
        field9662++;
        return this.method3872((byte) -118) >= 20;
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)I")
    public final int method3872(byte arg0) {
        field9654++;
        if (arg0 > -16) {
            field9660 = 28;
        }
        return this.field9655.method3024((byte) 106) + this.field9671.method3024((byte) 116);
    }

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "(I)J")
    public static final long method3873(int arg0) {
        int var1 = -22 / ((arg0 - 62) / 59);
        field9658++;
        return class169.field2396.method1459(-1045);
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(B)V")
    private final void method3874(byte arg0) {
        field9665++;
        if (arg0 != -55 || this.field9679 == null) {
            return;
        }
        try {
            this.field9681.field6864 = 0;
            this.field9681.method2881(6, (byte) 112);
            this.field9681.method2909(92, 3);
            this.field9679.method4167(4, 0, 0, this.field9681.field6800);
        } catch (IOException var3) {
            try {
                this.field9679.method4168(arg0 ^ 0xFFFFFFC8);
            } catch (Exception var2) {
            }
            this.field9685++;
            this.field9682 = -2;
            this.field9679 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BIZII)Lwl;")
    public final class184 method3875(byte arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field9670++;
        long var6 = (long) ((arg1 << 16) + arg3);
        if (arg4 != 20) {
            return null;
        }
        class184 var8 = new class184();
        var8.field5602 = var6;
        var8.field9445 = arg2;
        var8.field2538 = arg0;
        if (arg2) {
            if (this.method3872((byte) -39) >= 20) {
                throw new RuntimeException();
            }
            this.field9655.method3029(0, var8);
        } else if (this.method3863(-53) < 20) {
            this.field9675.method3029(arg4 ^ 0x14, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "(I)V")
    public final void method3876(int arg0) {
        field9674++;
        int var2 = 27 / ((-arg0 - 51) / 42);
        if (this.field9679 != null) {
            this.field9679.method4170((byte) 40);
        }
    }
}
