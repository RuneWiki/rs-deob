import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public abstract class class179 {

    @OriginalMember(owner = "client!di", name = "g", descriptor = "Lta;")
    public static class262 field2675 = new class262(4);

    @OriginalMember(owner = "client!di", name = "k", descriptor = "[B")
    public static byte[] field2679 = new byte[520];

    @OriginalMember(owner = "client!di", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field2682 = new String[1000];

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field2683 = 0;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "Ldd;")
    public static class134 field2677 = null;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "Z")
    public static boolean field2678 = false;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public int field2669;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public int field2670;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public int field2671;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public int field2673;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public int field2674;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public int field2676;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V")
    public abstract void method1113(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public static final void method1189(int arg0) {
        field2684++;
        if (class8.field182 == 5) {
            class8.field182 = 6;
            if (arg0 != 206474728) {
                method1192(-95, 77, 112);
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)V")
    public abstract void method1117(int arg0, int arg1);

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V")
    public static final void method1190(int arg0) {
        field2672++;
        if (arg0 <= 66) {
            method1192(-58, -124, 63);
        }
        for (int var1 = 0; var1 < class17.field269; var1++) {
            int var2 = class36.field576[var1];
            class28 var3 = class41.field675[var2];
            int var4 = class239.field3692.method333((byte) -59);
            if ((var4 & 0x1) != 0) {
                var4 += class239.field3692.method333((byte) -59) << 8;
            }
            class47.method388((byte) 69, var2, var3, var4);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V")
    public static void method1191(boolean arg0) {
        if (arg0) {
            method1191(false);
        }
        field2679 = null;
        field2682 = null;
        field2675 = null;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(III)V")
    public static final void method1192(int arg0, int arg1, int arg2) {
        field2681++;
        class241 var3 = class73.method575(arg1, -84);
        int var4 = var3.field3721;
        int var5 = var3.field3719;
        if (arg2 >= -114) {
            return;
        }
        int var6 = var3.field3720;
        int var7 = class196.field3090[var6 - var4];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var4;
        class53.method436(var5, arg0 << var4 & var8 | ~var8 & class30.field482[var5], (byte) -128);
    }
}
