import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class287 {

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "[I")
    public static int[] field4293 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field4295 = 999999;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "Ldp;")
    public static class174 field4290;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lri;IIB)V", line = 7)
    public static final void method2022(class98 arg0, int arg1, int arg2, byte arg3) {
        if (arg0.field5620 == arg2 && arg2 != -1) {
            class51 var4 = class113.method974(arg2, (byte) -88);
            int var5 = var4.field817;
            if (var5 == 1) {
                arg0.field5677 = 0;
                arg0.field5647 = arg1;
                arg0.field5665 = 1;
                arg0.field5648 = 0;
                arg0.field5687 = 0;
                class50.method399(arg0.field5687, arg0.field6519, (byte) 122, var4, arg0.field6520, false);
            }
            if (var5 == 2) {
                arg0.field5677 = 0;
            }
        } else if (arg2 == -1 || arg0.field5620 == -1 || class113.method974(arg2, (byte) -71).field840 >= class113.method974(arg0.field5620, (byte) -122).field840) {
            arg0.field5687 = 0;
            arg0.field5647 = arg1;
            arg0.field5665 = 1;
            arg0.field5677 = 0;
            arg0.field5698 = arg0.field5695;
            arg0.field5620 = arg2;
            arg0.field5648 = 0;
            if (arg0.field5620 != -1) {
                class50.method399(arg0.field5687, arg0.field6519, (byte) 79, class113.method974(arg0.field5620, (byte) -124), arg0.field6520, false);
            }
        }
        field4294++;
        if (arg3 != 32) {
            method2024(10);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V", line = 63)
    public static void method2023(byte arg0) {
        field4290 = null;
        field4293 = null;
        if (arg0 != -85) {
            method2024(-105);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V", line = 74)
    public static final void method2024(int arg0) {
        field4292++;
        if (arg0 <= 64) {
            field4295 = -80;
        }
        class390.field5654 = true;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZIIIFIII)[I", line = 86)
    public static final int[] method2025(boolean arg0, int arg1, int arg2, int arg3, float arg4, int arg5, int arg6, int arg7) {
        if (arg7 != -28693) {
            field4293 = null;
        }
        field4291++;
        int[] var8 = new int[arg3];
        class423 var9 = new class423();
        var9.field6162 = (int) (arg4 * 4096.0F);
        var9.field6157 = arg0;
        var9.field6149 = arg6;
        var9.field6163 = arg2;
        var9.field6167 = arg1;
        var9.field6161 = arg5;
        var9.method83(true);
        class106.method941(1, 73, arg3);
        var9.method2658(var8, 5262, 0);
        return var8;
    }
}
