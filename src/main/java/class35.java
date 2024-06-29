import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class35 extends class195 {

    @OriginalMember(owner = "client!fi", name = "Z", descriptor = "I")
    private int field485 = 0;

    @OriginalMember(owner = "client!fi", name = "db", descriptor = "I")
    private int field489 = 0;

    @OriginalMember(owner = "client!fi", name = "jb", descriptor = "I")
    private int field495 = 1365;

    @OriginalMember(owner = "client!fi", name = "fb", descriptor = "I")
    private int field491 = 20;

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "I")
    public static int field482 = 0;

    @OriginalMember(owner = "client!fi", name = "eb", descriptor = "[I")
    public static int[] field490 = new int[128];

    @OriginalMember(owner = "client!fi", name = "Y", descriptor = "[I")
    public static int[] field484 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!fi", name = "gb", descriptor = "Lck;")
    public static class119 field492 = class298.method1987((byte) 69, "s3g");

    @OriginalMember(owner = "client!fi", name = "mb", descriptor = "Lck;")
    public static class119 field498 = class298.method1987((byte) 72, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!fi", name = "V", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!fi", name = "X", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!fi", name = "ab", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!fi", name = "bb", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!fi", name = "cb", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!fi", name = "hb", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!fi", name = "ib", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!fi", name = "kb", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!fi", name = "lb", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "[Lck;")
    public static class119[] field480;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;", line = 5)
    public static final Class method252(boolean arg0, String arg1) throws ClassNotFoundException {
        field487++;
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
        } else {
            if (!arg0) {
                method253((byte) 21, 24);
            }
            return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(BI)Z", line = 44)
    public static final boolean method253(byte arg0, int arg1) {
        field483++;
        if (arg0 <= 28) {
            return false;
        } else {
            return (arg1 >> 29 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V", line = 55)
    public static void method254(int arg0) {
        if (arg0 != 0) {
            method256(false);
        }
        field492 = null;
        field480 = null;
        field490 = null;
        field498 = null;
        field484 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZ)[I", line = 75)
    public final int[] method11(int arg0, boolean arg1) {
        if (arg1) {
            field492 = (class119) null;
        }
        int[] var3 = this.field3106.method924(100, arg0);
        field497++;
        if (this.field3106.field2260) {
            for (int var4 = 0; var4 < class157.field2504; var4++) {
                int var5 = (class157.field2505[var4] << 12) / this.field495 + this.field485;
                int var6 = (class215.field3424[arg0] << 12) / this.field495 + this.field489;
                int var7 = var5;
                int var8 = var5;
                int var9 = var6;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = 0;
                for (int var13 = var6 * var6 >> 12; (var11 + var13) < 16384 && var12 < this.field491; var13 = var9 * var9 >> 12) {
                    var9 = (var8 * var9 >> 12) * 2 + var10;
                    var12++;
                    var8 = var11 + var7 - var13;
                    var11 = var8 * var8 >> 12;
                }
                var3[var4] = this.field491 - 1 <= var12 ? 0 : (var12 << 12) / this.field491;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lfj;II)V", line = 132)
    public final void method13(class3 arg0, int arg1, int arg2) {
        field488++;
        if (arg2 == 0) {
            this.field495 = arg0.method63((byte) 1);
        } else if (arg2 == 1) {
            this.field491 = arg0.method63((byte) 1);
        } else if (arg2 == 2) {
            this.field485 = arg0.method63((byte) 1);
        } else if (arg2 == 3) {
            this.field489 = arg0.method63((byte) 1);
        }
        if (arg1 >= -117) {
            field480 = (class119[]) null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(III)V", line = 192)
    public static final void method255(int arg0, int arg1, int arg2) {
        if (class78.field1205 != 0 && arg1 != -1) {
            class55.method407(arg1, false, class78.field1205, (byte) 127, 0, class13.field208);
            class196.field3151 = true;
        }
        field493++;
        if (arg2 != 2) {
            method253((byte) -127, 61);
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V", line = 248)
    public class35() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(Z)Ltk;", line = 234)
    public static final class230 method256(boolean arg0) {
        if (!arg0) {
            field484 = (int[]) null;
        }
        field494++;
        try {
            return (class230) Class.forName("lj").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }
}
