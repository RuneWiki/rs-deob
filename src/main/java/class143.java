import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class143 {

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "Z")
    public static boolean field2065 = false;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "[J")
    public static long[] field2068 = new long[100];

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public int field2064;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public int field2066;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public int field2074;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "Lki;")
    public static class158 field2073;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIIIILjk;)V")
    public static final void method970(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class297 arg7) {
        field2071++;
        if (arg3 != 256) {
            method970(-54, 87, -96, 83, 2, -77, 109, (class297) null);
        }
        int var8 = arg2 * arg2 + (arg1 * arg1);
        if (arg6 < var8) {
            return;
        }
        int var9 = Math.min(arg7.field4627 / 2, arg7.field4531 / 2);
        if (var8 <= (var9 * var9)) {
            class111.method802(arg4, arg7, -56, arg2, arg5, arg1, class101.field1481[arg0]);
            return;
        }
        int var10 = (int) class89.field1349 + class96.field1420 & 0x7FF;
        int var11 = class119.field1774[var10];
        int var12 = var11 * 256 / (class258.field3958 + 256);
        int var13 = class119.field1776[var10];
        var9 -= 10;
        int var14 = var13 * 256 / (class258.field3958 + 256);
        int var15 = arg1 * var14 - (arg2 * var12) >> 16;
        int var16 = arg1 * var12 + arg2 * var14 >> 16;
        double var17 = Math.atan2((double) var16, (double) var15);
        int var19 = (int) ((double) var9 * Math.sin(var17));
        int var20 = (int) ((double) var9 * Math.cos(var17));
        ((class289) class3.field41[arg0]).method1223(arg4 - (-(arg7.field4627 / 2) - var19) - 10, arg7.field4531 / 2 + arg5 + -10 + -var20, 20, 20, 15, 15, var17, 256);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public static void method971(int arg0) {
        field2073 = null;
        if (arg0 == -260247600) {
            field2068 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method972(String arg0, int arg1) {
        field2069++;
        String var2 = class3.method45(class37.method286(25077, arg0), -13798);
        if (arg1 == 2) {
            if (var2 == null) {
                var2 = "";
            }
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)Loj;")
    public static final class243 method973(int arg0, int arg1) {
        if (arg1 != -27248) {
            method971(78);
        }
        field2070++;
        class243 var2 = (class243) class23.field375.method945((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class170.field2497.method1605(-124, class45.method357(arg0, 1023), class261.method1771(arg0, false));
        class243 var4 = new class243();
        if (var3 != null) {
            var4.method1657((byte) -90, new class54(var3));
        }
        class23.field375.method941(var4, (long) arg0, -8447);
        return var4;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lpk;I)V")
    public static final void method974(class237 arg0, int arg1) {
        if (arg1 != 20) {
            field2068 = null;
        }
        field2072++;
        class223.field3469 = arg0;
    }
}
