import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class139 extends class88 {

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "Ltd;")
    private static class136 field3236 = class145.method1172("purple:", 45);

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "[I")
    public static int[] field3237 = new int[32768];

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "[I")
    public static int[] field3245 = new int[5];

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
    public static int field3224 = 0;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "Ltd;")
    public static class136 field3235 = field3236;

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "I")
    public static int field3248 = 0;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "Ltd;")
    public static class136 field3225 = field3236;

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "Ltd;")
    private static class136 field3251 = class145.method1172("Loading title screen )2 ", 45);

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "Ltd;")
    public static class136 field3228 = field3251;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "[I")
    public static int[] field3230 = new int[50];

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "Ltd;")
    public static class136 field3226 = class145.method1172("Lade Sprites )2 ", 45);

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "Ltd;")
    private static class136 field3229 = class145.method1172("Please reload this page)3", 45);

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "Ltd;")
    public static class136 field3232 = field3229;

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "I")
    public static int field3254 = 0;

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "Ltd;")
    public static class136 field3253 = class145.method1172(")1", 45);

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
    public int field3223;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
    public int field3238;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
    public int field3239;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    public int field3240;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "I")
    public int field3249;

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!ua", name = "cb", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "Ltd;")
    public class136 field3247;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "Lke;")
    public class74 field3222;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "Lke;")
    public static class74 field3227;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "Lke;")
    public class74 field3233;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "Llf;")
    public static class82 field3231;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "[I")
    public static int[] field3241;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "[Ljava/lang/Object;")
    public Object[] field3244;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
    public static void method1133(byte arg0) {
        field3237 = null;
        field3230 = null;
        field3253 = null;
        field3232 = null;
        field3236 = null;
        field3245 = null;
        field3251 = null;
        field3229 = null;
        field3241 = null;
        field3227 = null;
        field3225 = null;
        if (arg0 == 105) {
            field3226 = null;
            field3235 = null;
            field3228 = null;
            field3231 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V")
    public static final void method1134(byte arg0) {
        Object var1 = class7.field127;
        synchronized (class7.field127) {
            if (class15.field286 == 0) {
                class44.field1010.method185(0, new class86(), 5);
            }
            class15.field286 = 600;
        }
        if (arg0 == 4) {
            field3252++;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)I")
    public static final int method1135(int arg0, byte arg1) {
        int var2 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        field3234++;
        int var3 = (var2 >>> 2 & 0xF3333333) + (var2 & 0x33333333);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        if (arg1 <= 53) {
            method1133((byte) 106);
        }
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Lnf;")
    public static final class96 method1136(int arg0, int arg1) {
        field3242++;
        class96 var2 = (class96) class89.field2105.method1162((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = client.field439.method669(arg0, arg1, -70);
        class96 var4 = new class96();
        var4.field2264 = arg0;
        if (var3 != null) {
            var4.method728(new class127(var3), (byte) 83);
        }
        var4.method726((byte) -122);
        class89.field2105.method1164((long) arg0, var4, (byte) 126);
        return var4;
    }
}
