import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class94 {

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "Ljt;")
    private class106 field1343 = new class106(128);

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "Lvd;")
    private class39 field1346;

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!dba", name = "f", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "Z")
    public static boolean field1347;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(BILns;)V", line = 7)
    public static final void method742(byte arg0, int arg1, class405 arg2) {
        if (arg0 <= 73) {
            return;
        }
        if (arg2.field6039 != null) {
            int var3 = arg2.field6039[arg1 + 1];
            if (arg2.field6094 != var3) {
                arg2.field6094 = var3;
                arg2.field6091 = 1;
                arg2.field6040 = 0;
                arg2.field6117 = 0;
                arg2.field6134 = arg2.field6130;
                arg2.field6038 = 0;
                if (arg2.field6094 != -1) {
                    class294.method1865(arg2.field6040, arg2, class742.field10404.method2663(0, arg2.field6094), -15);
                }
            }
        }
        field1344++;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IZ)Lra;", line = 42)
    public final class110 method743(int arg0, boolean arg1) {
        field1348++;
        class106 var3 = this.field1343;
        class110 var4;
        synchronized (this.field1343) {
            var4 = (class110) this.field1343.method803(124, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1346.method211(arg1, class373.method2304(arg0, 99), class595.method3470(37, arg0));
        class110 var6 = new class110();
        if (var5 != null) {
            var6.method828(new class645(var5), -1);
        }
        class106 var7 = this.field1343;
        synchronized (this.field1343) {
            this.field1343.method801(1, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(ZI)V", line = 67)
    public static final void method744(boolean arg0, int arg1) {
        if (arg1 == 37) {
            class84.field1179 = 3.0F;
        } else if (arg1 == 50) {
            class84.field1179 = 4.0F;
        } else if (arg1 == 75) {
            class84.field1179 = 6.0F;
        } else if (arg1 == 100) {
            class84.field1179 = 8.0F;
        } else if (arg1 == 200) {
            class84.field1179 = 16.0F;
        }
        field1345++;
        class190.field2880 = -1;
        if (arg0) {
            class190.field2880 = -1;
        }
    }

    @OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(Lqg;ILvd;)V", line = 107)
    public class94(class464 arg0, int arg1, class39 arg2) {
        this.field1346 = arg2;
        if (this.field1346 != null) {
            int var4 = this.field1346.method222((byte) 125) - 1;
            this.field1346.method229(var4, 0);
        }
    }
}
