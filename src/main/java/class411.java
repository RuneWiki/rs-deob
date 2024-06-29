import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public abstract class class411 {

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "Ler;")
    public static class157 field6185 = new class157(50);

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "[[I")
    public static int[][] field6187 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    public int field6178;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
    public static int field6182;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
    public int field6183;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
    public int field6184;

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!fs", name = "l", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method2496(int arg0) {
        if (arg0 != 0) {
            this.field6183 = -21;
        }
        field6179++;
        return (this.field6178 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)Z", line = 16)
    public final boolean method2497(int arg0) {
        field6180++;
        if (arg0 != -3463) {
            field6181 = 34;
        }
        return (this.field6178 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)Z", line = 28)
    public final boolean method2498(byte arg0) {
        field6177++;
        if (arg0 == -32) {
            return (this.field6178 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)V", line = 49)
    public static void method2499(byte arg0) {
        if (arg0 != 72) {
            method2499((byte) 108);
        }
        field6185 = null;
        field6187 = null;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIB)Z", line = 65)
    public static final boolean method2500(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field6182++;
        if ((class129.field1816[0][arg2][arg3] & 0x2) != 0) {
            return true;
        } else if ((class129.field1816[arg0][arg2][arg3] & 0x10) == 0) {
            int var5 = 81 / ((arg4 + 44) / 32);
            return arg1 == class8.method76((byte) -92, arg3, arg2, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)Lha;", line = 86)
    public static final class320 method2501(int arg0, int arg1) {
        field6186++;
        class320 var2 = (class320) class308.field4614.method1013((long) arg0, (byte) -106);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class394.field5991.method2650(arg0, arg1 ^ 0xFFFFFFD3, arg1);
        class320 var4 = new class320();
        if (var3 != null) {
            var4.method2075(new class91(var3), -1, arg0);
        }
        class308.field4614.method1012(-105, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)Z", line = 108)
    public final boolean method2502(int arg0) {
        if (arg0 != 0) {
            field6181 = 104;
        }
        field6188++;
        return (this.field6178 & 0x8) != 0;
    }
}
