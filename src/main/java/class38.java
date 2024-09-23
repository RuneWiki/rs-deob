import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NGSVJLXG")
public class class38 {

    @OriginalMember(owner = "NGSVJLXG", name = "c", descriptor = "B")
    private byte field1052 = 9;

    @OriginalMember(owner = "NGSVJLXG", name = "h", descriptor = "[LDZFLZLPS;")
    private class15[] field1057 = new class15[10];

    @OriginalMember(owner = "NGSVJLXG", name = "a", descriptor = "Z")
    private static boolean field1050 = true;

    @OriginalMember(owner = "NGSVJLXG", name = "b", descriptor = "I")
    private static int field1051 = 6;

    @OriginalMember(owner = "NGSVJLXG", name = "d", descriptor = "[LNGSVJLXG;")
    private static class38[] field1053 = new class38[5000];

    @OriginalMember(owner = "NGSVJLXG", name = "e", descriptor = "[I")
    public static int[] field1054 = new int[5000];

    @OriginalMember(owner = "NGSVJLXG", name = "i", descriptor = "I")
    private int field1058;

    @OriginalMember(owner = "NGSVJLXG", name = "j", descriptor = "I")
    private int field1059;

    @OriginalMember(owner = "NGSVJLXG", name = "g", descriptor = "LPKHWFJLM;")
    private static class43 field1056;

    @OriginalMember(owner = "NGSVJLXG", name = "f", descriptor = "[B")
    private static byte[] field1055;

    @OriginalMember(owner = "NGSVJLXG", name = "<init>", descriptor = "(B)V")
    private class38(byte arg0) {
        if (arg0 != 9) {
            throw new NullPointerException();
        }
        boolean var2 = false;
    }

    @OriginalMember(owner = "NGSVJLXG", name = "a", descriptor = "(ILPKHWFJLM;)V")
    public static final void method306(int arg0, class43 arg1) {
        if (arg0 < 3 || arg0 > 3) {
            return;
        }
        field1055 = new byte[441000];
        field1056 = new class43(field1055, 0);
        class15.method217();
        while (true) {
            int var2 = arg1.method332();
            if (var2 == 65535) {
                return;
            }
            field1053[var2] = new class38((byte) 9);
            field1053[var2].method308(arg1, field1050);
            field1054[var2] = field1053[var2].method309(-622);
        }
    }

    @OriginalMember(owner = "NGSVJLXG", name = "a", descriptor = "(IZI)LPKHWFJLM;")
    public static final class43 method307(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field1051 = 294;
        }
        if (field1053[arg2] == null) {
            return null;
        } else {
            class38 var3 = field1053[arg2];
            return var3.method310(0, arg0);
        }
    }

    @OriginalMember(owner = "NGSVJLXG", name = "a", descriptor = "(LPKHWFJLM;Z)V")
    private final void method308(class43 arg0, boolean arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg0.method330();
            if (var4 != 0) {
                arg0.field1105--;
                this.field1057[var3] = new class15();
                this.field1057[var3].method220(arg0, field1050);
            }
        }
        if (!arg1) {
            throw new NullPointerException();
        }
        this.field1058 = arg0.method332();
        this.field1059 = arg0.method332();
    }

    @OriginalMember(owner = "NGSVJLXG", name = "a", descriptor = "(I)I")
    private final int method309(int arg0) {
        int var2 = 9999999;
        if (arg0 >= 0) {
            return field1051;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1057[var3] != null && this.field1057[var3].field691 / 20 < var2) {
                var2 = this.field1057[var3].field691 / 20;
            }
        }
        if (this.field1058 < this.field1059 && this.field1058 / 20 < var2) {
            var2 = this.field1058 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field1057[var4] != null) {
                this.field1057[var4].field691 -= var2 * 20;
            }
        }
        if (this.field1058 < this.field1059) {
            this.field1058 -= var2 * 20;
            this.field1059 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "NGSVJLXG", name = "a", descriptor = "(II)LPKHWFJLM;")
    private final class43 method310(int arg0, int arg1) {
        int var3 = this.method311(arg1);
        field1056.field1105 = 0;
        field1056.method324(1380533830);
        field1056.method325(var3 + 36, 0);
        field1056.method324(1463899717);
        field1056.method324(1718449184);
        field1056.method325(16, 0);
        field1056.method322(1, (byte) 35);
        field1056.method322(1, (byte) 35);
        field1056.method325(22050, 0);
        field1056.method325(22050, 0);
        field1056.method322(1, (byte) 35);
        field1056.method322(8, (byte) 35);
        field1056.method324(1684108385);
        field1056.method325(var3, 0);
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        field1056.field1105 += var3;
        return field1056;
    }

    @OriginalMember(owner = "NGSVJLXG", name = "b", descriptor = "(I)I")
    private final int method311(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1057[var3] != null && this.field1057[var3].field691 + this.field1057[var3].field690 > var2) {
                var2 = this.field1057[var3].field691 + this.field1057[var3].field690;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field1058 * 22050 / 1000;
        int var6 = this.field1059 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field1055[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field1057[var9] != null) {
                int var15 = this.field1057[var9].field690 * 22050 / 1000;
                int var16 = this.field1057[var9].field691 * 22050 / 1000;
                int[] var17 = this.field1057[var9].method218(var15, this.field1057[var9].field690);
                for (int var18 = 0; var18 < var15; var18++) {
                    field1055[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field1055[var10 + var11] = field1055[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field1055[var13 + var14] = field1055[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
