import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public abstract class class311 extends class421 {

    @OriginalMember(owner = "client!lv", name = "n", descriptor = "Z")
    public boolean field4705 = false;

    @OriginalMember(owner = "client!lv", name = "m", descriptor = "Z")
    public boolean field4704 = false;

    @OriginalMember(owner = "client!lv", name = "o", descriptor = "I")
    public int field4706;

    @OriginalMember(owner = "client!lv", name = "s", descriptor = "I")
    public int field4710;

    @OriginalMember(owner = "client!lv", name = "l", descriptor = "I")
    public int field4703;

    @OriginalMember(owner = "client!lv", name = "i", descriptor = "S")
    public short field4700;

    @OriginalMember(owner = "client!lv", name = "h", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!lv", name = "j", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!lv", name = "k", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!lv", name = "p", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!lv", name = "q", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!lv", name = "r", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(II)V", line = 5)
    public static final void method1981(int arg0, int arg1) {
        class420.field6337 = 3;
        class310.field4697 = -1;
        field4701++;
        if (arg1 != 3746) {
            field4699 = 111;
        }
        class263.field4026 = arg0;
        class25.field383 = 100;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(ZIZILmv;ILmv;)I", line = 21)
    public static final int method1982(boolean arg0, int arg1, boolean arg2, int arg3, class255 arg4, int arg5, class255 arg6) {
        field4702++;
        if (arg1 != -27551) {
            field4699 = 86;
        }
        int var7 = class359.method2211(arg0, arg6, arg4, (byte) -57, arg5);
        if (var7 != 0) {
            return arg0 ? -var7 : var7;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var8 = class359.method2211(arg2, arg6, arg4, (byte) -57, arg3);
            return arg2 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lms;I)V", line = 58)
    public static final void method1983(class535 arg0, int arg1) {
        arg0.field7822 = 0;
        field4708++;
        if (arg0.field7800 != -1) {
            class57 var2 = class422.field6355.method236(arg0.field7800, (byte) -124);
            if (var2 == null || var2.field1202 == null) {
                arg0.field7781 = false;
                arg0.field7800 = -1;
            } else {
                label398: {
                    arg0.field7772++;
                    if (arg0.field7826 < var2.field1202.length && arg0.field7772 > var2.field1210[arg0.field7826]) {
                        arg0.field7770++;
                        arg0.field7826++;
                        arg0.field7772 = 1;
                        class433.method2602(var2, arg0.field6073, arg0.field6078, (byte) 124, arg0.field6084, arg0.field7826, class15.field266 == arg0);
                    }
                    if (arg0.field7826 >= var2.field1202.length) {
                        arg0.field7772 = 0;
                        arg0.field7826 = 0;
                        if (arg0.field7781) {
                            arg0.field7800 = arg0.method3169((byte) 23).method1171((byte) -126);
                            if (arg0.field7800 == -1) {
                                arg0.field7781 = false;
                                break label398;
                            }
                            var2 = class422.field6355.method236(arg0.field7800, (byte) -55);
                        }
                        class433.method2602(var2, arg0.field6073, arg0.field6078, (byte) 106, arg0.field6084, arg0.field7826, class15.field266 == arg0);
                    }
                    arg0.field7770 = arg0.field7826 + 1;
                    if (arg0.field7770 >= var2.field1202.length) {
                        arg0.field7770 = 0;
                    }
                }
            }
        }
        if (arg0.field7843 != -1 && class62.field1268 >= arg0.field7803) {
            class533 var3 = class514.field7469.method595(-12186, arg0.field7843);
            int var4 = var3.field7734;
            if (var4 == -1) {
                arg0.field7843 = -1;
            } else {
                label400: {
                    class57 var5 = class422.field6355.method236(var4, (byte) 109);
                    if (var3.field7738) {
                        if (var5.field1209 == 3) {
                            if (arg0.field7873 > 0 && class62.field1268 >= arg0.field7856 && class62.field1268 > arg0.field7827) {
                                arg0.field7843 = -1;
                                break label400;
                            }
                        } else if (var5.field1209 == 1 && arg0.field7873 > 0 && class62.field1268 >= arg0.field7856 && class62.field1268 > arg0.field7827) {
                            arg0.field7803 = class62.field1268 + 1;
                            break label400;
                        }
                    }
                    if (var5 == null || var5.field1202 == null) {
                        arg0.field7843 = -1;
                    } else {
                        if (arg0.field7767 < 0) {
                            arg0.field7767 = 0;
                            class433.method2602(var5, arg0.field6073, arg0.field6078, (byte) 41, arg0.field6084, 0, class15.field266 == arg0);
                        }
                        arg0.field7795++;
                        if (arg0.field7767 < var5.field1202.length && var5.field1210[arg0.field7767] < arg0.field7795) {
                            arg0.field7767++;
                            arg0.field7795 = 1;
                            class433.method2602(var5, arg0.field6073, arg0.field6078, (byte) 40, arg0.field6084, arg0.field7767, class15.field266 == arg0);
                        }
                        if (var5.field1202.length <= arg0.field7767) {
                            if (var3.field7738) {
                                arg0.field7767 -= var5.field1215;
                                arg0.field7846++;
                                if (var5.field1216 <= arg0.field7846) {
                                    arg0.field7843 = -1;
                                } else if (arg0.field7767 >= 0 && var5.field1202.length > arg0.field7767) {
                                    class433.method2602(var5, arg0.field6073, arg0.field6078, (byte) 66, arg0.field6084, arg0.field7767, class15.field266 == arg0);
                                } else {
                                    arg0.field7843 = -1;
                                }
                            } else {
                                arg0.field7843 = -1;
                            }
                        }
                        arg0.field7784 = arg0.field7767 + 1;
                        if (arg0.field7784 >= var5.field1202.length) {
                            if (var3.field7738) {
                                arg0.field7784 -= var5.field1215;
                                if (var5.field1216 <= (arg0.field7846 + 1)) {
                                    arg0.field7784 = -1;
                                } else if (arg0.field7784 < 0 || arg0.field7784 >= var5.field1202.length) {
                                    arg0.field7784 = -1;
                                }
                            } else {
                                arg0.field7784 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field7836 != -1 && arg0.field7780 <= class62.field1268) {
            class533 var6 = class514.field7469.method595(-12186, arg0.field7836);
            int var7 = var6.field7734;
            if (var7 == -1) {
                arg0.field7836 = -1;
            } else {
                label403: {
                    class57 var8 = class422.field6355.method236(var7, (byte) 24);
                    if (var6.field7738) {
                        if (var8.field1209 == 3) {
                            if (arg0.field7873 > 0 && class62.field1268 >= arg0.field7856 && class62.field1268 > arg0.field7827) {
                                arg0.field7836 = -1;
                                break label403;
                            }
                        } else if (var8.field1209 == 1 && arg0.field7873 > 0 && arg0.field7856 <= class62.field1268 && arg0.field7827 < class62.field1268) {
                            arg0.field7780 = class62.field1268 + 1;
                            break label403;
                        }
                    }
                    if (var8 == null || var8.field1202 == null) {
                        arg0.field7836 = -1;
                    } else {
                        if (arg0.field7799 < 0) {
                            arg0.field7799 = 0;
                            class433.method2602(var8, arg0.field6073, arg0.field6078, (byte) 120, arg0.field6084, 0, class15.field266 == arg0);
                        }
                        arg0.field7774++;
                        if (arg0.field7799 < var8.field1202.length && arg0.field7774 > var8.field1210[arg0.field7799]) {
                            arg0.field7774 = 1;
                            arg0.field7799++;
                            class433.method2602(var8, arg0.field6073, arg0.field6078, (byte) 45, arg0.field6084, arg0.field7799, class15.field266 == arg0);
                        }
                        if (arg0.field7799 >= var8.field1202.length) {
                            if (var6.field7738) {
                                arg0.field7799 -= var8.field1215;
                                arg0.field7855++;
                                if (arg0.field7855 >= var8.field1216) {
                                    arg0.field7836 = -1;
                                } else if (arg0.field7799 >= 0 && arg0.field7799 < var8.field1202.length) {
                                    class433.method2602(var8, arg0.field6073, arg0.field6078, (byte) 56, arg0.field6084, arg0.field7799, class15.field266 == arg0);
                                } else {
                                    arg0.field7836 = -1;
                                }
                            } else {
                                arg0.field7836 = -1;
                            }
                        }
                        arg0.field7842 = arg0.field7799 + 1;
                        if (arg0.field7842 >= var8.field1202.length) {
                            if (var6.field7738) {
                                arg0.field7842 -= var8.field1215;
                                if (var8.field1216 <= (arg0.field7855 + 1)) {
                                    arg0.field7842 = -1;
                                } else if (arg0.field7842 < 0 || arg0.field7842 >= var8.field1202.length) {
                                    arg0.field7842 = -1;
                                }
                            } else {
                                arg0.field7842 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field7768 != -1 && arg0.field7815 <= 1) {
            class57 var9 = class422.field6355.method236(arg0.field7768, (byte) 38);
            if (var9.field1209 == 3) {
                if (arg0.field7873 > 0 && class62.field1268 >= arg0.field7856 && arg0.field7827 < class62.field1268) {
                    arg0.field7768 = -1;
                }
            } else if (var9.field1209 == 1 && arg0.field7873 > 0 && arg0.field7856 <= class62.field1268 && class62.field1268 > arg0.field7827) {
                arg0.field7815 = 2;
            }
        }
        if (arg0.field7768 != -1 && arg0.field7815 == 0) {
            class57 var10 = class422.field6355.method236(arg0.field7768, (byte) 69);
            if (var10 == null || var10.field1202 == null) {
                arg0.field7768 = -1;
            } else {
                arg0.field7783++;
                if (arg0.field7793 < var10.field1202.length && arg0.field7783 > var10.field1210[arg0.field7793]) {
                    arg0.field7783 = 1;
                    arg0.field7793++;
                    class433.method2602(var10, arg0.field6073, arg0.field6078, (byte) 43, arg0.field6084, arg0.field7793, class15.field266 == arg0);
                }
                if (arg0.field7793 >= var10.field1202.length) {
                    arg0.field7830++;
                    arg0.field7793 -= var10.field1215;
                    if (var10.field1216 <= arg0.field7830) {
                        arg0.field7768 = -1;
                    } else if (arg0.field7793 >= 0 && arg0.field7793 < var10.field1202.length) {
                        class433.method2602(var10, arg0.field6073, arg0.field6078, (byte) 106, arg0.field6084, arg0.field7793, class15.field266 == arg0);
                    } else {
                        arg0.field7768 = -1;
                    }
                }
                arg0.field7837 = arg0.field7793 + 1;
                if (arg0.field7837 >= var10.field1202.length) {
                    arg0.field7837 -= var10.field1215;
                    if ((arg0.field7830 + 1) >= var10.field1216) {
                        arg0.field7837 = -1;
                    } else if (arg0.field7837 < 0 || var10.field1202.length <= arg0.field7837) {
                        arg0.field7837 = -1;
                    }
                }
                arg0.field7822 = var10.field1195;
            }
        }
        if (arg0.field7815 > 0) {
            arg0.field7815--;
        }
        int var11 = 39 / ((51 - arg1) / 38);
        for (int var12 = 0; var12 < arg0.field7802.length; var12++) {
            class452 var13 = arg0.field7802[var12];
            if (var13 != null) {
                if (var13.field6711 > 0) {
                    var13.field6711--;
                } else {
                    class57 var14 = class422.field6355.method236(var13.field6710, (byte) -87);
                    if (var14 == null || var14.field1202 == null) {
                        arg0.field7802[var12] = null;
                    } else {
                        var13.field6714++;
                        if (var14.field1202.length > var13.field6713 && var13.field6714 > var14.field1210[var13.field6713]) {
                            var13.field6713++;
                            var13.field6714 = 1;
                            class433.method2602(var14, arg0.field6073, arg0.field6078, (byte) 67, arg0.field6084, var13.field6713, class15.field266 == arg0);
                        }
                        if (var14.field1202.length <= var13.field6713) {
                            var13.field6715++;
                            var13.field6713 -= var14.field1215;
                            if (var13.field6715 >= var14.field1216) {
                                arg0.field7802[var12] = null;
                            } else if (var13.field6713 >= 0 && var13.field6713 < var14.field1202.length) {
                                class433.method2602(var14, arg0.field6073, arg0.field6078, (byte) 64, arg0.field6084, var13.field6713, class15.field266 == arg0);
                            } else {
                                arg0.field7802[var12] = null;
                            }
                        }
                        var13.field6706 = var13.field6713 + 1;
                        if (var14.field1202.length <= var13.field6706) {
                            var13.field6706 -= var14.field1215;
                            if (var14.field1216 <= var13.field6715 + 1) {
                                var13.field6706 = -1;
                            } else if (var13.field6706 < 0 || var14.field1202.length <= var13.field6706) {
                                var13.field6706 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(IIIIZZ)V", line = 492)
    public class311(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        this.field4706 = arg2;
        this.field4710 = arg0;
        this.field4704 = arg5;
        this.field4703 = arg1;
        this.field4700 = (short) arg3;
        this.field4705 = arg4;
    }
}
