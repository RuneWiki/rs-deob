import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class435 extends class649 implements class624 {

    @OriginalMember(owner = "client!uba", name = "M", descriptor = "Z")
    private boolean field5981 = false;

    @OriginalMember(owner = "client!uba", name = "ib", descriptor = "Ljh;")
    public class161 field6002;

    @OriginalMember(owner = "client!uba", name = "S", descriptor = "Z")
    private boolean field5986;

    @OriginalMember(owner = "client!uba", name = "V", descriptor = "Lkaa;")
    public static class47 field5989 = new class47(54, -1);

    @OriginalMember(owner = "client!uba", name = "L", descriptor = "I")
    public static int field5980;

    @OriginalMember(owner = "client!uba", name = "N", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!uba", name = "O", descriptor = "I")
    public static int field5983;

    @OriginalMember(owner = "client!uba", name = "P", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!uba", name = "T", descriptor = "I")
    public static int field5987;

    @OriginalMember(owner = "client!uba", name = "U", descriptor = "I")
    public static int field5988;

    @OriginalMember(owner = "client!uba", name = "W", descriptor = "I")
    public static int field5990;

    @OriginalMember(owner = "client!uba", name = "X", descriptor = "I")
    public static int field5991;

    @OriginalMember(owner = "client!uba", name = "Y", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!uba", name = "Z", descriptor = "I")
    public static int field5993;

    @OriginalMember(owner = "client!uba", name = "ab", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!uba", name = "bb", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!uba", name = "cb", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!uba", name = "db", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!uba", name = "eb", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!uba", name = "fb", descriptor = "I")
    public static int field5999;

    @OriginalMember(owner = "client!uba", name = "gb", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!uba", name = "hb", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!uba", name = "jb", descriptor = "I")
    public static int field6003;

    @OriginalMember(owner = "client!uba", name = "kb", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!uba", name = "lb", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!uba", name = "mb", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!uba", name = "nb", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!uba", name = "Q", descriptor = "Lck;")
    private class642 field5985;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Lha;IIB)Z", line = 3)
    public final boolean method790(class59 arg0, int arg1, int arg2, byte arg3) {
        ++field5987;
        class475 var5 = this.field6002.method1152(arg0, false, 131072, arg3 + -21488, false);
        if (var5 == null) {
            return false;
        } else {
            if (arg3 != 103) {
                method2504(-49, 82, 82);
            }
            class333 var6 = arg0.method451();
            var6.method1727(super.field3505, super.field3510, super.field3502);
            return !class540.field7159 ? var5.method158(arg2, arg1, var6, false, 0) : var5.method203(arg2, arg1, var6, false, 0, class100.field1358);
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(ZLha;)V", line = 24)
    public final void method1756(boolean arg0, class59 arg1) {
        this.field6002.method1159((byte) 39, arg1);
        ++field5999;
        if (!arg0) {
            this.field5986 = false;
        }
    }

    @OriginalMember(owner = "client!uba", name = "g", descriptor = "(I)V", line = 36)
    public final void method803(int arg0) {
        if (arg0 == 131072) {
            ++field5993;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Lkf;Lha;IIIZI)V", line = 47)
    public final void method807(class256 arg0, class59 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        ++field6005;
        if (arg3 >= 109) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!uba", name = "g", descriptor = "(B)Z", line = 59)
    public final boolean method806(byte arg0) {
        ++field6004;
        int var2 = 49 / ((arg0 - 14) / 57);
        return false;
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(B)I", line = 70)
    public final int method1752(byte arg0) {
        ++field5998;
        return arg0 != -111 ? -39 : this.field6002.field2437;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(BIIZFIIII)[[I", line = 84)
    public static final int[][] method2499(byte arg0, int arg1, int arg2, boolean arg3, float arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field5983;
        int[][] var9 = new int[arg7][arg1];
        class684 var10 = new class684();
        var10.field9544 = arg3;
        var10.field9556 = arg2;
        var10.field9550 = (int) (arg4 * 4096.0F);
        var10.field9548 = arg6;
        var10.field9547 = arg5;
        var10.method108(arg0 + 8432);
        class626.method3443(arg7, false, arg1);
        int var11 = 0;
        if (arg0 != -81) {
            field5989 = null;
        }
        while (var11 < arg7) {
            var10.method3855((byte) 100, var11, var9[var11]);
            ++var11;
        }
        return var9;
    }

    @OriginalMember(owner = "client!uba", name = "h", descriptor = "(I)I", line = 115)
    public final int method789(int arg0) {
        if (arg0 != -32768) {
            this.method1758(-108, (class59) null);
        }
        ++field6007;
        return this.field6002.method1154(1);
    }

    @OriginalMember(owner = "client!uba", name = "i", descriptor = "(B)V", line = 129)
    public static void method2500(byte arg0) {
        if (arg0 == -47) {
            field5989 = null;
        }
    }

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(Lha;Lqfa;IIIIIZIII)V", line = 139)
    public class435(class59 arg0, class100 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class675.method3758((byte) 112, arg8, arg9));
        this.field6002 = new class161(arg0, arg1, arg8, arg9, super.field3508, arg3, this, arg7, arg10);
        this.field5986 = ~arg1.field1363 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!uba", name = "e", descriptor = "(B)I", line = 148)
    public final int method791(byte arg0) {
        ++field5995;
        if (arg0 <= 81) {
            this.method808((byte) 112, (class59) null);
        }
        return this.field6002.method1150(-1);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(B)I", line = 159)
    public final int method1759(byte arg0) {
        if (arg0 < 63) {
            this.field6002 = null;
        }
        ++field5997;
        return this.field6002.field2404;
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(ILha;)Lww;", line = 177)
    public final class733 method800(int arg0, class59 arg1) {
        ++field6006;
        if (arg0 != -1) {
            this.field5986 = false;
        }
        class475 var3 = this.field6002.method1152(arg1, true, 2048, arg0 ^ 21384, false);
        if (var3 == null) {
            return null;
        } else {
            class333 var4 = arg1.method451();
            var4.method1727(super.field3505, super.field3510, super.field3502);
            class733 var5 = class397.method2338(this.field5986, (byte) 122, 1);
            int var6 = super.field3505 >> 9;
            int var7 = super.field3502 >> 9;
            this.field6002.method1160(false, var7, var4, var6, var3, arg1, var6, var7, true);
            if (!class540.field7159) {
                var3.method155(var4, var5.field10150[0], 0);
            } else {
                var3.method160(var4, var5.field10150[0], class100.field1358, 0);
            }
            if (this.field6002.field2423 != null) {
                class388 var8 = this.field6002.field2423.method131();
                if (!class540.field7159) {
                    arg1.method508(var8);
                } else {
                    arg1.method407(var8, class100.field1358);
                }
            }
            this.field5981 = var3.method159() || this.field6002.field2423 != null;
            if (this.field5985 != null) {
                class735.method4107(this.field5985, super.field3510, var3, super.field3502, arg0 ^ 80, super.field3505);
            } else {
                this.field5985 = class549.method3072(super.field3502, super.field3505, super.field3510, 544, var3);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(ILha;)V", line = 228)
    public final void method1758(int arg0, class59 arg1) {
        this.field6002.method1148(arg1, arg0 ^ 22943);
        ++field5980;
        if (arg0 != 6120) {
            this.field5986 = true;
        }
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(III)Z", line = 241)
    public static final boolean method2501(int arg0, int arg1, int arg2) {
        ++field5990;
        if (arg2 != 33) {
            return false;
        } else {
            return (arg0 & 33) != 0;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Lha;B)V", line = 252)
    public final void method792(class59 arg0, byte arg1) {
        ++field5984;
        class475 var3 = this.field6002.method1152(arg0, true, 262144, -21385, true);
        if (var3 != null) {
            int var4 = super.field3505 >> 9;
            int var5 = super.field3502 >> 9;
            class333 var6 = arg0.method451();
            var6.method1727(super.field3505, super.field3510, super.field3502);
            this.field6002.method1160(false, var5, var6, var4, var3, arg0, var4, var5, false);
        }
        if (arg1 <= 121) {
            this.field5981 = true;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IB)Z", line = 281)
    public static final boolean method2502(int arg0, byte arg1) {
        ++field5994;
        if (class244.field3407[arg0]) {
            return true;
        } else if (!class575.field7550.method2202(-14491, arg0)) {
            return false;
        } else {
            int var2 = class575.field7550.method2195(arg0, 0);
            if (var2 == 0) {
                class244.field3407[arg0] = true;
                return true;
            } else {
                if (class747.field10393[arg0] == null) {
                    class747.field10393[arg0] = new class672[var2];
                }
                if (arg1 != -22) {
                    field5989 = null;
                }
                for (int var3 = 0; var3 < var2; ++var3) {
                    if (class747.field10393[arg0][var3] == null) {
                        byte[] var4 = class575.field7550.method2218((byte) 116, arg0, var3);
                        if (var4 != null) {
                            class672 var5 = class747.field10393[arg0][var3] = new class672();
                            var5.field9200 = (arg0 << 16) + var3;
                            if (var4[0] != -1) {
                                throw new IllegalStateException("if1");
                            }
                            var5.method3718(0, new class677(var4));
                        }
                    }
                }
                class244.field3407[arg0] = true;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!uba", name = "d", descriptor = "(I)Z", line = 342)
    public final boolean method798(int arg0) {
        int var2 = -20 / ((arg0 - 53) / 45);
        ++field6003;
        return false;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(BLbk;)V", line = 354)
    public final void method2503(byte arg0, class379 arg1) {
        this.field6002.method1157(arg1, 0);
        ++field5988;
        if (arg0 != 123) {
            this.method789(-68);
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Z)V", line = 366)
    public final void method1754(boolean arg0) {
        ++field6000;
        if (!arg0) {
            this.method803(-111);
        }
    }

    @OriginalMember(owner = "client!uba", name = "c", descriptor = "(B)I", line = 377)
    public final int method1757(byte arg0) {
        ++field5992;
        int var2 = 31 / ((arg0 - -57) / 53);
        return this.field6002.field2405;
    }

    @OriginalMember(owner = "client!uba", name = "c", descriptor = "(III)V", line = 389)
    public static final void method2504(int arg0, int arg1, int arg2) {
        ++field6001;
        ++class117.field1891;
        class583 var3 = class381.method2246(1, class128.field2105, class711.field9841);
        var3.field7637.method3798(27695, arg0);
        var3.field7637.method3772(arg2, -231665880);
        if (arg1 != -1) {
            field5989 = null;
        }
        class42.method309(var3, 0);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(BLha;)Lck;", line = 411)
    public final class642 method808(byte arg0, class59 arg1) {
        ++field5991;
        if (arg0 >= -86) {
            this.method2503((byte) -97, (class379) null);
        }
        return this.field5985;
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(Z)Z", line = 422)
    public final boolean method801(boolean arg0) {
        if (arg0) {
            this.field5986 = false;
        }
        ++field5982;
        return this.field5981;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)Z", line = 433)
    public final boolean method1761(int arg0) {
        if (arg0 != -28823) {
            this.method1757((byte) 28);
        }
        ++field5996;
        return this.field6002.method1151((byte) -127);
    }
}
