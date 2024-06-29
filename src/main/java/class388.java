import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class388 extends class390 {

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    public int field5574;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public int field5569;

    @OriginalMember(owner = "client!og", name = "r", descriptor = "Lbj;")
    public static class131 field5577;

    @OriginalMember(owner = "client!og", name = "t", descriptor = "Z")
    public static boolean field5579;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "Lgi;")
    public static class405 field5576;

    @OriginalMember(owner = "client!og", name = "s", descriptor = "Z")
    public static boolean field5578;

    static {
        new class442("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field5577 = new class131(8);
        field5579 = false;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "([Ljava/lang/String;I[SBI)V", line = 4)
    public static final void method2456(String[] arg0, int arg1, short[] arg2, byte arg3, int arg4) {
        field5575++;
        if (arg1 > arg4) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg4;
            String var7 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var7;
            short var8 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var8;
            for (int var9 = arg4; var9 < arg1; var9++) {
                if (var7 == null || arg0[var9] != null && (var9 & 0x1) > arg0[var9].compareTo(var7)) {
                    String var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    short var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg0[arg1] = arg0[var6];
            arg0[var6] = var7;
            arg2[arg1] = arg2[var6];
            arg2[var6] = var8;
            method2456(arg0, var6 - 1, arg2, (byte) 55, arg4);
            method2456(arg0, arg1, arg2, (byte) 92, var6 + 1);
        }
        if (arg3 < 11) {
            method2459((int[]) null, -84, 46);
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V", line = 63)
    public static void method2457(int arg0) {
        field5577 = null;
        field5576 = null;
        if (arg0 <= 101) {
            field5573 = 97;
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V", line = 75)
    public static final void method2458(int arg0) {
        if (arg0 != 0) {
            method2456((String[]) null, 117, (short[]) null, (byte) -40, 78);
        }
        field5571++;
        if (class123.field1707) {
            return;
        }
        class123.field1707 = true;
        if (class133.field1916) {
            class333.field4599 = (float) ((int) class333.field4599 + 191 & 0xFFFFFF80);
        } else {
            class305.field4209 += (24.0F - class305.field4209) / 2.0F;
        }
        class128.field1806 = true;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "([III)V", line = 104)
    public static final void method2459(int[] arg0, int arg1, int arg2) {
        for (int var3 = 31; var3 > 0; var3--) {
            int var5 = var3 * 36;
            for (int var6 = 35; var6 > 0; var6--) {
                if (arg0[var5 + var6] == 0 && arg0[var5 + var6 - 1 - 36] != 0) {
                    arg0[var5 + var6] = arg2;
                }
            }
        }
        int var4 = -57 / ((arg1 + 21) / 57);
        field5572++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIZII)V", line = 134)
    public static final void method2460(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field5570++;
        class114.field1644 = 0L;
        if (arg0 != -1538) {
            method2457(40);
        }
        int var5 = class405.method2542(-1);
        if (arg3 == 3 || var5 == 3) {
            arg2 = true;
        }
        if (!class64.field949.method127()) {
            arg2 = true;
        }
        class410.method2569(arg3, arg2, arg4, arg1, var5, (byte) -76);
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(II)V", line = 163)
    public class388(int arg0, int arg1) {
        this.field5574 = arg1;
        this.field5569 = arg0;
    }
}
