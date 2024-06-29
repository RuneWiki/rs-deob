import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class487 {

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Lss;")
    public static class213 field7381 = new class213(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "[I")
    public static int[] field7387 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "Lbi;")
    public static class104 field7385 = new class104(41, 6);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public int field7375;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    private int field7376;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field7377;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field7378;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field7379;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field7380;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field7382;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field7383;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field7388;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "[I")
    public static int[] field7384;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "[I")
    public static int[] field7386;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)I")
    public final int method2986(byte arg0) {
        field7378++;
        int var2 = -31 / ((-arg0 - 54) / 50);
        return this.field7375 & 0x3FFF;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
    public static void method2987(boolean arg0) {
        field7384 = null;
        field7387 = null;
        field7386 = null;
        field7385 = null;
        field7381 = null;
        if (!arg0) {
            field7385 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method2988(String arg0, int arg1) {
        field7383++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class358.field5566; var2++) {
            if (arg0.equalsIgnoreCase(class449.field6965[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class326.field5127[var2])) {
                return true;
            }
        }
        if (arg1 != -44) {
            method2987(false);
        }
        return false;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILjava/lang/String;Z)I")
    public static final int method2989(int arg0, int arg1, String arg2, boolean arg3) {
        if (arg1 != -13547) {
            return 69;
        }
        field7377++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var11 >= arg0) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if (var10 / arg0 != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var10;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public final void method2990(int arg0) {
        if (arg0 == -1) {
            field7379++;
            this.field7375 &= 0x3FFF;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIII)Z")
    public final boolean method2991(int arg0, int arg1, int arg2, int arg3) {
        field7388++;
        int var5 = this.field7376;
        if (this.field7375 == arg1 && this.field7376 == 0) {
            return false;
        }
        if (arg2 != 2) {
            this.method2990(27);
        }
        boolean var6;
        if (this.field7376 == 0) {
            if (arg1 > this.field7375 && arg1 <= (this.field7375 + arg3) || arg1 < this.field7375 && arg1 >= (this.field7375 - arg3)) {
                this.field7375 = arg1;
                return false;
            }
            var6 = true;
        } else if (this.field7376 > 0 && arg1 > this.field7375) {
            int var7 = this.field7376 * this.field7376 / (arg3 * 2);
            int var8 = this.field7375 + var7;
            if (arg1 > var8 && this.field7375 <= var8) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field7376 < 0 && this.field7375 > arg1) {
            int var9 = this.field7376 * this.field7376 / (arg3 * 2);
            int var10 = this.field7375 - var9;
            if (arg1 < var10 && this.field7375 >= var10) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (arg1 > this.field7375) {
                this.field7376 += arg3;
                if (arg0 != 0 && arg0 < this.field7376) {
                    this.field7376 = arg0;
                }
            } else {
                this.field7376 -= arg3;
                if (arg0 != 0 && this.field7376 < -arg0) {
                    this.field7376 = -arg0;
                }
            }
            if (this.field7376 != var5) {
                int var11 = this.field7376 * this.field7376 / (arg3 * 2);
                if (arg1 > this.field7375) {
                    if (arg1 < this.field7375 + var11) {
                        this.field7376 = var5;
                    }
                } else if (this.field7375 > arg1 && arg1 > this.field7375 - var11) {
                    this.field7376 = var5;
                }
            }
        } else if (this.field7376 <= 0) {
            this.field7376 += arg3;
            if (this.field7376 > 0) {
                this.field7376 = 0;
            }
        } else {
            this.field7376 -= arg3;
            if (this.field7376 < 0) {
                this.field7376 = 0;
            }
        }
        this.field7375 += this.field7376 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V")
    public final void method2992(int arg0, int arg1) {
        this.field7375 = arg1;
        this.field7376 = arg0;
        field7382++;
    }
}
