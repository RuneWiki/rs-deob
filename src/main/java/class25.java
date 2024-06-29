import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class25 extends class186 {

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "[I")
    public static int[] field452 = new int[4096];

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)Z")
    public static final boolean method167(int arg0, int arg1, int arg2) {
        field451++;
        if (arg2 != 0) {
            field452 = null;
        }
        return (arg1 & 0x40000) != 0 | class97.method606(arg1, -35, arg0) || class264.method1587((byte) 95, arg0, arg1);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method168(char arg0, String arg1, String arg2, int arg3) {
        field454++;
        int var4 = arg1.length();
        int var5 = arg2.length();
        int var6 = var4;
        int var7 = var5 - 1;
        if (var7 != 0) {
            int var8 = 0;
            while (true) {
                var8 = arg1.indexOf(arg0, var8);
                if (var8 < 0) {
                    break;
                }
                var6 += var7;
                var8++;
            }
        }
        StringBuffer var9 = new StringBuffer(var6);
        int var10 = 0;
        while (true) {
            int var11 = arg1.indexOf(arg0, var10);
            if (var11 < 0) {
                if (arg3 == -27195) {
                    var9.append(arg1.substring(var10));
                    return var9.toString();
                } else {
                    return null;
                }
            }
            var9.append(arg1.substring(var10, var11));
            var10 = var11 + 1;
            var9.append(arg2);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI[B)[B")
    public static final byte[] method169(byte arg0, int arg1, byte[] arg2) {
        if (arg0 <= 61) {
            return null;
        } else {
            field453++;
            byte[] var3 = new byte[arg1];
            class667.method3739(arg2, 0, var3, 0, arg1);
            return var3;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static void method170(byte arg0) {
        field452 = null;
        if (arg0 != 17) {
            method170((byte) -52);
        }
    }
}
