import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class555 extends class490 {

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "Ljava/lang/String;")
    private String field7720 = null;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "J")
    private long field7719 = -1L;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "Lmga;")
    public static class738 field7718 = new class738();

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "Lfj;")
    public static class684 field7725 = new class684(6, 4);

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "Lei;")
    public static class191 field7726 = new class191();

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "I")
    public static int field7728 = 1408;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "B")
    private byte field7723;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    private int field7721;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public static int field7722;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    public static int field7724;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "Lwp;")
    public static class193 field7727;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
    public static void method3248(byte arg0) {
        field7718 = null;
        field7726 = null;
        int var1 = -103 / ((arg0 + 47) / 62);
        field7727 = null;
        field7725 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Les;I)V")
    public final void method2457(class403 arg0, int arg1) {
        if (arg0.method2396((byte) -119) != 255) {
            arg0.field5262--;
            this.field7719 = arg0.method2361(116);
        }
        field7724++;
        this.field7720 = arg0.method2383(7540);
        this.field7721 = arg0.method2390((byte) 7);
        this.field7723 = arg0.method2392(116);
        arg0.method2361(76);
        if (class760.field10511) {
            System.out.println("memberhash:" + this.field7719 + " membername:" + this.field7720);
        }
        if (arg1 <= 118) {
            method3248((byte) 2);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lwt;I)V")
    public final void method2459(class330 arg0, int arg1) {
        if (arg1 != 0) {
            this.method2459(null, 118);
        }
        field7722++;
        class216 var3 = new class216();
        var3.field2544 = this.field7720;
        var3.field2539 = this.field7723;
        var3.field2543 = this.field7721;
        arg0.method1962(var3, -5);
    }
}
