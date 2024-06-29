import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class132 extends class418 {

    @OriginalMember(owner = "client!op", name = "u", descriptor = "Ljava/lang/String;")
    public String field1734;

    @OriginalMember(owner = "client!op", name = "o", descriptor = "I")
    public static int field1728 = 0;

    @OriginalMember(owner = "client!op", name = "m", descriptor = "[I")
    public static int[] field1726 = new int[4096];

    @OriginalMember(owner = "client!op", name = "k", descriptor = "I")
    public static int field1724 = 0;

    @OriginalMember(owner = "client!op", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field1732 = new String[100];

    @OriginalMember(owner = "client!op", name = "p", descriptor = "I")
    public static int field1729 = 0;

    @OriginalMember(owner = "client!op", name = "v", descriptor = "I")
    public static int field1735 = -50;

    @OriginalMember(owner = "client!op", name = "l", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!op", name = "n", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!op", name = "q", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!op", name = "r", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!op", name = "t", descriptor = "Lir;")
    public static class185 field1733;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V")
    public static final void method944(byte arg0) {
        class186.field2538++;
        class140.field1797.method1833(arg0 - 20481, 237);
        field1730++;
        class140.field1797.method2204(class340.method2203((byte) 51), 8);
        class140.field1797.method2250(false, class357.field5298);
        class140.field1797.method2250(false, class435.field6313);
        class140.field1797.method2204(class104.field1359, arg0 - 94);
        if (arg0 != 102) {
            method947((byte) -44);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZLde;)[Lje;")
    public static final class131[] method945(boolean arg0, class364 arg1) {
        field1727++;
        if (!arg1.method2390(-72)) {
            return new class131[0];
        }
        class225 var2 = arg1.method2410((byte) -104);
        while (var2.field3104 == 0) {
            class31.method245(10L, -102);
        }
        if (var2.field3104 == 2) {
            return new class131[0];
        }
        int[] var3 = (int[]) var2.field3105;
        class131[] var4 = new class131[var3.length >> 2];
        if (arg0) {
            method945(false, (class364) null);
        }
        for (int var5 = 0; var5 < var4.length; var5++) {
            class131 var6 = new class131();
            var4[var5] = var6;
            var6.field1720 = var3[var5 << 2];
            var6.field1715 = var3[(var5 << 2) + 1];
            var6.field1716 = var3[(var5 << 2) + 2];
            var6.field1719 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(Z)V")
    public static final void method946(boolean arg0) {
        class47.field712 = -1;
        class94.field1279 = -1;
        class142.field1805 = -1;
        if (!arg0) {
            field1732 = null;
        }
        field1731++;
        class163.field2223 = 0;
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "()V")
    public class132() {
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(B)V")
    public static void method947(byte arg0) {
        int var1 = -21 % ((arg0 - 45) / 52);
        field1732 = null;
        field1733 = null;
        field1726 = null;
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class132(String arg0, int arg1) {
        this.field1734 = arg0;
    }
}
