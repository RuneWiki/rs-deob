import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public abstract class class211 extends class181 {

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "[I")
    public static int[] field3844 = new int[5];

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "Lli;")
    private static class185 field3850 = class245.method1649("Ok", 122);

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "[I")
    public static int[] field3847 = new int[100];

    @OriginalMember(owner = "client!dd", name = "W", descriptor = "Lli;")
    public static class185 field3856 = class245.method1649(")3", 124);

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "I")
    public static int field3851 = 0;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "Lli;")
    public static class185 field3845 = field3850;

    @OriginalMember(owner = "client!dd", name = "ab", descriptor = "Z")
    public static boolean field3860 = false;

    @OriginalMember(owner = "client!dd", name = "bb", descriptor = "Lli;")
    public static class185 field3861 = class245.method1649("Titelbild ge-Offnet)3", -117);

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    public int field3843;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
    public int field3849;

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "I")
    public int field3852;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "I")
    public int field3853;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "I")
    public int field3854;

    @OriginalMember(owner = "client!dd", name = "X", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!dd", name = "Z", descriptor = "I")
    public int field3859;

    @OriginalMember(owner = "client!dd", name = "db", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "J")
    public static long field3855;

    @OriginalMember(owner = "client!dd", name = "Y", descriptor = "Laj;")
    public static class1 field3858;

    @OriginalMember(owner = "client!dd", name = "cb", descriptor = "Lhi;")
    public static class250 field3862;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "Ljava/awt/Image;")
    public static Image field3846;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "[I")
    public static int[] field3842;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)V")
    public static final void method1481(byte arg0, int arg1) {
        field3857++;
        if (arg0 <= 30) {
            field3851 = -46;
        }
        class185.field3408.method85((byte) 75, arg1);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V")
    public abstract void method718(int arg0, int arg1);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIII)V")
    public final void method1482(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3863++;
        int var6 = this.field3859 << 3;
        if (arg4 == -1900408252) {
            int var7 = this.field3852 << 3;
            int var8 = (arg0 << 4) + (var6 & 0xF);
            int var9 = (arg1 << 4) + (var7 & 0xF);
            this.method709(var6, var7, var8, var9, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)V")
    public abstract void method707(int arg0, int arg1);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIII)V")
    public abstract void method709(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)V")
    public abstract void method704(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V")
    public static void method1483(int arg0) {
        field3845 = null;
        field3862 = null;
        field3842 = null;
        field3856 = null;
        field3846 = null;
        field3847 = null;
        field3858 = null;
        field3844 = null;
        if (arg0 != 16) {
            field3861 = null;
        }
        field3861 = null;
        field3850 = null;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(IIIII)V")
    public abstract void method695(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIII)V")
    public abstract void method705(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(II)V")
    public abstract void method699(int arg0, int arg1);
}
