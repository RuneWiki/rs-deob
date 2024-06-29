import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GLRCYUHA")
public class class18 {

    @OriginalMember(owner = "client!GLRCYUHA", name = "a", descriptor = "I")
    private int field738 = -26531;

    @OriginalMember(owner = "client!GLRCYUHA", name = "b", descriptor = "Z")
    private boolean field739 = true;

    @OriginalMember(owner = "client!GLRCYUHA", name = "e", descriptor = "I")
    public int field742 = -1;

    @OriginalMember(owner = "client!GLRCYUHA", name = "g", descriptor = "[I")
    public int[] field744 = new int[6];

    @OriginalMember(owner = "client!GLRCYUHA", name = "h", descriptor = "[I")
    public int[] field745 = new int[6];

    @OriginalMember(owner = "client!GLRCYUHA", name = "i", descriptor = "[I")
    public int[] field746 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!GLRCYUHA", name = "j", descriptor = "Z")
    public boolean field747 = false;

    @OriginalMember(owner = "client!GLRCYUHA", name = "c", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!GLRCYUHA", name = "f", descriptor = "[I")
    public int[] field743;

    @OriginalMember(owner = "client!GLRCYUHA", name = "d", descriptor = "[LGLRCYUHA;")
    public static class18[] field741;

    @OriginalMember(owner = "client!GLRCYUHA", name = "a", descriptor = "(LSMIVAFST;I)V")
    public static void method310(class52 arg0, int arg1) {
        class7 var2 = new class7(arg0.method512("idk.dat", null), (byte) 3);
        field740 = var2.method49();
        if (arg1 != -29636) {
            return;
        }
        if (field741 == null) {
            field741 = new class18[field740];
        }
        for (int var3 = 0; var3 < field740; var3++) {
            if (field741[var3] == null) {
                field741[var3] = new class18();
            }
            field741[var3].method311(7, var2);
        }
    }

    @OriginalMember(owner = "client!GLRCYUHA", name = "a", descriptor = "(ILBSNPYLEV;)V")
    public void method311(int arg0, class7 arg1) {
        if (arg0 != 7) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method47();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field742 = arg1.method47();
                } else if (var4 == 2) {
                    int var5 = arg1.method47();
                    this.field743 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field743[var6] = arg1.method49();
                    }
                } else if (var4 == 3) {
                    this.field747 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field744[var4 - 40] = arg1.method49();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field745[var4 - 50] = arg1.method49();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field746[var4 - 60] = arg1.method49();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!GLRCYUHA", name = "a", descriptor = "(I)Z")
    public boolean method312(int arg0) {
        if (this.field743 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field743.length; var3++) {
            if (!class47.method467(this.field743[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!GLRCYUHA", name = "a", descriptor = "(Z)LRMLAXPMV;")
    public class47 method313(boolean arg0) {
        if (this.field743 == null) {
            return null;
        }
        class47[] var2 = new class47[this.field743.length];
        if (!arg0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field743.length; var3++) {
            var2[var3] = class47.method466(this.field743[var3]);
        }
        class47 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class47(var2.length, var2, 118);
        }
        for (int var5 = 0; var5 < 6 && this.field744[var5] != 0; var5++) {
            var4.method480(this.field744[var5], this.field745[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!GLRCYUHA", name = "b", descriptor = "(I)Z")
    public boolean method314(int arg0) {
        boolean var2 = true;
        if (arg0 != -32142) {
            this.field739 = !this.field739;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field746[var3] != -1 && !class47.method467(this.field746[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!GLRCYUHA", name = "c", descriptor = "(I)LRMLAXPMV;")
    public class47 method315(int arg0) {
        class47[] var2 = new class47[5];
        if (this.field738 != arg0) {
            this.field738 = -210;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field746[var4] != -1) {
                var2[var3++] = class47.method466(this.field746[var4]);
            }
        }
        class47 var5 = new class47(var3, var2, 118);
        for (int var6 = 0; var6 < 6 && this.field744[var6] != 0; var6++) {
            var5.method480(this.field744[var6], this.field745[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!GLRCYUHA", name = "<init>", descriptor = "()V")
    public class18() {
        if (class56.field1535) {
        }
    }
}
