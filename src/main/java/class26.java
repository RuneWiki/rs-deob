import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!n")
public class class26 {

    @OriginalMember(owner = "mapview!n", name = "i", descriptor = "I")
    private int field429;

    @OriginalMember(owner = "mapview!n", name = "k", descriptor = "[Lqa;")
    private class33[] field431;

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "I")
    public static int field422 = 0;

    @OriginalMember(owner = "mapview!n", name = "g", descriptor = "I")
    public static int field427 = 0;

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "Lta;")
    public static class37 field421 = class20.method87(-117, "Platelegs Shop");

    @OriginalMember(owner = "mapview!n", name = "e", descriptor = "I")
    public static volatile int field425 = 0;

    @OriginalMember(owner = "mapview!n", name = "j", descriptor = "Lta;")
    public static class37 field430 = class20.method87(-88, "Saw Mill");

    @OriginalMember(owner = "mapview!n", name = "d", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "mapview!n", name = "h", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "mapview!n", name = "f", descriptor = "J")
    private long field426;

    @OriginalMember(owner = "mapview!n", name = "c", descriptor = "Lqa;")
    private class33 field423;

    @OriginalMember(owner = "mapview!n", name = "l", descriptor = "[[[I")
    public static int[][][] field432;

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(IBILjava/awt/Component;)Lma;", line = 17)
    public static final class25 method164(int arg0, byte arg1, int arg2, Component arg3) {
        try {
            if (arg1 != 99) {
                method170(null, null, 107, null, null);
            }
            Class var4 = Class.forName("r");
            class25 var5 = (class25) var4.getDeclaredConstructor().newInstance();
            var5.method137(arg3, arg2, arg0, arg1 - 24856);
            return var5;
        } catch (Throwable var8) {
            class31 var7 = new class31();
            var7.method137(arg3, arg2, arg0, -24757);
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(ILfa;II)[Lra;", line = 38)
    public static final class34[] method165(int arg0, class11 arg1, int arg2, int arg3) {
        return class30.method175(arg2, arg1, arg3, arg0) ? class23.method119(-18) : null;
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(Z)Lqa;", line = 53)
    public final class33 method166(boolean arg0) {
        if (!arg0) {
            return (class33) null;
        } else if (this.field423 == null) {
            return null;
        } else {
            class33 var2 = this.field431[(int) (this.field426 & (long) (this.field429 - 1))];
            while (this.field423 != var2) {
                if (this.field423.field462 == this.field426) {
                    class33 var3 = this.field423;
                    this.field423 = this.field423.field464;
                    return var3;
                }
                this.field423 = this.field423.field464;
            }
            this.field423 = null;
            return null;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(JB)Lqa;", line = 97)
    public final class33 method167(long arg0, byte arg1) {
        this.field426 = arg0;
        class33 var4 = this.field431[(int) (arg0 & (long) (this.field429 - 1))];
        if (arg1 != -55) {
            method170(null, null, 87, null, null);
        }
        for (this.field423 = var4.field464; this.field423 != var4; this.field423 = this.field423.field464) {
            if (this.field423.field462 == arg0) {
                class33 var5 = this.field423;
                this.field423 = this.field423.field464;
                return var5;
            }
        }
        this.field423 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(I)V", line = 135)
    public static void method168(int arg0) {
        if (arg0 > 108) {
            field421 = null;
            field432 = null;
            field430 = null;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(JLqa;I)V", line = 148)
    public final void method169(long arg0, class33 arg1, int arg2) {
        if (arg1.field463 != null) {
            arg1.method191((byte) 116);
        }
        class33 var5 = this.field431[(int) (arg0 & (long) (this.field429 - 1))];
        arg1.field464 = var5;
        arg1.field462 = arg0;
        arg1.field463 = var5.field463;
        if (arg2 != -1) {
            field427 = -47;
        }
        arg1.field463.field464 = arg1;
        arg1.field464.field463 = arg1;
    }

    @OriginalMember(owner = "mapview!n", name = "<init>", descriptor = "(I)V", line = 171)
    public class26(int arg0) {
        this.field429 = arg0;
        this.field431 = new class33[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class33 var3 = this.field431[var2] = new class33();
            var3.field464 = var3;
            var3.field463 = var3;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(Lfa;Lta;ILta;Lfa;)Loa;", line = 202)
    public static final class29 method170(class11 arg0, class37 arg1, int arg2, class37 arg3, class11 arg4) {
        if (arg2 != -1) {
            field421 = null;
        }
        int var5 = arg4.method43(arg3, (byte) -66);
        int var6 = arg4.method50(true, arg1, var5);
        return class11.method51(arg4, arg0, var5, -1, var6);
    }
}
