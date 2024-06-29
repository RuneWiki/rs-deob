import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class289 implements class4 {

    @OriginalMember(owner = "client!uca", name = "e", descriptor = "Lbc;")
    private class9 field3728 = new class9(128);

    @OriginalMember(owner = "client!uca", name = "m", descriptor = "[I")
    public int[] field3736 = new int[class543.field7052.field7389];

    @OriginalMember(owner = "client!uca", name = "r", descriptor = "[I")
    private int[] field3741 = new int[class543.field7052.field7389];

    @OriginalMember(owner = "client!uca", name = "f", descriptor = "I")
    public static int field3729 = 0;

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "I")
    public static int field3727 = 0;

    @OriginalMember(owner = "client!uca", name = "s", descriptor = "Lnj;")
    public static class415 field3742 = new class415(30, 3);

    @OriginalMember(owner = "client!uca", name = "h", descriptor = "F")
    public static float field3731;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!uca", name = "g", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!uca", name = "i", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!uca", name = "j", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!uca", name = "k", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!uca", name = "l", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!uca", name = "n", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!uca", name = "o", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!uca", name = "p", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!uca", name = "q", descriptor = "I")
    public static int field3740;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uca", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field3743;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(III)V")
    public final void method1714(int arg0, int arg1, int arg2) {
        field3733++;
        class608 var4 = class388.field4971.method2183(arg1, -53);
        int var5 = var4.field8218;
        if (arg2 != 8528) {
            this.method14(76, -113);
        }
        int var6 = var4.field8221;
        int var7 = var4.field8217;
        int var8 = class416.field5342[var7 - var6];
        if (arg0 < 0 || var8 < arg0) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method1718(var9 & arg0 << var6 | this.field3736[var5] & ~var9, var5, 0);
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(B)V")
    public final void method1715(byte arg0) {
        int var2 = 0;
        int var3 = -123 % ((-arg0 - 6) / 53);
        while (class543.field7052.field7389 > var2) {
            class316 var4 = class543.field7052.method3023(true, var2);
            if (var4 != null && var4.field4106 == 0) {
                this.field3741[var2] = 0;
                this.field3736[var2] = 0;
            }
            var2++;
        }
        field3730++;
        this.field3728 = new class9(128);
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZB)V")
    public static final void method1716(boolean arg0, byte arg1) {
        field3735++;
        if (arg1 <= 10) {
            field3731 = -0.94104695F;
        }
        if (class247.field3327.length() == 0) {
            return;
        }
        class697.method3800("--> " + class247.field3327, 1);
        class640.method3528(class247.field3327, false, -4, arg0);
        class41.field583 = 0;
        class247.field3327 = "";
        class213.field2750 = 0;
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(II)I")
    public final int method15(int arg0, int arg1) {
        field3726++;
        if (arg1 != 4) {
            field3729 = -73;
        }
        class608 var3 = class388.field4971.method2183(arg0, -77);
        int var4 = var3.field8218;
        int var5 = var3.field8221;
        int var6 = var3.field8217;
        int var7 = class416.field5342[var6 - var5];
        return this.field3736[var4] >> var5 & var7;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)V")
    public static void method1717(int arg0) {
        field3742 = null;
        int var1 = 14 % ((-arg0 - 92) / 34);
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(III)V")
    public final void method1718(int arg0, int arg1, int arg2) {
        this.field3736[arg1] = arg0;
        field3732++;
        class149 var4 = (class149) this.field3728.method39((long) arg1, arg2 ^ 0x7C06);
        if (var4 == null) {
            class149 var5 = new class149(class584.method3191(1) + 500L);
            this.field3728.method38(var5, arg2 + 124, (long) arg1);
        } else {
            var4.field1920 = class584.method3191(1) + 500L;
        }
        if (arg2 != 0) {
            this.field3736 = null;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(II)I")
    public final int method14(int arg0, int arg1) {
        if (arg0 == 0) {
            field3725++;
            return this.field3736[arg1];
        } else {
            return 15;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IZ)I")
    public final int method1719(int arg0, boolean arg1) {
        field3724++;
        int var3 = -64 % ((arg0 + 80) / 38);
        long var4 = class584.method3191(1);
        for (class149 var6 = arg1 ? (class149) this.field3728.method42((byte) 36) : (class149) this.field3728.method40(false); var6 != null; var6 = (class149) this.field3728.method40(false)) {
            if (var4 > (var6.field1920 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var6.field1920 & 0x4000000000000000L) != 0L) {
                    int var7 = (int) var6.field5499;
                    this.field3736[var7] = this.field3741[var7];
                    var6.method2438((byte) -51);
                    return var7;
                }
                var6.method2438((byte) -100);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "(III)V")
    public final void method1720(int arg0, int arg1, int arg2) {
        field3739++;
        this.field3741[arg1] = arg2;
        if (arg0 != 0) {
            this.method1714(1, 0, -11);
        }
        class149 var4 = (class149) this.field3728.method39((long) arg1, arg0 + 31750);
        if (var4 == null) {
            class149 var5 = new class149(4611686018427387905L);
            this.field3728.method38(var5, -127, (long) arg1);
        } else if (var4.field1920 != 4611686018427387905L) {
            var4.field1920 = class584.method3191(1) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "(III)V")
    public final void method1721(int arg0, int arg1, int arg2) {
        field3740++;
        class608 var4 = class388.field4971.method2183(arg0, -87);
        int var5 = var4.field8218;
        if (arg1 != 14972) {
            return;
        }
        int var6 = var4.field8221;
        int var7 = var4.field8217;
        int var8 = class416.field5342[var7 - var6];
        if (arg2 < 0 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method1720(0, var5, var9 & arg2 << var6 | ~var9 & this.field3741[var5]);
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZLoa;IIIIIII)V")
    public static final void method1722(boolean arg0, class43 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3738++;
        if (arg0) {
            method1722(true, null, 79, -116, -96, 18, 17, 27, -33);
        }
        class620 var9 = (class620) class549.method2909(arg7, arg8, arg6);
        if (var9 != null) {
            class698 var10 = class348.field4436.method1900(-109, var9.method76((byte) -115));
            int var11 = var9.method70(!arg0) & 0x3;
            int var12 = var9.method66((byte) -42);
            if (var10.field9621 == -1) {
                int var13 = arg3;
                if (var10.field9660 > 0) {
                    var13 = arg5;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg1.method372(4, 1, var13, arg4, arg2);
                    } else if (var11 == 1) {
                        arg1.method331(arg4, 1, 4, var13, arg2);
                    } else if (var11 == 2) {
                        arg1.method372(4, 1, var13, arg4, arg2 + 3);
                    } else if (var11 == 3) {
                        arg1.method331(arg4 + 3, 1, 4, var13, arg2);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg1.method400(var13, arg2, 1, (byte) 55, 1, arg4);
                    } else if (var11 == 1) {
                        arg1.method400(var13, arg2 + 3, 1, (byte) 60, 1, arg4);
                    } else if (var11 == 2) {
                        arg1.method400(var13, arg2 + 3, 1, (byte) 112, 1, arg4 + 3);
                    } else if (var11 == 3) {
                        arg1.method400(var13, arg2, 1, (byte) 31, 1, arg4 + 3);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg1.method331(arg4, 1, 4, var13, arg2);
                    } else if (var11 == 1) {
                        arg1.method372(4, 1, var13, arg4, arg2 + 3);
                    } else if (var11 == 2) {
                        arg1.method331(arg4 + 3, 1, 4, var13, arg2);
                    } else if (var11 == 3) {
                        arg1.method372(4, 1, var13, arg4, arg2);
                    }
                }
            } else {
                class3.method13(arg2, false, var10, arg1, arg4, var11);
            }
        }
        class620 var14 = (class620) class47.method432(arg7, arg8, arg6, field3743 == null ? (field3743 = method1723("ut")) : field3743);
        if (var14 != null) {
            class698 var15 = class348.field4436.method1900(-110, var14.method76((byte) -100));
            int var16 = var14.method70(true) & 0x3;
            int var17 = var14.method66((byte) -42);
            if (var15.field9621 != -1) {
                class3.method13(arg2, arg0, var15, arg1, arg4, var16);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field9660 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg1.method337(arg2, arg2 + 3, arg4, var18, arg4 + 3, -127);
                } else {
                    arg1.method337(arg2, arg2 + 3, arg4 + 3, var18, arg4, -127);
                }
            }
        }
        class620 var19 = (class620) class377.method2155(arg7, arg8, arg6);
        if (var19 == null) {
            return;
        }
        class698 var20 = class348.field4436.method1900(-107, var19.method76((byte) -97));
        int var21 = var19.method70(!arg0) & 0x3;
        if (var20.field9621 != -1) {
            class3.method13(arg2, false, var20, arg1, arg4, var21);
            return;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1723(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
