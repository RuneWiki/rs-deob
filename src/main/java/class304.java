import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class304 implements Runnable {

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "[Lek;")
    public volatile class173[] field4959 = new class173[2];

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "Z")
    public volatile boolean field4964 = false;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "Z")
    public volatile boolean field4958 = false;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "Lgj;")
    public class255 field4960;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "Z")
    public static boolean field4968;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "[[I")
    public static int[][] field4963;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "[[[I")
    public static int[][][] field4965;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method2086(String arg0, int arg1) {
        field4957++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class20.field270; var2++) {
            if (arg0.equalsIgnoreCase(class174.field2714[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class300.field4933[var2])) {
                return true;
            }
        }
        if (arg1 != 1) {
            method2088((String) null, -73);
        }
        return false;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public static void method2087(int arg0) {
        if (arg0 != -3814) {
            field4968 = false;
        }
        field4963 = null;
        field4965 = null;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method2088(String arg0, int arg1) {
        field4961++;
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var3 > var2 && class92.method602((byte) 121, arg0.charAt(var2))) {
            var2++;
        }
        while (var2 < var3 && class92.method602((byte) 125, arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 20) {
            return null;
        }
        if (arg1 != 2) {
            field4968 = true;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (class237.method1649(var7, (byte) 98)) {
                char var8 = class92.method603(119, var7);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!uj", name = "run", descriptor = "()V")
    public final void run() {
        field4962++;
        this.field4958 = true;
        try {
            while (!this.field4964) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class173 var2 = this.field4959[var1];
                    if (var2 != null) {
                        var2.method1159(17456);
                    }
                }
                class96.method614(0, 10L);
                class63.method410((byte) 65, (Object) null, this.field4960);
            }
        } catch (Exception var9) {
            class159.method1055((String) null, -17731, var9);
        } finally {
            Object var6 = null;
            this.field4958 = false;
        }
    }
}
