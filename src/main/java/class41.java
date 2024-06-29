import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class41 extends class222 {

    @OriginalMember(owner = "client!r", name = "F", descriptor = "I")
    public int field648 = 0;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "[Lwc;")
    public class229[] field637 = new class229[5];

    @OriginalMember(owner = "client!r", name = "r", descriptor = "[I")
    public int[] field634 = new int[5];

    @OriginalMember(owner = "client!r", name = "L", descriptor = "I")
    public int field654;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "I")
    public int field647;

    @OriginalMember(owner = "client!r", name = "M", descriptor = "I")
    public int field655;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public int field638;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "Lcf;")
    public static class93 field630 = class147.method1066("showVideoAd", -48);

    @OriginalMember(owner = "client!r", name = "m", descriptor = "Lcf;")
    public static class93 field629 = class147.method1066("Bitte entfernen Sie ", -48);

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field625 = 0;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field631 = 0;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "Lcf;")
    public static class93 field627 = class147.method1066("; Max)2Age=", -48);

    @OriginalMember(owner = "client!r", name = "z", descriptor = "Lee;")
    public static class280 field642 = new class280(new byte[5000]);

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public int field636;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "I")
    public int field644;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    public int field645;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "I")
    public int field653;

    @OriginalMember(owner = "client!r", name = "N", descriptor = "I")
    public int field656;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "Lsk;")
    public class112 field646;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "Lpc;")
    public class21 field639;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "Lgh;")
    public class24 field641;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "Lha;")
    public class30 field652;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "Lr;")
    public class41 field640;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "Loc;")
    public class61 field633;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "Lge;")
    public class70 field643;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "Z")
    public boolean field635;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "Z")
    public boolean field649;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "Z")
    public boolean field650;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BII)V")
    public static final void method232(byte arg0, int arg1, int arg2) {
        field651++;
        int var3 = arg1--;
        if (var3 > 25) {
            var3 = 25;
        }
        int var4 = class163.field2878[arg1];
        int var5 = class101.field1759[arg1];
        if (arg2 == 0) {
            class44.field711++;
            class285.field5105.method1568(212, (byte) 80);
            class285.field5105.method1916(var3 + var3 + 3, 91);
        }
        if (arg2 == 1) {
            class285.field5105.method1568(167, (byte) 75);
            class285.field5105.method1916(var3 + 14 - (-var3 - 3), 91);
            class15.field190++;
        }
        if (arg0 != 63) {
            field642 = null;
        }
        if (arg2 == 2) {
            class285.field5105.method1568(152, (byte) 108);
            class152.field2655++;
            class285.field5105.method1916(var3 + var3 + 3, 109);
        }
        class285.field5105.method1887(-64, class176.field3048[82] ? 1 : 0);
        class269.field4802 = class101.field1759[0];
        class55.field908 = class163.field2878[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg1--;
            class285.field5105.method1905((byte) -108, class163.field2878[arg1] - var4);
            class285.field5105.method1905((byte) -48, class101.field1759[arg1] - var5);
        }
        class285.field5105.method1892(class4.field52 + var5, (byte) 119);
        class285.field5105.method1927(arg0 - 1356247095, class229.field4111 + var4);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(BII)I")
    public static final int method233(byte arg0, int arg1, int arg2) {
        class249 var3 = (class249) class282.field5069.method135((long) arg2, true);
        field626++;
        if (var3 == null) {
            return 0;
        } else {
            if (arg0 != -4) {
                method235(101);
            }
            return arg1 >= 0 && arg1 < var3.field4494.length ? var3.field4494[arg1] : 0;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lhg;I)V")
    public static final void method234(class177 arg0, int arg1) {
        field632++;
        class157.field2790 = class8.method34(arg0, class78.field1447, arg1 ^ 0x7CCCAA68);
        class279.field4987 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var4 = (float) (class232.field4141[var2] >> 16 & 0xFF);
            int var5 = class232.field4141[var2 + 1] >> 16 & 0xFF;
            float var6 = ((float) var5 - var4) / 64.0F;
            int var7 = class232.field4141[var2 + 1] >> 8 & 0xFF;
            float var8 = (float) (class232.field4141[var2] >> 8 & 0xFF);
            int var9 = class232.field4141[var2 + 1] & 0xFF;
            float var10 = (float) (class232.field4141[var2] & 0xFF);
            float var11 = ((float) var7 - var8) / 64.0F;
            float var12 = ((float) var9 - var10) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class279.field4987[var2 * 64 + var13] = class270.method1797((int) var10, class270.method1797((int) var8 << 8, (int) var4 << 16));
                var4 += var6;
                var8 += var11;
                var10 += var12;
            }
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class279.field4987[var3] = class232.field4141[3];
        }
        class31.field494 = new int[32768];
        class222.field4002 = new int[32768];
        class151.method1088((byte) 39, (class173) null);
        class278.field4981 = new int[32768];
        class70.field1280 = new int[32768];
        if (arg1 != -2093787704) {
            method235(-83);
        }
        class238.field4266 = new class158(128, 254);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public static void method235(int arg0) {
        field627 = null;
        field642 = null;
        if (arg0 <= 77) {
            method233((byte) 8, -58, -89);
        }
        field630 = null;
        field629 = null;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(III)V")
    public class41(int arg0, int arg1, int arg2) {
        this.field654 = arg2;
        this.field647 = arg1;
        this.field638 = this.field655 = arg0;
    }
}
