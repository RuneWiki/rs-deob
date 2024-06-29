import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class760 extends class152 {

    @OriginalMember(owner = "client!bo", name = "E", descriptor = "Z")
    public static boolean field10511 = false;

    @OriginalMember(owner = "client!bo", name = "K", descriptor = "Lmi;")
    public static class522 field10517 = new class522();

    @OriginalMember(owner = "client!bo", name = "w", descriptor = "I")
    public static int field10503;

    @OriginalMember(owner = "client!bo", name = "y", descriptor = "I")
    public int field10505;

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "I")
    public int field10506;

    @OriginalMember(owner = "client!bo", name = "A", descriptor = "I")
    public int field10507;

    @OriginalMember(owner = "client!bo", name = "C", descriptor = "I")
    public int field10509;

    @OriginalMember(owner = "client!bo", name = "F", descriptor = "I")
    public int field10512;

    @OriginalMember(owner = "client!bo", name = "H", descriptor = "I")
    public int field10514;

    @OriginalMember(owner = "client!bo", name = "I", descriptor = "Loh;")
    public class425 field10515;

    @OriginalMember(owner = "client!bo", name = "G", descriptor = "Ljava/lang/String;")
    public String field10513;

    @OriginalMember(owner = "client!bo", name = "x", descriptor = "[I")
    public int[] field10504;

    @OriginalMember(owner = "client!bo", name = "J", descriptor = "[I")
    public int[] field10516;

    @OriginalMember(owner = "client!bo", name = "B", descriptor = "[J")
    public long[] field10508;

    @OriginalMember(owner = "client!bo", name = "D", descriptor = "[Ldj;")
    public class362[] field10510;

    @OriginalMember(owner = "client!bo", name = "v", descriptor = "[Ljava/lang/String;")
    public String[] field10502;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Les;I)Lii;")
    public static final class580 method4226(class403 arg0, int arg1) {
        field10503++;
        String var2 = arg0.method2384(-6435);
        class105 var3 = class625.method3549((byte) 98)[arg0.method2396((byte) 42)];
        class4 var4 = class716.method4046((byte) 16)[arg0.method2396((byte) -128)];
        int var5 = arg0.method2365(true);
        int var6 = arg0.method2365(true);
        int var7 = arg0.method2396((byte) 66);
        int var8 = arg0.method2396((byte) -118);
        int var9 = arg0.method2396((byte) 97);
        int var10 = arg0.method2390((byte) -124);
        int var11 = arg0.method2390((byte) 78);
        int var12 = arg0.method2381((byte) 112);
        if (arg1 == -20148) {
            int var13 = arg0.method2381((byte) 80);
            int var14 = arg0.method2381((byte) 105);
            return new class580(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)V")
    public static void method4227(byte arg0) {
        field10517 = null;
        int var1 = -118 % ((38 - arg0) / 40);
    }
}
