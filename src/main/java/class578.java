import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public abstract class class578 extends class540 {

    @OriginalMember(owner = "client!jw", name = "i", descriptor = "I")
    public int field8165;

    @OriginalMember(owner = "client!jw", name = "o", descriptor = "I")
    private int field8171;

    @OriginalMember(owner = "client!jw", name = "w", descriptor = "I")
    private int field8179;

    @OriginalMember(owner = "client!jw", name = "u", descriptor = "I")
    public int field8177;

    @OriginalMember(owner = "client!jw", name = "r", descriptor = "I")
    public int field8174;

    @OriginalMember(owner = "client!jw", name = "m", descriptor = "F")
    public float field8169;

    @OriginalMember(owner = "client!jw", name = "l", descriptor = "Ljo;")
    public static class351 field8168 = new class351(36, -1);

    @OriginalMember(owner = "client!jw", name = "j", descriptor = "I")
    public static int field8166;

    @OriginalMember(owner = "client!jw", name = "k", descriptor = "I")
    public static int field8167;

    @OriginalMember(owner = "client!jw", name = "n", descriptor = "I")
    public static int field8170;

    @OriginalMember(owner = "client!jw", name = "p", descriptor = "I")
    public static int field8172;

    @OriginalMember(owner = "client!jw", name = "q", descriptor = "I")
    public static int field8173;

    @OriginalMember(owner = "client!jw", name = "s", descriptor = "I")
    public static int field8175;

    @OriginalMember(owner = "client!jw", name = "t", descriptor = "I")
    public static int field8176;

    @OriginalMember(owner = "client!jw", name = "v", descriptor = "I")
    public static int field8178;

    @OriginalMember(owner = "client!jw", name = "x", descriptor = "I")
    public static int field8180;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)I")
    public final int method3355(int arg0) {
        if (arg0 != 0) {
            this.method3362(-41);
        }
        field8176++;
        return this.field8165;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(B)F")
    public final float method3356(byte arg0) {
        if (arg0 <= 35) {
            this.field8169 = -0.79371F;
        }
        field8167++;
        return this.field8169;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(III)V")
    public static final void method3357(int arg0, int arg1, int arg2) {
        field8172++;
        if (class438.field6281 == null) {
            return;
        }
        int var3 = class606.field8522;
        int var4 = class526.field7491;
        class406.method2452(arg1, (byte) -25, arg2);
        if (class463.field6612 == 0) {
            class27.field393 = null;
            class27.field393 = class438.field6281.method456(class438.field6281.method501(class745.field10372, class212.field3070), class438.field6281.method442(class745.field10372, class212.field3070));
        } else if (class463.field6612 == 1 && (class519.field7409 == null || class606.field8522 != var3 || class526.field7491 != var4)) {
            class519.field7409 = new class753[class606.field8522 * class526.field7491];
            for (int var5 = 0; var5 < class519.field7409.length; var5++) {
                class519.field7409[var5] = class438.field6281.method456(class438.field6281.method501(class692.field9768, class637.field8968), class438.field6281.method442(class692.field9768, class637.field8968));
            }
            class148.field1898 = new int[class606.field8522 * class526.field7491];
            class502.field7191 = 1;
        }
        class432.field6151 = true;
        if (arg0 != 1) {
            method3361(86, 106, -12, -70, 92, 38, 82, 39);
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIII)V")
    public abstract void method1980(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "(B)I")
    public final int method3358(byte arg0) {
        field8173++;
        return arg0 == 22 ? this.field8177 : -71;
    }

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "(I)V")
    public static void method3359(int arg0) {
        field8168 = null;
        if (arg0 != 1) {
            field8168 = null;
        }
    }

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "(I)I")
    public final int method3360(int arg0) {
        if (arg0 != -31770) {
            method3361(-90, -4, -86, -17, 92, -100, 103, 23);
        }
        field8166++;
        return this.field8171;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8180++;
        int var8 = arg5 - arg6;
        int var9 = arg3 + arg6;
        for (int var10 = arg3; var10 < var9; var10++) {
            class382.method2347(arg0, class347.field5087[var10], arg7, 7, arg1);
        }
        if (arg4 >= -19) {
            return;
        }
        for (int var11 = arg5; var11 > var8; var11--) {
            class382.method2347(arg0, class347.field5087[var11], arg7, 7, arg1);
        }
        int var12 = arg0 + arg6;
        int var13 = arg1 - arg6;
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class347.field5087[var14];
            class382.method2347(arg0, var15, arg7, 7, var12);
            class382.method2347(var12, var15, arg2, 7, var13);
            class382.method2347(var13, var15, arg7, 7, arg1);
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IF)V")
    public abstract void method1981(int arg0, float arg1);

    @OriginalMember(owner = "client!jw", name = "g", descriptor = "(I)I")
    public final int method3362(int arg0) {
        field8170++;
        return arg0 == 0 ? this.field8179 : -69;
    }

    @OriginalMember(owner = "client!jw", name = "h", descriptor = "(I)I")
    public final int method3363(int arg0) {
        field8175++;
        if (arg0 != -1) {
            this.method3355(-5);
        }
        return this.field8174;
    }

    @OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(IIIIIF)V")
    public class578(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field8165 = arg1;
        this.field8171 = arg3;
        this.field8179 = arg4;
        this.field8177 = arg0;
        this.field8174 = arg2;
        this.field8169 = arg5;
    }
}
