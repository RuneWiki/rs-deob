import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class40 extends class295 {

    @OriginalMember(owner = "client!gs", name = "K", descriptor = "I")
    public int field614 = -1;

    @OriginalMember(owner = "client!gs", name = "L", descriptor = "I")
    public int field615 = 0;

    @OriginalMember(owner = "client!gs", name = "G", descriptor = "I")
    public int field610 = 12800;

    @OriginalMember(owner = "client!gs", name = "R", descriptor = "I")
    public int field620 = 12800;

    @OriginalMember(owner = "client!gs", name = "V", descriptor = "Z")
    public boolean field623 = true;

    @OriginalMember(owner = "client!gs", name = "U", descriptor = "I")
    public int field622 = 0;

    @OriginalMember(owner = "client!gs", name = "Z", descriptor = "I")
    public int field627 = -1;

    @OriginalMember(owner = "client!gs", name = "J", descriptor = "I")
    public int field613;

    @OriginalMember(owner = "client!gs", name = "N", descriptor = "Ljava/lang/String;")
    public String field617;

    @OriginalMember(owner = "client!gs", name = "O", descriptor = "Ljava/lang/String;")
    public String field618;

    @OriginalMember(owner = "client!gs", name = "T", descriptor = "I")
    public int field621;

    @OriginalMember(owner = "client!gs", name = "M", descriptor = "Lfi;")
    public class166 field616;

    @OriginalMember(owner = "client!gs", name = "Y", descriptor = "I")
    public static int field626 = 127;

    @OriginalMember(owner = "client!gs", name = "B", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!gs", name = "C", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!gs", name = "D", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!gs", name = "E", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!gs", name = "H", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!gs", name = "I", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!gs", name = "P", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!gs", name = "W", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!gs", name = "X", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "([IIIII)Z", line = 3)
    public final boolean method390(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field625++;
        for (class360 var6 = (class360) this.field616.method1240((byte) -94); var6 != null; var6 = (class360) this.field616.method1245(1)) {
            if (var6.method2256(arg2, (byte) 22, arg4, arg3)) {
                var6.method2261(arg4, arg3, -108, arg0);
                return true;
            }
        }
        if (arg1 != 63) {
            this.method393(-94, 38, (int[]) null, -60);
        }
        return false;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)Z", line = 31)
    public final boolean method391(int arg0, int arg1, int arg2) {
        field624++;
        class360 var4 = (class360) this.field616.method1240((byte) -89);
        if (arg2 <= 113) {
            this.method397((int[]) null, -51, -13, (byte) -15);
        }
        while (var4 != null) {
            if (var4.method2257((byte) -118, arg1, arg0)) {
                return true;
            }
            var4 = (class360) this.field616.method1245(1);
        }
        return false;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 54)
    public static final String method392(long arg0, byte arg1) {
        field619++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class19.field376[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            if (arg1 < 110) {
                method392(112L, (byte) -106);
            }
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(II[II)Z", line = 106)
    public final boolean method393(int arg0, int arg1, int[] arg2, int arg3) {
        field612++;
        if (arg1 != 255) {
            this.field617 = null;
        }
        for (class360 var5 = (class360) this.field616.method1240((byte) -84); var5 != null; var5 = (class360) this.field616.method1245(arg1 ^ 0xFE)) {
            if (var5.method2257((byte) -125, arg0, arg3)) {
                var5.method2261(arg3, arg0, -95, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(BI)S", line = 133)
    public static final short method394(byte arg0, int arg1) {
        field611++;
        int var2 = arg1 >> 10 & 0x3F;
        if (arg0 <= 49) {
            return -24;
        }
        int var3 = (arg1 & 0x385) >> 3;
        int var4 = arg1 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var7 >> 4 << 7 | var2 << 10);
    }

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "(I)V", line = 162)
    public final void method395(int arg0) {
        if (arg0 != 127) {
            return;
        }
        this.field620 = 12800;
        this.field622 = 0;
        this.field610 = 12800;
        this.field615 = 0;
        field607++;
        for (class360 var2 = (class360) this.field616.method1240((byte) -85); var2 != null; var2 = (class360) this.field616.method1245(1)) {
            if (this.field610 > var2.field4875) {
                this.field610 = var2.field4875;
            }
            if (this.field615 < var2.field4887) {
                this.field615 = var2.field4887;
            }
            if (this.field620 > var2.field4880) {
                this.field620 = var2.field4880;
            }
            if (var2.field4889 > this.field622) {
                this.field622 = var2.field4889;
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(Z)Z", line = 198)
    public static final boolean method396(boolean arg0) {
        field608++;
        if (arg0) {
            field626 = -105;
        }
        try {
            if (class229.field3182 == 2) {
                if (class165.field2424 == null) {
                    class165.field2424 = class2.method9(class241.field3327, class433.field6142, class395.field5532);
                    if (class165.field2424 == null) {
                        return false;
                    }
                }
                if (class71.field1078 == null) {
                    class71.field1078 = new class53(class190.field2738, class288.field3858);
                }
                if (class258.field3484.method2508(class71.field1078, -24292, class165.field2424, 22050, class127.field1800)) {
                    class258.field3484.method2522(-19306);
                    class258.field3484.method2488(32686, class148.field2286);
                    class258.field3484.method2487((byte) -83, class165.field2424, class163.field2414);
                    class229.field3182 = 0;
                    class241.field3327 = null;
                    class71.field1078 = null;
                    class165.field2424 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class258.field3484.method2510(true);
            class229.field3182 = 0;
            class241.field3327 = null;
            class71.field1078 = null;
            class165.field2424 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "([IIIB)Z", line = 251)
    public final boolean method397(int[] arg0, int arg1, int arg2, byte arg3) {
        int var5 = 81 / ((arg3 - 72) / 39);
        field609++;
        for (class360 var6 = (class360) this.field616.method1240((byte) -113); var6 != null; var6 = (class360) this.field616.method1245(1)) {
            if (var6.method2259(arg1, true, arg2)) {
                var6.method2258(arg1, -51, arg2, arg0);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V", line = 315)
    public class40(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field613 = arg0;
        this.field617 = arg2;
        this.field627 = arg6;
        this.field618 = arg1;
        this.field614 = arg4;
        this.field623 = arg5;
        this.field621 = arg3;
        if (this.field627 == 255) {
            this.field627 = 0;
        }
        this.field616 = new class166();
    }
}
