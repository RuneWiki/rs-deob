import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class238 {

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "S")
    public short field3351;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "S")
    public short field3349;

    @OriginalMember(owner = "client!ida", name = "e", descriptor = "S")
    public short field3353;

    @OriginalMember(owner = "client!ida", name = "k", descriptor = "B")
    public byte field3359;

    @OriginalMember(owner = "client!ida", name = "g", descriptor = "Z")
    public boolean field3355;

    @OriginalMember(owner = "client!ida", name = "o", descriptor = "I")
    public int field3363;

    @OriginalMember(owner = "client!ida", name = "f", descriptor = "I")
    public int field3354;

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "I")
    public int field3350;

    @OriginalMember(owner = "client!ida", name = "n", descriptor = "I")
    public int field3362;

    @OriginalMember(owner = "client!ida", name = "l", descriptor = "I")
    public int field3360;

    @OriginalMember(owner = "client!ida", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field3361 = new String[200];

    @OriginalMember(owner = "client!ida", name = "p", descriptor = "[Lur;")
    public static class538[] field3364 = new class538[4];

    @OriginalMember(owner = "client!ida", name = "q", descriptor = "F")
    public static float field3365;

    @OriginalMember(owner = "client!ida", name = "h", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!ida", name = "i", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!ida", name = "j", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!ida", name = "d", descriptor = "Ljw;")
    public static class555 field3352;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(ZIIIILwu;)V")
    public static final void method1498(boolean arg0, int arg1, int arg2, int arg3, int arg4, class376 arg5) {
        class95.method710(108, arg2, arg3, arg5, arg4, arg0, 0L);
        field3358++;
        if (arg1 <= 58) {
            field3361 = null;
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(B)V")
    public static void method1499(byte arg0) {
        field3364 = null;
        if (arg0 != -63) {
            field3352 = null;
        }
        field3352 = null;
        field3361 = null;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IBIILaa;ILvfa;JI)V")
    public static final void method1500(int arg0, byte arg1, int arg2, int arg3, class490 arg4, int arg5, class672 arg6, long arg7, int arg8) {
        field3356++;
        if (arg1 >= -64) {
            method1499((byte) -99);
        }
        int var10 = arg2 * arg2 + arg3 * arg3;
        if (arg7 < (long) var10) {
            return;
        }
        int var11 = Math.min(arg6.field9287 / 2, arg6.field9178 / 2);
        if (var10 <= (var11 * var11)) {
            class394.method2326(arg4, arg0, class743.field10323[arg8], arg2, arg3, -27, arg5, arg6);
            return;
        }
        var11 -= 10;
        int var12;
        if (class278.field3898 == 4) {
            var12 = (int) class547.field7230 & 0x3FFF;
        } else {
            var12 = (int) class547.field7230 + class649.field8626 & 0x3FFF;
        }
        int var13 = class451.field6174[var12];
        int var14 = class451.field6177[var12];
        if (class278.field3898 != 4) {
            var13 = var13 * 256 / (class260.field3629 + 256);
            var14 = var14 * 256 / (class260.field3629 + 256);
        }
        int var15 = arg2 * var13 + arg3 * var14 >> 14;
        int var16 = arg2 * var14 - (arg3 * var13) >> 14;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var11 * Math.sin(var17));
        int var20 = (int) (Math.cos(var17) * (double) var11);
        class240.field3383[arg8].method1029((float) arg6.field9287 / 2.0F + (float) arg0 + (float) var19, (float) arg6.field9178 / 2.0F + (float) arg5 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class238(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field3351 = (short) arg6;
        this.field3349 = (short) arg5;
        this.field3353 = (short) arg4;
        this.field3359 = (byte) arg8;
        this.field3355 = arg10;
        this.field3363 = arg3;
        this.field3354 = arg11;
        this.field3350 = arg1;
        this.field3362 = arg0;
        this.field3360 = arg2;
    }
}
