import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class119 {

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public int field2169 = -1;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "Z")
    public boolean field2170 = true;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public int field2164 = -1;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public int field2165 = 0;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "Lub;")
    public static class227 field2168 = class257.method1749("Fallen lassen", 17263);

    @OriginalMember(owner = "client!of", name = "f", descriptor = "Lub;")
    public static class227 field2166 = class257.method1749("", 17263);

    @OriginalMember(owner = "client!of", name = "c", descriptor = "Lub;")
    public static class227 field2163 = class257.method1749("; Expires=", 17263);

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field2176 = -1;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public static int field2174 = 0;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public static int field2177 = 99;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "[I")
    public static int[] field2175 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "[I")
    public static int[] field2161;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILnj;II)V")
    private final void method747(int arg0, class226 arg1, int arg2, int arg3) {
        if (arg0 == 1) {
            this.field2165 = class181.method1159(arg1.method1444(171285352), true);
        } else if (arg0 == 2) {
            this.field2169 = arg1.method1471(255);
        } else if (arg0 == 3) {
            this.field2169 = arg1.method1447(0);
            if (this.field2169 == 65535) {
                this.field2169 = -1;
            }
        } else if (arg0 == 5) {
            this.field2170 = false;
        } else if (arg0 == 7) {
            this.field2164 = class181.method1159(arg1.method1444(171285352), true);
        } else if (arg0 == 8) {
            class254.field4456 = arg3;
        } else if (arg0 == 9) {
            arg1.method1447(0);
        } else if (arg0 != 10) {
            if (arg0 == 11) {
                arg1.method1471(255);
            } else if (arg0 != 12) {
                if (arg0 == 13) {
                    arg1.method1444(171285352);
                } else if (arg0 == 14) {
                    arg1.method1471(255);
                }
            }
        }
        field2171++;
        if (arg2 != -26628) {
            field2177 = -87;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static void method748(int arg0) {
        field2175 = null;
        field2161 = null;
        field2166 = null;
        if (arg0 != 0) {
            method750(-90);
        }
        field2163 = null;
        field2168 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lnj;II)V")
    public final void method749(class226 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method1471(arg2 ^ 0x6CA9);
            if (var4 == 0) {
                if (arg2 != 27734) {
                    return;
                }
                field2173++;
                return;
            }
            this.method747(var4, arg0, -26628, arg1);
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)Lwh;")
    public static final class163 method750(int arg0) {
        field2167++;
        byte[] var1 = class26.field427[0];
        int var2 = class214.field3613[0] * class177.field2982[0];
        class163 var6;
        if (class169.field2828[0]) {
            int[] var3 = new int[var2];
            byte[] var4 = class122.field2205[0];
            for (int var5 = 0; var5 < var2; var5++) {
                var3[var5] = class246.method1640(class63.field1153[class76.method446(var1[var5], 255)], class76.method446(255, var4[var5]) << 24);
            }
            var6 = new class129(class161.field2727, class241.field4197, class58.field1068[0], class176.field2934[0], class177.field2982[0], class214.field3613[0], var3);
        } else {
            int[] var7 = new int[var2];
            for (int var8 = 0; var8 < var2; var8++) {
                var7[var8] = class63.field1153[class76.method446(255, var1[var8])];
            }
            var6 = new class163(class161.field2727, class241.field4197, class58.field1068[0], class176.field2934[0], class177.field2982[0], class214.field3613[0], var7);
        }
        if (arg0 == 360) {
            class57.method350((byte) -123);
            return var6;
        } else {
            return null;
        }
    }
}
