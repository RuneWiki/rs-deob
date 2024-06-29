import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class522 {

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public int field7382;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "S")
    public short field7378;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public int field7379;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public int field7380;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "Z")
    public boolean field7376;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "S")
    public short field7375;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public int field7377;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "B")
    public byte field7383;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "S")
    public short field7386;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public int field7385;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "[I")
    public static int[] field7381 = new int[2048];

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "[B")
    public static byte[] field7387;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public static int field7384;

    static {
        int var0 = 0;
        field7387 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field7387[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + (var1 * var1 + 65535)) / 65535.0F))));
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)I", line = 3)
    public static final int method3147(int arg0) {
        field7384++;
        if (arg0 != -18018) {
            field7387 = null;
        }
        return class614.field8622;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V", line = 17)
    public static void method3148(byte arg0) {
        field7387 = null;
        field7381 = null;
        if (arg0 < 83) {
            field7381 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 45)
    public class522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field7382 = arg1;
        this.field7378 = (short) arg4;
        this.field7379 = arg3;
        this.field7380 = arg11;
        this.field7376 = arg10;
        this.field7375 = (short) arg6;
        this.field7377 = arg0;
        this.field7383 = (byte) arg8;
        this.field7386 = (short) arg5;
        this.field7385 = arg2;
    }
}
