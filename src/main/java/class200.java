import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class200 extends class305 {

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
    private int field3011 = -32768;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
    private int field3015 = 0;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "I")
    private int field3017 = -1;

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "Z")
    public boolean field3023 = false;

    @OriginalMember(owner = "client!hd", name = "gb", descriptor = "I")
    private int field3038 = 0;

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
    public int field3014;

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "I")
    private int field3022;

    @OriginalMember(owner = "client!hd", name = "ab", descriptor = "Lpp;")
    private class356 field3032;

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "Lsh;")
    public static class472 field3026;

    @OriginalMember(owner = "client!hd", name = "fb", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!hd", name = "bb", descriptor = "Lct;")
    public static class285 field3033;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!hd", name = "V", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!hd", name = "W", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!hd", name = "X", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!hd", name = "Y", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!hd", name = "Z", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!hd", name = "cb", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!hd", name = "db", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "Lwh;")
    public static class389 field3021;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "Lhn;")
    private class59 field3016;

    @OriginalMember(owner = "client!hd", name = "eb", descriptor = "Ljava/lang/String;")
    public static String field3036;

    static {
        new class332((String) null, "Dieses System darf nicht missbraucht werden!", (String) null, (String) null);
        field3026 = new class472(96, -2);
        field3037 = 0;
        field3033 = new class285(36, 11);
        new class332("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
        new class332("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V", line = 3)
    public final void method249(int arg0) {
        if (arg0 <= 56) {
            field3033 = null;
        }
        ++field3012;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)I", line = 14)
    public final int method899(int arg0) {
        ++field3013;
        return arg0 != 0 ? 102 : this.field3011;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILtq;)Lns;", line = 27)
    private final class57 method1352(int arg0, int arg1, class63 arg2) {
        if (arg0 != -1) {
            this.method1356((class63) null, -35, (class57) null);
        }
        ++field3031;
        class188 var4 = class322.field4848.method951(this.field3022, (byte) 107);
        return this.field3023 ? var4.method1296(arg1, arg2, -1, -1, 0, arg0 + -88, class170.field2423) : var4.method1296(arg1, arg2, this.field3038, this.field3017, this.field3015, arg0 ^ 53, class170.field2423);
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 40)
    public class200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
        this.field3014 = arg1 + arg2;
        this.field3022 = arg0;
        int var12 = class322.field4848.method951(this.field3022, (byte) 65).field2862;
        if (var12 != -1) {
            this.field3023 = false;
            this.field3032 = class170.field2423.method1586(var12, (byte) 36);
        } else {
            this.field3023 = true;
        }
        if (~this.field3014 == ~arg2) {
            class210.method1416(this.field3038, super.field4543, false, super.field4545, this.field3032, 15806, super.field4538);
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)Z", line = 65)
    public final boolean method253(int arg0) {
        ++field3010;
        return arg0 > -9;
    }

    @OriginalMember(owner = "client!hd", name = "finalize", descriptor = "()V", line = 87)
    protected final void finalize() {
        ++field3029;
        if (this.field3016 != null) {
            this.field3016.method456();
        }
    }

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "(I)V", line = 98)
    public final void method1353(int arg0) {
        if (arg0 != 0) {
            this.finalize();
        }
        ++field3028;
        if (this.field3016 != null) {
            this.field3016.method456();
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)I", line = 112)
    public static final int method1354(int arg0, byte arg1) {
        if (arg1 != 96) {
            field3027 = 55;
        }
        ++field3009;
        return 255 & arg0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIBLsk;)V", line = 124)
    public static final void method1355(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class309 arg6) {
        ++field3030;
        class345.method2127(arg6.field4543, (byte) 113, arg3, arg0, arg6.field4545, arg4, 0, arg1, arg6.field4538, arg2);
        if (arg5 != 24) {
            method1355(-122, 85, 102, -71, 49, (byte) 67, (class309) null);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ltq;ILns;)V", line = 136)
    private final void method1356(class63 arg0, int arg1, class57 arg2) {
        ++field3034;
        class275[] var4 = arg2.method430();
        class493[] var5 = arg2.method428();
        if ((this.field3016 == null || this.field3016.field819) && (var4 != null || var5 != null)) {
            this.field3016 = new class59(class452.field6418);
        }
        int var6 = -3 % ((arg1 - 19) / 56);
        if (this.field3016 != null) {
            this.field3016.method466(arg0, (long) class452.field6418, var4, var5, false);
            this.field3016.method463(super.field4545, super.field4542, super.field4541, super.field4547, super.field4552);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ltq;III)Z", line = 168)
    public final boolean method259(class63 arg0, int arg1, int arg2, int arg3) {
        int var5 = -89 % ((-59 - arg2) / 58);
        ++field3024;
        return false;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(Ltq;I)Lcj;", line = 178)
    public final class123 method252(class63 arg0, int arg1) {
        ++field3035;
        class57 var3 = this.method1352(-1, 1024, arg0);
        if (var3 == null) {
            return null;
        } else if (arg1 != 2) {
            return null;
        } else {
            class315 var4 = arg0.method565();
            var4.method482(super.field4543, super.field4554, super.field4538);
            if (this.field3016 != null) {
                class268 var5 = this.field3016.method459();
                arg0.method552(var3, var5, var4, (class117) null, 0);
            } else {
                var3.method404(var4, (class117) null, 0);
            }
            this.field3011 = var3.method400();
            this.method1356(arg0, 83, var3);
            return null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V", line = 210)
    public static void method1357(byte arg0) {
        if (arg0 != 111) {
            method1355(76, 103, -9, -80, -11, (byte) 71, (class309) null);
        }
        field3033 = null;
        field3026 = null;
        field3036 = null;
        field3021 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILtq;)V", line = 223)
    public final void method260(int arg0, class63 arg1) {
        ++field3020;
        class57 var3 = this.method1352(-1, arg0, arg1);
        if (var3 != null) {
            this.method1356(arg1, -64, var3);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BZLtq;Lhm;III)V", line = 242)
    public final void method245(byte arg0, boolean arg1, class63 arg2, class352 arg3, int arg4, int arg5, int arg6) {
        if (arg0 >= -41) {
            this.method1356((class63) null, 67, (class57) null);
        }
        ++field3018;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(IB)V", line = 260)
    public final void method1358(int arg0, byte arg1) {
        ++field3019;
        if (!this.field3023) {
            this.field3015 += arg0;
            while (this.field3015 > this.field3032.field5421[this.field3038]) {
                this.field3015 -= this.field3032.field5421[this.field3038];
                ++this.field3038;
                if (~this.field3032.field5389.length >= ~this.field3038) {
                    this.field3023 = true;
                    break;
                }
            }
            if (!this.field3023) {
                class210.method1416(this.field3038, super.field4543, false, super.field4545, this.field3032, 15806, super.field4538);
            }
            if (arg1 != 78) {
                this.field3023 = false;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZIZ)V", line = 291)
    public static final void method1359(boolean arg0, int arg1, boolean arg2) {
        int var3 = -76 / ((72 - arg1) / 51);
        if (arg0) {
            ++class384.field5690;
            class76.method649((byte) 21);
        }
        ++field3025;
        if (arg2) {
            ++class36.field462;
            class489.method2854((byte) 123);
        }
    }
}
