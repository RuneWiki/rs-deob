import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class598 {

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "I")
    public int field8376 = class710.method3995((byte) 94);

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "Ljava/lang/String;")
    public String field8382;

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "Ljava/lang/String;")
    public String field8375;

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "I")
    public int field8379;

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "Ljava/lang/String;")
    public String field8373;

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "Ljava/lang/String;")
    public String field8377;

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "I")
    public int field8380;

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "I")
    public int field8374;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "Ljava/lang/String;")
    public String field8372;

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
    public int field8378;

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "I")
    public static int field8381;

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
    public static int field8383;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "([FIIIIF[FIBII)V", line = 4)
    public static final void method3474(float[] arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float[] arg6, int arg7, byte arg8, int arg9, int arg10) {
        int var11 = arg9 - arg7;
        if (arg8 >= -73) {
            return;
        }
        int var12 = arg4 - arg1;
        field8383++;
        int var13 = arg3 - arg2;
        float var14 = arg6[2] * (float) var13 + arg6[0] * (float) var11 + arg6[1] * (float) var12;
        float var15 = arg6[5] * (float) var13 + arg6[4] * (float) var12 + arg6[3] * (float) var11;
        float var16 = arg6[8] * (float) var13 + arg6[7] * (float) var12 + arg6[6] * (float) var11;
        float var17 = (float) Math.sqrt((double) (var16 * var16 + var14 * var14 + var15 * var15));
        float var18 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        float var19 = arg5 + (float) Math.asin((double) (var15 / var17)) / 3.1415927F + 0.5F;
        if (arg10 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg10 == 2) {
            var19 = -var19;
            var18 = -var18;
        } else if (arg10 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        arg0[0] = var18;
        arg0[1] = var19;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ILjava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 61)
    public final void method3475(int arg0, String arg1, int arg2, boolean arg3, String arg4, String arg5, String arg6, int arg7, String arg8) {
        this.field8376 = class710.method3995((byte) 94);
        field8381++;
        this.field8382 = arg4;
        this.field8374 = arg2;
        if (!arg3) {
            method3474(null, -44, 15, -67, 69, 0.36951408F, null, -103, (byte) -104, 13, 127);
        }
        this.field8380 = arg7;
        this.field8375 = arg8;
        this.field8377 = arg5;
        this.field8379 = arg0;
        this.field8373 = arg6;
        this.field8378 = class533.field7336;
        this.field8372 = arg1;
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 86)
    public class598(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field8382 = arg3;
        this.field8375 = arg7;
        this.field8379 = arg1;
        this.field8373 = arg5;
        this.field8377 = arg4;
        this.field8380 = arg0;
        this.field8374 = arg6;
        this.field8372 = arg2;
        this.field8378 = class533.field7336;
    }
}
