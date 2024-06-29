import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class210 extends class363 {

    @OriginalMember(owner = "client!bea", name = "y", descriptor = "Lwj;")
    public class367 field2485;

    @OriginalMember(owner = "client!bea", name = "s", descriptor = "Lnh;")
    public static class699 field2479 = new class699(1);

    @OriginalMember(owner = "client!bea", name = "x", descriptor = "Lcga;")
    public static class449 field2484 = new class449(30, 3);

    @OriginalMember(owner = "client!bea", name = "A", descriptor = "[C")
    private static char[] field2487 = new char[64];

    @OriginalMember(owner = "client!bea", name = "B", descriptor = "Ldr;")
    public static class675 field2488;

    @OriginalMember(owner = "client!bea", name = "t", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!bea", name = "u", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!bea", name = "w", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!bea", name = "v", descriptor = "Lts;")
    public static class501 field2482;

    @OriginalMember(owner = "client!bea", name = "z", descriptor = "Ljava/awt/Image;")
    public static Image field2486;

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "(I)V")
    public static void method1233(int arg0) {
        if (arg0 != 62) {
            method1235(14, -7, null);
        }
        field2486 = null;
        field2484 = null;
        field2487 = null;
        field2488 = null;
        field2479 = null;
        field2482 = null;
    }

    @OriginalMember(owner = "client!bea", name = "e", descriptor = "(I)Lsaa;")
    public static final class305 method1234(int arg0) {
        int var1 = 70 % ((arg0 - 26) / 55);
        field2480++;
        return class704.field9858.length > class528.field6663 ? class704.field9858[class528.field6663++] : null;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IILwda;)Lqe;")
    public static final class436 method1235(int arg0, int arg1, class597 arg2) {
        if (arg1 != 52) {
            return null;
        }
        field2483++;
        class436 var3;
        if (class178.field2082 == null) {
            var3 = new class436();
        } else {
            var3 = class178.field2082;
            class178.field2082 = class178.field2082.field5485;
            var3.field5485 = null;
            class47.field635--;
        }
        var3.field5486 = arg2;
        var3.field5491 = arg0;
        return var3;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(III[B)[B")
    public static final byte[] method1236(int arg0, int arg1, int arg2, byte[] arg3) {
        field2481++;
        byte[] var4 = new byte[arg1];
        class70.method557(arg3, arg2, var4, arg0, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Lwj;)V")
    public class210(class367 arg0) {
        this.field2485 = arg0;
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field2487[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field2487[var1] = (char) (var1 + 71);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field2487[var2] = (char) (var2 + 48 - 52);
        }
        field2487[62] = '*';
        field2487[63] = '-';
        field2488 = new class675(59, 6);
    }
}
