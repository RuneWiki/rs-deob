import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class191 {

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "[Lok;")
    public static class146[] field3151 = new class146[1000];

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "Lok;")
    public static class146 field3159 = class235.method1724(-12908, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "[I")
    public static int[] field3162 = new int[4096];

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "Lok;")
    private static class146 field3165 = class235.method1724(-12908, "M");

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "Lok;")
    public static class146 field3163 = field3165;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field3164 = 0;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "Lok;")
    public static class146 field3158 = field3165;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public int field3154;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public int field3157;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public int field3161;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIII)V", line = 7)
    public static final void method1470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class151.field2564 <= arg4 && arg3 <= class126.field2058 && class123.field2008 <= arg2 && class318.field5394 >= arg1) {
            class216.method1606(arg2, arg1, arg5, arg4, (byte) -116, arg3);
        } else {
            class218.method1612(arg4, arg1, 0, arg5, arg2, arg3);
        }
        field3155++;
        if (arg0 > -58) {
            field3163 = (class146) null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)Z", line = 27)
    public final boolean method1471(int arg0) {
        if (arg0 == -18313) {
            field3166++;
            return (this.field3157 & 0x2) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILoh;)V", line = 38)
    public static final void method1472(int arg0, class15 arg1) {
        class114.field1839 = class85.method594((byte) -120, class211.field3486, arg1);
        field3153++;
        class313.field5347 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var3 = (float) ((class200.field3346[var2] & 0xFF0000) >> 16);
            int var4 = (class200.field3346[var2 + 1] & 0xFF0000) >> 16;
            float var5 = (float) ((class200.field3346[var2] & 0xFF00) >> 8);
            float var6 = ((float) var4 - var3) / 64.0F;
            int var7 = class200.field3346[var2 + 1] >> 8 & 0xFF;
            float var8 = (float) (class200.field3346[var2] & 0xFF);
            float var9 = ((float) var7 - var5) / 64.0F;
            int var10 = class200.field3346[var2 + 1] & 0xFF;
            float var11 = ((float) var10 - var8) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class313.field5347[var2 * 64 + var12] = class138.method1013((int) var8, class138.method1013((int) var3 << 16, (int) var5 << 8));
                var3 += var6;
                var8 += var11;
                var5 += var9;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class313.field5347[var13] = class200.field3346[3];
        }
        if (arg0 != -1598071512) {
            field3163 = (class146) null;
        }
        class224.field3724 = new int[32768];
        class234.field3918 = new int[32768];
        class224.method1657((class315) null, (byte) 126);
        class73.field1198 = new int[32768];
        class100.field1612 = new int[32768];
        class319.field5458 = new class307(128, 254);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)Z", line = 106)
    public final boolean method1473(int arg0) {
        if (arg0 != 3) {
            this.method1471(91);
        }
        field3160++;
        return (this.field3157 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V", line = 117)
    public static void method1474(int arg0) {
        field3159 = null;
        field3151 = null;
        field3158 = null;
        field3162 = null;
        field3165 = null;
        field3163 = null;
        if (arg0 != -1) {
            field3151 = (class146[]) null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)Z", line = 132)
    public final boolean method1475(int arg0) {
        field3167++;
        if (arg0 == 0) {
            return (this.field3157 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)Z", line = 181)
    public final boolean method1476(int arg0) {
        field3156++;
        if (arg0 == 1) {
            return (this.field3157 & 0x4) != 0;
        } else {
            return false;
        }
    }
}
