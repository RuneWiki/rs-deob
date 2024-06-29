import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class81 {

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public int field1234 = 0;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "Z")
    public boolean field1236 = false;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public int field1228 = 0;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field1227 = -1;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field1230 = 0;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "Z")
    public static boolean field1233 = false;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "Lrl;")
    public class207 field1235;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field1239;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "[[B")
    public static byte[][] field1240;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "[[[B")
    public static byte[][][] field1229;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)[Lag;", line = 7)
    public static final class123[] method597(byte arg0) {
        field1232++;
        class123[] var1 = new class123[class56.field740];
        if (arg0 != -70) {
            method597((byte) 120);
        }
        for (int var2 = 0; var2 < class56.field740; var2++) {
            var1[var2] = new class123(class163.field2659, class113.field1698, class163.field2657[var2], class162.field2647[var2], class244.field3885[var2], class21.field316[var2], class3.field20[var2], class305.field4754);
        }
        class17.method115((byte) -103);
        return var1;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILkb;Ljava/lang/String;)Ljg;", line = 32)
    public static final class315 method598(int arg0, class39 arg1, String arg2) {
        field1238++;
        int var3 = arg1.method266(-107, arg2);
        if (var3 == -1) {
            return new class315(0);
        }
        int[] var4 = arg1.method270(-111, var3);
        class315 var5 = new class315(var4.length);
        for (int var6 = arg0; var6 < var5.field4901; var6++) {
            class192 var7 = new class192(arg1.method250(true, var3, var4[var6]));
            var5.field4911[var6] = var7.method1355((byte) 65);
            var5.field4902[var6] = var7.method1377(true);
            var5.field4908[var6] = var7.method1354((byte) 121);
            var5.field4910[var6] = var7.method1354((byte) -125);
        }
        return var5;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BIILkb;)Lag;", line = 89)
    public static final class123 method599(byte arg0, int arg1, int arg2, class39 arg3) {
        field1237++;
        if (class288.method2026(arg1, arg2, arg3, -84)) {
            if (arg0 <= 31) {
                field1227 = -105;
            }
            return class163.method1130(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 103)
    public static final void method600(int arg0) {
        field1231++;
        class336.field5213.method1536(-76);
        int var1 = class336.field5213.method1535((byte) 111, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class336.field5213.method1535((byte) 71, 2);
        if (var2 == 0) {
            class318.field4946[class126.field1877++] = 2047;
        } else if (var2 == 1) {
            int var3 = class336.field5213.method1535((byte) 11, 3);
            class13.field159.method907(var3, 1, (byte) 127);
            int var4 = class336.field5213.method1535((byte) 84, 1);
            if (var4 == 1) {
                class318.field4946[class126.field1877++] = 2047;
            }
        } else if (var2 == 2) {
            if (class336.field5213.method1535((byte) 8, 1) == 1) {
                int var11 = class336.field5213.method1535((byte) 80, 3);
                class13.field159.method907(var11, 2, (byte) 127);
                int var12 = class336.field5213.method1535((byte) 31, 3);
                class13.field159.method907(var12, 2, (byte) 127);
            } else {
                int var10 = class336.field5213.method1535((byte) 17, 3);
                class13.field159.method907(var10, 0, (byte) 126);
            }
            int var13 = class336.field5213.method1535((byte) 57, 1);
            if (var13 == 1) {
                class318.field4946[class126.field1877++] = 2047;
            }
        } else if (var2 == 3) {
            int var5 = class336.field5213.method1535((byte) 44, 1);
            if (var5 == 1) {
                class318.field4946[class126.field1877++] = 2047;
            }
            int var6 = class336.field5213.method1535((byte) 90, 1);
            class148.field2209 = class336.field5213.method1535((byte) 6, 2);
            int var7 = class336.field5213.method1535((byte) 97, 7);
            int var8 = class336.field5213.method1535((byte) 61, 7);
            class13.field159.method2236(var8, var7, 18675, var6 == 1);
        } else {
            int var9 = 7 % ((52 - arg0) / 60);
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V", line = 190)
    public static void method601(int arg0) {
        if (arg0 <= -44) {
            field1229 = (byte[][][]) null;
            field1240 = (byte[][]) null;
        }
    }
}
