import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class338 {

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "[I")
    public static int[] field5251 = new int[100];

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Lin;")
    public static class177 field5243;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field5245;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "[Luo;")
    public static class316[] field5248;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLsb;[B)V", line = 8)
    public final void method2373(byte arg0, class190 arg1, byte[] arg2) {
        int var4 = 89 % ((60 - arg0) / 37);
        field5249++;
        if (arg1.field2718[arg1.field2776] != 31 || arg1.field2718[arg1.field2776 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field5245 == null) {
            this.field5245 = new Inflater(true);
        }
        try {
            this.field5245.setInput(arg1.field2718, arg1.field2776 + 10, arg1.field2718.length + -8 + -arg1.field2776 - 10);
            this.field5245.inflate(arg2);
        } catch (Exception var6) {
            this.field5245.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field5245.reset();
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V", line = 32)
    public class338() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILph;Lph;II)Lvf;", line = 38)
    public static final class42 method2374(int arg0, class361 arg1, class361 arg2, int arg3, int arg4) {
        field5246++;
        if (class62.method508(0, arg4, arg0, arg1)) {
            if (arg3 != -2075) {
                field5243 = (class177) null;
            }
            return class73.method606(arg2.method2520(arg4, arg0, (byte) -25), -1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V", line = 54)
    public static void method2375(int arg0) {
        if (arg0 != -1) {
            field5251 = (int[]) null;
        }
        field5248 = null;
        field5243 = null;
        field5251 = null;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(III)V", line = 80)
    private class338(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)V", line = 94)
    public static final void method2376(int arg0, int arg1) {
        class57.field845.method464(3398, arg0);
        class292.field4423.method464(3398, arg0);
        int var2 = -108 / ((arg1 + 72) / 43);
        field5244++;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)Z", line = 107)
    public static final boolean method2377(int arg0, int arg1) {
        if (arg1 <= 111) {
            field5248 = (class316[]) null;
        }
        field5250++;
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIZ)Ljava/lang/String;", line = 121)
    public static final String method2378(int arg0, int arg1, boolean arg2) {
        field5247++;
        if (arg0 != -1) {
            method2378(-116, 119, true);
        }
        return arg2 && arg1 >= 0 ? class3.method17(10, arg1, 87, arg2) : Integer.toString(arg1);
    }
}
