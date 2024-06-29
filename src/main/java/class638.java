import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class638 {

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "I")
    public int field9187;

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "I")
    public int field9188;

    @OriginalMember(owner = "client!jca", name = "h", descriptor = "I")
    public int field9192;

    @OriginalMember(owner = "client!jca", name = "j", descriptor = "I")
    public int field9194;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "I")
    public static int field9185;

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "I")
    public static int field9186;

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "I")
    public static int field9189;

    @OriginalMember(owner = "client!jca", name = "f", descriptor = "I")
    public static int field9190;

    @OriginalMember(owner = "client!jca", name = "g", descriptor = "I")
    public static int field9191;

    @OriginalMember(owner = "client!jca", name = "i", descriptor = "I")
    public static int field9193;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(ZI)Ljca;")
    public final class638 method3636(boolean arg0, int arg1) {
        field9186++;
        if (arg0) {
            this.field9187 = 17;
        }
        return new class638(this.field9192, arg1, this.field9187, this.field9188);
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
    public static final String method3637(int arg0, String[] arg1, int arg2, int arg3) {
        field9185++;
        if (arg0 == 0) {
            return "";
        } else if (arg0 == 1) {
            String var4 = arg1[arg3];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg3;
            int var6 = 0;
            for (int var7 = arg3; var7 < var5; var7++) {
                String var11 = arg1[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            if (arg2 != -29606) {
                method3637(86, null, 84, -101);
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg3; var9 < var5; var9++) {
                String var10 = arg1[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIIZ)V")
    public static final void method3638(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (class509 var5 = (class509) class203.field3124.method1224(-2); var5 != null; var5 = (class509) class203.field3124.method1232(-2)) {
            class701.method3911(arg2, var5, arg3, arg0, (byte) -123, arg1);
        }
        field9189++;
        for (class509 var6 = (class509) class614.field8925.method1224(-2); var6 != null; var6 = (class509) class614.field8925.method1232(-2)) {
            byte var11 = 1;
            class658 var12 = var6.field7195.method3465(0);
            if (var6.field7195.field8748) {
                var11 = 0;
            } else if (var6.field7195.field8766 == var12.field9467 || var6.field7195.field8766 == var12.field9472 || var6.field7195.field8766 == var12.field9474 || var6.field7195.field8766 == var12.field9484) {
                var11 = 2;
            } else if (var6.field7195.field8766 == var12.field9454 || var6.field7195.field8766 == var12.field9480 || var6.field7195.field8766 == var12.field9462 || var6.field7195.field8766 == var12.field9451) {
                var11 = 3;
            }
            if (var6.field7200 != var11) {
                int var13 = class379.method2371(-161, var6.field7195);
                class334 var14 = var6.field7195.field880;
                if (var14.field4984 != null) {
                    var14 = var14.method2150(class113.field2038, -32224);
                }
                if (var14 == null || var13 == -1) {
                    var6.field7223 = -1;
                    var6.field7207 = false;
                } else if (var6.field7223 != var13 || var6.field7207 != var14.field5002) {
                    if (var6.field7212 != null) {
                        class50.field1184.method2073(var6.field7212);
                        var6.field7212 = null;
                    }
                    var6.field7198 = null;
                    var6.field7223 = var13;
                    var6.field7216 = null;
                    var6.field7207 = var14.field5002;
                }
                var6.field7200 = var11;
            }
            var6.field7228 = var6.field7195.field9806;
            var6.field7202 = var6.field7195.field9806 + (var6.field7195.method3446(0) << 8);
            var6.field7222 = var6.field7195.field9815;
            var6.field7201 = var6.field7195.field9815 + (var6.field7195.method3446(0) << 8);
            class701.method3911(arg2, var6, arg3, arg0, (byte) -112, arg1);
        }
        if (arg4) {
            field9190 = -9;
        }
        for (class509 var7 = (class509) class518.field7304.method2597((byte) 39); var7 != null; var7 = (class509) class518.field7304.method2594((byte) -122)) {
            byte var8 = 1;
            class658 var9 = var7.field7209.method3465(0);
            if (var7.field7209.field8748) {
                var8 = 0;
            } else if (var7.field7209.field8766 == var9.field9467 || var7.field7209.field8766 == var9.field9472 || var7.field7209.field8766 == var9.field9474 || var7.field7209.field8766 == var9.field9484) {
                var8 = 2;
            } else if (var7.field7209.field8766 == var9.field9454 || var7.field7209.field8766 == var9.field9480 || var7.field7209.field8766 == var9.field9462 || var7.field7209.field8766 == var9.field9451) {
                var8 = 3;
            }
            if (var7.field7200 != var8) {
                int var10 = class535.method3095(var7.field7209, (byte) 125);
                if (var7.field7223 != var10 || var7.field7209.field8642 != var7.field7207) {
                    if (var7.field7212 != null) {
                        class50.field1184.method2073(var7.field7212);
                        var7.field7212 = null;
                    }
                    var7.field7198 = null;
                    var7.field7207 = var7.field7209.field8642;
                    var7.field7223 = var10;
                    var7.field7216 = null;
                }
                var7.field7200 = var8;
            }
            var7.field7228 = var7.field7209.field9806;
            var7.field7202 = var7.field7209.field9806 + (var7.field7209.method3446(0) << 8);
            var7.field7222 = var7.field7209.field9815;
            var7.field7201 = var7.field7209.field9815 + (var7.field7209.method3446(0) << 8);
            class701.method3911(arg2, var7, arg3, arg0, (byte) -119, arg1);
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lmq;III)V")
    public static final void method3639(class472 arg0, int arg1, int arg2, int arg3) {
        if (arg3 == -3534) {
            field9193++;
            class240.field3541[arg1][arg2] = arg0;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)Z")
    public static final boolean method3640(int arg0) {
        if (arg0 != -19507) {
            field9190 = 67;
        }
        field9191++;
        try {
            return class493.method2956(-62);
        } catch (IOException var4) {
            class400.method2454(-98);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class25.field911 == null ? -1 : class25.field911.method851((byte) 85)) + "," + (class635.field9123 == null ? -1 : class635.field9123.method851((byte) 119)) + "," + (class158.field2698 == null ? -1 : class158.field2698.method851((byte) -46)) + " - " + class478.field6872 + "," + (class532.field7456.field8787[0] + class33.field967) + "," + (class532.field7456.field8785[0] + class323.field4749) + " - ";
            for (int var3 = 0; class478.field6872 > var3 && var3 < 50; var3++) {
                var2 = var2 + class126.field2299.field1397[var3] + ",";
            }
            class374.method2357(var2, 106, var5);
            class85.method852(-114, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(IIII)V")
    public class638(int arg0, int arg1, int arg2, int arg3) {
        this.field9187 = arg2;
        this.field9188 = arg3;
        this.field9192 = arg0;
        this.field9194 = arg1;
    }
}
