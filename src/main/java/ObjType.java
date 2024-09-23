import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cc")
public class ObjType {

    @OriginalMember(owner = "cc", name = "a", descriptor = "I")
    private int field851 = 785;

    @OriginalMember(owner = "cc", name = "i", descriptor = "I")
    public int field859 = -1;

    @OriginalMember(owner = "cc", name = "h", descriptor = "Z")
    public static boolean field858 = true;

    @OriginalMember(owner = "cc", name = "P", descriptor = "Ls;")
    public static LruCache field892 = new LruCache(50, 4);

    @OriginalMember(owner = "cc", name = "Q", descriptor = "Ls;")
    public static LruCache field893 = new LruCache(200, 4);

    @OriginalMember(owner = "cc", name = "D", descriptor = "B")
    private byte field880;

    @OriginalMember(owner = "cc", name = "G", descriptor = "B")
    private byte field883;

    @OriginalMember(owner = "cc", name = "c", descriptor = "I")
    private static int field853;

    @OriginalMember(owner = "cc", name = "g", descriptor = "I")
    private static int field857;

    @OriginalMember(owner = "cc", name = "j", descriptor = "I")
    private int field860;

    @OriginalMember(owner = "cc", name = "o", descriptor = "I")
    public int field865;

    @OriginalMember(owner = "cc", name = "p", descriptor = "I")
    public int field866;

    @OriginalMember(owner = "cc", name = "q", descriptor = "I")
    public int field867;

    @OriginalMember(owner = "cc", name = "r", descriptor = "I")
    private int field868;

    @OriginalMember(owner = "cc", name = "s", descriptor = "I")
    private int field869;

    @OriginalMember(owner = "cc", name = "t", descriptor = "I")
    private int field870;

    @OriginalMember(owner = "cc", name = "v", descriptor = "I")
    public int field872;

    @OriginalMember(owner = "cc", name = "x", descriptor = "I")
    public int field874;

    @OriginalMember(owner = "cc", name = "B", descriptor = "I")
    private int field878;

    @OriginalMember(owner = "cc", name = "C", descriptor = "I")
    private int field879;

    @OriginalMember(owner = "cc", name = "E", descriptor = "I")
    private int field881;

    @OriginalMember(owner = "cc", name = "F", descriptor = "I")
    private int field882;

    @OriginalMember(owner = "cc", name = "H", descriptor = "I")
    private int field884;

    @OriginalMember(owner = "cc", name = "I", descriptor = "I")
    public int field885;

    @OriginalMember(owner = "cc", name = "J", descriptor = "I")
    public int field886;

    @OriginalMember(owner = "cc", name = "K", descriptor = "I")
    public int field887;

    @OriginalMember(owner = "cc", name = "N", descriptor = "I")
    public int field890;

    @OriginalMember(owner = "cc", name = "O", descriptor = "I")
    public int field891;

    @OriginalMember(owner = "cc", name = "e", descriptor = "Lkb;")
    private static Packet field855;

    @OriginalMember(owner = "cc", name = "k", descriptor = "Ljava/lang/String;")
    public String field861;

    @OriginalMember(owner = "cc", name = "b", descriptor = "Z")
    private static boolean field852;

    @OriginalMember(owner = "cc", name = "u", descriptor = "Z")
    private boolean field871;

    @OriginalMember(owner = "cc", name = "w", descriptor = "Z")
    public boolean field873;

    @OriginalMember(owner = "cc", name = "y", descriptor = "Z")
    public boolean field875;

    @OriginalMember(owner = "cc", name = "l", descriptor = "[B")
    public byte[] field862;

    @OriginalMember(owner = "cc", name = "d", descriptor = "[I")
    private static int[] field854;

    @OriginalMember(owner = "cc", name = "m", descriptor = "[I")
    private int[] field863;

    @OriginalMember(owner = "cc", name = "n", descriptor = "[I")
    private int[] field864;

    @OriginalMember(owner = "cc", name = "L", descriptor = "[I")
    public int[] field888;

    @OriginalMember(owner = "cc", name = "M", descriptor = "[I")
    public int[] field889;

    @OriginalMember(owner = "cc", name = "f", descriptor = "[Lcc;")
    private static ObjType[] field856;

    @OriginalMember(owner = "cc", name = "z", descriptor = "[Ljava/lang/String;")
    public String[] field876;

