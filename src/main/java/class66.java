import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class66 {

    @OriginalMember(owner = "client!og", name = "d", descriptor = "Z")
    public boolean field790 = false;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "[I")
    public static int[] field796 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public int field792;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public int field794;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public static int field799;

    static {
        new class72("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
        field798 = -50;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILwo;Lwo;)V", line = 4)
    public static final void method378(int arg0, class285 arg1, class285 arg2) {
        field799++;
        int var3 = 99 / ((arg0 + 33) / 59);
        class320.field4301 = arg2;
        class240.field3158 = arg1;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V", line = 21)
    public static final void method379(int arg0, int arg1) {
        class365 var2 = class242.field3196;
        synchronized (class242.field3196) {
            class242.field3196.method2286(arg1, (byte) 36);
        }
        field795++;
        if (arg0 != -2) {
            field798 = 47;
        }
        class365 var3 = class231.field3036;
        synchronized (class231.field3036) {
            class231.field3036.method2286(arg1, (byte) 36);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lbg;III)V", line = 38)
    private final void method380(class242 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 30647) {
            return;
        }
        if (arg1 == 1) {
            this.field794 = arg0.method1587((byte) -102);
        } else if (arg1 == 2) {
            this.field792 = arg0.method1545(arg2 - 30639);
        } else if (arg1 == 3) {
            this.field790 = true;
        } else if (arg1 == 4) {
            this.field794 = -1;
        }
        field787++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 72)
    public static void method381(int arg0) {
        field796 = null;
        int var1 = 38 / ((arg0 - 63) / 37);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZILuo;)Lc;", line = 81)
    public final class436 method382(int arg0, boolean arg1, int arg2, class118 arg3) {
        field788++;
        long var5 = (long) (arg3.field1360 << 19 | arg0 << 16 | this.field794 | (arg1 ? 262144 : 0));
        if (arg2 < 64) {
            method384((class42) null, 46, -125, -34, -117, 101);
        }
        class436 var7 = (class436) class298.field3973.method2295(var5, (byte) 74);
        if (var7 != null) {
            return var7;
        } else if (class437.field5989.method1797(0, this.field794)) {
            class132 var8 = class132.method849(class437.field5989, this.field794, 0);
            if (var8 != null) {
                var8.field1504 = var8.field1506 = var8.field1502 = var8.field1508 = 0;
                if (arg1) {
                    var8.method861();
                }
                for (int var9 = 0; var9 < arg0; var9++) {
                    var8.method857();
                }
            }
            class436 var10 = arg3.method697(var8, true);
            if (var10 != null) {
                class298.field3973.method2294(var10, (byte) 44, var5);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIB)V", line = 124)
    public static final void method383(int arg0, int arg1, byte arg2) {
        if (arg2 != 70) {
            field797 = 54;
        }
        field793++;
        class12 var3 = class390.method2422(arg2 + 341554970, arg0, 6);
        var3.method66(-58);
        var3.field144 = arg1;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lil;IIIII)V", line = 139)
    public static final void method384(class42 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field494 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field498[var6] != null) {
                arg0.field494++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field494; var7++) {
            int var8 = class59.field747[arg1][arg2][arg3];
            while (var8 != 0) {
                class6 var12 = class349.field4761[(var8 & 0xFF) - 1];
                var8 >>>= 0x8;
                if (arg0.field498[var7] == var12) {
                    continue label50;
                }
            }
            int var9 = class59.field747[arg1][arg4][arg5];
            while (var9 != 0) {
                class6 var11 = class349.field4761[(var9 & 0xFF) - 1];
                var9 >>>= 0x8;
                if (arg0.field498[var7] == var11) {
                    continue label50;
                }
            }
            for (int var10 = var7; var10 < arg0.field494 - 1; var10++) {
                arg0.field498[var10] = arg0.field498[var10 + 1];
            }
            arg0.field494--;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)Z", line = 197)
    public final boolean method385(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            field791++;
            return class437.field5989.method1797(0, this.field794);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILbg;I)V", line = 212)
    public final void method386(int arg0, class242 arg1, int arg2) {
        field789++;
        if (arg0 > -28) {
            this.field792 = 63;
        }
        while (true) {
            int var4 = arg1.method1563(-128);
            if (var4 == 0) {
                return;
            }
            this.method380(arg1, var4, 30647, arg2);
        }
    }
}
