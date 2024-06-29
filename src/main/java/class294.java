import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public abstract class class294 {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4616 = null;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4622 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field4624 = -1;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public int field4618;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public int field4621;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "Ljava/awt/Image;")
    public Image field4627;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "[I")
    public int[] field4617;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "[Lab;")
    public static class157[] field4626;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 15)
    public static void method2051(int arg0) {
        field4616 = null;
        field4622 = null;
        field4626 = null;
        if (arg0 != 0) {
            method2052(24L, 42);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(JI)V", line = 40)
    public static final void method2052(long arg0, int arg1) {
        field4623++;
        if (arg0 == 0L || arg1 != -24742) {
            return;
        }
        for (int var3 = 0; var3 < class271.field4291; var3++) {
            if (class157.field2424[var3] == arg0) {
                class187.field3032++;
                class271.field4291--;
                for (int var4 = var3; var4 < class271.field4291; var4++) {
                    class157.field2424[var4] = class157.field2424[var4 + 1];
                    class100.field1525[var4] = class100.field1525[var4 + 1];
                    class45.field620[var4] = class45.field620[var4 + 1];
                }
                class93.field1444 = class297.field4655;
                class21.field313.method1541(-84, 109);
                class21.field313.method1375(arg0, -93);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIILh;JLh;Lh;)V", line = 83)
    public static final void method2053(int arg0, int arg1, int arg2, int arg3, class232 arg4, long arg5, class232 arg6, class232 arg7) {
        class59 var9 = new class59();
        var9.field778 = arg4;
        var9.field780 = arg1 * 128 + 64;
        var9.field781 = arg2 * 128 + 64;
        var9.field774 = arg3;
        var9.field777 = arg5;
        var9.field779 = arg6;
        var9.field773 = arg7;
        int var10 = 0;
        class230 var11 = class251.field3996[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field3680; var12++) {
                class271 var13 = var11.field3687[var12];
                if ((var13.field4294 & 0x400000L) == 4194304L) {
                    int var14 = var13.field4286.method152();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field772 = -var10;
        if (class251.field3996[arg0][arg1][arg2] == null) {
            class251.field3996[arg0][arg1][arg2] = new class230(arg0, arg1, arg2);
        }
        class251.field3996[arg0][arg1][arg2].field3689 = var9;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V", line = 124)
    protected class294() {
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V", line = 128)
    public final void method2054(int arg0) {
        class216.method1572(this.field4617, this.field4621, this.field4618);
        if (arg0 != -25) {
            field4616 = (String) null;
        }
        field4625++;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)[Lco;", line = 143)
    public static final class103[] method2055(int arg0) {
        if (arg0 != 0) {
            field4616 = (String) null;
        }
        field4620++;
        if (class334.field5189 == null) {
            class103[] var1 = class89.method645(class264.field4183, (byte) -116);
            class103[] var2 = new class103[var1.length];
            int var3 = 0;
            label56: for (int var4 = 0; var4 < var1.length; var4++) {
                class103 var5 = var1[var4];
                if ((var5.field1582 <= 0 || var5.field1582 >= 24) && var5.field1583 >= 800 && var5.field1571 >= 600) {
                    for (int var6 = 0; var6 < var3; var6++) {
                        class103 var7 = var2[var6];
                        if (var5.field1583 == var7.field1583 && var5.field1571 == var7.field1571) {
                            if (var5.field1582 > var7.field1582) {
                                var2[var6] = var5;
                            }
                            continue label56;
                        }
                    }
                    var2[var3] = var5;
                    var3++;
                }
            }
            class334.field5189 = new class103[var3];
            class213.method1559(var2, 0, class334.field5189, 0, var3);
            int[] var8 = new int[class334.field5189.length];
            for (int var9 = 0; var9 < class334.field5189.length; var9++) {
                class103 var10 = class334.field5189[var9];
                var8[var9] = var10.field1583 * var10.field1571;
            }
            class309.method2161(arg0 ^ 0x0, var8, class334.field5189);
        }
        return class334.field5189;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V")
    public abstract void method221(int arg0, int arg1, int arg2, Graphics arg3, int arg4, byte arg5);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLjava/awt/Component;II)V")
    public abstract void method220(byte arg0, Component arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public abstract void method222(Graphics arg0, int arg1, int arg2, int arg3);
}
