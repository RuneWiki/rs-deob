import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("yb")
public class ObjType {

    @OriginalMember(owner = "yb", name = "d", descriptor = "I")
    private int field784 = 8;

    @OriginalMember(owner = "yb", name = "k", descriptor = "I")
    public int field791 = -1;

    @OriginalMember(owner = "yb", name = "b", descriptor = "Z")
    private static boolean field782 = true;

    @OriginalMember(owner = "yb", name = "e", descriptor = "B")
    private static byte field785 = 2;

    @OriginalMember(owner = "yb", name = "N", descriptor = "Lr;")
    public static LruCache field820 = new LruCache(-947, 50);

    @OriginalMember(owner = "yb", name = "O", descriptor = "Lr;")
    public static LruCache field821 = new LruCache(-947, 200);

    @OriginalMember(owner = "yb", name = "F", descriptor = "B")
    private byte field812;

    @OriginalMember(owner = "yb", name = "I", descriptor = "B")
    private byte field815;

    @OriginalMember(owner = "yb", name = "f", descriptor = "I")
    private static int field786;

    @OriginalMember(owner = "yb", name = "j", descriptor = "I")
    private static int field790;

    @OriginalMember(owner = "yb", name = "l", descriptor = "I")
    private int field792;

    @OriginalMember(owner = "yb", name = "q", descriptor = "I")
    public int field797;

    @OriginalMember(owner = "yb", name = "r", descriptor = "I")
    public int field798;

    @OriginalMember(owner = "yb", name = "s", descriptor = "I")
    public int field799;

    @OriginalMember(owner = "yb", name = "t", descriptor = "I")
    private int field800;

    @OriginalMember(owner = "yb", name = "u", descriptor = "I")
    private int field801;

    @OriginalMember(owner = "yb", name = "v", descriptor = "I")
    private int field802;

    @OriginalMember(owner = "yb", name = "x", descriptor = "I")
    public int field804;

    @OriginalMember(owner = "yb", name = "z", descriptor = "I")
    public int field806;

    @OriginalMember(owner = "yb", name = "D", descriptor = "I")
    private int field810;

    @OriginalMember(owner = "yb", name = "E", descriptor = "I")
    private int field811;

    @OriginalMember(owner = "yb", name = "G", descriptor = "I")
    private int field813;

    @OriginalMember(owner = "yb", name = "H", descriptor = "I")
    private int field814;

    @OriginalMember(owner = "yb", name = "J", descriptor = "I")
    private int field816;

    @OriginalMember(owner = "yb", name = "K", descriptor = "I")
    public int field817;

    @OriginalMember(owner = "yb", name = "L", descriptor = "I")
    public int field818;

    @OriginalMember(owner = "yb", name = "M", descriptor = "I")
    public int field819;

    @OriginalMember(owner = "yb", name = "h", descriptor = "Ljb;")
    private static Packet field788;

    @OriginalMember(owner = "yb", name = "m", descriptor = "Ljava/lang/String;")
    public String field793;

    @OriginalMember(owner = "yb", name = "a", descriptor = "Z")
    private static boolean field781;

    @OriginalMember(owner = "yb", name = "c", descriptor = "Z")
    private static boolean field783;

    @OriginalMember(owner = "yb", name = "w", descriptor = "Z")
    private boolean field803;

    @OriginalMember(owner = "yb", name = "y", descriptor = "Z")
    public boolean field805;

    @OriginalMember(owner = "yb", name = "A", descriptor = "Z")
    public boolean field807;

    @OriginalMember(owner = "yb", name = "n", descriptor = "[B")
    public byte[] field794;

    @OriginalMember(owner = "yb", name = "g", descriptor = "[I")
    private static int[] field787;

    @OriginalMember(owner = "yb", name = "o", descriptor = "[I")
    private int[] field795;

    @OriginalMember(owner = "yb", name = "p", descriptor = "[I")
    private int[] field796;

    @OriginalMember(owner = "yb", name = "i", descriptor = "[Lyb;")
    private static ObjType[] field789;

    @OriginalMember(owner = "yb", name = "B", descriptor = "[Ljava/lang/String;")
    public String[] field808;

    @OriginalMember(owner = "yb", name = "C", descriptor = "[Ljava/lang/String;")
    public String[] field809;

    @OriginalMember(owner = "yb", name = "a", descriptor = "(Ltb;)V")
    public static final void method247(Jagfile arg0) {
        field788 = new Packet(arg0.method225(0, null, "obj.dat"), (byte) 63);
        Packet var1 = new Packet(arg0.method225(0, null, "obj.idx"), (byte) 63);
        field786 = var1.method187();
        field787 = new int[field786];
        int var2 = 2;
        for (int var3 = 0; var3 < field786; var3++) {
            field787[var3] = var2;
            var2 += var1.method187();
        }
        field789 = new ObjType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field789[var4] = new ObjType();
        }
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(I)V")
    public static final void method248(int arg0) {
        field820 = null;
        field821 = null;
        field787 = null;
        int var1 = 23 / arg0;
        field789 = null;
        field788 = null;
    }

