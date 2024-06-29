import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class800 extends class122 implements class675 {

    @OriginalMember(owner = "client!eq", name = "cb", descriptor = "Z")
    private boolean field11639 = true;

    @OriginalMember(owner = "client!eq", name = "bb", descriptor = "Lmu;")
    public class365 field11622;

    @OriginalMember(owner = "client!eq", name = "J", descriptor = "Z")
    private boolean field11621;

    @OriginalMember(owner = "client!eq", name = "O", descriptor = "[Ljava/lang/String;")
    private static final String[] field11647 = new String[] { method5773(method5772("Tw>\r\u0018")), method5773(method5772("A,|O")), method5773(method5772("J(>dM")), method5773(method5772("J(>wM")), method5773(method5772("J(>lM")), method5773(method5772("J(>iM")), method5773(method5772("J(>a$\u0007")), method5773(method5772("J(>eM")), method5773(method5772("J(>gM")), method5773(method5772("J(>jM")), method5773(method5772("J(>fM")), method5773(method5772("J(>oM")), method5773(method5772("J(>kM")), method5773(method5772("J(>sM")), method5773(method5772("J(>`M")), method5773(method5772("J(>uM")), method5773(method5772("J(>aM")), method5773(method5772("J(>mM")), method5773(method5772("J(>\u001f\fA0d\u001dM")), method5773(method5772("J(>g$\u0007")), method5773(method5772("J(>nM")), method5773(method5772("J(>hM")), method5773(method5772("J(>bM")), method5773(method5772("J(>`$\u0007")) };

    @OriginalMember(owner = "client!eq", name = "hb", descriptor = "Z")
    public static boolean field11625 = false;

    @OriginalMember(owner = "client!eq", name = "K", descriptor = "I")
    public static int field11618;

    @OriginalMember(owner = "client!eq", name = "ab", descriptor = "I")
    public static int field11619;

    @OriginalMember(owner = "client!eq", name = "V", descriptor = "I")
    public static int field11620;

    @OriginalMember(owner = "client!eq", name = "gb", descriptor = "I")
    public static int field11623;

    @OriginalMember(owner = "client!eq", name = "jb", descriptor = "I")
    public static int field11626;

    @OriginalMember(owner = "client!eq", name = "S", descriptor = "I")
    public static int field11627;

    @OriginalMember(owner = "client!eq", name = "fb", descriptor = "I")
    public static int field11628;

    @OriginalMember(owner = "client!eq", name = "Z", descriptor = "I")
    public static int field11629;

    @OriginalMember(owner = "client!eq", name = "Q", descriptor = "I")
    public static int field11630;

    @OriginalMember(owner = "client!eq", name = "eb", descriptor = "I")
    public static int field11631;

    @OriginalMember(owner = "client!eq", name = "ib", descriptor = "I")
    public static int field11632;

    @OriginalMember(owner = "client!eq", name = "X", descriptor = "I")
    public static int field11633;

    @OriginalMember(owner = "client!eq", name = "db", descriptor = "I")
    public static int field11634;

    @OriginalMember(owner = "client!eq", name = "P", descriptor = "I")
    public static int field11635;

    @OriginalMember(owner = "client!eq", name = "T", descriptor = "I")
    public static int field11636;

    @OriginalMember(owner = "client!eq", name = "lb", descriptor = "I")
    public static int field11637;

    @OriginalMember(owner = "client!eq", name = "Y", descriptor = "I")
    public static int field11638;

    @OriginalMember(owner = "client!eq", name = "W", descriptor = "I")
    public static int field11640;

    @OriginalMember(owner = "client!eq", name = "N", descriptor = "I")
    public static int field11641;

    @OriginalMember(owner = "client!eq", name = "U", descriptor = "I")
    public static int field11642;

    @OriginalMember(owner = "client!eq", name = "M", descriptor = "I")
    public static int field11643;

    @OriginalMember(owner = "client!eq", name = "R", descriptor = "I")
    public static int field11644;

    @OriginalMember(owner = "client!eq", name = "L", descriptor = "I")
    public static int field11645;

    @OriginalMember(owner = "client!eq", name = "mb", descriptor = "I")
    public static int field11646;

    @OriginalMember(owner = "client!eq", name = "kb", descriptor = "Lsba;")
    private class311 field11624;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(B)I")
    public final int method578(byte arg0) {
        try {
            ++field11641;
            return arg0 != 114 ? -111 : this.field11622.method2905(125);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11647[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lha;Lfw;IIIIIZII)V")
    public class800(class18 arg0, class789 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field11450);
        try {
            this.field11622 = new class365(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
            this.field11621 = arg1.field11409 != 0 && !arg7;
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field11647[18] + (arg0 != null ? field11647[0] : field11647[1]) + ',' + (arg1 != null ? field11647[0] : field11647[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILon;)I")
    public static final int method5769(int arg0, class496 arg1) {
        try {
            ++field11646;
            if (arg0 >= -62) {
                return 3;
            } else if (class496.field7276 == arg1) {
                return 5120;
            } else if (class496.field7278 == arg1) {
                return 5122;
            } else if (class496.field7280 != arg1) {
                if (class496.field7281 == arg1) {
                    return 5121;
                } else if (class496.field7282 != arg1) {
                    if (class496.field7283 == arg1) {
                        return 5125;
                    } else if (class496.field7284 != arg1) {
                        if (class496.field7285 == arg1) {
                            return 5126;
                        } else {
                            throw new IllegalArgumentException("");
                        }
                    } else {
                        return 5131;
                    }
                } else {
                    return 5123;
                }
            } else {
                return 5124;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11647[11] + arg0 + ',' + (arg1 != null ? field11647[0] : field11647[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(Z)Z")
    public final boolean method579(boolean arg0) {
        try {
            if (arg0) {
                field11625 = false;
            }
            ++field11644;
            return this.field11639;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11647[23] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(ZLha;)Lrs;")
    public final class297 method573(boolean arg0, class18 arg1) {
        try {
            ++field11626;
            class761 var3 = this.field11622.method2903(2048, arg1, arg0, true, (byte) -95);
            if (var3 == null) {
                return null;
            } else {
                class104 var4 = arg1.method136();
                var4.method739(super.field2969, super.field2975, super.field2984);
                class297 var5 = class674.method4839(this.field11621, 1, 12853);
                int var6 = super.field2969 >> 9;
                int var7 = super.field2984 >> 9;
                this.field11622.method2909(var6, var3, 0, var6, var7, arg1, true, var7, var4);
                if (!class149.field1902) {
                    var3.method415(var4, var5.field4153[0], 0);
                } else {
                    var3.method427(var4, var5.field4153[0], class194.field2686, 0);
                }
                if (this.field11622.field5312 != null) {
                    class788 var8 = this.field11622.field5312.method3565();
                    if (!class149.field1902) {
                        arg1.method126(var8);
                    } else {
                        arg1.method193(var8, class194.field2686);
                    }
                }
                this.field11639 = var3.method422() || this.field11622.field5312 != null;
                if (this.field11624 == null) {
                    this.field11624 = class640.method4679(super.field2969, super.field2984, super.field2975, var3, 10327);
                } else {
                    class345.method2767(this.field11624, super.field2984, super.field2969, -128, var3, super.field2975);
                }
                return var5;
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field11647[14] + arg0 + ',' + (arg1 != null ? field11647[0] : field11647[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "(Z)Z")
    public final boolean method582(boolean arg0) {
        try {
            if (arg0) {
                this.field11639 = true;
            }
            ++field11632;
            return false;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11647[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(I)I")
    public final int method572(int arg0) {
        try {
            if (arg0 < 70) {
                return 55;
            } else {
                ++field11635;
                return this.field11622.field5318;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11647[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method580(class18 arg0, int arg1, int arg2, int arg3) {
        try {
            ++field11618;
            class761 var5 = this.field11622.method2903(131072, arg0, false, false, (byte) -115);
            if (var5 == null) {
                return false;
            } else {
                class104 var6 = arg0.method136();
                var6.method739(super.field2969, super.field2975, super.field2984);
                if (arg2 != -1) {
                    return false;
                } else {
                    return class149.field1902 ? var5.method440(arg3, arg1, var6, false, 0, class194.field2686) : var5.method382(arg3, arg1, var6, false, 0);
                }
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field11647[22] + (arg0 != null ? field11647[0] : field11647[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(B)V")
    public final void method44(byte arg0) {
        try {
            ++field11636;
            if (arg0 <= 111) {
                field11633 = -56;
            }
            throw new IllegalStateException();
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11647[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILha;)V")
    public final void method581(int arg0, class18 arg1) {
        try {
            ++field11630;
            if (arg0 != -18864) {
                field11633 = -82;
            }
            this.field11622.method2908(4, arg1);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11647[10] + arg0 + ',' + (arg1 != null ? field11647[0] : field11647[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZLha;)V")
    public final void method589(boolean arg0, class18 arg1) {
        try {
            ++field11619;
            this.field11622.method2907(262144, arg1);
            if (arg0) {
                this.method579(false);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11647[17] + arg0 + ',' + (arg1 != null ? field11647[0] : field11647[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(Z)I")
    public final int method575(boolean arg0) {
        try {
            if (arg0) {
                this.method586((class18) null, -120);
            }
            ++field11629;
            return this.field11622.method2911(-93);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11647[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method5770(String arg0, int arg1) {
        try {
            ++field11634;
            class274 var2 = class625.method4586((byte) 74);
            if (arg1 >= 45) {
                var2.field3885.method5114(255, class414.field5961.field5193);
                var2.field3885.method5138((byte) -118, 0);
                int var3 = var2.field3885.field9945;
                var2.field3885.method5138((byte) -117, 658);
                int[] var4 = class236.method1951(4, var2);
                int var5 = var2.field3885.field9945;
                var2.field3885.method5089(arg0, (byte) -73);
                var2.field3885.method5114(255, class405.field5883);
                var2.field3885.field9945 += 7;
                var2.field3885.method5100(var5, var4, var2.field3885.field9945, 8);
                var2.field3885.method5091(var2.field3885.field9945 - var3, false);
                class60.field911.method5608(var2, 29867);
                class121.field1533 = -3;
                class723.field10286 = 0;
                class399.field5822 = 0;
                class189.field2516 = 1;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field11647[12] + (arg0 != null ? field11647[0] : field11647[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)I")
    public final int method584(boolean arg0) {
        try {
            ++field11627;
            return arg0 ? 93 : this.field11622.field5310;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11647[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lha;B)Lsba;")
    public final class311 method587(class18 arg0, byte arg1) {
        try {
            if (arg1 < 94) {
                this.method579(false);
            }
            ++field11631;
            return this.field11624;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11647[13] + (arg0 != null ? field11647[0] : field11647[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)Z")
    public final boolean method590(int arg0) {
        try {
            ++field11643;
            if (arg0 < 96) {
                field11625 = true;
            }
            return this.field11622.method2902((byte) 86);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11647[20] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)I")
    public final int method585(int arg0) {
        try {
            ++field11620;
            if (arg0 != -20175) {
                this.field11622 = null;
            }
            return this.field11622.field5290;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11647[21] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BLao;)V")
    public final void method5771(byte arg0, class626 arg1) {
        try {
            if (arg0 <= 84) {
                this.method585(111);
            }
            this.field11622.method2900(-114, arg1);
            ++field11638;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11647[5] + arg0 + ',' + (arg1 != null ? field11647[0] : field11647[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "(I)Z")
    public final boolean method46(int arg0) {
        try {
            if (arg0 >= -97) {
                this.method580((class18) null, -31, 20, 124);
            }
            ++field11637;
            return false;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11647[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(Z)V")
    public final void method576(boolean arg0) {
        try {
            if (!arg0) {
                this.field11622 = null;
            }
            ++field11645;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11647[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IBILrfa;ZILha;)V")
    public final void method40(int arg0, byte arg1, int arg2, class202 arg3, boolean arg4, int arg5, class18 arg6) {
        try {
            ++field11623;
            int var8 = 45 % ((arg1 - 9) / 35);
            throw new IllegalStateException();
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field11647[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field11647[0] : field11647[1]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field11647[0] : field11647[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lha;I)V")
    public final void method586(class18 arg0, int arg1) {
        try {
            ++field11628;
            class761 var3 = this.field11622.method2903(262144, arg0, true, true, (byte) -73);
            if (arg1 == 0) {
                if (var3 != null) {
                    int var4 = super.field2969 >> 9;
                    int var5 = super.field2984 >> 9;
                    class104 var6 = arg0.method136();
                    var6.method739(super.field2969, super.field2975, super.field2984);
                    this.field11622.method2909(var4, var3, 0, var4, var5, arg0, false, var5, var6);
                }
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field11647[3] + (arg0 != null ? field11647[0] : field11647[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5772(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 101);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5773(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 47;
                    break;
                case 1:
                    var10005 = 89;
                    break;
                case 2:
                    var10005 = 16;
                    break;
                case 3:
                    var10005 = 35;
                    break;
                default:
                    var10005 = 101;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
