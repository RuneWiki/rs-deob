import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class29 {

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "Ltc;")
    private class196 field463;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "[[I")
    public static int[][] field456 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    public static int field457 = 0;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "Lmh;")
    private class376 field455;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILtc;)V")
    public final void method226(int arg0, class196 arg1) {
        field461++;
        if (arg0 == 12) {
            this.field463 = arg1;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)Lmh;")
    public final class376 method227(byte arg0) {
        field462++;
        if (arg0 != -85) {
            field458 = 60;
        }
        class376 var2 = this.field455;
        if (this.field463.field2720 == var2) {
            this.field455 = null;
            return null;
        } else {
            this.field455 = var2.field5365;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILkq;)V")
    public static final void method228(int arg0, class351 arg1) {
        if (arg0 > -40) {
            method230(-105);
        }
        field459++;
        class253 var2 = null;
        try {
            class295 var3 = arg1.method2240(0);
            while (var3.field4068 == 0) {
                class4.method28(1L, 96);
            }
            if (var3.field4068 == 1) {
                var2 = (class253) var3.field4070;
                class371 var4 = class6.method48((byte) 120);
                var2.method1560(0, var4.field5273, var4.field5258, (byte) 83);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method1562(-8060);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
    public class29() {
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Ltc;)V")
    public class29(class196 arg0) {
        this.field463 = arg0;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)Lmh;")
    public final class376 method229(int arg0) {
        if (arg0 != 12398) {
            this.method229(29);
        }
        field460++;
        class376 var2 = this.field463.field2720.field5365;
        if (this.field463.field2720 == var2) {
            this.field455 = null;
            return null;
        } else {
            this.field455 = var2.field5365;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V")
    public static void method230(int arg0) {
        field456 = null;
        if (arg0 != 12) {
            field457 = -115;
        }
    }
}
