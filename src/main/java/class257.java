import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class257 extends class96 {

    @OriginalMember(owner = "client!nu", name = "V", descriptor = "I")
    private int field3257 = -1;

    @OriginalMember(owner = "client!nu", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field3252 = null;

    @OriginalMember(owner = "client!nu", name = "K", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!nu", name = "L", descriptor = "I")
    private int field3247;

    @OriginalMember(owner = "client!nu", name = "M", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!nu", name = "N", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!nu", name = "O", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!nu", name = "R", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!nu", name = "S", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!nu", name = "T", descriptor = "I")
    private int field3255;

    @OriginalMember(owner = "client!nu", name = "W", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!nu", name = "P", descriptor = "Ldn;")
    public static class201 field3251;

    @OriginalMember(owner = "client!nu", name = "U", descriptor = "[I")
    private int[] field3256;

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V", line = 4)
    public class257() {
        super(0, false);
    }

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "(III)Z", line = 8)
    public static final boolean method1611(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            return true;
        } else {
            ++field3253;
            return ~(34 & arg0) != -1;
        }
    }

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "(I)V", line = 20)
    public final void method655(int arg0) {
        ++field3250;
        super.method655(arg0);
        this.field3256 = null;
    }

    @OriginalMember(owner = "client!nu", name = "f", descriptor = "(I)I", line = 31)
    public final int method663(int arg0) {
        if (arg0 != -1) {
            this.method36(-126, 127);
        }
        ++field3258;
        return this.field3257;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IILbt;)V", line = 42)
    public final void method31(int arg0, int arg1, class88 arg2) {
        ++field3248;
        if (arg1 != -1) {
            this.method663(1);
        }
        if (arg0 == 0) {
            this.field3257 = arg2.method568((byte) 110);
        }
    }

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "(III)V", line = 60)
    public final void method664(int arg0, int arg1, int arg2) {
        super.method664(arg0, arg1, arg2);
        ++field3249;
        if (~this.field3257 <= -1 && class97.field1360 != null) {
            int var4 = !class97.field1360.method460(-26282, this.field3257).field7331 ? 128 : 64;
            this.field3256 = class97.field1360.method458(1.0F, var4, var4, (byte) 0, false, this.field3257);
            this.field3255 = var4;
            this.field3247 = var4;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZII)Z", line = 77)
    public static final boolean method1612(boolean arg0, int arg1, int arg2) {
        ++field3254;
        if (!arg0) {
            field3252 = null;
        }
        return class420.method2481(arg2, 90, arg1) | ~(arg2 & 262144) != -1 || class386.method2304(arg1, arg2, -1);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)[[I", line = 98)
    public final int[][] method36(int arg0, int arg1) {
        ++field3246;
        int[][] var3 = super.field1333.method694(arg1, arg0);
        if (super.field1333.field1423) {
            int var4 = this.field3247 * (~class477.field6965 != ~this.field3255 ? this.field3255 * arg1 / class477.field6965 : arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class269.field3403 != this.field3247) {
                for (int var8 = 0; ~var8 > ~class269.field3403; ++var8) {
                    int var9 = this.field3247 * var8 / class269.field3403;
                    int var10 = this.field3256[var4 + var9];
                    var7[var8] = class60.method339(4080, var10 << 4);
                    var6[var8] = class60.method339(var10 >> 4, 4080);
                    var5[var8] = class60.method339(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; var11 < class269.field3403; ++var11) {
                    int var12 = this.field3256[var4++];
                    var7[var11] = class60.method339(4080, var12 << 4);
                    var6[var11] = class60.method339(65280, var12) >> 4;
                    var5[var11] = class60.method339(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "(B)V", line = 161)
    public static void method1613(byte arg0) {
        field3251 = null;
        field3252 = null;
        if (arg0 != -55) {
            method1613((byte) 37);
        }
    }
}
