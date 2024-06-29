import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JRSHCCMF")
public class class23 {

    @OriginalMember(owner = "client!JRSHCCMF", name = "a", descriptor = "Z")
    private boolean field887 = true;

    @OriginalMember(owner = "client!JRSHCCMF", name = "b", descriptor = "I")
    private int field888 = -214;

    @OriginalMember(owner = "client!JRSHCCMF", name = "g", descriptor = "[LHJHNNPSW;")
    private class14[] field893 = new class14[10];

    @OriginalMember(owner = "client!JRSHCCMF", name = "c", descriptor = "[LJRSHCCMF;")
    private static class23[] field889 = new class23[5000];

    @OriginalMember(owner = "client!JRSHCCMF", name = "d", descriptor = "[I")
    public static int[] field890 = new int[5000];

    @OriginalMember(owner = "client!JRSHCCMF", name = "h", descriptor = "I")
    private int field894;

    @OriginalMember(owner = "client!JRSHCCMF", name = "i", descriptor = "I")
    private int field895;

    @OriginalMember(owner = "client!JRSHCCMF", name = "f", descriptor = "LSVWJKJVI;")
    private static class52 field892;

    @OriginalMember(owner = "client!JRSHCCMF", name = "e", descriptor = "[B")
    private static byte[] field891;

    @OriginalMember(owner = "client!JRSHCCMF", name = "<init>", descriptor = "(B)V")
    private class23(byte arg0) {
        if (arg0 != -61) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!JRSHCCMF", name = "a", descriptor = "(LSVWJKJVI;I)V")
    public static final void method308(class52 arg0, int arg1) {
        field891 = new byte[441000];
        if (arg1 != 24414) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        field892 = new class52(field891, true);
        class14.method240();
        while (true) {
            int var3 = arg0.method463();
            if (var3 == 65535) {
                return;
            }
            field889[var3] = new class23((byte) -61);
            field889[var3].method310(-13096, arg0);
            field890[var3] = field889[var3].method311((byte) 2);
        }
    }

    @OriginalMember(owner = "client!JRSHCCMF", name = "a", descriptor = "(III)LSVWJKJVI;")
    public static final class52 method309(int arg0, int arg1, int arg2) {
        if (arg0 != -26286) {
            throw new NullPointerException();
        } else if (field889[arg1] == null) {
            return null;
        } else {
            class23 var3 = field889[arg1];
            return var3.method312(true, arg2);
        }
    }

    @OriginalMember(owner = "client!JRSHCCMF", name = "a", descriptor = "(ILSVWJKJVI;)V")
    private final void method310(int arg0, class52 arg1) {
        if (arg0 != -13096) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg1.method461();
            if (var4 != 0) {
                arg1.field1434--;
                this.field893[var3] = new class14();
                this.field893[var3].method243(-13096, arg1);
            }
        }
        this.field894 = arg1.method463();
        this.field895 = arg1.method463();
    }

    @OriginalMember(owner = "client!JRSHCCMF", name = "a", descriptor = "(B)I")
    private final int method311(byte arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field893[var3] != null && this.field893[var3].field722 / 20 < var2) {
                var2 = this.field893[var3].field722 / 20;
            }
        }
        if (arg0 != 2) {
            return this.field888;
        }
        if (this.field894 < this.field895 && this.field894 / 20 < var2) {
            var2 = this.field894 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field893[var4] != null) {
                this.field893[var4].field722 -= var2 * 20;
            }
        }
        if (this.field894 < this.field895) {
            this.field894 -= var2 * 20;
            this.field895 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "client!JRSHCCMF", name = "a", descriptor = "(ZI)LSVWJKJVI;")
    private final class52 method312(boolean arg0, int arg1) {
        int var3 = this.method313(arg1);
        field892.field1434 = 0;
        field892.method455(1380533830);
        field892.method456(3, var3 + 36);
        field892.method455(1463899717);
        field892.method455(1718449184);
        field892.method456(3, 16);
        field892.method453(1, (byte) -42);
        field892.method453(1, (byte) -42);
        if (!arg0) {
            this.field887 = !this.field887;
        }
        field892.method456(3, 22050);
        field892.method456(3, 22050);
        field892.method453(1, (byte) -42);
        field892.method453(8, (byte) -42);
        field892.method455(1684108385);
        field892.method456(3, var3);
        field892.field1434 += var3;
        return field892;
    }

    @OriginalMember(owner = "client!JRSHCCMF", name = "a", descriptor = "(I)I")
    private final int method313(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field893[var3] != null && this.field893[var3].field722 + this.field893[var3].field721 > var2) {
                var2 = this.field893[var3].field722 + this.field893[var3].field721;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field894 * 22050 / 1000;
        int var6 = this.field895 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field891[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field893[var9] != null) {
                int var15 = this.field893[var9].field721 * 22050 / 1000;
                int var16 = this.field893[var9].field722 * 22050 / 1000;
                int[] var17 = this.field893[var9].method241(var15, this.field893[var9].field721);
                for (int var18 = 0; var18 < var15; var18++) {
                    field891[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field891[var10 + var11] = field891[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field891[var13 + var14] = field891[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
