import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class125 implements class345 {

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public int field1632;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "[[B")
    public static byte[][] field1628;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
    public static void method802(int arg0) {
        field1628 = null;
        if (arg0 != -9) {
            method802(-127);
        }
    }

    @OriginalMember(owner = "client!gm", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1636++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZII)Z")
    public static final boolean method803(boolean arg0, int arg1, int arg2) {
        field1631++;
        if (arg0) {
            return (arg1 & 0x22) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILji;)Lfq;")
    public static final class203 method804(int arg0, class611 arg1) {
        field1629++;
        if (arg0 != -1) {
            field1628 = null;
        }
        class676 var2 = class216.method1203(122)[arg1.method3428((byte) -101)];
        class82 var3 = class449.method2516(256)[arg1.method3428((byte) -98)];
        int var4 = arg1.method3413(false);
        int var5 = arg1.method3413(false);
        int var6 = arg1.method3402((byte) 127);
        int var7 = arg1.method3402((byte) 127);
        int var8 = arg1.method3413(false);
        int var9 = arg1.method3418(-2);
        int var10 = arg1.method3418(arg0 ^ 0x1);
        return new class203(var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIII)I")
    public static final int method805(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1634++;
        int var5 = arg3 & 0xF;
        int var6 = var5 < 8 ? arg2 : arg1;
        int var7 = arg4 >= ~var5 ? (var5 == 12 || var5 == 14 ? arg2 : arg0) : arg1;
        return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)Luaa;")
    public static final class119 method806(int arg0, int arg1) {
        field1635++;
        if (arg0 == 0) {
            if ((double) class642.field8936 == 3.0D) {
                return class660.field9216;
            }
            if ((double) class642.field8936 == 4.0D) {
                return class266.field3527;
            }
            if ((double) class642.field8936 == 6.0D) {
                return class660.field9208;
            }
            if ((double) class642.field8936 >= 8.0D) {
                return class291.field3851;
            }
        } else if (arg0 == 1) {
            if ((double) class642.field8936 == 3.0D) {
                return class660.field9208;
            }
            if ((double) class642.field8936 == 4.0D) {
                return class291.field3851;
            }
            if ((double) class642.field8936 == 6.0D) {
                return class460.field6377;
            }
            if ((double) class642.field8936 >= 8.0D) {
                return class636.field8840;
            }
        } else if (arg0 == 2) {
            if ((double) class642.field8936 == 3.0D) {
                return class460.field6377;
            }
            if ((double) class642.field8936 == 4.0D) {
                return class636.field8840;
            }
            if ((double) class642.field8936 == 6.0D) {
                return class621.field8702;
            }
            if ((double) class642.field8936 >= 8.0D) {
                return class681.field9490;
            }
        }
        if (arg1 != 5466) {
            method806(35, 58);
        }
        return null;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class125(String arg0, int arg1) {
        this.field1632 = arg1;
    }
}
