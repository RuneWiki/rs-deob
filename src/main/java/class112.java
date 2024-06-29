import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class112 {

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public int field1364 = 16;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public int field1362 = 8;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Z")
    public boolean field1365 = true;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public int field1363 = 1190717;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "Z")
    public boolean field1370 = true;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public int field1373 = -1;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public int field1368 = 128;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public int field1378 = -1;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public int field1375 = 0;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public int field1382 = 127;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public int field1366 = -1;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "Z")
    public boolean field1381 = false;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "Lsd;")
    public static class74 field1371 = new class74(6, 8);

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    public static int field1379 = 0;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public int field1372;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "Lkh;")
    public class75 field1376;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static void method535(int arg0) {
        if (arg0 != 2) {
            field1371 = null;
        }
        field1371 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)I")
    public static final int method536(int arg0, int arg1, int arg2) {
        field1374++;
        return ~arg0 == arg2 || arg0 == 3 ? class208.field2887[arg1 & 0x3] : class184.field2403[arg1 & 0x3];
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lvt;II)V")
    private final void method537(class179 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1375 = class200.method1096(arg0.method899((byte) -40), -1);
        } else if (arg1 == 2) {
            this.field1366 = arg0.method895((byte) -73);
        } else if (arg1 == 3) {
            this.field1366 = arg0.method916(21933);
            if (this.field1366 == 65535) {
                this.field1366 = -1;
            }
        } else if (arg1 == 5) {
            this.field1370 = false;
        } else if (arg1 == 7) {
            this.field1373 = class200.method1096(arg0.method899((byte) 120), -1);
        } else if (arg1 == 8) {
            this.field1376.field910 = this.field1372;
        } else if (arg1 == 9) {
            this.field1368 = arg0.method916(21933);
        } else if (arg1 == 10) {
            this.field1365 = false;
        } else if (arg1 == 11) {
            this.field1362 = arg0.method895((byte) -127);
        } else if (arg1 == 12) {
            this.field1381 = true;
        } else if (arg1 == 13) {
            this.field1363 = arg0.method899((byte) 125);
        } else if (arg1 == 14) {
            this.field1364 = arg0.method895((byte) -78);
        } else if (arg1 == 15) {
            this.field1378 = arg0.method916(arg2 + 21948);
            if (this.field1378 == 65535) {
                this.field1378 = -1;
            }
        } else if (arg1 == 16) {
            this.field1382 = arg0.method895((byte) -87);
        }
        field1369++;
        if (arg2 != -15) {
            this.method539(true, (class179) null);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
    public final void method538(int arg0) {
        if (this.field1378 == -1) {
            this.field1378 = this.field1366;
        }
        field1380++;
        int var2 = -53 / ((-arg0 - 22) / 49);
        this.field1362 = this.field1372 | this.field1362 << 8;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZLvt;)V")
    public final void method539(boolean arg0, class179 arg1) {
        if (arg0) {
            return;
        }
        field1377++;
        while (true) {
            int var3 = arg1.method895((byte) -115);
            if (var3 == 0) {
                return;
            }
            this.method537(arg1, var3, -15);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method540(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field1367++;
        if (arg5 >= -10) {
            return;
        }
        if (arg7 >= class75.field912 && class453.field6396 >= arg3 && arg4 >= class357.field5123 && arg1 <= class328.field4729) {
            class251.method1555(arg1, arg7, arg2, arg3, arg0, arg6, (byte) 100, arg4);
        } else {
            class227.method1254(arg4, arg7, arg0, arg1, arg6, arg3, -32659, arg2);
        }
    }
}
