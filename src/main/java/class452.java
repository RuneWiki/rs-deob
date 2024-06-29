import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class452 implements class233 {

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "Leha;")
    public class91 field5981;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public int field5987;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public int field5980;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "Loea;")
    public class599 field5979;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public int field5978;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public int field5983;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public int field5976;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public int field5985;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    public int field5988;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field5977;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IILha;III)V", line = 3)
    public static final void method2539(int arg0, int arg1, class60 arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 2132) {
            field5986 = 57;
        }
        field5984++;
        arg2.method534(arg3, arg5, arg3 + arg4, arg0 + arg5);
        arg2.method544(-16777216, arg0, arg3, 18553, arg4, arg5);
        if (class553.field7719 < 100) {
            return;
        }
        float var6 = (float) class73.field1034 / (float) class73.field1051;
        int var7 = arg4;
        int var8 = arg0;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg4 * var6);
        } else {
            var7 = (int) ((float) arg0 / var6);
        }
        int var9 = (arg0 - var8) / 2 + arg5;
        int var10 = (arg4 - var7) / 2 + arg3;
        if (class584.field8165 == null || arg4 != class584.field8165.method143() || arg0 != class584.field8165.method144()) {
            class73.method652(class73.field1041, class73.field1042 + class73.field1034, class73.field1051 + class73.field1041, class73.field1042, var10, var9, var7 + var10, var9 - -var8);
            class73.method647(arg2);
            class584.field8165 = arg2.method527(var10, var9, var7, var8, false);
        }
        class584.field8165.method2759(var10, var9);
        int var11 = class475.field6390 * var7 / class73.field1051;
        int var12 = class172.field2372 * var8 / class73.field1034;
        int var13 = var10 + (class179.field2501 * var7 / class73.field1051);
        int var14 = var8 + var9 - var12 - (class170.field2361 * var8 / class73.field1034);
        int var15 = -1996554240;
        if (class722.field10048 == class293.field3867) {
            var15 = -1996488705;
        }
        arg2.method528(var13, var14, var11, var12, var15, 1);
        arg2.method460(var13, var14, var11, var12, var15, 0);
        if (class35.field563 <= 0) {
            return;
        }
        int var16;
        if (class601.field8362 <= 50) {
            var16 = class601.field8362 * 5;
        } else {
            var16 = 500 - class601.field8362 * 5;
        }
        for (class344 var17 = (class344) class73.field1026.method3672(-1); var17 != null; var17 = (class344) class73.field1026.method3662(arg1 - 2133)) {
            class278 var18 = class73.field1015.method3085((byte) -122, var17.field4349);
            if (class288.method1724(arg1 ^ 0xFFFF9DFD, var18)) {
                if (class136.field1950 == var17.field4349) {
                    int var19 = var10 + (var17.field4353 * var7 / class73.field1051);
                    int var20 = (class73.field1034 - var17.field4347) * var8 / class73.field1034 + var9;
                    arg2.method544(var16 << 24 | 0xFFFF00, 4, var19 - 2, arg1 ^ 0x402D, 4, var20 - 2);
                } else if (class389.field4973 != -1 && class389.field4973 == var18.field3503) {
                    int var21 = var17.field4353 * var7 / class73.field1051 + var10;
                    int var22 = (class73.field1034 - var17.field4347) * var8 / class73.field1034 + var9;
                    arg2.method544(var16 << 24 | 0xFFFF00, 4, var21 - 2, 18553, 4, var22 - 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)Lhm;", line = 100)
    public class223 method29(int arg0) {
        field5982++;
        if (arg0 != -200) {
            this.method29(-26);
        }
        return null;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Leha;Loea;IIIIIII)V", line = 123)
    public class452(class91 arg0, class599 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field5981 = arg0;
        this.field5987 = arg6;
        this.field5980 = arg7;
        this.field5979 = arg1;
        this.field5978 = arg5;
        this.field5983 = arg2;
        this.field5976 = arg8;
        this.field5985 = arg3;
        this.field5988 = arg4;
    }
}
