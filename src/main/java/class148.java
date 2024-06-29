import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class148 extends class183 {

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "I")
    private int field2559 = 0;

    @OriginalMember(owner = "client!ab", name = "X", descriptor = "I")
    private int field2561 = 0;

    @OriginalMember(owner = "client!ab", name = "bb", descriptor = "I")
    private int field2565 = 1365;

    @OriginalMember(owner = "client!ab", name = "eb", descriptor = "I")
    private int field2568 = 20;

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "Ljf;")
    public static class229 field2558 = class212.method1457((byte) 65, "; Max)2Age=");

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "I")
    public static volatile int field2557 = -1;

    @OriginalMember(owner = "client!ab", name = "ab", descriptor = "Ljg;")
    public static class303 field2564 = new class303();

    @OriginalMember(owner = "client!ab", name = "W", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!ab", name = "Y", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!ab", name = "Z", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!ab", name = "cb", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!ab", name = "db", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(B)V", line = 12)
    public static void method1017(byte arg0) {
        if (arg0 > 51) {
            field2558 = null;
            field2564 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V", line = 329)
    public class148() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILjava/lang/String;)V", line = 30)
    public static final void method1018(int arg0, String arg1) {
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
        field2566++;
        if (arg0 >= -57) {
            field2564 = (class303) null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILkh;I)V", line = 47)
    public final void method14(int arg0, class14 arg1, int arg2) {
        if (arg0 >= -43) {
            this.field2559 = -127;
        }
        field2562++;
        if (arg2 == 0) {
            this.field2565 = arg1.method116(-1);
        } else if (arg2 == 1) {
            this.field2568 = arg1.method116(-1);
        } else if (arg2 == 2) {
            this.field2561 = arg1.method116(-1);
        } else if (arg2 == 3) {
            this.field2559 = arg1.method116(-1);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZLkn;III)Ljava/awt/Frame;", line = 99)
    public static final Frame method1019(int arg0, boolean arg1, class198 arg2, int arg3, int arg4, int arg5) {
        field2560++;
        if (!arg2.method1377(21)) {
            return null;
        }
        if (arg4 == 0) {
            class312[] var6 = class237.method1694(arg2, (byte) 105);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field5255 == arg5 && var6[var8].field5239 == arg3 && (arg0 == 0 || var6[var8].field5241 == arg0) && (!var7 || var6[var8].field5251 > arg4)) {
                    var7 = true;
                    arg4 = var6[var8].field5251;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class231 var9 = arg2.method1375(arg5, arg0, arg4, arg3, (byte) 53);
        while (var9.field4011 == 0) {
            class235.method1675((byte) -22, 10L);
        }
        if (!arg1) {
            return (Frame) null;
        }
        Frame var10 = (Frame) var9.field4009;
        if (var10 == null) {
            return null;
        } else if (var9.field4011 == 2) {
            class3.method18(-117, arg2, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(II)[I", line = 186)
    public final int[] method10(int arg0, int arg1) {
        int[] var3 = this.field3161.method664(arg0, arg1 + 1);
        if (arg1 != -1) {
            field2557 = -93;
        }
        field2563++;
        if (this.field3161.field1736) {
            for (int var4 = 0; var4 < class22.field393; var4++) {
                int var5 = (class42.field746[arg0] << 12) / this.field2565 + this.field2559;
                int var6 = (class97.field1737[var4] << 12) / this.field2565 + this.field2561;
                int var7 = var6;
                int var8 = var5;
                int var9 = var6;
                int var10 = var5;
                int var11 = var6 * var6 >> 12;
                int var12 = var5 * var5 >> 12;
                int var13 = 0;
                while ((var11 + var12) < 16384 && var13 < this.field2568) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var11 + var7 - var12;
                    var13++;
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = this.field2568 - 1 <= var13 ? 0 : (var13 << 12) / this.field2568;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIII)V", line = 246)
    public static final void method1020(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2567++;
        class34.method306(arg2 - arg4, class173.field3021[arg0], (byte) 111, arg2 + arg4, arg5);
        int var6 = arg3;
        int var7 = 0;
        int var8 = arg4 * arg4;
        int var9 = arg3 * arg3;
        int var10 = var8 << 1;
        int var11 = var9 << 1;
        int var12 = arg3 << 1;
        int var13 = var9 - ((var12 - 1) * var10);
        int var14 = 7 % ((-arg1 - 84) / 39);
        int var15 = var8 << 2;
        int var16 = (1 - var12) * var8 + var11;
        int var17 = var9 << 2;
        int var18 = ((var7 << 1) + 3) * var11;
        int var19 = ((arg3 << 1) - 3) * var10;
        int var20 = (arg3 - 1) * var15;
        int var21 = (var7 + 1) * var17;
        while (var6 > 0) {
            var6--;
            int var22 = arg0 - var6;
            if (var16 < 0) {
                while (var16 < 0) {
                    var13 += var21;
                    var7++;
                    var21 += var17;
                    var16 += var18;
                    var18 += var17;
                }
            }
            if (var13 < 0) {
                var13 += var21;
                var16 += var18;
                var18 += var17;
                var7++;
                var21 += var17;
            }
            var16 += -var20;
            int var23 = arg0 + var6;
            var20 -= var15;
            int var24 = arg2 + var7;
            int var25 = arg2 - var7;
            class34.method306(var25, class173.field3021[var22], (byte) 118, var24, arg5);
            var13 += -var19;
            class34.method306(var25, class173.field3021[var23], (byte) 125, var24, arg5);
            var19 -= var15;
        }
    }
}
