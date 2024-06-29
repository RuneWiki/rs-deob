import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class74 extends class240 {

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public static int field1139 = 0;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "[I")
    public static int[] field1140 = new int[2];

    @OriginalMember(owner = "client!je", name = "p", descriptor = "[I")
    public static int[] field1137 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!je", name = "x", descriptor = "B")
    public byte field1145;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    public int field1142;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "Ljava/lang/String;")
    public String field1138;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "Ljava/lang/String;")
    public String field1141;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "[[[B")
    public static byte[][][] field1136;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V", line = 6)
    public static void method554(int arg0) {
        field1136 = (byte[][][]) null;
        field1140 = null;
        field1137 = null;
        if (arg0 != -7698) {
            field1139 = 103;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 26)
    public static final String method555(byte arg0, long arg1) {
        field1143++;
        if (arg0 >= -48) {
            field1140 = (int[]) null;
        }
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class203.field3197[(int) (var7 - (arg1 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V", line = 64)
    public static final void method556(int arg0, int arg1) {
        if (arg0 < 11) {
            field1136 = (byte[][][]) ((byte[][][]) null);
        }
        field1135++;
        class4 var2 = class67.method510(1, 1, arg1);
        var2.method6(255);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lja;I)Z", line = 77)
    public static final boolean method557(class64 arg0, int arg1) {
        field1146++;
        if (arg0.method489(class169.field2635, 0)) {
            return true;
        } else {
            if (arg1 != -16126) {
                method556(61, 75);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)I", line = 106)
    public static final int method558(boolean arg0, int arg1) {
        field1144++;
        return arg0 ? arg1 & 0xFF : 99;
    }
}
