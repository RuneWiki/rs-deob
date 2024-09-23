import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FULHVSIU")
public class class21 {

    @OriginalMember(owner = "FULHVSIU", name = "f", descriptor = "I")
    public int field706 = -1;

    @OriginalMember(owner = "FULHVSIU", name = "h", descriptor = "[I")
    public int[] field708 = new int[6];

    @OriginalMember(owner = "FULHVSIU", name = "i", descriptor = "[I")
    public int[] field709 = new int[6];

    @OriginalMember(owner = "FULHVSIU", name = "j", descriptor = "I")
    public int field710 = 128;

    @OriginalMember(owner = "FULHVSIU", name = "k", descriptor = "I")
    public int field711 = 128;

    @OriginalMember(owner = "FULHVSIU", name = "o", descriptor = "LHPFNYARJ;")
    public static class25 field715 = new class25((byte) 41, 30);

    @OriginalMember(owner = "FULHVSIU", name = "b", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "FULHVSIU", name = "d", descriptor = "I")
    public int field704;

    @OriginalMember(owner = "FULHVSIU", name = "e", descriptor = "I")
    public int field705;

    @OriginalMember(owner = "FULHVSIU", name = "l", descriptor = "I")
    public int field712;

    @OriginalMember(owner = "FULHVSIU", name = "m", descriptor = "I")
    public int field713;

    @OriginalMember(owner = "FULHVSIU", name = "n", descriptor = "I")
    public int field714;

    @OriginalMember(owner = "FULHVSIU", name = "g", descriptor = "LNMXKUYSC;")
    public class42 field707;

    @OriginalMember(owner = "FULHVSIU", name = "a", descriptor = "Z")
    private static boolean field701;

    @OriginalMember(owner = "FULHVSIU", name = "c", descriptor = "[LFULHVSIU;")
    public static class21[] field703;

    @OriginalMember(owner = "FULHVSIU", name = "a", descriptor = "(ILCVNWKEAW;)V")
    public static void method229(int arg0, class7 arg1) {
        class62 var2 = new class62(-417, arg1.method180("spotanim.dat", null));
        if (arg0 != 0) {
            field701 = !field701;
        }
        field702 = var2.method523();
        if (field703 == null) {
            field703 = new class21[field702];
        }
        for (int var3 = 0; var3 < field702; var3++) {
            if (field703[var3] == null) {
                field703[var3] = new class21();
            }
            field703[var3].field704 = var3;
            field703[var3].method230((byte) 5, var2);
        }
    }

    @OriginalMember(owner = "FULHVSIU", name = "a", descriptor = "(BLXOUQUKZW;)V")
    public void method230(byte arg0, class62 arg1) {
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method521();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field705 = arg1.method523();
                } else if (var3 == 2) {
                    this.field706 = arg1.method523();
                    if (class42.field1158 != null) {
                        this.field707 = class42.field1158[this.field706];
                    }
                } else if (var3 == 4) {
                    this.field710 = arg1.method523();
                } else if (var3 == 5) {
                    this.field711 = arg1.method523();
                } else if (var3 == 6) {
                    this.field712 = arg1.method523();
                } else if (var3 == 7) {
                    this.field713 = arg1.method521();
                } else if (var3 == 8) {
                    this.field714 = arg1.method521();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field708[var3 - 40] = arg1.method523();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field709[var3 - 50] = arg1.method523();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "FULHVSIU", name = "a", descriptor = "()LKPUOCBCE;")
    public class35 method231() {
        class35 var1 = (class35) field715.method302((long) this.field704);
        if (var1 != null) {
            return var1;
        }
        class35 var2 = class35.method379(this.field705, 0);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field708[0] != 0) {
                var2.method393(this.field708[var3], this.field709[var3]);
            }
        }
        field715.method303((long) this.field704, -15, var2);
        return var2;
    }
}
