import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class55 {

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "Lai;")
    public static class10 field979 = class44.method278("sich mit einer anderen Welt zu verbinden)3", 107);

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "Lai;")
    private static class10 field981 = class44.method278("You are standing in a members)2only area)3", 126);

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "Lai;")
    public static class10 field977 = field981;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Lai;")
    private static class10 field980 = class44.method278("No response from server)3", -102);

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "Lai;")
    public static class10 field982 = field980;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "[Lai;")
    public static class10[] field985 = new class10[8];

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public static void method378(byte arg0) {
        field985 = null;
        field977 = null;
        field982 = null;
        field981 = null;
        field979 = null;
        int var1 = 68 / ((55 - arg0) / 41);
        field980 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILc;II)Lbf;")
    public static final class17 method379(int arg0, class21 arg1, int arg2, int arg3) {
        field983++;
        if (class169.method1123(arg3, (byte) 108, arg0, arg1)) {
            return arg2 == 23991 ? class29.method183(false) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lai;ZI)V")
    public static final void method380(class10 arg0, boolean arg1, int arg2) {
        field976++;
        class10 var3 = arg0.method48(-34);
        int var4 = 0;
        short[] var5 = new short[16];
        for (int var6 = arg2; var6 < class125.field2390; var6++) {
            class94 var9 = class104.method678(500, var6);
            if ((!arg1 || var9.field1704) && var9.field1718.method48(-34).method53((byte) -126, var3) != -1) {
                if (var4 >= 250) {
                    class121.field2335 = null;
                    class115.field2206 = -1;
                    return;
                }
                if (var4 >= var5.length) {
                    short[] var10 = new short[var5.length * 2];
                    for (int var11 = 0; var11 < var4; var11++) {
                        var10[var11] = var5[var11];
                    }
                    var5 = var10;
                }
                var5[var4++] = (short) var6;
            }
        }
        class131.field2483 = 0;
        class115.field2206 = var4;
        class121.field2335 = var5;
        class10[] var7 = new class10[class115.field2206];
        for (int var8 = 0; var8 < class115.field2206; var8++) {
            var7[var8] = class104.method678(500, var5[var8]).field1718;
        }
        class24.method160(class121.field2335, (byte) -12, var7);
    }
}
