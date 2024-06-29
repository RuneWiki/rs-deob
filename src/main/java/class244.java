import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class244 {

    @OriginalMember(owner = "client!du", name = "f", descriptor = "S")
    public short field3650;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "Z")
    public boolean field3646;

    @OriginalMember(owner = "client!du", name = "m", descriptor = "B")
    public byte field3657;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "I")
    public int field3652;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "S")
    public short field3654;

    @OriginalMember(owner = "client!du", name = "k", descriptor = "B")
    public byte field3655;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "S")
    public short field3645;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "[I")
    public static int[] field3647 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!du", name = "e", descriptor = "I")
    public static int field3649 = 1403;

    @OriginalMember(owner = "client!du", name = "l", descriptor = "F")
    public static float field3656 = 1.0F;

    @OriginalMember(owner = "client!du", name = "d", descriptor = "I")
    public static int field3648 = 0;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "[I")
    public static int[] field3651 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!du", name = "o", descriptor = "[B")
    public static byte[] field3659;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "I")
    public static int field3658;

    static {
        new class44(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
        field3659 = new byte[32896];
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3659[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + (var1 * var1 + 65535)) / 65535.0F))));
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ZIIII)Ldu;", line = 4)
    public final class244 method1602(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0) {
            method1604(6, -110, -115, null);
        }
        field3653++;
        return new class244(arg3, arg4, arg2, arg1, this.field3650, this.field3654, this.field3645, this.field3655, this.field3657, this.field3646);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)Ltv;", line = 25)
    public static final class400 method1603(int arg0) {
        field3658++;
        try {
            if (arg0 != 31649) {
                method1603(12);
            }
            return (class400) Class.forName("sj").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 57)
    public static final void method1604(int arg0, int arg1, int arg2, Class arg3) {
        class188 var4 = class461.field6675[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class317 var5 = var4.field2773; var5 != null; var5 = var5.field4709) {
            class478 var6 = var5.field4711;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6971 == arg1 && var6.field6962 == arg2) {
                class188.method1288(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(IIIIIIIIIZ)V", line = 84)
    public class244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field3650 = (short) arg4;
        this.field3646 = arg9;
        this.field3657 = (byte) arg8;
        this.field3652 = arg0;
        this.field3654 = (short) arg5;
        this.field3655 = (byte) arg7;
        this.field3645 = (short) arg6;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(B)V", line = 110)
    public static void method1605(byte arg0) {
        field3647 = null;
        int var1 = -92 % ((11 - arg0) / 53);
        field3651 = null;
        field3659 = null;
    }
}
