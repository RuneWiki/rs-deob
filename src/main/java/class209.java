import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class209 extends RuntimeException {

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3009;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "Ljava/lang/String;")
    public String field3008;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field3011 = 0;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field3012 = 0;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field3010 = new String[8];

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field3015 = 255;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "[I")
    public static int[] field3013 = new int[14];

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "Lid;")
    public static class226 field3014;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
    public static void method1338(byte arg0) {
        field3013 = null;
        field3010 = null;
        field3014 = null;
        if (arg0 != -102) {
            method1340((byte) -35);
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class209(Throwable arg0, String arg1) {
        this.field3009 = arg0;
        this.field3008 = arg1;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIII)V")
    public static final void method1339(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3007++;
        if (arg3 < 34) {
            field3011 = -96;
        }
        class55.field839 = arg0;
        class89.field1362 = arg4;
        class135.field1960 = arg1;
        class179.field2549 = arg5;
        class259.field3921 = arg2;
        if (class55.field839 >= 100) {
            int var6 = class89.field1362 * 128 + 64;
            int var7 = class135.field1960 * 128 + 64;
            int var8 = class81.method542(var6, -1, class163.field2364, var7) - class259.field3921;
            int var9 = var7 - class223.field3341;
            int var10 = var6 - class89.field1355;
            int var11 = var8 - class169.field2442;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var10 * var10));
            class146.field2097 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 0x7FF;
            class30.field439 = (int) (Math.atan2((double) var10, (double) var9) * -325.949D) & 0x7FF;
            if (class146.field2097 < 128) {
                class146.field2097 = 128;
            }
            if (class146.field2097 > 383) {
                class146.field2097 = 383;
            }
        }
        class68.field1069 = 2;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)V")
    public static final void method1340(byte arg0) {
        field3006++;
        int var1 = class221.method1425(arg0 ^ 0x2);
        if (arg0 != 0) {
            field3013 = null;
        }
        if (var1 == 0) {
            class10.field175 = null;
            class79.method525((byte) -35, 0);
        } else if (var1 == 1) {
            class214.method1372((byte) 0, -128);
            class79.method525((byte) 92, 512);
            class285.method1922(-105);
        } else {
            class214.method1372((byte) (class166.field2422 - 4 & 0xFF), arg0 ^ 0xFFFFFF80);
            class79.method525((byte) -122, 2);
        }
    }
}
