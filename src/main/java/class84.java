import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class84 {

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public int field1277 = 8;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public int field1274 = 16777215;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "Z")
    public static boolean field1275 = false;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1280 = "Loaded config";

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public int field1267;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public int field1268;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public int field1271;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public int field1272;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public int field1279;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Lrk;")
    public static class252 field1266;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "Z")
    public boolean field1278;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "[[S")
    public static short[][] field1282;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lgn;IIB)V", line = 4)
    private final void method575(class303 arg0, int arg1, int arg2, byte arg3) {
        if (arg2 == 1) {
            this.field1277 = arg0.method1994(false);
        } else if (arg2 == 2) {
            this.field1278 = true;
        } else if (arg2 == 3) {
            this.field1272 = arg0.method2042(7);
            this.field1271 = arg0.method2042(7);
            this.field1268 = arg0.method2042(7);
        } else if (arg2 == 4) {
            this.field1279 = arg0.method2043((byte) -122);
        } else if (arg2 == 5) {
            this.field1267 = arg0.method1994(false);
        } else if (arg2 == 6) {
            this.field1274 = arg0.method2059(255);
        }
        field1269++;
        int var5 = -24 / ((-arg3 - 59) / 57);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lgn;IB)V", line = 56)
    public final void method576(class303 arg0, int arg1, byte arg2) {
        while (true) {
            int var4 = arg0.method2043((byte) -126);
            if (var4 == 0) {
                if (arg2 > -16) {
                    this.method575((class303) null, -110, -91, (byte) 31);
                }
                field1273++;
                return;
            }
            this.method575(arg0, arg1, var4, (byte) -119);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V", line = 82)
    public static void method577(byte arg0) {
        if (arg0 != 21) {
            field1282 = (short[][]) ((short[][]) null);
        }
        field1266 = null;
        field1282 = (short[][]) null;
        field1280 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([II[I[ILjj;)V", line = 104)
    public static final void method578(int[] arg0, int arg1, int[] arg2, int[] arg3, class80 arg4) {
        field1265++;
        for (int var5 = arg1; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg2[var5];
            int var8 = arg0[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg4.field523.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field523[var9] = null;
                    } else {
                        class222 var10 = class118.method809((byte) 39, var6);
                        int var11 = var10.field3552;
                        class262 var12 = arg4.field523[var9];
                        if (var12 != null) {
                            if (var12.field4057 == var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field523[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field4048 = 0;
                                    var12.field4054 = 0;
                                    var12.field4058 = var8;
                                    var12.field4056 = 0;
                                    var12.field4053 = 1;
                                    class229.method1571(arg4.field537, false, (byte) -110, arg4.field519, var10, 0);
                                } else if (var11 == 2) {
                                    var12.field4056 = 0;
                                }
                            } else if (var10.field3560 >= class118.method809((byte) 89, var12.field4057).field3560) {
                                var12 = arg4.field523[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class262 var13 = arg4.field523[var9] = new class262();
                            var13.field4048 = 0;
                            var13.field4058 = var8;
                            var13.field4057 = var6;
                            var13.field4053 = 1;
                            var13.field4054 = 0;
                            var13.field4056 = 0;
                            class229.method1571(arg4.field537, false, (byte) -110, arg4.field519, var10, 0);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lwf;I)V", line = 202)
    public static final void method579(class306 arg0, int arg1) {
        field1281++;
        class248.field3911 = arg0;
        if (arg1 != 0) {
            method579((class306) null, -12);
        }
    }
}
