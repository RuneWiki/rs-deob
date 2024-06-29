import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class48 extends class39 {

    @OriginalMember(owner = "client!r", name = "L", descriptor = "Ljava/lang/Object;")
    private Object field784;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "Z")
    public static boolean field778 = false;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "Z")
    public static volatile boolean field780 = false;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "[I")
    public static int[] field783 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "I")
    public static int field789 = 0;

    @OriginalMember(owner = "client!r", name = "S", descriptor = "[I")
    public static int[] field791 = new int[25];

    @OriginalMember(owner = "client!r", name = "F", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!r", name = "N", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!r", name = "P", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!r", name = "O", descriptor = "Ll;")
    public static class133 field787;

    @OriginalMember(owner = "client!r", name = "M", descriptor = "Lkf;")
    public static class164 field785;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "Lsn;")
    public static class319 field782;

    @OriginalMember(owner = "client!r", name = "R", descriptor = "Lsn;")
    public static class319 field790;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "(I)V", line = 5)
    public static void method415(int arg0) {
        field790 = null;
        if (arg0 != 0) {
            return;
        }
        field782 = null;
        field785 = null;
        field787 = null;
        field783 = null;
        field791 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III)Lvj;", line = 20)
    public static final class103 method416(int arg0, int arg1, int arg2) {
        class142 var3 = class256.field4013[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2213;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)Ljava/lang/Object;", line = 54)
    public final Object method325(byte arg0) {
        field788++;
        if (arg0 <= 70) {
            method416(91, 1, -118);
        }
        return this.field784;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)Z", line = 66)
    public final boolean method326(byte arg0) {
        if (arg0 > -25) {
            return false;
        } else {
            field779++;
            return false;
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 78)
    public class48(Object arg0) {
        this.field784 = arg0;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(B)[Lwj;", line = 87)
    public static final class270[] method417(byte arg0) {
        field786++;
        class270[] var1 = new class270[class290.field4519];
        if (arg0 != 40) {
            field787 = (class133) null;
        }
        for (int var2 = 0; var2 < class290.field4519; var2++) {
            int var3 = class75.field1215[var2] * class73.field1201[var2];
            byte[] var4 = class306.field4757[var2];
            if (class270.field4200[var2]) {
                byte[] var7 = class292.field4537[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class222.method1577(class270.method1860(var7[var9] << 24, -16777216), class63.field1002[class270.method1860(255, var4[var9])]);
                }
                if (class94.field1516) {
                    var1[var2] = new class74(class65.field1019, class228.field3627, class97.field1546[var2], class320.field5001[var2], class75.field1215[var2], class73.field1201[var2], var8);
                } else {
                    var1[var2] = new class262(class65.field1019, class228.field3627, class97.field1546[var2], class320.field5001[var2], class75.field1215[var2], class73.field1201[var2], var8);
                }
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class63.field1002[class270.method1860(var4[var6], 255)];
                }
                if (class94.field1516) {
                    var1[var2] = new class86(class65.field1019, class228.field3627, class97.field1546[var2], class320.field5001[var2], class75.field1215[var2], class73.field1201[var2], var5);
                } else {
                    var1[var2] = new class249(class65.field1019, class228.field3627, class97.field1546[var2], class320.field5001[var2], class75.field1215[var2], class73.field1201[var2], var5);
                }
            }
        }
        class7.method56((byte) 59);
        return var1;
    }
}
