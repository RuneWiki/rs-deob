import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EMWMNDZQ")
public class class16 {

    @OriginalMember(owner = "EMWMNDZQ", name = "a", descriptor = "Z")
    private boolean field722 = true;

    @OriginalMember(owner = "EMWMNDZQ", name = "h", descriptor = "Z")
    public boolean field729 = false;

    @OriginalMember(owner = "EMWMNDZQ", name = "i", descriptor = "I")
    public int field730 = -1;

    @OriginalMember(owner = "EMWMNDZQ", name = "k", descriptor = "Z")
    public boolean field732 = true;

    @OriginalMember(owner = "EMWMNDZQ", name = "b", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "EMWMNDZQ", name = "e", descriptor = "I")
    public int field726;

    @OriginalMember(owner = "EMWMNDZQ", name = "f", descriptor = "I")
    public int field727;

    @OriginalMember(owner = "EMWMNDZQ", name = "g", descriptor = "I")
    public int field728;

    @OriginalMember(owner = "EMWMNDZQ", name = "j", descriptor = "I")
    public int field731;

    @OriginalMember(owner = "EMWMNDZQ", name = "d", descriptor = "Ljava/lang/String;")
    public String field725;

    @OriginalMember(owner = "EMWMNDZQ", name = "c", descriptor = "[LEMWMNDZQ;")
    public static class16[] field724;

    @OriginalMember(owner = "EMWMNDZQ", name = "a", descriptor = "(ILTKEGJSFV;)V")
    public static void method299(int arg0, class58 arg1) {
        class15 var2 = new class15(arg1.method542("varbit.dat", null), false);
        field723 = var2.method263();
        if (field724 == null) {
            field724 = new class16[field723];
        }
        for (int var3 = 0; var3 < field723; var3++) {
            if (field724[var3] == null) {
                field724[var3] = new class16();
            }
            field724[var3].method300(var2, 792, var3);
            if (field724[var3].field729) {
                class23.field785[field724[var3].field726].field797 = true;
            }
        }
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (var2.field708.length != var2.field709) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "EMWMNDZQ", name = "a", descriptor = "(LEGCCHUZS;II)V")
    public void method300(class15 arg0, int arg1, int arg2) {
        if (arg1 <= 0) {
            this.field722 = !this.field722;
        }
        while (true) {
            int var4 = arg0.method261();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field726 = arg0.method263();
                this.field727 = arg0.method261();
                this.field728 = arg0.method261();
            } else if (var4 == 10) {
                this.field725 = arg0.method268();
            } else if (var4 == 2) {
                this.field729 = true;
            } else if (var4 == 3) {
                this.field730 = arg0.method266();
            } else if (var4 == 4) {
                this.field731 = arg0.method266();
            } else if (var4 == 5) {
                this.field732 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
