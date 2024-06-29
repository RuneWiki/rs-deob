import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class678 {

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "Ljava/lang/String;")
    private String field9602 = "null";

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "Lkfa;")
    public static class549 field9600 = new class549(48, 4);

    @OriginalMember(owner = "client!pn", name = "q", descriptor = "Lpr;")
    public static class407 field9610 = new class407(23, 17);

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "C")
    public char field9604;

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "C")
    public char field9609;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    private int field9595;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public static int field9596;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public static int field9597;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
    public static int field9598;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    public static int field9599;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
    public static int field9601;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    public static int field9603;

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
    public static int field9605;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "I")
    public static int field9607;

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
    public static int field9608;

    @OriginalMember(owner = "client!pn", name = "r", descriptor = "I")
    public static int field9611;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "Ltq;")
    private class572 field9594;

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "Ltq;")
    public class572 field9606;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pn", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field9613;

    @OriginalMember(owner = "client!pn", name = "s", descriptor = "[[[Lne;")
    public static class287[][][] field9612;

    // $FF: synthetic method
    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3793(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)Ljava/lang/String;", line = 5)
    public final String method3783(int arg0, int arg1) {
        field9608++;
        if (this.field9606 == null) {
            return this.field9602;
        }
        class210 var3 = (class210) this.field9606.method3234((byte) -117, (long) arg0);
        if (var3 == null) {
            return this.field9602;
        } else {
            if (arg1 != 4634) {
                this.field9594 = null;
            }
            return var3.field2548;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lmca;", line = 27)
    public static final class29 method3784(Component arg0, boolean arg1, int arg2) {
        if (arg2 != 5) {
            field9610 = null;
        }
        field9607++;
        try {
            Constructor var3 = Class.forName("ac").getDeclaredConstructor(field9613 == null ? (field9613 = method3793("java.awt.Component")) : field9613, Boolean.TYPE);
            return (class29) var3.newInstance(arg0, Boolean.valueOf(arg1));
        } catch (Throwable var4) {
            return new class629(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V", line = 44)
    private final void method3785(byte arg0) {
        if (arg0 != -16) {
            this.field9595 = -109;
        }
        field9599++;
        this.field9594 = new class572(this.field9606.method3228(-110));
        for (class210 var2 = (class210) this.field9606.method3232(-1); var2 != null; var2 = (class210) this.field9606.method3236(-27646)) {
            class88 var3 = new class88(var2.field2548, (int) var2.field3405);
            this.field9594.method3235(class687.method3817(var2.field2548, (byte) 100), arg0 ^ 0xF, var3);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IB)I", line = 69)
    public final int method3786(int arg0, byte arg1) {
        if (arg1 >= -40) {
            return -21;
        }
        field9596++;
        if (this.field9606 == null) {
            return this.field9595;
        } else {
            class337 var3 = (class337) this.field9606.method3234((byte) -66, (long) arg0);
            return var3 == null ? this.field9595 : var3.field4415;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 94)
    public final boolean method3787(String arg0, byte arg1) {
        if (arg1 > -105) {
            this.method3789(null, -46, (byte) 78);
        }
        field9603++;
        if (this.field9606 == null) {
            return false;
        }
        if (this.field9594 == null) {
            this.method3785((byte) -16);
        }
        for (class88 var3 = (class88) this.field9594.method3234((byte) -109, class687.method3817(arg0, (byte) 106)); var3 != null; var3 = (class88) this.field9594.method3233(111)) {
            if (var3.field936.equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V", line = 122)
    private final void method3788(int arg0) {
        field9598++;
        this.field9594 = new class572(this.field9606.method3228(-103));
        class337 var2 = (class337) this.field9606.method3232(-1);
        if (arg0 != -4) {
            return;
        }
        while (var2 != null) {
            class337 var3 = new class337((int) var2.field3405);
            this.field9594.method3235((long) var2.field4415, -1, var3);
            var2 = (class337) this.field9606.method3236(-27646);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Liaa;IB)V", line = 149)
    private final void method3789(class452 arg0, int arg1, byte arg2) {
        if (arg2 != -96) {
            this.method3789(null, 73, (byte) -111);
        }
        field9597++;
        if (arg1 == 1) {
            this.field9609 = class278.method1589(arg0.method2547(true), false);
        } else if (arg1 == 2) {
            this.field9604 = class278.method1589(arg0.method2547(true), false);
        } else if (arg1 == 3) {
            this.field9602 = arg0.method2516(68);
        } else if (arg1 == 4) {
            this.field9595 = arg0.method2575((byte) -48);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method2574(-1758460248);
            this.field9606 = new class572(class146.method799(var4, -117));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method2575((byte) -48);
                class270 var7;
                if (arg1 == 5) {
                    var7 = new class210(arg0.method2516(89));
                } else {
                    var7 = new class337(arg0.method2575((byte) -48));
                }
                this.field9606.method3235((long) var6, arg2 ^ 0x5F, var7);
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Liaa;I)V", line = 205)
    public final void method3790(class452 arg0, int arg1) {
        field9601++;
        if (arg1 != -1) {
            field9611 = -109;
        }
        while (true) {
            int var3 = arg0.method2541(40);
            if (var3 == 0) {
                return;
            }
            this.method3789(arg0, var3, (byte) -96);
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V", line = 225)
    public static void method3791(int arg0) {
        field9612 = null;
        field9610 = null;
        if (arg0 >= -119) {
            method3784(null, true, 74);
        }
        field9600 = null;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(II)Z", line = 240)
    public final boolean method3792(int arg0, int arg1) {
        field9605++;
        if (this.field9606 == null) {
            return false;
        }
        if (arg0 != 5) {
            method3791(-95);
        }
        if (this.field9594 == null) {
            this.method3788(arg0 ^ 0xFFFFFFF9);
        }
        class337 var3 = (class337) this.field9594.method3234((byte) -38, (long) arg1);
        return var3 != null;
    }
}
