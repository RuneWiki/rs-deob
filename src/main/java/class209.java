import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public abstract class class209 {

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "[I")
    public static int[] field2476 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
    public static int field2475 = 0;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(Loa;I)Lqt;")
    public abstract class595 method6(class650 arg0, int arg1);

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "(B)V")
    public abstract void method140(byte arg0);

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1231(byte[] arg0, int arg1) {
        field2477++;
        class572 var2 = new class572(arg0);
        int var3 = var2.method3097((byte) 12);
        int var4 = var2.method3064(-2031091464);
        if (var4 < 0 || class653.field8906 != 0 && var4 > class653.field8906) {
            throw new RuntimeException();
        } else if (~var3 == arg1) {
            byte[] var8 = new byte[var4];
            var2.method3081(var4, -24643, var8, 0);
            return var8;
        } else {
            int var5 = var2.method3064(-2031091464);
            if (var5 < 0 || !(class653.field8906 == 0 || var5 <= class653.field8906)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class658.method3670(var6, var5, arg0, var4, 9);
            } else {
                class696 var7 = class703.field9833;
                synchronized (class703.field9833) {
                    class703.field9833.method3849(var2, var6, (byte) -29);
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(BILoa;I)Z")
    public abstract boolean method8(byte arg0, int arg1, class650 arg2, int arg3);

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "(I)Z")
    public abstract boolean method137(int arg0);

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(Loa;B)V")
    public abstract void method7(class650 arg0, byte arg1);

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZLoa;Lnt;IIII)V")
    public abstract void method135(boolean arg0, class650 arg1, class209 arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILoa;)Lww;")
    public abstract class686 method11(int arg0, class650 arg1);

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "(I)V")
    public static void method1232(int arg0) {
        field2476 = null;
        if (arg0 < 102) {
            field2476 = null;
        }
    }
}
