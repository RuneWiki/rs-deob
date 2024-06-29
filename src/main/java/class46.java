import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public class class46 {

    @OriginalMember(owner = "client!cja", name = "s", descriptor = "I")
    private int field726 = 0;

    @OriginalMember(owner = "client!cja", name = "h", descriptor = "I")
    public int field715;

    @OriginalMember(owner = "client!cja", name = "n", descriptor = "[Lwk;")
    public class154[] field721;

    @OriginalMember(owner = "client!cja", name = "f", descriptor = "Lvl;")
    public static class15 field713 = new class15(41, 3);

    @OriginalMember(owner = "client!cja", name = "m", descriptor = "Ljava/util/Calendar;")
    public static Calendar field720 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!cja", name = "b", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!cja", name = "c", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!cja", name = "d", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!cja", name = "g", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!cja", name = "i", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!cja", name = "j", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!cja", name = "k", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!cja", name = "l", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!cja", name = "o", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!cja", name = "p", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!cja", name = "e", descriptor = "J")
    private long field712;

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "Lwk;")
    private class154 field708;

    @OriginalMember(owner = "client!cja", name = "r", descriptor = "Lwk;")
    private class154 field725;

    @OriginalMember(owner = "client!cja", name = "q", descriptor = "[I")
    public static int[] field724;

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(I)Lwk;", line = 8)
    public final class154 method335(int arg0) {
        if (arg0 == -29067) {
            this.field726 = 0;
            field709++;
            return this.method336(118);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cja", name = "b", descriptor = "(I)Lwk;", line = 25)
    public final class154 method336(int arg0) {
        field717++;
        if (this.field726 > 0 && this.field721[this.field726 - 1] != this.field725) {
            class154 var2 = this.field725;
            this.field725 = var2.field2524;
            return var2;
        }
        if (arg0 <= 77) {
            this.field708 = null;
        }
        while (this.field715 > this.field726) {
            class154 var3 = this.field721[this.field726++].field2524;
            if (this.field721[this.field726 - 1] != var3) {
                this.field725 = var3.field2524;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(JI)Lwk;", line = 56)
    public final class154 method337(long arg0, int arg1) {
        this.field712 = arg0;
        field718++;
        class154 var4 = this.field721[(int) ((long) (this.field715 - arg1) & arg0)];
        for (this.field708 = var4.field2524; this.field708 != var4; this.field708 = this.field708.field2524) {
            if (this.field708.field2528 == arg0) {
                class154 var5 = this.field708;
                this.field708 = this.field708.field2524;
                return var5;
            }
        }
        this.field708 = null;
        return null;
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(B)V", line = 83)
    public final void method338(byte arg0) {
        field714++;
        int var2 = 0;
        if (arg0 > -65) {
            this.method344((byte) 50);
        }
        while (var2 < this.field715) {
            class154 var3 = this.field721[var2];
            while (true) {
                class154 var4 = var3.field2524;
                if (var3 == var4) {
                    var2++;
                    break;
                }
                var4.method1207(109);
            }
        }
        this.field725 = null;
        this.field708 = null;
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(Z)I", line = 116)
    public final int method339(boolean arg0) {
        field722++;
        if (!arg0) {
            this.method335(-22);
        }
        return this.field715;
    }

    @OriginalMember(owner = "client!cja", name = "c", descriptor = "(I)V", line = 127)
    public static void method340(int arg0) {
        field724 = null;
        if (arg0 == 0) {
            field713 = null;
            field720 = null;
        }
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(JLwk;B)V", line = 142)
    public final void method341(long arg0, class154 arg1, byte arg2) {
        if (arg1.field2527 != null) {
            arg1.method1207(83);
        }
        field723++;
        class154 var5 = this.field721[(int) (arg0 & (long) (this.field715 - 1))];
        arg1.field2524 = var5;
        arg1.field2527 = var5.field2527;
        arg1.field2527.field2524 = arg1;
        arg1.field2528 = arg0;
        arg1.field2524.field2527 = arg1;
        if (arg2 < 23) {
            this.method341(-102L, null, (byte) 115);
        }
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "([Lwk;I)I", line = 170)
    public final int method342(class154[] arg0, int arg1) {
        field719++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field715; var4++) {
            class154 var5 = this.field721[var4];
            for (class154 var6 = var5.field2524; var6 != var5; var6 = var6.field2524) {
                arg0[var3++] = var6;
            }
        }
        if (arg1 != -20773) {
            field713 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cja", name = "d", descriptor = "(I)I", line = 208)
    public final int method343(int arg0) {
        int var2 = 110 % ((arg0 + 17) / 42);
        field711++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field715; var4++) {
            class154 var5 = this.field721[var4];
            class154 var6 = var5.field2524;
            while (var5 != var6) {
                var6 = var6.field2524;
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cja", name = "<init>", descriptor = "(I)V", line = 240)
    public class46(int arg0) {
        this.field715 = arg0;
        this.field721 = new class154[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class154 var3 = this.field721[var2] = new class154();
            var3.field2527 = var3;
            var3.field2524 = var3;
        }
    }

    @OriginalMember(owner = "client!cja", name = "b", descriptor = "(B)Lwk;", line = 266)
    public final class154 method344(byte arg0) {
        field710++;
        if (this.field708 == null) {
            return null;
        } else if (arg0 <= 69) {
            return null;
        } else {
            class154 var2 = this.field721[(int) ((long) (this.field715 - 1) & this.field712)];
            while (this.field708 != var2) {
                if (this.field708.field2528 == this.field712) {
                    class154 var3 = this.field708;
                    this.field708 = this.field708.field2524;
                    return var3;
                }
                this.field708 = this.field708.field2524;
            }
            this.field708 = null;
            return null;
        }
    }
}
