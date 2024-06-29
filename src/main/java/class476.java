import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class476 {

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "[I")
    public static int[] field6816 = new int[13];

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "[I")
    public static int[] field6819 = new int[14];

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "Lqg;")
    public static class271 field6820 = new class271("WIP", 2);

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "I")
    public static int field6824;

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "Z")
    public static boolean field6821;

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "[[B")
    public static byte[][] field6823;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lgk;I)Leo;")
    public static final class642 method2734(class540 arg0, int arg1) {
        field6818++;
        arg0.method3115(29871);
        int var2 = arg0.method3115(29871);
        class642 var3 = class338.method2094(36, var2);
        var3.field9206 = arg0.method3115(29871);
        if (arg1 < 40) {
            return null;
        }
        int var4 = arg0.method3115(29871);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method3115(29871);
            var3.method1(var6, arg0, (byte) 83);
        }
        var3.method2(6276);
        return var3;
    }

    @OriginalMember(owner = "client!vs", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6822++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method2735(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6817++;
        if (!class512.field7212) {
            return false;
        } else if (class56.field890 < 100) {
            return false;
        } else if (class636.method3638(-20628, arg0, arg4, arg1)) {
            if (arg3 != -1) {
                method2738(117);
            }
            int var5 = arg1 << class125.field1831;
            int var6 = arg0 << class125.field1831;
            if (class682.method3825(var6, class178.field2480[arg4].method3822(arg0, arg1, 0), class263.field3412, arg2, class263.field3412, (byte) -98, var5)) {
                class607.field8766++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I[S)[S")
    public static final short[] method2736(int arg0, short[] arg1) {
        field6824++;
        if (arg1 == null) {
            return null;
        }
        short[] var2 = new short[arg1.length];
        class667.method3742(arg1, 0, var2, 0, arg1.length);
        if (arg0 >= -44) {
            method2737((byte) 31);
        }
        return var2;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V")
    public static final void method2737(byte arg0) {
        field6825++;
        class568 var1 = null;
        try {
            if (arg0 != -122) {
                return;
            }
            class254 var2 = class61.field978.method1416(true, 127, "2");
            while (var2.field3311 == 0) {
                class687.method3846(1L, arg0 ^ 0x6F);
            }
            if (var2.field3311 == 1) {
                var1 = (class568) var2.field3307;
                byte[] var3 = new byte[(int) var1.method3272(false)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method3269(var3.length - var4, var3, (byte) -75, var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class97.method605(new class540(var3), (byte) 90);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method3271((byte) -115);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
    public static void method2738(int arg0) {
        field6816 = null;
        field6819 = null;
        field6820 = null;
        if (arg0 != 1) {
            method2738(-75);
        }
        field6823 = null;
    }
}
