import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public abstract class class36 {

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "[Ljava/awt/Color;")
    public static Color[] field619 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BII)Z")
    public static final boolean method423(byte arg0, int arg1, int arg2) {
        field621++;
        int var3 = -83 / ((arg0 - 3) / 42);
        return (arg1 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public static final void method424(byte arg0) {
        field617++;
        class697 var1 = (class697) class302.field4494.method472((byte) -113);
        if (arg0 != 5) {
            return;
        }
        while (var1 != null) {
            if (var1.field9862 > 0) {
                var1.field9862--;
            }
            if (var1.field9862 != 0) {
                if (var1.field9873 > 0) {
                    var1.field9873--;
                }
                if (var1.field9873 == 0 && var1.field9870 >= 1 && var1.field9874 >= 1 && var1.field9870 <= (class199.field2812 - 2) && var1.field9874 <= class232.field3611 - 2 && (var1.field9869 < 0 || class157.method1091(var1.field9869, var1.field9861, true))) {
                    class162.method1115(var1.field9874, var1.field9861, var1.field9859, -1, var1.field9870, var1.field9869, var1.field9872, (byte) 125, var1.field9863);
                    var1.field9873 = -1;
                    if (var1.field9869 == var1.field9866 && var1.field9866 == -1) {
                        var1.method3678(-1);
                    } else if (var1.field9869 == var1.field9866 && var1.field9863 == var1.field9857 && var1.field9861 == var1.field9860) {
                        var1.method3678(arg0 ^ 0xFFFFFFFA);
                    }
                }
            } else if (var1.field9866 < 0 || class157.method1091(var1.field9866, var1.field9860, true)) {
                class162.method1115(var1.field9874, var1.field9860, var1.field9859, -1, var1.field9870, var1.field9866, var1.field9872, (byte) 122, var1.field9857);
                var1.method3678(-1);
            }
            var1 = (class697) class302.field4494.method482(115);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILjava/lang/String;[BB)I")
    public static final int method425(int arg0, String arg1, byte[] arg2, byte arg3) {
        field618++;
        int var4 = arg1.length();
        int var5 = arg0;
        int var6 = 119 % ((72 - arg3) / 45);
        for (int var7 = 0; var7 < var4; var7++) {
            char var8 = arg1.charAt(var7);
            if (var8 <= '\u007F') {
                arg2[var5++] = (byte) var8;
            } else if (var8 > '߿') {
                arg2[var5++] = (byte) class486.method2826(224, var8 >> 12);
                arg2[var5++] = (byte) class486.method2826(128, class689.method3797(var8, 4037) >> 6);
                arg2[var5++] = (byte) class486.method2826(class689.method3797(63, var8), 128);
            } else {
                arg2[var5++] = (byte) class486.method2826(var8 >> 6, 192);
                arg2[var5++] = (byte) class486.method2826(128, class689.method3797(var8, 63));
            }
        }
        return var5 - arg0;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)J")
    public abstract long method426(boolean arg0);

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Z)V")
    public static final void method427(boolean arg0) {
        if (class420.field6113 == 9) {
            class112.method868(5, (byte) -119);
        } else if (class420.field6113 == 5 || class420.field6113 == 6) {
            class112.method868(3, (byte) 85);
        } else if (class420.field6113 == 12) {
            class112.method868(3, (byte) 96);
        }
        if (!arg0) {
            field620++;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V")
    public static void method428(byte arg0) {
        field619 = null;
        int var1 = -71 % ((arg0 - 16) / 45);
    }
}
