import java.math.BigInteger;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class129 {

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "[I")
    public static int[] field1924 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1926 = "M";

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1925 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)I")
    public static final int method805(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            method808(-95);
        }
        int var3 = 0;
        while (arg1 > 0) {
            var3 = arg2 & 0x1 | var3 << 1;
            arg1--;
            arg2 >>>= 0x1;
        }
        field1923++;
        return var3;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
    public static final void method806(boolean arg0) {
        field1929++;
        if (arg0) {
            method807(-82, -89);
        }
        class203.field3064.method1782(0);
        class210.field3160.method1782(0);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)[B")
    public static final byte[] method807(int arg0, int arg1) {
        field1930++;
        if (arg0 != 0) {
            return null;
        }
        class67 var2 = (class67) class202.field3051.method122((long) arg1, (byte) 112);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class112.method726(var7, (byte) 57, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class67(var3);
            class202.field3051.method119((long) arg1, var2, 0);
        }
        return var2.field1066;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method808(int arg0) {
        field1925 = null;
        field1924 = null;
        if (arg0 == 16) {
            field1926 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BB)C")
    public static final char method809(byte arg0, byte arg1) {
        field1928++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else if (arg1 == 95) {
            if (var2 >= 128 && var2 < 160) {
                char var3 = class166.field2544[var2 - 128];
                if (var3 == '\u0000') {
                    var3 = '?';
                }
                var2 = var3;
            }
            return (char) var2;
        } else {
            return '\u0002';
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    public class129() {
        new class57();
    }
}
