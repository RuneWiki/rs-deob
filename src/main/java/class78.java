import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class78 extends class89 {

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "Lda;")
    public static class275 field1290 = class255.method1672(103, "null");

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "Lda;")
    public static class275 field1291 = class255.method1672(127, "leuchten3:");

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "Lda;")
    public static class275 field1289 = class255.method1672(126, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "I")
    public static int field1295 = 0;

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "[[B")
    public static byte[][] field1293 = new byte[250][];

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1288++;
        int var9 = arg0 - arg7;
        int var10 = arg4 - arg1;
        int var11 = (arg5 - arg6 << 16) / var9;
        if (arg2 == -25304) {
            int var12 = (arg3 - arg8 << 16) / var10;
            class44.method263(var12, true, 0, arg7, var11, arg0, arg6, arg1, arg8, arg4, 0);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(JI)V")
    public static final void method511(long arg0, int arg1) {
        field1292++;
        if ((long) arg1 == arg0) {
            return;
        }
        if (class16.field240 >= 100) {
            class277.method1874(class73.field1187, class79.field1301, 0, true);
            return;
        }
        class275 var3 = class181.method1212(0, arg0).method1850(97);
        for (int var4 = 0; var4 < class16.field240; var4++) {
            if (class139.field2440[var4] == arg0) {
                class277.method1874(class197.method1291(new class275[] { var3, class89.field1520 }, -30025), class79.field1301, 0, true);
                return;
            }
        }
        for (int var5 = 0; var5 < class63.field1053; var5++) {
            if (class135.field2393[var5] == arg0) {
                class277.method1874(class197.method1291(new class275[] { class82.field1339, var3, class84.field1371 }, -30025), class79.field1301, 0, true);
                return;
            }
        }
        if (var3.method1828(true, class66.field1094.field1910)) {
            class277.method1874(class45.field753, class79.field1301, 0, true);
            return;
        }
        class12.field186++;
        class139.field2440[class16.field240] = arg0;
        class165.field2875[class16.field240++] = class181.method1212(0, arg0);
        class156.field2753 = class209.field3533;
        class149.field2597.method526((byte) -85, 95);
        class149.field2597.method560(arg0, -105);
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
    public class78() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)V")
    public static void method512(byte arg0) {
        field1291 = null;
        int var1 = 111 / ((-arg0 - 34) / 62);
        field1289 = null;
        field1290 = null;
        field1293 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        field1294++;
        if (arg1) {
            method510(100, 2, 15, 120, 87, 26, -70, 49, -106);
        }
        return class185.field3172;
    }
}
