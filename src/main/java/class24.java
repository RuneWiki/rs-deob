import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HZCWGKOF")
public class class24 {

    @OriginalMember(owner = "HZCWGKOF", name = "a", descriptor = "I")
    private int field811 = -683;

    @OriginalMember(owner = "HZCWGKOF", name = "h", descriptor = "I")
    public int field818 = -1;

    @OriginalMember(owner = "HZCWGKOF", name = "j", descriptor = "Z")
    public boolean field820 = false;

    @OriginalMember(owner = "HZCWGKOF", name = "k", descriptor = "I")
    public int field821 = 5;

    @OriginalMember(owner = "HZCWGKOF", name = "l", descriptor = "I")
    public int field822 = -1;

    @OriginalMember(owner = "HZCWGKOF", name = "m", descriptor = "I")
    public int field823 = -1;

    @OriginalMember(owner = "HZCWGKOF", name = "n", descriptor = "I")
    public int field824 = 99;

    @OriginalMember(owner = "HZCWGKOF", name = "o", descriptor = "I")
    public int field825 = -1;

    @OriginalMember(owner = "HZCWGKOF", name = "p", descriptor = "I")
    public int field826 = -1;

    @OriginalMember(owner = "HZCWGKOF", name = "q", descriptor = "I")
    public int field827 = 2;

    @OriginalMember(owner = "HZCWGKOF", name = "b", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "HZCWGKOF", name = "d", descriptor = "I")
    public int field814;

    @OriginalMember(owner = "HZCWGKOF", name = "r", descriptor = "I")
    public int field828;

    @OriginalMember(owner = "HZCWGKOF", name = "s", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "HZCWGKOF", name = "e", descriptor = "[I")
    public int[] field815;

    @OriginalMember(owner = "HZCWGKOF", name = "f", descriptor = "[I")
    public int[] field816;

    @OriginalMember(owner = "HZCWGKOF", name = "g", descriptor = "[I")
    private int[] field817;

    @OriginalMember(owner = "HZCWGKOF", name = "i", descriptor = "[I")
    public int[] field819;

    @OriginalMember(owner = "HZCWGKOF", name = "c", descriptor = "[LHZCWGKOF;")
    public static class24[] field813;

    @OriginalMember(owner = "HZCWGKOF", name = "a", descriptor = "(ZLXMRRKSSB;)V")
    public static void method226(boolean arg0, class60 arg1) {
        if (arg0) {
            return;
        }
        class62 var2 = new class62(arg1.method465("seq.dat", null), 49938);
        field812 = var2.method480();
        if (field813 == null) {
            field813 = new class24[field812];
        }
        for (int var3 = 0; var3 < field812; var3++) {
            if (field813[var3] == null) {
                field813[var3] = new class24();
            }
            field813[var3].method228(var2, 168);
        }
    }

    @OriginalMember(owner = "HZCWGKOF", name = "a", descriptor = "(II)I")
    public int method227(int arg0, int arg1) {
        int var3 = 82 / arg0;
        int var4 = this.field817[arg1];
        if (var4 == 0) {
            class49 var5 = class49.method400((byte) -10, this.field815[arg1]);
            if (var5 != null) {
                var4 = this.field817[arg1] = var5.field1273;
            }
        }
        if (var4 == 0) {
            var4 = 1;
        }
        return var4;
    }

    @OriginalMember(owner = "HZCWGKOF", name = "a", descriptor = "(LXQPFGONL;I)V")
    public void method228(class62 arg0, int arg1) {
        if (arg1 <= 0) {
            this.field811 = -401;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method478();
                if (var3 == 0) {
                    if (this.field814 == 0) {
                        this.field814 = 1;
                        this.field815 = new int[1];
                        this.field815[0] = -1;
                        this.field816 = new int[1];
                        this.field816[0] = -1;
                        this.field817 = new int[1];
                        this.field817[0] = -1;
                    }
                    if (this.field825 == -1) {
                        if (this.field819 == null) {
                            this.field825 = 0;
                        } else {
                            this.field825 = 2;
                        }
                    }
                    if (this.field826 == -1) {
                        if (this.field819 != null) {
                            this.field826 = 2;
                            return;
                        }
                        this.field826 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field814 = arg0.method478();
                    this.field815 = new int[this.field814];
                    this.field816 = new int[this.field814];
                    this.field817 = new int[this.field814];
                    for (int var4 = 0; var4 < this.field814; var4++) {
                        this.field815[var4] = arg0.method480();
                        this.field816[var4] = arg0.method480();
                        if (this.field816[var4] == 65535) {
                            this.field816[var4] = -1;
                        }
                        this.field817[var4] = arg0.method480();
                    }
                } else if (var3 == 2) {
                    this.field818 = arg0.method480();
                } else if (var3 == 3) {
                    int var5 = arg0.method478();
                    this.field819 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field819[var6] = arg0.method478();
                    }
                    this.field819[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field820 = true;
                } else if (var3 == 5) {
                    this.field821 = arg0.method478();
                } else if (var3 == 6) {
                    this.field822 = arg0.method480();
                } else if (var3 == 7) {
                    this.field823 = arg0.method480();
                } else if (var3 == 8) {
                    this.field824 = arg0.method478();
                } else if (var3 == 9) {
                    this.field825 = arg0.method478();
                } else if (var3 == 10) {
                    this.field826 = arg0.method478();
                } else if (var3 == 11) {
                    this.field827 = arg0.method478();
                } else if (var3 == 12) {
                    this.field828 = arg0.method483();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
