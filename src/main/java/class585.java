import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class585 extends class55 {

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    public int field8183;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "Ldha;")
    public class79 field8189;

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "I")
    public int field8192;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "Z")
    public boolean field8186;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "J")
    public static long field8191 = -1L;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "Lvea;")
    public static class276 field8188 = new class276(7, 0, 1, 1);

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "I")
    public static int field8194 = 0;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    public static int field8184;

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "I")
    public static int field8193;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "Z")
    public boolean field8185;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "Z")
    public boolean field8187;

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "Z")
    public boolean field8190;

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "[I")
    public static int[] field8195;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 3)
    public static void method3262(int arg0) {
        field8195 = null;
        if (arg0 != -2496) {
            method3263(-13);
        }
        field8188 = null;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V", line = 15)
    public static final void method3263(int arg0) {
        if (class21.field142 != null) {
            if (class247.field3206) {
                class237.method1431((byte) -51);
            }
            class350.field4641.method3675(0);
            class440.method2489();
            class456.method2548(arg0 ^ 0x6068);
            class569.method3200(true);
            class505.method2814(arg0 ^ 0xFFFF9ABA);
            class546.method3098(arg0 ^ 0x606A);
            if (class257.field3343 != null) {
                class257.field3343.method2636((byte) -87);
            }
            class460.method2563(-32346);
            class586.method3266((byte) 114);
            class675.method3840((byte) 99);
            class736.method4121((byte) -25);
            class104.method712(false, 123);
            for (int var1 = 0; var1 < 2048; var1++) {
                class83 var5 = class361.field4793[var1];
                if (var5 != null) {
                    for (int var6 = 0; var6 < var5.field902.length; var6++) {
                        var5.field902[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class12.field79; var2++) {
                class215 var3 = class746.field10359[var2].field9890;
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field902.length; var4++) {
                        var3.field902[var4] = null;
                    }
                }
            }
            class161.field2025 = null;
            class736.field10270 = null;
            class21.field142.method342(-1);
            class21.field142 = null;
        }
        if (arg0 != -24580) {
            method3264(-123);
        }
        field8193++;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V", line = 98)
    public static final void method3264(int arg0) {
        field8184++;
        class361.field4790 = class569.field8012.method3435(true);
        int var1 = class569.field8012.method3435(true);
        int var2 = class569.field8012.method3411(arg0 ^ 0xC18889D8);
        int var3 = class569.field8012.method3427((byte) -76);
        boolean var4 = class569.field8012.method3435(true) == 1;
        class726.method4073((byte) -103);
        class391.method2273((byte) 8, var1);
        class569.field8012.method2701(0);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < class272.field3589 >> 3; var20++) {
                for (int var21 = 0; var21 < class3.field26 >> 3; var21++) {
                    int var22 = class569.field8012.method2702((byte) -45, 1);
                    if (var22 == 1) {
                        class117.field1548[var5][var20][var21] = class569.field8012.method2702((byte) -86, 26);
                    } else {
                        class117.field1548[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class569.field8012.method2699((byte) 120);
        int var6 = (class488.field6682 - class569.field8012.field8520) / 16;
        class252.field3241 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class252.field3241[var7][var19] = class569.field8012.method3418(-2);
            }
        }
        class584.field8182 = null;
        if (arg0 != -1048016408) {
            field8195 = null;
        }
        class459.field6350 = new byte[var6][];
        class125.field1628 = null;
        client.field4115 = new byte[var6][];
        class735.field10249 = new int[var6];
        class519.field6991 = new int[var6];
        field8195 = new int[var6];
        class354.field4722 = new int[var6];
        class459.field6343 = new int[var6];
        class83.field1140 = new byte[var6][];
        class72.field779 = new byte[var6][];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < class272.field3589 >> 3; var10++) {
                for (int var11 = 0; var11 < class3.field26 >> 3; var11++) {
                    int var12 = class117.field1548[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = (var12 & 0xFFE88A) >> 14;
                        int var14 = var12 >> 3 & 0x7FF;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class519.field6991[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class519.field6991[var8] = var15;
                            int var17 = var15 >> 8 & 0xFF;
                            int var18 = var15 & 0xFF;
                            class354.field4722[var8] = class591.field8248.method2890((byte) -71, "m" + var17 + "_" + var18);
                            field8195[var8] = class591.field8248.method2890((byte) -118, "l" + var17 + "_" + var18);
                            class735.field10249[var8] = class591.field8248.method2890((byte) -126, "um" + var17 + "_" + var18);
                            class459.field6343[var8] = class591.field8248.method2890((byte) -85, "ul" + var17 + "_" + var18);
                            var8++;
                        }
                    }
                }
            }
        }
        class745.method4160(-6547, var2, var4, var3, 11);
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(ILdha;IZ)V", line = 256)
    public class585(int arg0, class79 arg1, int arg2, boolean arg3) {
        this.field8183 = arg2;
        this.field8189 = arg1;
        this.field8192 = arg0;
        this.field8186 = arg3;
    }
}
