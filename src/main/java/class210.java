import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class210 extends OutputStream {

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field2952 = -1;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "Lclient;")
    public static client field2953;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1333(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2956++;
        int var8 = arg6 - arg7;
        int var9 = arg2 + arg7;
        int var10 = arg0 - arg7;
        int var11 = arg4 + arg7;
        if (arg1 != -1) {
            method1334((class282) null, false, (class282) null, (byte) 70);
        }
        for (int var12 = arg4; var12 < var11; var12++) {
            class76.method463(arg2, 0, arg5, arg0, class268.field3919[var12]);
        }
        for (int var13 = arg6; var13 > var8; var13--) {
            class76.method463(arg2, arg1 + 1, arg5, arg0, class268.field3919[var13]);
        }
        for (int var14 = var11; var14 <= var8; var14++) {
            int[] var15 = class268.field3919[var14];
            class76.method463(arg2, 0, arg5, var9, var15);
            class76.method463(var9, 0, arg3, var10, var15);
            class76.method463(var10, 0, arg5, arg0, var15);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lbc;ZLbc;B)V")
    public static final void method1334(class282 arg0, boolean arg1, class282 arg2, byte arg3) {
        class296.field4674 = arg2;
        field2957++;
        if (arg3 <= 82) {
            field2953 = null;
        }
        class93.field1251 = arg0;
        class181.field2576 = arg1;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public static void method1335(int arg0) {
        if (arg0 != -6687) {
            method1335(-26);
        }
        field2953 = null;
    }

    @OriginalMember(owner = "client!h", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field2955++;
        throw new IOException();
    }
}
