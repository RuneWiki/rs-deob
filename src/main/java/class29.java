import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class29 {

    @OriginalMember(owner = "client!e", name = "l", descriptor = "Lqb;")
    private class113 field702 = new class113();

    @OriginalMember(owner = "client!e", name = "u", descriptor = "Loc;")
    private class100 field711 = new class100();

    @OriginalMember(owner = "client!e", name = "w", descriptor = "I")
    private int field713;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    private int field712;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "Loe;")
    private class102 field710;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "Lu;")
    public static class135 field692 = class87.method676((byte) -79, "backright2");

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Lu;")
    public static class135 field701 = class87.method676((byte) -127, "Diese Betatest)2Welt ist nur f-Ur eingeladene");

    @OriginalMember(owner = "client!e", name = "n", descriptor = "[Lu;")
    public static class135[] field704 = new class135[20];

    @OriginalMember(owner = "client!e", name = "a", descriptor = "Lu;")
    public static class135 field691 = class87.method676((byte) -92, "p12_full");

    @OriginalMember(owner = "client!e", name = "h", descriptor = "Lu;")
    public static class135 field698 = class87.method676((byte) -104, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!e", name = "p", descriptor = "Lu;")
    public static class135 field706 = class87.method676((byte) -116, "sl_stars");

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "Lae;")
    public static class6 field694;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "Ljava/awt/Font;")
    public static Font field700;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "Z")
    public static boolean field693;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "[I")
    public static int[] field707;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "[[B")
    public static byte[][] field699;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public final void method234(int arg0) {
        field703++;
        while (true) {
            class113 var2 = this.field711.method821((byte) -88);
            if (var2 == null) {
                this.field713 = this.field712;
                if (arg0 == -22666) {
                    return;
                } else {
                    field700 = null;
                    return;
                }
            }
            var2.method302(arg0 ^ 0xFFFFA891);
            var2.method921(2001);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(JB)V")
    public final void method235(long arg0, byte arg1) {
        if (arg1 != 50) {
            return;
        }
        field708++;
        class113 var4 = (class113) this.field710.method842(arg0, arg1 + 76);
        if (var4 != null) {
            var4.method302(4071);
            var4.method921(2001);
            this.field713++;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
    public static final void method236(byte arg0) {
        if (arg0 != -92) {
            return;
        }
        field705++;
        for (class44 var1 = (class44) class123.field2940.method182((byte) 50); var1 != null; var1 = (class44) class123.field2940.method181((byte) 14)) {
            if (var1.field1072 == -1) {
                var1.field1083 = 0;
                class100.method827(var1, -112);
            } else {
                var1.method302(4071);
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
    public static void method237(int arg0) {
        field692 = null;
        field701 = null;
        field706 = null;
        field691 = null;
        field704 = null;
        field698 = null;
        field699 = null;
        if (arg0 == 0) {
            field707 = null;
            field694 = null;
            field700 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lba;B)V")
    public static final void method238(class9 arg0, byte arg1) {
        if (class126.field2998 == arg0.field226 || arg0.field170 == -1 || arg0.field177 != 0 || arg0.field180 + 1 > class17.method108(arg0.field170, 0).field2008[arg0.field194]) {
            int var2 = arg0.field226 - arg0.field208;
            int var3 = class126.field2998 - arg0.field208;
            int var4 = arg0.field204 * 128 + arg0.field210 * 64;
            int var5 = arg0.field210 * 64 + arg0.field189 * 128;
            int var6 = arg0.field231 * 128 + arg0.field210 * 64;
            int var7 = arg0.field210 * 64 + arg0.field209 * 128;
            arg0.field173 = ((var2 - var3) * var7 + var3 * var6) / var2;
            arg0.field172 = ((var2 - var3) * var5 + var3 * var4) / var2;
        }
        field696++;
        if (arg0.field183 == 0) {
            arg0.field213 = 1024;
        }
        arg0.field218 = 0;
        if (arg0.field183 == 1) {
            arg0.field213 = 1536;
        }
        if (arg0.field183 == 2) {
            arg0.field213 = 0;
        }
        if (arg0.field183 == 3) {
            arg0.field213 = 512;
        }
        arg0.field230 = arg0.field213;
        if (arg1 != 23) {
            field692 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IJ)Lqb;")
    public final class113 method239(int arg0, long arg1) {
        field697++;
        if (arg0 != 9325) {
            field700 = null;
        }
        class113 var4 = (class113) this.field710.method842(arg1, arg0 ^ 0x2412);
        if (var4 != null) {
            this.field711.method822(arg0 ^ 0x246D, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZZIZI)Lpe;")
    public static final class109 method240(boolean arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        field709++;
        class139 var5 = null;
        if (class105.field2516 != null) {
            var5 = new class139(arg4, class105.field2516, class77.field1821[arg4], 1000000);
        }
        if (arg2 < 74) {
            field691 = null;
        }
        return new class109(var5, class68.field1677, arg4, arg3, arg1, arg0);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lqb;IJ)V")
    public final void method241(class113 arg0, int arg1, long arg2) {
        if (this.field713 == 0) {
            class113 var5 = this.field711.method821((byte) 93);
            var5.method302(arg1 + 4071);
            var5.method921(2001);
            if (this.field702 == var5) {
                class113 var6 = this.field711.method821((byte) -65);
                var6.method302(4071);
                var6.method921(2001);
            }
        } else {
            this.field713--;
        }
        field695++;
        this.field710.method836(arg2, (byte) 103, arg0);
        this.field711.method822(arg1, arg0);
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(I)V")
    public class29(int arg0) {
        this.field713 = arg0;
        this.field712 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field710 = new class102(var2);
    }
}
