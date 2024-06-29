import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class69 implements Runnable {

    @OriginalMember(owner = "client!d", name = "b", descriptor = "Z")
    public boolean field1063 = true;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Ljava/lang/Object;")
    public Object field1068 = new Object();

    @OriginalMember(owner = "client!d", name = "i", descriptor = "[I")
    public int[] field1070 = new int[500];

    @OriginalMember(owner = "client!d", name = "j", descriptor = "[I")
    public int[] field1071 = new int[500];

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    public int field1072 = 0;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "Ljo;")
    public static class150 field1067 = new class150();

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public static int field1074 = 0;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "Lui;")
    public static class98 field1069 = new class98(20);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "Lnm;")
    public static class221 field1073;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IC)Z", line = 7)
    public static final boolean method481(int arg0, char arg1) {
        if (arg0 == 65) {
            field1065++;
            return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)V", line = 20)
    public static final void method482(int arg0, int arg1, int arg2) {
        class311 var3 = class217.method1468(114, arg1);
        field1066++;
        int var4 = var3.field5064;
        if (arg0 != 30757) {
            method481(59, '^');
        }
        int var5 = var3.field5059;
        int var6 = var3.field5065;
        int var7 = class116.field1690[var6 - var4];
        if (arg2 < 0 || arg2 > var7) {
            arg2 = 0;
        }
        int var8 = var7 << var4;
        class304.method2131((byte) 108, ~var8 & class353.field5617[var5] | arg2 << var4 & var8, var5);
    }

    @OriginalMember(owner = "client!d", name = "run", descriptor = "()V", line = 46)
    public final void run() {
        while (this.field1063) {
            Object var1 = this.field1068;
            synchronized (this.field1068) {
                if (this.field1072 < 500) {
                    this.field1071[this.field1072] = class305.field4988;
                    this.field1070[this.field1072] = class130.field1982;
                    this.field1072++;
                }
            }
            class177.method1246(50L, -32644);
        }
        field1064++;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lnm;B)V", line = 75)
    public static final void method483(class221 arg0, byte arg1) {
        class262.field4132 = arg0;
        if (arg1 < 82) {
            field1073 = (class221) null;
        }
        field1062++;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V", line = 109)
    public static void method484(int arg0) {
        field1073 = null;
        if (arg0 != 2890) {
            method483((class221) null, (byte) -48);
        }
        field1067 = null;
        field1069 = null;
    }
}
