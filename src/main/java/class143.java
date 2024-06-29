import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class143 extends class163 {

    @OriginalMember(owner = "client!kt", name = "N", descriptor = "[I")
    public static int[] field2507 = new int[2];

    @OriginalMember(owner = "client!kt", name = "I", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!kt", name = "K", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!kt", name = "L", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!kt", name = "O", descriptor = "Lom;")
    public static class344 field2508;

    @OriginalMember(owner = "client!kt", name = "J", descriptor = "[B")
    private byte[] field2504;

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "()V")
    public class143() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(II)V")
    public static final void method1148(int arg0, int arg1) {
        field2506++;
        class126.method1085((byte) -62);
        int var2 = class107.field1851.method1667(arg0, (byte) 103).field1632;
        if (arg1 != 10090) {
            method1150((byte) -66);
        }
        if (var2 == 0) {
            return;
        }
        int var3 = class113.field2038.field2410[arg0];
        if (var2 == 6) {
            class389.field5682 = var3;
        }
        if (var2 == 5) {
            class75.field1532 = var3;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIII)[B")
    public final byte[] method1149(int arg0, int arg1, int arg2, int arg3) {
        this.field2504 = new byte[arg0 * arg2 * 2 * arg1];
        if (arg3 != 4096) {
            field2507 = null;
        }
        field2503++;
        this.method1439(arg0, arg2, true, arg1);
        return this.field2504;
    }

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "(B)V")
    public static void method1150(byte arg0) {
        if (arg0 == 110) {
            field2507 = null;
            field2508 = null;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IBB)V")
    public final void method1151(int arg0, byte arg1, byte arg2) {
        field2505++;
        int var4 = arg0 * 2;
        int var5 = arg1 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field2504[var10001] = (byte) (var5 * 3 >> 5);
        this.field2504[var6] = (byte) (var5 * 3 >> 5);
        if (arg2 != -100) {
            this.method1151(40, (byte) -105, (byte) 39);
        }
    }
}
