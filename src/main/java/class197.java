import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class197 {

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public int field2842 = -1;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public int field2846 = -1;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public int field2844 = 0;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "Z")
    public boolean field2851 = true;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "[Lfc;")
    public static class196[] field2850 = new class196[14];

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2847 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public static final void method1256(int arg0) {
        class240.field3602.method257(false);
        field2841++;
        if (arg0 != 8) {
            method1256(-21);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILkl;II)V")
    private final void method1257(int arg0, class114 arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            this.field2844 = class285.method1923(-1, arg1.method779(arg2 + 16681993));
        } else if (arg3 == 2) {
            this.field2842 = arg1.method760(false);
        } else if (arg3 == 3) {
            this.field2842 = arg1.method756(arg2 ^ 0xFFFFF8C4);
            if (this.field2842 == 65535) {
                this.field2842 = -1;
            }
        } else if (arg3 == 5) {
            this.field2851 = false;
        } else if (arg3 == 7) {
            this.field2846 = class285.method1923(arg2 - 29688, arg1.method779(16711680));
        } else if (arg3 == 8) {
            class148.field2119 = arg0;
        } else if (arg3 == 9) {
            arg1.method756(-29901);
        } else if (arg3 != 10) {
            if (arg3 == 11) {
                arg1.method760(false);
            } else if (arg3 != 12) {
                if (arg3 == 13) {
                    arg1.method779(16711680);
                } else if (arg3 == 14) {
                    arg1.method760(false);
                }
            }
        }
        field2848++;
        if (arg2 != 29687) {
            method1259((byte) -47);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZJIIB)Ljava/lang/String;")
    public static final String method1258(boolean arg0, long arg1, int arg2, int arg3, byte arg4) {
        field2845++;
        char var6 = ',';
        StringBuffer var7 = new StringBuffer(26);
        char var8 = '.';
        if (arg3 == 0) {
            var8 = ',';
            var6 = '.';
        }
        boolean var9 = false;
        if (arg3 == 2) {
            var8 = ' ';
        }
        if (arg1 < 0L) {
            var9 = true;
            arg1 = -arg1;
        }
        if (arg2 > 0) {
            for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = (int) arg1;
                arg1 /= 10L;
                var7.append((char) (var11 + 48 - ((int) arg1 * 10)));
            }
            var7.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg1;
            arg1 /= 10L;
            var7.append((char) (var13 + 48 - ((int) arg1 * 10)));
            if (arg1 == 0L) {
                if (var9) {
                    var7.append('-');
                }
                if (arg4 <= 64) {
                    field2850 = null;
                }
                return var7.reverse().toString();
            }
            if (arg0) {
                var12++;
                if (var12 % 3 == 0) {
                    var7.append(var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
    public static final void method1259(byte arg0) {
        class225.field3382.method257(false);
        field2843++;
        if (arg0 <= 95) {
            method1259((byte) 50);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lve;Lve;Lve;Lve;I)V")
    public static final void method1260(class233 arg0, class233 arg1, class233 arg2, class233 arg3, int arg4) {
        class87.field1342 = arg1;
        class102.field1522 = arg2;
        if (arg4 != 48) {
            method1260((class233) null, (class233) null, (class233) null, (class233) null, 64);
        }
        class86.field1331 = arg3;
        class141.field2037 = arg0;
        field2840++;
        class19.field268 = new class267[class87.field1342.method1526((byte) -4)][];
        class47.field671 = new boolean[class87.field1342.method1526((byte) 58)];
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
    public static void method1261(int arg0) {
        field2847 = null;
        if (arg0 <= 53) {
            method1256(-20);
        }
        field2850 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILkl;I)V")
    public final void method1262(int arg0, class114 arg1, int arg2) {
        field2849++;
        while (true) {
            int var4 = arg1.method760(false);
            if (var4 == 0) {
                if (arg2 == -1) {
                    return;
                } else {
                    this.method1257(-61, (class114) null, -18, -93);
                    return;
                }
            }
            this.method1257(arg0, arg1, 29687, var4);
        }
    }
}
