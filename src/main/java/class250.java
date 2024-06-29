import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class250 {

    @OriginalMember(owner = "client!af", name = "a", descriptor = "[I")
    private int[] field3526 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public int field3530 = -1;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Z")
    public boolean field3529 = false;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "[I")
    private int[] field3534;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "[S")
    private short[] field3528;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "[S")
    private short[] field3536;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "[S")
    private short[] field3539;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "[S")
    private short[] field3542;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)Z")
    public final boolean method1675(int arg0) {
        field3541++;
        if (this.field3534 == null) {
            return true;
        }
        int var2 = 61 % ((-arg0 - 31) / 38);
        boolean var3 = true;
        class268 var4 = class403.field5723;
        synchronized (class403.field5723) {
            for (int var5 = 0; var5 < this.field3534.length; var5++) {
                if (!class403.field5723.method1765(false, this.field3534[var5], 0)) {
                    var3 = false;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lkh;II)V")
    private final void method1676(class11 arg0, int arg1, int arg2) {
        field3538++;
        if (arg1 == 1) {
            this.field3530 = arg0.method172((byte) 52);
        } else if (arg1 == 2) {
            int var4 = arg0.method172((byte) 52);
            this.field3534 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3534[var5] = arg0.method174(255);
            }
        } else if (arg1 == 3) {
            this.field3529 = true;
        } else if (arg1 == 40) {
            int var8 = arg0.method172((byte) 52);
            this.field3536 = new short[var8];
            this.field3539 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3539[var9] = (short) arg0.method174(255);
                this.field3536[var9] = (short) arg0.method174(255);
            }
        } else if (arg1 == 41) {
            int var6 = arg0.method172((byte) 52);
            this.field3542 = new short[var6];
            this.field3528 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3528[var7] = (short) arg0.method174(255);
                this.field3542[var7] = (short) arg0.method174(255);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3526[arg1 - 60] = arg0.method174(255);
        }
        if (arg2 != -4) {
            this.field3534 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
    public static final void method1677(int arg0) {
        field3535++;
        class131 var1 = class143.field2049;
        synchronized (class143.field2049) {
            if (arg0 > -113) {
                field3540 = 27;
            }
            class143.field2049.method905((byte) 63);
        }
        class131 var2 = class159.field2232;
        synchronized (class159.field2232) {
            class159.field2232.method905((byte) 120);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)Z")
    public final boolean method1678(byte arg0) {
        if (arg0 != -80) {
            field3540 = 117;
        }
        field3531++;
        boolean var2 = true;
        class268 var3 = class403.field5723;
        synchronized (class403.field5723) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field3526[var4] != -1 && !class403.field5723.method1765(false, this.field3526[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)Lbr;")
    public final class223 method1679(byte arg0) {
        field3527++;
        if (this.field3534 == null) {
            return null;
        }
        class223[] var2 = new class223[this.field3534.length];
        class268 var3 = class403.field5723;
        synchronized (class403.field5723) {
            int var4 = 0;
            while (true) {
                if (var4 >= this.field3534.length) {
                    break;
                }
                var2[var4] = class121.method823(0, false, class403.field5723, this.field3534[var4]);
                var4++;
            }
        }
        class223 var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new class223(var2, var2.length);
        }
        if (arg0 <= 21) {
            this.method1680((class11) null, 86);
        }
        if (var5 == null) {
            return null;
        }
        if (this.field3539 != null) {
            for (int var6 = 0; var6 < this.field3539.length; var6++) {
                var5.method1491(-42, this.field3539[var6], this.field3536[var6]);
            }
        }
        if (this.field3528 != null) {
            for (int var7 = 0; var7 < this.field3528.length; var7++) {
                var5.method1482(this.field3528[var7], 110, this.field3542[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lkh;I)V")
    public final void method1680(class11 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method172((byte) 52);
            if (var3 == 0) {
                field3533++;
                if (arg1 <= 52) {
                    this.field3530 = 21;
                    return;
                }
                return;
            }
            this.method1676(arg0, var3, -4);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)Lbr;")
    public final class223 method1681(boolean arg0) {
        field3537++;
        class223[] var2 = new class223[5];
        int var3 = 0;
        class268 var4 = class403.field5723;
        synchronized (class403.field5723) {
            if (!arg0) {
                return null;
            }
            for (int var6 = 0; var6 < 5; var6++) {
                if (this.field3526[var6] != -1) {
                    var2[var3++] = class121.method823(0, false, class403.field5723, this.field3526[var6]);
                }
            }
        }
        class223 var7 = new class223(var2, var3);
        if (this.field3539 != null) {
            for (int var8 = 0; var8 < this.field3539.length; var8++) {
                var7.method1491(-106, this.field3539[var8], this.field3536[var8]);
            }
        }
        if (this.field3528 != null) {
            for (int var9 = 0; var9 < this.field3528.length; var9++) {
                var7.method1482(this.field3528[var9], 89, this.field3542[var9]);
            }
        }
        return var7;
    }
}
