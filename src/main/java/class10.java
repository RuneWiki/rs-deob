import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ai")
public class class10 {

    @OriginalMember(owner = "ai", name = "b", descriptor = "Llf;")
    private static class109 field159 = class35.method275("Welcome to RuneScape", 2);

    @OriginalMember(owner = "ai", name = "e", descriptor = "I")
    public static int field162 = 127;

    @OriginalMember(owner = "ai", name = "g", descriptor = "[[[I")
    public static int[][][] field164 = new int[4][13][13];

    @OriginalMember(owner = "ai", name = "h", descriptor = "Z")
    public static boolean field165 = false;

    @OriginalMember(owner = "ai", name = "a", descriptor = "I")
    public static int field158 = 0;

    @OriginalMember(owner = "ai", name = "j", descriptor = "Llf;")
    public static class109 field167 = class35.method275("<img=1>", 2);

    @OriginalMember(owner = "ai", name = "k", descriptor = "Llf;")
    public static class109 field168 = field159;

    @OriginalMember(owner = "ai", name = "c", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "ai", name = "f", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "ai", name = "d", descriptor = "[I")
    public static int[] field161;

    @OriginalMember(owner = "ai", name = "i", descriptor = "[[B")
    public static byte[][] field166;

    @OriginalMember(owner = "ai", name = "a", descriptor = "(B)V")
    public static void method58(byte arg0) {
        field166 = null;
        field159 = null;
        field167 = null;
        if (arg0 != -13) {
            method59(25, -27, false, null);
        }
        field164 = null;
        field168 = null;
        field161 = null;
    }

    @OriginalMember(owner = "ai", name = "a", descriptor = "(IIZLu;)V")
    public static final void method59(int arg0, int arg1, boolean arg2, class184 arg3) {
        if (arg2) {
            return;
        }
        field163++;
        if (arg3.field3597 == arg1 && arg1 != -1) {
            int var4 = client.method246(12, arg1).field452;
            if (var4 == 1) {
                arg3.field3595 = 0;
                arg3.field3558 = 0;
                arg3.field3570 = arg0;
                arg3.field3594 = 0;
            }
            if (var4 == 2) {
                arg3.field3594 = 0;
            }
        } else if (arg1 == -1 || arg3.field3597 == -1 || client.method246(12, arg1).field459 >= client.method246(12, arg3.field3597).field459) {
            arg3.field3597 = arg1;
            arg3.field3558 = 0;
            arg3.field3570 = arg0;
            arg3.field3595 = 0;
            arg3.field3594 = 0;
            arg3.field3560 = arg3.field3563;
        }
    }

    @OriginalMember(owner = "ai", name = "a", descriptor = "(ZLlf;B)V")
    public static final void method60(boolean arg0, class109 arg1, byte arg2) {
        class109 var3 = arg1.method776(-10180);
        field160++;
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class150.field2888; var6++) {
            class83 var10 = class128.method926(var6, -4);
            if ((!arg0 || var10.field1685) && var10.field1644.method776(-10180).method799(var3, 88) != -1) {
                if (var5 >= 250) {
                    class39.field838 = null;
                    class13.field203 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var11 = new short[var4.length * 2];
                    for (int var12 = 0; var12 < var5; var12++) {
                        var11[var12] = var4[var12];
                    }
                    var4 = var11;
                }
                var4[var5++] = (short) var6;
            }
        }
        class13.field203 = var5;
        class39.field838 = var4;
        class109[] var7 = new class109[class13.field203];
        class161.field3021 = 0;
        for (int var8 = 0; var8 < class13.field203; var8++) {
            var7[var8] = class128.method926(var4[var8], -4).field1644;
        }
        int var9 = 62 % ((39 - arg2) / 46);
        class153.method1050(27843, class39.field838, var7);
    }
}
