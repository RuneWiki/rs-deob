import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class387 extends class210 implements class113 {

    @OriginalMember(owner = "client!cr", name = "O", descriptor = "Ljo;")
    public class210 field5742;

    @OriginalMember(owner = "client!cr", name = "P", descriptor = "Z")
    public static boolean field5743 = false;

    @OriginalMember(owner = "client!cr", name = "B", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!cr", name = "C", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!cr", name = "D", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!cr", name = "E", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!cr", name = "F", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!cr", name = "G", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!cr", name = "H", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!cr", name = "I", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!cr", name = "J", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!cr", name = "K", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!cr", name = "L", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!cr", name = "N", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!cr", name = "Q", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!cr", name = "R", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!cr", name = "S", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!cr", name = "T", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!cr", name = "U", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!cr", name = "V", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Z)Z", line = 4)
    public final boolean method371(boolean arg0) {
        if (arg0) {
            this.method719(49, 21, -90, null, -118, false, null);
        }
        field5738++;
        return false;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Leq;Z)V", line = 19)
    public final void method360(class134 arg0, boolean arg1) {
        if (!arg1) {
            field5731 = 98;
        }
        field5741++;
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(I)V", line = 29)
    public final void method722(int arg0) {
        if (arg0 != 0) {
            this.method371(true);
        }
        field5744++;
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(B)I", line = 39)
    public final int method724(byte arg0) {
        field5732++;
        if (arg0 > -30) {
            this.method372((byte) 102, null);
        }
        return 0;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)I", line = 53)
    public final int method369(byte arg0) {
        field5746++;
        return arg0 < 24 ? -4 : 0;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIILbp;IZLeq;)V", line = 64)
    public final void method719(int arg0, int arg1, int arg2, class250 arg3, int arg4, boolean arg5, class134 arg6) {
        if (arg2 != -1) {
            field5731 = -32;
        }
        field5739++;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIII)Lbn;", line = 74)
    public static final class294 method2324(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 60) {
            method2324(70, 93, 77, 118);
        }
        field5734++;
        class468 var4 = class358.field5312[arg1][arg3][arg2];
        if (var4 == null) {
            return null;
        }
        class294 var5 = null;
        int var6 = -1;
        for (class323 var7 = var4.field6769; var7 != null; var7 = var7.field4727) {
            class210 var8 = var7.field4726;
            if (var8 instanceof class294) {
                class294 var9 = (class294) var8;
                int var10 = (var9.method1773(arg0 - 181) - 1) * 64 + 60;
                int var11 = var9.field2959 - var10 >> 7;
                int var12 = var9.field2966 - var10 >> 7;
                int var13 = var9.field2959 + var10 >> 7;
                int var14 = var9.field2966 + var10 >> 7;
                if (arg3 >= var11 && var12 <= arg2 && arg3 <= var13 && var14 >= arg2) {
                    int var15 = (var14 + 1 - arg2) * (var13 + 1 - arg3);
                    if (var6 < var15) {
                        var6 = var15;
                        var5 = var9;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILeq;Z)Lva;", line = 134)
    public final class327 method367(int arg0, class134 arg1, boolean arg2) {
        field5745++;
        if (!arg2) {
            this.field5742 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILeq;BI)Z", line = 145)
    public final boolean method365(int arg0, class134 arg1, byte arg2, int arg3) {
        int var5 = 6 / ((arg2 + 23) / 38);
        field5748++;
        return false;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(BLeq;)V", line = 155)
    public final void method372(byte arg0, class134 arg1) {
        field5733++;
        if (arg0 >= -49) {
            method2324(16, 35, -35, -106);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Leq;I)V", line = 167)
    public final void method361(class134 arg0, int arg1) {
        field5735++;
        if (arg1 != -1) {
            this.method364(null, true);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIB)I", line = 179)
    public static final int method2325(int arg0, int arg1, byte arg2) {
        field5749++;
        if (arg2 >= -75) {
            return -121;
        }
        if (arg1 > arg0) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V", line = 210)
    public final void method368(int arg0) {
        field5740++;
        if (arg0 != 5894) {
            this.field5742 = null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "(I)Z", line = 220)
    public final boolean method723(int arg0) {
        if (arg0 != 17774) {
            this.field5742 = null;
        }
        field5737++;
        return false;
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(IIIIIIIIIILjo;)V", line = 232)
    public class387(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class210 arg10) {
        super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, class162.method1026(arg1, arg0, (byte) -125));
        this.field5742 = arg10;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(Leq;Z)Lgl;", line = 246)
    public final class408 method364(class134 arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            field5730++;
            return null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)I", line = 258)
    public final int method359(int arg0) {
        if (arg0 != 13228) {
            field5731 = -54;
        }
        field5736++;
        return 0;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(B)I", line = 269)
    public final int method362(byte arg0) {
        field5747++;
        if (arg0 != -72) {
            field5731 = -123;
        }
        return 0;
    }
}
