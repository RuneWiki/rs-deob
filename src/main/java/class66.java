import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class66 extends class623 {

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    private int field667;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "Luh;")
    public static class166 field669 = new class166();

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
    public static int field673 = 13156520;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "D")
    public static double field671;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "[Lnfa;")
    public class677[] field672;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "[[B")
    private byte[][] field665;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Z")
    public final boolean method489(int arg0, int arg1) {
        if (arg1 == 1) {
            field676++;
            return this.field672[arg0].field9584;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)Z")
    public final boolean method490(boolean arg0) {
        field674++;
        if (this.field672 != null) {
            return true;
        }
        if (this.field665 == null) {
            class404 var2 = class629.field9033;
            synchronized (class629.field9033) {
                if (!class629.field9033.method2491((byte) 64, this.field667)) {
                    return false;
                }
                int[] var4 = class629.field9033.method2470((byte) -127, this.field667);
                this.field665 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field665[var5] = class629.field9033.method2481(this.field667, var4[var5], (byte) 108);
                }
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < this.field665.length; var7++) {
            byte[] var8 = this.field665[var7];
            class244 var9 = new class244(var8);
            var9.field2903 = 1;
            int var10 = var9.method1476(95);
            class404 var11 = class256.field3124;
            synchronized (class256.field3124) {
                var6 &= class256.field3124.method2463((byte) 109, var10);
            }
        }
        if (!var6) {
            return false;
        }
        class289 var12 = new class289();
        class404 var13 = class629.field9033;
        int[] var15;
        synchronized (class629.field9033) {
            int var14 = class629.field9033.method2482(0, this.field667);
            this.field672 = new class677[var14];
            var15 = class629.field9033.method2470((byte) -122, this.field667);
        }
        if (arg0) {
            return false;
        }
        for (int var16 = 0; var16 < var15.length; var16++) {
            byte[] var17 = this.field665[var16];
            class244 var18 = new class244(var17);
            var18.field2903 = 1;
            int var19 = var18.method1476(-107);
            class319 var20 = null;
            for (class319 var21 = (class319) var12.method1719(65280); var21 != null; var21 = (class319) var12.method1723(-20665)) {
                if (var21.field4072 == var19) {
                    var20 = var21;
                    break;
                }
            }
            if (var20 == null) {
                class404 var22 = class256.field3124;
                synchronized (class256.field3124) {
                    var20 = new class319(var19, class256.field3124.method2472(false, var19));
                }
                var12.method1721((byte) -95, var20);
            }
            this.field672[var15[var16]] = new class677(var17, var20);
        }
        this.field665 = null;
        return true;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLgh;Ljava/awt/Frame;)V")
    public static final void method491(byte arg0, class546 arg1, Frame arg2) {
        field668++;
        while (true) {
            class290 var3 = arg1.method3210(true, arg2);
            while (var3.field3573 == 0) {
                class524.method3076(1, 10L);
            }
            if (var3.field3573 == 1) {
                arg2.setVisible(false);
                if (arg0 != -128) {
                    method491((byte) 65, null, null);
                }
                arg2.dispose();
                return;
            }
            class524.method3076(1, 100L);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZ)Z")
    public final boolean method492(int arg0, boolean arg1) {
        if (arg1) {
            this.field672 = null;
        }
        field666++;
        return this.field672[arg0].field9594;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
    public static void method493(byte arg0) {
        field669 = null;
        int var1 = -24 / ((arg0 + 3) / 33);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)Z")
    public final boolean method494(int arg0, int arg1) {
        if (arg0 == 0) {
            field670++;
            return this.field672[arg1].field9586;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(I)V")
    public class66(int arg0) {
        this.field667 = arg0;
    }
}
