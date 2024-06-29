import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class61 {

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "[Lda;")
    public static class205[] field1025 = new class205[6];

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field1032 = 0;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "[[B")
    public static byte[][] field1030 = new byte[250][];

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Lml;")
    public static class17 field1027;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILjava/lang/String;)I", line = 5)
    public static final int method504(int arg0, String arg1) {
        field1031++;
        if (arg0 < 57) {
            method505((class57) null, 27);
        }
        for (int var2 = 0; var2 < class143.field2329.length; var2++) {
            if (class143.field2329[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lth;I)V", line = 28)
    public static final void method505(class57 arg0, int arg1) {
        if (arg1 != -355) {
            field1032 = 57;
        }
        field1023++;
        class13.field135 = arg0;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V", line = 41)
    public static void method506(byte arg0) {
        field1025 = null;
        field1027 = null;
        if (arg0 != -3) {
            field1030 = (byte[][]) ((byte[][]) null);
        }
        field1030 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 56)
    public static final void method507(int arg0) {
        if (arg0 != -1003) {
            field1032 = 16;
        }
        class311.field4956.method2326(-4);
        field1026++;
        class186.field2997.method2326(-4);
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V", line = 69)
    public static final void method508(byte arg0) {
        if (arg0 != -39) {
            field1032 = -118;
        }
        if (class174.field2774 < class174.field2779) {
            class174.field2774 = (float) ((double) class174.field2774 / 30.0D + (double) class174.field2774);
            if (class174.field2779 < class174.field2774) {
                class174.field2774 = class174.field2779;
            }
            class41.method268((byte) 118);
        } else if (class174.field2774 > class174.field2779) {
            class174.field2774 = (float) ((double) class174.field2774 - (double) class174.field2774 / 30.0D);
            if (class174.field2774 < class174.field2779) {
                class174.field2774 = class174.field2779;
            }
            class41.method268((byte) 120);
        }
        field1024++;
        if (class2.field7 != -1 && class198.field3162 != -1) {
            int var1 = class2.field7 - class350.field5551;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            class350.field5551 += var1;
            int var2 = class198.field3162 - class208.field3268;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            class208.field3268 -= -var2;
            if (var1 == 0 && var2 == 0) {
                class198.field3162 = -1;
                class2.field7 = -1;
            }
            class41.method268((byte) 114);
        }
        if (class248.field4048 <= 0) {
            class255.field4296 = -1;
            class74.field1256 = -1;
        } else {
            class226.field3727--;
            if (class226.field3727 == 0) {
                class248.field4048--;
                class226.field3727 = 100;
            }
        }
        if (!class141.field2313 || class206.field3260 == null) {
            return;
        }
        for (class267 var3 = (class267) class206.field3260.method2300((byte) 108); var3 != null; var3 = (class267) class206.field3260.method2306(-23)) {
            class213 var4 = class169.method1315(var3.field4464.field1011, 115);
            if (class142.field2323 == 0 && var3.method2025((byte) -114, class333.field5275, class77.field1343)) {
                if (!var3.field4464.field1021) {
                    var3.field4464.field1021 = true;
                    class235.method1807(var3.field4464.field1011, 15, var4.field3421, (byte) 83);
                }
                if (var3.field4464.field1021) {
                    class235.method1807(var3.field4464.field1011, 17, var4.field3421, (byte) 126);
                }
            } else if (var3.field4464.field1021) {
                var3.field4464.field1021 = false;
                class235.method1807(var3.field4464.field1011, 16, var4.field3421, (byte) -33);
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZII)V", line = 191)
    public static final void method509(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            return;
        }
        field1028++;
        if (arg3 == 1002) {
            class235.method1807(arg0, 10, arg2, (byte) 62);
        } else if (arg3 == 1006) {
            class235.method1807(arg0, 11, arg2, (byte) 88);
        } else if (arg3 == 1007) {
            class235.method1807(arg0, 12, arg2, (byte) 91);
        } else if (arg3 == 1012) {
            class235.method1807(arg0, 13, arg2, (byte) -104);
        } else if (arg3 == 1011) {
            class235.method1807(arg0, 14, arg2, (byte) -58);
        }
    }
}
