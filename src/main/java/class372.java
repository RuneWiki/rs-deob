import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class372 extends class55 {

    @OriginalMember(owner = "client!bfa", name = "m", descriptor = "I")
    public volatile int field5191 = -1;

    @OriginalMember(owner = "client!bfa", name = "o", descriptor = "Ljava/lang/String;")
    public volatile String field5193;

    @OriginalMember(owner = "client!bfa", name = "k", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!bfa", name = "l", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!bfa", name = "n", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIZ)V", line = 9)
    public static final void method2190(int arg0, int arg1, boolean arg2) {
        field5189++;
        int var3 = class616.field8643.method2216(class755.field10504.method4201(class723.field10095, (byte) 25), 99);
        int var5;
        if (class148.field1903) {
            for (class756 var4 = (class756) class526.field7066.method2348(-1); var4 != null; var4 = (class756) class526.field7066.method2343(0)) {
                int var6;
                if (var4.field10556 == 1) {
                    var6 = class202.method1117((byte) 81, (class227) var4.field10553.field5735.field5555);
                } else {
                    var6 = class376.method2208(var4, 21);
                }
                if (var6 > var3) {
                    var3 = var6;
                }
            }
            var3 += 8;
            var5 = class331.field4464 * 16 + 21;
            class116.field1526 = class331.field4464 * 16 + (class527.field7072 ? 26 : 22);
        } else {
            for (class227 var7 = (class227) class139.field1783.method724(32); var7 != null; var7 = (class227) class139.field1783.method723(119)) {
                int var10 = class202.method1117((byte) 75, var7);
                if (var3 < var10) {
                    var3 = var10;
                }
            }
            var3 += 8;
            class116.field1526 = class43.field470 * 16 + (class527.field7072 ? 26 : 22);
            var5 = class43.field470 * 16 + 21;
        }
        int var8 = arg1 - (var3 / 2);
        if (class546.field7710 < (var8 + var3)) {
            var8 = class546.field7710 - var3;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        if (var5 + arg0 > class512.field6932) {
            var9 = class512.field6932 - var5;
        }
        class729.field10174 = var8;
        if (var9 < 0) {
            var9 = 0;
        }
        class475.field6566 = var9;
        class83.field1156 = arg2;
        class33.field341 = var3;
    }

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 92)
    public class372(String arg0) {
        this.field5193 = arg0;
    }
}
