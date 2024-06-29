import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class513 {

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "I")
    private int field7099 = 0;

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "I")
    private int field7101 = -1;

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "Lfea;")
    private class47 field7100 = new class47();

    @OriginalMember(owner = "client!ft", name = "o", descriptor = "Z")
    public boolean field7109 = false;

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "I")
    private int field7103;

    @OriginalMember(owner = "client!ft", name = "l", descriptor = "I")
    private int field7106;

    @OriginalMember(owner = "client!ft", name = "m", descriptor = "[[I")
    private int[][] field7107;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "[Lge;")
    private class550[] field7096;

    @OriginalMember(owner = "client!ft", name = "k", descriptor = "[I")
    public static int[] field7105 = new int[250];

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "Lio;")
    public static class151 field7095 = new class151(12, 0, 1, 0);

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "I")
    public static int field7097;

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "I")
    public static int field7098;

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!ft", name = "j", descriptor = "I")
    public static int field7104;

    @OriginalMember(owner = "client!ft", name = "n", descriptor = "I")
    public static int field7108;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)V")
    public static void method2871(byte arg0) {
        field7095 = null;
        if (arg0 != -94) {
            method2875(122, 48, 55);
        }
        field7105 = null;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(II)[I")
    public final int[] method2872(int arg0, int arg1) {
        if (arg0 != 1) {
            return null;
        }
        field7098++;
        if (this.field7106 == this.field7103) {
            this.field7109 = this.field7096[arg1] == null;
            this.field7096[arg1] = class337.field4837;
            return this.field7107[arg1];
        } else if (this.field7103 == 1) {
            this.field7109 = this.field7101 != arg1;
            this.field7101 = arg1;
            return this.field7107[0];
        } else {
            class550 var3 = this.field7096[arg1];
            if (var3 == null) {
                this.field7109 = true;
                if (this.field7103 <= this.field7099) {
                    class550 var4 = (class550) this.field7100.method428(2000);
                    var3 = new class550(arg1, var4.field7795);
                    this.field7096[var4.field7794] = null;
                    var4.method911(-52);
                } else {
                    var3 = new class550(arg1, this.field7099);
                    this.field7099++;
                }
                this.field7096[arg1] = var3;
            } else {
                this.field7109 = false;
            }
            this.field7100.method415((byte) 103, var3);
            return this.field7107[var3.field7795];
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V")
    public final void method2873(int arg0) {
        for (int var2 = 0; var2 < this.field7103; var2++) {
            this.field7107[var2] = null;
        }
        if (arg0 != 24115) {
            this.method2872(-20, 90);
        }
        field7108++;
        this.field7096 = null;
        this.field7107 = null;
        this.field7100.method425(-78);
        this.field7100 = null;
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)[[I")
    public final int[][] method2874(int arg0) {
        field7104++;
        if (this.field7106 != this.field7103) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 == -22531) {
            for (int var2 = 0; var2 < this.field7103; var2++) {
                this.field7096[var2] = class337.field4837;
            }
            return this.field7107;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(III)Z")
    public static final boolean method2875(int arg0, int arg1, int arg2) {
        if (arg2 != 34) {
            field7102 = 96;
        }
        field7097++;
        return (arg1 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(III)V")
    public class513(int arg0, int arg1, int arg2) {
        this.field7103 = arg0;
        this.field7106 = arg1;
        this.field7107 = new int[this.field7103][arg2];
        this.field7096 = new class550[this.field7106];
    }
}
