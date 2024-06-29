import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class153 extends class125 {

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "Loe;")
    public static class139 field3027 = new class139(64);

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "Ljd;")
    private static class92 field3033 = class202.method1325((byte) 90, "Please check your message)2centre for details)3");

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "Ljd;")
    private static class92 field3036 = class202.method1325((byte) 90, " from your friend list first)3");

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "Ljd;")
    public static class92 field3034 = field3036;

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "Ljd;")
    public static class92 field3041 = field3033;

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "B")
    public byte field3031;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "I")
    public int field3028;

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "Lud;")
    public class192 field3035;

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3032;

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "[I")
    public static int[] field3039;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lla;ILud;B)V")
    public static final void method976(class108 arg0, int arg1, class192 arg2, byte arg3) {
        int var4 = -108 % ((-arg3 - 36) / 35);
        class150 var5 = new class150();
        var5.field2977 = arg2;
        var5.field2975 = arg0;
        var5.field4079 = arg1;
        var5.field2970 = 1;
        field3037++;
        class18 var6 = class189.field3595;
        synchronized (class189.field3595) {
            class189.field3595.method101(var5, (byte) 123);
        }
        class138.method918(false);
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
    public static void method977(int arg0) {
        field3036 = null;
        field3041 = null;
        field3033 = null;
        field3034 = null;
        if (arg0 == 1) {
            field3027 = null;
            field3039 = null;
            field3032 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)Lca;")
    public static final class22 method978(int arg0, int arg1) {
        class22 var2 = (class22) field3027.method930(49, (long) arg0);
        field3040++;
        if (var2 != null) {
            return var2;
        } else if (arg1 > -98) {
            return null;
        } else {
            byte[] var3 = class152.field3022.method899((byte) 87, class90.method599(arg0, (byte) -14), class66.method393(arg0, -126));
            class22 var4 = new class22();
            if (var3 != null) {
                var4.method137(true, new class70(var3));
            }
            var4.method143(false);
            field3027.method927(24744, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
    public static final void method979(boolean arg0) {
        if (!arg0) {
            return;
        }
        field3026++;
        int var1 = class185.field3497.method408((byte) -32, 8);
        if (var1 < class140.field2811) {
            for (int var2 = var1; var2 < class140.field2811; var2++) {
                class146.field2903[class91.field1808++] = class190.field3678[var2];
            }
        }
        if (class140.field2811 < var1) {
            throw new RuntimeException("gppov1");
        }
        class140.field2811 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class190.field3678[var3];
            class91 var5 = class172.field3347[var4];
            int var6 = class185.field3497.method408((byte) -32, 1);
            if (var6 == 0) {
                class190.field3678[class140.field2811++] = var4;
                var5.field244 = class158.field3150;
            } else {
                int var7 = class185.field3497.method408((byte) -32, 2);
                if (var7 == 0) {
                    class190.field3678[class140.field2811++] = var4;
                    var5.field244 = class158.field3150;
                    class135.field2710[class208.field4003++] = var4;
                } else if (var7 == 1) {
                    class190.field3678[class140.field2811++] = var4;
                    var5.field244 = class158.field3150;
                    int var8 = class185.field3497.method408((byte) -32, 3);
                    var5.method32(82, var8, false);
                    int var9 = class185.field3497.method408((byte) -32, 1);
                    if (var9 == 1) {
                        class135.field2710[class208.field4003++] = var4;
                    }
                } else if (var7 == 2) {
                    class190.field3678[class140.field2811++] = var4;
                    var5.field244 = class158.field3150;
                    int var10 = class185.field3497.method408((byte) -32, 3);
                    var5.method32(41, var10, true);
                    int var11 = class185.field3497.method408((byte) -32, 3);
                    var5.method32(109, var11, true);
                    int var12 = class185.field3497.method408((byte) -32, 1);
                    if (var12 == 1) {
                        class135.field2710[class208.field4003++] = var4;
                    }
                } else if (var7 == 3) {
                    class146.field2903[class91.field1808++] = var4;
                }
            }
        }
    }
}
