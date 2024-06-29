import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public abstract class class82 extends class202 {

    @OriginalMember(owner = "client!nj", name = "O", descriptor = "J")
    public static long field1440 = 0L;

    @OriginalMember(owner = "client!nj", name = "U", descriptor = "[I")
    public static int[] field1446 = new int[1000];

    @OriginalMember(owner = "client!nj", name = "Z", descriptor = "Lsb;")
    public static class98 field1451 = class47.method368("(U4", 0);

    @OriginalMember(owner = "client!nj", name = "V", descriptor = "Z")
    public static boolean field1447 = false;

    @OriginalMember(owner = "client!nj", name = "X", descriptor = "I")
    public static int field1449 = 0;

    @OriginalMember(owner = "client!nj", name = "W", descriptor = "Lvf;")
    public static class48 field1448 = new class48();

    @OriginalMember(owner = "client!nj", name = "N", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!nj", name = "P", descriptor = "I")
    public int field1441;

    @OriginalMember(owner = "client!nj", name = "Q", descriptor = "I")
    public int field1442;

    @OriginalMember(owner = "client!nj", name = "S", descriptor = "I")
    public int field1444;

    @OriginalMember(owner = "client!nj", name = "T", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!nj", name = "Y", descriptor = "I")
    public int field1450;

    @OriginalMember(owner = "client!nj", name = "ab", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!nj", name = "bb", descriptor = "I")
    public int field1453;

    @OriginalMember(owner = "client!nj", name = "cb", descriptor = "I")
    public int field1454;

    @OriginalMember(owner = "client!nj", name = "db", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!nj", name = "R", descriptor = "Ltg;")
    public static class75 field1443;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIII)V")
    public abstract void method610(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(III)V")
    public abstract void method611(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(IIII)V")
    public abstract void method612(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(IIIII)V")
    public abstract void method613(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public static void method614(int arg0) {
        field1446 = null;
        field1448 = null;
        field1451 = null;
        field1443 = null;
        if (arg0 != 16) {
            field1443 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIII)V")
    public abstract void method615(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
    public static final void method616(int arg0) {
        if (arg0 < -27) {
            class44.field741++;
            field1452++;
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(II)V")
    public abstract void method617(int arg0, int arg1);

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(II)V")
    public abstract void method618(int arg0, int arg1);

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(IIIII)V")
    public final void method619(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -419358396) {
            this.field1450 = -6;
        }
        field1445++;
        int var6 = this.field1453 << 3;
        int var7 = this.field1442 << 3;
        int var8 = (arg0 << 4) + (var7 & 0xF);
        int var9 = (arg2 << 4) + (var6 & 0xF);
        this.method615(var6, var7, var9, var8, arg4, arg3);
    }
}
