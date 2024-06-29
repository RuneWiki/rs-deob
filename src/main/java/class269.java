import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class269 extends class161 {

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "I")
    public int field4324;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public int field4312;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "Z")
    public boolean field4311;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    public int field4322;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
    public int field4320;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public int field4313;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public static int field4316 = 0;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field4317 = new String[100];

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "Ljava/lang/String;")
    public static String field4319 = "Loading fonts - ";

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "Lal;")
    public static class52 field4310 = new class52(30);

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
    public static int field4323 = 0;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "[Lgl;")
    public static class356[] field4321;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIIZ)V")
    public static final void method1825(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field4318++;
        int var8 = arg4 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = class115.field1598 + ((class11.field158 - class115.field1598) * var8 / 100);
        int var10 = arg0 * var9 >> 8;
        int var11 = 16384 - arg1 & 0x3FFF;
        int var12 = 16384 - arg6 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class258.field4177[var11] * -var10 >> 15;
            var15 = class258.field4173[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class258.field4177[var12] * var15 >> 15;
            var15 = class258.field4173[var12] * var15 >> 15;
        }
        class379.field5733 = arg2 - var14;
        if (!arg7) {
            field4319 = null;
        }
        class427.field6301 = arg5 - var13;
        class290.field4631 = arg3 - var15;
        class396.field5928 = arg1;
        class108.field1516 = arg6;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z[I)Ljava/lang/String;")
    public static final String method1826(boolean arg0, int[] arg1) {
        field4314++;
        if (!arg0) {
            method1825(97, -109, -91, 47, 23, 49, 81, false);
        }
        StringBuffer var2 = new StringBuffer();
        int var3 = class369.field5613;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            class218 var5 = class223.method1604((byte) -123, arg1[var4]);
            if (var5.field3582 != -1) {
                class356 var6 = (class356) class209.field3362.method331((byte) 69, (long) var5.field3582);
                if (var6 == null) {
                    class100 var7 = class100.method756(class223.field3727, var5.field3582, 0);
                    if (var7 != null) {
                        var6 = class284.field4547.method641(var7, true);
                        class209.field3362.method341(43, (long) var5.field3582, var6);
                    }
                }
                if (var6 != null) {
                    class372.field5627[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)V")
    public static void method1827(int arg0) {
        field4319 = null;
        field4310 = null;
        if (arg0 == 538277583) {
            field4317 = null;
            field4321 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(IIIIIZ)V")
    public class269(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field4324 = arg0;
        this.field4312 = arg2;
        this.field4311 = arg5;
        this.field4322 = arg4;
        this.field4320 = arg3;
        this.field4313 = arg1;
    }
}
