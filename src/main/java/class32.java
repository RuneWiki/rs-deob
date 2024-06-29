import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class32 {

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "Lad;")
    public static class5 field763 = class88.method674(")1", -60);

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field768 = 0;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "Lad;")
    private static class5 field761 = class88.method674("Close", 52);

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public static int field769 = 0;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "Lad;")
    public static class5 field767 = class88.method674("Die Adresse dieses Computers wurde gesperrt)1", 47);

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "[I")
    public static int[] field776 = new int[] { 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800 };

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "Lad;")
    private static class5 field780 = class88.method674("Private chat", -71);

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "Lad;")
    public static class5 field771 = field780;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "Lad;")
    public static class5 field765 = class88.method674("Ladevorgang )2 bitte warten Sie)3", 87);

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "Lad;")
    public static class5 field773 = class88.method674("Fallen lassen", 113);

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Lad;")
    public static class5 field757 = field761;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "Lad;")
    public static class5 field774 = class88.method674("Icons redrawn", -61);

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "Z")
    public static boolean field784 = false;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "Lad;")
    public static class5 field782 = class88.method674("Maximale Anmelde)2Versuche -Uberschritten)3", -65);

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field766 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "Lhd;")
    public static class46 field785 = new class46(4096);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public int field759;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public int field760;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public int field762;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public int field770;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
    public int field778;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "Lra;")
    public class103 field781;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "Luc;")
    public static class123 field764;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "Lia;")
    public static class49 field777;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "[I")
    public static int[] field779;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 13)
    public static final void method255(int arg0) {
        field772++;
        class58.field1419 = new class23();
        if (arg0 != 12800) {
            method256(-90, (byte) -64);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)Lad;", line = 43)
    public static final class5 method256(int arg0, byte arg1) {
        field786++;
        if (arg0 < 999999999) {
            return class106.method864(18413, arg0);
        } else if (arg1 >= -60) {
            return null;
        } else {
            return class42.field1072;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIBILgb;III)V", line = 59)
    public static final void method257(int arg0, int arg1, byte arg2, int arg3, class39 arg4, int arg5, int arg6, int arg7) {
        field758++;
        if (arg6 >= 0 && arg6 < 104 && arg5 >= 0 && arg5 < 104) {
            class12.field371[arg1][arg6][arg5] = 0;
            while (true) {
                int var8 = arg4.method330(-30864);
                if (var8 == 0) {
                    if (arg1 == 0) {
                        class42.field1062[0][arg6][arg5] = -class103.method827(arg6 + arg7 + 932731, (byte) -116, arg5 + arg0 + 556238) * 8;
                    } else {
                        class42.field1062[arg1][arg6][arg5] = class42.field1062[arg1 - 1][arg6][arg5] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg4.method330(-30864);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg1 == 0) {
                        class42.field1062[0][arg6][arg5] = -var9 * 8;
                    } else {
                        class42.field1062[arg1][arg6][arg5] = class42.field1062[arg1 - 1][arg6][arg5] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class112.field2796[arg1][arg6][arg5] = arg4.method318(-1);
                    class105.field2638[arg1][arg6][arg5] = (byte) ((var8 - 2) / 4);
                    class77.field1815[arg1][arg6][arg5] = (byte) class104.method832(3, var8 + arg3 - 2);
                } else if (var8 <= 81) {
                    class12.field371[arg1][arg6][arg5] = (byte) (var8 - 49);
                } else {
                    class105.field2546[arg1][arg6][arg5] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg4.method330(-30864);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg4.method330(-30864);
                    break;
                }
                if (var10 <= 49) {
                    arg4.method330(-30864);
                }
            }
        }
        if (arg2 > -34) {
            method259((byte) -5);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)V", line = 158)
    public static final void method258(boolean arg0, int arg1) {
        field775++;
        if (arg1 == -1 || !class34.field865[arg1]) {
            return;
        }
        class6.field237.method848(arg1, !arg0);
        if (class121.field3013[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class121.field3013[arg1].length; var3++) {
            if (class121.field3013[arg1][var3] != null) {
                if (class121.field3013[arg1][var3].field2630 == 2) {
                    var2 = false;
                } else {
                    class121.field3013[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class121.field3013[arg1] = null;
        }
        class34.field865[arg1] = arg0;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V", line = 216)
    public static final void method259(byte arg0) {
        field756++;
        int var1 = -34 % ((arg0 + 48) / 50);
        for (int var2 = -1; var2 < class12.field348; var2++) {
            int var3;
            if (var2 == -1) {
                var3 = 2047;
            } else {
                var3 = class105.field2577[var2];
            }
            class112 var4 = class7.field251[var3];
            if (var4 != null) {
                class25.method210(-28943, var4, 1);
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V", line = 277)
    public static final void method260(int arg0) {
        field783++;
        if (!class94.field2219) {
            return;
        }
        class21.field548 = null;
        class30.field739 = null;
        class109.field2751 = null;
        class47.field1225 = null;
        field779 = null;
        class118.field2933 = null;
        class98.field2366 = null;
        class99.field2386 = null;
        client.field496 = null;
        class54.field1358 = null;
        class134.field3243 = null;
        class8.field289 = null;
        class102.field2487 = null;
        class95.field2250 = null;
        class38.field941 = null;
        class21.field546 = null;
        class14.field404 = null;
        class99.field2403 = null;
        class17.field447 = null;
        class12.field361 = null;
        class56.field1395 = null;
        class116.field2871 = null;
        if (arg0 != -240) {
            method259((byte) 72);
        }
        class78.method609(10, (byte) -56);
        class81.method632(3, true);
        class94.field2219 = false;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V", line = 316)
    public static void method261(int arg0) {
        field774 = null;
        field779 = null;
        field776 = null;
        field782 = null;
        field780 = null;
        field761 = null;
        field777 = null;
        field763 = null;
        field765 = null;
        field766 = null;
        field771 = null;
        field773 = null;
        int var1 = -107 / ((arg0 - 11) / 63);
        field785 = null;
        field757 = null;
        field764 = null;
        field767 = null;
    }
}
