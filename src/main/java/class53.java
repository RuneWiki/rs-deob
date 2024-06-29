import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class53 extends class551 {

    @OriginalMember(owner = "client!ts", name = "t", descriptor = "I")
    public int field631 = 0;

    @OriginalMember(owner = "client!ts", name = "A", descriptor = "I")
    public int field638 = 12800;

    @OriginalMember(owner = "client!ts", name = "C", descriptor = "I")
    public int field640 = 0;

    @OriginalMember(owner = "client!ts", name = "F", descriptor = "Z")
    public boolean field643 = true;

    @OriginalMember(owner = "client!ts", name = "H", descriptor = "I")
    public int field645 = -1;

    @OriginalMember(owner = "client!ts", name = "K", descriptor = "I")
    public int field648 = -1;

    @OriginalMember(owner = "client!ts", name = "w", descriptor = "I")
    public int field634 = 12800;

    @OriginalMember(owner = "client!ts", name = "v", descriptor = "Ljava/lang/String;")
    public String field633;

    @OriginalMember(owner = "client!ts", name = "L", descriptor = "I")
    public int field649;

    @OriginalMember(owner = "client!ts", name = "N", descriptor = "I")
    public int field651;

    @OriginalMember(owner = "client!ts", name = "J", descriptor = "Ljava/lang/String;")
    public String field647;

    @OriginalMember(owner = "client!ts", name = "u", descriptor = "Lrk;")
    public class419 field632;

    @OriginalMember(owner = "client!ts", name = "B", descriptor = "I")
    public static int field639 = -1;

    @OriginalMember(owner = "client!ts", name = "s", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!ts", name = "x", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!ts", name = "y", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!ts", name = "z", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!ts", name = "D", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!ts", name = "E", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!ts", name = "G", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!ts", name = "I", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!ts", name = "M", descriptor = "I")
    public static int field650;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ts", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field652;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "([IIIII)Z")
    public final boolean method268(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field642++;
        if (arg3 != -26161) {
            this.method268(null, -91, 9, 34, -83);
        }
        for (class147 var6 = (class147) this.field632.method2496((byte) 95); var6 != null; var6 = (class147) this.field632.method2494(arg3 + 26244)) {
            if (var6.method868(arg4, arg2, arg1, (byte) -128)) {
                var6.method869(arg1, arg4, arg0, (byte) -74);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I[IIB)Z")
    public final boolean method269(int arg0, int[] arg1, int arg2, byte arg3) {
        field650++;
        int var5 = 57 / ((-arg3 - 33) / 43);
        for (class147 var6 = (class147) this.field632.method2496((byte) -123); var6 != null; var6 = (class147) this.field632.method2494(35)) {
            if (var6.method865(28638, arg2, arg0)) {
                var6.method867(arg1, (byte) -74, arg0, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIII[FFFIII)V")
    public static final void method270(int arg0, int arg1, int arg2, int arg3, int arg4, float[] arg5, float arg6, float arg7, int arg8, int arg9, int arg10) {
        field637++;
        int var11 = arg3 - arg8;
        int var12 = arg2 - arg4;
        int var13 = arg0 - arg1;
        float var14 = arg5[2] * (float) var12 + arg5[1] * (float) var13 + arg5[0] * (float) var11;
        float var15 = arg5[5] * (float) var12 + arg5[4] * (float) var13 + arg5[3] * (float) var11;
        float var16 = arg5[8] * (float) var12 + arg5[6] * (float) var11 + arg5[7] * (float) var13;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg6 != 1.0F) {
            var17 = arg6 * var17;
        }
        if (arg9 != -11558) {
            field635 = -3;
        }
        float var18 = var15 + arg7 + 0.5F;
        if (arg10 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg10 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg10 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class238.field3477 = var18;
        class234.field3444 = var17;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method271(byte arg0, String arg1) {
        field630++;
        return arg0 > -60 ? true : class102.method590(106, arg1, field652 == null ? (field652 = method276("cn")) : field652);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(BII)Z")
    public final boolean method272(byte arg0, int arg1, int arg2) {
        field641++;
        int var4 = 35 / ((arg0 + 60) / 59);
        for (class147 var5 = (class147) this.field632.method2496((byte) -98); var5 != null; var5 = (class147) this.field632.method2494(54)) {
            if (var5.method870(arg1, arg2, 2)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(JI)V")
    public static final void method273(long arg0, int arg1) {
        field644++;
        int var3 = class293.field4306;
        if (class541.field8103 != var3) {
            int var4 = var3 - class541.field8103;
            int var5 = (int) ((long) var4 * arg0 / 320L);
            if (var4 <= 0) {
                if (var5 == 0) {
                    var5 = -1;
                } else if (var5 < var4) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = 1;
            } else if (var4 < var5) {
                var5 = var4;
            }
            class541.field8103 += var5;
        }
        int var6 = class392.field5713;
        if (arg1 < 37) {
            field635 = -101;
        }
        if (!class94.field1158.field301) {
            class578.field8523 += (float) arg0 * class203.field3025 / 40.0F * 8.0F;
            class591.field8752 += (float) arg0 * class74.field860 / 40.0F * 8.0F;
        }
        if (class300.field4403 != var6) {
            int var7 = var6 - class300.field4403;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class300.field4403 += var8;
        }
        class437.method2680(19950);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "([IIII)Z")
    public final boolean method274(int[] arg0, int arg1, int arg2, int arg3) {
        field636++;
        class147 var5 = (class147) this.field632.method2496((byte) 52);
        if (arg3 > -30) {
            return false;
        }
        while (var5 != null) {
            if (var5.method870(arg2, arg1, 2)) {
                var5.method869(arg2, arg1, arg0, (byte) -74);
                return true;
            }
            var5 = (class147) this.field632.method2494(42);
        }
        return false;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
    public final void method275(byte arg0) {
        this.field638 = 12800;
        this.field640 = 0;
        this.field631 = 0;
        field646++;
        if (arg0 <= 57) {
            return;
        }
        this.field634 = 12800;
        for (class147 var2 = (class147) this.field632.method2496((byte) -115); var2 != null; var2 = (class147) this.field632.method2494(44)) {
            if (var2.field1886 < this.field638) {
                this.field638 = var2.field1886;
            }
            if (this.field634 > var2.field1897) {
                this.field634 = var2.field1897;
            }
            if (var2.field1895 > this.field631) {
                this.field631 = var2.field1895;
            }
            if (this.field640 < var2.field1892) {
                this.field640 = var2.field1892;
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class53(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field648 = arg6;
        this.field633 = arg2;
        this.field649 = arg3;
        this.field643 = arg5;
        this.field651 = arg0;
        this.field645 = arg4;
        this.field647 = arg1;
        if (this.field648 == 255) {
            this.field648 = 0;
        }
        this.field632 = new class419();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method276(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
