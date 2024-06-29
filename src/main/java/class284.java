import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class284 extends class137 {

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "Ljava/lang/String;")
    public String field4604;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "[[I")
    public static int[][] field4600 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "[I")
    public static int[] field4606 = new int[4096];

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)Log;")
    public static final class241 method1926(int arg0) {
        if (arg0 != 32309) {
            method1931((byte) 84);
        }
        field4607++;
        return class93.field1486.length > class271.field4370 ? class93.field1486[class271.field4370++] : null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IBILgi;)Z")
    public static final boolean method1927(int arg0, byte arg1, int arg2, class164 arg3) {
        field4603++;
        byte[] var4 = arg3.method1156(arg0, arg2, (byte) -16);
        if (var4 == null) {
            return false;
        } else {
            class172.method1215(var4, (byte) -102);
            return arg1 == -78;
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)V")
    public static final void method1928(byte arg0) {
        if (arg0 != 44) {
            field4600 = null;
        }
        if (class149.field2381 != null) {
            class123 var1 = class149.field2381;
            synchronized (class149.field2381) {
                class149.field2381 = null;
            }
        }
        field4601++;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(B)V")
    public static void method1929(byte arg0) {
        int var1 = 98 / ((arg0 - 75) / 43);
        field4600 = null;
        field4606 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method1930(int arg0, String arg1, Throwable arg2) {
        field4605++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class93.method653(-15575, arg2);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class22.method182(var3, (byte) 75);
            String var4 = class182.method1287(var3, ":", (byte) -35, "%3a");
            String var5 = class182.method1287(var4, "@", (byte) 113, "%40");
            String var6 = class182.method1287(var5, "&", (byte) 122, "%26");
            int var7 = -29 / ((arg0 - 3) / 44);
            String var8 = class182.method1287(var6, "#", (byte) -98, "%23");
            if (class148.field2372.field1105 != null) {
                class301 var9 = class148.field2372.method477(new URL(class148.field2372.field1105.getCodeBase(), "clienterror.ws?c=" + class205.field3295 + "&u=" + class48.field712 + "&v1=" + class69.field1097 + "&v2=" + class69.field1110 + "&e=" + var8), 112);
                while (var9.field4929 == 0) {
                    class33.method250(1L, 256);
                }
                if (var9.field4929 == 1) {
                    DataInputStream var10 = (DataInputStream) var9.field4930;
                    var10.read();
                    var10.close();
                }
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(B)V")
    public static final void method1931(byte arg0) {
        field4602++;
        class146.field2347.method1873(-7401);
        if (arg0 != -59) {
            field4606 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
    public class284() {
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class284(String arg0, int arg1) {
        this.field4604 = arg0;
    }
}
