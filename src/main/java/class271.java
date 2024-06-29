import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class271 extends class438 implements class3 {

    @OriginalMember(owner = "client!uk", name = "ab", descriptor = "Z")
    private boolean field4359 = false;

    @OriginalMember(owner = "client!uk", name = "db", descriptor = "Lmca;")
    public class30 field4369;

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "Z")
    private boolean field4354;

    @OriginalMember(owner = "client!uk", name = "hb", descriptor = "[Ljava/lang/String;")
    private static final String[] field4375 = new String[] { method2341(method2340("'Rv/")), method2341(method2340("<L4\u0001Ha")), method2341(method2340("2\t4mt")), method2341(method2340("<L4\t!")), method2341(method2340("<L4\u000e!")), method2341(method2340("<L4\u0000Ha")), method2341(method2340("<L4\u0015!")), method2341(method2340("<L4\u0002Ha")), method2341(method2340("<L4\b!")), method2341(method2340("<L4\u0000!")), method2341(method2340("<L4\u007f`'Nn}!")), method2341(method2340("<L4\u0005!")), method2341(method2340("<L4\u000f!")), method2341(method2340("<L4\u0004!")), method2341(method2340("<L4\u0006Ha")), method2341(method2340("<L4\r!")), method2341(method2340("<L4\u0012!")), method2341(method2340("<L4\u0007Ha")), method2341(method2340("<L4\u000b!")), method2341(method2340("<L4\n!")) };

    @OriginalMember(owner = "client!uk", name = "X", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!uk", name = "cb", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!uk", name = "bb", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!uk", name = "S", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!uk", name = "Y", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!uk", name = "R", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!uk", name = "Z", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!uk", name = "V", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!uk", name = "W", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!uk", name = "fb", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!uk", name = "eb", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!uk", name = "gb", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!uk", name = "U", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!uk", name = "T", descriptor = "Lrga;")
    private class250 field4361;

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lha;Ltk;IIIIIZIIIII)V")
    public class271(class63 arg0, class362 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        try {
            this.field4369 = new class30(arg0, arg1, arg10, arg11, super.field9975, arg3, this, arg7, arg12);
            this.field4354 = arg1.field5843 != 0 && !arg7;
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field4375[10] + (arg0 != null ? field4375[2] : field4375[0]) + ',' + (arg1 != null ? field4375[2] : field4375[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)Z")
    public final boolean method33(byte arg0) {
        try {
            if (arg0 != -12) {
                this.field4359 = true;
            }
            ++field4364;
            return this.field4369.method308((byte) -99);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4375[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "(B)Z")
    public final boolean method41(byte arg0) {
        try {
            ++field4356;
            return arg0 < 54;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4375[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "(I)Z")
    public final boolean method45(int arg0) {
        try {
            if (arg0 != -32768) {
                return false;
            } else {
                ++field4358;
                return this.field4359;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4375[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)I")
    public final int method34(int arg0) {
        try {
            if (arg0 != 16388) {
                return -1;
            } else {
                ++field4367;
                return this.field4369.field338;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4375[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILvf;I[BZIZ)Lub;")
    public static final class20 method2337(int arg0, int arg1, class159 arg2, int arg3, byte[] arg4, boolean arg5, int arg6, boolean arg7) {
        try {
            if (!arg5) {
                method2339((class693) null, false, false);
            }
            ++field4370;
            if (arg2.field2513 || class46.method469(arg1, 1010) && class46.method469(arg0, 1010)) {
                return new class20(arg2, 3553, arg6, arg1, arg0, arg7, arg4, arg3);
            } else {
                return arg2.field2481 ? new class20(arg2, 34037, arg6, arg1, arg0, arg7, arg4, arg3) : new class20(arg2, arg6, arg1, arg0, class90.method883((byte) 111, arg1), class90.method883((byte) 72, arg0), arg4, arg3);
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field4375[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4375[2] : field4375[0]) + ',' + arg3 + ',' + (arg4 != null ? field4375[2] : field4375[0]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)I")
    public final int method35(byte arg0) {
        try {
            if (arg0 != -55) {
                this.field4361 = null;
            }
            ++field4373;
            return this.field4369.field354;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4375[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(B)I")
    public final int method32(byte arg0) {
        try {
            if (arg0 != -95) {
                this.method46(-86, -20, 75, (class63) null);
            }
            ++field4362;
            return this.field4369.field360;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4375[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public final void method30(int arg0) {
        try {
            ++field4365;
            if (arg0 != 20235) {
                method2337(-72, -128, (class159) null, 67, (byte[]) null, true, -30, false);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4375[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method46(int arg0, int arg1, int arg2, class63 arg3) {
        try {
            ++field4357;
            class499 var5 = this.field4369.method326(arg0, false, 26624, arg3, false);
            if (var5 == null) {
                return false;
            } else {
                class486 var6 = arg3.method251();
                var6.method2465(super.field6840 + super.field9985, super.field9972, super.field6839 + super.field9983);
                return !class200.field3163 ? var5.method425(arg2, arg1, var6, false, 0) : var5.method429(arg2, arg1, var6, false, 0, class547.field8042);
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field4375[16] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4375[2] : field4375[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(Lha;B)Lrga;")
    public final class250 method47(class63 arg0, byte arg1) {
        try {
            ++field4374;
            if (arg1 != -118) {
                this.field4361 = null;
            }
            return this.field4361;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4375[17] + (arg0 != null ? field4375[2] : field4375[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lha;B)Lkv;")
    public final class281 method52(class63 arg0, byte arg1) {
        try {
            ++field4371;
            class499 var3 = this.field4369.method326(2048, false, arg1 + 26502, arg0, true);
            if (arg1 != 122) {
                this.field4361 = null;
            }
            if (var3 == null) {
                return null;
            } else {
                class486 var4 = arg0.method251();
                var4.method2465(super.field9985 - -super.field6840, super.field9972, super.field6839 + super.field9983);
                class281 var5 = class349.method2910(this.field4354, 1, (byte) -119);
                int var6 = super.field9985 >> 9;
                int var7 = super.field9983 >> 9;
                this.field4369.method323((byte) 20, var6, var7, var7, var6, arg0, var4, var3, true);
                if (class200.field3163) {
                    var3.method423(var4, var5.field4578[0], class547.field8042, 0);
                } else {
                    var3.method426(var4, var5.field4578[0], 0);
                }
                if (this.field4369.field358 != null) {
                    class659 var8 = this.field4369.field358.method893();
                    if (!class200.field3163) {
                        arg0.method191(var8);
                    } else {
                        arg0.method172(var8, class547.field8042);
                    }
                }
                this.field4359 = var3.method407() || this.field4369.field358 != null;
                if (this.field4361 != null) {
                    class133.method1255(super.field9983, var3, true, this.field4361, super.field9985, super.field9972);
                } else {
                    this.field4361 = class198.method1814(var3, arg1 + 33947, super.field9985, super.field9983, super.field9972);
                }
                return var5;
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field4375[14] + (arg0 != null ? field4375[2] : field4375[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(B)I")
    public final int method54(byte arg0) {
        try {
            ++field4372;
            if (arg0 > -112) {
                this.field4369 = null;
            }
            return this.field4369.method314(119);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4375[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILdq;)V")
    public final void method2338(int arg0, class729 arg1) {
        try {
            ++field4366;
            if (arg0 != 1) {
                this.method40((byte) -112, (class63) null);
            }
            this.field4369.method320(2, arg1);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4375[4] + arg0 + ',' + (arg1 != null ? field4375[2] : field4375[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLha;)V")
    public final void method40(byte arg0, class63 arg1) {
        try {
            ++field4363;
            if (arg0 != -108) {
                this.method40((byte) 54, (class63) null);
            }
            class499 var3 = this.field4369.method326(262144, false, 26624, arg1, true);
            if (var3 != null) {
                int var4 = super.field9985 >> 9;
                int var5 = super.field9983 >> 9;
                class486 var6 = arg1.method251();
                var6.method2465(super.field9985, super.field9972, super.field9983);
                this.field4369.method323((byte) 20, var4, var5, var5, var4, arg1, var6, var3, false);
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field4375[1] + arg0 + ',' + (arg1 != null ? field4375[2] : field4375[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lrda;ZZ)V")
    public static final void method2339(class693 arg0, boolean arg1, boolean arg2) {
        arg0.field9980 = arg2;
        if (class9.field103) {
            if (arg1) {
                class764.field11209[class764.field11209.length - 1].method1587(arg0, false);
            } else {
                int var3 = class694.method5053(arg0.field9970);
                int var4 = class150.field2093[2] * arg0.method54((byte) -115) / arg0.field9973;
                int var5 = class694.method5053(arg0.field9970 - var4);
                int var6 = class694.method5053(arg0.field9970 + var4);
                if (var5 == var6) {
                    class764.field11209[var3].method1587(arg0, false);
                } else if (var6 - var5 == 1) {
                    class764.field11209[class582.field8380 + var5].method1587(arg0, false);
                } else {
                    class764.field11209[class764.field11209.length - 1].method1587(arg0, false);
                }
            }
        } else {
            class299.method2577(arg0, class738.field10846);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILha;)V")
    public final void method31(int arg0, class63 arg1) {
        try {
            this.field4369.method325(false, arg1);
            if (arg0 == -27998) {
                ++field4368;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4375[13] + arg0 + ',' + (arg1 != null ? field4375[2] : field4375[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lha;I)V")
    public final void method29(class63 arg0, int arg1) {
        try {
            ++field4355;
            int var3 = -33 / ((22 - arg1) / 60);
            this.field4369.method322(-1, arg0);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4375[18] + (arg0 != null ? field4375[2] : field4375[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "(I)I")
    public final int method43(int arg0) {
        try {
            if (arg0 != 0) {
                this.field4359 = false;
            }
            ++field4360;
            return this.field4369.method321((byte) 51);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4375[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2340(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 9);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2341(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 73;
                    break;
                case 1:
                    var10005 = 39;
                    break;
                case 2:
                    var10005 = 26;
                    break;
                case 3:
                    var10005 = 67;
                    break;
                default:
                    var10005 = 9;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
