import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class67 {

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public static int field970 = 0;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "Z")
    public static boolean field972 = true;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "Lec;")
    public static class99 field966 = new class99(64);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "B")
    public byte field958;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "B")
    public byte field963;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "B")
    public byte field965;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "B")
    public byte field974;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "S")
    public short field969;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Z")
    public boolean field961;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "Z")
    public boolean field962;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "Z")
    public boolean field968;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "Z")
    public boolean field971;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "Z")
    public boolean field973;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "[[[Lvb;")
    public static class79[][][] field967;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V", line = 10)
    public static void method478(byte arg0) {
        int var1 = -2 % ((-arg0 - 44) / 44);
        field966 = null;
        field967 = (class79[][][]) null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 27)
    public static final void method479(int arg0) {
        field966.method750((byte) 104);
        if (arg0 != 0) {
            field967 = (class79[][][]) ((class79[][][]) null);
        }
        class35.field509.method750((byte) 97);
        class65.field938.method750((byte) 82);
        field975++;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V", line = 45)
    public static final void method480(int arg0) {
        field964++;
        int var1 = 0;
        int[] var2 = new int[class12.field153];
        for (int var3 = 0; var3 < class12.field153; var3++) {
            class108 var4 = class222.method1576(var3, (byte) 92);
            if (var4.field1585 >= 0 || var4.field1606 >= 0) {
                var2[var1++] = var3;
            }
        }
        class110.field1660 = new int[var1];
        int var5 = -56 / ((arg0 + 12) / 42);
        for (int var6 = 0; var6 < var1; var6++) {
            class110.field1660[var6] = var2[var6];
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljd;III)[Lrj;", line = 82)
    public static final class269[] method481(class95 arg0, int arg1, int arg2, int arg3) {
        field960++;
        return class31.method233(arg2, arg3, arg1, arg0) ? class99.method742(1) : null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIBIIIII)V", line = 99)
    public static final void method482(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field959++;
        int var8 = arg0 + arg6;
        int var9 = arg0 + arg4;
        int var10 = arg7 - arg0;
        int var11 = arg3 - arg0;
        for (int var12 = arg6; var12 < var8; var12++) {
            class7.method72(arg3, -7, arg4, class79.field1178[var12], arg5);
        }
        for (int var13 = arg7; var13 > var10; var13--) {
            class7.method72(arg3, -7, arg4, class79.field1178[var13], arg5);
        }
        if (arg2 != -83) {
            field967 = (class79[][][]) ((class79[][][]) null);
        }
        for (int var14 = var8; var14 <= var10; var14++) {
            int[] var15 = class79.field1178[var14];
            class7.method72(var9, -7, arg4, var15, arg5);
            class7.method72(var11, -7, var9, var15, arg1);
            class7.method72(arg3, -7, var11, var15, arg5);
        }
    }
}
