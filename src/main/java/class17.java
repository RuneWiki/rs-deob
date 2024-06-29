import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class17 {

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Lhm;")
    private class208 field176 = new class208(128);

    @OriginalMember(owner = "client!n", name = "n", descriptor = "Lhm;")
    public class208 field178 = new class208(64);

    @OriginalMember(owner = "client!n", name = "k", descriptor = "Lpfa;")
    public class275 field175;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "Lpfa;")
    private class275 field173;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "[I")
    public static int[] field179 = new int[2];

    @OriginalMember(owner = "client!n", name = "a", descriptor = "Ldr;")
    public static class675 field165 = new class675(72, 7);

    @OriginalMember(owner = "client!n", name = "p", descriptor = "F")
    public static float field180;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public final void method92(int arg0) {
        field174++;
        class208 var2 = this.field176;
        synchronized (this.field176) {
            this.field176.method1224(false);
            if (arg0 != -12725) {
                field180 = -1.8186394F;
            }
        }
        class208 var3 = this.field178;
        synchronized (this.field178) {
            this.field178.method1224(false);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)Lki;")
    public final class663 method93(int arg0, byte arg1) {
        field166++;
        if (arg1 <= 65) {
            return null;
        }
        class208 var3 = this.field176;
        class663 var4;
        synchronized (this.field176) {
            var4 = (class663) this.field176.method1221((long) arg0, true);
        }
        if (var4 != null) {
            return var4;
        }
        class275 var5 = this.field173;
        byte[] var6;
        synchronized (this.field173) {
            var6 = this.field173.method1659(94, arg0, 36);
        }
        class663 var7 = new class663();
        var7.field9014 = arg0;
        var7.field8979 = this;
        if (var6 != null) {
            var7.method3686(new class572(var6), (byte) 81);
        }
        var7.method3695((byte) -55);
        class208 var8 = this.field176;
        synchronized (this.field176) {
            this.field176.method1230((byte) -108, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IBI)V")
    public final void method94(int arg0, byte arg1, int arg2) {
        this.field176 = new class208(arg0);
        field177++;
        this.field178 = new class208(arg2);
        if (arg1 != 49) {
            this.method92(-59);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
    public static void method95(boolean arg0) {
        field165 = null;
        field179 = null;
        if (arg0) {
            method98((byte) 26, null, null, null, -34);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
    public final void method96(byte arg0) {
        field171++;
        class208 var2 = this.field176;
        synchronized (this.field176) {
            this.field176.method1218(arg0 + 125);
        }
        class208 var3 = this.field178;
        synchronized (this.field178) {
            if (arg0 == -16) {
                this.field178.method1218(101);
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZI)V")
    public final void method97(boolean arg0, int arg1) {
        field168++;
        class208 var3 = this.field176;
        synchronized (this.field176) {
            this.field176.method1222(14564, arg1);
        }
        class208 var4 = this.field178;
        synchronized (this.field178) {
            this.field178.method1222(14564, arg1);
            if (arg0) {
                field180 = 0.7060328F;
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BLpfa;Le;Ljava/awt/Canvas;I)Loa;")
    public static final class650 method98(byte arg0, class275 arg1, class498 arg2, Canvas arg3, int arg4) {
        field172++;
        if (!class525.method2832(115)) {
            throw new RuntimeException("");
        } else if (class362.method2099(34167, "jaggl")) {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg3, 8, 8, 8, 24, 0, arg4);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            if (arg0 < 103) {
                method95(true);
            }
            class513 var8 = new class513(var5, arg3, var6, arg2, arg1, arg4);
            var8.method1300(true);
            return var8;
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
    public static final void method99(int arg0) {
        if (arg0 != 0) {
            method99(-102);
        }
        if (class309.field3898 != null) {
            class14.field136.method1716(3);
            class564.method2998();
            class580.method3209(-83);
            class416.method2314(false);
            class482.method2627(false);
            class133.method863((byte) 118);
            if (class613.field8337 != null) {
                class613.field8337.method793(arg0 - 126);
            }
            class14.method70(-70);
            class373.method2160(true);
            class486.method2641(55);
            class466.method2542(-11112);
            class569.method3016(false, (byte) 87);
            for (int var1 = 0; var1 < 2048; var1++) {
                class365 var5 = class132.field1601[var1];
                if (var5 != null) {
                    var5.field507 = null;
                    for (int var6 = 0; var6 < var5.field512.length; var6++) {
                        var5.field512[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class215.field2516; var2++) {
                class506 var3 = class140.field1687[var2].field9854;
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field512.length; var4++) {
                        var3.field512[var4] = null;
                    }
                }
            }
            class33.field519 = null;
            class142.field1735 = null;
            class309.field3898.method3623((byte) -91);
            class309.field3898 = null;
        }
        field170++;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lbs;ILpfa;Lpfa;)V")
    public class17(class643 arg0, int arg1, class275 arg2, class275 arg3) {
        this.field175 = arg3;
        this.field173 = arg2;
        this.field173.method1655(36, (byte) -82);
    }
}
