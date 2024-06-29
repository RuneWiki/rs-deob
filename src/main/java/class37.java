import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class37 extends class416 {

    @OriginalMember(owner = "client!be", name = "A", descriptor = "I")
    private int field523;

    @OriginalMember(owner = "client!be", name = "C", descriptor = "Z")
    public static boolean field525 = false;

    @OriginalMember(owner = "client!be", name = "D", descriptor = "Lro;")
    public static class2 field526 = new class2();

    @OriginalMember(owner = "client!be", name = "G", descriptor = "Z")
    public static boolean field529 = false;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!be", name = "E", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!be", name = "F", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!be", name = "H", descriptor = "[Lvr;")
    public class138[] field530;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "[[B")
    private byte[][] field524;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Z", line = 7)
    public final boolean method296(int arg0, int arg1) {
        if (arg1 > -2) {
            return false;
        } else {
            field522++;
            return this.field530[arg0].field2200;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)Z", line = 19)
    public final boolean method297(int arg0) {
        field528++;
        if (this.field530 != null) {
            return true;
        }
        if (this.field524 == null) {
            class376 var2 = class87.field1062;
            synchronized (class87.field1062) {
                if (!class87.field1062.method2202(-14491, this.field523)) {
                    return false;
                }
                int[] var4 = class87.field1062.method2214(this.field523, arg0 ^ 0xFFFFFFC4);
                this.field524 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field524[var5] = class87.field1062.method2218((byte) 120, this.field523, var4[var5]);
                }
            }
        }
        boolean var6 = true;
        for (int var7 = arg0; var7 < this.field524.length; var7++) {
            byte[] var8 = this.field524[var7];
            class677 var9 = new class677(var8);
            var9.field9419 = 1;
            int var10 = var9.method3807(-1);
            class376 var11 = class350.field4921;
            synchronized (class350.field4921) {
                var6 &= class350.field4921.method2216(var10, 61);
            }
        }
        if (!var6) {
            return false;
        }
        class2 var12 = new class2();
        class376 var13 = class87.field1062;
        int[] var15;
        synchronized (class87.field1062) {
            int var14 = class87.field1062.method2195(this.field523, 0);
            this.field530 = new class138[var14];
            var15 = class87.field1062.method2214(this.field523, 90);
        }
        for (int var16 = 0; var16 < var15.length; var16++) {
            byte[] var17 = this.field524[var16];
            class677 var18 = new class677(var17);
            var18.field9419 = 1;
            int var19 = var18.method3807(-1);
            class88 var20 = null;
            for (class88 var21 = (class88) var12.method21(arg0 ^ 0x2); var21 != null; var21 = (class88) var12.method9(-127)) {
                if (var21.field1075 == var19) {
                    var20 = var21;
                    break;
                }
            }
            if (var20 == null) {
                class376 var22 = class350.field4921;
                synchronized (class350.field4921) {
                    var20 = new class88(var19, class350.field4921.method2226(-1, var19));
                }
                var12.method11(var20, -92);
            }
            this.field530[var15[var16]] = new class138(var17, var20);
        }
        this.field524 = null;
        return true;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(II)Z", line = 126)
    public final boolean method298(int arg0, int arg1) {
        if (arg0 == 1) {
            field520++;
            return this.field530[arg1].field2201;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lkk;Lwu;B)V", line = 139)
    public static final void method299(class192 arg0, class376 arg1, byte arg2) {
        class92.field1120 = "";
        field521++;
        class572.field7505 = arg0;
        if (arg2 >= -4) {
            method299(null, null, (byte) -24);
        }
        class105.field1438 = arg1;
        if (class721.field10047.startsWith("win")) {
            class92.field1120 = class92.field1120 + "windows/";
        } else if (class721.field10047.startsWith("linux")) {
            class92.field1120 = class92.field1120 + "linux/";
        } else if (class721.field10047.startsWith("mac")) {
            class92.field1120 = class92.field1120 + "macos/";
        }
        if (class572.field7505.field2900) {
            class92.field1120 = class92.field1120 + "msjava/";
        } else if (class721.field10050.startsWith("amd64") || class721.field10050.startsWith("x86_64")) {
            class92.field1120 = class92.field1120 + "x86_64/";
        } else if (class721.field10050.startsWith("i386") || class721.field10050.startsWith("i486") || class721.field10050.startsWith("i586") || class721.field10050.startsWith("x86")) {
            class92.field1120 = class92.field1120 + "x86/";
        } else if (class721.field10050.startsWith("ppc")) {
            class92.field1120 = class92.field1120 + "ppc/";
        } else {
            class92.field1120 = class92.field1120 + "universal/";
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V", line = 186)
    public static void method300(int arg0) {
        field526 = null;
        if (arg0 >= -6) {
            method299(null, null, (byte) 66);
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(II)Z", line = 202)
    public final boolean method301(int arg0, int arg1) {
        if (arg0 != 1) {
            this.method296(42, -18);
        }
        field527++;
        return this.field530[arg1].field2190;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(I)V", line = 218)
    public class37(int arg0) {
        this.field523 = arg0;
    }
}
