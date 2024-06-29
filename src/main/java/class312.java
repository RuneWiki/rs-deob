import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class312 extends class70 {

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "[Ltk;")
    public class278[] field5089 = new class278[5];

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "[I")
    public int[] field5101 = new int[5];

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "I")
    public int field5097 = 0;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public int field5077;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
    public int field5091;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    public int field5086;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
    public int field5098;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "Z")
    public static boolean field5074 = true;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field5075 = 0;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "Z")
    public static boolean field5088 = false;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "Ljava/lang/String;")
    public static String field5099 = "yellow:";

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "B")
    public byte field5090;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public int field5078;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    public int field5084;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    public int field5085;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
    public int field5095;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
    public int field5100;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "Lva;")
    public class165 field5094;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "Lnk;")
    public class16 field5102;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "Lqe;")
    public class209 field5087;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "Ltd;")
    public class267 field5080;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "Lee;")
    public class312 field5079;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "Lqo;")
    public class332 field5082;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "Lgn;")
    public class8 field5096;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "Lwa;")
    public class94 field5092;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "Z")
    public boolean field5081;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "Z")
    public boolean field5083;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "Z")
    public boolean field5093;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V", line = 11)
    public static void method2266(int arg0) {
        if (arg0 != 0) {
            field5088 = false;
        }
        field5099 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)V", line = 30)
    public static final void method2267(int arg0, int arg1, int arg2, int arg3) {
        class312 var4 = class353.field5644[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class332 var5 = var4.field5082;
        if (var5 != null) {
            var5.field5312 = var5.field5312 * arg3 / 16;
            var5.field5306 = var5.field5306 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(III)V", line = 46)
    public class312(int arg0, int arg1, int arg2) {
        this.field5077 = arg2;
        this.field5086 = this.field5091 = arg0;
        this.field5098 = arg1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/lang/String;ZB)V", line = 102)
    public static final void method2268(String arg0, boolean arg1, byte arg2) {
        field5076++;
        byte var3 = 4;
        int var4 = var3 + 6;
        if (arg2 != 91) {
            method2266(116);
        }
        int var5 = var3 + 6;
        int var6 = class14.field416.method647(arg0, 250);
        int var7 = class14.field416.method642(arg0, 250) * 13;
        if (class241.field4016) {
            class337.method2378(var4 - var3, -var3 + var5, var6 - (-var3 - var3), var3 + var7 + var3, 0);
            class337.method2387(var4 - var3, -var3 + var5, var6 + var3 + var3, var7 - -var3 + var3, 16777215);
        } else {
            class270.method1894(var4 - var3, var5 - var3, var6 + var3 + var3, var3 + var7 + var3, 0);
            class270.method1904(var4 - var3, -var3 + var5, var3 + var3 + var6, var3 + var7 + var3, 16777215);
        }
        class14.field416.method634(arg0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class127.method906(var3 + var3 + var7, -var3 + var5, var4 - var3, var3 + var6 - -var3, 0);
        if (!arg1) {
            class192.method1331(var4, arg2 - 18450, var7, var5, var6);
        } else if (class241.field4016) {
            class241.method1693();
        } else {
            try {
                Graphics var8 = class209.field3489.getGraphics();
                class285.field4666.method611(0, (byte) -47, 0, var8);
            } catch (Exception var10) {
                class209.field3489.repaint();
            }
        }
    }
}
