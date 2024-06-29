import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public abstract class class17 {

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Loa;")
    public static class99 field175 = class221.method1463(2844, "M");

    @OriginalMember(owner = "client!db", name = "c", descriptor = "Loa;")
    public static class99 field172 = class221.method1463(2844, "Versteckt");

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static volatile int field180 = 0;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "Loa;")
    public static class99 field179 = class221.method1463(2844, ")4j");

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Loa;")
    public static class99 field170 = class221.method1463(2844, "settings");

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public int field171;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public int field174;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field177;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "[I")
    public int[] field176;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)V")
    public static final void method100(int arg0, boolean arg1) {
        field178++;
        byte[][] var2 = class117.field2077;
        if (arg0 <= 30) {
            return;
        }
        int var3 = class123.field2155.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class171.field3042[var4] >> 8) * 64 - class280.field4910;
                int var7 = (class171.field3042[var4] & 0xFF) * 64 - class215.field3731;
                class225.method1485(0);
                class127.method840(var5, var7, var6, arg1, 0, class177.field3091);
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)V")
    public static final void method101(int arg0, byte arg1) {
        field182++;
        if (arg1 != 9) {
            field179 = null;
        }
        class65 var2 = class152.method1010(arg0, 4, (byte) -121);
        var2.method426((byte) -35);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)Lmh;")
    public static final class152 method102(int arg0, int arg1) {
        field173++;
        class152 var2 = (class152) class106.field1773.method1811((long) arg1, arg0 + 114);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class194.field3410.method1242(arg1, arg0, 6801);
        class152 var4 = new class152();
        if (var3 != null) {
            var4.method1015(new class261(var3), arg1, false);
        }
        class106.field1773.method1817((long) arg1, 16, var4);
        return var4;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IBLjava/awt/Component;I)V")
    public abstract void method64(int arg0, byte arg1, Component arg2, int arg3);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ltg;Ltg;Z)V")
    public static final void method103(class182 arg0, class182 arg1, boolean arg2) {
        class71.field1200 = arg0;
        field183++;
        if (!arg2) {
            method104((byte) 41);
        }
        class62.field1041 = arg1;
        class202.field3519 = class62.field1041.method1233(3, !arg2);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
    public static void method104(byte arg0) {
        if (arg0 != 30) {
            field175 = null;
        }
        field179 = null;
        field172 = null;
        field170 = null;
        field175 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method63(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIBLjava/awt/Graphics;I)V")
    public abstract void method65(int arg0, int arg1, int arg2, byte arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public final void method105(int arg0) {
        class68.method467(this.field176, this.field174, this.field171);
        if (arg0 == 31894) {
            field181++;
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    protected class17() {
    }
}
