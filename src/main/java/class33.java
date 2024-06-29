import java.awt.Canvas;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ra")
public class class33 {

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "[Lha;")
    private class15[] field431;

    @OriginalMember(owner = "mapview!ra", name = "m", descriptor = "I")
    private int field443;

    @OriginalMember(owner = "mapview!ra", name = "b", descriptor = "Lna;")
    public static class26 field432 = class30.method205((byte) 37, "Shield Shop");

    @OriginalMember(owner = "mapview!ra", name = "g", descriptor = "I")
    public static int field437 = 0;

    @OriginalMember(owner = "mapview!ra", name = "f", descriptor = "Lna;")
    public static class26 field436 = class30.method205((byte) 32, "Spice Shop");

    @OriginalMember(owner = "mapview!ra", name = "c", descriptor = "Lna;")
    public static class26 field433 = class30.method205((byte) 32, "???");

    @OriginalMember(owner = "mapview!ra", name = "i", descriptor = "Lna;")
    public static class26 field439 = class30.method205((byte) 73, "General Store");

    @OriginalMember(owner = "mapview!ra", name = "k", descriptor = "Lna;")
    public static class26 field441 = class30.method205((byte) 40, "-5bersicht");

    @OriginalMember(owner = "mapview!ra", name = "l", descriptor = "Lna;")
    public static class26 field442 = class30.method205((byte) 71, "Enter place name to find");

    @OriginalMember(owner = "mapview!ra", name = "d", descriptor = "J")
    private long field434;

    @OriginalMember(owner = "mapview!ra", name = "j", descriptor = "Lha;")
    private class15 field440;

    @OriginalMember(owner = "mapview!ra", name = "e", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field435;

    @OriginalMember(owner = "mapview!ra", name = "h", descriptor = "[B")
    public static byte[] field438;

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(Ljava/awt/Component;III)Lj;", line = 9)
    public static final class18 method215(Component arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg2 != 0) {
                method215(null, 74, 13, -94);
            }
            Class var4 = Class.forName("r");
            class18 var5 = (class18) var4.getDeclaredConstructor().newInstance();
            var5.method117(arg0, (byte) 91, arg3, arg1);
            return var5;
        } catch (Throwable var8) {
            class41 var7 = new class41();
            var7.method117(arg0, (byte) 114, arg3, arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(JI)Lha;", line = 37)
    public final class15 method216(long arg0, int arg1) {
        this.field434 = arg0;
        if (arg1 != 8) {
            return (class15) null;
        }
        class15 var4 = this.field431[(int) ((long) (this.field443 - 1) & arg0)];
        for (this.field440 = var4.field210; this.field440 != var4; this.field440 = this.field440.field210) {
            if (this.field440.field212 == arg0) {
                class15 var5 = this.field440;
                this.field440 = this.field440.field210;
                return var5;
            }
        }
        this.field440 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(Z)Lha;", line = 74)
    public final class15 method217(boolean arg0) {
        if (arg0) {
            return (class15) null;
        } else if (this.field440 == null) {
            return null;
        } else {
            class15 var2 = this.field431[(int) (this.field434 & (long) (this.field443 - 1))];
            while (this.field440 != var2) {
                if (this.field440.field212 == this.field434) {
                    class15 var3 = this.field440;
                    this.field440 = this.field440.field210;
                    return var3;
                }
                this.field440 = this.field440.field210;
            }
            this.field440 = null;
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "b", descriptor = "(JI)V", line = 114)
    public static final void method218(long arg0, int arg1) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % (long) arg1 == 0L) {
            class15.method100(arg1 ^ 0xA, arg0 - 1L);
            class15.method100(0, 1L);
        } else {
            class15.method100(0, arg0);
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(I)V", line = 150)
    public static void method219(int arg0) {
        field436 = null;
        field438 = null;
        field441 = null;
        field433 = null;
        field442 = null;
        field435 = null;
        field432 = null;
        field439 = null;
        if (arg0 != 1) {
            method220((byte) 55);
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(B)[Lma;", line = 170)
    public static final class24[] method220(byte arg0) {
        if (arg0 != 122) {
            return (class24[]) null;
        }
        class24[] var1 = new class24[class30.field398];
        for (int var2 = 0; var2 < class30.field398; var2++) {
            class24 var3 = var1[var2] = new class24();
            var3.field337 = mapview.field1;
            var3.field338 = class7.field167;
            var3.field336 = class17.field224[var2];
            var3.field339 = class13.field192[var2];
            var3.field340 = class31.field408[var2];
            var3.field341 = class37.field479[var2];
            var3.field335 = class29.field385;
            var3.field334 = class30.field396[var2];
        }
        class19.method119((byte) 54);
        return var1;
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(JILha;)V", line = 203)
    public final void method221(long arg0, int arg1, class15 arg2) {
        if (arg2.field209 != null) {
            arg2.method96(117);
        }
        if (arg1 != -1559) {
            method220((byte) -68);
        }
        class15 var5 = this.field431[(int) ((long) (this.field443 - 1) & arg0)];
        arg2.field209 = var5.field209;
        arg2.field210 = var5;
        arg2.field209.field210 = arg2;
        arg2.field212 = arg0;
        arg2.field210.field209 = arg2;
    }

    @OriginalMember(owner = "mapview!ra", name = "<init>", descriptor = "(I)V", line = 240)
    public class33(int arg0) {
        this.field431 = new class15[arg0];
        this.field443 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class15 var3 = this.field431[var2] = new class15();
            var3.field210 = var3;
            var3.field209 = var3;
        }
    }
}
