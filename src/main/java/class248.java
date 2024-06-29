import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class248 extends class212 {

    @OriginalMember(owner = "client!ue", name = "Y", descriptor = "I")
    private int field4327 = 4096;

    @OriginalMember(owner = "client!ue", name = "V", descriptor = "Z")
    private boolean field4324 = true;

    @OriginalMember(owner = "client!ue", name = "bb", descriptor = "[[I")
    public static int[][] field4330 = new int[5][5000];

    @OriginalMember(owner = "client!ue", name = "cb", descriptor = "[Z")
    public static boolean[] field4331 = new boolean[200];

    @OriginalMember(owner = "client!ue", name = "ab", descriptor = "I")
    public static volatile int field4329 = 0;

    @OriginalMember(owner = "client!ue", name = "X", descriptor = "Lsc;")
    public static class181 field4326 = class149.method967(255, "l");

    @OriginalMember(owner = "client!ue", name = "Z", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4328 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ue", name = "db", descriptor = "Lhg;")
    public static class7 field4332 = new class7();

    @OriginalMember(owner = "client!ue", name = "U", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!ue", name = "W", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!ue", name = "eb", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!ue", name = "gb", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!ue", name = "fb", descriptor = "Ldg;")
    public static class90 field4334;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(III)I")
    public static final int method1694(int arg0, int arg1, int arg2) {
        class196 var3 = (class196) class254.field4435.method1424(true, (long) arg1);
        ++field4323;
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            int var5 = 0;
            int var6 = 1 % ((arg2 - 43) / 46);
            while (~var3.field3418.length < ~var5) {
                if (var3.field3420[var5] == arg0) {
                    var4 += var3.field3418[var5];
                }
                ++var5;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        ++field4325;
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field4324 = ~arg0.method1516((byte) 82) == -2;
            }
        } else {
            this.field4327 = arg0.method1535(~arg2);
        }
        if (arg2 != -3) {
            field4330 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(II)[[I")
    public final int[][] method260(int arg0, int arg1) {
        if (arg1 != 16383) {
            field4328 = null;
        }
        ++field4335;
        int[][] var3 = super.field3645.method1352(arg0, -128);
        if (super.field3645.field3477) {
            int[] var4 = this.method1405(class4.field90 & arg0 - 1, 0, 21);
            int[] var5 = this.method1405(arg0, 0, arg1 ^ 16307);
            int[] var6 = this.method1405(arg0 + 1 & class4.field90, 0, 113);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            for (int var10 = 0; class26.field452 > var10; ++var10) {
                int var11 = (var6[var10] - var4[var10]) * this.field4327;
                int var12 = (var5[var10 + 1 & class186.field3300] + -var5[class186.field3300 & var10 - 1]) * this.field4327;
                int var13 = var12 >> 12;
                int var14 = var13 * var13 >> 12;
                int var15 = var11 >> 12;
                int var16 = var15 * var15 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var14 + 4096 - -var16) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = 16777216 / var17;
                    var19 = var12 / var17;
                    var20 = var11 / var17;
                } else {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                }
                if (this.field4324) {
                    var20 = 2048 - -(var20 >> 1);
                    var19 = (var19 >> 1) + 2048;
                    var18 = 2048 - -(var18 >> 1);
                }
                var8[var10] = var19;
                var7[var10] = var20;
                var9[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
    public class248() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(Z)V")
    public static void method1695(boolean arg0) {
        field4328 = null;
        field4334 = null;
        field4326 = null;
        if (arg0) {
            method1695(false);
        }
        field4330 = null;
        field4331 = null;
        field4332 = null;
    }
}
