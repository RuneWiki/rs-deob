import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class456 extends class695 {

    @OriginalMember(owner = "client!sl", name = "J", descriptor = "[B")
    public static byte[] field6595;

    @OriginalMember(owner = "client!sl", name = "K", descriptor = "I")
    public static int field6596;

    @OriginalMember(owner = "client!sl", name = "E", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!sl", name = "F", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!sl", name = "G", descriptor = "I")
    public static int field6592;

    @OriginalMember(owner = "client!sl", name = "H", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!sl", name = "I", descriptor = "[B")
    private byte[] field6594;

    static {
        int var0 = 0;
        field6595 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field6595[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field6596 = -1;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIB)V", line = 3)
    public static final void method2785(int arg0, int arg1, int arg2, byte arg3) {
        field6591++;
        int var4 = class471.field6781.field6669.method3134(27669) * arg1 >> 8;
        if (arg3 != -75) {
            field6590 = 7;
        }
        if (var4 == 0 || arg0 == -1) {
            return;
        }
        if (!class90.field1607 && class122.field1893 != -1 && class225.method1556(-89) && !class260.method1769(57)) {
            class523.field7409 = class34.method220(111);
            class250 var5 = class184.method1315((byte) 10, class523.field7409);
            class219.method1518(true, 0, var5);
        }
        class348.method2182(0, arg0, false, class586.field8253, var4, false);
        class343.method2174((byte) -95, -1, 255);
        class90.field1607 = true;
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(I)V", line = 35)
    public static void method2786(int arg0) {
        field6595 = null;
        if (arg0 != 12668) {
            field6595 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V", line = 47)
    public class456() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIB)V", line = 50)
    public final void method2787(int arg0, int arg1, byte arg2) {
        field6592++;
        int var4 = arg0 * 2;
        int var5 = arg2 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field6594[var10001] = (byte) (var5 * 3 >> 5);
        this.field6594[var6] = (byte) (var5 * 3 >> 5);
        if (arg1 >= -25) {
            this.method2788(-45, 34, 2, 98);
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(IIII)[B", line = 67)
    public final byte[] method2788(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 <= 101) {
            field6590 = -81;
        }
        this.field6594 = new byte[arg1 * arg2 * arg3 * 2];
        field6593++;
        this.method2430(arg1, 121, arg3, arg2);
        return this.field6594;
    }
}
