import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class51 {

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "[I")
    public static int[] field745 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field749 = -1;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "Ljava/lang/String;")
    public static String field748 = "Loaded interfaces";

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
    public static final void method379(int arg0) {
        class180.field2818 = null;
        class100.field1675 = null;
        class268.field4272 = null;
        class101.field1695 = null;
        class176.field2759 = null;
        class138.field2114 = null;
        field746++;
        class113.field1852 = null;
        class50.field737 = null;
        class240.field3891 = null;
        if (arg0 != 256) {
            field748 = null;
        }
        class86.field1435 = null;
        class244.field3973 = null;
        class264.field4193 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)Lug;")
    public static final class204 method380(int arg0, int arg1) {
        field744++;
        class204 var2 = (class204) class28.field389.method1887(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class56.field922.method1590(arg1, (byte) -25, arg0);
        class204 var4 = new class204();
        if (var3 != null) {
            var4.method1380(new class88(var3), -2, arg1);
        }
        class28.field389.method1886(arg0 ^ 0xFFFFFFB0, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
    public static void method381(byte arg0) {
        if (arg0 != 111) {
            method382(88, -31, (class32) null, 44, (Component) null);
        }
        field748 = null;
        field745 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILna;ILjava/awt/Component;)Lng;")
    public static final class78 method382(int arg0, int arg1, class32 arg2, int arg3, Component arg4) {
        field747++;
        if (class186.field2873 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class78 var5 = (class78) Class.forName("sf").getDeclaredConstructor().newInstance();
                var5.field1303 = arg0;
                var5.field1281 = new int[(class7.field160 ? 2 : 1) * 256];
                var5.method477(arg4);
                var5.field1298 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field1298 > 16384) {
                    var5.field1298 = 16384;
                }
                var5.method476(var5.field1298);
                if (class296.field4688 > 0 && class102.field1702 == null) {
                    class102.field1702 = new class241();
                    class102.field1702.field3918 = arg2;
                    arg2.method257(class296.field4688, class102.field1702, (byte) -13);
                }
                if (class102.field1702 != null) {
                    if (class102.field1702.field3921[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class102.field1702.field3921[arg1] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class63 var6 = new class63(arg2, arg1);
                    var6.field1281 = new int[(class7.field160 ? 2 : 1) * 256];
                    var6.field1303 = arg0;
                    var6.method477(arg4);
                    var6.field1298 = 16384;
                    var6.method476(var6.field1298);
                    if (~class296.field4688 < arg3 && class102.field1702 == null) {
                        class102.field1702 = new class241();
                        class102.field1702.field3918 = arg2;
                        arg2.method257(class296.field4688, class102.field1702, (byte) -13);
                    }
                    if (class102.field1702 != null) {
                        if (class102.field1702.field3921[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class102.field1702.field3921[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class78();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
