import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class177 {

    @OriginalMember(owner = "client!me", name = "k", descriptor = "Lwba;")
    private class46 field2528;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "Lnea;")
    public static class664 field2520 = new class664(6, 8);

    @OriginalMember(owner = "client!me", name = "f", descriptor = "[[Z")
    public static boolean[][] field2523 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!me", name = "j", descriptor = "Lkea;")
    public static class213 field2527 = new class213(8);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "Lqv;")
    public static class409 field2526;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "Lpca;")
    private class665 field2521;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V", line = 5)
    public static final void method1201(int arg0, int arg1) {
        field2518++;
        class382 var2 = class513.field7222;
        synchronized (class513.field7222) {
            class513.field7222.method2290(false, arg1);
            int var3 = -56 % ((-arg0 - 67) / 44);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)Lpca;", line = 19)
    public final class665 method1202(int arg0) {
        field2522++;
        class665 var2 = this.field2528.field716.field9382;
        if (arg0 != 6) {
            this.field2528 = null;
        }
        if (this.field2528.field716 == var2) {
            this.field2521 = null;
            return null;
        } else {
            this.field2521 = var2.field9382;
            return var2;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)Lba;", line = 40)
    public static final class351 method1203(int arg0, byte arg1) {
        field2524++;
        class351[] var2 = class35.method417(false);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class351 var4 = var2[var3];
            if (var4.field5069 == arg0) {
                return var4;
            }
        }
        if (arg1 != -2) {
            method1203(-14, (byte) -116);
        }
        return null;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)Lpca;", line = 67)
    public final class665 method1204(int arg0) {
        field2525++;
        class665 var2 = this.field2521;
        if (this.field2528.field716 == var2) {
            this.field2521 = null;
            return null;
        }
        if (arg0 != 0) {
            this.field2528 = null;
        }
        this.field2521 = var2.field9382;
        return var2;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILwba;)V", line = 89)
    public final void method1205(int arg0, class46 arg1) {
        field2519++;
        if (arg0 >= -18) {
            method1201(-3, 2);
        }
        this.field2528 = arg1;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V", line = 111)
    public static void method1206(byte arg0) {
        field2523 = null;
        field2527 = null;
        field2520 = null;
        if (arg0 == 34) {
            field2526 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V", line = 128)
    public class177() {
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lwba;)V", line = 130)
    public class177(class46 arg0) {
        this.field2528 = arg0;
    }
}
