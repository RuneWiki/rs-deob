import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class558 {

    @OriginalMember(owner = "client!po", name = "k", descriptor = "I")
    public int field7722 = 0;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    public int field7717 = 0;

    @OriginalMember(owner = "client!po", name = "v", descriptor = "Z")
    private boolean field7733 = false;

    @OriginalMember(owner = "client!po", name = "s", descriptor = "Lmu;")
    public static class303 field7730 = new class303(57, 10);

    @OriginalMember(owner = "client!po", name = "u", descriptor = "Lad;")
    public static class426 field7732 = new class426(7, 2);

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    public static int field7712;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public static int field7713;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public int field7714;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public int field7715;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "I")
    public int field7716;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "I")
    public static int field7718;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "I")
    public int field7719;

    @OriginalMember(owner = "client!po", name = "i", descriptor = "I")
    public static int field7720;

    @OriginalMember(owner = "client!po", name = "j", descriptor = "I")
    public int field7721;

    @OriginalMember(owner = "client!po", name = "l", descriptor = "I")
    public int field7723;

    @OriginalMember(owner = "client!po", name = "m", descriptor = "I")
    public int field7724;

    @OriginalMember(owner = "client!po", name = "n", descriptor = "I")
    public static int field7725;

    @OriginalMember(owner = "client!po", name = "p", descriptor = "I")
    private int field7727;

    @OriginalMember(owner = "client!po", name = "q", descriptor = "I")
    public int field7728;

    @OriginalMember(owner = "client!po", name = "r", descriptor = "I")
    public int field7729;

    @OriginalMember(owner = "client!po", name = "o", descriptor = "J")
    public long field7726;

    @OriginalMember(owner = "client!po", name = "w", descriptor = "Lmi;")
    public static class496 field7734;

    @OriginalMember(owner = "client!po", name = "t", descriptor = "Lin;")
    public static class91 field7731;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ZZILjava/lang/String;)Z", line = 4)
    public static final boolean method3204(boolean arg0, boolean arg1, int arg2, String arg3) {
        field7718++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        if (!arg0) {
            field7731 = null;
        }
        int var7 = arg3.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
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
                return false;
            }
            if (var11 >= arg2) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if ((var10 / arg2) != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        return var5;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "([SI[Ljava/lang/String;)V", line = 78)
    public static final void method3205(short[] arg0, int arg1, String[] arg2) {
        if (arg1 != 26073) {
            field7734 = null;
        }
        field7720++;
        class472.method2780(arg2.length - 1, arg2, arg0, 0, false);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(B)V", line = 90)
    public static void method3206(byte arg0) {
        field7732 = null;
        if (arg0 != -110) {
            method3205(null, -51, null);
        }
        field7730 = null;
        field7734 = null;
        field7731 = null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lcea;IB)V", line = 103)
    private final void method3207(class215 arg0, int arg1, byte arg2) {
        field7712++;
        if (arg1 == 1) {
            this.field7727 = arg0.method1478(842397944);
        } else if (arg1 == 2) {
            arg0.method1535(255);
        } else if (arg1 == 3) {
            this.field7716 = arg0.method1533((byte) -126);
            this.field7715 = arg0.method1533((byte) -126);
            this.field7719 = arg0.method1533((byte) -126);
        } else if (arg1 == 4) {
            this.field7714 = arg0.method1535(255);
            this.field7729 = arg0.method1533((byte) -126);
        } else if (arg1 == 6) {
            this.field7721 = arg0.method1535(255);
        } else if (arg1 == 8) {
            this.field7722 = 1;
        } else if (arg1 == 9) {
            this.field7717 = 1;
        } else if (arg1 == 10) {
            this.field7733 = true;
        }
        if (arg2 >= -124) {
            this.field7726 = 65L;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ILcea;)V", line = 175)
    public final void method3208(int arg0, class215 arg1) {
        while (true) {
            int var3 = arg1.method1535(255);
            if (var3 == 0) {
                field7713++;
                if (arg0 <= 36) {
                    this.field7721 = 8;
                    return;
                }
                return;
            }
            this.method3207(arg1, var3, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V", line = 198)
    public final void method3209(int arg0) {
        field7725++;
        this.field7723 = class255.field3695[this.field7727 << 3];
        long var2 = (long) this.field7716;
        long var4 = (long) this.field7715;
        long var6 = (long) this.field7719;
        this.field7724 = (int) Math.sqrt((double) (var4 * var4 + (var2 * var2 + (var6 * var6))));
        if (this.field7729 == 0) {
            this.field7729 = 1;
        }
        if (~this.field7714 == arg0) {
            this.field7726 = 2147483647L;
        } else if (this.field7714 == 1) {
            this.field7726 = (this.field7724 * 8 / this.field7729);
            this.field7726 *= this.field7726;
        } else if (this.field7714 == 2) {
            this.field7726 = (this.field7724 * 8 / this.field7729);
        }
        if (this.field7733) {
            this.field7724 *= -1;
        }
    }
}
