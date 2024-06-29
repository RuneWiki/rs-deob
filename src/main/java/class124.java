import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class124 {

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "Z")
    public static boolean field1864 = false;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
    public static int field1866 = 0;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field1865 = new String[200];

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "Lkj;")
    public static class525 field1869 = new class525();

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "[Lf;")
    public static class702[] field1863;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)Z")
    public static final boolean method943(int arg0) {
        if (arg0 >= -108) {
            method943(-49);
        }
        field1870++;
        try {
            return class240.method1640(13445);
        } catch (IOException var4) {
            class421.method2529((byte) 80);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class312.field4616 == null ? -1 : class312.field4616.method3674((byte) 47)) + "," + (class139.field2017 == null ? -1 : class139.field2017.method3674((byte) 117)) + "," + (class164.field2361 == null ? -1 : class164.field2361.method3674((byte) 49)) + " - " + class418.field6098 + "," + (class648.field9106.field6271[0] + class109.field1672) + "," + (class648.field9106.field6262[0] + class203.field2874) + " - ";
            for (int var3 = 0; var3 < class418.field6098 && var3 < 50; var3++) {
                var2 = var2 + class523.field7392.field9796[var3] + ",";
            }
            class699.method3896(126, var5, var2);
            class88.method764(0, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V")
    public static void method944(byte arg0) {
        field1863 = null;
        if (arg0 >= 51) {
            field1869 = null;
            field1865 = null;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZIIIII)V")
    public static final void method945(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        field1867++;
        if (arg4 < 1) {
            arg4 = 1;
        }
        int var6 = arg2 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = class139.field2031 + ((class416.field6044 - class139.field2031) * var6 / 100);
        if (var7 < class690.field9708) {
            var7 = class690.field9708;
        } else if (class413.field6012 < var7) {
            var7 = class413.field6012;
        }
        int var8 = arg2 * var7 * 512 / (arg4 * 334);
        if (class55.field1076 > var8) {
            short var9 = class55.field1076;
            var7 = arg4 * 334 * var9 / (arg2 * 512);
            if (class413.field6012 < var7) {
                var7 = class413.field6012;
                int var10 = arg2 * 512 * var7 / (var9 * 334);
                int var11 = (arg4 - var10) / 2;
                if (arg0) {
                    class282.field4228.method152();
                    class282.field4228.method1150(var11, arg5, arg1, -1, -16777216, arg2);
                    class282.field4228.method1150(var11, arg5, arg1 + arg4 - var11, -1, -16777216, arg2);
                }
                arg1 += var11;
                arg4 -= var11 * 2;
            }
        } else if (class296.field4367 < var8) {
            short var12 = class296.field4367;
            var7 = arg4 * 334 * var12 / (arg2 * 512);
            if (class690.field9708 > var7) {
                var7 = class690.field9708;
                int var13 = arg4 * var12 * 334 / (var7 * 512);
                int var14 = (arg2 - var13) / 2;
                if (arg0) {
                    class282.field4228.method152();
                    class282.field4228.method1150(arg4, arg5, arg1, -1, -16777216, var14);
                    class282.field4228.method1150(arg4, arg5 + arg2 - var14, arg1, -1, -16777216, var14);
                }
                arg2 -= var14 * 2;
                arg5 += var14;
            }
        }
        class56.field1094 = (short) arg2;
        class386.field5435 = arg1;
        class190.field2745 = arg5;
        class701.field9901 = arg2 * var7 / 334;
        class626.field8769 = (short) arg4;
        if (arg3 != -16777216) {
            method944((byte) -22);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(III)Lsw;")
    public static final class701 method946(int arg0, int arg1, int arg2) {
        class40 var3 = class153.field2210[arg0][arg1][arg2];
        return var3 == null || var3.field663 == null ? null : var3.field663;
    }
}
