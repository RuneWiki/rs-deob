import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class127 {

    @OriginalMember(owner = "client!od", name = "m", descriptor = "Lvf;")
    private class248 field2228 = new class248();

    @OriginalMember(owner = "client!od", name = "q", descriptor = "Lkh;")
    private class247 field2232 = new class247();

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    private int field2231;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    private int field2233;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "Lkj;")
    private class56 field2230;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "Le;")
    public static class86 field2222 = new class86();

    @OriginalMember(owner = "client!od", name = "l", descriptor = "Lij;")
    public static class50 field2227 = class78.method578(122, "<col=00ff00>");

    @OriginalMember(owner = "client!od", name = "k", descriptor = "J")
    public static long field2226 = 0L;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field2225 = 0;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Lda;")
    public static class22 field2221;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILij;BLij;Lij;)V")
    public static final void method908(int arg0, class50 arg1, byte arg2, class50 arg3, class50 arg4) {
        field2219++;
        if (arg2 < 125) {
            field2229 = -112;
        }
        class18.method137(-1, arg4, arg0, -1, arg1, arg3);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method909(int arg0) {
        field2227 = null;
        if (arg0 <= 119) {
            field2221 = null;
        }
        field2221 = null;
        field2222 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)Lph;")
    public final class32 method910(boolean arg0) {
        field2216++;
        if (arg0) {
            method908(-97, (class50) null, (byte) 20, (class50) null, (class50) null);
        }
        return this.field2230.method446(1);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
    public final void method911(int arg0) {
        this.field2232.method1687(-98);
        field2224++;
        this.field2230.method437((byte) 19);
        if (arg0 != -16079) {
            this.method913((class248) null, 87, 121L);
        }
        this.field2228 = new class248();
        this.field2233 = this.field2231;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(JB)Lvf;")
    public final class248 method912(long arg0, byte arg1) {
        field2223++;
        if (arg1 < 26) {
            field2229 = -21;
        }
        class248 var4 = (class248) this.field2230.method443(arg0, (byte) 72);
        if (var4 != null) {
            this.field2232.method1681(var4, -354669215);
        }
        return var4;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lvf;IJ)V")
    public final void method913(class248 arg0, int arg1, long arg2) {
        if (arg1 <= 100) {
            return;
        }
        if (this.field2233 == 0) {
            class248 var5 = this.field2232.method1680(-354669215);
            var5.method267(-92);
            var5.method1693(63);
            if (this.field2228 == var5) {
                class248 var6 = this.field2232.method1680(-354669215);
                var6.method267(123);
                var6.method1693(63);
            }
        } else {
            this.field2233--;
        }
        this.field2230.method445(105, arg2, arg0);
        this.field2232.method1681(arg0, -354669215);
        field2217++;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)Lph;")
    public final class32 method914(int arg0) {
        field2218++;
        if (arg0 != 50) {
            field2226 = -28L;
        }
        return this.field2230.method448((byte) 119);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IJ)V")
    public static final void method915(int arg0, long arg1) {
        field2220++;
        try {
            Thread.sleep(arg1);
            if (arg0 != 1) {
                field2226 = -79L;
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(I)V")
    public class127(int arg0) {
        this.field2231 = arg0;
        int var2 = 1;
        this.field2233 = arg0;
        while (arg0 > var2 + var2) {
            var2 += var2;
        }
        this.field2230 = new class56(var2);
    }
}
