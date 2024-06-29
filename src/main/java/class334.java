import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class334 extends class210 {

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
    private int field4938 = 4096;

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "Z")
    private boolean field4939 = true;

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field4937 = new String[100];

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "(I)V")
    public static void method2175(int arg0) {
        if (arg0 != -4432) {
            method2175(9);
        }
        field4937 = null;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
    public class334() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IILat;)V")
    public final void method56(int arg0, int arg1, class256 arg2) {
        ++field4935;
        if (arg1 != -11941) {
            this.method58(-94, -87);
        }
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field4939 = arg2.method1738((byte) -71) == 1;
            }
        } else {
            this.field4938 = arg2.method1767(1930493576);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)[[I")
    public final int[][] method58(int arg0, int arg1) {
        ++field4936;
        int[][] var3 = super.field2967.method1572(122, arg0);
        if (super.field2967.field3454) {
            int[] var4 = this.method1447(arg0 + -1 & class139.field1911, -122, 0);
            int[] var5 = this.method1447(arg0, -121, 0);
            int[] var6 = this.method1447(class139.field1911 & arg0 + 1, -122, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class202.field2852; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field4938;
                int var12 = (var5[var10 + 1 & class437.field6373] - var5[class437.field6373 & var10 - 1]) * this.field4938;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + 4096 - -var16) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = 16777216 / var17;
                    var19 = var11 / var17;
                    var20 = var12 / var17;
                }
                if (this.field4939) {
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var20;
                var8[var10] = var19;
                var9[var10] = var18;
            }
        }
        if (arg1 <= 94) {
            this.method58(-23, -99);
        }
        return var3;
    }
}
