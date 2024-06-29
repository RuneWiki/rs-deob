import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class64 extends class123 {

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "[Lwi;")
    public class278[] field937;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    public static int field931 = 0;

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
    public static int field946 = -1;

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "Ljava/lang/String;")
    public static String field947 = "shake:";

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "Z")
    public static boolean field940 = false;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "Lgd;")
    public static class325 field933 = new class325(100);

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!wf", name = "H", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "Lpk;")
    public static class120 field942;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "Ltk;")
    public static class266 field936;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "[Lwd;")
    public static class88[] field934;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V", line = 8)
    public static void method507(int arg0) {
        field947 = null;
        field934 = null;
        field936 = null;
        field933 = null;
        if (arg0 == 1793136328) {
            field942 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIII)Z", line = 37)
    public static final boolean method508(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class291.field4569 * arg0 + class255.field3758 * arg3 >> 16;
        int var6 = class291.field4569 * arg3 - class255.field3758 * arg0 >> 16;
        int var7 = class74.field1137 * var6 + class289.field4557 * arg1 >> 16;
        int var8 = class74.field1137 * arg1 - class289.field4557 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class74.field1137 * var6 + class289.field4557 * arg2 >> 16;
        int var12 = class74.field1137 * arg2 - class289.field4557 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class8.field198 && var13 < class8.field198) {
            return false;
        } else if (var9 > class179.field2851 && var13 > class179.field2851) {
            return false;
        } else if (var10 < class149.field2428 && var14 < class149.field2428) {
            return false;
        } else {
            return var10 <= class323.field5064 || var14 <= class323.field5064;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILjava/util/Random;I)I", line = 85)
    public static final int method509(int arg0, Random arg1, int arg2) {
        field938++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class140.method1075((byte) -111, arg0)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            if (arg2 < 20) {
                return -32;
            }
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var3 <= var4);
            return class9.method147(arg0, (byte) -75, var4);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Z", line = 114)
    public final boolean method510(int arg0, int arg1) {
        field939++;
        if (arg0 < 90) {
            method511(false);
        }
        return this.field937[arg1].field4368;
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(Z)V", line = 126)
    public static final void method511(boolean arg0) {
        field935++;
        if (arg0) {
            field946 = 45;
        }
        class82.field1277 = true;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILpk;)V", line = 138)
    public static final void method512(int arg0, class120 arg1) {
        field941++;
        if (arg0 != -1) {
            field936 = (class266) null;
        }
        class39.field597 = arg1;
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)I", line = 157)
    public static final int method513(int arg0) {
        field945++;
        if (class62.field903 == null) {
            return -1;
        } else if (arg0 == 100) {
            while (class62.field903.field1782 > class123.field1997) {
                if (class62.field903.method862((byte) 108, class123.field1997)) {
                    return class123.field1997++;
                }
                class123.field1997++;
            }
            return -1;
        } else {
            return 13;
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lpk;Lpk;IZ)V", line = 181)
    public class64(class120 arg0, class120 arg1, int arg2, boolean arg3) {
        class30 var5 = new class30();
        int var6 = arg0.method962((byte) -104, arg2);
        this.field937 = new class278[var6];
        int[] var7 = arg0.method940(arg2, (byte) -60);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method967(arg2, var7[var8], 65280);
            class9 var10 = null;
            int var11 = var9[0] & 0xFF << 8 | var9[1] & 0xFF;
            for (class9 var12 = (class9) var5.method268(-1); var12 != null; var12 = (class9) var5.method278(1)) {
                if (var12.field221 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method957(0, var11, (byte) 80);
                } else {
                    var13 = arg1.method957(var11, 0, (byte) 75);
                }
                var10 = new class9(var11, var13);
                var5.method277(var10, (byte) -119);
            }
            this.field937[var7[var8]] = new class278(var9, var10);
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)Z", line = 247)
    public final boolean method514(int arg0, int arg1) {
        field944++;
        if (arg0 != 50) {
            this.field937 = (class278[]) null;
        }
        return this.field937[arg1].field4373;
    }
}
