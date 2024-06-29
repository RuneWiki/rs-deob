import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class33 {

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public int field854 = 0;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public int field872 = 0;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Z")
    public static boolean field849 = false;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "Lke;")
    public static class65 field853 = class1.method17("Lade Sprites )2 ", -113);

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "[[B")
    public static byte[][] field862 = new byte[1000][];

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "Lke;")
    public static class65 field855 = class1.method17("Wen m-Ochten Sie von der Liste entfernen?", -118);

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Lke;")
    public static class65 field850 = class1.method17(": ", -114);

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field858 = 0;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "Lke;")
    public static class65 field864 = class1.method17("chatback", -114);

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    public static int field868 = 5063219;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "[I")
    public static int[] field870 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "Lke;")
    private static class65 field865 = class1.method17("as it was used to break our rules)3", -119);

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    public static int field871 = -1;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "Lke;")
    public static class65 field867 = field865;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public int field847;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public int field848;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public int field851;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public int field856;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public int field861;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "Ljd;")
    public static class58 field852;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Lae;")
    public class6 field857;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "Lpa;")
    public static class90 field873;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "[I")
    public static int[] field869;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "[Lkb;")
    public static class61[] field866;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V", line = 6)
    public static final void method258(byte arg0) {
        if (class130.field3157 != null) {
            class47 var1 = class130.field3157;
            synchronized (class130.field3157) {
                class130.field3157 = null;
            }
        }
        if (arg0 == 116) {
            field859++;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZI)V", line = 28)
    public static final void method259(int arg0, boolean arg1, int arg2) {
        field863++;
        long var3 = (long) ((arg0 << 16) + arg2);
        class110 var5 = (class110) class65.field1725.method861(var3, 113);
        if (var5 != null) {
            if (!arg1) {
                method261(101, -8, 124, 90, null);
            }
            class123.field2990.method394((byte) -114, var5);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V", line = 47)
    public static void method260(int arg0) {
        field852 = null;
        if (arg0 < 59) {
            return;
        }
        field850 = null;
        field867 = null;
        field862 = null;
        field869 = null;
        field864 = null;
        field873 = null;
        field855 = null;
        field853 = null;
        field866 = null;
        field865 = null;
        field870 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIILjd;)[B", line = 133)
    public static final byte[] method261(int arg0, int arg1, int arg2, int arg3, class58 arg4) {
        field860++;
        long var5 = ((long) arg3 << 32) + ((long) (arg1 << 16)) + (long) (arg1 * 37 + arg2 & 0xFFFF);
        if (class100.field2602 != null) {
            class72 var7 = (class72) class100.field2602.method833((byte) -53, var5);
            if (var7 != null) {
                return var7.field1887;
            }
        }
        byte[] var8 = arg4.method477(arg1, (byte) 127, arg2);
        if (var8 == null) {
            return null;
        }
        if (class100.field2602 != null) {
            class100.field2602.method836(var5, new class72(var8), true);
        }
        if (arg0 >= -46) {
            field868 = 98;
        }
        return var8;
    }
}
