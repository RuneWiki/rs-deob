import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class119 {

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field1801 = 0;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public int field1796;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public int field1800;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    private int field1803;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "Lgd;")
    public class227 field1797;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)Ldi;", line = 5)
    public final synchronized class84 method893(boolean arg0) {
        field1798++;
        class84 var2 = (class84) this.field1797.field3706.method87((long) this.field1803, -2062335807);
        if (var2 != null) {
            return var2;
        }
        if (!arg0) {
            this.field1796 = -97;
        }
        class84 var3 = class84.method702(this.field1797.field3695, this.field1803, 0);
        if (var3 != null) {
            this.field1797.field3706.method84((long) this.field1803, var3, (byte) 27);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lhp;I)V", line = 30)
    public final void method894(class217 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1515((byte) 123);
            if (var3 == 0) {
                int var4 = 105 / ((arg1 + 27) / 54);
                field1804++;
                return;
            }
            this.method896(arg0, var3, -122);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)V", line = 54)
    public static final void method895(int arg0, int arg1, int arg2) {
        field1805++;
        if (class398.field5956 == 1) {
            class153.method1055(arg1, arg2, 1, class524.field7661);
        } else if (class398.field5956 == 2) {
            class503.method2989(arg2, arg0 ^ 0x5A73, arg1);
        }
        class524.field7661 = null;
        class398.field5956 = 0;
        if (arg0 != 23145) {
            method897((byte) 32);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lhp;II)V", line = 74)
    private final void method896(class217 arg0, int arg1, int arg2) {
        int var4 = 100 % ((arg2 - 32) / 60);
        field1795++;
        if (arg1 == 1) {
            this.field1803 = arg0.method1511(-24);
        } else if (arg1 == 2) {
            this.field1800 = arg0.method1515((byte) 121);
            this.field1796 = arg0.method1515((byte) 125);
            return;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V", line = 96)
    public static final void method897(byte arg0) {
        if (arg0 != -45) {
            return;
        }
        class111.field1558 = 0;
        field1794++;
        for (int var1 = 0; var1 < 2048; var1++) {
            class6.field69[var1] = null;
            class524.field7667[var1] = 1;
            class131.field2005[var1] = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lkk;B)V", line = 119)
    public static final void method898(class129 arg0, byte arg1) {
        field1799++;
        int var2 = arg0.field1940 - class475.field6854;
        int var3 = arg0.field1942 * 128 + (arg0.method953(-88) * 64);
        if (arg1 < 36) {
            field1801 = -90;
        }
        int var4 = arg0.field1909 * 128 + (arg0.method953(-107) * 64);
        arg0.field1985 = 0;
        arg0.field5833 += (var4 - arg0.field5833) / var2;
        arg0.field5837 += (var3 - arg0.field5837) / var2;
        if (arg0.field1956 == 0) {
            arg0.method947(8192, -2);
        }
        if (arg0.field1956 == 1) {
            arg0.method947(12288, -2);
        }
        if (arg0.field1956 == 2) {
            arg0.method947(0, -2);
        }
        if (arg0.field1956 == 3) {
            arg0.method947(4096, -2);
        }
    }
}
