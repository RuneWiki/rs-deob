import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class193 extends class313 {

    @OriginalMember(owner = "client!rk", name = "I", descriptor = "I")
    private int field3228 = 1365;

    @OriginalMember(owner = "client!rk", name = "M", descriptor = "I")
    private int field3232 = 0;

    @OriginalMember(owner = "client!rk", name = "P", descriptor = "I")
    private int field3235 = 20;

    @OriginalMember(owner = "client!rk", name = "O", descriptor = "I")
    private int field3234 = 0;

    @OriginalMember(owner = "client!rk", name = "S", descriptor = "[I")
    public static int[] field3238 = new int[2];

    @OriginalMember(owner = "client!rk", name = "N", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3233 = Calendar.getInstance();

    @OriginalMember(owner = "client!rk", name = "T", descriptor = "Ljava/lang/String;")
    public static String field3239 = "Loading wordpack - ";

    @OriginalMember(owner = "client!rk", name = "J", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!rk", name = "L", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!rk", name = "Q", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!rk", name = "R", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!rk", name = "K", descriptor = "[[[B")
    public static byte[][][] field3230;

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V", line = 91)
    public class193() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(B)V", line = 10)
    public static void method1452(byte arg0) {
        field3233 = null;
        field3238 = null;
        if (arg0 != -128) {
            field3238 = (int[]) null;
        }
        field3239 = null;
        field3230 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(III)V", line = 23)
    public static final void method1453(int arg0, int arg1, int arg2) {
        class324.field5155++;
        field3229++;
        class341.field5443.method26(127, 7);
        if (arg2 == -6140) {
            class341.field5443.method2324(arg1, true);
            class341.field5443.method2318(arg0, 124);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILpi;)V", line = 39)
    public final void method185(int arg0, int arg1, class336 arg2) {
        if (arg1 != -17848) {
            return;
        }
        if (arg0 == 0) {
            this.field3228 = arg2.method2339((byte) -46);
        } else if (arg0 == 1) {
            this.field3235 = arg2.method2339((byte) -46);
        } else if (arg0 == 2) {
            this.field3234 = arg2.method2339((byte) -46);
        } else if (arg0 == 3) {
            this.field3232 = arg2.method2339((byte) -46);
        }
        field3237++;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)[I", line = 110)
    public final int[] method111(int arg0, int arg1) {
        field3231++;
        int[] var3 = this.field4961.method1520(arg0 - 1908965698, arg1);
        if (arg0 != 4) {
            this.field3235 = 116;
        }
        if (this.field4961.field3451) {
            for (int var4 = 0; var4 < class133.field2269; var4++) {
                int var5 = (class8.field104[var4] << 12) / this.field3228 + this.field3234;
                int var6 = (class1.field6[arg1] << 12) / this.field3228 + this.field3232;
                int var7 = var6;
                int var8 = var5;
                int var9 = var5;
                int var10 = var6 * var6 >> 12;
                int var11 = var6;
                int var12 = var5 * var5 >> 12;
                int var13 = 0;
                while ((var10 + var12) < 16384 && var13 < this.field3235) {
                    var13++;
                    var11 = (var9 * var11 >> 12) * 2 + var7;
                    var9 = var8 + var12 - var10;
                    var10 = var11 * var11 >> 12;
                    var12 = var9 * var9 >> 12;
                }
                var3[var4] = this.field3235 - 1 > var13 ? (var13 << 12) / this.field3235 : 0;
            }
        }
        return var3;
    }
}
