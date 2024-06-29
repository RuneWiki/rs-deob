import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class289 extends class354 {

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field4157;

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!ij", name = "N", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "Lhh;")
    public static class84 field4155;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(III)V")
    private final void method1798(int arg0, int arg1, int arg2) {
        ++field4152;
        int var4 = class154.field2358[arg1];
        int var5 = class278.field4009[arg2];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class480.field7050 = arg1;
            class95.field1560 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class480.field7050 = arg2;
            class95.field1560 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class480.field7050 = -arg2 + class404.field5952;
            class95.field1560 = arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class480.field7050 = arg1;
            class95.field1560 = -arg2 + class337.field5146;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class480.field7050 = -arg1 + class404.field5952;
            class95.field1560 = -arg2 + class337.field5146;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class95.field1560 = -arg1 + class337.field5146;
            class480.field7050 = class404.field5952 - arg2;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class95.field1560 = class337.field5146 - arg1;
            class480.field7050 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class95.field1560 = arg2;
            class480.field7050 = -arg1 + class404.field5952;
        }
        class480.field7050 &= class168.field2527;
        class95.field1560 &= class30.field492;
        int var7 = -1 % ((arg0 - 76) / 34);
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(B)V")
    public static void method1799(byte arg0) {
        int var1 = 119 % ((-76 - arg0) / 47);
        field4155 = null;
        field4157 = null;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
    public class289() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BI)[[I")
    public final int[][] method207(byte arg0, int arg1) {
        ++field4151;
        int[][] var3 = super.field5351.method2819((byte) -118, arg1);
        if (arg0 > -40) {
            field4155 = null;
        }
        if (super.field5351.field6959) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class404.field5952 < ~var7; ++var7) {
                this.method1798(120, var7, arg1);
                int[][] var8 = this.method2291(0, (byte) -88, class95.field1560);
                var4[var7] = var8[0][class480.field7050];
                var5[var7] = var8[1][class480.field7050];
                var6[var7] = var8[2][class480.field7050];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)V")
    public static final void method1800(int arg0) {
        class72.field1206 = -3;
        class192.field2820 = -1;
        class333.field5120 = 0;
        class112.field1784 = arg0;
        ++field4154;
        class333.field5119 = 0;
        class207.field2986 = 0;
        class359.field5432 = false;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILti;I)V")
    public final void method206(int arg0, class303 arg1, int arg2) {
        if (arg2 == 0) {
            super.field5354 = arg1.method1918((byte) 91) == 1;
        }
        ++field4150;
        if (arg0 != 15180) {
            this.method1798(-10, -85, 119);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)[I")
    public final int[] method253(int arg0, byte arg1) {
        if (arg1 != -95) {
            return null;
        } else {
            ++field4156;
            int[] var3 = super.field5357.method861(true, arg0);
            if (super.field5357.field1869) {
                for (int var4 = 0; ~var4 > ~class404.field5952; ++var4) {
                    this.method1798(arg1 + 205, var4, arg0);
                    int[] var5 = this.method2293(0, class95.field1560, (byte) 69);
                    var3[var4] = var5[class480.field7050];
                }
            }
            return var3;
        }
    }

    static {
        new class180(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
        new class180("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
        field4157 = new Rectangle[100];
    }
}
