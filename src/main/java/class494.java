import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class494 {

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "Lsba;")
    public static class230 field6772 = new class230(0, 0);

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "Lfja;")
    public static class783 field6777 = new class783(60, 3);

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IB[BLjava/lang/String;)I", line = 17)
    public static final int method2836(int arg0, byte arg1, byte[] arg2, String arg3) {
        field6773++;
        int var4 = arg0;
        int var5 = arg3.length();
        if (arg1 != 75) {
            method2836(-104, (byte) -2, null, null);
        }
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class152.method1195(arg3.charAt(var6), false);
            int var8 = var5 <= (var6 + 1) ? -1 : class152.method1195(arg3.charAt(var6 + 1), false);
            int var9 = var5 > (var6 + 2) ? class152.method1195(arg3.charAt(var6 + 2), false) : -1;
            int var10 = (var6 + 3) >= var5 ? -1 : class152.method1195(arg3.charAt(var6 + 3), false);
            arg2[arg0++] = (byte) class530.method3011(var7 << 2, var8 >>> 4);
            if (var9 == -1) {
                break;
            }
            arg2[arg0++] = (byte) class530.method3011(var9 >>> 2, class204.method1456(15, var8) << 4);
            if (var10 == -1) {
                break;
            }
            arg2[arg0++] = (byte) class530.method3011(class204.method1456(3, var9) << 6, var10);
        }
        return arg0 - var4;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(III)I", line = 60)
    public final int method2837(int arg0, int arg1, int arg2) {
        field6774++;
        int var4 = class108.field1697 <= arg1 ? arg1 : class108.field1697;
        if (class121.field2190 == this) {
            return 0;
        }
        if (arg0 != 2113) {
            method2836(59, (byte) -102, null, null);
        }
        if (class194.field2959 == this) {
            return var4 - arg2;
        } else if (class499.field6814 == this) {
            return (var4 - arg2) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V", line = 86)
    public static void method2838(int arg0) {
        if (arg0 >= 66) {
            field6772 = null;
            field6777 = null;
        }
    }

    @OriginalMember(owner = "client!cq", name = "toString", descriptor = "()Ljava/lang/String;", line = 97)
    public final String toString() {
        field6775++;
        throw new IllegalStateException();
    }
}
