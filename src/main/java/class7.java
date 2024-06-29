import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CWNXCHDT")
public class class7 {

    @OriginalMember(owner = "client!CWNXCHDT", name = "a", descriptor = "I")
    private int field601 = 709;

    @OriginalMember(owner = "client!CWNXCHDT", name = "e", descriptor = "I")
    public int field605 = -1;

    @OriginalMember(owner = "client!CWNXCHDT", name = "g", descriptor = "[I")
    public int[] field607 = new int[6];

    @OriginalMember(owner = "client!CWNXCHDT", name = "h", descriptor = "[I")
    public int[] field608 = new int[6];

    @OriginalMember(owner = "client!CWNXCHDT", name = "i", descriptor = "[I")
    public int[] field609 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!CWNXCHDT", name = "j", descriptor = "Z")
    public boolean field610 = false;

    @OriginalMember(owner = "client!CWNXCHDT", name = "c", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!CWNXCHDT", name = "b", descriptor = "Z")
    private static boolean field602;

    @OriginalMember(owner = "client!CWNXCHDT", name = "f", descriptor = "[I")
    public int[] field606;

    @OriginalMember(owner = "client!CWNXCHDT", name = "d", descriptor = "[LCWNXCHDT;")
    public static class7[] field604;

    @OriginalMember(owner = "client!CWNXCHDT", name = "a", descriptor = "(LFUZJMGZB;I)V")
    public static void method186(class19 arg0, int arg1) {
        class32 var2 = new class32((byte) 114, arg0.method277("idk.dat", null));
        field603 = var2.method371();
        if (arg1 != 5) {
            field602 = !field602;
        }
        if (field604 == null) {
            field604 = new class7[field603];
        }
        for (int var3 = 0; var3 < field603; var3++) {
            if (field604[var3] == null) {
                field604[var3] = new class7();
            }
            field604[var3].method187(var2, (byte) 59);
        }
    }

    @OriginalMember(owner = "client!CWNXCHDT", name = "a", descriptor = "(LLBBVYYXO;B)V")
    public void method187(class32 arg0, byte arg1) {
        if (arg1 != 59) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method369();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field605 = arg0.method369();
                } else if (var3 == 2) {
                    int var4 = arg0.method369();
                    this.field606 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field606[var5] = arg0.method371();
                    }
                } else if (var3 == 3) {
                    this.field610 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field607[var3 - 40] = arg0.method371();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field608[var3 - 50] = arg0.method371();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field609[var3 - 60] = arg0.method371();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!CWNXCHDT", name = "a", descriptor = "(I)Z")
    public boolean method188(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (this.field606 == null) {
            return true;
        } else {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field606.length; var3++) {
                if (!class8.method197(this.field606[var3])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!CWNXCHDT", name = "b", descriptor = "(I)LCYPZUKMB;")
    public class8 method189(int arg0) {
        if (arg0 != 18390) {
            throw new NullPointerException();
        } else if (this.field606 == null) {
            return null;
        } else {
            class8[] var2 = new class8[this.field606.length];
            for (int var3 = 0; var3 < this.field606.length; var3++) {
                var2[var3] = class8.method196(this.field606[var3]);
            }
            class8 var4;
            if (var2.length == 1) {
                var4 = var2[0];
            } else {
                var4 = new class8(var2, 3, var2.length);
            }
            for (int var5 = 0; var5 < 6 && this.field607[var5] != 0; var5++) {
                var4.method210(this.field607[var5], this.field608[var5]);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!CWNXCHDT", name = "c", descriptor = "(I)Z")
    public boolean method190(int arg0) {
        if (arg0 != 2) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field609[var4] != -1 && !class8.method197(this.field609[var4])) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!CWNXCHDT", name = "d", descriptor = "(I)LCYPZUKMB;")
    public class8 method191(int arg0) {
        class8[] var2 = new class8[5];
        int var3 = 64 / arg0;
        int var4 = 0;
        for (int var5 = 0; var5 < 5; var5++) {
            if (this.field609[var5] != -1) {
                var2[var4++] = class8.method196(this.field609[var5]);
            }
        }
        class8 var6 = new class8(var2, 3, var4);
        for (int var7 = 0; var7 < 6 && this.field607[var7] != 0; var7++) {
            var6.method210(this.field607[var7], this.field608[var7]);
        }
        return var6;
    }

    @OriginalMember(owner = "client!CWNXCHDT", name = "<init>", descriptor = "()V")
    public class7() {
        if (class45.field1317) {
        }
    }
}
