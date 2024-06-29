import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class398 {

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "[I")
    public int[] field6077 = new int[100];

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "[Lja;")
    public class450[] field6080 = new class450[8];

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "[I")
    public int[] field6084 = new int[3];

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "[Lol;")
    public class290[] field6085 = new class290[100];

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
    public static int field6086 = 0;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "Lvi;")
    public static class206 field6082 = new class206("LIVE", 0);

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "I")
    public static int field6081;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "I")
    public int field6083;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "Ljava/lang/Object;")
    public Object field6078;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(II[B)[B")
    public static final byte[] method2485(int arg0, int arg1, byte[] arg2) {
        field6079++;
        if (arg1 == 26) {
            byte[] var3 = new byte[arg0];
            class85.method613(arg2, 0, var3, 0, arg0);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IZIIJ)Ljava/lang/String;")
    public static final String method2486(int arg0, boolean arg1, int arg2, int arg3, long arg4) {
        field6081++;
        if (arg2 != 8) {
            method2487((byte) -30);
        }
        char var6 = ',';
        char var7 = '.';
        if (arg3 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg3 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg4 < 0L) {
            var8 = true;
            arg4 = -arg4;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg0 > 0) {
            for (int var10 = 0; var10 < arg0; var10++) {
                int var11 = (int) arg4;
                arg4 /= 10L;
                var9.append((char) (var11 + 48 - (int) arg4 * 10));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg4;
            arg4 /= 10L;
            var9.append((char) (var13 + 48 - (int) arg4 * 10));
            if (arg4 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg1) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V")
    public static void method2487(byte arg0) {
        field6082 = null;
        if (arg0 > -56) {
            field6086 = 56;
        }
    }
}
