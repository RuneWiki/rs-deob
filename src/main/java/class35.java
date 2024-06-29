import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class35 {

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Lgd;")
    private static class40 field883 = class14.method90(false, "flash1:");

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field892 = 0;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "Lgd;")
    public static class40 field886 = field883;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Lba;")
    public static class7 field885 = new class7(64);

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public static int field895 = 0;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "Lgd;")
    private static class40 field896 = class14.method90(false, " is already on your ignore list");

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "Lgd;")
    public static class40 field894 = field896;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "[Lrc;")
    public static class104[] field897 = new class104[2048];

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "Lde;")
    public static class24 field898 = new class24(4096);

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "Lde;")
    public static class24 field899 = new class24(4096);

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "[I")
    public static int[] field901 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    public static int field900 = -1;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public int field887;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public int field888;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public int field889;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public int field891;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "Ljava/awt/Font;")
    public static Font field893;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 8)
    public static void method219(int arg0) {
        field893 = null;
        field898 = null;
        field883 = null;
        field886 = null;
        field885 = null;
        if (arg0 >= -44) {
            return;
        }
        field899 = null;
        field901 = null;
        field896 = null;
        field897 = null;
        field894 = null;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V", line = 32)
    public static final void method220(int arg0) {
        class100.field2376.method292(-126);
        field884++;
        int var1 = class100.field2376.method298(1, 19600);
        if (var1 == 0) {
            return;
        }
        int var2 = class100.field2376.method298(2, 19600);
        if (var2 == 0) {
            class104.field2519[class44.field1114++] = 2047;
            return;
        }
        if (arg0 != 4) {
            method219(-122);
        }
        if (var2 == 1) {
            int var3 = class100.field2376.method298(3, 19600);
            class13.field332.method201(false, var3, false);
            int var4 = class100.field2376.method298(1, 19600);
            if (var4 == 1) {
                class104.field2519[class44.field1114++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class100.field2376.method298(3, arg0 + 19596);
            class13.field332.method201(true, var5, false);
            int var6 = class100.field2376.method298(3, 19600);
            class13.field332.method201(true, var6, false);
            int var7 = class100.field2376.method298(1, 19600);
            if (var7 == 1) {
                class104.field2519[class44.field1114++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class100.field2376.method298(7, 19600);
            int var9 = class100.field2376.method298(1, 19600);
            class99.field2361 = class100.field2376.method298(2, arg0 + 19596);
            int var10 = class100.field2376.method298(1, 19600);
            if (var10 == 1) {
                class104.field2519[class44.field1114++] = 2047;
            }
            int var11 = class100.field2376.method298(7, 19600);
            class13.field332.method203(true, var8, var9 == 1, var11);
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V", line = 124)
    public static final void method221(int arg0) {
        field882++;
        if (arg0 >= -93) {
            return;
        }
        int var1 = class100.field2376.method298(8, 19600);
        if (var1 < class1.field18) {
            for (int var2 = var1; var2 < class1.field18; var2++) {
                class132.field3211[class98.field2322++] = class77.field1787[var2];
            }
        }
        if (class1.field18 < var1) {
            throw new RuntimeException("gppov1");
        }
        class1.field18 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class77.field1787[var3];
            class96 var5 = class90.field2044[var4];
            int var6 = class100.field2376.method298(1, 19600);
            if (var6 == 0) {
                class77.field1787[class1.field18++] = var4;
                var5.field829 = class10.field242;
            } else {
                int var7 = class100.field2376.method298(2, 19600);
                if (var7 == 0) {
                    class77.field1787[class1.field18++] = var4;
                    var5.field829 = class10.field242;
                    class104.field2519[class44.field1114++] = var4;
                } else if (var7 == 1) {
                    class77.field1787[class1.field18++] = var4;
                    var5.field829 = class10.field242;
                    int var8 = class100.field2376.method298(3, 19600);
                    var5.method201(false, var8, false);
                    int var9 = class100.field2376.method298(1, 19600);
                    if (var9 == 1) {
                        class104.field2519[class44.field1114++] = var4;
                    }
                } else if (var7 == 2) {
                    class77.field1787[class1.field18++] = var4;
                    var5.field829 = class10.field242;
                    int var10 = class100.field2376.method298(3, 19600);
                    var5.method201(true, var10, false);
                    int var11 = class100.field2376.method298(3, 19600);
                    var5.method201(true, var11, false);
                    int var12 = class100.field2376.method298(1, 19600);
                    if (var12 == 1) {
                        class104.field2519[class44.field1114++] = var4;
                    }
                } else if (var7 == 3) {
                    class132.field3211[class98.field2322++] = var4;
                }
            }
        }
    }
}
