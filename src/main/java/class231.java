import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class231 {

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "Z")
    public boolean field4036 = true;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public int field4037 = -1;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    public int field4034 = 1190717;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public int field4035 = -1;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    public int field4046 = 0;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "Z")
    public boolean field4045 = true;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    public int field4042 = 16;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    public int field4039 = 8;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    public int field4047 = 128;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "Z")
    public boolean field4051 = false;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "Lhc;")
    public static class171 field4040 = new class171(50);

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "Z")
    public static boolean field4052 = false;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "Lud;")
    private static class279 field4053 = class130.method1024("shake:", 255);

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "Lud;")
    public static class279 field4050 = field4053;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "Lud;")
    public static class279 field4049 = field4053;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "[[[B")
    public static byte[][][] field4048;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZIILvh;)V", line = 6)
    private final void method1671(boolean arg0, int arg1, int arg2, class53 arg3) {
        if (arg2 == 1) {
            this.field4046 = class28.method258((byte) 14, arg3.method461((byte) 116));
        } else if (arg2 == 2) {
            this.field4035 = arg3.method483(-109);
        } else if (arg2 == 3) {
            this.field4035 = arg3.method468(28214);
            if (this.field4035 == 65535) {
                this.field4035 = -1;
            }
        } else if (arg2 == 5) {
            this.field4045 = false;
        } else if (arg2 == 7) {
            this.field4037 = class28.method258((byte) 14, arg3.method461((byte) 5));
        } else if (arg2 == 8) {
            class185.field3395 = arg1;
        } else if (arg2 == 9) {
            this.field4047 = arg3.method468(28214);
        } else if (arg2 == 10) {
            this.field4036 = false;
        } else if (arg2 == 11) {
            this.field4039 = arg3.method483(-110);
        } else if (arg2 == 12) {
            this.field4051 = true;
        } else if (arg2 == 13) {
            this.field4034 = arg3.method461((byte) -57);
        } else if (arg2 == 14) {
            this.field4042 = arg3.method483(-114);
        }
        field4044++;
        if (!arg0) {
            this.method1671(false, -4, -53, (class53) null);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V", line = 101)
    public static void method1672(byte arg0) {
        if (arg0 >= -112) {
            return;
        }
        field4048 = (byte[][][]) null;
        field4050 = null;
        field4049 = null;
        field4053 = null;
        field4040 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Lcg;", line = 115)
    public static final class42 method1673(int arg0) {
        field4038++;
        if (arg0 == 23293) {
            class238.field4173 = 0;
            return class233.method1682(-93);
        } else {
            return (class42) null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lvh;B)V", line = 132)
    public static final void method1674(class53 arg0, byte arg1) {
        field4043++;
        if (arg1 >= -27) {
            method1672((byte) 111);
        }
        if ((arg0.field1168.length - arg0.field1142) < 1) {
            return;
        }
        int var2 = arg0.method483(-103);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > arg0.field1168.length - arg0.field1142) {
            return;
        }
        class253.field4519 = arg0.method483(-123);
        if (class253.field4519 < 1) {
            class253.field4519 = 1;
        } else if (class253.field4519 > 4) {
            class253.field4519 = 4;
        }
        class70.method616((byte) 110, arg0.method483(-128) == 1);
        class289.field5158 = arg0.method483(-111) == 1;
        class202.field3608 = arg0.method483(-104) == 1;
        class29.field685 = arg0.method483(-128) == 1;
        class86.field1614 = arg0.method483(-118) == 1;
        class221.field3901 = arg0.method483(-117) == 1;
        class198.field3536 = arg0.method483(-124) == 1;
        class220.field3883 = arg0.method483(-114) == 1;
        class171.field3086 = arg0.method483(-114);
        if (class171.field3086 > 2) {
            class171.field3086 = 2;
        }
        if (var2 >= 2) {
            class126.field2340 = arg0.method483(-113) == 1;
        } else {
            class126.field2340 = arg0.method483(-118) == 1;
            arg0.method483(-117);
        }
        class162.field2929 = arg0.method483(-108) == 1;
        class68.field1335 = arg0.method483(-104) == 1;
        class141.field2566 = arg0.method483(-116);
        if (class141.field2566 > 2) {
            class141.field2566 = 2;
        }
        class232.field4062 = class141.field2566;
        class80.field1525 = arg0.method483(-126) == 1;
        class41.field875 = arg0.method483(-111);
        if (class41.field875 > 127) {
            class41.field875 = 127;
        }
        class113.field2073 = arg0.method483(-124);
        class3.field105 = arg0.method483(-121);
        if (class3.field105 > 127) {
            class3.field105 = 127;
        }
        if (var2 >= 1) {
            class236.field4121 = arg0.method468(28214);
            class239.field4218 = arg0.method468(28214);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method483(-123);
        }
        if (var2 >= 4) {
            int var4 = arg0.method483(-119);
            if (class274.field4867 < 96) {
                var4 = 0;
            }
            class208.method1530(var4);
        }
        if (var2 >= 5) {
            class293.field5224 = arg0.method453(1);
        }
        if (var2 >= 6) {
            class283.field5062 = arg0.method483(-106);
        }
        if (var2 >= 7) {
            class39.field853 = arg0.method483(-125) == 1;
        }
        if (var2 >= 8) {
            class292.field5204 = arg0.method483(-118) == 1;
        }
        if (var2 >= 9) {
            class50.field1029 = arg0.method483(-118);
        }
        if (var2 >= 10) {
            class177.field3185 = arg0.method483(-119) != 0;
        }
        if (var2 >= 11) {
            class307.field5448 = arg0.method483(-109) != 0;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILvh;I)V", line = 314)
    public final void method1675(int arg0, class53 arg1, int arg2) {
        field4041++;
        if (arg0 != -1) {
            method1674((class53) null, (byte) -56);
        }
        while (true) {
            int var4 = arg1.method483(arg0 - 108);
            if (var4 == 0) {
                return;
            }
            this.method1671(true, arg2, var4, arg1);
        }
    }
}
