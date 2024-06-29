import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class428 {

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "Lcb;")
    public static class631 field6275 = new class631(22, 7);

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "[S")
    public static short[] field6272;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)Lrf;")
    public static final class750 method2668(int arg0) {
        if (arg0 < 96) {
            field6275 = null;
        }
        field6274++;
        class750 var1 = (class750) class258.field4046.method3271((byte) 127);
        if (var1 == null) {
            return new class750();
        } else {
            class505.field7369--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)V")
    public static void method2669(int arg0) {
        field6272 = null;
        field6275 = null;
        if (arg0 >= -121) {
            method2670(null, true, 59);
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    public static final void method2670(String arg0, boolean arg1, int arg2) {
        String var3 = arg0.toLowerCase();
        field6273++;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = (arg1 ? class536.field7684.field3417 : class536.field7684.field3411) + var6;
        int var8 = -2 / ((49 - arg2) / 32);
        for (int var9 = var6; var9 < var7; var9++) {
            class660 var12 = class536.field7684.method1493(1, var9);
            if (var12.field9392 && var12.method3719(false).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class112.field1732 = null;
                    class15.field155 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var13 = new short[var4.length * 2];
                    for (int var14 = 0; var14 < var5; var14++) {
                        var13[var14] = var4[var14];
                    }
                    var4 = var13;
                }
                var4[var5++] = (short) var9;
            }
        }
        class112.field1732 = var4;
        class15.field155 = var5;
        class210.field3501 = 0;
        String[] var10 = new String[class15.field155];
        for (int var11 = 0; var11 < class15.field155; var11++) {
            var10[var11] = class536.field7684.method1493(1, var4[var11]).method3719(false);
        }
        class592.method3394(var10, class112.field1732, 0);
    }
}
