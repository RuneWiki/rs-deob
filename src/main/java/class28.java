import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public abstract class class28 extends class431 {

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "[S")
    public static short[] field331 = new short[] { 30, 23, 13, 11, 60, 59, 6, 46 };

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "[I")
    public static int[] field334;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "Lks;")
    public static class305 field333;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public static int field335;

    static {
        new class234("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field334 = new int[] { 1, 2, 4, 8 };
        field333 = new class305();
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BIII)I", line = 7)
    public static final int method191(byte arg0, int arg1, int arg2, int arg3) {
        field332++;
        if (arg0 >= -57) {
            field333 = null;
        }
        int var4 = ((arg2 & 0xFF00) * arg1 & 0xFF0000 | (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) >>> 8;
        int var5 = 255 - arg1;
        return (((arg3 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg3 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V", line = 28)
    public static void method193(boolean arg0) {
        field334 = null;
        if (!arg0) {
            field333 = null;
            field331 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZI)V", line = 48)
    public static final void method196(boolean arg0, int arg1) {
        field330++;
        if (arg0) {
            if (class155.field2310 != -1) {
                class323.method2055((byte) -18, class155.field2310);
            }
            for (class293 var2 = (class293) class70.field993.method2592(121); var2 != null; var2 = (class293) class70.field993.method2589(-1)) {
                if (!var2.method2674(26931)) {
                    var2 = (class293) class70.field993.method2592(125);
                    if (var2 == null) {
                        break;
                    }
                }
                class218.method1568(false, -123, true, var2);
            }
            class155.field2310 = -1;
            class70.field993 = new class412(8);
            class201.method1408((byte) -127);
            class155.field2310 = class444.field6528;
            class128.method939(465824240, false);
            class152.method1044((byte) 97);
            class192.method1352(class155.field2310);
        }
        if (arg1 >= -69) {
            method196(true, 98);
        }
        class393.field5869 = true;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)I")
    public abstract int method190(int arg0);

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "(I)J")
    public abstract long method192(int arg0);

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "(I)I")
    public abstract int method194(int arg0);

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)I")
    public abstract int method195(byte arg0);
}
