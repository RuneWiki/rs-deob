import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class67 {

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "Z")
    public static boolean field1111 = true;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1113 = "Examine";

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    public static int field1116 = -1;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    public static int field1120 = 0;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "Llg;")
    public static class12 field1108;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "Lbg;")
    public static class172 field1110;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "[I")
    public static int[] field1109;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILjava/util/Random;)I")
    public static final int method469(int arg0, int arg1, Random arg2) {
        field1115++;
        if (arg1 <= arg0) {
            throw new IllegalArgumentException();
        } else if (class169.method1230(44, arg1)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var4 >= var3);
            return class133.method942(arg1, false, var4);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)Lhi;")
    public static final class26 method470(int arg0, int arg1) {
        field1119++;
        class26 var2 = (class26) class47.field796.method1261(arg0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class52.field877.method1680(class50.method350(arg1, -94), class192.method1359(arg1, arg0 ^ 0x7D), -115);
        class26 var4 = new class26();
        if (var3 != null) {
            var4.method147(new class162(var3), (byte) 83);
        }
        class47.field796.method1264(-1, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
    public static void method471(byte arg0) {
        field1110 = null;
        int var1 = -83 / ((arg0 + 66) / 53);
        field1109 = null;
        field1108 = null;
        field1113 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ldk;Ldk;I)V")
    public static final void method472(class251 arg0, class251 arg1, int arg2) {
        field1112++;
        class78.field1311 = class292.method1947(0, class49.field815, arg2 + 1999, arg0, arg1);
        class238.field3821 = (class217) class78.field1311;
        class88.field1443 = class292.method1947(0, class257.field4159, arg2 ^ arg2, arg0, arg1);
        class59.field967 = class292.method1947(0, class255.field4135, 0, arg0, arg1);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IB)Z")
    public static final boolean method473(int arg0, byte arg1) {
        field1118++;
        if (class251.field3983[arg0]) {
            return true;
        } else if (class126.field1988.method1685(arg0, (byte) 115)) {
            int var2 = 13 / ((arg1 + 42) / 38);
            int var3 = class126.field1988.method1678((byte) 94, arg0);
            if (var3 == 0) {
                class251.field3983[arg0] = true;
                return true;
            }
            if (class34.field519[arg0] == null) {
                class34.field519[arg0] = new class211[var3];
            }
            for (int var4 = 0; var4 < var3; var4++) {
                if (class34.field519[arg0][var4] == null) {
                    byte[] var5 = class126.field1988.method1680(var4, arg0, -90);
                    if (var5 != null) {
                        class211 var6 = class34.field519[arg0][var4] = new class211();
                        var6.field3375 = (arg0 << 16) + var4;
                        if (var5[0] == -1) {
                            var6.method1471(10, new class162(var5));
                        } else {
                            var6.method1465((byte) 62, new class162(var5));
                        }
                    }
                }
            }
            class251.field3983[arg0] = true;
            return true;
        } else {
            return false;
        }
    }
}
