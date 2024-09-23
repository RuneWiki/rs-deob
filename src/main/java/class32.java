import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IUTBNGPH")
public class class32 {

    @OriginalMember(owner = "IUTBNGPH", name = "a", descriptor = "I")
    private int field812 = 22486;

    @OriginalMember(owner = "IUTBNGPH", name = "j", descriptor = "I")
    public int field821 = -1;

    @OriginalMember(owner = "IUTBNGPH", name = "l", descriptor = "Z")
    public boolean field823 = false;

    @OriginalMember(owner = "IUTBNGPH", name = "m", descriptor = "I")
    public int field824 = 5;

    @OriginalMember(owner = "IUTBNGPH", name = "n", descriptor = "I")
    public int field825 = -1;

    @OriginalMember(owner = "IUTBNGPH", name = "o", descriptor = "I")
    public int field826 = -1;

    @OriginalMember(owner = "IUTBNGPH", name = "p", descriptor = "I")
    public int field827 = 99;

    @OriginalMember(owner = "IUTBNGPH", name = "q", descriptor = "I")
    public int field828 = -1;

    @OriginalMember(owner = "IUTBNGPH", name = "r", descriptor = "I")
    public int field829 = -1;

    @OriginalMember(owner = "IUTBNGPH", name = "s", descriptor = "I")
    public int field830 = 2;

    @OriginalMember(owner = "IUTBNGPH", name = "b", descriptor = "I")
    private static int field813 = 3;

    @OriginalMember(owner = "IUTBNGPH", name = "c", descriptor = "I")
    private int field814;

    @OriginalMember(owner = "IUTBNGPH", name = "d", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "IUTBNGPH", name = "f", descriptor = "I")
    public int field817;

    @OriginalMember(owner = "IUTBNGPH", name = "t", descriptor = "I")
    public int field831;

    @OriginalMember(owner = "IUTBNGPH", name = "u", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "IUTBNGPH", name = "g", descriptor = "[I")
    public int[] field818;

    @OriginalMember(owner = "IUTBNGPH", name = "h", descriptor = "[I")
    public int[] field819;

    @OriginalMember(owner = "IUTBNGPH", name = "i", descriptor = "[I")
    private int[] field820;

    @OriginalMember(owner = "IUTBNGPH", name = "k", descriptor = "[I")
    public int[] field822;

    @OriginalMember(owner = "IUTBNGPH", name = "e", descriptor = "[LIUTBNGPH;")
    public static class32[] field816;

    @OriginalMember(owner = "IUTBNGPH", name = "a", descriptor = "(LVSUYIIVA;I)V")
    public static void method321(class62 arg0, int arg1) {
        if (arg1 <= 0) {
            field813 = -283;
        }
        class8 var2 = new class8(arg0.method570("seq.dat", null), 792);
        field815 = var2.method32();
        if (field816 == null) {
            field816 = new class32[field815];
        }
        for (int var3 = 0; var3 < field815; var3++) {
            if (field816[var3] == null) {
                field816[var3] = new class32();
            }
            field816[var3].method323(var2, 22486);
        }
    }

    @OriginalMember(owner = "IUTBNGPH", name = "a", descriptor = "(BI)I")
    public int method322(byte arg0, int arg1) {
        if (arg0 != 5) {
            return 4;
        }
        int var3 = this.field820[arg1];
        if (var3 == 0) {
            class7 var4 = class7.method16(this.field818[arg1], this.field814);
            if (var4 != null) {
                var3 = this.field820[arg1] = var4.field43;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "IUTBNGPH", name = "a", descriptor = "(LCFARFRSG;I)V")
    public void method323(class8 arg0, int arg1) {
        if (this.field812 != arg1) {
            field813 = -148;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method30();
                if (var3 == 0) {
                    if (this.field817 == 0) {
                        this.field817 = 1;
                        this.field818 = new int[1];
                        this.field818[0] = -1;
                        this.field819 = new int[1];
                        this.field819[0] = -1;
                        this.field820 = new int[1];
                        this.field820[0] = -1;
                    }
                    if (this.field828 == -1) {
                        if (this.field822 == null) {
                            this.field828 = 0;
                        } else {
                            this.field828 = 2;
                        }
                    }
                    if (this.field829 == -1) {
                        if (this.field822 != null) {
                            this.field829 = 2;
                            return;
                        }
                        this.field829 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field817 = arg0.method30();
                    this.field818 = new int[this.field817];
                    this.field819 = new int[this.field817];
                    this.field820 = new int[this.field817];
                    for (int var4 = 0; var4 < this.field817; var4++) {
                        this.field818[var4] = arg0.method32();
                        this.field819[var4] = arg0.method32();
                        if (this.field819[var4] == 65535) {
                            this.field819[var4] = -1;
                        }
                        this.field820[var4] = arg0.method32();
                    }
                } else if (var3 == 2) {
                    this.field821 = arg0.method32();
                } else if (var3 == 3) {
                    int var5 = arg0.method30();
                    this.field822 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field822[var6] = arg0.method30();
                    }
                    this.field822[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field823 = true;
                } else if (var3 == 5) {
                    this.field824 = arg0.method30();
                } else if (var3 == 6) {
                    this.field825 = arg0.method32();
                } else if (var3 == 7) {
                    this.field826 = arg0.method32();
                } else if (var3 == 8) {
                    this.field827 = arg0.method30();
                } else if (var3 == 9) {
                    this.field828 = arg0.method30();
                } else if (var3 == 10) {
                    this.field829 = arg0.method30();
                } else if (var3 == 11) {
                    this.field830 = arg0.method30();
                } else if (var3 == 12) {
                    this.field831 = arg0.method35();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
