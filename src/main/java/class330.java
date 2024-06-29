import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class330 {

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "B")
    public byte field4595 = 0;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    private int field4592 = 128;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    private int field4591 = 128;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "Z")
    public boolean field4606 = false;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
    private int field4603 = 0;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "I")
    private int field4608 = 0;

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "I")
    public int field4611 = -1;

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "I")
    private int field4612 = 0;

    @OriginalMember(owner = "client!nm", name = "y", descriptor = "I")
    private int field4613 = -1;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public static int field4593 = 0;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "I")
    public static int field4604 = 0;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "Lgk;")
    public static class331 field4607 = new class331("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!nm", name = "A", descriptor = "I")
    public static int field4615 = 1;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
    private int field4602;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!nm", name = "z", descriptor = "I")
    public int field4614;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "Lqj;")
    public class351 field4596;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "[S")
    private short[] field4589;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "[S")
    private short[] field4594;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "[S")
    private short[] field4597;

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "[S")
    private short[] field4610;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IILdu;BIILya;)Lt;")
    public final class471 method2023(int arg0, int arg1, class238 arg2, byte arg3, int arg4, int arg5, class38 arg6) {
        field4599++;
        return arg3 > -86 ? null : this.method2029(arg0, arg5, arg2, 0, null, false, arg6, arg4, (byte) 2, false, arg1, 0, 0, null);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BLiv;)V")
    public final void method2024(byte arg0, class65 arg1) {
        field4598++;
        if (arg0 != 3) {
            this.method2026(null, true, -4, -72, null, 127, -67, null, 11, true, null, -99, -41);
        }
        while (true) {
            int var3 = arg1.method577(255);
            if (var3 == 0) {
                return;
            }
            this.method2028((byte) -115, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V")
    public static void method2025(byte arg0) {
        if (arg0 == -120) {
            field4607 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lta;ZIILya;IILta;IZLdu;II)Lt;")
    public final class471 method2026(class142 arg0, boolean arg1, int arg2, int arg3, class38 arg4, int arg5, int arg6, class142 arg7, int arg8, boolean arg9, class238 arg10, int arg11, int arg12) {
        field4590++;
        return arg9 ? this.method2029(arg6, arg11, arg10, arg2, arg7, arg1, arg4, arg8, (byte) 2, false, arg12, arg3, arg5, arg0) : null;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)[Ljc;")
    public static final class303[] method2027(byte arg0) {
        field4601++;
        if (arg0 <= 4) {
            field4615 = 101;
        }
        return new class303[] { class276.field4063, class506.field7483, class368.field5471 };
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BLiv;I)V")
    private final void method2028(byte arg0, class65 arg1, int arg2) {
        int var4 = 75 / ((arg0 + 39) / 62);
        field4609++;
        if (arg2 == 1) {
            this.field4602 = arg1.method623((byte) -125);
        } else if (arg2 == 2) {
            this.field4611 = arg1.method623((byte) 87);
        } else if (arg2 == 4) {
            this.field4592 = arg1.method623((byte) -36);
        } else if (arg2 == 5) {
            this.field4591 = arg1.method623((byte) 116);
        } else if (arg2 == 6) {
            this.field4603 = arg1.method623((byte) 124);
        } else if (arg2 == 7) {
            this.field4608 = arg1.method577(255);
        } else if (arg2 == 8) {
            this.field4612 = arg1.method577(255);
        } else if (arg2 == 9) {
            this.field4595 = 3;
            this.field4613 = 8224;
        } else if (arg2 == 10) {
            this.field4606 = true;
        } else if (arg2 == 11) {
            this.field4595 = 1;
        } else if (arg2 == 12) {
            this.field4595 = 4;
        } else if (arg2 == 13) {
            this.field4595 = 5;
        } else if (arg2 == 14) {
            this.field4595 = 2;
            this.field4613 = arg1.method577(255) * 256;
        } else if (arg2 == 15) {
            this.field4595 = 3;
            this.field4613 = arg1.method623((byte) -45);
        } else if (arg2 == 16) {
            this.field4595 = 3;
            this.field4613 = arg1.method616((byte) 127);
            return;
        } else if (arg2 == 40) {
            int var5 = arg1.method577(255);
            this.field4594 = new short[var5];
            this.field4597 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field4597[var6] = (short) arg1.method623((byte) -52);
                this.field4594[var6] = (short) arg1.method623((byte) -82);
            }
            return;
        } else if (arg2 == 41) {
            int var7 = arg1.method577(255);
            this.field4589 = new short[var7];
            this.field4610 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4589[var8] = (short) arg1.method623((byte) -37);
                this.field4610[var8] = (short) arg1.method623((byte) 87);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IILdu;ILta;ZLya;IBZIIILta;)Lt;")
    private final class471 method2029(int arg0, int arg1, class238 arg2, int arg3, class142 arg4, boolean arg5, class38 arg6, int arg7, byte arg8, boolean arg9, int arg10, int arg11, int arg12, class142 arg13) {
        field4605++;
        int var15 = arg1;
        class267 var16 = this.field4611 == -1 || arg0 == -1 ? null : arg2.method1585(3, this.field4611);
        boolean var17 = arg5 & this.field4595 != 0;
        if (var16 != null) {
            var15 = arg1 | var16.method1717(arg0, 256, arg7, false);
        }
        if (arg9) {
            return null;
        }
        if (var17) {
            var15 |= this.field4595 == 3 ? 7 : 2;
        }
        if (this.field4591 != 128) {
            var15 |= 0x2;
        }
        if (this.field4592 != 128 || this.field4603 != 0) {
            var15 |= 0x5;
        }
        class156 var18 = this.field4596.field4864;
        class471 var19;
        synchronized (this.field4596.field4864) {
            var19 = (class471) this.field4596.field4864.method1115((long) (this.field4614 |= arg6.field430 << 29), (byte) 58);
        }
        if (var19 == null || arg6.method335(var19.method459(), var15) != 0) {
            if (var19 != null) {
                var15 = arg6.method351(var15, var19.method459());
            }
            int var20 = var15;
            if (this.field4597 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field4589 != null) {
                var20 |= 0x8000;
            }
            class353 var21 = class118.method933(0, this.field4596.field4854, (byte) 89, this.field4602);
            if (var21 == null) {
                return null;
            }
            if (var21.field4919 < 13) {
                var21.method2122(0, (byte) -123);
            }
            var19 = arg6.method314(var21, var20, this.field4596.field4867, this.field4608 + 64, this.field4612 + 850);
            if (this.field4597 != null) {
                for (int var22 = 0; var22 < this.field4597.length; var22++) {
                    var19.method467(this.field4597[var22], this.field4594[var22]);
                }
            }
            if (this.field4589 != null) {
                for (int var23 = 0; var23 < this.field4589.length; var23++) {
                    var19.method445(this.field4589[var23], this.field4610[var23]);
                }
            }
            var19.method465(var15);
            class156 var24 = this.field4596.field4864;
            synchronized (this.field4596.field4864) {
                this.field4596.field4864.method1107(1, (long) (this.field4614 |= arg6.field430 << 29), var19);
            }
        }
        class471 var25 = var16 == null ? var19.method458(arg8, var15, true) : var16.method1719(arg0, arg8, var19, arg10, arg7, 0, var15, 256);
        if (this.field4592 != 128 || this.field4591 != 128) {
            var25.method462(this.field4592, this.field4591, this.field4592);
        }
        if (this.field4603 != 0) {
            if (this.field4603 == 90) {
                var25.method451(4096);
            }
            if (this.field4603 == 180) {
                var25.method451(8192);
            }
            if (this.field4603 == 270) {
                var25.method451(12288);
            }
        }
        if (var17) {
            var25.method473(this.field4595, this.field4613, arg4, arg13, arg11, arg3, arg12);
        }
        var25.method465(arg1);
        return var25;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lya;BILdu;III)Lt;")
    public final class471 method2030(class38 arg0, byte arg1, int arg2, class238 arg3, int arg4, int arg5, int arg6) {
        if (arg1 != -53) {
            this.field4612 = 17;
        }
        field4600++;
        return this.method2029(arg4, arg5, arg3, 0, null, false, arg0, arg6, (byte) 5, false, arg2, 0, 0, null);
    }
}
