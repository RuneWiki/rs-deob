import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public abstract class class367 extends class103 {

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
    public int field5204;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public int field5200;

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "I")
    public int field5209;

    @OriginalMember(owner = "client!ao", name = "r", descriptor = "I")
    public int field5212;

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "I")
    public int field5211;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public int field5198;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
    public int field5207;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "[I")
    public static int[] field5203 = new int[1];

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "F")
    public static float field5199 = 0.0F;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "I")
    public static int field5208 = -1;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!ao", name = "s", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IILgp;IIZ)V")
    public static final void method2214(int arg0, int arg1, class561 arg2, int arg3, int arg4, boolean arg5) {
        field5206++;
        int var6 = -26 % ((arg4 - 8) / 59);
        class444.field6479 = arg0;
        class442.field6468 = 10000;
        class161.field2392 = arg5;
        class376.field5531 = 1;
        class617.field8732 = arg3;
        class69.field1309 = arg2;
        class66.field1086 = arg1;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)I")
    public static final int method2215(int arg0, int arg1) {
        return class103.field1746 == null ? 0 : class103.field1746[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(Z)[Lhf;")
    public static final class573[] method2216(boolean arg0) {
        if (arg0) {
            method2218(68);
        }
        field5205++;
        return new class573[] { class112.field1859, class118.field1908, class220.field3306 };
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BZILqa;IILcea;)V")
    public final void method866(byte arg0, boolean arg1, int arg2, class167 arg3, int arg4, int arg5, class103 arg6) {
        field5201++;
        if (arg0 != -84) {
            this.field5204 = -43;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)Z")
    public final boolean method868(boolean arg0) {
        if (arg0) {
            this.field5198 = -67;
        }
        field5202++;
        return false;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2217(int arg0, String arg1) {
        class459.field6612 = arg1;
        field5213++;
        if (class270.field3976.field549 == null) {
            return;
        }
        try {
            String var2 = class270.field3976.field549.getParameter("cookieprefix");
            String var3 = class270.field3976.field549.getParameter("cookiehost");
            if (arg0 != 17759) {
                method2214(0, 23, null, 30, -124, true);
            }
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class224.method1496(class508.method2860(false) + 94608000000L, -673) + "; Max-Age=" + 94608000L;
            }
            class630.method3563((byte) -70, "document.cookie=\"" + var5 + "\"", class270.field3976.field549);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "(I)V")
    public static void method2218(int arg0) {
        field5203 = null;
        int var1 = -13 % ((-arg0 - 32) / 45);
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "(I)V")
    public final void method867(int arg0) {
        if (arg0 <= 12) {
            method2218(112);
        }
        field5210++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(B)I")
    public abstract int method261(byte arg0);

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(IIIIIII)V")
    public class367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5204 = arg5;
        this.field5200 = arg4;
        this.field5209 = arg0;
        this.field5212 = arg3;
        this.field5211 = arg6;
        this.field5198 = arg2;
        this.field5207 = arg1;
    }
}
