import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JXKRPXFX")
public class class24 {

    @OriginalMember(owner = "client!JXKRPXFX", name = "b", descriptor = "Z")
    private boolean field756 = false;

    @OriginalMember(owner = "client!JXKRPXFX", name = "c", descriptor = "I")
    private int field757 = -254;

    @OriginalMember(owner = "client!JXKRPXFX", name = "h", descriptor = "I")
    public int field762 = -1;

    @OriginalMember(owner = "client!JXKRPXFX", name = "j", descriptor = "[I")
    public int[] field764 = new int[6];

    @OriginalMember(owner = "client!JXKRPXFX", name = "k", descriptor = "[I")
    public int[] field765 = new int[6];

    @OriginalMember(owner = "client!JXKRPXFX", name = "l", descriptor = "I")
    public int field766 = 128;

    @OriginalMember(owner = "client!JXKRPXFX", name = "m", descriptor = "I")
    public int field767 = 128;

    @OriginalMember(owner = "client!JXKRPXFX", name = "a", descriptor = "Z")
    private static boolean field755 = true;

    @OriginalMember(owner = "client!JXKRPXFX", name = "q", descriptor = "LFFRFJBIR;")
    public static class12 field771 = new class12(30, -2745);

    @OriginalMember(owner = "client!JXKRPXFX", name = "d", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!JXKRPXFX", name = "f", descriptor = "I")
    public int field760;

    @OriginalMember(owner = "client!JXKRPXFX", name = "g", descriptor = "I")
    public int field761;

    @OriginalMember(owner = "client!JXKRPXFX", name = "n", descriptor = "I")
    public int field768;

    @OriginalMember(owner = "client!JXKRPXFX", name = "o", descriptor = "I")
    public int field769;

    @OriginalMember(owner = "client!JXKRPXFX", name = "p", descriptor = "I")
    public int field770;

    @OriginalMember(owner = "client!JXKRPXFX", name = "i", descriptor = "LPQTJDTHH;")
    public class37 field763;

    @OriginalMember(owner = "client!JXKRPXFX", name = "e", descriptor = "[LJXKRPXFX;")
    public static class24[] field759;

    @OriginalMember(owner = "client!JXKRPXFX", name = "a", descriptor = "(ZLAKPFVPPG;)V")
    public static void method306(boolean arg0, class2 arg1) {
        if (!arg0) {
            field755 = !field755;
        }
        class13 var2 = new class13(arg1.method7("spotanim.dat", null), (byte) 3);
        field758 = var2.method215();
        if (field759 == null) {
            field759 = new class24[field758];
        }
        for (int var3 = 0; var3 < field758; var3++) {
            if (field759[var3] == null) {
                field759[var3] = new class24();
            }
            field759[var3].field760 = var3;
            field759[var3].method307(var2, 799);
        }
    }

    @OriginalMember(owner = "client!JXKRPXFX", name = "a", descriptor = "(LFTMSICIZ;I)V")
    public void method307(class13 arg0, int arg1) {
        if (arg1 <= 0) {
            this.field757 = -51;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method213();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field761 = arg0.method215();
                } else if (var3 == 2) {
                    this.field762 = arg0.method215();
                    if (class37.field1113 != null) {
                        this.field763 = class37.field1113[this.field762];
                    }
                } else if (var3 == 4) {
                    this.field766 = arg0.method215();
                } else if (var3 == 5) {
                    this.field767 = arg0.method215();
                } else if (var3 == 6) {
                    this.field768 = arg0.method215();
                } else if (var3 == 7) {
                    this.field769 = arg0.method213();
                } else if (var3 == 8) {
                    this.field770 = arg0.method213();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field764[var3 - 40] = arg0.method215();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field765[var3 - 50] = arg0.method215();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!JXKRPXFX", name = "a", descriptor = "()LKUGNQTGL;")
    public class28 method308() {
        class28 var1 = (class28) field771.method198((long) this.field760);
        if (var1 != null) {
            return var1;
        }
        class28 var2 = class28.method330(this.field761);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field764[0] != 0) {
                var2.method344(this.field764[var3], this.field765[var3]);
            }
        }
        field771.method199((long) this.field760, var2, this.field756);
        return var2;
    }
}
