import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class236 extends class320 {

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "Lbc;")
    public class4 field3669;

    @OriginalMember(owner = "client!ja", name = "G", descriptor = "Lee;")
    public static class223 field3674 = new class223();

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "I")
    public static int field3676 = 0;

    @OriginalMember(owner = "client!ja", name = "L", descriptor = "J")
    public static long field3678 = 0L;

    @OriginalMember(owner = "client!ja", name = "K", descriptor = "[I")
    public static int[] field3677 = new int[100];

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!ja", name = "F", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lrg;B)V", line = 6)
    public static final void method1760(class342 arg0, byte arg1) {
        field3675++;
        int var2 = arg0.field5427;
        if (var2 == 324) {
            if (class123.field1969 == -1) {
                class234.field3645 = arg0.field5337;
                class123.field1969 = arg0.field5371;
            }
            if (class37.field560.field3201) {
                arg0.field5371 = class123.field1969;
            } else {
                arg0.field5371 = class234.field3645;
            }
        } else if (var2 == 325) {
            if (class123.field1969 == -1) {
                class123.field1969 = arg0.field5371;
                class234.field3645 = arg0.field5337;
            }
            if (class37.field560.field3201) {
                arg0.field5371 = class234.field3645;
            } else {
                arg0.field5371 = class123.field1969;
            }
        } else if (var2 == 327) {
            arg0.field5299 = 150;
            arg0.field5435 = (int) (Math.sin((double) class360.field5718 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field5311 = 5;
            arg0.field5441 = -1;
        } else {
            if (arg1 >= -76) {
                field3677 = (int[]) null;
            }
            if (var2 == 328) {
                if (class173.field2746.field2706 == null) {
                    arg0.field5363 = 0;
                    arg0.field5441 = 0;
                } else {
                    arg0.field5299 = 150;
                    arg0.field5435 = (int) (Math.sin((double) class360.field5718 / 40.0D) * 256.0D) & 0x7FF;
                    arg0.field5311 = 5;
                    arg0.field5441 = 2047;
                    arg0.field5363 = class15.method164((byte) 86, class173.field2746.field2706);
                    arg0.field5364 = class173.field2746.field1293;
                    arg0.field5440 = class173.field2746.field1350;
                    arg0.field5361 = class173.field2746.field1299;
                    arg0.field5310 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V", line = 87)
    public static final void method1761(int arg0) {
        class340.field5226.method656(0);
        field3672++;
        if (arg0 >= -21) {
            method1760((class342) null, (byte) 112);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([BB)Z", line = 101)
    public static final boolean method1762(byte[] arg0, byte arg1) {
        field3670++;
        if (arg1 < 5) {
            field3674 = (class223) null;
        }
        class25 var2 = new class25(arg0);
        int var3 = var2.method281(-128);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method281(89) == 1;
        if (var4) {
            class258.method1901(-4, var2);
        }
        class295.method2130(var2, -3438);
        return true;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)V", line = 127)
    public static void method1763(byte arg0) {
        if (arg0 > -67) {
            field3677 = (int[]) null;
        }
        field3677 = null;
        field3674 = null;
    }

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V", line = 138)
    public static final void method1764(int arg0) {
        field3673++;
        class78.field1130.method656(0);
        class87.field1247.method656(0);
        if (arg0 != -326) {
            field3676 = -67;
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lbc;)V", line = 162)
    public class236(class4 arg0) {
        this.field3669 = arg0;
    }
}
