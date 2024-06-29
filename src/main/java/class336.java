import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class336 extends class183 {

    @OriginalMember(owner = "client!si", name = "t", descriptor = "I")
    public int field5063;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    public static int field5060 = -1;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "Lqc;")
    public static class99 field5061 = new class99(16);

    @OriginalMember(owner = "client!si", name = "u", descriptor = "I")
    public static int field5064 = 0;

    @OriginalMember(owner = "client!si", name = "v", descriptor = "J")
    public static long field5065 = 0L;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!si", name = "w", descriptor = "[[I")
    public static int[][] field5066;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V", line = 11)
    public static final void method2325(int arg0, int arg1) {
        field5056++;
        if (arg1 >= ~arg0 && arg0 < class36.field418.length) {
            class36.field418[arg0] = !class36.field418[arg0];
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 22)
    public static final int method2326(String arg0, int arg1) {
        field5058++;
        if (class132.field1811 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class132.field1811.field2397; var2++) {
            if (class39.method235(class170.method1199(true, " ", class132.field1811.field2390[var2], "<br>"), arg0, -127)) {
                return var2;
            }
        }
        if (arg1 != -1) {
            field5061 = (class99) null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V", line = 49)
    public static void method2327(boolean arg0) {
        field5066 = (int[][]) null;
        if (arg0) {
            field5061 = (class99) null;
        }
        field5061 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 63)
    public static final void method2328(int arg0, boolean arg1, String arg2) {
        field5062++;
        String var3 = arg2.toLowerCase();
        int var4 = 0;
        short[] var5 = new short[16];
        if (arg0 != 23461) {
            return;
        }
        for (int var6 = 0; var6 < class63.field824; var6++) {
            class198 var7 = class115.method854((byte) -82, var6);
            if ((!arg1 || var7.field2773) && var7.field2762 == -1 && var7.field2772 == -1 && var7.field2778 == 0 && var7.field2757.toLowerCase().indexOf(var3) != -1) {
                if (var4 >= 250) {
                    class1.field2 = null;
                    class153.field2129 = -1;
                    return;
                }
                if (var5.length <= var4) {
                    short[] var8 = new short[var5.length * 2];
                    for (int var9 = 0; var9 < var4; var9++) {
                        var8[var9] = var5[var9];
                    }
                    var5 = var8;
                }
                var5[var4++] = (short) var6;
            }
        }
        class1.field2 = var5;
        class153.field2129 = var4;
        class274.field4106 = 0;
        String[] var10 = new String[class153.field2129];
        for (int var11 = 0; var11 < class153.field2129; var11++) {
            var10[var11] = class115.method854((byte) -78, var5[var11]).field2757;
        }
        class302.method2058(class1.field2, -3139, var10);
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(II)Lte;", line = 142)
    public static final class309 method2329(int arg0, int arg1) {
        field5059++;
        class309 var2 = (class309) class148.field2053.method716((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class15.field173.method955(class253.method1733(false, arg1), class164.method1177(arg1, 255), -21853);
        if (arg0 >= -40) {
            field5065 = -17L;
        }
        class309 var4 = new class309();
        var4.field4672 = arg1;
        if (var3 != null) {
            var4.method2118(true, new class316(var3));
        }
        class148.field2053.method721((long) arg1, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IBIII)V", line = 169)
    public static final void method2330(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var5 = -120 / ((-arg1 - 31) / 50);
        if (class45.field553 != 0 && arg4 != 0 && class48.field591 < 50 && arg0 != -1) {
            class309.field4660[class48.field591] = arg0;
            class316.field4764[class48.field591] = arg4;
            class125.field1699[class48.field591] = arg3;
            class290.field4339[class48.field591] = null;
            class211.field3058[class48.field591] = 0;
            class185.field2547[class48.field591] = arg2;
            class48.field591++;
        }
        field5057++;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V", line = 193)
    public class336() {
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(I)V", line = 195)
    public class336(int arg0) {
        this.field5063 = arg0;
    }
}
