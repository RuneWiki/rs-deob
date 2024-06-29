import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class457 {

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "[I")
    private int[] field6546;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "Lso;")
    public static class468 field6547 = new class468(0, 5);

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field6545;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field6548;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V", line = 6)
    public static void method2798(byte arg0) {
        field6547 = null;
        if (arg0 != 117) {
            method2798((byte) -96);
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "([I)V", line = 17)
    public class457(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length + (arg0.length >> 1)); var2 <<= 0x1) {
        }
        this.field6546 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field6546[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field6546[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field6546[var5 + var5] = arg0[var4];
            this.field6546[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILha;Ltp;)V", line = 52)
    public static final void method2799(int arg0, class58 arg1, class532 arg2) {
        if (arg0 != -22460) {
            field6547 = null;
        }
        field6548++;
        boolean var3 = class361.field4643.method905(arg2.field7649, arg2.field7600, arg2.field7593, arg1, arg2.field7691, arg2.field7686 ? class90.field937.field2201 : null, 17302, arg2.field7579 | 0xFF000000) == null;
        if (var3) {
            class107.field1138.method1721((byte) 95, new class672(arg2.field7691, arg2.field7593, arg2.field7649, arg2.field7579 | 0xFF000000, arg2.field7600, arg2.field7686));
            class11.method50(arg2, (byte) -99);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)I", line = 73)
    public final int method2800(int arg0, int arg1) {
        field6545++;
        int var3 = (this.field6546.length >> 1) - 1;
        if (arg1 >= -75) {
            this.method2800(40, 111);
        }
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field6546[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field6546[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }
}
