import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class31 extends class354 {

    @OriginalMember(owner = "client!vo", name = "K", descriptor = "I")
    private int field452 = 20;

    @OriginalMember(owner = "client!vo", name = "P", descriptor = "I")
    private int field456 = 0;

    @OriginalMember(owner = "client!vo", name = "T", descriptor = "I")
    private int field460 = 0;

    @OriginalMember(owner = "client!vo", name = "M", descriptor = "I")
    private int field453 = 1365;

    @OriginalMember(owner = "client!vo", name = "Q", descriptor = "I")
    public static int field457 = 328;

    @OriginalMember(owner = "client!vo", name = "Y", descriptor = "[I")
    public static int[] field465;

    @OriginalMember(owner = "client!vo", name = "N", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!vo", name = "O", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!vo", name = "R", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!vo", name = "S", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!vo", name = "U", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!vo", name = "V", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!vo", name = "X", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!vo", name = "W", descriptor = "Lru;")
    public static class130 field463;

    static {
        new class446("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
        field465 = new int[] { 28, 35, 40, 44 };
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V", line = 325)
    public class31() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILik;I)V", line = 9)
    public static final void method266(int arg0, class141 arg1, int arg2) {
        class493.field7267 = 0;
        ++field454;
        class465.field6935 = false;
        class27.method247(arg1, -1);
        class20.method190((byte) 95, arg1);
        if (class465.field6935) {
            System.out.println("---endgpp---");
        }
        if (~arg1.field2185 != ~arg2) {
            throw new RuntimeException("gpi1 pos:" + arg1.field2185 + " psize:" + arg2);
        } else if (arg0 != 30979) {
            method271((byte) 84);
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(B)V", line = 41)
    public static void method267(byte arg0) {
        int var1 = 116 % ((arg0 - 14) / 62);
        field465 = null;
        field463 = null;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIIIZ)V", line = 51)
    public static final void method268(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field458;
        int var6 = 0;
        int var7 = arg2;
        int var8 = arg4 * arg4;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg2 << 1;
        int var13 = (-var12 + 1) * var8 + var10;
        int var14 = -((var12 + -1) * var11) + var9;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg2 << 1) - 3) * var11;
        if (arg5) {
            field463 = null;
        }
        int var19 = (var6 + 1) * var16;
        int var20 = (arg2 - 1) * var15;
        if (~arg3 <= ~class463.field6924 && ~class369.field5628 <= ~arg3) {
            int var21 = class33.method289(261104, class377.field5760, class49.field701, arg0 + arg4);
            int var22 = class33.method289(261104, class377.field5760, class49.field701, -arg4 + arg0);
            class221.method1489(class466.field6955[arg3], var22, var21, (byte) -30, arg1);
        }
        while (var7 > 0) {
            if (~var13 > -1) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var17 += var16;
                    ++var6;
                    var19 += var16;
                }
            }
            if (~var14 > -1) {
                var14 += var19;
                var13 += var17;
                var17 += var16;
                ++var6;
                var19 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var18 -= var15;
            --var7;
            var20 -= var15;
            int var23 = -var7 + arg3;
            int var24 = arg3 + var7;
            if (var24 >= class463.field6924 && ~var23 >= ~class369.field5628) {
                int var25 = class33.method289(261104, class377.field5760, class49.field701, arg0 + var6);
                int var26 = class33.method289(261104, class377.field5760, class49.field701, arg0 - var6);
                if (~class463.field6924 >= ~var23) {
                    class221.method1489(class466.field6955[var23], var26, var25, (byte) -30, arg1);
                }
                if (~var24 >= ~class369.field5628) {
                    class221.method1489(class466.field6955[var24], var26, var25, (byte) -30, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "(I)V", line = 155)
    public static final void method269(int arg0) {
        ++field462;
        class245 var1 = (class245) class212.field3001.method445(33);
        boolean var2 = class466.field6949 != null || class268.field3734 > 0;
        if (arg0 != 2) {
            method269(-61);
        }
        if (var2) {
            class270.field3761 = 1;
        }
        if (class147.field1952 && class35.field515.method1970(true, 81) && ~class367.field5621 < -3) {
            if (var2) {
                class336.field5212 = (class54) class131.field1769.field906.field36.field36;
            } else {
                class292.method1864((byte) -128, (class54) class131.field1769.field906.field36.field36, var1.method1567(-20707), var1.method1571(true));
            }
        } else if (!var2) {
            class292.method1864((byte) 90, (class54) class131.field1769.field906.field36, var1.method1567(arg0 + -20709), var1.method1571(true));
        } else {
            class336.field5212 = (class54) class131.field1769.field906.field36;
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(BI)[I", line = 191)
    public final int[] method270(byte arg0, int arg1) {
        ++field459;
        int[] var3 = super.field5478.method2522(arg1, 16863);
        if (super.field5478.field6213) {
            for (int var4 = 0; ~var4 > ~class531.field7814; ++var4) {
                int var5 = (class195.field2616[var4] << 12) / this.field453 + this.field456;
                int var6 = (class350.field5392[arg1] << 12) / this.field453 + this.field460;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13;
                for (var13 = 0; ~(var11 + var12) > -16385 && ~this.field452 < ~var13; ++var13) {
                    var10 = (var9 * var10 >> 12) * 2 - -var8;
                    var9 = var11 - var12 - -var7;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = this.field452 + -1 <= var13 ? 0 : (var13 << 12) / this.field452;
            }
        }
        if (arg0 >= -74) {
            this.method270((byte) -49, 28);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(B)V", line = 252)
    public static final void method271(byte arg0) {
        if (class478.field7079 != -1) {
            class281.method1800(-1, false, -11252, class478.field7079, -1);
            class478.field7079 = -1;
        }
        ++field464;
        int var1 = -34 / ((-60 - arg0) / 57);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lnj;II)V", line = 269)
    public final void method272(class164 arg0, int arg1, int arg2) {
        ++field461;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 == -4) {
                        this.field460 = arg0.method1074(-635989152);
                    }
                } else {
                    this.field456 = arg0.method1074(arg2 + -635990790);
                }
            } else {
                this.field452 = arg0.method1074(-635989152);
            }
        } else {
            this.field453 = arg0.method1074(arg2 ^ -635988730);
        }
        if (arg2 != 1638) {
            method268(-42, -10, 115, -125, -75, true);
        }
    }
}
