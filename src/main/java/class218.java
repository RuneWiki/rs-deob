import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class218 extends class300 {

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "I")
    public static int field2563 = 0;

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "[B")
    private byte[] field2564;

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class218() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)[B")
    public final byte[] method1353(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 65) {
            method1355(86, null);
        }
        this.field2564 = new byte[arg1 * arg3 * arg0 * 2];
        field2568++;
        this.method3433((byte) 18, arg0, arg1, arg3);
        return this.field2564;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIB)V")
    public final void method1201(int arg0, int arg1, byte arg2) {
        field2565++;
        int var4 = arg1 * 2;
        int var5 = arg2 & 0xFF;
        if (arg0 == -256) {
            this.field2564[var4++] = (byte) (var5 * 3 >> 5);
            this.field2564[var4] = (byte) (var5 * 3 >> 5);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIII)V")
    public static final void method1354(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2567++;
        if (arg4 < arg1) {
            class455.method2755(arg0, class4.field49[arg2], (byte) 88, arg1, arg4);
        } else {
            class455.method2755(arg0, class4.field49[arg2], (byte) 50, arg4, arg1);
        }
        if (arg3 != 2) {
            field2563 = 33;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILbn;)V")
    public static final void method1355(int arg0, class468 arg1) {
        if (arg0 != 8) {
            return;
        }
        for (int var2 = 0; var2 < class666.field9157; var2++) {
            int var3 = class432.field5707[var2];
            class521 var4 = class61.field825[var3];
            int var5 = arg1.method2396((byte) -115);
            if ((var5 & 0x20) != 0) {
                var5 += arg1.method2396((byte) 79) << 8;
            }
            if ((var5 & 0x200) != 0) {
                var5 += arg1.method2396((byte) 49) << 16;
            }
            class547.method3221(var4, (byte) -98, arg1, var5, var3);
        }
        field2566++;
    }
}
