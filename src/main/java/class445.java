import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class445 {

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "Ljca;")
    public class45 field5887 = new class45();

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "[I")
    public static int[] field5892 = new int[3];

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "Ltt;")
    public static class338 field5886 = new class338(68, 2);

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "Leba;")
    public static class550 field5898 = new class550(85, 4);

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!wo", name = "n", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!wo", name = "p", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "Ljca;")
    private class45 field5897;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method2499(byte arg0) {
        int var2 = -91 % ((arg0 - 41) / 43);
        field5883++;
        return this.field5887.field548 == this.field5887;
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)Ljca;", line = 16)
    public final class45 method2500(byte arg0) {
        if (arg0 != -41) {
            this.method2503(-87);
        }
        field5885++;
        class45 var2 = this.field5887.field547;
        if (this.field5887 == var2) {
            this.field5897 = null;
            return null;
        } else {
            this.field5897 = var2.field547;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILjca;)V", line = 37)
    public final void method2501(int arg0, class45 arg1) {
        field5894++;
        if (arg1.field547 != null) {
            arg1.method242(true);
        }
        arg1.field548 = this.field5887.field548;
        arg1.field547 = this.field5887;
        if (arg0 != 10020) {
            field5898 = null;
        }
        arg1.field547.field548 = arg1;
        arg1.field548.field547 = arg1;
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(B)Ljca;", line = 55)
    public final class45 method2502(byte arg0) {
        int var2 = -16 % ((-arg0 - 25) / 38);
        field5895++;
        class45 var3 = this.field5887.field548;
        if (this.field5887 == var3) {
            return null;
        } else {
            var3.method242(true);
            return var3;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)I", line = 72)
    public final int method2503(int arg0) {
        field5884++;
        int var2 = 0;
        class45 var3 = this.field5887.field548;
        while (this.field5887 != var3) {
            var3 = var3.field548;
            var2++;
        }
        if (arg0 > -58) {
            this.method2503(36);
        }
        return var2;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lwo;ZLjca;)V", line = 93)
    private final void method2504(class445 arg0, boolean arg1, class45 arg2) {
        field5891++;
        class45 var4 = this.field5887.field547;
        this.field5887.field547 = arg2.field547;
        if (!arg1) {
            return;
        }
        arg2.field547.field548 = this.field5887;
        if (this.field5887 != arg2) {
            arg2.field547 = arg0.field5887.field547;
            arg2.field547.field548 = arg2;
            var4.field548 = arg0.field5887;
            arg0.field5887.field547 = var4;
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)Ljca;", line = 124)
    public final class45 method2505(int arg0) {
        field5881++;
        if (arg0 >= -108) {
            return null;
        }
        class45 var2 = this.field5897;
        if (this.field5887 == var2) {
            this.field5897 = null;
            return null;
        } else {
            this.field5897 = var2.field548;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)Ljca;", line = 146)
    public final class45 method2506(int arg0) {
        field5888++;
        class45 var2 = this.field5887.field548;
        if (this.field5887 == var2) {
            this.field5897 = null;
            return null;
        } else {
            this.field5897 = var2.field548;
            return arg0 == 68 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljca;B)V", line = 174)
    public final void method2507(class45 arg0, byte arg1) {
        field5893++;
        if (arg0.field547 != null) {
            arg0.method242(true);
        }
        arg0.field548 = this.field5887;
        if (arg1 >= -119) {
            field5898 = null;
        }
        arg0.field547 = this.field5887.field547;
        arg0.field547.field548 = arg0;
        arg0.field548.field547 = arg0;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILwo;)V", line = 193)
    public final void method2508(int arg0, class445 arg1) {
        if (arg0 != 85) {
            field5892 = null;
        }
        field5889++;
        this.method2504(arg1, true, this.field5887.field548);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z)V", line = 208)
    public static void method2509(boolean arg0) {
        if (arg0) {
            field5898 = null;
            field5892 = null;
            field5886 = null;
        }
    }

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "(I)Ljava/lang/String;", line = 220)
    public static final String method2510(int arg0) {
        field5890++;
        if (class674.field9590 || class572.field7773 == null) {
            return "";
        } else {
            if (arg0 > -76) {
                method2510(17);
            }
            return class572.field7773.field4716;
        }
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V", line = 289)
    public class445() {
        this.field5887.field548 = this.field5887;
        this.field5887.field547 = this.field5887;
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(Z)Ljca;", line = 240)
    public final class45 method2511(boolean arg0) {
        field5896++;
        if (!arg0) {
            this.field5897 = null;
        }
        class45 var2 = this.field5897;
        if (this.field5887 == var2) {
            this.field5897 = null;
            return null;
        } else {
            this.field5897 = var2.field547;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "(I)V", line = 262)
    public final void method2512(int arg0) {
        while (true) {
            class45 var2 = this.field5887.field548;
            if (this.field5887 == var2) {
                field5882++;
                if (arg0 != -11558) {
                    field5898 = null;
                }
                this.field5897 = null;
                return;
            }
            var2.method242(true);
        }
    }
}
