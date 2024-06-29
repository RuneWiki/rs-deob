import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public abstract class class151 extends class186 {

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
    public static int field2323 = 4;

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "Lkc;")
    public static class157 field2324 = new class157("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!iq", name = "u", descriptor = "Lat;")
    public static class444 field2332 = null;

    @OriginalMember(owner = "client!iq", name = "t", descriptor = "[I")
    public static int[] field2331 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "I")
    public int field2322;

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
    public int field2327;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
    public int field2328;

    @OriginalMember(owner = "client!iq", name = "r", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!iq", name = "v", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!iq", name = "s", descriptor = "Lo;")
    public static class359 field2330;

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "Z")
    public boolean field2320;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(BII)Z", line = 6)
    public static final boolean method1091(byte arg0, int arg1, int arg2) {
        field2329++;
        if (arg0 != -96) {
            field2323 = -46;
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Llb;IZIBILza;)V", line = 17)
    public final void method161(class186 arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, class295 arg6) {
        field2321++;
        if (arg4 > 54) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)V", line = 30)
    public static void method1092(byte arg0) {
        field2330 = null;
        field2324 = null;
        if (arg0 > -29) {
            method1093(null, -99);
        }
        field2331 = null;
        field2332 = null;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lat;I)V", line = 45)
    public static final void method1093(class444 arg0, int arg1) {
        if (class255.field3478 == arg0.field6482) {
            class428.field6214[arg0.field6397] = true;
        }
        if (arg1 >= 107) {
            field2333++;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)V", line = 61)
    public static final void method1094(int arg0, int arg1, int arg2) {
        field2318++;
        int var3 = class80.field1127.method416(8364, class41.field608.method1126(class486.field6998, (byte) -19));
        for (class440 var4 = (class440) class391.field5638.method3137(arg0 ^ arg0); var4 != null; var4 = (class440) class391.field5638.method3132(0)) {
            int var8 = class316.method1819((byte) 92, var4);
            if (var8 > var3) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class527.field7690 * 16 + 21;
        int var6 = arg1 - var3 / 2;
        if (class66.field953 < var3 + var6) {
            var6 = class66.field953 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg2;
        if (class348.field5033 < (var5 + arg2)) {
            var7 = class348.field5033 - var5;
        }
        class110.field1797 = var6;
        if (var7 < 0) {
            var7 = 0;
        }
        class27.field371 = var7;
        class72.field1031 = var3;
        class526.field7677 = true;
        class334.field4880 = (class170.field2591 ? 26 : 22) + class527.field7690 * 16;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljv;B)V", line = 108)
    public static final void method1095(class484 arg0, byte arg1) {
        int var2 = 76 % ((35 - arg1) / 60);
        class316.field4305 = arg0;
        field2319++;
    }

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "(I)V", line = 120)
    public final void method168(int arg0) {
        field2326++;
        int var2 = -106 % ((43 - arg0) / 56);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)Z", line = 135)
    public final boolean method169(int arg0) {
        field2325++;
        if (arg0 != -28206) {
            method1091((byte) 122, -93, 54);
        }
        return false;
    }
}
