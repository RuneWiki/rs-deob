import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class428 extends class304 {

    @OriginalMember(owner = "client!rs", name = "H", descriptor = "I")
    private int field5993 = 0;

    @OriginalMember(owner = "client!rs", name = "D", descriptor = "I")
    private int field5989 = -1;

    @OriginalMember(owner = "client!rs", name = "N", descriptor = "I")
    private int field5999 = -32768;

    @OriginalMember(owner = "client!rs", name = "F", descriptor = "I")
    private int field5991 = 0;

    @OriginalMember(owner = "client!rs", name = "L", descriptor = "Z")
    public boolean field5997 = false;

    @OriginalMember(owner = "client!rs", name = "R", descriptor = "I")
    private int field6003;

    @OriginalMember(owner = "client!rs", name = "Q", descriptor = "I")
    public int field6002;

    @OriginalMember(owner = "client!rs", name = "T", descriptor = "Lok;")
    private class153 field6005;

    @OriginalMember(owner = "client!rs", name = "K", descriptor = "[I")
    public static int[] field5996 = new int[500];

    @OriginalMember(owner = "client!rs", name = "U", descriptor = "Lus;")
    public static class1 field6006;

    @OriginalMember(owner = "client!rs", name = "W", descriptor = "Z")
    public static boolean field6008;

    @OriginalMember(owner = "client!rs", name = "y", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!rs", name = "z", descriptor = "I")
    public static int field5985;

    @OriginalMember(owner = "client!rs", name = "A", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!rs", name = "B", descriptor = "I")
    public static int field5987;

    @OriginalMember(owner = "client!rs", name = "C", descriptor = "I")
    public static int field5988;

    @OriginalMember(owner = "client!rs", name = "G", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!rs", name = "I", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!rs", name = "J", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!rs", name = "M", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!rs", name = "O", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!rs", name = "P", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!rs", name = "S", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!rs", name = "V", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!rs", name = "E", descriptor = "Lg;")
    private class97 field5990;

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class428(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
        this.field6003 = arg0;
        this.field6002 = arg1 + arg2;
        int var12 = class324.field4674.method1279(this.field6003, -2).field4714;
        if (var12 != -1) {
            this.field5997 = false;
            this.field6005 = class64.field836.method2081(var12, 0);
        } else {
            this.field5997 = true;
        }
        if (~this.field6002 == ~arg2) {
            class237.method1508(super.field4319, (byte) 124, super.field4331, this.field5991, this.field6005, super.field4317, false);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lnp;BI)Lf;")
    private final class491 method2512(class313 arg0, byte arg1, int arg2) {
        ++field5985;
        if (arg1 > -62) {
            return null;
        } else {
            class327 var4 = class324.field4674.method1279(this.field6003, -2);
            return this.field5997 ? var4.method2074(0, class64.field836, 0, arg0, -1, -1, arg2) : var4.method2074(0, class64.field836, this.field5993, arg0, this.field5989, this.field5991, arg2);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILin;ILnp;BZI)V")
    public final void method247(int arg0, class54 arg1, int arg2, class313 arg3, byte arg4, boolean arg5, int arg6) {
        int var8 = -104 % ((20 - arg4) / 38);
        ++field5984;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "(I)V")
    public final void method246(int arg0) {
        if (arg0 != -1) {
            this.field5993 = 46;
        }
        ++field5998;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "()V")
    public static final void method2513() {
        if (class169.field2475 != null) {
            for (int var0 = 0; var0 < class169.field2475.length; ++var0) {
                for (int var1 = 0; var1 < class287.field4186; ++var1) {
                    for (int var2 = 0; var2 < class360.field5188; ++var2) {
                        if (class169.field2475[var0][var1][var2] != null) {
                            class169.field2475[var0][var1][var2].method494(-24379);
                        }
                        class169.field2475[var0][var1][var2] = null;
                    }
                }
            }
        }
        class169.field2475 = null;
        class178.field2556 = null;
        if (class311.field4394 != null) {
            for (int var3 = 0; var3 < class311.field4394.length; ++var3) {
                for (int var4 = 0; var4 < class287.field4186; ++var4) {
                    for (int var5 = 0; var5 < class360.field5188; ++var5) {
                        if (class311.field4394[var3][var4][var5] != null) {
                            class311.field4394[var3][var4][var5].method494(-24379);
                        }
                        class311.field4394[var3][var4][var5] = null;
                    }
                }
            }
        }
        class311.field4394 = null;
        class28.field388 = null;
        class330.field4786 = null;
        class53.field725 = null;
        class23.field302 = 0;
        if (class451.field6241 != null) {
            for (int var6 = 0; var6 < class23.field302; ++var6) {
                class451.field6241[var6] = null;
            }
        }
        if (class293.field4249 != null) {
            for (int var7 = 0; var7 < class231.field3493; ++var7) {
                class293.field4249[var7] = null;
            }
            class231.field3493 = 0;
        }
        if (class478.field6712 != null) {
            for (int var8 = 0; var8 < class480.field6737; ++var8) {
                class478.field6712[var8] = null;
            }
            for (int var9 = 0; var9 < class314.field4441; ++var9) {
                for (int var10 = 0; var10 < class287.field4186; ++var10) {
                    for (int var11 = 0; var11 < class360.field5188; ++var11) {
                        class337.field4910[var9][var10][var11] = 0L;
                    }
                }
            }
            class480.field6737 = 0;
        }
        class177.field2542 = null;
        class485.method2833(5);
        class437.field6070.method1447(-73);
        class191.field2841 = null;
        class114.field1465 = null;
        class135.field1788 = null;
        class405.field5702 = null;
        class295.field4269 = null;
        class456.field6417 = null;
    }

    @OriginalMember(owner = "client!rs", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field5988;
        if (this.field5990 != null) {
            this.field5990.method554();
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(III)I")
    public static final int method2514(int arg0, int arg1, int arg2) {
        ++field5995;
        if (arg1 < 106) {
            field5996 = null;
        }
        int var3 = arg0 + -1 & arg2 >> 31;
        return ((arg2 >>> 31) + arg2) % arg0 - -var3;
    }

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "(I)I")
    public final int method323(int arg0) {
        ++field6007;
        if (arg0 != 0) {
            this.finalize();
        }
        return this.field5999;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILnp;Lf;)V")
    private final void method2515(int arg0, class313 arg1, class491 arg2) {
        ++field6000;
        class295[] var4 = arg2.method1300();
        if (arg0 != -26158) {
            this.field5989 = -37;
        }
        class168[] var5 = arg2.method1286();
        if ((this.field5990 == null || this.field5990.field1244) && (var4 != null || var5 != null)) {
            this.field5990 = new class97(class353.field5090);
        }
        if (this.field5990 != null) {
            this.field5990.method558(arg1, (long) class353.field5090, var4, var5, false);
            this.field5990.method548(super.field4319, super.field4330, super.field4328, super.field4324, super.field4334);
        }
    }

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "(I)Z")
    public final boolean method249(int arg0) {
        if (arg0 > -105) {
            field5996 = null;
        }
        ++field5994;
        return false;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIILnp;)Z")
    public final boolean method113(int arg0, int arg1, int arg2, class313 arg3) {
        ++field5987;
        return arg1 <= 16 ? false : false;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
    public static void method2516(int arg0) {
        field6006 = null;
        field5996 = null;
        if (arg0 != 0) {
            field6008 = true;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lnp;B)V")
    public final void method103(class313 arg0, byte arg1) {
        ++field6001;
        if (arg1 > -95) {
            this.field6003 = 17;
        }
        class491 var3 = this.method2512(arg0, (byte) -108, 0);
        if (var3 != null) {
            this.method2515(-26158, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V")
    public final void method2517(int arg0) {
        if (this.field5990 != null) {
            this.field5990.method554();
        }
        if (arg0 >= -6) {
            this.method113(47, 46, 24, (class313) null);
        }
        ++field5986;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(ILnp;)Lql;")
    public final class477 method120(int arg0, class313 arg1) {
        ++field5992;
        class491 var3 = this.method2512(arg1, (byte) -100, 1024);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != 0) {
                this.method249(-67);
            }
            class282 var4 = arg1.method601();
            var4.method1019(super.field4331, super.field4322, super.field4317);
            if (this.field5990 == null) {
                var3.method1323(var4, (class98) null, 0);
            } else {
                class207 var5 = this.field5990.method552();
                arg1.method646(var3, var5, var4, (class98) null, 0);
            }
            this.field5999 = var3.method1289();
            this.method2515(-26158, arg1, var3);
            return null;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)V")
    public final void method2518(int arg0, int arg1) {
        ++field6004;
        if (arg1 != 0) {
            this.field6002 = -92;
        }
        if (!this.field5997) {
            this.field5993 += arg0;
            while (this.field5993 > this.field6005.field2275[this.field5991]) {
                this.field5993 -= this.field6005.field2275[this.field5991];
                ++this.field5991;
                if (this.field6005.field2254.length <= this.field5991) {
                    this.field5997 = true;
                    break;
                }
            }
            if (!this.field5997) {
                class237.method1508(super.field4319, (byte) -14, super.field4331, this.field5991, this.field6005, super.field4317, false);
            }
        }
    }

    static {
        new class326("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
        field6006 = new class1(52, 0);
        field6008 = false;
    }
}
