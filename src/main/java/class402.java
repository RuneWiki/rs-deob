import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class402 {

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5802 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "Ljn;")
    public static class409 field5804;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Lvq;")
    public static class24 field5805;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "[[I")
    public static int[][] field5807;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field5801;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2510(int arg0, byte arg1, int arg2) {
        field5803++;
        if (arg1 != 98) {
            return false;
        }
        if (arg0 == 11) {
            arg0 = 10;
        }
        class178 var3 = class450.method2785(arg2, (byte) 94);
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method1236(arg0, 0);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class96 var7 = new class96();
        var7.field1201 = arg1 >> class167.field2206;
        var7.field1188 = arg2 >> class167.field2206;
        var7.field1203 = arg3 >> class167.field2206;
        var7.field1181 = arg4 >> class167.field2206;
        var7.field1199 = arg0;
        var7.field1184 = arg1;
        var7.field1200 = arg2;
        var7.field1186 = arg3;
        var7.field1182 = arg4;
        var7.field1194 = arg5;
        var7.field1189 = arg6;
        class234.field3515[class215.field3062++] = var7;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)I")
    public static final int method2512(int arg0, int arg1, int arg2) {
        field5801++;
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (arg2 != -30597) {
            return 69;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static void method2513(int arg0) {
        field5802 = null;
        int var1 = -82 / ((17 - arg0) / 62);
        field5805 = null;
        field5807 = null;
        field5804 = null;
    }

    static {
        new class409((String) null, "die kürzlich gesprochen oder gehandelt haben.", (String) null, (String) null);
        field5804 = new class409("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");
        field5805 = new class24(4, -2);
        field5806 = 0;
        field5807 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };
    }
}
