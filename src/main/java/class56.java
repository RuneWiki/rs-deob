import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hka")
public class class56 extends class101 {

    @OriginalMember(owner = "client!hka", name = "q", descriptor = "I")
    public int field777 = 0;

    @OriginalMember(owner = "client!hka", name = "C", descriptor = "Ljava/lang/String;")
    public String field789 = null;

    @OriginalMember(owner = "client!hka", name = "B", descriptor = "Z")
    private boolean field788 = true;

    @OriginalMember(owner = "client!hka", name = "v", descriptor = "I")
    public static int field782 = 0;

    @OriginalMember(owner = "client!hka", name = "u", descriptor = "B")
    public byte field781;

    @OriginalMember(owner = "client!hka", name = "D", descriptor = "B")
    public byte field790;

    @OriginalMember(owner = "client!hka", name = "n", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!hka", name = "o", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!hka", name = "r", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!hka", name = "s", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!hka", name = "w", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!hka", name = "x", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!hka", name = "y", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!hka", name = "F", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!hka", name = "A", descriptor = "J")
    public long field787;

    @OriginalMember(owner = "client!hka", name = "p", descriptor = "Z")
    private boolean field776;

    @OriginalMember(owner = "client!hka", name = "t", descriptor = "[I")
    private int[] field780;

    @OriginalMember(owner = "client!hka", name = "z", descriptor = "[Lwq;")
    public class179[] field786;

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(B)[I")
    public final int[] method398(byte arg0) {
        if (arg0 <= 36) {
            return null;
        } else {
            if (this.field780 == null) {
                String[] var2 = new String[this.field777];
                this.field780 = new int[this.field777];
                int var3 = 0;
                while (var3 < this.field777) {
                    var2[var3] = this.field786[var3].field2378;
                    this.field780[var3] = var3++;
                }
                class288.method1833(this.field780, true, var2);
            }
            ++field785;
            return this.field780;
        }
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method399(String arg0, int arg1) {
        if (arg1 != 14844) {
            field782 = -47;
        }
        ++field779;
        for (int var3 = 0; var3 < this.field777; ++var3) {
            if (this.field786[var3].field2378.equalsIgnoreCase(arg0)) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(IZ)V")
    private final void method400(int arg0, boolean arg1) {
        if (this.field786 != null) {
            class278.method1799(this.field786, 0, this.field786 = new class179[arg0], 0, this.field777);
        } else {
            this.field786 = new class179[arg0];
        }
        if (arg1) {
            this.field790 = -18;
        }
        ++field775;
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(Ljp;B)V")
    private final void method401(class376 arg0, byte arg1) {
        ++field784;
        int var3 = arg0.method2398(-1372747256);
        if (~(1 & var3) != -1) {
            this.field776 = true;
        }
        int var4 = 105 % ((8 - arg1) / 55);
        if (~(2 & var3) != -1) {
            this.field788 = true;
        }
        super.field1409 = arg0.method2366(true);
        this.field787 = arg0.method2366(true);
        this.field789 = arg0.method2379((byte) 85);
        arg0.method2398(-1372747256);
        this.field790 = arg0.method2387((byte) -128);
        this.field781 = arg0.method2387((byte) 114);
        this.field777 = arg0.method2359(-1);
        if (this.field777 > 0) {
            this.field786 = new class179[this.field777];
            for (int var5 = 0; var5 < this.field777; ++var5) {
                class179 var6 = new class179();
                if (this.field776) {
                    arg0.method2366(true);
                }
                if (this.field788) {
                    var6.field2378 = arg0.method2379((byte) 85);
                }
                var6.field2381 = arg0.method2387((byte) 122);
                var6.field2382 = arg0.method2359(-1);
                this.field786[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(FIZFIIILgv;F[BFIFI)V")
    public static final void method402(float arg0, int arg1, boolean arg2, float arg3, int arg4, int arg5, int arg6, class89 arg7, float arg8, byte[] arg9, float arg10, int arg11, float arg12, int arg13) {
        ++field791;
        int var14 = arg1 * arg4;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg6; ++var16) {
            arg7.method724(arg0 / (float) arg4, arg4, arg8 / (float) arg5, arg11, 0, arg3 / (float) arg1, arg1, -89, arg12 * 127.0F, var15, arg5);
            int var19 = arg13;
            arg0 *= 2.0F;
            arg3 *= 2.0F;
            arg12 = arg10 * arg12;
            arg8 *= 2.0F;
            for (int var20 = 0; var20 < var14; ++var20) {
                arg9[var19] = (byte) ((int) ((float) arg9[var19] + var15[var20]));
                ++var19;
            }
        }
        if (!arg2) {
            method402(0.5359238F, 93, false, -0.53656614F, -48, -57, -15, (class89) null, 0.7296558F, (byte[]) null, 0.37574947F, -59, 1.007478F, 31);
        }
        int var17 = arg13;
        for (int var18 = 0; ~var14 < ~var18; ++var18) {
            arg9[var17] = (byte) (arg9[var17] + 127);
            ++var17;
        }
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(II)V")
    public final void method403(int arg0, int arg1) {
        --this.field777;
        ++field774;
        if (~this.field777 == arg0) {
            this.field786 = null;
        } else {
            class278.method1799(this.field786, arg1 + 1, this.field786, arg1, -arg1 + this.field777);
        }
        this.field780 = null;
    }

    @OriginalMember(owner = "client!hka", name = "b", descriptor = "(III)Lkp;")
    public static final class516 method404(int arg0, int arg1, int arg2) {
        class243 var3 = class626.field8501[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3269;
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(I)Ljava/lang/String;")
    public static final String method405(int arg0) {
        ++field783;
        if (!class526.field7216 && class788.field10852 != null) {
            if ((class788.field10852.field4084 == null || class788.field10852.field4084.length() == 0) && class788.field10852.field4082 != null && ~class788.field10852.field4082.length() < -1) {
                return class788.field10852.field4082;
            } else {
                if (arg0 != -595) {
                    field782 = 97;
                }
                return class788.field10852.field4084;
            }
        } else {
            return "";
        }
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(Lwq;I)V")
    public final void method406(class179 arg0, int arg1) {
        ++field778;
        if (this.field786 == null || ~this.field777 <= ~this.field786.length) {
            this.method400(this.field777 - -5, false);
        }
        this.field786[this.field777++] = arg0;
        int var3 = 7 / ((arg1 - -15) / 45);
        this.field780 = null;
    }

    @OriginalMember(owner = "client!hka", name = "<init>", descriptor = "(Ljp;)V")
    public class56(class376 arg0) {
        this.method401(arg0, (byte) 125);
    }
}
