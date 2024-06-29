import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class23 extends class62 {

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "Ltm;")
    public static class349 field241 = new class349(128);

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "I")
    public static int field248 = 2;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "Lbb;")
    public static class270 field245 = new class270();

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    public int field242;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
    public int field243;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
    public int field244;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
    public int field249;

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "Lki;")
    public class204 field239;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "[I")
    public static int[] field250;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "([BB)[B")
    public static final byte[] method141(byte[] arg0, byte arg1) {
        field238++;
        int var2 = 66 / ((arg1 - 6) / 53);
        if (arg0 == null) {
            return null;
        } else {
            byte[] var3 = new byte[arg0.length];
            class114.method667(arg0, 0, var3, 0, arg0.length);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIII)V")
    public static final void method142(int arg0, int arg1, int arg2, int arg3) {
        field247++;
        class12 var4 = class390.method2422(arg1 + 341555029, arg2, arg1);
        var4.method66(arg1 - 122);
        var4.field152 = arg3;
        var4.field144 = arg0;
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
    public static void method143(int arg0) {
        field245 = null;
        int var1 = 81 % ((8 - arg0) / 48);
        field250 = null;
        field241 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V")
    public static final void method144(int arg0, int arg1) {
        class33.field369.method2286(arg0, (byte) 36);
        field246++;
        if (arg1 != 2) {
            method144(-13, -32);
        }
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)V")
    public static final void method145(int arg0) {
        int var1 = -109 % ((13 - arg0) / 60);
        field240++;
        if (class197.field2333) {
            return;
        }
        class347.method2204(class299.field4000, true);
        if (class104.field1216 != null) {
            class347.method2204(class104.field1216, true);
        }
        class197.field2333 = true;
    }
}
