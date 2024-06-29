import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public class class619 {

    @OriginalMember(owner = "client!kia", name = "d", descriptor = "[Ljava/lang/String;")
    private String[] field8853 = new String[0];

    @OriginalMember(owner = "client!kia", name = "m", descriptor = "I")
    private int field8862 = -1;

    @OriginalMember(owner = "client!kia", name = "h", descriptor = "Z")
    private boolean field8857 = false;

    @OriginalMember(owner = "client!kia", name = "n", descriptor = "I")
    private int field8863;

    @OriginalMember(owner = "client!kia", name = "g", descriptor = "[I")
    public static int[] field8856 = new int[3];

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "Z")
    public static boolean field8851 = false;

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "I")
    public static int field8850;

    @OriginalMember(owner = "client!kia", name = "c", descriptor = "I")
    public static int field8852;

    @OriginalMember(owner = "client!kia", name = "e", descriptor = "I")
    public static int field8854;

    @OriginalMember(owner = "client!kia", name = "f", descriptor = "I")
    public static int field8855;

    @OriginalMember(owner = "client!kia", name = "i", descriptor = "I")
    public static int field8858;

    @OriginalMember(owner = "client!kia", name = "j", descriptor = "I")
    public static int field8859;

    @OriginalMember(owner = "client!kia", name = "k", descriptor = "I")
    public static int field8860;

    @OriginalMember(owner = "client!kia", name = "l", descriptor = "I")
    public static int field8861;

    @OriginalMember(owner = "client!kia", name = "o", descriptor = "I")
    public static int field8864;

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(II)I", line = 6)
    private final int method3529(int arg0, int arg1) {
        field8854++;
        int var3 = this.field8853.length;
        if (arg1 < 87) {
            return -26;
        }
        while (var3 <= arg0) {
            if (!this.field8857) {
                var3 += this.field8863;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field8863 * var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "(II)V", line = 42)
    private final void method3530(int arg0, int arg1) {
        field8860++;
        String[] var3 = new String[this.method3529(arg0, 100)];
        if (arg1 != 2048) {
            this.field8863 = 117;
        }
        class143.method892(this.field8853, 0, var3, 0, this.field8853.length);
        this.field8853 = var3;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(ZII)Z", line = 57)
    public static final boolean method3531(boolean arg0, int arg1, int arg2) {
        field8859++;
        if (arg0) {
            return (arg1 & 0x800) != 0 && (arg2 & 0x37) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kia", name = "toString", descriptor = "()Ljava/lang/String;", line = 68)
    public final String toString() {
        field8861++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field8862; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field8853[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(IZ)V", line = 277)
    public class619(int arg0, boolean arg1) {
        this.field8863 = arg0;
        this.field8857 = arg1;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(I)V", line = 106)
    public static void method3532(int arg0) {
        field8856 = null;
        if (arg0 != 0) {
            field8856 = null;
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(BIIIII)V", line = 116)
    public static final void method3533(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8864++;
        int var6 = arg3 - arg5;
        int var7 = arg4 - arg1;
        if (var7 == 0) {
            if (var6 != 0) {
                class209.method1245(arg1, 8, arg2, arg5, arg3);
            }
        } else if (var6 == 0) {
            class687.method3884(arg1, -1699468752, arg2, arg4, arg5);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg1;
                arg1 = arg5;
                int var10 = arg4;
                arg4 = arg3;
                arg5 = var9;
                arg3 = var10;
            }
            if (arg4 < arg1) {
                int var11 = arg1;
                arg1 = arg4;
                int var12 = arg5;
                arg5 = arg3;
                arg4 = var11;
                arg3 = var12;
            }
            int var13 = arg5;
            int var14 = arg4 - arg1;
            int var15 = arg3 - arg5;
            int var16 = -(var14 >> 1);
            if (arg0 == 75) {
                int var17 = arg5 < arg3 ? 1 : -1;
                if (var15 < 0) {
                    var15 = -var15;
                }
                if (var8) {
                    for (int var19 = arg1; var19 <= arg4; var19++) {
                        class408.field5585[var19][var13] = arg2;
                        var16 += var15;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                } else {
                    for (int var18 = arg1; var18 <= arg4; var18++) {
                        class408.field5585[var13][var18] = arg2;
                        var16 += var15;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 238)
    public final void method3534(String arg0, boolean arg1) {
        field8850++;
        this.method3535((byte) -89, this.field8862 + 1, arg0);
        if (arg1) {
            this.field8853 = null;
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(BILjava/lang/String;)V", line = 252)
    private final void method3535(byte arg0, int arg1, String arg2) {
        if (arg0 != -89) {
            return;
        }
        field8855++;
        if (this.field8862 < arg1) {
            this.field8862 = arg1;
        }
        if (arg1 >= this.field8853.length) {
            this.method3530(arg1, 2048);
        }
        this.field8853[arg1] = arg2;
    }

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "(I)[Ljava/lang/String;", line = 286)
    public final String[] method3536(int arg0) {
        if (arg0 == -10512) {
            field8852++;
            String[] var2 = new String[this.field8862 + 1];
            class143.method892(this.field8853, 0, var2, 0, this.field8862 + 1);
            return var2;
        } else {
            return null;
        }
    }
}
