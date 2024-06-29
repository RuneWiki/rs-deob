import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class537 {

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "B")
    private byte field7861;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public int field7857;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public int field7862;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public int field7854;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public int field7860;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public int field7856;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "Z")
    public static boolean field7864 = false;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "Lqu;")
    public static class219 field7859 = new class219(79, 4);

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field7865 = 0;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field7855;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field7858;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field7863;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field7866;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lsc;IILza;Lqg;ILho;B)V")
    public static final void method3182(class29 arg0, int arg1, int arg2, class497 arg3, class210 arg4, int arg5, class224 arg6, byte arg7) {
        field7863++;
        int var8 = arg6.field3765 - (arg5 / 2) - 5;
        int var9 = arg1 + 2;
        if (arg4.field3250 != 0) {
            arg3.method3042(arg0.method189() * arg2 + arg1 + 1 - var9, (byte) -103, var9, arg4.field3250, var8, arg5 + 10);
        }
        if (arg4.field3252 != 0) {
            arg3.method3040(arg4.field3252, true, arg0.method189() * arg2 + arg1 + 1 - var9, var9, var8, arg5 + 10);
        }
        int var10 = arg4.field3257;
        if (arg6.field3762 && arg4.field3248 != -1) {
            var10 = arg4.field3248;
        }
        for (int var11 = 0; var11 < arg2; var11++) {
            String var12 = class159.field2171[var11];
            if (var11 < arg2 - 1) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg0.method190(arg3, var12, arg6.field3765, arg1, var10, true);
            arg1 += arg0.method189();
        }
        if (arg7 <= 26) {
            field7866 = 33;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static void method3183(int arg0) {
        field7859 = null;
        if (arg0 != -1) {
            method3182(null, -60, -75, null, null, -46, null, (byte) -112);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)I")
    public final int method3184(boolean arg0) {
        field7855++;
        return arg0 ? -98 : this.field7861 & 0x7;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
    public class537() {
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lhw;)V")
    public class537(class208 arg0) {
        this.field7861 = arg0.method1427(false);
        this.field7857 = arg0.method1455(-3387);
        this.field7862 = arg0.method1436((byte) 96);
        this.field7854 = arg0.method1436((byte) 88);
        this.field7860 = arg0.method1436((byte) 91);
        this.field7856 = arg0.method1436((byte) 88);
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)I")
    public final int method3185(int arg0) {
        if (arg0 == -18230) {
            field7858++;
            return (this.field7861 & 0x8) == 8 ? 1 : 0;
        } else {
            return -85;
        }
    }

    static {
        new class213("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    }
}
