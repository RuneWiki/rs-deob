import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class384 {

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "I")
    private int field5757 = -1;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "Z")
    private boolean field5764 = false;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "[Ljava/lang/String;")
    private String[] field5759 = new String[0];

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
    private int field5761;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "Z")
    public static boolean field5767 = false;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    private final void method2372(String arg0, int arg1, byte arg2) {
        field5762++;
        if (arg2 != 55) {
            return;
        }
        if (arg1 > this.field5757) {
            this.field5757 = arg1;
        }
        if (arg1 >= this.field5759.length) {
            this.method2373(arg1, 0);
        }
        this.field5759[arg1] = arg0;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)V")
    private final void method2373(int arg0, int arg1) {
        field5758++;
        String[] var3 = new String[this.method2377(arg0, -1)];
        class667.method3744(this.field5759, arg1, var3, 0, this.field5759.length);
        this.field5759 = var3;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method2374(String arg0, int arg1) {
        field5760++;
        this.method2372(arg0, this.field5757 + 1, (byte) 55);
        int var3 = 73 / ((39 - arg1) / 50);
    }

    @OriginalMember(owner = "client!kp", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5768++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field5757; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field5759[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)[Ljava/lang/String;")
    public final String[] method2375(int arg0) {
        field5766++;
        String[] var2 = new String[this.field5757 + arg0];
        class667.method3744(this.field5759, 0, var2, 0, this.field5757 + 1);
        return var2;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(IZ)V")
    public class384(int arg0, boolean arg1) {
        this.field5764 = arg1;
        this.field5761 = arg0;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIII)V")
    public static final void method2376(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5765++;
        int var5 = 0;
        int var6 = arg2;
        if (arg0 > -23) {
            return;
        }
        int var7 = -arg2;
        int var8 = -1;
        int var9 = class79.method461((byte) 79, class375.field5631, arg2 + arg4, class175.field2455);
        int var10 = class79.method461((byte) 98, class375.field5631, arg4 - arg2, class175.field2455);
        class41.method235(var10, class565.field8253[arg1], 0, var9, arg3);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg1 - var6;
                int var12 = arg1 + var6;
                if (var12 >= class323.field4704 && var11 <= class148.field2106) {
                    int var13 = class79.method461((byte) 69, class375.field5631, arg4 + var5, class175.field2455);
                    int var14 = class79.method461((byte) 46, class375.field5631, arg4 - var5, class175.field2455);
                    if (class148.field2106 >= var12) {
                        class41.method235(var14, class565.field8253[var12], 0, var13, arg3);
                    }
                    if (class323.field4704 <= var11) {
                        class41.method235(var14, class565.field8253[var11], 0, var13, arg3);
                    }
                }
            }
            var5++;
            int var15 = arg1 - var5;
            int var16 = arg1 + var5;
            if (var16 >= class323.field4704 && var15 <= class148.field2106) {
                int var17 = class79.method461((byte) 123, class375.field5631, arg4 + var6, class175.field2455);
                int var18 = class79.method461((byte) 56, class375.field5631, arg4 - var6, class175.field2455);
                if (var16 <= class148.field2106) {
                    class41.method235(var18, class565.field8253[var16], 0, var17, arg3);
                }
                if (var15 >= class323.field4704) {
                    class41.method235(var18, class565.field8253[var15], 0, var17, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)I")
    private final int method2377(int arg0, int arg1) {
        field5763++;
        int var3 = this.field5759.length;
        while (arg0 >= var3) {
            if (!this.field5764) {
                var3 += this.field5761;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field5761 * var3;
            }
        }
        if (arg1 != -1) {
            this.method2374(null, 75);
        }
        return var3;
    }
}
