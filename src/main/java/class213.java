import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class213 {

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Lge;")
    public static class72 field3200 = null;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field3203 = 1;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field3211 = 2;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Lhc;")
    public static class235 field3204;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Lhc;")
    public static class235 field3207;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)[B")
    public static final byte[] method1388(int arg0, int arg1) {
        field3209++;
        class231 var2 = (class231) class163.field2261.method961((long) arg0, 9156);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class47.method310(var7, (byte) -40, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class231(var3);
            class163.field2261.method957(21915, (long) arg0, var2);
        }
        return arg1 == 512 ? var2.field3493 : null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)Lql;")
    public static final class224 method1389(int arg0) {
        field3208++;
        class224 var1 = new class224(34);
        var1.method1447(arg0, arg0 + 17363461);
        var1.method1447(class266.field3984, 17363472);
        var1.method1447(class251.field3847 ? 1 : 0, arg0 + 17363461);
        var1.method1447(class148.field2048 ? 1 : 0, arg0 ^ 0x108F21B);
        var1.method1447(class75.field1053 ? 1 : 0, 17363472);
        var1.method1447(class86.field1174 ? 1 : 0, 17363472);
        var1.method1447(class246.field3763 ? 1 : 0, 17363472);
        var1.method1447(class245.field3744 ? 1 : 0, 17363472);
        var1.method1447(class212.field3187 ? 1 : 0, 17363472);
        var1.method1447(class29.field390 ? 1 : 0, 17363472);
        var1.method1447(field3211, 17363472);
        var1.method1447(class141.field1957 ? 1 : 0, 17363472);
        var1.method1447(class208.field2951 ? 1 : 0, 17363472);
        var1.method1447(class41.field617 ? 1 : 0, 17363472);
        var1.method1447(class77.field1079, arg0 + 17363461);
        var1.method1447(class261.field3954 ? 1 : 0, 17363472);
        var1.method1447(class205.field2860, 17363472);
        var1.method1447(class168.field2312, 17363472);
        var1.method1447(class122.field1701, arg0 ^ 0x108F21B);
        var1.method1470(393660232, class108.field1501);
        var1.method1470(393660232, class30.field408);
        var1.method1447(class97.method641(), 17363472);
        var1.method1435(-122, class254.field3899);
        var1.method1447(class221.field3321, 17363472);
        var1.method1447(class235.field3553 ? 1 : 0, 17363472);
        var1.method1447(class297.field4681 ? 1 : 0, 17363472);
        var1.method1447(class219.field3294, arg0 + 17363461);
        var1.method1447(class34.field529 ? 1 : 0, arg0 ^ 0x108F21B);
        var1.method1447(class59.field844 ? 1 : 0, 17363472);
        return var1;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V")
    public static final void method1390(int arg0, int arg1, int arg2) {
        field3205++;
        if (arg2 != 1) {
            field3211 = -12;
        }
        class280 var3 = class181.method1180(arg0, 0, 5);
        var3.method1876(1840457248);
        var3.field4330 = arg1;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(III)I")
    public static final int method1391(int arg0, int arg1, int arg2) {
        if (arg2 <= 50) {
            return -104;
        }
        field3212++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lwb;I)V")
    public static final void method1392(class27 arg0, int arg1) {
        class13.method81(arg0, 200000, (byte) -104);
        int var2 = 42 / ((arg1 - 16) / 63);
        field3201++;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public static void method1393(int arg0) {
        field3200 = null;
        field3207 = null;
        field3204 = null;
        if (arg0 != 4363) {
            method1390(1, -81, 44);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1394(String arg0, String arg1, int arg2, String arg3) {
        field3202++;
        if (arg2 != 65408) {
            method1390(4, -97, -45);
        }
        for (int var4 = arg3.indexOf(arg1); var4 != -1; var4 = arg3.indexOf(arg1, var4 + arg0.length())) {
            arg3 = arg3.substring(0, var4) + arg0 + arg3.substring(var4 + arg1.length());
        }
        return arg3;
    }
}
