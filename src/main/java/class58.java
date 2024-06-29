import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class58 extends class217 {

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "J")
    public long field859;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "Lta;")
    public static class197 field862 = new class197(260);

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "[I")
    public static int[] field866 = new int[32];

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "Ljava/lang/String;")
    public static String field867 = "Checking for updates - ";

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "Llb;")
    public static class211 field861;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "[Lek;")
    public static class184[] field864;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "[[[I")
    public static int[][][] field868;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V", line = 5)
    public static void method520(boolean arg0) {
        field866 = null;
        field868 = (int[][][]) null;
        field861 = null;
        field862 = null;
        field867 = null;
        field864 = null;
        if (!arg0) {
            field867 = (String) null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V", line = 20)
    public class58() {
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZZI)I", line = 27)
    public static final int method521(int arg0, boolean arg1, boolean arg2, int arg3) {
        field860++;
        class278 var4 = (class278) class171.field2547.method203(1710, (long) arg0);
        if (var4 == null) {
            return 0;
        }
        if (arg1) {
            field861 = (class211) null;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field4272.length; var6++) {
            if (var4.field4272[var6] >= 0 && var4.field4272[var6] < class291.field4576) {
                class274 var7 = class225.method1603(var4.field4272[var6], 0);
                if (var7.field4143 != null) {
                    class181 var8 = (class181) var7.field4143.method203(1710, (long) arg3);
                    if (var8 != null) {
                        if (arg2) {
                            var5 += var4.field4274[var6] * var8.field2713;
                        } else {
                            var5 += var8.field2713;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(J)V", line = 73)
    public class58(long arg0) {
        this.field859 = arg0;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BII)I", line = 85)
    public static final int method522(byte arg0, int arg1, int arg2) {
        field858++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        int var4 = -99 % ((arg0 + 4) / 35);
        return (arg2 & 0xFF80) + var3;
    }
}
