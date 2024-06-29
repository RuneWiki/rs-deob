import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class114 {

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Llf;")
    public static class82 field2695 = new class82(64);

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "Lic;")
    private static class59 field2704 = class59.method433(0, "Your account has been disabled)3");

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field2705 = 0;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "Lic;")
    public static class59 field2703 = field2704;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "Lic;")
    public static class59 field2706 = class59.method433(0, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2702 = new CRC32();

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "Lic;")
    public static class59 field2707 = class59.method433(0, "Willkommen auf RuneScape");

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "Lmd;")
    public static class87 field2708;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "[I")
    public static int[] field2701;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method920(int arg0, byte[] arg1) {
        field2699++;
        int var2 = arg1.length;
        int var3 = -84 % ((arg0 + 10) / 55);
        byte[] var4 = new byte[var2];
        class105.method818(arg1, 0, var4, 0, var2);
        return var4;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public static void method921(byte arg0) {
        field2708 = null;
        field2703 = null;
        field2707 = null;
        field2706 = null;
        field2701 = null;
        field2702 = null;
        field2704 = null;
        field2695 = null;
        if (arg0 != -62) {
            field2703 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V")
    public static final void method922(byte arg0) {
        field2700++;
        if (class33.field895 > 0) {
            class10.method48((byte) 99);
            return;
        }
        class89.method737(40, 128);
        if (arg0 != 127) {
            method922((byte) -80);
        }
        class52.field1299 = class102.field2491;
        class102.field2491 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)Z")
    public static final boolean method923(int arg0, byte arg1) {
        field2698++;
        if (class131.field2944[arg0]) {
            return true;
        } else if (class16.field318.method187(arg0, -1)) {
            int var2 = class16.field318.method181(0, arg0);
            if (var2 == 0) {
                class131.field2944[arg0] = true;
                return true;
            }
            if (class46.field1173[arg0] == null) {
                class46.field1173[arg0] = new class159[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class46.field1173[arg0][var3] == null) {
                    byte[] var4 = class16.field318.method193(false, var3, arg0);
                    if (var4 != null) {
                        class46.field1173[arg0][var3] = new class159();
                        class46.field1173[arg0][var3].field3573 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class46.field1173[arg0][var3].method1232(-1, new class157(var4));
                        } else {
                            class46.field1173[arg0][var3].method1227(new class157(var4), 64);
                        }
                    }
                }
            }
            class131.field2944[arg0] = true;
            if (arg1 != -128) {
                field2704 = null;
            }
            return true;
        } else {
            return false;
        }
    }
}
