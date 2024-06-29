import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class299 {

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public int field3989 = 16777215;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public int field3994 = 8;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field3985 = 0;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "[Lbg;")
    public static class242[] field3998 = new class242[2048];

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public int field3986;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public int field3992;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public int field3993;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public int field3997;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public int field3999;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Z")
    public boolean field3987;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "[[[Lsq;")
    public static class316[][][] field4000;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static final void method1897(int arg0) {
        field3988++;
        int var1 = -101 % ((-arg0 - 67) / 51);
        class33.field369.method2290(13831);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lbg;II)V")
    public final void method1898(class242 arg0, int arg1, int arg2) {
        field3984++;
        while (true) {
            int var4 = arg0.method1563(-128);
            if (var4 == 0) {
                if (arg1 == -1) {
                    return;
                } else {
                    this.field3993 = -90;
                    return;
                }
            }
            this.method1902(var4, arg2, -4, arg0);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(CB)Z")
    public static final boolean method1899(char arg0, byte arg1) {
        field3996++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class277.method1742((byte) -66, arg0)) {
            return true;
        } else {
            if (arg1 != -59) {
                method1899((char) 65507, (byte) -35);
            }
            char[] var2 = class361.field4890;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class326.field4349;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lki;B)I")
    public static final int method1900(class204 arg0, byte arg1) {
        field3991++;
        if (arg0.field2421 == 0) {
            return 0;
        }
        if (arg0.field2399 != -1 && arg0.field2399 < 32768) {
            class298 var2 = class220.field2726[arg0.field2399];
            if (var2 != null) {
                int var3 = arg0.field1516 - var2.field1516;
                int var4 = arg0.field1514 - var2.field1514;
                if (var3 != 0 || var4 != 0) {
                    arg0.method1251((byte) -107, (int) (Math.atan2((double) var3, (double) var4) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if (arg0.field2399 >= 32768) {
            int var5 = arg0.field2399 - 32768;
            if (class429.field5865 == var5) {
                var5 = 2047;
            }
            class131 var6 = class212.field2584[var5];
            if (var6 != null) {
                int var7 = arg0.field1516 - var6.field1516;
                int var8 = arg0.field1514 - var6.field1514;
                if (var7 != 0 || var8 != 0) {
                    arg0.method1251((byte) 89, (int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if (arg1 != 107) {
            field3985 = 58;
        }
        if ((arg0.field2436 != 0 || arg0.field2389 != 0) && (arg0.field2486 == 0 || arg0.field2474 > 0)) {
            int var9 = arg0.field1516 - ((arg0.field2436 - class278.field3608 - class278.field3608) * 64);
            int var10 = arg0.field1514 - ((arg0.field2389 - class129.field1432 - class129.field1432) * 64);
            if (var9 != 0 || var10 != 0) {
                arg0.method1251((byte) -71, (int) (Math.atan2((double) var9, (double) var10) * 2607.5945876176133D) & 0x3FFF);
            }
            arg0.field2389 = 0;
            arg0.field2436 = 0;
        }
        return arg0.method1249((byte) 76);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public static void method1901(byte arg0) {
        field4000 = null;
        field3998 = null;
        if (arg0 >= -105) {
            field3985 = -123;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIILbg;)V")
    private final void method1902(int arg0, int arg1, int arg2, class242 arg3) {
        if (arg0 == 1) {
            this.field3994 = arg3.method1587((byte) -102);
        } else if (arg0 == 2) {
            this.field3987 = true;
        } else if (arg0 == 3) {
            this.field3999 = arg3.method1582(false);
            this.field3986 = arg3.method1582(false);
            this.field3997 = arg3.method1582(false);
        } else if (arg0 == 4) {
            this.field3993 = arg3.method1563(arg2 ^ 0x7C);
        } else if (arg0 == 5) {
            this.field3992 = arg3.method1587((byte) -102);
        } else if (arg0 == 6) {
            this.field3989 = arg3.method1545(arg2 + 12);
        }
        if (arg2 == -4) {
            field3995++;
        }
    }

    static {
        new class72("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
    }
}
