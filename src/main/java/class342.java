import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class342 {

    @OriginalMember(owner = "client!e", name = "g", descriptor = "Lvd;")
    private class305 field5308 = new class305();

    @OriginalMember(owner = "client!e", name = "m", descriptor = "Lrf;")
    private class79 field5314 = new class79();

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    private int field5310;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    private int field5322;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "Lsl;")
    private class39 field5319;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "Lab;")
    public static class279 field5311 = new class279(64);

    @OriginalMember(owner = "client!e", name = "p", descriptor = "[Z")
    public static boolean[] field5317 = new boolean[112];

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public static int field5316 = -1;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "[Lsa;")
    public static class339[] field5313 = new class339[8];

    @OriginalMember(owner = "client!e", name = "q", descriptor = "[I")
    public static int[] field5318 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!e", name = "s", descriptor = "Ljava/lang/String;")
    public static String field5320 = "Allocated memory";

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    public static int field5323 = 1;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Lbm;")
    public static class307 field5312;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(JI)Lvd;", line = 5)
    public final class305 method2367(long arg0, int arg1) {
        field5307++;
        class305 var4 = (class305) this.field5319.method303(arg0, (byte) 126);
        if (arg1 != -12270) {
            field5312 = (class307) null;
        }
        if (var4 != null) {
            this.field5314.method578(-111, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)Laa;", line = 32)
    public final class35 method2368(int arg0) {
        if (arg0 != -1) {
            method2371(32, -60, 93);
        }
        field5309++;
        return this.field5319.method306(~arg0);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(JILvd;)V", line = 43)
    public final void method2369(long arg0, int arg1, class305 arg2) {
        if (arg1 != -28759) {
            return;
        }
        if (this.field5310 == 0) {
            class305 var5 = this.field5314.method577((byte) -92);
            var5.method278((byte) -105);
            var5.method2024(0);
            if (this.field5308 == var5) {
                class305 var6 = this.field5314.method577((byte) -92);
                var6.method278((byte) -105);
                var6.method2024(0);
            }
        } else {
            this.field5310--;
        }
        field5302++;
        this.field5319.method310(arg0, arg2, arg1 ^ 0xFFFFECA4);
        this.field5314.method578(-120, arg2);
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V", line = 73)
    public static void method2370(int arg0) {
        if (arg0 != 1) {
            field5313 = (class339[]) null;
        }
        field5320 = null;
        field5318 = null;
        field5317 = null;
        field5311 = null;
        field5313 = null;
        field5312 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)J", line = 96)
    public static final long method2371(int arg0, int arg1, int arg2) {
        class47 var3 = class326.field4975[arg0][arg1][arg2];
        return var3 == null || var3.field975 == null ? 0L : var3.field975.field228;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)Laa;", line = 108)
    public final class35 method2372(byte arg0) {
        field5305++;
        if (arg0 != 11) {
            field5311 = (class279) null;
        }
        return this.field5319.method300(1);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lbm;Lbm;Z)V", line = 121)
    public static final void method2373(class307 arg0, class307 arg1, boolean arg2) {
        class307.field4675 = arg1;
        class234.field3682 = arg0;
        if (arg2) {
            field5318 = (int[]) null;
        }
        field5306++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)I", line = 136)
    public static final int method2374(int arg0, int arg1) {
        field5303++;
        if (arg0 == 16711935) {
            return -1;
        } else if (arg1 >= -36) {
            return -57;
        } else {
            return class71.method541(0, arg0);
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(I)V", line = 244)
    public class342(int arg0) {
        this.field5310 = arg0;
        this.field5322 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field5319 = new class39(var2);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZIII)I", line = 159)
    public static final int method2375(boolean arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & arg1 - 1;
        int var5 = arg2 / arg1;
        if (!arg0) {
            field5311 = (class279) null;
        }
        int var6 = arg3 & arg1 - 1;
        field5304++;
        int var7 = arg3 / arg1;
        int var8 = class30.method241(var5, var7, (byte) -125);
        int var9 = class30.method241(var5 + 1, var7, (byte) 71);
        int var10 = class30.method241(var5, var7 + 1, (byte) 115);
        int var11 = class30.method241(var5 + 1, var7 - -1, (byte) -76);
        int var12 = class48.method371((byte) -104, var4, arg1, var9, var8);
        int var13 = class48.method371((byte) -104, var4, arg1, var11, var10);
        return class48.method371((byte) -104, var6, arg1, var13, var12);
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V", line = 201)
    public final void method2376(int arg0) {
        this.field5314.method575((byte) 120);
        this.field5319.method302((byte) 123);
        field5315++;
        if (arg0 != 0) {
            this.field5308 = (class305) null;
        }
        this.field5308 = new class305();
        this.field5310 = this.field5322;
    }
}
