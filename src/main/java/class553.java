import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class553 {

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
    public int field7713;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "Ljava/lang/String;")
    public String field7714;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "Lkr;")
    public static class602 field7712 = new class602(99, 12);

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
    public static int field7711;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
    public static int field7716;

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
    public static int field7718;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "Ljava/awt/Frame;")
    public static Frame field7717;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method3271(String arg0, int arg1, int arg2) {
        field7711++;
        int var3 = class209.field2736;
        if (arg1 != -5) {
            return;
        }
        int[] var4 = class344.field4898;
        boolean var5 = false;
        for (int var6 = 0; var6 < var3; var6++) {
            class96 var7 = class251.field3675[var4[var6]];
            if (var7 != null && class388.field5601 != var7 && var7.field1313 != null && var7.field1313.equalsIgnoreCase(arg0)) {
                var5 = true;
                if (arg2 == 1) {
                    class237.field3528++;
                    class583 var8 = class54.method400(class213.field2800, (byte) -83, class87.field1233);
                    var8.field7963.method453(var4[var6], (byte) -68);
                    var8.field7963.method444(0, 128);
                    class463.method2838(var8, (byte) 117);
                } else if (arg2 == 4) {
                    class263.field3856++;
                    class583 var12 = class54.method400(class213.field2800, (byte) 119, class252.field3696);
                    var12.field7963.method467(2714, var4[var6]);
                    var12.field7963.method444(0, arg1 ^ 0xFFFFFF7B);
                    class463.method2838(var12, (byte) 122);
                } else if (arg2 == 5) {
                    class228.field3065++;
                    class583 var9 = class54.method400(class213.field2800, (byte) 97, class248.field3648);
                    var9.field7963.method488(-128, var4[var6]);
                    var9.field7963.method465(0, (byte) -29);
                    class463.method2838(var9, (byte) 120);
                } else if (arg2 == 6) {
                    class708.field9891++;
                    class583 var10 = class54.method400(class213.field2800, (byte) -57, class23.field278);
                    var10.field7963.method467(2714, var4[var6]);
                    var10.field7963.method444(0, arg1 + 133);
                    class463.method2838(var10, (byte) 127);
                } else if (arg2 == 7) {
                    class49.field737++;
                    class583 var11 = class54.method400(class213.field2800, (byte) -125, class318.field4424);
                    var11.field7963.method507(0, 125);
                    var11.field7963.method492(-2, var4[var6]);
                    class463.method2838(var11, (byte) 118);
                }
                break;
            }
        }
        if (!var5) {
            class75.method566(4, true, class155.field2140.method978(class120.field1576, (byte) -110) + arg0);
        }
    }

    @OriginalMember(owner = "client!gp", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7715++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class553(String arg0, int arg1) {
        this.field7713 = arg1;
        this.field7714 = arg0;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)V")
    public static void method3272(byte arg0) {
        field7717 = null;
        if (arg0 != 79) {
            method3271(null, 11, 57);
        }
        field7712 = null;
    }
}
