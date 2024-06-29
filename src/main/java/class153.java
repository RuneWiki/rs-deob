import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class153 {

    @OriginalMember(owner = "client!g", name = "b", descriptor = "[S")
    public static short[] field2589 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!g", name = "i", descriptor = "Lqd;")
    public static class40 field2596 = class147.method1106(" loggt sich ein)3", (byte) -91);

    @OriginalMember(owner = "client!g", name = "e", descriptor = "Lqd;")
    public static class40 field2592 = class147.method1106(" zuerst von Ihrer Freunde)2Liste(Q", (byte) -114);

    @OriginalMember(owner = "client!g", name = "j", descriptor = "J")
    public static long field2597 = 0L;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Z")
    public static boolean field2599 = false;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "Lqd;")
    public static class40 field2598 = class147.method1106("Mem:", (byte) -113);

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "Lce;")
    public static class239 field2594;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "[B")
    public static byte[] field2591;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([Lqd;B)Lqd;", line = 8)
    public static final class40 method1192(class40[] arg0, byte arg1) {
        int var2 = 4 % ((82 - arg1) / 39);
        field2588++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class298.method2035(arg0.length, (byte) -28, 0, arg0);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)I", line = 26)
    public static final int method1193(int arg0, int arg1) {
        field2593++;
        if (arg1 >= -119) {
            return 36;
        }
        class314 var2 = class292.method2009(arg0, -100);
        int var3 = var2.field5312;
        int var4 = var2.field5297;
        int var5 = var2.field5300;
        int var6 = class294.field4938[var5 - var4];
        return var6 & class192.field3098[var3] >> var4;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V", line = 57)
    public static void method1194(boolean arg0) {
        field2594 = null;
        if (!arg0) {
            return;
        }
        field2598 = null;
        field2591 = null;
        field2596 = null;
        field2589 = null;
        field2592 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 74)
    public static final void method1195(int arg0) {
        class112.field1942 = true;
        if (arg0 != 1120341478) {
            field2598 = (class40) null;
        }
        field2595++;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z[B)[B", line = 98)
    public static final byte[] method1196(boolean arg0, byte[] arg1) {
        int var2 = arg1.length;
        field2590++;
        byte[] var3 = new byte[var2];
        if (arg0) {
            return (byte[]) null;
        } else {
            class234.method1627(arg1, 0, var3, 0, var2);
            return var3;
        }
    }
}
