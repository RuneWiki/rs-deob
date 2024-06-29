import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class193 {

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public int field3331 = -1;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public int field3326 = 0;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public int field3328 = -1;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Z")
    public boolean field3336 = true;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "Lmb;")
    public static class96 field3337 = class243.method1708("cookieprefix", (byte) 117);

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field3330 = 0;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Z")
    public static boolean field3332 = false;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "Lmb;")
    public static class96 field3338 = class243.method1708("Angreifen", (byte) 114);

    @OriginalMember(owner = "client!de", name = "q", descriptor = "Lmb;")
    public static class96 field3342 = class243.method1708("sch-Utteln:", (byte) 114);

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field3334 = 0;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Lw;")
    public static class107 field3329;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "Lgg;")
    public static class58 field3340;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
    public static final byte[] method1345(int arg0, boolean arg1, Object arg2) {
        field3327++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class233.method1581((byte) -38, var3) : var3;
        } else if (arg2 instanceof class65) {
            class65 var4 = (class65) arg2;
            return var4.method454(20256);
        } else {
            if (arg0 <= 53) {
                method1347(113);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IBI)V")
    public static final void method1346(int arg0, byte arg1, int arg2) {
        field3333++;
        class140.field2505.method1012((byte) 68, 241);
        class103.field1739++;
        class140.field2505.method1653(-157537144, arg2);
        class140.field2505.method1675(arg0, 105);
        if (arg1 > -17) {
            method1345(-57, true, (Object) null);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static final void method1347(int arg0) {
        field3335++;
        if (class6.field129 == 0) {
            return;
        }
        try {
            if (++class21.field344 > 1500) {
                if (class211.field3638 != null) {
                    class211.field3638.method1605(arg0 + 86);
                    class211.field3638 = null;
                }
                if (class135.field2431 >= 1) {
                    class25.field424 = -5;
                    class6.field129 = 0;
                    return;
                }
                class135.field2431++;
                class6.field129 = 1;
                if (class47.field841 == class208.field3582) {
                    class208.field3582 = class124.field2303;
                } else {
                    class208.field3582 = class47.field841;
                }
                class21.field344 = 0;
            }
            if (arg0 != 0) {
                method1348(-33);
            }
            if (class6.field129 == 1) {
                class216.field3722 = class234.field4017.method942(class208.field3582, class27.field446, arg0 ^ 0xB);
                class6.field129 = 2;
            }
            if (class6.field129 == 2) {
                if (class216.field3722.field4605 == 2) {
                    throw new IOException();
                }
                if (class216.field3722.field4605 != 1) {
                    return;
                }
                class211.field3638 = new class236((Socket) class216.field3722.field4604, class234.field4017);
                class216.field3722 = null;
                class211.field3638.method1599(true, class140.field2505.field4124, class140.field2505.field4144, 0);
                if (class20.field335 != null) {
                    class20.field335.method536((byte) 14);
                }
                if (class80.field1362 != null) {
                    class80.field1362.method536((byte) 14);
                }
                int var1 = class211.field3638.method1604((byte) 78);
                if (class20.field335 != null) {
                    class20.field335.method536((byte) 14);
                }
                if (class80.field1362 != null) {
                    class80.field1362.method536((byte) 14);
                }
                if (var1 != 101) {
                    class6.field129 = 0;
                    class25.field424 = var1;
                    class211.field3638.method1605(69);
                    class211.field3638 = null;
                    return;
                }
                class6.field129 = 3;
            }
            if (class6.field129 == 3 && class211.field3638.method1598(0) >= 2) {
                int var2 = class211.field3638.method1604((byte) 78) << 8 | class211.field3638.method1604((byte) 78);
                class143.method1061(var2, 128);
                if (class235.field4032 == -1) {
                    class25.field424 = 6;
                    class6.field129 = 0;
                    class211.field3638.method1605(arg0 ^ 0xFFFFFF8A);
                    class211.field3638 = null;
                } else {
                    class6.field129 = 0;
                    class211.field3638.method1605(-101);
                    class211.field3638 = null;
                    class128.method974((byte) 50);
                }
            }
        } catch (IOException var3) {
            if (class211.field3638 != null) {
                class211.field3638.method1605(120);
                class211.field3638 = null;
            }
            if (class135.field2431 < 1) {
                class135.field2431++;
                class6.field129 = 1;
                if (class47.field841 == class208.field3582) {
                    class208.field3582 = class124.field2303;
                } else {
                    class208.field3582 = class47.field841;
                }
                class21.field344 = 0;
            } else {
                class25.field424 = -4;
                class6.field129 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
    public static void method1348(int arg0) {
        field3342 = null;
        field3337 = null;
        if (arg0 != 5) {
            method1345(87, true, (Object) null);
        }
        field3329 = null;
        field3340 = null;
        field3338 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IILrg;I)V")
    private final void method1349(int arg0, int arg1, class239 arg2, int arg3) {
        field3339++;
        if (arg1 == 1) {
            this.field3326 = class20.method148((byte) -31, arg2.method1660(-335289648));
        } else if (arg1 == 2) {
            this.field3328 = arg2.method1651(arg0 ^ 0xFFFFCFEC);
        } else if (arg1 == 3) {
            this.field3328 = arg2.method1663((byte) -94);
            if (this.field3328 == 65535) {
                this.field3328 = -1;
            }
        } else if (arg1 == 5) {
            this.field3336 = false;
        } else if (arg1 == 7) {
            this.field3331 = class20.method148((byte) -31, arg2.method1660(-335289648));
        } else if (arg1 == 8) {
            class20.field328 = arg3;
        } else if (arg1 == 9) {
            arg2.method1663((byte) 108);
        } else if (arg1 != 10) {
            if (arg1 == 11) {
                arg2.method1651(4139);
            } else if (arg1 != 12) {
                if (arg1 == 13) {
                    arg2.method1660(-335289648);
                } else if (arg1 == 14) {
                    arg2.method1651(4139);
                }
            }
        }
        if (arg0 != -8249) {
            field3338 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILrg;B)V")
    public final void method1350(int arg0, class239 arg1, byte arg2) {
        while (true) {
            int var4 = arg1.method1651(4139);
            if (var4 == 0) {
                field3341++;
                if (arg2 <= 0) {
                    field3342 = null;
                    return;
                }
                return;
            }
            this.method1349(-8249, var4, arg1, arg0);
        }
    }
}
