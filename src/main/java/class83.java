import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class83 extends class14 {

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "Lea;")
    public class38 field1957 = class112.field2500;

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "I")
    public int field1960 = 0;

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "Lea;")
    private static class38 field1958 = class9.method46((byte) 125, " is already on your friend list)3");

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "Lea;")
    public static class38 field1956 = field1958;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "Lea;")
    public static class38 field1962 = class9.method46((byte) 103, "sl_button");

    @OriginalMember(owner = "client!jc", name = "W", descriptor = "[I")
    public static int[] field1965 = new int[50];

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "I")
    public static int field1961 = 0;

    @OriginalMember(owner = "client!jc", name = "bb", descriptor = "Ljava/lang/Object;")
    public static Object field1970 = new Object();

    @OriginalMember(owner = "client!jc", name = "eb", descriptor = "[I")
    public static int[] field1973 = new int[32];

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
    public int field1952;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
    public int field1964;

    @OriginalMember(owner = "client!jc", name = "X", descriptor = "I")
    public int field1966;

    @OriginalMember(owner = "client!jc", name = "ab", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!jc", name = "cb", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!jc", name = "db", descriptor = "Z")
    public static boolean field1972;

    @OriginalMember(owner = "client!jc", name = "fb", descriptor = "Z")
    public static boolean field1974;

    @OriginalMember(owner = "client!jc", name = "Y", descriptor = "[I")
    public int[] field1967;

    @OriginalMember(owner = "client!jc", name = "Z", descriptor = "[I")
    public int[] field1968;

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "[Lea;")
    public class38[] field1959;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "(I)V")
    public static void method705(int arg0) {
        field1965 = null;
        field1956 = null;
        if (arg0 != 50) {
            method707(-67, -57, 37, (byte) 126);
        }
        field1970 = null;
        field1973 = null;
        field1958 = null;
        field1962 = null;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(IIII)Z")
    public static final boolean method706(int arg0, int arg1, int arg2, int arg3) {
        field1955++;
        int var4 = class101.field2268.method1136(class10.field224, arg1, arg2, arg0);
        int var5 = arg0 >> 14 & 0x7FFF;
        if (~var4 == arg3) {
            return false;
        }
        int var6 = var4 >> 6 & 0x3;
        int var7 = var4 & 0x1F;
        if (var7 == 10 || var7 == 11 || var7 == 22) {
            class106 var8 = class70.method553(var5, 28067);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field2393;
                var10 = var8.field2405;
            } else {
                var9 = var8.field2405;
                var10 = var8.field2393;
            }
            int var11 = var8.field2370;
            if (var6 != 0) {
                var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
            }
            class14.method81(class195.field3842.field409[0], var11, arg1, class195.field3842.field391[0], true, 2, 0, var10, 0, arg2, 0, var9);
        } else {
            class14.method81(class195.field3842.field409[0], 0, arg1, class195.field3842.field391[0], true, 2, var7 + 1, 0, var6, arg2, 0, 0);
        }
        class50.field1250 = 2;
        class70.field1743 = 0;
        class68.field1719 = class105.field2345;
        class39.field846 = class87.field2029;
        return true;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIB)V")
    public static final void method707(int arg0, int arg1, int arg2, byte arg3) {
        field1963++;
        if (arg1 < 128 || arg2 < 128 || arg1 > 13056 || arg2 > 13056) {
            class195.field3840 = -1;
            class66.field1579 = -1;
            return;
        }
        int var4 = class38.method257(class10.field224, -169496123, arg2, arg1) - arg0;
        int var5 = var4 - class203.field4008;
        int var6 = class93.field2091[class144.field2998];
        int var7 = arg1 - class50.field1243;
        int var8 = arg2 - class42.field925;
        int var9 = class93.field2091[class123.field2654];
        int var10 = class93.field2110[class144.field2998];
        int var11 = class93.field2110[class123.field2654];
        int var12 = var7 * var11 + var8 * var9 >> 16;
        int var13 = var8 * var11 - var7 * var9 >> 16;
        int var15 = var5 * var10 - var6 * var13 >> 16;
        int var16 = var5 * var6 + var10 * var13 >> 16;
        if (arg3 > -91) {
            method706(-59, -20, -24, 24);
        }
        if (var16 < 50) {
            class66.field1579 = -1;
            class195.field3840 = -1;
        } else {
            class66.field1579 = (var15 << 9) / var16 + 167;
            class195.field3840 = (var12 << 9) / var16 + 256;
        }
    }

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "(I)V")
    public static final void method708(int arg0) {
        field1954++;
        if (class113.field2515 != null) {
            class113.field2515.method366((byte) -128);
        }
        if (arg0 != 17242) {
            field1972 = false;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILhc;)V")
    public final void method709(int arg0, class66 arg1) {
        field1953++;
        while (true) {
            int var3 = arg1.method509(125);
            if (var3 == 0) {
                if (arg0 == 15) {
                    return;
                } else {
                    this.field1964 = 57;
                    return;
                }
            }
            this.method710(var3, (byte) -111, arg1);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBLhc;)V")
    private final void method710(int arg0, byte arg1, class66 arg2) {
        if (arg0 == 1) {
            this.field1952 = arg2.method509(121);
        } else if (arg0 == 2) {
            this.field1966 = arg2.method509(118);
        } else if (arg0 == 3) {
            this.field1957 = arg2.method475((byte) 85);
        } else if (arg0 == 4) {
            this.field1964 = arg2.method464(-56);
        } else if (arg0 == 5) {
            this.field1960 = arg2.method511(-123);
            this.field1967 = new int[this.field1960];
            this.field1959 = new class38[this.field1960];
            for (int var5 = 0; var5 < this.field1960; var5++) {
                this.field1967[var5] = arg2.method464(-31);
                this.field1959[var5] = arg2.method475((byte) -61);
            }
        } else if (arg0 == 6) {
            this.field1960 = arg2.method511(54);
            this.field1967 = new int[this.field1960];
            this.field1968 = new int[this.field1960];
            for (int var4 = 0; var4 < this.field1960; var4++) {
                this.field1967[var4] = arg2.method464(-70);
                this.field1968[var4] = arg2.method464(-73);
            }
        }
        field1971++;
        if (arg1 >= -56) {
            method706(-33, -52, 126, -21);
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1973[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
