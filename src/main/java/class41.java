import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class41 {

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public int field425 = -1;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "Lea;")
    public static class57 field430 = new class57(5000);

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "F")
    public static float field432 = 1024.0F;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "Z")
    public static boolean field431 = false;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public int field420;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public int field421;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public int field422;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public int field423;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public int field424;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public int field428;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
    public int field429;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "Lmc;")
    public static class316 field434;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V", line = 8)
    public static final void method195(int arg0, int arg1) {
        class114 var2 = class204.field2762;
        synchronized (class204.field2762) {
            class204.field2762.method614(-121, arg0);
        }
        int var3 = -107 % ((arg1 + 12) / 42);
        field433++;
        class114 var4 = class104.field1286;
        synchronized (class104.field1286) {
            class104.field1286.method614(-118, arg0);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V", line = 32)
    public static void method196(int arg0) {
        field430 = null;
        field434 = null;
        if (arg0 <= 84) {
            method196(-104);
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)I", line = 47)
    public static final int method197(int arg0, int arg1) {
        field426++;
        if (arg1 >= -74) {
            method196(83);
        }
        return arg0 & 0xFF;
    }
}
