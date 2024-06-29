import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class209 extends RuntimeException {

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "Ljava/lang/String;")
    public String field2993;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2990;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "Ldb;")
    public static class298 field2992 = new class298(4, 6);

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "[Z")
    public static boolean[] field2994 = new boolean[100];

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Lfv;")
    public static class110 field2991;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lgba;ZI)V")
    public static final void method1340(class625 arg0, boolean arg1, int arg2) {
        field2987++;
        int var3 = arg0.field8325 == 0 ? arg0.field8350 : arg0.field8325;
        int var4 = ~arg0.field8364 == arg2 ? arg0.field8361 : arg0.field8364;
        class148.method1063(var3, (byte) -127, class601.field7977[arg0.field8327 >> 16], var4, arg1, arg0.field8327);
        if (arg0.field8420 != null) {
            class148.method1063(var3, (byte) -124, arg0.field8420, var4, arg1, arg0.field8327);
        }
        class140 var5 = (class140) class264.field3667.method2918((long) arg0.field8327, (byte) -125);
        if (var5 != null) {
            class310.method1858(arg1, var5.field2256, var3, var4, -40);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public static void method1341(byte arg0) {
        field2992 = null;
        field2994 = null;
        if (arg0 != 81) {
            field2992 = null;
        }
        field2991 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)Led;")
    public static final class661 method1342(int arg0, int arg1, int arg2) {
        int var3 = -66 % ((3 - arg0) / 50);
        field2986++;
        class661 var4 = new class661();
        var4.field9385 = -1;
        var4.field9380 = arg1 + 1 + 5;
        var4.field9388 = -1;
        var4.field9398 = arg2 + 5 + 1;
        var4.field9391 = new int[var4.field9380][var4.field9398];
        var4.method3703((byte) -43);
        return var4;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZIIII)V")
    public static final void method1343(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field2988++;
        int var5 = 0;
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = -1;
        int var9 = class300.method1829(class600.field7959, arg1 + arg4, 124, class366.field4956);
        if (arg0) {
            return;
        }
        int var10 = class300.method1829(class600.field7959, arg1 - arg4, -14, class366.field4956);
        class475.method2668(arg3, var9, 7, class236.field3325[arg2], var10);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg2 - var6;
                int var12 = arg2 + var6;
                if (class310.field4279 <= var12 && class442.field6058 >= var11) {
                    int var13 = class300.method1829(class600.field7959, arg1 + var5, -61, class366.field4956);
                    int var14 = class300.method1829(class600.field7959, arg1 - var5, -59, class366.field4956);
                    if (class442.field6058 >= var12) {
                        class475.method2668(arg3, var13, 7, class236.field3325[var12], var14);
                    }
                    if (var11 >= class310.field4279) {
                        class475.method2668(arg3, var13, 7, class236.field3325[var11], var14);
                    }
                }
            }
            var5++;
            int var15 = arg2 - var5;
            int var16 = arg2 + var5;
            if (var16 >= class310.field4279 && class442.field6058 >= var15) {
                int var17 = class300.method1829(class600.field7959, arg1 + var6, 114, class366.field4956);
                int var18 = class300.method1829(class600.field7959, arg1 - var6, -87, class366.field4956);
                if (var16 <= class442.field6058) {
                    class475.method2668(arg3, var17, 7, class236.field3325[var16], var18);
                }
                if (var15 >= class310.field4279) {
                    class475.method2668(arg3, var17, 7, class236.field3325[var15], var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static final void method1344(int arg0) {
        field2989++;
        class292.field4127.method3748(arg0 ^ 0xFFFFFFF9);
        if (arg0 == -1) {
            class239.field3366.method3748(6);
            class466.field6276.method3748(6);
            class520.field6953.method3748(6);
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class209(Throwable arg0, String arg1) {
        this.field2993 = arg1;
        this.field2990 = arg0;
    }
}
