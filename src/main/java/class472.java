import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class472 extends class251 {

    @OriginalMember(owner = "client!dq", name = "z", descriptor = "Z")
    public boolean field7218 = true;

    @OriginalMember(owner = "client!dq", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field7212 = new String[200];

    @OriginalMember(owner = "client!dq", name = "w", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!dq", name = "x", descriptor = "I")
    public static int field7216;

    @OriginalMember(owner = "client!dq", name = "A", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!dq", name = "B", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!dq", name = "E", descriptor = "I")
    public static int field7222;

    @OriginalMember(owner = "client!dq", name = "G", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!dq", name = "I", descriptor = "I")
    public static int field7226;

    @OriginalMember(owner = "client!dq", name = "J", descriptor = "I")
    public static int field7227;

    @OriginalMember(owner = "client!dq", name = "K", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!dq", name = "L", descriptor = "I")
    public static int field7229;

    @OriginalMember(owner = "client!dq", name = "y", descriptor = "Ljl;")
    public class169 field7217;

    @OriginalMember(owner = "client!dq", name = "H", descriptor = "Llt;")
    public static class458 field7225;

    @OriginalMember(owner = "client!dq", name = "D", descriptor = "[I")
    private int[] field7221;

    @OriginalMember(owner = "client!dq", name = "F", descriptor = "[I")
    public int[] field7223;

    @OriginalMember(owner = "client!dq", name = "v", descriptor = "[Ljava/lang/String;")
    private String[] field7214;

    @OriginalMember(owner = "client!dq", name = "u", descriptor = "[[I")
    private int[][] field7213;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "(I)V")
    public final void method2836(int arg0) {
        field7219++;
        if (arg0 != 200) {
            field7225 = null;
        }
        if (this.field7223 != null) {
            for (int var2 = 0; var2 < this.field7223.length; var2++) {
                this.field7223[var2] = class318.method1973(this.field7223[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
    public static void method2837(byte arg0) {
        field7212 = null;
        if (arg0 > -125) {
            method2837((byte) -111);
        }
        field7225 = null;
    }

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "(I)I")
    public final int method2838(int arg0) {
        if (arg0 == 4117) {
            field7215++;
            return this.field7221 == null ? 0 : this.field7221.length;
        } else {
            return 25;
        }
    }

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "(B)Ljava/lang/String;")
    public final String method2839(byte arg0) {
        if (arg0 != 110) {
            this.field7217 = null;
        }
        field7228++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field7214 == null) {
            return "";
        }
        var2.append(this.field7214[0]);
        for (int var3 = 1; var3 < this.field7214.length; var3++) {
            var2.append("...");
            var2.append(this.field7214[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lha;I)Ljava/lang/String;")
    public final String method2840(class40 arg0, int arg1) {
        field7216++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field7221 != null) {
            for (int var4 = 0; var4 < this.field7221.length; var4++) {
                var3.append(this.field7214[var4]);
                var3.append(this.field7217.method1061(this.method2846(var4, (byte) -76), 126, this.field7213[var4], arg0.method242((byte) -25, class455.method2702(this.field7221[var4], true).field2083)));
            }
        }
        var3.append(this.field7214[this.field7214.length + arg1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(Lha;I)V")
    public final void method2841(class40 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method257((byte) 86);
            if (var3 == 0) {
                if (arg1 != 0) {
                    this.method2839((byte) 85);
                }
                field7227++;
                return;
            }
            this.method2842(arg0, arg1 - 5, var3);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lha;II)V")
    private final void method2842(class40 arg0, int arg1, int arg2) {
        if (arg1 != -5) {
            this.field7221 = null;
        }
        field7222++;
        if (arg2 == 1) {
            this.field7214 = class499.method3003('<', arg1 + 6, arg0.method239(true));
        } else if (arg2 == 2) {
            int var9 = arg0.method257((byte) 56);
            this.field7223 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field7223[var10] = arg0.method254((byte) -98);
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method257((byte) 54);
            this.field7213 = new int[var4][];
            this.field7221 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method254((byte) -92);
                class131 var7 = class455.method2702(var6, true);
                if (var7 != null) {
                    this.field7221[var5] = var6;
                    this.field7213[var5] = new int[var7.field2090];
                    for (int var8 = 0; var8 < var7.field2090; var8++) {
                        this.field7213[var5][var8] = arg0.method254((byte) -98);
                    }
                }
            }
            return;
        } else if (arg2 == 4) {
            this.field7218 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(III)I")
    public final int method2843(int arg0, int arg1, int arg2) {
        if (arg0 != -15682) {
            field7212 = null;
        }
        field7229++;
        if (this.field7221 == null || arg2 < 0 || this.field7221.length < arg2) {
            return -1;
        } else if (this.field7213[arg2] == null || arg1 < 0 || this.field7213[arg2].length < arg1) {
            return -1;
        } else {
            return this.field7213[arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "(I)V")
    public static final void method2844(int arg0) {
        field7220++;
        for (int var1 = arg0; var1 < class146.field2369.length; var1++) {
            for (int var2 = 0; var2 < class146.field2369[0].length; var2++) {
                for (int var3 = 0; var3 < class146.field2369[0][0].length; var3++) {
                    class146.field2369[var1][var2][var3] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "([ILha;B)V")
    public final void method2845(int[] arg0, class40 arg1, byte arg2) {
        field7226++;
        if (this.field7221 == null || arg2 >= -1) {
            return;
        }
        for (int var4 = 0; var4 < this.field7221.length; var4++) {
            if (var4 >= arg0.length) {
                return;
            }
            int var5 = this.method2846(var4, (byte) -86).field2086;
            if (var5 > 0) {
                arg1.method258(var5, (byte) -103, (long) arg0[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IB)Lhi;")
    public final class131 method2846(int arg0, byte arg1) {
        field7224++;
        if (this.field7221 == null || arg0 < 0 || this.field7221.length < arg0) {
            return null;
        } else {
            int var3 = -108 / ((-arg1 - 18) / 36);
            return class455.method2702(this.field7221[arg0], true);
        }
    }
}
