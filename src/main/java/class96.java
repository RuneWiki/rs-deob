import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class96 extends class86 {

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "Lgn;")
    public static class475 field1285 = new class475(3, -1);

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "Liu;")
    public static class390 field1294 = new class390(96, 8);

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "J")
    public long field1291;

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "Lna;")
    public static class34 field1295;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "Lih;")
    public static class474 field1290;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "Lmg;")
    public class96 field1286;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "Lmg;")
    public class96 field1287;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "[I")
    public static int[] field1292;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V", line = 6)
    public static void method585(int arg0) {
        field1290 = null;
        field1292 = null;
        if (arg0 <= -123) {
            field1295 = null;
            field1285 = null;
            field1294 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)V", line = 22)
    public static final void method586(int arg0) {
        class357.field5298 = null;
        class65.field972 = false;
        class479.field6930 = null;
        class223.field3157 = null;
        if (arg0 == 3) {
            class450.field6566 = null;
            class165.field2162 = null;
            field1288++;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(Z)Z", line = 39)
    public final boolean method587(boolean arg0) {
        field1284++;
        if (this.field1286 == null) {
            return false;
        } else {
            return !arg0;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([IILso;[I[I)V", line = 58)
    public static final void method588(int[] arg0, int arg1, class313 arg2, int[] arg3, int[] arg4) {
        if (arg1 != -1) {
            field1293 = 31;
        }
        field1289++;
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg3[var5];
            int var8 = arg0[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg2.field4223.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field4223[var9] = null;
                    } else {
                        class168 var10 = class286.field4083.method2602(-24462, var6);
                        int var11 = var10.field2221;
                        class55 var12 = arg2.field4223[var9];
                        if (var12 != null) {
                            if (var12.field848 == var6) {
                                if (var11 == 0) {
                                    var12 = arg2.field4223[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field852 = 0;
                                    var12.field850 = 0;
                                    var12.field851 = var8;
                                    var12.field846 = 1;
                                    var12.field856 = 0;
                                    class204.method1258(-1, 0, arg2.field2959, class415.field6145 == arg2, var10, arg2.field2966, arg2.field2956);
                                } else if (var11 == 2) {
                                    var12.field852 = 0;
                                }
                            } else if (var10.field2217 >= class286.field4083.method2602(-24462, var12.field848).field2217) {
                                var12 = arg2.field4223[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class55 var13 = arg2.field4223[var9] = new class55();
                            var13.field852 = 0;
                            var13.field850 = 0;
                            var13.field851 = var8;
                            var13.field848 = var6;
                            var13.field846 = 1;
                            var13.field856 = 0;
                            class204.method1258(-1, 0, arg2.field2959, class415.field6145 == arg2, var10, arg2.field2966, arg2.field2956);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(B)V", line = 154)
    public final void method589(byte arg0) {
        field1283++;
        if (this.field1286 == null) {
            return;
        }
        if (arg0 != 51) {
            this.method587(false);
        }
        this.field1286.field1287 = this.field1287;
        this.field1287.field1286 = this.field1286;
        this.field1286 = null;
        this.field1287 = null;
    }
}
