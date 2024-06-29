import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class162 extends class273 {

    @OriginalMember(owner = "client!mi", name = "O", descriptor = "I")
    private int field2506 = 0;

    @OriginalMember(owner = "client!mi", name = "S", descriptor = "I")
    private int field2510 = 1365;

    @OriginalMember(owner = "client!mi", name = "P", descriptor = "I")
    private int field2507 = 20;

    @OriginalMember(owner = "client!mi", name = "M", descriptor = "I")
    private int field2504 = 0;

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "I")
    public static int field2501 = 0;

    @OriginalMember(owner = "client!mi", name = "L", descriptor = "I")
    public static int field2503 = 0;

    @OriginalMember(owner = "client!mi", name = "T", descriptor = "S")
    public static short field2511 = 32767;

    @OriginalMember(owner = "client!mi", name = "R", descriptor = "Ljh;")
    public static class207 field2509 = null;

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!mi", name = "N", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!mi", name = "Q", descriptor = "Z")
    public static boolean field2508;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)[I", line = 9)
    public final int[] method331(int arg0, int arg1) {
        int[] var3 = this.field4204.method365(arg0, arg1 + 14650);
        if (this.field4204.field792) {
            for (int var4 = 0; var4 < class27.field346; var4++) {
                int var5 = (class151.field2384[var4] << 12) / this.field2510 + this.field2506;
                int var6 = (class96.field1473[arg0] << 12) / this.field2510 + this.field2504;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var6 * var6 >> 12;
                int var12 = var5 * var5 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && this.field2507 > var13) {
                    var13++;
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var7 + var12 - var11;
                    var11 = var10 * var10 >> 12;
                    var12 = var9 * var9 >> 12;
                }
                var3[var4] = (this.field2507 - 1) > var13 ? (var13 << 12) / this.field2507 : 0;
            }
        }
        if (arg1 != -14650) {
            this.method167((byte) -61, -59, (class303) null);
        }
        field2505++;
        return var3;
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(I)V", line = 66)
    public static void method1112(int arg0) {
        field2509 = null;
        if (arg0 != -547655060) {
            field2503 = 103;
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V", line = 84)
    public class162() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BILgn;)V", line = 95)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        if (arg0 < 27) {
            this.method331(37, 114);
        }
        if (arg1 == 0) {
            this.field2510 = arg2.method1994(false);
        } else if (arg1 == 1) {
            this.field2507 = arg2.method1994(false);
        } else if (arg1 == 2) {
            this.field2506 = arg2.method1994(false);
        } else if (arg1 == 3) {
            this.field2504 = arg2.method1994(false);
        }
        field2502++;
    }
}
