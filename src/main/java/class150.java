import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class150 {

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "[[I")
    public static int[][] field3397 = new int[104][104];

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "[I")
    public static int[] field3390 = new int[100];

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "Z")
    public static boolean field3395 = false;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public static int field3396 = 0;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field3393 = 0;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field3388 = 0;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field3392 = 0;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "Lvb;")
    public static class148 field3402;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "Leb;")
    public static class31 field3394;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3391;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B[BLm;)V")
    public final void method1139(byte arg0, byte[] arg1, class83 arg2) {
        field3399++;
        if (arg2.field2055[arg2.field2076] != 31 || arg2.field2055[arg2.field2076 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3391 == null) {
            this.field3391 = new Inflater(true);
        }
        try {
            this.field3391.setInput(arg2.field2055, arg2.field2076 + 10, -arg2.field2076 - 10 + -8 + arg2.field2055.length);
            this.field3391.inflate(arg1);
        } catch (Exception var5) {
            this.field3391.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        int var4 = -59 % ((arg0 - 15) / 60);
        this.field3391.reset();
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public static final void method1140(byte arg0) {
        field3401++;
        if (class118.field2768 && class94.field2373 != class157.field3573) {
            class88.method700(class103.field2573, class108.field2639.field952[0], false, class157.field3573, class108.field2639.field951[0], class114.field2711);
        } else if (arg0 < -8 && class34.field857 != class157.field3573) {
            class34.field857 = class157.field3573;
            class70.method556(4, class157.field3573);
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class150() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZLef;IIII)V")
    public static final void method1141(int arg0, boolean arg1, class35 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 0) {
            return;
        }
        class50.field1201 = arg0;
        class134.field3046 = arg2;
        field3398++;
        class83.field2051 = 1;
        class52.field1255 = arg1;
        class75.field1865 = arg4;
        class40.field1049 = arg3;
        class132.field2989 = arg5;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V")
    public static void method1142(byte arg0) {
        field3397 = null;
        if (arg0 != 60) {
            field3396 = 32;
        }
        field3394 = null;
        field3390 = null;
        field3402 = null;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(III)V")
    private class150(int arg0, int arg1, int arg2) {
    }
}
