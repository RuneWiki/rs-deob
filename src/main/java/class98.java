import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class98 extends class375 {

    @OriginalMember(owner = "client!bba", name = "w", descriptor = "I")
    private int field1538;

    @OriginalMember(owner = "client!bba", name = "A", descriptor = "Lkda;")
    public static class353 field1542 = new class353();

    @OriginalMember(owner = "client!bba", name = "F", descriptor = "I")
    public static int field1546 = 0;

    @OriginalMember(owner = "client!bba", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field1547 = new String[100];

    @OriginalMember(owner = "client!bba", name = "H", descriptor = "Ldg;")
    public static class376 field1548 = new class376(81, 2);

    @OriginalMember(owner = "client!bba", name = "I", descriptor = "I")
    public static int field1549 = 2;

    @OriginalMember(owner = "client!bba", name = "t", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!bba", name = "u", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!bba", name = "v", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!bba", name = "x", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!bba", name = "y", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!bba", name = "D", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!bba", name = "E", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!bba", name = "z", descriptor = "[Ldf;")
    public class365[] field1541;

    @OriginalMember(owner = "client!bba", name = "B", descriptor = "[[B")
    private byte[][] field1543;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(III)Lfea;", line = 4)
    public static final class126 method797(int arg0, int arg1, int arg2) {
        class40 var3 = class153.field2210[arg0][arg1][arg2];
        return var3 == null ? null : var3.field665;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IB)Z", line = 11)
    public final boolean method798(int arg0, byte arg1) {
        field1539++;
        if (arg1 != 3) {
            method797(-92, 79, 62);
        }
        return this.field1541[arg0].field5230;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZII)Z", line = 22)
    public static final boolean method799(boolean arg0, int arg1, int arg2) {
        field1537++;
        if (!arg0) {
            method802(89, null, null, 44, null);
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(II)Z", line = 34)
    public final boolean method800(int arg0, int arg1) {
        field1536++;
        return arg0 == 25595 ? this.field1541[arg1].field5217 : true;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "([BZB)V", line = 47)
    public static final void method801(byte[] arg0, boolean arg1, byte arg2) {
        if (class641.field9047 == null) {
            class641.field9047 = new class695(20000);
        }
        int var3 = -1 / ((37 - arg2) / 32);
        field1540++;
        class641.field9047.method3857(7010, arg0.length, arg0, 0);
        if (!arg1) {
            return;
        }
        class2.method10((byte) 126, class641.field9047.field9796);
        class439.field6407 = new class178[class475.field6775];
        int var4 = 0;
        for (int var5 = class32.field497; var5 <= class390.field5790; var5++) {
            class178 var6 = class508.method2918(100, var5);
            if (var6 != null) {
                class439.field6407[var4++] = var6;
            }
        }
        class236.field3663 = false;
        class182.field2582 = class490.method2840(true);
        class641.field9047 = null;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILfa;Ljava/awt/Canvas;ILpu;)Lr;", line = 88)
    public static final class166 method802(int arg0, class209 arg1, Canvas arg2, int arg3, class522 arg4) {
        field1535++;
        if (!class247.method1662(47)) {
            throw new RuntimeException("");
        } else if (class271.method1788("jaggl", -125)) {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg2, 8, arg0, 8, 24, 0, arg3);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            class296 var8 = new class296(var5, arg2, var6, arg1, arg4, arg3);
            var8.method2323((byte) -108);
            return var8;
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!bba", name = "d", descriptor = "(B)Z", line = 112)
    public final boolean method803(byte arg0) {
        field1544++;
        if (arg0 < 86) {
            field1546 = 22;
        }
        if (this.field1541 != null) {
            return true;
        }
        if (this.field1543 == null) {
            class522 var2 = class564.field7966;
            synchronized (class564.field7966) {
                if (!class564.field7966.method2982((byte) 95, this.field1538)) {
                    return false;
                }
                int[] var4 = class564.field7966.method3002(this.field1538, 111);
                this.field1543 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field1543[var5] = class564.field7966.method3007(this.field1538, var4[var5], 5);
                }
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < this.field1543.length; var7++) {
            byte[] var8 = this.field1543[var7];
            class695 var9 = new class695(var8);
            var9.field9761 = 1;
            int var10 = var9.method3847((byte) 118);
            class522 var11 = class513.field7219;
            synchronized (class513.field7219) {
                var6 &= class513.field7219.method2997((byte) -95, var10);
            }
        }
        if (!var6) {
            return false;
        }
        class46 var12 = new class46();
        class522 var13 = class564.field7966;
        int[] var15;
        synchronized (class564.field7966) {
            int var14 = class564.field7966.method2988(105, this.field1538);
            this.field1541 = new class365[var14];
            var15 = class564.field7966.method3002(this.field1538, 119);
        }
        for (int var16 = 0; var16 < var15.length; var16++) {
            byte[] var17 = this.field1543[var16];
            class695 var18 = new class695(var17);
            var18.field9761 = 1;
            int var19 = var18.method3847((byte) 118);
            class43 var20 = null;
            for (class43 var21 = (class43) var12.method472((byte) -99); var21 != null; var21 = (class43) var12.method482(126)) {
                if (var21.field690 == var19) {
                    var20 = var21;
                    break;
                }
            }
            if (var20 == null) {
                class522 var22 = class513.field7219;
                synchronized (class513.field7219) {
                    var20 = new class43(var19, class513.field7219.method2994(var19, (byte) 93));
                }
                var12.method474(var20, 6);
            }
            this.field1541[var15[var16]] = new class365(var17, var20);
        }
        this.field1543 = null;
        return true;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)V", line = 225)
    public static void method804(int arg0) {
        field1547 = null;
        field1542 = null;
        field1548 = null;
        int var1 = -62 % ((arg0 + 84) / 35);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZI)Z", line = 238)
    public final boolean method805(boolean arg0, int arg1) {
        field1545++;
        if (!arg0) {
            field1549 = -60;
        }
        return this.field1541[arg1].field5222;
    }

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(I)V", line = 253)
    public class98(int arg0) {
        this.field1538 = arg0;
    }
}
