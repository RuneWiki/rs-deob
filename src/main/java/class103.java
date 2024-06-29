import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class103 {

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "B")
    private byte field1794;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    public int field1801;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    public int field1797;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public int field1791;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public int field1793;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public int field1790;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "[B")
    public static byte[] field1796 = new byte[32896];

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "Lsf;")
    public static class108 field1800;

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "Lik;")
    public static class262 field1802;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "[Lt;")
    public static class257[] field1803;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)I", line = 18)
    public final int method706(byte arg0) {
        if (arg0 != 10) {
            method710((byte) -105);
        }
        field1798++;
        return (this.field1794 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILik;)V", line = 30)
    public static final void method707(int arg0, class262 arg1) {
        field1802 = arg1;
        field1792++;
        if (arg0 != 10396) {
            method712(-94);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V", line = 45)
    public static final void method708(boolean arg0) {
        class151.field2731 = null;
        field1795++;
        if (!arg0) {
            field1800 = (class108) null;
        }
        class294.field5134 = null;
        class325.field5537 = null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(La;ILa;ZI)I", line = 58)
    public static final int method709(class278 arg0, int arg1, class278 arg2, boolean arg3, int arg4) {
        field1788++;
        if (arg1 == 1) {
            int var5 = arg2.field2880;
            int var6 = arg0.field2880;
            if (!arg3) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg1 == 2) {
            return arg2.method2008(0).field4984.method754(126, arg0.method2008(0).field4984);
        } else if (arg1 == 3) {
            if (arg2.field4881.method779(class69.field1074, 79)) {
                if (arg0.field4881.method779(class69.field1074, 123)) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg0.field4881.method779(class69.field1074, 118)) {
                return arg3 ? 1 : -1;
            } else {
                return arg2.field4881.method754(127, arg0.field4881);
            }
        } else if (arg4 < 17) {
            return 122;
        } else if (arg1 == 4) {
            return arg2.method1112(81) ? (arg0.method1112(46) ? 0 : 1) : (arg0.method1112(108) ? -1 : 0);
        } else if (arg1 == 5) {
            return arg2.method1108(true) ? (arg0.method1108(true) ? 0 : 1) : (arg0.method1108(true) ? -1 : 0);
        } else if (arg1 == 6) {
            return arg2.method1113(20593) ? (arg0.method1113(20593) ? 0 : 1) : (arg0.method1113(20593) ? -1 : 0);
        } else if (arg1 == 7) {
            return arg2.method1109(-25565) ? (arg0.method1109(-25565) ? 0 : 1) : (arg0.method1109(-25565) ? -1 : 0);
        } else {
            return arg2.field4887 - arg0.field4887;
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)V", line = 126)
    public static void method710(byte arg0) {
        field1803 = null;
        if (arg0 != 42) {
            method708(false);
        }
        field1802 = null;
        field1800 = null;
        field1796 = null;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(B)I", line = 139)
    public final int method711(byte arg0) {
        if (arg0 < 6) {
            field1800 = (class108) null;
        }
        field1787++;
        return this.field1794 & 0x7;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 157)
    public static final void method712(int arg0) {
        if (arg0 == -13128) {
            field1789++;
            class317.field5451.method644((byte) 103);
            class286.field5000.method644((byte) 77);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field1796[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field1799 = 0;
        field1800 = class140.method973(255, "k");
        field1804 = 0;
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V", line = 203)
    public class103() {
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lrm;)V", line = 209)
    public class103(class249 arg0) {
        this.field1794 = arg0.method1721((byte) 70);
        this.field1801 = arg0.method1712(-1);
        this.field1797 = arg0.method1738(-1756395344);
        this.field1791 = arg0.method1738(-1756395344);
        this.field1793 = arg0.method1738(-1756395344);
        this.field1790 = arg0.method1738(-1756395344);
    }
}
