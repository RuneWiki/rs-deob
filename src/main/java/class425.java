import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class425 extends class448 {

    @OriginalMember(owner = "client!vn", name = "w", descriptor = "Ltm;")
    public static class334 field6239 = new class334(69, -2);

    @OriginalMember(owner = "client!vn", name = "z", descriptor = "[I")
    public static int[] field6242 = new int[32];

    @OriginalMember(owner = "client!vn", name = "B", descriptor = "I")
    public static int field6243 = 1400;

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!vn", name = "u", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!vn", name = "x", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!vn", name = "y", descriptor = "I")
    public static int field6241;

    @OriginalMember(owner = "client!vn", name = "v", descriptor = "[I")
    public static int[] field6238;

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class425(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
    public static void method2650(byte arg0) {
        if (arg0 == -4) {
            field6239 = null;
            field6242 = null;
            field6238 = null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
    public final void method1134(int arg0) {
        field6237++;
        if (arg0 > -18) {
            this.method1132(null, (byte) 41);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(III[BIIBI[B)V")
    public static final void method2651(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, byte arg6, int arg7, byte[] arg8) {
        field6236++;
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        int var11 = -arg4;
        if (arg6 != 13) {
            field6238 = null;
        }
        while (var11 < 0) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg0++;
                arg8[var10001] = (byte) (arg8[var10001] - arg3[arg7++]);
                int var14 = arg0++;
                arg8[var14] = (byte) (arg8[var14] - arg3[arg7++]);
                int var15 = arg0++;
                arg8[var15] = (byte) (arg8[var15] - arg3[arg7++]);
                int var16 = arg0++;
                arg8[var16] = (byte) (arg8[var16] - arg3[arg7++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg0++;
                arg8[var10001] = (byte) (arg8[var10001] - arg3[arg7++]);
            }
            arg7 += arg1;
            arg0 += arg2;
            var11++;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lofa;B)Lhc;")
    public static final class70 method2652(class301 arg0, byte arg1) {
        field6241++;
        class686 var2 = class99.method818((byte) 18)[arg0.method1987(-7)];
        class322 var3 = class570.method3305(0)[arg0.method1987(-85)];
        int var4 = arg0.method1977((byte) -115);
        int var5 = arg0.method1977((byte) -126);
        int var6 = arg0.method1989((byte) -125);
        int var7 = arg0.method1989((byte) -35);
        int var8 = arg0.method1977((byte) -7);
        int var9 = arg0.method1934(-2);
        if (arg1 > -20) {
            method2652(null, (byte) 78);
        }
        int var10 = arg0.method1934(-2);
        return new class70(var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;B)V")
    public final void method1132(OggPacket arg0, byte arg1) {
        if (arg1 != -5) {
            field6239 = null;
        }
        field6240++;
    }
}
