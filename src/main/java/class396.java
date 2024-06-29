import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class396 {

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "Lus;")
    public static class328 field5512 = new class328(83, -1);

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "Ld;")
    public static class96 field5513;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(IB)Lofa;", line = 5)
    public static final class139 method2358(int arg0, byte arg1) {
        field5511++;
        int var2 = -92 % ((arg1 + 61) / 34);
        class139[] var3 = class643.method3495(19337);
        for (int var4 = 0; var4 < var3.length; var4++) {
            class139 var5 = var3[var4];
            if (var5.field1660 == arg0) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)V", line = 31)
    public static void method2359(byte arg0) {
        int var1 = -64 % ((62 - arg0) / 45);
        field5512 = null;
        field5513 = null;
    }
}
