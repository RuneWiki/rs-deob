import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class466 {

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "Ljt;")
    private class106 field6827 = new class106(64);

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "Lvd;")
    private class39 field6834;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "Lmia;")
    public static class63 field6826 = new class63(77, 7);

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "[I")
    public static int[] field6829 = new int[1];

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "[I")
    public static int[] field6833 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field6832 = 0;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field6824;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field6828;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field6831;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "Ljava/applet/Applet;")
    public static Applet field6830;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public static void method2825(byte arg0) {
        field6826 = null;
        field6833 = null;
        field6830 = null;
        if (arg0 != -114) {
            method2825((byte) -79);
        }
        field6829 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public final void method2826(int arg0) {
        class106 var2 = this.field6827;
        synchronized (this.field6827) {
            this.field6827.method800(arg0 ^ 0x1D);
        }
        field6823++;
        if (arg0 != 64) {
            method2827();
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "()V")
    public static final void method2827() {
        class177.field2736 = class177.field2746;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZI)Lmb;")
    public final class264 method2828(boolean arg0, int arg1) {
        field6828++;
        class106 var3 = this.field6827;
        class264 var4;
        synchronized (this.field6827) {
            var4 = (class264) this.field6827.method803(109, (long) arg1);
            if (arg0) {
                this.field6834 = null;
            }
        }
        if (var4 != null) {
            return var4;
        }
        class39 var5 = this.field6834;
        byte[] var6;
        synchronized (this.field6834) {
            var6 = this.field6834.method211(true, 32, arg1);
        }
        class264 var7 = new class264();
        if (var6 != null) {
            var7.method1700(new class645(var6), (byte) 43);
        }
        class106 var8 = this.field6827;
        synchronized (this.field6827) {
            this.field6827.method801(1, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)I")
    public static final int method2829(int arg0, int arg1) {
        return class289.field4115 == null ? 0 : class289.field4115[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)V")
    public final void method2830(int arg0, int arg1) {
        field6824++;
        if (arg1 != 16) {
            method2825((byte) 54);
        }
        class106 var3 = this.field6827;
        synchronized (this.field6827) {
            this.field6827.method807(arg0, -1);
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    public final void method2831(int arg0) {
        class106 var2 = this.field6827;
        synchronized (this.field6827) {
            this.field6827.method809(true);
        }
        if (arg0 == 32) {
            field6831++;
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lqg;ILvd;)V")
    public class466(class464 arg0, int arg1, class39 arg2) {
        this.field6834 = arg2;
        this.field6834.method229(32, 0);
    }
}
