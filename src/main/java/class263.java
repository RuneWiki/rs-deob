import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class263 extends class516 {

    @OriginalMember(owner = "client!iw", name = "E", descriptor = "I")
    private int field3667 = 0;

    @OriginalMember(owner = "client!iw", name = "s", descriptor = "Ldea;")
    private class205 field3655 = new class205(16);

    @OriginalMember(owner = "client!iw", name = "N", descriptor = "I")
    private int field3676 = 0;

    @OriginalMember(owner = "client!iw", name = "K", descriptor = "Ldm;")
    private class46 field3673 = new class46();

    @OriginalMember(owner = "client!iw", name = "V", descriptor = "J")
    private long field3683 = 0L;

    @OriginalMember(owner = "client!iw", name = "J", descriptor = "I")
    private int field3672;

    @OriginalMember(owner = "client!iw", name = "h", descriptor = "Loba;")
    private class219 field3644;

    @OriginalMember(owner = "client!iw", name = "O", descriptor = "Z")
    private boolean field3677;

    @OriginalMember(owner = "client!iw", name = "L", descriptor = "Ldm;")
    private class46 field3674;

    @OriginalMember(owner = "client!iw", name = "r", descriptor = "[B")
    private byte[] field3654;

    @OriginalMember(owner = "client!iw", name = "U", descriptor = "Z")
    private boolean field3682;

    @OriginalMember(owner = "client!iw", name = "D", descriptor = "Lef;")
    private class414 field3666;

    @OriginalMember(owner = "client!iw", name = "C", descriptor = "I")
    private int field3665;

    @OriginalMember(owner = "client!iw", name = "q", descriptor = "Lni;")
    private class444 field3653;

    @OriginalMember(owner = "client!iw", name = "l", descriptor = "Loba;")
    private class219 field3648;

    @OriginalMember(owner = "client!iw", name = "o", descriptor = "I")
    private int field3651;

    @OriginalMember(owner = "client!iw", name = "n", descriptor = "Lgs;")
    private class39 field3650;

    @OriginalMember(owner = "client!iw", name = "M", descriptor = "Lh;")
    public static class571 field3675 = new class571(32);

    @OriginalMember(owner = "client!iw", name = "Q", descriptor = "Lej;")
    public static class104 field3679 = new class104("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!iw", name = "T", descriptor = "Lko;")
    public static class429 field3681 = null;

    @OriginalMember(owner = "client!iw", name = "g", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!iw", name = "i", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!iw", name = "j", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!iw", name = "k", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!iw", name = "p", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!iw", name = "t", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!iw", name = "u", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!iw", name = "v", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!iw", name = "w", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!iw", name = "x", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!iw", name = "y", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!iw", name = "z", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!iw", name = "A", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!iw", name = "B", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!iw", name = "F", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!iw", name = "G", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!iw", name = "H", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!iw", name = "P", descriptor = "Ljj;")
    public static class100 field3678;

    @OriginalMember(owner = "client!iw", name = "m", descriptor = "Lpd;")
    private class215 field3649;

    @OriginalMember(owner = "client!iw", name = "R", descriptor = "Z")
    private boolean field3680;

    @OriginalMember(owner = "client!iw", name = "I", descriptor = "[B")
    private byte[] field3671;

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "(B)V")
    public final void method1716(byte arg0) {
        field3661++;
        if (this.field3674 == null || this.method1732(false) == null) {
            return;
        }
        if (arg0 <= 85) {
            method1727((byte) -47);
        }
        for (class176 var2 = this.field3673.method456((byte) -58); var2 != null; var2 = this.field3673.method460((byte) -123)) {
            int var3 = (int) var2.field2524;
            if (var3 < 0 || this.field3649.field3062 <= var3 || this.field3649.field3051[var3] == 0) {
                var2.method1117(0);
            } else {
                if (this.field3671[var3] == 0) {
                    this.method1720(121, 1, var3);
                }
                if (this.field3671[var3] == -1) {
                    this.method1720(118, 2, var3);
                }
                if (this.field3671[var3] == 1) {
                    var2.method1117(0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)I")
    public final int method1717(int arg0) {
        field3659++;
        if (arg0 == 4) {
            return this.field3649 == null ? 0 : this.field3649.field3068;
        } else {
            return -107;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1718(int arg0, boolean arg1) {
        if (arg0 != 0) {
            return false;
        }
        field3645++;
        boolean var2 = class69.field1165.method1328();
        if (var2 == arg1) {
            return true;
        }
        if (!arg1) {
            class69.field1165.method1267();
        } else if (!class69.field1165.method1338()) {
            arg1 = false;
        }
        if (arg1 == var2) {
            return false;
        } else {
            class491.field6875.field3351 = arg1;
            class491.field6875.method2607((byte) -94, class500.field6968);
            return true;
        }
    }

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "(I)V")
    public final void method1719(int arg0) {
        field3668++;
        if (this.field3644 == null) {
            return;
        }
        this.field3680 = true;
        if (this.field3674 == null) {
            this.field3674 = new class46();
        }
        if (arg0 != 0) {
            this.field3644 = null;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(III)Lgs;")
    private final class39 method1720(int arg0, int arg1, int arg2) {
        field3663++;
        class39 var4 = (class39) this.field3655.method1242(0, (long) arg2);
        if (arg0 <= 108) {
            field3678 = null;
        }
        if (var4 != null && arg1 == 0 && !var4.field791 && var4.field792) {
            var4.method1117(0);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field3644 == null || this.field3671[arg2] == -1) {
                    if (this.field3666.method2492(true)) {
                        return null;
                    }
                    var4 = this.field3666.method2481(true, this.field3672, 7126, (byte) 2, arg2);
                } else {
                    var4 = this.field3653.method2626(this.field3644, arg2, -91);
                }
            } else if (arg1 == 1) {
                if (this.field3644 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3653.method2624(this.field3644, arg2, 85);
            } else if (arg1 == 2) {
                if (this.field3644 == null) {
                    throw new RuntimeException();
                }
                if (this.field3671[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3666.method2478(-21)) {
                    return null;
                }
                var4 = this.field3666.method2481(false, this.field3672, 7126, (byte) 2, arg2);
            } else {
                throw new RuntimeException();
            }
            this.field3655.method1241(var4, (long) arg2, -108);
        }
        if (var4.field792) {
            return null;
        }
        byte[] var5 = var4.method410(14);
        if (!(var4 instanceof class226)) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class621.field8963.reset();
                class621.field8963.update(var5, 0, var5.length - 2);
                int var6 = (int) class621.field8963.getValue();
                if (this.field3649.field3057[arg2] != var6) {
                    throw new RuntimeException();
                }
                if (this.field3649.field3050 != null && this.field3649.field3050[arg2] != null) {
                    byte[] var7 = this.field3649.field3050[arg2];
                    byte[] var8 = class219.method1417(0, var5.length - 2, false, var5);
                    for (int var9 = 0; var9 < 64; var9++) {
                        if (var7[var9] != var8[var9]) {
                            throw new RuntimeException();
                        }
                    }
                }
                this.field3666.field5869 = 0;
                this.field3666.field5870 = 0;
            } catch (RuntimeException var17) {
                this.field3666.method2484(false);
                var4.method1117(0);
                if (var4.field791 && !this.field3666.method2492(true)) {
                    class437 var10 = this.field3666.method2481(true, this.field3672, 7126, (byte) 2, arg2);
                    this.field3655.method1241(var10, (long) arg2, -116);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field3649.field3067[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field3649.field3067[arg2];
            if (this.field3644 != null) {
                this.field3653.method2627(this.field3644, arg2, false, var5);
                if (this.field3671[arg2] != 1) {
                    this.field3667++;
                    this.field3671[arg2] = 1;
                }
            }
            if (!var4.field791) {
                var4.method1117(0);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class621.field8963.reset();
            class621.field8963.update(var5, 0, var5.length - 2);
            int var11 = (int) class621.field8963.getValue();
            if (this.field3649.field3057[arg2] != var11) {
                throw new RuntimeException();
            }
            if (this.field3649.field3050 != null && this.field3649.field3050[arg2] != null) {
                byte[] var12 = this.field3649.field3050[arg2];
                byte[] var13 = class219.method1417(0, var5.length - 2, false, var5);
                for (int var14 = 0; var14 < 64; var14++) {
                    if (var12[var14] != var13[var14]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var15 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field3649.field3067[arg2] & 0xFFFF) != var15) {
                throw new RuntimeException();
            }
            if (this.field3671[arg2] != 1) {
                this.field3667++;
                this.field3671[arg2] = 1;
            }
            if (!var4.field791) {
                var4.method1117(0);
            }
            return var4;
        } catch (Exception var18) {
            this.field3671[arg2] = -1;
            var4.method1117(0);
            if (var4.field791 && !this.field3666.method2492(true)) {
                class437 var16 = this.field3666.method2481(true, this.field3672, 7126, (byte) 2, arg2);
                this.field3655.method1241(var16, (long) arg2, -113);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "(B)V")
    public static final void method1721(byte arg0) {
        field3669++;
        if (arg0 != -27) {
            return;
        }
        for (int var1 = 0; var1 < class80.field1299.length; var1++) {
            for (int var2 = 0; var2 < class80.field1299[0].length; var2++) {
                for (int var3 = 0; var3 < class80.field1299[0][0].length; var3++) {
                    class80.field1299[var1][var2][var3] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(BIIJ)V")
    public static final void method1722(byte arg0, int arg1, int arg2, long arg3) {
        field3662++;
        int var5 = ((int) arg3 & 0x7EFAD) >> 14;
        int var6 = (int) arg3 >> 20 & 0x3;
        int var7 = Integer.MAX_VALUE & (int) (arg3 >>> 32);
        if (arg0 != -81) {
            method1733(true);
        }
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class45.method433(0, arg1, var5, arg2, var6, 96, true, 0, 0);
            return;
        }
        class364 var8 = class18.field227.method1201((byte) -121, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var9 = var8.field4926;
            var10 = var8.field4910;
        } else {
            var9 = var8.field4910;
            var10 = var8.field4926;
        }
        int var11 = var8.field4920;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class45.method433(var9, arg1, 0, arg2, 0, 119, true, var11, var10);
    }

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "(B)V")
    public final void method1723(byte arg0) {
        field3656++;
        if (this.field3674 != null) {
            if (this.method1732(false) == null) {
                return;
            }
            if (this.field3677) {
                boolean var6 = true;
                for (class176 var7 = this.field3674.method456((byte) -87); var7 != null; var7 = this.field3674.method460((byte) 92)) {
                    int var9 = (int) var7.field2524;
                    if (this.field3671[var9] == 0) {
                        this.method1720(arg0 ^ 0xFFFFFF85, 1, var9);
                    }
                    if (this.field3671[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method1117(0);
                    }
                }
                while (this.field3649.field3051.length > this.field3676) {
                    if (this.field3649.field3051[this.field3676] == 0) {
                        this.field3676++;
                    } else {
                        if (this.field3653.field6321 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field3671[this.field3676] == 0) {
                            this.method1720(124, 1, this.field3676);
                        }
                        if (this.field3671[this.field3676] == 0) {
                            class176 var8 = new class176();
                            var8.field2524 = this.field3676;
                            this.field3674.method463(var8, -102);
                            var6 = false;
                        }
                        this.field3676++;
                    }
                }
                if (var6) {
                    this.field3676 = 0;
                    this.field3677 = false;
                }
            } else if (this.field3680) {
                boolean var2 = true;
                for (class176 var3 = this.field3674.method456((byte) -45); var3 != null; var3 = this.field3674.method460((byte) -113)) {
                    int var5 = (int) var3.field2524;
                    if (this.field3671[var5] != 1) {
                        this.method1720(118, 2, var5);
                    }
                    if (this.field3671[var5] == 1) {
                        var3.method1117(0);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field3676 < this.field3649.field3051.length) {
                    if (this.field3649.field3051[this.field3676] == 0) {
                        this.field3676++;
                    } else {
                        if (this.field3666.method2478(-21)) {
                            var2 = false;
                            break;
                        }
                        if (this.field3671[this.field3676] != 1) {
                            this.method1720(123, 2, this.field3676);
                        }
                        if (this.field3671[this.field3676] != 1) {
                            class176 var4 = new class176();
                            var4.field2524 = this.field3676;
                            this.field3674.method463(var4, -106);
                            var2 = false;
                        }
                        this.field3676++;
                    }
                }
                if (var2) {
                    this.field3676 = 0;
                    this.field3680 = false;
                }
            } else {
                this.field3674 = null;
            }
        }
        if (arg0 != -1) {
            this.field3671 = null;
        }
        if (!this.field3682 || this.field3683 > class488.method2835(30160)) {
            return;
        }
        for (class39 var10 = (class39) this.field3655.method1248(arg0); var10 != null; var10 = (class39) this.field3655.method1245((byte) 95)) {
            if (!var10.field792) {
                if (var10.field794) {
                    if (!var10.field791) {
                        throw new RuntimeException();
                    }
                    var10.method1117(0);
                } else {
                    var10.field794 = true;
                }
            }
        }
        this.field3683 = class488.method2835(arg0 + 30161) + 1000L;
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(II)V")
    public final void method1724(int arg0, int arg1) {
        field3643++;
        if (this.field3644 == null || arg0 != 3) {
            return;
        }
        for (class176 var3 = this.field3673.method456((byte) -97); var3 != null; var3 = this.field3673.method460((byte) -86)) {
            if (((long) arg1) == var3.field2524) {
                return;
            }
        }
        class176 var4 = new class176();
        var4.field2524 = arg1;
        this.field3673.method463(var4, arg0 ^ 0xFFFFFF91);
    }

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "(I)I")
    public final int method1725(int arg0) {
        int var2 = -10 % ((arg0 + 30) / 51);
        field3657++;
        return this.field3667;
    }

    @OriginalMember(owner = "client!iw", name = "f", descriptor = "(B)I")
    public final int method1726(byte arg0) {
        field3664++;
        if (this.field3649 == null) {
            return 0;
        } else if (this.field3677) {
            class176 var2 = this.field3674.method456((byte) -49);
            if (arg0 <= 115) {
                this.field3667 = 2;
            }
            return var2 == null ? 0 : (int) var2.field2524;
        } else {
            return this.field3649.field3068;
        }
    }

    @OriginalMember(owner = "client!iw", name = "g", descriptor = "(B)V")
    public static void method1727(byte arg0) {
        if (arg0 >= 35) {
            field3675 = null;
            field3678 = null;
            field3679 = null;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(BI)I")
    public final int method1728(byte arg0, int arg1) {
        int var3 = -54 % ((-arg0 - 26) / 59);
        field3647++;
        class39 var4 = (class39) this.field3655.method1242(0, (long) arg1);
        return var4 == null ? 0 : var4.method411(102);
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(Z)I")
    public final int method1729(boolean arg0) {
        if (!arg0) {
            return -65;
        }
        field3660++;
        if (this.method1732(false) == null) {
            return this.field3650 == null ? 0 : this.field3650.method411(102);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(II)[B")
    public final byte[] method1730(int arg0, int arg1) {
        field3652++;
        class39 var3 = this.method1720(122, arg1, arg0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method410(14);
            var3.method1117(arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "([I[JZ)V")
    public static final void method1731(int[] arg0, long[] arg1, boolean arg2) {
        class107.method759(arg1, arg1.length - 1, 0, 12, arg0);
        if (arg2) {
            field3670++;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Z)Lpd;")
    public final class215 method1732(boolean arg0) {
        field3646++;
        if (this.field3649 != null) {
            return this.field3649;
        }
        if (this.field3650 == null) {
            if (this.field3666.method2492(true)) {
                return null;
            }
            this.field3650 = this.field3666.method2481(true, 255, 7126, (byte) 0, this.field3672);
        }
        if (this.field3650.field792) {
            return null;
        }
        if (arg0) {
            this.method1719(-94);
        }
        byte[] var2 = this.field3650.method410(14);
        if (this.field3650 instanceof class226) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3649 = new class215(var2, this.field3665, this.field3654);
                if (this.field3649.field3049 != this.field3651) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field3649 = null;
                if (this.field3666.method2492(true)) {
                    this.field3650 = null;
                } else {
                    this.field3650 = this.field3666.method2481(true, 255, 7126, (byte) 0, this.field3672);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3649 = new class215(var2, this.field3665, this.field3654);
            } catch (RuntimeException var4) {
                this.field3666.method2484(arg0);
                this.field3649 = null;
                if (this.field3666.method2492(true)) {
                    this.field3650 = null;
                } else {
                    this.field3650 = this.field3666.method2481(true, 255, 7126, (byte) 0, this.field3672);
                }
                return null;
            }
            if (this.field3648 != null) {
                this.field3653.method2627(this.field3648, this.field3672, arg0, var2);
            }
        }
        if (this.field3644 != null) {
            this.field3671 = new byte[this.field3649.field3062];
            this.field3667 = 0;
        }
        this.field3650 = null;
        return this.field3649;
    }

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "(Z)V")
    public static final void method1733(boolean arg0) {
        field3658++;
        if (class283.field3913) {
            class62.field1079 = null;
            class175.field2512 = null;
            class283.field3913 = arg0;
        }
    }

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(ILoba;Loba;Lef;Lni;I[BIZ)V")
    public class263(int arg0, class219 arg1, class219 arg2, class414 arg3, class444 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field3672 = arg0;
        this.field3644 = arg1;
        if (this.field3644 == null) {
            this.field3677 = false;
        } else {
            this.field3677 = true;
            this.field3674 = new class46();
        }
        this.field3654 = arg6;
        this.field3682 = arg8;
        this.field3666 = arg3;
        this.field3665 = arg5;
        this.field3653 = arg4;
        this.field3648 = arg2;
        this.field3651 = arg7;
        if (this.field3648 != null) {
            this.field3650 = this.field3653.method2626(this.field3648, this.field3672, -117);
        }
    }
}
