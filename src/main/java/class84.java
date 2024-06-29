import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class84 extends class288 {

    @OriginalMember(owner = "client!kb", name = "qb", descriptor = "Ljava/lang/String;")
    public static String field1185 = "";

    @OriginalMember(owner = "client!kb", name = "rb", descriptor = "[I")
    public static int[] field1186 = new int[500];

    @OriginalMember(owner = "client!kb", name = "lb", descriptor = "I")
    public static int field1180 = 0;

    @OriginalMember(owner = "client!kb", name = "ub", descriptor = "[Ljava/lang/String;")
    public static String[] field1189 = new String[100];

    @OriginalMember(owner = "client!kb", name = "vb", descriptor = "Z")
    public static boolean field1190 = false;

    @OriginalMember(owner = "client!kb", name = "tb", descriptor = "I")
    public static volatile int field1188 = -1;

    @OriginalMember(owner = "client!kb", name = "kb", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!kb", name = "mb", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!kb", name = "nb", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!kb", name = "ob", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!kb", name = "pb", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!kb", name = "sb", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "(I)V")
    public static void method545(int arg0) {
        field1185 = null;
        field1186 = null;
        int var1 = -73 / ((70 - arg0) / 55);
        field1189 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)[[I")
    public final int[][] method73(byte arg0, int arg1) {
        ++field1182;
        int[][] var3 = super.field1627.method104(arg1, (byte) 100);
        if (arg0 != -112) {
            return null;
        } else {
            if (super.field1627.field280 && this.method1925((byte) -121)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int var6 = arg1 % super.field4602 * super.field4602;
                int[] var7 = var3[2];
                for (int var8 = 0; ~class145.field2009 < ~var8; ++var8) {
                    int var9 = super.field4607[var8 % super.field4589 + var6];
                    var7[var8] = class32.method199(var9, 255) << 4;
                    var5[var8] = class32.method199(var9, 65280) >> 4;
                    var4[var8] = class32.method199(16711680, var9) >> 12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field1179;
        if (arg2 >= 45) {
            if (arg7 >= class261.field4204 && arg7 <= class18.field310 && ~class261.field4204 >= ~arg4 && ~arg4 >= ~class18.field310 && ~arg1 <= ~class261.field4204 && ~arg1 >= ~class18.field310 && ~arg3 <= ~class261.field4204 && arg3 <= class18.field310 && ~arg9 <= ~class271.field4322 && arg9 <= class311.field5001 && ~arg0 <= ~class271.field4322 && class311.field5001 >= arg0 && arg8 >= class271.field4322 && class311.field5001 >= arg8 && class271.field4322 <= arg6 && ~class311.field5001 <= ~arg6) {
                class232.method1526(arg5, arg8, 1385066284, arg4, arg6, arg3, arg1, arg0, arg9, arg7);
            } else {
                class284.method1868(arg1, arg9, arg3, arg6, arg4, arg8, arg0, arg5, 0, arg7);
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(B)V")
    public static final void method547(byte arg0) {
        class37.field562.method944(85);
        ++field1187;
        if (arg0 != -108) {
            method547((byte) -12);
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(Z)V")
    public static final void method548(boolean arg0) {
        if (class96.field1379 != null) {
            class245 var1 = class96.field1379;
            synchronized (class96.field1379) {
                class96.field1379 = null;
            }
        }
        if (arg0) {
            field1189 = null;
        }
        ++field1183;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILnh;Lnh;)V")
    public static final void method549(int arg0, class305 arg1, class305 arg2) {
        ++field1184;
        class81.field1121 = arg2;
        class255.field4031 = arg1;
        int var3 = -94 / ((arg0 - -32) / 62);
        int var4 = (int) (Math.random() * 21.0D) - 10;
        class255.field4031.method2067(34, (byte) 51);
        int var5 = -10 + (int) (21.0D * Math.random());
        int var6 = (int) (Math.random() * 21.0D) - 10;
        int var7 = -20 + (int) (Math.random() * 41.0D);
        class226.field3537 = var5 - -var7;
        class107.field1526 = var4 + var7;
        class92.field1353 = var6 + var7;
    }
}
