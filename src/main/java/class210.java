import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class210 extends class157 {

    @OriginalMember(owner = "client!kv", name = "Db", descriptor = "Leba;")
    public static class550 field2801 = new class550(101, -2);

    @OriginalMember(owner = "client!kv", name = "Eb", descriptor = "Llg;")
    public static class32 field2802 = new class32(0, 2, 2, 1);

    @OriginalMember(owner = "client!kv", name = "Ab", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!kv", name = "Bb", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!kv", name = "Cb", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)I", line = 3)
    public static final int method1331(int arg0, int arg1, int arg2) {
        int var3 = 81 % ((62 - arg1) / 36);
        if (arg2 > arg0) {
            int var4 = arg0;
            arg0 = arg2;
            arg2 = var4;
        }
        ++field2798;
        while (arg2 != 0) {
            int var5 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var5;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(BF)V", line = 30)
    public final void method1332(byte arg0, float arg1) {
        ++field2800;
        if (arg0 == -13) {
            int var3 = Stream.floatToRawIntBits(arg1);
            super.field2199[super.field2219++] = (byte) var3;
            super.field2199[super.field2219++] = (byte) (var3 >> 8);
            super.field2199[super.field2219++] = (byte) (var3 >> 16);
            super.field2199[super.field2219++] = (byte) (var3 >> 24);
        }
    }

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "(Z)V", line = 47)
    public static void method1333(boolean arg0) {
        field2802 = null;
        field2801 = null;
        if (!arg0) {
            field2801 = null;
        }
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(I)V", line = 59)
    public class210(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IF)V", line = 65)
    public final void method1334(int arg0, float arg1) {
        if (arg0 != 917876560) {
            this.method1332((byte) 99, -2.186685F);
        }
        ++field2799;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field2199[super.field2219++] = (byte) (var3 >> 24);
        super.field2199[super.field2219++] = (byte) (var3 >> 16);
        super.field2199[super.field2219++] = (byte) (var3 >> 8);
        super.field2199[super.field2219++] = (byte) var3;
    }
}
