import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class375 extends class125 implements class518 {

    @OriginalMember(owner = "client!nh", name = "V", descriptor = "Z")
    private boolean field5857;

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "Z")
    private boolean field5845;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "S")
    private short field5833;

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "B")
    private byte field5853;

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "Z")
    private boolean field5839;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "B")
    private byte field5835;

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "Z")
    private boolean field5838;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "Le;")
    private class530 field5834;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "Li;")
    private class515 field5836;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "[[Z")
    public static boolean[][] field5832 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "F")
    public static float field5849;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
    public static int field5829;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    public static int field5830;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!nh", name = "S", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!nh", name = "T", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!nh", name = "U", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)I", line = 3)
    public final int method38(int arg0) {
        if (arg0 != 5638) {
            return 127;
        } else {
            ++field5829;
            return this.field5853;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)I", line = 14)
    public final int method29(int arg0) {
        ++field5840;
        int var2 = 84 % ((arg0 - 40) / 52);
        return 22;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(BLza;)V", line = 29)
    public final void method43(byte arg0, class491 arg1) {
        ++field5844;
        if (arg0 != 35) {
            this.field5838 = false;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lza;IZI)Ljl;", line = 39)
    private final class489 method2385(class491 arg0, int arg1, boolean arg2, int arg3) {
        ++field5850;
        if (arg3 != 0) {
            return null;
        } else {
            class39 var5 = class61.field928.method791(65535 & this.field5833, true);
            class220 var6;
            class220 var7;
            if (!this.field5839) {
                if (this.field5835 < 3) {
                    var6 = class511.field7488[this.field5835 + 1];
                } else {
                    var6 = null;
                }
                var7 = class511.field7488[this.field5835];
            } else {
                var7 = class320.field5039[this.field5835];
                var6 = class511.field7488[0];
            }
            return var5.method298(arg0, super.field2172, var7, super.field2170, arg2, arg1, 22, super.field2180, var6, this.field5853, 7280);
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lza;Lp;IIIIZIZ)V", line = 75)
    public class375(class491 arg0, class39 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field649, arg1.field664, arg1.field603);
        super.field2172 = arg3;
        this.field5857 = ~arg1.field618 != -1 && !arg6;
        this.field5845 = arg8;
        this.field5833 = (short) arg1.field587;
        super.field2170 = arg5;
        this.field5853 = (byte) arg7;
        this.field5839 = arg6;
        this.field5835 = (byte) arg2;
        this.field5838 = arg0.method841() && arg1.field655 && !this.field5839 && ~class510.field7403.method2041(-12, class511.field7485) != -1;
        int var10 = 2048;
        if (this.field5845) {
            var10 |= 65536;
        }
        class489 var11 = this.method2385(arg0, var10, this.field5838, 0);
        if (var11 != null) {
            this.field5834 = var11.field7150;
            this.field5836 = var11.field7152;
            if (this.field5845) {
                this.field5834 = this.field5834.method739((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)V", line = 109)
    public final void method36(boolean arg0) {
        ++field5841;
        this.field5845 = arg0;
        if (this.field5834 != null) {
            this.field5834.method762(this.field5834.method741() & -65537);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILza;I)Le;", line = 122)
    public final class530 method32(int arg0, class491 arg1, int arg2) {
        ++field5847;
        int var4 = 79 % ((arg2 - -24) / 60);
        return this.method2387(0, arg0, arg1);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)V", line = 134)
    public static final void method2386(int arg0, int arg1) {
        class125.field2176 = arg0;
        ++field5842;
        int var2 = 100 % ((arg1 - -9) / 63);
        class530.field7787.method1604(4);
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V", line = 147)
    public final void method31(int arg0) {
        ++field5852;
        if (this.field5834 != null) {
            this.field5834.method743();
        }
        int var2 = 32 % ((arg0 - 57) / 48);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)Z", line = 159)
    public final boolean method33(byte arg0) {
        ++field5843;
        int var2 = 99 % ((8 - arg0) / 45);
        return this.field5838;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILza;)Le;", line = 170)
    private final class530 method2387(int arg0, int arg1, class491 arg2) {
        ++field5855;
        if (this.field5834 != null && arg2.method902(this.field5834.method741(), arg1) == 0) {
            return this.field5834;
        } else {
            class489 var4 = this.method2385(arg2, arg1, false, arg0);
            return var4 == null ? null : var4.field7150;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILza;IILvl;Z)V", line = 188)
    public final void method39(int arg0, int arg1, class491 arg2, int arg3, int arg4, class243 arg5, boolean arg6) {
        if (arg0 == 0) {
            if (arg5 instanceof class375) {
                class375 var8 = (class375) arg5;
                if (this.field5834 != null && var8.field5834 != null) {
                    this.field5834.method772(var8.field5834, arg1, arg4, arg3, arg6);
                }
            }
            ++field5851;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)I", line = 211)
    public final int method28(byte arg0) {
        if (arg0 != -118) {
            this.field5839 = false;
        }
        ++field5831;
        return this.field5833 & 65535;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)Z", line = 226)
    public final boolean method42(boolean arg0) {
        ++field5856;
        return arg0 ? false : this.field5845;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILza;)V", line = 237)
    public final void method34(int arg0, class491 arg1) {
        ++field5854;
        Object var3 = null;
        class515 var5;
        if (this.field5836 == null && this.field5838) {
            class489 var4 = this.method2385(arg1, 262144, true, 0);
            var5 = var4 != null ? var4.field7152 : null;
        } else {
            var5 = this.field5836;
            this.field5836 = null;
        }
        if (arg0 != 25747) {
            this.field5853 = 105;
        }
        if (var5 != null) {
            class335.method2114(var5, this.field5835, super.field2172, super.field2170, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(ILza;)Lsr;", line = 264)
    public final class430 method40(int arg0, class491 arg1) {
        ++field5830;
        if (this.field5834 == null) {
            return null;
        } else {
            class202 var3 = arg1.method820();
            var3.method1246(super.field2172, super.field2180, super.field2170);
            class430 var4 = null;
            if (this.field5857) {
                var4 = class21.method111((byte) -5, 1);
            }
            if (arg0 >= -24) {
                this.field5836 = null;
            }
            this.field5834.method736(var3, var4 == null ? null : var4.field6447[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lza;III)Z", line = 290)
    public final boolean method27(class491 arg0, int arg1, int arg2, int arg3) {
        ++field5846;
        if (arg1 < 121) {
            return false;
        } else {
            class530 var5 = this.method2387(0, 131072, arg0);
            if (var5 != null) {
                class202 var6 = arg0.method820();
                var6.method1246(super.field2172, super.field2180, super.field2170);
                return var5.method776(arg3, arg2, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)V", line = 317)
    public static void method2388(byte arg0) {
        if (arg0 == 65) {
            field5832 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLza;)V", line = 327)
    public final void method26(byte arg0, class491 arg1) {
        ++field5848;
        Object var3 = null;
        class515 var5;
        if (this.field5836 == null && this.field5838) {
            class489 var4 = this.method2385(arg1, 262144, true, 0);
            var5 = var4 == null ? null : var4.field7152;
        } else {
            var5 = this.field5836;
            this.field5836 = null;
        }
        if (arg0 == 111) {
            if (var5 != null) {
                class219.method1506(var5, this.field5835, super.field2172, super.field2170, (boolean[]) null);
            }
        }
    }
}
