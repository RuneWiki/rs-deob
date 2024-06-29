import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public abstract class class93 {

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "Lai;")
    public static class126 field1527;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I[II[IZ)V", line = 4)
    public static final void method666(int arg0, int[] arg1, int arg2, int[] arg3, boolean arg4) {
        if (!arg4) {
            field1527 = (class126) null;
        }
        if (arg2 > arg0) {
            int var5 = arg0;
            int var6 = (arg0 + arg2) / 2;
            int var7 = arg3[var6];
            arg3[var6] = arg3[arg2];
            arg3[arg2] = var7;
            int var8 = arg1[var6];
            arg1[var6] = arg1[arg2];
            arg1[arg2] = var8;
            for (int var9 = arg0; var9 < arg2; var9++) {
                if (var7 + (var9 & 0x1) < arg3[var9]) {
                    int var10 = arg3[var9];
                    arg3[var9] = arg3[var5];
                    arg3[var5] = var10;
                    int var11 = arg1[var9];
                    arg1[var9] = arg1[var5];
                    arg1[var5++] = var11;
                }
            }
            arg3[arg2] = arg3[var5];
            arg3[var5] = var7;
            arg1[arg2] = arg1[var5];
            arg1[var5] = var8;
            method666(arg0, arg1, var5 - 1, arg3, true);
            method666(var5 + 1, arg1, arg2, arg3, true);
        }
        field1526++;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)I", line = 64)
    public static final int method668(byte arg0) {
        field1524++;
        if (arg0 >= -45) {
            field1527 = (class126) null;
        }
        return class68.field1092.method1839(5459);
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(B)V", line = 84)
    public static void method670(byte arg0) {
        field1527 = null;
        if (arg0 != 19) {
            method666(74, (int[]) null, -89, (int[]) null, true);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method667(Component arg0, int arg1);

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)I")
    public abstract int method669(byte arg0);

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method671(Component arg0, byte arg1);
}
