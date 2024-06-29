import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SECEMLXT")
public class class50 {

    @OriginalMember(owner = "client!SECEMLXT", name = "a", descriptor = "Z")
    private boolean field1360 = false;

    @OriginalMember(owner = "client!SECEMLXT", name = "e", descriptor = "I")
    public int field1364 = -1;

    @OriginalMember(owner = "client!SECEMLXT", name = "g", descriptor = "[I")
    public int[] field1366 = new int[6];

    @OriginalMember(owner = "client!SECEMLXT", name = "h", descriptor = "[I")
    public int[] field1367 = new int[6];

    @OriginalMember(owner = "client!SECEMLXT", name = "i", descriptor = "[I")
    public int[] field1368 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!SECEMLXT", name = "j", descriptor = "Z")
    public boolean field1369 = false;

    @OriginalMember(owner = "client!SECEMLXT", name = "b", descriptor = "I")
    private int field1361;

    @OriginalMember(owner = "client!SECEMLXT", name = "c", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!SECEMLXT", name = "f", descriptor = "[I")
    public int[] field1365;

    @OriginalMember(owner = "client!SECEMLXT", name = "d", descriptor = "[LSECEMLXT;")
    public static class50[] field1363;

    @OriginalMember(owner = "client!SECEMLXT", name = "a", descriptor = "(BLRPFMUSNN;)V")
    public static void method415(byte arg0, class49 arg1) {
        if (arg0 != -114) {
            return;
        }
        class63 var2 = new class63((byte) -58, arg1.method414("idk.dat", null));
        field1362 = var2.method504();
        if (field1363 == null) {
            field1363 = new class50[field1362];
        }
        for (int var3 = 0; var3 < field1362; var3++) {
            if (field1363[var3] == null) {
                field1363[var3] = new class50();
            }
            field1363[var3].method416(-934, var2);
        }
    }

    @OriginalMember(owner = "client!SECEMLXT", name = "a", descriptor = "(ILWNCFPLWV;)V")
    public void method416(int arg0, class63 arg1) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method502();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1364 = arg1.method502();
                } else if (var3 == 2) {
                    int var4 = arg1.method502();
                    this.field1365 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1365[var5] = arg1.method504();
                    }
                } else if (var3 == 3) {
                    this.field1369 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1366[var3 - 40] = arg1.method504();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1367[var3 - 50] = arg1.method504();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1368[var3 - 60] = arg1.method504();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!SECEMLXT", name = "a", descriptor = "(Z)Z")
    public boolean method417(boolean arg0) {
        if (this.field1365 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field1365.length; var3++) {
            if (!class56.method443(this.field1365[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!SECEMLXT", name = "a", descriptor = "(I)LUNLYQRUD;")
    public class56 method418(int arg0) {
        if (this.field1365 == null) {
            return null;
        }
        class56[] var2 = new class56[this.field1365.length];
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field1365.length; var3++) {
            var2[var3] = class56.method442(this.field1365[var3]);
        }
        class56 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class56(var2.length, var2, 0);
        }
        for (int var5 = 0; var5 < 6 && this.field1366[var5] != 0; var5++) {
            var4.method456(this.field1366[var5], this.field1367[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!SECEMLXT", name = "b", descriptor = "(Z)Z")
    public boolean method419(boolean arg0) {
        boolean var2 = true;
        if (arg0) {
            this.field1360 = !this.field1360;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1368[var3] != -1 && !class56.method443(this.field1368[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!SECEMLXT", name = "b", descriptor = "(I)LUNLYQRUD;")
    public class56 method420(int arg0) {
        class56[] var2 = new class56[5];
        if (arg0 != 0) {
            this.field1361 = 142;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1368[var4] != -1) {
                var2[var3++] = class56.method442(this.field1368[var4]);
            }
        }
        class56 var5 = new class56(var3, var2, 0);
        for (int var6 = 0; var6 < 6 && this.field1366[var6] != 0; var6++) {
            var5.method456(this.field1366[var6], this.field1367[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!SECEMLXT", name = "<init>", descriptor = "()V")
    public class50() {
        if (class33.field960) {
        }
    }
}
