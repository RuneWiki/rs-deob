import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class63 extends class16 {

    @OriginalMember(owner = "client!il", name = "W", descriptor = "I")
    private int field827 = 0;

    @OriginalMember(owner = "client!il", name = "cb", descriptor = "I")
    private int field833 = 4096;

    @OriginalMember(owner = "client!il", name = "Y", descriptor = "[[Z")
    public static boolean[][] field829 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!il", name = "ab", descriptor = "Z")
    public static boolean field831 = true;

    @OriginalMember(owner = "client!il", name = "Q", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!il", name = "R", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!il", name = "S", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!il", name = "T", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!il", name = "U", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!il", name = "V", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!il", name = "Z", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!il", name = "bb", descriptor = "Lkb;")
    public static class39 field832;

    @OriginalMember(owner = "client!il", name = "X", descriptor = "[Lfj;")
    public static class254[] field828;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "(B)V", line = 7)
    public static void method422(byte arg0) {
        field828 = null;
        field832 = null;
        field829 = (boolean[][]) null;
        if (arg0 < 120) {
            method424(-16, 49, 85, (class320) null, 4);
        }
    }

    @OriginalMember(owner = "client!il", name = "f", descriptor = "(B)V", line = 20)
    public static final void method423(byte arg0) {
        if (class247.field3933 != -1) {
            class92.method665(-1, class247.field3933, arg0 - 28223, -1);
            class247.field3933 = -1;
        }
        if (arg0 != 95) {
            method425(-77, false, -63);
        }
        field824++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIILc;I)V", line = 41)
    public static final void method424(int arg0, int arg1, int arg2, class320 arg3, int arg4) {
        field830++;
        if (class13.field159 == arg3 || class126.field1887 >= 400) {
            return;
        }
        String var5;
        if (arg3.field5024 == 0) {
            boolean var6 = true;
            if (class13.field159.field4995 != -1 && arg3.field4995 != -1) {
                int var7 = class13.field159.field4994 > arg3.field4994 ? class13.field159.field4994 : arg3.field4994;
                int var8 = arg3.field4995 <= class13.field159.field4995 ? arg3.field4995 : class13.field159.field4995;
                int var9 = var8 + (var7 * 10 / 100) + 5;
                int var10 = class13.field159.field4994 - arg3.field4994;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var9 < var10) {
                    var6 = false;
                }
            }
            String var11 = class20.field290 == 1 ? class287.field4529 : class292.field4600;
            if (arg3.field4994 >= arg3.field5002) {
                var5 = arg3.method2240((byte) 115) + (var6 ? class243.method1724(arg3.field4994, class13.field159.field4994, -119) : "<col=ffffff>") + " (" + var11 + arg3.field4994 + ")";
            } else {
                var5 = arg3.method2240((byte) 115) + (var6 ? class243.method1724(arg3.field4994, class13.field159.field4994, arg0 - 817) : "<col=ffffff>") + " (" + var11 + arg3.field4994 + "+" + (arg3.field5002 - arg3.field4994) + ")";
            }
        } else {
            var5 = arg3.method2240((byte) 115) + " (" + class198.field3252 + arg3.field5024 + ")";
        }
        if (class49.field676 == 1) {
            class258.field4088++;
            class22.method142(class198.field3248, (short) 34, arg4, arg0 ^ 0xFFFFFD3E, arg1, class318.field4930 + " -> <col=ffffff>" + var5, class138.field2068, (long) arg2);
        } else if (!class313.field4874) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class299.field4667[var12] != null) {
                    short var13 = 0;
                    if (class20.field290 == 0 && class299.field4667[var12].equalsIgnoreCase(class305.field4758)) {
                        if (arg3.field4994 > class13.field159.field4994) {
                            var13 = 2000;
                        }
                        if (class13.field159.field4992 != 0 && arg3.field4992 != 0) {
                            if (class13.field159.field4992 == arg3.field4992) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class131.field1939[var12]) {
                        var13 = 2000;
                    }
                    boolean var14 = false;
                    class175.field2842++;
                    short var15 = class77.field1173[var12];
                    short var16 = (short) (var13 + var15);
                    class22.method142(class86.field1309[var12], var16, arg4, arg0 - 665, arg1, "<col=ffffff>" + var5, class299.field4667[var12], (long) arg2);
                }
            }
        } else if ((class26.field374 & 0x8) != 0) {
            class235.field3733++;
            class22.method142(class24.field344, (short) 18, arg4, arg0 - 578, arg1, class315.field4903 + " -> <col=ffffff>" + var5, class282.field4458, (long) arg2);
        }
        if (arg0 != 690) {
            field828 = (class254[]) null;
        }
        for (int var17 = 0; var17 < class126.field1887; var17++) {
            if (class50.field686[var17] == 29) {
                class147.field2199[var17] = "<col=ffffff>" + var5;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IZI)Ljava/lang/String;", line = 174)
    public static final String method425(int arg0, boolean arg1, int arg2) {
        field823++;
        if (arg2 == -20297) {
            return arg1 && arg0 >= 0 ? class160.method1102(10, arg0, arg1, -117) : Integer.toString(arg0);
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(CI)Z", line = 196)
    public static final boolean method426(char arg0, int arg1) {
        if (arg1 < 32) {
            return false;
        }
        field825++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lkb;I)V", line = 218)
    public static final void method427(class39 arg0, int arg1) {
        class327.field5099 = arg0;
        field821++;
        if (arg1 != 4096) {
            field829 = (boolean[][]) ((boolean[][]) null);
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V", line = 233)
    public class63() {
        super(1, true);
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(ZI)[I", line = 237)
    public final int[] method8(boolean arg0, int arg1) {
        field826++;
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        if (!arg0) {
            method424(91, 1, -85, (class320) null, 103);
        }
        if (this.field207.field4024) {
            int[] var4 = this.method103(0, 4389, arg1);
            for (int var5 = 0; var5 < class276.field4376; var5++) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field827 && this.field833 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BLim;I)V", line = 282)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        if (arg2 == 0) {
            this.field827 = arg1.method1396(-23);
        } else if (arg2 == 1) {
            this.field833 = arg1.method1396(-65);
        }
        if (arg0 != -7) {
            this.method52((byte) 123, (class192) null, -125);
        }
        field822++;
    }
}
