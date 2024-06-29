import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class54 {

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "[I")
    private int[] field812 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "Lpt;")
    public class362 field806;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "[I")
    private int[] field800;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "[I")
    public static int[] field803;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "[S")
    private short[] field802;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "[S")
    private short[] field804;

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "[S")
    private short[] field810;

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "[S")
    private short[] field813;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IBLkk;)V")
    private final void method510(int arg0, byte arg1, class161 arg2) {
        field798++;
        if (arg0 == 1) {
            arg2.method1172((byte) -111);
        } else if (arg0 == 2) {
            int var8 = arg2.method1172((byte) -117);
            this.field800 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field800[var9] = arg2.method1134(-16848);
            }
        } else if (arg0 != 3) {
            if (arg0 == 40) {
                int var4 = arg2.method1172((byte) -107);
                this.field804 = new short[var4];
                this.field813 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field813[var5] = (short) arg2.method1134(-16848);
                    this.field804[var5] = (short) arg2.method1134(class134.method993(arg1, 16871));
                }
            } else if (arg0 == 41) {
                int var6 = arg2.method1172((byte) 47);
                this.field810 = new short[var6];
                this.field802 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field810[var7] = (short) arg2.method1134(-16848);
                    this.field802[var7] = (short) arg2.method1134(-16848);
                }
            } else if (arg0 >= 60 && arg0 < 70) {
                this.field812[arg0 - 60] = arg2.method1134(arg1 - 16807);
            }
        }
        if (arg1 != -41) {
            this.method511(38);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)Z")
    public final boolean method511(int arg0) {
        field807++;
        if (this.field800 == null) {
            return true;
        } else if (arg0 == -20590) {
            boolean var2 = true;
            class435 var3 = this.field806.field4984;
            synchronized (this.field806.field4984) {
                for (int var4 = 0; var4 < this.field800.length; var4++) {
                    if (!this.field806.field4984.method2649(1, 0, this.field800[var4])) {
                        var2 = false;
                    }
                }
                return var2;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)Lqi;")
    public final class430 method512(byte arg0) {
        field809++;
        if (arg0 != 89) {
            this.method511(113);
        }
        class430[] var2 = new class430[5];
        int var3 = 0;
        class435 var4 = this.field806.field4984;
        synchronized (this.field806.field4984) {
            for (int var5 = 0; var5 < 5; var5++) {
                if (this.field812[var5] != -1) {
                    var2[var3++] = class424.method2521(this.field806.field4984, this.field812[var5], (byte) 38, 0);
                }
            }
        }
        class430 var6 = new class430(var2, var3);
        if (this.field813 != null) {
            for (int var7 = 0; var7 < this.field813.length; var7++) {
                var6.method2581(this.field804[var7], this.field813[var7], true);
            }
        }
        if (this.field810 != null) {
            for (int var8 = 0; var8 < this.field810.length; var8++) {
                var6.method2575(this.field810[var8], -128, this.field802[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lkk;B)V")
    public final void method513(class161 arg0, byte arg1) {
        if (arg1 != -116) {
            method516((byte) 85);
        }
        while (true) {
            int var3 = arg0.method1172((byte) -118);
            if (var3 == 0) {
                field801++;
                return;
            }
            this.method510(var3, (byte) -41, arg0);
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)Z")
    public final boolean method514(byte arg0) {
        field799++;
        boolean var2 = true;
        class435 var3 = this.field806.field4984;
        synchronized (this.field806.field4984) {
            int var4 = 102 / ((32 - arg0) / 42);
            for (int var5 = 0; var5 < 5; var5++) {
                if (this.field812[var5] != -1 && !this.field806.field4984.method2649(1, 0, this.field812[var5])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)Lqi;")
    public final class430 method515(int arg0) {
        field808++;
        if (arg0 != -1) {
            return null;
        } else if (this.field800 == null) {
            return null;
        } else {
            class430[] var2 = new class430[this.field800.length];
            class435 var3 = this.field806.field4984;
            synchronized (this.field806.field4984) {
                int var4 = 0;
                while (true) {
                    if (var4 >= this.field800.length) {
                        break;
                    }
                    var2[var4] = class424.method2521(this.field806.field4984, this.field800[var4], (byte) -121, 0);
                    var4++;
                }
            }
            class430 var5;
            if (var2.length == 1) {
                var5 = var2[0];
            } else {
                var5 = new class430(var2, var2.length);
            }
            if (var5 == null) {
                return null;
            }
            if (this.field813 != null) {
                for (int var6 = 0; var6 < this.field813.length; var6++) {
                    var5.method2581(this.field804[var6], this.field813[var6], true);
                }
            }
            if (this.field810 != null) {
                for (int var7 = 0; var7 < this.field810.length; var7++) {
                    var5.method2575(this.field810[var7], -128, this.field802[var7]);
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(B)V")
    public static void method516(byte arg0) {
        field803 = null;
        if (arg0 != 62) {
            method516((byte) 115);
        }
    }

    static {
        new class151("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
    }
}
