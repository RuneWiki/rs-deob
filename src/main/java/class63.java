import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XBHNZKGU")
public class class63 {

    @OriginalMember(owner = "client!XBHNZKGU", name = "e", descriptor = "I")
    public int field1655 = -1;

    @OriginalMember(owner = "client!XBHNZKGU", name = "g", descriptor = "[I")
    public int[] field1657 = new int[6];

    @OriginalMember(owner = "client!XBHNZKGU", name = "h", descriptor = "[I")
    public int[] field1658 = new int[6];

    @OriginalMember(owner = "client!XBHNZKGU", name = "i", descriptor = "I")
    public int field1659 = 128;

    @OriginalMember(owner = "client!XBHNZKGU", name = "j", descriptor = "I")
    public int field1660 = 128;

    @OriginalMember(owner = "client!XBHNZKGU", name = "n", descriptor = "LNQQFCAPC;")
    public static class36 field1664 = new class36(30, 285);

    @OriginalMember(owner = "client!XBHNZKGU", name = "a", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!XBHNZKGU", name = "c", descriptor = "I")
    public int field1653;

    @OriginalMember(owner = "client!XBHNZKGU", name = "d", descriptor = "I")
    public int field1654;

    @OriginalMember(owner = "client!XBHNZKGU", name = "k", descriptor = "I")
    public int field1661;

    @OriginalMember(owner = "client!XBHNZKGU", name = "l", descriptor = "I")
    public int field1662;

    @OriginalMember(owner = "client!XBHNZKGU", name = "m", descriptor = "I")
    public int field1663;

    @OriginalMember(owner = "client!XBHNZKGU", name = "f", descriptor = "LXETSOHUA;")
    public class66 field1656;

    @OriginalMember(owner = "client!XBHNZKGU", name = "b", descriptor = "[LXBHNZKGU;")
    public static class63[] field1652;

    @OriginalMember(owner = "client!XBHNZKGU", name = "a", descriptor = "(LLKPVZAQN;I)V")
    public static void method561(class33 arg0, int arg1) {
        int var2 = 36 / arg1;
        class58 var3 = new class58((byte) -115, arg0.method323("spotanim.dat", null));
        field1651 = var3.method517();
        if (field1652 == null) {
            field1652 = new class63[field1651];
        }
        for (int var4 = 0; var4 < field1651; var4++) {
            if (field1652[var4] == null) {
                field1652[var4] = new class63();
            }
            field1652[var4].field1653 = var4;
            field1652[var4].method562(var3, 767);
        }
    }

    @OriginalMember(owner = "client!XBHNZKGU", name = "a", descriptor = "(LWBEWPIXO;I)V")
    public void method562(class58 arg0, int arg1) {
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method515();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1654 = arg0.method517();
                } else if (var3 == 2) {
                    this.field1655 = arg0.method517();
                    if (class66.field1693 != null) {
                        this.field1656 = class66.field1693[this.field1655];
                    }
                } else if (var3 == 4) {
                    this.field1659 = arg0.method517();
                } else if (var3 == 5) {
                    this.field1660 = arg0.method517();
                } else if (var3 == 6) {
                    this.field1661 = arg0.method517();
                } else if (var3 == 7) {
                    this.field1662 = arg0.method515();
                } else if (var3 == 8) {
                    this.field1663 = arg0.method515();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1657[var3 - 40] = arg0.method517();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1658[var3 - 50] = arg0.method517();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!XBHNZKGU", name = "a", descriptor = "()LFCIDIKVY;")
    public class19 method563() {
        class19 var1 = (class19) field1664.method334((long) this.field1653);
        if (var1 != null) {
            return var1;
        }
        class19 var2 = class19.method199(this.field1654);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1657[0] != 0) {
                var2.method213(this.field1657[var3], this.field1658[var3]);
            }
        }
        field1664.method335(97, (long) this.field1653, var2);
        return var2;
    }
}