    @OriginalMember(owner = "cc", name = "A", descriptor = "[Ljava/lang/String;")
    public String[] field877;

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Lub;)V")
    public static final void method285(Jagfile arg0) {
        field855 = new Packet(575, arg0.method250(null, 3, "obj.dat"));
        Packet var1 = new Packet(575, arg0.method250(null, 3, "obj.idx"));
        field853 = var1.method211();
        field854 = new int[field853];
        int var2 = 2;
        for (int var3 = 0; var3 < field853; var3++) {
            field854[var3] = var2;
            var2 += var1.method211();
        }
        field856 = new ObjType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field856[var4] = new ObjType();
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Z)V")
    public static final void method286(boolean arg0) {
        field892 = null;
        field893 = null;
        if (arg0) {
            field854 = null;
            field856 = null;
            field855 = null;
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(I)Lcc;")
    public static final ObjType method287(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field856[var1].field859 == arg0) {
                return field856[var1];
            }
        }
        field857 = (field857 + 1) % 10;
        ObjType var2 = field856[field857];
        field855.field612 = field854[arg0];
        var2.field859 = arg0;
        var2.method288();
        var2.method289(field855, (byte) 6);
        if (var2.field891 != -1) {
            var2.method290(7);
        }
        if (!field858 && var2.field875) {
            var2.field861 = "Members Object";
            var2.field862 = "Login to a members' server to use this object.".getBytes();
            var2.field876 = null;
            var2.field877 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "()V")
    public final void method288() {
        this.field860 = 0;
        this.field861 = null;
        this.field862 = null;
        this.field863 = null;
        this.field864 = null;
        this.field865 = 2000;
        this.field866 = 0;
        this.field867 = 0;
        this.field868 = 0;
        this.field869 = 0;
        this.field870 = 0;
        this.field871 = false;
        this.field872 = -1;
        this.field873 = false;
        this.field874 = 1;
        this.field875 = false;
        this.field876 = null;
        this.field877 = null;
        this.field878 = -1;
        this.field879 = -1;
        this.field880 = 0;
        this.field881 = -1;
        this.field882 = -1;
        this.field883 = 0;
        this.field884 = -1;
        this.field885 = -1;
        this.field886 = -1;
        this.field887 = -1;
        this.field888 = null;
        this.field889 = null;
        this.field890 = -1;
        this.field891 = -1;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Lkb;B)V")
    public final void method289(Packet arg0, byte arg1) {
        if (arg1 != 6) {
            field852 = !field852;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method209();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field860 = arg0.method211();
                } else if (var3 == 2) {
                    this.field861 = arg0.method216();
                } else if (var3 == 3) {
                    this.field862 = arg0.method217(true);
                } else if (var3 == 4) {
                    this.field865 = arg0.method211();
                } else if (var3 == 5) {
                    this.field866 = arg0.method211();
                } else if (var3 == 6) {
                    this.field867 = arg0.method211();
                } else if (var3 == 7) {
                    this.field869 = arg0.method211();
                    if (this.field869 > 32767) {
                        this.field869 -= 65536;
                    }
                } else if (var3 == 8) {
                    this.field870 = arg0.method211();
                    if (this.field870 > 32767) {
                        this.field870 -= 65536;
                    }
                } else if (var3 == 9) {
                    this.field871 = true;
                } else if (var3 == 10) {
                    this.field872 = arg0.method211();
                } else if (var3 == 11) {
                    this.field873 = true;
                } else if (var3 == 12) {
                    this.field874 = arg0.method214();
                } else if (var3 == 16) {
                    this.field875 = true;
                } else if (var3 == 23) {
                    this.field878 = arg0.method211();
                    this.field880 = arg0.method210();
                } else if (var3 == 24) {
                    this.field879 = arg0.method211();
                } else if (var3 == 25) {
                    this.field881 = arg0.method211();
                    this.field883 = arg0.method210();
                } else if (var3 == 26) {
                    this.field882 = arg0.method211();
                } else if (var3 >= 30 && var3 < 35) {
                    if (this.field876 == null) {
                        this.field876 = new String[5];
                    }
                    this.field876[var3 - 30] = arg0.method216();
                    if (this.field876[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field876[var3 - 30] = null;
                    }
                } else if (var3 >= 35 && var3 < 40) {
                    if (this.field877 == null) {
                        this.field877 = new String[5];
                    }
                    this.field877[var3 - 35] = arg0.method216();
                } else if (var3 == 40) {
                    int var4 = arg0.method209();
                    this.field863 = new int[var4];
                    this.field864 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field863[var5] = arg0.method211();
                        this.field864[var5] = arg0.method211();
                    }
                } else if (var3 == 90) {
                    this.field884 = arg0.method211();
                } else if (var3 == 91) {
                    this.field886 = arg0.method211();
                } else if (var3 == 92) {
                    this.field885 = arg0.method211();
                } else if (var3 == 93) {
                    this.field887 = arg0.method211();
                } else if (var3 == 95) {
                    this.field868 = arg0.method211();
                } else if (var3 == 97) {
                    this.field890 = arg0.method211();
                } else if (var3 == 98) {
                    this.field891 = arg0.method211();
                } else if (var3 >= 100 && var3 < 110) {
                    if (this.field888 == null) {
                        this.field888 = new int[10];
                        this.field889 = new int[10];
                    }
                    this.field888[var3 - 100] = arg0.method211();
                    this.field889[var3 - 100] = arg0.method211();
                }
            }
        }
    }

    @OriginalMember(owner = "cc", name = "b", descriptor = "(I)V")
    public void method290(int arg0) {
        if (arg0 < 7 || arg0 > 7) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        ObjType var3 = method287(this.field891);
        this.field860 = var3.field860;
        this.field865 = var3.field865;
        this.field866 = var3.field866;
        this.field867 = var3.field867;
        this.field868 = var3.field868;
        this.field869 = var3.field869;
        this.field870 = var3.field870;
        this.field863 = var3.field863;
        this.field864 = var3.field864;
        ObjType var4 = method287(this.field890);
        this.field861 = var4.field861;
        this.field875 = var4.field875;
        this.field874 = var4.field874;
        String var5 = "a";
        char var6 = var4.field861.charAt(0);
        if (var6 == 'A' || var6 == 'E' || var6 == 'I' || var6 == 'O' || var6 == 'U') {
            var5 = "an";
        }
        this.field862 = ("Swap this note at any bank for " + var5 + " " + var4.field861 + ".").getBytes();
        this.field873 = true;
    }

    @OriginalMember(owner = "cc", name = "c", descriptor = "(I)Leb;")
    public final Model method291(int arg0) {
        if (this.field888 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field889[var3] && this.field889[var3] != 0) {
                    var2 = this.field888[var3];
                }
            }
            if (var2 != -1) {
                return method287(var2).method291(1);
            }
        }
        Model var4 = (Model) field892.method102((long) this.field859);
        if (var4 != null) {
            return var4;
        }
        Model var5 = new Model(-26552, this.field860);
        if (this.field863 != null) {
            for (int var6 = 0; var6 < this.field863.length; var6++) {
                var5.method133(this.field863[var6], this.field864[var6]);
            }
        }
        var5.method136(64, 768, -50, -10, -50, true);
        var5.field481 = true;
        field892.method103(3, var5, (long) this.field859);
        return var5;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(III)Lhb;")
    public static final Pix32 method292(int arg0, int arg1, int arg2) {
        Pix32 var3 = (Pix32) field893.method102((long) arg0);
        if (var3 != null && var3.field578 != arg2 && var3.field578 != -1) {
            var3.method107();
            var3 = null;
        }
        if (var3 != null) {
            return var3;
        }
        ObjType var4 = method287(arg0);
        if (var4.field888 == null) {
            arg2 = -1;
        }
        if (arg2 > 1) {
            int var5 = -1;
            for (int var6 = 0; var6 < 10; var6++) {
                if (arg2 >= var4.field889[var6] && var4.field889[var6] != 0) {
                    var5 = var4.field888[var6];
                }
            }
            if (var5 != -1) {
                var4 = method287(var5);
            }
        }
        Pix32 var7 = new Pix32(32, 32);
        int var8 = Pix3D.field551;
        int var9 = Pix3D.field552;
        int[] var10 = Pix3D.field557;
        int[] var11 = Pix2D.field532;
        int var12 = Pix2D.field533;
        int var13 = Pix2D.field534;
        int var14 = Pix2D.field537;
        int var15 = Pix2D.field538;
        int var16 = Pix2D.field535;
        int var17 = Pix2D.field536;
        Pix3D.field549 = false;
        Pix2D.method145(32, var7.field572, (byte) -67, 32);
        Pix2D.method149(32, 32, 0, 0, (byte) -37, 0);
        Pix3D.method154(true);
        Model var18 = var4.method291(1);
        int var19 = Pix3D.field555[var4.field866] * var4.field865 >> 16;
        int var20 = Pix3D.field556[var4.field866] * var4.field865 >> 16;
        var18.method139(0, var4.field867, var4.field868, var4.field866, var4.field869, var18.field472 / 2 + var19 + var4.field870, var4.field870 + var20);
        for (int var21 = 31; var21 >= 0; var21--) {
            for (int var27 = 31; var27 >= 0; var27--) {
                if (var7.field572[var27 * 32 + var21] == 0) {
                    if (var21 > 0 && var7.field572[var27 * 32 + var21 - 1] > 1) {
                        var7.field572[var27 * 32 + var21] = 1;
                    } else if (var27 > 0 && var7.field572[(var27 - 1) * 32 + var21] > 1) {
                        var7.field572[var27 * 32 + var21] = 1;
                    } else if (var21 < 31 && var7.field572[var27 * 32 + var21 + 1] > 1) {
                        var7.field572[var27 * 32 + var21] = 1;
                    } else if (var27 < 31 && var7.field572[(var27 + 1) * 32 + var21] > 1) {
                        var7.field572[var27 * 32 + var21] = 1;
                    }
                }
            }
        }
        for (int var22 = 31; var22 >= 0; var22--) {
            for (int var26 = 31; var26 >= 0; var26--) {
                if (var7.field572[var26 * 32 + var22] == 0 && var22 > 0 && var26 > 0 && var7.field572[(var26 - 1) * 32 + var22 - 1] > 0) {
                    var7.field572[var26 * 32 + var22] = 3153952;
                }
            }
        }
        if (var4.field891 != -1) {
            Pix32 var23 = method292(var4.field890, 0, 10);
            int var24 = var23.field577;
            int var25 = var23.field578;
            var23.field577 = 32;
            var23.field578 = 32;
            var23.method175(22, 22, 5, 5, (byte) 8);
            var23.field577 = var24;
            var23.field578 = var25;
        }
        field893.method103(3, var7, (long) arg0);
        Pix2D.method145(var13, var11, (byte) -67, var12);
        Pix2D.method147(var16, var15, var17, true, var14);
        if (arg1 != 0) {
            field852 = !field852;
        }
        Pix3D.field551 = var8;
        Pix3D.field552 = var9;
        Pix3D.field557 = var10;
        Pix3D.field549 = true;
        if (var4.field873) {
            var7.field577 = 33;
        } else {
            var7.field577 = 32;
        }
        var7.field578 = arg2;
        return var7;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(II)Leb;")
    public final Model method293(int arg0, int arg1) {
        int var3 = this.field878;
        if (arg0 == 1) {
            var3 = this.field881;
        }
        if (var3 == -1) {
            return null;
        }
        int var4 = this.field879;
        if (arg0 == 1) {
            var4 = this.field882;
        }
        Model var5 = new Model(-26552, var3);
        if (arg1 != 3) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (var4 != -1) {
            Model var7 = new Model(-26552, var4);
            Model[] var8 = new Model[] { var5, var7 };
            var5 = new Model(0, var8, 2);
        }
        if (arg0 == 0 && this.field880 != 0) {
            var5.method132(0, 0, this.field880, false);
        }
        if (arg0 == 1 && this.field883 != 0) {
            var5.method132(0, 0, this.field883, false);
        }
        if (this.field863 != null) {
            for (int var9 = 0; var9 < this.field863.length; var9++) {
                var5.method133(this.field863[var9], this.field864[var9]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(BI)Leb;")
    public final Model method294(byte arg0, int arg1) {
        if (arg0 == 3) {
            boolean var3 = false;
        } else {
            this.field851 = 312;
        }
        int var4 = this.field884;
        if (arg1 == 1) {
            var4 = this.field886;
        }
        if (var4 == -1) {
            return null;
        }
        int var5 = this.field885;
        if (arg1 == 1) {
            var5 = this.field887;
        }
        Model var6 = new Model(-26552, var4);
        if (var5 != -1) {
            Model var7 = new Model(-26552, var5);
            Model[] var8 = new Model[] { var6, var7 };
            var6 = new Model(0, var8, 2);
        }
        if (this.field863 != null) {
            for (int var9 = 0; var9 < this.field863.length; var9++) {
                var6.method133(this.field863[var9], this.field864[var9]);
            }
        }
        return var6;
    }
}
