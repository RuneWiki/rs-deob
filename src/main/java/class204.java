import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class204 {

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "B")
    private byte field3152;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public int field3141;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public int field3144;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public int field3140;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public int field3138;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public int field3143;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field3139 = 0;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "J")
    public static volatile long field3142 = 0L;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "B")
    public static byte field3148;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "[I")
    public static int[] field3145;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)I")
    public final int method1433(byte arg0) {
        if (arg0 >= -101) {
            field3148 = -72;
        }
        field3151++;
        return this.field3152 & 0x7;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3146++;
        int var8 = 2048 - arg2 & 0x7FF;
        int var9 = arg4 - 334;
        if (var9 < 0) {
            var9 = 0;
        } else if (var9 > 100) {
            var9 = 100;
        }
        int var10 = (class23.field394 - class239.field3775) * var9 / 100 + class239.field3775;
        int var11 = arg3 * var10 >> 8;
        int var12 = 2048 - arg5 & 0x7FF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var11;
        if (var8 != 0) {
            int var16 = class224.field3601[var8];
            var13 = -var11 * var16 >> 16;
            int var17 = class224.field3597[var8];
            var15 = var11 * var17 >> 16;
        }
        if (var12 != 0) {
            int var18 = class224.field3601[var12];
            var14 = var15 * var18 >> 16;
            int var19 = class224.field3597[var12];
            var15 = var15 * var19 >> 16;
        }
        class8.field128 = arg2;
        class118.field1787 = arg7 - var15;
        class226.field3616 = arg0 - var14;
        class82.field1244 = arg5;
        if (arg1 == 19495) {
            class250.field4007 = arg6 - var13;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
    public static void method1435(boolean arg0) {
        field3145 = null;
        if (arg0) {
            field3139 = 29;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)I")
    public final int method1436(int arg0) {
        field3149++;
        if (arg0 == 0) {
            return (this.field3152 & 0x8) == 8 ? 1 : 0;
        } else {
            return -102;
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
    public class204() {
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lha;)V")
    public class204(class31 arg0) {
        this.field3152 = arg0.method266(-129);
        this.field3141 = arg0.method260((byte) -67);
        this.field3144 = arg0.method300((byte) -30);
        this.field3140 = arg0.method300((byte) -30);
        this.field3138 = arg0.method300((byte) -30);
        this.field3143 = arg0.method300((byte) -30);
    }
}
