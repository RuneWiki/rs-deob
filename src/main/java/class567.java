import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class567 {

    @OriginalMember(owner = "client!pca", name = "n", descriptor = "Z")
    public boolean field7927;

    @OriginalMember(owner = "client!pca", name = "e", descriptor = "I")
    public int field7918;

    @OriginalMember(owner = "client!pca", name = "g", descriptor = "B")
    public byte field7920;

    @OriginalMember(owner = "client!pca", name = "l", descriptor = "S")
    public short field7925;

    @OriginalMember(owner = "client!pca", name = "i", descriptor = "S")
    public short field7922;

    @OriginalMember(owner = "client!pca", name = "j", descriptor = "I")
    public int field7923;

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "I")
    public int field7915;

    @OriginalMember(owner = "client!pca", name = "f", descriptor = "S")
    public short field7919;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "I")
    public int field7914;

    @OriginalMember(owner = "client!pca", name = "m", descriptor = "I")
    public int field7926;

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "I")
    public static int field7917 = -1;

    @OriginalMember(owner = "client!pca", name = "h", descriptor = "S")
    public static short field7921 = 32767;

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "Lqi;")
    public static class669 field7916 = new class669(3, 2);

    @OriginalMember(owner = "client!pca", name = "k", descriptor = "I")
    public static int field7924;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIILtd;I)Z")
    public static final boolean method3195(int arg0, int arg1, int arg2, class525 arg3, int arg4) {
        field7924++;
        if (!class182.field2387 || !class379.field5297) {
            return false;
        } else if (class540.field7599 < 100) {
            return false;
        } else if (class432.method2572(arg1, arg2, 1, arg4)) {
            int var5 = arg2 << class455.field6383;
            int var6 = arg4 << class455.field6383;
            int var7 = class517.field7282[arg1].method2381(-108, arg2, arg4) - 1;
            int var8 = arg3.method247(0) + var7;
            if (arg3.field7417 == 1) {
                if (!class147.method923(var8, var5, var5, var7, var6, var5, var6, 0, var8, class431.field6109 + var6)) {
                    return false;
                } else if (class147.method923(var7, var5, var5, var7, var6, var5, class431.field6109 + var6, 0, var8, class431.field6109 + var6)) {
                    class47.field689++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field7417 == 2) {
                if (!class147.method923(var8, var5, class431.field6109 + var5, var7, class431.field6109 + var6, var5, class431.field6109 + var6, 0, var8, var6 + class431.field6109)) {
                    return false;
                } else if (class147.method923(var8, class431.field6109 + var5, class431.field6109 + var5, var7, class431.field6109 + var6, var5, var6 + class431.field6109, 0, var7, var6 + class431.field6109)) {
                    class47.field689++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field7417 == 4) {
                if (!class147.method923(var8, class431.field6109 + var5, class431.field6109 + var5, var7, var6, class431.field6109 + var5, var6, 0, var8, class431.field6109 + var6)) {
                    return false;
                } else if (class147.method923(var7, class431.field6109 + var5, class431.field6109 + var5, var7, var6, class431.field6109 + var5, var6 - -class431.field6109, 0, var8, class431.field6109 + var6)) {
                    class47.field689++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field7417 != 8) {
                if (arg0 < 115) {
                    field7921 = -78;
                }
                if (arg3.field7417 == 16) {
                    if (class600.method3306(class5.field54, var8, class5.field54, (byte) -62, var7, class5.field54 + var6, var5)) {
                        class47.field689++;
                        return true;
                    } else {
                        return false;
                    }
                } else if (arg3.field7417 == 32) {
                    if (class600.method3306(class5.field54, var8, class5.field54, (byte) -62, var7, class5.field54 + var6, class5.field54 + var5)) {
                        class47.field689++;
                        return true;
                    } else {
                        return false;
                    }
                } else if (arg3.field7417 == 64) {
                    if (class600.method3306(class5.field54, var8, class5.field54, (byte) -62, var7, var6, var5 + class5.field54)) {
                        class47.field689++;
                        return true;
                    } else {
                        return false;
                    }
                } else if (arg3.field7417 != 128) {
                    return true;
                } else if (class600.method3306(class5.field54, var8, class5.field54, (byte) -62, var7, var6, var5)) {
                    class47.field689++;
                    return true;
                } else {
                    return false;
                }
            } else if (!class147.method923(var8, var5, class431.field6109 + var5, var7, var6, var5, var6, 0, var8, var6)) {
                return false;
            } else if (class147.method923(var8, class431.field6109 + var5, var5 - -class431.field6109, var7, var6, var5, var6, 0, var7, var6)) {
                class47.field689++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)V")
    public static void method3196(byte arg0) {
        field7916 = null;
        if (arg0 > -72) {
            field7917 = -87;
        }
    }

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class567(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field7927 = arg10;
        this.field7918 = arg0;
        this.field7920 = (byte) arg8;
        this.field7925 = (short) arg5;
        this.field7922 = (short) arg4;
        this.field7923 = arg11;
        this.field7915 = arg3;
        this.field7919 = (short) arg6;
        this.field7914 = arg2;
        this.field7926 = arg1;
    }
}
