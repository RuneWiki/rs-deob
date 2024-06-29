import java.awt.Canvas;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class335 {

    @OriginalMember(owner = "client!h", name = "a", descriptor = "Lcs;")
    public static class351 field4586 = new class351(10, 2);

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field4599 = 13156520;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public static int field4600 = 0;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public int field4594;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    private int field4595;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public int field4601;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "Lqs;")
    public class222 field4587;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Lws;")
    public static class38 field4590;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)Lua;", line = 3)
    public final synchronized class140 method1990(int arg0) {
        field4589++;
        class140 var2 = (class140) this.field4587.field3129.method659((long) this.field4595, (byte) -1);
        if (var2 != null) {
            return var2;
        }
        class140 var3 = class140.method854(this.field4587.field3122, this.field4595, 0);
        if (arg0 == 2) {
            if (var3 != null) {
                this.field4587.field3129.method653(arg0 + 77, (long) this.field4595, var3);
            }
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V", line = 23)
    public static void method1991(byte arg0) {
        field4590 = null;
        int var1 = 51 / ((arg0 + 70) / 53);
        field4586 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lve;", line = 33)
    public static final class411 method1992(Canvas arg0, byte arg1) {
        field4596++;
        try {
            Class var2 = Class.forName("gq");
            class411 var3 = (class411) var2.getDeclaredConstructor().newInstance();
            if (arg1 < 1) {
                method1995((class343) null, false);
            }
            var3.method1619(false, arg0);
            return var3;
        } catch (Throwable var5) {
            class261 var4 = new class261();
            var4.method1619(false, arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V", line = 64)
    public static final void method1993(byte arg0) {
        field4593++;
        if (class73.field1058 == 0) {
            return;
        }
        try {
            if ((++class255.field3579) > 2000) {
                if (class237.field3339 != null) {
                    class237.field3339.method2632(32214);
                    class237.field3339 = null;
                }
                if (class350.field4792 >= 1) {
                    class338.field4632 = -5;
                    class73.field1058 = 0;
                    return;
                }
                class255.field3579 = 0;
                class73.field1058 = 1;
                if (class381.field5400 == class363.field5157) {
                    class363.field5157 = class230.field3247;
                } else {
                    class363.field5157 = class381.field5400;
                }
                class350.field4792++;
            }
            if (class73.field1058 == 1) {
                class15.field247 = class343.field4703.method125((byte) 43, class267.field3718, class363.field5157);
                class73.field1058 = 2;
            }
            if (arg0 != 83) {
                method1996((int[]) null, (byte) 85, (Object[]) null, 43, -92);
            }
            if (class73.field1058 == 2) {
                if (class15.field247.field5789 == 2) {
                    throw new IOException();
                }
                if (class15.field247.field5789 != 1) {
                    return;
                }
                class237.field3339 = new class456((Socket) class15.field247.field5791, class343.field4703);
                class15.field247 = null;
                class237.field3339.method2635(0, class366.field5214.field5830, class366.field5214.field5886, -15109);
                if (class36.field622 != null) {
                    class36.field622.method1035((byte) -89);
                }
                if (class2.field22 != null) {
                    class2.field22.method1035((byte) -119);
                }
                int var1 = class237.field3339.method2630((byte) 121);
                if (class36.field622 != null) {
                    class36.field622.method1035((byte) -114);
                }
                if (class2.field22 != null) {
                    class2.field22.method1035((byte) -107);
                }
                if (var1 != 21) {
                    class73.field1058 = 0;
                    class338.field4632 = var1;
                    class237.field3339.method2632(32214);
                    class237.field3339 = null;
                    return;
                }
                class73.field1058 = 3;
            }
            if (class73.field1058 == 3) {
                if (class237.field3339.method2634(-107) < 1) {
                    return;
                }
                class435.field5972 = new String[class237.field3339.method2630((byte) 86)];
                class73.field1058 = 4;
            }
            if (class73.field1058 == 4 && class237.field3339.method2634(arg0 ^ 0xFFFFFF82) >= (class435.field5972.length * 8)) {
                class388.field5458.field5830 = 0;
                class237.field3339.method2638(class388.field5458.field5886, class435.field5972.length * 8, 0, arg0 + 421464105);
                for (int var2 = 0; var2 < class435.field5972.length; var2++) {
                    class435.field5972[var2] = class184.method1208(class388.field5458.method2494(-19827), -52);
                }
                class73.field1058 = 0;
                class338.field4632 = 21;
                class237.field3339.method2632(32214);
                class237.field3339 = null;
            }
        } catch (IOException var3) {
            if (class237.field3339 != null) {
                class237.field3339.method2632(32214);
                class237.field3339 = null;
            }
            if (class350.field4792 >= 1) {
                class73.field1058 = 0;
                class338.field4632 = -4;
            } else {
                class255.field3579 = 0;
                class350.field4792++;
                if (class381.field5400 == class363.field5157) {
                    class363.field5157 = class230.field3247;
                } else {
                    class363.field5157 = class381.field5400;
                }
                class73.field1058 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Llk;I)V", line = 223)
    public final void method1994(class425 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2503(true);
            if (var3 == 0) {
                field4598++;
                if (arg1 != 25981) {
                    field4599 = 53;
                    return;
                }
                return;
            }
            this.method1997(var3, arg0, (byte) 109);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lfc;Z)V", line = 244)
    public static final void method1995(class343 arg0, boolean arg1) {
        class355.field4954 = arg0.method2042(100, "p11_full");
        field4591++;
        class371.field5250 = arg0.method2042(100, "p12_full");
        if (!arg1) {
            return;
        }
        class467.field6552 = arg0.method2042(100, "b12_full");
        class289.field3980 = arg0.method2042(100, "hitmarks");
        class357.field4989 = arg0.method2042(100, "hitbar_default");
        class174.field2566 = arg0.method2042(100, "timerbar_default");
        class440.field6041 = arg0.method2042(100, "headicons_pk");
        class122.field1701 = arg0.method2042(100, "headicons_prayer");
        class460.field6472 = arg0.method2042(100, "hint_headicons");
        class19.field318 = arg0.method2042(100, "hint_mapmarkers");
        class346.field4728 = arg0.method2042(100, "mapflag");
        client.field5503 = arg0.method2042(100, "cross");
        class361.field5043 = arg0.method2042(100, "mapdots");
        class135.field1888 = arg0.method2042(100, "scrollbar");
        class411.field5704 = arg0.method2042(100, "name_icons");
        class301.field4126 = arg0.method2042(100, "floorshadows");
        class396.field5560 = arg0.method2042(100, "compass");
        class33.field525 = arg0.method2042(100, "otherlevel");
        class136.field1925 = arg0.method2042(100, "hint_mapedge");
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([IB[Ljava/lang/Object;II)V", line = 276)
    public static final void method1996(int[] arg0, byte arg1, Object[] arg2, int arg3, int arg4) {
        if (arg3 < arg4) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg3;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var7;
            Object var8 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var8;
            for (int var9 = arg3; var9 < arg4; var9++) {
                if (arg0[var9] < ((var9 & 0x1) + var7)) {
                    int var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    Object var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg0[arg4] = arg0[var6];
            arg0[var6] = var7;
            arg2[arg4] = arg2[var6];
            arg2[var6] = var8;
            method1996(arg0, (byte) -57, arg2, arg3, var6 - 1);
            method1996(arg0, (byte) 100, arg2, var6 + 1, arg4);
        }
        field4597++;
        int var12 = -56 / ((arg1 - 30) / 33);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILlk;B)V", line = 330)
    private final void method1997(int arg0, class425 arg1, byte arg2) {
        field4588++;
        if (arg2 < 103) {
            this.method1990(-65);
        }
        if (arg0 == 1) {
            this.field4595 = arg1.method2508(true);
        } else if (arg0 == 2) {
            this.field4594 = arg1.method2503(true);
            this.field4601 = arg1.method2503(true);
        }
    }
}
