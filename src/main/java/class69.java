import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class69 {

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "I")
    public int field1012 = 0;

    @OriginalMember(owner = "client!bp", name = "k", descriptor = "Z")
    private boolean field1018 = false;

    @OriginalMember(owner = "client!bp", name = "r", descriptor = "I")
    public int field1025 = 0;

    @OriginalMember(owner = "client!bp", name = "s", descriptor = "I")
    public static int field1026 = 0;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
    public int field1008;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
    public int field1009;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
    public int field1010;

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
    public int field1011;

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
    public int field1013;

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
    public int field1014;

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "I")
    public int field1017;

    @OriginalMember(owner = "client!bp", name = "l", descriptor = "I")
    public int field1019;

    @OriginalMember(owner = "client!bp", name = "m", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
    private int field1021;

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!bp", name = "q", descriptor = "I")
    public int field1024;

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "J")
    public long field1016;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
    public static final void method484(byte arg0) {
        field1015++;
        if (arg0 < -120) {
            class8.method94(25, -94);
            class305.method1849(-118);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BILlk;)V")
    private final void method485(byte arg0, int arg1, class425 arg2) {
        if (arg1 == 1) {
            this.field1021 = arg2.method2508(true);
        } else if (arg1 == 2) {
            arg2.method2503(true);
        } else if (arg1 == 3) {
            this.field1017 = arg2.method2502((byte) -86);
            this.field1009 = arg2.method2502((byte) -86);
            this.field1019 = arg2.method2502((byte) -86);
        } else if (arg1 == 4) {
            this.field1014 = arg2.method2503(true);
            this.field1008 = arg2.method2502((byte) -86);
        } else if (arg1 == 6) {
            this.field1013 = arg2.method2503(true);
        } else if (arg1 == 8) {
            this.field1012 = 1;
        } else if (arg1 == 9) {
            this.field1025 = 1;
        } else if (arg1 == 10) {
            this.field1018 = true;
        }
        field1023++;
        if (arg0 != 81) {
            method484((byte) -78);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
    public final void method486(int arg0) {
        this.field1011 = class432.field5957[this.field1021 << 3];
        field1020++;
        this.field1010 = (int) Math.sqrt((double) (this.field1017 * this.field1017 - (-(this.field1019 * this.field1019) - (this.field1009 * this.field1009))));
        if (this.field1008 == arg0) {
            this.field1008 = 1;
        }
        if (this.field1014 == 0) {
            this.field1016 = 2147483647L;
        } else if (this.field1014 == 1) {
            this.field1016 = (long) (this.field1010 * 8 / this.field1008);
            this.field1016 *= this.field1016;
        } else if (this.field1014 == 2) {
            this.field1016 = (long) (this.field1010 * 8 / this.field1008);
        }
        if (this.field1018) {
            this.field1010 *= -1;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Llk;B)V")
    public final void method487(class425 arg0, byte arg1) {
        field1022++;
        if (arg1 < 1) {
            this.method486(109);
        }
        while (true) {
            int var3 = arg0.method2503(true);
            if (var3 == 0) {
                return;
            }
            this.method485((byte) 81, var3, arg0);
        }
    }
}
