import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class38 {

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "Z")
    public boolean field574 = false;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "S")
    public static short field581 = 32767;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field579 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field584 = 0;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public int field575;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public int field580;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V", line = 4)
    public static void method374(int arg0) {
        field579 = null;
        if (arg0 >= -119) {
            field578 = -16;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lrk;Lrk;B)V", line = 14)
    public static final void method375(class427 arg0, class427 arg1, byte arg2) {
        field582++;
        if (arg2 >= 7) {
            class128.field1810 = arg1;
            class256.field3465 = arg0;
            class256.field3465.method2626(36, 12);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lap;III)V", line = 35)
    private final void method376(class289 arg0, int arg1, int arg2, int arg3) {
        field585++;
        if (arg2 == 1) {
            this.field575 = arg0.method1853(-38);
        } else if (arg2 == 2) {
            this.field580 = arg0.method1880((byte) 93);
        } else if (arg2 == 3) {
            this.field574 = true;
        } else if (arg2 == 4) {
            this.field575 = -1;
        }
        if (arg1 != 262144) {
            field579 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZBILpe;)Lkb;", line = 64)
    public final class80 method377(boolean arg0, byte arg1, int arg2, class391 arg3) {
        field576++;
        long var5 = (long) ((arg0 ? 262144 : 0) | arg2 << 16 | this.field575 | arg3.field5484 << 19);
        class80 var7 = (class80) class89.field1330.method2537(-64, var5);
        if (var7 != null) {
            return var7;
        } else if (arg1 != 119) {
            return null;
        } else if (class402.field5608.method2635(this.field575, (byte) 90)) {
            class214 var8 = class214.method1459(class402.field5608, this.field575, 0);
            if (var8 != null) {
                var8.field2969 = var8.field2968 = var8.field2967 = var8.field2970 = 0;
                if (arg0) {
                    var8.method1462();
                }
                for (int var9 = 0; var9 < arg2; var9++) {
                    var8.method1461();
                }
            }
            class80 var10 = arg3.method213(var8, true);
            if (var10 != null) {
                class89.field1330.method2542(var10, (byte) -105, var5);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILap;B)V", line = 114)
    public final void method378(int arg0, class289 arg1, byte arg2) {
        while (true) {
            int var4 = arg1.method1861((byte) -72);
            if (var4 == 0) {
                if (arg2 != 40) {
                    this.field574 = false;
                }
                field577++;
                return;
            }
            this.method376(arg1, arg2 + 262104, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)Z", line = 148)
    public final boolean method379(int arg0) {
        field573++;
        if (arg0 != -3) {
            this.field574 = false;
        }
        return class402.field5608.method2635(this.field575, (byte) 67);
    }
}
