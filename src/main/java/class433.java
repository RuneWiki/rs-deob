import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class433 extends class30 {

    @OriginalMember(owner = "client!bo", name = "S", descriptor = "Z")
    private boolean field6394 = true;

    @OriginalMember(owner = "client!bo", name = "J", descriptor = "I")
    private int field6386 = 4096;

    @OriginalMember(owner = "client!bo", name = "L", descriptor = "I")
    public static int field6388 = 0;

    @OriginalMember(owner = "client!bo", name = "M", descriptor = "Lhc;")
    public static class74 field6389 = new class74();

    @OriginalMember(owner = "client!bo", name = "V", descriptor = "I")
    public static int field6397 = 0;

    @OriginalMember(owner = "client!bo", name = "T", descriptor = "Ljava/lang/String;")
    public static String field6395 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!bo", name = "Y", descriptor = "[I")
    public static int[] field6400 = new int[14];

    @OriginalMember(owner = "client!bo", name = "X", descriptor = "[I")
    public static int[] field6399 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!bo", name = "U", descriptor = "F")
    public static float field6396;

    @OriginalMember(owner = "client!bo", name = "K", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!bo", name = "N", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!bo", name = "P", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!bo", name = "Q", descriptor = "I")
    public static int field6392;

    @OriginalMember(owner = "client!bo", name = "R", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!bo", name = "W", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!bo", name = "Z", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "(B)V", line = 6)
    public static final void method2676(byte arg0) {
        ++field6393;
        class8.field106.method336(-125);
        class223.field3715.method336(-55);
        if (arg0 > -28) {
            method2677(-121, -3, -96);
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(III)V", line = 18)
    public static final void method2677(int arg0, int arg1, int arg2) {
        ++field6390;
        int var3 = class413.field6111.method2162(class343.field5291, arg1 + 127);
        for (class418 var4 = (class418) class86.field1089.method253((byte) -6); var4 != null; var4 = (class418) class86.field1089.method247((byte) 67)) {
            int var8 = class41.method276(arg1 ^ -11133, var4);
            if (~var3 > ~var8) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class144.field2267 * 16 - -21;
        int var6 = -(var3 / 2) + arg2;
        if (~(var3 + var6) < ~class369.field5615) {
            var6 = -var3 + class369.field5615;
        }
        if (~var6 > -1) {
            var6 = 0;
        }
        int var7 = arg0;
        if (arg0 - -var5 > class430.field6324) {
            var7 = -var5 + class430.field6324;
        }
        if (arg1 > var7) {
            var7 = 0;
        }
        class75.field949 = var6;
        class186.field3064 = (class61.field786 ? 26 : 22) + class144.field2267 * 16;
        class262.field4214 = true;
        class427.field6299 = var3;
        class27.field315 = var7;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljg;II)V", line = 73)
    public final void method115(class186 arg0, int arg1, int arg2) {
        if (arg1 != 6456) {
            field6399 = null;
        }
        ++field6387;
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field6394 = arg0.method1322(false) == 1;
            }
        } else {
            this.field6386 = arg0.method1272((byte) -77);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BI)[[I", line = 110)
    public final int[][] method203(byte arg0, int arg1) {
        ++field6391;
        if (arg0 != -93) {
            this.method115((class186) null, 120, -78);
        }
        int[][] var3 = super.field360.method2803(arg1, true);
        if (super.field360.field6566) {
            int[] var4 = this.method210((byte) 40, 0, arg1 + -1 & class246.field4033);
            int[] var5 = this.method210((byte) 53, 0, arg1);
            int[] var6 = this.method210((byte) 13, 0, class246.field4033 & arg1 + 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; class369.field5610 > var10; ++var10) {
                int var11 = (var6[var10] - var4[var10]) * this.field6386;
                int var12 = (var5[class106.field1492 & var10 - -1] - var5[var10 + -1 & class106.field1492]) * this.field6386;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 - -var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = var11 / var17;
                    var19 = var12 / var17;
                    var20 = 16777216 / var17;
                } else {
                    var20 = 0;
                    var18 = 0;
                    var19 = 0;
                }
                if (this.field6394) {
                    var19 = 2048 - -(var19 >> 1);
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var18;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "(I)V", line = 194)
    public static void method2678(int arg0) {
        field6395 = null;
        field6389 = null;
        int var1 = -8 % ((arg0 - 29) / 36);
        field6399 = null;
        field6400 = null;
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "()V", line = 206)
    public class433() {
        super(1, false);
    }
}
