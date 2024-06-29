import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class322 implements Runnable {

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "[Lcg;")
    public volatile class316[] field4993 = new class316[2];

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "Z")
    public volatile boolean field4984 = false;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "Z")
    public volatile boolean field4986 = false;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "Z")
    public static boolean field4990 = false;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "[I")
    public static int[] field4988 = new int[2048];

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field4985 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4991 = "flash3:";

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "Z")
    public static boolean field4989 = true;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field4992 = new String[100];

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "Z")
    public static boolean field4994 = true;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
    public static int field4999 = 0;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "Ljh;")
    public class124 field4995;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "Lnc;")
    public static class161 field4983;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIILrf;III)V", line = 5)
    public static final void method2258(int arg0, int arg1, int arg2, class263 arg3, int arg4, int arg5, int arg6) {
        class339.method2360(arg3.field4255, arg6, arg0, 128, arg5, arg3.field4264, arg2, arg4);
        if (arg1 == 497) {
            field4998++;
        }
    }

    @OriginalMember(owner = "client!wg", name = "run", descriptor = "()V", line = 21)
    public final void run() {
        field4996++;
        this.field4986 = true;
        try {
            while (!this.field4984) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class316 var2 = this.field4993[var1];
                    if (var2 != null) {
                        var2.method2218(-84);
                    }
                }
                class121.method867((byte) -86, 10L);
                class300.method2137((Object) null, (byte) -61, this.field4995);
            }
        } catch (Exception var7) {
            class26.method152(var7, (String) null, -25);
        } finally {
            this.field4986 = false;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 69)
    public static void method2259(int arg0) {
        field4992 = null;
        field4988 = null;
        field4983 = null;
        field4991 = null;
        if (arg0 != 6188) {
            method2258(-67, -41, -29, (class263) null, -75, -10, 1);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILog;)I", line = 82)
    public static final int method2260(int arg0, int arg1, class157 arg2) {
        field4987++;
        if (!client.method766(arg2).method2028((byte) 127, arg0) && arg2.field2564 == null) {
            return -1;
        } else if (arg1 == 25876) {
            return arg2.field2480 == null || arg2.field2480.length <= arg0 ? -1 : arg2.field2480[arg0];
        } else {
            return -68;
        }
    }
}
