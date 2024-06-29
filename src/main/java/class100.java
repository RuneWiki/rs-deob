import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class100 {

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Lda;")
    public static class275 field1681 = class255.method1672(121, "0(U");

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field1680 = 0;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Lda;")
    public static class275 field1686 = class255.method1672(106, "rot:");

    @OriginalMember(owner = "client!c", name = "l", descriptor = "[Z")
    public static boolean[] field1691 = new boolean[100];

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lma;I)V")
    public static final void method710(class105 arg0, int arg1) {
        class85.field1423 = arg0.method767(arg1 ^ 0xFFF877B7, class37.field609);
        field1684++;
        if (arg1 != -30648) {
            field1688 = -43;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)[B")
    public static final synchronized byte[] method711(boolean arg0, int arg1) {
        field1689++;
        if (arg0) {
            return null;
        } else if (arg1 == 100 && class50.field837 > 0) {
            byte[] var2 = class44.field751[--class50.field837];
            class44.field751[class50.field837] = null;
            return var2;
        } else if (arg1 == 5000 && class221.field3755 > 0) {
            byte[] var3 = class78.field1293[--class221.field3755];
            class78.field1293[class221.field3755] = null;
            return var3;
        } else if (arg1 == 30000 && class39.field646 > 0) {
            byte[] var4 = class181.field3105[--class39.field646];
            class181.field3105[class39.field646] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)I")
    public static final int method712(int arg0) {
        field1690++;
        try {
            if (++class83.field1348 > 1500) {
                throw new IOException();
            }
            if (~class3.field27 == arg0) {
                if (class66.field1087 > (class121.method888((byte) -119) - 5000L)) {
                    return 0;
                }
                class66.field1087 = class121.method888((byte) -119);
                class162.field2838 = class3.field24.method373(0, class243.field4249, class80.field1314);
                class3.field27 = 1;
            }
            if (class3.field27 == 1) {
                if (class162.field2838.field4623 == 2) {
                    throw new IOException();
                }
                if (class162.field2838.field4623 != 1) {
                    return -1;
                }
                int var1 = 0;
                class52.field866 = new class219((Socket) class162.field2838.field4625, class3.field24);
                if (class160.field2812) {
                    var1 = class139.field2424;
                }
                class162.field2838 = null;
                class149.field2597.field1392 = 0;
                class149.field2597.method575((byte) 125, 78);
                class149.field2597.method586(-96, var1);
                class52.field866.method1400(class149.field2597.field1381, 0, 5000, class149.field2597.field1392);
                if (class72.field1166 != null) {
                    class72.field1166.method880(83);
                }
                if (class120.field2160 != null) {
                    class120.field2160.method880(83);
                }
                int var2 = class52.field866.method1399(false);
                if (class72.field1166 != null) {
                    class72.field1166.method880(77);
                }
                if (class120.field2160 != null) {
                    class120.field2160.method880(arg0 + 109);
                }
                if (var2 != 0) {
                    if (class52.field866 != null) {
                        class52.field866.method1402(arg0 ^ 0xFFFFFFFE);
                        class52.field866 = null;
                    }
                    class122.field2184++;
                    if (class122.field2184 > 4) {
                        class37.method220(false);
                        return var2;
                    }
                    class3.field27 = 0;
                    if (class243.field4249 == class125.field2233) {
                        class243.field4249 = class66.field1086;
                    } else {
                        class243.field4249 = class125.field2233;
                    }
                    class83.field1348 = 0;
                    return -1;
                }
                class3.field27 = 2;
            }
            if (class3.field27 == 2) {
                if (class52.field866.method1404(-1048) < 2) {
                    return -1;
                }
                field1680 = class52.field866.method1399(false);
                field1680 <<= 0x8;
                field1680 += class52.field866.method1399(false);
                class3.field27 = 3;
                class75.field1232 = new byte[field1680];
            }
            if (class3.field27 == 3) {
                int var3 = class52.field866.method1404(arg0 ^ 0x417);
                if (var3 < 1) {
                    return -1;
                }
                if (var3 > field1680 - class89.field1522) {
                    var3 = field1680 - class89.field1522;
                }
                class52.field866.method1406(class89.field1522, class75.field1232, var3, -113);
                class89.field1522 += var3;
                if (class89.field1522 < field1680) {
                    return -1;
                }
                class175.method1183(class75.field1232, arg0 - 1);
                class148.field2582 = new class270[class145.field2541];
                int var4 = 0;
                for (int var5 = class31.field466; var5 <= class224.field3789; var5++) {
                    class270 var6 = class201.method1322(var5, true);
                    if (var6 != null) {
                        class148.field2582[var4++] = var6;
                    }
                }
                class52.field866.method1402(arg0 + 2);
                class52.field866 = null;
                class37.method220(false);
                return 0;
            }
        } catch (IOException var7) {
            if (class52.field866 != null) {
                class52.field866.method1402(1);
                class52.field866 = null;
            }
            class122.field2184++;
            if (class122.field2184 > 4) {
                class37.method220(false);
                return 1000;
            }
            class3.field27 = 0;
            if (class243.field4249 == class125.field2233) {
                class243.field4249 = class66.field1086;
            } else {
                class243.field4249 = class125.field2233;
            }
            class83.field1348 = 0;
        }
        return -1;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIZIII)V")
    public static final void method713(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field1682++;
        int var6 = class93.method673(class149.field2603, (byte) 45, class141.field2493, arg3);
        int var7 = class93.method673(class149.field2603, (byte) 45, class141.field2493, arg0);
        int var8 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg4);
        int var9 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg5);
        for (int var10 = var6; var10 <= var7; var10++) {
            class36.method216(class19.field280[var10], var8, arg1, -115, var9);
        }
        if (arg2) {
            field1686 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public static void method714(int arg0) {
        field1686 = null;
        if (arg0 == -30001) {
            field1691 = null;
            field1681 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Z")
    public static final boolean method715(int arg0, int arg1) {
        if (arg0 > -19) {
            method711(false, 79);
        }
        field1685++;
        return (arg1 & 0x5CC1A6) >> 22 != 0;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
    public static final void method716(byte arg0) {
        if (arg0 == -46) {
            field1687++;
            class104.field1732.method993(arg0 + 162);
        }
    }
}
