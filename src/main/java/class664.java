import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class664 {

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public int field9343;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Ldr;")
    private class629 field9342;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    private int field9345;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public int field9346;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lua;")
    public static class664 field9349 = new class664(0, 3, class629.field8922);

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "Lua;")
    public static class664 field9350 = new class664(1, 3, class629.field8922);

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "Lua;")
    public static class664 field9351 = new class664(2, 4, class629.field8918);

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Lua;")
    public static class664 field9352 = new class664(3, 1, class629.field8922);

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Lua;")
    public static class664 field9353 = new class664(4, 2, class629.field8922);

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Lua;")
    public static class664 field9354 = new class664(5, 3, class629.field8922);

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "Lua;")
    public static class664 field9355 = new class664(6, 4, class629.field8922);

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field9356 = class269.method1718(16, 0);

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field9357 = 52;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field9344;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field9347;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field9348;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public static int field9359;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "[Lmq;")
    public static class85[] field9358;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static void method3719(byte arg0) {
        field9353 = null;
        field9352 = null;
        int var1 = -6 % ((arg0 - 24) / 34);
        field9349 = null;
        field9355 = null;
        field9358 = null;
        field9350 = null;
        field9354 = null;
        field9351 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static final void method3720(int arg0) {
        for (class551 var1 = (class551) class496.field6807.method249(arg0 + 18373); var1 != null; var1 = (class551) class496.field6807.method254((byte) -64)) {
            if (var1.field7643 > 1) {
                var1.field7643 = 0;
                class359.field5083.method2890(arg0 - 7305, ((class554) var1.field7645.field332.field6213).field7680, var1);
                var1.field7645.method253((byte) -18);
            }
        }
        if (arg0 != -2) {
            method3721(-85, 82);
        }
        field9347++;
        class81.field1197 = 0;
        class624.field8863 = 0;
        class521.field7310.method3735(arg0 - 4674);
        class6.field76.method4249((byte) 73);
        class496.field6807.method253((byte) -18);
        class383.field5382 = false;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Lua;")
    public static final class664 method3721(int arg0, int arg1) {
        field9348++;
        if (arg0 == 0) {
            return field9349;
        } else if (arg0 == 1) {
            return field9350;
        } else if (arg0 == 2) {
            return field9351;
        } else if (arg0 == 3) {
            return field9352;
        } else if (arg0 == 4) {
            return field9353;
        } else if (arg0 == 5) {
            return field9354;
        } else if (arg0 == 6) {
            return field9355;
        } else {
            if (arg1 < 101) {
                method3721(8, -65);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(IILdr;)V")
    private class664(int arg0, int arg1, class629 arg2) {
        this.field9343 = arg0;
        this.field9342 = arg2;
        this.field9345 = arg1;
        this.field9346 = this.field9342.field8914 * this.field9345;
        if (this.field9343 >= 16) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ua", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9344++;
        throw new IllegalStateException();
    }
}
