import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class398 {

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "Ler;")
    private class157 field6047 = new class157(64);

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "Ler;")
    public class157 field6062 = new class157(50);

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "Lpb;")
    public class2 field6063 = new class2(250);

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "Lfr;")
    private class228 field6064 = new class228();

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "Lns;")
    public class438 field6059;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "Lns;")
    private class438 field6046;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public int field6045;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "Z")
    private boolean field6057;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "Lwh;")
    private class518 field6068;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public int field6053;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field6069;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field6067;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "Lcm;")
    public static class449 field6058;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    public int field6066;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "Lbl;")
    public static class262 field6048;

    static {
        new class375("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
        field6058 = new class449(4, -1);
        field6065 = 0;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V", line = 4)
    public static void method2442(byte arg0) {
        field6058 = null;
        if (arg0 == -113) {
            field6048 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V", line = 15)
    public final void method2443(int arg0) {
        if (arg0 != -8750) {
            this.field6064 = null;
        }
        class157 var2 = this.field6047;
        synchronized (this.field6047) {
            this.field6047.method1022((byte) -34);
        }
        field6049++;
        class157 var3 = this.field6062;
        synchronized (this.field6062) {
            this.field6062.method1022((byte) -34);
        }
        class2 var4 = this.field6063;
        synchronized (this.field6063) {
            this.field6063.method26(-1);
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V", line = 34)
    public final void method2444(int arg0) {
        class157 var2 = this.field6047;
        synchronized (this.field6047) {
            this.field6047.method1015((byte) 93);
            int var3 = -127 / ((83 - arg0) / 36);
        }
        field6060++;
        class157 var4 = this.field6062;
        synchronized (this.field6062) {
            this.field6062.method1015((byte) 121);
        }
        class2 var5 = this.field6063;
        synchronized (this.field6063) {
            this.field6063.method17(115);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V", line = 52)
    public final void method2445(int arg0, int arg1) {
        field6050++;
        if (arg0 != 36) {
            return;
        }
        this.field6066 = arg1;
        class157 var3 = this.field6062;
        synchronized (this.field6062) {
            this.field6062.method1015((byte) 115);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZ)V", line = 67)
    public final void method2446(int arg0, boolean arg1) {
        field6043++;
        if (this.field6057 == arg1) {
            return;
        }
        this.field6057 = arg1;
        if (arg0 > -52) {
            this.field6066 = 117;
        }
        this.method2444(-17);
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V", line = 82)
    public final void method2447(byte arg0) {
        class157 var2 = this.field6062;
        synchronized (this.field6062) {
            this.field6062.method1015((byte) 92);
        }
        int var3 = -76 % ((arg0 + 10) / 32);
        field6051++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lqa;ZBLoa;ZIILqa;IIILpt;)Lf;", line = 95)
    public final class191 method2448(class496 arg0, boolean arg1, byte arg2, class33 arg3, boolean arg4, int arg5, int arg6, class496 arg7, int arg8, int arg9, int arg10, class395 arg11) {
        if (arg2 != 72) {
            return null;
        }
        field6061++;
        class191 var13 = this.method2449((byte) -116, arg11, arg7, arg8, arg6, arg5, arg10, arg9);
        if (var13 != null) {
            return var13;
        }
        class61 var14 = this.method2451(arg2 - 73, arg8);
        if (arg6 > 1 && var14.field878 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg6 >= var14.field851[var16] && var14.field851[var16] != 0) {
                    var15 = var14.field878[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method2451(-1, var15);
            }
        }
        int[] var17 = var14.method421(arg2 ^ 0x48, arg3, arg0, arg11, arg7, arg5, arg4, arg6, arg9, arg10);
        if (var17 == null) {
            return null;
        }
        class191 var18;
        if (arg1) {
            var18 = arg0.method1097(var17, 0, 36, 36, 32);
        } else {
            var18 = arg7.method1097(var17, 0, 36, 36, 32);
        }
        if (!arg1) {
            class228 var19 = new class228();
            var19.field3276 = arg11 != null;
            var19.field3273 = arg9;
            var19.field3269 = arg6;
            var19.field3267 = arg5;
            var19.field3274 = arg10;
            var19.field3271 = arg8;
            var19.field3272 = arg7.field7242;
            this.field6063.method14(-25264, var18, var19);
        }
        return var18;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLpt;Lqa;IIIII)Lf;", line = 172)
    public final class191 method2449(byte arg0, class395 arg1, class496 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field6064.field3273 = arg7;
        this.field6064.field3271 = arg3;
        this.field6064.field3272 = arg2.field7242;
        int var9 = -112 % ((-arg0 - 50) / 50);
        this.field6064.field3267 = arg5;
        this.field6064.field3276 = arg1 != null;
        this.field6064.field3274 = arg6;
        this.field6064.field3269 = arg4;
        field6044++;
        return (class191) this.field6063.method25(true, this.field6064);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)V", line = 195)
    public final void method2450(int arg0, byte arg1) {
        if (arg1 <= 10) {
            return;
        }
        field6042++;
        class157 var3 = this.field6047;
        synchronized (this.field6047) {
            this.field6047.method1016(arg0, (byte) 115);
        }
        class157 var4 = this.field6062;
        synchronized (this.field6062) {
            this.field6062.method1016(arg0, (byte) 121);
        }
        class2 var5 = this.field6063;
        synchronized (this.field6063) {
            this.field6063.method19(arg0, false);
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)Lje;", line = 216)
    public final class61 method2451(int arg0, int arg1) {
        field6052++;
        class157 var3 = this.field6047;
        class61 var4;
        synchronized (this.field6047) {
            var4 = (class61) this.field6047.method1013((long) arg1, (byte) -106);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6046.method2650(class32.method234(2716, arg1), -43, class110.method728(arg1, false));
        class61 var6 = new class61();
        var6.field809 = this;
        var6.field860 = arg1;
        var6.field869 = new String[] { null, null, class459.field6736.method2335((byte) -100, this.field6045), null, null };
        var6.field854 = new String[] { null, null, null, null, class498.field7271.method2335((byte) -100, this.field6045) };
        if (var5 != null) {
            var6.method408(-1354960195, new class91(var5));
        }
        var6.method418(true);
        if (var6.field829 != arg0) {
            var6.method415(false, this.method2451(-1, var6.field829), this.method2451(-1, var6.field819));
        }
        if (var6.field802 != -1) {
            var6.method420(this.method2451(-1, var6.field852), true, this.method2451(-1, var6.field802));
        }
        if (!this.field6057 && var6.field855) {
            var6.field827 = class5.field64.method2335((byte) -100, this.field6045);
            var6.field863 = null;
            var6.field862 = false;
            var6.field869 = this.field6069;
            var6.field865 = 0;
            var6.field854 = this.field6067;
            if (var6.field859 != null) {
                boolean var7 = false;
                for (class467 var8 = var6.field859.method948(123); var8 != null; var8 = var6.field859.method938(96)) {
                    class109 var9 = this.field6068.method3083((int) var8.field6799, 75);
                    if (var9.field1534) {
                        var8.method2785((byte) -120);
                    } else {
                        var7 = true;
                    }
                }
                if (!var7) {
                    var6.field859 = null;
                }
            }
        }
        class157 var10 = this.field6047;
        synchronized (this.field6047) {
            this.field6047.method1012(-84, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V", line = 290)
    public final void method2452(int arg0) {
        field6054++;
        class2 var2 = this.field6063;
        synchronized (this.field6063) {
            this.field6063.method17(117);
            if (arg0 != -1) {
                field6056 = 118;
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lgo;IZLwh;Lns;Lns;)V", line = 333)
    public class398(class331 arg0, int arg1, boolean arg2, class518 arg3, class438 arg4, class438 arg5) {
        this.field6059 = arg5;
        this.field6046 = arg4;
        this.field6045 = arg1;
        this.field6057 = arg2;
        this.field6068 = arg3;
        if (this.field6046 == null) {
            this.field6053 = 0;
        } else {
            int var7 = this.field6046.method2649(63) - 1;
            this.field6053 = var7 * 256 + this.field6046.method2645(1, var7);
        }
        this.field6069 = new String[] { null, null, class459.field6736.method2335((byte) -100, this.field6045), null, null };
        this.field6067 = new String[] { null, null, null, null, class498.field7271.method2335((byte) -100, this.field6045) };
    }
}
