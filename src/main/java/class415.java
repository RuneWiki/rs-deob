import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public abstract class class415 {

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "Lqo;")
    public static class141 field6218 = new class141(512);

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "[I")
    public static int[] field6220 = new int[2];

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "Lui;")
    public static class375 field6223 = new class375(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "[I")
    public static int[] field6224 = new int[8];

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "Lpg;")
    public static class492 field6225 = new class492(28, 0);

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "Lui;")
    public static class375 field6226 = new class375("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    public static int field6221;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IFIFIILut;FFFI)[B", line = 7)
    public static final byte[] method2515(int arg0, float arg1, int arg2, float arg3, int arg4, int arg5, class462 arg6, float arg7, float arg8, float arg9, int arg10) {
        field6222++;
        if (arg0 < 68) {
            field6226 = null;
        }
        byte[] var11 = new byte[arg2 * arg10 * arg5];
        class493.method2926(arg3, 0, 0, arg10, arg4, arg7, arg5, arg8, arg1, arg2, var11, arg9, arg6);
        return var11;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(II)I", line = 24)
    public static final int method2516(int arg0, int arg1) {
        field6221++;
        int var2 = 86 / ((arg1 + 45) / 39);
        int var3 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var4 = arg0 * 6 - 61440;
        int var5 = (arg0 * var4 >> 12) + 40960;
        return var3 * var5 >> 12;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V", line = 41)
    public static void method2517(byte arg0) {
        field6223 = null;
        field6226 = null;
        field6225 = null;
        field6224 = null;
        if (arg0 <= 68) {
            field6225 = null;
        }
        field6218 = null;
        field6220 = null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BII)Z", line = 66)
    public static final boolean method2518(byte arg0, int arg1, int arg2) {
        field6219++;
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg0 != -13) {
            field6224 = null;
        }
        class130 var3 = class56.field755.method2031(arg0 ^ 0xFFFFFF8D, arg2);
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method836(0, arg1);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lpj;I)V", line = 87)
    public static final void method2519(class507 arg0, int arg1) {
        if (arg1 != 16642) {
            field6225 = null;
        }
        arg0.field7548 = null;
        field6217++;
        int var2 = arg0.field7549.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field7549[var3].field2315 = false;
        }
        class380[] var4 = class349.field5436;
        synchronized (class349.field5436) {
            if (class349.field5436.length > var2 && class190.field2659[var2] < 200) {
                class349.field5436[var2].method2353(arg0, -9798);
                int var10002 = class190.field2659[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)I")
    public abstract int method1424(int arg0, int arg1);

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)Lto;")
    public abstract class158 method1419(int arg0);

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(II)V")
    public abstract void method1418(int arg0, int arg1);

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZI)[B")
    public abstract byte[] method1423(boolean arg0, int arg1);
}
