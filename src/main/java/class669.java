import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class669 {

    @OriginalMember(owner = "client!naa", name = "j", descriptor = "I")
    public int field9512 = -1;

    @OriginalMember(owner = "client!naa", name = "l", descriptor = "I")
    public static int field9514 = -1;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "I")
    public static int field9503;

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "I")
    public int field9504;

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "I")
    public static int field9505;

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "I")
    public int field9506;

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "I")
    public int field9507;

    @OriginalMember(owner = "client!naa", name = "f", descriptor = "I")
    public int field9508;

    @OriginalMember(owner = "client!naa", name = "g", descriptor = "I")
    public static int field9509;

    @OriginalMember(owner = "client!naa", name = "h", descriptor = "I")
    public int field9510;

    @OriginalMember(owner = "client!naa", name = "i", descriptor = "I")
    public int field9511;

    @OriginalMember(owner = "client!naa", name = "k", descriptor = "I")
    public int field9513;

    @OriginalMember(owner = "client!naa", name = "m", descriptor = "I")
    public static int field9515;

    @OriginalMember(owner = "client!naa", name = "n", descriptor = "I")
    public static int field9516;

    @OriginalMember(owner = "client!naa", name = "o", descriptor = "I")
    public int field9517;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(III)Z")
    public static final boolean method3799(int arg0, int arg1, int arg2) {
        if (arg2 > -87) {
            field9514 = 109;
        }
        field9505++;
        return (arg1 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)V")
    public static final void method3800(byte arg0) {
        if (class594.method3301((byte) 33, class576.field7861) || class367.method2128(arg0 + 65362, class576.field7861)) {
            class262.method1580(5000, class147.field1980 >> 12, class82.field946 >> 12, 1);
        } else {
            int var1 = class408.field5369.field3088[0] >> 3;
            int var2 = class408.field5369.field3086[0] >> 3;
            if (var1 >= 0 && class703.field9886 >> 3 > var1 && var2 >= 0 && (class431.field5789 >> 3) > var2) {
                class262.method1580(5000, var2, var1, 1);
            } else {
                class262.method1580(0, class431.field5789 >> 4, class703.field9886 >> 4, 1);
            }
        }
        field9516++;
        class276.method1657(1553501896);
        class287.method1700(1);
        class104.method576(false);
        class593.method3283((byte) 62);
        if (arg0 != -82) {
            method3801((byte) -92, false);
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(BZ)V")
    public static final void method3801(byte arg0, boolean arg1) {
        field9515++;
        if (class163.field2346 != null) {
            class163.field2346.method1164(60);
            class163.field2346 = null;
        }
        class420.field5513 = 0;
        class80.method430((byte) 104);
        class180.method1206();
        for (int var2 = 0; var2 < 4; var2++) {
            class322.field4302[var2].method3281(0);
        }
        if (arg0 < 93) {
            method3803(null, 123);
        }
        class551.method3082((byte) 109, false);
        System.gc();
        class382.method2188(2, -1);
        class275.field3659 = -1;
        class33.field460 = false;
        class547.method3065((byte) 113, true);
        class125.field1745 = 0;
        class523.field7257 = 0;
        class312.field4205 = 0;
        class4.field23 = 0;
        class391.field5236 = 0;
        class71.field843 = 0;
        for (int var3 = 0; var3 < class121.field1575.length; var3++) {
            class121.field1575[var3] = null;
        }
        class640.method3542((byte) 112);
        for (int var4 = 0; var4 < 2048; var4++) {
            class513.field7145[var4] = null;
        }
        class289.field3820 = 0;
        class296.field3921.method3063((byte) -33);
        class468.field6163 = 0;
        class290.field3835.method3063((byte) -94);
        class649.method3602((byte) -115);
        class460.field6025 = 0;
        class564.field7696.method89(-126);
        class601.method3343(-1);
        class148.method844(true);
        class647.field8939 = 0L;
        class506.field6984 = null;
        if (arg1) {
            class28.method182(12, 29697);
            return;
        }
        class28.method182(3, 29697);
        try {
            class507.method2883(class516.field7178, -4200, "loggedout");
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method3802(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg3 < 1) {
            arg3 = 1;
        }
        field9503++;
        if (arg2 < 1) {
            arg2 = 1;
        }
        int var6 = arg2 - 334;
        if (arg4 < 53) {
            return;
        }
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class598.field8226 - class627.field8684) * var6 / 100 + class627.field8684;
        if (var7 < class618.field8582) {
            var7 = class618.field8582;
        } else if (var7 > class516.field7169) {
            var7 = class516.field7169;
        }
        int var8 = var7 * 512 * arg2 / (arg3 * 334);
        if (var8 < class425.field5730) {
            short var9 = class425.field5730;
            var7 = var9 * 334 * arg3 / (arg2 * 512);
            if (var7 > class516.field7169) {
                var7 = class516.field7169;
                int var10 = var7 * 512 * arg2 / (var9 * 334);
                int var11 = (arg3 - var10) / 2;
                if (arg5) {
                    class146.field1963.method1044();
                    class146.field1963.method3118(true, arg2, arg1, arg0, var11, -16777216);
                    class146.field1963.method3118(true, arg2, arg1 + arg3 - var11, arg0, var11, -16777216);
                }
                arg3 -= var11 * 2;
                arg1 += var11;
            }
        } else if (class385.field5147 < var8) {
            short var12 = class385.field5147;
            var7 = arg3 * 334 * var12 / (arg2 * 512);
            if (class618.field8582 > var7) {
                var7 = class618.field8582;
                int var13 = var12 * 334 * arg3 / (var7 * 512);
                int var14 = (arg2 - var13) / 2;
                if (arg5) {
                    class146.field1963.method1044();
                    class146.field1963.method3118(true, var14, arg1, arg0, arg3, -16777216);
                    class146.field1963.method3118(true, var14, arg1, arg0 + arg2 - var14, arg3, -16777216);
                }
                arg0 += var14;
                arg2 -= var14 * 2;
            }
        }
        class549.field7508 = arg1;
        class276.field3663 = arg0;
        class96.field1161 = (short) arg3;
        class520.field7209 = (short) arg2;
        class15.field190 = arg2 * var7 / 334;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method3803(String arg0, int arg1) {
        if (arg1 != -101) {
            field9514 = -29;
        }
        field9509++;
        class291.field3850 = arg0;
        if (class516.field7178 == null) {
            return;
        }
        try {
            String var2 = class516.field7178.getParameter("cookieprefix");
            String var3 = class516.field7178.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class340.method1985(class529.method2982((byte) -69) + 94608000000L, true) + "; Max-Age=" + 94608000L;
            }
            class507.method2881(class516.field7178, -128, "document.cookie=\"" + var5 + "\"");
        } catch (Throwable var6) {
        }
    }
}
