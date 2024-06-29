import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class337 {

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "[J")
    public static long[] field5277 = new long[100];

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "Lah;")
    public static class126 field5273;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "Lme;")
    public static class323 field5271;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "[Lwj;")
    public static class270[] field5276;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 14)
    public static final void method2338(int arg0) {
        field5272++;
        class229.field3646.method2176((byte) 108);
        if (arg0 != -16622) {
            field5278 = 82;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILl;II)[Lwj;", line = 30)
    public static final class270[] method2339(int arg0, class133 arg1, int arg2, int arg3) {
        if (arg0 >= -28) {
            method2341(-125);
        }
        field5274++;
        return class181.method1296(false, arg1, arg2, arg3) ? class48.method417((byte) 40) : null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 46)
    public static final void method2340(int arg0, boolean arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        field5270++;
        short[] var4 = new short[16];
        int var5 = arg1 ? 32768 : 0;
        int var6 = 0;
        int var7 = (arg1 ? class18.field245 : class205.field3079) + var5;
        for (int var8 = var5; var8 < var7; var8++) {
            class59 var9 = class173.method1248(var8, 125);
            if (var9.field954 && var9.method465((byte) -50).toLowerCase().indexOf(var3) != -1) {
                if (var6 >= 50) {
                    class121.field1849 = null;
                    class55.field921 = -1;
                    return;
                }
                if (var6 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var6; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var6++] = (short) var8;
            }
        }
        class55.field921 = var6;
        class120.field1836 = 0;
        String[] var12 = new String[class55.field921];
        class121.field1849 = var4;
        for (int var13 = arg0; var13 < class55.field921; var13++) {
            var12[var13] = class173.method1248(var4[var13], -126).method465((byte) -64);
        }
        class263.method1792(class121.field1849, (byte) 5, var12);
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V", line = 117)
    public static void method2341(int arg0) {
        field5276 = null;
        field5273 = null;
        if (arg0 < -110) {
            field5271 = null;
            field5277 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V", line = 137)
    public static final void method2342(int arg0, int arg1) {
        field5275++;
        if (arg1 > -74) {
            method2338(-5);
        }
        if (arg0 >= 0 && class175.field2646.length > arg0) {
            class175.field2646[arg0] = !class175.field2646[arg0];
        }
    }
}
