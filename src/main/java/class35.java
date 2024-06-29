import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!NSTEZBJV")
public class class35 {

    @OriginalMember(owner = "client!NSTEZBJV", name = "h", descriptor = "Z")
    public boolean field1029 = false;

    @OriginalMember(owner = "client!NSTEZBJV", name = "i", descriptor = "I")
    public int field1030 = -1;

    @OriginalMember(owner = "client!NSTEZBJV", name = "k", descriptor = "Z")
    public boolean field1032 = true;

    @OriginalMember(owner = "client!NSTEZBJV", name = "b", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!NSTEZBJV", name = "e", descriptor = "I")
    public int field1026;

    @OriginalMember(owner = "client!NSTEZBJV", name = "f", descriptor = "I")
    public int field1027;

    @OriginalMember(owner = "client!NSTEZBJV", name = "g", descriptor = "I")
    public int field1028;

    @OriginalMember(owner = "client!NSTEZBJV", name = "j", descriptor = "I")
    public int field1031;

    @OriginalMember(owner = "client!NSTEZBJV", name = "d", descriptor = "Ljava/lang/String;")
    public String field1025;

    @OriginalMember(owner = "client!NSTEZBJV", name = "a", descriptor = "Z")
    private static boolean field1022;

    @OriginalMember(owner = "client!NSTEZBJV", name = "c", descriptor = "[LNSTEZBJV;")
    public static class35[] field1024;

    @OriginalMember(owner = "client!NSTEZBJV", name = "a", descriptor = "(ZLAKPFVPPG;)V")
    public static void method392(boolean arg0, class2 arg1) {
        class13 var2 = new class13(arg1.method7("varbit.dat", null), (byte) 3);
        field1023 = var2.method215();
        if (!arg0) {
            field1022 = !field1022;
        }
        if (field1024 == null) {
            field1024 = new class35[field1023];
        }
        for (int var3 = 0; var3 < field1023; var3++) {
            if (field1024[var3] == null) {
                field1024[var3] = new class35();
            }
            field1024[var3].method393(var3, var2, -5817);
            if (field1024[var3].field1029) {
                class21.field713[field1024[var3].field1026].field725 = true;
            }
        }
        if (var2.field642.length != var2.field643) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "client!NSTEZBJV", name = "a", descriptor = "(ILFTMSICIZ;I)V")
    public void method393(int arg0, class13 arg1, int arg2) {
        if (arg2 != -5817) {
            return;
        }
        while (true) {
            int var4 = arg1.method213();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1026 = arg1.method215();
                this.field1027 = arg1.method213();
                this.field1028 = arg1.method213();
            } else if (var4 == 10) {
                this.field1025 = arg1.method220();
            } else if (var4 == 2) {
                this.field1029 = true;
            } else if (var4 == 3) {
                this.field1030 = arg1.method218();
            } else if (var4 == 4) {
                this.field1031 = arg1.method218();
            } else if (var4 == 5) {
                this.field1032 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
