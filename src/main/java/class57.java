import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class57 extends class485 {

    @OriginalMember(owner = "client!dl", name = "E", descriptor = "[Lut;")
    public static class109[] field651 = new class109[14];

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!dl", name = "x", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!dl", name = "y", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!dl", name = "A", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!dl", name = "C", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "Lf;")
    private class702 field637;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "Lf;")
    private class702 field638;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "Lf;")
    public class702 field639;

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "Lf;")
    private class702 field646;

    @OriginalMember(owner = "client!dl", name = "B", descriptor = "Lf;")
    private class702 field648;

    @OriginalMember(owner = "client!dl", name = "D", descriptor = "Lf;")
    private class702 field650;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dl", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field652;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BLjava/io/File;Z)V")
    public static final void method473(byte arg0, File arg1, boolean arg2) {
        ++field643;
        if (class419.field5916 == null) {
            class590.method3350((byte) -82);
        }
        if (arg0 != 1) {
            method479(119);
        }
        try {
            Class var3 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            Method var4 = var3.getDeclaredMethod("dumpHeap", field652 != null ? field652 : (field652 = method482("java.lang.String")), Boolean.TYPE);
            var4.invoke(class419.field5916, arg1.getAbsolutePath(), new Boolean(arg2));
        } catch (Exception var6) {
            System.out.println("HeapDump error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lsea;Lsea;Lpe;)V")
    public class57(class648 arg0, class648 arg1, class566 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIII)V")
    public void method474(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 == 10000) {
            this.field639.method3926(arg3, arg4, arg0, arg1);
            ++field641;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)Z")
    public final boolean method475(byte arg0) {
        ++field640;
        if (!super.method475(arg0)) {
            return false;
        } else {
            class566 var2 = (class566) super.field6672;
            if (!super.field6673.method3623(-118, var2.field7991)) {
                return false;
            } else if (!super.field6673.method3623(arg0 + -4, var2.field7989)) {
                return false;
            } else if (!super.field6673.method3623(-100, var2.field7990)) {
                return false;
            } else if (!super.field6673.method3623(-98, var2.field7986)) {
                return false;
            } else if (!super.field6673.method3623(arg0 ^ 3, var2.field7993)) {
                return false;
            } else {
                return super.field6673.method3623(arg0 + -2, var2.field7987);
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public final void method476(int arg0) {
        super.method476(arg0);
        ++field644;
        class566 var2 = (class566) super.field6672;
        this.field639 = class65.method554(var2.field7991, super.field6673, 3);
        this.field650 = class65.method554(var2.field7989, super.field6673, 3);
        this.field637 = class65.method554(var2.field7990, super.field6673, 3);
        this.field646 = class65.method554(var2.field7986, super.field6673, 3);
        this.field648 = class65.method554(var2.field7993, super.field6673, 3);
        this.field638 = class65.method554(var2.field7987, super.field6673, 3);
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)V")
    public static void method477(int arg0) {
        field651 = null;
        int var1 = -78 % ((72 - arg0) / 44);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B[Ljava/lang/String;)V")
    public static final void method478(byte arg0, String[] arg1) {
        ++field649;
        if (arg0 == 70) {
            if (arg1.length <= 1) {
                class187.field2713 = class187.field2713 + arg1[0];
            } else {
                for (int var2 = 0; var2 < arg1.length; ++var2) {
                    if (arg1[var2].startsWith("pause")) {
                        int var3 = 5;
                        try {
                            var3 = Integer.parseInt(arg1[var2].substring(6));
                        } catch (Exception var4) {
                        }
                        class26.method251("Pausing for " + var3 + " seconds...", (byte) -65);
                        class495.field6746 = arg1;
                        class399.field5603 = var2 + 1;
                        class11.field115 = (long) (var3 * 1000) + class577.method3295((byte) 15);
                        return;
                    }
                    class187.field2713 = arg1[var2];
                    class301.method1835((byte) -8, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(I)J")
    public static final long method479(int arg0) {
        int var1 = -112 / ((arg0 - 61) / 43);
        ++field645;
        return class541.field7317.method284((byte) 71);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZIIB)V")
    public final void method480(boolean arg0, int arg1, int arg2, byte arg3) {
        ++field647;
        int var5 = arg1 - -this.field637.method1660();
        int var6 = super.field6672.field6764 + arg1 - this.field646.method1660();
        int var7 = arg2 + this.field648.method1661();
        int var8 = arg2 + super.field6672.field6757 + -this.field638.method1661();
        if (arg3 != 113) {
            this.field637 = null;
        }
        int var9 = -var5 + var6;
        int var10 = -var7 + var8;
        int var11 = this.method2761(-85) * var9 / 10000;
        int[] var12 = new int[4];
        class334.field4506.method174(var12);
        class334.field4506.method200(var5, var7, var5 - -var11, var8);
        this.method474(var9, var10, arg3 ^ 10081, var5, var7);
        class334.field4506.method200(var5 + var11, var7, var6, var8);
        this.field650.method3926(var5, var7, var9, var10);
        class334.field4506.method200(var12[0], var12[1], var12[2], var12[3]);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIZI)V")
    public final void method481(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            int[] var5 = new int[4];
            class334.field4506.method174(var5);
            class334.field4506.method200(arg0, arg3, arg0 - -super.field6672.field6764, super.field6672.field6757 + arg3);
            int var6 = this.field637.method1660();
            int var7 = this.field637.method1661();
            int var8 = this.field646.method1660();
            int var9 = this.field646.method1661();
            this.field637.method3927(arg0, (-var7 + super.field6672.field6757) / 2 + arg3);
            this.field646.method3927(super.field6672.field6764 + arg0 - var8, arg3 - -((-var9 + super.field6672.field6757) / 2));
            class334.field4506.method200(arg0, arg3, arg0 - -super.field6672.field6764, arg3 + this.field648.method1661());
            this.field648.method3926(arg0 + var6, arg3, -var6 + -var8 + super.field6672.field6764, super.field6672.field6757);
            int var10 = this.field638.method1661();
            class334.field4506.method200(arg0, super.field6672.field6757 + arg3 - var10, arg0 - -super.field6672.field6764, super.field6672.field6757 + arg3);
            this.field638.method3926(arg0 + var6, arg3 - -super.field6672.field6757 + -var10, super.field6672.field6764 - var8 + -var6, super.field6672.field6757);
            class334.field4506.method200(var5[0], var5[1], var5[2], var5[3]);
        }
        ++field642;
        if (arg1 >= -113) {
            method473((byte) -74, (File) null, false);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method482(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
