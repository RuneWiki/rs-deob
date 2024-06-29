import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public abstract class class38 {

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public int field676;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public int field669;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field668 = 0;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "Ldj;")
    public static class44 field670 = class89.method650(255, "0(U");

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field679 = 0;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "[I")
    public static int[] field678 = new int[5];

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Lvc;")
    public static class223 field674;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "[I")
    public static int[] field672;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)V")
    public static final void method258(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class163.field2815; var3++) {
            for (int var4 = 0; var4 < class66.field1205; var4++) {
                for (int var5 = 0; var5 < class21.field355; var5++) {
                    class68 var6 = class32.field567[var3][var4][var5];
                    if (var6 != null) {
                        class33 var7 = var6.field1298;
                        if (var7 != null && var7.field576.method1269()) {
                            class72.method565(var7.field576, var3, var4, var5, 1, 1);
                            if (var7.field578 != null && var7.field578.method1269()) {
                                class72.method565(var7.field578, var3, var4, var5, 1, 1);
                                var7.field576.method1254(var7.field578, 0, 0, 0, false);
                                var7.field578 = var7.field578.method1252(arg0, arg1, arg2);
                            }
                            var7.field576 = var7.field576.method1252(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field1300; var8++) {
                            class106 var10 = var6.field1314[var8];
                            if (var10 != null && var10.field1947.method1269()) {
                                class72.method565(var10.field1947, var3, var4, var5, var10.field1939 + 1 - var10.field1945, var10.field1936 - var10.field1955 + 1);
                                var10.field1947 = var10.field1947.method1252(arg0, arg1, arg2);
                            }
                        }
                        class220 var9 = var6.field1304;
                        if (var9 != null && var9.field3977.method1269()) {
                            class131.method888(var9.field3977, var3, var4, var5);
                            var9.field3977 = var9.field3977.method1252(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(III)V")
    public abstract void method259(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BII)V")
    public abstract void method260(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIZ)V")
    public abstract void method261(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static void method262(int arg0) {
        int var1 = 14 / ((arg0 - 16) / 50);
        field670 = null;
        field672 = null;
        field674 = null;
        field678 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BJ)Ldj;")
    public static final class44 method263(byte arg0, long arg1) {
        field677++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            long var3 = arg1;
            int var5 = 0;
            while (var3 != 0L) {
                var5++;
                var3 /= 37L;
            }
            byte[] var6 = new byte[var5];
            if (arg0 != 3) {
                return null;
            }
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var5--;
                var6[var5] = class54.field995[(int) (var8 - arg1 * 37L)];
            }
            class44 var7 = new class44();
            var7.field822 = var6;
            var7.field849 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(III)V")
    public class38(int arg0, int arg1, int arg2) {
        this.field676 = arg2;
        this.field671 = arg0;
        this.field669 = arg1;
    }
}
