import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class131 extends class24 {

    @OriginalMember(owner = "client!laa", name = "D", descriptor = "I")
    private int field1945 = -1;

    @OriginalMember(owner = "client!laa", name = "y", descriptor = "I")
    public static int field1940 = 0;

    @OriginalMember(owner = "client!laa", name = "C", descriptor = "Lor;")
    public static class668 field1944 = null;

    @OriginalMember(owner = "client!laa", name = "B", descriptor = "B")
    private byte field1943;

    @OriginalMember(owner = "client!laa", name = "w", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!laa", name = "x", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!laa", name = "z", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!laa", name = "A", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!laa", name = "E", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!laa", name = "F", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!laa", name = "G", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILjp;)V", line = 4)
    public final void method191(int arg0, class376 arg1) {
        field1939++;
        this.field1945 = arg1.method2359(-1);
        this.field1943 = arg1.method2387((byte) -67);
        if (arg0 > -56) {
            field1946 = 88;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lke;I)V", line = 23)
    public final void method190(class625 arg0, int arg1) {
        arg0.method3444(this.field1945, this.field1943, (byte) 125);
        if (arg1 != 5) {
            this.method191(-118, null);
        }
        field1947++;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(JLha;B)V", line = 40)
    public static final void method1047(long arg0, class65 arg1, byte arg2) {
        class650.field9021 = class491.field6814;
        if (arg2 != -2) {
            return;
        }
        class114.field1555 = 0;
        field1941++;
        class489.field6780 = 0;
        class491.field6814 = 0;
        long var4 = class302.method1910(0);
        for (class663 var6 = (class663) class270.field3980.method109(0); var6 != null; var6 = (class663) class270.field3980.method115((byte) 47)) {
            if (var6.method3667(arg1, arg0)) {
                class489.field6780++;
            }
        }
        if (class544.field7378 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + class270.field3980.method112(1318812549) + ", running: " + class489.field6780);
            System.out.println("Emitters: " + class114.field1555 + " Particles: " + class491.field6814 + ". Time taken: " + (class302.method1910(arg2 ^ 0xFFFFFFFE) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(II[BIII)V", line = 74)
    public static final void method1048(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 73) {
            method1048(-26, -52, null, -73, 20, -87);
        }
        field1938++;
        if (arg4 >= arg5) {
            return;
        }
        int var6 = arg5 - arg4 >> 2;
        int var7 = arg3 + arg4;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg5 - arg4 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg2[var7++] = 1;
                }
            }
            arg2[var7++] = 1;
            arg2[var7++] = 1;
            arg2[var7++] = 1;
            arg2[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Z)V", line = 103)
    public static void method1049(boolean arg0) {
        if (arg0) {
            field1942 = -108;
        }
        field1944 = null;
    }
}
