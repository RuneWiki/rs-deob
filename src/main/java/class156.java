import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class156 {

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "[Lej;")
    public static class213[] field2153 = new class213[4];

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2154 = "K";

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "Lpj;")
    public static class104 field2156;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "Lca;")
    public static class138 field2158;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "[Lnk;")
    public static class185[] field2155;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([Ljava/lang/Object;B[III)V")
    public static final void method968(Object[] arg0, byte arg1, int[] arg2, int arg3, int arg4) {
        field2157++;
        if (arg4 < arg3) {
            int var5 = (arg4 + arg3) / 2;
            int var6 = arg2[var5];
            int var7 = arg4;
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var6;
            Object var8 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var8;
            for (int var9 = arg4; var9 < arg3; var9++) {
                if ((var9 & 0x1) + var6 > arg2[var9]) {
                    int var10 = arg2[var9];
                    arg2[var9] = arg2[var7];
                    arg2[var7] = var10;
                    Object var11 = arg0[var9];
                    arg0[var9] = arg0[var7];
                    arg0[var7++] = var11;
                }
            }
            arg2[arg3] = arg2[var7];
            arg2[var7] = var6;
            arg0[arg3] = arg0[var7];
            arg0[var7] = var8;
            method968(arg0, (byte) -99, arg2, var7 - 1, arg4);
            method968(arg0, (byte) -126, arg2, arg3, var7 + 1);
        }
        if (arg1 > -85) {
            method970(-6, -79, 68);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static void method969(int arg0) {
        field2153 = null;
        field2154 = null;
        field2155 = null;
        field2158 = null;
        if (arg0 == -13827) {
            field2156 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)J")
    public static final long method970(int arg0, int arg1, int arg2) {
        class91 var3 = class246.field3856[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field1343; var4++) {
            class160 var5 = var3.field1339[var4];
            if ((var5.field2225 >> 29 & 0x3L) == 2L && var5.field2234 == arg1 && var5.field2229 == arg2) {
                return var5.field2225;
            }
        }
        return 0L;
    }
}
