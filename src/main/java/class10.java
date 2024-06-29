import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class10 {

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
    private int field346 = 0;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    private int field335;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "[Lq;")
    private class96[] field341;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "Lwb;")
    public static class130 field330 = class26.method212("sich mit einer anderen Welt zu verbinden)3", -32376);

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "Z")
    public static boolean field325 = false;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "Lwb;")
    private static class130 field334 = class26.method212("Please remove ", -32376);

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
    public static int field338 = 0;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Lwb;")
    public static class130 field322 = field334;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public static int field331 = 0;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "Lwb;")
    public static class130 field320 = class26.method212(" )2> @yel@", -32376);

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
    public static int field343 = 0;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "Lwb;")
    public static class130 field342 = class26.method212("gr-Un:", -32376);

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "Lwb;")
    private static class130 field345 = class26.method212("Loaded title screen", -32376);

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "Lwb;")
    public static class130 field339 = field334;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "Lwb;")
    public static class130 field336 = field345;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "J")
    private long field327;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "Lce;")
    public static class18 field329;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "Lq;")
    private class96 field323;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "Lq;")
    private class96 field344;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 4)
    public static final void method73(int arg0) {
        class45.field1220 = 0;
        class14.field403 = 0;
        class116.method897(8708);
        class113.method868(arg0 + 15088);
        class40.method386(arg0 + 15215);
        class67.method549(arg0 ^ 0x3AF2);
        for (int var1 = 0; var1 < class14.field403; var1++) {
            int var3 = class81.field1933[var1];
            if (class130.field3128 != class105.field2550[var3].field2104) {
                class105.field2550[var3] = null;
            }
        }
        field328++;
        if (arg0 != -15091) {
            method73(-86);
        }
        if (class65.field1661 != class67.field1682.field1057) {
            throw new RuntimeException("gpp1 pos:" + class67.field1682.field1057 + " psize:" + class65.field1661);
        }
        for (int var2 = 0; var2 < class61.field1582; var2++) {
            if (class105.field2550[class26.field770[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class61.field1582);
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V", line = 66)
    public static void method74(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field339 = null;
        field342 = null;
        field320 = null;
        field329 = null;
        field322 = null;
        field336 = null;
        field330 = null;
        field345 = null;
        field334 = null;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)Lq;", line = 93)
    public final class96 method75(int arg0) {
        int var2 = -85 / ((arg0 + 50) / 32);
        this.field346 = 0;
        field321++;
        return this.method76(104);
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)Lq;", line = 119)
    private final class96 method76(int arg0) {
        if (arg0 <= 89) {
            this.method75(-33);
        }
        field333++;
        if (this.field346 > 0 && this.field341[this.field346 - 1] != this.field344) {
            class96 var2 = this.field344;
            this.field344 = var2.field2327;
            return var2;
        }
        while (this.field346 < this.field335) {
            class96 var3 = this.field341[this.field346++].field2327;
            if (this.field341[this.field346 - 1] != var3) {
                this.field344 = var3.field2327;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)Lq;", line = 151)
    public final class96 method77(byte arg0) {
        if (arg0 != -127) {
            this.method75(-81);
        }
        field326++;
        if (this.field323 == null) {
            return null;
        }
        class96 var2 = this.field341[(int) (this.field327 & (long) (this.field335 - 1))];
        while (this.field323 != var2) {
            if (this.field323.field2329 == this.field327) {
                class96 var3 = this.field323;
                this.field323 = this.field323.field2327;
                return var3;
            }
            this.field323 = this.field323.field2327;
        }
        this.field323 = null;
        return null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BJ)Lq;", line = 185)
    public final class96 method78(byte arg0, long arg1) {
        this.field327 = arg1;
        class96 var4 = this.field341[(int) ((long) (this.field335 - 1) & arg1)];
        field340++;
        for (this.field323 = var4.field2327; this.field323 != var4; this.field323 = this.field323.field2327) {
            if (this.field323.field2329 == arg1) {
                class96 var5 = this.field323;
                this.field323 = this.field323.field2327;
                return var5;
            }
        }
        if (arg0 != -21) {
            this.method76(-26);
        }
        this.field323 = null;
        return null;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V", line = 230)
    public static final void method79(byte arg0) {
        if (arg0 < 13) {
            method79((byte) 89);
        }
        for (class64 var1 = (class64) class15.field419.method813(-86); var1 != null; var1 = (class64) class15.field419.method814((byte) -19)) {
            if (var1.field1612 == -1) {
                var1.field1629 = 0;
                class36.method363(var1, (byte) 106);
            } else {
                var1.method714((byte) -81);
            }
        }
        field324++;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(I)V", line = 267)
    public class10(int arg0) {
        this.field335 = arg0;
        this.field341 = new class96[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class96 var3 = this.field341[var2] = new class96();
            var3.field2315 = var3;
            var3.field2327 = var3;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(JLq;I)V", line = 289)
    public final void method80(long arg0, class96 arg1, int arg2) {
        field319++;
        if (arg1.field2315 != null) {
            arg1.method714((byte) 63);
        }
        class96 var5 = this.field341[(int) (arg0 & (long) (this.field335 + arg2))];
        arg1.field2327 = var5;
        arg1.field2329 = arg0;
        arg1.field2315 = var5.field2315;
        arg1.field2315.field2327 = arg1;
        arg1.field2327.field2315 = arg1;
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)V", line = 311)
    public static final void method81(int arg0) {
        int var1 = -40 / ((arg0 - 5) / 53);
        field332++;
        class22.field638.method401(26116);
    }
}
