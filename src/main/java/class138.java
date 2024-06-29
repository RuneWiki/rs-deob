import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public abstract class class138 {

    @OriginalMember(owner = "client!si", name = "a", descriptor = "[I")
    public static int[] field1875 = new int[1000];

    @OriginalMember(owner = "client!si", name = "b", descriptor = "Leba;")
    public static class550 field1876 = new class550(18, 11);

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "[Lf;")
    public static class532[] field1880;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)J")
    public abstract long method43(int arg0);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method781(int arg0, int arg1, String arg2) {
        field1879++;
        int var3 = class426.field5750;
        int[] var4 = class586.field8104;
        boolean var5 = false;
        if (arg1 != 4) {
            method782((byte) -66);
        }
        for (int var6 = 0; var6 < var3; var6++) {
            class573 var7 = class513.field7145[var4[var6]];
            if (var7 != null && class408.field5369 != var7 && var7.field7791 != null && var7.field7791.equalsIgnoreCase(arg2)) {
                var5 = true;
                if (arg0 == 1) {
                    class35.field490++;
                    class229 var12 = class97.method550(class71.field841, false, class398.field5283);
                    var12.field2971.method939(var4[var6], (byte) 115);
                    var12.field2971.method959((byte) -32, 0);
                    class307.method1805(var12, arg1 ^ 0xFFFFC694);
                } else if (arg0 == 4) {
                    class680.field9649++;
                    class229 var11 = class97.method550(class71.field841, false, class199.field2700);
                    var11.field2971.method959((byte) -32, 0);
                    var11.field2971.method946((byte) -77, var4[var6]);
                    class307.method1805(var11, -14704);
                } else if (arg0 == 5) {
                    class89.field1073++;
                    class229 var8 = class97.method550(class71.field841, false, class634.field8769);
                    var8.field2971.method939(var4[var6], (byte) 59);
                    var8.field2971.method959((byte) -32, 0);
                    class307.method1805(var8, arg1 ^ 0xFFFFC694);
                } else if (arg0 == 6) {
                    class333.field4484++;
                    class229 var9 = class97.method550(class71.field841, false, class154.field2170);
                    var9.field2971.method915(-31914, 0);
                    var9.field2971.method918(24551, var4[var6]);
                    class307.method1805(var9, -14704);
                } else if (arg0 == 7) {
                    class131.field1825++;
                    class229 var10 = class97.method550(class71.field841, false, class24.field289);
                    var10.field2971.method959((byte) -32, 0);
                    var10.field2971.method918(24551, var4[var6]);
                    class307.method1805(var10, arg1 ^ 0xFFFFC694);
                }
                break;
            }
        }
        if (!var5) {
            class642.method3555((byte) -101, class371.field4900.method2141(class422.field5539, true) + arg2, 4);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public static void method782(byte arg0) {
        field1876 = null;
        field1875 = null;
        if (arg0 < -52) {
            field1880 = null;
        }
    }
}
