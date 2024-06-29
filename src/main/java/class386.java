import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class386 extends class218 implements class518 {

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "Z")
    private boolean field5953;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "B")
    private byte field5942;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "S")
    private short field5944;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "B")
    private byte field5924;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "Z")
    private boolean field5933;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "Z")
    private boolean field5932;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "B")
    private byte field5939;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "Z")
    private boolean field5948;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "Le;")
    public class530 field5945;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "Li;")
    private class515 field5946;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "Llo;")
    public static class306 field5926 = new class306("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
    public static int field5952 = -1;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "Lec;")
    public static class68 field5956;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public static int field5927;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    public static int field5947;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    public static int field5954;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZLza;II)Ljl;")
    private final class489 method2419(boolean arg0, class491 arg1, int arg2, int arg3) {
        ++field5923;
        class39 var5 = class61.field928.method791(65535 & this.field5944, true);
        int var6 = -70 / ((arg2 - 23) / 53);
        class220 var7;
        class220 var8;
        if (!this.field5932) {
            if (this.field5924 >= 3) {
                var7 = null;
            } else {
                var7 = class511.field7488[this.field5924 - -1];
            }
            var8 = class511.field7488[this.field5924];
        } else {
            var7 = class511.field7488[0];
            var8 = class320.field5039[this.field5924];
        }
        return var5.method298(arg1, super.field3782, var8, super.field3783, arg0, arg3, this.field5939, super.field3784, var7, this.field5942, 7280);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)I")
    public final int method29(int arg0) {
        ++field5954;
        int var2 = 52 / ((arg0 - 40) / 52);
        return this.field5939;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)Z")
    public final boolean method42(boolean arg0) {
        ++field5928;
        if (arg0) {
            this.field5948 = false;
        }
        return this.field5933;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(ILza;)Lsr;")
    public final class430 method40(int arg0, class491 arg1) {
        ++field5937;
        if (arg0 > -24) {
            return null;
        } else if (this.field5945 == null) {
            return null;
        } else {
            class202 var3 = arg1.method820();
            var3.method1246(super.field3782, super.field3784, super.field3783);
            class430 var4 = null;
            if (this.field5953) {
                var4 = class21.method111((byte) 108, 1);
            }
            this.field5945.method736(var3, var4 != null ? var4.field6447[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILza;IILvl;Z)V")
    public final void method39(int arg0, int arg1, class491 arg2, int arg3, int arg4, class243 arg5, boolean arg6) {
        if (arg0 == 0) {
            ++field5947;
            if (!(arg5 instanceof class386)) {
                if (arg5 instanceof class361) {
                    class361 var8 = (class361) arg5;
                    if (this.field5945 != null && var8.field5620 != null) {
                        this.field5945.method772(var8.field5620, arg1, arg4, arg3, arg6);
                        return;
                    }
                }
            } else {
                class386 var9 = (class386) arg5;
                if (this.field5945 == null || var9.field5945 == null) {
                    return;
                }
                this.field5945.method772(var9.field5945, arg1, arg4, arg3, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lza;Lp;IIIIZIIZ)V")
    public class386(class491 arg0, class39 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class41.method302(3, arg7, arg8));
        super.field3782 = arg3;
        this.field5953 = ~arg1.field618 != -1 && !arg6;
        this.field5942 = (byte) arg8;
        this.field5944 = (short) arg1.field587;
        this.field5924 = (byte) arg2;
        this.field5933 = arg9;
        this.field5932 = arg6;
        this.field5939 = (byte) arg7;
        super.field3783 = arg5;
        this.field5948 = arg0.method841() && arg1.field655 && !this.field5932 && class510.field7403.method2041(-6, class511.field7485) != 0;
        int var11 = 2048;
        if (this.field5933) {
            var11 |= 65536;
        }
        class489 var12 = this.method2419(this.field5948, arg0, 105, var11);
        if (var12 != null) {
            this.field5945 = var12.field7150;
            this.field5946 = var12.field7152;
            if (this.field5933) {
                this.field5945 = this.field5945.method739((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)I")
    public final int method28(byte arg0) {
        ++field5941;
        if (arg0 != -118) {
            this.field5939 = -84;
        }
        return 65535 & this.field5944;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
    public final void method31(int arg0) {
        if (this.field5945 != null) {
            this.field5945.method743();
        }
        int var2 = 113 % ((arg0 - 57) / 48);
        ++field5940;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)Z")
    public final boolean method33(byte arg0) {
        ++field5927;
        int var2 = 32 / ((arg0 - 8) / 45);
        return this.field5948;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)I")
    public final int method38(int arg0) {
        ++field5950;
        if (arg0 != 5638) {
            this.field5939 = -112;
        }
        return this.field5942;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLza;I)Le;")
    private final class530 method2420(byte arg0, class491 arg1, int arg2) {
        ++field5929;
        if (arg0 > -72) {
            return null;
        } else if (this.field5945 != null && arg1.method902(this.field5945.method741(), arg2) == 0) {
            return this.field5945;
        } else {
            class489 var4 = this.method2419(false, arg1, 121, arg2);
            return var4 != null ? var4.field7150 : null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILza;)V")
    public final void method34(int arg0, class491 arg1) {
        ++field5935;
        Object var3 = null;
        class515 var5;
        if (this.field5946 == null && this.field5948) {
            class489 var4 = this.method2419(true, arg1, -32, 262144);
            var5 = var4 == null ? null : var4.field7152;
        } else {
            var5 = this.field5946;
            this.field5946 = null;
        }
        if (arg0 != 25747) {
            this.method40(88, (class491) null);
        }
        if (var5 != null) {
            class335.method2114(var5, this.field5924, super.field3782, super.field3783, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILjg;I)J")
    public static final long method2421(int arg0, int arg1, class518 arg2, int arg3) {
        ++field5938;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class39 var10 = class61.field928.method791(arg2.method28((byte) -118), true);
        long var11 = (long) (1073741824 | arg2.method29(118) << 14 | arg1 << 7 | arg3 | arg2.method38(5638) << 20);
        if (~var10.field618 == arg0) {
            var11 |= var8;
        }
        if (~var10.field573 == -2) {
            var11 |= var4;
        }
        if (var10.field603) {
            var11 |= var6;
        }
        return var11 | (long) arg2.method28((byte) -118) << 32;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lza;III)Z")
    public final boolean method27(class491 arg0, int arg1, int arg2, int arg3) {
        ++field5930;
        class530 var5 = this.method2420((byte) -96, arg0, 131072);
        if (arg1 < 121) {
            this.method2419(true, (class491) null, -1, 90);
        }
        if (var5 != null) {
            class202 var6 = arg0.method820();
            var6.method1246(super.field3782, super.field3784, super.field3783);
            return var5.method776(arg3, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLza;)V")
    public final void method26(byte arg0, class491 arg1) {
        ++field5955;
        if (arg0 != 111) {
            field5952 = 8;
        }
        Object var3 = null;
        class515 var5;
        if (this.field5946 == null && this.field5948) {
            class489 var4 = this.method2419(true, arg1, arg0 ^ 22, 262144);
            var5 = var4 != null ? var4.field7152 : null;
        } else {
            var5 = this.field5946;
            this.field5946 = null;
        }
        if (var5 != null) {
            class219.method1506(var5, this.field5924, super.field3782, super.field3783, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
    public static void method2422(int arg0) {
        if (arg0 != -16601) {
            field5926 = null;
        }
        field5926 = null;
        field5956 = null;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(BLza;)V")
    public final void method43(byte arg0, class491 arg1) {
        if (arg0 != 35) {
            this.field5932 = false;
        }
        ++field5951;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILza;I)Le;")
    public final class530 method32(int arg0, class491 arg1, int arg2) {
        int var4 = 108 % ((-24 - arg2) / 60);
        ++field5934;
        return this.method2420((byte) -94, arg1, arg0);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILec;BI)V")
    public static final void method2423(int arg0, class68 arg1, byte arg2, int arg3) {
        class515.field7624 = arg3;
        class214.field3405 = arg0;
        if (arg2 != 1) {
            method2425(-92, 28, -77, 107, 64, (byte) 15);
        }
        field5956 = arg1;
        ++field5936;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIBIZ)V")
    public static final void method2424(int arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        if (~class511.field7485 != -1) {
            class173.field2772 = class511.field7485;
            class86.method616(0, 112);
        } else {
            class118.method942(false, 25616);
        }
        ++field5931;
        class302.field4848 = arg1;
        class426.field6409 = arg3;
        class222.field3823 = arg4;
        class210.method1373(arg0);
        if (arg2 <= 110) {
            field5956 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)V")
    public final void method36(boolean arg0) {
        ++field5949;
        this.field5933 = arg0;
        if (this.field5945 != null) {
            this.field5945.method762(this.field5945.method741() & -65537);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIB)V")
    public static final void method2425(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 == 1) {
            if (class510.field7403.field5119 != 0 && arg3 != 0 && class238.field4104 < 50 && arg4 != -1) {
                class241.field4163[class238.field4104++] = new class452((byte) 1, arg4, arg3, arg0, arg1, arg2);
            }
            ++field5943;
        }
    }

    static {
        new class306("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
        new class306("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
        field5956 = null;
        new class306("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
    }
}
