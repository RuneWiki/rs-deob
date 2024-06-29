import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class65 extends class55 {

    @OriginalMember(owner = "client!di", name = "v", descriptor = "Laq;")
    public class90 field966 = new class90();

    @OriginalMember(owner = "client!di", name = "B", descriptor = "Lnh;")
    public class448 field972 = new class448();

    @OriginalMember(owner = "client!di", name = "q", descriptor = "Lom;")
    private class210 field961;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "Lkn;")
    public static class442 field969;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "[Lsg;")
    public static class226[] field971;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "[[[B")
    public static byte[][][] field968;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "()I")
    public final int method451() {
        field965++;
        return 0;
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(I)V")
    public static void method502(int arg0) {
        if (arg0 > -76) {
            method502(-66);
        }
        field968 = null;
        field969 = null;
        field971 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)Z")
    public static final boolean method503(int arg0, int arg1) {
        field962++;
        if (arg1 != -1) {
            field969 = null;
        }
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILvi;I)V")
    private final void method504(int arg0, class319 arg1, int arg2) {
        if ((this.field961.field2885[arg1.field4355] & 0x4) != arg2 && arg1.field4367 < 0) {
            int var4 = this.field961.field2916[arg1.field4355] / class76.field1094;
            int var5 = (1048575 - (arg1.field4359 - var4)) / var4;
            arg1.field4359 = arg0 * var4 + arg1.field4359 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field961.field2926[arg1.field4355] == 0) {
                    arg1.field4360 = class421.method2674(arg1.field4370, arg1.field4360.method2675(), arg1.field4360.method2678(), arg1.field4360.method2651());
                } else {
                    arg1.field4360 = class421.method2674(arg1.field4370, arg1.field4360.method2675(), 0, arg1.field4360.method2651());
                    this.field961.method1365(arg1.field4365.field4065[arg1.field4364] < 0, 0, arg1);
                }
                if (arg1.field4365.field4065[arg1.field4364] < 0) {
                    arg1.field4360.method2679(-1);
                }
                arg0 = arg1.field4359 / var4;
            }
        }
        field959++;
        arg1.field4360.method455(arg0);
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "()Ler;")
    public final class55 method454() {
        field963++;
        class319 var1 = (class319) this.field966.method646(48);
        if (var1 == null) {
            return null;
        } else if (var1.field4360 == null) {
            return this.method453();
        } else {
            return var1.field4360;
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V")
    public final void method455(int arg0) {
        field970++;
        this.field972.method455(arg0);
        for (class319 var2 = (class319) this.field966.method646(48); var2 != null; var2 = (class319) this.field966.method641(false)) {
            if (!this.field961.method1378(var2, 71)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field4375) {
                        this.method504(var3, var2, 0);
                        var2.field4375 -= var3;
                        break;
                    }
                    this.method504(var2.field4375, var2, 0);
                    var3 -= var2.field4375;
                } while (!this.field961.method1354(var3, -129, var2, (int[]) null, 0));
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lnq;B)V")
    public static final void method505(class268 arg0, byte arg1) {
        int var2 = -121 % ((7 - arg1) / 37);
        field958++;
        class410.field5810 = arg0;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BLvi;[IIII)V")
    private final void method506(byte arg0, class319 arg1, int[] arg2, int arg3, int arg4, int arg5) {
        int var7 = -43 / ((arg0 + 38) / 53);
        if ((this.field961.field2885[arg1.field4355] & 0x4) != 0 && arg1.field4367 < 0) {
            int var8 = this.field961.field2916[arg1.field4355] / class76.field1094;
            while (true) {
                int var9 = (1048575 - (arg1.field4359 - var8)) / var8;
                if (arg3 < var9) {
                    arg1.field4359 += arg3 * var8;
                    break;
                }
                arg1.field4360.method452(arg2, arg5, var9);
                arg1.field4359 += var8 * var9 - 1048576;
                arg5 += var9;
                arg3 -= var9;
                int var10 = class76.field1094 / 100;
                int var11 = 262144 / var8;
                if (var11 < var10) {
                    var10 = var11;
                }
                class421 var12 = arg1.field4360;
                if (this.field961.field2926[arg1.field4355] == 0) {
                    arg1.field4360 = class421.method2674(arg1.field4370, var12.method2675(), var12.method2678(), var12.method2651());
                } else {
                    arg1.field4360 = class421.method2674(arg1.field4370, var12.method2675(), 0, var12.method2651());
                    this.field961.method1365(arg1.field4365.field4065[arg1.field4364] < 0, 0, arg1);
                    arg1.field4360.method2670(var10, var12.method2678());
                }
                if (arg1.field4365.field4065[arg1.field4364] < 0) {
                    arg1.field4360.method2679(-1);
                }
                var12.method2668(var10);
                var12.method452(arg2, arg5, arg4 - arg5);
                if (var12.method2672()) {
                    this.field972.method2792(var12);
                }
            }
        }
        field964++;
        arg1.field4360.method452(arg2, arg5, arg3);
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "()Ler;")
    public final class55 method453() {
        field967++;
        class319 var1;
        do {
            var1 = (class319) this.field966.method641(false);
            if (var1 == null) {
                return null;
            }
        } while (var1.field4360 == null);
        return var1.field4360;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "([III)V")
    public final void method452(int[] arg0, int arg1, int arg2) {
        field960++;
        this.field972.method452(arg0, arg1, arg2);
        for (class319 var4 = (class319) this.field966.method646(48); var4 != null; var4 = (class319) this.field966.method641(false)) {
            if (!this.field961.method1378(var4, 126)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field4375 >= var6) {
                        this.method506((byte) 48, var4, arg0, var6, var5 + var6, var5);
                        var4.field4375 -= var6;
                        break;
                    }
                    this.method506((byte) 15, var4, arg0, var4.field4375, var5 + var6, var5);
                    var5 += var4.field4375;
                    var6 -= var4.field4375;
                } while (!this.field961.method1354(var6, -129, var4, arg0, var5));
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lom;)V")
    public class65(class210 arg0) {
        this.field961 = arg0;
    }

    static {
        new class442("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field969 = new class442("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");
    }
}
