import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class412 extends class436 implements class237 {

    @OriginalMember(owner = "client!tm", name = "W", descriptor = "Z")
    private boolean field5643 = false;

    @OriginalMember(owner = "client!tm", name = "P", descriptor = "Lvw;")
    public class322 field5636;

    @OriginalMember(owner = "client!tm", name = "Y", descriptor = "Z")
    private boolean field5645;

    @OriginalMember(owner = "client!tm", name = "O", descriptor = "I")
    public static int field5635 = 503;

    @OriginalMember(owner = "client!tm", name = "ib", descriptor = "I")
    public static int field5655 = -1;

    @OriginalMember(owner = "client!tm", name = "H", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!tm", name = "I", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!tm", name = "J", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!tm", name = "K", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!tm", name = "L", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!tm", name = "M", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!tm", name = "N", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!tm", name = "Q", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!tm", name = "R", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!tm", name = "S", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!tm", name = "T", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!tm", name = "U", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!tm", name = "V", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!tm", name = "X", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!tm", name = "Z", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!tm", name = "bb", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!tm", name = "cb", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!tm", name = "db", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!tm", name = "eb", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!tm", name = "fb", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!tm", name = "gb", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!tm", name = "hb", descriptor = "I")
    public static int field5654;

    @OriginalMember(owner = "client!tm", name = "ab", descriptor = "Ldg;")
    private class435 field5647;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(Lha;B)Ldg;")
    public final class435 method894(class66 arg0, byte arg1) {
        ++field5631;
        return arg1 > -38 ? null : this.field5647;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V")
    public final void method1037(int arg0) {
        if (arg0 == -1114) {
            ++field5642;
        }
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)V")
    public final void method905(int arg0) {
        ++field5634;
        if (arg0 != -16665) {
            this.method898((byte) -117, (class66) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lha;B)V")
    public final void method1040(class66 arg0, byte arg1) {
        if (arg1 != 55) {
            this.method901((byte) 12, (class66) null);
        }
        ++field5633;
        this.field5636.method2046(arg0, (byte) -67);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BLha;)V")
    public final void method901(byte arg0, class66 arg1) {
        ++field5630;
        if (arg0 <= 114) {
            field5655 = 119;
        }
        class499 var3 = this.field5636.method2053(arg1, true, 2, true, 262144);
        if (var3 != null) {
            int var4 = super.field7396 >> 9;
            int var5 = super.field7398 >> 9;
            class650 var6 = arg1.method533();
            var6.method1868(super.field7396, super.field7405, super.field7398);
            this.field5636.method2043(var4, arg1, var3, var6, false, var5, var5, var4, true);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BLdja;)V")
    public final void method2440(byte arg0, class326 arg1) {
        ++field5629;
        if (arg0 > -44) {
            this.method2440((byte) 4, (class326) null);
        }
        this.field5636.method2045(-1, arg1);
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lha;Lij;IIIIIZII)V")
    public class412(class66 arg0, class445 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field6075);
        this.field5636 = new class322(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
        this.field5645 = arg1.field6050 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "(I)I")
    public final int method907(int arg0) {
        ++field5632;
        return arg0 != -20425 ? -27 : this.field5636.method2048(true);
    }

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "(I)Z")
    public final boolean method904(int arg0) {
        ++field5644;
        return arg0 != 0;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(Z)Z")
    public final boolean method910(boolean arg0) {
        ++field5637;
        if (arg0) {
            this.field5643 = false;
        }
        return this.field5643;
    }

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "(I)I")
    public final int method900(int arg0) {
        ++field5652;
        if (arg0 != 0) {
            this.method1033(-93);
        }
        return this.field5636.method2049(3162);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)I")
    public final int method1032(boolean arg0) {
        ++field5641;
        if (arg0) {
            this.method910(false);
        }
        return this.field5636.field4396;
    }

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "(I)Z")
    public final boolean method902(int arg0) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field5628;
            return false;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lha;Lcn;IIBZI)V")
    public final void method903(class66 arg0, class543 arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6) {
        if (arg4 > 41) {
            ++field5639;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(BLha;)Lhga;")
    public final class186 method898(byte arg0, class66 arg1) {
        ++field5650;
        class499 var3 = this.field5636.method2053(arg1, true, 2, false, 2048);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 <= 123) {
                this.method908((class66) null, 12, -11, -54);
            }
            class650 var4 = arg1.method533();
            var4.method1868(super.field7396, super.field7405, super.field7398);
            class186 var5 = class174.method1320(1, this.field5645, 17832);
            int var6 = super.field7396 >> 9;
            int var7 = super.field7398 >> 9;
            this.field5636.method2043(var6, arg1, var3, var4, true, var7, var7, var6, true);
            if (!class507.field6967) {
                var3.method301(var4, var5.field2877[0], 0);
            } else {
                var3.method310(var4, var5.field2877[0], class90.field1369, 0);
            }
            if (this.field5636.field4381 != null) {
                class442 var8 = this.field5636.field4381.method4299();
                if (!class507.field6967) {
                    arg1.method478(var8);
                } else {
                    arg1.method474(var8, class90.field1369);
                }
            }
            this.field5643 = var3.method327() || this.field5636.field4381 != null;
            if (this.field5647 == null) {
                this.field5647 = class538.method3042(super.field7398, super.field7396, (byte) -47, var3, super.field7405);
            } else {
                class651.method3647(-31546, super.field7396, super.field7398, var3, this.field5647, super.field7405);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)I")
    public final int method1034(int arg0) {
        ++field5651;
        if (arg0 > -125) {
            this.field5643 = false;
        }
        return this.field5636.field4397;
    }

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "(I)V")
    public static final void method2441(int arg0) {
        if (!class618.method3488(class753.field10398, arg0 + -31456) && !class263.method1720(class753.field10398, 0)) {
            int var1 = class235.field3379.field5304[0] >> 3;
            int var2 = class235.field3379.field5308[0] >> 3;
            if (var1 >= 0 && ~(class483.field6515 >> 3) < ~var1 && ~var2 <= -1 && var2 < class65.field926 >> 3) {
                class54.method398(var1, 124, 5000, var2);
            } else {
                class54.method398(class483.field6515 >> 4, 55, 0, class65.field926 >> 4);
            }
        } else {
            class54.method398(class733.field10131 >> 12, 56, 5000, class450.field6172 >> 12);
        }
        ++field5649;
        class715.method3978(arg0 + -31459);
        class518.method2953((byte) -26);
        class210.method1475(true);
        class789.method4308(true);
        if (arg0 != 31460) {
            field5654 = 67;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method908(class66 arg0, int arg1, int arg2, int arg3) {
        ++field5648;
        class499 var5 = this.field5636.method2053(arg0, false, 2, false, arg2);
        if (var5 == null) {
            return false;
        } else {
            class650 var6 = arg0.method533();
            var6.method1868(super.field7396, super.field7405, super.field7398);
            return !class507.field6967 ? var5.method290(arg1, arg3, var6, false, 0) : var5.method286(arg1, arg3, var6, false, 0, class90.field1369);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)Z")
    public final boolean method1036(byte arg0) {
        if (arg0 > -44) {
            this.field5647 = null;
        }
        ++field5646;
        return this.field5636.method2051(-110);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lha;I)V")
    public final void method1039(class66 arg0, int arg1) {
        if (arg1 > 81) {
            ++field5653;
            this.field5636.method2044((byte) 126, arg0);
        }
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)I")
    public final int method1033(int arg0) {
        ++field5640;
        if (arg0 > -12) {
            this.method907(1);
        }
        return this.field5636.field4418;
    }
}
