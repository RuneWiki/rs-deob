import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public class class32 extends class451 {

    @OriginalMember(owner = "client!bja", name = "B", descriptor = "I")
    private int field825 = 0;

    @OriginalMember(owner = "client!bja", name = "A", descriptor = "Leq;")
    private class213 field824 = new class213(16);

    @OriginalMember(owner = "client!bja", name = "N", descriptor = "I")
    private int field837 = 0;

    @OriginalMember(owner = "client!bja", name = "J", descriptor = "Luh;")
    private class168 field833 = new class168();

    @OriginalMember(owner = "client!bja", name = "O", descriptor = "J")
    private long field838 = 0L;

    @OriginalMember(owner = "client!bja", name = "q", descriptor = "I")
    private int field814;

    @OriginalMember(owner = "client!bja", name = "F", descriptor = "Lnw;")
    private class586 field829;

    @OriginalMember(owner = "client!bja", name = "I", descriptor = "Z")
    private boolean field832;

    @OriginalMember(owner = "client!bja", name = "M", descriptor = "Luh;")
    private class168 field836;

    @OriginalMember(owner = "client!bja", name = "k", descriptor = "I")
    private int field808;

    @OriginalMember(owner = "client!bja", name = "m", descriptor = "[B")
    private byte[] field810;

    @OriginalMember(owner = "client!bja", name = "s", descriptor = "I")
    private int field816;

    @OriginalMember(owner = "client!bja", name = "E", descriptor = "Lnw;")
    private class586 field828;

    @OriginalMember(owner = "client!bja", name = "P", descriptor = "Z")
    private boolean field839;

    @OriginalMember(owner = "client!bja", name = "n", descriptor = "Ltha;")
    private class295 field811;

    @OriginalMember(owner = "client!bja", name = "u", descriptor = "Laca;")
    private class724 field818;

    @OriginalMember(owner = "client!bja", name = "v", descriptor = "Lffa;")
    private class187 field819;

    @OriginalMember(owner = "client!bja", name = "g", descriptor = "Lmu;")
    public static class303 field804 = new class303(74, 28);

    @OriginalMember(owner = "client!bja", name = "h", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!bja", name = "j", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!bja", name = "l", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!bja", name = "o", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!bja", name = "p", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!bja", name = "t", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!bja", name = "w", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!bja", name = "x", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!bja", name = "y", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!bja", name = "z", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!bja", name = "C", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!bja", name = "D", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!bja", name = "G", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!bja", name = "H", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!bja", name = "K", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!bja", name = "i", descriptor = "Lvw;")
    private class307 field806;

    @OriginalMember(owner = "client!bja", name = "L", descriptor = "Z")
    private boolean field835;

    @OriginalMember(owner = "client!bja", name = "r", descriptor = "[B")
    private byte[] field815;

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(I)I", line = 13)
    public final int method423(int arg0) {
        field834++;
        if (this.field806 == null) {
            return 0;
        } else if (this.field832) {
            if (arg0 != 24940) {
                this.method427(-32);
            }
            class362 var2 = this.field836.method1269(arg0 ^ 0x6168);
            return var2 == null ? 0 : (int) var2.field5204;
        } else {
            return this.field806.field4255;
        }
    }

    @OriginalMember(owner = "client!bja", name = "b", descriptor = "(I)V", line = 37)
    public final void method424(int arg0) {
        field813++;
        if (arg0 != 0) {
            this.field839 = false;
        }
        if (this.field836 == null || this.method437((byte) 56) == null) {
            return;
        }
        for (class362 var2 = this.field833.method1269(4); var2 != null; var2 = this.field833.method1264((byte) 112)) {
            int var3 = (int) var2.field5204;
            if (var3 < 0 || var3 >= this.field806.field4262 || this.field806.field4253[var3] == 0) {
                var2.method2314((byte) 37);
            } else {
                if (this.field815[var3] == 0) {
                    this.method435(var3, (byte) 65, 1);
                }
                if (this.field815[var3] == -1) {
                    this.method435(var3, (byte) 65, 2);
                }
                if (this.field815[var3] == 1) {
                    var2.method2314((byte) 29);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bja", name = "c", descriptor = "(I)V", line = 81)
    public final void method425(int arg0) {
        field820++;
        if (this.field836 != null) {
            if (this.method437((byte) 56) == null) {
                return;
            }
            if (this.field832) {
                boolean var2 = true;
                for (class362 var3 = this.field836.method1269(4); var3 != null; var3 = this.field836.method1264((byte) 106)) {
                    int var5 = (int) var3.field5204;
                    if (this.field815[var5] == 0) {
                        this.method435(var5, (byte) 65, 1);
                    }
                    if (this.field815[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method2314((byte) 22);
                    }
                }
                while (this.field837 < this.field806.field4253.length) {
                    if (this.field806.field4253[this.field837] == 0) {
                        this.field837++;
                    } else {
                        if (this.field818.field9817 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field815[this.field837] == 0) {
                            this.method435(this.field837, (byte) 65, 1);
                        }
                        if (this.field815[this.field837] == 0) {
                            class362 var4 = new class362();
                            var4.field5204 = this.field837;
                            this.field836.method1273(var4, -20180);
                            var2 = false;
                        }
                        this.field837++;
                    }
                }
                if (var2) {
                    this.field837 = 0;
                    this.field832 = false;
                }
            } else if (this.field835) {
                boolean var6 = true;
                for (class362 var7 = this.field836.method1269(4); var7 != null; var7 = this.field836.method1264((byte) 43)) {
                    int var9 = (int) var7.field5204;
                    if (this.field815[var9] != 1) {
                        this.method435(var9, (byte) 65, 2);
                    }
                    if (this.field815[var9] == 1) {
                        var7.method2314((byte) 60);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field837 < this.field806.field4253.length) {
                    if (this.field806.field4253[this.field837] == 0) {
                        this.field837++;
                    } else {
                        if (this.field811.method1933(-124)) {
                            var6 = false;
                            break;
                        }
                        if (this.field815[this.field837] != 1) {
                            this.method435(this.field837, (byte) 65, 2);
                        }
                        if (this.field815[this.field837] != 1) {
                            class362 var8 = new class362();
                            var8.field5204 = this.field837;
                            var6 = false;
                            this.field836.method1273(var8, arg0 - 20179);
                        }
                        this.field837++;
                    }
                }
                if (var6) {
                    this.field837 = 0;
                    this.field835 = false;
                }
            } else {
                this.field836 = null;
            }
        }
        if (arg0 != -1 || !this.field839 || class554.method3190(-94) < this.field838) {
            return;
        }
        for (class187 var10 = (class187) this.field824.method1469(0); var10 != null; var10 = (class187) this.field824.method1467(0)) {
            if (!var10.field2808) {
                if (var10.field2811) {
                    if (!var10.field2807) {
                        throw new RuntimeException();
                    }
                    var10.method2314((byte) 116);
                } else {
                    var10.field2811 = true;
                }
            }
        }
        this.field838 = class554.method3190(-82) + 1000L;
    }

    @OriginalMember(owner = "client!bja", name = "d", descriptor = "(I)V", line = 259)
    public static void method426(int arg0) {
        if (arg0 == 0) {
            field804 = null;
        }
    }

    @OriginalMember(owner = "client!bja", name = "e", descriptor = "(I)I", line = 275)
    public final int method427(int arg0) {
        field821++;
        if (this.field806 == null) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.method430((byte) -34, 120);
            }
            return this.field806.field4255;
        }
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(IB)[B", line = 291)
    public final byte[] method428(int arg0, byte arg1) {
        int var3 = -16 / ((arg1 + 44) / 37);
        field827++;
        class187 var4 = this.method435(arg0, (byte) 65, 0);
        if (var4 == null) {
            return null;
        } else {
            byte[] var5 = var4.method680(16);
            var4.method2314((byte) 33);
            return var5;
        }
    }

    @OriginalMember(owner = "client!bja", name = "f", descriptor = "(I)V", line = 311)
    public final void method429(int arg0) {
        if (arg0 != 27872) {
            return;
        }
        field830++;
        if (this.field829 != null) {
            this.field835 = true;
            if (this.field836 == null) {
                this.field836 = new class168();
            }
        }
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(BI)V", line = 335)
    public final void method430(byte arg0, int arg1) {
        field809++;
        if (arg0 != -52) {
            this.field806 = null;
        }
        if (this.field829 == null) {
            return;
        }
        for (class362 var3 = this.field833.method1269(arg0 ^ 0xFFFFFFC8); var3 != null; var3 = this.field833.method1264((byte) 124)) {
            if ((long) arg1 == var3.field5204) {
                return;
            }
        }
        class362 var4 = new class362();
        var4.field5204 = arg1;
        this.field833.method1273(var4, -20180);
    }

    @OriginalMember(owner = "client!bja", name = "b", descriptor = "(B)Ljava/lang/String;", line = 364)
    public static final String method431(byte arg0) {
        if (arg0 != -119) {
            return null;
        }
        field807++;
        if (class311.field4321 || class693.field9372 == null) {
            return "";
        } else if ((class693.field9372.field4498 == null || class693.field9372.field4498.length() == 0) && class693.field9372.field4492 != null && class693.field9372.field4492.length() > 0) {
            return class693.field9372.field4492;
        } else {
            return class693.field9372.field4498;
        }
    }

    @OriginalMember(owner = "client!bja", name = "g", descriptor = "(I)I", line = 390)
    public static final int method432(int arg0) {
        field817++;
        if (arg0 != -8454) {
            method438(44, -11, 126);
        }
        byte var1;
        if (class69.field1286 < 96) {
            class76.method709(0, true);
            var1 = 1;
        } else {
            int var2 = class685.method3833(-26584);
            if (var2 <= 100) {
                var1 = 4;
                class405.method2525(58);
            } else if (var2 <= 500) {
                var1 = 3;
                class439.method2649((byte) -59);
            } else if (var2 <= 1000) {
                var1 = 2;
                class670.method3765(true);
            } else {
                class76.method709(0, true);
                var1 = 1;
            }
        }
        if (class693.field9368.field4468.method1099(-32350) != 0) {
            class693.field9368.method2065((byte) 74, class693.field9368.field4448, 0);
            class171.method1284(false, (byte) 120, 0);
        }
        class310.method2019(37);
        return var1;
    }

    @OriginalMember(owner = "client!bja", name = "h", descriptor = "(I)I", line = 459)
    public final int method433(int arg0) {
        if (arg0 != 1) {
            this.method434(11, -116);
        }
        field831++;
        if (this.method437((byte) 56) == null) {
            return this.field819 == null ? 0 : this.field819.method678(16);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(II)I", line = 482)
    public final int method434(int arg0, int arg1) {
        field805++;
        class187 var3 = (class187) this.field824.method1465((long) arg0, -6008);
        if (arg1 != -22197) {
            this.field816 = 21;
        }
        return var3 == null ? 0 : var3.method678(16);
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(IBI)Lffa;", line = 499)
    private final class187 method435(int arg0, byte arg1, int arg2) {
        if (arg1 != 65) {
            this.field815 = null;
        }
        field826++;
        class187 var4 = (class187) this.field824.method1465((long) arg0, -6008);
        if (var4 != null && arg2 == 0 && !var4.field2807 && var4.field2808) {
            var4.method2314((byte) 66);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field829 == null || this.field815[arg0] == -1) {
                    if (this.field811.method1934(-9)) {
                        return null;
                    }
                    var4 = this.field811.method1940((byte) -125, (byte) 2, true, arg0, this.field814);
                } else {
                    var4 = this.field818.method4017(this.field829, arg0, (byte) -110);
                }
            } else if (arg2 == 1) {
                if (this.field829 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field818.method4016(this.field829, arg0, (byte) -112);
            } else if (arg2 == 2) {
                if (this.field829 == null) {
                    throw new RuntimeException();
                }
                if (this.field815[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field811.method1933(-120)) {
                    return null;
                }
                var4 = this.field811.method1940((byte) 97, (byte) 2, false, arg0, this.field814);
            } else {
                throw new RuntimeException();
            }
            this.field824.method1468((byte) 73, (long) arg0, var4);
        }
        if (var4.field2808) {
            return null;
        }
        byte[] var5 = var4.method680(16);
        if (!(var4 instanceof class68)) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class190.field2832.reset();
                class190.field2832.update(var5, 0, var5.length - 2);
                int var6 = (int) class190.field2832.getValue();
                if (this.field806.field4257[arg0] != var6) {
                    throw new RuntimeException();
                }
                if (this.field806.field4258 != null && this.field806.field4258[arg0] != null) {
                    byte[] var7 = this.field806.field4258[arg0];
                    byte[] var8 = class208.method1434(arg1 ^ 0x1196, 0, var5, var5.length - 2);
                    for (int var9 = 0; var9 < 64; var9++) {
                        if (var7[var9] != var8[var9]) {
                            throw new RuntimeException();
                        }
                    }
                }
                this.field811.field4148 = 0;
                this.field811.field4149 = 0;
            } catch (RuntimeException var17) {
                this.field811.method1938(-1);
                var4.method2314((byte) 44);
                if (var4.field2807 && !this.field811.method1934(arg1 ^ 0x1F)) {
                    class421 var10 = this.field811.method1940((byte) 111, (byte) 2, true, arg0, this.field814);
                    this.field824.method1468((byte) 84, (long) arg0, var10);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field806.field4250[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field806.field4250[arg0];
            if (this.field829 != null) {
                this.field818.method4011(var5, this.field829, (byte) 10, arg0);
                if (this.field815[arg0] != 1) {
                    this.field825++;
                    this.field815[arg0] = 1;
                }
            }
            if (!var4.field2807) {
                var4.method2314((byte) 110);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class190.field2832.reset();
            class190.field2832.update(var5, 0, var5.length - 2);
            int var11 = (int) class190.field2832.getValue();
            if (this.field806.field4257[arg0] != var11) {
                throw new RuntimeException();
            }
            if (this.field806.field4258 != null && this.field806.field4258[arg0] != null) {
                byte[] var12 = this.field806.field4258[arg0];
                byte[] var13 = class208.method1434(arg1 + 4502, 0, var5, var5.length - 2);
                for (int var14 = 0; var14 < 64; var14++) {
                    if (var12[var14] != var13[var14]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var15 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field806.field4250[arg0] & 0xFFFF) != var15) {
                throw new RuntimeException();
            }
            if (this.field815[arg0] != 1) {
                this.field825++;
                this.field815[arg0] = 1;
            }
            if (!var4.field2807) {
                var4.method2314((byte) 115);
            }
            return var4;
        } catch (Exception var18) {
            this.field815[arg0] = -1;
            var4.method2314((byte) 121);
            if (var4.field2807 && !this.field811.method1934(-30)) {
                class421 var16 = this.field811.method1940((byte) 99, (byte) 2, true, arg0, this.field814);
                this.field824.method1468((byte) 66, (long) arg0, var16);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!bja", name = "<init>", descriptor = "(ILnw;Lnw;Ltha;Laca;I[BIZ)V", line = 908)
    public class32(int arg0, class586 arg1, class586 arg2, class295 arg3, class724 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field814 = arg0;
        this.field829 = arg1;
        if (this.field829 == null) {
            this.field832 = false;
        } else {
            this.field832 = true;
            this.field836 = new class168();
        }
        this.field808 = arg5;
        this.field810 = arg6;
        this.field816 = arg7;
        this.field828 = arg2;
        this.field839 = arg8;
        this.field811 = arg3;
        this.field818 = arg4;
        if (this.field828 != null) {
            this.field819 = this.field818.method4017(this.field828, this.field814, (byte) -112);
        }
    }

    @OriginalMember(owner = "client!bja", name = "i", descriptor = "(I)I", line = 770)
    public final int method436(int arg0) {
        if (arg0 == 0) {
            field823++;
            return this.field825;
        } else {
            return -19;
        }
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(B)Lvw;", line = 781)
    public final class307 method437(byte arg0) {
        field812++;
        if (this.field806 != null) {
            return this.field806;
        } else if (arg0 == 56) {
            if (this.field819 == null) {
                if (this.field811.method1934(-14)) {
                    return null;
                }
                this.field819 = this.field811.method1940((byte) -114, (byte) 0, true, this.field814, 255);
            }
            if (this.field819.field2808) {
                return null;
            }
            byte[] var2 = this.field819.method680(16);
            if (this.field819 instanceof class68) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field806 = new class307(var2, this.field808, this.field810);
                    if (this.field806.field4260 != this.field816) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var3) {
                    this.field806 = null;
                    if (this.field811.method1934(arg0 + 66)) {
                        this.field819 = null;
                    } else {
                        this.field819 = this.field811.method1940((byte) -95, (byte) 0, true, this.field814, 255);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field806 = new class307(var2, this.field808, this.field810);
                } catch (RuntimeException var4) {
                    this.field811.method1938(arg0 - 57);
                    this.field806 = null;
                    if (this.field811.method1934(arg0 ^ 0xFFFFFFE9)) {
                        this.field819 = null;
                    } else {
                        this.field819 = this.field811.method1940((byte) 47, (byte) 0, true, this.field814, 255);
                    }
                    return null;
                }
                if (this.field828 != null) {
                    this.field818.method4011(var2, this.field828, (byte) 10, this.field814);
                }
            }
            this.field819 = null;
            if (this.field829 != null) {
                this.field825 = 0;
                this.field815 = new byte[this.field806.field4262];
            }
            return this.field806;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(III)Z", line = 878)
    public static final boolean method438(int arg0, int arg1, int arg2) {
        field822++;
        int var3 = -38 / ((60 - arg0) / 40);
        return (arg2 & 0x10) != 0;
    }
}
