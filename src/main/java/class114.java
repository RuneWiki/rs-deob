import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class114 {

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static final void method856(int arg0) {
        int var1 = -53 % ((arg0 + 78) / 44);
        field1827++;
        if (class38.field574 != null && class135.field2057 != null) {
            return;
        }
        class135.field2057 = new int[256];
        class38.field574 = new int[256];
        for (int var2 = 0; var2 < 256; var2++) {
            double var3 = (double) var2 / 255.0D * 6.283185307179586D;
            class38.field574[var2] = (int) (Math.sin(var3) * 4096.0D);
            class135.field2057[var2] = (int) (Math.cos(var3) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZIIIIZ)V")
    public static final void method857(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field1824++;
        if (arg3 != -1) {
            method859(-102, 93, -102, -2, -55, 123, 73);
        }
        if (arg0 <= arg5) {
            return;
        }
        int var7 = (arg0 + arg5) / 2;
        int var8 = arg5;
        class468 var9 = class504.field7378[var7];
        class504.field7378[var7] = class504.field7378[arg0];
        class504.field7378[arg0] = var9;
        for (int var10 = arg5; var10 < arg0; var10++) {
            if (class149.method1084(class504.field7378[var10], arg1, arg6, arg4, arg2, ~arg3, var9) <= 0) {
                class468 var11 = class504.field7378[var10];
                class504.field7378[var10] = class504.field7378[var8];
                class504.field7378[var8++] = var11;
            }
        }
        class504.field7378[arg0] = class504.field7378[var8];
        class504.field7378[var8] = var9;
        method857(var8 - 1, arg1, arg2, -1, arg4, arg5, arg6);
        method857(arg0, arg1, arg2, arg3, arg4, var8 + 1, arg6);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(CI)Z")
    public static final boolean method858(char arg0, int arg1) {
        if (arg1 == 18536) {
            field1826++;
            return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIII)I")
    public static final int method859(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg0 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg3;
            arg3 = var7;
        }
        int var8 = arg1 & 0x3;
        field1825++;
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return 1 - (arg5 + arg4 - 7);
        } else if (var8 == 2) {
            return -arg3 - (arg2 - 1 - 7);
        } else {
            if (arg6 != 160) {
                method858(':', -76);
            }
            return arg4;
        }
    }
}
