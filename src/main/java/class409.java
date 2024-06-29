import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class409 extends class187 {

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "Z")
    public boolean field5909 = true;

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "I")
    public static int field5910 = 0;

    @OriginalMember(owner = "client!ik", name = "M", descriptor = "[I")
    public static int[] field5924 = new int[8];

    @OriginalMember(owner = "client!ik", name = "O", descriptor = "[I")
    public static int[] field5926 = new int[5];

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!ik", name = "F", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!ik", name = "H", descriptor = "I")
    public static int field5919;

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!ik", name = "J", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!ik", name = "L", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!ik", name = "N", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!ik", name = "P", descriptor = "I")
    public static int field5927;

    @OriginalMember(owner = "client!ik", name = "Q", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "[I")
    private int[] field5912;

    @OriginalMember(owner = "client!ik", name = "K", descriptor = "[I")
    public int[] field5922;

    @OriginalMember(owner = "client!ik", name = "G", descriptor = "[Ljava/lang/String;")
    private String[] field5918;

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "[[I")
    private int[][] field5911;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([ILtq;B)V", line = 7)
    public final void method2542(int[] arg0, class250 arg1, byte arg2) {
        field5927++;
        if (this.field5912 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field5912.length && var4 < arg0.length; var4++) {
            int var5 = class451.field6554[this.method2548(arg2 + 34, var4)];
            if (var5 > 0) {
                arg1.method1336(var5, (long) arg0[var4], 102);
            }
        }
        if (arg2 != 85) {
            this.method2542((int[]) null, (class250) null, (byte) -37);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)V", line = 39)
    public static final void method2543(int arg0, int arg1) {
        field5925++;
        if (arg1 < 88) {
            field5910 = 71;
        }
        class344.field4615.method614(-126, arg0);
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)Ljava/lang/String;", line = 53)
    public final String method2544(byte arg0) {
        field5915++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field5918 == null) {
            return "";
        }
        var2.append(this.field5918[0]);
        for (int var3 = 1; var3 < this.field5918.length; var3++) {
            var2.append("...");
            var2.append(this.field5918[var3]);
        }
        return arg0 == -92 ? var2.toString() : null;
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)I", line = 84)
    public final int method2545(int arg0) {
        field5919++;
        if (this.field5912 == null) {
            return 0;
        } else {
            if (arg0 != 32768) {
                this.field5909 = false;
            }
            return this.field5912.length;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILjava/util/Random;I)I", line = 109)
    public static final int method2546(int arg0, Random arg1, int arg2) {
        field5917++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class234.method1268((byte) -126, arg2)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg2);
            if (arg0 != 18992) {
                field5910 = -27;
            }
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            return class56.method293(var4, -1, arg2);
        }
    }

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "(I)V", line = 138)
    public static void method2547(int arg0) {
        field5926 = null;
        if (arg0 >= -83) {
            field5926 = null;
        }
        field5924 = null;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)I", line = 154)
    public final int method2548(int arg0, int arg1) {
        field5921++;
        int var3 = 67 / ((63 - arg0) / 53);
        return this.field5912 == null || arg1 < 0 || this.field5912.length < arg1 ? -1 : this.field5912[arg1];
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IZI)I", line = 168)
    public final int method2549(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field5926 = null;
        }
        field5913++;
        if (this.field5912 == null || arg2 < 0 || this.field5912.length < arg2) {
            return -1;
        } else if (this.field5911[arg2] == null || arg0 < 0 || arg0 > this.field5911[arg2].length) {
            return -1;
        } else {
            return this.field5911[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ltq;I)Ljava/lang/String;", line = 193)
    public final String method2550(class250 arg0, int arg1) {
        field5923++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field5912 != null) {
            for (int var4 = 0; var4 < this.field5912.length; var4++) {
                var3.append(this.field5918[var4]);
                var3.append(class123.method656(arg0.method1358((byte) 124, class210.field2857[this.field5912[var4]]), true, this.field5912[var4], this.field5911[var4]));
            }
        }
        var3.append(this.field5918[this.field5918.length - 1]);
        if (arg1 != -1) {
            field5910 = -12;
        }
        return var3.toString();
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(Ltq;I)V", line = 224)
    public final void method2551(class250 arg0, int arg1) {
        if (arg1 != 0) {
            this.method2545(77);
        }
        field5920++;
        while (true) {
            int var3 = arg0.method1350(31351);
            if (var3 == 0) {
                return;
            }
            this.method2553(arg0, var3, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "(I)V", line = 245)
    public static final void method2552(int arg0) {
        field5916++;
        if (arg0 == 0) {
            class58.field601.method613(true);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ltq;IB)V", line = 259)
    private final void method2553(class250 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field5918 = class167.method889(-62, arg0.method1349(-1754884856), '<');
        } else if (arg1 == 2) {
            int var4 = arg0.method1350(31351);
            this.field5922 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5922[var5] = arg0.method1374(-2);
            }
        } else if (arg1 == 3) {
            int var6 = arg0.method1350(31351);
            this.field5911 = new int[var6][];
            this.field5912 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method1374(-2);
                this.field5912[var7] = var8;
                this.field5911[var7] = new int[class437.field6394[var8]];
                for (int var9 = 0; var9 < class437.field6394[var8]; var9++) {
                    this.field5911[var7][var9] = arg0.method1374(-2);
                }
            }
        } else if (arg1 == 4) {
            this.field5909 = false;
        }
        field5914++;
        if (arg2 < 122) {
            this.field5922 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(B)V", line = 333)
    public final void method2554(byte arg0) {
        field5928++;
        if (this.field5922 != null) {
            for (int var2 = 0; var2 < this.field5922.length; var2++) {
                this.field5922[var2] = class392.method2441(this.field5922[var2], 32768);
            }
        }
        int var3 = 74 % ((arg0 - 51) / 46);
    }
}
