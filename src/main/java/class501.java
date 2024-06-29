import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public abstract class class501 {

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "[Lrba;")
    public static class402[] field6703 = new class402[300];

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "I")
    public static int field6707;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZILjava/net/Socket;)Ltn;")
    public static final class80 method2782(boolean arg0, int arg1, Socket arg2) throws IOException {
        if (arg0) {
            field6707++;
            return new class486(arg2, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZI)I")
    public static final int method2783(boolean arg0, int arg1) {
        field6706++;
        if (arg1 == 6407 || arg1 == 34843 || arg1 == 34837) {
            return 6407;
        } else if (arg1 == 6408 || arg1 == 34842 || arg1 == 34836) {
            return 6408;
        } else if (arg1 == 6406 || arg1 == 34844) {
            return 6406;
        } else if (arg1 == 6409 || arg1 == 34846) {
            return 6409;
        } else {
            if (!arg0) {
                method2785(-122, 78, -93, 14);
            }
            if (arg1 == 6410 || arg1 == 34847) {
                return 6410;
            } else if (arg1 == 6402) {
                return 6402;
            } else {
                throw new IllegalArgumentException("");
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
    public static void method2784(byte arg0) {
        field6703 = null;
        if (arg0 < 65) {
            field6703 = null;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIII)I")
    public static final int method2785(int arg0, int arg1, int arg2, int arg3) {
        field6705++;
        if (class699.field9827 < arg3) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg0 - class567.field7515;
        int var7 = arg2 - class567.field7529;
        for (class20 var8 = (class20) class567.field7508.method3257(-49); var8 != null; var8 = (class20) class567.field7508.method3263((byte) -126)) {
            if (var8.field317 == arg1) {
                int var9 = var8.field319;
                int var10 = var8.field324;
                int var11 = class567.field7515 + var9 << 14 | var10 + class567.field7529;
                int var12 = (var6 - var9) * (var6 - var9) + (var7 - var10) * (var7 - var10);
                if (var4 < 0 || var5 > var12) {
                    var4 = var11;
                    var5 = var12;
                }
            }
        }
        return var4;
    }
}
