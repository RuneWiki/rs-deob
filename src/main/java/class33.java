import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MAPQLTQU")
public class class33 {

    @OriginalMember(owner = "MAPQLTQU", name = "e", descriptor = "I")
    private int field1059 = -441;

    @OriginalMember(owner = "MAPQLTQU", name = "j", descriptor = "[LUHNEGZAI;")
    private class58[] field1064 = new class58[10];

    @OriginalMember(owner = "MAPQLTQU", name = "a", descriptor = "Z")
    private static boolean field1055 = true;

    @OriginalMember(owner = "MAPQLTQU", name = "f", descriptor = "[LMAPQLTQU;")
    private static class33[] field1060 = new class33[5000];

    @OriginalMember(owner = "MAPQLTQU", name = "g", descriptor = "[I")
    public static int[] field1061 = new int[5000];

    @OriginalMember(owner = "MAPQLTQU", name = "b", descriptor = "I")
    private int field1056;

    @OriginalMember(owner = "MAPQLTQU", name = "k", descriptor = "I")
    private int field1065;

    @OriginalMember(owner = "MAPQLTQU", name = "l", descriptor = "I")
    private int field1066;

    @OriginalMember(owner = "MAPQLTQU", name = "i", descriptor = "LDNRIFKTO;")
    private static class11 field1063;

    @OriginalMember(owner = "MAPQLTQU", name = "c", descriptor = "Z")
    private static boolean field1057;

    @OriginalMember(owner = "MAPQLTQU", name = "d", descriptor = "Z")
    private static boolean field1058;

    @OriginalMember(owner = "MAPQLTQU", name = "h", descriptor = "[B")
    private static byte[] field1062;

    @OriginalMember(owner = "MAPQLTQU", name = "<init>", descriptor = "(Z)V")
    private class33(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "MAPQLTQU", name = "a", descriptor = "(LDNRIFKTO;I)V")
    public static final void method320(class11 arg0, int arg1) {
        field1062 = new byte[441000];
        field1063 = new class11(field1062, field1055);
        if (arg1 <= 0) {
            field1057 = !field1057;
        }
        class58.method458();
        while (true) {
            int var2 = arg0.method191();
            if (var2 == 65535) {
                return;
            }
            field1060[var2] = new class33(false);
            field1060[var2].method322(arg0, -25);
            field1061[var2] = field1060[var2].method323(9);
        }
    }

    @OriginalMember(owner = "MAPQLTQU", name = "a", descriptor = "(BII)LDNRIFKTO;")
    public static final class11 method321(byte arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            field1058 = !field1058;
        }
        if (field1060[arg1] == null) {
            return null;
        } else {
            class33 var3 = field1060[arg1];
            return var3.method324(arg2, -25912);
        }
    }

    @OriginalMember(owner = "MAPQLTQU", name = "b", descriptor = "(LDNRIFKTO;I)V")
    private final void method322(class11 arg0, int arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg0.method189();
            if (var4 != 0) {
                arg0.field643--;
                this.field1064[var3] = new class58();
                this.field1064[var3].method461(arg0, -25);
            }
        }
        this.field1065 = arg0.method191();
        this.field1066 = arg0.method191();
        if (arg1 >= 0) {
            field1055 = !field1055;
        }
    }

    @OriginalMember(owner = "MAPQLTQU", name = "a", descriptor = "(I)I")
    private final int method323(int arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1064[var3] != null && this.field1064[var3].field1483 / 20 < var2) {
                var2 = this.field1064[var3].field1483 / 20;
            }
        }
        if (this.field1065 < this.field1066 && this.field1065 / 20 < var2) {
            var2 = this.field1065 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field1064[var4] != null) {
                this.field1064[var4].field1483 -= var2 * 20;
            }
        }
        if (arg0 != 9) {
            return this.field1056;
        }
        if (this.field1065 < this.field1066) {
            this.field1065 -= var2 * 20;
            this.field1066 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "MAPQLTQU", name = "a", descriptor = "(II)LDNRIFKTO;")
    private final class11 method324(int arg0, int arg1) {
        int var3 = this.method325(arg0);
        field1063.field643 = 0;
        field1063.method183(1380533830);
        field1063.method184(7, var3 + 36);
        field1063.method183(1463899717);
        field1063.method183(1718449184);
        field1063.method184(7, 16);
        field1063.method181(220, 1);
        field1063.method181(220, 1);
        field1063.method184(7, 22050);
        field1063.method184(7, 22050);
        field1063.method181(220, 1);
        field1063.method181(220, 8);
        field1063.method183(1684108385);
        if (arg1 != -25912) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        field1063.method184(7, var3);
        field1063.field643 += var3;
        return field1063;
    }

    @OriginalMember(owner = "MAPQLTQU", name = "b", descriptor = "(I)I")
    private final int method325(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1064[var3] != null && this.field1064[var3].field1483 + this.field1064[var3].field1482 > var2) {
                var2 = this.field1064[var3].field1483 + this.field1064[var3].field1482;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field1065 * 22050 / 1000;
        int var6 = this.field1066 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field1062[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field1064[var9] != null) {
                int var15 = this.field1064[var9].field1482 * 22050 / 1000;
                int var16 = this.field1064[var9].field1483 * 22050 / 1000;
                int[] var17 = this.field1064[var9].method459(var15, this.field1064[var9].field1482);
                for (int var18 = 0; var18 < var15; var18++) {
                    field1062[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field1062[var10 + var11] = field1062[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field1062[var13 + var14] = field1062[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
