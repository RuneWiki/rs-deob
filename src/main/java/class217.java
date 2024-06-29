import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class217 extends class247 {

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    public int field3395;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "I")
    public int field3398;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "[I")
    public static int[] field3391 = new int[14];

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "[I")
    public static int[] field3397 = new int[1000];

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "I")
    public static int field3396 = 0;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "Lkl;")
    public static class124 field3388;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "Lvl;")
    public static class73 field3394;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V")
    public static final void method1522(byte arg0) {
        field3392++;
        if (class266.field4316) {
            return;
        }
        class89.field1345 = true;
        if (arg0 >= -104) {
            return;
        }
        class266.field4316 = true;
        if (class180.field2832) {
            class144.field2145 = (float) ((int) class144.field2145 + 191 & 0xFFFFFF80);
        } else {
            class296.field4731 += (24.0F - class296.field4731) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
    public static void method1523(int arg0) {
        field3397 = null;
        field3391 = null;
        field3388 = null;
        field3394 = null;
        if (arg0 >= -107) {
            method1522((byte) -78);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V")
    public static final void method1524(int arg0, int arg1) {
        class62.field895.method1514(arg1, (byte) -55);
        field3390++;
        class281.field4572.method1514(arg1, (byte) -55);
        int var2 = 56 % ((66 - arg0) / 56);
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(II)V")
    public class217(int arg0, int arg1) {
        this.field3395 = arg0;
        this.field3398 = arg1;
    }
}
