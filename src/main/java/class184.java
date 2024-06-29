import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class184 {

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public int field2761 = 16777215;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public int field2768 = 8;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "[I")
    public static int[] field2767 = new int[14];

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2771 = "Please remove ";

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "[S")
    public static short[] field2778 = new short[256];

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public int field2762;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public int field2765;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public int field2770;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public int field2773;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public int field2775;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "Z")
    public boolean field2774;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "[[[I")
    public static int[][][] field2766;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILlf;)V", line = 4)
    public final void method1269(int arg0, int arg1, class143 arg2) {
        field2776++;
        while (true) {
            int var4 = arg2.method1043(true);
            if (var4 == 0) {
                if (arg0 != 24344) {
                    this.field2774 = true;
                }
                return;
            }
            this.method1271(arg2, var4, arg1, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V", line = 41)
    public static final void method1270(boolean arg0) {
        if (!arg0) {
            class151.field2392.method383((byte) -48);
            class119.field1659.method383((byte) -48);
            field2763++;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Llf;IIB)V", line = 56)
    private final void method1271(class143 arg0, int arg1, int arg2, byte arg3) {
        if (arg1 == 1) {
            this.field2768 = arg0.method1051(1);
        } else if (arg1 == 2) {
            this.field2774 = true;
        } else if (arg1 == 3) {
            this.field2773 = arg0.method1021(-1);
            this.field2765 = arg0.method1021(-1);
            this.field2762 = arg0.method1021(-1);
        } else if (arg1 == 4) {
            this.field2775 = arg0.method1043(true);
        } else if (arg1 == 5) {
            this.field2770 = arg0.method1051(1);
        } else if (arg1 == 6) {
            this.field2761 = arg0.method1017((byte) 101);
        }
        if (arg3 < 105) {
            this.method1269(-15, -37, (class143) null);
        }
        field2769++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILnk;I)Lpa;", line = 107)
    public static final class2 method1272(int arg0, int arg1, class16 arg2, int arg3) {
        if (arg3 != 24) {
            field2767 = (int[]) null;
        }
        field2777++;
        return class102.method648(arg0, arg3 - 1000000024, arg1, arg2) ? class17.method129(-118) : null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 124)
    public static void method1273(int arg0) {
        field2771 = null;
        field2766 = (int[][][]) null;
        field2778 = null;
        if (arg0 == -19357) {
            field2767 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILlf;)V", line = 139)
    public static final void method1274(int arg0, class143 arg1) {
        field2764++;
        byte[] var2 = new byte[arg0];
        if (class49.field564 != null) {
            try {
                class49.field564.method459(-8874, 0L);
                int var3 = 0;
                class49.field564.method461(var2, -50);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg1.method1000(24, 0, var2, (byte) -106);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILnk;)V", line = 190)
    public static final void method1275(int arg0, class16 arg1) {
        field2772++;
        class276.field4350 = arg1;
        if (arg0 != 1) {
            field2778 = (short[]) null;
        }
    }
}
