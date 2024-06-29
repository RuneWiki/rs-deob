import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class338 {

    @OriginalMember(owner = "client!en", name = "g", descriptor = "I")
    public int field4744 = 128;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    public int field4742 = 128;

    @OriginalMember(owner = "client!en", name = "l", descriptor = "I")
    public int field4749;

    @OriginalMember(owner = "client!en", name = "k", descriptor = "I")
    public int field4748;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public int field4741;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "I")
    public int field4746;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "Lqj;")
    public static class535 field4739 = new class535(50);

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!en", name = "j", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "J")
    public static long field4738;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)Len;")
    public final class338 method2158(int arg0) {
        field4747++;
        if (arg0 != -28544) {
            method2160(30);
        }
        return new class338(this.field4749, this.field4742, this.field4744, this.field4748, this.field4741, this.field4746);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILen;)V")
    public final void method2159(int arg0, class338 arg1) {
        this.field4748 = arg1.field4748;
        if (arg0 != 28018) {
            this.method2158(-116);
        }
        this.field4744 = arg1.field4744;
        this.field4746 = arg1.field4746;
        this.field4742 = arg1.field4742;
        field4745++;
        this.field4741 = arg1.field4741;
        this.field4749 = arg1.field4749;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
    public static void method2160(int arg0) {
        if (arg0 <= -127) {
            field4739 = null;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Ltq;III)Lnba;")
    public static final class315 method2161(class654 arg0, int arg1, int arg2, int arg3) {
        field4740++;
        int var4 = arg1 << 10 | arg0.field8813;
        if (arg2 != -23265) {
            field4739 = null;
        }
        class315 var5 = (class315) class751.field10147.method76(104, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class235.field3135.method1176(class235.field3135.method1179(var4, -58), 97);
        if (var6 == null) {
            int var9 = arg3 + 65536 << 10 | arg0.field8813;
            class315 var10 = (class315) class751.field10147.method76(arg2 ^ 0xFFFFA53B, (long) var9 << 16);
            if (var10 != null) {
                return var10;
            }
            byte[] var11 = class235.field3135.method1176(class235.field3135.method1179(var9, -42), 73);
            if (var11 == null) {
                int var14 = arg0.field8813 | 0x3FFFC00;
                class315 var15 = (class315) class751.field10147.method76(28, (long) var14 << 16);
                if (var15 != null) {
                    return var15;
                }
                byte[] var16 = class235.field3135.method1176(class235.field3135.method1179(var14, -96), 106);
                if (var16 == null) {
                    return null;
                } else if (var16.length <= 1) {
                    return null;
                } else {
                    class315 var17;
                    try {
                        var17 = class668.method3687(21, var16);
                    } catch (Exception var21) {
                        throw new RuntimeException(var21.getMessage() + " S: " + var14);
                    }
                    var17.field4443 = arg0;
                    class751.field10147.method79(var17, (long) var14 << 16, false);
                    return var17;
                }
            } else if (var11.length <= 1) {
                return null;
            } else {
                class315 var12;
                try {
                    var12 = class668.method3687(arg2 ^ 0xFFFFA50A, var11);
                } catch (Exception var20) {
                    throw new RuntimeException(var20.getMessage() + " S: " + var9);
                }
                var12.field4443 = arg0;
                class751.field10147.method79(var12, (long) var9 << 16, false);
                return var12;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class315 var7;
            try {
                var7 = class668.method3687(arg2 ^ 0xFFFFA50A, var6);
            } catch (Exception var19) {
                throw new RuntimeException(var19.getMessage() + " S: " + var4);
            }
            var7.field4443 = arg0;
            class751.field10147.method79(var7, (long) var4 << 16, false);
            return var7;
        }
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(I)V")
    public class338(int arg0) {
        this.field4749 = arg0;
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(IIIIII)V")
    private class338(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4749 = arg0;
        this.field4748 = arg3;
        this.field4744 = arg2;
        this.field4741 = arg4;
        this.field4742 = arg1;
        this.field4746 = arg5;
    }
}
