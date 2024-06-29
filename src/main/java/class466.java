import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sja")
public class class466 extends class571 implements class675 {

    @OriginalMember(owner = "client!sja", name = "T", descriptor = "Z")
    private boolean field6790 = true;

    @OriginalMember(owner = "client!sja", name = "K", descriptor = "Lmu;")
    public class365 field6792;

    @OriginalMember(owner = "client!sja", name = "V", descriptor = "Z")
    private boolean field6785;

    @OriginalMember(owner = "client!sja", name = "U", descriptor = "[Ljava/lang/String;")
    private static final String[] field6808 = new String[] { method3586(method3585("Z@ \u0011\u001f\u0001")), method3586(method3585("Z@ \u0011\u0012\u0001")), method3586(method3585("Z@ \u0011\r\u0001")), method3586(method3585("G_-S")), method3586(method3585("R\u0004o\u0011$")), method3586(method3585("Z@ \u0011\u001c\u0001")), method3586(method3585("Z@ \u0011\u001bh\u0002")), method3586(method3585("Z@ \u0011\u0018\u0001")), method3586(method3585("Z@ \u0011e@D(Kg\u0001")), method3586(method3585("Z@ \u0011\u001d\u0001")), method3586(method3585("Z@ \u0011\u001dh\u0002")), method3586(method3585("Z@ \u0011\u0011\u0001")), method3586(method3585("Z@ \u0011\u001ah\u0002")), method3586(method3585("Z@ \u0011\u001e\u0001")), method3586(method3585("Z@ \u0011\t\u0001")), method3586(method3585("Z@ \u0011\u0017\u0001")), method3586(method3585("Z@ \u0011\u001a\u0001")), method3586(method3585("Z@ \u0011\u0014\u0001")), method3586(method3585("Z@ \u0011\u0013\u0001")), method3586(method3585("Z@ \u0011\u001b\u0001")), method3586(method3585("Z@ \u0011\u000f\u0001")), method3586(method3585("Z@ \u0011\u0016\u0001")), method3586(method3585("Z@ \u0011\u0010\u0001")) };

    @OriginalMember(owner = "client!sja", name = "Q", descriptor = "Lsb;")
    public static class261 field6783 = new class261(16, 28);

    @OriginalMember(owner = "client!sja", name = "G", descriptor = "I")
    public static int field6807 = -1;

    @OriginalMember(owner = "client!sja", name = "Y", descriptor = "I")
    public static int field6784;

    @OriginalMember(owner = "client!sja", name = "X", descriptor = "I")
    public static int field6786;

    @OriginalMember(owner = "client!sja", name = "J", descriptor = "I")
    public static int field6787;

    @OriginalMember(owner = "client!sja", name = "S", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!sja", name = "R", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!sja", name = "eb", descriptor = "I")
    public static int field6791;

    @OriginalMember(owner = "client!sja", name = "M", descriptor = "I")
    public static int field6793;

    @OriginalMember(owner = "client!sja", name = "cb", descriptor = "I")
    public static int field6794;

    @OriginalMember(owner = "client!sja", name = "bb", descriptor = "I")
    public static int field6795;

