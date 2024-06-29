import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class36 {

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field527 = -1;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)V")
    public static final void method227(int arg0, int arg1, int arg2) {
        class175 var3 = class182.method1317(arg1, arg0, false);
        var3.method1279((byte) -80);
        var3.field2855 = arg2;
        field528++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lwd;I)V")
    public static final void method228(class162 arg0, int arg1) {
        int var2 = arg0.method1114((byte) -13);
        class17.field208 = new class5[var2];
        field529++;
        for (int var3 = 0; var3 < var2; var3++) {
            class17.field208[var3] = new class5();
            class17.field208[var3].field55 = arg0.method1114((byte) -13);
            class17.field208[var3].field54 = arg0.method1140(-14747);
        }
        class180.field2942 = arg0.method1114((byte) -13);
        class77.field1287 = arg0.method1114((byte) -13);
        class181.field2958 = arg0.method1114((byte) -13);
        class160.field2542 = new class203[class77.field1287 + 1 - class180.field2942];
        int var4 = -100 % ((-arg1 - 30) / 37);
        for (int var5 = 0; var5 < class181.field2958; var5++) {
            int var6 = arg0.method1114((byte) -13);
            class203 var7 = class160.field2542[var6] = new class203();
            var7.field4155 = arg0.method1133((byte) 53);
            var7.field4161 = arg0.method1157(65280);
            var7.field3238 = var6 + class180.field2942;
            var7.field3236 = arg0.method1140(-14747);
            var7.field3232 = arg0.method1140(-14747);
        }
        class30.field366 = arg0.method1157(65280);
        class111.field1754 = true;
    }
}
