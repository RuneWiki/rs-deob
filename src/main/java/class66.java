import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public abstract class class66 extends class301 {

    @OriginalMember(owner = "client!il", name = "w", descriptor = "Z")
    public volatile boolean field1243 = true;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "[I")
    public static int[] field1246 = new int[128];

    @OriginalMember(owner = "client!il", name = "C", descriptor = "Ljava/lang/String;")
    public static String field1249 = "flash3:";

    @OriginalMember(owner = "client!il", name = "x", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!il", name = "B", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "Lne;")
    public static class262 field1245;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "Z")
    public boolean field1242;

    @OriginalMember(owner = "client!il", name = "A", descriptor = "Z")
    public boolean field1247;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(B)V", line = 8)
    public static void method522(byte arg0) {
        field1246 = null;
        int var1 = -80 % ((arg0 + 40) / 50);
        field1249 = null;
        field1245 = null;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(II)Lno;", line = 39)
    public static final class5 method523(int arg0, int arg1) {
        class5 var2 = (class5) class229.field3755.method893((long) arg1, arg0 + 16712023);
        if (arg0 != -16711936) {
            field1249 = (String) null;
        }
        field1250++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class76.field1373.method1404(32, arg1, (byte) -65);
        class5 var4 = new class5();
        if (var3 != null) {
            var4.method42((byte) -57, new class146(var3));
        }
        var4.method41((byte) 82);
        class229.field3755.method888((long) arg1, var4, 120);
        return var4;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III)V", line = 65)
    public static final void method524(int arg0, int arg1, int arg2) {
        if (~class202.field3390 < arg2) {
            class37.method271(class202.field3390, true);
            class202.field3390 = 0;
        }
        field1244++;
        short var3 = 256;
        int var4 = 0;
        int var5 = 0;
        int var6 = class270.field4406 * arg1;
        for (int var7 = 1; var7 < var3 - 1; var7++) {
            int var8 = (var3 - var7) * class7.field254[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class349.field5591[var4++];
                int var11 = class270.field4403[arg0 + (var6++)];
                if (var10 == 0) {
                    class253.field4158.field4697[var5++] = var11;
                } else {
                    int var12 = var10 + 18;
                    int var13 = 256 - var10 - 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = class300.field4886[var10];
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    class253.field4158.field4697[var5++] = class83.method613(16711680, class83.method613(65280, var14) * var12 + (var13 * class83.method613(var11, 65280))) + class83.method613(-16711936, class83.method613(var14, 16711935) * var12 + (var13 * class83.method613(var11, 16711935))) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class253.field4158.field4697[var5++] = class270.field4403[arg0 + (var6++)];
            }
            var6 += class270.field4406 - 128;
        }
        if (class241.field4016) {
            class337.method2372(class253.field4158.field4697, arg0, arg1, class253.field4158.field1353, class253.field4158.field1356);
        } else {
            class253.field4158.method572(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(II)I", line = 150)
    public static final int method525(int arg0, int arg1) {
        field1248++;
        return arg0 == -1 ? arg1 >>> 8 : -79;
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(I)[B")
    public abstract byte[] method442(int arg0);

    @OriginalMember(owner = "client!il", name = "e", descriptor = "(I)I")
    public abstract int method447(int arg0);
}