    @OriginalMember(owner = "client!sja", name = "I", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!sja", name = "L", descriptor = "I")
    public static int field6797;

    @OriginalMember(owner = "client!sja", name = "N", descriptor = "I")
    public static int field6798;

    @OriginalMember(owner = "client!sja", name = "O", descriptor = "I")
    public static int field6799;

    @OriginalMember(owner = "client!sja", name = "P", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!sja", name = "H", descriptor = "I")
    public static int field6801;

    @OriginalMember(owner = "client!sja", name = "W", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!sja", name = "Z", descriptor = "I")
    public static int field6803;

    @OriginalMember(owner = "client!sja", name = "ab", descriptor = "I")
    public static int field6804;

    @OriginalMember(owner = "client!sja", name = "db", descriptor = "I")
    public static int field6805;

    @OriginalMember(owner = "client!sja", name = "fb", descriptor = "Lsba;")
    private class311 field6806;

    @OriginalMember(owner = "client!sja", name = "c", descriptor = "(I)I")
    public final int method572(int arg0) {
        try {
            ++field6794;
            return arg0 < 70 ? 71 : this.field6792.field5318;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6808[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(ZLha;)V")
    public final void method589(boolean arg0, class18 arg1) {
        try {
            if (!arg0) {
                this.field6792.method2907(262144, arg1);
                ++field6798;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6808[15] + arg0 + ',' + (arg1 != null ? field6808[4] : field6808[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(Lha;B)Lsba;")
    public final class311 method587(class18 arg0, byte arg1) {
        try {
            ++field6800;
            if (arg1 <= 94) {
                field6807 = 34;
            }
            return this.field6806;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6808[14] + (arg0 != null ? field6808[4] : field6808[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "b", descriptor = "(I)I")
    public final int method585(int arg0) {
        try {
            if (arg0 != -20175) {
                this.method579(true);
            }
            ++field6805;
            return this.field6792.field5290;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6808[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(ILao;)V")
    public final void method3583(int arg0, class626 arg1) {
        try {
            ++field6793;
            if (arg0 == -903) {
                this.field6792.method2900(-106, arg1);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6808[11] + arg0 + ',' + (arg1 != null ? field6808[4] : field6808[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method580(class18 arg0, int arg1, int arg2, int arg3) {
        try {
            ++field6802;
            class761 var5 = this.field6792.method2903(131072, arg0, false, false, (byte) -61);
            if (arg2 != -1) {
                this.field6785 = true;
            }
            if (var5 == null) {
                return false;
            } else {
                class104 var6 = arg0.method136();
                var6.method739(super.field2969, super.field2975, super.field2984);
                return !class149.field1902 ? var5.method382(arg3, arg1, var6, false, 0) : var5.method440(arg3, arg1, var6, false, 0, class194.field2686);
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field6808[7] + (arg0 != null ? field6808[4] : field6808[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(Z)I")
    public final int method584(boolean arg0) {
        try {
            ++field6789;
            if (arg0) {
                method3584(27);
            }
            return this.field6792.field5310;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6808[22] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "d", descriptor = "(Z)Z")
    public final boolean method579(boolean arg0) {
        try {
            if (arg0) {
                this.method590(103);
            }
            ++field6799;
            return this.field6790;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6808[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "b", descriptor = "(Z)V")
    public final void method576(boolean arg0) {
        try {
            ++field6787;
            if (!arg0) {
                this.field6792 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6808[21] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "c", descriptor = "(Z)I")
    public final int method575(boolean arg0) {
        try {
            ++field6786;
            if (arg0) {
                this.method46(70);
            }
            return this.field6792.method2911(-79);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6808[20] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "g", descriptor = "(I)Z")
    public final boolean method46(int arg0) {
        try {
            if (arg0 >= -97) {
                this.method579(false);
            }
            ++field6784;
            return false;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6808[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "b", descriptor = "(ZLha;)Lrs;")
    public final class297 method573(boolean arg0, class18 arg1) {
        try {
            ++field6803;
            class761 var3 = this.field6792.method2903(2048, arg1, arg0, true, (byte) -116);
            if (var3 == null) {
                return null;
            } else {
                class104 var4 = arg1.method136();
                var4.method739(super.field2969, super.field2975, super.field2984);
                class297 var5 = class674.method4839(this.field6785, 1, 12853);
                int var6 = super.field2969 >> 9;
                int var7 = super.field2984 >> 9;
                this.field6792.method2909(var6, var3, 0, var6, var7, arg1, true, var7, var4);
                if (!class149.field1902) {
                    var3.method415(var4, var5.field4153[0], 0);
                } else {
                    var3.method427(var4, var5.field4153[0], class194.field2686, 0);
                }
                if (this.field6792.field5312 != null) {
                    class788 var8 = this.field6792.field5312.method3565();
                    if (class149.field1902) {
                        arg1.method193(var8, class194.field2686);
                    } else {
                        arg1.method126(var8);
                    }
                }
                this.field6790 = var3.method422() || this.field6792.field5312 != null;
                if (this.field6806 == null) {
                    this.field6806 = class640.method4679(super.field2969, super.field2984, super.field2975, var3, 10327);
                } else {
                    class345.method2767(this.field6806, super.field2984, super.field2969, -127, var3, super.field2975);
                }
                return var5;
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field6808[16] + arg0 + ',' + (arg1 != null ? field6808[4] : field6808[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "e", descriptor = "(Z)Z")
    public final boolean method582(boolean arg0) {
        try {
            ++field6791;
            if (arg0) {
                field6783 = null;
            }
            return false;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6808[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "h", descriptor = "(I)V")
    public static void method3584(int arg0) {
        try {
            if (arg0 != -8137) {
                method3584(43);
            }
            field6783 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6808[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(Lha;I)V")
    public final void method586(class18 arg0, int arg1) {
        try {
            ++field6797;
            class761 var3 = this.field6792.method2903(262144, arg0, true, true, (byte) -77);
            if (arg1 != 0) {
                this.method581(117, (class18) null);
            }
            if (var3 != null) {
                int var4 = super.field2969 >> 9;
                int var5 = super.field2984 >> 9;
                class104 var6 = arg0.method136();
                var6.method739(super.field2969, super.field2975, super.field2984);
                this.field6792.method2909(var4, var3, 0, var4, var5, arg0, false, var5, var6);
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field6808[2] + (arg0 != null ? field6808[4] : field6808[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(IBILrfa;ZILha;)V")
    public final void method40(int arg0, byte arg1, int arg2, class202 arg3, boolean arg4, int arg5, class18 arg6) {
        try {
            int var8 = -82 / ((arg1 - 9) / 35);
            ++field6804;
            throw new IllegalStateException();
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field6808[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6808[4] : field6808[3]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field6808[4] : field6808[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "d", descriptor = "(B)V")
    public final void method44(byte arg0) {
        try {
            ++field6795;
            if (arg0 < 111) {
                this.method40(-122, (byte) 59, -34, (class202) null, false, 58, (class18) null);
            }
            throw new IllegalStateException();
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6808[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "c", descriptor = "(B)I")
    public final int method578(byte arg0) {
        try {
            ++field6788;
            return arg0 != 114 ? 38 : this.field6792.method2905(104);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6808[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(ILha;)V")
    public final void method581(int arg0, class18 arg1) {
        try {
            if (arg0 != -18864) {
                method3584(-82);
            }
            this.field6792.method2908(arg0 ^ -18860, arg1);
            ++field6796;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6808[5] + arg0 + ',' + (arg1 != null ? field6808[4] : field6808[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "<init>", descriptor = "(Lha;Lfw;IIIIIZIII)V")
    public class466(class18 arg0, class789 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class142.method1228(false, arg8, arg9));
        try {
            this.field6792 = new class365(arg0, arg1, arg8, arg9, super.field2981, arg3, this, arg7, arg10);
            this.field6785 = arg1.field11409 != 0 && !arg7;
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field6808[8] + (arg0 != null ? field6808[4] : field6808[3]) + ',' + (arg1 != null ? field6808[4] : field6808[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(I)Z")
    public final boolean method590(int arg0) {
        try {
            if (arg0 < 96) {
                return false;
            } else {
                ++field6801;
                return this.field6792.method2902((byte) 86);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6808[17] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3585(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 89);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3586(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 41;
                    break;
                case 1:
                    var10005 = 42;
                    break;
                case 2:
                    var10005 = 65;
                    break;
                case 3:
                    var10005 = 63;
                    break;
                default:
                    var10005 = 89;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
