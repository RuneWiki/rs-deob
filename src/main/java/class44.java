import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class44 {

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "Ljo;")
    private class382 field572 = new class382(64);

    @OriginalMember(owner = "client!nv", name = "n", descriptor = "Ljo;")
    public class382 field581 = new class382(64);

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "Lok;")
    private class74 field579;

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "Lok;")
    public class74 field575;

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "[I")
    public static int[] field570 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "Luv;")
    public static class2 field571 = new class2(87, -2);

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IBI)V")
    public final void method337(int arg0, byte arg1, int arg2) {
        if (arg1 >= -126) {
            method340((byte) 41);
        }
        this.field572 = new class382(arg0);
        field578++;
        this.field581 = new class382(arg2);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)V")
    public final void method338(int arg0, int arg1) {
        if (arg0 != -2) {
            this.field572 = null;
        }
        class382 var3 = this.field572;
        synchronized (this.field572) {
            this.field572.method2294(arg1, true);
        }
        field580++;
        class382 var4 = this.field581;
        synchronized (this.field581) {
            this.field581.method2294(arg1, true);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V")
    public final void method339(byte arg0) {
        field573++;
        class382 var2 = this.field572;
        synchronized (this.field572) {
            if (arg0 != -66) {
                return;
            }
            this.field572.method2287(73);
        }
        class382 var3 = this.field581;
        synchronized (this.field581) {
            this.field581.method2287(89);
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(B)V")
    public static final void method340(byte arg0) {
        field577++;
        int var1 = 17 % ((arg0 + 43) / 60);
        class382 var2 = class426.field6355;
        synchronized (class426.field6355) {
            class426.field6355.method2287(72);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V")
    public static void method341(int arg0) {
        field570 = null;
        field571 = null;
        if (arg0 != 34) {
            field576 = 50;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)V")
    public static final void method342(boolean arg0) {
        field568++;
        if (arg0) {
            field570 = null;
        }
        class81.field1164 = 0;
        class182.field2702 = -1;
        class504.field7423 = -1;
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(B)V")
    public final void method343(byte arg0) {
        field574++;
        if (arg0 != 45) {
            return;
        }
        class382 var2 = this.field572;
        synchronized (this.field572) {
            this.field572.method2293(false);
        }
        class382 var3 = this.field581;
        synchronized (this.field581) {
            this.field581.method2293(false);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BI)Ljn;")
    public final class409 method344(byte arg0, int arg1) {
        field569++;
        class382 var3 = this.field572;
        class409 var4;
        synchronized (this.field572) {
            var4 = (class409) this.field572.method2288((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class74 var5 = this.field579;
        byte[] var7;
        synchronized (this.field579) {
            if (arg0 != -21) {
                return null;
            }
            var7 = this.field579.method541(arg1, 34, (byte) -122);
        }
        class409 var8 = new class409();
        var8.field6158 = this;
        if (var7 != null) {
            var8.method2455((byte) 20, new class468(var7));
        }
        class382 var9 = this.field572;
        synchronized (this.field572) {
            this.field572.method2290((long) arg1, var8, 110);
            return var8;
        }
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lkr;ILok;Lok;)V")
    public class44(class262 arg0, int arg1, class74 arg2, class74 arg3) {
        this.field579 = arg2;
        this.field575 = arg3;
        this.field579.method536(false, 34);
    }
}
