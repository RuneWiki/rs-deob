import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class129 extends class224 {

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "[B")
    public byte[] field1943;

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "I")
    public static int field1942 = 0;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([I[IB)V", line = 5)
    public static final void method993(int[] arg0, int[] arg1, byte arg2) {
        field1940++;
        if (arg0 == null || arg1 == null) {
            class87.field1577 = null;
            class679.field9566 = null;
            class281.field4007 = null;
            return;
        }
        class87.field1577 = arg0;
        if (arg2 != -15) {
            method994((byte) 49);
        }
        class281.field4007 = new int[arg0.length];
        class679.field9566 = new byte[arg0.length][][];
        for (int var3 = 0; var3 < class87.field1577.length; var3++) {
            class679.field9566[var3] = new byte[arg1[var3]][];
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V", line = 37)
    public static final void method994(byte arg0) {
        field1941++;
        if (arg0 <= 37) {
            field1942 = -86;
        }
        class42 var1 = null;
        try {
            class637 var2 = class341.field4796.method2277(true, true, "");
            while (var2.field9091 == 0) {
                class246.method1639(1L, (byte) -120);
            }
            if (var2.field9091 == 1) {
                var1 = (class42) var2.field9093;
                class35 var3 = class471.field6781.method2819(-87);
                var1.method385(0, 1, var3.field483, var3.field469);
            }
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method389(31);
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B[IILww;)Loc;", line = 74)
    public static final class201 method995(byte arg0, int[] arg1, int arg2, class729 arg3) {
        field1939++;
        int[] var4 = null;
        int[] var5 = null;
        if (arg0 >= -15) {
            method994((byte) -115);
        }
        int[] var6 = null;
        float[][] var7 = null;
        if (arg3.field10216 != null) {
            int var8 = arg3.field10189;
            int[] var9 = new int[var8];
            int[] var10 = new int[var8];
            int[] var11 = new int[var8];
            int[] var12 = new int[var8];
            int[] var13 = new int[var8];
            int[] var14 = new int[var8];
            for (int var15 = 0; var15 < var8; var15++) {
                var9[var15] = Integer.MAX_VALUE;
                var10[var15] = -2147483647;
                var11[var15] = Integer.MAX_VALUE;
                var12[var15] = -2147483647;
                var13[var15] = Integer.MAX_VALUE;
                var14[var15] = -2147483647;
            }
            for (int var16 = 0; var16 < arg2; var16++) {
                int var23 = arg1[var16];
                if (arg3.field10216[var23] != -1) {
                    int var24 = arg3.field10216[var23] & 0xFF;
                    for (int var25 = 0; var25 < 3; var25++) {
                        short var26;
                        if (var25 == 0) {
                            var26 = arg3.field10208[var23];
                        } else if (var25 == 1) {
                            var26 = arg3.field10170[var23];
                        } else {
                            var26 = arg3.field10218[var23];
                        }
                        int var27 = arg3.field10173[var26];
                        int var28 = arg3.field10221[var26];
                        int var29 = arg3.field10220[var26];
                        if (var9[var24] > var27) {
                            var9[var24] = var27;
                        }
                        if (var27 > var10[var24]) {
                            var10[var24] = var27;
                        }
                        if (var28 < var11[var24]) {
                            var11[var24] = var28;
                        }
                        if (var12[var24] < var28) {
                            var12[var24] = var28;
                        }
                        if (var29 < var13[var24]) {
                            var13[var24] = var29;
                        }
                        if (var29 > var14[var24]) {
                            var14[var24] = var29;
                        }
                    }
                }
            }
            var7 = new float[var8][];
            var5 = new int[var8];
            var4 = new int[var8];
            var6 = new int[var8];
            for (int var17 = 0; var17 < var8; var17++) {
                byte var18 = arg3.field10219[var17];
                if (var18 > 0) {
                    var4[var17] = (var9[var17] + var10[var17]) / 2;
                    var5[var17] = (var11[var17] + var12[var17]) / 2;
                    var6[var17] = (var13[var17] + var14[var17]) / 2;
                    float var20;
                    float var21;
                    float var22;
                    if (var18 == 1) {
                        int var19 = arg3.field10205[var17];
                        var20 = 64.0F / (float) arg3.field10209[var17];
                        if (var19 == 0) {
                            var21 = 1.0F;
                            var22 = 1.0F;
                        } else if (var19 > 0) {
                            var22 = 1.0F;
                            var21 = (float) var19 / 1024.0F;
                        } else {
                            var21 = 1.0F;
                            var22 = (float) (-var19) / 1024.0F;
                        }
                    } else if (var18 == 2) {
                        var20 = 64.0F / (float) arg3.field10209[var17];
                        var21 = 64.0F / (float) arg3.field10195[var17];
                        var22 = 64.0F / (float) arg3.field10205[var17];
                    } else {
                        var22 = (float) arg3.field10205[var17] / 1024.0F;
                        var20 = (float) arg3.field10209[var17] / 1024.0F;
                        var21 = (float) arg3.field10195[var17] / 1024.0F;
                    }
                    var7[var17] = class26.method191(var21, var22, 12, var20, arg3.field10206[var17], arg3.field10199[var17], class555.method3246(255, arg3.field10184[var17]), arg3.field10215[var17]);
                }
            }
        }
        return new class201(var4, var5, var6, var7);
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "([B)V", line = 256)
    public class129(byte[] arg0) {
        this.field1943 = arg0;
    }
}
