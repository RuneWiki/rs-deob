import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class class90 extends class113 {

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "Z")
    public static boolean field2030 = false;

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "Z")
    public static boolean field2040 = false;

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "Lgd;")
    private static class40 field2036 = class14.method90(false, "Login server offline)3");

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "Lgd;")
    public static class40 field2029 = field2036;

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "I")
    public static int field2041 = 0;

    @OriginalMember(owner = "client!pa", name = "D", descriptor = "Lgd;")
    public static class40 field2037 = class14.method90(false, "chatback");

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "Lgd;")
    private static class40 field2043 = class14.method90(false, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!pa", name = "E", descriptor = "Lgd;")
    public static class40 field2038 = class14.method90(false, "Wen m-Ochten Sie hinzuf-Ugen?");

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "Lgd;")
    public static class40 field2039 = class14.method90(false, "sich mit einer anderen Welt zu verbinden)3");

    @OriginalMember(owner = "client!pa", name = "L", descriptor = "[Lqa;")
    public static class96[] field2044 = new class96[2048];

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "Lgd;")
    public static class40 field2035 = class14.method90(false, "Lade Eingabe)2Steuerungsprogramm)3)3)3");

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "Lgd;")
    public static class40 field2048 = class14.method90(false, "Schlie-8en");

    @OriginalMember(owner = "client!pa", name = "N", descriptor = "Lgd;")
    public static class40 field2046 = field2043;

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!pa", name = "M", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "Lw;")
    public static class135 field2042;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(JIII)V", line = 7)
    public final void method596(long arg0, int arg1, int arg2, int arg3) {
        field2032++;
        if (arg1 < 68) {
            this.method596(14L, 91, 74, 127);
        }
        int var6 = (int) ((double) arg2 * Math.pow(0.1D, (double) arg3 * 5.0E-4D) + 0.5D);
        if (class69.field1669 == var6) {
            return;
        }
        class69.field1669 = var6;
        for (int var7 = 0; var7 < 16; var7++) {
            int var8 = method597(var7);
            this.method454(var7 + 176, 7, var8 >> 7, arg0);
            this.method454(var7 + 176, 39, var8 & 0x7F, arg0);
        }
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)I", line = 43)
    private static final int method597(int arg0) {
        int var1 = class34.field862[arg0];
        int var2 = (class69.field1669 * var1 >> 8) * var1;
        return (int) (Math.sqrt((double) var2) + 0.5D);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(JB)V", line = 50)
    public final void method598(long arg0, byte arg1) {
        for (int var4 = 0; var4 < 128; var4++) {
            int var11 = class94.field2155[var4];
            class94.field2155[var4] = 0;
            for (int var12 = 0; var12 < 16; var12++) {
                if ((var11 & 0x1 << var12) != 0) {
                    this.method454(var12 + 144, var4, 0, arg0);
                }
            }
        }
        field2034++;
        for (int var5 = 0; var5 < 16; var5++) {
            this.method454(var5 + 176, 123, 0, arg0);
        }
        for (int var6 = 0; var6 < 16; var6++) {
            this.method454(var6 + 176, 120, 0, arg0);
        }
        for (int var7 = 0; var7 < 16; var7++) {
            this.method454(var7 + 176, 121, 0, arg0);
        }
        int var8 = 0;
        if (arg1 != 91) {
            field2029 = null;
        }
        while (var8 < 16) {
            this.method454(var8 + 176, 0, 0, arg0);
            var8++;
        }
        for (int var9 = 0; var9 < 16; var9++) {
            this.method454(var9 + 176, 32, 0, arg0);
        }
        for (int var10 = 0; var10 < 16; var10++) {
            this.method454(var10 + 192, 0, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(IIIJ)Z", line = 134)
    public final boolean method599(int arg0, int arg1, int arg2, long arg3) {
        if ((arg0 & 0xE0) == 128) {
            int var6 = 0x1 << (arg0 & 0xF);
            int var7 = class94.field2155[arg1];
            if (arg0 < 144 || arg2 == 0) {
                class94.field2155[arg1] = var7 & ~var6;
            } else if ((var7 & var6) == 0) {
                class94.field2155[arg1] = var7 | var6;
            } else {
                this.method454(arg0, arg1, 0, arg3);
            }
            return false;
        }
        if ((arg0 & 0xF0) == 176) {
            if (arg1 == 121) {
                this.method454(arg0, arg1, arg2, arg3);
                int var8 = arg0 & 0xF;
                class34.field862[var8] = 12800;
                int var9 = method597(var8);
                this.method454(arg0, 7, var9 >> 7, arg3);
                this.method454(arg0, 39, var9 & 0x7F, arg3);
                return true;
            }
            if (arg1 == 7 || arg1 == 39) {
                int var10 = arg0 & 0xF;
                if (arg1 == 7) {
                    class34.field862[var10] = (arg2 << 7) + (class34.field862[var10] & 0x7F);
                } else {
                    class34.field862[var10] = (class34.field862[var10] & 0x3F80) + arg2;
                }
                int var11 = method597(var10);
                this.method454(arg0, 7, var11 >> 7, arg3);
                this.method454(arg0, 39, var11 & 0x7F, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)V", line = 215)
    public static void method600(int arg0) {
        field2044 = null;
        field2035 = null;
        field2048 = null;
        field2046 = null;
        field2042 = null;
        field2029 = null;
        field2043 = null;
        field2038 = null;
        field2036 = null;
        field2037 = null;
        field2039 = null;
        if (arg0 > -18) {
            method602(-85, -62, -39, 59, -60, 23, 71);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IJI)V", line = 245)
    public final void method601(int arg0, long arg1, int arg2) {
        class69.field1669 = arg2;
        for (int var5 = arg0; var5 < 16; var5++) {
            class34.field862[var5] = 12800;
        }
        for (int var6 = 0; var6 < 16; var6++) {
            int var7 = method597(var6);
            this.method454(var6 + 176, 7, var7 >> 7, arg1);
            this.method454(var6 + 176, 39, var7 & 0x7F, arg1);
        }
        field2031++;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(IIIIIII)I", line = 296)
    public static final int method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 & 0x3;
        if ((arg1 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg6;
            arg6 = var8;
        }
        if (arg4 != 7) {
            field2036 = null;
        }
        field2045++;
        if (var7 == 0) {
            return arg2;
        } else if (var7 == 1) {
            return 1 + 7 - arg0 - arg5;
        } else if (var7 == 2) {
            return 7 + 1 - arg6 - arg2;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(B)V", line = 326)
    public static final void method603(byte arg0) {
        int var1 = -49 / ((arg0 - 52) / 45);
        field2033++;
        while (class100.field2376.method300(0, class51.field1305) >= 11) {
            int var2 = class100.field2376.method298(11, 19600);
            if (var2 == 2047) {
                break;
            }
            boolean var3 = false;
            if (field2044[var2] == null) {
                field2044[var2] = new class96();
                if (class35.field897[var2] != null) {
                    field2044[var2].method650(256, class35.field897[var2]);
                }
                var3 = true;
            }
            class77.field1787[class1.field18++] = var2;
            class96 var4 = field2044[var2];
            var4.field829 = class10.field242;
            int var5 = class92.field2109[class100.field2376.method298(3, 19600)];
            if (var3) {
                var4.field828 = var5;
            }
            int var6 = class100.field2376.method298(5, 19600);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class100.field2376.method298(5, 19600);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class100.field2376.method298(1, 19600);
            if (var8 == 1) {
                class104.field2519[class44.field1114++] = var2;
            }
            int var9 = class100.field2376.method298(1, 19600);
            var4.method203(true, class13.field332.field819[0] + var7, var9 == 1, class13.field332.field803[0] + var6);
        }
        class100.field2376.method289((byte) -58);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIJ)V")
    public abstract void method454(int arg0, int arg1, int arg2, long arg3);
}
