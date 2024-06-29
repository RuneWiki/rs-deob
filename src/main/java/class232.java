import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class232 {

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "B")
    private byte field4040;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public int field4024;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public int field4032;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public int field4030;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public int field4028;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public int field4035;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field4026 = 0;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "Lcb;")
    public static class231 field4031 = new class231(0, 0);

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "[I")
    public static int[] field4037 = new int[2];

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "Leb;")
    public static class230 field4041 = class68.method589(0, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static final void method1638(int arg0) {
        field4029++;
        if (class231.field4018 == 0) {
            return;
        }
        try {
            if (++class37.field698 > 1500) {
                if (class30.field556 != null) {
                    class30.field556.method1818(-2);
                    class30.field556 = null;
                }
                if (class191.field3378 >= 1) {
                    class159.field2831 = -5;
                    class231.field4018 = 0;
                    return;
                }
                class191.field3378++;
                class231.field4018 = 1;
                if (class244.field4193 == class231.field4019) {
                    class231.field4019 = class95.field1723;
                } else {
                    class231.field4019 = class244.field4193;
                }
                class37.field698 = 0;
            }
            if (class231.field4018 == 1) {
                class53.field909 = class184.field3228.method1024((byte) -65, class146.field2629, class231.field4019);
                class231.field4018 = 2;
            }
            if (class231.field4018 == 2) {
                if (class53.field909.field3421 == 2) {
                    throw new IOException();
                }
                if (class53.field909.field3421 != 1) {
                    return;
                }
                class30.field556 = new class261((Socket) class53.field909.field3423, class184.field3228);
                class53.field909 = null;
                class30.field556.method1817(class153.field2747.field269, 0, -12152, class153.field2747.field318);
                if (class92.field1659 != null) {
                    class92.field1659.method1072(-122);
                }
                if (class133.field2414 != null) {
                    class133.field2414.method1072(-127);
                }
                int var1 = class30.field556.method1814(0);
                if (class92.field1659 != null) {
                    class92.field1659.method1072(arg0 ^ 0x50BD);
                }
                if (class133.field2414 != null) {
                    class133.field2414.method1072(-128);
                }
                if (var1 != 101) {
                    class231.field4018 = 0;
                    class159.field2831 = var1;
                    class30.field556.method1818(arg0 + 20672);
                    class30.field556 = null;
                    return;
                }
                class231.field4018 = 3;
            }
            if (arg0 != -20674) {
                field4026 = 83;
            }
            if (class231.field4018 == 3 && class30.field556.method1816(0) >= 2) {
                int var2 = class30.field556.method1814(0) << 8 | class30.field556.method1814(0);
                class150.method1133(var2, 30621);
                if (class7.field92 == -1) {
                    class7.field92 = class269.field4771;
                }
                class231.field4018 = 0;
                class30.field556.method1818(-2);
                class30.field556 = null;
                class92.method779(true);
            }
        } catch (IOException var3) {
            if (class30.field556 != null) {
                class30.field556.method1818(-2);
                class30.field556 = null;
            }
            if (class191.field3378 < 1) {
                class231.field4018 = 1;
                if (class244.field4193 == class231.field4019) {
                    class231.field4019 = class95.field1723;
                } else {
                    class231.field4019 = class244.field4193;
                }
                class191.field3378++;
                class37.field698 = 0;
            } else {
                class231.field4018 = 0;
                class159.field2831 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lfk;II)Leb;")
    public static final class230 method1639(class14 arg0, int arg1, int arg2) {
        field4036++;
        try {
            class230 var3 = new class230();
            var3.field3990 = arg0.method202(26);
            if (arg2 < var3.field3990) {
                var3.field3990 = arg2;
            }
            var3.field3988 = new byte[var3.field3990];
            arg0.field318 += class260.field4631.method1649(var3.field3990, arg0.field318, arg0.field269, var3.field3988, arg1, -11752);
            return var3;
        } catch (Exception var4) {
            return class123.field2165;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)Loa;")
    public static final class97 method1640(int arg0, int arg1) {
        class97 var2 = (class97) class205.field3613.method1125((long) arg1, true);
        field4033++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 >= -52) {
            method1639((class14) null, 45, 55);
        }
        byte[] var3 = class13.field265.method1546(class182.method1310((byte) 126, arg1), (byte) -100, class155.method1182(arg1, 30453));
        class97 var4 = new class97();
        var4.field1751 = arg1;
        if (var3 != null) {
            var4.method827(-5, new class14(var3));
        }
        var4.method824(-1);
        class205.field3613.method1129((long) arg1, true, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public static void method1641(byte arg0) {
        field4037 = null;
        field4031 = null;
        field4041 = null;
        if (arg0 <= 77) {
            field4041 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)I")
    public static final int method1642(int arg0, int arg1) {
        field4034++;
        if (!(arg0 < 65 || arg0 > 90) || !(arg0 < 192 || arg0 > 222 || arg0 == 215)) {
            return arg0 + 32;
        } else if (arg0 == 159) {
            return 255;
        } else if (arg1 == -91) {
            return arg0 == 140 ? 156 : arg0;
        } else {
            return 124;
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)I")
    public final int method1643(int arg0) {
        if (arg0 < 59) {
            return -105;
        } else {
            field4038++;
            return this.field4040 & 0x7;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V")
    public static final void method1644(boolean arg0) {
        field4027++;
        if (arg0) {
            method1639((class14) null, -83, 93);
        }
        class243.field4169.method1124(0);
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)I")
    public final int method1645(int arg0) {
        field4039++;
        if (arg0 != 8) {
            field4041 = null;
        }
        return (this.field4040 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
    public class232() {
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lfk;)V")
    public class232(class14 arg0) {
        this.field4040 = arg0.method198(false);
        this.field4024 = arg0.method161(4);
        this.field4032 = arg0.method187((byte) 61);
        this.field4030 = arg0.method187((byte) 61);
        this.field4028 = arg0.method187((byte) 61);
        this.field4035 = arg0.method187((byte) 61);
    }
}
