import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DUEJVLYB")
public class class12 {

    @OriginalMember(owner = "client!DUEJVLYB", name = "a", descriptor = "B")
    private byte field650 = 28;

    @OriginalMember(owner = "client!DUEJVLYB", name = "i", descriptor = "Z")
    public boolean field658 = false;

    @OriginalMember(owner = "client!DUEJVLYB", name = "j", descriptor = "I")
    public int field659 = -1;

    @OriginalMember(owner = "client!DUEJVLYB", name = "l", descriptor = "Z")
    public boolean field661 = true;

    @OriginalMember(owner = "client!DUEJVLYB", name = "c", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!DUEJVLYB", name = "f", descriptor = "I")
    public int field655;

    @OriginalMember(owner = "client!DUEJVLYB", name = "g", descriptor = "I")
    public int field656;

    @OriginalMember(owner = "client!DUEJVLYB", name = "h", descriptor = "I")
    public int field657;

    @OriginalMember(owner = "client!DUEJVLYB", name = "k", descriptor = "I")
    public int field660;

    @OriginalMember(owner = "client!DUEJVLYB", name = "e", descriptor = "Ljava/lang/String;")
    public String field654;

    @OriginalMember(owner = "client!DUEJVLYB", name = "b", descriptor = "Z")
    private static boolean field651;

    @OriginalMember(owner = "client!DUEJVLYB", name = "d", descriptor = "[LDUEJVLYB;")
    public static class12[] field653;

    @OriginalMember(owner = "client!DUEJVLYB", name = "a", descriptor = "(LSMIVAFST;I)V")
    public static void method278(class52 arg0, int arg1) {
        class7 var2 = new class7(arg0.method512("varbit.dat", null), (byte) 3);
        field652 = var2.method49();
        if (field653 == null) {
            field653 = new class12[field652];
        }
        for (int var3 = 0; var3 < field652; var3++) {
            if (field653[var3] == null) {
                field653[var3] = new class12();
            }
            field653[var3].method279((byte) 28, var2, var3);
            if (field653[var3].field658) {
                class1.field5[field653[var3].field655].field17 = true;
            }
        }
        if (arg1 != -29636) {
            field651 = !field651;
        }
        if (var2.field90.length != var2.field91) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "client!DUEJVLYB", name = "a", descriptor = "(BLBSNPYLEV;I)V")
    public void method279(byte arg0, class7 arg1, int arg2) {
        if (this.field650 != arg0) {
            return;
        }
        while (true) {
            int var4 = arg1.method47();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field655 = arg1.method49();
                this.field656 = arg1.method47();
                this.field657 = arg1.method47();
            } else if (var4 == 10) {
                this.field654 = arg1.method54();
            } else if (var4 == 2) {
                this.field658 = true;
            } else if (var4 == 3) {
                this.field659 = arg1.method52();
            } else if (var4 == 4) {
                this.field660 = arg1.method52();
            } else if (var4 == 5) {
                this.field661 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
