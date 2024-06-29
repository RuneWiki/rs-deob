import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class36 extends class337 {

    @OriginalMember(owner = "client!gp", name = "u", descriptor = "I")
    public int field379;

    @OriginalMember(owner = "client!gp", name = "p", descriptor = "I")
    public int field374;

    @OriginalMember(owner = "client!gp", name = "s", descriptor = "[[I")
    public int[][] field377;

    @OriginalMember(owner = "client!gp", name = "q", descriptor = "[Z")
    public boolean[] field375;

    @OriginalMember(owner = "client!gp", name = "r", descriptor = "[I")
    public int[] field376;

    @OriginalMember(owner = "client!gp", name = "t", descriptor = "[I")
    public int[] field378;

    @OriginalMember(owner = "client!gp", name = "o", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/lang/String;ZLji;ZB)V")
    public static final void method210(String arg0, boolean arg1, class432 arg2, boolean arg3, byte arg4) {
        if (arg4 > -122) {
            method210(null, false, null, true, (byte) 65);
        }
        field373++;
        if (!arg3) {
            class296.method1872(10294, 3, arg0, arg2);
            return;
        }
        if (class432.field6470.startsWith("win") && class432.field6459 != 3) {
            String var5 = null;
            if (arg2.field6462 != null) {
                var5 = arg2.field6462.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class281 var6 = class296.method1872(10294, 0, arg0, arg2);
                class266.field3891 = var6;
                class485.field7178 = arg2;
                class436.field6516 = arg0;
                return;
            }
        }
        if (class432.field6470.startsWith("mac")) {
            String var7 = null;
            if (arg2.field6462 != null) {
                var7 = arg2.field6462.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg1) {
                class296.method1872(10294, 1, arg0, arg2);
                return;
            }
        }
        class296.method1872(10294, 2, arg0, arg2);
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(I[B)V")
    public class36(int arg0, byte[] arg1) {
        this.field379 = arg0;
        class209 var3 = new class209(arg1);
        this.field374 = var3.method1428(32122);
        this.field377 = new int[this.field374][];
        this.field375 = new boolean[this.field374];
        this.field376 = new int[this.field374];
        this.field378 = new int[this.field374];
        for (int var4 = 0; var4 < this.field374; var4++) {
            this.field378[var4] = var3.method1428(32122);
        }
        for (int var5 = 0; var5 < this.field374; var5++) {
            this.field375[var5] = var3.method1428(32122) == 1;
        }
        for (int var6 = 0; var6 < this.field374; var6++) {
            this.field376[var6] = var3.method1450((byte) 26);
        }
        for (int var7 = 0; var7 < this.field374; var7++) {
            this.field377[var7] = new int[var3.method1428(32122)];
        }
        for (int var8 = 0; var8 < this.field374; var8++) {
            for (int var9 = 0; var9 < this.field377[var8].length; var9++) {
                this.field377[var8][var9] = var3.method1428(32122);
            }
        }
    }
}
