import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public abstract class class54 {

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Lcc;")
    private static class209 field1061 = class95.method669(112, "Allocating memory");

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field1063 = 0;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field1066 = 0;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "Lcc;")
    public static class209 field1064 = field1061;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field1069 = 1;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method400(int arg0) {
        if (arg0 > -77) {
            field1061 = null;
        }
        field1061 = null;
        field1064 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([Lcc;ZI[SI)V")
    public static final void method401(class209[] arg0, boolean arg1, int arg2, short[] arg3, int arg4) {
        if (arg1) {
            method400(-124);
        }
        if (arg4 > arg2) {
            int var5 = arg2;
            int var6 = (arg2 + arg4) / 2;
            class209 var7 = arg0[var6];
            arg0[var6] = arg0[arg4];
            arg0[arg4] = var7;
            short var8 = arg3[var6];
            arg3[var6] = arg3[arg4];
            arg3[arg4] = var8;
            for (int var9 = arg2; var9 < arg4; var9++) {
                if (var7 == null || arg0[var9] != null && arg0[var9].method1447((byte) -112, var7) < (var9 & 0x1)) {
                    class209 var10 = arg0[var9];
                    arg0[var9] = arg0[var5];
                    arg0[var5] = var10;
                    short var11 = arg3[var9];
                    arg3[var9] = arg3[var5];
                    arg3[var5++] = var11;
                }
            }
            arg0[arg4] = arg0[var5];
            arg0[var5] = var7;
            arg3[arg4] = arg3[var5];
            arg3[var5] = var8;
            method401(arg0, false, arg2, arg3, var5 - 1);
            method401(arg0, arg1, var5 + 1, arg3, arg4);
        }
        field1062++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILmg;)Lmg;")
    public abstract class265 method402(int arg0, class265 arg1);
}
