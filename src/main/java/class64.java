import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class64 {

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "J")
    public long field1158 = 0L;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "Lob;")
    public static class154 field1163 = new class154(32);

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "Li;")
    public static class88 field1170 = class208.method1425(105, "auf einer freien Welt zu spielen)3");

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
    public static int field1173 = 128;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "[Lki;")
    public static class118[] field1171 = new class118[4];

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public int field1157;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public int field1161;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public int field1164;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    public int field1167;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    public int field1168;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    public int field1169;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
    public int field1172;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "Lnc;")
    public class145 field1159;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Lnc;")
    public class145 field1160;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIZIII[Lia;I[BII)V")
    public static final void method449(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class89[] arg6, int arg7, byte[] arg8, int arg9, int arg10) {
        field1166++;
        byte var11;
        if (arg2) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        if (!arg2) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if (arg0 + var12 > 0 && arg0 + var12 < 103 && arg9 + var13 > 0 && arg9 + var13 < 103) {
                        arg6[arg10].field1668[arg0 + var12][arg9 + var13] = class70.method470(arg6[arg10].field1668[arg0 + var12][arg9 + var13], -16777217);
                    }
                }
            }
        }
        class46 var14 = new class46(arg8);
        if (arg1 != 4) {
            method451(111);
        }
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg7 == var15 && var16 >= arg4 && var16 < arg4 + 8 && var17 >= arg5 && var17 < arg5 + 8) {
                        class137.method916(class245.method1608(-1, arg3, var16 & 0x7, var17 & 0x7) + arg0, var14, 0, arg2, 0, 0, arg9 + class159.method1071(arg1 + 114, var17 & 0x7, var16 & 0x7, arg3), arg3, arg10);
                    } else {
                        class137.method916(-1, var14, arg1 - 4, arg2, 0, 0, -1, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public static void method450(int arg0) {
        field1163 = null;
        field1170 = null;
        field1171 = null;
        int var1 = -101 / ((-arg0 - 15) / 49);
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
    public static final void method451(int arg0) {
        if (arg0 == 64) {
            class245.field4499 = false;
            field1165++;
            class104.field1884 = false;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
    public static final void method452(byte arg0) {
        class245.field4499 = true;
        if (arg0 <= 112) {
            field1173 = -25;
        }
        class104.field1884 = true;
        field1162++;
    }
}
