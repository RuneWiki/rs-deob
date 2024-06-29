import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class162 {

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "[I")
    private int[] field2927;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Lmb;")
    public static class132 field2928 = class166.method1092("l", 120);

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "Lmb;")
    public static class132 field2929 = class166.method1092(" weitere Optionen", 126);

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "Lmb;")
    public static class132 field2931 = class166.method1092(")1 ", 116);

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "Lmb;")
    private static class132 field2933 = class166.method1092("Loading textures )2 ", 127);

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "Lmb;")
    public static class132 field2939 = field2933;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2935 = new CRC32();

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "[I")
    public static int[] field2940 = new int[500];

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "Lkd;")
    public static class112 field2941 = new class112(8);

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "Lmb;")
    public static class132 field2942 = class166.method1092("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", 122);

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "Lmb;")
    public static class132 field2943 = class166.method1092("<col=ff0000>", 111);

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIBIII)V")
    public static final void method1046(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var8 = arg3 + 1;
        class23.method153(arg0, class61.field1033[arg3], true, arg1, arg4);
        field2936++;
        int var9 = arg5 - 1;
        class23.method153(arg0, class61.field1033[arg5], true, arg1, arg4);
        int var6 = var8;
        if (arg2 != 84) {
            method1049(null, (byte) -9, null);
        }
        while (var6 <= var9) {
            int[] var7 = class61.field1033[var6];
            var7[arg1] = var7[arg4] = arg0;
            var6++;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)I")
    public final int method1047(int arg0, int arg1) {
        if (arg1 > -95) {
            method1051(true, (byte) 75, false);
        }
        field2932++;
        int var3 = (this.field2927.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field2927[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field2927[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILpb;BI)[Lbf;")
    public static final class18[] method1048(int arg0, class165 arg1, byte arg2, int arg3) {
        field2937++;
        if (class172.method1122(arg3, arg1, arg0, true)) {
            if (arg2 != 92) {
                field2935 = null;
            }
            return class140.method942(-126);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lpb;BLpb;)V")
    public static final void method1049(class165 arg0, byte arg1, class165 arg2) {
        class26.field422 = arg0;
        int var3 = -84 % ((arg1 + 7) / 53);
        field2934++;
        class157.field2854 = arg2;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
    public static void method1050(byte arg0) {
        field2929 = null;
        field2942 = null;
        field2943 = null;
        field2928 = null;
        field2941 = null;
        field2940 = null;
        field2931 = null;
        if (arg0 <= 59) {
            field2940 = null;
        }
        field2933 = null;
        field2939 = null;
        field2935 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZBZ)I")
    public static final int method1051(boolean arg0, byte arg1, boolean arg2) {
        if (arg1 >= -66) {
            return 44;
        }
        int var3 = 0;
        field2930++;
        if (arg0) {
            var3 += class200.field3689 + class105.field1960;
        }
        if (arg2) {
            var3 += class55.field923 + class34.field558;
        }
        return var3;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "([I)V")
    public class162(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field2927 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2927[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field2927[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field2927[var5 + var5] = arg0[var4];
            this.field2927[var5 + var5 + 1] = var4++;
        }
    }
}
