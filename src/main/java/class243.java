import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class243 {

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "Lfa;")
    private class564 field3927 = new class564();

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "Ljava/lang/String;")
    public String field3917;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "Lwe;")
    public static class357 field3916 = new class357();

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "Z")
    public static boolean field3924 = false;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "Lwe;")
    public static class357 field3928 = new class357();

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    private volatile int field3929;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "Lls;")
    private class566 field3930;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "Ljava/awt/Font;")
    public static Font field3926;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lov;I)V", line = 3)
    public final void method1683(class668 arg0, int arg1) {
        arg0.field9471 = false;
        field3919++;
        if (arg1 <= 3) {
            return;
        }
        class564 var3 = this.field3927;
        synchronized (this.field3927) {
            this.field3927.method3266(arg0, true);
            this.field3929++;
        }
        if (this.field3930 != null) {
            class566 var4 = this.field3930;
            synchronized (this.field3930) {
                this.field3930.notify();
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IB)Lfw;", line = 25)
    public static final class214 method1684(int arg0, byte arg1) {
        field3923++;
        if (arg1 != -1) {
            method1690(83);
        }
        if (arg0 == 0) {
            return new class526();
        } else if (arg0 == 1) {
            return new class87();
        } else if (arg0 == 2) {
            return new class316();
        } else if (arg0 == 3) {
            return new class319();
        } else if (arg0 == 4) {
            return new class611();
        } else if (arg0 == 5) {
            return new class661();
        } else if (arg0 == 6) {
            return new class554();
        } else if (arg0 == 7) {
            return new class514();
        } else if (arg0 == 8) {
            return new class694();
        } else if (arg0 == 9) {
            return new class549();
        } else if (arg0 == 10) {
            return new class527();
        } else if (arg0 == 11) {
            return new class606();
        } else if (arg0 == 12) {
            return new class81();
        } else if (arg0 == 13) {
            return new class348();
        } else if (arg0 == 14) {
            return new class117();
        } else if (arg0 == 15) {
            return new class42();
        } else if (arg0 == 16) {
            return new class275();
        } else if (arg0 == 17) {
            return new class378();
        } else if (arg0 == 18) {
            return new class593();
        } else if (arg0 == 19) {
            return new class13();
        } else if (arg0 == 20) {
            return new class459();
        } else if (arg0 == 21) {
            return new class679();
        } else if (arg0 == 22) {
            return new class535();
        } else if (arg0 == 23) {
            return new class443();
        } else if (arg0 == 24) {
            return new class433();
        } else if (arg0 == 25) {
            return new class143();
        } else if (arg0 == 26) {
            return new class742();
        } else if (arg0 == 27) {
            return new class449();
        } else if (arg0 == 28) {
            return new class470();
        } else if (arg0 == 29) {
            return new class657();
        } else if (arg0 == 30) {
            return new class155();
        } else if (arg0 == 31) {
            return new class222();
        } else if (arg0 == 32) {
            return new class221();
        } else if (arg0 == 33) {
            return new class670();
        } else if (arg0 == 34) {
            return new class387();
        } else if (arg0 == 35) {
            return new class202();
        } else if (arg0 == 36) {
            return new class286();
        } else if (arg0 == 37) {
            return new class382();
        } else if (arg0 == 38) {
            return new class584();
        } else if (arg0 == 39) {
            return new class474();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)Lfu;", line = 347)
    public final class638 method1685(int arg0) {
        field3921++;
        Object var2 = null;
        class564 var3 = this.field3927;
        synchronized (this.field3927) {
            class638 var4 = this.field3927.method3272(-125);
            var4.method3610(-25057);
            if (arg0 == -2) {
                this.field3929--;
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lfaa;B)V", line = 365)
    public final void method1686(class32 arg0, byte arg1) {
        field3922++;
        if (arg1 < 64) {
            this.method1687(null, 127);
        }
        class564 var3 = this.field3927;
        synchronized (this.field3927) {
            this.field3927.method3266(arg0, true);
            this.field3929++;
        }
        if (this.field3930 != null) {
            class566 var4 = this.field3930;
            synchronized (this.field3930) {
                this.field3930.notify();
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(Lov;I)V", line = 391)
    public final void method1687(class668 arg0, int arg1) {
        field3918++;
        arg0.field9471 = true;
        class564 var3 = this.field3927;
        synchronized (this.field3927) {
            this.field3927.method3266(arg0, true);
            if (arg1 != 9329) {
                method1684(-47, (byte) -103);
            }
            this.field3929++;
        }
        if (this.field3930 != null) {
            class566 var4 = this.field3930;
            synchronized (this.field3930) {
                this.field3930.notify();
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)Z", line = 418)
    public final boolean method1688(int arg0) {
        if (arg0 != -34) {
            this.field3927 = null;
        }
        field3925++;
        return this.field3929 == 0;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lls;B)V", line = 429)
    public final void method1689(class566 arg0, byte arg1) {
        field3920++;
        if (arg1 != 116) {
            this.method1683(null, -113);
        }
        this.field3930 = arg0;
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V", line = 441)
    public static void method1690(int arg0) {
        field3928 = null;
        field3926 = null;
        if (arg0 != -24379) {
            method1684(6, (byte) 112);
        }
        field3916 = null;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 473)
    public class243(String arg0) {
        this.field3917 = arg0;
    }
}
