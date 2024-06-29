import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class339 extends class326 {

    @OriginalMember(owner = "client!fl", name = "N", descriptor = "I")
    private int field5287 = 1365;

    @OriginalMember(owner = "client!fl", name = "Q", descriptor = "I")
    private int field5289 = 20;

    @OriginalMember(owner = "client!fl", name = "U", descriptor = "I")
    private int field5293 = 0;

    @OriginalMember(owner = "client!fl", name = "V", descriptor = "I")
    private int field5294 = 0;

    @OriginalMember(owner = "client!fl", name = "I", descriptor = "Lrm;")
    public static class184 field5284 = new class184(4);

    @OriginalMember(owner = "client!fl", name = "T", descriptor = "Ljava/lang/String;")
    public static String field5292 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!fl", name = "L", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!fl", name = "P", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!fl", name = "R", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!fl", name = "S", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!fl", name = "X", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!fl", name = "W", descriptor = "Lug;")
    public static class253 field5295;

    @OriginalMember(owner = "client!fl", name = "Y", descriptor = "[Ljava/lang/String;")
    public static String[] field5297;

    @OriginalMember(owner = "client!fl", name = "Z", descriptor = "[[[I")
    public static int[][][] field5298;

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V", line = 3)
    public class339() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)[I", line = 9)
    public final int[] method103(int arg0, int arg1) {
        field5286++;
        if (arg0 > -25) {
            method2356(37);
        }
        int[] var3 = this.field5112.method1648(arg1, -16687);
        if (this.field5112.field3583) {
            for (int var4 = 0; var4 < class166.field2731; var4++) {
                int var5 = (class110.field1527[var4] << 12) / this.field5287 + this.field5293;
                int var6 = (class34.field508[arg1] << 12) / this.field5287 + this.field5294;
                int var7 = var5;
                int var8 = var6;
                int var9 = var6;
                int var10 = var5 * var5 >> 12;
                int var11 = var5;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var10 + var12 < 16384 && var13 < this.field5289) {
                    var9 = (var9 * var11 >> 12) * 2 + var8;
                    var13++;
                    var11 = var7 + var10 - var12;
                    var12 = var9 * var9 >> 12;
                    var10 = var11 * var11 >> 12;
                }
                var3[var4] = var13 >= (this.field5289 - 1) ? 0 : (var13 << 12) / this.field5289;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(IBI)V", line = 68)
    public static final void method2353(int arg0, byte arg1, int arg2) {
        if (arg1 != -86) {
            method2354(45, (String[]) null, 32, 66);
        }
        class34 var3 = class91.method656(arg0, -2, 7);
        var3.method307(-19063);
        field5291++;
        var3.field500 = arg2;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;", line = 86)
    public static final String method2354(int arg0, String[] arg1, int arg2, int arg3) {
        field5285++;
        if (arg0 == arg2) {
            return "";
        } else if (arg2 == 1) {
            String var11 = arg1[arg3];
            return var11 == null ? "null" : var11.toString();
        } else {
            int var4 = arg2 + arg3;
            int var5 = 0;
            for (int var6 = arg3; var6 < var4; var6++) {
                String var7 = arg1[var6];
                if (var7 == null) {
                    var5 += 4;
                } else {
                    var5 += var7.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var5);
            for (int var9 = arg3; var9 < var4; var9++) {
                String var10 = arg1[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIZLmc;III)Luj;", line = 150)
    public static final class169 method2355(int arg0, int arg1, boolean arg2, class55 arg3, int arg4, int arg5, int arg6) {
        field5290++;
        if (arg4 < 3) {
            return (class169) null;
        }
        int var8 = (arg1 << 19) + (arg6 << 17) + (arg2 ? 65536 : 0) + arg5;
        long var9 = (long) arg0 * 3147483667L + ((long) var8 * 3849834839L);
        class169 var11 = (class169) class161.field2597.method1351(var9, 63);
        if (var11 != null) {
            return var11;
        }
        class31.field463 = false;
        class169 var12 = class273.method1925(false, arg3, arg6, arg1, arg0, arg2, false, (byte) 98, arg5);
        if (var12 != null && !class31.field463) {
            class161.field2597.method1347(var12, var9, (byte) -109);
        }
        return var12;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZLvl;)V", line = 195)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        if (arg0 == 0) {
            this.field5287 = arg2.method39((byte) 61);
        } else if (arg0 == 1) {
            this.field5289 = arg2.method39((byte) 77);
        } else if (arg0 == 2) {
            this.field5293 = arg2.method39((byte) 38);
        } else if (arg0 == 3) {
            this.field5294 = arg2.method39((byte) 59);
        }
        field5288++;
        if (arg1) {
            method2355(73, 66, false, (class55) null, -118, 96, -98);
        }
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)V", line = 238)
    public static void method2356(int arg0) {
        if (arg0 != 23498) {
            field5297 = (String[]) null;
        }
        field5297 = null;
        field5298 = (int[][][]) null;
        field5284 = null;
        field5292 = null;
        field5295 = null;
    }
}
