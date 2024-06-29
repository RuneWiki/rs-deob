import java.awt.Rectangle;
import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class79 {

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "I")
    public int field1154;

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "[I")
    public int[] field1156;

    @OriginalMember(owner = "client!dba", name = "f", descriptor = "[I")
    public int[] field1157;

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "[I")
    public static int[] field1155 = new int[1000];

    @OriginalMember(owner = "client!dba", name = "h", descriptor = "Ljk;")
    public static class585 field1159 = new class585(60, 11);

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!dba", name = "g", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!dba", name = "i", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!dba", name = "j", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!dba", name = "k", descriptor = "Lop;")
    public static class172 field1162;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(III)V")
    public static final void method658(int arg0, int arg1, int arg2) {
        field1158++;
        class40.field745++;
        class543 var3 = class299.method1780(class84.field1196, class594.field8587, arg2 - 17015);
        var3.field7872.method2256(arg0, 2);
        var3.field7872.method2239(arg1, (byte) -124);
        if (arg2 == 17137) {
            class511.method3028(7482, var3);
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(Z)V")
    public static final void method659(boolean arg0) {
        class115.field1492.method3674((byte) -109);
        if (!arg0) {
            field1152++;
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method660(byte arg0, String arg1) {
        if (class652.field9237 == null) {
            class658.method3725(-2);
        }
        field1153++;
        class405.field5740.setTime(new Date(class301.method1787((byte) -82)));
        int var2 = 63 / ((arg0 + 11) / 49);
        int var3 = class405.field5740.get(11);
        int var4 = class405.field5740.get(12);
        int var5 = class405.field5740.get(13);
        String var6 = Integer.toString(var3 / 10) + var3 % 10 + ":" + var4 / 10 + var4 % 10 + ":" + var5 / 10 + var5 % 10;
        String[] var7 = class72.method637('\n', false, arg1);
        for (int var8 = 0; var8 < var7.length; var8++) {
            for (int var9 = class567.field8285; var9 > 0; var9--) {
                class652.field9237[var9] = class652.field9237[var9 - 1];
            }
            class652.field9237[0] = var6 + ": " + var7[var8];
            if (class26.field602 != null) {
                try {
                    class26.field602.write(class451.method2673(class652.field9237[0] + "\n", (byte) -60));
                } catch (IOException var10) {
                }
            }
            if (class652.field9237.length - 1 > class567.field8285) {
                class567.field8285++;
                if (class405.field5743 > 0) {
                    class405.field5743++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIIII)V")
    public static final void method661(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 10) {
            field1155 = null;
        }
        for (int var5 = 0; var5 < class643.field9183; var5++) {
            Rectangle var6 = class631.field9063[var5];
            if (var6.x + var6.width > arg4 && (arg4 + arg1) > var6.x && arg0 < (var6.y + var6.height) && var6.y < (arg0 + arg3)) {
                class89.field1253[var5] = true;
            }
        }
        field1160++;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(B)V")
    public static void method662(byte arg0) {
        field1162 = null;
        if (arg0 != 90) {
            method663(13, null);
        }
        field1155 = null;
        field1159 = null;
    }

    @OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(I)V")
    public class79(int arg0) {
        this.field1154 = arg0;
        this.field1156 = new int[this.field1154];
        this.field1157 = new int[this.field1154];
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method663(int arg0, String arg1) {
        field1161++;
        if (arg0 != 10) {
            method662((byte) -24);
        }
        return class276.method1674((byte) -105, arg1, 10, true);
    }
}
