import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public abstract class class48 {

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public int field686;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public int field690;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "Lct;")
    public static class285 field689 = new class285(77, -1);

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "Lsh;")
    public static class472 field692 = new class472(77, 5);

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "Lsh;")
    public static class472 field695;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public static int field694;

    static {
        new class332("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        new class332("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field695 = new class472(26, 6);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)I", line = 4)
    public static final int method348(byte arg0, int arg1) {
        field688++;
        int var2 = ((arg1 & 0xAAAAAAAA) >>> 1) + (arg1 & 0x55555555);
        int var3 = (var2 >>> 2 & 0x73333333) + (var2 & 0x33333333);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        if (arg0 != 116) {
            method350(48, 119, -59, -100, 88, -89);
        }
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V", line = 26)
    public static final void method349(int arg0) {
        field687++;
        if (arg0 != -4) {
            field695 = null;
        }
        int var1 = class337.field5038.method2213(124, class170.field2424);
        if (var1 == 0) {
            class134.field1954 = null;
            class5.method38(0, 118);
        } else if (var1 == 1) {
            class96.method755((byte) 0, true);
            class5.method38(512, arg0 + 127);
            if (class246.field3532 != null) {
                class285.method1822((byte) 44);
            }
        } else {
            class96.method755((byte) (class281.field4249 - 4 & 0xFF), true);
            class5.method38(2, 83);
        }
        class68.field923 = class486.field6836;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIII)V", line = 61)
    public static final void method350(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class306.field4562 = arg2;
        class88.field1246 = arg5;
        class251.field3622 = arg3;
        class358.field5438 = arg4;
        class15.field210 = arg1;
        field691++;
        if (arg0 != -3073) {
            method351((byte) 108);
        }
        if (class88.field1246 >= 100) {
            int var6 = class306.field4562 * 128 + 64;
            int var7 = class251.field3622 * 128 + 64;
            int var8 = class25.method219(48602855, class486.field6836, var7, var6) - class15.field210;
            int var9 = var6 - class68.field920;
            int var10 = var8 - class344.field5191;
            int var11 = var7 - class200.field3027;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + (var11 * var11)));
            class283.field4287 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class433.field6156 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            class32.field425 = 0;
            if (class283.field4287 < 1024) {
                class283.field4287 = 1024;
            }
            if (class283.field4287 > 3072) {
                class283.field4287 = 3072;
            }
        }
        class469.field6596 = 2;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V", line = 108)
    public static void method351(byte arg0) {
        if (arg0 == 45) {
            field695 = null;
            field689 = null;
            field692 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(II)V", line = 131)
    public class48(int arg0, int arg1) {
        this.field686 = arg0;
        this.field690 = arg1;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)I")
    public abstract int method204(int arg0, int arg1);

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)V")
    public abstract void method198(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lfq;IIIIZ)Z")
    public abstract boolean method202(class87 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILfq;)Lfq;")
    public abstract class87 method197(int arg0, int arg1, class87 arg2);

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lma;[I)V")
    public abstract void method196(class233 arg0, int[] arg1);

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method203(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(Lfq;IIIIZ)V")
    public abstract void method200(class87 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(Lfq;IIIIZ)V")
    public abstract void method207(class87 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)V")
    public abstract void method193(int arg0, int arg1);

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "()V")
    public abstract void method194();

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method205(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method201(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(II)I")
    public abstract int method199(int arg0, int arg1);
}
