import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class193 implements class481 {

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "Ltb;")
    private class304 field2938 = new class304(256);

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "Lui;")
    private class451 field2934;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "Lui;")
    private class451 field2937;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "[Lha;")
    private class85[] field2941;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "Lj;")
    public static class240 field2936 = new class240(10, 6);

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "Z")
    public static boolean field2944 = false;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IFZIII)[F")
    public final float[] method1329(int arg0, float arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 100) {
            return null;
        } else {
            field2940++;
            return this.method1334(1, arg0).method1536(0, this, this.field2934, this.field2941[arg0].field1202, arg5, arg4);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
    public static void method1330(byte arg0) {
        if (arg0 != -117) {
            method1330((byte) -97);
        }
        field2936 = null;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)Lha;")
    public final class85 method1331(int arg0, int arg1) {
        field2942++;
        if (arg0 != 9386) {
            method1330((byte) -10);
        }
        return this.field2941[arg1];
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZIIIFZ)[I")
    public final int[] method1332(boolean arg0, int arg1, int arg2, int arg3, float arg4, boolean arg5) {
        if (arg0) {
            this.field2941 = null;
        }
        field2945++;
        return this.method1334(1, arg2).method1537(arg3, this, arg1, this.field2934, this.field2941[arg2].field1202, -1, arg5, (double) arg4);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZFIII)[I")
    public final int[] method1333(int arg0, boolean arg1, float arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 37) {
            field2936 = null;
        }
        field2943++;
        return this.method1334(1, arg5).method1533(this.field2934, false, this, this.field2941[arg5].field1202, (double) arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(II)Lhb;")
    private final class236 method1334(int arg0, int arg1) {
        if (arg0 != 1) {
            this.method1333(-74, false, 0.39887574F, 74, -60, -106);
        }
        field2939++;
        class90 var3 = this.field2938.method1896((long) arg1, (byte) 121);
        if (var3 != null) {
            return (class236) var3;
        }
        byte[] var4 = this.field2937.method2667((byte) -124, arg1);
        if (var4 == null) {
            return null;
        } else {
            class236 var5 = new class236(new class446(var4));
            this.field2938.method1898((long) arg1, var5, (byte) 6);
            return var5;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)Z")
    public final boolean method1335(int arg0, byte arg1) {
        field2935++;
        if (arg1 != 9) {
            this.field2938 = null;
        }
        class236 var3 = this.method1334(arg1 - 8, arg0);
        return var3 != null && var3.method1535(this.field2934, this, true);
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lui;Lui;Lui;)V")
    public class193(class451 arg0, class451 arg1, class451 arg2) {
        this.field2934 = arg2;
        this.field2937 = arg1;
        class446 var4 = new class446(arg0.method2691(0, 0, 0));
        int var5 = var4.method2631(2530);
        this.field2941 = new class85[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method2628(49152) == 1) {
                this.field2941[var6] = new class85();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field2941[var7] != null) {
                this.field2941[var7].field1198 = var4.method2628(49152) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field2941[var8] != null) {
                this.field2941[var8].field1210 = var4.method2628(49152) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2941[var9] != null) {
                this.field2941[var9].field1197 = var4.method2628(49152) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field2941[var10] != null) {
                this.field2941[var10].field1206 = var4.method2628(49152) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field2941[var11] != null) {
                this.field2941[var11].field1211 = var4.method2642(true);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field2941[var12] != null) {
                this.field2941[var12].field1215 = var4.method2642(true);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field2941[var13] != null) {
                this.field2941[var13].field1218 = var4.method2642(true);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field2941[var14] != null) {
                this.field2941[var14].field1216 = var4.method2642(true);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field2941[var15] != null) {
                this.field2941[var15].field1213 = (short) var4.method2631(2530);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field2941[var16] != null) {
                this.field2941[var16].field1208 = var4.method2642(true);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field2941[var17] != null) {
                this.field2941[var17].field1195 = var4.method2642(true);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field2941[var18] != null) {
                this.field2941[var18].field1212 = var4.method2628(49152) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field2941[var19] != null) {
                this.field2941[var19].field1202 = var4.method2628(49152) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field2941[var20] != null) {
                this.field2941[var20].field1200 = var4.method2642(true);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field2941[var21] != null) {
                this.field2941[var21].field1204 = var4.method2628(49152) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field2941[var22] != null) {
                this.field2941[var22].field1205 = var4.method2628(49152) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field2941[var23] != null) {
                this.field2941[var23].field1201 = var4.method2628(49152) == 1;
            }
        }
    }
}
