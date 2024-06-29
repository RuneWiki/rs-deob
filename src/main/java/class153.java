import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class153 {

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "Ldf;")
    public static class51 field2546 = class46.method233("Musik)2Engine vorbereitet)3", 100);

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public static int field2556 = -1;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "Ldf;")
    public static class51 field2557 = class46.method233("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", 100);

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "B")
    public static byte field2559;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public int field2543;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public int field2545;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public int field2548;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public int field2552;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public int field2554;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public int field2555;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public int field2558;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "[B")
    public byte[] field2549;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "[B")
    public byte[] field2553;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "[Lmi;")
    public static class239[] field2547;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static void method1104(int arg0) {
        field2557 = null;
        int var1 = 10 % ((-arg0 - 64) / 44);
        field2546 = null;
        field2547 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)[Ljg;")
    public static final class158[] method1105(byte arg0) {
        if (arg0 != -104) {
            field2547 = null;
        }
        field2544++;
        class158[] var1 = new class158[class190.field3183];
        for (int var2 = 0; var2 < class190.field3183; var2++) {
            var1[var2] = new class158(class13.field194, class122.field2078, class96.field1591[var2], class125.field2123[var2], class221.field3837[var2], class106.field1751[var2], class67.field1100[var2], class139.field2327);
        }
        class111.method804((byte) -14);
        return var1;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIBIZII)V")
    public static final void method1106(int arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class124.field2104 = arg3;
        if (arg2 != 48) {
            return;
        }
        class242.field4202 = arg1;
        field2551++;
        class92.field1525 = arg6;
        class114.field1944 = arg5;
        class141.field2368 = arg0;
        if (arg4 && class114.field1944 >= 100) {
            class144.field2408 = class242.field4202 * 128 + 64;
            class209.field3488 = class141.field2368 * 128 + 64;
            class120.field2001 = class207.method1424(class257.field4496, class209.field3488, (byte) 105, class144.field2408) - class92.field1525;
        }
        class201.field3361 = 2;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Llb;I)V")
    public static final void method1107(class121 arg0, int arg1) {
        if (arg1 != 2) {
            return;
        }
        if (class244.field4225 != null) {
            try {
                class244.field4225.method1785(0L, arg1 ^ 0x4B65);
                class244.field4225.method1783(24, arg0.field2014, arg0.field2026, false);
            } catch (Exception var2) {
            }
        }
        field2550++;
        arg0.field2026 += 24;
    }
}
