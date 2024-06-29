import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class661 {

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "[I")
    public static int[] field9310 = new int[13];

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "Lsv;")
    public static class570 field9318 = new class570(86, -1);

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field9319 = 0;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "[I")
    public static int[] field9320 = new int[6];

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "B")
    public byte field9308;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field9311;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field9313;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public int field9316;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field9317;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Ljava/lang/String;")
    public String field9309;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "Ljava/lang/String;")
    public String field9312;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "Ljava/lang/String;")
    public String field9314;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "Ljava/lang/String;")
    public String field9315;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)I", line = 5)
    public static final int method3703(int arg0, int arg1) {
        return class510.field7018 == null ? 0 : class510.field7018[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 12)
    public static void method3704(int arg0) {
        field9310 = null;
        if (arg0 >= -42) {
            field9310 = null;
        }
        field9318 = null;
        field9320 = null;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V", line = 24)
    public static final void method3705(int arg0) {
        field9313++;
        if (arg0 <= 113) {
            method3704(-108);
        }
        int var1 = 0;
        if (class420.field5820 != null) {
            var1 = class420.field5820.field9493.method1486(17539);
        }
        if (var1 == 2) {
            int var2 = class688.field9724 <= 800 ? class688.field9724 : 800;
            int var3 = class668.field9393 <= 600 ? class668.field9393 : 600;
            class728.field10160 = (class688.field9724 - var2) / 2;
            class709.field9923 = var2;
            class424.field5897 = 0;
            class448.field6174 = var3;
        } else if (var1 == 1) {
            int var4 = class688.field9724 > 1024 ? 1024 : class688.field9724;
            class709.field9923 = var4;
            class728.field10160 = (class688.field9724 - var4) / 2;
            int var5 = class668.field9393 > 768 ? 768 : class668.field9393;
            class448.field6174 = var5;
            class424.field5897 = 0;
        } else {
            class448.field6174 = class668.field9393;
            class728.field10160 = 0;
            class709.field9923 = class688.field9724;
            class424.field5897 = 0;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZ)I", line = 80)
    public static final int method3706(int arg0, boolean arg1) {
        field9317++;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        if (arg1) {
            int var6 = var5 | var5 >>> 16;
            return var6 + 1;
        } else {
            return 60;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZI)V", line = 97)
    public static final void method3707(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            class302 var3 = class582.method3419(class678.field9549, (byte) 126, class626.field8901);
            var3.field4341.method2546(true, arg0);
            class501.method2928(0, var3);
        } else {
            class46.method356(class38.field449, arg0, -1);
        }
        field9311++;
        if (arg2 != 2) {
            method3705(-100);
        }
    }
}
