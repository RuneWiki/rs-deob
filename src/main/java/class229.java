import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class229 {

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field3922 = 0;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field3923 = 0;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public static int field3926 = 0;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "Ldg;")
    public static class90 field3921;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)V")
    public static final void method1499(int arg0, int arg1) {
        field3928++;
        class196 var2 = (class196) class254.field4435.method1424(true, (long) arg1);
        if (var2 != null) {
            for (int var3 = arg0; var3 < var2.field3420.length; var3++) {
                var2.field3420[var3] = -1;
                var2.field3418[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V")
    public static final void method1500(boolean arg0) {
        field3929++;
        class141.field2275.method541(63, 108);
        if (arg0) {
            class141.field2275.method1511(false, 0L);
            class4.field82++;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
    public static void method1501(byte arg0) {
        field3921 = null;
        if (arg0 < 24) {
            field3922 = 108;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BI)I")
    public static final int method1502(byte arg0, int arg1) {
        if (arg0 != -74) {
            field3922 = -40;
        }
        field3925++;
        return (arg1 & 0x1F862) >> 11;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "([Lo;II)V")
    public static final void method1503(class175[] arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            return;
        }
        field3924++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class175 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field3069 == 0) {
                    if (var4.field3066 != null) {
                        method1503(var4.field3066, 1, arg2);
                    }
                    class228 var5 = (class228) class165.field2807.method1424(true, (long) var4.field2987);
                    if (var5 != null) {
                        class51.method380(arg2, arg1, var5.field3913);
                    }
                }
                if (arg2 == 0 && var4.field2978 != null) {
                    class94 var6 = new class94();
                    var6.field1488 = var4;
                    var6.field1489 = var4.field2978;
                    class27.method225(var6, (byte) 120);
                }
                if (arg2 == 1 && var4.field2977 != null) {
                    if (var4.field2934 >= 0) {
                        class175 var7 = class52.method394(var4.field2987, false);
                        if (var7 == null || var7.field3066 == null || var7.field3066.length <= var4.field2934 || var7.field3066[var4.field2934] != var4) {
                            continue;
                        }
                    }
                    class94 var8 = new class94();
                    var8.field1489 = var4.field2977;
                    var8.field1488 = var4;
                    class27.method225(var8, (byte) 120);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)Lwh;")
    public static final class200 method1504(int arg0) {
        field3927++;
        try {
            return arg0 == 1 ? (class200) Class.forName("te").getDeclaredConstructor().newInstance() : null;
        } catch (Throwable var1) {
            return null;
        }
    }
}
