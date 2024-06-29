import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public abstract class class43 {

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "I")
    public int field626;

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "I")
    public int field633;

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "I")
    public int field634;

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "Loa;")
    public static class167 field635;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "[I")
    public static int[] field625;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "[J")
    public static long[] field624;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZIZIII)V", line = 4)
    public static final void method273(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field628++;
        if (arg0) {
            return;
        }
        long var6 = (long) ((arg2 ? Integer.MIN_VALUE : 0) | arg5);
        class378 var8 = (class378) class24.field431.method2085(var6, -5423);
        if (var8 == null) {
            var8 = new class378();
            class24.field431.method2096(var6, var8, (byte) 76);
        }
        if (var8.field4901.length <= arg4) {
            int[] var9 = new int[arg4 + 1];
            int[] var10 = new int[arg4 + 1];
            for (int var11 = 0; var11 < var8.field4901.length; var11++) {
                var9[var11] = var8.field4901[var11];
                var10[var11] = var8.field4905[var11];
            }
            for (int var12 = var8.field4901.length; var12 < arg4; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field4905 = var10;
            var8.field4901 = var9;
        }
        var8.field4901[arg4] = arg1;
        var8.field4905[arg4] = arg3;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)Z", line = 63)
    public final boolean method274(int arg0) {
        field630++;
        if (arg0 != 5777) {
            this.method276(-54);
        }
        return (this.field634 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)Z", line = 74)
    public final boolean method275(int arg0) {
        if (arg0 == 1) {
            field631++;
            return (this.field634 & 0x2) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(I)Z", line = 89)
    public final boolean method276(int arg0) {
        field629++;
        if (arg0 == 0) {
            return (this.field634 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V", line = 102)
    public static void method277(byte arg0) {
        field625 = null;
        field624 = null;
        if (arg0 != 98) {
            field635 = null;
        }
        field635 = null;
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(I)Z", line = 124)
    public final boolean method278(int arg0) {
        if (arg0 != 1) {
            method273(true, 117, false, 4, 30, -77);
        }
        field627++;
        return (this.field634 & 0x8) != 0;
    }
}
