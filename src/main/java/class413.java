import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class413 extends class227 {

    @OriginalMember(owner = "client!ht", name = "K", descriptor = "I")
    private int field5896 = 204;

    @OriginalMember(owner = "client!ht", name = "O", descriptor = "I")
    private int field5900 = 1;

    @OriginalMember(owner = "client!ht", name = "J", descriptor = "I")
    private int field5895 = 1;

    @OriginalMember(owner = "client!ht", name = "Q", descriptor = "Lho;")
    public static class103 field5902 = new class103(81, 2);

    @OriginalMember(owner = "client!ht", name = "I", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!ht", name = "L", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!ht", name = "M", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!ht", name = "N", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!ht", name = "P", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!ht", name = "H", descriptor = "Ltu;")
    public static class233 field5893;

    @OriginalMember(owner = "client!ht", name = "S", descriptor = "Lfo;")
    public static class361 field5904;

    @OriginalMember(owner = "client!ht", name = "R", descriptor = "[I")
    public static int[] field5903;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)[I")
    public final int[] method62(int arg0, int arg1) {
        ++field5901;
        int[] var3 = super.field3068.method1970(arg1, (byte) 106);
        if (arg0 != 15811) {
            method2523(true);
        }
        if (super.field3068.field4480) {
            for (int var4 = 0; ~var4 > ~class446.field6486; ++var4) {
                int var5 = class4.field37[var4];
                int var6 = class190.field2457[arg1];
                int var7 = this.field5900 * var5 >> 12;
                int var8 = this.field5895 * var6 >> 12;
                int var9 = var5 % (4096 / this.field5900) * this.field5900;
                int var10 = var6 % (4096 / this.field5895) * this.field5895;
                if (var10 < this.field5896) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field5896 < ~var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field5896 < ~var9) {
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
        return var3;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lug;II)V")
    public final void method61(class396 arg0, int arg1, int arg2) {
        ++field5894;
        if (arg1 != 487215116) {
            method2523(true);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field5896 = arg0.method2386(-23648);
                }
            } else {
                this.field5895 = arg0.method2388((byte) -124);
            }
        } else {
            this.field5900 = arg0.method2388((byte) -123);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljk;Z)V")
    public static final void method2521(class450 arg0, boolean arg1) {
        if (!arg1) {
            ++field5899;
            if (~class319.field4257 == ~arg0.field6627) {
                class442.field6427[arg0.field6642] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "(II)I")
    public static final int method2522(int arg0, int arg1) {
        if (arg1 != -22015) {
            method2524(-38, -63, -84);
        }
        ++field5898;
        return 255 & arg0;
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "()V")
    public class413() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(Z)V")
    public static void method2523(boolean arg0) {
        field5893 = null;
        if (arg0) {
            method2524(-34, -100, 92);
        }
        field5903 = null;
        field5902 = null;
        field5904 = null;
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "(III)Z")
    public static final boolean method2524(int arg0, int arg1, int arg2) {
        int var3 = class505.field7340[arg0][arg1][arg2];
        if (-class292.field3861 == var3) {
            return false;
        } else if (class292.field3861 == var3) {
            return true;
        } else {
            int var4 = arg1 << class351.field4688;
            int var5 = arg2 << class351.field4688;
            if (class154.method917(var4 + 1, class152.field1993[arg0].method217(arg1, arg2), var5 + 1) && class154.method917(class166.field2152 + var4 - 1, class152.field1993[arg0].method217(arg1 + 1, arg2), var5 + 1) && class154.method917(class166.field2152 + var4 - 1, class152.field1993[arg0].method217(arg1 + 1, arg2 + 1), class166.field2152 + var5 - 1) && class154.method917(var4 + 1, class152.field1993[arg0].method217(arg1, arg2 + 1), class166.field2152 + var5 - 1) && class154.method917(class123.field1595 + var4, class152.field1993[arg0].method217(arg1, arg2), var5 + 1) && class154.method917(class166.field2152 + var4 - 1, class152.field1993[arg0].method217(arg1 + 1, arg2), class123.field1595 + var5) && class154.method917(class123.field1595 + var4, class152.field1993[arg0].method217(arg1, arg2 + 1), class166.field2152 + var5 - 1) && class154.method917(class166.field2152 + var4 - 1, class152.field1993[arg0].method217(arg1, arg2), class123.field1595 + var5) && class154.method917(class123.field1595 + var4, class152.field1993[arg0].method217(arg1, arg2), class123.field1595 + var5)) {
                class505.field7340[arg0][arg1][arg2] = class292.field3861;
                return true;
            } else {
                class505.field7340[arg0][arg1][arg2] = -class292.field3861;
                return false;
            }
        }
    }

    static {
        new class305("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
    }
}
