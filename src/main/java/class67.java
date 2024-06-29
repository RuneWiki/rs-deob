import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public abstract class class67 extends class539 {

    @OriginalMember(owner = "client!gea", name = "t", descriptor = "Z")
    public boolean field879 = true;

    @OriginalMember(owner = "client!gea", name = "r", descriptor = "I")
    public int field877 = 127;

    @OriginalMember(owner = "client!gea", name = "x", descriptor = "I")
    public int field883 = 2;

    @OriginalMember(owner = "client!gea", name = "G", descriptor = "I")
    public int field892 = 2;

    @OriginalMember(owner = "client!gea", name = "s", descriptor = "I")
    public int field878 = 0;

    @OriginalMember(owner = "client!gea", name = "p", descriptor = "I")
    public int field875 = 0;

    @OriginalMember(owner = "client!gea", name = "D", descriptor = "I")
    public int field889 = 3;

    @OriginalMember(owner = "client!gea", name = "u", descriptor = "Z")
    public boolean field880 = true;

    @OriginalMember(owner = "client!gea", name = "E", descriptor = "Z")
    public boolean field890 = true;

    @OriginalMember(owner = "client!gea", name = "m", descriptor = "Z")
    public boolean field872 = false;

    @OriginalMember(owner = "client!gea", name = "w", descriptor = "Z")
    public boolean field882 = false;

    @OriginalMember(owner = "client!gea", name = "q", descriptor = "Z")
    public boolean field876 = true;

    @OriginalMember(owner = "client!gea", name = "z", descriptor = "Z")
    public boolean field885 = false;

    @OriginalMember(owner = "client!gea", name = "O", descriptor = "Z")
    public boolean field900 = true;

    @OriginalMember(owner = "client!gea", name = "N", descriptor = "I")
    public int field899 = 0;

    @OriginalMember(owner = "client!gea", name = "R", descriptor = "I")
    public int field903 = 0;

    @OriginalMember(owner = "client!gea", name = "J", descriptor = "I")
    public int field895 = 0;

    @OriginalMember(owner = "client!gea", name = "v", descriptor = "Z")
    public boolean field881 = true;

    @OriginalMember(owner = "client!gea", name = "B", descriptor = "Z")
    public boolean field887 = true;

    @OriginalMember(owner = "client!gea", name = "K", descriptor = "I")
    public int field896 = 127;

    @OriginalMember(owner = "client!gea", name = "Z", descriptor = "I")
    public int field911 = 3;

    @OriginalMember(owner = "client!gea", name = "U", descriptor = "I")
    public int field906 = 127;

    @OriginalMember(owner = "client!gea", name = "Q", descriptor = "Z")
    public boolean field902 = true;

    @OriginalMember(owner = "client!gea", name = "I", descriptor = "Z")
    public boolean field894 = true;

    @OriginalMember(owner = "client!gea", name = "X", descriptor = "I")
    public int field909 = 127;

    @OriginalMember(owner = "client!gea", name = "bb", descriptor = "I")
    public int field913 = 0;

    @OriginalMember(owner = "client!gea", name = "ab", descriptor = "I")
    public int field912 = 0;

    @OriginalMember(owner = "client!gea", name = "M", descriptor = "I")
    public int field898 = 2;

    @OriginalMember(owner = "client!gea", name = "H", descriptor = "I")
    public int field893 = 1;

    @OriginalMember(owner = "client!gea", name = "Y", descriptor = "Z")
    public boolean field910 = true;

    @OriginalMember(owner = "client!gea", name = "cb", descriptor = "I")
    public int field914 = 0;

    @OriginalMember(owner = "client!gea", name = "T", descriptor = "I")
    public int field905 = 127;

    @OriginalMember(owner = "client!gea", name = "A", descriptor = "I")
    public int field886 = 0;

    @OriginalMember(owner = "client!gea", name = "eb", descriptor = "Z")
    public boolean field916 = true;

    @OriginalMember(owner = "client!gea", name = "y", descriptor = "Z")
    public boolean field884 = true;

    @OriginalMember(owner = "client!gea", name = "fb", descriptor = "I")
    public int field917 = 2;

    @OriginalMember(owner = "client!gea", name = "n", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!gea", name = "C", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!gea", name = "F", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!gea", name = "L", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!gea", name = "P", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!gea", name = "S", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!gea", name = "db", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!gea", name = "o", descriptor = "Z")
    public boolean field874;

    @OriginalMember(owner = "client!gea", name = "V", descriptor = "Z")
    public boolean field907;

    @OriginalMember(owner = "client!gea", name = "W", descriptor = "Z")
    public boolean field908;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(BIZ)V", line = 3)
    public final void method542(byte arg0, int arg1, boolean arg2) {
        field901++;
        if (class296.method1847(-106, arg1)) {
            this.field907 = arg2;
        } else {
            this.field908 = arg2;
        }
        if (arg0 != -9) {
            this.field896 = 79;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IB)I", line = 32)
    public final int method543(int arg0, byte arg1) {
        field897++;
        if (arg1 != 20) {
            this.field890 = true;
        }
        return class296.method1847(-123, arg0) ? this.field892 : this.field903;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIB)V", line = 53)
    public final void method544(int arg0, int arg1, byte arg2) {
        if (arg2 > -64) {
            return;
        }
        if (class296.method1847(-96, arg0)) {
            this.field892 = arg1;
        } else {
            this.field903 = arg1;
        }
        field873++;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(ZII)Z", line = 73)
    public static final boolean method545(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field915++;
            return (arg2 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(BI)Z", line = 87)
    public final boolean method546(byte arg0, int arg1) {
        if (arg0 != -110) {
            this.field889 = 32;
        }
        field891++;
        return class296.method1847(-110, arg1) ? this.field907 : this.field908;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILjr;)V", line = 176)
    public final void method547(int arg0, class96 arg1) {
        field904++;
        arg1.method746((byte) -100, 22);
        arg1.method746((byte) -100, this.field889);
        arg1.method746((byte) -101, this.field890 ? 1 : 0);
        arg1.method746((byte) -116, this.field910 ? 1 : 0);
        arg1.method746((byte) -107, this.field916 ? 1 : 0);
        arg1.method746((byte) -86, this.field880 ? 1 : 0);
        arg1.method746((byte) -120, 0);
        arg1.method746((byte) -114, this.field900 ? 1 : 0);
        arg1.method746((byte) -108, this.field887 ? 1 : 0);
        arg1.method746((byte) -103, this.field881 ? 1 : 0);
        arg1.method746((byte) -127, this.field892);
        if (arg0 < 77) {
            this.field875 = 18;
        }
        arg1.method746((byte) -95, this.field903);
        arg1.method746((byte) -122, this.field907 ? 1 : 0);
        arg1.method746((byte) -108, this.field908 ? 1 : 0);
        arg1.method746((byte) -94, this.field884 ? 1 : 0);
        arg1.method746((byte) -107, this.field902 ? 1 : 0);
        arg1.method746((byte) -126, this.field875);
        arg1.method746((byte) -125, this.field879 ? 1 : 0);
        arg1.method746((byte) -117, this.field896);
        arg1.method746((byte) -124, this.field909);
        arg1.method746((byte) -90, this.field906);
        arg1.method746((byte) -128, this.field905);
        arg1.method746((byte) -115, this.field877);
        arg1.method731(-2045573048, this.field912);
        arg1.method731(-2045573048, this.field886);
        arg1.method746((byte) -123, class274.method1669(-116));
        arg1.method741(this.field914, (byte) 27);
        arg1.method746((byte) -91, this.field917);
        arg1.method746((byte) -87, this.field872 ? 1 : 0);
        arg1.method746((byte) -126, this.field874 ? 1 : 0);
        arg1.method746((byte) -116, this.field913);
        arg1.method746((byte) -125, this.field882 ? 1 : 0);
        arg1.method746((byte) -93, this.field894 ? 1 : 0);
        arg1.method746((byte) -111, this.field893);
        arg1.method746((byte) -105, this.field876 ? 1 : 0);
        arg1.method746((byte) -115, this.field898);
        arg1.method746((byte) -98, this.field883);
        arg1.method746((byte) -111, this.field885 ? 1 : 0);
        arg1.method746((byte) -91, this.field911);
        arg1.method746((byte) -112, this.field895);
        arg1.method746((byte) -105, this.field878);
    }
}
