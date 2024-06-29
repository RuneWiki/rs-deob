import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class77 {

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "[I")
    public static int[] field1238 = new int[2];

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "[I")
    public static int[] field1243 = new int[1000];

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "[S")
    public static short[] field1237 = new short[] { 8, 42, 50, 6, 18, 39, 15, 10 };

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1242 = "Members object";

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1246 = "";

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V")
    public static final void method511(int arg0, int arg1) {
        if (arg0 == 447372322) {
            field1240++;
            class97.field1526.method1780(arg1, true);
            class46.field751.method1780(arg1, true);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public static final void method512(byte arg0) {
        if (arg0 == -121) {
            field1247++;
            class81.field1297.method1775(27147);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public static void method513(int arg0) {
        if (arg0 != 6) {
            method514(-21, (byte) 5);
        }
        field1243 = null;
        field1246 = null;
        field1237 = null;
        field1238 = null;
        field1242 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)V")
    public static final void method514(int arg0, byte arg1) {
        class187 var2 = class120.method762((byte) 99, 5, arg0);
        if (arg1 == -80) {
            field1241++;
            var2.method1162(1);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIII)V")
    public static final void method515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1236++;
        class64.method429(class23.field284[arg5], arg3 - arg0, (byte) 90, arg2, arg0 + arg3);
        int var6 = arg4;
        int var7 = arg0 * arg0;
        int var8 = 0;
        int var9 = var7 << 1;
        int var10 = arg4 << 1;
        int var11 = arg4 * arg4;
        if (arg1 != 1569449985) {
            method513(-128);
        }
        int var12 = var11 << 1;
        int var13 = var11 - ((var10 - 1) * var9);
        int var14 = (1 - var10) * var7 + var12;
        int var15 = var7 << 2;
        int var16 = ((var8 << 1) + 3) * var12;
        int var17 = ((arg4 << 1) - 3) * var9;
        int var18 = var11 << 2;
        int var19 = (var8 + 1) * var18;
        int var20 = (arg4 - 1) * var15;
        while (var6 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var14 += var16;
                    var13 += var19;
                    var16 += var18;
                    var8++;
                    var19 += var18;
                }
            }
            if (var13 < 0) {
                var13 += var19;
                var14 += var16;
                var19 += var18;
                var8++;
                var16 += var18;
            }
            var13 += -var17;
            var17 -= var15;
            var14 += -var20;
            var6--;
            var20 -= var15;
            int var21 = arg5 - var6;
            int var22 = arg5 + var6;
            int var23 = arg3 + var8;
            int var24 = arg3 - var8;
            class64.method429(class23.field284[var21], var24, (byte) 122, arg2, var23);
            class64.method429(class23.field284[var22], var24, (byte) 115, arg2, var23);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(JZ)V")
    public static final void method516(long arg0, boolean arg1) {
        field1239++;
        if (arg0 == 0L) {
            return;
        }
        class198.field3012++;
        if (arg1) {
            method511(90, 67);
        }
        class196.field2979.method1106(99, arg1);
        class196.field2979.method1610(791715792, arg0);
    }
}
