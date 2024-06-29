import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public abstract class class126 {

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field1768 = 0;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field1771 = 0;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "Llm;")
    public static class347 field1766;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "[Lvi;")
    public static class309[] field1765;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)V", line = 5)
    public static final void method800(int arg0, int arg1) {
        if (arg1 > 117) {
            field1767++;
            class263 var2 = class47.method337(6, 0, arg0);
            var2.method1806(false);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V", line = 19)
    public static final void method801(int arg0, int arg1, int arg2) {
        if (arg0 <= 104) {
            return;
        }
        field1769++;
        class263 var3 = class47.method337(15, 0, 0);
        var3.method1807((byte) -124);
        var3.field3820 = arg2;
        var3.field3813 = arg1;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLjava/lang/String;)J", line = 38)
    public static final long method802(byte arg0, String arg1) {
        field1770++;
        long var2 = 0L;
        int var4 = -37 % ((arg0 - 50) / 39);
        int var5 = arg1.length();
        for (int var6 = 0; var6 < var5; var6++) {
            var2 *= 37L;
            char var7 = arg1.charAt(var6);
            if (var7 >= 'A' && var7 <= 'Z') {
                var2 += (long) (var7 - 64);
            } else if (var7 >= 'a' && var7 <= 'z') {
                var2 += (long) (var7 + 1 - 97);
            } else if (var7 >= '0' && var7 <= '9') {
                var2 += (long) (var7 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)V", line = 103)
    public static void method803(byte arg0) {
        field1766 = null;
        int var1 = 55 / ((arg0 - 13) / 41);
        field1765 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
    public abstract void method176(boolean arg0);

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(Lii;I)Leb;")
    public abstract class382 method117(class405 arg0, int arg1);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILii;)V")
    public abstract void method103(int arg0, class405 arg1);

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)Z")
    public abstract boolean method166(int arg0);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lii;IIIILnc;Z)V")
    public abstract void method169(class405 arg0, int arg1, int arg2, int arg3, int arg4, class126 arg5, boolean arg6);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIZLii;)Z")
    public abstract boolean method119(int arg0, int arg1, boolean arg2, class405 arg3);
}
