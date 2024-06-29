import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class38 extends class108 {

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "I")
    public int field515;

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "I")
    public int field513;

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "Lpp;")
    public static class464 field511 = new class464(15, 18);

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "[I")
    public static int[] field514;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[B)[B", line = 3)
    public static final byte[] method326(int arg0, byte[] arg1) {
        field512++;
        class268 var2 = new class268(arg1);
        int var3 = var2.method1738(255);
        int var4 = var2.method1748(-49);
        if (arg0 > var4 || class314.field4591 != 0 && var4 > class314.field4591) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1695(var5, (byte) -52, var4, 0);
            return var5;
        } else {
            int var6 = var2.method1748(-111);
            if (var6 < 0 || class314.field4591 != 0 && var6 > class314.field4591) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class11.method62(var7, var6, arg1, var4, 9);
            } else {
                class161 var8 = class417.field6143;
                synchronized (class417.field6143) {
                    class417.field6143.method1129((byte) -61, var7, var2);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)V", line = 62)
    public static void method327(boolean arg0) {
        field514 = null;
        field511 = null;
        if (!arg0) {
            field511 = null;
        }
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(II)V", line = 78)
    public class38(int arg0, int arg1) {
        this.field515 = arg0;
        this.field513 = arg1;
    }
}
