import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class57 extends class36 {

    @OriginalMember(owner = "client!nr", name = "y", descriptor = "[I")
    public static int[] field1058 = new int[2];

    @OriginalMember(owner = "client!nr", name = "A", descriptor = "I")
    public static int field1060 = 0;

    @OriginalMember(owner = "client!nr", name = "E", descriptor = "I")
    public static int field1064 = 765;

    @OriginalMember(owner = "client!nr", name = "D", descriptor = "I")
    public static int field1063 = -60;

    @OriginalMember(owner = "client!nr", name = "z", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!nr", name = "B", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!nr", name = "C", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!nr", name = "F", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!nr", name = "H", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!nr", name = "G", descriptor = "Lkd;")
    public static class280 field1066;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIII)V")
    public final void method141(int arg0, int arg1, int arg2, int arg3) {
        super.field533 = arg1;
        super.field531 = arg0;
        if (arg3 != -17180) {
            this.method138(0.6642645F, -4);
        }
        super.field535 = arg2;
        ++field1062;
    }

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "(I)V")
    public static void method518(int arg0) {
        field1058 = null;
        field1066 = null;
        if (arg0 != 1) {
            field1066 = null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(FI)V")
    public final void method138(float arg0, int arg1) {
        ++field1067;
        super.field538 = arg0;
        if (arg1 != -2) {
            method518(-18);
        }
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(IIIIIF)V")
    public class57(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIZZI)I")
    public static final int method519(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        ++field1061;
        class380 var5 = class105.method908(0, arg2, arg4);
        if (arg0 <= 31) {
            method518(-9);
        }
        if (var5 == null) {
            return 0;
        } else {
            int var6 = 0;
            for (int var7 = 0; var5.field5295.length > var7; ++var7) {
                if (~var5.field5295[var7] <= -1 && ~var5.field5295[var7] > ~class558.field7942.field1260) {
                    class253 var8 = class558.field7942.method721(94, var5.field5295[var7]);
                    int var9 = var8.method1726(-26242, arg1, class285.field4042.method2993(arg1, (byte) 80).field7315);
                    if (arg3) {
                        var6 += var5.field5298[var7] * var9;
                    } else {
                        var6 += var9;
                    }
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method520(String arg0, int arg1) {
        ++field1059;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1 <= 124) {
            return null;
        } else {
            for (int var4 = 0; var2 > var4; ++var4) {
                char var8 = arg0.charAt(var4);
                if (var8 == '<' || var8 == '>') {
                    var3 += 3;
                }
            }
            StringBuffer var5 = new StringBuffer(var2 + var3);
            for (int var6 = 0; ~var2 < ~var6; ++var6) {
                char var7 = arg0.charAt(var6);
                if (var7 == '<') {
                    var5.append("<lt>");
                } else if (~var7 == -63) {
                    var5.append("<gt>");
                } else {
                    var5.append(var7);
                }
            }
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(Z)V")
    public static final void method521(boolean arg0) {
        for (int var1 = 0; var1 < 5; ++var1) {
            class104.field1732[var1] = false;
        }
        ++field1065;
        class411.field5689 = -1;
        class679.field9569 = -1;
        class84.field1533 = -1;
        if (!arg0) {
            field1066 = null;
        }
        class323.field4588 = -1;
        class399.field5586 = 0;
        class666.field9338 = 1;
        class505.field7211 = 0;
    }
}
