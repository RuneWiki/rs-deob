import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LTINEQTV")
public class class28 {

    @OriginalMember(owner = "client!LTINEQTV", name = "b", descriptor = "I")
    private int field971 = -5335;

    @OriginalMember(owner = "client!LTINEQTV", name = "g", descriptor = "[LJRZPSMWR;")
    private class25[] field976 = new class25[10];

    @OriginalMember(owner = "client!LTINEQTV", name = "c", descriptor = "[LLTINEQTV;")
    private static class28[] field972 = new class28[5000];

    @OriginalMember(owner = "client!LTINEQTV", name = "d", descriptor = "[I")
    public static int[] field973 = new int[5000];

    @OriginalMember(owner = "client!LTINEQTV", name = "h", descriptor = "I")
    private int field977;

    @OriginalMember(owner = "client!LTINEQTV", name = "i", descriptor = "I")
    private int field978;

    @OriginalMember(owner = "client!LTINEQTV", name = "f", descriptor = "LEMWAMCXW;")
    private static class14 field975;

    @OriginalMember(owner = "client!LTINEQTV", name = "a", descriptor = "Z")
    private static boolean field970;

    @OriginalMember(owner = "client!LTINEQTV", name = "e", descriptor = "[B")
    private static byte[] field974;

    @OriginalMember(owner = "client!LTINEQTV", name = "<init>", descriptor = "(I)V")
    private class28(int arg0) {
        if (arg0 != -41493) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!LTINEQTV", name = "a", descriptor = "(ILEMWAMCXW;)V")
    public static final void method325(int arg0, class14 arg1) {
        field974 = new byte[441000];
        field975 = new class14(field974, true);
        if (arg0 != 0) {
            return;
        }
        class25.method300();
        while (true) {
            int var2 = arg1.method219();
            if (var2 == 65535) {
                return;
            }
            field972[var2] = new class28(-41493);
            field972[var2].method327(1016, arg1);
            field973[var2] = field972[var2].method328(-28344);
        }
    }

    @OriginalMember(owner = "client!LTINEQTV", name = "a", descriptor = "(IIB)LEMWAMCXW;")
    public static final class14 method326(int arg0, int arg1, byte arg2) {
        if (arg2 != -65) {
            field970 = !field970;
        }
        if (field972[arg0] == null) {
            return null;
        } else {
            class28 var3 = field972[arg0];
            return var3.method329(false, arg1);
        }
    }

    @OriginalMember(owner = "client!LTINEQTV", name = "b", descriptor = "(ILEMWAMCXW;)V")
    private final void method327(int arg0, class14 arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg1.method217();
            if (var4 != 0) {
                arg1.field707--;
                this.field976[var3] = new class25();
                this.field976[var3].method303(1016, arg1);
            }
        }
        this.field977 = arg1.method219();
        if (arg0 != 1016) {
            this.field971 = -464;
        }
        this.field978 = arg1.method219();
    }

    @OriginalMember(owner = "client!LTINEQTV", name = "a", descriptor = "(I)I")
    private final int method328(int arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field976[var3] != null && this.field976[var3].field913 / 20 < var2) {
                var2 = this.field976[var3].field913 / 20;
            }
        }
        if (arg0 != -28344) {
            return this.field971;
        }
        if (this.field977 < this.field978 && this.field977 / 20 < var2) {
            var2 = this.field977 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field976[var4] != null) {
                this.field976[var4].field913 -= var2 * 20;
            }
        }
        if (this.field977 < this.field978) {
            this.field977 -= var2 * 20;
            this.field978 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "client!LTINEQTV", name = "a", descriptor = "(ZI)LEMWAMCXW;")
    private final class14 method329(boolean arg0, int arg1) {
        int var3 = this.method330(arg1);
        if (arg0) {
            throw new NullPointerException();
        }
        field975.field707 = 0;
        field975.method211(1380533830);
        field975.method212(679, var3 + 36);
        field975.method211(1463899717);
        field975.method211(1718449184);
        field975.method212(679, 16);
        field975.method209(1, 1);
        field975.method209(1, 1);
        field975.method212(679, 22050);
        field975.method212(679, 22050);
        field975.method209(1, 1);
        field975.method209(8, 1);
        field975.method211(1684108385);
        field975.method212(679, var3);
        field975.field707 += var3;
        return field975;
    }

    @OriginalMember(owner = "client!LTINEQTV", name = "b", descriptor = "(I)I")
    private final int method330(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field976[var3] != null && this.field976[var3].field913 + this.field976[var3].field912 > var2) {
                var2 = this.field976[var3].field913 + this.field976[var3].field912;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field977 * 22050 / 1000;
        int var6 = this.field978 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field974[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field976[var9] != null) {
                int var15 = this.field976[var9].field912 * 22050 / 1000;
                int var16 = this.field976[var9].field913 * 22050 / 1000;
                int[] var17 = this.field976[var9].method301(var15, this.field976[var9].field912);
                for (int var18 = 0; var18 < var15; var18++) {
                    field974[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
                }
            }
        }
        if (arg0 > 1) {
            var5 += 44;
            var6 += 44;
            var4 += 44;
            var7 += 44;
            int var10 = var7 - var4;
            for (int var11 = var4 - 1; var11 >= var6; var11--) {
                field974[var10 + var11] = field974[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field974[var13 + var14] = field974[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
