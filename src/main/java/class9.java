import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class9 {

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Lec;")
    public static class32 field162 = class73.method594("m-Ochte mit Ihnen handeln)3", true);

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "Lja;")
    public static class63 field164 = new class63(64);

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field166 = 0;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "Lec;")
    private static class32 field169 = class73.method594("Loading interfaces )2 ", true);

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "Lec;")
    public static class32 field167 = field169;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "[I")
    public static int[] field160;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "[Lh;")
    public static class49[] field168;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
    public static final void method54(byte arg0) {
        field161++;
        int var1 = class158.field3614.method353(8, (byte) 69);
        if (class62.field1405 > var1) {
            for (int var2 = var1; var2 < class62.field1405; var2++) {
                class27.field495[class102.field2393++] = class137.field3189[var2];
            }
        }
        if (class62.field1405 < var1) {
            throw new RuntimeException("gppov1");
        }
        class62.field1405 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class137.field3189[var3];
            class70 var5 = class52.field1176[var4];
            int var6 = class158.field3614.method353(1, (byte) 69);
            if (var6 == 0) {
                class137.field3189[class62.field1405++] = var4;
                var5.field2715 = class140.field3219;
            } else {
                int var7 = class158.field3614.method353(2, (byte) 69);
                if (var7 == 0) {
                    class137.field3189[class62.field1405++] = var4;
                    var5.field2715 = class140.field3219;
                    class62.field1419[class61.field1353++] = var4;
                } else if (var7 == 1) {
                    class137.field3189[class62.field1405++] = var4;
                    var5.field2715 = class140.field3219;
                    int var8 = class158.field3614.method353(3, (byte) 69);
                    var5.method902(var8, false, 0);
                    int var9 = class158.field3614.method353(1, (byte) 69);
                    if (var9 == 1) {
                        class62.field1419[class61.field1353++] = var4;
                    }
                } else if (var7 == 2) {
                    class137.field3189[class62.field1405++] = var4;
                    var5.field2715 = class140.field3219;
                    int var10 = class158.field3614.method353(3, (byte) 69);
                    var5.method902(var10, true, 0);
                    int var11 = class158.field3614.method353(3, (byte) 69);
                    var5.method902(var11, true, 0);
                    int var12 = class158.field3614.method353(1, (byte) 69);
                    if (var12 == 1) {
                        class62.field1419[class61.field1353++] = var4;
                    }
                } else if (var7 == 3) {
                    class27.field495[class102.field2393++] = var4;
                }
            }
        }
        if (arg0 <= 92) {
            method59(-22L, 38);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lea;I)V")
    public static final void method55(class30 arg0, int arg1) {
        if (arg1 != 8) {
            method56((byte) 73);
        }
        class129.field2972 = arg0;
        field165++;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V")
    public static void method56(byte arg0) {
        field168 = null;
        field164 = null;
        field169 = null;
        field167 = null;
        field162 = null;
        field160 = null;
        if (arg0 != -68) {
            field169 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public abstract void method57(int arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)I")
    public abstract int method58(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(JI)Lec;")
    public static final class32 method59(long arg0, int arg1) {
        field159++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            if (arg1 != 1) {
                method54((byte) 41);
            }
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var3--;
                var6[var3] = class29.field519[(int) (var8 - arg0 * 37L)];
            }
            class32 var7 = new class32();
            var7.field618 = var6;
            var7.field674 = var6.length;
            return var7;
        }
    }
}
