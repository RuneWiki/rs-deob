import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class216 {

    @OriginalMember(owner = "client!js", name = "c", descriptor = "Ljv;")
    private class55 field3108 = new class55(256);

    @OriginalMember(owner = "client!js", name = "d", descriptor = "Lbu;")
    private class17 field3109;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(II)Ltg;", line = 3)
    public final class153 method1439(int arg0, int arg1) {
        field3111++;
        class55 var3 = this.field3108;
        class153 var4;
        synchronized (this.field3108) {
            var4 = (class153) this.field3108.method494(arg0 + 1, (long) arg1);
        }
        if (arg0 != -1) {
            this.method1442(64, 120);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3109.method114(arg1, 26, arg0 + 128);
        class153 var6 = new class153();
        if (var5 != null) {
            var6.method1161(new class145(var5), (byte) 67);
        }
        class55 var7 = this.field3108;
        synchronized (this.field3108) {
            this.field3108.method485((long) arg1, (byte) -125, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V", line = 35)
    public final void method1440(int arg0) {
        field3106++;
        class55 var2 = this.field3108;
        synchronized (this.field3108) {
            this.field3108.method484(-65);
        }
        if (arg0 != 11828) {
            this.field3109 = null;
        }
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V", line = 49)
    public final void method1441(int arg0) {
        if (arg0 < 77) {
            this.field3108 = null;
        }
        class55 var2 = this.field3108;
        synchronized (this.field3108) {
            this.field3108.method488(-3);
        }
        field3107++;
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(II)V", line = 64)
    public final void method1442(int arg0, int arg1) {
        if (arg1 != -14329) {
            this.method1440(-75);
        }
        field3110++;
        class55 var3 = this.field3108;
        synchronized (this.field3108) {
            this.field3108.method493(false, arg0);
        }
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Loq;ILbu;)V", line = 120)
    public class216(class239 arg0, int arg1, class17 arg2) {
        this.field3109 = arg2;
        this.field3109.method119(29630, 26);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)V", line = 82)
    public static final void method1443(boolean arg0) {
        field3112++;
        if (class404.field6067 < 0) {
            class404.field6067 = 0;
            class307.field4691 = -1;
            class151.field2403 = -1;
        }
        if (class509.field7522 < class404.field6067) {
            class151.field2403 = -1;
            class404.field6067 = class509.field7522;
            class307.field4691 = -1;
        }
        if (!arg0) {
            method1443(true);
        }
        if (class158.field2464 < 0) {
            class158.field2464 = 0;
            class307.field4691 = -1;
            class151.field2403 = -1;
        }
        if (class509.field7504 < class158.field2464) {
            class151.field2403 = -1;
            class158.field2464 = class509.field7504;
            class307.field4691 = -1;
        }
    }
}
