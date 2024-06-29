import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class258 {

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "[[I")
    public static int[][] field3262 = new int[128][128];

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "[[B")
    public static byte[][] field3264;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public static void method1614(byte arg0) {
        field3264 = null;
        field3262 = null;
        if (arg0 != 44) {
            field3264 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)I")
    public static final int method1615(int arg0) {
        if (arg0 == 10) {
            field3261++;
            return class358.field4604;
        } else {
            return -39;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BII)V")
    public static final void method1616(byte arg0, int arg1, int arg2) {
        field3259++;
        int var3 = class157.field2070.method1704((byte) 102, class457.field6383.method1127(class379.field4920, false));
        for (class502 var4 = (class502) class103.field1421.method49(arg0 - 225); var4 != null; var4 = (class502) class103.field1421.method46((byte) 33)) {
            int var8 = class388.method2314(-1405, var4);
            if (var8 > var3) {
                var3 = var8;
            }
        }
        if (arg0 != 101) {
            field3264 = null;
        }
        var3 += 8;
        int var5 = class271.field3433 * 16 + 21;
        int var6 = arg2 - var3 / 2;
        if (class23.field419 < (var3 + var6)) {
            var6 = class23.field419 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (class92.field1281 < (arg1 + var5)) {
            var7 = class92.field1281 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        class115.field1574 = var6;
        class44.field642 = var7;
        class450.field6267 = true;
        class98.field1374 = var3;
        class129.field1756 = (class419.field5575 ? 26 : 22) + class271.field3433 * 16;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1617(String arg0, int arg1) {
        field3260++;
        if (class99.field1384 == null) {
            class4.method21((byte) -4);
        }
        String[] var2 = class332.method1978((byte) -80, '\n', arg0);
        if (arg1 <= 60) {
            field3264 = null;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class165.field2139; var4 > 0; var4--) {
                class99.field1384[var4] = class99.field1384[var4 - 1];
            }
            class99.field1384[0] = var2[var3];
            if ((class99.field1384.length - 1) > class165.field2139) {
                class165.field2139++;
                if (class92.field1277 > 0) {
                    class92.field1277++;
                }
            }
        }
    }
}
