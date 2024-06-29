import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class664 extends class99 {

    @OriginalMember(owner = "client!qca", name = "D", descriptor = "Ljava/lang/Object;")
    private Object field9453;

    @OriginalMember(owner = "client!qca", name = "A", descriptor = "[[I")
    public static int[][] field9450 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!qca", name = "C", descriptor = "I")
    public static int field9452 = -1;

    @OriginalMember(owner = "client!qca", name = "z", descriptor = "I")
    public static int field9449;

    @OriginalMember(owner = "client!qca", name = "B", descriptor = "I")
    public static int field9451;

    @OriginalMember(owner = "client!qca", name = "E", descriptor = "I")
    public static int field9454;

    @OriginalMember(owner = "client!qca", name = "F", descriptor = "I")
    public static int field9455;

    @OriginalMember(owner = "client!qca", name = "G", descriptor = "I")
    public static int field9456;

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "(I)V")
    public static void method3785(int arg0) {
        field9450 = null;
        if (arg0 != -17004) {
            method3787(80, 41, -73, true, 28);
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method561(boolean arg0) {
        field9454++;
        if (arg0) {
            method3786(83, 'c');
        }
        return this.field9453;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IC)Z")
    public static final boolean method3786(int arg0, char arg1) {
        if (arg0 != -129) {
            return false;
        }
        field9451++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class527.field7294;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class664(Object arg0, int arg1) {
        super(arg1);
        this.field9453 = arg0;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIIZI)I")
    public static final int method3787(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field9455++;
        if (!arg3) {
            method3788(-81, 70, 79, (byte) -77, -85);
        }
        int var5 = 65536 - class240.field3177[arg1 * 8192 / arg0] >> 1;
        return ((65536 - var5) * arg2 >> 16) + (arg4 * var5 >> 16);
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)Z")
    public final boolean method560(int arg0) {
        field9449++;
        if (arg0 > -112) {
            this.field9453 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIIBI)V")
    public static final void method3788(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != -71) {
            field9450 = null;
        }
        class281.field3703 = arg2;
        field9456++;
        class151.field2071 = arg1;
        class6.field66 = arg4;
        class255.field3350 = arg0;
    }
}
