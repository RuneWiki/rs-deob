import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class269 {

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIBI)I")
    public static final int method1890(int arg0, int arg1, byte arg2, int arg3) {
        field4469++;
        int var4 = arg3 & arg0 - 1;
        int var5 = arg3 / arg0;
        if (arg2 != 83) {
            method1892(124, -56, -109, -52, 101);
        }
        int var6 = arg0 - 1 & arg1;
        int var7 = arg1 / arg0;
        int var8 = class209.method1468(var7, arg2 - 203, var5);
        int var9 = class209.method1468(var7, -120, var5 + 1);
        int var10 = class209.method1468(var7 + 1, -125, var5);
        int var11 = class209.method1468(var7 + 1, -127, var5 + 1);
        int var12 = class225.method1591(var8, 65536, var4, arg0, var9);
        int var13 = class225.method1591(var10, arg2 + 65453, var4, arg0, var11);
        return class225.method1591(var12, 65536, var6, arg0, var13);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[Ljava/lang/String;I[SI)V")
    public static final void method1891(int arg0, String[] arg1, int arg2, short[] arg3, int arg4) {
        field4470++;
        if (arg0 < arg4) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg0;
            String var7 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var7;
            short var8 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var8;
            for (int var9 = arg0; var9 < arg4; var9++) {
                if (var7 == null || arg1[var9] != null && (var9 & 0x1) > arg1[var9].compareTo(var7)) {
                    String var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    short var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg1[arg4] = arg1[var6];
            arg1[var6] = var7;
            arg3[arg4] = arg3[var6];
            arg3[var6] = var8;
            method1891(arg0, arg1, 26755, arg3, var6 - 1);
            method1891(var6 + 1, arg1, arg2, arg3, arg4);
        }
        if (arg2 != 26755) {
            method1894((String) null, false);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIII)V")
    public static final void method1892(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class23.field423 <= (arg0 - arg4) && class272.field4552 >= (arg0 + arg4) && arg2 - arg4 >= class55.field972 && class240.field4053 >= arg2 + arg4) {
            class123.method925(-124, arg3, arg0, arg2, arg4);
        } else {
            class236.method1693(arg4, arg3, arg0, arg2, (byte) 101);
        }
        if (arg1 == 1) {
            field4467++;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILlc;)V")
    public static final void method1893(int arg0, class303 arg1) {
        if (arg0 == -3725) {
            class161.method1193(200000, arg1, 2147483640);
            field4465++;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public static final boolean method1894(String arg0, boolean arg1) {
        if (arg1) {
            return false;
        } else {
            field4468++;
            return class61.method423(arg0, 10, true, false);
        }
    }
}
