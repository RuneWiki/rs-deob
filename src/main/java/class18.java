import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class18 extends class404 {

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
    private int field241 = 1;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
    private int field243 = 1;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    private int field242 = 204;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "Lsk;")
    public static class423 field239 = new class423("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
    public static int field246 = 0;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "[Lig;")
    public static class154[] field244;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/String;IIIIIII)V")
    public static final void method94(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field247;
        class26 var8 = new class26();
        var8.field345 = arg1;
        var8.field338 = arg4;
        var8.field343 = class369.field5424 + arg5;
        var8.field339 = arg7;
        var8.field347 = arg6;
        if (arg2 != 4096) {
            method94((String) null, 45, 121, 51, 27, -110, 87, 115);
        }
        var8.field341 = arg0;
        var8.field346 = arg3;
        class310.field4673.method1321((byte) 0, var8);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(III)Loh;")
    public static final class268 method95(int arg0, int arg1, int arg2) {
        if (class321.field4830[arg0][arg1][arg2] == null) {
            boolean var3 = class321.field4830[0][arg1][arg2] != null && class321.field4830[0][arg1][arg2].field4049 != null;
            if (var3 && arg0 >= class483.field7381 - 1) {
                return null;
            }
            class162.method1036(arg0, arg1, arg2);
        }
        return class321.field4830[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field248;
        int[] var3 = super.field5870.method372(arg1, (byte) -123);
        if (super.field5870.field810) {
            for (int var4 = 0; ~var4 > ~class431.field6348; ++var4) {
                int var5 = class167.field2594[var4];
                int var6 = class289.field4381[arg1];
                int var7 = this.field243 * var5 >> 12;
                int var8 = this.field241 * var6 >> 12;
                int var9 = var5 % (4096 / this.field243) * this.field243;
                int var10 = var6 % (4096 / this.field241) * this.field241;
                if (~this.field242 < ~var10) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var9 < this.field242) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~var9 > ~this.field242) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        if (arg0 >= -47) {
            method97((class179) null, -58, (class179) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class18() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILha;I)V")
    public final void method87(int arg0, class40 arg1, int arg2) {
        if (arg0 != 0) {
            this.field241 = -106;
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field242 = arg1.method254((byte) -70);
                }
            } else {
                this.field241 = arg1.method257((byte) 104);
            }
        } else {
            this.field243 = arg1.method257((byte) 57);
        }
        ++field240;
    }

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "(I)V")
    public static void method96(int arg0) {
        if (arg0 == 1) {
            field244 = null;
            field239 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lol;ILol;)V")
    public static final void method97(class179 arg0, int arg1, class179 arg2) {
        if (arg1 == 1839) {
            if (arg0.field2795 != null) {
                arg0.method1121(false);
            }
            ++field245;
            arg0.field2799 = arg2;
            arg0.field2795 = arg2.field2795;
            arg0.field2795.field2799 = arg0;
            arg0.field2799.field2795 = arg0;
        }
    }
}
