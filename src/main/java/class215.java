import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public abstract class class215 {

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field2881 = 0;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "[[B")
    public static byte[][] field2880 = new byte[1000][];

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "[Z")
    public static boolean[] field2883 = new boolean[5];

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "Lnb;")
    public static class318 field2882;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZI[BI)I")
    public abstract int method1356(boolean arg0, int arg1, byte[] arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
    public static final void method1357(int arg0) {
        field2885++;
        while (class389.field5816.method1936(8, class297.field4376) >= 15) {
            int var1 = class389.field5816.method1946(15, (byte) 120);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            class177 var3 = (class177) class271.field3550.method2002((byte) -106, (long) var1);
            if (var3 == null) {
                class53 var4 = new class53();
                var4.field7405 = var1;
                var3 = new class177(var4);
                class271.field3550.method2001(-107, var3, (long) var1);
                class13.field299[class378.field5678++] = var3;
                var2 = true;
            }
            class53 var5 = var3.field2476;
            class523.field7379[class155.field2213++] = var1;
            var5.field7354 = class332.field4830;
            if (var5.field805 != null && var5.field805.method446(false)) {
                class565.method3260(arg0, var5);
            }
            int var6 = class389.field5816.method1946(5, (byte) 127);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = (class389.field5816.method1946(3, (byte) 127) + 4 & 0x37400007) << 11;
            var5.method316(class563.field8235.method1089(class389.field5816.method1946(14, (byte) 121), false), (byte) 44);
            int var8 = class389.field5816.method1946(2, (byte) 125);
            int var9 = class389.field5816.method1946(1, (byte) 121);
            int var10 = class389.field5816.method1946(1, (byte) 123);
            if (var10 == 1) {
                class604.field8727[class12.field297++] = var1;
            }
            int var11 = class389.field5816.method1946(5, (byte) 123);
            var5.method2953((byte) 103, var5.field805.field1239);
            if (var11 > 15) {
                var11 -= 32;
            }
            var5.field7390 = var5.field805.field1184 << 3;
            if (var2) {
                var5.method2956(var7, true, arg0 ^ 0xFFFFFFE8);
            }
            var5.method314(var8, var5.method422((byte) -64), class321.field4681.field7429[0] + var11, 116, var9 == 1, class321.field4681.field7430[0] + var6);
            if (var5.field805.method446(false)) {
                class61.method381(var5.field7430[0], null, 0, var5.field7429[0], var5.field7905, null, 0, var5);
            }
        }
        if (arg0 == 0) {
            class389.field5816.method1935((byte) 101);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1358(int arg0, byte arg1, int arg2) {
        if (arg1 > -56) {
            return true;
        } else {
            field2879++;
            return (arg0 & 0x10000) != 0;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)Z")
    public abstract boolean method1359(int arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V")
    public static void method1360(int arg0) {
        field2883 = null;
        if (arg0 != 1) {
            method1360(61);
        }
        field2880 = null;
        field2882 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
    public abstract void method1361(byte arg0);

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)V")
    public abstract void method1362(byte arg0);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZII[B)V")
    public abstract void method1363(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException;
}
