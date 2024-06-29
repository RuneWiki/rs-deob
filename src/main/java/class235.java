import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class235 extends class306 {

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "I")
    private int field3620 = -1;

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field3618 = new String[200];

    @OriginalMember(owner = "client!hh", name = "G", descriptor = "[I")
    public static int[] field3612 = new int[32];

    @OriginalMember(owner = "client!hh", name = "R", descriptor = "[S")
    public static short[] field3623 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!hh", name = "H", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!hh", name = "J", descriptor = "I")
    private int field3615;

    @OriginalMember(owner = "client!hh", name = "L", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
    private int field3619;

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "[I")
    private int[] field3616;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILlf;I)V", line = 5)
    public final void method45(int arg0, class143 arg1, int arg2) {
        if (arg2 == 0) {
            this.field3620 = arg1.method1051(1);
        }
        if (arg0 != -15334) {
            field3612 = (int[]) null;
        }
        field3613++;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V", line = 22)
    public class235() {
        super(0, false);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)[[I", line = 28)
    public final int[][] method681(int arg0, byte arg1) {
        if (arg1 != -119) {
            field3623 = (short[]) null;
        }
        int[][] var3 = this.field4752.method1866(arg0, 0);
        if (this.field4752.field4179 && this.method1629(0)) {
            int var4 = (class99.field1344 == this.field3615 ? arg0 : this.field3615 * arg0 / class99.field1344) * this.field3619;
            int[] var5 = var3[2];
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            if (class31.field367 == this.field3619) {
                for (int var8 = 0; var8 < class31.field367; var8++) {
                    int var9 = this.field3616[var4++];
                    var5[var8] = class261.method1840(4080, var9 << 4);
                    var7[var8] = class261.method1840(var9, 65280) >> 4;
                    var6[var8] = class261.method1840(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; var10 < class31.field367; var10++) {
                    int var11 = this.field3619 * var10 / class31.field367;
                    int var12 = this.field3616[var4 + var11];
                    var5[var10] = class261.method1840(255, var12) << 4;
                    var7[var10] = class261.method1840(var12 >> 4, 4080);
                    var6[var10] = class261.method1840(var12 >> 12, 4080);
                }
            }
        }
        field3614++;
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V", line = 95)
    public final void method1343(int arg0) {
        field3621++;
        super.method1343(arg0);
        this.field3616 = null;
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)I", line = 104)
    public final int method1627(int arg0) {
        field3617++;
        return arg0 < 63 ? 113 : this.field3620;
    }

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(B)V", line = 122)
    public static void method1628(byte arg0) {
        field3612 = null;
        if (arg0 < 32) {
            method1628((byte) 75);
        }
        field3618 = null;
        field3623 = null;
    }

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)Z", line = 134)
    private final boolean method1629(int arg0) {
        field3622++;
        if (this.field3616 != null) {
            return true;
        } else if (this.field3620 >= arg0) {
            int var2 = class99.field1344;
            int var3 = class31.field367;
            int var4 = class42.field456.method1207(this.field3620, (byte) -83).field5493 ? 64 : 128;
            this.field3616 = class42.field456.method1210(9024, false, var4, this.field3620, var4, 1.0F);
            this.field3619 = var4;
            this.field3615 = var4;
            class91.method572(var2, -88, var3);
            return this.field3616 != null;
        } else {
            return false;
        }
    }
}
