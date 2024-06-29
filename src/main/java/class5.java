import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ATLVWFDY")
public class class5 {

    @OriginalMember(owner = "client!ATLVWFDY", name = "g", descriptor = "Z")
    public boolean field79 = false;

    @OriginalMember(owner = "client!ATLVWFDY", name = "h", descriptor = "I")
    public int field80 = -1;

    @OriginalMember(owner = "client!ATLVWFDY", name = "j", descriptor = "Z")
    public boolean field82 = true;

    @OriginalMember(owner = "client!ATLVWFDY", name = "a", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!ATLVWFDY", name = "d", descriptor = "I")
    public int field76;

    @OriginalMember(owner = "client!ATLVWFDY", name = "e", descriptor = "I")
    public int field77;

    @OriginalMember(owner = "client!ATLVWFDY", name = "f", descriptor = "I")
    public int field78;

    @OriginalMember(owner = "client!ATLVWFDY", name = "i", descriptor = "I")
    public int field81;

    @OriginalMember(owner = "client!ATLVWFDY", name = "c", descriptor = "Ljava/lang/String;")
    public String field75;

    @OriginalMember(owner = "client!ATLVWFDY", name = "b", descriptor = "[LATLVWFDY;")
    public static class5[] field74;

    @OriginalMember(owner = "client!ATLVWFDY", name = "a", descriptor = "(BLSXKKBWPU;)V")
    public static void method24(byte arg0, class50 arg1) {
        class53 var2 = new class53(arg1.method442("varbit.dat", null), -631);
        if (arg0 != -109) {
            return;
        }
        field73 = var2.method470();
        if (field74 == null) {
            field74 = new class5[field73];
        }
        for (int var3 = 0; var3 < field73; var3++) {
            if (field74[var3] == null) {
                field74[var3] = new class5();
            }
            field74[var3].method25(var3, 0, var2);
            if (field74[var3].field79) {
                class34.field1090[field74[var3].field76].field1102 = true;
            }
        }
        if (var2.field1456.length != var2.field1457) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "client!ATLVWFDY", name = "a", descriptor = "(IILTQYMAXSO;)V")
    public void method25(int arg0, int arg1, class53 arg2) {
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg2.method468();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field76 = arg2.method470();
                this.field77 = arg2.method468();
                this.field78 = arg2.method468();
            } else if (var5 == 10) {
                this.field75 = arg2.method475();
            } else if (var5 == 2) {
                this.field79 = true;
            } else if (var5 == 3) {
                this.field80 = arg2.method473();
            } else if (var5 == 4) {
                this.field81 = arg2.method473();
            } else if (var5 == 5) {
                this.field82 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
