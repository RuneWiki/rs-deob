import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public abstract class class164 extends class312 {

    @OriginalMember(owner = "client!de", name = "C", descriptor = "Z")
    public volatile boolean field2528 = true;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "Z")
    public static boolean field2522 = false;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "Z")
    public static boolean field2526 = false;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "Ljava/lang/String;")
    public static String field2530 = "Please wait...";

    @OriginalMember(owner = "client!de", name = "y", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "Z")
    public boolean field2523;

    @OriginalMember(owner = "client!de", name = "B", descriptor = "Z")
    public boolean field2527;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "[[[B")
    public static byte[][][] field2525;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(Z)V", line = 5)
    public static void method1120(boolean arg0) {
        field2525 = (byte[][][]) null;
        field2530 = null;
        if (arg0) {
            method1121(true);
        }
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(Z)[Lph;", line = 24)
    public static final class79[] method1121(boolean arg0) {
        field2524++;
        class79[] var1 = new class79[class246.field3862];
        for (int var2 = 0; var2 < class246.field3862; var2++) {
            if (class333.field5166) {
                var1[var2] = new class140(class116.field1798, class168.field2567, class276.field4257[var2], class123.field1919[var2], class68.field1011[var2], class107.field1652[var2], class46.field644[var2], class154.field2417);
            } else {
                var1[var2] = new class20(class116.field1798, class168.field2567, class276.field4257[var2], class123.field1919[var2], class68.field1011[var2], class107.field1652[var2], class46.field644[var2], class154.field2417);
            }
        }
        if (arg0) {
            method1123(67, (class306) null);
        }
        class345.method2394((byte) -92);
        return var1;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(III)Lkd;", line = 62)
    public static final class272 method1122(int arg0, int arg1, int arg2) {
        class174 var3 = class90.field1375[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2655; var4++) {
            class272 var5 = var3.field2671[var4];
            if ((var5.field4183 >> 29 & 0x3L) == 2L && var5.field4169 == arg1 && var5.field4186 == arg2) {
                class319.method2165(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILwf;)V", line = 86)
    public static final void method1123(int arg0, class306 arg1) {
        field2529++;
        if (class138.field2137) {
            return;
        }
        if (class333.field5166) {
            class238.method1624();
        } else {
            class57.method391();
        }
        class208.field3317 = class122.method830(-110, class168.field2571, arg1);
        int var2 = class174.field2644;
        int var3 = var2 * 956 / 503;
        class208.field3317.method919((class334.field5203 - var3) / 2, 0, var3, var2);
        class59.field839 = class138.method942(class311.field4932, (byte) -89, arg1);
        class59.field839.method159(class334.field5203 / arg0 - (class59.field839.field1166 / 2), 18);
        class138.field2137 = true;
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(Z)I")
    public abstract int method991(boolean arg0);

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)[B")
    public abstract byte[] method992(int arg0);
}
