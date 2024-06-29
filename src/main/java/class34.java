import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class34 {

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public int field752 = 0;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public int field749 = -1;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public int field761 = -1;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public int field759 = -1;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public int field750 = 0;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public int field755 = -1;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public int field765 = -1;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public int field769 = 0;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public int field762 = -1;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public int field757 = -1;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    public int field770 = 0;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public int field768 = -1;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public int field771 = 0;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public int field758 = -1;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public int field751 = -1;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    public int field772 = -1;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public int field773 = -1;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
    public int field776 = 0;

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
    public int field779 = -1;

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
    public int field782 = -1;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    public int field774 = 0;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
    public int field785 = -1;

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
    public int field784 = 0;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public int field763 = 0;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    public int field783 = 0;

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "I")
    public int field786 = -1;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Lud;")
    public static class279 field753 = class130.method1024("k", 255);

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "[Lfg;")
    public static class211[] field775 = new class211[14];

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
    public static int field778 = 0;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "Lhc;")
    public static class171 field767 = new class171(50);

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "[[I")
    public int[][] field766;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 31)
    public static void method302(int arg0) {
        field753 = null;
        if (arg0 != -1593) {
            field777 = 18;
        }
        field775 = null;
        field767 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)Lg;", line = 69)
    public static final class158 method303(byte arg0) {
        class158 var1 = new class158(class86.field1646, class111.field2045, class44.field915[0], class216.field3811[0], class1.field92[0], class115.field2097[0], class113.field2080[0], class217.field3839);
        field760++;
        class162.method1278(false);
        if (arg0 >= -114) {
            method303((byte) 108);
        }
        return var1;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lvh;IZ)V", line = 87)
    private final void method304(class53 arg0, int arg1, boolean arg2) {
        if (arg1 == 1) {
            this.field765 = arg0.method468(28214);
            this.field773 = arg0.method468(28214);
            if (this.field773 == 65535) {
                this.field773 = -1;
            }
            if (this.field765 == 65535) {
                this.field765 = -1;
            }
        } else if (arg1 == 2) {
            this.field785 = arg0.method468(28214);
        } else if (arg1 == 3) {
            this.field761 = arg0.method468(28214);
        } else if (arg1 == 4) {
            this.field757 = arg0.method468(28214);
        } else if (arg1 == 5) {
            this.field779 = arg0.method468(28214);
        } else if (arg1 == 6) {
            this.field751 = arg0.method468(28214);
        } else if (arg1 == 7) {
            this.field759 = arg0.method468(28214);
        } else if (arg1 == 8) {
            this.field758 = arg0.method468(28214);
        } else if (arg1 == 9) {
            this.field782 = arg0.method468(28214);
        } else if (arg1 == 26) {
            this.field771 = (short) (arg0.method483(-110) * 4);
            this.field763 = (short) (arg0.method483(-113) * 4);
        } else if (arg1 == 27) {
            if (this.field766 == null) {
                this.field766 = new int[12][];
            }
            int var4 = arg0.method483(-108);
            this.field766[var4] = new int[6];
            for (int var5 = 0; var5 < 6; var5++) {
                this.field766[var4][var5] = arg0.method495((byte) 95);
            }
        } else if (arg1 == 29) {
            this.field770 = arg0.method483(-103);
        } else if (arg1 == 30) {
            this.field784 = arg0.method468(28214);
        } else if (arg1 == 31) {
            this.field750 = arg0.method483(-111);
        } else if (arg1 == 32) {
            this.field783 = arg0.method468(28214);
        } else if (arg1 == 33) {
            this.field752 = arg0.method495((byte) -108);
        } else if (arg1 == 34) {
            this.field774 = arg0.method483(-128);
        } else if (arg1 == 35) {
            this.field776 = arg0.method468(28214);
        } else if (arg1 == 36) {
            this.field769 = arg0.method495((byte) 120);
        } else if (arg1 == 37) {
            this.field772 = arg0.method483(-121);
        } else if (arg1 == 38) {
            this.field786 = arg0.method468(28214);
        } else if (arg1 == 39) {
            this.field762 = arg0.method468(28214);
        } else if (arg1 == 40) {
            this.field755 = arg0.method468(28214);
        } else if (arg1 == 41) {
            this.field749 = arg0.method468(28214);
        } else if (arg1 == 42) {
            this.field768 = arg0.method468(28214);
        } else if (arg1 == 43) {
            arg0.method468(28214);
        } else if (arg1 == 44) {
            arg0.method468(28214);
        } else if (arg1 == 45) {
            arg0.method468(28214);
        }
        field764++;
        if (arg2) {
            this.field779 = -115;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V", line = 297)
    public final void method305(boolean arg0) {
        if (!arg0) {
            field754++;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V", line = 310)
    public static final void method306(int arg0) {
        field756++;
        class144 var1 = new class144();
        int var2 = -119 % ((68 - arg0) / 50);
        for (int var3 = 0; var3 < 13; var3++) {
            for (int var4 = 0; var4 < 13; var4++) {
                class309.field5482[var3][var4] = var1;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZLvh;)V", line = 371)
    public final void method307(boolean arg0, class53 arg1) {
        field781++;
        if (!arg0) {
            return;
        }
        while (true) {
            int var3 = arg1.method483(-107);
            if (var3 == 0) {
                return;
            }
            this.method304(arg1, var3, false);
        }
    }
}
