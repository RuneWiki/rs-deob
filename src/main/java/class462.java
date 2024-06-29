import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public abstract class class462 extends class154 {

    @OriginalMember(owner = "client!rp", name = "l", descriptor = "Lhk;")
    public class111 field6281;

    @OriginalMember(owner = "client!rp", name = "m", descriptor = "Lwm;")
    public static class591 field6282 = new class591();

    @OriginalMember(owner = "client!rp", name = "r", descriptor = "I")
    public static int field6287 = 0;

    @OriginalMember(owner = "client!rp", name = "s", descriptor = "Lam;")
    public static class660 field6288 = new class660();

    @OriginalMember(owner = "client!rp", name = "t", descriptor = "I")
    public static int field6289 = 0;

    @OriginalMember(owner = "client!rp", name = "u", descriptor = "[I")
    public static int[] field6290 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!rp", name = "k", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!rp", name = "n", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!rp", name = "o", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!rp", name = "p", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!rp", name = "q", descriptor = "Lfo;")
    public static class545 field6286;

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "Z")
    public boolean field6279;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method2657(int arg0) {
        if (arg0 != 1) {
            field6286 = null;
        }
        field6280++;
        return false;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "([SZ[Ljava/lang/String;)V", line = 17)
    public static final void method2659(short[] arg0, boolean arg1, String[] arg2) {
        class254.method1673(0, arg0, arg2.length - 1, arg2, 95);
        if (!arg1) {
            method2659(null, true, null);
        }
        field6285++;
    }

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "(I)V", line = 32)
    public static void method2661(int arg0) {
        int var1 = -28 / ((3 - arg0) / 40);
        field6286 = null;
        field6288 = null;
        field6282 = null;
        field6290 = null;
    }

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "(I)I", line = 47)
    public int method2665(int arg0) {
        field6278++;
        return arg0 == 0 ? 0 : 117;
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lhk;)V", line = 63)
    public class462(class111 arg0) {
        this.field6281 = arg0;
    }

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "(I)Z", line = 78)
    public final boolean method2667(int arg0) {
        field6284++;
        if (arg0 >= -105) {
            method2661(-71);
        }
        return this.field6279;
    }

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "(I)I", line = 92)
    public final int method2668(int arg0) {
        if (arg0 != 5) {
            this.method2668(24);
        }
        field6283++;
        return 1;
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)V")
    public abstract void method2658(int arg0);

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "(I)Z")
    public abstract boolean method2660(int arg0);

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)V")
    public abstract void method2662(int arg0, int arg1);

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)Z")
    public abstract boolean method2663(byte arg0);

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIB)V")
    public abstract void method2664(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lkf;IILkf;)V")
    public abstract void method2666(class268 arg0, int arg1, int arg2, class268 arg3);
}
