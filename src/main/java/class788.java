import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class788 {

    @OriginalMember(owner = "client!f", name = "g", descriptor = "Lmga;")
    public static class739 field10844 = new class739(41, 3);

    @OriginalMember(owner = "client!f", name = "m", descriptor = "[I")
    public static int[] field10850 = new int[1000];

    @OriginalMember(owner = "client!f", name = "k", descriptor = "Lhv;")
    public static class546 field10848 = new class546(4, 1);

    @OriginalMember(owner = "client!f", name = "p", descriptor = "Ljw;")
    public static class581 field10853 = new class581(69, 6);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public int field10838;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field10839;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field10840;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field10841;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public int field10842;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field10843;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field10845;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public int field10846;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field10847;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public static int field10849;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public static int field10851;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "Loba;")
    public static class275 field10852;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method4351(int arg0) {
        if (arg0 == 64) {
            field10839++;
            return (this.field10838 & 0x4) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)Z", line = 16)
    public final boolean method4352(byte arg0) {
        field10843++;
        if (arg0 != 48) {
            field10850 = null;
        }
        return (this.field10838 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V", line = 30)
    public static void method4353(byte arg0) {
        field10844 = null;
        field10848 = null;
        field10853 = null;
        if (arg0 > 84) {
            field10850 = null;
            field10852 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V", line = 51)
    public static final void method4354(int arg0) {
        field10849++;
        for (class139 var1 = (class139) class496.field6853.method2551((byte) -108); var1 != null; var1 = (class139) class496.field6853.method2542(-123)) {
            class620.method3404(-23204, false, var1);
        }
        class139 var2 = (class139) class583.field7785.method2551((byte) -108);
        if (arg0 != 6594) {
            method4358(-27, null, null, (byte) 72, 42);
        }
        while (var2 != null) {
            class620.method3404(arg0 ^ 0xFFFFBC9E, true, var2);
            var2 = (class139) class583.field7785.method2542(-96);
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)Z", line = 77)
    public final boolean method4355(int arg0) {
        if (arg0 > -62) {
            this.method4352((byte) 6);
        }
        field10841++;
        return (this.field10838 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 89)
    public static final String method4356(int arg0, String arg1) {
        field10851++;
        if (class483.field6674.startsWith("win")) {
            return arg1 + ".dll";
        } else if (class483.field6674.startsWith("linux")) {
            return "lib" + arg1 + ".so";
        } else if (class483.field6674.startsWith("mac")) {
            return "lib" + arg1 + ".dylib";
        } else if (arg0 == -3275) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)V", line = 113)
    public static final void method4357(int arg0, byte arg1) {
        class379.field5541 = arg0;
        field10845++;
        if (arg1 != -66) {
            method4353((byte) 8);
        }
        class754.field10432.method1555((byte) -3);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILd;Ljava/awt/Canvas;BI)Lha;", line = 134)
    public static final class65 method4358(int arg0, class161 arg1, Canvas arg2, byte arg3, int arg4) {
        int var5 = -11 / ((46 - arg3) / 48);
        field10840++;
        return new class724(arg2, arg1, arg0, arg4);
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(B)Z", line = 147)
    public final boolean method4359(byte arg0) {
        field10847++;
        if (arg0 != 16) {
            field10850 = null;
        }
        return (this.field10838 & 0x1) != 0;
    }
}
