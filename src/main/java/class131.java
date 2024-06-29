import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class131 extends class200 {

    @OriginalMember(owner = "client!m", name = "R", descriptor = "Z")
    public boolean field2342 = false;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "[I")
    private int[] field2336 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!m", name = "W", descriptor = "I")
    public int field2347 = -1;

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "Ldj;")
    public static class44 field2341 = class89.method650(255, "::gc");

    @OriginalMember(owner = "client!m", name = "M", descriptor = "[I")
    public static int[] field2337 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!m", name = "P", descriptor = "Ldj;")
    public static class44 field2340 = class89.method650(255, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!m", name = "cb", descriptor = "[I")
    public static int[] field2353 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!m", name = "S", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!m", name = "V", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!m", name = "X", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!m", name = "ab", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!m", name = "bb", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!m", name = "eb", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "[I")
    private int[] field2349;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "[S")
    private short[] field2338;

    @OriginalMember(owner = "client!m", name = "O", descriptor = "[S")
    private short[] field2339;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "[S")
    private short[] field2345;

    @OriginalMember(owner = "client!m", name = "db", descriptor = "[S")
    private short[] field2354;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V")
    public static void method886(int arg0) {
        if (arg0 != 128) {
            field2337 = null;
        }
        field2341 = null;
        field2337 = null;
        field2353 = null;
        field2340 = null;
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(I)Z")
    public final boolean method887(int arg0) {
        field2352++;
        boolean var2 = true;
        if (arg0 != -14437) {
            return true;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2336[var3] != -1 && !class211.field3773.method1453(this.field2336[var3], true, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lwd;III)V")
    public static final void method888(class234 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class66.field1205) {
            class68 var4 = class32.field567[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field1304 != null && var4.field1304.field3977.method1269()) {
                arg0.method1254(var4.field1304.field3977, 128, 0, 0, true);
            }
        }
        if (arg3 < class66.field1205) {
            class68 var5 = class32.field567[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field1304 != null && var5.field1304.field3977.method1269()) {
                arg0.method1254(var5.field1304.field3977, 0, 0, 128, true);
            }
        }
        if (arg2 < class66.field1205 && arg3 < class21.field355) {
            class68 var6 = class32.field567[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field1304 != null && var6.field1304.field3977.method1269()) {
                arg0.method1254(var6.field1304.field3977, 128, 0, 128, true);
            }
        }
        if (arg2 < class66.field1205 && arg3 > 0) {
            class68 var7 = class32.field567[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field1304 != null && var7.field1304.field3977.method1269()) {
                arg0.method1254(var7.field1304.field3977, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lfj;II)V")
    private final void method889(class66 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field2347 = arg0.method506(255);
        } else if (arg2 == 2) {
            int var8 = arg0.method506(255);
            this.field2349 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2349[var9] = arg0.method500(38);
            }
        } else if (arg2 == 3) {
            this.field2342 = true;
        } else if (arg2 == 40) {
            int var6 = arg0.method506(255);
            this.field2354 = new short[var6];
            this.field2338 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2338[var7] = (short) arg0.method500(126);
                this.field2354[var7] = (short) arg0.method500(113);
            }
        } else if (arg2 == 41) {
            int var4 = arg0.method506(255);
            this.field2339 = new short[var4];
            this.field2345 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2345[var5] = (short) arg0.method500(49);
                this.field2339[var5] = (short) arg0.method500(78);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field2336[arg2 - 60] = arg0.method500(80);
        }
        field2350++;
        if (arg1 <= 87) {
            this.method894((byte) 109, null);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIII)V")
    public static final void method890(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2346++;
        int var6 = arg2 - arg0;
        if (arg4 != 4) {
            method890(-14, 71, 31, -9, 39, 21);
        }
        int var7 = arg1 - arg5;
        if (var7 == 0) {
            if (var6 != 0) {
                class5.method34(arg5, arg3, arg4 + 9150, arg0, arg2);
            }
        } else if (var6 == 0) {
            class122.method839(arg0, -7868, arg1, arg5, arg3);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg5;
                int var10 = arg1;
                arg1 = arg2;
                arg5 = arg0;
                arg2 = var10;
                arg0 = var9;
            }
            if (arg1 < arg5) {
                int var11 = arg5;
                int var12 = arg0;
                arg5 = arg1;
                arg0 = arg2;
                arg2 = var12;
                arg1 = var11;
            }
            int var13 = arg0;
            int var14 = arg1 - arg5;
            int var15 = -(var14 >> 1);
            int var16 = arg2 - arg0;
            if (var16 < 0) {
                var16 = -var16;
            }
            int var17 = arg0 >= arg2 ? -1 : 1;
            if (var8) {
                for (int var18 = arg5; var18 <= arg1; var18++) {
                    class108.field1979[var18][var13] = arg3;
                    var15 += var16;
                    if (var15 > 0) {
                        var15 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var19 = arg5; var19 <= arg1; var19++) {
                    var15 += var16;
                    class108.field1979[var13][var19] = arg3;
                    if (var15 > 0) {
                        var15 -= var14;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "f", descriptor = "(I)Lse;")
    public final class195 method891(int arg0) {
        field2351++;
        if (this.field2349 == null) {
            return null;
        }
        class195[] var2 = new class195[this.field2349.length];
        for (int var3 = 0; var3 < this.field2349.length; var3++) {
            var2[var3] = class195.method1271(class211.field3773, this.field2349[var3], 0);
        }
        class195 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class195(var2, var2.length);
        }
        if (arg0 <= 124) {
            this.field2349 = null;
        }
        if (this.field2338 != null) {
            for (int var5 = 0; var5 < this.field2338.length; var5++) {
                var4.method1249(this.field2338[var5], this.field2354[var5]);
            }
        }
        if (this.field2345 != null) {
            for (int var6 = 0; var6 < this.field2345.length; var6++) {
                var4.method1247(this.field2345[var6], this.field2339[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!m", name = "g", descriptor = "(I)Z")
    public final boolean method892(int arg0) {
        field2344++;
        if (this.field2349 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != 11538) {
            return true;
        }
        for (int var3 = 0; var3 < this.field2349.length; var3++) {
            if (!class211.field3773.method1453(this.field2349[var3], true, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!m", name = "h", descriptor = "(I)Lse;")
    public final class195 method893(int arg0) {
        field2348++;
        if (arg0 != 24238) {
            this.field2336 = null;
        }
        class195[] var2 = new class195[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2336[var4] != -1) {
                var2[var3++] = class195.method1271(class211.field3773, this.field2336[var4], 0);
            }
        }
        class195 var5 = new class195(var2, var3);
        if (this.field2338 != null) {
            for (int var6 = 0; var6 < this.field2338.length; var6++) {
                var5.method1249(this.field2338[var6], this.field2354[var6]);
            }
        }
        if (this.field2345 != null) {
            for (int var7 = 0; var7 < this.field2345.length; var7++) {
                var5.method1247(this.field2345[var7], this.field2339[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BLfj;)V")
    public final void method894(byte arg0, class66 arg1) {
        field2355++;
        if (arg0 != -9) {
            this.field2345 = null;
        }
        while (true) {
            int var3 = arg1.method506(arg0 ^ 0xFFFFFF08);
            if (var3 == 0) {
                return;
            }
            this.method889(arg1, 122, var3);
        }
    }
}
