import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class212 {

    @OriginalMember(owner = "client!iw", name = "g", descriptor = "Lge;")
    private class511 field3196 = new class511(128);

    @OriginalMember(owner = "client!iw", name = "m", descriptor = "Lge;")
    public class511 field3202 = new class511(64);

    @OriginalMember(owner = "client!iw", name = "f", descriptor = "Lci;")
    private class320 field3195;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "Lci;")
    public class320 field3190;

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "Ltf;")
    public static class198 field3192 = null;

    @OriginalMember(owner = "client!iw", name = "l", descriptor = "I")
    public static int field3201 = 0;

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!iw", name = "h", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!iw", name = "i", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!iw", name = "j", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!iw", name = "k", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "Lclient;")
    public static client field3194;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(B)V")
    public final void method1424(byte arg0) {
        field3199++;
        class511 var2 = this.field3196;
        synchronized (this.field3196) {
            this.field3196.method2980(arg0 ^ 0xF51A668E);
        }
        class511 var3 = this.field3202;
        synchronized (this.field3202) {
            this.field3202.method2980(-182819096);
            if (arg0 != 102) {
                this.field3202 = null;
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Z)Ljava/lang/String;")
    public static final String method1425(boolean arg0) {
        field3198++;
        if (arg0) {
            return null;
        }
        String var1 = "www";
        if (class368.field5320 == class30.field408) {
            var1 = "www-wtrc";
        } else if (class368.field5320 == class116.field1798) {
            var1 = "www-wtqa";
        } else if (class368.field5320 == class2.field3) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class394.field5615 != null) {
            var2 = "/p=" + class394.field5615;
        }
        return "http://" + var1 + "." + class14.field163.field6605 + ".com/l=" + class503.field7255 + "/a=" + class446.field6374 + var2 + "/";
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(BI)V")
    public final void method1426(byte arg0, int arg1) {
        class511 var3 = this.field3196;
        synchronized (this.field3196) {
            this.field3196.method2989(false, arg1);
        }
        field3191++;
        class511 var4 = this.field3202;
        synchronized (this.field3202) {
            if (arg0 > 107) {
                this.field3202.method2989(false, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V")
    public static void method1427(int arg0) {
        field3192 = null;
        if (arg0 > -84) {
            field3192 = null;
        }
        field3194 = null;
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)V")
    public final void method1428(int arg0) {
        field3197++;
        class511 var2 = this.field3196;
        synchronized (this.field3196) {
            this.field3196.method2990((byte) -104);
        }
        class511 var3 = this.field3202;
        synchronized (this.field3202) {
            if (arg0 != 36) {
                this.field3202 = null;
            }
            this.field3202.method2990((byte) -76);
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(II)Lrg;")
    public final class463 method1429(int arg0, int arg1) {
        field3193++;
        class511 var3 = this.field3196;
        class463 var4;
        synchronized (this.field3196) {
            var4 = (class463) this.field3196.method2982(arg1 + 3708, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class320 var5 = this.field3195;
        byte[] var6;
        synchronized (this.field3195) {
            var6 = this.field3195.method2037(arg0, (byte) 66, 36);
        }
        class463 var7 = new class463();
        var7.field6699 = arg0;
        var7.field6728 = this;
        if (var6 != null) {
            var7.method2741(new class519(var6), (byte) 122);
        }
        var7.method2742(-1226);
        class511 var8 = this.field3196;
        synchronized (this.field3196) {
            if (arg1 != -3708) {
                field3192 = null;
            }
            this.field3196.method2981(var7, 68, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(III)V")
    public final void method1430(int arg0, int arg1, int arg2) {
        if (arg2 != -28705) {
            field3201 = 92;
        }
        this.field3196 = new class511(arg1);
        field3200++;
        this.field3202 = new class511(arg0);
    }

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Lsn;ILci;Lci;)V")
    public class212(class453 arg0, int arg1, class320 arg2, class320 arg3) {
        this.field3195 = arg2;
        this.field3190 = arg3;
        this.field3195.method2030(-10914, 36);
    }
}
