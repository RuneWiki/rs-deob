import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 {

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "I")
    public int field15 = -1;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
    public int field10;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public int field12;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
    public int field13;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
    public int field14;

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "I")
    public int field16;

    @OriginalMember(owner = "client!dp", name = "l", descriptor = "I")
    public int field17;

    @OriginalMember(owner = "client!dp", name = "m", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public int field6;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public int field8;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field9;

    static {
        new class44("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIIIIIIII)V", line = 3)
    public static final void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == arg2 && arg7 == arg9 && arg4 == arg8 && arg3 == arg6) {
            class287.method1839(arg7, arg1, arg3, 18938, arg0, arg8);
        } else {
            int var10 = arg0;
            int var11 = arg7;
            int var12 = arg0 * 3;
            int var13 = arg7 * 3;
            int var14 = arg2 * 3;
            int var15 = arg9 * 3;
            int var16 = arg4 * 3;
            int var17 = arg6 * 3;
            int var18 = arg8 + var14 - var16 - arg0;
            int var19 = arg3 + var15 - var17 - arg7;
            int var20 = var16 - var14 - (var14 - var12);
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg0;
                int var34 = arg7 + (var28 + var32 + var30 >> 12);
                class287.method1839(var11, arg1, var34, 18938, var10, var33);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg5 != -27192) {
            method9(null, -109);
        }
        field11++;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 79)
    public static final void method9(String arg0, int arg1) {
        field9++;
        if (class248.field3713 == null) {
            return;
        }
        class228.method1528(true, class317.field4712);
        class475.field6920++;
        class276.field4124.method3048(-2034159384, class132.method966(arg0, 10240));
        int var2 = 127 / ((29 - arg1) / 60);
        class276.field4124.method3057((byte) -28, arg0);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ltf;B)Ltf;", line = 113)
    public static final class198 method10(class198 arg0, byte arg1) {
        field7++;
        if (arg0.field3033 != -1) {
            return class154.method1087(arg0.field3033, 2);
        }
        if (arg1 != -34) {
            method9(null, 11);
        }
        int var2 = arg0.field3016 >>> 16;
        class239 var3 = new class239(class220.field3370);
        for (class541 var4 = (class541) var3.method1580(false); var4 != null; var4 = (class541) var3.method1582(true)) {
            if (var4.field7955 == var2) {
                return class154.method1087((int) var4.field863, 2);
            }
        }
        return null;
    }
}
