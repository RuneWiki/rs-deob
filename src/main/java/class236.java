import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public abstract class class236 extends class402 {

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
    public int field3296;

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
    public int field3287;

    @OriginalMember(owner = "client!lq", name = "x", descriptor = "I")
    public int field3302;

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
    public int field3290;

    @OriginalMember(owner = "client!lq", name = "t", descriptor = "I")
    public int field3298;

    @OriginalMember(owner = "client!lq", name = "v", descriptor = "I")
    public int field3300;

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "I")
    public int field3293;

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "Z")
    public static boolean field3294 = true;

    @OriginalMember(owner = "client!lq", name = "w", descriptor = "I")
    public static int field3301 = 0;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!lq", name = "m", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!lq", name = "s", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!lq", name = "u", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!lq", name = "y", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "Lir;")
    public static class185 field3286;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILtj;BIZLkm;I)V", line = 4)
    public final void method112(int arg0, class298 arg1, byte arg2, int arg3, boolean arg4, class402 arg5, int arg6) {
        int var8 = -111 / ((46 - arg2) / 45);
        field3285++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "([ILkg;I[I[I)V", line = 30)
    public static final void method1530(int[] arg0, class317 arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg2 != 14875) {
            field3292 = 69;
        }
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg0[var5];
            int var8 = arg3[var5];
            for (int var9 = 0; var7 != 0 && arg1.field2120.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field2120[var9] = null;
                    } else {
                        class233 var10 = class73.method597(var6, -1);
                        int var11 = var10.field3239;
                        class239 var12 = arg1.field2120[var9];
                        if (var12 != null) {
                            if (var12.field3350 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field2120[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3351 = 1;
                                    var12.field3349 = 0;
                                    var12.field3354 = 0;
                                    var12.field3355 = var8;
                                    var12.field3353 = 0;
                                    class379.method2476(0, false, class383.field5609 == arg1, arg1.field5930, var10, arg1.field5921);
                                } else if (var11 == 2) {
                                    var12.field3353 = 0;
                                }
                            } else if (var10.field3250 >= class73.method597(var12.field3350, -1).field3250) {
                                var12 = arg1.field2120[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class239 var13 = arg1.field2120[var9] = new class239();
                            var13.field3353 = 0;
                            var13.field3349 = 0;
                            var13.field3351 = 1;
                            var13.field3350 = var6;
                            var13.field3355 = var8;
                            var13.field3354 = 0;
                            class379.method2476(0, false, class383.field5609 == arg1, arg1.field5930, var10, arg1.field5921);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        field3289++;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 127)
    public static final void method1531(String arg0, int arg1) {
        field3288++;
        if (arg1 > -119) {
            field3295 = 1;
        }
        System.out.println("Error: " + class350.method2315((byte) -126, "%0a", arg0, "\n"));
    }

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "(B)V", line = 144)
    public static void method1532(byte arg0) {
        if (arg0 != 90) {
            field3294 = true;
        }
        field3286 = null;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)Z", line = 155)
    public final boolean method107(byte arg0) {
        if (arg0 < 119) {
            field3286 = null;
        }
        field3299++;
        return false;
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(IIIIIII)V", line = 173)
    public class236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3296 = arg6;
        this.field3287 = arg0;
        this.field3302 = arg2;
        this.field3290 = arg3;
        this.field3298 = arg5;
        this.field3300 = arg4;
        this.field3293 = arg1;
    }

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "(I)V", line = 188)
    public static final void method1533(int arg0) {
        if (arg0 <= 122) {
            field3292 = -87;
        }
        class30.field497.method372(117);
        field3291++;
        class425.field6204.method372(115);
    }

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "(I)V", line = 200)
    public final void method114(int arg0) {
        field3297++;
        if (arg0 != 2) {
            this.field3287 = 87;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "(I)I")
    public abstract int method1529(int arg0);
}
