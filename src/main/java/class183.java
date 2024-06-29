import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class183 implements Runnable {

    @OriginalMember(owner = "client!je", name = "j", descriptor = "[Lbc;")
    public volatile class175[] field2877 = new class175[2];

    @OriginalMember(owner = "client!je", name = "l", descriptor = "Z")
    public volatile boolean field2879 = false;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "Z")
    public volatile boolean field2871 = false;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2870 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!je", name = "f", descriptor = "Z")
    public static boolean field2873 = false;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field2875 = 0;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Z")
    public static boolean field2869 = false;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "[J")
    public static long[] field2884 = new long[100];

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Lj;")
    public class165 field2868;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "[[[I")
    public static int[][][] field2878;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static void method1238(int arg0) {
        field2878 = null;
        if (arg0 != -19902) {
            field2869 = false;
        }
        field2870 = null;
        field2884 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static final void method1239(byte arg0) {
        field2876++;
        class125.field2019++;
        if (arg0 < 16) {
            field2875 = 115;
        }
    }

    @OriginalMember(owner = "client!je", name = "run", descriptor = "()V")
    public final void run() {
        field2872++;
        this.field2871 = true;
        try {
            while (!this.field2879) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class175 var2 = this.field2877[var1];
                    if (var2 != null) {
                        var2.method1192(-19615);
                    }
                }
                class43.method358(10L, false);
                class231.method1620((byte) 68, (Object) null, this.field2868);
            }
        } catch (Exception var9) {
            class178.method1211((String) null, -117, var9);
        } finally {
            Object var6 = null;
            this.field2871 = false;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B[[I)V")
    public static final void method1240(byte arg0, int[][] arg1) {
        field2882++;
        class29.field452 = arg1;
        if (arg0 != 65) {
            field2869 = false;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
    public static final void method1241(int arg0) {
        if (arg0 != 9776) {
            field2878 = null;
        }
        field2880++;
        class196.field3126.method481(false);
        class51.field892.method481(false);
        class198.field3161.method481(false);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V")
    public static final void method1242(int arg0, int arg1) {
        field2881++;
        if (arg0 == -1 || !class228.method1606(-1, arg0)) {
            return;
        }
        class36[] var2 = class136.field2250[arg0];
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class36 var4 = var2[var3];
            if (var4.field650 != null) {
                class213 var5 = new class213();
                var5.field3480 = var4;
                var5.field3477 = var4.field650;
                class17.method139(var5, 2000000, false);
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILrc;)V")
    public static final void method1243(int arg0, class67 arg1) {
        field2874++;
        class126.field2044 = arg1;
        if (arg0 <= 20) {
            method1241(-9);
        }
    }
}
