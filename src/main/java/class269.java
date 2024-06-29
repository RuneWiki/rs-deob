import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class269 {

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "Z")
    public static boolean field4144 = false;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "Z")
    public static boolean field4148 = true;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "Z")
    public static boolean field4149 = false;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "Lnk;")
    public static class2 field4145 = new class2();

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
    public static int field4152 = 3353893;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "Lwf;")
    public static class306 field4142;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "Lwf;")
    public static class306 field4153;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4150;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IB)Lmn;", line = 7)
    public static final class10 method1780(int arg0, byte arg1) {
        field4143++;
        class10 var2 = (class10) class6.field67.method355((long) arg0, 6487);
        if (var2 != null) {
            return var2;
        }
        if (arg1 <= 83) {
            method1782(-75, 14, -55);
        }
        byte[] var3 = class15.field160.method2103(0, 26, arg0);
        class10 var4 = new class10();
        if (var3 != null) {
            var4.method67(new class303(var3), 1536);
        }
        class6.field67.method350((long) arg0, var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V", line = 34)
    public static void method1781(byte arg0) {
        field4142 = null;
        field4145 = null;
        field4153 = null;
        int var1 = -69 % ((-arg0 - 28) / 39);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)V", line = 47)
    public static final void method1782(int arg0, int arg1, int arg2) {
        field4151++;
        if (class27.field346 != arg1) {
            class151.field2384 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class151.field2384[var3] = (var3 << 12) / arg1;
            }
            class197.field2963 = arg1 - 1;
            class158.field2473 = arg1 * 32;
            class27.field346 = arg1;
        }
        if (arg0 != 0 || class99.field1533 == arg2) {
            return;
        }
        if (class27.field346 == arg2) {
            class96.field1473 = class151.field2384;
        } else {
            class96.field1473 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class96.field1473[var4] = (var4 << 12) / arg2;
            }
        }
        class117.field1819 = arg2 - 1;
        class99.field1533 = arg2;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BLgn;[B)V", line = 112)
    public final void method1783(byte arg0, class303 arg1, byte[] arg2) {
        field4146++;
        if (arg1.field4716[arg1.field4679] != 31 || arg1.field4716[arg1.field4679 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4150 == null) {
            this.field4150 = new Inflater(true);
        }
        try {
            this.field4150.setInput(arg1.field4716, arg1.field4679 + 10, arg1.field4716.length + -8 + -10 + -arg1.field4679);
            if (arg0 > -42) {
                return;
            }
            this.field4150.inflate(arg2);
        } catch (Exception var5) {
            this.field4150.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4150.reset();
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V", line = 137)
    public class269() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V", line = 142)
    public static final void method1784(int arg0) {
        field4141++;
        if (arg0 > -4) {
            method1784(-19);
        }
        class56.field781.method1298((byte) 110);
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(III)V", line = 156)
    private class269(int arg0, int arg1, int arg2) {
    }
}
