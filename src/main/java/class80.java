import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class80 extends class11 {

    @OriginalMember(owner = "client!gm", name = "M", descriptor = "I")
    public static int field1222 = -1;

    @OriginalMember(owner = "client!gm", name = "L", descriptor = "Ldi;")
    public static class83 field1221 = new class83(32, 3);

    @OriginalMember(owner = "client!gm", name = "P", descriptor = "[Z")
    public static boolean[] field1225 = new boolean[5];

    @OriginalMember(owner = "client!gm", name = "G", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!gm", name = "H", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!gm", name = "I", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!gm", name = "J", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!gm", name = "K", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!gm", name = "N", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!gm", name = "O", descriptor = "[[B")
    public static byte[][] field1224;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "(II)V", line = 4)
    public static final void method647(int arg0, int arg1) {
        if (arg1 == 1) {
            ++field1223;
            class97 var2 = class348.method2064(arg0, 14, -36);
            var2.method710(-9237);
        }
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V", line = 19)
    public class80() {
        super(1, true);
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(Z)V", line = 22)
    public static void method648(boolean arg0) {
        field1225 = null;
        field1221 = null;
        if (!arg0) {
            field1221 = null;
        }
        field1224 = null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IC)B", line = 37)
    public static final byte method649(int arg0, char arg1) {
        ++field1217;
        if (arg0 <= 87) {
            method648(true);
        }
        byte var2;
        if ((arg1 <= 0 || ~arg1 <= -129) && (~arg1 > -161 || ~arg1 < -256)) {
            if (~arg1 != -8365) {
                if (~arg1 == -8219) {
                    var2 = -126;
                } else if (arg1 != 402) {
                    if (~arg1 != -8223) {
                        if (arg1 != 8230) {
                            if (~arg1 != -8225) {
                                if (arg1 == 8225) {
                                    var2 = -121;
                                } else if (~arg1 != -711) {
                                    if (~arg1 == -8241) {
                                        var2 = -119;
                                    } else if (arg1 != 352) {
                                        if (~arg1 == -8250) {
                                            var2 = -117;
                                        } else if (~arg1 != -339) {
                                            if (~arg1 != -382) {
                                                if (arg1 == 8216) {
                                                    var2 = -111;
                                                } else if (arg1 != 8217) {
                                                    if (arg1 != 8220) {
                                                        if (~arg1 != -8222) {
                                                            if (arg1 != 8226) {
                                                                if (arg1 == 8211) {
                                                                    var2 = -106;
                                                                } else if (~arg1 != -8213) {
                                                                    if (~arg1 != -733) {
                                                                        if (~arg1 != -8483) {
                                                                            if (arg1 != 353) {
                                                                                if (arg1 != 8250) {
                                                                                    if (arg1 == 339) {
                                                                                        var2 = -100;
                                                                                    } else if (arg1 != 382) {
                                                                                        if (~arg1 != -377) {
                                                                                            var2 = 63;
                                                                                        } else {
                                                                                            var2 = -97;
                                                                                        }
                                                                                    } else {
                                                                                        var2 = -98;
                                                                                    }
                                                                                } else {
                                                                                    var2 = -101;
                                                                                }
                                                                            } else {
                                                                                var2 = -102;
                                                                            }
                                                                        } else {
                                                                            var2 = -103;
                                                                        }
                                                                    } else {
                                                                        var2 = -104;
                                                                    }
                                                                } else {
                                                                    var2 = -105;
                                                                }
                                                            } else {
                                                                var2 = -107;
                                                            }
                                                        } else {
                                                            var2 = -108;
                                                        }
                                                    } else {
                                                        var2 = -109;
                                                    }
                                                } else {
                                                    var2 = -110;
                                                }
                                            } else {
                                                var2 = -114;
                                            }
                                        } else {
                                            var2 = -116;
                                        }
                                    } else {
                                        var2 = -118;
                                    }
                                } else {
                                    var2 = -120;
                                }
                            } else {
                                var2 = -122;
                            }
                        } else {
                            var2 = -123;
                        }
                    } else {
                        var2 = -124;
                    }
                } else {
                    var2 = -125;
                }
            } else {
                var2 = -128;
            }
        } else {
            var2 = (byte) arg1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(II)[I", line = 162)
    public final int[] method44(int arg0, int arg1) {
        ++field1218;
        int[] var3 = super.field158.method1312(arg1, (byte) 74);
        if (arg0 >= -42) {
            return null;
        } else {
            if (super.field158.field2966) {
                int[][] var4 = this.method49(arg1, 0, 113);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                for (int var8 = 0; ~var8 > ~class90.field1316; ++var8) {
                    var3[var8] = (var5[var8] + var7[var8] + var6[var8]) / 3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "(I)V", line = 202)
    public static final void method650(int arg0) {
        if (~class492.field7178 == -11) {
            class448.method2651(28, (byte) 112);
        }
        ++field1220;
        if (class492.field7178 == 30) {
            class448.method2651(25, (byte) 112);
        }
        if (arg0 != 3) {
            field1221 = null;
        }
    }
}
