import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class215 extends class128 {

    @OriginalMember(owner = "client!o", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field3551 = new String[1000];

    @OriginalMember(owner = "client!o", name = "y", descriptor = "J")
    public static long field3562 = 0L;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    public int field3556;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public int field3558;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "[I")
    public int[] field3557;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "[I")
    public int[] field3561;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "[I")
    public int[] field3565;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "[Lbg;")
    public class172[] field3550;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "[Lbg;")
    public class172[] field3559;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "[[[B")
    public byte[][][] field3563;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "(I)V")
    public static final void method1493(int arg0) {
        if (arg0 != -16) {
            field3553 = -46;
        }
        field3552++;
        if (class92.field1487) {
            return;
        }
        class221.field3610 = true;
        if (class144.field2281) {
            class20.field240 = (float) ((int) class20.field240 + 47 & 0xFFFFFFF0);
        } else {
            class193.field3141 += (12.0F - class193.field3141) / 2.0F;
        }
        class92.field1487 = true;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)V")
    public static final void method1494(byte arg0, int arg1) {
        class68.field1132 = -1;
        if (arg0 != 76) {
            return;
        }
        field3554++;
        class68.field1132 = -1;
        if (arg1 == 37) {
            class275.field4409 = 3.0F;
        } else if (arg1 == 50) {
            class275.field4409 = 4.0F;
        } else if (arg1 == 75) {
            class275.field4409 = 6.0F;
        } else if (arg1 == 100) {
            class275.field4409 = 8.0F;
        } else if (arg1 == 200) {
            class275.field4409 = 16.0F;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    public static final void method1495(String arg0, int arg1, byte arg2) {
        field3560++;
        class175 var3 = class182.method1317(2, arg1, false);
        var3.method1279((byte) -80);
        var3.field2854 = arg0;
        if (arg2 < 70) {
            field3555 = -75;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)V")
    public static final void method1496(boolean arg0) {
        field3564++;
        if (arg0) {
            method1495((String) null, 107, (byte) -109);
        }
        for (int var1 = 0; var1 < class137.field2176; var1++) {
            class129 var2 = class301.method1988((byte) 125, var1);
            if (var2 != null && var2.field2031 == 0) {
                class301.field4817[var1] = 0;
                class195.field3160[var1] = 0;
            }
        }
        class209.field3303 = new class155(16);
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(Z)V")
    public static void method1497(boolean arg0) {
        field3551 = null;
        if (arg0) {
            field3555 = 31;
        }
    }
}
