import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class139 implements class297 {

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field1999 = -1;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field2004 = 0;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1996 = "shake:";

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(JI[II)Ljava/lang/String;", line = 8)
    public final String method975(long arg0, int arg1, int[] arg2, int arg3) {
        field2003++;
        if (arg3 == 0) {
            class76 var6 = class315.method2197(arg2[0], 95);
            return var6.method622((byte) -50, (int) arg0);
        } else if (arg3 == 1 || arg3 == 10) {
            class122 var7 = class175.method1228((byte) 54, (int) arg0);
            return var7.field1742;
        } else if (arg3 == 6 || arg3 == 7 || arg3 == 11) {
            return class315.method2197(arg2[0], 13).method622((byte) -40, (int) arg0);
        } else if (arg1 == 256) {
            return null;
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)V", line = 43)
    public static final void method976(byte arg0, int arg1) {
        class38.field561.method464(3398, arg1);
        field2000++;
        int var2 = -88 / ((40 - arg0) / 58);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 58)
    public static final int method977(String arg0, int arg1) {
        field2001++;
        if (arg1 <= 114) {
            return -92;
        }
        int var2 = 0;
        int var3 = arg0.length();
        for (int var4 = 0; var4 < var3; var4++) {
            var2 = (var2 << 5) - (var2 - class296.method2108(arg0.charAt(var4), (byte) 22));
        }
        return var2;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V", line = 80)
    public static void method978(boolean arg0) {
        if (!arg0) {
            method977((String) null, 77);
        }
        field1996 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)I", line = 99)
    public static final int method979(int arg0, int arg1) {
        field1995++;
        if (arg0 < 0) {
            return 0;
        }
        class206 var2 = (class206) class135.field1968.method1405((long) arg0, false);
        if (var2 == null) {
            return class68.method554(arg0, arg1 ^ 0xFFFFFFC6).field4455;
        }
        int var3 = arg1;
        for (int var4 = 0; var4 < var2.field3008.length; var4++) {
            if (var2.field3008[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class68.method554(arg0, 103).field4455 - var2.field3008.length);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BII)V", line = 131)
    public static final void method980(byte arg0, int arg1, int arg2) {
        field1998++;
        if (arg0 <= 18) {
            field2004 = -71;
        }
        if (class130.field1880 > 0) {
            class52.method437(-49, class130.field1880);
            class130.field1880 = 0;
        }
        short var3 = 256;
        int var4 = class44.field623 * arg2;
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 1; var7 < (var3 - 1); var7++) {
            int var8 = (var3 - var7) * client.field636[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var5 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class44.field624[var4++ + arg1];
                int var11 = class267.field4071[var5++];
                if (var11 == 0) {
                    class257.field3846.field1665[var6++] = var10;
                } else {
                    int var12 = var11 + 18;
                    int var13 = 256 - var11 - 18;
                    int var14 = class349.field5395[var11];
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    class257.field3846.field1665[var6++] = class287.method2076(var12 * class287.method2076(var14, 16711935) + var13 * class287.method2076(16711935, var10), -16711936) + class287.method2076(16711680, var13 * class287.method2076(var10, 65280) + var12 * class287.method2076(var14, 65280)) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class257.field3846.field1665[var6++] = class44.field624[var4++ + arg1];
            }
            var4 += class44.field623 - 128;
        }
        if (class141.field2031) {
            class205.method1497(class257.field3846.field1665, arg1, arg2, class257.field3846.field2536, class257.field3846.field2553);
        } else {
            class257.field3846.method640(arg1, arg2);
        }
    }
}
