import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class146 {

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public int field2149;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public int field2154;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public int field2150;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public int field2153;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "[[I")
    public static int[][] field2152 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    public static int field2155 = 0;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
    public static void method1049(int arg0) {
        int var1 = 2 % ((65 - arg0) / 41);
        field2152 = null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)Lhm;")
    public final class146 method1050(int arg0, int arg1) {
        if (arg0 == 12) {
            field2151++;
            return new class146(this.field2154, arg1, this.field2149, this.field2153);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(IIII)V")
    public class146(int arg0, int arg1, int arg2, int arg3) {
        this.field2149 = arg2;
        this.field2154 = arg0;
        this.field2150 = arg1;
        this.field2153 = arg3;
    }
}
