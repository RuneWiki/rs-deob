import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class15 {

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "Lpb;")
    public final class78 field199;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public final int field198;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field194 = 127;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Lsf;")
    private static class108 field189 = class140.method973(255, "Prepared sound engine");

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "Lsf;")
    public static class108 field190 = field189;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field196 = -2;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "Lsf;")
    public static class108 field195 = class140.method973(255, "::gc");

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "[La;")
    public static class278[] field201 = new class278[0];

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "[Z")
    public static boolean[] field192 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "Lik;")
    public static class262 field202;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V", line = 9)
    public static final void method100(int arg0) {
        class321.field5494 = null;
        class273.field4795 = null;
        class155.field2780 = null;
        class88.field1383 = null;
        class154.field2775 = null;
        class94.field1512 = (byte[][]) null;
        if (arg0 != 1) {
            method101((int[]) null, (Object[]) null, -97, -50, 78);
        }
        field191++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "([I[Ljava/lang/Object;III)V", line = 26)
    public static final void method101(int[] arg0, Object[] arg1, int arg2, int arg3, int arg4) {
        if (arg4 < arg3) {
            int var5 = (arg4 + arg3) / 2;
            int var6 = arg4;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var7;
            Object var8 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var8;
            for (int var9 = arg4; var9 < arg3; var9++) {
                if (arg0[var9] < (var9 & 0x1) + var7) {
                    int var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    Object var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg0[arg3] = arg0[var6];
            arg0[var6] = var7;
            arg1[arg3] = arg1[var6];
            arg1[var6] = var8;
            method101(arg0, arg1, 1, var6 - 1, arg4);
            method101(arg0, arg1, 1, arg3, var6 + 1);
        }
        field200++;
        if (arg2 != 1) {
            method101((int[]) null, (Object[]) null, 21, -67, -38);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V", line = 82)
    public static void method102(byte arg0) {
        field201 = null;
        int var1 = -31 % ((arg0 + 7) / 48);
        field202 = null;
        field195 = null;
        field189 = null;
        field192 = null;
        field190 = null;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(II)V", line = 126)
    public class15(int arg0, int arg1) {
        this.field199 = class61.method423(false, arg0);
        this.field198 = arg1;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lpb;I)V", line = 134)
    public class15(class78 arg0, int arg1) {
        this.field199 = arg0;
        this.field198 = arg1;
    }
}
