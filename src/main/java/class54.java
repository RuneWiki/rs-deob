import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!UGUHDANY")
public class class54 {

    @OriginalMember(owner = "client!UGUHDANY", name = "a", descriptor = "Z")
    private boolean field1457 = true;

    @OriginalMember(owner = "client!UGUHDANY", name = "b", descriptor = "Z")
    private boolean field1458 = true;

    @OriginalMember(owner = "client!UGUHDANY", name = "c", descriptor = "I")
    private int field1459 = 3;

    @OriginalMember(owner = "client!UGUHDANY", name = "f", descriptor = "I")
    public int field1462 = -1;

    @OriginalMember(owner = "client!UGUHDANY", name = "h", descriptor = "[I")
    public int[] field1464 = new int[6];

    @OriginalMember(owner = "client!UGUHDANY", name = "i", descriptor = "[I")
    public int[] field1465 = new int[6];

    @OriginalMember(owner = "client!UGUHDANY", name = "j", descriptor = "[I")
    public int[] field1466 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!UGUHDANY", name = "k", descriptor = "Z")
    public boolean field1467 = false;

    @OriginalMember(owner = "client!UGUHDANY", name = "d", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!UGUHDANY", name = "g", descriptor = "[I")
    public int[] field1463;

    @OriginalMember(owner = "client!UGUHDANY", name = "e", descriptor = "[LUGUHDANY;")
    public static class54[] field1461;

    @OriginalMember(owner = "client!UGUHDANY", name = "a", descriptor = "(LWEMOPWVJ;I)V")
    public static void method496(class62 arg0, int arg1) {
        class52 var2 = new class52(arg0.method559("idk.dat", null), true);
        field1460 = var2.method463();
        if (field1461 == null) {
            field1461 = new class54[field1460];
        }
        for (int var3 = 0; var3 < field1460; var3++) {
            if (field1461[var3] == null) {
                field1461[var3] = new class54();
            }
            field1461[var3].method497(-13096, var2);
        }
        if (arg1 == 24414) {
            ;
        }
    }

    @OriginalMember(owner = "client!UGUHDANY", name = "a", descriptor = "(ILSVWJKJVI;)V")
    public void method497(int arg0, class52 arg1) {
        if (arg0 != -13096) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method461();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1462 = arg1.method461();
                } else if (var3 == 2) {
                    int var4 = arg1.method461();
                    this.field1463 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1463[var5] = arg1.method463();
                    }
                } else if (var3 == 3) {
                    this.field1467 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1464[var3 - 40] = arg1.method463();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1465[var3 - 50] = arg1.method463();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1466[var3 - 60] = arg1.method463();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!UGUHDANY", name = "a", descriptor = "(I)Z")
    public boolean method498(int arg0) {
        while (arg0 >= 0) {
            this.field1459 = 456;
        }
        if (this.field1463 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1463.length; var3++) {
            if (!class19.method274(this.field1463[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!UGUHDANY", name = "b", descriptor = "(I)LIYSWJGDE;")
    public class19 method499(int arg0) {
        if (this.field1463 == null) {
            return null;
        }
        class19[] var2 = new class19[this.field1463.length];
        for (int var3 = 0; var3 < this.field1463.length; var3++) {
            var2[var3] = class19.method273(this.field1463[var3]);
        }
        class19 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class19((byte) 9, var2.length, var2);
        }
        for (int var5 = 0; var5 < 6 && this.field1464[var5] != 0; var5++) {
            var4.method287(this.field1464[var5], this.field1465[var5]);
        }
        if (arg0 >= 0) {
            this.field1457 = !this.field1457;
        }
        return var4;
    }

    @OriginalMember(owner = "client!UGUHDANY", name = "c", descriptor = "(I)Z")
    public boolean method500(int arg0) {
        boolean var2 = true;
        if (arg0 < 3 || arg0 > 3) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1466[var3] != -1 && !class19.method274(this.field1466[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!UGUHDANY", name = "d", descriptor = "(I)LIYSWJGDE;")
    public class19 method501(int arg0) {
        class19[] var2 = new class19[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1466[var4] != -1) {
                var2[var3++] = class19.method273(this.field1466[var4]);
            }
        }
        class19 var5 = new class19((byte) 9, var3, var2);
        if (arg0 >= 0) {
            this.field1458 = !this.field1458;
        }
        for (int var6 = 0; var6 < 6 && this.field1464[var6] != 0; var6++) {
            var5.method287(this.field1464[var6], this.field1465[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!UGUHDANY", name = "<init>", descriptor = "()V")
    public class54() {
        if (class31.field984) {
        }
    }
}
