import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!p")
public abstract class class29 {

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "Lr;")
    public static class33 field416 = method192("Jewellery", (byte) 126);

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "Lga;")
    public static class14 field417 = new class14();

    @OriginalMember(owner = "mapview!p", name = "k", descriptor = "Lr;")
    public static class33 field425 = method192("Saw Mill", (byte) 126);

    @OriginalMember(owner = "mapview!p", name = "m", descriptor = "Lr;")
    public static class33 field427 = method192("uitext has incorrect number of strings", (byte) 126);

    @OriginalMember(owner = "mapview!p", name = "l", descriptor = "Lr;")
    public static class33 field426 = method192("Anvil", (byte) 126);

    @OriginalMember(owner = "mapview!p", name = "n", descriptor = "Lr;")
    public static class33 field428 = method192("Amulet Shop", (byte) 126);

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "I")
    public int field415;

    @OriginalMember(owner = "mapview!p", name = "f", descriptor = "I")
    public int field420;

    @OriginalMember(owner = "mapview!p", name = "g", descriptor = "Lr;")
    public static class33 field421;

    @OriginalMember(owner = "mapview!p", name = "e", descriptor = "Ljava/awt/Image;")
    public Image field419;

    @OriginalMember(owner = "mapview!p", name = "j", descriptor = "Ljava/awt/Image;")
    public static Image field424;

    @OriginalMember(owner = "mapview!p", name = "h", descriptor = "[B")
    public static byte[] field422;

    @OriginalMember(owner = "mapview!p", name = "i", descriptor = "[B")
    public static byte[] field423;

    @OriginalMember(owner = "mapview!p", name = "d", descriptor = "[I")
    public int[] field418;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(I)V", line = 16)
    public static void method191(int arg0) {
        field426 = null;
        field417 = null;
        field427 = null;
        if (arg0 != 26950) {
            method191(-74);
        }
        field424 = null;
        field423 = null;
        field425 = null;
        field421 = null;
        field428 = null;
        field416 = null;
        field422 = null;
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Ljava/lang/String;B)Lr;", line = 38)
    public static final class33 method192(String arg0, byte arg1) {
        byte[] var2 = arg0.getBytes();
        int var3 = 0;
        int var4 = var2.length;
        class33 var5 = new class33();
        if (arg1 != 126) {
            method193(40);
        }
        var5.field465 = new byte[var4];
        while (var3 < var4) {
            int var6 = var2[var3++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var4 <= var3) {
                    break;
                }
                int var7 = var2[var3++] & 0xFF;
                var5.field465[var5.field470++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var5.field465[var5.field470++] = (byte) var6;
            }
        }
        var5.method226((byte) 14);
        return var5.method219(21164);
    }

    @OriginalMember(owner = "mapview!p", name = "<init>", descriptor = "()V", line = 90)
    protected class29() {
    }

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "(I)B", line = 95)
    public static final byte method193(int arg0) {
        if (arg0 < 68) {
            method193(116);
        }
        return field422 == null ? 0 : field422[class26.field396];
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(B)V", line = 118)
    public final void method194(byte arg0) {
        class1.method3(this.field418, this.field415, this.field420);
        if (arg0 < 2) {
            field426 = null;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method69(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public abstract void method72(int arg0, Component arg1, int arg2, int arg3);
}
