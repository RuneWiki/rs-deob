import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class86 {

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field1471 = 0;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "F")
    public static float field1474;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILqs;Lza;)V")
    public static final void method614(int arg0, class496 arg1, class491 arg2) {
        field1472++;
        if (class187.field2934) {
            return;
        }
        arg2.method891(0);
        class322.field5058 = arg2.method837(class523.method3085(arg1, class204.field3242), true);
        class322.field5058.method1039((class358.field5581 - class322.field5058.method200()) / arg0, (class49.field825 - class322.field5058.method198()) / 2);
        class328.field5172 = arg2.method837(class523.method3085(arg1, class90.field1500), true);
        class328.field5172.method1039((class358.field5581 - class328.field5172.method200()) / 2, 18);
        class187.field2934 = true;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I[Ljava/lang/String;ZI[S)V")
    public static final void method615(int arg0, String[] arg1, boolean arg2, int arg3, short[] arg4) {
        if (arg3 < arg0) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg3;
            String var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            short var8 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var8;
            for (int var9 = arg3; var9 < arg0; var9++) {
                if (var7 == null || arg1[var9] != null && arg1[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    short var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg4[arg0] = arg4[var6];
            arg4[var6] = var8;
            method615(var6 - 1, arg1, true, arg3, arg4);
            method615(arg0, arg1, arg2, var6 + 1, arg4);
        }
        field1470++;
        if (!arg2) {
            field1474 = 0.94013256F;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V")
    public static final void method616(int arg0, int arg1) {
        field1475++;
        class286.method1863(47);
        int var2 = 101 % ((-arg1 - 73) / 42);
        class247.method1682((byte) 98);
        class68.method457(true, -86, arg0);
        class318.method2018(class536.field7881, class147.field2392, (byte) 113, class305.field4873);
        class5.method25((byte) -114, class305.field4873, class536.field7881);
        class481.method2830(-88);
        class371.method2341(class359.field5589, 124);
        class408.method2530(17234);
        class494.method2906(-5419);
        if (class32.field515 == 2) {
            class75.method540(-7, 3);
        } else if (class32.field515 == 6) {
            class75.method540(-7, 7);
        } else if (class32.field515 == 9) {
            class75.method540(-7, 10);
            return;
        } else if (class32.field515 == 1) {
            method614(2, class536.field7881, class305.field4873);
            return;
        }
    }
}
