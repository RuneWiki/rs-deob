import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GMRGYXFL")
public class class21 {

    @OriginalMember(owner = "GMRGYXFL", name = "i", descriptor = "I")
    public int field822 = -1;

    @OriginalMember(owner = "GMRGYXFL", name = "k", descriptor = "Z")
    public boolean field824 = false;

    @OriginalMember(owner = "GMRGYXFL", name = "l", descriptor = "I")
    public int field825 = 5;

    @OriginalMember(owner = "GMRGYXFL", name = "m", descriptor = "I")
    public int field826 = -1;

    @OriginalMember(owner = "GMRGYXFL", name = "n", descriptor = "I")
    public int field827 = -1;

    @OriginalMember(owner = "GMRGYXFL", name = "o", descriptor = "I")
    public int field828 = 99;

    @OriginalMember(owner = "GMRGYXFL", name = "p", descriptor = "I")
    public int field829 = -1;

    @OriginalMember(owner = "GMRGYXFL", name = "q", descriptor = "I")
    public int field830 = -1;

    @OriginalMember(owner = "GMRGYXFL", name = "r", descriptor = "I")
    public int field831 = 2;

    @OriginalMember(owner = "GMRGYXFL", name = "a", descriptor = "B")
    private static byte field814 = -27;

    @OriginalMember(owner = "GMRGYXFL", name = "b", descriptor = "I")
    private static int field815 = 8;

    @OriginalMember(owner = "GMRGYXFL", name = "c", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "GMRGYXFL", name = "e", descriptor = "I")
    public int field818;

    @OriginalMember(owner = "GMRGYXFL", name = "s", descriptor = "I")
    public int field832;

    @OriginalMember(owner = "GMRGYXFL", name = "t", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "GMRGYXFL", name = "f", descriptor = "[I")
    public int[] field819;

    @OriginalMember(owner = "GMRGYXFL", name = "g", descriptor = "[I")
    public int[] field820;

    @OriginalMember(owner = "GMRGYXFL", name = "h", descriptor = "[I")
    private int[] field821;

    @OriginalMember(owner = "GMRGYXFL", name = "j", descriptor = "[I")
    public int[] field823;

    @OriginalMember(owner = "GMRGYXFL", name = "d", descriptor = "[LGMRGYXFL;")
    public static class21[] field817;

    @OriginalMember(owner = "GMRGYXFL", name = "a", descriptor = "(ILQKFGLETG;)V")
    public static void method276(int arg0, class50 arg1) {
        class68 var2 = new class68((byte) 9, arg1.method402("seq.dat", null));
        field816 = var2.method536();
        if (field817 == null) {
            field817 = new class21[field816];
        }
        for (int var3 = 0; var3 < field816; var3++) {
            if (field817[var3] == null) {
                field817[var3] = new class21();
            }
            field817[var3].method278(field814, var2);
        }
        if (arg0 != 0) {
            field815 = -94;
        }
    }

    @OriginalMember(owner = "GMRGYXFL", name = "a", descriptor = "(BI)I")
    public int method277(byte arg0, int arg1) {
        int var3 = this.field821[arg1];
        if (arg0 != 110) {
            return 2;
        }
        if (var3 == 0) {
            class55 var4 = class55.method427(true, this.field819[arg1]);
            if (var4 != null) {
                var3 = this.field821[arg1] = var4.field1335;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "GMRGYXFL", name = "a", descriptor = "(BLXJCNBMKS;)V")
    public void method278(byte arg0, class68 arg1) {
        if (field814 != arg0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method534();
                if (var3 == 0) {
                    if (this.field818 == 0) {
                        this.field818 = 1;
                        this.field819 = new int[1];
                        this.field819[0] = -1;
                        this.field820 = new int[1];
                        this.field820[0] = -1;
                        this.field821 = new int[1];
                        this.field821[0] = -1;
                    }
                    if (this.field829 == -1) {
                        if (this.field823 == null) {
                            this.field829 = 0;
                        } else {
                            this.field829 = 2;
                        }
                    }
                    if (this.field830 == -1) {
                        if (this.field823 != null) {
                            this.field830 = 2;
                            return;
                        }
                        this.field830 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field818 = arg1.method534();
                    this.field819 = new int[this.field818];
                    this.field820 = new int[this.field818];
                    this.field821 = new int[this.field818];
                    for (int var4 = 0; var4 < this.field818; var4++) {
                        this.field819[var4] = arg1.method536();
                        this.field820[var4] = arg1.method536();
                        if (this.field820[var4] == 65535) {
                            this.field820[var4] = -1;
                        }
                        this.field821[var4] = arg1.method536();
                    }
                } else if (var3 == 2) {
                    this.field822 = arg1.method536();
                } else if (var3 == 3) {
                    int var5 = arg1.method534();
                    this.field823 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field823[var6] = arg1.method534();
                    }
                    this.field823[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field824 = true;
                } else if (var3 == 5) {
                    this.field825 = arg1.method534();
                } else if (var3 == 6) {
                    this.field826 = arg1.method536();
                } else if (var3 == 7) {
                    this.field827 = arg1.method536();
                } else if (var3 == 8) {
                    this.field828 = arg1.method534();
                } else if (var3 == 9) {
                    this.field829 = arg1.method534();
                } else if (var3 == 10) {
                    this.field830 = arg1.method534();
                } else if (var3 == 11) {
                    this.field831 = arg1.method534();
                } else if (var3 == 12) {
                    this.field832 = arg1.method539();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
