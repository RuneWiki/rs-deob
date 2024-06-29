import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class148 {

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Z")
    public static boolean field2095 = false;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Z")
    public static boolean field2091 = false;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "[I")
    public static int[] field2097 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field2090 = 0;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2098;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "[I")
    public static int[] field2096;

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V", line = 5)
    public class148() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V", line = 13)
    public static void method910(byte arg0) {
        int var1 = 87 % ((63 - arg0) / 45);
        field2097 = null;
        field2096 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIB)B", line = 26)
    public static final byte method911(int arg0, int arg1, byte arg2) {
        if (arg2 > -82) {
            method913(-11, 101);
        }
        field2092++;
        if (arg1 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B[S)[S", line = 51)
    public static final short[] method912(byte arg0, short[] arg1) {
        if (arg0 <= 75) {
            method912((byte) 101, (short[]) null);
        }
        field2093++;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class415.method2419(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)Lmd;", line = 83)
    public static final class389 method913(int arg0, int arg1) {
        int var2 = -84 / ((arg1 - 11) / 36);
        field2094++;
        class389 var3 = (class389) class319.field4368.method1209(false, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = class285.field3904.method2029(1, arg0 & 0x7FFF, 0);
        } else {
            var4 = class353.field4923.method2029(1, arg0, 0);
        }
        class389 var5 = new class389();
        if (var4 != null) {
            var5.method2308(new class425(var4), 0);
        }
        if (arg0 >= 32768) {
            var5.method2309(0);
        }
        class319.field4368.method1207(-1, (long) arg0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Llk;[BI)V", line = 115)
    public final void method914(class425 arg0, byte[] arg1, int arg2) {
        field2088++;
        if (arg0.field5886[arg0.field5830] != 31 || arg0.field5886[arg0.field5830 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2098 == null) {
            this.field2098 = new Inflater(true);
        }
        try {
            this.field2098.setInput(arg0.field5886, arg0.field5830 + 10, -arg0.field5830 - 10 - 8 + arg0.field5886.length);
            this.field2098.inflate(arg1);
            if (arg2 <= 50) {
                field2095 = false;
            }
        } catch (Exception var4) {
            this.field2098.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2098.reset();
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(III)V", line = 145)
    private class148(int arg0, int arg1, int arg2) {
    }
}
