import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class190 extends class35 {

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
    public int field2922;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    public int field2919;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "[[I")
    public static int[][] field2918 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
    public static int field2920 = 0;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "I")
    public static int field2921 = 1407;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IC)Z")
    public static final boolean method1325(int arg0, char arg1) {
        field2917++;
        if (arg0 > -106) {
            method1325(-123, (char) 65411);
        }
        return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)V")
    public static void method1326(int arg0) {
        field2918 = null;
        if (arg0 != 7) {
            field2918 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(II)V")
    public class190(int arg0, int arg1) {
        this.field2922 = arg0;
        this.field2919 = arg1;
    }
}
