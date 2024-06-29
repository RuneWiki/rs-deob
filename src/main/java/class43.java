import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class43 {

    @OriginalMember(owner = "client!d", name = "e", descriptor = "Z")
    public boolean field655 = false;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public int field657 = -1;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public int field660 = 5;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "Z")
    public boolean field654 = false;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public int field656 = -1;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "I")
    public int field667 = 99;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public int field659 = -1;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "Z")
    public boolean field663 = false;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "I")
    public int field670 = -1;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public int field668 = 2;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "Z")
    public boolean field669 = false;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    public int field661 = -1;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field658 = 0;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "[I")
    public static int[] field662 = new int[50];

    @OriginalMember(owner = "client!d", name = "w", descriptor = "Z")
    public static boolean field673 = false;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!d", name = "z", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!d", name = "B", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!d", name = "F", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "[I")
    public int[] field651;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "[I")
    public int[] field677;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "[I")
    private int[] field681;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "[Z")
    public boolean[] field680;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "[[I")
    public int[][] field665;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V", line = 6)
    public static final void method313(int arg0) {
        field672++;
        if (class10.field83) {
            return;
        }
        if (class336.field5314) {
            class84.field1426 = (float) ((int) class84.field1426 + 47 & 0xFFFFFFF0);
        } else {
            class357.field5652 += (12.0F - class357.field5652) / 2.0F;
        }
        class175.field2807 = true;
        int var1 = -58 % ((arg0 - 1) / 42);
        class10.field83 = true;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lo;IZII)Lo;", line = 36)
    public final class96 method314(class96 arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field675++;
        int var6 = this.field651[arg4];
        int var7 = this.field677[arg4];
        class257 var8 = class230.method1782(var7 >> 16, -51);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg0.method532(true, true, true);
        }
        if (arg2) {
            this.field657 = 2;
        }
        class257 var10 = null;
        if ((this.field663 || class94.field1575) && arg1 != -1 && arg1 < this.field677.length) {
            int var11 = this.field677[arg1];
            var10 = class230.method1782(var11 >> 16, -80);
            arg1 = var11 & 0xFFFF;
        }
        class96 var12;
        if (var10 == null) {
            var12 = arg0.method532(!var8.method1968(var9, (byte) -111), !var8.method1972(var9, -480), !this.field669);
        } else {
            var12 = arg0.method532(!var8.method1968(var9, (byte) -76) & !var10.method1968(arg1, (byte) -116), !var8.method1972(var9, -480) & !var10.method1972(arg1, -480), !this.field669);
        }
        var12.method746(var8, var9, var10, arg1, arg3 - 1, var6, this.field669);
        return var12;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIBLwf;)V", line = 77)
    public static final void method315(int arg0, int arg1, byte arg2, class250 arg3) {
        if (arg2 > -68) {
            return;
        }
        if (arg3.field4137 == 0) {
            arg3.field4213 = arg3.field4132;
        } else if (arg3.field4137 == 1) {
            arg3.field4213 = (arg0 - arg3.field4157) / 2 + arg3.field4132;
        } else if (arg3.field4137 == 2) {
            arg3.field4213 = arg0 - arg3.field4157 - arg3.field4132;
        } else if (arg3.field4137 == 3) {
            arg3.field4213 = arg3.field4132 * arg0 >> 14;
        } else if (arg3.field4137 == 4) {
            arg3.field4213 = (arg0 - arg3.field4157) / 2 + (arg3.field4132 * arg0 >> 14);
        } else {
            arg3.field4213 = arg0 - (arg3.field4132 * arg0 >> 14) - arg3.field4157;
        }
        field678++;
        if (arg3.field4234 == 0) {
            arg3.field4147 = arg3.field4192;
        } else if (arg3.field4234 == 1) {
            arg3.field4147 = (arg1 - arg3.field4081) / 2 + arg3.field4192;
        } else if (arg3.field4234 == 2) {
            arg3.field4147 = arg1 - arg3.field4081 - arg3.field4192;
        } else if (arg3.field4234 == 3) {
            arg3.field4147 = arg3.field4192 * arg1 >> 14;
        } else if (arg3.field4234 == 4) {
            arg3.field4147 = (arg3.field4192 * arg1 >> 14) + (arg1 - arg3.field4081) / 2;
        } else {
            arg3.field4147 = arg1 - arg3.field4081 - (arg3.field4192 * arg1 >> 14);
        }
        if (!class178.field2857 || !(client.method336(arg3).field1710 != 0 || arg3.field4078 == 0)) {
            return;
        }
        if (arg3.field4147 < 0) {
            arg3.field4147 = 0;
        } else if (arg3.field4147 + arg3.field4081 > arg1) {
            arg3.field4147 = arg1 - arg3.field4081;
        }
        if (arg3.field4213 < 0) {
            arg3.field4213 = 0;
        } else if ((arg3.field4213 + arg3.field4157) > arg0) {
            arg3.field4213 = arg0 - arg3.field4157;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IILo;III)Lo;", line = 155)
    public final class96 method316(int arg0, int arg1, class96 arg2, int arg3, int arg4, int arg5) {
        field676++;
        int var7 = this.field651[arg3];
        int var8 = this.field677[arg3];
        class257 var9 = class230.method1782(var8 >> 16, -85);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg2.method518(true, true, true);
        }
        int var11 = arg5 & 0x3;
        if (arg4 != 28505) {
            this.field668 = 67;
        }
        class257 var12 = null;
        if ((this.field663 || class94.field1575) && arg0 != -1 && this.field677.length > arg0) {
            int var13 = this.field677[arg0];
            var12 = class230.method1782(var13 >> 16, -118);
            arg0 = var13 & 0xFFFF;
        }
        class96 var14;
        if (var12 == null) {
            var14 = arg2.method518(!var9.method1968(var10, (byte) 77), !var9.method1972(var10, arg4 - 28985), !this.field669);
        } else {
            var14 = arg2.method518(!var9.method1968(var10, (byte) -57) & !var12.method1968(arg0, (byte) -101), !var9.method1972(var10, -480) & !var12.method1972(arg0, -480), !this.field669);
        }
        if (class42.field607 && this.field669) {
            if (var11 == 1) {
                ((class337) var14).method2363();
            } else if (var11 == 2) {
                ((class337) var14).method2365();
            } else if (var11 == 3) {
                ((class337) var14).method2367();
            }
        } else if (var11 == 1) {
            var14.method526();
        } else if (var11 == 2) {
            var14.method514();
        } else if (var11 == 3) {
            var14.method522();
        }
        var14.method746(var9, var10, var12, arg0, arg1 - 1, var7, this.field669);
        if (class42.field607 && this.field669) {
            if (var11 == 1) {
                ((class337) var14).method2367();
            } else if (var11 == 2) {
                ((class337) var14).method2365();
            } else if (var11 == 3) {
                ((class337) var14).method2363();
            }
        } else if (var11 == 1) {
            var14.method522();
        } else if (var11 == 2) {
            var14.method514();
        } else if (var11 == 3) {
            var14.method526();
        }
        return var14;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lqm;I)V", line = 270)
    public final void method317(class227 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1720((byte) -69);
            if (var3 == 0) {
                if (arg1 != 0) {
                    this.field680 = (boolean[]) null;
                }
                field653++;
                return;
            }
            this.method320(false, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILo;III)Lo;", line = 301)
    public final class96 method318(int arg0, class96 arg1, int arg2, int arg3, int arg4) {
        field674++;
        int var6 = this.field677[arg2];
        int var7 = this.field651[arg2];
        class257 var8 = class230.method1782(var6 >> 16, -73);
        int var9 = var6 & 0xFFFF;
        if (var8 == null) {
            return arg1.method515(true, true, true);
        }
        class257 var10 = null;
        class257 var11 = null;
        class257 var12 = null;
        if ((this.field663 || class94.field1575) && arg4 != -1 && arg4 < this.field677.length) {
            int var13 = this.field677[arg4];
            var10 = class230.method1782(var13 >> 16, -108);
            arg4 = var13 & 0xFFFF;
        }
        int var14 = 0;
        int var15 = 0;
        if (this.field681 != null) {
            if (this.field681.length > arg2) {
                var14 = this.field681[arg2];
                if (var14 != 65535) {
                    var11 = class230.method1782(var14 >> 16, -105);
                    var14 &= 0xFFFF;
                }
            }
            if ((this.field663 || class94.field1575) && arg4 != -1 && this.field681.length > arg4) {
                var15 = this.field681[arg4];
                if (var15 != 65535) {
                    var12 = class230.method1782(var15 >> 16, -86);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method1968(var9, (byte) 127);
        boolean var17 = !var8.method1972(var9, -480);
        if (arg0 > -7) {
            return (class96) null;
        }
        if (var11 != null) {
            var16 &= !var11.method1968(var14, (byte) -111);
            var17 &= !var11.method1972(var14, -480);
        }
        if (var10 != null) {
            var16 &= !var10.method1968(arg4, (byte) -63);
            var17 &= !var10.method1972(arg4, -480);
        }
        if (var12 != null) {
            var16 &= !var12.method1968(var15, (byte) 51);
            var17 &= !var12.method1972(var15, -480);
        }
        class96 var18 = arg1.method515(var16, var17, !this.field669);
        var18.method746(var8, var9, var10, arg4, arg3 - 1, var7, this.field669);
        if (var11 != null) {
            var18.method746(var11, var14, var12, var15, arg3 - 1, var7, this.field669);
        }
        return var18;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lo;IIBII)Lo;", line = 410)
    public final class96 method319(class96 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        int var7 = this.field651[arg4];
        field666++;
        int var8 = this.field677[arg4];
        class257 var9 = class230.method1782(var8 >> 16, -93);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg0.method515(true, true, true);
        }
        int var11 = arg5 & 0x3;
        class257 var12 = null;
        if ((this.field663 || class94.field1575) && arg1 != -1 && this.field677.length > arg1) {
            int var13 = this.field677[arg1];
            var12 = class230.method1782(var13 >> 16, -52);
            arg1 = var13 & 0xFFFF;
        }
        class96 var14;
        if (var12 == null) {
            var14 = arg0.method515(!var9.method1968(var10, (byte) -62), !var9.method1972(var10, -480), !this.field669);
        } else {
            var14 = arg0.method515(!var9.method1968(var10, (byte) 97) & !var12.method1968(arg1, (byte) -94), !var9.method1972(var10, -480) & !var12.method1972(arg1, -480), !this.field669);
        }
        if (this.field669 && class42.field607) {
            if (var11 == 1) {
                ((class337) var14).method2363();
            } else if (var11 == 2) {
                ((class337) var14).method2365();
            } else if (var11 == 3) {
                ((class337) var14).method2367();
            }
        } else if (var11 == 1) {
            var14.method526();
        } else if (var11 == 2) {
            var14.method514();
        } else if (var11 == 3) {
            var14.method522();
        }
        if (arg3 <= 64) {
            this.method317((class227) null, -110);
        }
        var14.method746(var9, var10, var12, arg1, arg2 - 1, var7, this.field669);
        if (this.field669 && class42.field607) {
            if (var11 == 1) {
                ((class337) var14).method2367();
            } else if (var11 == 2) {
                ((class337) var14).method2365();
            } else if (var11 == 3) {
                ((class337) var14).method2363();
            }
        } else if (var11 == 1) {
            var14.method522();
        } else if (var11 == 2) {
            var14.method514();
        } else if (var11 == 3) {
            var14.method526();
        }
        return var14;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZLqm;I)V", line = 510)
    private final void method320(boolean arg0, class227 arg1, int arg2) {
        field664++;
        if (arg2 == 1) {
            int var4 = arg1.method1765(true);
            this.field651 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field651[var5] = arg1.method1765(!arg0);
            }
            this.field677 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field677[var6] = arg1.method1765(true);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field677[var7] += arg1.method1765(true) << 16;
            }
        } else if (arg2 == 2) {
            this.field661 = arg1.method1765(!arg0);
        } else if (arg2 == 3) {
            this.field680 = new boolean[256];
            int var8 = arg1.method1720((byte) -42);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field680[arg1.method1720((byte) -17)] = true;
            }
        } else if (arg2 == 4) {
            this.field655 = true;
        } else if (arg2 == 5) {
            this.field660 = arg1.method1720((byte) -88);
        } else if (arg2 == 6) {
            this.field659 = arg1.method1765(true);
        } else if (arg2 == 7) {
            this.field657 = arg1.method1765(true);
        } else if (arg2 == 8) {
            this.field667 = arg1.method1720((byte) -98);
        } else if (arg2 == 9) {
            this.field656 = arg1.method1720((byte) -73);
        } else if (arg2 == 10) {
            this.field670 = arg1.method1720((byte) -121);
        } else if (arg2 == 11) {
            this.field668 = arg1.method1720((byte) -27);
        } else if (arg2 == 12) {
            int var14 = arg1.method1720((byte) -40);
            this.field681 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field681[var15] = arg1.method1765(true);
            }
            for (int var16 = 0; var16 < var14; var16++) {
                this.field681[var16] = (arg1.method1765(!arg0) << 16) + this.field681[var16];
            }
        } else if (arg2 == 13) {
            int var10 = arg1.method1765(true);
            this.field665 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg1.method1720((byte) -20);
                if (var12 > 0) {
                    this.field665[var11] = new int[var12];
                    this.field665[var11][0] = arg1.method1736(255);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field665[var11][var13] = arg1.method1765(true);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field669 = true;
        } else if (arg2 == 15) {
            this.field663 = true;
        } else if (arg2 == 16) {
            this.field654 = true;
        }
        if (arg0) {
            this.method318(-68, (class96) null, 67, -35, 26);
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)Z", line = 676)
    public static final boolean method321(int arg0) {
        field682++;
        if (class350.field5564) {
            try {
                return !(Boolean) class88.method702(class128.field2163.field2350, "showingVideoAd", (byte) 94);
            } catch (Throwable var2) {
            }
        }
        if (arg0 != 1) {
            field658 = -8;
        }
        return true;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V", line = 710)
    public static final void method322(byte arg0) {
        field652++;
        class317.field5061.method2327(1);
        class221.field3587.method2327(1);
        int var1 = 46 / ((18 - arg0) / 50);
        class323.field5150.method2327(1);
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V", line = 723)
    public final void method323(int arg0) {
        if (this.field670 == -1) {
            if (this.field680 == null) {
                this.field670 = 0;
            } else {
                this.field670 = 2;
            }
        }
        if (this.field656 == -1) {
            if (this.field680 == null) {
                this.field656 = 0;
            } else {
                this.field656 = 2;
            }
        }
        field679++;
        if (arg0 != 24418) {
            this.field659 = -40;
        }
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V", line = 761)
    public static void method324(int arg0) {
        field662 = null;
        if (arg0 != 28432) {
            method324(-32);
        }
    }
}
