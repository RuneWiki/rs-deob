import java.awt.Frame;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class66 extends class46 {

    @OriginalMember(owner = "client!b", name = "J", descriptor = "[I")
    public static int[] field855 = new int[50];

    @OriginalMember(owner = "client!b", name = "F", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!b", name = "K", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!b", name = "L", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!b", name = "N", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!b", name = "O", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!b", name = "P", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "I")
    public int field862;

    @OriginalMember(owner = "client!b", name = "T", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!b", name = "V", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!b", name = "S", descriptor = "Llc;")
    public class176 field863;

    @OriginalMember(owner = "client!b", name = "U", descriptor = "Lkb;")
    public static class39 field865;

    @OriginalMember(owner = "client!b", name = "W", descriptor = "[B")
    public byte[] field867;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V", line = 6)
    public static void method431(boolean arg0) {
        field855 = null;
        if (arg0) {
            method434(-77, (Random) null, 76);
        }
        field865 = null;
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(B)[B", line = 18)
    public final byte[] method308(byte arg0) {
        field859++;
        if (this.field624) {
            throw new RuntimeException();
        } else if (arg0 <= 73) {
            return (byte[]) null;
        } else {
            return this.field867;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/awt/Frame;Lgn;B)V", line = 41)
    public static final void method432(Frame arg0, class6 arg1, byte arg2) {
        if (arg2 != 108) {
            field865 = (class39) null;
        }
        field866++;
        while (true) {
            class217 var3 = arg1.method33(arg0, -18369);
            while (var3.field3488 == 0) {
                class20.method128(0, 10L);
            }
            if (var3.field3488 == 1) {
                arg0.setVisible(false);
                arg0.dispose();
                return;
            }
            class20.method128(0, 100L);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IILek;Z)V", line = 68)
    public static final void method433(int arg0, int arg1, class196 arg2, boolean arg3) {
        field854++;
        if (arg2.field1968 == arg1 && arg1 != -1) {
            class80 var4 = class37.method236(arg1, 20254);
            int var5 = var4.field1207;
            if (var5 == 1) {
                arg2.field2002 = arg0;
                arg2.field1960 = 1;
                arg2.field1955 = 0;
                arg2.field1948 = 0;
                arg2.field2023 = 0;
                class253.method1789(19080, arg2.field1944, var4, arg2.field1948, arg2.field1980, false);
            }
            if (var5 == 2) {
                arg2.field2023 = 0;
            }
        } else if (arg1 == -1 || arg2.field1968 == -1 || class37.method236(arg1, 20254).field1197 >= class37.method236(arg2.field1968, 20254).field1197) {
            arg2.field1948 = 0;
            arg2.field2023 = 0;
            arg2.field2001 = arg2.field1951;
            arg2.field1955 = 0;
            arg2.field1960 = 1;
            arg2.field1968 = arg1;
            arg2.field2002 = arg0;
            if (arg2.field1968 != -1) {
                class253.method1789(19080, arg2.field1944, class37.method236(arg2.field1968, 20254), arg2.field1948, arg2.field1980, false);
            }
        }
        if (!arg3) {
            method436(-105, (byte) 77);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILjava/util/Random;I)I", line = 126)
    public static final int method434(int arg0, Random arg1, int arg2) {
        field857++;
        if (arg2 != -27852) {
            field865 = (class39) null;
        }
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class224.method1638((byte) 103, arg0)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var3 <= var4);
            return class214.method1567(-22, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)I", line = 155)
    public final int method311(int arg0) {
        field860++;
        if (this.field624) {
            return 0;
        } else if (arg0 > -84) {
            return 120;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(I)V", line = 176)
    public static final void method435(int arg0) {
        if (arg0 > -42) {
            field855 = (int[]) null;
        }
        field858++;
        class188.method1328(0, 0, (byte) 115);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)V", line = 189)
    public static final void method436(int arg0, byte arg1) {
        if (class80.field1224 == null || class80.field1224.length < arg0) {
            class80.field1224 = new int[arg0];
        }
        field861++;
        if (arg1 != -104) {
            field855 = (int[]) null;
        }
    }
}
