import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public abstract class class209 {

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public int field3353;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public int field3348;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public int field3349;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "[I")
    public static int[] field3357 = new int[50];

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static int field3356 = 0;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "Llc;")
    public static class86 field3352;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "[S")
    public static short[] field3355;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)Lqe;")
    public static final class99 method1525(int arg0, int arg1, int arg2) {
        class286 var3 = class220.field3525[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class99 var4 = var3.field4526;
            var3.field4526 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static void method1526(int arg0) {
        field3352 = null;
        field3355 = null;
        field3357 = null;
        if (arg0 != -25891) {
            method1528(-128);
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
    public static final void method1527(int arg0) {
        field3351++;
        if (!class202.field3234) {
            return;
        }
        class260.field4254 = null;
        if (arg0 < -20) {
            class202.field3234 = false;
            class98.field1443 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)V")
    public static final void method1528(int arg0) {
        field3350++;
        class50.field732.method563(-120);
        int var1 = class50.field732.method554(8, arg0 ^ 0x625);
        if (class21.field235 > var1) {
            for (int var2 = var1; var2 < class21.field235; var2++) {
                class115.field1668[class88.field1307++] = class39.field556[var2];
            }
        }
        if (var1 > class21.field235) {
            throw new RuntimeException("gnpov1");
        }
        class21.field235 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class39.field556[var3];
            class18 var5 = class169.field2730[var4];
            int var6 = class50.field732.method554(1, -96);
            if (var6 == 0) {
                class39.field556[class21.field235++] = var4;
                var5.field1977 = class264.field4290;
            } else {
                int var7 = class50.field732.method554(2, arg0 + 1531);
                if (var7 == 0) {
                    class39.field556[class21.field235++] = var4;
                    var5.field1977 = class264.field4290;
                    class188.field3045[class121.field1773++] = var4;
                } else if (var7 == 1) {
                    class39.field556[class21.field235++] = var4;
                    var5.field1977 = class264.field4290;
                    int var8 = class50.field732.method554(3, -96);
                    var5.method924(1, true, var8);
                    int var9 = class50.field732.method554(1, -119);
                    if (var9 == 1) {
                        class188.field3045[class121.field1773++] = var4;
                    }
                } else if (var7 == 2) {
                    class39.field556[class21.field235++] = var4;
                    var5.field1977 = class264.field4290;
                    if (class50.field732.method554(1, arg0 + 1585) == 1) {
                        int var10 = class50.field732.method554(3, -114);
                        var5.method924(2, true, var10);
                        int var11 = class50.field732.method554(3, -41);
                        var5.method924(2, true, var11);
                    } else {
                        int var12 = class50.field732.method554(3, -87);
                        var5.method924(0, true, var12);
                    }
                    int var13 = class50.field732.method554(1, arg0 ^ 0x601);
                    if (var13 == 1) {
                        class188.field3045[class121.field1773++] = var4;
                    }
                } else if (var7 == 3) {
                    class115.field1668[class88.field1307++] = var4;
                }
            }
        }
        if (arg0 != -1625) {
            field3357 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(III)V")
    public class209(int arg0, int arg1, int arg2) {
        this.field3353 = arg2;
        this.field3348 = arg0;
        this.field3349 = arg1;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method1529(String arg0, int arg1) {
        field3354++;
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 = (long) arg0.charAt(var5) + (var2 << 5) - var2;
        }
        if (arg1 != 12881) {
            method1525(47, -35, -123);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(III)V")
    public abstract void method318(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(III)V")
    public abstract void method319(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIB)V")
    public abstract void method322(int arg0, int arg1, byte arg2);
}
