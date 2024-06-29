import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public abstract class class421 {

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "Z")
    public static volatile boolean field6047 = true;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "Z")
    public static boolean field6049 = false;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Llj;IIIII)V")
    public static final void method2612(class362 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field5282 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                int var8 = class124.field1648[arg1][var6][var7];
                int var9 = 0;
                while (true) {
                    label51: while (true) {
                        if (var9 > 24) {
                            continue label56;
                        }
                        int var10 = var8 >>> var9 & 0xFF;
                        if (var10 <= 0) {
                            continue label56;
                        }
                        class66 var11 = class256.field3438[var10 - 1];
                        for (int var12 = 0; var12 < arg0.field5282; var12++) {
                            if (arg0.field5280[var12] == var11) {
                                var9 += 8;
                                continue label51;
                            }
                        }
                        arg0.field5280[arg0.field5282++] = var11;
                        if (arg0.field5282 == 4) {
                            break label58;
                        }
                        var9 += 8;
                    }
                }
            }
        }
        for (int var13 = arg0.field5282; var13 < 4; var13++) {
            arg0.field5280[var13] = null;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)[B")
    public abstract byte[] method167(int arg0);

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILnf;)V")
    public static final void method2613(int arg0, class345 arg1) {
        arg1.field5071 = false;
        field6048++;
        if (arg1.field5072 != null) {
            arg1.field5072.field228 = 0;
        }
        for (class345 var2 = arg1.method273(); var2 != null; var2 = arg1.method268()) {
            method2613(29314, var2);
        }
        if (arg0 != 29314) {
            method2612((class362) null, 18, 11, 40, -110, -46);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "([BB)V")
    public abstract void method166(byte[] arg0, byte arg1);
}
