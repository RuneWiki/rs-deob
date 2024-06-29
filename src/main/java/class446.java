import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public abstract class class446 {

    @OriginalMember(owner = "client!go", name = "c", descriptor = "Lda;")
    public class44 field6642;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "Z")
    public static boolean field6644 = false;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)Z")
    public abstract boolean method691(byte arg0);

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZB)V")
    public abstract void method696(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V")
    public static final void method2667(int arg0) {
        class34.field525 = true;
        field6640++;
        if (arg0 != 15130) {
            method2668(40, true, 121, -91, -112, 117);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(III)V")
    public abstract void method689(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IZIIII)I")
    public static final int method2668(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field6641++;
        if (class520.field7560 == null) {
            return 0;
        }
        if (arg0 < 3) {
            int var6 = arg3 >> 7;
            int var7 = arg2 >> 7;
            if (arg5 < 0 || arg4 < 0 || arg5 > class339.field5099 - 1 || class484.field7129 - 1 < arg4) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || var6 > class339.field5099 - 1 || class484.field7129 - 1 < var7) {
                return 0;
            }
            boolean var8 = (class22.field333[1][arg3 >> 7][arg2 >> 7] & 0x2) != 0;
            if ((arg3 & 0x7F) == 0) {
                boolean var9 = (class22.field333[1][var6 - 1][arg2 >> 7] & 0x2) != 0;
                boolean var10 = (class22.field333[1][var6][arg2 >> 7] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class22.field333[1][arg5][arg4] & 0x2) != 0;
                }
            }
            if ((arg2 & 0x7F) == 0) {
                boolean var11 = (class22.field333[1][arg3 >> 7][var7 - 1] & 0x2) != 0;
                boolean var12 = (class22.field333[1][arg3 >> 7][var7] & 0x2) != 0;
                if (var12 != var11) {
                    var8 = (class22.field333[1][arg5][arg4] & 0x2) != 0;
                }
            }
            if (var8) {
                arg0++;
            }
        }
        if (arg1) {
            method2668(93, false, 127, -68, -72, 44);
        }
        return class520.field7560[arg0].method186(arg3, arg2);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2669(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6643++;
        int var8 = arg4 + arg5;
        int var9 = arg2 - arg4;
        int var10 = arg5;
        if (arg6 != 2) {
            field6644 = false;
        }
        while (var10 < var8) {
            class503.method3027(arg1, (byte) 127, arg7, arg0, class316.field4797[var10]);
            var10++;
        }
        for (int var11 = arg2; var11 > var9; var11--) {
            class503.method3027(arg1, (byte) 127, arg7, arg0, class316.field4797[var11]);
        }
        int var12 = arg1 + arg4;
        int var13 = arg7 - arg4;
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class316.field4797[var14];
            class503.method3027(arg1, (byte) 127, var12, arg0, var15);
            class503.method3027(var12, (byte) 127, var13, arg3, var15);
            class503.method3027(var13, (byte) 127, arg7, arg0, var15);
        }
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V")
    public abstract void method688(int arg0);

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IILac;)V")
    public abstract void method694(int arg0, int arg1, class381 arg2);

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BZ)V")
    public abstract void method695(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lda;)V")
    public class446(class44 arg0) {
        this.field6642 = arg0;
    }
}
