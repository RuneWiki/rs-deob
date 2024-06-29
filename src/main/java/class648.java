import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class648 extends class139 {

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "I")
    public static int field8757;

    @OriginalMember(owner = "client!ev", name = "k", descriptor = "I")
    public static int field8758;

    @OriginalMember(owner = "client!ev", name = "l", descriptor = "I")
    public static int field8759;

    @OriginalMember(owner = "client!ev", name = "m", descriptor = "I")
    public static int field8760;

    @OriginalMember(owner = "client!ev", name = "n", descriptor = "I")
    public static int field8761;

    @OriginalMember(owner = "client!ev", name = "o", descriptor = "I")
    public static int field8762;

    @OriginalMember(owner = "client!ev", name = "p", descriptor = "I")
    public static int field8763;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZI)V", line = 4)
    public final void method153(boolean arg0, int arg1) {
        ++field8761;
        if (arg1 == 43) {
            ;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V", line = 15)
    public final void method149(int arg0) {
        if (arg0 < -4) {
            ++field8760;
        }
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lkea;)V", line = 25)
    public class648(class223 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IZ)V", line = 30)
    public final void method151(int arg0, boolean arg1) {
        ++field8763;
        if (arg0 == 43) {
            ;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(BILgl;)V", line = 40)
    public final void method150(byte arg0, int arg1, class562 arg2) {
        if (arg0 < 103) {
            this.method152(116);
        }
        ++field8758;
        super.field1681.method1349(arg2, false);
        super.field1681.method1328((byte) -126, arg1);
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(III)V", line = 53)
    public final void method148(int arg0, int arg1, int arg2) {
        ++field8757;
        if (arg0 != -2) {
            this.method153(false, -22);
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(CB)B", line = 68)
    public static final byte method3614(char arg0, byte arg1) {
        ++field8759;
        byte var2;
        if (arg0 > 0 && arg0 < 128 || ~arg0 <= -161 && arg0 <= 255) {
            var2 = (byte) arg0;
        } else if (~arg0 == -8365) {
            var2 = -128;
        } else if (~arg0 == -8219) {
            var2 = -126;
        } else if (~arg0 == -403) {
            var2 = -125;
        } else if (~arg0 != -8223) {
            if (arg0 != 8230) {
                if (~arg0 == -8225) {
                    var2 = -122;
                } else if (arg0 == 8225) {
                    var2 = -121;
                } else if (arg0 != 710) {
                    if (~arg0 == -8241) {
                        var2 = -119;
                    } else if (~arg0 == -353) {
                        var2 = -118;
                    } else if (~arg0 == -8250) {
                        var2 = -117;
                    } else if (arg0 == 338) {
                        var2 = -116;
                    } else if (~arg0 == -382) {
                        var2 = -114;
                    } else if (arg0 == 8216) {
                        var2 = -111;
                    } else if (~arg0 != -8218) {
                        if (~arg0 == -8221) {
                            var2 = -109;
                        } else if (arg0 != 8221) {
                            if (~arg0 != -8227) {
                                if (arg0 != 8211) {
                                    if (~arg0 != -8213) {
                                        if (arg0 != 732) {
                                            if (~arg0 == -8483) {
                                                var2 = -103;
                                            } else if (~arg0 == -354) {
                                                var2 = -102;
                                            } else if (~arg0 != -8251) {
                                                if (arg0 != 339) {
                                                    if (~arg0 == -383) {
                                                        var2 = -98;
                                                    } else if (arg0 == 376) {
                                                        var2 = -97;
                                                    } else {
                                                        var2 = 63;
                                                    }
                                                } else {
                                                    var2 = -100;
                                                }
                                            } else {
                                                var2 = -101;
                                            }
                                        } else {
                                            var2 = -104;
                                        }
                                    } else {
                                        var2 = -105;
                                    }
                                } else {
                                    var2 = -106;
                                }
                            } else {
                                var2 = -107;
                            }
                        } else {
                            var2 = -108;
                        }
                    } else {
                        var2 = -110;
                    }
                } else {
                    var2 = -120;
                }
            } else {
                var2 = -123;
            }
        } else {
            var2 = -124;
        }
        if (arg1 != -97) {
            method3614('\u001a', (byte) 73);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)Z", line = 193)
    public final boolean method152(int arg0) {
        ++field8762;
        int var2 = 26 % ((arg0 - 50) / 48);
        return false;
    }
}
