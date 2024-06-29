import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class430 {

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "Ljava/lang/String;")
    public String field6121;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
    public int field6119;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class430(String arg0, int arg1) {
        this.field6121 = arg0;
        this.field6119 = arg1;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(II[Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method2521(int arg0, int arg1, String[] arg2, int arg3) {
        field6120++;
        if (arg0 == 0) {
            return "";
        } else if (arg0 == 1) {
            String var4 = arg2[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg1;
            int var6 = 0;
            for (int var7 = arg1; var7 < var5; var7++) {
                String var11 = arg2[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            if (arg3 <= 30) {
                method2522(-72, (class446) null);
            }
            for (int var9 = arg1; var9 < var5; var9++) {
                String var10 = arg2[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!gp", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6122++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILre;)V")
    public static final void method2522(int arg0, class446 arg1) {
        field6123++;
        if (arg1.field6316.length - arg1.field6315 < 1) {
            return;
        }
        int var2 = arg1.method2628(49152);
        if (var2 < 0 || var2 > 1 || arg1.field6316.length - arg1.field6315 < 2) {
            return;
        }
        int var3 = arg1.method2631(2530);
        if (var3 * 6 != arg1.field6316.length - arg1.field6315) {
            return;
        }
        while (true) {
            int var4;
            int var5;
            do {
                do {
                    do {
                        if (arg1.field6315 >= arg1.field6316.length) {
                            if (arg0 != -2) {
                                method2522(18, (class446) null);
                                return;
                            }
                            return;
                        }
                        var4 = arg1.method2631(2530);
                        var5 = arg1.method2604(-121);
                    } while (class156.field2170.length <= var4);
                } while (!class12.field158[var4]);
            } while (class318.field4778.method1754((byte) 77, var4).field145 == '1' && (var5 < -1 || var5 > 1));
            class156.field2170[var4] = var5;
        }
    }
}
