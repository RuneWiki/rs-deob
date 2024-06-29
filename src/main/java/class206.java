import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class206 {

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public int field3259;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "[F")
    public static float[] field3256 = new float[4];

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "Z")
    public static boolean field3262 = false;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "Lvv;")
    public static class313 field3261 = new class313(111, -2);

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "[I")
    public static int[] field3264 = new int[4];

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)I", line = 4)
    public static final int method1351(int arg0, int arg1) {
        if (arg1 <= 81) {
            field3256 = null;
        }
        int var7 = arg0 - 1;
        field3258++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V", line = 21)
    public static void method1352(int arg0) {
        if (arg0 < 17) {
            field3264 = null;
        }
        field3264 = null;
        field3261 = null;
        field3256 = null;
    }

    @OriginalMember(owner = "client!vi", name = "toString", descriptor = "()Ljava/lang/String;", line = 41)
    public final String toString() {
        field3257++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 49)
    public class206(String arg0, int arg1) {
        this.field3259 = arg1;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)I", line = 60)
    public final int method1353(byte arg0) {
        field3260++;
        if (arg0 > -48) {
            this.toString();
        }
        return this.field3259;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)Z", line = 72)
    public static final boolean method1354(int arg0, int arg1, int arg2) {
        field3263++;
        if (class446.method2682(0, arg1, arg2)) {
            if (arg0 != -2) {
                field3264 = null;
            }
            return class270.method1802(arg2, (byte) -75, arg1) | (arg2 & 0xB000) != 0 | class78.method571(arg1, arg2, (byte) -37) ? true : (arg1 & 0x37) == 0 & (class536.method3173(arg1, -1, arg2) | class444.method2665(arg2, arg1, false));
        } else {
            return false;
        }
    }
}
