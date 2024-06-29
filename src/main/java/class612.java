import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class612 extends class164 {

    @OriginalMember(owner = "client!bca", name = "B", descriptor = "I")
    private int field8774;

    @OriginalMember(owner = "client!bca", name = "C", descriptor = "Z")
    public static boolean field8775 = true;

    @OriginalMember(owner = "client!bca", name = "t", descriptor = "Lwaa;")
    public static class652 field8766 = new class652(16);

    @OriginalMember(owner = "client!bca", name = "F", descriptor = "I")
    public static int field8777 = -1;

    @OriginalMember(owner = "client!bca", name = "u", descriptor = "I")
    public static int field8767;

    @OriginalMember(owner = "client!bca", name = "v", descriptor = "I")
    public static int field8768;

    @OriginalMember(owner = "client!bca", name = "w", descriptor = "I")
    public static int field8769;

    @OriginalMember(owner = "client!bca", name = "y", descriptor = "I")
    public static int field8771;

    @OriginalMember(owner = "client!bca", name = "A", descriptor = "I")
    public static int field8773;

    @OriginalMember(owner = "client!bca", name = "H", descriptor = "Lf;")
    public static class701 field8779;

    @OriginalMember(owner = "client!bca", name = "z", descriptor = "[Ldr;")
    public class669[] field8772;

    @OriginalMember(owner = "client!bca", name = "D", descriptor = "[Lf;")
    public static class701[] field8776;

    @OriginalMember(owner = "client!bca", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field8778;

    @OriginalMember(owner = "client!bca", name = "x", descriptor = "[[B")
    private byte[][] field8770;

    @OriginalMember(owner = "client!bca", name = "e", descriptor = "(I)Z", line = 3)
    public final boolean method3504(int arg0) {
        field8769++;
        if (this.field8772 != null) {
            return true;
        }
        if (this.field8770 == null) {
            class668 var2 = class512.field7503;
            synchronized (class512.field7503) {
                if (!class512.field7503.method3797(this.field8774, (byte) 66)) {
                    return false;
                }
                int[] var4 = class512.field7503.method3808(105, this.field8774);
                this.field8770 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field8770[var5] = class512.field7503.method3800(var4[var5], this.field8774, (byte) -92);
                }
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < this.field8770.length; var7++) {
            byte[] var8 = this.field8770[var7];
            class389 var9 = new class389(var8);
            var9.field5195 = 1;
            int var10 = var9.method2260(-110);
            class668 var11 = class357.field4763;
            synchronized (class357.field4763) {
                var6 &= class357.field4763.method3802(var10, (byte) 119);
            }
        }
        if (!var6) {
            return false;
        }
        class183 var12 = new class183();
        class668 var13 = class512.field7503;
        int[] var15;
        synchronized (class512.field7503) {
            if (arg0 != 15231) {
                this.method3504(25);
            }
            int var14 = class512.field7503.method3805(this.field8774, false);
            this.field8772 = new class669[var14];
            var15 = class512.field7503.method3808(108, this.field8774);
        }
        for (int var16 = 0; var16 < var15.length; var16++) {
            byte[] var17 = this.field8770[var16];
            class389 var18 = new class389(var17);
            var18.field5195 = 1;
            int var19 = var18.method2260(-24);
            class517 var20 = null;
            for (class517 var21 = (class517) var12.method1132((byte) -124); var21 != null; var21 = (class517) var12.method1134(8446)) {
                if (var21.field7561 == var19) {
                    var20 = var21;
                    break;
                }
            }
            if (var20 == null) {
                class668 var22 = class357.field4763;
                synchronized (class357.field4763) {
                    var20 = new class517(var19, class357.field4763.method3811(116, var19));
                }
                var12.method1129(var20, 262144);
            }
            this.field8772[var15[var16]] = new class669(var17, var20);
        }
        this.field8770 = null;
        return true;
    }

    @OriginalMember(owner = "client!bca", name = "f", descriptor = "(I)V", line = 114)
    public static void method3505(int arg0) {
        field8766 = null;
        field8776 = null;
        int var1 = -108 % ((arg0 + 41) / 63);
        field8779 = null;
        field8778 = null;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(BI)Z", line = 127)
    public final boolean method3506(byte arg0, int arg1) {
        field8768++;
        int var3 = -90 / ((arg0 - 49) / 44);
        return this.field8772[arg1].field9621;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lla;)V", line = 137)
    public static final void method3507(class419 arg0) {
        class68.field1052 = arg0;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(BII)I", line = 142)
    public static final int method3508(byte arg0, int arg1, int arg2) {
        field8767++;
        if (arg0 >= -58) {
            field8766 = null;
        }
        return arg1 == 1 || arg1 == 3 ? class309.field4089[arg2 & 0x3] : class297.field3996[arg2 & 0x3];
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(BI)Z", line = 160)
    public final boolean method3509(byte arg0, int arg1) {
        int var3 = 28 % ((18 - arg0) / 33);
        field8773++;
        return this.field8772[arg1].field9618;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(II)Z", line = 171)
    public final boolean method3510(int arg0, int arg1) {
        field8771++;
        return arg0 == 1 ? this.field8772[arg1].field9615 : false;
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(I)V", line = 182)
    public class612(int arg0) {
        this.field8774 = arg0;
    }
}
