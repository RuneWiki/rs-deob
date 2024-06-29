import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public abstract class class213 {

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "[I")
    public static int[] field3181 = new int[256];

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "Z")
    public static boolean field3188;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "Lpf;")
    public static class294 field3186;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "Lnh;")
    public static class55 field3187;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3189;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)V")
    public static final void method1358(int arg0, int arg1) {
        field3185++;
        class166 var2 = class44.field704;
        synchronized (class44.field704) {
            if (arg1 != -9) {
                field3186 = null;
            }
            class219.field3302 = arg0;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)Lrk;")
    public abstract class277 method1359(byte arg0);

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
    public static void method1360(boolean arg0) {
        if (arg0) {
            field3187 = null;
            field3186 = null;
            field3189 = null;
            field3181 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)Ltk;")
    public static final class53 method1361(int arg0, int arg1, int arg2) {
        field3183++;
        class53 var3 = new class53();
        if (arg0 != -28115) {
            return null;
        }
        for (class175 var4 = (class175) class145.field2120.method1665(16); var4 != null; var4 = (class175) class145.field2120.method1659((byte) -118)) {
            if (var4.field2670 && var4.method1087(-128, arg2, arg1)) {
                var3.method363(var4, -105);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)Z")
    public static final boolean method1362(int arg0, int arg1) {
        field3182++;
        class266 var2 = class209.method1343(arg0, (byte) -39);
        if (var2 == null) {
            return false;
        } else if (class12.field165 == 1 || class12.field165 == 2 || class112.field1726 == 2) {
            class91.field1434 = var2.field4013;
            class210.field3162 = var2.field4007;
            if (class112.field1726 != 0) {
                class284.field4257 = class91.field1434 + 50000;
                class278.field4192 = class91.field1434 + 40000;
                class256.field3897 = class278.field4192;
            }
            return true;
        } else {
            String var3 = "";
            String var4 = "";
            if (class112.field1726 != 0) {
                var4 = ":" + (var2.field4013 + 7000);
            }
            if (class189.field2904 != null) {
                var3 = "/p=" + class189.field2904;
            }
            if (arg1 != -2941) {
                method1360(true);
            }
            String var5 = "http://" + var2.field4007 + var4 + "/l=" + class48.field780 + "/a=" + class259.field3946 + var3 + "/j" + (class142.field2080 ? "1" : "0") + ",o" + (class108.field1681 ? "1" : "0") + ",a2,m" + (class10.field135 ? "1" : "0");
            try {
                class152.field2200.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BI)[B")
    public abstract byte[] method1363(byte arg0, int arg1);

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(II)V")
    public abstract void method1364(int arg0, int arg1);

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)I")
    public abstract int method1365(int arg0, byte arg1);

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3181[var0] = var1;
        }
        field3188 = true;
    }
}
