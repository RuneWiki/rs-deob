import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public class class613 {

    @OriginalMember(owner = "client!cia", name = "c", descriptor = "Ltca;")
    private class174 field8375 = new class174();

    @OriginalMember(owner = "client!cia", name = "j", descriptor = "Ljava/lang/String;")
    public String field8382;

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "I")
    public static int field8373;

    @OriginalMember(owner = "client!cia", name = "b", descriptor = "I")
    public static int field8374;

    @OriginalMember(owner = "client!cia", name = "d", descriptor = "I")
    public static int field8376;

    @OriginalMember(owner = "client!cia", name = "e", descriptor = "I")
    public static int field8377;

    @OriginalMember(owner = "client!cia", name = "f", descriptor = "I")
    public static int field8378;

    @OriginalMember(owner = "client!cia", name = "g", descriptor = "I")
    public static int field8379;

    @OriginalMember(owner = "client!cia", name = "h", descriptor = "I")
    public static int field8380;

    @OriginalMember(owner = "client!cia", name = "i", descriptor = "I")
    public static int field8381;

    @OriginalMember(owner = "client!cia", name = "k", descriptor = "I")
    public static int field8383;

    @OriginalMember(owner = "client!cia", name = "l", descriptor = "I")
    public static int field8384;

    @OriginalMember(owner = "client!cia", name = "n", descriptor = "I")
    private volatile int field8386;

    @OriginalMember(owner = "client!cia", name = "m", descriptor = "Lwaa;")
    private class702 field8385;

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(Lga;Z)V", line = 3)
    public final void method3471(class404 arg0, boolean arg1) {
        arg0.field5932 = arg1;
        field8373++;
        class174 var3 = this.field8375;
        synchronized (this.field8375) {
            this.field8375.method1298(-90, arg0);
            this.field8386++;
        }
        if (this.field8385 != null) {
            class702 var4 = this.field8385;
            synchronized (this.field8385) {
                this.field8385.notify();
            }
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(Lfh;I)Z", line = 25)
    public static final boolean method3472(class652 arg0, int arg1) {
        field8383++;
        if (arg1 != -1) {
            method3473(-93, (byte) 115, true, null, -92, -67, 6);
        }
        return class79.field1419 == arg0 || class327.field4545 == arg0 || class746.field10327 == arg0 || class755.field10543 == arg0;
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(IBZLin;III)V", line = 36)
    public static final void method3473(int arg0, byte arg1, boolean arg2, class91 arg3, int arg4, int arg5, int arg6) {
        class273.field3839 = arg0;
        field8377++;
        class185.field2789 = arg2;
        class539.field7455 = null;
        class708.field9601 = arg4;
        class394.field5789 = arg6;
        class326.field4513 = 1;
        if (arg1 != 50) {
            method3475(-59, null);
        }
        class726.field9825 = arg5;
        class37.field915 = arg3;
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(Lwaa;B)V", line = 60)
    public final void method3474(class702 arg0, byte arg1) {
        this.field8385 = arg0;
        if (arg1 != -108) {
            method3476(-10, -55, 5);
        }
        field8378++;
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(ILke;)I", line = 72)
    public static final int method3475(int arg0, class598 arg1) {
        field8380++;
        int var2 = arg1.field8205;
        class399 var3 = arg1.method2445((byte) 72);
        if (arg1.field5694 == arg0 || arg1.field5639) {
            var2 = arg1.field8180;
        } else if (arg1.field5694 == var3.field5863 || arg1.field5694 == var3.field5864 || arg1.field5694 == var3.field5893 || arg1.field5694 == var3.field5858) {
            var2 = arg1.field8164;
        } else if (arg1.field5694 == var3.field5884 || arg1.field5694 == var3.field5868 || arg1.field5694 == var3.field5891 || arg1.field5694 == var3.field5902) {
            var2 = arg1.field8171;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(III)Z", line = 96)
    public static final boolean method3476(int arg0, int arg1, int arg2) {
        if (arg0 >= -106) {
            return true;
        } else {
            field8374++;
            return class514.method3007(12644, arg2, arg1) || class418.method2576(arg1, 107, arg2);
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(Lvo;I)V", line = 108)
    public final void method3477(class42 arg0, int arg1) {
        if (arg1 != -1) {
            this.method3480(45);
        }
        class174 var3 = this.field8375;
        synchronized (this.field8375) {
            this.field8375.method1298(-127, arg0);
            this.field8386++;
        }
        field8376++;
        if (this.field8385 != null) {
            class702 var4 = this.field8385;
            synchronized (this.field8385) {
                this.field8385.notify();
            }
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(I)Z", line = 129)
    public final boolean method3478(int arg0) {
        int var2 = 46 % ((arg0 - 10) / 54);
        field8384++;
        return this.field8386 == 0;
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(ILga;)V", line = 139)
    public final void method3479(int arg0, class404 arg1) {
        arg1.field5932 = true;
        field8379++;
        class174 var3 = this.field8375;
        synchronized (this.field8375) {
            this.field8375.method1298(-122, arg1);
            this.field8386++;
        }
        if (arg0 != -15481) {
            this.field8382 = null;
        }
        if (this.field8385 != null) {
            class702 var4 = this.field8385;
            synchronized (this.field8385) {
                this.field8385.notify();
            }
        }
    }

    @OriginalMember(owner = "client!cia", name = "b", descriptor = "(I)Lcm;", line = 165)
    public final class726 method3480(int arg0) {
        field8381++;
        Object var2 = null;
        class174 var3 = this.field8375;
        synchronized (this.field8375) {
            if (arg0 != 25061) {
                this.method3471(null, true);
            }
            class726 var4 = this.field8375.method1301(8);
            var4.method4018(false);
            this.field8386--;
            return var4;
        }
    }

    @OriginalMember(owner = "client!cia", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 187)
    public class613(String arg0) {
        this.field8382 = arg0;
    }
}
