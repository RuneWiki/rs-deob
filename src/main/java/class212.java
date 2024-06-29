import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class212 {

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "S")
    public short field3063;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "B")
    public byte field3070;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Z")
    public boolean field3065;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "B")
    public byte field3069;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public int field3067;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "S")
    public short field3071;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "S")
    public short field3066;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field3064 = 0;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)I", line = 4)
    public static final int method1335(int arg0, byte arg1) {
        field3068++;
        if (arg1 >= -119) {
            method1336(-24, -84);
        }
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xE0) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V", line = 64)
    public static final void method1336(int arg0, int arg1) {
        class31 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class38 var4 = class68.field858[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class272.field4032; var5++) {
                    for (int var6 = 0; var6 < class6.field109; var6++) {
                        var2 = var4.method13(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class493.field6970;
                            int var8 = var5 << class493.field6970;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class38 var10 = class68.field858[var9];
                                if (var10 != null) {
                                    int var11 = var4.method10(var6, var5) - var10.method10(var6, var5);
                                    int var12 = var4.method10(var6 + 1, var5) - var10.method10(var6 + 1, var5);
                                    int var13 = var4.method10(var6 + 1, var5 + 1) - var10.method10(var6 + 1, var5 + 1);
                                    int var14 = var4.method10(var6, var5 + 1) - var10.method10(var6, var5 + 1);
                                    var10.method3(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(IIIIIIIIIZ)V", line = 134)
    public class212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field3063 = (short) arg6;
        this.field3070 = (byte) arg7;
        this.field3065 = arg9;
        this.field3069 = (byte) arg8;
        this.field3067 = arg0;
        this.field3071 = (short) arg5;
        this.field3066 = (short) arg4;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)Lne;", line = 154)
    public final class212 method1337(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 4) {
            this.field3070 = -114;
        }
        field3062++;
        return new class212(arg4, arg1, arg3, arg0, this.field3066, this.field3071, this.field3063, this.field3070, this.field3069, this.field3065);
    }
}
