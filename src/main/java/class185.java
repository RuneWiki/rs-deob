import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class185 extends class188 {

    @OriginalMember(owner = "client!df", name = "p", descriptor = "[I")
    public static int[] field2784 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!df", name = "B", descriptor = "Ljava/lang/String;")
    public static String field2795 = " more options";

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public int field2780;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public int field2785;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public int field2786;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public int field2794;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    public int field2796;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "Lhi;")
    public class323 field2791;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "Lhi;")
    public class323 field2793;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "Ljava/lang/String;")
    public String field2779;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "Ljava/lang/String;")
    public static String field2792;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "Z")
    public boolean field2781;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "[I")
    public static int[] field2787;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "[Ljava/lang/Object;")
    public Object[] field2789;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)[B", line = 4)
    public static final byte[] method1276(int arg0, int arg1) {
        if (arg1 != 7390) {
            return (byte[]) null;
        }
        field2783++;
        class148 var2 = (class148) class151.field2397.method1998(arg1 - 1114539031, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class220.method1534(var7, var4, 2);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class148(var3);
            class151.field2397.method2000(var2, (byte) 64, (long) arg0);
        }
        return var2.field2355;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)I", line = 58)
    public static final int method1277(int arg0, int arg1, int arg2) {
        field2782++;
        class64 var3 = (class64) class6.field67.method770((long) arg1, 109);
        if (var3 == null) {
            return -1;
        } else if (arg0 >= ~arg2 && var3.field773.length > arg2) {
            return var3.field773[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V", line = 83)
    public static final void method1278(byte arg0) {
        if (arg0 != -90) {
            method1279((byte) -54);
        }
        field2790++;
        client.field4423.method383((byte) -48);
        class148.field2356.method383((byte) -48);
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(B)V", line = 108)
    public static void method1279(byte arg0) {
        int var1 = -102 / ((-arg0 - 16) / 38);
        field2787 = null;
        field2784 = null;
        field2792 = null;
        field2795 = null;
    }
}
