import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class131 extends class50 {

    @OriginalMember(owner = "client!w", name = "A", descriptor = "Laa;")
    private class2 field3179;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    public static int field3177 = 0;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "I")
    private int field3183;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "Lkb;")
    private class62 field3176;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "Z")
    private boolean field3174;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "Z")
    private boolean field3181;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "[B")
    private byte[] field3184;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;", line = 3)
    public static final Class method1021(byte arg0, String arg1) throws ClassNotFoundException {
        if (arg0 != -95) {
            method1023(7, -76, -124);
        }
        field3175++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V", line = 45)
    public final void method288(int arg0) {
        field3166++;
        if (this.field3176 == null || this.field3176.field1513 == 0) {
            return;
        }
        if (this.field3176.field1513 == arg0) {
            class84 var2 = (class84) this.field3176.field1516;
            try {
                var2.method644(0, this.field3184.length, 118, this.field3184);
                var2.method646((byte) -76);
                try {
                    class85.method648("midibox.loop=" + (this.field3174 ? "\"infinite\"" : "0") + "; midibox.src=\"" + var2.method643(false).getPath().replace('\\', '/') + "\"; midibox.volume=" + this.field3183 + ";", arg0 ^ 0xFFFFC59E, this.field3179.field34);
                    this.field3181 = true;
                } catch (Throwable var4) {
                }
            } catch (Exception var5) {
                try {
                    var2.method646((byte) -76);
                } catch (Exception var3) {
                }
            }
        }
        this.field3176 = null;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V", line = 87)
    public final void method282(byte arg0) {
        int var2 = 64 % ((arg0 + 43) / 35);
        field3167++;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)V", line = 103)
    public final void method291(int arg0, int arg1) {
        if (arg1 != 2) {
            method1022((byte) -35);
        }
        field3170++;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([BIBZ)V", line = 113)
    public final void method290(byte[] arg0, int arg1, byte arg2, boolean arg3) {
        this.field3176 = this.field3179.method8((byte) -106);
        if (arg2 < 15) {
            method1023(28, 94, -127);
        }
        field3173++;
        if (this.field3176 == null) {
            return;
        }
        if (arg1 == 0) {
            arg1 = 1;
        }
        this.field3183 = class48.method419(arg1, -31096);
        this.field3174 = arg3;
        this.field3184 = arg0;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(B)V", line = 135)
    public static final void method1022(byte arg0) {
        Object var1 = class118.field2945;
        synchronized (class118.field2945) {
            if (class43.field1103 != 0) {
                class43.field1103 = 1;
                try {
                    class118.field2945.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        field3171++;
        if (arg0 != -4) {
            field3177 = 33;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IBI)V", line = 165)
    public final void method283(int arg0, byte arg1, int arg2) {
        field3180++;
        if (arg0 == 0) {
            arg0 = 1;
        }
        int var4 = class48.method419(arg0, -31096) - arg2;
        if (arg1 >= -78) {
            this.field3181 = true;
        }
        if (this.field3176 != null) {
            this.field3183 = var4;
        } else if (this.field3181) {
            try {
                class85.method648("midibox.volume=" + var4 + ";", -14945, this.field3179.field34);
                return;
            } catch (Throwable var5) {
                return;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III)I", line = 191)
    public static final int method1023(int arg0, int arg1, int arg2) {
        if (arg2 != -2847) {
            field3177 = -106;
        }
        int var3 = arg1 + arg0 * 57;
        field3178++;
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V", line = 223)
    public final void method284(int arg0) {
        if (arg0 != -28200) {
            return;
        }
        field3168++;
        if (this.field3181) {
            try {
                class85.method648("midibox.src=\"c:/silence.mid\";", -14945, this.field3179.field34);
            } catch (Throwable var2) {
            }
            this.field3181 = false;
        }
        this.field3176 = null;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Laa;)V", line = 244)
    public class131(class2 arg0) {
        this.field3179 = arg0;
    }
}
