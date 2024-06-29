import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class675 extends class98 {

    @OriginalMember(owner = "client!pea", name = "H", descriptor = "I")
    private int field9514;

    @OriginalMember(owner = "client!pea", name = "F", descriptor = "Lhga;")
    public static class158 field9512 = new class158(61, -1);

    @OriginalMember(owner = "client!pea", name = "N", descriptor = "Lor;")
    public static class594 field9520 = new class594();

    @OriginalMember(owner = "client!pea", name = "I", descriptor = "I")
    public static int field9515;

    @OriginalMember(owner = "client!pea", name = "J", descriptor = "I")
    public static int field9516;

    @OriginalMember(owner = "client!pea", name = "K", descriptor = "I")
    public static int field9517;

    @OriginalMember(owner = "client!pea", name = "L", descriptor = "I")
    public static int field9518;

    @OriginalMember(owner = "client!pea", name = "M", descriptor = "I")
    public static int field9519;

    @OriginalMember(owner = "client!pea", name = "O", descriptor = "I")
    public static int field9521;

    @OriginalMember(owner = "client!pea", name = "E", descriptor = "[Lsda;")
    public class237[] field9511;

    @OriginalMember(owner = "client!pea", name = "G", descriptor = "[[B")
    private byte[][] field9513;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(II)Z", line = 5)
    public final boolean method3861(int arg0, int arg1) {
        field9517++;
        return arg0 == -3425 ? this.field9511[arg1].field3766 : true;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Z)V", line = 16)
    public static void method3862(boolean arg0) {
        if (arg0) {
            field9512 = null;
        }
        field9520 = null;
        field9512 = null;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IB)Z", line = 27)
    public final boolean method3863(int arg0, byte arg1) {
        int var3 = -127 / ((arg1 + 13) / 53);
        field9518++;
        return this.field9511[arg0].field3764;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(I)Z", line = 37)
    public final boolean method3864(int arg0) {
        field9519++;
        if (this.field9511 != null) {
            return true;
        }
        if (this.field9513 == null) {
            class97 var2 = class122.field2040;
            synchronized (class122.field2040) {
                if (!class122.field2040.method944((byte) 110, this.field9514)) {
                    return false;
                }
                int[] var4 = class122.field2040.method919((byte) 54, this.field9514);
                this.field9513 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field9513[var5] = class122.field2040.method926(this.field9514, -127, var4[var5]);
                }
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < this.field9513.length; var7++) {
            byte[] var8 = this.field9513[var7];
            class6 var9 = new class6(var8);
            var9.field57 = 1;
            int var10 = var9.method67(12021);
            class97 var11 = class56.field729;
            synchronized (class56.field729) {
                var6 &= class56.field729.method942(0, var10);
            }
        }
        if (!var6) {
            return false;
        }
        if (arg0 != -1) {
            field9520 = null;
        }
        class594 var12 = new class594();
        class97 var13 = class122.field2040;
        int[] var15;
        synchronized (class122.field2040) {
            int var14 = class122.field2040.method949(this.field9514, 0);
            this.field9511 = new class237[var14];
            var15 = class122.field2040.method919((byte) 54, this.field9514);
        }
        for (int var16 = 0; var16 < var15.length; var16++) {
            byte[] var17 = this.field9513[var16];
            class6 var18 = new class6(var17);
            var18.field57 = 1;
            int var19 = var18.method67(arg0 + 12022);
            class652 var20 = null;
            for (class652 var21 = (class652) var12.method3465((byte) 101); var21 != null; var21 = (class652) var12.method3469(0)) {
                if (var21.field9127 == var19) {
                    var20 = var21;
                    break;
                }
            }
            if (var20 == null) {
                class97 var22 = class56.field729;
                synchronized (class56.field729) {
                    var20 = new class652(var19, class56.field729.method952(74, var19));
                }
                var12.method3463((byte) -87, var20);
            }
            this.field9511[var15[var16]] = new class237(var17, var20);
        }
        this.field9513 = null;
        return true;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(BI)Z", line = 145)
    public final boolean method3865(byte arg0, int arg1) {
        field9516++;
        if (arg0 != 59) {
            this.field9513 = null;
        }
        return this.field9511[arg1].field3755;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(BZLjava/lang/String;)V", line = 159)
    public static final void method3866(byte arg0, boolean arg1, String arg2) {
        class15.method201(arg2, 74, -1, arg1, -1);
        int var3 = 63 % ((arg0 - 40) / 41);
        field9515++;
    }

    @OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(I)V", line = 176)
    public class675(int arg0) {
        this.field9514 = arg0;
    }
}
