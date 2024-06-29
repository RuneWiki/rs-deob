import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class146 extends class171 {

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "Lha;")
    public static class46 field2632 = class271.method1828("scrollen:", -46);

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "Lha;")
    public static class46 field2629 = class271.method1828("", -46);

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "Lhi;")
    public static class24 field2641 = null;

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "I")
    public static int field2644 = -1;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "Lwf;")
    public static class16 field2638 = new class16(200);

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "J")
    public static long field2645 = 0L;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "I")
    public int field2637;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
    public int field2640;

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "I")
    public int field2643;

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "Lha;")
    public class46 field2642;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)V")
    public final void method1082(byte arg0) {
        super.field3053 = Long.MIN_VALUE & super.field3053 | class223.method1537(-26619) - -500L;
        if (arg0 <= -92) {
            ++field2636;
            class14.field220.method1664(-114, this);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lpi;IIB)Z")
    public static final boolean method1083(class181 arg0, int arg1, int arg2, byte arg3) {
        ++field2633;
        byte[] var4 = arg0.method1293(arg2, arg1, (byte) 51);
        if (var4 == null) {
            return false;
        } else {
            class183.method1331(true, var4);
            return arg3 != 28 ? true : true;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILwk;IIZI)V")
    public static final void method1084(int arg0, class170 arg1, int arg2, int arg3, boolean arg4, int arg5) {
        ++field2639;
        if (class273.field4775 < 50) {
            if (arg1.field3018 != null && arg1.field3018.length > arg5 && arg1.field3018[arg5] != null) {
                if (arg2 <= 65) {
                    field2644 = 8;
                }
                int var6 = arg1.field3018[arg5][0];
                int var7 = 15 & var6;
                int var8 = var6 >> 8;
                int var9 = var6 >> 4 & 7;
                if (arg1.field3018[arg5].length > 1) {
                    int var10 = (int) (Math.random() * (double) arg1.field3018[arg5].length);
                    if (var10 > 0) {
                        var8 = arg1.field3018[arg5][var10];
                    }
                }
                if (var7 == 0) {
                    if (arg4) {
                        class207.method1463(var8, 0, var9, 0);
                    }
                } else if (~class135.field2452 != -1) {
                    class54.field926[class273.field4775] = var8;
                    class180.field3205[class273.field4775] = var9;
                    int var11 = (arg0 + -64) / 128;
                    int var12 = (arg3 - 64) / 128;
                    class60.field998[class273.field4775] = 0;
                    class188.field3364[class273.field4775] = null;
                    class50.field863[class273.field4775] = (var11 << 8) + (var12 << 16) + var7;
                    ++class273.field4775;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)J")
    public final long method1085(int arg0) {
        if (arg0 < 88) {
            return 71L;
        } else {
            ++field2628;
            return super.field3053 & Long.MAX_VALUE;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)I")
    public final int method1086(boolean arg0) {
        if (arg0) {
            this.method1082((byte) -125);
        }
        ++field2630;
        return (int) super.field1195;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(Z)I")
    public final int method1087(boolean arg0) {
        if (!arg0) {
            this.method1082((byte) 33);
        }
        ++field2634;
        return (int) (super.field1195 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)V")
    public final void method1088(int arg0) {
        super.field3053 |= Long.MIN_VALUE;
        if (this.method1085(123) == 0L) {
            class32.field600.method1664(arg0 + -11220, this);
        }
        if (arg0 != 11102) {
            this.method1085(-113);
        }
        ++field2631;
    }

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)V")
    public static void method1089(int arg0) {
        field2632 = null;
        field2641 = null;
        field2638 = null;
        int var1 = 37 / ((-28 - arg0) / 59);
        field2629 = null;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(II)V")
    public class146(int arg0, int arg1) {
        super.field1195 = (long) arg0 << 32 | (long) arg1;
    }
}
