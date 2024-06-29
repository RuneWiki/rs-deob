import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class416 {

    @OriginalMember(owner = "client!av", name = "g", descriptor = "Lgw;")
    private class690 field5886 = new class690(64);

    @OriginalMember(owner = "client!av", name = "e", descriptor = "Luu;")
    private class237 field5884;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "Luu;")
    public class237 field5881;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "Z")
    public static boolean field5880 = false;

    @OriginalMember(owner = "client!av", name = "d", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!av", name = "f", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!av", name = "h", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!av", name = "i", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!av", name = "k", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!av", name = "l", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!av", name = "m", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!av", name = "n", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "Lid;")
    public static class467 field5882;

    @OriginalMember(owner = "client!av", name = "j", descriptor = "Lhe;")
    public static class577 field5889;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(II)Lrw;")
    public final class251 method2585(int arg0, int arg1) {
        field5888++;
        class690 var3 = this.field5886;
        class251 var4;
        synchronized (this.field5886) {
            var4 = (class251) this.field5886.method3898((byte) -42, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class237 var5 = this.field5884;
        byte[] var6;
        synchronized (this.field5884) {
            var6 = this.field5884.method1572(3, 0, arg1);
        }
        int var7 = -91 / ((arg0 + 1) / 44);
        class251 var8 = new class251();
        var8.field3685 = this;
        if (var6 != null) {
            var8.method1716(54, new class63(var6));
        }
        class690 var9 = this.field5886;
        synchronized (this.field5886) {
            this.field5886.method3899(-120, var8, (long) arg1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(II)V")
    public final void method2586(int arg0, int arg1) {
        field5893++;
        class690 var3 = this.field5886;
        synchronized (this.field5886) {
            this.field5886.method3896(1, arg0);
        }
        if (arg1 <= 106) {
            field5890 = 91;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V")
    public static void method2587(int arg0) {
        field5889 = null;
        field5882 = null;
        int var1 = 120 / ((42 - arg0) / 34);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Luv;I)V")
    public static final void method2588(class755 arg0, int arg1) {
        field5891++;
        if (class476.field6634 == arg0.field10507) {
            if (class388.field5601.field1313 == null) {
                arg0.field10406 = 0;
                arg0.field10504 = 0;
            } else {
                arg0.field10514 = 150;
                arg0.field10522 = (int) (Math.sin((double) class483.field6741 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field10406 = class145.field2037;
                arg0.field10516 = 5;
                arg0.field10504 = class645.method3600(class388.field5601.field1313, arg1 - 5);
                arg0.field10498 = class388.field5601.field7159;
                arg0.field10549 = class388.field5601.field7177;
                arg0.field10425 = 0;
                arg0.field10465 = class388.field5601.field7135;
                class57 var2 = arg0.field10498 == -1 ? null : class607.field8188.method3001(arg1 ^ 0xFFFFCEE4, arg0.field10498);
                if (var2 != null) {
                    class401.method2499(var2, arg0.field10465, arg1 ^ 0xFFFF974B);
                }
            }
        } else if (arg1 != 5) {
            field5890 = -34;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(BII)V")
    public static final void method2589(byte arg0, int arg1, int arg2) {
        field5883++;
        class346 var3 = class299.method1976(0, 5, arg2);
        var3.method2209(255);
        var3.field4926 = arg1;
        if (arg0 < 78) {
            method2589((byte) -17, -56, -124);
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(I)V")
    public final void method2590(int arg0) {
        class690 var2 = this.field5886;
        synchronized (this.field5886) {
            this.field5886.method3902(0);
            if (arg0 != 256) {
                this.method2590(119);
            }
        }
        field5892++;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V")
    public final void method2591(byte arg0) {
        field5887++;
        class690 var2 = this.field5886;
        synchronized (this.field5886) {
            this.field5886.method3906(-96);
        }
        if (arg0 != 91) {
            this.field5884 = null;
        }
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lgp;ILuu;Luu;)V")
    public class416(class553 arg0, int arg1, class237 arg2, class237 arg3) {
        this.field5884 = arg2;
        this.field5881 = arg3;
        this.field5884.method1597(3, 0);
    }

    @OriginalMember(owner = "client!av", name = "c", descriptor = "(II)Z")
    public static final boolean method2592(int arg0, int arg1) {
        field5885++;
        if (arg1 == 2780) {
            return arg0 != 1 && arg0 != 7;
        } else {
            return false;
        }
    }
}
