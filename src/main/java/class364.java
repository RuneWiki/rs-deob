import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class364 extends class535 implements class121 {

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    private int field5368;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "[Lhv;")
    public static class150[] field5371 = new class150[5];

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    public static int field5375;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "Lo;")
    public static class363 field5369;

    static {
        for (int var0 = 0; ~field5371.length < ~var0; ++var0) {
            field5371[var0] = new class150();
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)V", line = 3)
    public static void method2324(byte arg0) {
        field5369 = null;
        int var1 = -85 % ((arg0 - -14) / 39);
        field5371 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIII)Lbn;", line = 14)
    public static final class307 method2325(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5370;
        long var7 = (long) arg5 * 986053L ^ (long) arg6 * 475427L ^ (long) arg0 * 97549L ^ (long) arg3 * 67481L ^ (long) arg4 * 32147369L ^ (long) arg2 * 76724863L;
        class307 var9 = (class307) class282.field4404.method1634(var7, 64);
        if (var9 != null) {
            return var9;
        } else {
            class307 var10 = class73.field1248.method583(arg3, arg0, arg6, arg5, arg4, arg2);
            class282.field4404.method1623(var7, 17621, var10);
            return arg1 > -29 ? null : var10;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)I", line = 37)
    public final int method905(byte arg0) {
        if (arg0 != -124) {
            return -125;
        } else {
            ++field5367;
            return this.field5368;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III[B)V", line = 48)
    public final void method903(int arg0, int arg1, int arg2, byte[] arg3) {
        this.method3152(arg3, arg0);
        ++field5372;
        this.field5368 = arg1;
        if (arg2 != 11907) {
            method2327(-89);
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Ltt;ILjaggl/memory/NativeBuffer;)V", line = 60)
    public class364(class249 arg0, int arg1, NativeBuffer arg2) {
        super(arg0, arg2);
        this.field5368 = arg1;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lfi;Lfi;I)V", line = 69)
    public static final void method2326(class38 arg0, class38 arg1, int arg2) {
        class110.method857(4095, class173.field2678);
        ++class514.field7494;
        ++field5365;
        if (arg2 > -121) {
            method2325(38, -104, 100, 84, 8, -24, -2);
        }
        class312.field4752.method1348((byte) -65, arg0.field580);
        class312.field4752.method1362(arg0.field499, -66);
        class312.field4752.method1362(arg1.field607, -66);
        class312.field4752.method1362(arg0.field607, -66);
        class312.field4752.method1378(arg1.field580, (byte) 29);
        class312.field4752.method1364(arg1.field499, true);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)I", line = 88)
    public final int method906(boolean arg0) {
        if (arg0) {
            method2325(-38, -105, 41, -92, -70, -56, 124);
        }
        ++field5373;
        return 0;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Ltt;I[BI)V", line = 100)
    public class364(class249 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field5368 = arg1;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V", line = 110)
    public static final void method2327(int arg0) {
        ++field5375;
        if (arg0 == 0) {
            class249.field3884.method1637((byte) 13);
            class190.field2910.method1637((byte) 13);
            class498.field7250.method1637((byte) 13);
            class49.field761.method1637((byte) 13);
            class136.field2070.method1637((byte) 13);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)J", line = 129)
    public final long method904(int arg0) {
        if (arg0 != 26405) {
            field5371 = null;
        }
        ++field5366;
        return super.field7857.method2918();
    }
}
