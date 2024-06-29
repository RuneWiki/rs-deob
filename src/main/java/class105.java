import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public abstract class class105 extends class670 {

    @OriginalMember(owner = "client!kba", name = "s", descriptor = "Z")
    public boolean field1263 = false;

    @OriginalMember(owner = "client!kba", name = "m", descriptor = "Lrq;")
    public static class350 field1257 = new class350("RC", 1);

    @OriginalMember(owner = "client!kba", name = "u", descriptor = "Lrb;")
    public static class352 field1265 = new class352("", 14);

    @OriginalMember(owner = "client!kba", name = "x", descriptor = "Z")
    public static boolean field1268 = false;

    @OriginalMember(owner = "client!kba", name = "y", descriptor = "Z")
    public static boolean field1269 = false;

    @OriginalMember(owner = "client!kba", name = "n", descriptor = "B")
    public byte field1258;

    @OriginalMember(owner = "client!kba", name = "v", descriptor = "B")
    public byte field1266;

    @OriginalMember(owner = "client!kba", name = "f", descriptor = "I")
    public int field1250;

    @OriginalMember(owner = "client!kba", name = "h", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!kba", name = "i", descriptor = "I")
    public int field1253;

    @OriginalMember(owner = "client!kba", name = "j", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!kba", name = "k", descriptor = "I")
    public int field1255;

    @OriginalMember(owner = "client!kba", name = "l", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!kba", name = "o", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!kba", name = "p", descriptor = "I")
    public int field1260;

    @OriginalMember(owner = "client!kba", name = "q", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!kba", name = "t", descriptor = "I")
    public int field1264;

    @OriginalMember(owner = "client!kba", name = "w", descriptor = "I")
    public int field1267;

    @OriginalMember(owner = "client!kba", name = "g", descriptor = "Lkba;")
    public class105 field1251;

    @OriginalMember(owner = "client!kba", name = "r", descriptor = "Z")
    public boolean field1262;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(I[Lwi;BI)I")
    public final int method742(int arg0, class465[] arg1, byte arg2, int arg3) {
        field1256++;
        long var5 = class488.field6906[this.field1266][arg0][arg3];
        if (arg2 > -18) {
            method743(-89);
        }
        long var7 = 0L;
        int var9 = 0;
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            var7 += 16L;
            arg1[var9++] = class290.field4085[var10 - 1].field3265;
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg1[var11] = null;
        }
        return var9;
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(I)V")
    public static final void method743(int arg0) {
        field1261++;
        class165.field2262.method1364(108);
        class469.field6659 = 1;
        class226.field3049 = null;
        int var1 = 13 / ((66 - arg0) / 37);
        class561.field7881 = null;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "([Lwi;I)I")
    public abstract int method618(class465[] arg0, int arg1);

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(ILha;)Lkj;")
    public abstract class566 method744(int arg0, class58 arg1);

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "(I)V")
    public static void method745(int arg0) {
        if (arg0 != -17340) {
            method748(-69);
        }
        field1257 = null;
        field1265 = null;
    }

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "(I)Z")
    public abstract boolean method621(int arg0);

    @OriginalMember(owner = "client!kba", name = "e", descriptor = "(I)Z")
    public abstract boolean method746(int arg0);

    @OriginalMember(owner = "client!kba", name = "f", descriptor = "(I)I")
    public int method747(int arg0) {
        if (arg0 < 72) {
            return -114;
        } else {
            field1259++;
            return 0;
        }
    }

    @OriginalMember(owner = "client!kba", name = "g", descriptor = "(I)Z")
    public abstract boolean method611(int arg0);

    @OriginalMember(owner = "client!kba", name = "h", descriptor = "(I)V")
    public static final void method748(int arg0) {
        if (arg0 != 1) {
            field1265 = null;
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class237.field3176[var1] = null;
        }
        field1252++;
        class219.field2860 = 0;
    }

    @OriginalMember(owner = "client!kba", name = "i", descriptor = "(I)I")
    public abstract int method749(int arg0);

    @OriginalMember(owner = "client!kba", name = "g", descriptor = "(B)I")
    public abstract int method750(byte arg0);

    @OriginalMember(owner = "client!kba", name = "j", descriptor = "(I)Z")
    public abstract boolean method617(int arg0);

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Z)Z")
    public abstract boolean method751(boolean arg0);

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(ZLha;IILkba;II)V")
    public abstract void method615(boolean arg0, class58 arg1, int arg2, int arg3, class105 arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!kba", name = "k", descriptor = "(I)V")
    public abstract void method614(int arg0);

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lha;III)Z")
    public abstract boolean method752(class58 arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(BLha;)V")
    public abstract void method753(byte arg0, class58 arg1);

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(II)V")
    public static final void method754(int arg0, int arg1) {
        if (arg1 == 19412) {
            field1254++;
            class592 var2 = class682.method3825(arg1 - 652891508, 6, arg0);
            var2.method3350(0);
        }
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(BLha;)Lml;")
    public abstract class387 method755(byte arg0, class58 arg1);
}
