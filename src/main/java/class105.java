import java.awt.Color;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class105 {

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1346 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "Lub;")
    public static class15 field1347 = new class15(4);

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "I")
    public static int field1348 = 0;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "Ltj;")
    public static class108 field1350;

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "Lec;")
    public static class129 field1351;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "Lup;")
    public static class150 field1349;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)I", line = 7)
    public static final int method615(int arg0, int arg1) {
        if (arg1 <= 114) {
            method616(-52, -43);
        }
        field1342++;
        return arg0 == 16711935 ? -1 : class142.method1067((byte) 82, arg0);
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(II)Lbf;", line = 21)
    public static final class316 method616(int arg0, int arg1) {
        field1345++;
        class145[] var2 = class53.field689;
        synchronized (class53.field689) {
            if (arg0 != -15465) {
                field1350 = null;
            }
            class316 var3;
            if (class53.field689.length <= arg1 || class53.field689[arg1].method1071(arg0 + 15360)) {
                var3 = new class316();
                var3.field4631 = new class144[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    var3.field4631[var4] = new class144();
                }
            } else {
                var3 = (class316) class53.field689[arg1].method1079(false);
                var3.method674(-1);
                int var10002 = class178.field2527[arg1]--;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lml;IILjava/lang/String;)Lsm;", line = 57)
    public static final class156 method617(class219 arg0, int arg1, int arg2, String arg3) {
        field1344++;
        if (arg1 == 0) {
            return arg0.method1524(0, arg3);
        } else if (arg1 == 1) {
            try {
                class348.method2283(arg0.field3154, "openjs", -13558, new Object[] { (new URL(arg0.field3154.getCodeBase(), arg3)).toString() });
                class156 var4 = new class156();
                var4.field2298 = 1;
                return var4;
            } catch (Throwable var10) {
                class156 var5 = new class156();
                var5.field2298 = 2;
                return var5;
            }
        } else {
            if (arg2 != -24962) {
                method618((byte) -1);
            }
            if (arg1 == 2) {
                try {
                    arg0.field3154.getAppletContext().showDocument(new URL(arg0.field3154.getCodeBase(), arg3), "_blank");
                    class156 var6 = new class156();
                    var6.field2298 = 1;
                    return var6;
                } catch (Exception var11) {
                    class156 var7 = new class156();
                    var7.field2298 = 2;
                    return var7;
                }
            } else if (arg1 == 3) {
                try {
                    class348.method2282((byte) -83, "loggedout", arg0.field3154);
                } catch (Throwable var13) {
                }
                try {
                    arg0.field3154.getAppletContext().showDocument(new URL(arg0.field3154.getCodeBase(), arg3), "_top");
                    class156 var8 = new class156();
                    var8.field2298 = 1;
                    return var8;
                } catch (Exception var12) {
                    class156 var9 = new class156();
                    var9.field2298 = 2;
                    return var9;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V", line = 133)
    public static void method618(byte arg0) {
        field1350 = null;
        field1351 = null;
        if (arg0 < 112) {
            method618((byte) -85);
        }
        field1347 = null;
        field1349 = null;
        field1346 = null;
    }
}
