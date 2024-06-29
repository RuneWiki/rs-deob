import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class131 extends class41 {

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "[I")
    public static int[] field2170 = new int[32];

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "[I")
    public static int[] field2173;

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
    public int field2164;

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "Lni;")
    public static class118 field2174;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "Ljb;")
    public static class11 field2178;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "Llg;")
    public class195 field2168;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "Ldg;")
    public class90 field2161;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "[B")
    public byte[] field2165;

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "[I")
    public static int[] field2175;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "[Li;")
    public static class192[] field2167;

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "[[Z")
    public static boolean[][] field2172;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)I")
    public static final int method844(byte arg0) {
        if (arg0 == -63) {
            field2171++;
            return class195.field3406;
        } else {
            return -105;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIILaf;Laf;IIJ)V")
    public static final void method845(int arg0, int arg1, int arg2, int arg3, class208 arg4, class208 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class75 var10 = new class75();
        var10.field1213 = arg8;
        var10.field1207 = arg1 * 128 + 64;
        var10.field1211 = arg2 * 128 + 64;
        var10.field1210 = arg3;
        var10.field1203 = arg4;
        var10.field1212 = arg5;
        var10.field1202 = arg6;
        var10.field1205 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class221.field3820[var11][arg1][arg2] == null) {
                class221.field3820[var11][arg1][arg2] = new class220(var11, arg1, arg2);
            }
        }
        class221.field3820[arg0][arg1][arg2].field3801 = var10;
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V")
    public static final void method846(int arg0) {
        field2166++;
        try {
            if (class97.field1575 == 1) {
                int var1 = class247.field4317.method1289((byte) 119);
                if (var1 > 0 && class247.field4317.method1269(122)) {
                    int var2 = var1 - class263.field4577;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class247.field4317.method1266((byte) 65, var2);
                    return;
                }
                class247.field4317.method1272(511);
                class247.field4317.method1278(16);
                class61.field923 = null;
                if (class218.field3765 == null) {
                    class97.field1575 = 0;
                } else {
                    class97.field1575 = 2;
                }
                class76.field1221 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class247.field4317.method1272(511);
            class218.field3765 = null;
            class97.field1575 = 0;
            class76.field1221 = null;
            class61.field923 = null;
        }
        if (arg0 > -5) {
            field2173 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III[B)Z")
    public static final boolean method847(int arg0, int arg1, int arg2, byte[] arg3) {
        boolean var4 = true;
        field2162++;
        class230 var5 = new class230(arg3);
        int var6 = -1;
        label72: while (true) {
            int var7 = var5.method1567((byte) -112);
            if (var7 == 0) {
                if (arg0 != 103) {
                    field2170 = null;
                }
                return var4;
            }
            var6 += var7;
            boolean var8 = false;
            int var9 = 0;
            while (true) {
                int var13;
                class148 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var8) {
                                        int var17 = var5.method1517(false);
                                        if (var17 == 0) {
                                            continue label72;
                                        }
                                        var5.method1516((byte) 82);
                                    }
                                    int var10 = var5.method1517(false);
                                    if (var10 == 0) {
                                        continue label72;
                                    }
                                    var9 += var10 - 1;
                                    int var11 = var9 & 0x3F;
                                    int var12 = var9 >> 6 & 0x3F;
                                    var13 = var5.method1516((byte) 82) >> 2;
                                    var14 = arg2 + var12;
                                    var15 = arg1 + var11;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= 103);
                    } while (var15 >= 103);
                    var16 = class62.method442((byte) 79, var6);
                } while (var13 == 22 && !class239.field4165 && var16.field2420 == 0 && var16.field2463 != 1 && !var16.field2444);
                var8 = true;
                if (!var16.method960((byte) 92)) {
                    class229.field3922++;
                    var4 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljb;Ljb;ILjb;Ljb;)V")
    public static final void method848(class11 arg0, class11 arg1, int arg2, class11 arg3, class11 arg4) {
        class4.field79 = arg1;
        class98.field1585 = arg3;
        field2169++;
        class212.field3663 = arg0;
        int var5 = -76 / ((arg2 - 66) / 33);
        class196.field3413 = arg4;
        class208.field3563 = new class175[class212.field3663.method95(-118)][];
        class262.field4573 = new boolean[class212.field3663.method95(-128)];
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V")
    public static void method849(int arg0) {
        field2167 = null;
        field2172 = null;
        field2175 = null;
        field2173 = null;
        field2178 = null;
        field2174 = null;
        field2170 = null;
        if (arg0 != 0) {
            method845(-114, 32, -13, -12, (class208) null, (class208) null, 117, -100, 40L);
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2170[var1] = var0 - 1;
            var0 += var0;
        }
        field2173 = new int[1000];
        field2176 = 0;
        field2177 = 0;
    }
}
