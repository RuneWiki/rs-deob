import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class117 extends class200 {

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
    public static int field2080 = 20;

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "Ldj;")
    private static class44 field2088 = class89.method650(255, "Loading sprites )2 ");

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
    public static int field2085 = 0;

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "Ldj;")
    public static class44 field2089 = field2088;

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "I")
    public int field2081;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "I")
    public int field2082;

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "I")
    public int field2083;

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!kh", name = "W", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!kh", name = "bb", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!kh", name = "cb", descriptor = "I")
    public int field2098;

    @OriginalMember(owner = "client!kh", name = "Z", descriptor = "Ldj;")
    public class44 field2095;

    @OriginalMember(owner = "client!kh", name = "Y", descriptor = "Lei;")
    public static class54 field2094;

    @OriginalMember(owner = "client!kh", name = "V", descriptor = "[I")
    public int[] field2091;

    @OriginalMember(owner = "client!kh", name = "ab", descriptor = "[I")
    public int[] field2096;

    @OriginalMember(owner = "client!kh", name = "X", descriptor = "[Ll;")
    public class120[] field2093;

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "[Ldj;")
    public class44[] field2084;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(IIIII)V")
    public static final void method819(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2097++;
        if (arg3 - arg0 >= class70.field1337 && arg0 + arg3 <= class70.field1321 && arg1 - arg0 >= class14.field267 && class57.field1068 >= arg1 + arg0) {
            class220.method1421(arg3, arg4, arg1, arg2 ^ 0xFFFFFFFE, arg0);
        } else {
            class200.method1293(14, arg3, arg1, arg4, arg0);
        }
        if (arg2 != -2) {
            method822(null, -73, 99, -25);
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)V")
    public static void method820(byte arg0) {
        field2088 = null;
        field2094 = null;
        field2089 = null;
        if (arg0 != 12) {
            method822(null, -69, -49, -63);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lvc;I)I")
    public static final int method821(class223 arg0, int arg1) {
        field2087++;
        class222 var2 = (class222) class163.field2814.method828(((long) arg0.field4040 << 32) + ((long) arg0.field4085), (byte) -40);
        if (var2 == null) {
            if (arg1 != 21064) {
                method822(null, 73, 39, -15);
            }
            return arg0.field4149;
        } else {
            return var2.field4014;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "([BIII)Z")
    public static final boolean method822(byte[] arg0, int arg1, int arg2, int arg3) {
        field2090++;
        boolean var4 = true;
        class66 var5 = new class66(arg0);
        if (arg1 != 0) {
            return true;
        }
        int var6 = -1;
        label72: while (true) {
            int var7 = var5.method517(false);
            if (var7 == 0) {
                return var4;
            }
            int var8 = 0;
            var6 += var7;
            boolean var9 = false;
            while (true) {
                int var13;
                class39 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method530((byte) -82);
                                        if (var17 == 0) {
                                            continue label72;
                                        }
                                        var5.method506(255);
                                    }
                                    int var10 = var5.method530((byte) -54);
                                    if (var10 == 0) {
                                        continue label72;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    int var12 = var8 >> 6 & 0x3F;
                                    var13 = var5.method506(arg1 + 255) >> 2;
                                    var14 = var11 + arg3;
                                    var15 = arg2 + var12;
                                } while (var15 <= 0);
                            } while (var14 <= 0);
                        } while (var15 >= 103);
                    } while (var14 >= 103);
                    var16 = class40.method281(true, var6);
                } while (var13 == 22 && class33.field583 && var16.field739 == 0 && var16.field706 != 1 && !var16.field684);
                var9 = true;
                if (!var16.method273((byte) 66)) {
                    var4 = false;
                    class145.field2560++;
                }
            }
        }
    }
}
