import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class20 {

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "[F")
    public static float[] field223 = new float[4];

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "Lik;")
    public static class78 field221 = new class78();

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "I")
    public static int field224 = 0;

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "Lnk;")
    public static class326 field225 = new class326(23, 3);

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "[Lia;")
    public static class23[] field226;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "Ldj;")
    public static class344 field218;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I[I[IIB)V")
    public static final void method106(int arg0, int[] arg1, int[] arg2, int arg3, byte arg4) {
        field222++;
        if (arg0 < arg3) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg0;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var8;
            int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
            for (int var10 = arg0; var10 < arg3; var10++) {
                if ((var9 & var10) + var7 > arg1[var10]) {
                    int var11 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6] = var11;
                    int var12 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6++] = var12;
                }
            }
            arg1[arg3] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg3] = arg2[var6];
            arg2[var6] = var8;
            method106(arg0, arg1, arg2, var6 - 1, (byte) -99);
            method106(var6 + 1, arg1, arg2, arg3, (byte) -91);
        }
        if (arg4 >= -86) {
            method108((byte) 18);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IB)Lpj;")
    public static final class512 method107(int arg0, byte arg1) {
        field220++;
        if (arg1 >= -85) {
            method107(82, (byte) 13);
        }
        if (arg0 == 0) {
            return new class437();
        } else if (arg0 == 1) {
            return new class180();
        } else if (arg0 == 2) {
            return new class387();
        } else if (arg0 == 3) {
            return new class281();
        } else if (arg0 == 4) {
            return new class90();
        } else if (arg0 == 5) {
            return new class463();
        } else if (arg0 == 6) {
            return new class212();
        } else if (arg0 == 7) {
            return new class51();
        } else if (arg0 == 8) {
            return new class362();
        } else if (arg0 == 9) {
            return new class120();
        } else if (arg0 == 10) {
            return new class396();
        } else if (arg0 == 11) {
            return new class298();
        } else if (arg0 == 12) {
            return new class13();
        } else if (arg0 == 13) {
            return new class151();
        } else if (arg0 == 14) {
            return new class350();
        } else if (arg0 == 15) {
            return new class195();
        } else if (arg0 == 16) {
            return new class271();
        } else if (arg0 == 17) {
            return new class69();
        } else if (arg0 == 18) {
            return new class447();
        } else if (arg0 == 19) {
            return new class154();
        } else if (arg0 == 20) {
            return new class177();
        } else if (arg0 == 21) {
            return new class131();
        } else if (arg0 == 22) {
            return new class203();
        } else if (arg0 == 23) {
            return new class38();
        } else if (arg0 == 24) {
            return new class323();
        } else if (arg0 == 25) {
            return new class286();
        } else if (arg0 == 26) {
            return new class157();
        } else if (arg0 == 27) {
            return new class255();
        } else if (arg0 == 28) {
            return new class101();
        } else if (arg0 == 29) {
            return new class293();
        } else if (arg0 == 30) {
            return new class74();
        } else if (arg0 == 31) {
            return new class102();
        } else if (arg0 == 32) {
            return new class36();
        } else if (arg0 == 33) {
            return new class148();
        } else if (arg0 == 34) {
            return new class65();
        } else if (arg0 == 35) {
            return new class440();
        } else if (arg0 == 36) {
            return new class352();
        } else if (arg0 == 37) {
            return new class238();
        } else if (arg0 == 38) {
            return new class117();
        } else if (arg0 == 39) {
            return new class393();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V")
    public static void method108(byte arg0) {
        field225 = null;
        field221 = null;
        field223 = null;
        field218 = null;
        field226 = null;
        if (arg0 > -99) {
            method106(18, null, null, 82, (byte) -111);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(III)I")
    public static final int method109(int arg0, int arg1, int arg2) {
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (arg0 != 65408) {
            method109(118, 40, -115);
        }
        field219++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    static {
        new class306(" days.", " Tage.", " jours.", " dias.");
        field226 = new class23[2048];
    }
}
