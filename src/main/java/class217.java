import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class217 extends class423 implements class267 {

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "Lji;")
    public class472 field3680;

    @OriginalMember(owner = "client!ih", name = "G", descriptor = "Z")
    private boolean field3690;

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "Lbi;")
    public static class104 field3681 = new class104(104, 4);

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "[I")
    public static int[] field3691 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!ih", name = "C", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!ih", name = "F", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!ih", name = "K", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!ih", name = "L", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!ih", name = "M", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!ih", name = "N", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!ih", name = "O", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!ih", name = "R", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "Lek;")
    public static class355 field3700;

    @OriginalMember(owner = "client!ih", name = "P", descriptor = "[[[Lce;")
    public static class409[][][] field3699;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(ILza;)V")
    public final void method102(int arg0, class497 arg1) {
        ++field3688;
        class536 var3 = this.field3680.method2945(super.field6410, 262144, true, (byte) -7, super.field6417, true, arg1);
        if (var3 != null) {
            this.field3680.method2940(super.field6420, super.field6423, super.field6424, arg1, var3, -117, super.field6418, false);
        }
        if (arg0 != -1) {
            field3691 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)I")
    public final int method96(byte arg0) {
        ++field3698;
        if (arg0 < 87) {
            this.method1596(false);
        }
        return this.field3680.field7233;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(Z)Z")
    public final boolean method936(boolean arg0) {
        if (arg0) {
            this.method103(-43);
        }
        ++field3679;
        return false;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIILza;)Z")
    public final boolean method105(int arg0, int arg1, int arg2, class497 arg3) {
        ++field3684;
        class536 var5 = this.field3680.method2945(super.field6410, 131072, false, (byte) -7, super.field6417, false, arg3);
        if (var5 == null) {
            return false;
        } else if (arg1 != 32689) {
            return true;
        } else {
            class205 var6 = arg3.method1231();
            var6.method158(super.field6417, super.field6412, super.field6410);
            return var5.method298(arg0, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZLza;I)Le;")
    public final class536 method107(boolean arg0, class497 arg1, int arg2) {
        ++field3697;
        if (arg0) {
            this.field3690 = false;
        }
        return this.field3680.method2945(0, arg2, false, (byte) -7, 0, false, arg1);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
    public final void method934(int arg0) {
        ++field3693;
        if (arg0 == 287) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(Z)I")
    public final int method1596(boolean arg0) {
        ++field3701;
        return !arg0 ? 24 : this.field3680.method2937(false);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILza;)V")
    public final void method97(int arg0, class497 arg1) {
        ++field3695;
        if (arg0 == -6682) {
            this.field3680.method2938(-126, arg1);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILza;IZBILbm;)V")
    public final void method938(int arg0, class497 arg1, int arg2, boolean arg3, byte arg4, int arg5, class484 arg6) {
        ++field3683;
        int var8 = -44 % ((27 - arg4) / 32);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lza;Loq;IIIIIZIIIIIII)V")
    public class217(class497 arg0, class156 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field2114 == 1, class130.method810((byte) 102, arg13, arg12));
        this.field3680 = new class472(arg0, arg1, arg12, arg13, super.field6419, arg3, arg4, arg6, arg7, arg14);
        this.field3690 = arg1.field2079 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(I)V")
    public static final void method1597(int arg0) {
        ++field3685;
        if (class9.field99 < 102) {
            class9.field99 += 6;
        }
        if (class349.field5412 != 0) {
            class294.field4642 -= class349.field5412 * 5;
            if (~class274.field4352 >= ~class294.field4642) {
                class294.field4642 = class274.field4352 + -1;
            }
            class349.field5412 = 0;
            if (~class294.field4642 > -1) {
                class294.field4642 = 0;
            }
        }
        int var1 = 0;
        if (arg0 == 11030) {
            while (~class538.field7881 < ~var1) {
                class369 var2 = class358.field5564[var1];
                int var3 = var2.method1828((byte) 110);
                char var4 = var2.method1829(-32393);
                int var5 = var2.method1832((byte) 119);
                if (~var3 == -85) {
                    class126.method784((byte) -128, false);
                }
                if (var3 == 80) {
                    class126.method784((byte) -124, true);
                } else if (var3 == 66 && (var5 & 4) != 0) {
                    if (class112.field1580 != null) {
                        String var6 = "";
                        for (int var7 = class390.field5937.length + -1; ~var7 <= -1; --var7) {
                            if (class390.field5937[var7] != null && ~class390.field5937[var7].length() < -1) {
                                var6 = var6 + class390.field5937[var7] + '\n';
                            }
                        }
                        class112.field1580.setContents(new StringSelection(var6), (ClipboardOwner) null);
                    }
                } else if (var3 == 67 && ~(var5 & 4) != -1) {
                    if (class112.field1580 != null) {
                        Transferable var8 = class112.field1580.getContents((Object) null);
                        if (var8 != null) {
                            try {
                                String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                                if (var9 != null) {
                                    String[] var10 = class506.method3074((byte) 125, var9, '\n');
                                    if (var10.length > 1) {
                                        for (int var11 = 0; var11 < var10.length; ++var11) {
                                            class55.field827 = var10[var11];
                                            class126.method784((byte) -104, false);
                                        }
                                    } else {
                                        class55.field827 = class55.field827 + var9;
                                    }
                                }
                            } catch (Exception var12) {
                            }
                        }
                    }
                } else if (var3 == 85 && ~class243.field3948 < -1) {
                    class55.field827 = class55.field827.substring(0, class243.field3948 + -1) + class55.field827.substring(class243.field3948);
                    --class243.field3948;
                } else if (~var3 == -102 && class243.field3948 < class55.field827.length()) {
                    class55.field827 = class55.field827.substring(0, class243.field3948) + class55.field827.substring(class243.field3948 - -1);
                } else if (var3 == 96 && class243.field3948 > 0) {
                    --class243.field3948;
                } else if (~var3 == -98 && ~class243.field3948 > ~class55.field827.length()) {
                    ++class243.field3948;
                } else if (~var3 != -103) {
                    if (~var3 == -104) {
                        class243.field3948 = class55.field827.length();
                    } else if (~var3 == -105 && class390.field5937.length > class446.field6918) {
                        ++class446.field6918;
                        class417.method2665(-1);
                        class243.field3948 = class55.field827.length();
                    } else if (~var3 == -106 && ~class446.field6918 < -1) {
                        --class446.field6918;
                        class417.method2665(-1);
                        class243.field3948 = class55.field827.length();
                    } else if (class524.method3130(var4, 7434) || var4 == ':' || var4 == ',' || var4 == ' ' || var4 == '_' || var4 == '-' || var4 == '+' || var4 == '[' || ~var4 == -94) {
                        class55.field827 = class55.field827.substring(0, class243.field3948) + class358.field5564[var1].method1829(-32393) + class55.field827.substring(class243.field3948);
                        ++class243.field3948;
                    }
                } else {
                    class243.field3948 = 0;
                }
                ++var1;
            }
            class538.field7881 = 0;
            class236.method1667(2318);
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)I")
    public final int method99(byte arg0) {
        ++field3694;
        if (arg0 < 53) {
            field3699 = null;
        }
        return this.field3680.field7227;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)I")
    public final int method106(byte arg0) {
        ++field3687;
        return arg0 != 18 ? 13 : this.field3680.field7232;
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V")
    public static void method1598(int arg0) {
        field3681 = null;
        field3700 = null;
        field3699 = null;
        field3691 = null;
        if (arg0 > -69) {
            field3699 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lza;I)V")
    public final void method104(class497 arg0, int arg1) {
        ++field3689;
        this.field3680.method2941(false, arg0);
        if (arg1 != 26768) {
            method1598(-63);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)Z")
    public final boolean method103(int arg0) {
        ++field3692;
        return arg0 >= -95 ? false : this.field3680.method2946(115);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILgi;II)V")
    public static final void method1599(int arg0, class437 arg1, int arg2, int arg3) {
        if (arg0 != -1) {
            field3700 = null;
        }
        ++field3686;
        if (!class128.field1732) {
            for (int var4 = 9; ~var4 <= -6; --var4) {
                String var8 = class53.method406(var4, 15608, arg1);
                if (var8 != null) {
                    class279.method1875((long) (var4 + 1), arg1.field6751, true, false, arg1.field6632, arg1.field6716, arg1.field6595, var8, -36, 1012, class130.method811((byte) 50, arg1, var4));
                    ++class460.field7095;
                }
            }
            String var5 = class210.method1484(arg1, 0);
            if (var5 != null) {
                ++class337.field5258;
                class279.method1875(0L, arg1.field6751, true, false, arg1.field6632, arg1.field6716, arg1.field6595, var5, -98, 5, arg1.field6745);
            }
            for (int var6 = 4; var6 >= 0; --var6) {
                String var7 = class53.method406(var6, 15608, arg1);
                if (var7 != null) {
                    class279.method1875((long) (var6 - -1), arg1.field6751, true, false, arg1.field6632, arg1.field6716, arg1.field6595, var7, arg0 ^ 88, 59, class130.method811((byte) 50, arg1, var6));
                    ++class460.field7095;
                }
            }
            if (client.method492(arg1).method2911((byte) 78)) {
                ++class63.field994;
                if (arg1.field6681 != null) {
                    class279.method1875(0L, arg1.field6751, true, false, "", arg1.field6716, arg1.field6595, arg1.field6681, -111, 8, -1);
                    return;
                }
                class279.method1875(0L, arg1.field6751, true, false, "", arg1.field6716, arg1.field6595, class126.field1700.method1583(82, class12.field131), -119, 8, -1);
                return;
            }
        } else {
            class442 var9 = class231.field3822 != -1 ? class274.field4353.method1171((byte) 82, class231.field3822) : null;
            if (!client.method492(arg1).method2914((byte) -86) || (32 & class535.field7838) == 0) {
                return;
            }
            if (var9 == null || ~arg1.method2755(var9.field6872, arg0 + 1, class231.field3822) != ~var9.field6872) {
                class279.method1875(0L, arg1.field6751, true, false, class283.field4459 + " -> " + arg1.field6632, arg1.field6716, arg1.field6595, class427.field6450, -73, 13, class186.field2716);
                ++class411.field6228;
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(ILza;)Lon;")
    public final class514 method108(int arg0, class497 arg1) {
        ++field3677;
        class536 var3 = this.field3680.method2945(super.field6410, 2048, false, (byte) -7, super.field6417, true, arg1);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != 2) {
                field3691 = null;
            }
            class205 var4 = arg1.method1231();
            var4.method158(super.field6417, super.field6412, super.field6410);
            class514 var5 = null;
            if (this.field3690) {
                var5 = class104.method706(arg0 ^ 2, 1);
            }
            if (this.field3680.field7222 == null) {
                var3.method295(var4, var5 == null ? null : var5.field7629[0], 0);
            } else {
                class519 var6 = this.field3680.field7222.method2354();
                arg1.method1291(var3, var6, var4, var5 == null ? null : var5.field7629[0], 0);
            }
            this.field3680.method2940(super.field6420, super.field6423, super.field6424, arg1, var3, arg0 ^ -121, super.field6418, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "(I)Lii;")
    public static final class456 method1600(int arg0) {
        if (arg0 != 1) {
            method1600(15);
        }
        ++field3678;
        class456 var1 = (class456) class209.field3224.method2732(arg0 + 33);
        if (var1 != null) {
            var1.method3149(106);
            var1.method2219(0);
            return var1;
        } else {
            class456 var2;
            do {
                var2 = (class456) class183.field2656.method2732(34);
                if (var2 == null) {
                    return null;
                }
                if (var2.method2864((byte) 52) > class246.method1705((byte) 28)) {
                    return null;
                }
                var2.method3149(arg0 + 70);
                var2.method2219(0);
            } while (~(Long.MIN_VALUE & var2.field5226) == -1L);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)V")
    public final void method100(boolean arg0) {
        ++field3682;
        if (arg0) {
            this.method107(false, (class497) null, -44);
        }
    }
}
