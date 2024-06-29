import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public abstract class class377 {

    @OriginalMember(owner = "client!os", name = "e", descriptor = "Z")
    public static boolean field5491 = false;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "Lcr;")
    public static class189 field5489 = new class189(16);

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!os", name = "g", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!os", name = "h", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!os", name = "i", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "[Lps;")
    public static class394[] field5488;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "[[[B")
    public static byte[][][] field5490;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZLnj;)Lfa;", line = 12)
    public static final class398 method2445(boolean arg0, class228 arg1) {
        arg1.method1348(-100);
        field5487++;
        int var2 = arg1.method1348(-116);
        class398 var3 = class44.method319(13563, var2);
        var3.field5918 = arg1.method1348(-104);
        int var4 = arg1.method1348(-94);
        if (!arg0) {
            return null;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method1348(-109);
            var3.method208(arg1, var6, -13132);
        }
        var3.method209(16);
        return var3;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)V", line = 49)
    public static void method2446(boolean arg0) {
        field5489 = null;
        field5488 = null;
        if (arg0) {
            field5491 = false;
        }
        field5490 = null;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(III)V", line = 65)
    public static final void method2447(int arg0, int arg1, int arg2) {
        class254 var3 = class213.field2852[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field3510 != null) {
            var3.field3510 = null;
        }
        if (var3.field3512 != null) {
            var3.field3512 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IB)V", line = 85)
    public static final void method2448(int arg0, byte arg1) {
        field5492++;
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        if (arg1 == -2) {
            class363.field5247 = arg0;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1822(int arg0);

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I[B)V")
    public abstract void method1821(int arg0, byte[] arg1);
}
