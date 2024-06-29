import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OOQAHIET")
public class class43 {

    @OriginalMember(owner = "client!OOQAHIET", name = "b", descriptor = "I")
    private int field1085 = 6;

    @OriginalMember(owner = "client!OOQAHIET", name = "h", descriptor = "[LILFXQDER;")
    private class23[] field1091 = new class23[10];

    @OriginalMember(owner = "client!OOQAHIET", name = "d", descriptor = "[LOOQAHIET;")
    private static class43[] field1087 = new class43[5000];

    @OriginalMember(owner = "client!OOQAHIET", name = "e", descriptor = "[I")
    public static int[] field1088 = new int[5000];

    @OriginalMember(owner = "client!OOQAHIET", name = "a", descriptor = "I")
    private int field1084;

    @OriginalMember(owner = "client!OOQAHIET", name = "i", descriptor = "I")
    private int field1092;

    @OriginalMember(owner = "client!OOQAHIET", name = "j", descriptor = "I")
    private int field1093;

    @OriginalMember(owner = "client!OOQAHIET", name = "g", descriptor = "LRSWRPCHR;")
    private static class50 field1090;

    @OriginalMember(owner = "client!OOQAHIET", name = "c", descriptor = "Z")
    private static boolean field1086;

    @OriginalMember(owner = "client!OOQAHIET", name = "f", descriptor = "[B")
    private static byte[] field1089;

    @OriginalMember(owner = "client!OOQAHIET", name = "<init>", descriptor = "(Z)V")
    private class43(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!OOQAHIET", name = "a", descriptor = "(ZLRSWRPCHR;)V")
    public static final void method328(boolean arg0, class50 arg1) {
        field1089 = new byte[441000];
        if (!arg0) {
            field1086 = !field1086;
        }
        field1090 = new class50(field1089, -46859);
        class23.method224();
        while (true) {
            int var2 = arg1.method390();
            if (var2 == 65535) {
                return;
            }
            field1087[var2] = new class43(true);
            field1087[var2].method330(arg1, (byte) 46);
            field1088[var2] = field1087[var2].method331((byte) 8);
        }
    }

    @OriginalMember(owner = "client!OOQAHIET", name = "a", descriptor = "(III)LRSWRPCHR;")
    public static final class50 method329(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field1086 = !field1086;
        }
        if (field1087[arg2] == null) {
            return null;
        } else {
            class43 var3 = field1087[arg2];
            return var3.method332(arg1, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!OOQAHIET", name = "a", descriptor = "(LRSWRPCHR;B)V")
    private final void method330(class50 arg0, byte arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg0.method388();
            if (var4 != 0) {
                arg0.field1225--;
                this.field1091[var3] = new class23();
                this.field1091[var3].method227(arg0, (byte) 46);
            }
        }
        if (arg1 != 46) {
            this.field1085 = 154;
        }
        this.field1092 = arg0.method390();
        this.field1093 = arg0.method390();
    }

    @OriginalMember(owner = "client!OOQAHIET", name = "a", descriptor = "(B)I")
    private final int method331(byte arg0) {
        int var2 = 9999999;
        if (arg0 != 8) {
            return 2;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1091[var3] != null && this.field1091[var3].field865 / 20 < var2) {
                var2 = this.field1091[var3].field865 / 20;
            }
        }
        if (this.field1092 < this.field1093 && this.field1092 / 20 < var2) {
            var2 = this.field1092 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field1091[var4] != null) {
                this.field1091[var4].field865 -= var2 * 20;
            }
        }
        if (this.field1092 < this.field1093) {
            this.field1092 -= var2 * 20;
            this.field1093 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "client!OOQAHIET", name = "a", descriptor = "(IB)LRSWRPCHR;")
    private final class50 method332(int arg0, byte arg1) {
        int var3 = this.method333(arg0);
        field1090.field1225 = 0;
        field1090.method382(1380533830);
        field1090.method383(this.field1084, var3 + 36);
        field1090.method382(1463899717);
        field1090.method382(1718449184);
        field1090.method383(this.field1084, 16);
        field1090.method380(-818, 1);
        field1090.method380(-818, 1);
        field1090.method383(this.field1084, 22050);
        if (arg1 != -124) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        field1090.method383(this.field1084, 22050);
        field1090.method380(-818, 1);
        field1090.method380(-818, 8);
        field1090.method382(1684108385);
        field1090.method383(this.field1084, var3);
        field1090.field1225 += var3;
        return field1090;
    }

    @OriginalMember(owner = "client!OOQAHIET", name = "a", descriptor = "(I)I")
    private final int method333(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1091[var3] != null && this.field1091[var3].field865 + this.field1091[var3].field864 > var2) {
                var2 = this.field1091[var3].field865 + this.field1091[var3].field864;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field1092 * 22050 / 1000;
        int var6 = this.field1093 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field1089[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field1091[var9] != null) {
                int var15 = this.field1091[var9].field864 * 22050 / 1000;
                int var16 = this.field1091[var9].field865 * 22050 / 1000;
                int[] var17 = this.field1091[var9].method225(var15, this.field1091[var9].field864);
                for (int var18 = 0; var18 < var15; var18++) {
                    field1089[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field1089[var10 + var11] = field1089[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field1089[var13 + var14] = field1089[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
