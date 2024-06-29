import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class81 extends class152 implements class458 {

    @OriginalMember(owner = "client!ps", name = "v", descriptor = "I")
    private int field1175;

    @OriginalMember(owner = "client!ps", name = "p", descriptor = "Z")
    public static boolean field1169 = true;

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "Lpe;")
    public static class564 field1167 = new class564();

    @OriginalMember(owner = "client!ps", name = "l", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!ps", name = "m", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!ps", name = "o", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!ps", name = "q", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!ps", name = "r", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!ps", name = "s", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!ps", name = "t", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!ps", name = "u", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)I")
    public final int method664(int arg0) {
        ++field1171;
        if (arg0 != 25779) {
            this.method670(26);
        }
        return super.field1878;
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lkga;I[BIZ)V")
    public class81(class506 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field1175 = arg1;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(CII)I")
    public static final int method665(char arg0, int arg1, int arg2) {
        ++field1173;
        if (arg2 < 95) {
            method668((class389) null, -108);
        }
        int var3 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            char var4 = Character.toLowerCase(arg0);
            var3 = (var4 << 4) + 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I[BLjava/lang/String;I)I")
    public static final int method666(int arg0, byte[] arg1, String arg2, int arg3) {
        ++field1166;
        int var4 = arg2.length();
        int var5 = arg3;
        if (arg0 != 6) {
            field1169 = true;
        }
        for (int var6 = 0; ~var4 < ~var6; ++var6) {
            char var7 = arg2.charAt(var6);
            if (~var7 < -128) {
                if (~var7 < -2048) {
                    arg1[var5++] = (byte) class242.method1474(var7 >> 12, 224);
                    arg1[var5++] = (byte) class242.method1474(class435.method2605(var7 >> 6, 63), 128);
                    arg1[var5++] = (byte) class242.method1474(class435.method2605(63, var7), 128);
                } else {
                    arg1[var5++] = (byte) class242.method1474(192, var7 >> 6);
                    arg1[var5++] = (byte) class242.method1474(class435.method2605(63, var7), 128);
                }
            } else {
                arg1[var5++] = (byte) var7;
            }
        }
        return -arg3 + var5;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)J")
    public final long method667(byte arg0) {
        if (arg0 != -102) {
            field1167 = null;
        }
        ++field1165;
        return 0L;
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lkga;ILjaclib/memory/Buffer;IZ)V")
    public class81(class506 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field1175 = arg1;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lun;I)V")
    public static final void method668(class389 arg0, int arg1) {
        ++field1168;
        if (arg0.field5205.length - arg0.field5195 >= 1) {
            int var2 = arg0.method2229(255);
            if (~var2 <= -1 && ~var2 >= -2) {
                if (arg1 != -11519) {
                    field1169 = false;
                }
                if (arg0.field5205.length + -arg0.field5195 >= 2) {
                    int var3 = arg0.method2260(-48);
                    if (arg0.field5205.length + -arg0.field5195 >= var3 * 6) {
                        for (int var4 = 0; ~var4 > ~var3; ++var4) {
                            int var5 = arg0.method2260(arg1 + 11447);
                            int var6 = arg0.method2255(255);
                            if (~class415.field5874.length < ~var5 && class25.field591[var5] && (~class385.field5129.method630((byte) 103, var5).field5680 != -50 || ~var6 <= 0 && var6 <= 1)) {
                                class415.field5874[var5] = var6;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Z)V")
    public final void method669(boolean arg0) {
        ++field1174;
        if (!arg0) {
            field1169 = true;
        }
        super.field1877.method2947((byte) 79, this);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)I")
    public final int method670(int arg0) {
        ++field1172;
        if (arg0 != 30863) {
            this.method669(false);
        }
        return this.field1175;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(Z)V")
    public static void method671(boolean arg0) {
        field1167 = null;
        if (arg0) {
            method665((char) 65427, -104, -54);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I[BII)V")
    public final void method672(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 != 25735) {
            this.method667((byte) 58);
        }
        this.method976(arg0 ^ 26344, arg1, arg2);
        ++field1170;
        this.field1175 = arg3;
    }
}
