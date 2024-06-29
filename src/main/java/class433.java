import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class433 {

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    private int field6491 = 0;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public int field6485;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "[Lkp;")
    public class337[] field6486;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field6483;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    public static int field6493;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "J")
    private long field6484;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "Lkp;")
    private class337 field6481;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "Lkp;")
    private class337 field6492;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B[Lkp;)I")
    public final int method2599(byte arg0, class337[] arg1) {
        field6488++;
        int var3 = 0;
        if (arg0 != -72) {
            return -83;
        }
        for (int var4 = 0; var4 < this.field6485; var4++) {
            class337 var5 = this.field6486[var4];
            for (class337 var6 = var5.field4737; var6 != var5; var6 = var6.field4737) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)I")
    public final int method2600(int arg0) {
        field6487++;
        if (arg0 > -120) {
            this.field6481 = null;
        }
        return this.field6485;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
    public final void method2601(int arg0) {
        for (int var2 = 0; var2 < this.field6485; var2++) {
            class337 var3 = this.field6486[var2];
            while (true) {
                class337 var4 = var3.field4737;
                if (var3 == var4) {
                    break;
                }
                var4.method2049(-125);
            }
        }
        if (arg0 == -21859) {
            field6489++;
            this.field6481 = null;
            this.field6492 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)I")
    public final int method2602(int arg0) {
        field6482++;
        int var2 = arg0;
        for (int var3 = 0; var3 < this.field6485; var3++) {
            class337 var4 = this.field6486[var3];
            for (class337 var5 = var4.field4737; var5 != var4; var5 = var5.field4737) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)Lkp;")
    public final class337 method2603(int arg0) {
        field6479++;
        if (this.field6491 > 0 && this.field6486[this.field6491 - 1] != this.field6492) {
            class337 var2 = this.field6492;
            this.field6492 = var2.field4737;
            return var2;
        } else if (arg0 <= 28) {
            return null;
        } else {
            while (this.field6485 > this.field6491) {
                class337 var3 = this.field6486[this.field6491++].field4737;
                if (this.field6486[this.field6491 - 1] != var3) {
                    this.field6492 = var3.field4737;
                    return var3;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lvg;III)V")
    public static final void method2604(class38 arg0, int arg1, int arg2, int arg3) {
        field6493++;
        if (class283.field4065 != null || class207.field2963 || arg0 == null || class49.method306(arg0, -7692) == null) {
            return;
        }
        class283.field4065 = arg0;
        class163.field2399 = class49.method306(arg0, arg3 - 7692);
        class456.field6744 = arg3;
        class479.field7038 = arg1;
        class141.field2117 = arg2;
        class229.field3428 = false;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZJ)Lkp;")
    public final class337 method2605(boolean arg0, long arg1) {
        this.field6484 = arg1;
        if (arg0) {
            this.field6492 = null;
        }
        field6478++;
        class337 var4 = this.field6486[(int) (arg1 & (long) (this.field6485 - 1))];
        for (this.field6481 = var4.field4737; this.field6481 != var4; this.field6481 = this.field6481.field4737) {
            if (this.field6481.field4736 == arg1) {
                class337 var5 = this.field6481;
                this.field6481 = this.field6481.field4737;
                return var5;
            }
        }
        this.field6481 = null;
        return null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lkp;JI)V")
    public final void method2606(class337 arg0, long arg1, int arg2) {
        field6480++;
        if (arg2 != 0) {
            this.method2606(null, -120L, 12);
        }
        if (arg0.field4735 != null) {
            arg0.method2049(arg2 ^ 0xFFFFFFB1);
        }
        class337 var5 = this.field6486[(int) ((long) (this.field6485 - 1) & arg1)];
        arg0.field4735 = var5.field4735;
        arg0.field4737 = var5;
        arg0.field4735.field4737 = arg0;
        arg0.field4736 = arg1;
        arg0.field4737.field4735 = arg0;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method2607(String arg0, int arg1) {
        field6490++;
        String var2 = class485.method2876(class439.method2649((byte) 36, arg0), (byte) 22);
        if (arg1 == -1) {
            if (var2 == null) {
                var2 = "";
            }
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I)V")
    public class433(int arg0) {
        this.field6485 = arg0;
        this.field6486 = new class337[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class337 var3 = this.field6486[var2] = new class337();
            var3.field4737 = var3;
            var3.field4735 = var3;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)Lkp;")
    public final class337 method2608(boolean arg0) {
        field6483++;
        if (arg0) {
            this.field6491 = 0;
            return this.method2603(75);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)Lkp;")
    public final class337 method2609(int arg0) {
        int var2 = -48 / ((-arg0 - 60) / 47);
        field6477++;
        if (this.field6481 == null) {
            return null;
        }
        class337 var3 = this.field6486[(int) ((long) (this.field6485 - 1) & this.field6484)];
        while (this.field6481 != var3) {
            if (this.field6481.field4736 == this.field6484) {
                class337 var4 = this.field6481;
                this.field6481 = this.field6481.field4737;
                return var4;
            }
            this.field6481 = this.field6481.field4737;
        }
        this.field6481 = null;
        return null;
    }

    static {
        new class475("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
    }
}
