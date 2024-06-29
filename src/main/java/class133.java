import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class133 {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "[I")
    public static int[] field2202 = new int[1000];

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "Z")
    public static boolean field2207 = true;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Ljj;")
    public static class134 field2203;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2206;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "[[Leb;")
    public static class103[][] field2204;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)V")
    public static final void method911(int arg0, int arg1, int arg2) {
        client.field3605 = (float) arg1;
        class121.field2039 = (float) arg2;
        field2205++;
        if (class92.field1316 == 2) {
            class8.field119 = arg1;
            class244.field3910 = arg2;
        }
        if (arg0 <= -36) {
            class156.method1046(126);
            class196.field3163 = true;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static void method912(int arg0) {
        field2206 = null;
        field2202 = null;
        if (arg0 != 0) {
            method911(-64, -103, 60);
        }
        field2204 = null;
        field2203 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "()V")
    public static final void method913() {
        if (class156.field2506 != null) {
            for (int var0 = 0; var0 < class156.field2506.length; var0++) {
                for (int var1 = 0; var1 < class236.field3769; var1++) {
                    for (int var2 = 0; var2 < class77.field1061; var2++) {
                        class156.field2506[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class155.field2492 != null) {
            for (int var3 = 0; var3 < class155.field2492.length; var3++) {
                for (int var4 = 0; var4 < class236.field3769; var4++) {
                    for (int var5 = 0; var5 < class77.field1061; var5++) {
                        class155.field2492[var3][var4][var5] = null;
                    }
                }
            }
        }
        class297.field4693 = 0;
        if (class218.field3493 != null) {
            for (int var6 = 0; var6 < class297.field4693; var6++) {
                class218.field3493[var6] = null;
            }
        }
        if (class184.field2938 != null) {
            for (int var7 = 0; var7 < class26.field320; var7++) {
                class184.field2938[var7] = null;
            }
            class26.field320 = 0;
        }
        if (class100.field1520 != null) {
            for (int var8 = 0; var8 < class100.field1520.length; var8++) {
                class100.field1520[var8] = null;
            }
        }
    }
}
