import java.awt.Component;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class2 {

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "F")
    public float field71 = 1.0F;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "F")
    public float field68 = 1.0F;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "F")
    public float field78 = 0.25F;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public int field80;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "F")
    public float field73;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public int field81;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public int field74;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public int field85;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "F")
    public float field84;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
    public int field90;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public int field69;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "F")
    public float field77;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Lof;")
    public class223 field70;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "[I")
    public static int[] field72 = new int[1000];

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field76 = 0;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "[S")
    public static short[] field89 = new short[256];

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "Z")
    public static boolean field83;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IILnf;IIB)Ljava/awt/Frame;", line = 5)
    public static final Frame method8(int arg0, int arg1, class61 arg2, int arg3, int arg4, byte arg5) {
        field88++;
        if (!arg2.method479(0)) {
            return null;
        }
        if (arg1 == 0) {
            class267[] var6 = class77.method634(arg2, (byte) -29);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field4075 == arg3 && var6[var8].field4073 == arg4 && (arg0 == 0 || var6[var8].field4070 == arg0) && (!var7 || var6[var8].field4074 > arg1)) {
                    var7 = true;
                    arg1 = var6[var8].field4074;
                }
            }
            if (!var7) {
                return null;
            }
        }
        if (arg5 > 0) {
            field86 = 68;
        }
        class210 var9 = arg2.method491(arg4, -3174, arg0, arg1, arg3);
        while (var9.field3056 == 0) {
            class184.method1283(10L, 10);
        }
        Frame var10 = (Frame) var9.field3058;
        if (var10 == null) {
            return null;
        } else if (var9.field3056 == 2) {
            class220.method1604(arg2, var10, 123);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)V", line = 75)
    public static final void method9(int arg0, int arg1, int arg2) {
        if (arg0 == 8) {
            arg0 = 4;
        }
        field82++;
        if (arg1 != 10691) {
            return;
        }
        if (arg0 == 4 && !class267.field4078) {
            arg0 = 2;
            arg2 = 2;
        }
        if (class359.field5514 != arg0) {
            if (class249.field3700) {
                return;
            }
            if (class359.field5514 != 0) {
                class85.field1204[class359.field5514].method288();
            }
            if (arg0 != 0) {
                class163 var3 = class85.field1204[arg0];
                var3.method283();
                var3.method286(arg2);
            }
            class359.field5514 = arg0;
            class197.field2858 = arg2;
        } else if (arg0 != 0 && class197.field2858 != arg2) {
            class85.field1204[arg0].method286(arg2);
            class197.field2858 = arg2;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lsb;I)V", line = 124)
    public final void method10(class190 arg0, int arg1) {
        this.field68 = (float) (arg0.method1319(255) * 8) / 255.0F;
        field87++;
        this.field78 = (float) (arg0.method1319(255) * 8) / 255.0F;
        this.field71 = (float) (arg0.method1319(255) * 8) / 255.0F;
        int var3 = 33 % ((-arg1 - 40) / 48);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 140)
    public static void method11(int arg0) {
        field72 = null;
        if (arg0 < -100) {
            field89 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V", line = 236)
    public class2() {
        this.field80 = class222.field3338;
        this.field73 = 1.2F;
        this.field81 = -60;
        this.field74 = -50;
        this.field85 = class222.field3339;
        this.field84 = 0.69921875F;
        this.field90 = -50;
        this.field69 = 0;
        this.field77 = 1.1523438F;
        if (class48.field718 != null) {
            this.field70 = class223.method1634(class48.field718[0], class48.field718[1], class48.field718[2], class48.field718[3], class48.field718[4], class48.field718[5]);
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lsb;)V", line = 255)
    public class2(class190 arg0) {
        int var2 = arg0.method1319(255);
        if ((var2 & 0x1) == 0) {
            this.field85 = class222.field3339;
        } else {
            this.field85 = arg0.method1371(-4);
        }
        if ((var2 & 0x2) == 0) {
            this.field77 = 1.1523438F;
        } else {
            this.field77 = (float) arg0.method1317((byte) 90) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field84 = 0.69921875F;
        } else {
            this.field84 = (float) arg0.method1317((byte) 27) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field73 = 1.2F;
        } else {
            this.field73 = (float) arg0.method1317((byte) 48) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field81 = -60;
            this.field90 = -50;
            this.field74 = -50;
        } else {
            this.field90 = arg0.method1347((byte) 61);
            this.field81 = arg0.method1347((byte) 61);
            this.field74 = arg0.method1347((byte) 61);
        }
        if ((var2 & 0x20) == 0) {
            this.field80 = class222.field3338;
        } else {
            this.field80 = arg0.method1371(-4);
        }
        if ((var2 & 0x40) == 0) {
            this.field69 = 0;
        } else {
            this.field69 = arg0.method1317((byte) 2);
        }
        if ((var2 & 0x80) != 0) {
            this.field70 = class223.method1634(arg0.method1317((byte) 23), arg0.method1317((byte) 126), arg0.method1317((byte) 98), arg0.method1317((byte) 81), arg0.method1317((byte) 33), arg0.method1317((byte) 43));
        } else if (class48.field718 != null) {
            this.field70 = class223.method1634(class48.field718[0], class48.field718[1], class48.field718[2], class48.field718[3], class48.field718[4], class48.field718[5]);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BIILjava/awt/Component;)Lrk;", line = 158)
    public static final class137 method12(byte arg0, int arg1, int arg2, Component arg3) {
        field79++;
        try {
            Class var4 = Class.forName("vj");
            class137 var5 = (class137) var4.getDeclaredConstructor().newInstance();
            if (arg0 <= 9) {
                return (class137) null;
            } else {
                var5.method219((byte) 104, arg1, arg3, arg2);
                return var5;
            }
        } catch (Throwable var8) {
            class31 var7 = new class31();
            var7.method219((byte) 117, arg1, arg3, arg2);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V", line = 210)
    public static final void method13(int arg0, int arg1) {
        field75++;
        if (arg1 != -28507) {
            field89 = (short[]) null;
        }
        class356.field5456.method464(3398, arg0);
        class116.field1649.method464(3398, arg0);
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(III)J", line = 224)
    public static final long method14(int arg0, int arg1, int arg2) {
        class167 var3 = class302.field4502[arg0][arg1][arg2];
        return var3 == null || var3.field2412 == null ? 0L : var3.field2412.field1311;
    }
}
