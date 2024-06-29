import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class560 {

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "J")
    private long field7309;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    private int field7310;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Z")
    public static boolean field7312 = false;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "Z")
    public static boolean field7315 = false;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field7311;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field7313;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field7314;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field7316;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field7317;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field7318;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)Z")
    public static final boolean method2995(int arg0, int arg1, int arg2) {
        if (arg2 == 1536) {
            field7316++;
            return (arg1 & 0x22) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)I")
    public final int method2996(int arg0) {
        field7311++;
        if (arg0 != 1) {
            this.field7309 = -89L;
        }
        return this.field7310;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLiv;)V")
    private final void method2997(byte arg0, class568 arg1) {
        if (arg0 == -73) {
            this.field7309 |= (arg1.field7416 << this.field7310++ * class568.field7423);
            field7317++;
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Liv;)V")
    public class560(class568 arg0) {
        this.field7309 = arg0.field7416;
        this.field7310 = 1;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "([Liv;)V")
    public class560(class568[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method2997((byte) -73, arg0[var2]);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IB)Liv;")
    public final class568 method2998(int arg0, byte arg1) {
        if (arg1 > -8) {
            this.method2998(-46, (byte) -100);
        }
        field7318++;
        return class568.method3037(3)[this.method3000(arg0, 24)];
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
    public static final void method2999(int arg0) {
        if (class710.field9918 < 1024.0F) {
            class710.field9918 = 1024.0F;
        }
        field7313++;
        if (arg0 != 16384) {
            method2999(116);
        }
        if (class710.field9918 > 3072.0F) {
            class710.field9918 = 3072.0F;
        }
        while (class141.field1859 >= 16384.0F) {
            class141.field1859 -= 16384.0F;
        }
        while (class141.field1859 < 0.0F) {
            class141.field1859 += 16384.0F;
        }
        int var1 = class473.field6168 >> 9;
        int var2 = class219.field2880 >> 9;
        int var3 = class332.method1916(arg0 ^ 0x48A04007, class219.field2880, class390.field4991, class473.field6168);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && (class611.field8258 - 4) > var1 && (class656.field9155 - 4) > var2) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class390.field4991;
                    if (var7 < 3 && class589.method3215(var5, (byte) -52, var6)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class568.field7424.field4228 != null && class568.field7424.field4228[var7] != null) {
                        var8 = (class568.field7424.field4228[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var8 + var3 - class392.field4997[var7].method668(var5, var6);
                    if (var4 < var9) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = (var4 >> 2) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class194.field2539) {
            class194.field2539 += (var10 - class194.field2539) / 24;
        } else if (var10 < class194.field2539) {
            class194.field2539 += (var10 - class194.field2539) / 80;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)I")
    private final int method3000(int arg0, int arg1) {
        if (arg1 == 24) {
            field7314++;
            return (int) (this.field7309 >> class568.field7423 * arg0) & 0xF;
        } else {
            return -53;
        }
    }
}
