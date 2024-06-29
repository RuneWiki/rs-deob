import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class44 extends class30 {

    @OriginalMember(owner = "client!ga", name = "db", descriptor = "Z")
    private volatile boolean field1018 = false;

    @OriginalMember(owner = "client!ga", name = "nb", descriptor = "Z")
    private boolean field1028 = false;

    @OriginalMember(owner = "client!ga", name = "fb", descriptor = "I")
    private int field1020 = -1;

    @OriginalMember(owner = "client!ga", name = "ob", descriptor = "Ltb;")
    private class134 field1029;

    @OriginalMember(owner = "client!ga", name = "kb", descriptor = "Ltb;")
    private class134 field1025;

    @OriginalMember(owner = "client!ga", name = "eb", descriptor = "I")
    private int field1019;

    @OriginalMember(owner = "client!ga", name = "ab", descriptor = "Lja;")
    public static class63 field1015 = new class63(64);

    @OriginalMember(owner = "client!ga", name = "mb", descriptor = "Lge;")
    public static class47 field1027 = new class47(5000);

    @OriginalMember(owner = "client!ga", name = "wb", descriptor = "Lec;")
    private static class32 field1037 = class73.method594("M", true);

    @OriginalMember(owner = "client!ga", name = "xb", descriptor = "I")
    public static volatile int field1038 = -1;

    @OriginalMember(owner = "client!ga", name = "Bb", descriptor = "Lec;")
    public static class32 field1042 = field1037;

    @OriginalMember(owner = "client!ga", name = "vb", descriptor = "I")
    public static int field1036 = 0;

    @OriginalMember(owner = "client!ga", name = "tb", descriptor = "Lec;")
    public static class32 field1034 = class73.method594("Sprites geladen)3", true);

    @OriginalMember(owner = "client!ga", name = "Cb", descriptor = "[Z")
    public static boolean[] field1043 = new boolean[8];

    @OriginalMember(owner = "client!ga", name = "ub", descriptor = "[I")
    public static int[] field1035 = new int[500];

    @OriginalMember(owner = "client!ga", name = "pb", descriptor = "[J")
    public static long[] field1030 = new long[32];

    @OriginalMember(owner = "client!ga", name = "Fb", descriptor = "Lec;")
    public static class32 field1046 = class73.method594("http:)4)4www)3runescape)3com", true);

    @OriginalMember(owner = "client!ga", name = "Eb", descriptor = "Lec;")
    public static class32 field1045 = field1037;

    @OriginalMember(owner = "client!ga", name = "Y", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!ga", name = "Z", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!ga", name = "bb", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!ga", name = "cb", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!ga", name = "gb", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!ga", name = "hb", descriptor = "I")
    private int field1022;

    @OriginalMember(owner = "client!ga", name = "ib", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!ga", name = "jb", descriptor = "I")
    private int field1024;

    @OriginalMember(owner = "client!ga", name = "lb", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!ga", name = "qb", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!ga", name = "yb", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!ga", name = "zb", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!ga", name = "Db", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!ga", name = "Gb", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!ga", name = "sb", descriptor = "Lvf;")
    public static class152 field1033;

    @OriginalMember(owner = "client!ga", name = "rb", descriptor = "Lea;")
    public static class30 field1032;

    @OriginalMember(owner = "client!ga", name = "Ab", descriptor = "[Z")
    private volatile boolean[] field1041;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZIZZ[B)V")
    public final void method336(boolean arg0, int arg1, boolean arg2, boolean arg3, byte[] arg4) {
        ++field1021;
        if (arg2) {
            if (this.field1018) {
                throw new RuntimeException();
            }
            if (this.field1029 != null) {
                class27.method190(this.field1029, this.field1019, arg4, -31194);
            }
            this.method209(arg4, -14702);
            this.method342(-93);
        } else {
            arg4[arg4.length + -2] = (byte) (super.field545[arg1] >> 8);
            arg4[arg4.length + -1] = (byte) super.field545[arg1];
            if (this.field1025 != null) {
                class27.method190(this.field1025, arg1, arg4, -31194);
                this.field1041[arg1] = true;
            }
            if (arg0) {
                super.field542[arg1] = class73.method592(-127, arg4, false);
            }
        }
        if (arg3) {
            this.field1029 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(BI)V")
    public final void method205(byte arg0, int arg1) {
        class31.method226(68, this.field1019, arg1);
        ++field1016;
        if (arg0 != -99) {
            method343(-12, -99);
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(III)V")
    public final void method337(int arg0, int arg1, int arg2) {
        this.field1022 = arg0;
        this.field1024 = arg1;
        ++field1040;
        if (arg2 != 16782) {
            this.method337(30, 27, -77);
        }
        if (this.field1029 == null) {
            class126.method987(true, (byte) -106, (byte) 0, this.field1019, 255, this, this.field1024);
        } else {
            class88.method671(arg2 + -16667, this.field1019, this, this.field1029);
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Ltb;Ltb;IZZZ)V")
    public class44(class134 arg0, class134 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field1029 = arg1;
        this.field1025 = arg0;
        this.field1028 = arg5;
        this.field1019 = arg2;
        class52.method406(this.field1019, this, 20538);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
    public static void method338(byte arg0) {
        field1043 = null;
        field1046 = null;
        field1027 = null;
        field1033 = null;
        field1015 = null;
        field1035 = null;
        field1037 = null;
        field1032 = null;
        field1034 = null;
        field1042 = null;
        if (arg0 < -68) {
            field1045 = null;
            field1030 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)I")
    public final int method339(int arg0) {
        ++field1026;
        if (this.field1018) {
            return 100;
        } else if (super.field542 != null) {
            return 99;
        } else {
            if (arg0 != 20181) {
                method343(-89, -15);
            }
            int var2 = class62.method479(this.field1019, 255, (byte) 75);
            if (var2 >= 100) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(BI)I")
    private final int method340(byte arg0, int arg1) {
        ++field1013;
        if (super.field542[arg1] != null) {
            return 100;
        } else {
            int var3 = 71 / ((arg0 - -49) / 33);
            return this.field1041[arg1] ? 100 : class62.method479(arg1, this.field1019, (byte) 75);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZZ[BILtb;)V")
    public final void method341(boolean arg0, boolean arg1, byte[] arg2, int arg3, class134 arg4) {
        if (arg0) {
            this.method342(55);
        }
        ++field1014;
        if (this.field1029 != arg4) {
            if (!arg1 && ~this.field1020 == ~arg3) {
                this.field1018 = true;
            }
            if (arg2 != null && ~arg2.length < -3) {
                class134.field3122.reset();
                class134.field3122.update(arg2, 0, arg2.length + -2);
                int var6 = (int) class134.field3122.getValue();
                int var7 = (arg2[arg2.length + -2] << 8 & 65280) + (arg2[arg2.length + -1] & 255);
                if (super.field564[arg3] == var6 && ~super.field545[arg3] == ~var7) {
                    this.field1041[arg3] = true;
                    if (arg1) {
                        super.field542[arg3] = class73.method592(67, arg2, false);
                    }
                } else {
                    this.field1041[arg3] = false;
                    if (this.field1028 || arg1) {
                        class126.method987(arg1, (byte) -126, (byte) 2, arg3, this.field1019, this, super.field564[arg3]);
                    }
                }
            } else {
                this.field1041[arg3] = false;
                if (this.field1028 || arg1) {
                    class126.method987(arg1, (byte) -128, (byte) 2, arg3, this.field1019, this, super.field564[arg3]);
                }
            }
        } else if (this.field1018) {
            throw new RuntimeException();
        } else if (arg2 == null) {
            class126.method987(true, (byte) -126, (byte) 0, this.field1019, 255, this, this.field1024);
        } else {
            class134.field3122.reset();
            class134.field3122.update(arg2, 0, arg2.length);
            int var8 = (int) class134.field3122.getValue();
            class66 var9 = new class66(class97.method756(31535, arg2));
            int var10 = var9.method533(255);
            if (var10 != 5 && ~var10 != -7) {
                throw new RuntimeException("Incorrect JS5 protocol number: " + var10);
            } else {
                int var11 = 0;
                if (var10 >= 6) {
                    var11 = var9.method539(true);
                }
                if (this.field1024 != var8 || this.field1022 != var11) {
                    class126.method987(true, (byte) -117, (byte) 0, this.field1019, 255, this, this.field1024);
                } else {
                    this.method209(arg2, -14702);
                    this.method342(-114);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)V")
    private final void method342(int arg0) {
        this.field1041 = new boolean[super.field542.length];
        for (int var2 = 0; this.field1041.length > var2; ++var2) {
            this.field1041[var2] = false;
        }
        ++field1044;
        if (this.field1025 == null) {
            this.field1018 = true;
        } else {
            this.field1020 = -1;
            for (int var3 = 0; var3 < this.field1041.length; ++var3) {
                if (super.field548[var3] > 0) {
                    class130.method1004(var3, false, this.field1025, this);
                    this.field1020 = var3;
                }
            }
            if (arg0 >= -75) {
                field1045 = null;
            }
            if (this.field1020 == -1) {
                this.field1018 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "(II)I")
    public static final int method343(int arg0, int arg1) {
        int var7 = arg0 - 1;
        if (arg1 != -30310) {
            field1037 = null;
        }
        ++field1017;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V")
    public final void method199(int arg0, int arg1) {
        ++field1031;
        if (this.field1025 != null && this.field1041 != null && this.field1041[arg0]) {
            class88.method671(arg1 ^ 107, arg0, this, this.field1025);
        } else {
            class126.method987(true, (byte) -107, (byte) 2, arg0, this.field1019, this, super.field564[arg0]);
        }
        if (arg1 != 5) {
            this.method344(89);
        }
    }

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "(I)I")
    public final int method344(int arg0) {
        ++field1047;
        int var2 = 0;
        int var3 = arg0;
        for (int var4 = 0; ~var4 > ~super.field542.length; ++var4) {
            if (~super.field548[var4] < -1) {
                var2 += this.method340((byte) -110, var4);
                var3 += 100;
            }
        }
        if (var3 == 0) {
            return 100;
        } else {
            return var2 * 100 / var3;
        }
    }
}
