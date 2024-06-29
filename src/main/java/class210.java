import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class class210 {

    @OriginalMember(owner = "client!se", name = "c", descriptor = "[Leb;")
    public static class247[] field3154 = new class247[14];

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Z")
    public static boolean field3156 = true;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "[J")
    public static long[] field3155 = new long[1000];

    @OriginalMember(owner = "client!se", name = "g", descriptor = "Lik;")
    public static class267 field3158 = new class267(260);

    @OriginalMember(owner = "client!se", name = "i", descriptor = "Lik;")
    public static class267 field3160 = new class267(30);

    @OriginalMember(owner = "client!se", name = "j", descriptor = "[I")
    public static int[] field3161 = new int[2000];

    @OriginalMember(owner = "client!se", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3163 = null;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Ljava/awt/Frame;")
    public static Frame field3152;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3162;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lfl;Z)Ljava/lang/String;")
    public static final String method1346(class248 arg0, boolean arg1) {
        field3159++;
        if (arg1) {
            method1349((class294) null, (byte) -14);
        }
        return class157.method949(-41, arg0, 32767);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B[B)V")
    public abstract void method812(byte arg0, byte[] arg1);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)[B")
    public abstract byte[] method813(boolean arg0);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public static void method1347(int arg0) {
        field3155 = null;
        if (arg0 != -1) {
            method1349((class294) null, (byte) 94);
        }
        field3160 = null;
        field3158 = null;
        field3154 = null;
        field3162 = null;
        field3152 = null;
        field3163 = null;
        field3161 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lmi;IIZILmi;Z)I")
    public static final int method1348(class266 arg0, int arg1, int arg2, boolean arg3, int arg4, class266 arg5, boolean arg6) {
        field3157++;
        int var7 = class294.method1947(100, arg5, arg4, arg6, arg0);
        if (var7 != 0) {
            return arg6 ? -var7 : var7;
        } else if (arg2 == -1) {
            return 0;
        } else {
            if (arg1 >= -96) {
                method1349((class294) null, (byte) 77);
            }
            int var8 = class294.method1947(100, arg5, arg2, arg3, arg0);
            return arg3 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lpf;B)V")
    public static final void method1349(class294 arg0, byte arg1) {
        class215.field3247 = arg0.method1965("p11_full", -83);
        field3153++;
        class83.field1333 = arg0.method1965("p12_full", -120);
        class13.field176 = arg0.method1965("b12_full", -104);
        class139.field2038 = arg0.method1965("mapfunction", -95);
        class183.field2762 = arg0.method1965("hitmarks", -79);
        if (arg1 != 103) {
            field3162 = null;
        }
        class203.field3062 = arg0.method1965("hitbar_default", -93);
        class59.field948 = arg0.method1965("headicons_pk", -121);
        class63.field986 = arg0.method1965("headicons_prayer", -119);
        class92.field1458 = arg0.method1965("hint_headicons", -114);
        class11.field144 = arg0.method1965("hint_mapmarkers", -77);
        class43.field696 = arg0.method1965("mapflag", arg1 - 216);
        class72.field1158 = arg0.method1965("cross", -121);
        class173.field2625 = arg0.method1965("mapdots", -81);
        class200.field3042 = arg0.method1965("scrollbar", -124);
        class106.field1624 = arg0.method1965("name_icons", arg1 ^ 0xFFFFFFC0);
        class18.field211 = arg0.method1965("floorshadows", arg1 - 193);
        class145.field2121 = arg0.method1965("compass", arg1 - 197);
        class102.field1607 = arg0.method1965("hint_mapedge", -91);
    }
}
