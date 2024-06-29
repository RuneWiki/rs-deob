import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class242 extends class604 {

    @OriginalMember(owner = "client!dr", name = "Y", descriptor = "Z")
    private boolean field3485 = true;

    @OriginalMember(owner = "client!dr", name = "hb", descriptor = "I")
    private int field3494 = 0;

    @OriginalMember(owner = "client!dr", name = "ab", descriptor = "I")
    private int field3497 = 0;

    @OriginalMember(owner = "client!dr", name = "fb", descriptor = "I")
    private int field3484 = 0;

    @OriginalMember(owner = "client!dr", name = "gb", descriptor = "I")
    private int field3500;

    @OriginalMember(owner = "client!dr", name = "U", descriptor = "Lqu;")
    private class84 field3487;

    @OriginalMember(owner = "client!dr", name = "sb", descriptor = "[Ljava/lang/String;")
    private static final String[] field3502 = new String[] { method2003(method2002("Q#*\u0011&\u001d")), method2003(method2002("Q#*\u001aO")), method2003(method2002("Q#*\u0016&\u001d")), method2003(method2002("Q#*\u001eO")), method2003(method2002("Q#*n\u000e[8plO")), method2003(method2002("Q#*4\u000e[0h;\u001dPy")), method2003(method2002("Q#*\u0004O")), method2003(method2002("Q#*\u0010O")), method2003(method2002("Q#*\u0018O")), method2003(method2002("N\u007f*|\u001a")), method2003(method2002("[$h>")), method2003(method2002("Q#*\u0016O")), method2003(method2002("Q#*\u001bO")), method2003(method2002("Q#*\u0015O")), method2003(method2002("Q#*\u0019O")), method2003(method2002("Q#*\u0010&\u001d")), method2003(method2002("Q#*\u0014O")), method2003(method2002("Q#*\u0006O")), method2003(method2002("Q#*\u0017O")), method2003(method2002("Q#*\u0013O")), method2003(method2002("Q#*\u0002O")), method2003(method2002("Q#*\u0011O")) };

    @OriginalMember(owner = "client!dr", name = "bb", descriptor = "Z")
    public static boolean field3481 = false;

    @OriginalMember(owner = "client!dr", name = "Z", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!dr", name = "X", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!dr", name = "pb", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!dr", name = "eb", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!dr", name = "V", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!dr", name = "db", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!dr", name = "ob", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!dr", name = "rb", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!dr", name = "jb", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!dr", name = "S", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!dr", name = "T", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!dr", name = "qb", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!dr", name = "cb", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!dr", name = "ib", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!dr", name = "lb", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!dr", name = "mb", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!dr", name = "R", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!dr", name = "W", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!dr", name = "nb", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!dr", name = "kb", descriptor = "Lit;")
    private class464 field3499;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "(I)Z")
    public final boolean method46(int arg0) {
        try {
            if (arg0 > -97) {
                return false;
            } else {
                ++field3477;
                return false;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3502[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "(Z)Z")
    public final boolean method582(boolean arg0) {
        try {
            if (arg0) {
                this.field3497 = 10;
            }
            ++field3490;
            return false;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3502[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lha;B)Lsba;")
    public final class311 method587(class18 arg0, byte arg1) {
        try {
            ++field3491;
            if (arg1 < 94) {
                this.method1999(117, (class18) null, (class104) null, (class761) null);
            }
            return null;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3502[20] + (arg0 != null ? field3502[9] : field3502[10]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "(B)V")
    public final void method44(byte arg0) {
        try {
            ++field3486;
            if (arg0 <= 111) {
                this.field3497 = 101;
            }
            throw new IllegalStateException();
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3502[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IBILrfa;ZILha;)V")
    public final void method40(int arg0, byte arg1, int arg2, class202 arg3, boolean arg4, int arg5, class18 arg6) {
        try {
            ++field3482;
            int var8 = 35 / ((arg1 - 9) / 35);
            throw new IllegalStateException();
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field3502[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3502[9] : field3502[10]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field3502[9] : field3502[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!dr", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        try {
            ++field3495;
            if (this.field3499 != null) {
                this.field3499.method3564();
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3502[5] + ')');
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method580(class18 arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg2 != -1) {
                return false;
            } else {
                ++field3478;
                return false;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field3502[19] + (arg0 != null ? field3502[9] : field3502[10]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "(B)Z")
    public final boolean method1995(byte arg0) {
        try {
            if (arg0 > -52) {
                this.field3484 = 85;
            }
            ++field3501;
            return this.field3487 == null || this.field3487.method843((byte) -121);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3502[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(Z)I")
    public final int method575(boolean arg0) {
        try {
            ++field3476;
            if (arg0) {
                this.field3500 = -6;
            }
            return this.field3494;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3502[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(I)Z")
    public final boolean method1996(int arg0) {
        try {
            ++field3480;
            if (arg0 != 0) {
                this.method46(-34);
            }
            return this.field3487 != null && !this.field3487.method826(arg0 + -1);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3502[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lha;I)V")
    public final void method586(class18 arg0, int arg1) {
        try {
            ++field3493;
            class761 var3 = this.method2000(arg1, -1, arg0, this.field3500);
            if (var3 != null) {
                class104 var4 = arg0.method136();
                var4.method739(super.field2969, super.field2975, super.field2984);
                this.method1999(9764, arg0, var4, var3);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field3502[17] + (arg0 != null ? field3502[9] : field3502[10]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "(Z)Z")
    public final boolean method579(boolean arg0) {
        try {
            if (arg0) {
                this.field3497 = -3;
            }
            ++field3496;
            return this.field3485;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3502[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)Ljava/lang/String;")
    public static final String method1997(int arg0) {
        try {
            ++field3488;
            if (!class86.field1217 && class44.field639 != null) {
                if ((class44.field639.field3294 == null || ~class44.field639.field3294.length() == -1) && class44.field639.field3300 != null && class44.field639.field3300.length() > 0) {
                    return class44.field639.field3300;
                } else {
                    if (arg0 >= -5) {
                        field3481 = true;
                    }
                    return class44.field639.field3294;
                }
            } else {
                return "";
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3502[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(IIIIIIIIIIIIZ)V")
    public class242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
        try {
            this.field3484 = arg11;
            this.field3500 = arg0;
            class595 var14 = class11.field153.method3479(this.field3500, 103);
            int var15 = var14.field8565;
            if (var15 != -1) {
                this.field3487 = new class689(this, false);
                int var16 = var14.field8546 ? 0 : 2;
                if (arg12) {
                    var16 = 1;
                }
                this.field3487.method847(var15, var16, false, arg1, (byte) -19);
            }
        } catch (RuntimeException var18) {
            throw class665.method4799(var18, field3502[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
        }
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)V")
    public final void method1998(int arg0) {
        try {
            if (this.field3499 != null) {
                this.field3499.method3564();
            }
            if (arg0 != -1) {
                this.field3485 = false;
            }
            ++field3492;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3502[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILha;Lqa;Lka;)V")
    private final void method1999(int arg0, class18 arg1, class104 arg2, class761 arg3) {
        try {
            ++field3479;
            arg3.method402(arg2);
            if (arg0 != 9764) {
                this.field3500 = 20;
            }
            class510[] var5 = arg3.method426();
            class264[] var6 = arg3.method413();
            if ((this.field3499 == null || this.field3499.field6762) && (var5 != null || var6 != null)) {
                this.field3499 = class464.method3574(class694.field9700, true);
            }
            if (this.field3499 != null) {
                this.field3499.method3569(arg1, (long) class694.field9700, var5, var6, false);
                this.field3499.method3568(super.field2981, super.field8663, super.field8666, super.field8669, super.field8661);
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field3502[8] + arg0 + ',' + (arg1 != null ? field3502[9] : field3502[10]) + ',' + (arg2 != null ? field3502[9] : field3502[10]) + ',' + (arg3 != null ? field3502[9] : field3502[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(ZLha;)Lrs;")
    public final class297 method573(boolean arg0, class18 arg1) {
        try {
            ++field3483;
            class761 var3 = this.method2000((~this.field3484 != -1 ? 5 : 0) | 2048, -1, arg1, this.field3500);
            if (var3 == null) {
                return null;
            } else {
                if (this.field3484 != 0) {
                    var3.method419(this.field3484 * 2048);
                }
                class104 var4 = arg1.method136();
                var4.method739(super.field2969, super.field2975, super.field2984);
                this.method1999(9764, arg1, var4, var3);
                class297 var5 = class674.method4839(arg0, 1, 12853);
                if (!class149.field1902) {
                    var3.method415(var4, var5.field4153[0], 0);
                } else {
                    var3.method427(var4, var5.field4153[0], class194.field2686, 0);
                }
                if (this.field3499 != null) {
                    class788 var6 = this.field3499.method3565();
                    if (class149.field1902) {
                        arg1.method193(var6, class194.field2686);
                    } else {
                        arg1.method126(var6);
                    }
                }
                this.field3485 = var3.method422();
                this.field3494 = var3.method432();
                this.field3497 = var3.method423();
                return var5;
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field3502[21] + arg0 + ',' + (arg1 != null ? field3502[9] : field3502[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IILha;I)Lka;")
    private final class761 method2000(int arg0, int arg1, class18 arg2, int arg3) {
        try {
            ++field3489;
            if (arg1 != -1) {
                return null;
            } else {
                class595 var5 = class11.field153.method3479(arg3, arg1 ^ -109);
                class751 var6 = class213.field3124[super.field2981];
                class751 var7 = super.field2971 >= 3 ? null : class213.field3124[super.field2971 - -1];
                return this.field3487 != null && !this.field3487.method843((byte) -87) ? var5.method4387((byte) 2, var6, this.field3487, var7, true, super.field2969, super.field2984, arg2, super.field2975, arg0, (byte) 123) : var5.method4387((byte) 2, var6, (class84) null, var7, true, super.field2969, super.field2984, arg2, super.field2975, arg0, (byte) 18);
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field3502[16] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3502[9] : field3502[10]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(B)I")
    public final int method578(byte arg0) {
        try {
            if (arg0 != 114) {
                this.method40(100, (byte) -67, 39, (class202) null, true, -79, (class18) null);
            }
            ++field3475;
            return this.field3497;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3502[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BI)V")
    public final void method2001(byte arg0, int arg1) {
        try {
            int var3 = 70 % ((58 - arg0) / 34);
            ++field3498;
            if (this.field3487 != null && !this.field3487.method843((byte) -90)) {
                this.field3487.method844(arg1, 41);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3502[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2002(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 103);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2003(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 53;
                    break;
                case 1:
                    var10005 = 81;
                    break;
                case 2:
                    var10005 = 4;
                    break;
                case 3:
                    var10005 = 82;
                    break;
                default:
                    var10005 = 103;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
