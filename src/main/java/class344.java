import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public abstract class class344 extends class87 {

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public int field4628;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public int field4629;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public int field4632;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public int field4630;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field4633;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IZII)V")
    public static final void method2081(int arg0, boolean arg1, int arg2, int arg3) {
        field4631++;
        int var4 = class519.field7304 + arg2;
        int var5 = class6.field80 + arg3;
        if (class356.field4807 == null || arg2 < 0 || arg3 < 0 || arg2 >= class32.field513 || class611.field8786 <= arg3) {
            return;
        }
        long var6 = (long) (arg0 << 28 | var5 << 14 | var4);
        class93 var8 = (class93) class220.field3147.method1242(0, var6);
        if (var8 == null) {
            class476.method2776(arg0, arg2, arg3);
            return;
        }
        class335 var9 = (class335) var8.field1434.method456((byte) -47);
        if (var9 == null) {
            class476.method2776(arg0, arg2, arg3);
            return;
        }
        class119 var10 = (class119) class476.method2776(arg0, arg2, arg3);
        if (var10 == null) {
            var10 = new class119();
        } else {
            var10.field1958 = var10.field1951 = -1;
        }
        var10.field1960 = var9.field4461;
        var10.field1949 = var9.field4465;
        label51: while (true) {
            class335 var11 = (class335) var8.field1434.method460((byte) 116);
            if (var11 == null) {
                break;
            }
            if (var10.field1960 != var11.field4461) {
                var10.field1958 = var11.field4461;
                var10.field1950 = var11.field4465;
                while (true) {
                    class335 var12 = (class335) var8.field1434.method460((byte) -111);
                    if (var12 == null) {
                        break label51;
                    }
                    if (var10.field1960 != var12.field4461 && var10.field1958 != var12.field4461) {
                        var10.field1951 = var12.field4461;
                        var10.field1947 = var12.field4465;
                    }
                }
            }
        }
        if (arg1) {
            field4633 = null;
        }
        int var13 = class183.method1144(80, (arg2 << 7) + 64, (arg3 << 7) + 64, arg0);
        class189.method1179(arg0, arg2, arg3, var13, var10);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(JJ)J")
    public static long method2082(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!we", name = "g", descriptor = "(I)V")
    public static void method2083(int arg0) {
        field4633 = null;
        if (arg0 != -30910) {
            method2081(51, false, 126, 51);
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IIII)V")
    public class344(int arg0, int arg1, int arg2, int arg3) {
        this.field4628 = arg1;
        this.field4629 = arg0;
        this.field4632 = arg3;
        this.field4630 = arg2;
    }

    static {
        new class104("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
    }
}
