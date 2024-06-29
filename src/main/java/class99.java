import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class99 {

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    private int field1333;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "[Lqm;")
    private class259[] field1332;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1341 = "Cancel";

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "J")
    public static long field1345 = 0L;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "C")
    public static char field1339;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "J")
    private long field1340;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "Lwc;")
    public static class119 field1343;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "Lqm;")
    private class259 field1342;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "Lno;")
    public static class5 field1338;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "Ljava/awt/Font;")
    public static Font field1336;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 15)
    public static final void method627(int arg0) {
        field1331++;
        class259.field4093 = null;
        if (arg0 != 3735) {
            field1336 = (Font) null;
        }
        class245.field3855 = null;
        class251.field3978 = null;
        class110.field1518 = null;
        class14.field145 = (byte[][]) null;
        class33.field392 = null;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)Lqm;", line = 39)
    public final class259 method628(int arg0) {
        field1335++;
        if (this.field1342 == null) {
            return null;
        }
        class259 var2 = this.field1332[(int) (this.field1340 & (long) (this.field1333 + arg0))];
        while (this.field1342 != var2) {
            if (this.field1342.field4086 == this.field1340) {
                class259 var3 = this.field1342;
                this.field1342 = this.field1342.field4098;
                return var3;
            }
            this.field1342 = this.field1342.field4098;
        }
        this.field1342 = null;
        return null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILnk;)V", line = 79)
    public static final void method629(int arg0, class16 arg1) {
        class58.field683 = arg1;
        if (arg0 != -14) {
            field1341 = (String) null;
        }
        field1337++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BJ)Lqm;", line = 90)
    public final class259 method630(byte arg0, long arg1) {
        if (arg0 >= -46) {
            return (class259) null;
        }
        field1334++;
        this.field1340 = arg1;
        class259 var4 = this.field1332[(int) ((long) (this.field1333 - 1) & arg1)];
        for (this.field1342 = var4.field4098; this.field1342 != var4; this.field1342 = this.field1342.field4098) {
            if (this.field1342.field4086 == arg1) {
                class259 var5 = this.field1342;
                this.field1342 = this.field1342.field4098;
                return var5;
            }
        }
        this.field1342 = null;
        return null;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(I)V", line = 119)
    public class99(int arg0) {
        this.field1333 = arg0;
        this.field1332 = new class259[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class259 var3 = this.field1332[var2] = new class259();
            var3.field4089 = var3;
            var3.field4098 = var3;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V", line = 144)
    public static void method631(byte arg0) {
        field1341 = null;
        field1343 = null;
        if (arg0 != 65) {
            field1341 = (String) null;
        }
        field1338 = null;
        field1336 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BJLqm;)V", line = 158)
    public final void method632(byte arg0, long arg1, class259 arg2) {
        field1330++;
        if (arg2.field4089 != null) {
            arg2.method1829((byte) -74);
        }
        class259 var5 = this.field1332[(int) (arg1 & (long) (this.field1333 - 1))];
        int var6 = 84 / ((-arg0 - 33) / 40);
        arg2.field4089 = var5.field4089;
        arg2.field4086 = arg1;
        arg2.field4098 = var5;
        arg2.field4089.field4098 = arg2;
        arg2.field4098.field4089 = arg2;
    }
}
