import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public abstract class class225 {

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public int field3705;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public int field3706;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public int field3704;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field3702 = 0;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "[S")
    public static short[] field3708 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "[[[Lek;")
    public static class198[][][] field3700;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(III)I", line = 18)
    public static final int method1593(int arg0, int arg1, int arg2) {
        field3703++;
        int var3 = class29.method207(arg2 - 1, arg1 + -1, (byte) -67) + class29.method207(arg2 + 1, arg1 - 1, (byte) -84) + class29.method207(arg2 + -1, arg1 + 1, (byte) -83) + class29.method207(arg2 + 1, arg1 + 1, (byte) -97);
        int var4 = class29.method207(arg2 - 1, arg1, (byte) -44) + (class29.method207(arg2 + 1, arg1, (byte) -122) + class29.method207(arg2, arg1 - 1, (byte) -71)) + class29.method207(arg2, arg1 + 1, (byte) -51);
        int var5 = class29.method207(arg2, arg1, (byte) -64);
        if (arg0 != 16) {
            field3700 = (class198[][][]) ((class198[][][]) null);
        }
        return var5 / 4 + (var3 / 16 + (var4 / 8));
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILni;Z)Lpk;", line = 39)
    public static final class74 method1594(int arg0, class202 arg1, boolean arg2) {
        if (!arg2) {
            method1596(94);
        }
        field3707++;
        return class67.method486(arg0, (byte) 125, arg1) ? class103.method655(true) : null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IBI[B)Z", line = 54)
    public static final boolean method1595(int arg0, byte arg1, int arg2, byte[] arg3) {
        field3701++;
        boolean var4 = true;
        int var5 = -109 / ((-arg1 - 44) / 33);
        int var6 = -1;
        class221 var7 = new class221(arg3);
        label70: while (true) {
            int var8 = var7.method1549((byte) -62);
            if (var8 == 0) {
                return var4;
            }
            var6 += var8;
            int var9 = 0;
            boolean var10 = false;
            while (true) {
                int var13;
                class185 var17;
                do {
                    int var15;
                    int var16;
                    do {
                        do {
                            do {
                                do {
                                    while (var10) {
                                        int var18 = var7.method1507(-92);
                                        if (var18 == 0) {
                                            continue label70;
                                        }
                                        var7.method1509(true);
                                    }
                                    int var11 = var7.method1507(-118);
                                    if (var11 == 0) {
                                        continue label70;
                                    }
                                    var9 += var11 - 1;
                                    int var12 = var9 & 0x3F;
                                    var13 = var7.method1509(true) >> 2;
                                    int var14 = (var9 & 0xFDC) >> 6;
                                    var15 = arg2 + var14;
                                    var16 = arg0 + var12;
                                } while (var15 <= 0);
                            } while (var16 <= 0);
                        } while (var15 >= 103);
                    } while (var16 >= 103);
                    var17 = class77.method536(var6, 123);
                } while (var13 == 22 && !class112.field1663 && var17.field2868 == 0 && var17.field2911 != 1 && !var17.field2896);
                if (!var17.method1221(0)) {
                    class147.field2138++;
                    var4 = false;
                }
                var10 = true;
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 148)
    public static void method1596(int arg0) {
        field3700 = (class198[][][]) null;
        field3708 = null;
        if (arg0 != -1) {
            field3702 = -28;
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(III)V", line = 161)
    public class225(int arg0, int arg1, int arg2) {
        this.field3705 = arg1;
        this.field3706 = arg2;
        this.field3704 = arg0;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIB)V")
    public abstract void method397(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(IIB)V")
    public abstract void method393(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(IIB)V")
    public abstract void method395(int arg0, int arg1, byte arg2);
}
