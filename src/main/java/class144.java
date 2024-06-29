import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public abstract class class144 extends class288 {

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "Z")
    public boolean field2059;

    @OriginalMember(owner = "client!mj", name = "G", descriptor = "[Lmj;")
    public class144[] field2072;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "[I")
    public static int[] field2060 = new int[1000];

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "I")
    public static int field2064 = 0;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public int field2057;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!mj", name = "H", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "Ldk;")
    public class236 field2053;

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "Ll;")
    public class70 field2069;

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "[Lwj;")
    public static class130[] field2065;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V")
    public static void method926(int arg0) {
        field2060 = null;
        if (arg0 >= 114) {
            field2065 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZI)[[I")
    public final int[][] method927(int arg0, boolean arg1, int arg2) {
        field2062++;
        if (!arg1) {
            return null;
        } else if (this.field2072[arg2].field2059) {
            int[] var4 = this.field2072[arg2].method12(arg0, 255);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field2072[arg2].method8((byte) 5, arg0);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILqi;I)V")
    public void method9(int arg0, class216 arg1, int arg2) {
        if (arg2 != 20630) {
            method928(39);
        }
        field2073++;
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V")
    public static final void method928(int arg0) {
        field2052++;
        class57 var1 = class75.field899;
        synchronized (class75.field899) {
            if (arg0 >= -24) {
                method930(-89, -107);
            }
            class151.field2193 = class79.field942;
            class104.field1417 = class60.field722;
            class26.field310++;
            class37.field431 = class66.field789;
            class52.field599 = class53.field613;
            class76.field905 = class46.field541;
            class190.field2736 = class238.field3430;
            class131.field1888 = class74.field893;
            class53.field613 = 0;
        }
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)V")
    public void method23(int arg0) {
        if (this.field2059) {
            this.field2069.method421(123);
            this.field2069 = null;
        } else {
            this.field2053.method1541((byte) 106);
            this.field2053 = null;
        }
        field2054++;
        if (arg0 != 23025) {
            this.field2053 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "(I)I")
    public int method20(int arg0) {
        field2066++;
        int var2 = -37 % ((arg0 + 65) / 57);
        return -1;
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)V")
    public static final void method929(byte arg0) {
        class203.field2883.method71(-68);
        field2055++;
        if (arg0 != -74) {
            method928(98);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)Lpd;")
    public static final class180 method930(int arg0, int arg1) {
        if (arg1 != 0) {
            field2068 = -102;
        }
        field2051++;
        class180 var2 = (class180) class46.field545.method1567((long) arg0, 8);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class21.field256.method1861(arg0, 5, 1);
        class180 var4 = new class180();
        if (var3 != null) {
            var4.method1176(arg1 + 300, new class216(var3));
        }
        class46.field545.method1568((byte) -53, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)[[I")
    public int[][] method8(byte arg0, int arg1) {
        if (arg0 != 5) {
            this.field2059 = true;
        }
        field2056++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(B)I")
    public int method931(byte arg0) {
        field2070++;
        if (arg0 >= -22) {
            this.field2072 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(B)V")
    public void method31(byte arg0) {
        field2063++;
        if (arg0 >= -109) {
            this.field2059 = false;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBI)I")
    public static final int method932(int arg0, byte arg1, int arg2) {
        field2061++;
        class94 var3 = (class94) class224.field3161.method1895((long) arg0, -108);
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            if (arg1 <= 93) {
                field2064 = 35;
            }
            for (int var5 = 0; var5 < var3.field1255.length; var5++) {
                if (var3.field1260[var5] == arg2) {
                    var4 += var3.field1255[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
    public final void method933(int arg0, int arg1, int arg2) {
        if (arg0 < 74) {
            this.field2059 = false;
        }
        int var4 = this.field2057 == 255 ? arg1 : this.field2057;
        field2071++;
        if (this.field2059) {
            this.field2069 = new class70(var4, arg1, arg2);
        } else {
            this.field2053 = new class236(var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(III)[I")
    public final int[] method934(int arg0, int arg1, int arg2) {
        field2058++;
        if (arg0 != -18877) {
            this.field2059 = false;
        }
        return this.field2072[arg1].field2059 ? this.field2072[arg1].method12(arg2, arg0 + 19132) : this.field2072[arg1].method8((byte) 5, arg2)[0];
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)[I")
    public int[] method12(int arg0, int arg1) {
        if (arg1 == 255) {
            field2067++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(IZ)V")
    public class144(int arg0, boolean arg1) {
        this.field2059 = arg1;
        this.field2072 = new class144[arg0];
    }
}
