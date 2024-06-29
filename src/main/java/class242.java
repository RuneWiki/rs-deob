import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class242 implements class182 {

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "I")
    public int field3203;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "[I")
    public static int[] field3198 = new int[32];

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "[I")
    public static int[] field3201 = new int[1];

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "[I")
    public static int[] field3207;

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "[F")
    public static float[] field3206;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!oq", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3205++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method1510(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field3204++;
        if (arg4 > -41) {
            return;
        }
        int var8 = arg6 - arg3;
        int var9 = arg2 + arg3;
        for (int var10 = arg2; var10 < var9; var10++) {
            class476.method2907(arg1, 33, arg5, class5.field54[var10], arg7);
        }
        int var11 = arg1 - arg3;
        int var12 = arg3 + arg7;
        for (int var13 = arg6; var13 > var8; var13--) {
            class476.method2907(arg1, 94, arg5, class5.field54[var13], arg7);
        }
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class5.field54[var14];
            class476.method2907(var12, 89, arg5, var15, arg7);
            class476.method2907(var11, 79, arg0, var15, var12);
            class476.method2907(arg1, 41, arg5, var15, var11);
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(III)Z")
    public static final boolean method1511(int arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            field3201 = null;
        }
        field3202++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)V")
    public static final void method1512(int arg0) {
        class19.field168.method984(false);
        field3196++;
        if (arg0 != 2) {
            return;
        }
        for (class36 var1 = (class36) class69.field806.method970(arg0 + 10); var1 != null; var1 = (class36) class69.field806.method976((byte) -121)) {
            if (var1.field361 < 1000) {
                var1.method2674(true);
                class19.field168.method975(0, var1);
            }
        }
        class19.field168.method974(class69.field806, arg0);
        int var2 = -1;
        class299 var3 = (class299) class333.field4405.method970(12);
        if (var3 != null) {
            var2 = var3.method1758((byte) 125);
        }
        if (!class483.field7125) {
            if (var2 == 0 && (class270.field3616 == 1 && class391.field5656 > 2 || class528.method3131((byte) 95))) {
                var2 = 2;
            }
            if (var2 == 2 && class391.field5656 > 0 && var3 != null) {
                if (class188.field2436 == null && class453.field6781 == 0) {
                    class349.method2052(var3.method1755(3), var3.method1760(1), 23938);
                } else {
                    class488.field7161 = 2;
                }
            }
            if (var2 == 0 && class391.field5656 > 0) {
                class419.method2587(false);
            }
            if (class188.field2436 == null && class453.field6781 == 0) {
                class488.field7161 = 0;
                class249.field3317 = null;
                return;
            }
            return;
        }
        if (var2 == -1) {
            int var4 = class148.field1951.method349((byte) -35);
            int var5 = class148.field1951.method347(arg0 - 123);
            if (var4 < (class451.field6723 - 10) || var4 > class451.field6723 - (-class366.field4993 - 10) || (class155.field2026 - 10) > var5 || var5 > class155.field2026 - (-class425.field6180 - 10)) {
                class95.method530((byte) 8);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var6 = class451.field6723;
        int var7 = class155.field2026;
        int var8 = class366.field4993;
        int var9 = var3.method1760(arg0 - 1);
        int var10 = var3.method1755(arg0 ^ 0x1);
        int var11 = -1;
        for (int var12 = 0; var12 < class391.field5656; var12++) {
            if (class144.field1922) {
                int var16 = ((class391.field5656 - var12 - 1) * 16) + var7 + 33;
                if (var9 > var6 && var9 < (var6 + var8) && var16 - 13 < var10 && var10 < (var16 + 4)) {
                    var11 = var12;
                }
            } else {
                int var17 = var7 + ((class391.field5656 + -1 + -var12) * 16) + 31;
                if (var6 < var9 && (var6 + var8) > var9 && (var17 - 13) < var10 && var10 < (var17 + 3)) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class10 var14 = new class10(class69.field806);
            for (class36 var15 = (class36) var14.method68(-73); var15 != null; var15 = (class36) var14.method65((byte) -61)) {
                if (var11 == var13) {
                    class76.method442(var10, 0, var15, var9);
                }
                var13++;
            }
        }
        class95.method530((byte) 8);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Ljava/lang/Object;ZII)[B")
    public static final byte[] method1513(Object arg0, boolean arg1, int arg2, int arg3) {
        field3199++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var4 = (byte[]) arg0;
            return class87.method479(59, var4, arg2, arg3);
        } else if (arg0 instanceof class520) {
            class520 var5 = (class520) arg0;
            return var5.method1986(64, arg2, arg3);
        } else {
            if (!arg1) {
                method1511(-98, 72, -55);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class242(String arg0, int arg1) {
        this.field3203 = arg1;
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)V")
    public static void method1514(int arg0) {
        field3207 = null;
        field3206 = null;
        field3201 = null;
        if (arg0 != -31) {
            field3201 = null;
        }
        field3198 = null;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3198[var1] = var0 - 1;
            var0 += var0;
        }
        field3207 = new int[] { 1, 0, -1, 0 };
        field3206 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };
    }
}
