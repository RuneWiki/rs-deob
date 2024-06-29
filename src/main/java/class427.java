import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class427 {

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "Lff;")
    private class9 field6249 = new class9(64);

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "Lvh;")
    private class240 field6242;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field6246 = new Rectangle[100];

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "J")
    public static long field6247 = 0L;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V", line = 3)
    public final void method2558(int arg0) {
        if (arg0 != 25781) {
            this.field6249 = null;
        }
        field6248++;
        class9 var2 = this.field6249;
        synchronized (this.field6249) {
            this.field6249.method67(arg0 - 25901);
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V", line = 20)
    public static void method2559(int arg0) {
        if (arg0 != 32) {
            field6246 = null;
        }
        field6246 = null;
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(I)V", line = 31)
    public final void method2560(int arg0) {
        class9 var2 = this.field6249;
        synchronized (this.field6249) {
            this.field6249.method65(false);
        }
        field6245++;
        if (arg0 != 21931) {
            this.field6242 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)Lnc;", line = 51)
    public final class21 method2561(int arg0, int arg1) {
        field6244++;
        class9 var3 = this.field6249;
        class21 var4;
        synchronized (this.field6249) {
            var4 = (class21) this.field6249.method56((long) arg1, 101);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 != 16300) {
            this.method2562(37, 48);
        }
        byte[] var5 = this.field6242.method1411(true, arg1, 32);
        class21 var6 = new class21();
        if (var5 != null) {
            var6.method151((byte) -97, new class365(var5));
        }
        class9 var7 = this.field6249;
        synchronized (this.field6249) {
            this.field6249.method73((long) arg1, var6, arg0 + 10125);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(II)V", line = 85)
    public final void method2562(int arg0, int arg1) {
        if (arg1 < 61) {
            return;
        }
        field6243++;
        class9 var3 = this.field6249;
        synchronized (this.field6249) {
            this.field6249.method61((byte) -67, arg0);
        }
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Llf;ILvh;)V", line = 101)
    public class427(class157 arg0, int arg1, class240 arg2) {
        this.field6242 = arg2;
        this.field6242.method1397((byte) 127, 32);
    }
}
