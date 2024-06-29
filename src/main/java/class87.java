import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public abstract class class87 {

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public static int field1463 = 0;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "[[I")
    public static int[][] field1455 = new int[5][5000];

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "[I")
    public static int[] field1459 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public int field1457;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public int field1458;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public int field1460;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public int field1461;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public int field1462;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public int field1464;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
    public abstract void method197(int arg0, int arg1);

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IBI)Lmb;")
    public static final class96 method626(int arg0, byte arg1, int arg2) {
        field1456++;
        int var3 = arg0 - arg2;
        if (var3 < -9) {
            return class218.field3730;
        } else if (var3 < -6) {
            return class252.field4362;
        } else if (var3 < -3) {
            return class82.field1379;
        } else if (var3 < 0) {
            return class109.field2022;
        } else {
            if (arg1 != -44) {
                method627((byte) 125);
            }
            if (var3 > 9) {
                return class77.field1323;
            } else if (var3 > 6) {
                return class42.field721;
            } else if (var3 > 3) {
                return class177.field3071;
            } else if (var3 > 0) {
                return class3.field36;
            } else {
                return class96.field1582;
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
    public static void method627(byte arg0) {
        field1455 = null;
        int var1 = -95 / ((11 - arg0) / 40);
        field1459 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)V")
    public abstract void method196(int arg0, int arg1, int arg2);
}
