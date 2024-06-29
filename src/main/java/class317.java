import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class317 extends class107 {

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public int field4516 = 0;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "[F")
    public static float[] field4513 = new float[16384];

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "[F")
    public static float[] field4515 = new float[16384];

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    public static int field4520;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4513[var2] = (float) Math.sin((double) var2 * var0);
            field4515[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lso;II)V", line = 3)
    private final void method2055(class494 arg0, int arg1, int arg2) {
        int var4 = -16 % ((-arg1 - 87) / 34);
        field4514++;
        if (arg2 == 2) {
            this.field4516 = arg0.method2998(true);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIZIIIII)V", line = 20)
    public static final void method2056(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2) {
            return;
        }
        field4519++;
        int var8 = arg3 - arg6;
        int var9 = arg4 + arg6;
        for (int var10 = arg4; var10 < var9; var10++) {
            class434.method2601(class746.field10330[var10], arg1, arg5, (byte) -62, arg7);
        }
        int var11 = arg1 + arg6;
        int var12 = arg7 - arg6;
        for (int var13 = arg3; var13 > var8; var13--) {
            class434.method2601(class746.field10330[var13], arg1, arg5, (byte) -62, arg7);
        }
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class746.field10330[var14];
            class434.method2601(var15, arg1, arg5, (byte) -62, var11);
            class434.method2601(var15, var11, arg0, (byte) -62, var12);
            class434.method2601(var15, var12, arg5, (byte) -62, arg7);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 65)
    public static final String method2057(int arg0, String arg1) {
        field4518++;
        int var2 = arg1.length();
        int var3 = 0;
        int var4 = 0;
        if (arg0 < 109) {
            field4520 = -98;
        }
        while (var4 < var2) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
            var4++;
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 115)
    public static void method2058(int arg0) {
        field4513 = null;
        field4515 = null;
        if (arg0 != 16384) {
            field4515 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lso;I)V", line = 126)
    public final void method2059(class494 arg0, int arg1) {
        if (arg1 != -1) {
            field4515 = null;
        }
        while (true) {
            int var3 = arg0.method2964((byte) 75);
            if (var3 == 0) {
                field4517++;
                return;
            }
            this.method2055(arg0, -125, var3);
        }
    }
}
