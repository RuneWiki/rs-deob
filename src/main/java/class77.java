import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class77 {

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "[Ldf;")
    public static class51[] field1235 = new class51[500];

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "Ldf;")
    public static class51 field1241 = class46.method233(" GMT", 100);

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "[Ldf;")
    public static class51[] field1240 = new class51[8];

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "Lu;")
    public static class111 field1233;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "[I")
    public static int[] field1234;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BILkf;IIII)V")
    public static final void method549(byte arg0, int arg1, class170 arg2, int arg3, int arg4, int arg5, int arg6) {
        field1237++;
        boolean var7 = true;
        boolean var8 = false;
        boolean var9 = false;
        long var10 = 0L;
        if (arg1 == 0) {
            var10 = class75.method542(arg4, arg6, arg3);
        } else if (arg1 == 1) {
            var10 = class7.method32(arg4, arg6, arg3);
        } else if (arg1 == 2) {
            var10 = class98.method726(arg4, arg6, arg3);
        } else if (arg1 == 3) {
            var10 = class45.method230(arg4, arg6, arg3);
        }
        int var12 = ((int) var10 & 0x34B097) >> 20;
        int var13 = Integer.MAX_VALUE & (int) (var10 >>> 32);
        int var14 = (int) var10 >> 14 & 0x1F;
        class108 var15 = class41.method210(var13, (byte) 75);
        if (var15.method776(17)) {
            class219.method1507(arg6, arg4, var15, 9, arg3);
        }
        if (var10 != 0L) {
            if (arg1 == 0) {
                class119.method857(arg4, arg6, arg3);
                if (var15.field1779 != 0) {
                    arg2.method1189(var12, arg6, 2, var15.field1800, var14, arg3);
                }
            } else if (arg1 == 1) {
                class2.method3(arg4, arg6, arg3);
            } else if (arg1 == 2) {
                class37.method186(arg4, arg6, arg3);
                if (var15.field1779 != 0 && (var15.field1824 + arg6) < 104 && arg3 + var15.field1824 < 104 && (var15.field1807 + arg6) < 104 && var15.field1807 + arg3 < 104) {
                    arg2.method1196(arg6, var12, var15.field1807, (byte) 109, var15.field1824, var15.field1800, arg3);
                }
            } else if (arg1 == 3) {
                class85.method659(arg4, arg6, arg3);
                if (var15.field1779 == 1) {
                    arg2.method1193((byte) 118, arg6, arg3);
                }
            }
        }
        if (arg0 <= 89) {
            method550(46);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static void method550(int arg0) {
        field1241 = null;
        field1235 = null;
        field1240 = null;
        field1233 = null;
        field1234 = null;
        if (arg0 != -1) {
            field1241 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
    public static final void method551(byte arg0) {
        field1239++;
        Object var1 = class23.field355;
        synchronized (class23.field355) {
            if (arg0 != 30) {
                method551((byte) -2);
            }
            if (class239.field4163 != 0) {
                class239.field4163 = 1;
                try {
                    class23.field355.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
    }
}
