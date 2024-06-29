import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class186 {

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "[I")
    public static int[] field2922 = new int[32];

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "[Lvj;")
    public static class204[] field2923;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
    public static void method1325(byte arg0) {
        field2923 = null;
        if (arg0 == 59) {
            field2922 = null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method1326(boolean arg0, String arg1) {
        field2927++;
        if (arg1.equals("")) {
            return;
        }
        class91.field1339++;
        class699 var2 = class452.method2630(class699.field9897, class347.field4907, (byte) 125);
        var2.field9908.method2753((byte) 60, class252.method1609(0, arg1));
        var2.field9908.method2703(false, arg1);
        class149.method1134(var2, arg0);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)Liga;")
    public static final class78 method1327(int arg0) {
        if (arg0 != 2689) {
            method1325((byte) -51);
        }
        field2928++;
        try {
            return (class78) Class.forName("ng").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class291();
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method1328(boolean arg0, String arg1, int arg2) {
        field2926++;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg0 ? 32768 : 0;
        int var7 = var6 + (arg0 ? class116.field1840.field4982 : class116.field1840.field4986);
        if (arg2 <= 77) {
            method1327(-126);
        }
        for (int var8 = var6; var8 < var7; var8++) {
            class546 var11 = class116.field1840.method2157(var8, (byte) -112);
            if (var11.field8021 && var11.method3207((byte) 93).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class53.field685 = null;
                    class252.field3647 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class252.field3647 = var5;
        class168.field2747 = 0;
        class53.field685 = var4;
        String[] var9 = new String[class252.field3647];
        for (int var10 = 0; var10 < class252.field3647; var10++) {
            var9[var10] = class116.field1840.method2157(var4[var10], (byte) -51).method3207((byte) 93);
        }
        class512.method3048(-2, class53.field685, var9);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIZ)I")
    public final int method1329(int arg0, int arg1, boolean arg2) {
        field2924++;
        if (arg2) {
            return 101;
        }
        int var4 = arg0 < class465.field6689 ? class465.field6689 : arg0;
        if (class493.field7077 == this) {
            return 0;
        } else if (class6.field51 == this) {
            return var4 - arg1;
        } else if (class386.field5652 == this) {
            return (var4 - arg1) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vn", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2925++;
        throw new IllegalStateException();
    }
}
