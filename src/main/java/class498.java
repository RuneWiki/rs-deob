import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public abstract class class498 extends class665 {

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "F")
    public float field7057;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    private int field7053;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    private int field7061;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public int field7049;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public int field7064;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public int field7059;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field7054 = 0;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "Z")
    public static boolean field7060 = false;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field7050;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field7051;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field7052;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public static int field7056;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public static int field7062;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public static int field7063;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public static int field7065;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public static int field7066;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public static int field7067;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "Ljava/lang/Object;")
    public static Object field7058;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "[Lf;")
    public static class702[] field7055;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)I", line = 8)
    public final int method2875(boolean arg0) {
        field7050++;
        return arg0 ? this.field7064 : 99;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)F", line = 19)
    public final float method2876(int arg0) {
        if (arg0 == 1) {
            field7065++;
            return this.field7057;
        } else {
            return -0.5758332F;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)I", line = 41)
    public final int method2877(int arg0) {
        if (arg0 != -1) {
            this.method771((byte) -36, -0.44936842F);
        }
        field7056++;
        return this.field7049;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)I", line = 52)
    public final int method2878(byte arg0) {
        if (arg0 == -111) {
            field7052++;
            return this.field7053;
        } else {
            return 43;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BII)I", line = 63)
    public static final int method2879(byte arg0, int arg1, int arg2) {
        if (arg1 > arg2) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        if (arg0 > -13) {
            return -94;
        }
        field7066++;
        while (arg1 != 0) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)I", line = 93)
    public final int method2880(int arg0) {
        if (arg0 != -15) {
            this.field7057 = -0.47947496F;
        }
        field7062++;
        return this.field7061;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V", line = 105)
    public static void method2881(byte arg0) {
        if (arg0 != 63) {
            method2881((byte) 15);
        }
        field7055 = null;
        field7058 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)I", line = 125)
    public static final int method2882(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -1) {
            method2882(-81, 97, -27, 112, 70);
        }
        field7063++;
        int var5 = arg2 & 0xF;
        int var6 = var5 < 8 ? arg0 : arg4;
        int var7 = var5 < 4 ? arg4 : (var5 == 12 || var5 == 14 ? arg0 : arg1);
        return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)I", line = 142)
    public final int method2883(int arg0) {
        if (arg0 < 125) {
            field7055 = null;
        }
        field7051++;
        return this.field7059;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(IIIIIF)V", line = 156)
    public class498(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field7057 = arg5;
        this.field7053 = arg4;
        this.field7061 = arg3;
        this.field7049 = arg1;
        this.field7064 = arg2;
        this.field7059 = arg0;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BF)V")
    public abstract void method771(byte arg0, float arg1);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)V")
    public abstract void method772(int arg0, int arg1, int arg2, int arg3);
}
