import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public abstract class class125 {

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Lgp;")
    public class549 field1733;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public int field1732;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "[I")
    public static int[] field1729 = new int[16384];

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "[I")
    public static int[] field1736 = new int[16384];

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static void method876(int arg0) {
        field1736 = null;
        field1729 = null;
        if (arg0 != 5) {
            method878(false);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)V")
    public abstract void method157(byte arg0, int arg1);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI)I")
    public abstract int method155(boolean arg0, int arg1);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)I")
    public abstract int method158(byte arg0);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[FF[FIIIIZIIIFF)V")
    public static final void method877(int arg0, float[] arg1, float arg2, float[] arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11, float arg12, float arg13) {
        int var14 = arg7 - arg11;
        field1731++;
        int var15 = arg0 - arg4;
        int var16 = arg10 - arg5;
        if (arg8) {
            field1729 = null;
        }
        float var17 = arg3[2] * (float) var16 + arg3[0] * (float) var15 + arg3[1] * (float) var14;
        float var18 = arg3[5] * (float) var16 + arg3[3] * (float) var15 + arg3[4] * (float) var14;
        float var19 = arg3[8] * (float) var16 + arg3[7] * (float) var14 + arg3[6] * (float) var15;
        float var20;
        float var21;
        if (arg6 == 0) {
            var20 = arg12 + 0.5F - var19;
            var21 = arg13 + var17 + 0.5F;
        } else if (arg6 == 1) {
            var21 = arg13 + var17 + 0.5F;
            var20 = arg12 + var19 + 0.5F;
        } else if (arg6 == 2) {
            var20 = arg2 + 0.5F - var18;
            var21 = arg13 + 0.5F - var17;
        } else if (arg6 == 3) {
            var20 = arg2 + 0.5F - var18;
            var21 = arg13 + var17 + 0.5F;
        } else if (arg6 == 4) {
            var20 = arg2 + 0.5F - var18;
            var21 = arg12 + var19 + 0.5F;
        } else {
            var20 = arg2 + 0.5F - var18;
            var21 = arg12 + 0.5F - var19;
        }
        if (arg9 == 1) {
            float var22 = var21;
            var21 = -var20;
            var20 = var22;
        } else if (arg9 == 2) {
            var20 = -var20;
            var21 = -var21;
        } else if (arg9 == 3) {
            float var23 = var21;
            var21 = var20;
            var20 = -var23;
        }
        arg1[1] = var20;
        arg1[0] = var21;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
    public static final void method878(boolean arg0) {
        field1735++;
        if (class369.field5392 == 7) {
            class89.method694(false, 0);
            return;
        }
        class537.field7814 = class325.field4415;
        if (!arg0) {
            method877(96, null, 0.32137054F, null, -111, -42, -49, -95, false, -104, -104, 55, 2.0368018F, -2.724622F);
        }
        class325.field4415 = null;
        class79.method649(-19704, 13);
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(Z)V")
    public abstract void method156(boolean arg0);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)Z")
    public static final boolean method879(int arg0, int arg1, int arg2) {
        if (arg2 == 7) {
            field1734++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)V")
    public final void method880(int arg0, int arg1) {
        field1730++;
        if (arg0 != 11685) {
            this.field1733 = null;
        }
        if (this.method155(true, arg1) != 3) {
            this.method157((byte) -60, arg1);
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lgp;)V")
    public class125(class549 arg0) {
        this.field1733 = arg0;
        this.field1732 = this.method158((byte) 79);
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(ILgp;)V")
    public class125(int arg0, class549 arg1) {
        this.field1733 = arg1;
        this.field1732 = arg0;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field1736[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field1729[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
    }
}
