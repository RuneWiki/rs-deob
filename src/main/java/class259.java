import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class259 extends class155 {

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "F")
    private float field3626 = 0.0F;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "Luw;")
    private class440 field3627;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "[I")
    public static int[] field3633 = new int[14];

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "I")
    public static int field3636 = 0;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "[Lnf;")
    public static class604[] field3631;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(Z)V", line = 3)
    public static void method1686(boolean arg0) {
        if (arg0) {
            method1686(true);
        }
        field3631 = null;
        field3633 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILkh;I)V", line = 14)
    public static final void method1687(int arg0, int arg1, class17 arg2, int arg3) {
        class6.field120 = arg2;
        class651.field9024 = arg3;
        ++field3630;
        class624.field8691 = arg0;
        if (arg1 != 10403) {
            method1688(false, -53, (byte) 114);
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lsf;Luw;)V", line = 27)
    public class259(class551 arg0, class440 arg1) {
        super(arg0);
        this.field3627 = arg1;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZIB)V", line = 37)
    public static final void method1688(boolean arg0, int arg1, byte arg2) {
        if (arg2 <= 124) {
            method1688(false, 42, (byte) -106);
        }
        ++field3625;
        class539 var3 = class210.method1479(arg0, -115, arg1);
        if (var3 != null) {
            var3.method1207(113);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZZ)V", line = 57)
    public final void method257(boolean arg0, boolean arg1) {
        ++field3638;
        if (arg0) {
            this.method257(true, true);
        }
        super.field2533.method3118(class371.field5051, class671.field9318, 0);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lbr;II)V", line = 73)
    public final void method259(class416 arg0, int arg1, int arg2) {
        super.field2533.method3090(arg0, (byte) 98);
        ++field3632;
        if (arg1 >= -71) {
            this.field3627 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)V", line = 86)
    public final void method255(int arg0) {
        if (arg0 < -119) {
            ++field3624;
            super.field2533.method3114(1, false);
            super.field2533.method3118(class671.field9318, class671.field9318, 0);
            super.field2533.method3143(class327.field4459, true, 0);
            super.field2533.method3168((byte) 40, 0, class327.field4459);
            super.field2533.method836(1, (byte) -112);
            super.field2533.method3090((class416) null, (byte) -120);
            super.field2533.method3114(0, false);
            super.field2533.method3168((byte) 92, 0, class327.field4459);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 104)
    public final void method256(int arg0) {
        if (arg0 < -19) {
            if (~super.field2533.method3111(0) == -1) {
                class421 var2 = super.field2533.method3152(8);
                super.field2533.method3114(1, false);
                class421 var3 = super.field2533.method3125(0);
                var3.method1874(var2);
                var3.method2487(1.0F, 22222, 0.125F, 0.125F);
                var3.method2489(0.0F, this.field3626, 71, 0.0F);
                super.field2533.method3099(-91, class758.field10447);
                super.field2533.method3114(0, false);
            }
            ++field3628;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)Z", line = 129)
    public final boolean method250(int arg0) {
        ++field3634;
        int var2 = -22 / ((arg0 - -8) / 41);
        return this.field3627.method2564(128);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZ)V", line = 143)
    public final void method258(int arg0, boolean arg1) {
        super.field2533.method3114(1, false);
        ++field3629;
        super.field2533.method3118(class371.field5051, class639.field8801, 0);
        super.field2533.method841(class327.field4459, true, 0, false, 18680);
        super.field2533.method3168((byte) 53, 0, class606.field8459);
        super.field2533.method836(0, (byte) 122);
        if (arg0 == 205) {
            super.field2533.method3114(0, false);
            super.field2533.method3130((byte) -124, -16777216);
            super.field2533.method3168((byte) 90, 0, class633.field8767);
            this.method256(-109);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIB)V", line = 168)
    public final void method254(int arg0, int arg1, byte arg2) {
        if (arg2 == -92) {
            super.field2533.method3114(1, false);
            ++field3635;
            if ((128 & arg0) != 0) {
                super.field2533.method3090((class416) null, (byte) -86);
            } else if (~(arg1 & 1) == -2) {
                if (this.field3627.field5974) {
                    this.field3626 = (float) (super.field2533.field7757 % 4000) / 4000.0F;
                    super.field2533.method3090(this.field3627.field5973, (byte) 123);
                } else {
                    int var4 = super.field2533.field7757 % 4000 * 16 / 4000;
                    super.field2533.method3090(this.field3627.field5970[var4], (byte) 63);
                }
            } else if (!this.field3627.field5974) {
                super.field2533.method3090(this.field3627.field5970[0], (byte) -127);
            } else {
                super.field2533.method3090(this.field3627.field5973, (byte) -102);
            }
            super.field2533.method3114(0, false);
        }
    }
}
