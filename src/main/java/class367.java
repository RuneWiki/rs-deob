import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class367 extends class376 {

    @OriginalMember(owner = "client!pt", name = "z", descriptor = "I")
    private int field5457;

    @OriginalMember(owner = "client!pt", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field5467 = new String[100];

    @OriginalMember(owner = "client!pt", name = "y", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!pt", name = "A", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!pt", name = "B", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!pt", name = "C", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!pt", name = "E", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!pt", name = "G", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!pt", name = "H", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!pt", name = "I", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!pt", name = "K", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!pt", name = "F", descriptor = "[Lgr;")
    public class298[] field5463;

    @OriginalMember(owner = "client!pt", name = "D", descriptor = "[[B")
    private byte[][] field5461;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BI)Z", line = 3)
    public final boolean method2265(byte arg0, int arg1) {
        field5464++;
        if (arg0 >= -43) {
            method2267((byte) 40);
        }
        return this.field5463[arg1].field4284;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IILga;Lya;IBI)V", line = 20)
    public static final void method2266(int arg0, int arg1, class277 arg2, class38 arg3, int arg4, byte arg5, int arg6) {
        if (class228.field3318 < 100) {
            class385.method2341(arg2, -118, arg3);
        }
        field5468++;
        arg3.method380(arg0, arg6, arg0 + arg1, arg4 + arg6);
        if (class228.field3318 < 100) {
            byte var7 = 20;
            int var8 = arg1 / 2 + arg0;
            arg3.method386(arg0, arg6, arg1, arg4, -16777216, 0);
            int var9 = arg4 / 2 + arg6 - var7 - 18;
            arg3.method397(var8 - 152, var9, 304, 34, class386.field5673[class25.field301].getRGB(), 0);
            arg3.method386(var8 - 150, var9 + 2, class228.field3318 * 3, 30, class495.field7266[class25.field301].getRGB(), 0);
            class466.field6840.method1956(var8, class497.field7393[class25.field301].getRGB(), 0, var7 + var9, -1, class141.field1998.method2031(true, class377.field5585));
            return;
        }
        int var10 = class63.field744 - ((int) ((float) arg1 / class399.field5902));
        int var11 = (int) ((float) arg4 / class399.field5902) + class512.field7555;
        int var12 = (int) ((float) arg1 / class399.field5902) + class63.field744;
        if (arg5 != -125) {
            field5456 = 108;
        }
        class229.field3361 = (int) ((float) (arg4 * 2) / class399.field5902);
        int var13 = class512.field7555 - ((int) ((float) arg4 / class399.field5902));
        class38.field435 = class512.field7555 - ((int) ((float) arg4 / class399.field5902));
        class333.field4628 = (int) ((float) (arg1 * 2) / class399.field5902);
        class76.field1035 = class63.field744 - ((int) ((float) arg1 / class399.field5902));
        class399.method2460(class399.field5926 + var10, class399.field5910 + var11, class399.field5926 + var12, class399.field5910 + var13, arg0, arg6, arg0 + arg1, arg4 + arg6 - -1);
        class399.method2455(arg3);
        class133 var14 = class399.method2448(arg3);
        class154.method1095(var14, 3, arg3, 0, 0);
        if (class509.field7504 > 0) {
            class417.field6164--;
            if (class417.field6164 == 0) {
                class417.field6164 = 20;
                class509.field7504--;
            }
        }
        if (!class49.field547) {
            return;
        }
        int var15 = arg0 + arg1 - 5;
        int var16 = arg4 + arg6 - 8;
        class396.field5802.method1959(-1, false, "Fps:" + class338.field4691, var16, 16776960, var15);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class396.field5802.method1959(-1, false, "Mem:" + var18 + "k", var20, var19, var15);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "(B)V", line = 100)
    public static void method2267(byte arg0) {
        if (arg0 != 24) {
            method2270(true, -46, -112);
        }
        field5467 = null;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILf;)Z", line = 112)
    public static final boolean method2268(int arg0, class529 arg1) {
        if (arg0 != 27298) {
            return false;
        }
        field5462++;
        class222 var2 = class384.field5645.method786(arg1.method28(true), 0);
        if (var2.field3182 == -1) {
            return true;
        } else {
            class77 var3 = class504.field7479.method2005(1409, var2.field3182);
            return var3.field1042 == -1 ? true : var3.method717((byte) -110);
        }
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(Z)Z", line = 134)
    public final boolean method2269(boolean arg0) {
        field5465++;
        if (this.field5463 != null) {
            return true;
        }
        if (this.field5461 == null) {
            if (!class423.field6244.method2360(this.field5457, 557)) {
                return false;
            }
            int[] var2 = class423.field6244.method2383(16947, this.field5457);
            this.field5461 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field5461[var3] = class423.field6244.method2363(var2[var3], this.field5457, 105);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field5461.length; var5++) {
            byte[] var14 = this.field5461[var5];
            int var15 = (var14[0] & 0xFF) << 8 | var14[1] & 0xFF;
            var4 &= class244.field3587.method2384(-1, var15);
        }
        if (!var4) {
            return false;
        }
        class133 var6 = new class133();
        int var7 = class423.field6244.method2367(this.field5457, 28724);
        this.field5463 = new class298[var7];
        int[] var8 = class423.field6244.method2383(16947, this.field5457);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field5461[var9];
            int var11 = var10[1] & 0xFF | var10[0] & 0xFF << 8;
            class501 var12 = null;
            for (class501 var13 = (class501) var6.method1018(81); var13 != null; var13 = (class501) var6.method1022((byte) -112)) {
                if (var13.field7432 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class501(var11, class244.field3587.method2381(var11, -1));
                var6.method1015(false, var12);
            }
            this.field5463[var8[var9]] = new class298(var10, var12);
        }
        this.field5461 = null;
        if (arg0) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZII)I", line = 229)
    public static final int method2270(boolean arg0, int arg1, int arg2) {
        field5466++;
        if (arg1 == 1 || arg1 == 3) {
            return class205.field2982[arg2 & 0x3];
        } else if (arg0) {
            return 25;
        } else {
            return class133.field1920[arg2 & 0x3];
        }
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(I)V", line = 246)
    public class367(int arg0) {
        this.field5457 = arg0;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILfs;I)Lgt;", line = 255)
    public static final class316 method2271(int arg0, class387 arg1, int arg2) {
        field5460++;
        byte[] var3 = arg1.method2381(arg0, -1);
        if (arg2 != -18318) {
            field5456 = -60;
        }
        return var3 == null ? null : new class316(var3);
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(II)Z", line = 275)
    public final boolean method2272(int arg0, int arg1) {
        field5458++;
        return arg0 == -6210 ? this.field5463[arg1].field4282 : false;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IB)Z", line = 290)
    public final boolean method2273(int arg0, byte arg1) {
        field5459++;
        if (arg1 < 93) {
            this.method2269(true);
        }
        return this.field5463[arg0].field4278;
    }
}
