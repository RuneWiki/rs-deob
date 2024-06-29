import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class56 {

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "B")
    private byte field990;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public int field989;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public int field997;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
    public int field1003;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public int field1001;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public int field988;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "Ljf;")
    public static class229 field987 = class212.method1457((byte) 78, "Connexion au serveur de mise -9 jour en cours");

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field991 = 0;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "[I")
    public static int[] field995 = new int[1000];

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "Ljf;")
    public static class229 field993 = class212.method1457((byte) 102, " ");

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "Lek;")
    public static class185 field1002;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "[I")
    public static int[] field992;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)I", line = 5)
    public final int method442(byte arg0) {
        field996++;
        return arg0 == 98 ? this.field990 & 0x7 : 58;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 27)
    public static void method443(int arg0) {
        field1002 = null;
        field993 = null;
        field992 = null;
        if (arg0 > -13) {
            field991 = -6;
        }
        field995 = null;
        field987 = null;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)Lrm;", line = 45)
    public static final class248 method444(byte arg0) {
        field1000++;
        if (arg0 < 106) {
            method444((byte) -119);
        }
        class248 var1 = new class248(class97.field1722, class307.field5192, class272.field4659[0], class256.field4473[0], class232.field4025[0], class6.field71[0], class21.field357[0], class64.field1115);
        class62.method466((byte) 73);
        return var1;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)I", line = 65)
    public final int method445(int arg0) {
        field999++;
        if (arg0 != 1) {
            this.field1003 = -20;
        }
        return (this.field990 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)Ldl;", line = 78)
    public static final class39 method446(int arg0, int arg1) {
        class39 var2 = (class39) class277.field4765.method643((long) arg1, 1649232044);
        if (arg0 != -2) {
            return (class39) null;
        }
        field994++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class242.field4272.method1275(arg1 & 0x7FFF, 0, -5211);
        } else {
            var3 = class34.field650.method1275(arg1, 0, -5211);
        }
        class39 var4 = new class39();
        if (var3 != null) {
            var4.method342(true, new class14(var3));
        }
        if (arg1 >= 32768) {
            var4.method341(-6490);
        }
        class277.field4765.method640(var4, (long) arg1, 24179);
        return var4;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V", line = 129)
    public class56() {
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lkh;)V", line = 131)
    public class56(class14 arg0) {
        this.field990 = arg0.method98(true);
        this.field989 = arg0.method116(-1);
        this.field997 = arg0.method128((byte) 4);
        this.field1003 = arg0.method128((byte) 4);
        this.field1001 = arg0.method128((byte) 4);
        this.field988 = arg0.method128((byte) 4);
    }
}
