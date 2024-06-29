import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class194 {

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "[Lgg;")
    public class116[] field2760 = new class116[100];

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "[I")
    public int[] field2764 = new int[100];

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "[Ljd;")
    public class153[] field2763 = new class153[8];

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "[I")
    public int[] field2771 = new int[3];

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "Z")
    public static boolean field2769 = false;

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "Lsi;")
    public static class391 field2768 = new class391(1);

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2773 = null;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
    public int field2765;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "Ljava/lang/Object;")
    public Object field2767;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field2762;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V", line = 11)
    public static final void method1207(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field2761++;
        for (class12 var1 = (class12) class438.field6435.method2818((byte) -75); var1 != null; var1 = (class12) class438.field6435.method2820((byte) -58)) {
            if (var1.field188 == -1) {
                var1.field185 = 0;
                if (var1.field190 >= 0 && var1.field191 >= 0 && class527.field7799 > var1.field190 && var1.field191 < class422.field6182) {
                    class65.method562(var1, 0);
                }
            } else {
                var1.method1565(0);
            }
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)V", line = 46)
    public static void method1208(boolean arg0) {
        if (arg0) {
            field2762 = null;
            field2768 = null;
            field2773 = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)Ljava/lang/String;", line = 63)
    public static final String method1209(byte arg0) {
        field2772++;
        String var1 = "www";
        if (class404.field5937 == class383.field5593) {
            var1 = "www-wtrc";
        } else if (class498.field7253 == class404.field5937) {
            var1 = "www-wtqa";
        } else if (class76.field1014 == class404.field5937) {
            var1 = "www-wtwip";
        }
        int var2 = 111 / ((arg0 - 18) / 37);
        String var3 = "";
        if (field2773 != null) {
            var3 = "/p=" + field2773;
        }
        return "http://" + var1 + "." + class323.field4400.field904 + ".com/l=" + class372.field5455 + "/a=" + class461.field6784 + var3 + "/";
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lem;I)Lem;", line = 93)
    public static final class150 method1210(class150 arg0, int arg1) {
        if (arg1 != 14869) {
            method1209((byte) 85);
        }
        field2766++;
        class150 var2 = client.method1232(arg0);
        if (var2 == null) {
            var2 = arg0.field2305;
        }
        return var2;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIBI)V", line = 113)
    public static final void method1211(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field2770++;
        int var5 = 0;
        int var6 = arg4;
        int var7 = -arg4;
        class210.method1300(arg1 - arg4, class437.field6400[arg2], (byte) 103, arg1 + arg4, arg0);
        int var8 = -1;
        if (arg3 != -38) {
            field2762 = null;
        }
        while (var6 > var5) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class437.field6400[arg2 + var6];
                int[] var10 = class437.field6400[arg2 - var6];
                int var11 = arg1 + var5;
                int var12 = arg1 - var5;
                class210.method1300(var12, var9, (byte) 112, var11, arg0);
                class210.method1300(var12, var10, (byte) 112, var11, arg0);
            }
            int var13 = arg1 + var6;
            int var14 = arg1 - var6;
            int[] var15 = class437.field6400[arg2 + var5];
            int[] var16 = class437.field6400[arg2 - var5];
            class210.method1300(var14, var15, (byte) 118, var13, arg0);
            class210.method1300(var14, var16, (byte) 109, var13, arg0);
        }
    }
}
