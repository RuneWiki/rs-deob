import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class35 extends class284 {

    @OriginalMember(owner = "client!kl", name = "G", descriptor = "I")
    private final int field551;

    @OriginalMember(owner = "client!kl", name = "Q", descriptor = "I")
    private final int field561;

    @OriginalMember(owner = "client!kl", name = "D", descriptor = "I")
    private final int field548;

    @OriginalMember(owner = "client!kl", name = "T", descriptor = "I")
    private int field564;

    @OriginalMember(owner = "client!kl", name = "E", descriptor = "I")
    public static int field549 = 1;

    @OriginalMember(owner = "client!kl", name = "S", descriptor = "I")
    public static int field563 = 0;

    @OriginalMember(owner = "client!kl", name = "U", descriptor = "[Lke;")
    public static class256[] field565 = new class256[200];

    @OriginalMember(owner = "client!kl", name = "O", descriptor = "Lke;")
    public static class256 field559 = class316.method2202("Fichiers config charg-Bs", 27626);

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!kl", name = "A", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!kl", name = "H", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client!kl", name = "I", descriptor = "I")
    private int field553;

    @OriginalMember(owner = "client!kl", name = "J", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!kl", name = "K", descriptor = "I")
    private int field555;

    @OriginalMember(owner = "client!kl", name = "L", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!kl", name = "M", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!kl", name = "N", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!kl", name = "P", descriptor = "I")
    private int field560;

    @OriginalMember(owner = "client!kl", name = "R", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "[B")
    private byte[] field546;

    @OriginalMember(owner = "client!kl", name = "F", descriptor = "[I")
    public static int[] field550;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IB)V", line = 9)
    public void method241(int arg0, byte arg1) {
        this.field546[arg0] = arg1;
        field557++;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lke;I)V", line = 21)
    public static final void method242(class256 arg0, int arg1) {
        field554++;
        if (arg1 != 4096) {
            method248((class188) null, -106, -72, 44, -4);
        }
        int var2 = class187.method1354(arg0, (byte) 31);
        if (var2 != -1) {
            class13.method80(-1, class301.field5189.field4119[var2], class301.field5189.field4122[var2]);
        }
    }

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "(I)V", line = 46)
    public static void method243(int arg0) {
        field565 = null;
        field559 = null;
        field550 = null;
        if (arg0 >= -12) {
            field565 = (class256[]) null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)V", line = 59)
    public final void method244(boolean arg0) {
        this.field555 = 0;
        field545++;
        if (arg0) {
            this.field553 = 0;
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(IIIIIFFF)V", line = 71)
    public class35(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field551 = (int) (arg6 * 4096.0F);
        this.field561 = (int) (arg7 * 4096.0F);
        this.field564 = this.field548 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V", line = 82)
    public final void method245(int arg0) {
        this.field555 >>= 0x4;
        field556++;
        if (this.field555 < 0) {
            this.field555 = 0;
        } else if (this.field555 > 255) {
            this.field555 = 255;
        }
        if (arg0 == -1994931796) {
            this.field564 = this.field548;
            this.method241(this.field553++, (byte) this.field555);
            this.field555 = 0;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)V", line = 104)
    public final void method246(int arg0, int arg1, int arg2) {
        if (arg2 < 92) {
            this.field555 = -41;
        }
        field547++;
        if (arg0 == 0) {
            this.field560 = this.field551 - (arg1 < 0 ? -arg1 : arg1);
            this.field552 = 4096;
            this.field560 = this.field560 * this.field560 >> 12;
            this.field555 = this.field560;
            return;
        }
        this.field552 = this.field561 * this.field560 >> 12;
        this.field560 = this.field551 - (arg1 >= 0 ? arg1 : -arg1);
        if (this.field552 < 0) {
            this.field552 = 0;
        } else if (this.field552 > 4096) {
            this.field552 = 4096;
        }
        this.field560 = this.field560 * this.field560 >> 12;
        this.field560 = this.field560 * this.field552 >> 12;
        this.field555 += this.field564 * this.field560 >> 12;
        this.field564 = this.field564 * this.field548 >> 12;
    }

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "(I)I", line = 151)
    public static final int method247(int arg0) {
        field562++;
        if (arg0 != 0) {
            return -60;
        } else if (class317.field5460 != null) {
            return 3;
        } else if (class253.field4323 && class282.field4905) {
            return 2;
        } else if (class253.field4323 && !class282.field4905) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lla;IIII)V", line = 175)
    public static final void method248(class188 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 2) {
            method247(98);
        }
        if (class253.field4323) {
            class60.method470(arg2, arg4, arg2 + arg0.field3391, arg0.field3343 + arg4);
        }
        field544++;
        if (class321.field5495 < 3) {
            if (class253.field4323) {
                ((class87) class95.field1696).method635(arg2, arg4, arg0.field3391, arg0.field3343, class95.field1696.field2343 / 2, class95.field1696.field2348 / 2, class289.field5001, 256, (class87) arg0.method1359(false, (byte) -107));
            } else {
                ((class227) class95.field1696).method1491(arg2, arg4, arg0.field3391, arg0.field3343, class95.field1696.field2343 / 2, class95.field1696.field2348 / 2, class289.field5001, 256, arg0.field3359, arg0.field3386);
            }
        } else if (class253.field4323) {
            class135 var5 = arg0.method1359(false, (byte) -106);
            if (var5 != null) {
                var5.method637(arg2, arg4);
            }
        } else {
            class178.method1298(arg2, arg4, 0, arg0.field3359, arg0.field3386);
        }
        class302.field5220[arg1] = true;
    }
}
