import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class285 extends class443 {

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    private int field4153;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "[I")
    public static int[] field4154 = new int[16384];

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "[I")
    public static int[] field4152 = new int[16384];

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "Ljava/lang/Object;")
    public static Object field4159;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "[Lob;")
    public class385[] field4155;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "[[B")
    private byte[][] field4149;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4154[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field4152[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
        field4160 = 0;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)Z", line = 8)
    public final boolean method1810(int arg0, byte arg1) {
        if (arg1 > -44) {
            this.method1810(33, (byte) -62);
        }
        field4150++;
        return this.field4155[arg0].field5735;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)Z", line = 19)
    public final boolean method1811(boolean arg0, int arg1) {
        field4157++;
        return arg0 ? this.field4155[arg1].field5727 : false;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(I)V", line = 37)
    public class285(int arg0) {
        this.field4153 = arg0;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V", line = 45)
    public static final void method1812(int arg0, int arg1) {
        field4148++;
        for (class108 var2 = class170.field2472.method734(0); var2 != null; var2 = class170.field2472.method736(arg0 ^ 0xFFFFBFFF)) {
            if (((long) arg1) == (var2.field1798 >> 48 & 0xFFFFL)) {
                var2.method911(-52);
            }
        }
        if (arg0 != 16384) {
            method1815(-48);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)Z", line = 67)
    public final boolean method1813(int arg0) {
        field4151++;
        if (this.field4155 != null) {
            return true;
        }
        if (this.field4149 == null) {
            if (!class552.field7818.method3192((byte) -11, this.field4153)) {
                return false;
            }
            int[] var2 = class552.field7818.method3176(-123, this.field4153);
            this.field4149 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field4149[var3] = class552.field7818.method3175(var2[var3], (byte) -53, this.field4153);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field4149.length; var5++) {
            byte[] var14 = this.field4149[var5];
            int var15 = var14[0] & 0xFF << 8 | var14[1] & 0xFF;
            var4 &= class442.field6463.method3186((byte) 57, var15);
        }
        if (!var4) {
            return false;
        }
        class47 var6 = new class47();
        int var7 = class552.field7818.method3164(this.field4153, true);
        this.field4155 = new class385[var7];
        if (arg0 != 65535) {
            this.field4149 = null;
        }
        int[] var8 = class552.field7818.method3176(-95, this.field4153);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field4149[var9];
            int var11 = var10[0] & 0xFF << 8 | var10[1] & 0xFF;
            class393 var12 = null;
            for (class393 var13 = (class393) var6.method427(true); var13 != null; var13 = (class393) var6.method420(false)) {
                if (var13.field5885 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class393(var11, class442.field6463.method3177(0, var11));
                var6.method414(var12, (byte) 27);
            }
            this.field4155[var8[var9]] = new class385(var10, var12);
        }
        this.field4149 = null;
        return true;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)Z", line = 167)
    public final boolean method1814(int arg0, int arg1) {
        if (arg1 != 16384) {
            this.field4153 = -65;
        }
        field4147++;
        return this.field4155[arg0].field5736;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V", line = 199)
    public static void method1815(int arg0) {
        field4154 = null;
        if (arg0 == 23493) {
            field4152 = null;
            field4159 = null;
        }
    }
}
