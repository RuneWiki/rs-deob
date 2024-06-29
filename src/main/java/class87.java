import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class87 extends class307 {

    @OriginalMember(owner = "client!hw", name = "B", descriptor = "I")
    private int field1088;

    @OriginalMember(owner = "client!hw", name = "p", descriptor = "I")
    private int field1076;

    @OriginalMember(owner = "client!hw", name = "w", descriptor = "I")
    private int field1083;

    @OriginalMember(owner = "client!hw", name = "z", descriptor = "I")
    private int field1086;

    @OriginalMember(owner = "client!hw", name = "A", descriptor = "I")
    public static int field1087 = -2;

    @OriginalMember(owner = "client!hw", name = "F", descriptor = "Ltn;")
    public static class60 field1092;

    @OriginalMember(owner = "client!hw", name = "q", descriptor = "I")
    private int field1077;

    @OriginalMember(owner = "client!hw", name = "r", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!hw", name = "s", descriptor = "I")
    private int field1079;

    @OriginalMember(owner = "client!hw", name = "t", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!hw", name = "u", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!hw", name = "v", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!hw", name = "x", descriptor = "I")
    private int field1084;

    @OriginalMember(owner = "client!hw", name = "C", descriptor = "I")
    private int field1089;

    @OriginalMember(owner = "client!hw", name = "D", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!hw", name = "E", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!hw", name = "y", descriptor = "[B")
    private byte[] field1085;

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(B)V")
    public final void method625(byte arg0) {
        this.field1089 = 0;
        field1082++;
        if (arg0 >= 56) {
            this.field1079 = 0;
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V")
    public final void method626(byte arg0) {
        this.field1079 >>= 0x4;
        if (arg0 != 90) {
            return;
        }
        field1080++;
        this.field1086 = this.field1083;
        if (this.field1079 < 0) {
            this.field1079 = 0;
        } else if (this.field1079 > 255) {
            this.field1079 = 255;
        }
        this.method631(this.field1089++, (byte) this.field1079, (byte) 66);
        this.field1079 = 0;
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)V")
    public static final void method627(int arg0) {
        int var1 = -98 / ((8 - arg0) / 62);
        if (class151.field2158 != 3) {
            class426.field5989 = class230.field3388;
        }
        field1078++;
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(III)Lna;")
    public static final class35 method628(int arg0, int arg1, int arg2) {
        class239 var3 = class268.field3910[arg0][arg1][arg2];
        return var3 == null || var3.field3493 == null ? null : var3.field3493;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(III)V")
    public final void method629(int arg0, int arg1, int arg2) {
        field1090++;
        if (arg2 == 0) {
            this.field1077 = this.field1076 - (arg0 >= 0 ? arg0 : -arg0);
            this.field1077 = this.field1077 * this.field1077 >> 12;
            this.field1084 = 4096;
            this.field1079 = this.field1077;
        } else {
            this.field1084 = this.field1088 * this.field1077 >> 12;
            if (this.field1084 < 0) {
                this.field1084 = 0;
            } else if (this.field1084 > 4096) {
                this.field1084 = 4096;
            }
            this.field1077 = this.field1076 - (arg0 < 0 ? -arg0 : arg0);
            this.field1077 = this.field1077 * this.field1077 >> 12;
            this.field1077 = this.field1084 * this.field1077 >> 12;
            this.field1079 += this.field1086 * this.field1077 >> 12;
            this.field1086 = this.field1086 * this.field1083 >> 12;
        }
        if (arg1 != 255) {
            method627(-28);
        }
    }

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field1088 = (int) (arg7 * 4096.0F);
        this.field1076 = (int) (arg6 * 4096.0F);
        this.field1086 = this.field1083 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "(I)V")
    public static void method630(int arg0) {
        if (arg0 != -24123) {
            field1087 = 25;
        }
        field1092 = null;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IBB)V")
    public void method631(int arg0, byte arg1, byte arg2) {
        if (arg2 == 66) {
            field1091++;
            this.field1085[arg0] = arg1;
        }
    }

    static {
        new class530("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        field1092 = new class60(38, 7);
    }
}
