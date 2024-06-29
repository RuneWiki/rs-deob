import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public abstract class class426 {

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "[[I")
    public static int[][] field6337 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "[I")
    public static int[] field6338 = new int[32];

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field6340 = -1;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field6336;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field6339;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public int field6344;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public int field6346;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public int field6347;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "[I")
    public static int[] field6343;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)Z")
    public final boolean method2663(byte arg0) {
        int var2 = 8 / ((-arg0 - 2) / 58);
        field6342++;
        return (this.field6346 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILaca;)V")
    public static final void method2664(int arg0, class630 arg1) {
        arg1.field9090 = null;
        field6345++;
        int var2 = arg1.field9084.length;
        if (arg0 != -201) {
            method2664(65, null);
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg1.field9084[var3].field3000 = false;
        }
        class567[] var4 = class254.field3627;
        synchronized (class254.field3627) {
            if (var2 < class254.field3627.length && class609.field8883[var2] < 200) {
                class254.field3627[var2].method3293(arg1, (byte) 87);
                int var10002 = class609.field8883[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Z")
    public final boolean method2665(int arg0) {
        if (arg0 != 7289) {
            this.field6347 = -16;
        }
        field6336++;
        return (this.field6346 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)Z")
    public final boolean method2666(int arg0) {
        field6339++;
        if (arg0 != 4) {
            this.field6344 = 33;
        }
        return (this.field6346 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
    public static void method2667(int arg0) {
        field6337 = null;
        field6338 = null;
        if (arg0 != 64) {
            method2667(77);
        }
        field6343 = null;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)Z")
    public final boolean method2668(byte arg0) {
        field6341++;
        if (arg0 != 87) {
            method2664(120, null);
        }
        return (this.field6346 & 0x8) != 0;
    }
}
