import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class92 {

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "Lgg;")
    private class114 field1170 = new class114(128);

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "Lkha;")
    private class687 field1171;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZI)V", line = 3)
    public static final void method631(boolean arg0, int arg1) {
        field1172++;
        class548 var2 = class696.method3872(arg1, 14, -1633381944);
        if (!arg0) {
            method635(-21, 57, -21, (byte) -80, null);
        }
        var2.method3127((byte) -92);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)V", line = 16)
    public final void method632(int arg0, int arg1) {
        if (arg1 != -19406) {
            this.field1170 = null;
        }
        class114 var3 = this.field1170;
        synchronized (this.field1170) {
            this.field1170.method775(arg1 ^ 0xFFFFB433, arg0);
        }
        field1176++;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)V", line = 30)
    public final void method633(boolean arg0) {
        field1175++;
        class114 var2 = this.field1170;
        synchronized (this.field1170) {
            if (arg0) {
                this.field1170.method776((byte) 58);
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(II)Lds;", line = 49)
    public final class15 method634(int arg0, int arg1) {
        field1174++;
        class114 var3 = this.field1170;
        class15 var4;
        synchronized (this.field1170) {
            var4 = (class15) this.field1170.method778((long) arg1, arg0 ^ 0x62);
        }
        if (var4 != null) {
            return var4;
        }
        class687 var5 = this.field1171;
        byte[] var6;
        synchronized (this.field1171) {
            var6 = this.field1171.method3810(1, -23360, arg1);
        }
        class15 var7 = new class15();
        if (var6 != null) {
            var7.method196((byte) 123, new class179(var6));
        }
        class114 var8 = this.field1170;
        synchronized (this.field1170) {
            this.field1170.method774((long) arg1, 81, var7);
            if (arg0 != 0) {
                this.method633(true);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIBLkba;)V", line = 81)
    public static final void method635(int arg0, int arg1, int arg2, byte arg3, class24 arg4) {
        field1169++;
        class459 var5 = arg4.method249(-80);
        int var6 = arg4.field371 - arg4.field336.field7217 & 0x3FFF;
        if (arg0 == -1) {
            if (var6 != 0 || arg4.field318 > 25) {
                if (arg2 < 0 && var5.field6448 != -1) {
                    arg4.field332 = var5.field6448;
                    arg4.field313 = false;
                } else if (arg2 <= 0 || var5.field6461 == -1) {
                    arg4.field332 = var5.field6429;
                } else {
                    arg4.field332 = var5.field6461;
                }
                arg4.field313 = false;
            } else if (!arg4.field313 || !var5.method2690(arg4.field332, 100)) {
                arg4.field332 = var5.method2687((byte) -81);
                arg4.field313 = arg4.field332 != -1;
            }
        } else if (arg4.field407 != -1 && var6 >= 10240 || var6 <= 2048) {
            int var7 = class40.field582[arg1] - arg4.field336.field7217 & 0x3FFF;
            if (arg0 == 2 && var5.field6425 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field6418 != -1) {
                    arg4.field332 = var5.field6418;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field6430 != -1) {
                    arg4.field332 = var5.field6430;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field6459 == -1) {
                    arg4.field332 = var5.field6425;
                } else {
                    arg4.field332 = var5.field6459;
                }
            } else if (arg0 == 0 && var5.field6447 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field6450 != -1) {
                    arg4.field332 = var5.field6450;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field6415 != -1) {
                    arg4.field332 = var5.field6415;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field6463 == -1) {
                    arg4.field332 = var5.field6447;
                } else {
                    arg4.field332 = var5.field6463;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field6445 != -1) {
                arg4.field332 = var5.field6445;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field6426 != -1) {
                arg4.field332 = var5.field6426;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field6457 == -1) {
                arg4.field332 = var5.field6429;
            } else {
                arg4.field332 = var5.field6457;
            }
            arg4.field313 = false;
        } else if (var6 == 0 && arg4.field318 <= 25) {
            if (arg0 == 2 && var5.field6425 != -1) {
                arg4.field332 = var5.field6425;
            } else if (arg0 == 0 && var5.field6447 != -1) {
                arg4.field332 = var5.field6447;
            } else {
                arg4.field332 = var5.field6429;
            }
            arg4.field313 = false;
        } else {
            arg4.field313 = false;
            if (arg0 == 2 && var5.field6425 != -1) {
                if (arg2 < 0 && var5.field6446 != -1) {
                    arg4.field332 = var5.field6446;
                } else if (arg2 <= 0 || var5.field6416 == -1) {
                    arg4.field332 = var5.field6425;
                } else {
                    arg4.field332 = var5.field6416;
                }
            } else if (arg0 == 0 && var5.field6447 != -1) {
                if (arg2 < 0 && var5.field6462 != -1) {
                    arg4.field332 = var5.field6462;
                } else if (arg2 <= 0 || var5.field6438 == -1) {
                    arg4.field332 = var5.field6447;
                } else {
                    arg4.field332 = var5.field6438;
                }
            } else if (arg2 < 0 && var5.field6443 != -1) {
                arg4.field332 = var5.field6443;
            } else if (arg2 <= 0 || var5.field6455 == -1) {
                arg4.field332 = var5.field6429;
            } else {
                arg4.field332 = var5.field6455;
            }
        }
        if (arg3 == -11) {
            ;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V", line = 246)
    public final void method636(byte arg0) {
        class114 var2 = this.field1170;
        synchronized (this.field1170) {
            if (arg0 <= 48) {
                this.method636((byte) -32);
            }
            this.field1170.method781((byte) 47);
        }
        field1173++;
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Ldh;ILkha;)V", line = 263)
    public class92(class286 arg0, int arg1, class687 arg2) {
        this.field1171 = arg2;
        this.field1171.method3812(0, 1);
    }
}
