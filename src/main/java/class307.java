import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class307 extends class339 {

    @OriginalMember(owner = "client!bca", name = "L", descriptor = "Z")
    public boolean field4116 = true;

    @OriginalMember(owner = "client!bca", name = "I", descriptor = "I")
    public static int field4113 = 0;

    @OriginalMember(owner = "client!bca", name = "u", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!bca", name = "v", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!bca", name = "x", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!bca", name = "z", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!bca", name = "B", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!bca", name = "C", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!bca", name = "E", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!bca", name = "G", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!bca", name = "J", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!bca", name = "K", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!bca", name = "M", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!bca", name = "N", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!bca", name = "O", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!bca", name = "A", descriptor = "Lga;")
    public static class332 field4105;

    @OriginalMember(owner = "client!bca", name = "y", descriptor = "Lwq;")
    public class378 field4103;

    @OriginalMember(owner = "client!bca", name = "F", descriptor = "Lpb;")
    public static class400 field4110;

    @OriginalMember(owner = "client!bca", name = "H", descriptor = "[I")
    private int[] field4112;

    @OriginalMember(owner = "client!bca", name = "P", descriptor = "[I")
    public int[] field4120;

    @OriginalMember(owner = "client!bca", name = "D", descriptor = "[Ljava/lang/String;")
    private String[] field4108;

    @OriginalMember(owner = "client!bca", name = "w", descriptor = "[[I")
    private int[][] field4101;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)I", line = 3)
    public final int method1797(int arg0) {
        field4099++;
        if (this.field4112 == null) {
            return 0;
        } else {
            if (arg0 > -57) {
                this.field4101 = null;
            }
            return this.field4112.length;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(BI)Llg;", line = 21)
    public final class32 method1798(byte arg0, int arg1) {
        field4102++;
        if (this.field4112 == null || arg1 < 0 || this.field4112.length < arg1) {
            return null;
        } else if (arg0 == -76) {
            return class71.method392((byte) 16, this.field4112[arg1]);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(III)I", line = 38)
    public final int method1799(int arg0, int arg1, int arg2) {
        field4118++;
        if (this.field4112 == null || arg0 < 0 || this.field4112.length < arg0) {
            return -1;
        } else if (this.field4101[arg0] == null || arg2 < 0 || this.field4101[arg0].length < arg2) {
            return -1;
        } else {
            if (arg1 < 57) {
                this.method1806(false, 79, null);
            }
            return this.field4101[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(B[BII[BIIII)V", line = 55)
    public static final void method1800(byte arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        field4109++;
        int var9 = -(arg7 >> 2);
        int var10 = -(arg7 & 0x3);
        for (int var11 = -arg5; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg8++;
                arg1[var10001] += arg4[arg2++];
                int var14 = arg8++;
                arg1[var14] += arg4[arg2++];
                int var15 = arg8++;
                arg1[var15] += arg4[arg2++];
                int var16 = arg8++;
                arg1[var16] += arg4[arg2++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg8++;
                arg1[var10001] += arg4[arg2++];
            }
            arg2 += arg6;
            arg8 += arg3;
        }
        if (arg0 <= 125) {
            field4110 = null;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "([IILio;)V", line = 108)
    public final void method1801(int[] arg0, int arg1, class157 arg2) {
        field4115++;
        if (this.field4112 == null) {
            return;
        }
        if (arg1 != 4039) {
            this.field4120 = null;
        }
        for (int var4 = 0; var4 < this.field4112.length; var4++) {
            if (var4 >= arg0.length) {
                return;
            }
            int var5 = this.method1798((byte) -76, var4).field444;
            if (var5 > 0) {
                arg2.method965(-8, var5, (long) arg0[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Z)V", line = 135)
    public final void method1802(boolean arg0) {
        field4119++;
        if (this.field4120 != null) {
            for (int var2 = 0; var2 < this.field4120.length; var2++) {
                this.field4120[var2] = class665.method3789(this.field4120[var2], 32768);
            }
        }
        if (!arg0) {
            this.method1802(false);
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(ILio;)V", line = 157)
    public final void method1803(int arg0, class157 arg1) {
        while (true) {
            int var3 = arg1.method930(255);
            if (var3 == 0) {
                int var4 = 73 % ((72 - arg0) / 37);
                field4106++;
                return;
            }
            this.method1806(false, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!bca", name = "d", descriptor = "(I)V", line = 176)
    public static void method1804(int arg0) {
        field4110 = null;
        field4105 = null;
        if (arg0 != 60) {
            field4110 = null;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lto;I)V", line = 189)
    public static final void method1805(class229 arg0, int arg1) {
        field4117++;
        class223.field2892.method2507(arg0, (byte) -125);
        arg0.field2964 = arg0.field2971.field2219;
        class315.field4229 += arg0.field2964;
        if (arg1 != -14704) {
            field4110 = null;
        }
        arg0.field2971.field2219 = 0;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(ZILio;)V", line = 205)
    private final void method1806(boolean arg0, int arg1, class157 arg2) {
        field4111++;
        if (arg0) {
            this.method1810(85, null);
        }
        if (arg1 == 1) {
            this.field4108 = class87.method475('<', arg2.method925(67), false);
        } else if (arg1 == 2) {
            int var4 = arg2.method930(255);
            this.field4120 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4120[var5] = arg2.method963(-124);
            }
        } else if (arg1 == 3) {
            int var6 = arg2.method930(255);
            this.field4101 = new int[var6][];
            this.field4112 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg2.method963(-124);
                class32 var9 = class71.method392((byte) 16, var8);
                if (var9 != null) {
                    this.field4112[var7] = var8;
                    this.field4101[var7] = new int[var9.field448];
                    for (int var10 = 0; var10 < var9.field448; var10++) {
                        this.field4101[var7][var10] = arg2.method963(-126);
                    }
                }
            }
        } else if (arg1 == 4) {
            this.field4116 = false;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(ZI)I", line = 279)
    public static final int method1807(boolean arg0, int arg1) {
        field4104++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        if (arg0) {
            int var3 = arg1 * 6 - 61440;
            int var4 = (arg1 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        } else {
            return 120;
        }
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(Z)Ljava/lang/String;", line = 298)
    public final String method1808(boolean arg0) {
        field4114++;
        if (arg0) {
            return null;
        }
        StringBuffer var2 = new StringBuffer(80);
        if (this.field4108 == null) {
            return "";
        }
        var2.append(this.field4108[0]);
        for (int var3 = 1; var3 < this.field4108.length; var3++) {
            var2.append("...");
            var2.append(this.field4108[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 325)
    public static final void method1809(String arg0, byte arg1) {
        System.out.println("Error: " + class399.method2279("\n", "%0a", arg0, -1623128409));
        if (arg1 < 65) {
            field4110 = null;
        }
        field4107++;
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(ILio;)Ljava/lang/String;", line = 351)
    public final String method1810(int arg0, class157 arg1) {
        field4100++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field4112 != null) {
            for (int var4 = 0; var4 < this.field4112.length; var4++) {
                var3.append(this.field4108[var4]);
                var3.append(this.field4103.method2160(false, this.field4101[var4], arg1.method952(22737, class71.method392((byte) 16, this.field4112[var4]).field450), this.method1798((byte) -76, var4)));
            }
        }
        if (arg0 > -56) {
            return null;
        } else {
            var3.append(this.field4108[this.field4108.length - 1]);
            return var3.toString();
        }
    }
}
