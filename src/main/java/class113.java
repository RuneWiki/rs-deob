import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class113 extends class128 {

    @OriginalMember(owner = "client!tb", name = "bb", descriptor = "Lcc;")
    private class15 field2829;

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "[I")
    public static int[] field2812 = new int[500];

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "Z")
    public static boolean field2811 = false;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "Lke;")
    public static class65 field2820 = class1.method17("Icons redrawn", -118);

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "Lke;")
    public static class65 field2806 = class1.method17(")3000", -123);

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "I")
    public static int field2801 = 0;

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
    public static int field2818 = 0;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "I")
    public static int field2802 = 0;

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "Lke;")
    private static class65 field2815 = class1.method17("Connection timed out)3", -114);

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "Lke;")
    public static class65 field2807 = field2815;

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "Lke;")
    public static class65 field2825 = class1.method17(")3", -126);

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "I")
    public static int field2823 = 0;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!tb", name = "cb", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!tb", name = "db", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!tb", name = "fb", descriptor = "I")
    private int field2833;

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "Lra;")
    public static class102 field2816;

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "Lrc;")
    public static class104 field2809;

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "Lf;")
    private class34 field2813;

    @OriginalMember(owner = "client!tb", name = "ab", descriptor = "Lpa;")
    public static class90 field2828;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "Z")
    private boolean field2805;

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "Z")
    private boolean field2819;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "[B")
    private byte[] field2803;

    @OriginalMember(owner = "client!tb", name = "eb", descriptor = "[I")
    public static int[] field2832;

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "[Luc;")
    public static class119[] field2824;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method927(boolean arg0) {
        class71.field1830 = arg0;
        class41.field1065 = false;
        field2830++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)V", line = 16)
    public final void method86(int arg0, int arg1, int arg2) {
        if (arg0 == arg1) {
            arg1 = 1;
        }
        field2821++;
        int var4 = class112.method924(2, arg1) - arg2;
        if (this.field2813 != null) {
            this.field2833 = var4;
        } else if (this.field2819) {
            try {
                class8.method54(-28433, "midibox.volume=" + var4 + ";", this.field2829.field316);
                return;
            } catch (Throwable var5) {
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljd;Z)V", line = 76)
    public static final void method928(class58 arg0, boolean arg1) {
        field2831++;
        class21.field511 = arg0;
        if (arg1) {
            field2825 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V", line = 104)
    public final void method90(byte arg0) {
        if (arg0 != 59) {
            this.method87((byte) -110);
        }
        if (this.field2819) {
            try {
                class8.method54(arg0 - 28492, "midibox.src=\"c:/silence.mid\";", this.field2829.field316);
            } catch (Throwable var2) {
            }
            this.field2819 = false;
        }
        field2822++;
        this.field2813 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)V", line = 128)
    public final void method88(int arg0, byte arg1) {
        if (arg1 >= -43) {
            this.field2819 = false;
        }
        field2808++;
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(B)V", line = 146)
    public final void method87(byte arg0) {
        field2814++;
        if (this.field2813 == null || (arg0 != -56 || this.field2813.field875 == 0)) {
            return;
        }
        if (this.field2813.field875 == 1) {
            class107 var2 = (class107) this.field2813.field878;
            try {
                var2.method881(0, 32397, this.field2803, this.field2803.length);
                var2.method877(true);
                try {
                    class8.method54(-28433, "midibox.loop=" + (this.field2805 ? "\"infinite\"" : "0") + "; midibox.src=\"" + var2.method879((byte) 17).getPath().replace('\\', '/') + "\"; midibox.volume=" + this.field2833 + ";", this.field2829.field316);
                    this.field2819 = true;
                } catch (Throwable var4) {
                }
            } catch (Exception var5) {
                try {
                    var2.method877(true);
                } catch (Exception var3) {
                }
            }
        }
        this.field2813 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BZI[B)V", line = 184)
    public final void method89(byte arg0, boolean arg1, int arg2, byte[] arg3) {
        if (arg0 >= -93) {
            field2802 = 2;
        }
        field2804++;
        this.field2813 = this.field2829.method104(-103);
        if (this.field2813 == null) {
            return;
        }
        if (arg2 == 0) {
            arg2 = 1;
        }
        this.field2833 = class112.method924(2, arg2);
        this.field2805 = arg1;
        this.field2803 = arg3;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 210)
    public static void method929(int arg0) {
        field2807 = null;
        field2825 = null;
        field2832 = null;
        if (arg0 != 12836) {
            field2818 = -76;
        }
        field2816 = null;
        field2812 = null;
        field2824 = null;
        field2806 = null;
        field2809 = null;
        field2820 = null;
        field2828 = null;
        field2815 = null;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V", line = 233)
    public final void method85(byte arg0) {
        field2810++;
        if (arg0 < 57) {
            field2832 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lcc;)V", line = 275)
    public class113(class15 arg0) {
        this.field2829 = arg0;
    }
}
