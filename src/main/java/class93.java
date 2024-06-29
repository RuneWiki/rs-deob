import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class93 extends class403 {

    @OriginalMember(owner = "client!d", name = "D", descriptor = "Lnm;")
    public class304 field1359;

    @OriginalMember(owner = "client!d", name = "K", descriptor = "Lbp;")
    public class239 field1365;

    @OriginalMember(owner = "client!d", name = "F", descriptor = "[I")
    public static int[] field1361 = new int[50];

    @OriginalMember(owner = "client!d", name = "J", descriptor = "[I")
    public static int[] field1364 = new int[2048];

    @OriginalMember(owner = "client!d", name = "N", descriptor = "I")
    public static int field1368 = -1;

    @OriginalMember(owner = "client!d", name = "B", descriptor = "I")
    public int field1357;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "I")
    public int field1358;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "I")
    public int field1360;

    @OriginalMember(owner = "client!d", name = "G", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!d", name = "M", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "I")
    public int field1369;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "I")
    public int field1370;

    @OriginalMember(owner = "client!d", name = "L", descriptor = "Lur;")
    public static class345 field1366;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "Lvi;")
    public static class347 field1363;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
    public final void method590(int arg0) {
        this.field1369 = this.field1359.field4035;
        this.field1358 = this.field1359.field4042;
        this.field1370 = this.field1359.field4045;
        field1367++;
        if (this.field1359.field4040 != null) {
            this.field1359.field4040.method1022(this.field1365.field3192, this.field1365.field3180, this.field1365.field3172, class214.field2885);
        }
        this.field1357 = class214.field2885[0];
        this.field1360 = class214.field2885[2];
        if (arg0 != -15189) {
            this.field1359 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
    public static void method591(int arg0) {
        field1364 = null;
        field1363 = null;
        field1366 = null;
        field1361 = null;
        if (arg0 != -26229) {
            method591(126);
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lnm;Loh;)V")
    public class93(class304 arg0, class256 arg1) {
        this.field1359 = arg0;
        this.field1365 = class56.method408(arg0.field4036, 1);
        this.method590(-15189);
    }
}
