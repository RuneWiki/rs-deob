import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class352 {

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public int field5620 = 128;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public int field5621 = 8;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "Z")
    public boolean field5629 = true;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public int field5636 = 1190717;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    public int field5634 = 0;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    public int field5633 = -1;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "Z")
    public boolean field5632 = true;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "Z")
    public boolean field5635 = false;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public int field5625 = 16;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public int field5626 = -1;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "F")
    public static float field5618;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "[Lbn;")
    public static class75[] field5622;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IBLoe;)V", line = 7)
    public final void method2505(int arg0, byte arg1, class146 arg2) {
        while (true) {
            int var4 = arg2.method1005((byte) 122);
            if (var4 == 0) {
                if (arg1 > -37) {
                    field5622 = (class75[]) null;
                }
                field5627++;
                return;
            }
            this.method2509(14, arg2, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 25)
    public static void method2506(int arg0) {
        if (arg0 != 1) {
            field5619 = -47;
        }
        field5622 = null;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V", line = 38)
    public static final void method2507(int arg0) {
        class209.field3490 = arg0;
        for (int var1 = 0; var1 < class224.field3701; var1++) {
            for (int var2 = 0; var2 < class280.field4578; var2++) {
                if (class353.field5644[arg0][var1][var2] == null) {
                    class353.field5644[arg0][var1][var2] = new class312(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 64)
    public static final void method2508(String arg0, int arg1, boolean arg2) {
        if (arg1 != 1190717) {
            method2506(49);
        }
        field5631++;
        if (!arg2) {
            try {
                class186.method1305(class59.field1164.field2658, false, "loggedout");
            } catch (Throwable var9) {
            }
            try {
                class248.field4065.getAppletContext().showDocument(new URL(class248.field4065.getCodeBase(), arg0), "_top");
            } catch (Exception var8) {
            }
            return;
        }
        if (class241.field4016 && class358.field5687) {
            try {
                class186.method1303("openjs", -10384, new Object[] { (new URL(class248.field4065.getCodeBase(), arg0)).toString() }, class59.field1164.field2658);
                return;
            } catch (Throwable var10) {
            }
        }
        try {
            class248.field4065.getAppletContext().showDocument(new URL(class248.field4065.getCodeBase(), arg0), "_blank");
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILoe;II)V", line = 114)
    private final void method2509(int arg0, class146 arg1, int arg2, int arg3) {
        if (arg0 != 14) {
            this.field5634 = 32;
        }
        field5624++;
        if (arg3 == 1) {
            this.field5634 = class167.method1190((byte) 41, arg1.method1025((byte) -66));
        } else if (arg3 == 2) {
            this.field5633 = arg1.method1005((byte) 122);
        } else if (arg3 == 3) {
            this.field5633 = arg1.method989(65);
            if (this.field5633 == 65535) {
                this.field5633 = -1;
            }
        } else if (arg3 == 5) {
            this.field5632 = false;
        } else if (arg3 == 7) {
            this.field5626 = class167.method1190((byte) 41, arg1.method1025((byte) -56));
        } else if (arg3 == 8) {
            class232.field3805 = arg2;
        } else if (arg3 == 9) {
            this.field5620 = arg1.method989(59);
        } else if (arg3 == 10) {
            this.field5629 = false;
        } else if (arg3 == 11) {
            this.field5621 = arg1.method1005((byte) 122);
        } else if (arg3 == 12) {
            this.field5635 = true;
        } else if (arg3 == 13) {
            this.field5636 = arg1.method1025((byte) -57);
        } else if (arg3 == 14) {
            this.field5625 = arg1.method1005((byte) 122);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([S[Ljava/lang/String;III)V", line = 181)
    public static final void method2510(short[] arg0, String[] arg1, int arg2, int arg3, int arg4) {
        if (arg2 < arg4) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg2;
            String var7 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var7;
            short var8 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var8;
            for (int var9 = arg2; var9 < arg4; var9++) {
                if (var7 == null || arg1[var9] != null && (var9 & 0x1) > arg1[var9].compareTo(var7)) {
                    String var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    short var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg1[arg4] = arg1[var6];
            arg1[var6] = var7;
            arg0[arg4] = arg0[var6];
            arg0[var6] = var8;
            method2510(arg0, arg1, arg2, 76, var6 - 1);
            method2510(arg0, arg1, var6 + 1, 113, arg4);
        }
        if (arg3 < 71) {
            field5618 = 0.41379717F;
        }
        field5630++;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIBZZ)V", line = 240)
    public static final void method2511(int arg0, int arg1, byte arg2, boolean arg3, boolean arg4) {
        if (arg2 > 4) {
            field5628++;
            class50.method445(127, arg4, 0, arg3, arg0, arg1, class162.field2728.length - 1);
        }
    }
}
