import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class36 extends class128 {

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "Ljava/lang/String;")
    private String field540 = "null";

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "C")
    public char field538;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "C")
    public char field548;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
    private int field543;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!cd", name = "R", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!cd", name = "S", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!cd", name = "U", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "Lim;")
    public static class178 field549;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "Lue;")
    public class222 field542;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "Lue;")
    private class222 field554;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "Lnh;")
    public static class305 field546;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method239(String arg0, byte arg1) {
        if (arg1 != -91) {
            this.method252((class215) null, 45, 45);
        }
        field544++;
        if (this.field542 == null) {
            return false;
        }
        if (this.field554 == null) {
            this.method245(arg1 + 3);
        }
        for (class30 var3 = (class30) this.field554.method1453(true, class211.method1319(arg0, 0)); var3 != null; var3 = (class30) this.field554.method1461(-109)) {
            if (var3.field458.equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
    public static void method240(byte arg0) {
        if (arg0 == 20) {
            field546 = null;
            field549 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(II)Ljk;")
    public static final class80 method241(int arg0, int arg1) {
        class80 var2 = (class80) class190.field2880.method950((long) arg1, (byte) -45);
        field552++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class92.field1350.method2050(80, 30, arg1);
        if (arg0 != -2648) {
            field546 = null;
        }
        class80 var4 = new class80();
        if (var3 != null) {
            var4.method508(new class215(var3), (byte) -66, arg1);
        }
        class190.field2880.method942((long) arg1, (byte) 56, var4);
        return var4;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILbj;)V")
    public final void method242(int arg0, class215 arg1) {
        while (true) {
            int var3 = arg1.method1374((byte) -60);
            if (var3 == 0) {
                if (arg0 != 27613) {
                    return;
                }
                field539++;
                return;
            }
            this.method252(arg1, 0, var3);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZI)I")
    public final int method243(boolean arg0, int arg1) {
        field555++;
        if (this.field542 == null) {
            return this.field543;
        }
        class313 var3 = (class313) this.field542.method1453(true, (long) arg1);
        if (var3 == null) {
            return this.field543;
        } else {
            if (arg0) {
                method240((byte) 19);
            }
            return var3.field5027;
        }
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(II)Z")
    public final boolean method244(int arg0, int arg1) {
        field541++;
        if (this.field542 == null) {
            return false;
        }
        if (this.field554 == null) {
            this.method247(false);
        }
        if (arg0 >= -60) {
            this.field554 = null;
        }
        class313 var3 = (class313) this.field554.method1453(true, (long) arg1);
        return var3 != null;
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V")
    private final void method245(int arg0) {
        this.field554 = new class222(this.field542.method1459((byte) -45));
        for (class50 var2 = (class50) this.field542.method1458(0); var2 != null; var2 = (class50) this.field542.method1462(-10000001)) {
            class30 var4 = new class30(var2.field712, (int) var2.field2141);
            this.field554.method1452(class211.method1319(var2.field712, 0), var4, 0);
        }
        int var3 = 113 % ((-arg0 - 3) / 45);
        field550++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public final String method246(int arg0, boolean arg1) {
        field557++;
        if (this.field542 == null) {
            return this.field540;
        }
        class50 var3 = (class50) this.field542.method1453(!arg1, (long) arg0);
        if (arg1) {
            this.field543 = 30;
        }
        return var3 == null ? this.field540 : var3.field712;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
    private final void method247(boolean arg0) {
        field545++;
        this.field554 = new class222(this.field542.method1459((byte) -45));
        if (arg0) {
            this.method244(13, -72);
        }
        for (class313 var2 = (class313) this.field542.method1458(0); var2 != null; var2 = (class313) this.field542.method1462(-10000001)) {
            class313 var3 = new class313((int) var2.field2141);
            this.field554.method1452((long) var2.field5027, var3, 0);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method248(String arg0, int arg1) {
        int var2 = arg0.length();
        field547++;
        int var3 = 0;
        int var4 = 30 / ((arg1 - 41) / 45);
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = arg0.charAt(var5) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public static final void method249(boolean arg0, Component arg1) {
        field556++;
        if (arg0) {
            field549 = null;
        }
        Method var2 = class52.field746;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class257.field4154);
        arg1.addFocusListener(class257.field4154);
    }

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "(I)Z")
    public static final boolean method250(int arg0) {
        field551++;
        if (arg0 != 6009) {
            method251(-115);
        }
        return class159.field2208 == 0 ? class138.field1903.method1851(66) : true;
    }

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "(I)V")
    public static final void method251(int arg0) {
        if (arg0 == -617890907) {
            field558++;
            class251.field3923.method944(115);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lbj;II)V")
    private final void method252(class215 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field538 = class126.method814(arg1 - 404579261, arg0.method1350((byte) -82));
        } else if (arg2 == 2) {
            this.field548 = class126.method814(-404579261, arg0.method1350((byte) -79));
        } else if (arg2 == 3) {
            this.field540 = arg0.method1376(-96);
        } else if (arg2 == 4) {
            this.field543 = arg0.method1383((byte) 75);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method1379(-97);
            this.field542 = new class222(class216.method1406(true, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1383((byte) -102);
                class154 var7;
                if (arg2 == 5) {
                    var7 = new class50(arg0.method1376(-81));
                } else {
                    var7 = new class313(arg0.method1383((byte) -87));
                }
                this.field542.method1452((long) var6, var7, 0);
            }
        }
        field553++;
        if (arg1 != 0) {
            method251(-70);
        }
    }
}
