import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class166 {

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "[I")
    public static int[] field2608 = new int[50];

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "[I")
    public static int[] field2607 = new int[100];

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public int field2604;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public int field2605;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public int field2606;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public int field2614;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "J")
    public long field2611;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "Ljk;")
    public class276 field2610;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "Ljk;")
    public class276 field2612;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "Ljk;")
    public class276 field2613;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static void method1110(int arg0) {
        field2608 = null;
        field2607 = null;
        if (arg0 != 1002) {
            method1110(43);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lli;Led;III)V")
    public static final void method1111(class314 arg0, class195 arg1, int arg2, int arg3, int arg4) {
        field2609++;
        if (arg1.field3107 != null) {
            boolean var5 = false;
            int[] var6 = new int[arg1.field3107.length];
            for (int var7 = 0; var7 < (var6.length / 2); var7++) {
                int var12 = arg1.field3107[var7 * 2] + arg0.field5065;
                int var13 = arg0.field5056 - arg1.field3107[var7 * 2 + 1];
                int var14 = var6[var7 * 2] = class13.field178 + ((var12 - class13.field184) * (class13.field191 - class13.field178) / (class13.field183 - class13.field184));
                int var15 = var6[var7 * 2 + 1] = (var13 - class13.field180) * (class13.field189 - class13.field177) / (class13.field176 - class13.field180) + class13.field177;
                if (class13.field178 < var14 && class13.field191 > var14 && class13.field177 < var15 && var15 < class13.field189) {
                    var5 = true;
                }
            }
            if (!var5) {
                return;
            }
            class240.method1675(var6, arg1.field3106, arg1.field3106 >>> 24);
            for (int var8 = 0; var8 < (var6.length / 2 - 1); var8++) {
                class62.method404(var6[var8 * 2], var6[var8 * 2 + 1], var6[(var8 + 1) * 2], var6[var8 * 2 + 2 + 1], arg1.field3112, arg1.field3112 >>> 24);
            }
            class62.method404(var6[var6.length - 2], var6[var6.length - 1], var6[0], var6[1], arg1.field3112, arg1.field3112 >>> 24);
        } else if (arg0.field5068) {
            return;
        }
        if (arg3 != 0) {
            return;
        }
        class5 var9 = null;
        class85 var10 = new class85(arg0);
        if (arg1.field3104 != -1) {
            if (arg0.field5059 && arg1.field3084 != -1) {
                var9 = (class5) arg1.method1357(true, 0, true);
            } else {
                var9 = (class5) arg1.method1357(true, 0, false);
            }
            if (var9 != null) {
                if (class237.field3752 > 0 && (class203.field3279 != -1 && class203.field3279 == arg0.field5051 || class208.field3326 != -1 && class208.field3326 == arg1.field3099)) {
                    int var11;
                    if (class273.field4482 <= 50) {
                        var11 = class273.field4482 * 3;
                    } else {
                        var11 = (100 - class273.field4482) * 3;
                    }
                    class62.method407(arg0.field5060, arg0.field5062, var9.field1681 / 2 + 7, 16776960, var11);
                    class62.method407(arg0.field5060, arg0.field5062, var9.field1681 / 2 + 5, 16776960, var11);
                    class62.method407(arg0.field5060, arg0.field5062, var9.field1681 / 2 + 3, 16776960, var11);
                    class62.method407(arg0.field5060, arg0.field5062, var9.field1681 / 2 + 1, 16776960, var11);
                    class62.method407(arg0.field5060, arg0.field5062, var9.field1681 / 2, 16776960, var11);
                }
                var9.method20(arg0.field5060 - (var9.field1681 >> 1), arg0.field5062 - (var9.field1672 >> 1));
                var10.field1345 = (var9.field1681 >> 1) + arg0.field5060 + arg2;
                var10.field1346 = arg4 + arg0.field5062 - (var9.field1672 >> 1);
                var10.field1349 = (var9.field1672 >> 1) + arg0.field5062 + arg4;
                var10.field1342 = arg2 - ((var9.field1681 >> 1) - arg0.field5060);
            }
        }
        if (arg1.field3088 != null) {
            if (var9 == null) {
                class87.method576(var10, (byte) -124, arg1, arg4, 0, arg2, arg0, true);
            } else {
                class87.method576(var10, (byte) -124, arg1, arg4, (var9.field1672 >> 1) + 5, arg2, arg0, false);
            }
        }
        if (var10.method568(class1.field1, -12751, class60.field924) && arg1.field3079 != null) {
            if (arg1.field3079[4] != null) {
                class192.method1333(0, arg1.field3079[4], (long) arg0.field5051, arg1.field3091, (short) 1007, arg1.field3099, -1, 9910);
            }
            if (arg1.field3079[3] != null) {
                class192.method1333(0, arg1.field3079[3], (long) arg0.field5051, arg1.field3091, (short) 1002, arg1.field3099, -1, 9910);
            }
            if (arg1.field3079[2] != null) {
                class192.method1333(0, arg1.field3079[2], (long) arg0.field5051, arg1.field3091, (short) 1012, arg1.field3099, -1, arg3 + 9910);
            }
            if (arg1.field3079[1] != null) {
                class192.method1333(0, arg1.field3079[1], (long) arg0.field5051, arg1.field3091, (short) 1001, arg1.field3099, -1, 9910);
            }
            if (arg1.field3079[0] != null) {
                class192.method1333(0, arg1.field3079[0], (long) arg0.field5051, arg1.field3091, (short) 1010, arg1.field3099, -1, 9910);
            }
        }
        class194.field3071.method1952(var10, 76);
    }
}
