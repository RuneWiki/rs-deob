import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class102 {

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field1638 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field1641 = 0;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field1644 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Lnb;")
    public static class341 field1645 = new class341(64);

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Luk;")
    public class104 field1640;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Lta;")
    public class217 field1643;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 6)
    public static void method875(int arg0) {
        if (arg0 > -20) {
            field1641 = 75;
        }
        field1644 = null;
        field1645 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lcg;III)Lta;", line = 18)
    public static final class217 method876(class49 arg0, int arg1, int arg2, int arg3) {
        field1639++;
        if (arg2 == 24250) {
            return class325.method2262(arg1, (byte) 76, arg0, arg3) ? class142.method1147((byte) -100) : null;
        } else {
            return (class217) null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)[F", line = 37)
    public static final float[] method877(int arg0, byte arg1) {
        float var2 = class9.method64() + class9.method66();
        field1642++;
        float var3 = 0.58823526F;
        int var4 = class9.method65();
        if (arg1 > -74) {
            return (float[]) null;
        }
        float var5 = (float) (var4 >> 8 & 0xFF) / 255.0F;
        class346.field5485[1] = var5 * ((float) (class36.method319(arg0, 65471) >> 8) / 255.0F) * var3 * var2;
        class346.field5485[3] = 1.0F;
        float var6 = (float) (var4 >> 16 & 0xFF) / 255.0F;
        float var7 = (float) (var4 & 0xFF) / 255.0F;
        class346.field5485[0] = var6 * ((float) (class36.method319(16736499, arg0) >> 16) / 255.0F) * var3 * var2;
        class346.field5485[2] = var2 * (float) class36.method319(arg0, 255) / 255.0F * var7 * var3;
        return class346.field5485;
    }
}
