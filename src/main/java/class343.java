import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class343 extends class432 {

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "I")
    public static int field5162 = 0;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "Z")
    public static boolean field5161 = false;

    @OriginalMember(owner = "client!lm", name = "F", descriptor = "I")
    public static int field5165 = 0;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "Lku;")
    public static class254 field5157 = new class254();

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    public int field5159;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
    public int field5160;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "I")
    public int field5163;

    @OriginalMember(owner = "client!lm", name = "E", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!lm", name = "G", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!lm", name = "H", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!lm", name = "I", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!lm", name = "J", descriptor = "J")
    public long field5169;

    @OriginalMember(owner = "client!lm", name = "K", descriptor = "[[B")
    public static byte[][] field5170;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)V")
    public static void method2181(boolean arg0) {
        field5157 = null;
        if (arg0) {
            field5170 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lbu;II)Lui;")
    public static final class151 method2182(class17 arg0, int arg1, int arg2) {
        field5155++;
        byte[] var3 = arg0.method140(arg1, 1);
        if (var3 == null) {
            return null;
        } else {
            if (arg2 != 0) {
                method2185(null, 2);
            }
            return new class151(var3);
        }
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)I")
    public final int method2183(int arg0) {
        if (arg0 == -5) {
            field5158++;
            return this.field5163;
        } else {
            return -30;
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)J")
    public final long method2184(int arg0) {
        if (arg0 == -1) {
            field5156++;
            return this.field5169;
        } else {
            return -76L;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2185(String arg0, int arg1) {
        field5166++;
        if (arg1 >= -30) {
            method2181(true);
        }
        if (class328.field4958 == null) {
            class430.method2576(0);
        }
        String[] var2 = class139.method1043(arg0, 0, '\n');
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class347.field5195; var4 > 0; var4--) {
                class328.field4958[var4] = class328.field4958[var4 - 1];
            }
            class328.field4958[0] = var2[var3];
            if (class347.field5195 < class328.field4958.length - 1) {
                class347.field5195++;
                if (class377.field5710 > 0) {
                    class377.field5710++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)I")
    public final int method2186(byte arg0) {
        if (arg0 < 103) {
            return -85;
        } else {
            field5164++;
            return this.field5159;
        }
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(B)I")
    public final int method2187(byte arg0) {
        field5154++;
        return arg0 == 11 ? this.field5160 : -56;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIBI)I")
    public static final int method2188(int arg0, int arg1, byte arg2, int arg3) {
        field5168++;
        if (class88.field1546 == null) {
            return 0;
        }
        if (arg2 != -102) {
            method2188(69, -85, (byte) -6, -100);
        }
        int var4 = arg1 >> 7;
        int var5 = arg3 >> 7;
        if (var4 < 0 || var5 < 0 || (class33.field662 - 1) < var4 || class121.field1966 - 1 < var5) {
            return 0;
        }
        int var6 = arg0;
        if (arg0 < 3 && (class260.field3784[1][var4][var5] & 0x2) != 0) {
            var6 = arg0 + 1;
        }
        return class88.field1546[var6].method371(arg1, arg3);
    }
}
