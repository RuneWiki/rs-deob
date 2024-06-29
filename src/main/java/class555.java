import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class555 extends class623 {

    @OriginalMember(owner = "client!kga", name = "A", descriptor = "I")
    private int field7793;

    @OriginalMember(owner = "client!kga", name = "v", descriptor = "I")
    public static int field7788 = -1;

    @OriginalMember(owner = "client!kga", name = "t", descriptor = "[F")
    public static float[] field7786 = new float[16384];

    @OriginalMember(owner = "client!kga", name = "w", descriptor = "[I")
    public static int[] field7789 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!kga", name = "E", descriptor = "[F")
    public static float[] field7796 = new float[16384];

    @OriginalMember(owner = "client!kga", name = "s", descriptor = "I")
    public static int field7785;

    @OriginalMember(owner = "client!kga", name = "u", descriptor = "I")
    public static int field7787;

    @OriginalMember(owner = "client!kga", name = "z", descriptor = "I")
    public static int field7792;

    @OriginalMember(owner = "client!kga", name = "B", descriptor = "I")
    public static int field7794;

    @OriginalMember(owner = "client!kga", name = "C", descriptor = "I")
    public static int field7795;

    @OriginalMember(owner = "client!kga", name = "y", descriptor = "[Lhl;")
    public class338[] field7791;

    @OriginalMember(owner = "client!kga", name = "x", descriptor = "[[B")
    private byte[][] field7790;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field7796[var2] = (float) Math.sin((double) var2 * var0);
            field7786[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(I)V", line = 7)
    public static void method3152(int arg0) {
        if (arg0 != -17165) {
            field7788 = 0;
        }
        field7789 = null;
        field7786 = null;
        field7796 = null;
    }

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "(I)Z", line = 25)
    public final boolean method3153(int arg0) {
        field7785++;
        if (this.field7791 != null) {
            return true;
        }
        if (this.field7790 == null) {
            class687 var2 = class332.field4284;
            synchronized (class332.field4284) {
                if (!class332.field4284.method3818((byte) 81, this.field7793)) {
                    return false;
                }
                int[] var4 = class332.field4284.method3817(this.field7793, arg0 ^ 0x1456);
                this.field7790 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field7790[var5] = class332.field4284.method3810(this.field7793, arg0 - 28566, var4[var5]);
                }
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < this.field7790.length; var7++) {
            byte[] var8 = this.field7790[var7];
            class179 var9 = new class179(var8);
            var9.field2354 = 1;
            int var10 = var9.method1107(false);
            class687 var11 = class589.field8214;
            synchronized (class589.field8214) {
                var6 &= class589.field8214.method3827(var10, (byte) 48);
            }
        }
        if (!var6) {
            return false;
        }
        class547 var12 = new class547();
        class687 var13 = class332.field4284;
        int[] var15;
        synchronized (class332.field4284) {
            int var14 = class332.field4284.method3812(0, this.field7793);
            if (arg0 != 5206) {
                this.method3154(-118, (byte) -44);
            }
            this.field7791 = new class338[var14];
            var15 = class332.field4284.method3817(this.field7793, 0);
        }
        for (int var16 = 0; var16 < var15.length; var16++) {
            byte[] var17 = this.field7790[var16];
            class179 var18 = new class179(var17);
            var18.field2354 = 1;
            int var19 = var18.method1107(false);
            class294 var20 = null;
            for (class294 var21 = (class294) var12.method3111(60); var21 != null; var21 = (class294) var12.method3116(-93)) {
                if (var21.field3831 == var19) {
                    var20 = var21;
                    break;
                }
            }
            if (var20 == null) {
                class687 var22 = class589.field8214;
                synchronized (class589.field8214) {
                    var20 = new class294(var19, class589.field8214.method3836(var19, true));
                }
                var12.method3110(var20, arg0 - 5205);
            }
            this.field7791[var15[var16]] = new class338(var17, var20);
        }
        this.field7790 = null;
        return true;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IB)Z", line = 145)
    public final boolean method3154(int arg0, byte arg1) {
        int var3 = -38 % ((17 - arg1) / 36);
        field7795++;
        return this.field7791[arg0].field4369;
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(I)V", line = 157)
    public class555(int arg0) {
        this.field7793 = arg0;
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(IB)Z", line = 165)
    public final boolean method3155(int arg0, byte arg1) {
        field7794++;
        int var3 = -22 % ((arg1 + 5) / 60);
        return this.field7791[arg0].field4359;
    }

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "(II)Z", line = 176)
    public final boolean method3156(int arg0, int arg1) {
        field7792++;
        if (arg0 != -32146) {
            field7786 = null;
        }
        return this.field7791[arg1].field4360;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(BII)Z", line = 188)
    public static final boolean method3157(byte arg0, int arg1, int arg2) {
        if (arg0 != 19) {
            method3157((byte) -94, 76, 27);
        }
        field7787++;
        return class357.method2184(arg1, arg2, -75) | (arg1 & 0x40000) != 0 || class407.method2411(arg2, arg1, 0);
    }
}
