import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class210 extends class34 {

    @OriginalMember(owner = "client!fn", name = "F", descriptor = "I")
    private int field3000 = 4096;

    @OriginalMember(owner = "client!fn", name = "H", descriptor = "Z")
    private boolean field3002 = true;

    @OriginalMember(owner = "client!fn", name = "G", descriptor = "I")
    public static int field3001 = 0;

    @OriginalMember(owner = "client!fn", name = "I", descriptor = "Ljava/lang/Boolean;")
    public static Boolean field3003;

    @OriginalMember(owner = "client!fn", name = "C", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!fn", name = "D", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!fn", name = "E", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!fn", name = "J", descriptor = "[Z")
    public static boolean[] field3004;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lsv;II)V")
    public final void method69(class319 arg0, int arg1, int arg2) {
        if (arg1 >= 16) {
            if (~arg2 != -1) {
                if (arg2 == 1) {
                    this.field3002 = arg0.method1869(-101) == 1;
                }
            } else {
                this.field3000 = arg0.method1844(-114);
            }
            ++field2999;
        }
    }

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "(I)V")
    public static final void method1336(int arg0) {
        ++field2997;
        if (arg0 != 9734) {
            method1336(-105);
        }
        for (class322 var1 = (class322) class413.field5880.method3137(0); var1 != null; var1 = (class322) class413.field5880.method3132(0)) {
            class110 var2 = var1.field4419;
            if (var2.field1791) {
                var1.method2791((byte) 112);
                var2.method839((byte) -98);
            } else if (class28.field417 >= var2.field1789) {
                var2.method837(class71.field1026, (byte) -128);
                if (!var2.field1791) {
                    class112.method848(var2, true);
                } else {
                    var1.method2791((byte) 112);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BI)[[I")
    public final int[][] method66(byte arg0, int arg1) {
        ++field2998;
        int[][] var3 = super.field536.method337(arg1, (byte) 75);
        if (arg0 != -11) {
            this.field3002 = false;
        }
        if (super.field536.field726) {
            int[] var4 = this.method252(false, class343.field4968 & arg1 - 1, 0);
            int[] var5 = this.method252(false, arg1, 0);
            int[] var6 = this.method252(false, arg1 - -1 & class343.field4968, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; class383.field5502 > var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field3000;
                int var12 = (var5[class120.field1872 & var10 + 1] + -var5[class120.field1872 & var10 - 1]) * this.field3000;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 + 4096 + var15) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = var11 / var17;
                    var20 = 16777216 / var17;
                    var19 = var12 / var17;
                }
                if (this.field3002) {
                    var20 = (var20 >> 1) + 2048;
                    var18 = 2048 - -(var18 >> 1);
                    var19 = 2048 - -(var19 >> 1);
                }
                var7[var10] = var19;
                var8[var10] = var18;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V")
    public class210() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "(B)V")
    public static void method1337(byte arg0) {
        field3004 = null;
        if (arg0 != -114) {
            field3004 = null;
        }
        field3003 = null;
    }

    static {
        new class157("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        field3003 = Boolean.FALSE;
    }
}
