import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class338 {

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public int field5268 = -1;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
    public int field5275 = -1;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public static int field5266 = 1;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field5267 = 1;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "[I")
    public int[] field5273;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "[[B")
    public static byte[][] field5276;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIILfd;)V", line = 7)
    private final void method2352(int arg0, int arg1, int arg2, class299 arg3) {
        if (arg0 >= -44) {
            return;
        }
        if (arg1 == 1) {
            this.field5275 = arg3.method2083((byte) -14);
        } else if (arg1 == 2) {
            this.field5273 = new int[arg3.method2096((byte) -122)];
            for (int var5 = 0; var5 < this.field5273.length; var5++) {
                this.field5273[var5] = arg3.method2083((byte) -43);
            }
        } else if (arg1 == 3) {
            this.field5268 = arg3.method2096((byte) -122);
        }
        field5274++;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILfd;)V", line = 43)
    public final void method2353(int arg0, int arg1, class299 arg2) {
        if (arg0 != 14364) {
            this.field5268 = 74;
        }
        field5271++;
        while (true) {
            int var4 = arg2.method2096((byte) -122);
            if (var4 == 0) {
                return;
            }
            this.method2352(-51, var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lwf;IIIIIII)V", line = 71)
    public static final void method2354(class333 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 != 7403) {
            field5272 = -38;
        }
        field5265++;
        int var8 = arg4 * arg4 + arg6 * arg6;
        if (arg1 < var8) {
            return;
        }
        int var9 = Math.min(arg0.field5056 / 2, arg0.field5172 / 2);
        if (var8 <= var9 * var9) {
            class154.method1187(arg2, arg0, arg5, arg6, 2, arg4, class192.field2662[arg7]);
            return;
        }
        var9 -= 10;
        int var10 = (int) class247.field3601 + class354.field5534 & 0x7FF;
        int var11 = class350.field5474[var10];
        int var12 = var11 * 256 / (class318.field4690 + 256);
        int var13 = class350.field5476[var10];
        int var14 = var13 * 256 / (class318.field4690 + 256);
        int var15 = arg4 * var12 - (arg6 * var14) >> 16;
        int var16 = arg4 * var14 + arg6 * var12 >> 16;
        double var17 = Math.atan2((double) var16, (double) var15);
        int var19 = (int) ((double) var9 * Math.sin(var17));
        int var20 = (int) ((double) var9 * Math.cos(var17));
        if (class47.field623) {
            ((class361) class211.field2986[arg7]).method2511(240, 240, (arg2 + (arg0.field5056 / 2) + var19) * 16, (arg0.field5172 / 2 + arg5 - var20) * 16, (int) (var17 * 10430.378D), 4096);
        } else {
            ((class11) class211.field2986[arg7]).method78(arg0.field5056 / 2 + var19 + arg2 - 10, arg0.field5172 / 2 + arg5 + -10 + -var20, 20, 20, 15, 15, var17, 256);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V", line = 121)
    public static void method2355(int arg0) {
        field5276 = (byte[][]) null;
        if (arg0 != -5868) {
            field5266 = -23;
        }
    }
}
