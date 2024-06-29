import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class225 {

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "[Lrf;")
    public static class191[] field4225 = new class191[32768];

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "Li;")
    private static class88 field4222 = class208.method1425(105, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "[Z")
    public static boolean[] field4230 = new boolean[100];

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "Li;")
    public static class88 field4221 = null;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "Li;")
    public static class88 field4227 = class208.method1425(105, "leuchten2:");

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public static int field4233 = 0;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "Li;")
    public static class88 field4232 = field4222;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "[[I")
    public static int[][] field4234 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "Li;")
    public static class88 field4224 = class208.method1425(105, "blinken2:");

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "Lq;")
    public static class174 field4231;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "[I")
    public static int[] field4220;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static void method1513(int arg0) {
        field4221 = null;
        int var1 = -5 / ((arg0 + 74) / 37);
        field4231 = null;
        field4225 = null;
        field4224 = null;
        field4222 = null;
        field4227 = null;
        field4230 = null;
        field4220 = null;
        field4234 = null;
        field4232 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILq;)Lq;")
    public static final class174 method1514(int arg0, class174 arg1) {
        field4226++;
        if (arg0 <= 100) {
            method1516(23, 87, 22, -99, 73, (byte) 77, 68, -29);
        }
        class174 var2 = class87.method583(0, arg1);
        if (var2 == null) {
            var2 = arg1.field3504;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Llf;IIII)V")
    public static final void method1515(class126 arg0, int arg1, int arg2, int arg3, int arg4) {
        field4229++;
        if (class203.field3864 >= 400) {
            return;
        }
        if (arg0.field2329 != null) {
            arg0 = arg0.method864((byte) 47);
        }
        if (arg0 == null || !arg0.field2361) {
            return;
        }
        class88 var5 = arg0.field2343;
        if (arg0.field2333 != 0) {
            var5 = class166.method1142(new class88[] { var5, class168.method1154(arg0.field2333, class240.field4458.field747, 14058), class68.field1238, class145.field2719, class170.method1214(arg0.field2333, arg2 ^ 0x394D), class104.field1881 }, arg2 ^ 0xFFFFC6B4);
        }
        if (class28.field475 == 1) {
            class24.field384++;
            class98.method687(arg2 ^ 0x1F5B, arg4, class35.field608, (short) 48, (long) arg1, class166.method1142(new class88[] { class78.field1414, class134.field2495, var5 }, -3), arg3);
        } else if (!class10.field145) {
            class88[] var6 = arg0.field2344;
            if (class99.field1809) {
                var6 = class138.method923(var6, (byte) 41);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class47.field884 != 0 || !var6[var7].method624(class158.field3043, (byte) -69))) {
                        class109.field1981++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 17;
                        }
                        if (var7 == 1) {
                            var8 = 38;
                        }
                        if (var7 == 2) {
                            var8 = 34;
                        }
                        if (var7 == 3) {
                            var8 = 32;
                        }
                        if (var7 == 4) {
                            var8 = 4;
                        }
                        class98.method687(9746, arg4, var6[var7], var8, (long) arg1, class166.method1142(new class88[] { class8.field120, var5 }, arg2 ^ 0xFFFFC6B4), arg3);
                    }
                }
            }
            class227.field4266++;
            if (class47.field884 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method624(class158.field3043, (byte) 55)) {
                        class110.field2021++;
                        short var10 = 0;
                        if (arg0.field2333 > class240.field4458.field747) {
                            var10 = 2000;
                        }
                        short var11 = 0;
                        if (var9 == 0) {
                            var11 = 17;
                        }
                        if (var9 == 1) {
                            var11 = 38;
                        }
                        if (var9 == 2) {
                            var11 = 34;
                        }
                        if (var9 == 3) {
                            var11 = 32;
                        }
                        if (var9 == 4) {
                            var11 = 4;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class98.method687(arg2 ^ 0x1F5B, arg4, var6[var9], var11, (long) arg1, class166.method1142(new class88[] { class8.field120, var5 }, -3), arg3);
                    }
                }
            }
            class98.method687(9746, arg4, class65.field1174, (short) 1002, (long) arg1, class166.method1142(new class88[] { class8.field120, var5 }, -3), arg3);
        } else if ((class115.field2086 & 0x2) == 2) {
            class129.field2417++;
            class98.method687(9746, arg4, class201.field3837, (short) 19, (long) arg1, class166.method1142(new class88[] { class28.field464, class134.field2495, var5 }, -3), arg3);
        }
        if (arg2 != 14665) {
            method1515(null, 37, -24, 1, 17);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method1516(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        int var8 = 15 % ((arg5 + 12) / 36);
        field4223++;
        if (arg1 == arg2) {
            client.method216(arg2, arg6, arg4, arg7, -14871, arg0, arg3);
        } else if (arg3 - arg2 >= class67.field1207 && arg2 + arg3 <= class12.field183 && class49.field919 <= arg7 - arg1 && class18.field279 >= arg1 + arg7) {
            class23.method126(arg3, arg0, arg1, arg6, arg4, -81, arg7, arg2);
        } else {
            class154.method1053(arg7, arg4, arg2, arg6, arg0, (byte) 78, arg1, arg3);
        }
    }
}
