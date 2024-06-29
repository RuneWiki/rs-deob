import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class362 extends class418 {

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
    public static int field5361 = 0;

    @OriginalMember(owner = "client!rh", name = "A", descriptor = "[I")
    public static int[] field5368 = new int[200];

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "Z")
    public static boolean field5367 = false;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public int field5352;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public int field5353;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    public int field5355;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public int field5356;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    public int field5357;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    public int field5358;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    public int field5360;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
    public int field5364;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
    public int field5365;

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "I")
    public int field5366;

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "I")
    public int field5369;

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "I")
    public int field5370;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "I")
    public static int field5371;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
    public static void method2379(byte arg0) {
        int var1 = -89 % ((15 - arg0) / 54);
        field5368 = null;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
    public static final void method2380(int arg0) {
        class51 var1 = class424.field6173;
        synchronized (class424.field6173) {
            if (arg0 != 0) {
                return;
            }
            class424.field6173.method372(121);
        }
        field5359++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILir;)V")
    public static final void method2381(int arg0, class185 arg1) {
        class184.field2465 = arg1;
        field5363++;
        class215.field2999 = class184.field2465.method1225(arg0, (byte) 27);
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V")
    public static final void method2382(int arg0) {
        field5362++;
        class51 var1 = class223.field3073;
        synchronized (class223.field3073) {
            class223.field3073.method372(122);
            if (arg0 <= 18) {
                field5367 = true;
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILa;Ltj;)I")
    public static final int method2383(int arg0, class21 arg1, class298 arg2) {
        field5371++;
        if (~arg1.field390 != arg0) {
            return arg1.field390;
        }
        if (arg1.field391 != -1) {
            class3 var3 = class74.field1035.method1962(arg2.method479() ? arg1.field391 : arg1.field389, -11999);
            if (!var3.field26) {
                return var3.field37;
            }
        }
        return arg1.field387;
    }
}
