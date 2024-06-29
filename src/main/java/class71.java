import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class71 extends class326 {

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "I")
    private int field979 = 4096;

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "Z")
    private boolean field990 = true;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "Ljava/lang/String;")
    public static String field982 = "wave:";

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "Z")
    public static boolean field985 = true;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "Ljava/lang/String;")
    public static String field983 = "Loaded input handler";

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "F")
    public static float field986;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "Lgb;")
    public static class88 field980;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZII)Z", line = 9)
    public static final boolean method550(boolean arg0, int arg1, int arg2) {
        field988++;
        if (!class238.field3729) {
            return false;
        }
        if (arg0) {
            field983 = (String) null;
        }
        int var3 = arg1 & 0xFFFF;
        int var4 = arg1 >> 16;
        if (class269.field4182[var4] == null || class269.field4182[var4][var3] == null) {
            return false;
        }
        class136 var5 = class269.field4182[var4][var3];
        if (arg2 == -1 && var5.field2063 == 0) {
            for (int var6 = 0; var6 < class78.field1046; var6++) {
                if (class282.field4365[var6] == 39 || class282.field4365[var6] == 1006 || class282.field4365[var6] == 12 || class282.field4365[var6] == 18 || class282.field4365[var6] == 59) {
                    for (class136 var7 = class14.method140(class248.field3904[var6], 1036508464); var7 != null; var7 = class322.method2273(var7, (byte) -128)) {
                        if (var5.field2069 == var7.field2069) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < class78.field1046; var8++) {
                if (class58.field839[var8] == arg2 && class248.field3904[var8] == var5.field2069 && (class282.field4365[var8] == 39 || class282.field4365[var8] == 1006 || class282.field4365[var8] == 12 || class282.field4365[var8] == 18 || class282.field4365[var8] == 59)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V", line = 79)
    public static void method551(int arg0) {
        if (arg0 != -13) {
            field980 = (class88) null;
        }
        field983 = null;
        field982 = null;
        field980 = null;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V", line = 202)
    public class71() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I[B)Lgn;", line = 99)
    public static final class321 method552(int arg0, byte[] arg1) {
        field981++;
        if (arg1 == null) {
            return null;
        }
        class321 var2;
        if (class109.field1458) {
            var2 = new class49(arg1, class119.field1659, class206.field3261, class213.field3355, class81.field1103, class207.field3298);
        } else {
            var2 = new class226(arg1, class119.field1659, class206.field3261, class213.field3355, class81.field1103, class207.field3298);
        }
        class207.method1526(0);
        if (arg0 != -24516) {
            field985 = true;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)[[I", line = 123)
    public final int[][] method253(int arg0, byte arg1) {
        field984++;
        int var3 = -18 / ((arg1 - 60) / 51);
        int[][] var4 = this.field5104.method2365((byte) 84, arg0);
        if (this.field5104.field5325) {
            int[] var5 = this.method2287(0, arg0 - 1 & class29.field427, -3896);
            int[] var6 = this.method2287(0, arg0, -3896);
            int[] var7 = this.method2287(0, arg0 + 1 & class29.field427, -3896);
            int[] var8 = var4[0];
            int[] var9 = var4[2];
            int[] var10 = var4[1];
            for (int var11 = 0; var11 < class166.field2731; var11++) {
                int var12 = (var7[var11] - var5[var11]) * this.field979;
                int var13 = (var6[class215.field3397 & var11 + 1] - var6[class215.field3397 & var11 - 1]) * this.field979;
                int var14 = var12 >> 12;
                int var15 = var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = var15 * var15 >> 12;
                int var18 = (int) (Math.sqrt((double) ((float) (var17 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var19;
                int var20;
                int var21;
                if (var18 == 0) {
                    var19 = 0;
                    var20 = 0;
                    var21 = 0;
                } else {
                    var21 = var13 / var18;
                    var20 = var12 / var18;
                    var19 = 16777216 / var18;
                }
                if (this.field990) {
                    var21 = (var21 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var8[var11] = var21;
                var10[var11] = var20;
                var9[var11] = var19;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZLvl;)V", line = 223)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        if (arg0 == 0) {
            this.field979 = arg2.method39((byte) 72);
        } else if (arg0 == 1) {
            this.field990 = arg2.method58(-288140008) == 1;
        }
        field989++;
        if (arg1) {
            this.method253(25, (byte) -78);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIZ)Ljava/lang/String;", line = 258)
    public static final String method553(int arg0, int arg1, boolean arg2) {
        field987++;
        if (arg0 == 0) {
            return arg2 && arg1 >= 0 ? class171.method1278(false, arg1, arg2, 10) : Integer.toString(arg1);
        } else {
            return (String) null;
        }
    }
}
