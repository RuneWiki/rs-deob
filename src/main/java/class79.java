import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class79 {

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field1275 = 0;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field1274 = 0;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "Z")
    public static boolean field1277 = true;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field1278 = 0;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "[[Z")
    public static boolean[][] field1276;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V")
    public static final void method586(int arg0, int arg1) {
        field1273++;
        if (class98.field1677 == arg1) {
            return;
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (class98.field1677 == 0) {
            class85.method629(121);
        }
        if (arg0 != -1) {
            return;
        }
        if (arg1 == 40) {
            class78.method585(-39);
        }
        if (arg1 != 40 && class220.field3213 != null) {
            class220.field3213.method1440(-1);
            class220.field3213 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class71.field1121 = 1;
            class226.field3323 = 0;
            class52.field714 = 1;
            class309.field4973 = 0;
            class52.field722 = 0;
            class166.method1189(117, true);
        }
        if (arg1 == 25 || arg1 == 10) {
            class44.method268(125);
        }
        if (arg1 == 5) {
            class104.method812(105, class191.field2827);
        } else {
            class247.method1697(arg0 ^ 0xFFFFF7FF);
        }
        boolean var3 = class98.field1677 == 5 || class98.field1677 == 10 || class98.field1677 == 28;
        if (var2 != var3) {
            if (var2) {
                class48.field667 = class22.field242;
                if (class99.field1688 == 0) {
                    class172.method1217(11, 2);
                } else {
                    class141.method1056(255, class22.field242, false, -32768, class300.field4850, 0, 2);
                }
                class188.field2802.method1837(false, 8);
            } else {
                class172.method1217(11, 2);
                class188.field2802.method1837(true, arg0 + 9);
            }
        }
        class98.field1677 = arg1;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public static final void method587(int arg0) {
        field1279++;
        if (arg0 != 20114) {
            return;
        }
        class92.field1488.method680(8);
        int var1 = class92.field1488.method688((byte) -7, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class92.field1488.method688((byte) -128, 2);
        if (var2 == 0) {
            class48.field670[class284.field4574++] = 2047;
        } else if (var2 == 1) {
            int var3 = class92.field1488.method688((byte) -110, 3);
            class213.field3139.method1711(var3, 15711, 1);
            int var4 = class92.field1488.method688((byte) -125, 1);
            if (var4 == 1) {
                class48.field670[class284.field4574++] = 2047;
            }
        } else if (var2 == 2) {
            if (class92.field1488.method688((byte) 7, 1) == 1) {
                int var5 = class92.field1488.method688((byte) 48, 3);
                class213.field3139.method1711(var5, 15711, 2);
                int var6 = class92.field1488.method688((byte) 63, 3);
                class213.field3139.method1711(var6, 15711, 2);
            } else {
                int var7 = class92.field1488.method688((byte) -124, 3);
                class213.field3139.method1711(var7, 15711, 0);
            }
            int var8 = class92.field1488.method688((byte) -117, 1);
            if (var8 == 1) {
                class48.field670[class284.field4574++] = 2047;
            }
        } else if (var2 == 3) {
            int var9 = class92.field1488.method688((byte) 49, 7);
            int var10 = class92.field1488.method688((byte) 99, 1);
            int var11 = class92.field1488.method688((byte) -4, 1);
            if (var11 == 1) {
                class48.field670[class284.field4574++] = 2047;
            }
            class37.field474 = class92.field1488.method688((byte) 80, 2);
            int var12 = class92.field1488.method688((byte) -124, 7);
            class213.field3139.method1466(var9, var12, var10 == 1, (byte) 97);
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V")
    public static void method588(int arg0) {
        field1276 = null;
        if (arg0 != -18282) {
            method587(-33);
        }
    }
}
