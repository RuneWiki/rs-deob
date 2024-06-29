import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class1 {

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "Z")
    public static boolean field3 = false;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "[F")
    public static float[] field11 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field10 = -1;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public int field4;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "Lqk;")
    public class1 field2;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "Lol;")
    public class290 field9;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "Lot;")
    public static class500 field7;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IF[FIIFIIIIIFI)V")
    public static final void method1(int arg0, float arg1, float[] arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10, float arg11, int arg12) {
        field5++;
        int var13 = arg4 - arg0;
        int var14 = arg9 - arg12;
        int var15 = arg3 - arg10;
        if (arg8 >= -24) {
            method4(43);
        }
        float var16 = arg2[2] * (float) var13 + arg2[1] * (float) var14 + arg2[0] * (float) var15;
        float var17 = arg2[5] * (float) var13 + arg2[4] * (float) var14 + arg2[3] * (float) var15;
        float var18 = arg2[8] * (float) var13 + arg2[7] * (float) var14 + arg2[6] * (float) var15;
        float var19;
        float var20;
        if (arg6 == 0) {
            var20 = arg11 + var16 + 0.5F;
            var19 = arg1 + 0.5F - var18;
        } else if (arg6 == 1) {
            var19 = arg1 + var18 + 0.5F;
            var20 = arg11 + var16 + 0.5F;
        } else if (arg6 == 2) {
            var19 = arg5 + 0.5F - var17;
            var20 = arg11 + 0.5F - var16;
        } else if (arg6 == 3) {
            var19 = arg5 + 0.5F - var17;
            var20 = arg11 + var16 + 0.5F;
        } else if (arg6 == 4) {
            var20 = arg1 + var18 + 0.5F;
            var19 = arg5 + 0.5F - var17;
        } else {
            var20 = arg1 + 0.5F - var18;
            var19 = arg5 + 0.5F - var17;
        }
        if (arg7 == 1) {
            float var21 = var20;
            var20 = -var19;
            var19 = var21;
        } else if (arg7 == 2) {
            var20 = -var20;
            var19 = -var19;
        } else if (arg7 == 3) {
            float var22 = var20;
            var20 = var19;
            var19 = -var22;
        }
        class369.field5718 = var19;
        class275.field4522 = var20;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
    public static void method2(int arg0) {
        field11 = null;
        field7 = null;
        if (arg0 != 31897) {
            field10 = -66;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
    public final void method3(boolean arg0) {
        field6++;
        if (class4.field42 >= 500) {
            return;
        }
        this.field2 = class236.field4086;
        this.field4 = 0;
        this.field9 = null;
        class4.field42++;
        if (!arg0) {
            class236.field4086 = this;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)Z")
    public static final boolean method4(int arg0) {
        field8++;
        class276 var1 = class108.field1934.field6207.field4530;
        if (var1 == null || class108.field1934.field6207 == var1) {
            return false;
        }
        class162 var2 = (class162) var1;
        if (var2.field2576 >= 2000) {
            var2.field2576 -= 2000;
        }
        return (short) arg0 == var2.field2576;
    }

    static {
        new class306("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
    }
}
