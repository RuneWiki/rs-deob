import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public abstract class class250 {

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "Z")
    public static boolean field3508 = false;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "[B")
    public static byte[] field3512 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "Ltm;")
    public static class112 field3510 = new class112("Loading fonts - ", "Lade Schriftsätze - ", "Chargement des polices - ", "Carregando fontes - ");

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "Ltm;")
    public static class112 field3513 = new class112("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
    public static int field3515 = -1;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "Lsm;")
    public static class249 field3514 = new class249();

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)I", line = 6)
    public static final int method1556(int arg0, int arg1) {
        field3511++;
        if (arg0 != 24429) {
            field3508 = true;
        }
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V", line = 32)
    public static void method1557(byte arg0) {
        if (arg0 < 40) {
            method1557((byte) -21);
        }
        field3510 = null;
        field3512 = null;
        field3514 = null;
        field3513 = null;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "([I[JB)V", line = 54)
    public static final void method1558(int[] arg0, long[] arg1, byte arg2) {
        if (arg2 == -21) {
            field3509++;
            class411.method2408(arg0, 0, arg1.length - 1, (byte) -107, arg1);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
    public abstract void method1374(int arg0);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ldr;)V")
    public abstract void method1376(class250 arg0);

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)V")
    public abstract void method1373(int arg0);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(III)V")
    public abstract void method1380(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(I)V")
    public abstract void method1384(int arg0);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "()V")
    public abstract void method1388();

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(III[I)V")
    public abstract void method1385(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "([I)V")
    public abstract void method1375(int[] arg0);

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(III)V")
    public abstract void method1382(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "(I)V")
    public abstract void method1379(int arg0);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "(I)V")
    public abstract void method1378(int arg0);
}
