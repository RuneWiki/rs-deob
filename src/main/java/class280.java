import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public abstract class class280 {

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "Lhi;")
    public static class82 field4699 = class95.method664((byte) -118, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "Lhi;")
    public static class82 field4703 = class95.method664((byte) -48, "cyan:");

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "Lhi;")
    public static class82 field4708 = class95.method664((byte) -103, "<br>(X");

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "Lti;")
    public static class186 field4698 = null;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "Lhi;")
    private static class82 field4702 = class95.method664((byte) -100, "Loaded title screen");

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "Lhi;")
    public static class82 field4700 = field4702;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "Lhi;")
    public static class82 field4707 = class95.method664((byte) -90, "details");

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public int field4705;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
    public int field4713;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "Lve;")
    public static class212 field4709;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "Lclient;")
    public static client field4704;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "Ljava/awt/Image;")
    public Image field4706;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "[I")
    public int[] field4714;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)Lsl;", line = 20)
    public static final class194 method1951(int arg0, int arg1) {
        if (arg1 != 26029) {
            return (class194) null;
        }
        field4701++;
        class194 var2 = (class194) class4.field34.method2250((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class222.field3843.method1577(1, arg0, -29569);
        } else {
            var3 = class139.field2384.method1577(1, arg0 & 0x7FFF, -29569);
        }
        class194 var4 = new class194();
        if (var3 != null) {
            var4.method1354(18116, new class153(var3));
        }
        if (arg0 >= 32768) {
            var4.method1349(0);
        }
        class4.field34.method2255(var4, (long) arg0, false);
        return var4;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILhi;)Lhi;", line = 59)
    public static final class82 method1952(int arg0, class82 arg1) {
        field4711++;
        int var2 = class275.method1919(arg1, false);
        return arg0 == var2 ? class193.field3279 : class297.field5057.field4308[var2].method547(false, class78.field1332, class29.field400);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V", line = 74)
    public static void method1953(int arg0) {
        if (arg0 != 1) {
            return;
        }
        field4707 = null;
        field4698 = null;
        field4700 = null;
        field4709 = null;
        field4702 = null;
        field4708 = null;
        field4704 = null;
        field4703 = null;
        field4699 = null;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V", line = 92)
    public final void method1954(int arg0) {
        class320.method2221(this.field4714, this.field4713, this.field4705);
        field4710++;
        if (arg0 != 21155) {
            this.method1214(90, (Graphics) null, -118, 33, -82, -40);
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V", line = 139)
    protected class280() {
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public abstract void method1216(int arg0, Component arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V")
    public abstract void method1215(int arg0, Graphics arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public abstract void method1214(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5);
}
