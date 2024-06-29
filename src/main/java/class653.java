import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class653 {

    @OriginalMember(owner = "client!no", name = "f", descriptor = "I")
    private int field9079 = 0;

    @OriginalMember(owner = "client!no", name = "g", descriptor = "I")
    private int field9080 = -1;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "Lgca;")
    private class227 field9077 = new class227();

    @OriginalMember(owner = "client!no", name = "l", descriptor = "Z")
    public boolean field9085 = false;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    private int field9074;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "I")
    private int field9083;

    @OriginalMember(owner = "client!no", name = "k", descriptor = "[[[I")
    private int[][][] field9084;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "[Lgk;")
    private class439[] field9076;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "Lem;")
    public static class206 field9086 = new class206(101, -2);

    @OriginalMember(owner = "client!no", name = "q", descriptor = "[I")
    public static int[] field9090 = new int[1];

    @OriginalMember(owner = "client!no", name = "r", descriptor = "Llh;")
    public static class487 field9091 = new class487(41, 7);

    @OriginalMember(owner = "client!no", name = "b", descriptor = "I")
    public static int field9075;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "I")
    public static int field9078;

    @OriginalMember(owner = "client!no", name = "h", descriptor = "I")
    public static int field9081;

    @OriginalMember(owner = "client!no", name = "i", descriptor = "I")
    public static int field9082;

    @OriginalMember(owner = "client!no", name = "n", descriptor = "I")
    public static int field9087;

    @OriginalMember(owner = "client!no", name = "o", descriptor = "I")
    public static int field9088;

    @OriginalMember(owner = "client!no", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field9089;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)V")
    public static void method3681(boolean arg0) {
        field9086 = null;
        field9089 = null;
        if (arg0) {
            method3684(58, (byte) 123, 43, 41);
        }
        field9090 = null;
        field9091 = null;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method3682(int arg0) {
        field9081++;
        if (this.field9083 != this.field9074) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field9074; var2++) {
            this.field9076[var2] = class654.field9106;
        }
        return this.field9084;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IB)[[I")
    public final int[][] method3683(int arg0, byte arg1) {
        int var3 = -110 / ((arg1 - 56) / 60);
        field9087++;
        if (this.field9083 == this.field9074) {
            this.field9085 = this.field9076[arg0] == null;
            this.field9076[arg0] = class654.field9106;
            return this.field9084[arg0];
        } else if (this.field9074 == 1) {
            this.field9085 = this.field9080 != arg0;
            this.field9080 = arg0;
            return this.field9084[0];
        } else {
            class439 var4 = this.field9076[arg0];
            if (var4 == null) {
                this.field9085 = true;
                if (this.field9074 > this.field9079) {
                    var4 = new class439(arg0, this.field9079);
                    this.field9079++;
                } else {
                    class439 var5 = (class439) this.field9077.method1433(true);
                    var4 = new class439(arg0, var5.field6093);
                    this.field9076[var5.field6094] = null;
                    var5.method2340(90);
                }
                this.field9076[arg0] = var4;
            } else {
                this.field9085 = false;
            }
            this.field9077.method1438(var4, -32762);
            return this.field9084[var4.field6093];
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IBII)V")
    public static final void method3684(int arg0, byte arg1, int arg2, int arg3) {
        field9078++;
        int var4 = class366.field4875.field9352 * arg3 >> 8;
        if (arg0 == -1 && !class636.field8795) {
            class270.method1638((byte) -101);
        } else if (arg0 != -1 && (class507.field6950 != arg0 || !class338.method1979(true)) && var4 != 0 && !class636.field8795) {
            class351.method2025(class481.field6621, true, 0, arg2, var4, arg0, false);
            class167.method1179((byte) -112);
        }
        if (class507.field6950 != arg0) {
            class80.field1211 = null;
        }
        if (arg1 < 62) {
            field9091 = null;
        }
        class507.field6950 = arg0;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ILsea;Llaa;)V")
    public static final void method3685(int arg0, class648 arg1, class105 arg2) {
        class266.field3604 = arg2;
        field9088++;
        class325.field4431 = arg1;
        class605.field8411 = "";
        if (class120.field1657.startsWith("win")) {
            class605.field8411 = class605.field8411 + "windows/";
        } else if (class120.field1657.startsWith("linux")) {
            class605.field8411 = class605.field8411 + "linux/";
        } else if (class120.field1657.startsWith("mac")) {
            class605.field8411 = class605.field8411 + "macos/";
        }
        if (arg0 != 7) {
            field9091 = null;
        }
        if (class266.field3604.field1460) {
            class605.field8411 = class605.field8411 + "msjava/";
        } else if (class120.field1644.startsWith("amd64") || class120.field1644.startsWith("x86_64")) {
            class605.field8411 = class605.field8411 + "x86_64/";
        } else if (class120.field1644.startsWith("i386") || class120.field1644.startsWith("i486") || class120.field1644.startsWith("i586") || class120.field1644.startsWith("x86")) {
            class605.field8411 = class605.field8411 + "x86/";
        } else if (class120.field1644.startsWith("ppc")) {
            class605.field8411 = class605.field8411 + "ppc/";
        } else {
            class605.field8411 = class605.field8411 + "universal/";
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BLac;)Lrk;")
    public static final class30 method3686(byte arg0, class501 arg1) {
        field9082++;
        arg1.method2874((byte) -75);
        int var2 = arg1.method2874((byte) -75);
        if (arg0 > -68) {
            method3681(false);
        }
        class30 var3 = class190.method1290((byte) 4, var2);
        var3.field376 = arg1.method2874((byte) -75);
        int var4 = arg1.method2874((byte) -75);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method2874((byte) -75);
            var3.method27((byte) 120, var6, arg1);
        }
        var3.method29((byte) -82);
        return var3;
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V")
    public final void method3687(int arg0) {
        for (int var2 = 0; var2 < this.field9074; var2++) {
            this.field9084[var2][0] = null;
            this.field9084[var2][1] = null;
            this.field9084[var2][2] = null;
            this.field9084[var2] = null;
        }
        field9075++;
        this.field9084 = null;
        this.field9076 = null;
        this.field9077.method1444(-27547);
        this.field9077 = null;
        if (arg0 < 103) {
            this.field9079 = -53;
        }
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(III)V")
    public class653(int arg0, int arg1, int arg2) {
        this.field9074 = arg0;
        this.field9083 = arg1;
        this.field9084 = new int[this.field9074][3][arg2];
        this.field9076 = new class439[this.field9083];
    }
}
