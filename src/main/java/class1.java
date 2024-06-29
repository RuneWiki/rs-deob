import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!AJLKWPFL")
public class class1 {

    @OriginalMember(owner = "client!AJLKWPFL", name = "a", descriptor = "Z")
    private boolean field1 = false;

    @OriginalMember(owner = "client!AJLKWPFL", name = "c", descriptor = "B")
    private byte field3 = 28;

    @OriginalMember(owner = "client!AJLKWPFL", name = "k", descriptor = "Z")
    public boolean field11 = false;

    @OriginalMember(owner = "client!AJLKWPFL", name = "l", descriptor = "Z")
    public boolean field12 = true;

    @OriginalMember(owner = "client!AJLKWPFL", name = "n", descriptor = "Z")
    public boolean field14 = false;

    @OriginalMember(owner = "client!AJLKWPFL", name = "q", descriptor = "Z")
    public boolean field17 = false;

    @OriginalMember(owner = "client!AJLKWPFL", name = "r", descriptor = "I")
    public int field18 = -1;

    @OriginalMember(owner = "client!AJLKWPFL", name = "s", descriptor = "Z")
    public boolean field19 = true;

    @OriginalMember(owner = "client!AJLKWPFL", name = "j", descriptor = "I")
    public int field10;

    @OriginalMember(owner = "client!AJLKWPFL", name = "m", descriptor = "I")
    public int field13;

    @OriginalMember(owner = "client!AJLKWPFL", name = "o", descriptor = "I")
    public int field15;

    @OriginalMember(owner = "client!AJLKWPFL", name = "p", descriptor = "I")
    public int field16;

    @OriginalMember(owner = "client!AJLKWPFL", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!AJLKWPFL", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!AJLKWPFL", name = "i", descriptor = "I")
    public int field9;

    @OriginalMember(owner = "client!AJLKWPFL", name = "h", descriptor = "Ljava/lang/String;")
    public String field8;

    @OriginalMember(owner = "client!AJLKWPFL", name = "b", descriptor = "Z")
    private static boolean field2;

    @OriginalMember(owner = "client!AJLKWPFL", name = "g", descriptor = "[I")
    public static int[] field7;

    @OriginalMember(owner = "client!AJLKWPFL", name = "e", descriptor = "[LAJLKWPFL;")
    public static class1[] field5;

    @OriginalMember(owner = "client!AJLKWPFL", name = "a", descriptor = "(LSMIVAFST;I)V")
    public static void method1(class52 arg0, int arg1) {
        if (arg1 != -29636) {
            field2 = !field2;
        }
        class7 var2 = new class7(arg0.method512("varp.dat", null), (byte) 3);
        field6 = 0;
        field4 = var2.method49();
        if (field5 == null) {
            field5 = new class1[field4];
        }
        if (field7 == null) {
            field7 = new int[field4];
        }
        for (int var3 = 0; var3 < field4; var3++) {
            if (field5[var3] == null) {
                field5[var3] = new class1();
            }
            field5[var3].method2((byte) 28, var2, var3);
        }
        if (var2.field90.length != var2.field91) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "client!AJLKWPFL", name = "a", descriptor = "(BLBSNPYLEV;I)V")
    public void method2(byte arg0, class7 arg1, int arg2) {
        if (this.field3 != arg0) {
            this.field1 = !this.field1;
        }
        while (true) {
            int var4 = arg1.method47();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field9 = arg1.method47();
            } else if (var4 == 2) {
                this.field10 = arg1.method47();
            } else if (var4 == 3) {
                this.field11 = true;
                field7[field6++] = arg2;
            } else if (var4 == 4) {
                this.field12 = false;
            } else if (var4 == 5) {
                this.field13 = arg1.method49();
            } else if (var4 == 6) {
                this.field14 = true;
            } else if (var4 == 7) {
                this.field15 = arg1.method52();
            } else if (var4 == 8) {
                this.field16 = 1;
                this.field17 = true;
            } else if (var4 == 10) {
                this.field8 = arg1.method54();
            } else if (var4 == 11) {
                this.field17 = true;
            } else if (var4 == 12) {
                this.field18 = arg1.method52();
            } else if (var4 == 13) {
                this.field16 = 2;
                this.field17 = true;
            } else if (var4 == 14) {
                this.field19 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
