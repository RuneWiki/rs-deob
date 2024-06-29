import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class223 extends class194 {

    @OriginalMember(owner = "client!iq", name = "A", descriptor = "I")
    private int field3098;

    @OriginalMember(owner = "client!iq", name = "v", descriptor = "I")
    private int field3093;

    @OriginalMember(owner = "client!iq", name = "u", descriptor = "I")
    private int field3092;

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
    private int field3083;

    @OriginalMember(owner = "client!iq", name = "y", descriptor = "I")
    private int field3096;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
    private int field3088;

    @OriginalMember(owner = "client!iq", name = "s", descriptor = "I")
    private int field3090;

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
    private int field3087;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "Z")
    public static boolean field3086 = true;

    @OriginalMember(owner = "client!iq", name = "r", descriptor = "I")
    public static int field3089 = 500;

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "Ljava/lang/String;")
    public static String field3097 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!iq", name = "t", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!iq", name = "w", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!iq", name = "x", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!iq", name = "B", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(B)V")
    public static void method1521(byte arg0) {
        field3097 = null;
        if (arg0 != 92) {
            method1521((byte) -2);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(II[B[[B[[BI[I[I)I")
    public static final int method1522(int arg0, int arg1, byte[] arg2, byte[][] arg3, byte[][] arg4, int arg5, int[] arg6, int[] arg7) {
        ++field3082;
        int var8 = arg6[arg0];
        int var9 = arg7[arg0] + var8;
        int var10 = arg6[arg1];
        int var11 = var10 - -arg7[arg1];
        if (arg5 < 24) {
            field3086 = true;
        }
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (~var11 > ~var9) {
            var13 = var11;
        }
        int var14 = arg2[arg0] & 255;
        if (~var14 < ~(255 & arg2[arg1])) {
            var14 = 255 & arg2[arg1];
        }
        byte[] var15 = arg4[arg0];
        byte[] var16 = arg3[arg1];
        int var17 = -var8 + var12;
        int var18 = -var10 + var12;
        for (int var19 = var12; ~var13 < ~var19; ++var19) {
            int var20 = var15[var17++] + var16[var18++];
            if (var14 > var20) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIB)V")
    public final void method593(int arg0, int arg1, byte arg2) {
        ++field3084;
        if (arg2 < 5) {
            this.field3090 = -26;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)Z")
    public static final boolean method1523(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field3095;
            try {
                return class402.method2459((byte) -104);
            } catch (IOException var4) {
                class218.method1491(false);
                return true;
            } catch (Exception var5) {
                String var2 = "T2 - " + class363.field5019 + "," + class213.field2965 + "," + class260.field3510 + " - " + class213.field2961 + "," + (class95.field1379.field5005[0] + class283.field3794) + "," + (class95.field1379.field4998[0] + class296.field3988) + " - ";
                for (int var3 = 0; ~var3 > ~class213.field2961 && ~var3 > -51; ++var3) {
                    var2 = var2 + class417.field5851.field3882[var3] + ",";
                }
                class380.method2365(-2, var2, var5);
                class239.method1589(-105);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)V")
    public final void method594(int arg0, int arg1, int arg2) {
        ++field3099;
        if (arg0 >= -29) {
            this.method593(-123, -5, (byte) 55);
        }
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(III)V")
    public final void method592(int arg0, int arg1, int arg2) {
        ++field3085;
        int var4 = this.field3083 * arg1 >> 12;
        int var5 = this.field3087 * arg2 >> 12;
        int var6 = this.field3096 * arg1 >> 12;
        int var7 = this.field3098 * arg2 >> 12;
        int var8 = this.field3092 * arg1 >> 12;
        int var9 = this.field3088 * arg2 >> 12;
        if (arg0 != 50000) {
            this.field3088 = 42;
        }
        int var10 = this.field3093 * arg1 >> 12;
        int var11 = this.field3090 * arg2 >> 12;
        class118.method940((byte) 52, var9, var5, var8, super.field2788, var10, var4, var11, var6, var7);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIIII)V")
    public static final void method1524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3094;
        int var6 = class359.method2251(class134.field1917, arg3, 110, class39.field595);
        int var7 = class359.method2251(class134.field1917, arg5, -110, class39.field595);
        int var8 = class359.method2251(class69.field1047, arg4, 83, class433.field6144);
        int var9 = class359.method2251(class69.field1047, arg0, 59, class433.field6144);
        if (arg2 <= 39) {
            method1521((byte) -103);
        }
        for (int var10 = var6; var10 <= var7; ++var10) {
            class396.method2436(-1070, arg1, var8, class186.field2697[var10], var9);
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class223(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3098 = arg3;
        this.field3093 = arg6;
        this.field3092 = arg4;
        this.field3083 = arg0;
        this.field3096 = arg2;
        this.field3088 = arg5;
        this.field3090 = arg7;
        this.field3087 = arg1;
    }
}
