import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class330 extends class122 {

    @OriginalMember(owner = "client!qq", name = "D", descriptor = "Liv;")
    public static class64 field4975 = new class64(57, 10);

    @OriginalMember(owner = "client!qq", name = "N", descriptor = "[C")
    public static char[] field4983 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!qq", name = "O", descriptor = "[I")
    public static int[] field4984 = new int[13];

    @OriginalMember(owner = "client!qq", name = "L", descriptor = "[S")
    public static short[] field4981 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!qq", name = "M", descriptor = "Lpi;")
    public static class342 field4982 = new class342("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!qq", name = "G", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!qq", name = "H", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!qq", name = "J", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!qq", name = "K", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!qq", name = "I", descriptor = "[B")
    private byte[] field4978;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIBI)[B")
    public final byte[] method2119(int arg0, int arg1, byte arg2, int arg3) {
        this.field4978 = new byte[arg0 * 2 * arg1 * arg3];
        field4980++;
        this.method3004(arg0, arg1, 4, arg3);
        if (arg2 >= -78) {
            this.method941((byte) -82, 70, -43);
        }
        return this.field4978;
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "()V")
    public class330() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)V")
    public static void method2120(byte arg0) {
        field4982 = null;
        field4983 = null;
        int var1 = 124 / ((-arg0 - 52) / 55);
        field4981 = null;
        field4984 = null;
        field4975 = null;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)Lqj;")
    public static final class351 method2121(int arg0, int arg1) {
        field4979++;
        if (arg0 != -14146) {
            method2121(62, 52);
        }
        if (arg1 == 0) {
            if ((double) class509.field7493 == 3.0D) {
                return class102.field1684;
            }
            if ((double) class509.field7493 == 4.0D) {
                return class100.field1654;
            }
            if ((double) class509.field7493 == 6.0D) {
                return class138.field2221;
            }
            if ((double) class509.field7493 >= 8.0D) {
                return class4.field111;
            }
        } else if (arg1 == 1) {
            if ((double) class509.field7493 == 3.0D) {
                return class138.field2221;
            }
            if ((double) class509.field7493 == 4.0D) {
                return class4.field111;
            }
            if ((double) class509.field7493 == 6.0D) {
                return class102.field1692;
            }
            if ((double) class509.field7493 >= 8.0D) {
                return class177.field2703;
            }
        } else if (arg1 == 2) {
            if ((double) class509.field7493 == 3.0D) {
                return class102.field1692;
            }
            if ((double) class509.field7493 == 4.0D) {
                return class177.field2703;
            }
            if ((double) class509.field7493 == 6.0D) {
                return class257.field3731;
            }
            if ((double) class509.field7493 >= 8.0D) {
                return class358.field5447;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BII)V")
    public final void method941(byte arg0, int arg1, int arg2) {
        if (arg2 != -29644) {
            field4982 = null;
        }
        field4977++;
        int var4 = arg1 * 2;
        byte var5 = (byte) ((arg0 >> 1 & 0x7F) + 127);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field4978[var10001] = var5;
        this.field4978[var6] = var5;
    }
}
