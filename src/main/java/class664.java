import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class664 extends class522 {

    @OriginalMember(owner = "client!pca", name = "D", descriptor = "[J")
    public static long[] field9396 = new long[10];

    @OriginalMember(owner = "client!pca", name = "G", descriptor = "[S")
    public static short[] field9399 = new short[256];

    @OriginalMember(owner = "client!pca", name = "J", descriptor = "I")
    public static int field9402 = 1406;

    @OriginalMember(owner = "client!pca", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field9403 = new String[8];

    @OriginalMember(owner = "client!pca", name = "L", descriptor = "[[I")
    public static int[][] field9404 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!pca", name = "C", descriptor = "I")
    public static int field9395;

    @OriginalMember(owner = "client!pca", name = "E", descriptor = "I")
    public static int field9397;

    @OriginalMember(owner = "client!pca", name = "H", descriptor = "I")
    public static int field9400;

    @OriginalMember(owner = "client!pca", name = "M", descriptor = "I")
    public static int field9405;

    @OriginalMember(owner = "client!pca", name = "N", descriptor = "I")
    public static int field9406;

    @OriginalMember(owner = "client!pca", name = "P", descriptor = "I")
    public static int field9407;

    @OriginalMember(owner = "client!pca", name = "F", descriptor = "J")
    public static long field9398;

    @OriginalMember(owner = "client!pca", name = "B", descriptor = "Z")
    public static boolean field9394;

    @OriginalMember(owner = "client!pca", name = "I", descriptor = "[B")
    private byte[] field9401;

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "()V")
    public class664() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "(III)Z")
    public static final boolean method3749(int arg0, int arg1, int arg2) {
        field9407++;
        if (arg0 == 458752) {
            return class213.method1281(arg0 - 458753, arg2, arg1) | (arg2 & 0x70000) != 0 || class273.method1637(arg0 ^ 0xFFF8FF82, arg1, arg2);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILjava/awt/Canvas;)Lih;")
    public static final class649 method3750(int arg0, Canvas arg1) {
        field9406++;
        int var2 = 123 % ((60 - arg0) / 33);
        try {
            Class var3 = Class.forName("ou");
            class649 var4 = (class649) var3.getDeclaredConstructor().newInstance();
            var4.method954(93, arg1);
            return var4;
        } catch (Throwable var6) {
            class148 var5 = new class148();
            var5.method954(-128, arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIBI)[B")
    public final byte[] method3751(int arg0, int arg1, byte arg2, int arg3) {
        field9397++;
        this.field9401 = new byte[arg3 * 2 * arg1 * arg0];
        this.method2893(arg0, arg3, 0, arg1);
        if (arg2 >= -95) {
            this.method3751(-77, 36, (byte) -3, 34);
        }
        return this.field9401;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(II)I")
    public static final int method3752(int arg0, int arg1) {
        field9400++;
        if (arg0 != 2) {
            method3752(-57, -32);
        }
        return arg1 == 16711935 ? -1 : class90.method703((byte) -125, arg1);
    }

    @OriginalMember(owner = "client!pca", name = "g", descriptor = "(I)V")
    public static void method3753(int arg0) {
        field9399 = null;
        field9403 = null;
        field9404 = null;
        field9396 = null;
        if (arg0 != 7316) {
            method3752(-45, 61);
        }
    }

    @OriginalMember(owner = "client!pca", name = "e", descriptor = "(III)Z")
    public static final boolean method3754(int arg0, int arg1, int arg2) {
        field9405++;
        if (arg1 <= 62) {
            return true;
        } else {
            return (arg0 & 0x34) != 0;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIB)V")
    public final void method415(int arg0, int arg1, byte arg2) {
        field9395++;
        int var4 = arg1 * 2;
        byte var5 = (byte) (((arg0 & arg2) >> 1) + 127);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field9401[var10001] = var5;
        this.field9401[var6] = var5;
    }
}
