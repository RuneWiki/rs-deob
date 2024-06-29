import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class102 {

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "[Ljd;")
    public static class234[] field1326 = new class234[8];

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field1325 = 0;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Lfh;")
    public static class140 field1324;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lfd;Z)Lam;", line = 4)
    public static final class264 method722(class299 arg0, boolean arg1) {
        if (!arg1) {
            field1324 = (class140) null;
        }
        field1328++;
        return new class264(arg0.method2043(true), arg0.method2043(true), arg0.method2043(true), arg0.method2043(arg1), arg0.method2085((byte) 75), arg0.method2085((byte) 101), arg0.method2096((byte) -122));
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V", line = 21)
    public static void method723(byte arg0) {
        field1324 = null;
        field1326 = null;
        if (arg0 != 80) {
            method725(false);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIZBLqk;II)Luj;", line = 35)
    public static final class158 method724(int arg0, int arg1, boolean arg2, byte arg3, class125 arg4, int arg5, int arg6) {
        field1329++;
        int var8 = (arg2 ? 65536 : 0) + (arg5 + (arg1 << 17) + (arg6 << 19));
        long var9 = (long) arg0 * 3147483667L + ((long) var8 * 3849834839L);
        class158 var11 = (class158) class347.field5393.method2265(var9, (byte) 53);
        if (var11 != null) {
            return var11;
        }
        class350.field5468 = false;
        class158 var12 = class67.method483(arg1, arg2, arg0, false, arg4, -98, arg6, arg5, false);
        if (var12 != null && !class350.field5468) {
            class347.field5393.method2257(-127, var12, var9);
        }
        int var13 = 69 % ((23 - arg3) / 36);
        return var12;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V", line = 65)
    public static final void method725(boolean arg0) {
        if (class25.field295 != null) {
            class80 var1 = new class80();
            for (int var2 = 0; var2 < 13; var2++) {
                for (int var3 = 0; var3 < 13; var3++) {
                    class25.field295[var2][var3] = var1;
                }
            }
        }
        field1327++;
        if (arg0) {
            field1324 = (class140) null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V", line = 100)
    public static final void method726(int arg0, int arg1) {
        class42 var2 = class166.method1242(arg1, arg0, arg1 - 1249071395);
        field1330++;
        var2.method306((byte) -104);
    }
}
