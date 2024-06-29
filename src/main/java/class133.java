import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class133 extends class261 {

    @OriginalMember(owner = "client!eea", name = "D", descriptor = "Ljava/lang/Object;")
    private Object field1783;

    @OriginalMember(owner = "client!eea", name = "I", descriptor = "Lqe;")
    public static class469 field1788 = new class469(116, 0);

    @OriginalMember(owner = "client!eea", name = "J", descriptor = "I")
    public static int field1789 = 0;

    @OriginalMember(owner = "client!eea", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field1790 = new String[200];

    @OriginalMember(owner = "client!eea", name = "E", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!eea", name = "F", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!eea", name = "G", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!eea", name = "H", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method936(int arg0) {
        field1784++;
        if (arg0 != 500) {
            method939(null, 93, -37);
        }
        return false;
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 18)
    public class133(Object arg0, int arg1) {
        super(arg1);
        this.field1783 = arg0;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILjn;)Z", line = 28)
    public static final boolean method937(int arg0, class721 arg1) {
        field1786++;
        class211 var2 = class239.field3470.method388(arg1.method317(117), 100);
        if (~var2.field3132 == arg0) {
            return true;
        } else {
            class643 var3 = class581.field8249.method4122(var2.field3132, (byte) 27);
            return var3.field9017 == -1 ? true : var3.method3684(-1);
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Z)Ljava/lang/Object;", line = 48)
    public final Object method938(boolean arg0) {
        if (arg0) {
            field1788 = null;
        }
        field1785++;
        return this.field1783;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lvt;II)Z", line = 59)
    public static final boolean method939(class304 arg0, int arg1, int arg2) {
        field1787++;
        int var3 = arg0.method1914(11356, 2);
        if (var3 == 0) {
            if (arg0.method1914(11356, 1) != 0) {
                method939(arg0, arg1, 13706);
            }
            int var4 = arg0.method1914(11356, 6);
            int var5 = arg0.method1914(11356, 6);
            boolean var6 = arg0.method1914(arg2 - 2350, 1) == 1;
            if (var6) {
                class570.field8068[class153.field2421++] = arg1;
            }
            if (class314.field4456[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class448 var7 = class581.field8256[arg1];
            class689 var8 = class314.field4456[arg1] = new class689();
            var8.field6118 = arg1;
            if (class470.field6859[arg1] != null) {
                var8.method3919(108, class470.field6859[arg1]);
            }
            var8.method2585(true, var7.field6628, (byte) 17);
            var8.field6125 = var7.field6626;
            int var9 = var7.field6627;
            int var10 = var9 >> 28;
            int var11 = (var9 & 0x3FE138) >> 14;
            int var12 = var9 & 0xFF;
            int var13 = (var11 << 6) + var4 - class361.field5224;
            var8.field9497 = var7.field6622;
            int var14 = (var12 << 6) + var5 - class582.field8288;
            var8.field6131[0] = class661.field9247[arg1];
            var8.field8429 = var8.field8417 = (byte) var10;
            if (class286.method1827(var13, var14, (byte) 102)) {
                var8.field8417++;
            }
            var8.method3915(var14, var13, (byte) -28);
            var8.field9528 = false;
            class581.field8256[arg1] = null;
            return true;
        } else if (var3 == 1) {
            int var15 = arg0.method1914(11356, 2);
            int var16 = class581.field8256[arg1].field6627;
            class581.field8256[arg1].field6627 = (((var16 >> 28) + var15 & 0x3) << 28) + (var16 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var17 = arg0.method1914(arg2 ^ 0x19D6, 5);
            int var18 = var17 >> 3;
            int var19 = var17 & 0x7;
            int var20 = class581.field8256[arg1].field6627;
            int var21 = (var20 >> 28) + var18 & 0x3;
            int var22 = (var20 & 0x3FE5C5) >> 14;
            int var23 = var20 & 0xFF;
            if (var19 == 0) {
                var23--;
                var22--;
            }
            if (var19 == 1) {
                var23--;
            }
            if (var19 == 2) {
                var22++;
                var23--;
            }
            if (var19 == 3) {
                var22--;
            }
            if (var19 == 4) {
                var22++;
            }
            if (var19 == 5) {
                var23++;
                var22--;
            }
            if (var19 == 6) {
                var23++;
            }
            if (var19 == 7) {
                var22++;
                var23++;
            }
            class581.field8256[arg1].field6627 = (var21 << 28) + (var22 << 14) + var23;
            return false;
        } else {
            int var24 = arg0.method1914(arg2 ^ 0x19D6, 18);
            int var25 = var24 >> 16;
            int var26 = var24 >> 8 & 0xFF;
            int var27 = var24 & 0xFF;
            int var28 = class581.field8256[arg1].field6627;
            if (arg2 != 13706) {
                method937(111, null);
            }
            int var29 = (var28 >> 28) + var25 & 0x3;
            int var30 = (var28 >> 14) + var26 & 0xFF;
            int var31 = var28 + var27 & 0xFF;
            class581.field8256[arg1].field6627 = (var29 << 28) + (var30 << 14) + var31;
            return false;
        }
    }

    @OriginalMember(owner = "client!eea", name = "f", descriptor = "(I)V", line = 224)
    public static void method940(int arg0) {
        field1788 = null;
        if (arg0 >= -99) {
            field1788 = null;
        }
        field1790 = null;
    }
}
