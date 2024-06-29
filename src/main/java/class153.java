import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class153 extends class67 {

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "[B")
    public byte[] field2958;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "Li;")
    private static class88 field2955 = class208.method1425(105, "To play on this world move to a free area first)3");

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Li;")
    public static class88 field2953 = field2955;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "Lfc;")
    public static class59 field2960 = new class59();

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "Lnb;")
    public static class144 field2957;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "[Li;")
    public static class88[] field2965;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public static void method1043(int arg0) {
        if (arg0 != 27958) {
            return;
        }
        field2957 = null;
        field2965 = null;
        field2955 = null;
        field2960 = null;
        field2953 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIBIIIIIII)V")
    public static final void method1044(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 != -118) {
            method1044(-74, -125, (byte) -117, -93, 43, 68, -105, 23, -100, -95);
        }
        if (arg0 == arg8 && arg4 == arg5 && arg3 == arg9 && arg6 == arg7) {
            class105.method725(arg8, arg6, arg1, arg5, (byte) 107, arg3);
        } else {
            int var10 = arg8;
            int var11 = arg5;
            int var12 = arg8 * 3;
            int var13 = arg5 * 3;
            int var14 = arg7 * 3;
            int var15 = arg4 * 3;
            int var16 = arg9 * 3;
            int var17 = arg0 * 3;
            int var18 = arg6 + var15 - arg5 - var14;
            int var19 = arg3 + var17 - var16 - arg8;
            int var20 = var16 + var12 - var17 - var17;
            int var21 = var14 + var13 - var15 - var15;
            int var22 = var17 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var19 * var26;
                int var28 = var20 * var25;
                int var29 = var22 * var24;
                int var30 = var21 * var25;
                int var31 = var18 * var26;
                int var32 = var23 * var24;
                int var33 = arg8 + (var27 + var28 + var29 >> 12);
                int var34 = (var31 + var30 + var32 >> 12) + arg5;
                class105.method725(var10, var34, arg1, var11, (byte) 114, var33);
                var11 = var34;
                var10 = var33;
            }
        }
        field2959++;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)Luh;")
    public static final class226 method1045(int arg0, int arg1) {
        field2956++;
        class226 var2 = (class226) class108.field1957.method666((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class204.field3885.method941((byte) 56, class71.method473((byte) 44, arg1), class240.method1587(arg0 ^ 0xFFFFC1B3, arg1));
        class226 var4 = new class226();
        if (var3 != null) {
            var4.method1518(new class46(var3), arg0 ^ 0x3E29);
        }
        if (arg0 != 15913) {
            field2965 = null;
        }
        class108.field1957.method664((long) arg1, var4, false);
        return var4;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "([B)V")
    public class153(byte[] arg0) {
        this.field2958 = arg0;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
    public static final void method1046(int arg0) {
        class137.field2535.method671(122);
        class230.field4304.method134(50);
        field2963++;
        if (arg0 != -28151) {
            method1047(null, null, null, (byte) 82);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lnb;Lsb;Lnb;B)V")
    public static final void method1047(class144 arg0, class198 arg1, class144 arg2, byte arg3) {
        class78.field1417 = arg2;
        int var4 = -76 / ((8 - arg3) / 39);
        field2964++;
        class247.field4529 = arg1;
        class36.field633 = arg0;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
    public static final void method1048(boolean arg0) {
        for (int var1 = -1; var1 < class55.field1027; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class174.field3430[var1];
            }
            class44 var6 = class244.field4493[var5];
            if (var6 != null && var6.field4114 > 0) {
                var6.field4114--;
                if (var6.field4114 == 0) {
                    var6.field4073 = null;
                }
            }
        }
        field2961++;
        for (int var2 = 0; var2 < class55.field1041; var2++) {
            int var3 = class25.field402[var2];
            class191 var4 = class225.field4225[var3];
            if (var4 != null && var4.field4114 > 0) {
                var4.field4114--;
                if (var4.field4114 == 0) {
                    var4.field4073 = null;
                }
            }
        }
        if (arg0) {
            method1044(-122, 36, (byte) -127, 27, 98, 113, 76, 120, -37, -22);
        }
    }
}
