import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class350 extends class173 {

    @OriginalMember(owner = "client!is", name = "w", descriptor = "I")
    private int field4280;

    @OriginalMember(owner = "client!is", name = "s", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field4276 = new Rectangle[100];

    @OriginalMember(owner = "client!is", name = "z", descriptor = "Luw;")
    public static class208 field4283 = new class208(73, -2);

    @OriginalMember(owner = "client!is", name = "r", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!is", name = "u", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!is", name = "v", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!is", name = "x", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!is", name = "A", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!is", name = "B", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!is", name = "t", descriptor = "[Luo;")
    public class153[] field4277;

    @OriginalMember(owner = "client!is", name = "y", descriptor = "[[B")
    private byte[][] field4282;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(II)Z")
    public final boolean method2020(int arg0, int arg1) {
        if (arg1 != 1) {
            this.method2024(-125);
        }
        field4279++;
        return this.field4277[arg0].field1938;
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(II)Z")
    public final boolean method2021(int arg0, int arg1) {
        if (arg1 <= 119) {
            return false;
        } else {
            field4275++;
            return this.field4277[arg0].field1940;
        }
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(I)V")
    public class350(int arg0) {
        this.field4280 = arg0;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(BLfda;)V")
    public static final void method2022(byte arg0, class381 arg1) {
        int var2 = -63 % ((-arg0 - 32) / 58);
        if ((arg1 instanceof class727)) {
            class727 var4 = (class727) arg1;
            if (var4.field9545 != null) {
                class323.method1874(25, var4, class422.field5564.field2895 != var4.field2895);
            }
        } else if (arg1 instanceof class33) {
            class33 var3 = (class33) arg1;
            class582.method3115(var3, -123, class422.field5564.field2895 != var3.field2895);
        }
        field4284++;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
    public static void method2023(int arg0) {
        field4276 = null;
        if (arg0 != 100) {
            field4278 = -64;
        }
        field4283 = null;
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(I)Z")
    public final boolean method2024(int arg0) {
        field4285++;
        if (this.field4277 != null) {
            return true;
        }
        if (this.field4282 == null) {
            class30 var2 = class684.field8824;
            synchronized (class684.field8824) {
                if (!class684.field8824.method156(9657, this.field4280)) {
                    return false;
                }
                int[] var4 = class684.field8824.method125(this.field4280, (byte) -57);
                this.field4282 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field4282[var5] = class684.field8824.method139(this.field4280, (byte) -94, var4[var5]);
                }
            }
        }
        int var6 = -69 % ((71 - arg0) / 50);
        boolean var7 = true;
        for (int var8 = 0; var8 < this.field4282.length; var8++) {
            byte[] var9 = this.field4282[var8];
            class234 var10 = new class234(var9);
            var10.field3133 = 1;
            int var11 = var10.method1553((byte) 101);
            class30 var12 = class249.field3411;
            synchronized (class249.field3411) {
                var7 &= class249.field3411.method130(-2, var11);
            }
        }
        if (!var7) {
            return false;
        }
        class661 var13 = new class661();
        class30 var14 = class684.field8824;
        int[] var16;
        synchronized (class684.field8824) {
            int var15 = class684.field8824.method138(0, this.field4280);
            this.field4277 = new class153[var15];
            var16 = class684.field8824.method125(this.field4280, (byte) -108);
        }
        for (int var17 = 0; var17 < var16.length; var17++) {
            byte[] var18 = this.field4282[var17];
            class234 var19 = new class234(var18);
            var19.field3133 = 1;
            int var20 = var19.method1553((byte) -110);
            class359 var21 = null;
            for (class359 var22 = (class359) var13.method3591(0); var22 != null; var22 = (class359) var13.method3600((byte) 47)) {
                if (var22.field4386 == var20) {
                    var21 = var22;
                    break;
                }
            }
            if (var21 == null) {
                class30 var23 = class249.field3411;
                synchronized (class249.field3411) {
                    var21 = new class359(var20, class249.field3411.method148((byte) -128, var20));
                }
                var13.method3593(var21, 15);
            }
            this.field4277[var16[var17]] = new class153(var18, var21);
        }
        this.field4282 = null;
        return true;
    }

    @OriginalMember(owner = "client!is", name = "d", descriptor = "(II)Z")
    public final boolean method2025(int arg0, int arg1) {
        if (arg1 != -2) {
            this.method2020(33, -86);
        }
        field4281++;
        return this.field4277[arg0].field1951;
    }
}
