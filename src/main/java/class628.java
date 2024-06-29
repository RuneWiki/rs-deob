import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class628 {

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Lkea;")
    private class213 field8791 = new class213(256);

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "Lkea;")
    private class213 field8793 = new class213(256);

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Lpu;")
    private class522 field8785;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "Lpu;")
    private class522 field8783;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field8784;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field8786;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field8787;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field8788;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field8789;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field8790;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field8792;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[I)Lmm;", line = 13)
    public final class250 method3500(int arg0, int arg1, int[] arg2) {
        field8784++;
        if (this.field8785.method2977((byte) -95) == 1) {
            return this.method3502(arg2, arg1, arg0 ^ 0xFFFFFFBE, 0);
        } else if (this.field8785.method2988(-121, arg1) == 1) {
            return this.method3502(arg2, 0, arg0 ^ 0xFFFFFFA4, arg1);
        } else if (arg0 == 0) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IBZ)I", line = 34)
    public static final int method3501(int arg0, byte arg1, boolean arg2) {
        field8788++;
        if (arg2) {
            return 0;
        } else if (arg1 == 85) {
            class138 var3 = class642.method3576(arg0, (byte) -105, arg2);
            if (var3 == null) {
                return class78.field1347.method1018(arg0, 106).field7031;
            }
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field2009.length; var5++) {
                if (var3.field2009[var5] == -1) {
                    var4++;
                }
            }
            return var4 + class78.field1347.method1018(arg0, 82).field7031 - var3.field2009.length;
        } else {
            return -58;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([IIII)Lmm;", line = 70)
    private final class250 method3502(int[] arg0, int arg1, int arg2, int arg3) {
        field8787++;
        int var5 = ((arg3 & 0x10000FFF) << 4 | arg3 >>> 12) ^ arg1;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class250 var9 = (class250) this.field8793.method1405(var7, (byte) -92);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class359 var10 = (class359) this.field8791.method1405(var7, (byte) -40);
            if (var10 == null) {
                var10 = class359.method2190(this.field8785, arg3, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field8791.method1403((byte) -18, var10, var7);
            }
            class250 var11 = var10.method2188(arg0);
            if (var11 == null) {
                return null;
            }
            var10.method3678(-1);
            if (arg2 > -22) {
                return null;
            } else {
                this.field8793.method1403((byte) -18, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 113)
    public static final void method3503(int arg0) {
        field8789++;
        if (class666.field9407 != null) {
            class211[] var1 = class666.field9407;
            for (int var2 = 0; var2 < var1.length; var2++) {
                class211 var3 = var1[var2];
                var3.method702(-17);
            }
        }
        if (arg0 != 6025) {
            field8790 = -27;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[II)Lmm;", line = 137)
    private final class250 method3504(int arg0, int arg1, int[] arg2, int arg3) {
        field8786++;
        int var5 = arg3 ^ (arg1 >>> 12 | (arg1 & 0x80000FFF) << 4);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class250 var9 = (class250) this.field8793.method1405(var7, (byte) -110);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            int var10 = 68 % ((arg0 - 78) / 38);
            class468 var11 = class468.method2764(this.field8783, arg1, arg3);
            if (var11 == null) {
                return null;
            }
            class250 var12 = var11.method2766();
            this.field8793.method1403((byte) -18, var12, var7);
            if (arg2 != null) {
                arg2[0] -= var12.field3871.length;
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[II)Lmm;", line = 180)
    public final class250 method3505(int arg0, int[] arg1, int arg2) {
        field8792++;
        if (this.field8783.method2977((byte) -95) == 1) {
            return this.method3504(29, 0, arg1, arg2);
        } else if (this.field8783.method2988(-27, arg2) == 1) {
            return this.method3504(118, arg2, arg1, 0);
        } else if (arg0 < 69) {
            return null;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lpu;Lpu;)V", line = 211)
    public class628(class522 arg0, class522 arg1) {
        this.field8785 = arg1;
        this.field8783 = arg0;
    }
}
