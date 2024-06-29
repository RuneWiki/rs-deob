import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class322 {

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "Z")
    public boolean field4422 = false;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field4414 = 0;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public int field4418;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public int field4421;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)Z", line = 10)
    public final boolean method2076(int arg0) {
        if (arg0 == 1) {
            field4415++;
            return class417.field5930.method1759(-28, this.field4421);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Luo;IIZ)Lsg;", line = 22)
    public final class226 method2077(class345 arg0, int arg1, int arg2, boolean arg3) {
        field4420++;
        long var5 = (long) (arg0.field4704 << 19 | (arg3 ? 262144 : 0) | arg2 << 16 | this.field4421);
        class226 var7 = (class226) class46.field650.method904(false, var5);
        if (var7 != null) {
            return var7;
        } else if (class417.field5930.method1759(-19, this.field4421)) {
            class238 var8 = class238.method1606(class417.field5930, this.field4421, 0);
            if (var8 != null) {
                var8.field3386 = var8.field3385 = var8.field3389 = var8.field3387 = 0;
                if (arg3) {
                    var8.method1612();
                }
                for (int var9 = 0; var9 < arg2; var9++) {
                    var8.method1610();
                }
            }
            if (arg1 != -21177) {
                field4414 = -103;
            }
            class226 var10 = arg0.method105(var8, true);
            if (var10 != null) {
                class46.field650.method902(var5, (byte) 112, var10);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V", line = 71)
    public static final void method2078(int arg0, int arg1) {
        field4417++;
        if (arg1 >= -64) {
            field4414 = 40;
        }
        class131 var2 = class337.field4640;
        synchronized (class337.field4640) {
            class337.field4640.method901(arg0, 12223);
        }
        class131 var3 = class360.field4970;
        synchronized (class360.field4970) {
            class360.field4970.method901(arg0, 12223);
        }
        class131 var4 = class387.field5560;
        synchronized (class387.field5560) {
            class387.field5560.method901(arg0, 12223);
        }
        class131 var5 = class141.field2011;
        synchronized (class141.field2011) {
            class141.field2011.method901(arg0, 12223);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)I", line = 95)
    public static final int method2079(int arg0, int arg1, int arg2) {
        field4424++;
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg0 >>= 0x1;
            arg2 *= arg2;
        }
        if (arg0 == 1) {
            return arg2 * var3;
        } else {
            if (arg1 <= 66) {
                method2079(-96, -60, 31);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLkh;II)V", line = 122)
    private final void method2080(byte arg0, class11 arg1, int arg2, int arg3) {
        if (arg0 != 107) {
            this.field4418 = -33;
        }
        field4423++;
        if (arg3 == 1) {
            this.field4421 = arg1.method174(arg0 ^ 0x94);
        } else if (arg3 == 2) {
            this.field4418 = arg1.method208(27308);
        } else if (arg3 == 3) {
            this.field4422 = true;
        } else if (arg3 == 4) {
            this.field4421 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILkh;B)V", line = 161)
    public final void method2081(int arg0, class11 arg1, byte arg2) {
        field4416++;
        while (true) {
            int var4 = arg1.method172((byte) 52);
            if (var4 == 0) {
                if (arg2 == 117) {
                    return;
                } else {
                    this.method2077((class345) null, -29, -66, false);
                    return;
                }
            }
            this.method2080((byte) 107, arg1, arg0, var4);
        }
    }
}
