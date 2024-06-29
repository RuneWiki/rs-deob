import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class19 extends class106 {

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "Z")
    public static boolean field394 = false;

    @OriginalMember(owner = "client!bg", name = "C", descriptor = "Loc;")
    public static class151 field406 = class137.method873(2, "k");

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
    public static int field397 = 0;

    @OriginalMember(owner = "client!bg", name = "H", descriptor = "[Z")
    public static boolean[] field411 = new boolean[5];

    @OriginalMember(owner = "client!bg", name = "I", descriptor = "Loc;")
    public static class151 field412 = class137.method873(2, ": ");

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "I")
    public int field400;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "I")
    public int field401;

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!bg", name = "A", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!bg", name = "B", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "Ljh;")
    public static class105 field403;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "[I")
    public static int[] field396;

    @OriginalMember(owner = "client!bg", name = "E", descriptor = "[I")
    public int[] field408;

    @OriginalMember(owner = "client!bg", name = "F", descriptor = "[I")
    public int[] field409;

    @OriginalMember(owner = "client!bg", name = "G", descriptor = "[I")
    public int[] field410;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "[Lha;")
    public class77[] field395;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "[Lha;")
    public class77[] field398;

    @OriginalMember(owner = "client!bg", name = "D", descriptor = "[[[B")
    public byte[][][] field407;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)V")
    public static final void method165(byte arg0) {
        int var1 = 0;
        int var2 = -56 % ((43 - arg0) / 48);
        while (class111.field1956 > var1) {
            int var3 = class218.field3800[var1];
            class20 var4 = class179.field3229[var3];
            int var5 = class1.field34.method1475(255);
            if ((var5 & 0x20) != 0) {
                var5 += class1.field34.method1475(255) << 8;
            }
            class67.method441(var3, false, var5, var4);
            var1++;
        }
        field399++;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)Leg;")
    public static final class52 method166(int arg0, int arg1) {
        field405++;
        class52 var2 = (class52) class232.field4176.method1318((byte) -54, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class202.field3599.method1208(class37.method281(arg1 - 22777, arg0), (byte) -75, class79.method509(arg1 - 23006, arg0));
        class52 var4 = new class52();
        var4.field1059 = arg0;
        if (var3 != null) {
            var4.method361(new class229(var3), 80);
        }
        if (arg1 != 22883) {
            method167(85, 116);
        }
        class232.field4176.method1324(var4, arg1 - 4510, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(II)Lbd;")
    public static final class16 method167(int arg0, int arg1) {
        field402++;
        class16 var2 = (class16) class113.field2013.method1318((byte) -95, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class222.field3853.method1208(0, (byte) -119, arg0);
        if (var3 == null) {
            return null;
        }
        class16 var4 = new class16();
        class229 var5 = new class229(var3);
        var5.field4101 = var5.field4087.length - 2;
        int var6 = var5.method1490((byte) 73);
        int var7 = var5.field4087.length - var6 - 12 - 2;
        var5.field4101 = var7;
        int var8 = var5.method1437(arg1 + 425528536);
        var4.field366 = var5.method1490((byte) 73);
        var4.field369 = var5.method1490((byte) 73);
        var4.field376 = var5.method1490((byte) 73);
        var4.field380 = var5.method1490((byte) 73);
        int var9 = var5.method1475(arg1 ^ 0xFF);
        if (var9 > 0) {
            var4.field377 = new class236[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1490((byte) 73);
                class236 var12 = new class236(class54.method373(var11, 70));
                var4.field377[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method1437(arg1 + 425528536);
                    int var14 = var5.method1437(425528536);
                    var12.method1536((byte) -102, new class170(var14), (long) var13);
                }
            }
        }
        var5.field4101 = 0;
        int var15 = arg1;
        var4.field384 = var5.method1472((byte) -127);
        var4.field379 = new int[var8];
        var4.field385 = new class151[var8];
        var4.field386 = new int[var8];
        while (var7 > var5.field4101) {
            int var16 = var5.method1490((byte) 73);
            if (var16 == 3) {
                var4.field385[var15] = var5.method1443((byte) -78);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field386[var15] = var5.method1475(255);
            } else {
                var4.field386[var15] = var5.method1437(425528536);
            }
            var4.field379[var15++] = var16;
        }
        class113.field2013.method1324(var4, 18373, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
    public static void method168(boolean arg0) {
        field411 = null;
        if (arg0) {
            method169(null, -91, -87, true, 0, -78);
        }
        field406 = null;
        field403 = null;
        field396 = null;
        field412 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lkg;IIZII)V")
    public static final void method169(class115 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field404++;
        if (arg5 != -24879) {
            method167(80, 99);
        }
        if (class182.field3299 >= 50 || (arg0.field2053 == null || arg4 >= arg0.field2053.length)) {
            return;
        }
        int var6 = arg0.field2053[arg4];
        if (var6 == 0) {
            return;
        }
        int var7 = var6 >> 8;
        int var8 = var6 >> 4 & 0x7;
        int var9 = var6 & 0xF;
        if (var9 == 0) {
            if (arg3) {
                class211.method1323(arg5 + 49476, var7, var8, 0);
            }
        } else if (class57.field1139 != 0) {
            int var10 = (arg2 - 64) / 128;
            int var11 = (arg1 - 64) / 128;
            class128.field2305[class182.field3299] = var7;
            class120.field2168[class182.field3299] = var8;
            class155.field2800[class182.field3299] = 0;
            class141.field2561[class182.field3299] = null;
            class57.field1154[class182.field3299] = (var10 << 16) + (var11 << 8) + var9;
            class182.field3299++;
        }
    }
}
