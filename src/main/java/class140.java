import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class140 {

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "Lbh;")
    private class538 field1921 = new class538(64);

    @OriginalMember(owner = "client!eq", name = "v", descriptor = "I")
    public int field1937 = 0;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "Lwu;")
    private class557 field1919;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
    public int field1924;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "Lag;")
    public static class214 field1917 = new class214(9, 2);

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "[S")
    private static short[] field1925 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "[S")
    private static short[] field1927 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!eq", name = "u", descriptor = "[S")
    private static short[] field1936 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "[S")
    private static short[] field1933 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "[[S")
    public static short[][] field1932 = new short[][] { field1933, field1927, field1936, field1925 };

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "F")
    public static float field1928;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!eq", name = "t", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "Lda;")
    public static class400 field1926;

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "Z")
    public static boolean field1929;

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "[[Lig;")
    public static class674[][] field1931;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
    public final void method902(int arg0) {
        field1923++;
        class538 var2 = this.field1921;
        synchronized (this.field1921) {
            this.field1921.method3202((byte) 127);
        }
        int var3 = -125 % ((55 - arg0) / 37);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BI)Lbd;")
    public final class552 method903(byte arg0, int arg1) {
        field1934++;
        class538 var3 = this.field1921;
        class552 var4;
        synchronized (this.field1921) {
            var4 = (class552) this.field1921.method3200((long) arg1, -19983);
            int var5 = -34 % (-arg0 / 62);
        }
        if (var4 != null) {
            return var4;
        }
        class557 var6 = this.field1919;
        byte[] var7;
        synchronized (this.field1919) {
            var7 = this.field1919.method3322(4, arg1, (byte) 125);
        }
        class552 var8 = new class552();
        var8.field7799 = arg1;
        var8.field7801 = this;
        if (var7 != null) {
            var8.method3298(new class26(var7), 0);
        }
        var8.method3294((byte) -60);
        class538 var9 = this.field1921;
        synchronized (this.field1921) {
            this.field1921.method3199((byte) 78, var8, (long) arg1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IZ)Z")
    public static final boolean method904(int arg0, boolean arg1) {
        if (arg1) {
            method904(33, true);
        }
        field1935++;
        return arg0 == 3 || arg0 == 4;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IB)V")
    public final void method905(int arg0, byte arg1) {
        field1916++;
        class538 var3 = this.field1921;
        synchronized (this.field1921) {
            this.field1921.method3204((byte) 112, arg0);
        }
        if (arg1 != 110) {
            field1932 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)V")
    public static void method906(boolean arg0) {
        if (!arg0) {
            method904(-79, true);
        }
        field1936 = null;
        field1927 = null;
        field1917 = null;
        field1926 = null;
        field1933 = null;
        field1925 = null;
        field1931 = null;
        field1932 = null;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILjava/lang/String;IBI)V")
    public static final void method907(int arg0, String arg1, int arg2, byte arg3, int arg4) {
        field1922++;
        class712 var5 = class654.method3778((byte) -98, arg4, arg0);
        if (var5 == null) {
            return;
        }
        if (var5.field9946 != null) {
            class700 var6 = new class700();
            var6.field9749 = arg2;
            var6.field9756 = arg1;
            var6.field9745 = var5;
            var6.field9757 = var5.field9946;
            class318.method1840(var6);
        }
        if (class213.field3004 != 10 || !client.method2675(var5).method649(arg2 - 1, (byte) -114)) {
            return;
        }
        if (arg2 == 1) {
            class231.field3207++;
            class120 var7 = class292.method1716(class608.field8668, true, class439.field6023);
            class740.method4127(var5.field9953, var7, (byte) 125, arg0, arg4);
            class471.method2805(113, var7);
        }
        if (arg2 == 2) {
            class242.field3380++;
            class120 var8 = class292.method1716(class608.field8668, true, class596.field8580);
            class740.method4127(var5.field9953, var8, (byte) 121, arg0, arg4);
            class471.method2805(90, var8);
        }
        if (arg2 == 3) {
            class501.field7006++;
            class120 var9 = class292.method1716(class608.field8668, true, class23.field257);
            class740.method4127(var5.field9953, var9, (byte) -84, arg0, arg4);
            class471.method2805(99, var9);
        }
        int var10 = 93 % ((arg3 + 20) / 60);
        if (arg2 == 4) {
            class654.field9229++;
            class120 var11 = class292.method1716(class608.field8668, true, class735.field10290);
            class740.method4127(var5.field9953, var11, (byte) -16, arg0, arg4);
            class471.method2805(118, var11);
        }
        if (arg2 == 5) {
            class471.field6443++;
            class120 var12 = class292.method1716(class608.field8668, true, class122.field1673);
            class740.method4127(var5.field9953, var12, (byte) 114, arg0, arg4);
            class471.method2805(122, var12);
        }
        if (arg2 == 6) {
            class16.field210++;
            class120 var13 = class292.method1716(class608.field8668, true, class16.field209);
            class740.method4127(var5.field9953, var13, (byte) 120, arg0, arg4);
            class471.method2805(121, var13);
        }
        if (arg2 == 7) {
            class88.field1206++;
            class120 var14 = class292.method1716(class608.field8668, true, class568.field8060);
            class740.method4127(var5.field9953, var14, (byte) 122, arg0, arg4);
            class471.method2805(126, var14);
        }
        if (arg2 == 8) {
            class249.field3469++;
            class120 var15 = class292.method1716(class608.field8668, true, class409.field5690);
            class740.method4127(var5.field9953, var15, (byte) 113, arg0, arg4);
            class471.method2805(94, var15);
        }
        if (arg2 == 9) {
            class637.field9054++;
            class120 var16 = class292.method1716(class608.field8668, true, class261.field3564);
            class740.method4127(var5.field9953, var16, (byte) 10, arg0, arg4);
            class471.method2805(94, var16);
        }
        if (arg2 == 10) {
            class485.field6553++;
            class120 var17 = class292.method1716(class608.field8668, true, class125.field1704);
            class740.method4127(var5.field9953, var17, (byte) 9, arg0, arg4);
            class471.method2805(110, var17);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V")
    public final void method908(byte arg0) {
        field1918++;
        if (arg0 != -49) {
            field1929 = true;
        }
        class538 var2 = this.field1921;
        synchronized (this.field1921) {
            this.field1921.method3210(false);
        }
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lwj;ILwu;)V")
    public class140(class121 arg0, int arg1, class557 arg2) {
        this.field1919 = arg2;
        this.field1924 = this.field1919.method3333(4, 3443);
    }
}
