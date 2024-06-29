import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VKAZQVPD")
public class class57 {

    @OriginalMember(owner = "client!VKAZQVPD", name = "a", descriptor = "I")
    private int field1592 = 787;

    @OriginalMember(owner = "client!VKAZQVPD", name = "g", descriptor = "[LOBDRPXUY;")
    private class39[] field1598 = new class39[10];

    @OriginalMember(owner = "client!VKAZQVPD", name = "b", descriptor = "I")
    private static int field1593 = 1;

    @OriginalMember(owner = "client!VKAZQVPD", name = "c", descriptor = "[LVKAZQVPD;")
    private static class57[] field1594 = new class57[5000];

    @OriginalMember(owner = "client!VKAZQVPD", name = "d", descriptor = "[I")
    public static int[] field1595 = new int[5000];

    @OriginalMember(owner = "client!VKAZQVPD", name = "h", descriptor = "I")
    private int field1599;

    @OriginalMember(owner = "client!VKAZQVPD", name = "i", descriptor = "I")
    private int field1600;

    @OriginalMember(owner = "client!VKAZQVPD", name = "f", descriptor = "LWBEWPIXO;")
    private static class58 field1597;

    @OriginalMember(owner = "client!VKAZQVPD", name = "e", descriptor = "[B")
    private static byte[] field1596;

    @OriginalMember(owner = "client!VKAZQVPD", name = "<init>", descriptor = "(B)V")
    private class57(byte arg0) {
        if (arg0 != 80) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!VKAZQVPD", name = "a", descriptor = "(LWBEWPIXO;I)V")
    public static final void method497(class58 arg0, int arg1) {
        if (arg1 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        field1596 = new byte[441000];
        field1597 = new class58((byte) -115, field1596);
        class39.method347();
        while (true) {
            int var3 = arg0.method517();
            if (var3 == 65535) {
                return;
            }
            field1594[var3] = new class57((byte) 80);
            field1594[var3].method499(arg0, 767);
            field1595[var3] = field1594[var3].method500(field1593);
        }
    }

    @OriginalMember(owner = "client!VKAZQVPD", name = "a", descriptor = "(III)LWBEWPIXO;")
    public static final class58 method498(int arg0, int arg1, int arg2) {
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field1594[arg2] == null) {
            return null;
        } else {
            class57 var4 = field1594[arg2];
            return var4.method501(arg1, true);
        }
    }

    @OriginalMember(owner = "client!VKAZQVPD", name = "b", descriptor = "(LWBEWPIXO;I)V")
    private final void method499(class58 arg0, int arg1) {
        int var3 = 30 / arg1;
        for (int var4 = 0; var4 < 10; var4++) {
            int var5 = arg0.method515();
            if (var5 != 0) {
                arg0.field1615--;
                this.field1598[var4] = new class39();
                this.field1598[var4].method350(arg0, 767);
            }
        }
        this.field1599 = arg0.method517();
        this.field1600 = arg0.method517();
    }

    @OriginalMember(owner = "client!VKAZQVPD", name = "a", descriptor = "(I)I")
    private final int method500(int arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1598[var3] != null && this.field1598[var3].field1265 / 20 < var2) {
                var2 = this.field1598[var3].field1265 / 20;
            }
        }
        if (field1593 != arg0) {
            return 3;
        }
        if (this.field1599 < this.field1600 && this.field1599 / 20 < var2) {
            var2 = this.field1599 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field1598[var4] != null) {
                this.field1598[var4].field1265 -= var2 * 20;
            }
        }
        if (this.field1599 < this.field1600) {
            this.field1599 -= var2 * 20;
            this.field1600 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "client!VKAZQVPD", name = "a", descriptor = "(IZ)LWBEWPIXO;")
    private final class58 method501(int arg0, boolean arg1) {
        int var3 = this.method502(arg0);
        field1597.field1615 = 0;
        field1597.method509(1380533830);
        field1597.method510(var3 + 36, -624);
        field1597.method509(1463899717);
        field1597.method509(1718449184);
        field1597.method510(16, -624);
        field1597.method507(1, -739);
        if (!arg1) {
            this.field1592 = 247;
        }
        field1597.method507(1, -739);
        field1597.method510(22050, -624);
        field1597.method510(22050, -624);
        field1597.method507(1, -739);
        field1597.method507(8, -739);
        field1597.method509(1684108385);
        field1597.method510(var3, -624);
        field1597.field1615 += var3;
        return field1597;
    }

    @OriginalMember(owner = "client!VKAZQVPD", name = "b", descriptor = "(I)I")
    private final int method502(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1598[var3] != null && this.field1598[var3].field1265 + this.field1598[var3].field1264 > var2) {
                var2 = this.field1598[var3].field1265 + this.field1598[var3].field1264;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field1599 * 22050 / 1000;
        int var6 = this.field1600 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field1596[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field1598[var9] != null) {
                int var15 = this.field1598[var9].field1264 * 22050 / 1000;
                int var16 = this.field1598[var9].field1265 * 22050 / 1000;
                int[] var17 = this.field1598[var9].method348(var15, this.field1598[var9].field1264);
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = (var17[var18] >> 8) + (field1596[var16 + var18 + 44] & 0xFF);
                    if ((var19 & 0xFFFFFF00) != 0) {
                        var19 = ~(var19 >> 31);
                    }
                    field1596[var16 + var18 + 44] = (byte) var19;
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
                field1596[var10 + var11] = field1596[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field1596[var13 + var14] = field1596[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
