import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class71 {

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "Lsk;")
    public static class199 field1078 = new class199(50);

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "[[I")
    public static int[][] field1083 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "Lmh;")
    public static class62 field1087 = class201.method1405(true, "p11_full");

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "Z")
    public static boolean field1085 = true;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "[I")
    public static int[] field1088 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "Lmh;")
    public static class62 field1086 = class201.method1405(true, "");

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V", line = 6)
    public static void method511(byte arg0) {
        field1083 = (int[][]) null;
        field1078 = null;
        field1088 = null;
        if (arg0 != -87) {
            method514(78, (byte) 83, 102, -93, 53);
        }
        field1086 = null;
        field1087 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V", line = 20)
    public static final void method512(int arg0) {
        if (arg0 != 16260) {
            field1086 = (class62) null;
        }
        class276.field4736 = class182.method1282(0, 8, 8, 4, true, 35, 0.4F, 2048);
        field1079++;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)V", line = 48)
    public static final void method513(byte arg0) {
        class170.field2772.field1476 = 0;
        class80.field1341 = false;
        class29.field372 = 0;
        class196.field3326 = 0;
        class70.field1071 = -1;
        class107.field1735 = -1;
        class75.field1223.field1476 = 0;
        class32.field436 = 0;
        class286.field4893 = -1;
        class60.field874 = 0;
        field1080++;
        class195.field3293 = 0;
        class152.field2398 = 0;
        class237.field4063 = -1;
        for (int var1 = 0; var1 < class5.field50.length; var1++) {
            if (class5.field50[var1] != null) {
                class5.field50[var1].field3848 = -1;
            }
        }
        for (int var2 = 0; var2 < class301.field5186.length; var2++) {
            if (class301.field5186[var2] != null) {
                class301.field5186[var2].field3848 = -1;
            }
        }
        class220.method1569(0);
        class21.field220 = 1;
        class276.method1889(-128, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class220.field3784[var3] = true;
        }
        class278.method1903(-62);
        if (arg0 != -7) {
            field1085 = false;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IBIII)V", line = 106)
    public static final void method514(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var5 = 92 / ((52 - arg1) / 37);
        if (class99.field1630 <= arg4 && arg4 <= class81.field1348) {
            int var6 = class4.method17(class176.field2819, -16168, class52.field755, arg0);
            int var7 = class4.method17(class176.field2819, -16168, class52.field755, arg3);
            class229.method1618((byte) -103, arg4, var7, var6, arg2);
        }
        field1081++;
    }
}
