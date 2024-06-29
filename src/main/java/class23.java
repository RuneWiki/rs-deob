import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public class class23 {

    @OriginalMember(owner = "client!qia", name = "e", descriptor = "Z")
    public boolean field361 = true;

    @OriginalMember(owner = "client!qia", name = "m", descriptor = "I")
    private int field369 = -1;

    @OriginalMember(owner = "client!qia", name = "o", descriptor = "Lqga;")
    private class197 field371;

    @OriginalMember(owner = "client!qia", name = "d", descriptor = "Ldia;")
    private class246 field360;

    @OriginalMember(owner = "client!qia", name = "i", descriptor = "I")
    private int field365;

    @OriginalMember(owner = "client!qia", name = "l", descriptor = "I")
    private int field368;

    @OriginalMember(owner = "client!qia", name = "n", descriptor = "I")
    private int field370;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "Lm;")
    private class204 field357;

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "Lhb;")
    private class757 field358;

    @OriginalMember(owner = "client!qia", name = "f", descriptor = "Ltca;")
    private class184 field362;

    @OriginalMember(owner = "client!qia", name = "g", descriptor = "[I")
    public static int[] field363 = new int[4096];

    @OriginalMember(owner = "client!qia", name = "h", descriptor = "Z")
    public static boolean field364 = false;

    @OriginalMember(owner = "client!qia", name = "c", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!qia", name = "j", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!qia", name = "p", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!qia", name = "q", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!qia", name = "r", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!qia", name = "k", descriptor = "Ljava/lang/Object;")
    public static Object field367;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(JZ)Ljava/lang/String;", line = 6)
    public static final String method184(long arg0, boolean arg1) {
        field359++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            if (arg1) {
                method184(16L, true);
            }
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class493.field6833[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)V", line = 59)
    public final void method185(int arg0) {
        this.method189(this.field357, this.field370, 4);
        if (arg0 != 0) {
            this.method185(-28);
        }
        field374++;
    }

    @OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(Ldia;Lqga;Lct;IIIII)V", line = 240)
    public class23(class246 arg0, class197 arg1, class156 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field371 = arg1;
        this.field360 = arg0;
        this.field365 = arg7;
        this.field368 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field4301 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field2121[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field370 = var10;
        if (var10 <= 0) {
            this.field362 = null;
        } else {
            class376 var14 = new class376(var10 * 2);
            if (this.field360.field3588) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field4301 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field2121[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method2415(false, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field4301 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field2121[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method2368(121, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field357 = this.field360.method1597(var14.field5459, false, 5123, false, var14.field5518);
            this.field358 = new class757(this.field360, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(III[B)V", line = 80)
    public final void method186(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg1 != 28752) {
            this.field358 = null;
        }
        field372++;
        this.field358.method1373(arg2 * this.field360.method1658(arg1 ^ 0x702E, arg0), true, arg0, arg3);
        this.method189(this.field358, arg2, 4);
    }

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "(I)V", line = 96)
    public static void method187(int arg0) {
        field367 = null;
        field363 = null;
        int var1 = -114 / ((arg0 + 74) / 42);
    }

    @OriginalMember(owner = "client!qia", name = "c", descriptor = "(I)V", line = 107)
    private final void method188(int arg0) {
        field373++;
        if (!this.field361) {
            return;
        }
        this.field361 = false;
        byte[] var2 = this.field371.field2638;
        byte[] var3 = this.field360.field3682;
        int var4 = 0;
        int var5 = this.field371.field2637;
        int var6 = this.field371.field2637 * this.field365 + this.field368;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field362 != null && this.field369 == var4) {
            this.field361 = false;
            return;
        }
        this.field369 = var4;
        int var8 = this.field365 * var5 + this.field368;
        int var9 = 0;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var8] != 0) {
                        var12++;
                    }
                    var3[var9++] = (byte) (var12 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var8++;
            }
            var8 += this.field371.field2637 - 128;
        }
        if (arg0 < 93) {
            method184(-13L, true);
        }
        if (this.field362 == null) {
            this.field362 = new class184(this.field360, 3553, 6406, 128, 128, false, this.field360.field3682, 6406, false);
            this.field362.method1274(false, false, 10242);
            this.field362.method52(false, true);
        } else {
            this.field362.method1277(128, 0, false, 126, 128, this.field360.field3682, 6406, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(Lm;II)V", line = 215)
    private final void method189(class204 arg0, int arg1, int arg2) {
        field366++;
        if (arg1 != 0) {
            this.method188(101);
            this.field360.method1653((byte) 119, this.field362);
            this.field360.method1586(arg0, arg1, arg2, true, 0);
        }
    }
}
