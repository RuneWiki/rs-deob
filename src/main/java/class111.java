import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class111 {

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "Lao;")
    public static class191 field1479 = new class191(68, 6);

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field1481 = 0;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Ld;")
    public static class104 field1480 = new class104("runescape", 0);

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)I", line = 4)
    public static final int method682(int arg0, int arg1) {
        field1478++;
        int var8 = arg1 - 1;
        int var2 = var8 | var8 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        int var7 = 92 % ((-arg0 - 64) / 60);
        return var6 + 1;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V", line = 26)
    public static void method683(boolean arg0) {
        if (arg0) {
            field1480 = null;
        }
        field1479 = null;
        field1480 = null;
    }
}
