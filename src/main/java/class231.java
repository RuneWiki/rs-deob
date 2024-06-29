import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class231 extends class35 {

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "S")
    public short field3393;

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "Lo;")
    public static class332 field3394 = new class332("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!tt", name = "p", descriptor = "Lo;")
    public static class332 field3396 = new class332("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!tt", name = "q", descriptor = "I")
    public static int field3397 = -1;

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!tt", name = "r", descriptor = "Lui;")
    public static class451 field3398;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "(I)V")
    public static void method1515(int arg0) {
        field3396 = null;
        field3398 = null;
        if (arg0 == -1) {
            field3394 = null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIBII)V")
    public static final void method1516(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg4 <= class296.field4443 && class176.field2503 <= arg0) {
            boolean var6;
            if (arg1 < class293.field4420) {
                var6 = false;
                arg1 = class293.field4420;
            } else if (arg1 <= class119.field1643) {
                var6 = true;
            } else {
                arg1 = class119.field1643;
                var6 = false;
            }
            boolean var7;
            if (class293.field4420 > arg2) {
                var7 = false;
                arg2 = class293.field4420;
            } else if (arg2 > class119.field1643) {
                arg2 = class119.field1643;
                var7 = false;
            } else {
                var7 = true;
            }
            if (arg4 < class176.field2503) {
                arg4 = class176.field2503;
            } else {
                class345.method2125(false, class49.field723[arg4++], arg1, arg2, arg5);
            }
            if (arg0 > class296.field4443) {
                arg0 = class296.field4443;
            } else {
                class345.method2125(false, class49.field723[arg0--], arg1, arg2, arg5);
            }
            if (var6 && var7) {
                for (int var8 = arg4; var8 <= arg0; var8++) {
                    int[] var9 = class49.field723[var8];
                    var9[arg1] = var9[arg2] = arg5;
                }
            } else if (var6) {
                for (int var11 = arg4; var11 <= arg0; var11++) {
                    class49.field723[var11][arg1] = arg5;
                }
            } else if (var7) {
                for (int var10 = arg4; var10 <= arg0; var10++) {
                    class49.field723[var10][arg2] = arg5;
                }
            }
        }
        if (arg3 == 36) {
            field3392++;
        }
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "()V")
    public class231() {
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(S)V")
    public class231(short arg0) {
        this.field3393 = arg0;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(III)V")
    public static final void method1517(int arg0, int arg1, int arg2) {
        field3395++;
        if (class161.method1094(2007241424, arg0)) {
            class32.method270(class467.field6572[arg0], arg1, (byte) 122);
            if (arg2 != -1) {
                method1515(-126);
            }
        }
    }
}
