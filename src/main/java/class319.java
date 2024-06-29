import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public abstract class class319 extends class687 {

    @OriginalMember(owner = "client!qv", name = "w", descriptor = "Z")
    public volatile boolean field4364 = true;

    @OriginalMember(owner = "client!qv", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field4365 = new String[] { method2534(method2533("?O6}{")), method2534(method2533("?O6|{")) };

    @OriginalMember(owner = "client!qv", name = "y", descriptor = "Z")
    public static boolean field4359 = false;

    @OriginalMember(owner = "client!qv", name = "t", descriptor = "I")
    public static int field4357 = 0;

    @OriginalMember(owner = "client!qv", name = "u", descriptor = "Z")
    public static boolean field4362 = true;

    @OriginalMember(owner = "client!qv", name = "B", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!qv", name = "v", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!qv", name = "A", descriptor = "Ljha;")
    public static class315 field4356;

    @OriginalMember(owner = "client!qv", name = "z", descriptor = "Z")
    public boolean field4360;

    @OriginalMember(owner = "client!qv", name = "x", descriptor = "Z")
    public boolean field4361;

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "(I)I", line = 8)
    public static final int method2531(int arg0) {
        try {
            field4363++;
            class18 var1 = class236.field3418;
            boolean var2 = false;
            if (class451.field6612.field9134.method4717(3) != 0) {
                Canvas var3 = new Canvas();
                var3.setSize(100, 100);
                var2 = true;
                var1 = class325.method2569(var3, 0, null, null, 0, 0);
            }
            long var4 = class614.method4531(-46);
            for (int var6 = 0; var6 < 10000; var6++) {
                var1.method182(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
            }
            if (arg0 != 9714) {
                method2531(-87);
            }
            int var7 = (int) (class614.method4531(-122) - var4);
            var1.method121(100, 0, -64, 100, -16777216, 0);
            if (var2) {
                var1.method177((byte) -87);
            }
            return var7;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field4365[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V", line = 53)
    public static void method2532(int arg0) {
        try {
            field4356 = null;
            if (arg0 != 75) {
                method2532(34);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4365[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qv", name = "i", descriptor = "(I)[B")
    public abstract byte[] method2023(int arg0);

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "(I)I")
    public abstract int method2022(int arg0);

    @OriginalMember(owner = "client!qv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2533(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x53);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2534(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 78;
                    break;
                case 1:
                    var10005 = 57;
                    break;
                case 2:
                    var10005 = 24;
                    break;
                case 3:
                    var10005 = 57;
                    break;
                default:
                    var10005 = 83;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
