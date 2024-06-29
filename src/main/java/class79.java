import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public abstract class class79 {

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "Z")
    public static boolean field1162 = false;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "J")
    public static long field1164 = 0L;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Lie;")
    public static class389 field1163 = new class389();

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "Lrc;")
    public static class108 field1166 = new class108(64, 12);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Ljs;")
    public static class178 field1161;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 4)
    public static final void method688(int arg0) {
        field1165++;
        if (class309.field4387) {
            return;
        }
        class303.field4311 = true;
        if (class165.field2399) {
            class421.field5826 = (float) ((int) class421.field5826 + 47 & 0xFFFFFFF0);
        } else {
            class301.field4259 += (12.0F - class301.field4259) / 2.0F;
        }
        if (arg0 >= -29) {
            field1164 = 112L;
        }
        class309.field4387 = true;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V", line = 31)
    public static void method689(int arg0) {
        field1163 = null;
        field1161 = null;
        field1166 = null;
        if (arg0 != -14261) {
            field1164 = -66L;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B", line = 45)
    public static final byte[] method692(Object arg0, boolean arg1, int arg2) {
        field1160++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg1 ? class93.method781(-31648, var3) : var3;
        } else if (arg0 instanceof class66) {
            class66 var4 = (class66) arg0;
            return var4.method624((byte) -127);
        } else if (arg2 == 30743) {
            throw new IllegalArgumentException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method690(byte arg0, Component arg1);

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method691(byte arg0, Component arg1);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)I")
    public abstract int method693(byte arg0);
}
