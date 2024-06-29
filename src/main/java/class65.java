import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public abstract class class65 {

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Lmb;")
    public static class96 field1110 = class243.method1708("Zugewiesener Speicher)3", (byte) 111);

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field1111 = 2301979;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)[B")
    public abstract byte[] method454(int arg0);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lcl;BLcl;)V")
    public static final void method455(class98 arg0, byte arg1, class98 arg2) {
        field1113++;
        if (arg0.field1667 != null) {
            arg0.method740(-22949);
        }
        if (arg1 > 126) {
            arg0.field1667 = arg2;
            arg0.field1666 = arg2.field1666;
            arg0.field1667.field1666 = arg0;
            arg0.field1666.field1667 = arg0;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public static void method456(byte arg0) {
        field1110 = null;
        if (arg0 < 111) {
            field1110 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method457(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= class9.field145 && class162.field2884 >= arg4 && client.field1994 <= arg5 && class9.field149 >= arg7) {
            class29.method191(arg5, arg2, false, arg7, arg1, arg6, arg3, arg4);
        } else {
            class70.method479(arg2, arg1, arg0 + 1, arg5, arg3, arg4, arg7, arg6);
        }
        if (arg0 != -1) {
            method457((byte) -118, -121, 20, 113, 49, -2, 30, -55);
        }
        field1109++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lsj;IZ)V")
    public static final void method458(class168 arg0, int arg1, boolean arg2) {
        int var3 = arg0.field2961;
        field1112++;
        int var4 = (int) arg0.field4304;
        arg0.method1743((byte) 52);
        if (arg2) {
            class52.method400(false, var3);
        }
        class245.method1720((byte) -125, var3);
        class107 var5 = class55.method408(var4, 251234864);
        if (var5 != null) {
            class53.method403(-63, var5);
        }
        int var6 = class73.field1254;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class54.method406(-111, class79.field1346[var7])) {
                class146.method1083(var7, (byte) -87);
            }
        }
        if (arg1 != -22) {
            field1110 = null;
        }
        if (class73.field1254 == 1) {
            class170.field2981 = false;
            class52.method399(true, class232.field3980, class64.field1095, class145.field2574, class55.field950);
        } else {
            class52.method399(true, class232.field3980, class64.field1095, class145.field2574, class55.field950);
            int var8 = class71.field1216.method125(class206.field3538);
            for (int var9 = 0; var9 < class73.field1254; var9++) {
                int var10 = class71.field1216.method125(class93.method656((byte) 66, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class64.field1095 = var8 + 8;
            class232.field3980 = class73.field1254 * 15 + 22;
        }
        if (class107.field1825 != -1) {
            class221.method1517(1, class107.field1825, arg1 + 23);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I[B)V")
    public abstract void method459(int arg0, byte[] arg1);
}