    @OriginalMember(owner = "yb", name = "b", descriptor = "(I)Lyb;")
    public static final ObjType method249(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field789[var1].field791 == arg0) {
                return field789[var1];
            }
        }
        field790 = (field790 + 1) % 10;
        ObjType var2 = field789[field790];
        field788.field586 = field787[arg0];
        var2.field791 = arg0;
        var2.method250();
        var2.method251((byte) 4, field788);
        return var2;
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "()V")
    public final void method250() {
        this.field792 = 0;
        this.field793 = null;
        this.field794 = null;
        this.field795 = null;
        this.field796 = null;
        this.field797 = 2000;
        this.field798 = 0;
        this.field799 = 0;
        this.field800 = 0;
        this.field801 = 0;
        this.field802 = 0;
        this.field803 = false;
        this.field804 = -1;
        this.field805 = false;
        this.field806 = 1;
        this.field807 = false;
        this.field808 = null;
        this.field809 = null;
        this.field810 = -1;
        this.field811 = -1;
        this.field812 = 0;
        this.field813 = -1;
        this.field814 = -1;
        this.field815 = 0;
        this.field816 = -1;
        this.field817 = -1;
        this.field818 = -1;
        this.field819 = -1;
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(BLjb;)V")
    public final void method251(byte arg0, Packet arg1) {
        if (arg0 != 4) {
            field781 = !field781;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method185();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field792 = arg1.method187();
                } else if (var3 == 2) {
                    this.field793 = arg1.method192();
                } else if (var3 == 3) {
                    this.field794 = arg1.method193((byte) 2);
                } else if (var3 == 4) {
                    this.field797 = arg1.method187();
                } else if (var3 == 5) {
                    this.field798 = arg1.method187();
                } else if (var3 == 6) {
                    this.field799 = arg1.method187();
                } else if (var3 == 7) {
                    this.field801 = arg1.method187();
                    if (this.field801 > 32767) {
                        this.field801 -= 65536;
                    }
                } else if (var3 == 8) {
                    this.field802 = arg1.method187();
                    if (this.field802 > 32767) {
                        this.field802 -= 65536;
                    }
                } else if (var3 == 9) {
                    this.field803 = true;
                } else if (var3 == 10) {
                    this.field804 = arg1.method187();
                } else if (var3 == 11) {
                    this.field805 = true;
                } else if (var3 == 12) {
                    this.field806 = arg1.method190();
                } else if (var3 == 16) {
                    this.field807 = true;
                } else if (var3 == 23) {
                    this.field810 = arg1.method187();
                    this.field812 = arg1.method186();
                } else if (var3 == 24) {
                    this.field811 = arg1.method187();
                } else if (var3 == 25) {
                    this.field813 = arg1.method187();
                    this.field815 = arg1.method186();
                } else if (var3 == 26) {
                    this.field814 = arg1.method187();
                } else if (var3 >= 30 && var3 < 35) {
                    if (this.field808 == null) {
                        this.field808 = new String[5];
                    }
                    this.field808[var3 - 30] = arg1.method192();
                } else if (var3 >= 35 && var3 < 40) {
                    if (this.field809 == null) {
                        this.field809 = new String[5];
                    }
                    this.field809[var3 - 35] = arg1.method192();
                } else if (var3 == 40) {
                    int var4 = arg1.method185();
                    this.field795 = new int[var4];
                    this.field796 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field795[var5] = arg1.method187();
                        this.field796[var5] = arg1.method187();
                    }
                } else if (var3 == 90) {
                    this.field816 = arg1.method187();
                } else if (var3 == 91) {
                    this.field818 = arg1.method187();
                } else if (var3 == 92) {
                    this.field817 = arg1.method187();
                } else if (var3 == 93) {
                    this.field819 = arg1.method187();
                } else if (var3 == 95) {
                    this.field800 = arg1.method187();
                }
            }
        }
    }

    @OriginalMember(owner = "yb", name = "b", descriptor = "()Ldb;")
    public final Model method252() {
        Model var1 = (Model) field820.method84((long) this.field791);
        if (var1 != null) {
            return var1;
        }
        Model var2 = new Model(this.field792, field783);
        if (this.field795 != null) {
            for (int var3 = 0; var3 < this.field795.length; var3++) {
                var2.method115(this.field795[var3], this.field796[var3]);
            }
        }
        var2.method118(64, 768, -50, -10, -50, true);
        field820.method85(var2, (long) this.field791, field785);
        return var2;
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(II)Lgb;")
    public static final Pix32 method253(int arg0, int arg1) {
        Pix32 var2 = (Pix32) field821.method84((long) arg0);
        if (var2 != null) {
            return var2;
        }
        ObjType var3 = method249(arg0);
        Pix32 var4 = new Pix32(32, 32, 0);
        int var5 = Pix3D.field525;
        int var6 = Pix3D.field526;
        int[] var7 = Pix3D.field531;
        int[] var8 = Pix2D.field506;
        int var9 = Pix2D.field507;
        int var10 = Pix2D.field508;
        Pix3D.field523 = false;
        Pix2D.method127(field782, 32, var4.field547, 32);
        Pix2D.method131(0, 32, 0, false, 32, 0);
        Pix3D.method136((byte) -111);
        Model var11 = var3.method252();
        int var12 = Pix3D.field529[var3.field798] * var3.field797 >> 16;
        int var13 = Pix3D.field530[var3.field798] * var3.field797 >> 16;
        var11.method121(var11.field447 / 2 + var12 + var3.field802, var3.field802 + var13, var3.field801, 0, 0, var3.field800, var3.field798, var3.field799);
        for (int var14 = 31; var14 >= 0; var14--) {
            for (int var18 = 31; var18 >= 0; var18--) {
                if (var4.field547[var18 * 32 + var14] == 0) {
                    if (var14 > 0 && var4.field547[var18 * 32 + var14 - 1] > 1) {
                        var4.field547[var18 * 32 + var14] = 1;
                    } else if (var18 > 0 && var4.field547[(var18 - 1) * 32 + var14] > 1) {
                        var4.field547[var18 * 32 + var14] = 1;
                    } else if (var14 < 31 && var4.field547[var18 * 32 + var14 + 1] > 1) {
                        var4.field547[var18 * 32 + var14] = 1;
                    } else if (var18 < 31 && var4.field547[(var18 + 1) * 32 + var14] > 1) {
                        var4.field547[var18 * 32 + var14] = 1;
                    }
                }
            }
        }
        for (int var15 = 31; var15 >= 0; var15--) {
            for (int var17 = 31; var17 >= 0; var17--) {
                if (var4.field547[var17 * 32 + var15] == 0 && var15 > 0 && var17 > 0 && var4.field547[(var17 - 1) * 32 + var15 - 1] > 0) {
                    var4.field547[var17 * 32 + var15] = 3153952;
                }
            }
        }
        field821.method85(var4, (long) arg0, field785);
        Pix2D.method127(field782, var9, var8, var10);
        Pix3D.field525 = var5;
        Pix3D.field526 = var6;
        Pix3D.field531 = var7;
        Pix3D.field523 = true;
        if (arg1 != -25063) {
            for (int var16 = 1; var16 > 0; var16++) {
            }
        }
        if (var3.field805) {
            var4.field552 = 33;
        } else {
            var4.field552 = 32;
        }
        return var4;
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(IB)Ldb;")
    public final Model method254(int arg0, byte arg1) {
        int var3 = this.field810;
        if (arg0 == 1) {
            var3 = this.field813;
        }
        if (var3 == -1) {
            return null;
        }
        int var4 = this.field811;
        if (arg1 != 1) {
            throw new NullPointerException();
        }
        boolean var5 = false;
        if (arg0 == 1) {
            var4 = this.field814;
        }
        Model var6 = new Model(var3, field783);
        if (var4 != -1) {
            Model var7 = new Model(var4, field783);
            Model[] var8 = new Model[] { var6, var7 };
            var6 = new Model(2, false, var8);
        }
        if (arg0 == 0 && this.field812 != 0) {
            var6.method114(this.field784, 0, 0, this.field812);
        }
        if (arg0 == 1 && this.field815 != 0) {
            var6.method114(this.field784, 0, 0, this.field815);
        }
        if (this.field795 != null) {
            for (int var9 = 0; var9 < this.field795.length; var9++) {
                var6.method115(this.field795[var9], this.field796[var9]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "yb", name = "b", descriptor = "(II)Ldb;")
    public final Model method255(int arg0, int arg1) {
        int var3 = this.field816;
        if (arg1 != -39571) {
            throw new NullPointerException();
        }
        if (arg0 == 1) {
            var3 = this.field818;
        }
        if (var3 == -1) {
            return null;
        }
        int var4 = this.field817;
        if (arg0 == 1) {
            var4 = this.field819;
        }
        Model var5 = new Model(var3, field783);
        if (var4 != -1) {
            Model var6 = new Model(var4, field783);
            Model[] var7 = new Model[] { var5, var6 };
            var5 = new Model(2, false, var7);
        }
        if (this.field795 != null) {
            for (int var8 = 0; var8 < this.field795.length; var8++) {
                var5.method115(this.field795[var8], this.field796[var8]);
            }
        }
        return var5;
    }
}
